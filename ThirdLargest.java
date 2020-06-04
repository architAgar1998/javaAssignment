
public class ThirdLargest {
	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 2, 4, 5, 2, 2 };
		int temp;
		int thirdLargest = 0 ;
		int temp1 = 2;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		if(arr[temp1] == arr[temp1 + 1]) {
			for (int i = temp1 + 1; i < arr.length; i++) {
				if(arr[temp1] != arr[i]) {
					thirdLargest = arr[i];
					break;
				}
			}
		} else {
			thirdLargest = arr[temp1];
		}
		
		System.out.println("Third Largest -> "+thirdLargest);
		
	}
}
