package stringPrograms;

public class PalinDrome {
	
	public static void main(String[]  args) {
		
		//System.out.println(checkPalindrome1("abba"));
		
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1&b2);
		
		
		
		
	}
	
	public static boolean checkPalindrome1(String str) {
		
		String rev = "";
		
		for(int i= str.length()-1; i>=0; i--) {
			rev +=str.charAt(i);
		}
		System.out.println(rev);
		
		if(str.equals(rev)) {
			return true;
		}
		else
			return false;
		
		
		
		
	}
	
	

}
