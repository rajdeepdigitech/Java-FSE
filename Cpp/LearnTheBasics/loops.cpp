#include <iostream>

int main()
{
	// Using for loop to print a matrix
	
	int arr[][] = {{1,2,3}, {1,2,3}, {1,2,3}};

	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			
			std::cout << arr[i][j] << " ";
		
		}
		std::cout << std::endl;
	
	}

	return 0;
}
