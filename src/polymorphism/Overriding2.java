package polymorphism;

public class Overriding2 {

	
	
	public void property() {
		System.out.println("House");
	}
	public void marrage(int a) {
		System.out.println("marry uncle daughter");
	}
	
	
	
	
	public static void main(String[] args) {
		Overriding2 s = new Overriding2();
		s.property();
		s.marrage(1);
		
	}
}
