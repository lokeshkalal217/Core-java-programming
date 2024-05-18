package sampleproject;

public class StringPrograms {
 public static void main(String[] args) {
	 
	 String name1 = "Lokesh";
	 String name2 = "Lokesh";
	 
	 System.out.println(name1.equals(name2));
	 System.out.println(name1==name2);
	 String s3 =  new String("Lokesh");
	 
	 System.out.println(name1.equals(s3));
	 System.out.println(name1==s3);
	 
	 StringPrograms a1 = new StringPrograms();
	 a1.vowelsPresent();
	
	 String name = "Lokesh";
	 
	 String reverseName = "";
	 
	 for(int i=name.length()-1; i>=0; i--) {
		 reverseName = reverseName+name.charAt(i);
	 }
	 
	 System.out.println(reverseName);
	 
	 StringPrograms a = new StringPrograms();
	 int count = a.countCharactersInString("Lokesh Kalal");
	 System.out.println(count);
	 
	 System.out.println(name.contains("e"));
	 
	 if(name.contains("e")) {
	 System.out.println(name.toUpperCase());
	 }
	 else
		 System.out.println(name.toLowerCase());
	 

	 
	 System.out.println(name.equals(name.toUpperCase()));
	
		 
	 
			 
	 
	 
	 
}
 
 public int countCharactersInString(String random) {
	 
	 int count = 0;
	 for(int i=0; i<random.length(); i++) {
		 count++;
	 }
	 return count;
	 
	 
 }
 	public void vowelsPresent() {
 		String str = "Lokesh";
 		 int count = 0;
 		
 		for(int i=0; i<str.length()-1; i++) {
 			
 			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
 			 
 				System.out.println(str.charAt(i));
 				str.indexOf(i);
 				count++;
 			}
 			
 		}
 		
 		System.out.println(count);
 		
 	}
}
