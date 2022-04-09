package abstractt;

public class Sbi extends RBI{

	@Override
	public void savings() {
		System.out.println("Savings 3%");
		
	}

	@Override
	public void voult() {
		System.out.println("mumbai");
		
	}

	public static void main(String[] args) {
		RBI s = new Sbi();
		s.currentAccount();
		s.savings();
		s.voult();
	}
}
