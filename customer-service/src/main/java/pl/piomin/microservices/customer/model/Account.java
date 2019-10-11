package pl.piomin.microservices.customer.model;

public class Account {

	private Integer id;
	private String number;
	private String accountIPAddress;

	public Account() {
		
	}

	public Account(Integer id, String number) {
		super();
		this.id = id;
		this.number = number;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getAccountIPAddress() {
		return accountIPAddress;
	}

	public void setAccountIPAddress(String accountIPAddress) {
		this.accountIPAddress = accountIPAddress;
	}

}
