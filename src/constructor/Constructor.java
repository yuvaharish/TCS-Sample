package constructor;

public class Constructor extends Parent {

	public Constructor(){
		this(12);
		System.out.println("i am normal constructor");
	}
	
	public Constructor(int a){
		this(12,"vyravan");
		System.out.println("i am parameter constructor :"+a);
	}
	
	public Constructor(int a,String b){
		super(50);
		System.out.println("i am two arguments constructor "+a+b);
	}
	
	public static void main(String[] args) {
		
		Constructor c = new Constructor();

	}
}
