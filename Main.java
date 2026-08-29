import java.util.*;


class Azar {

	// ATTRIBUTES

	Azar() {
		IO.println("The constructor was called!");
	}
	Azar(int x, int y) {
		IO.println("The second constructor was called");
		IO.println("The values are: " + x + " " + y);

	}
	Azar(boolean x) {
		IO.println("The third constructor was called!");
		this(5, 6);
	}

	String name = "Azar";
	int age = 22;
	double gpa = 6.4;
	char grade = 'A';
	boolean isFeesPaid = false;

	// METHOD | FUNCTION

	void getDetails() {
		IO.println("Name: " + name);
		IO.println("Age: " + age);
		IO.println("GPA: " + gpa);
		IO.println("Grade: " + grade);
	}

	boolean setPaymentDetails(boolean x) {
		IO.println("The third constructor was called!");
		this.isFeesPaid = x;
		return isFeesPaid;
	}
}

public class Main {

	public static void main(String[] args) {

		List<String> myList = new ArrayList<String>();
		Set<String> mySet = new HashSet<String>();
		Map<String, String> myMap = new HashMap<String, String>();

		Azar objectOne = new Azar();
		Azar objectTwo = new Azar(4,6);
		Azar objectThree = new Azar(true);
		// Create a new instance of the class Azar 

		// object.getDetails();
		// IO.println("Payment details: " + object.setPaymentDetails(true));

		myList.add("Azar");
		myList.add("Rahul");
		myList.add("Pushpal");

		mySet.add("Pushpal");
		mySet.add("Rahul");
		mySet.add("Pushpal");

		myMap.put("01", "Pushpal");
		myMap.put("02", "Pushpal");
		myMap.put("03", "Pushpal");


		IO.println(myList);
		IO.println(mySet);
		IO.println(myMap);
	}
}


// JAVA, PYTHON, TYPESCRIPT -> CORE LANGUAGES 
// DSA -> LEETCODE , striver a2z
// SPRING BOOT, DJANGO/FLASK/FASTAPI, REACT/NEXTJS/NODEJS

// REACT-NATIVE/JAVA APPLICATION

// MYSQL,MONGODB, FIREBASE







