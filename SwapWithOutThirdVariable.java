import java.util.Scanner;

public class SwapWithOutThirdVariable {
	
	public static void main(String[] args) {
		int first;
		int second;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first value");
		first = scanner.nextInt();
		
		System.out.println("Enter second value");
		second = scanner.nextInt();
		
		System.out.println("Before Swaping");
		System.out.println("First Value -> "+first + "\n Second Value -> "+second);
		
		first = first + second;
		second = first - second;
		first = first - second;
		
		System.out.println("After Swaping");
		System.out.println("First Value -> "+ first);
		System.out.println("Second Value -> "+second);
		
		scanner.close();
		
	}
	
}
