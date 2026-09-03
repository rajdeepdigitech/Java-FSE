"""
Calculator -> 

Two number (Operands)

while loop

Operators (+, -, *, /, %)

Output
"""

numOne = int(input("Enter the first number: "))

numTwo = int(input("Enter the second number: "))

isTrue = True 

while (isTrue):
    userInput = int(input("Which operator you want to use: (1) + \
        (2) - \
        (3) * \
        (4) / \
        (5) %\n"))

    if userInput == 1:
        result = numOne + numTwo 
        print(f"Result: {result}")
    elif userInput == 2:
        result = numOne - numTwo
        print(f"Result: {result}")
    elif userInput == 3:
        result = numOne * numTwo 
        print(f"Result: {result}")
    elif userInput == 4:
        result = numOne / numTwo 
        print(f"Result: {result}")
    elif userInput == 5:
        result = numOne % numTwo 
        print(f"Result: {result}")
    else:
        print("Not a valid input!")
        isTrue = False 

