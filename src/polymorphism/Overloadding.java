package polymorphism;

public class Overloadding {

	public void vyravan() {
		System.out.println("i am not a overloadding method");
	}
	
	public void vyravan(int number) {
		System.out.println("i am not a one overloadding method"+number);
	}
	
	public void vyravan(int number,String groupword) {
		System.out.println("i am not a two overloadding method"+number+groupword);
	}
	
	public static void main(String[] args) {
		Overloadding or = new Overloadding();
		or.vyravan();
		or.vyravan(1);
		or.vyravan(2, "two");
	}
}
