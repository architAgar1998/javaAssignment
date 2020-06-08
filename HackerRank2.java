import java.util.Scanner;

public class HackerRank2 {

	public static boolean anagram(String a, String b) {

		boolean isAnagram;
		int count = 0;
		if (a.length() == b.length()) {
			String first =  a.toLowerCase();
			String second = b.toLowerCase();
			char firstString[] = first.toCharArray();
			char secondString[] = second.toCharArray();
			int firstFreq[] = new int[firstString.length];
			int secondFreq[] = new int[secondString.length];
			
			for (int i = 0; i < firstFreq.length; i++) {
				firstFreq[i] = 1;
				for (int j = i+1; j < firstFreq.length; j++) {
					if(firstString[i] == firstString[j]) {
						firstFreq[i]++;
						firstString[j] = 0;
					}
				}
			}
			
			for (int i = 0; i < secondFreq.length; i++) {
				secondFreq[i] = 1;
				for (int j = i+1; j < secondFreq.length; j++) {
					if(secondString[i] == secondString[j]) {
						secondFreq[i]++;
						secondString[j] = 0;
					}
				}
			}
			
			for (int i = 0; i < firstFreq.length; i++) {
				for (int j = 0; j < secondFreq.length; j++) {
					if(firstString[i] == secondString[j] && firstFreq[i] == secondFreq[j]) {
						count++;
					}
				}
			}
			
			if(count == firstFreq.length && count == secondFreq.length) {
				isAnagram = true;
			} else {
				isAnagram = false;
			}

		} else {
			isAnagram =  false;
		}
		
		return isAnagram;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter first string");
		String first = scanner.next();

		System.out.println("Enter second string");
		String second = scanner.next();

		if (anagram(first, second)) {
			System.out.println("anagram");
		} else {
			System.out.println("not anagram");
		}
		
		scanner.close();

	}

}
