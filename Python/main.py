# An informal introduction to python 

# this is the first comment 

spam = 1 # and this is the second comment 
         # and now a third! 
text = "# This is not a comment because it is inside quotes."

# Mathematical operations in Python 

a = 2 + 2 
a = 50 - 5*6
a = (50 - 5*6) / 4 
a = 8 / 5 # division always returns floating point number 

a = 17 / 3 # classic division returns a float 
a = 17 // 3 # floors division discards the fraction 

a = 17 % 3 # operator returns the remainder of the equation 
a = 5 ** 2 # power of 5 is two 

# Assigning a value to a variable 

width = 20 
height = 30 
area = width * height 

# print(n) 
# try to access an undefined variable will give an error 

# Full support for floating point numbers 
calc = 4 * 3.75 - 1

## Only in interactive mode 

tax = 12.5 / 100 
price = 100.50 
price*tax
# previous output result is saved in _ variable 
# price + _

# TEXT MANIPULATIONS 

myString = 'Single quotations being used by Python string'
myString = "Double quotations being used by Python string"

# mylist = [1,2,3,4,5,6]
# # print(len(mylist))

# for ab in mylist:
#     print(ab)
length = 5
for x in range(0, length):
    for y in range(x+1, length):
        print(x, y)


