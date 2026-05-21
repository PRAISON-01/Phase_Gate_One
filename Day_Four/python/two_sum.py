
def get_two_Sum(array, total):
    array = list(array)
    items = []
    for count in range(1, len(array), 1):
        for number in array:
            if number + array[count] == total:

                items.append(number)
                

    for count in range(1, len(array), 1):
        for number in array:
            if number + array[count] == total:
                items.append(array[count])


    return items

def duplicate_elimination(array):
    array = list(array)
    items = []
    for number in array:
        if number not in items:
            items.append(number)

    return items 

def getConsonantWord(words):

    words = list(words)
    consonant = []
    vowel = []
    
    for element in words:

        for letter in element:

            if letter == 'a' or letter == 'e' or letter == 'o' or letter == 'u':

                vowel.append(element)

            elif letter == 'b' or letter == 'c' or letter == 'd' or letter == 'f' or letter == 'g' or letter == 'h' or letter == 'j' or letter == 'k' or letter == 'l' or letter == 'm' or letter == 'n' or letter == 'p' or letter == 'q' or letter == 'r' or letter == 's' or letter == 't' or letter == 'v' or letter == 'w' or letter == 'x' or letter == 'y' or letter == 'z':
                consonant.append(element)
                

    return consonant


words = ["pie", "fly", "rat"]

print(getConsonantWord(words))
