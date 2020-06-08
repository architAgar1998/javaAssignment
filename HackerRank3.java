import java.util.Scanner;

//Given an integer, , print its first  multiples. Each multiple  (where ) should be printed on a new line in the form: N x i = result.

public class HackerRank3 {
	
	public static void main(String[] args) {
		int number = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		number = scanner.nextInt();
		table(number);
		scanner.close();
	}
	
	
	public static void table(int num) {
		for (int i = 1; i <= 10 ; i++) {
			System.out.println(num+" * "+i+" = "+(num*i));
		}
	}
	
	
}
