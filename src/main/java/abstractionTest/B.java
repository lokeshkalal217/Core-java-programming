package abstractionTest;

public class B extends A{ 
	

	@Override
	public void animalSound() {
		// TODO Auto-generated method stub
		System.out.println("Animal Sound");
	}
	
	public static void main(String[] args) {
		
		B b = new B();
		b.animalSound();
		b.sleep();
		

	}

}