package kr.ac.sejong.java1;

import java.util.Scanner;

public class JavaReview2 {

	public static void main(String[] args) {//ctrl+shift+f
		// ctrl+space
		Scanner scanner = new Scanner(System.in);
		System.out.println("10나누기 x 프로그램 : x를 입력하세요");
		while(true)
		{
			int x = scanner.nextInt();
			try {
				System.out.println(10/x);
			}
			catch(ArithmeticException e)
			{
				System.out.println("0은 쓰시면 안됩니다.");
			}
		}
	} 

}
