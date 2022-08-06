package com.bl.day04.thread;

public class Sleep1 extends Thread {

	public void run() {
		for (int i = 1; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String args[]) {
		Sleep1 thread1 = new Sleep1();
		//Sleep1 thread2 = new Sleep1();
		thread1.start();
		//thread2.start();
		//thread1.setPriority(10);
	}
}