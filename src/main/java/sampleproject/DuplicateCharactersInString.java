package sampleproject;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharactersInString {

	public static void main(String[] args) {
		
		String str = "lokesh kalal";
		dupChar(str);
		
		// TODO Auto-generated method stub

	}
	
	public static void dupChar(String str) {
		
		//Creating a HashMap containing char as key and it's occurrences as value
		
		Map<Character, Integer> charcountMap = new HashMap<Character, Integer>();
		
		char[] chararray = str.toCharArray();
		
		for(char c : chararray) {
			if(charcountMap.containsKey(c)) {
				
				charcountMap.put(c, charcountMap.get(c)+1);
				
				
			}
			else {
				charcountMap.put(c, 1);
		}
		
	}
		
		System.out.println(charcountMap);
		for(Map.Entry<Character, Integer> entry: charcountMap.entrySet()) {
			
			if(entry.getValue() >1) {
				System.out.println(entry.getKey()+ ":"+ entry.getValue());
			}
		}
		

}

}