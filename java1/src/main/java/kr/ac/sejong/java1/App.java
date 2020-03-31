package kr.ac.sejong.java1;

import java.util.Stack;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) { // ctrl+shift+f
		// ctrl+space
		
		/*Stack<String> stack = new Stack<String>();
		stack.push("3");
		stack.push("5");
		String p = stack.pop();
		System.out.println(p);*/
		
		Sphere s1 = new Sphere(3,4,5,6);
		//Upcasting
		Circle c1 = (Circle)s1;
		System.out.println(c1.getArea());
		
		//Downcasting
		Circle c2 = new Circle(3,4,5);
		Sphere s2 = (Sphere)c2;
	}
}
