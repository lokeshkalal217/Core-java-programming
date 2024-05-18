package lambdaAndStreams;

import java.util.ArrayList;
import java.util.List;

public class FirstLambda {
	
	public static void main(String[] args) {
		
		List<Integer> al = new ArrayList<Integer>();
		al.add(2);
		al.add(5);
		al.add(3);
		al.add(6);
		al.add(8);
		
		al.forEach(n ->System.out.println(n));
		
		// print only even using lambda
		
		al.forEach(n -> {
			if(n%2==0)
				System.out.println(n); 
		
		});
	}
	
	int a =10;
	
 	

}
