package sampleproject;

public class Reverstring {
	
	public static void main(String[] args) {
		
		Reverstring a = new Reverstring();
		System.out.println(a.revereString1("Lokeh Kalal"));
	}
	
	public String revereString1(String input1) {
		
		String rev = "";
		
		for(int i=input1.length()-1; i>=0; i--) {
			rev = rev + input1.charAt(i);
			
		}
		
		
		return rev;
	}

}
