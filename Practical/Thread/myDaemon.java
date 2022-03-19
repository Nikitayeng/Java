package com;


public class myDaemon extends Thread{
	public void run() {
		System.out.println("User or Daemon Thread");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myDaemon t=new myDaemon();
		myDaemon t1=new myDaemon();
		t.start();
		t1.setDaemon(true);
		t1.start();
		System.out.println("Main Thread");
		System.out.println(t1.getName()+" "+ t1.isDaemon());
	}

}

