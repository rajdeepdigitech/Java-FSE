import java.lang.StringBuilder;

public class Main {

	public static void main(String[] args) {
		

		String s = "artyebui"; // Input
		StringBuilder sb = new StringBuilder(s);
		char arrVowels[] = {'a', 'e', 'i', 'o' ,'u'};

		char arr[] = s.toCharArray();

		int k = 2; // Number of distinct vowels

		int frequency = 0; // To calculate the vowel frequency 
		String MAX = "\0";

		int left = 0;
		int right = arr.length - 1;
		
	
		while (left < right) {

			for (int i = left; i < right; i++) {
				if ((arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') && frequency < k) {
					
				}
			}
		}


		



		






		
	}
}