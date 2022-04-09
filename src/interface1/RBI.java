package interface1;


@FunctionalInterface
public interface RBI {
	
	public abstract void voult();
	

	public default  void on1() {
		System.out.println("on1");
	}
	
	public static  void one() {
		System.out.println("one");
	}
	

}
