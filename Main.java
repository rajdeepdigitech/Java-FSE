public class Main {
	public static void main(String[] args) {
		int year = 2023;
		
		if (year % 4 == 0) {
			IO.println("LEAP YEAR!");
		}
		else if (year % 100 != 0) {
			if (year % 400 == 0) {
				IO.println("LEAP YEAR");
			}
			else {IO.println("NOT LEAP YEAR");}
		}
		else {IO.println("NOT LEAP YEAR");}
	}
}






/**
class Main {
	public static void main (String[]args) {
		int year =2023;
		if (year % == 4) {
			IO.println("this is a leap year");
			if (year % = !100){
				if (year % == 400){
					
					else("this not");
					
				else ("this not");
				
			else ("this is not") {
			}
		}
	}
*/