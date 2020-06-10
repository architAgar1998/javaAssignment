import java.util.Scanner;

public class ReverseStrng {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = null;
		System.out.println("Enter a String");
		string = scanner.next();
		
		String revString = reverseString(string);
		System.out.println("Reverse of "+string+" is -> "+ revString);
		
		scanner.close();
		
	}
	
	public static String reverseString(String string) {
		
		char character[] = string.toCharArray();
		String revstring = "";
		for (int i = character.length - 1; i >= 0; i--) {
			revstring = revstring + character[i];
		}
		return revstring;
	}
	
}
