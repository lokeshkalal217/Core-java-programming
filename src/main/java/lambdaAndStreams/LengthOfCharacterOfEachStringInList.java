package lambdaAndStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LengthOfCharacterOfEachStringInList {
	
	public static void main(String[] args) {
		
		
		String[] stringWords = {"Lokesh", "Dimpy", "Vidit", "OM"};
		
		List<String> words = Arrays.asList(stringWords);
		
		words.forEach(s ->System.out.println(s));
		words.stream().filter(s->s.startsWith("O")).forEach(s->System.out.println(s));
		
		words.stream().map(str -> str.length()).forEach(System.out::println);
		
		words.stream().filter(s->s.contains("i")).forEach(s->System.out.println(s));
		
		System.out.println("-------------------------------------------");
		
		words.stream().map(str -> str.toUpperCase()).forEach(s->System.out.println(s));	
		
		System.out.println("-------------------------------------------");
		
		words.stream().sorted().forEach(s->System.out.println(s));
		
		
		
	}


}
