# Sorts an array from lowest value to highest value 

# Working ->

"""
    1. Go through the array one value at a time 
    2. For each value, compare the value with the next value
    3. If the value is higher than the next one, swap the values so that the highest value comes last
    4. Go through the array as many times as there are values in the array.

"""

def bubbleSort(arr):
    for i in range(0, len(arr) - 1):
        # Improving bubble sort
        swapped = False 
        for j in range(i + 1, len(arr)):
            if (arr[i] > arr[j]):
                arr[i], arr[j] = arr[j], arr[i]
                swapped = True
        if not swapped:
            break 
            # Removes unnecessary iterations when array is sorted
                
    return arr

# Time complexity : O(n^2)
        

arr = [8, 6, 15, 17, 3, 1, 0, 0, 7, 9]
sorted_arr = bubbleSort(arr)
print(sorted_arr)
