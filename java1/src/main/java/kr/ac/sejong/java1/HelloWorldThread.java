package kr.ac.sejong.java1;

import java.util.Scanner;

//쓰레드를 상속함으로써 HelloWorldThread는 Thread로 불릴 수 있다.
public class HelloWorldThread extends Thread{

	private String msg;
	private boolean flag = false;
	
	
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public HelloWorldThread(String msg) {
		this.msg = msg;
	}
	// 쓰레드 안에 있는 run 메소드를 재 정의한다.
	@Override
	public void run() {
		while(true) {
			if(Thread.interrupted()) {
				return;
			}
			System.out.println(msg);
			System.out.println(Thread.interrupted());
		}
		
	}
	
}
