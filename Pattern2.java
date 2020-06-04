
public class Pattern2 {
	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			if(i%2 == 0) {
				for (int j = i+1; j < 4; j++) {
					System.out.print(" ");
				}
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
