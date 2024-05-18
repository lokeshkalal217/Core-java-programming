package stringPrograms;

public class EvenLengthWords {

	public static void main(String[] args) {
		
		print("My name is lokesh and I am learning");
		
		String str = "GeeksGeeks";
		
		String str1 = str.substring(0, 5) + "And" +str.substring(5);
		
		System.out.println(str1);
		
		System.out.println(str.substring(0, 5));
		
	}
	
	public static void print(String words) {
		
		for(String s : words.split(" ")) {
			
			if(s.length()%2==0) {
				System.out.println(s);
			}
			
			
		}
	}
	
	
}
