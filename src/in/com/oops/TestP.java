package in.com.oops;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestP {
	
	public static void main(String[] args) throws ParseException {
		
	Person  p = new Person();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		p.setName("purva");
		p.setDob(sdf.parse("1/12/2000"));
		p.setAddress("indore");
		
		System.out.println(p.getName());
		System.out.println(p.getDob());
		System.out.println(p.getAddress());
	}

}
