number = int(input("Enter number => "))

factorial = 1
for count in range(1, number + 1):
    factorial *= count

print(factorial)
