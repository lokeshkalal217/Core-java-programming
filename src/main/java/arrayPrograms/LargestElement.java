package arrayPrograms;

import java.util.Arrays;

public class LargestElement {
	
	public static void main(String[] args) {
	
		int[] arr = {10,30,100,-97, -7, 0, 60,40};
		
		Arrays.stream(arr).max().getAsInt();
		
		int max = Arrays.stream(arr).max().getAsInt();
		int min = Arrays.stream(arr).min().getAsInt();
		
		System.out.println(max);
		System.out.println(min);
		
		//int max1 = largeNum(arr);
		
		//System.out.println(max1);
	}
	
	
	public static int largeNum(int[] array) {
		
		int mx =0;
		
		for(int i=0; i<array.length; i++) {
			
			if(array[i]>mx) {
				mx =array[i];
			}
			
			//return mx;
		}
		
		return mx;
		
	}

}
