# import required module
import os
# assign directory
directory = './'

sourceReplace = input("enter the word you want replaced:")
destReplace = input("enter the word you want to replace it with:")

# iterate over files in
# that directory
for filename in os.listdir(directory):
    f = os.path.join(directory, filename)
    dst = filename.replace(sourceReplace, destReplace)
    os.rename(filename, dst)
    if os.path.isfile(f):
        print(f)
