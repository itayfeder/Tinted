# import required module
import os
# assign directory
directory = './'

sourceReplace = input("enter the word you want replaced:")
destReplace = input("enter the word you want to replace it with:")

# iterate over files in
# that directorys
def find(location):
    for path, subdirs, files in os.walk(location):
        for dir in subdirs:
            find(location + dir + "/")
        for filename in files:
            if sourceReplace in filename:
                f = os.path.join(location, filename)
                dst = f.replace(sourceReplace, destReplace)
                os.rename(f, dst)
                if os.path.isfile(f):
                    print(f)

find(directory)