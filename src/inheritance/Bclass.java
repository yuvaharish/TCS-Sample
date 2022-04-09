package inheritance;

public class Bclass extends Dclass{
	
	public void Amazon() {
		System.out.println("Amazon");
	}

	public static void main(String[] args) {
		Bclass b = new Bclass();
		b.openBrowser();
		b.Amazon();
	}
}
