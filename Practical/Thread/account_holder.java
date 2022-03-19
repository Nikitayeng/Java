package com;

public class account_holder implements Runnable {
	
	private account acc;
	public account_holder(account acc) {
		this.acc=acc;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++)
		{
			makeaWithdraw(2000);
			if(acc.getBalance()<0) {
				System.out.println("Account is overdrawn");
			}
		}
	}
	
	private void makeaWithdraw(int withdrawAmount) {
		if(acc.getBalance()>=withdrawAmount) {
			System.out.println(Thread.currentThread().getName()+"is going to withdraw -"+withdrawAmount);
			try {
				Thread.sleep(3000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			acc.withdraw(withdrawAmount);
			System.out.println(Thread.currentThread().getName()+"completes the withdraw of -"+withdrawAmount);
		}else {
			System.out.println("not enough balance for "+Thread.currentThread().getName()+"to withdrraw"+acc.getBalance());
		}
	}
}
    
	
