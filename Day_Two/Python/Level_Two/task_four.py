first = int(input("enter a first => "))
second = int(input("enter a second => "))

largest = first
if second > largest:
    largest = second

print(f"Largest => {largest}")
