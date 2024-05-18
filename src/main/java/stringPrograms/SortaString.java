package stringPrograms;

import java.util.Arrays;

public class SortaString {
	
	public static void main(String[] args) {
		
		String str = "Lokesh";
		
		
		char[] arr = str.toLowerCase().toCharArray(); 
		
		Arrays.sort(arr);
		
		for(char c : arr) {
			System.out.println(c);
		}
		
		for(char val='a'; val<'z'; val++) {
			System.out.println(val);
		}
		
		System.out.println("-----------------------");
		
		rawApproachForSorting("abcdcbafsefergvs ");
	}
	
	public static void rawApproachForSorting(String str) {
		
		char [] arr = str.toLowerCase().toCharArray();
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i]>arr[j]) {
					char temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
				
		}
		
		for(char c : arr) {
			System.out.print(c);
		}
		
	}

}
