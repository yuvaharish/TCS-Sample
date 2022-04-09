package interface1;


@FunctionalInterface
public interface RBI1 {
	
	public abstract  void currentAccount();
	
	public static  void savingsAccount() {
		System.out.println("Savings");
	}
	
	public default void fixedAccount() {
		System.out.println("fixed");
	}

}
