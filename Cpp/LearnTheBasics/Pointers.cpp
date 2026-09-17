#include <bits/stdc++.h>

using namespace std;

int main() {

	int age = 45;
	cout << &age << endl;
	// Memory address

  int* ptr = &age;
  
  *ptr = 46;

  cout << "Pointer value: " << *ptr << endl;
  cout << "Variable value: " << age << endl;

  return 0;


}
