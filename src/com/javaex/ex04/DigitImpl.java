package com.javaex.ex04;

public class DigitImpl implements Runnable {
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.getStackTrace();
			}
		} 
	}
}
