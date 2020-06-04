
public class Frequency {
	
	public static void main(String[] args) {
		int arr[] = new int[] {1,2,3,4,5,1,2,6,7,6};
		int freq[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			freq[i] = 1;
			for (int j = i+1; j < arr.length; j++) {
				
				if (arr[i] == arr[j]) { 
					freq[i]++;
					arr[j] = 0;
				}
			}
		}
		
		for (int i = 0; i < freq.length; i++) {
			if(arr[i] != 0) {
				System.out.println(arr[i]+" -> "+freq[i]+", ");
			}
		}
		
	}
	
}
