package polymorphism;

public class Overriding extends Overriding2{
	
	@Override
	public void marrage(int a) {
		System.out.println("marry my wishe");
	}
	
	public static void main(String[] args) {
		Overriding2 over=new Overriding();
		over.property();
		over.marrage(1);
		
	
	}
	
}
