package arrayPrograms;

public class ReverseArray {
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,4,5,7,3};
		//System.out.println(arr.length);
		
		int[] arr1 = new int[6];
		
		for(int i=arr.length-1; i>=0; i--) {
			
			//System.out.println(arr[i]);
			arr1[i] = arr[arr.length-1-i];
		}
		
		
		//System.out.println(arr1[1]);
		
		for(int i : arr1) {
			System.out.println(i);
		}
	}

}
