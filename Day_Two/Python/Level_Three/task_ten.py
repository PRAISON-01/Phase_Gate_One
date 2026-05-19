number = int(input("Enter a number => "))

count = 0

while number > 0:
    last = number % 10
    count += 1
    number = number // 10

print(count)
