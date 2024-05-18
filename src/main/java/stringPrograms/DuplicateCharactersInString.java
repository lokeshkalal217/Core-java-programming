package stringPrograms;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharactersInString {
	
	public static void main(String[] args) {
		
		dupchars("Better Better");
		
	}
	
	public static void dupchars(String words) {
		
		Map<Character,Integer> charcountmap = new HashMap<Character,Integer>();
		
		char[] strArray = words.toCharArray();
		
		for(char c : strArray) {
			
			if(charcountmap.containsKey(c)) {
				
				charcountmap.put(c, charcountmap.get(c)+1);
			}
			else
				charcountmap.put(c, 1);
		}
		
		charcountmap.entrySet().stream().filter(n->n.getValue()>1).forEach(n->System.out.println(n.getKey()+ " : "+ n.getValue()));
		
		// Traversing through the map
		for(Map.Entry<Character,Integer> m1 : charcountmap.entrySet()) {
			
			if(m1.getValue()>1) {
			
			System.out.println(m1.getKey()+ " : "+ m1.getValue());
			
			}
		}
		
		
	}

}
