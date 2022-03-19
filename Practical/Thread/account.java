package com;

public class account {

	
		public class Account {
			  
			private int balance=600;
			public int getBalance() {
				return balance;
			}
			public void withdraw(int amount) {
				balance=balance-amount;
			}
		}
		
	}


