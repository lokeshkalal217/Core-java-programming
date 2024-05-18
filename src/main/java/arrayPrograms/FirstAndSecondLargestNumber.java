package arrayPrograms;

import java.util.Arrays;

public class FirstAndSecondLargestNumber {
	
	
	public static void main(String[] args) {
		
		int[] arr = {10,23, 22, -20,-12, 76, 67, 23, 11, 103, 2, 6, 10};
		
		Arrays.sort(arr);
		System.out.println(arr[arr.length-1]);
		
		
		int temp =0;
		
		for(int i=0; i<arr.length; i++) {
		
			for(int j= i+1; j<arr.length; j++) {
				
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
			
			
		}
		
		//for(int ar : arr) {
		//	System.out.println(ar);
		//}
		
		
	}
	
	public static void maxTwo(int[] arr) {
		
		int max1 = arr[0];
		int max2 = arr[1];
		
		for(int i=2; i<arr.length; i++) {
			
			
		}
	}

}
