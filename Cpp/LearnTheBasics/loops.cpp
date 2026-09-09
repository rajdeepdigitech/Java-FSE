#include <bits/stdc++.h>

int main()
{
	// Using for loop to print a matrix
	
	int arr[3][3] = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};

	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			
			std::cout << arr[i][j] << " ";
		
		}
		std::cout << std::endl;
	
	}

	// std::cout << "Returning the length of the array : "
	          << sizeof(arr) / sizeof(arr[0]) << std::endl;
	std::cout << arr.size() << std::endl;

	return 0;
}

