#include <bits/stdc++.h>

using namespace std;

int main() {
	
	string food = "Pizza";
	// referencing is an alias for the exisiting variable 
	
	string &meal = food;

	cout << meal << endl;

	// Updating meal also changes food
	
	meal = "Something else"; 

	cout << meal << endl;
	cout << &meal << endl; // Prints the memory address

	return 0;
}
