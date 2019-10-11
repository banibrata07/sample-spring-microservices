package pl.piomin.microservices.account.model;

public class Account {

	private Integer id;
	private Integer customerId;
	private String number;
	private String accountIPAddress;

	public Account() {

	}

	public Account(Integer id, Integer customerId, String number) {
		this.id = id;
		this.customerId = customerId;
		this.number = number;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
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
