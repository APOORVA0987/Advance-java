package in.com.oops;

public class TestA {
	
	public static void main(String[] args) {
	
		Account a = new Account();
		a.setNumber("34567");
		a.setAccountType("saving");
		a.setBalance(3000);
		
		System.out.println(a.getNumber());
		System.out.println(a.getAccountType());
		System.out.println(a.getBalance() );
		
	}

}
