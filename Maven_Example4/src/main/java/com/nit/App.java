package com.nit;


public class App 
{
	public int additionResult;
   public void add(int n,int m) {
	   
	   if(n>0 && m>0) {
		   additionResult=m+n;
		   
	   }
	   else {
		   throw new IllegalArgumentException("Negatives are Not Allowed");
	   }
   }
   public boolean prime(int n) {
	   int count=0;
	   for(int i=1;i<=n;i++) {
		   if(n%i==0) {
			   count++;
		   }
	   }
	   if(count==2) {
		   return true;
	   }
	   else {
		   return false;
	   }
   }
   
}
