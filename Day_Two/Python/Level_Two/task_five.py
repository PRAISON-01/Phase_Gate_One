largest = 0
count =0
while count < 3:
    number = int(input("enter a number => "))

    if number > largest:
        largest = number
    count += 1

print(f"Largest => {largest}")
