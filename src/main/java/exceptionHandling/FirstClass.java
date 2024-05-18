package exceptionHandling;

public class FirstClass {

	public static void main(String[] args) {
		
		FirstClass f = new FirstClass();
		try {
		int result = f.dividefunction(10, 0);
		System.out.println(result);
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
		
		
		
	}
	
	public int dividefunction(int a, int b) throws ArithmeticException{
		
		if(b==0) {
			throw new ArithmeticException("Errrrrrrrrrrrrrrrrrr");
		}
		return a/b;
	}
}
