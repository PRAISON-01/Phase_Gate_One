
import random 

random_number = random.randint(1, 100)
attempt = 1;

while attempt <= 5:
    try:
        guess = int(input("Guess the number between 1 and 100 => "))
        if guess ==random_number:
            print("congratulations you got the number")
            break
        elif guess  > random_number:
            print("Too high")
        elif guess < random_number:
            print("Too low")
        attempt += 1
        if guess > 100 or guess < 1:
            print("Out of bound")
    except ValueError:
        print("Please enter a valid number")


print("=====RESULTS=====")
print()
print()
print(f"Correct Number => {random_number}")
print()
print(f"Number of Attempts => {attempt}")
if attempt == 1:
    print("Legendary")

elif  attempt == 2:
    print("Excellent")

elif  attempt == 3 or attempt == 4:
    print("Good")

elif  attempt == 5:
    print("Close")

else:
    print("Better luck")


