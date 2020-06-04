import java.util.Scanner;

public class ArmsStrongNumber {
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
	    int c=0,a,temp;  
	    int n;
	    
	    System.out.println("Enter the number");
	    n = scanner.nextInt();
	    
	    temp=n;  
	    while(n>0)  
	    {  
	    a=n%10;  
	    n=n/10;  
	    c=c+(a*a*a);  
	    }  
	    if(temp==c)  
	    System.out.println("armstrong number");   
	    else  
	        System.out.println("Not armstrong number");   
	    scanner.close();
	}
}
