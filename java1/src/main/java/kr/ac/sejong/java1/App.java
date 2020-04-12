package kr.ac.sejong.java1;

import java.util.Stack;

public class App {
	public static void main(String[] args) throws InterruptedException { // ctrl+shift+f
		// ctrl+space
		
		System.out.println("Hello World1");
		
		//쓰레드 생성
		HelloWorldThread t1 = new HelloWorldThread("A");
		//쓰레드 실행
		t1.start();
		
		Thread.sleep(2000);
		
		t1.interrupt();
		
	}
}
