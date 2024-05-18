package lambdaAndStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FirstStream {
	
	public static void main(String[] args) {
		
		List<Integer> al = new ArrayList<Integer>();
		al.add(2);
		al.add(5);
		al.add(3);
		al.add(6);
		al.add(8);
		
		List<Integer> ls = al.stream()
				.filter(i-> i%2==0)
				.collect(Collectors.toList());
		
		System.out.println(ls);
	}

}
