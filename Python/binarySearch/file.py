# Faster than linear search but requires an sorted array 

# Checks the center of the array, if target is lower, redefines the boundaries

mylist = [6, 2, 3, 4, 7, 8, 9, 10, 1]

# sorted_arr = mylist.sort() -> common mistake, list.sort() returns none

# print(sorted_arr) Outputs none 

mylist.sort()

print(mylist) 

def binarySearch(arr, n):
    arr.sort()
    left = 0
    right = len(arr) - 1
    while left < right:
        mid = int((left + right) / 2)

        if arr[mid] == n:
            return mid
        elif arr[mid] < n:
            left = mid + 1
        else:
            right = mid - 1
    return "null"
        
n = 15
idx = binarySearch(mylist, n)
print(f"The index of the element {n} is {idx}")

# Time complexity is O(log n) base 2
# Every time the search area is halved
