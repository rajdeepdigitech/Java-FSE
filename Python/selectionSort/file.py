import sys

"""
Finds the lowest value in the array (after comparing) and 
moves it to the first of the array 
"""

def selectionSort(arr):
    min_element = sys.maxsize

    for i in range(len(arr)):
        if arr[i] < min_element:
            min_element = arr[i]
    return min_element

arr = [0 , 9, 8, 7, 6]
print(selectionSort(arr))


