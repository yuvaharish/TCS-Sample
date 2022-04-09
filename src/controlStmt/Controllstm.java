package controlStmt;

public class Controllstm {
	
	public static void main(String[] args) {
		
		String name ="Superman";
		
		switch (name) {	
		case "Superman":
				System.out.println("yes your hero name :"+name);
				break;
		case "Ironman":
			System.out.println("yes your hero name :"+name);
			break;
		case "spiderman":
			System.out.println("yes your hero name :"+name);
			break;
		default:
			System.out.println("your hero not able to find");
		}
		
	}

}
