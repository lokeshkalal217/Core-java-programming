package sampleproject;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SortArray {
	
	public static void main(String[] args) {
		
		List<Integer> distinctnum = Arrays.asList(2,2,4,6,8,7,7,10,1,1,5,5,5,6,78,67);
		//distinctnum.stream().distinct().sorted().forEach(l->System.out.println(l));
		
		HashSet<Integer> v = new HashSet<Integer>(distinctnum);
		System.out.println(v);
		
		TreeSet<Integer> v1 = new TreeSet<Integer>(distinctnum);
		System.out.println(v1);
		//sorting();
		//sortusingStreams();
	}
	
	public static void sortusingStreams() {
		
		List<Integer> distinctnum = Arrays.asList(2,2,4,6,8,7,7,10,1,1,5,5,5,6,78,67);
		//distinctnum.stream().distinct().sorted().forEach(l->System.out.println(l));
		
		HashSet<Integer> v = new HashSet<Integer>(distinctnum);
		System.out.println(v);
		
		Set<Integer> val = distinctnum.stream().collect(Collectors.toSet());
		System.out.println(val);
		
		distinctnum = distinctnum.stream().distinct().sorted().collect(Collectors.toList());
		//System.out.println(distinctnum);
		
		
	}
	
	
	public static void sorting() {
		
		int [] arr = {90,45,96,123,-45,-3,85,49};
		//Arrays.sort(arr);
		//for(int i=0; i<arr.length; i++) {
			//System.out.println(arr[i]);
		//}
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				int temp=0;
				
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i]= arr[j];
					arr[j]= temp;
					
				}
				
				
			}
			
			System.out.println(arr[i]);
		}
	}

}
