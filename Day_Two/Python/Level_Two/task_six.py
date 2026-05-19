year = int(input("enter a year => "))

if (year % 4 == 0 and year % 100) or year % 400 == 0 :
    print(f"{year} is Leap Year")
else:
    print(f"{year} is Normal year")

