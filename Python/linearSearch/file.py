mylist = [3,7,2,9,5,1,8,4,6]

print(mylist)

# Check if a value exists in a list 

if 4 in mylist:
    print("Found!")
else: 
    print("Not found!")

# To get the index of that element, we use linear search

def linearSearch(arr, n):
    for i in range(len(arr)):
        if arr[i] == n:
            return i
        else:
            return "null"

idx = linearSearch(mylist, 10)
print(f"The index for 4 is at: {idx}")

# The worst case time complexity of linear search is O(n)
