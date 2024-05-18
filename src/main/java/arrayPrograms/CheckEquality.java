package arrayPrograms;

import java.util.Arrays;

public class CheckEquality {
	
	public static void main(String[] args) {
		
		int[] ar1 = {4,5,7,8,9,3,1,0};
		int[] ar2 = {4,5,7,8,9,3,1,0};
		int[] ar3 = {4,5,7,8,3,1,0,9};
		
		boolean br1 = Arrays.equals(ar1, ar2);
		boolean br2 = Arrays.equals(ar1, ar3);
		
		System.out.println(br1);
		System.out.println(br2);
	}
	
	
	public static boolean mapequals(int[] ar1, int ar2[]) {
		
		if (ar1.length == ar2.length) {

			for (int i = 0; i < ar1.length; i++) {

				if (ar1[i] != ar2[i]) {
					return false;
				}
			}
		} 
		else 
			return false;
		return false;

	}
	
	
	
	
	
}


