package com.javaex.ex01;

public class Ex01 {

	public static void main(String[] args) throws InterruptedException {
		
		Thread thread = new DigitThread();
		thread.start();
		
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
			Thread.sleep(1000);
		}
		
	}
}
