package encap;

import java.util.ArrayList;

public class EncList {
	
	public static void main(String[] args) {
		ArrayList<Encap> li = new ArrayList<>();
		Encap s = new Encap();
		s.setUsername("yuvaraj");
		s.setPassword(12345);
		
		li.add(s);
		
		for (Encap encap : li) {
			int p=encap.getPassword();
			String str=encap.getUsername();
			System.out.println(p+str);
		}
		
		
		
	}

}
