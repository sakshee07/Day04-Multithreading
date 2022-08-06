package com.bl.thread2;

public class ChracterThread extends Thread {
	@Override
	public void run() {
		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.println(i);

		}
		System.out.println(" bye from characterThread");
	}
}