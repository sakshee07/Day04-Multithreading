package com.bl.day04.thread;

public class Thread1 implements Runnable{
	public static void main(String[] args) {
		Thread1 thread = new Thread1();
		thread.run();
	}

	@Override
	public void run() {
		System.out.println("thread is running");
	}
}
