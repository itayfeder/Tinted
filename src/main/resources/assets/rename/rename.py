# import required module
import os
# assign directory
directory = './'

sourceReplace = input("enter the word you want replaced:")
destReplace = input("enter the word you want to replace it with:")

# iterate over files in
# that directories
def find(location):
    for path, subdirs, files in os.walk(location):
        for dir in subdirs:
            find(location + dir + "/")
        for filename in files:
            f = os.path.join(path, filename)
            if "txt" in filename or "json" in filename or "java" in filename:
                with open(f, 'r') as file:
                    filedata = file.read()
                filedata = filedata.replace(sourceReplace, destReplace)
                with open(f, 'w') as file:
                    file.write(filedata)

            if sourceReplace in filename:
                dst = f.replace(sourceReplace, destReplace)
                os.rename(f, dst)
                if os.path.isfile(f):
                    print(f)

find(directory)
