def add(first, second):
    return first + second

def is_even(number):
    if number % 2 == 0:
        return True
    else:
        return False

def square(number):
    return number * number

def convertTemp(temp):
    return (temp * 9/5) + 32

def iPrime(number):
    if number <= 1:
        return False
    if number <= 3:
        return True
    if number % 2 == 0 or number % 3 == 0:
        return False
    if number <= 1:
        return False
    if number <= 3:
        return True
    if number % 2 == 0 or number % 3 == 0:
        return False

    i = 5
    while i * i <= number:
        if number % i == 0 or number % (i + 2):
            return False
        i += 6
    return True


    i = 5
    while i * i <= number:
        if number % i == 0 or number % (i + 2):
            return False
        i += 6
    return True
 
def is_largest(first, second, third):
    largest = first

    if second > largest:
        largest = second
    
    elif third > largest:
        largest = third

    return largest

def simple_interest(principal, ratep, time):
    rate = ratep / 100
    return (principal * rate * time)


def area(length, width):
    return length * width

def reverse(number):
    reverse = 0
    while number > 0:
        last = number % 10
        reverse = (reverse * 10) + last
        number //= 10

    return reverse

def count_word(word):
    for count in range(1, len(word)):

        count+= 1

    return count



first = 3
second = 20000
third = 155
number = 54321
principal = 5912000
ratep = 12
time = 5
length = 5
width = 10
word = "Praise"
celcius = 100



add(first, second)
is_even(number)
convertTemp(celcius)
iPrime(number)
print(is_largest(first, second, third))
simple_interest(principal, ratep, time)
area(length, width)
reverse(number)
count_word(word)

