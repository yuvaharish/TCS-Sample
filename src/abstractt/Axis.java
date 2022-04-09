package abstractt;

public class Axis extends RBI {

	@Override
	public void savings() {
		System.out.println("Savings 2%");
		
	}

	@Override
	public void voult() {
	System.out.println("Chennai");
		
	}


	public static void main(String[] args) {
		RBI a  = new Axis();
		a.savings();
		a.voult();
		a.currentAccount();
	}
	
	

}
