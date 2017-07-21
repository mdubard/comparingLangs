import sys

def sortIntsInFile (filename): 
    try: 
        #stores numbers from file in content
        content = [int(line.strip()) for line in open(filename, 'r')]
        content.sort()
        for num in content:
            print num
    except IOError:
        print("There is no file named " + filename);

if __name__ == '__main__':
    if len(sys.argv) != 2:
        print("Usage: python sortInts <intFileName>")
    else: 
        sortIntsInFile(sys.argv[1])