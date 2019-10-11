package pl.piomin.microservices.account.api;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.net.InetAddress;

import pl.piomin.microservices.account.model.Account;

@RestController
public class Api {

	private List<Account> accounts;
	
	protected Logger logger = Logger.getLogger(Api.class.getName());
	
	public Api() {
		accounts = new ArrayList<>();
		accounts.add(new Account(1, 1, "111111"));
		accounts.add(new Account(2, 2, "222222"));
		accounts.add(new Account(3, 3, "333333"));
		accounts.add(new Account(4, 4, "444444"));
		accounts.add(new Account(5, 1, "555555"));
		accounts.add(new Account(6, 2, "666666"));
		accounts.add(new Account(7, 2, "777777"));
		accounts.add(new Account(8, 2, "888888"));
		accounts.add(new Account(8, 2, "9999990"));
	}
	
	@RequestMapping("/accounts/{number}")
	public Account findByNumber(@PathVariable("number") String number) {
		logger.info(String.format("Account.findByNumber(%s)", number));
		InetAddress localhost = null;
		Account accountDtls =  accounts.stream().filter(it -> it.getNumber().equals(number)).findFirst().get();
		try
        {
			localhost = InetAddress.getLocalHost(); 
	        System.out.println("System IP Address : " + (localhost.getHostAddress()).trim()); 
	        accountDtls.setAccountIPAddress((localhost.getHostAddress()).trim());
        }
        catch(java.net.UnknownHostException e){
        	 System.out.println(e);
        }
		
		return accountDtls;
	}
	
	
	@RequestMapping("/accounts/customer/{customer}")
	public List<Account> findByCustomer(@PathVariable("customer") Integer customerId) {
		logger.info(String.format("Account.findByCustomer(%s)", customerId));
		InetAddress localhost = null;
		List<Account> accountList = accounts.stream().filter(it -> it.getCustomerId().intValue()==customerId.intValue()).collect(Collectors.toList());
		try
        {
			localhost = InetAddress.getLocalHost(); 
	        System.out.println("System IP Address : " + (localhost.getHostAddress()).trim()); 
	        for(Account account: accountList){
	        	account.setAccountIPAddress((localhost.getHostAddress()).trim());
	        }
        }
        catch(java.net.UnknownHostException e){
        	 System.out.println(e);
        }
        return accountList;
	}
	
	@RequestMapping("/accounts")
	public List<Account> findAll() {
		logger.info("Account.findAll()");
		return accounts;
	}
	
}
