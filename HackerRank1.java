import java.util.Scanner;

//Given an integer, , perform the following conditional actions:
//
//If  is odd, print Weird
//If  is even and in the inclusive range of  to , print Not Weird
//If  is even and in the inclusive range of  to , print Weird
//If  is even and greater than , print Not Weird
//Complete the stub code provided in your editor to print whether or not  is weird.


public class HackerRank1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;
		String answer;
		System.out.println("Enter the number");
		number = scanner.nextInt();
		scanner.close();
		
		answer = check(number);
		
		System.out.println(answer);
		
	}
	
	public static String check(int num) {
		String answer = null;
		if(num % 2 == 1) {
			answer = "Weird";
		} else {
			if (num >=2 && num <= 5) {
				answer = "Not Weird";
			} else if (num >= 6 && num <= 20 ) {
				answer = "Weird";
			} else if (num > 20) {
				answer = "Not Weird";
			}
		}
		
		return answer;
	}
	
}
