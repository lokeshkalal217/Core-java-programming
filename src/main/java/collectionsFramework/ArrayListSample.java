package collectionsFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListSample {
	
	public static void main(String[] args) {
		
		String str = "abcabcd";
		
		char [] charArray = str.toCharArray();
		
		for(int i=0; i<charArray.length; i++) {
			
			
		}
		
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Lokesh");
		ar.add("Dimpy");
		ar.add("Om");
		
		//modify vale
		ar.set(0, "LOKESH");
		
		//remove an element
		//ar.remove(0);
		
		// Remove 
		
		ar.forEach(n->System.out.println(n));
		
		System.out.println("-----------------------------");
		ar.stream().filter(s->s.startsWith("O")).forEach(n->System.out.println(n));
		
		System.out.println("-----------------UPPER CASE------------");
		
		ar.stream().map(n->n.toUpperCase()).forEach(n->System.out.println(n));
		
		System.out.println("-----------------UPPER CASE------------");
		
		
		
	
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		System.out.println("For each loop"); 
			
	/*	for(String str : ar) {
			System.out.println(str);
		} */
		
		
	}

}
