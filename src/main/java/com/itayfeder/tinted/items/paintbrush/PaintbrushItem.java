package com.itayfeder.tinted.items.paintbrush;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.Sheep;
import net.minecraft.world.entity.monster.Shulker;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.DyeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DoubleBlockCombiner;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;

import java.util.function.Consumer;

public class PaintbrushItem extends Item {
    private static final String TAG_COLOR = "Color";
    private static final String TAG_COLORED = "Colored";
    private static final String TAG_USES = "Uses";
    public static final int MAX_USES = 4;

    public PaintbrushItem(Properties p_41383_) {
        super(p_41383_);
    }

    public boolean isBarVisible(ItemStack p_150769_) {
        return getUses(p_150769_) > 0;
    }

    public int getBarWidth(ItemStack p_150771_) {
        return Math.min(1 + 3 * getUses(p_150771_), 13);
    }

    public int getBarColor(ItemStack p_150773_) {
        return DyeColor.byId(getColor(p_150773_)).getFireworkColor();
    }

    @Override
    public InteractionResult useOn(UseOnContext p_41427_) {
        Level level = p_41427_.getLevel();
        BlockPos blockpos = p_41427_.getClickedPos();
        BlockState blockstate = level.getBlockState(blockpos);
        Block block = blockstate.getBlock();
        Player player = p_41427_.getPlayer();
        if (p_41427_.getHand() == InteractionHand.OFF_HAND) {
            ItemStack stack = player.getOffhandItem();
            if (isColored(stack) && getUses(stack) > 0) {
                PaintbrushDye dyePattern = PaintbrushReloadListener.INSTANCE.getCurrentDye(blockstate);
                if (dyePattern != null) {
                    DyeColor color = DyeColor.byId(getColor(stack));
                    BlockState newState = dyePattern.getColorToBlock().getOrDefault(color, dyePattern.getColorToBlock().get(DyeColor.WHITE)).defaultBlockState();
                    if (dyePattern != null && !newState.getBlock().equals(blockstate.getBlock())) {
                        if (blockstate.getBlock() instanceof BedBlock) {
                            /*BlockPos opposite = blockpos.offset(BedBlock.getConnectedDirection(blockstate).getOpposite().getNormal());
                            BlockState oppositeState = level.getBlockState(opposite);
                            BlockState bedState = replaceStates(newState, blockstate);
                            BlockState bedOpposite = replaceStates(newState, oppositeState);
                            if (BedBlock.getBlockType(blockstate).equals(DoubleBlockCombiner.BlockType.SECOND)) {
                                level.setBlockAndUpdate(opposite, Blocks.AIR.defaultBlockState());
                                level.setBlockAndUpdate(blockpos, Blocks.AIR.defaultBlockState());
                                level.setBlockAndUpdate(opposite, bedOpposite);
                                level.setBlockAndUpdate(blockpos, bedState);
                            } else {
                                level.setBlockAndUpdate(blockpos, Blocks.AIR.defaultBlockState());
                                level.setBlockAndUpdate(opposite, Blocks.AIR.defaultBlockState());
                                level.setBlockAndUpdate(blockpos, bedState);
                                level.setBlockAndUpdate(opposite, bedOpposite);
                            }*/
                        } else {
                            newState = replaceStates(newState, blockstate);
                            CompoundTag nbt = level.getBlockEntity(blockpos) != null ? level.getBlockEntity(blockpos).serializeNBT() : null;
                            level.setBlockAndUpdate(blockpos, newState);
                            if (nbt != null) {
                                level.getBlockEntity(blockpos).deserializeNBT(nbt);
                            }
                        }

                        setUses(stack, getUses(stack)-1);
                        return InteractionResult.sidedSuccess(level.isClientSide);
                    }
                } else {
                    if (blockstate.getBlock() == Blocks.WATER_CAULDRON) {
                        setUses(stack, 0);
                        return InteractionResult.sidedSuccess(level.isClientSide);

                    }
                }

            }

        }

        return super.useOn(p_41427_);
    }

    @Override
    public InteractionResult interactLivingEntity(ItemStack p_41085_, Player p_41086_, LivingEntity p_41087_, InteractionHand p_41088_) {
        if (p_41088_ == InteractionHand.OFF_HAND) {
            if (isColored(p_41085_) && getUses(p_41085_) > 0) {
                DyeColor color = DyeColor.byId(getColor(p_41085_));
                if (p_41087_ instanceof Sheep sheep) {
                    if (sheep.isAlive() && !sheep.isSheared() && sheep.getColor() != color) {
                        sheep.level.playSound(p_41086_, sheep, SoundEvents.DYE_USE, SoundSource.PLAYERS, 1.0F, 1.0F);
                        if (!p_41086_.level.isClientSide) {
                            sheep.setColor(color);
                            setUses(p_41085_, getUses(p_41085_)-1);
                        }

                        return InteractionResult.sidedSuccess(p_41086_.level.isClientSide);
                    }
                }

                if (p_41087_ instanceof Shulker shulker) {
                    if (shulker.isAlive() && shulker.getColor() != color) {
                        shulker.level.playSound(p_41086_, shulker, SoundEvents.DYE_USE, SoundSource.PLAYERS, 1.0F, 1.0F);
                        if (!p_41086_.level.isClientSide) {
                            shulker.setColor(color);
                            setUses(p_41085_, getUses(p_41085_)-1);
                        }

                        return InteractionResult.sidedSuccess(p_41086_.level.isClientSide);
                    }
                }
            }
        }

        return InteractionResult.PASS;
    }

    @Override
    public void inventoryTick(ItemStack stack, Level level, Entity entity, int p_41407_, boolean p_41408_) {
        super.inventoryTick(stack, level, entity, p_41407_, p_41408_);
        if (entity instanceof LivingEntity living) {
            if (living.getOffhandItem().equals(stack, false) && living.getMainHandItem().getItem() instanceof DyeItem dye) {
                DyeColor color = dye.getDyeColor();
                if (!isColored(stack)) {
                    setColor(stack, color.getId());
                    if (!(living instanceof Player player && player.getAbilities().instabuild)) {
                        living.getMainHandItem().shrink(1);
                    }
                }

            }
        }
    }

    private static BlockState replaceStates(BlockState newBlock, BlockState originalBlock) {
        BlockState block = newBlock;
        for(Property property : originalBlock.getProperties()) {
            if (newBlock.hasProperty(property) && originalBlock.getValue(property) != null) {
                block = block.setValue(property, originalBlock.getValue(property));
            }
        }
        return block;
    }

    public static boolean isColored(ItemStack p_40933_) {
        CompoundTag compoundtag = p_40933_.getTag();
        return compoundtag != null && compoundtag.getBoolean(TAG_COLORED);
    }

    public static int getColor(ItemStack p_40933_) {
        CompoundTag compoundtag = p_40933_.getTag();
        if (compoundtag != null && compoundtag.getBoolean(TAG_COLORED)) {
            return compoundtag.getInt(TAG_COLOR);
        }
        return -1;
    }

    public static void setColor(ItemStack p_40885_, int p_40886_) {
        CompoundTag compoundtag = p_40885_.getOrCreateTag();
        compoundtag.putInt(TAG_COLOR, p_40886_);
        if (p_40886_ == -1) {
            compoundtag.putBoolean(TAG_COLORED, false);
            compoundtag.putInt(TAG_USES, 0);
        }
        else {
            compoundtag.putBoolean(TAG_COLORED, true);
            compoundtag.putInt(TAG_USES, MAX_USES);
        }
    }

    public static int getUses(ItemStack p_40933_) {
        CompoundTag compoundtag = p_40933_.getTag();
        if (compoundtag != null && compoundtag.getBoolean(TAG_USES)) {
            return compoundtag.getInt(TAG_USES);
        }
        return -1;
    }

    public static void setUses(ItemStack p_40885_, int p_40886_) {
        CompoundTag compoundtag = p_40885_.getTag();
        compoundtag.putInt(TAG_USES, p_40886_);
        if (p_40886_ <= 0) {
            compoundtag.putBoolean(TAG_COLORED, false);
            compoundtag.putInt(TAG_COLOR, -1);
        }
    }
}
