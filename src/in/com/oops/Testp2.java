package in.com.oops;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Testp2 {
	
	public static void main(String[] args) throws ParseException {
		
		Person p = new Person();
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	p.setName("ram");
	p.setDob(sdf.parse("03/07/2003"));
	p.setAddress("Bhopal");
	
	System.out.println(p.getName());
	System.out.println(p.getDob());
	System.out.println(p.getAddress());
	}

}
