package sampleproject;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayPrograms {
	
public static void main(String[] args) {
	
	int[] num = {1,2,3,4,5,6};
	Arrays.asList(num);
	System.out.println(num.length);
	System.out.println(num[0]);
	
	for(int i=0; i<num.length; i++) {
		System.out.println(num[i]);
	}
	
	for(int j: num) {
		System.out.println(j);
	}
	
	
	ArrayList<String> ar = new ArrayList<String>();
	ar.add("Lokesh");
	ar.add("Dimpy");
	ar.add("Om");
	
	for(String name : ar) {
		System.out.println(name);
	}
	
}

}
