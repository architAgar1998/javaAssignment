import java.util.Scanner;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int first = 0;
		int second = 1;
		int third;
		int length = 10;
		
		System.out.print(first+", "+second);
		
		for(int i = 0; i < length; i++) {
			third = first + second;
			System.out.print(", "+third);
			first = second;
			second = third;
		}
		
		scanner.close();
		
	}
	
}
