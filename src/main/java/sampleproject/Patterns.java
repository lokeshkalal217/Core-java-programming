package sampleproject;

public class Patterns {
	public static void main(String[] args) {
		
		
		Patterns p = new Patterns();
		p.pb1();
		
	}
	
	public void firstPattern() {
		
		for(int i=4; i>=0; i--) {
			for(int j =i; j>=0; j--) {
				System.out.print("*");
			}
			System.out.println(" ");
			
		}
		
	}
	
	public void pb() {
		
		int k =10;
		
		for(int i=0; i<4; i++) {
			
			
			
			for(int j=0; j<4-i; j++) {
				
				System.out.print(k+"\t");
				k--;
				
			}
			System.out.println("");
		}
		
	}
	
	
	public void pb1() {
		
		int k = 3;
		
		for(int i=1; i<4; i++) {
			
			for(int j=1; j<=i; j++) {
				System.out.print(k+" ");
				k =k+3;
				
			}
			System.out.println("");
		}
	}
	


}
