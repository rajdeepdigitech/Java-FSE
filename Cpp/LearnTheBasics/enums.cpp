#include <bits/stdc++.h>

using namespace std;

enum Level {
	LOW,
	MEDIUM,
	HIGH
};

int main() {
	
	enum Level myVar = HIGH;

	
	// Commonly used with switch statements 
	
	switch (myVar) {
	
		case 0:
			cout << "Low Level" << endl;
			break;
		case 1:
			cout << "Medium Level" << endl;
		case 2:
			cout << "High Level" << endl;
	
	}


	return 0;

}
