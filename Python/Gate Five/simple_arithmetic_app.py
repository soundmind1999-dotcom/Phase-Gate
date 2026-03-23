#set count = 1
#set number of correct answers = 0
#while count <= 10
#generate first number randomly between 1 and 100
#generate second number randomly between 1 and 100

#while second number is less than firstNumber 
#generate second number again between 1 and 100
    

#set correct answer equals first number minus second number

#display first number minus second number

#prompt user to enter answer

#while answer is not equal to correct answer
#display the question again
#prompt user to answer again
#increment count by 1
#increment the number of attempts by 1
#display you scored number of correct answers out of 10




import random

count = 1
numberOfCorrectAnswers = 0
while(count <= 10):
    print(f"Question", count)
    first_number = random.randrange(101)
    second_number = random.randrange(101)

    while(second_number > first_number):
        second_number = random.randrange(101)

    answer = int(input(f"{first_number} - {second_number} = "))

    if ((first_number - second_number) != answer):

        answer = int(input(f"{first_number} - {second_number} = "))

    if ((first_number - second_number) == answer):
        numberOfCorrectAnswers += 1

    count += 1

print(f"You scored {numberOfCorrectAnswers} out of 10")










    
