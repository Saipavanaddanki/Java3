package com.nit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class AppTest 
{
	private static App app;
   @BeforeAll
   public static void setUp() {
	   app=new App();
   }
   @Test
   @DisplayName("AddWithZeros")
   @Order(3)
   public void addTestWithZeroes() {
	  final int n=0;
	  final int m=0;
	   assertThrows(IllegalArgumentException.class,()->{
		   app.add(n, m);
	   });
   }
   @Test
   @DisplayName("AddWithPositives")
   @Order(4)
   public void addTestWithPositives(){
	   int n=12;
	   int m=13;
	   int expected=25;
	   app.add(n,m);
	   int real=app.additionResult;
	   assertEquals(expected,real,1);
   }
   @Test
   @DisplayName("EvenWithTrue")
   @Order(3)
   public void evenTestWithTrue() {
	   int n=11;
	   assertTrue(app.prime(n));
   }
   @Test
   @DisplayName("EvenTestWIthFalse")
   @Order(2)
   public void evenTestWithFalse() {
	   int n=12;
	   assertFalse(app.prime(n));
   }
   @AfterAll
   public static void tearDown() {
	   
   }
}
