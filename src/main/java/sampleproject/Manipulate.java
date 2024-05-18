package sampleproject;

import java.util.HashMap;
import java.util.Map;

public class Manipulate {
	
	private int a = 1;
	private int b = 2;
	
	void getSum(int a, int b) {
		System.out.println(this.a+this.b);
		System.out.println(a+b);
		
		this.a = a;
		this.b =b;
		System.out.println(this.a+this.b);
		System.out.println(a+b);
		
		//String a = ""
	}
	
	public static void main(String[] args) {
		
		Manipulate m = new Manipulate();
	//	m.getSum(3, 5);
		System.out.println(makeAnagram("abc", "dab"));
		
	}
	
	public static int makeAnagram(String a, String b) {
	    // Write your code here
		char[] firstString= a.toCharArray();
		char[] secondString= b.toCharArray();
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for()
		
	    
	 // Replace matching characters with ' ' when a match is found between the strings
	    for (int i = 0; i < a.length(); i++) {
	        for (int j = 0; j < b.length(); j++) {
	            if(firstString[i]==secondString[j]){
	                firstString[i]=' ';
	                secondString[j]=' ';
	                break;
	            }
	        }
	    }

	    // Remove all the white spaces and count the lenght of final string
	    String finalStr = String.valueOf(firstString)+String.valueOf(secondString);
	    finalStr = finalStr.replaceAll("\\s+", "");

	    return finalStr.length();
	    

	    }

}


