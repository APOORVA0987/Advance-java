package in.com.oops;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person2 {
	
	private String name ;
	private Date dob;
    private String address;
    
    SimpleDateFormat sdf =new SimpleDateFormat("dd/MM/yyyy");

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		String d =sdf.format(dob);
		return d;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
    
    
}
