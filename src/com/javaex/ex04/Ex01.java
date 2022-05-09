package com.javaex.ex04;

public class Ex01 {

	public static void main(String[] args) {

		Thread thread1 = new Thread(new DigitImpl());
		Thread thread2 = new Thread(new LowerImpl());
		Thread thread3 = new Thread(new UpperImpl());
		
		thread1.start();
		thread2.start();
		thread3.start();

	}

}
