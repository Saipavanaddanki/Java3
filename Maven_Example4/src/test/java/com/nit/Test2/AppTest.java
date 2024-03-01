package com.nit.Test2;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import BankingService.CustomerRegistrationATBank;
import BankingService.CutomerRegistrationInBankImpClass;
import BankingService.LoginDao;

public class AppTest {
	private static LoginDao dao;
	private static CustomerRegistrationATBank login;
@BeforeAll
public  static void setUp() {
	dao=Mockito.spy(LoginDao.class);
	login=new CutomerRegistrationInBankImpClass(dao);
	System.out.println(dao+"\t"+login);
	
}
@Test
@DisplayName("Equals")
@Tag("uat")
public void testWithEquals() {
	login.add("saipavan", "saipavan12");
	Mockito.verify(dao,Mockito.times(1)).register("saipavan", "saipavan12");
	login.add("pavan", "pavan12");
	login.add("pavan", "pavan12");
	Mockito.verify(dao,Mockito.times(2)).register("pavan", "pavan12");
	login.add("king", "king12");
	login.add("king", "king12");
	login.add("king", "king12");
	Mockito.verify(dao,Mockito.times(3)).register("king", "king12");	
}
@AfterAll
public static void tearDown() {
	login=null;
	dao=null;
}
}
