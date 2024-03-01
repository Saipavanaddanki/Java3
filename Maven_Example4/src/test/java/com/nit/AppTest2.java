package com.nit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import BankingService.CustomerRegistrationATBank;
import BankingService.CutomerRegistrationInBankImpClass;
import BankingService.LoginDao;

public class AppTest2 {
	private static LoginDao dao;
	private static CustomerRegistrationATBank login;
	@BeforeAll
public static void setUp() {
		dao=Mockito.mock(LoginDao.class);
	login=new CutomerRegistrationInBankImpClass(dao);
	System.out.println(dao.getClass()+"\t"+login.getClass());
	
}
	@Test
	@DisplayName("Equals")
	public void testWithEquals() {
		Mockito.when(dao.verify("saipavan", "sai123")).thenReturn(true);
		assertEquals("Valid",login.register("saipavan", "sai123"));
	}
	@Test
	@DisplayName("NotEquals")
	public void testWithNotEquals() {
		Mockito.when(dao.verify("pavan", "pavan123")).thenReturn(false);
		assertEquals("Invalid",login.register("pavan", "pavan123"));
	}
	@Test
	@DisplayName("ThrowsError")
	public void testWithThrows() {
		assertThrows(IllegalArgumentException.class,()->{
			login.register("","");
		});
	}
	@Test
	@DisplayName("TimeoutTest")
	public void testWithTimeout() {
		assertTimeout(Duration.ofMillis(3100),()->{
			login.register("Saipavan12", "saipavan12");
		});
	}
	@AfterAll
public static void tearDown() {
	login=null;
}

}
