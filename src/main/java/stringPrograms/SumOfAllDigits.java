package stringPrograms;

public class SumOfAllDigits {
	
	public static void main(String[] args) {
		
		sumofDigits(55);
		sumofDigits(45);
		sumofDigits(123);
		
	}
	
	public static void sumofDigits(int num) { 
		
		int copyOfNumber = num;
		
		int sum =0;
		
		while(copyOfNumber !=0) {
			
			int lastdigit = copyOfNumber%10;
			
			sum = sum +lastdigit;
			
			copyOfNumber = copyOfNumber/10;
		}
		
		System.out.println(sum);
		
		
	}

}
