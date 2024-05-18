 package stringPrograms;

public class ArmStrongNumber {
	
	public static void main(String[] args) {
		
		int num = 145;
		int numlengths = String.valueOf(num).length();
		
		int sum=0;
		int copyOfnum = num;
		
		while(copyOfnum !=0) {
			
			int lastDigit = copyOfnum%10; // to get the last digit
			
				
				sum = sum + lastDigit;
				copyOfnum = copyOfnum/10;
				
		}
		System.out.println(sum);
	
		
		//Anamgram -> 145 = 1^3 + 4^3 + 5^3
		// 12 = 1^2 + 2^2
	//	int numberOfDigits = String.valueOf(num).length();
		//System.out.println(numberOfDigits);
		
		checkArmStrong(123);
		checkArmStrong(153);
		
	}
	
	public static void checkArmStrong(int number) {
		
		int copyOfNumber = number;
		
		int noOfDigits = String.valueOf(number).length();
		
		int sum =0;
		
		while(copyOfNumber != 0) {
			
			int lastDigit = copyOfNumber%10; // to get last digit 
			int lastDigitTotheNumberOfPowerDigits =1;
			
			for(int i=0; i<noOfDigits; i++) {
				
				lastDigitTotheNumberOfPowerDigits = lastDigitTotheNumberOfPowerDigits*lastDigit;
				
			}
			
			sum = sum + lastDigitTotheNumberOfPowerDigits;
			copyOfNumber = copyOfNumber/10; 
			
		}
		
		if(sum == number) {
			System.out.println(number+ " is ARMSTrong");
		}
		else
			System.out.println(number+ "is Not ArmStrong");
		
	}

}
