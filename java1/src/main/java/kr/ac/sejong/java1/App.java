package kr.ac.sejong.java1;

import java.util.Stack;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) { // ctrl+shift+f
		// ctrl+space
		
		Stack<String> stack = new Stack<String>();
		stack.push("3");
		stack.push("5");
		String p = stack.pop();
		System.out.println(p);
	}
}
