number = int(input("Enter a number: "))
factorial = 1
result = 0
for num in number:
    number -= 1
    result = factorial * number
print (result)
