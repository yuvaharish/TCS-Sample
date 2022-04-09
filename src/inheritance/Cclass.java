package inheritance;

public class Cclass extends Dclass {

	public void flipkart() {
		System.out.println("Flikart");
	}
	
	public static void main(String[] args) {
		Cclass c = new Cclass();
		c.openBrowser();
		c.flipkart();
	}
}
