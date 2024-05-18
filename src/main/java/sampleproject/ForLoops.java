package sampleproject;

public class ForLoops {
	
	public static void main(String[] args) {
		
		for(int i=5; i>=0; i--) {
			System.out.println(i);
		}
		
		for(int j=0; j<6; j++) {
			System.out.println(j);
		}
		
		
		ForLoops a = new ForLoops();
		a.firstPattern();
		a.secondPattern();
		
	}
	
	public void firstPattern() {
		
		for(int i=0;i<5; i++) {
			for(int j=0;j<=i;j++) {
			System.out.print("*");
		}
			System.out.println("");
	}
	}
	
	public void secondPattern() {
		
		for(int i=5; i>=1; i--) {
			for(int j=i; j>=1; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
