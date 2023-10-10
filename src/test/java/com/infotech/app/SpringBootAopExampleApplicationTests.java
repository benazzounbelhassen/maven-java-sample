package com.infotech.app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.infotech.model.Account;
import com.infotech.service.impl.AccountService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootAopExampleApplicationTests {

	@Autowired
	AccountService accountService;
	
	@Test
	public void contextLoads() {
	}
	
	
	
	@Test
	public void testUpdateAccount() {
		
		Account account = new Account("6778888886", "Money tranfer");
		Long amount = 10L;
		accountService.updateAccountBalance(account, amount);
		
	}

}
