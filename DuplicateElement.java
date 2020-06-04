
public class DuplicateElement {
	
	public static void main(String[] args) {
		
		int arr[] = new int[] {1,2,3,4,3,4,5,6,8,8};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					if(arr[i] != -1)
					System.out.println(arr[i]);
					arr[j] = -1;
				}
			}
		}
	}
	
}
