package com.bl.thread2;

public class NumberRunnable implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i <= 20; i++) {
			System.out.println(i);
		}
		System.out.println("bye from num  thread");
	}

}
