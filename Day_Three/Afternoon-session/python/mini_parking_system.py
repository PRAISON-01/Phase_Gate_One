


def getSlot(slots, spaced):
#    slots = list(slots)

    space = spaced - 1
    len(slots) == 20;
    array = len(slots)
    
    if(slots[space] == 0):
        array[space] = 1

    return array

slots = 20

spaced = 5
print(getSlot(slots, spaced))

 
         
