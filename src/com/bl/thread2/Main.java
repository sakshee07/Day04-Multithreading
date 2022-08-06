package com.bl.thread2;

public class Main {
	public static void main(String[] args) {
		
	
	ChracterThread characterThread = new ChracterThread();
	NumberRunnable numberRunnable = new NumberRunnable();
	Thread numberThread = new Thread(numberRunnable);
	
	characterThread.start();
	numberThread.start();
	//characterThread.setPriority(10);

	//numberThread.interrupt();
	//numberThread.setPriority(10);
	System.out.println("Good bye from main");
}
}
