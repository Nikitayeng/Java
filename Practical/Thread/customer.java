package com;

public class customer {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		account acc=new account();
		account_holder account_holder=new account_holder(acc);
		Thread t1=new Thread(account_holder);
		Thread t2=new Thread(account_holder);
		t1.setName("Dhamraj");
		t2.setName("Ram");
		
	}

}