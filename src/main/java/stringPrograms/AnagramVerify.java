package stringPrograms;

public class AnagramVerify {
	
	public static void main(String[] args) {
		
		String s1 = "Mother in Law";
		String s2 =  "Hitler Woman";
		
		
		String copyOfs1 = s1.replaceAll("\\s", "");

		String copyOfs2 = s2.replaceAll("\\s", "");
		
		System.out.println(copyOfs1);
		System.out.println(copyOfs2);
		
		if(copyOfs1.toLowerCase().length()==copyOfs2.toLowerCase().length()) {
			
			
		}

	}

}
