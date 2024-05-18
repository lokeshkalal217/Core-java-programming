package stringPrograms;

public class SubStringPrograms {
	
	
	static String finalString = new String();
	public static void main(String[] args) {
		
		String original = "LokeshDimpy";
		String tobeinserted= "And";
		
		int index =5;
		
		for(int i=0; i<original.length(); i++) {
			
			finalString = finalString+original.charAt(i);
			
			if(i==index) {
				finalString +=tobeinserted;
			}
			
			
		}
		
		System.out.println(finalString);
		
		
	}
	
	public static void substringm1() {
		
        String str = "GeeksGeeks";
		
		String str1 = str.substring(0, 5) + "And" +str.substring(5);
		
		System.out.println(str1);
		
		//System.out.println(str.substring(0, 5));
		
		
	}

}
