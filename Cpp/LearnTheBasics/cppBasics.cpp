#include <bits/stdc++.h>


// Class containing modifyString function 

class StringModifier {
public:
	std::string modifyString(std::string str) {
		std::string arr = str;

		arr[0] = 'H';

		return arr;
	
	}	

};

class StringChecker {
public:
	bool checkString(std::string str, std::string str2) {
		
		
	       bool returnAns;
	       str == str2 ? returnAns = true: returnAns = false;
       	       return returnAns;	       
	
	}

};



int main() 
{


	// Defining Arrays 
	
	// Data_type array_name [Array_size];
	
	int arr[] = {0,0,0,0,0,0,0,0,0,0};

	for (auto it : arr)
	{std::cout << it << " ";}

	/*
	 * Three options to find elements inside an array 
	 * [x] We already know where the element is located --> O(1) 
	 * [x] We don't know where the element is located --> Binary search, Linear Search ...
	 * [x] For faster repeated lookups we can use hash-based data structures like (hashset - hashmap)
	 *
	 * */
	
	// Strings => Series of characters 
	
	std::string name = "Pushpal";
	std::cout << name << std::endl;
	std::cout << name[0] << std::endl;
	std::cout << "Length of the string: " << name.length() << std::endl;

	StringModifier object;
	StringChecker objectTwo;

	std::string modify = object.modifyString(name);
	std::cout << name << std::endl;
	std::cout << modify << std::endl;
	
	modify = "Pushpal";
	bool hasModified = objectTwo.checkString(name, modify);
	std::cout << hasModified << std::endl; // Returns 1 -> True

	// PASSING A STRING ALWAYS MAKES A FRESH COPY
	return 0;
}
