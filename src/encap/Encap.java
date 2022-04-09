package encap;

public class Encap {

	private String username;
	private int password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public static void main(String[] args) {
		Encap e = new Encap();
		e.setPassword(1234);
		int pass = e.getPassword();
	}
}
