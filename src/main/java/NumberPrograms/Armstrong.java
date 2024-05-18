package NumberPrograms;

public class Armstrong {

	public static void main(String[] args) {
		
		int num = 145;
		
		
		// TODO Auto-generated method stub

	}
	
	public static void checkArmStrong(int num) {
		 int copyofnum = num;
		 
		 int lengthofnum = String.valueOf(num).length();
		 
		 int sum =0;
		 
		 while(copyofnum !=0) {
			 
			 int lastdigit = copyofnum%10;
			 int lastdigittopoweroflength= 1;
			 
			 for(int i=0; i<lengthofnum; i++) {
				 
				 lastdigittopoweroflength = lastdigittopoweroflength*lastdigit;
			 }
			 
			 sum = sum + lastdigittopoweroflength;
			 copyofnum = copyofnum/10;
		 }
		 
		 
		 
		 
		
		
	}

}
