#include <iostream>
#include <math.h>
#include <bits/stdc++.h>

// For input output & basic mathematical foundations 

int main() {

	// Code in here 
	
	std::cout << "This is my first C++ code!" << std::endl;
	std::cout << "Printing the second line!" << std::endl;
	std::cout << "Printing the third line with newline\n";
	
	int x = 0;
	int y = 0;

	std::cout << "Enter any value of x >> ";
	std::cin >> x;
	std::cout << "Value of x is: " << x << std::endl;

	// Multiple inputs 
	
	std::cout << "Enter the value of x >> ";
	std::cin >> x;
	std::cout << "Enter the value of y >> ";
	std::cin >> y;
	std::cout << "Value of x is: " << x << " Value of y is: " << y << std::endl;
	

	/*
	 * \n -> inserts a new line (faster, commonly used)
	 * std::endl -> inserts a new line and flushes the output buffer (slower)
	 */
	return 0;

}
