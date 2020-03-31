package kr.ac.sejong.java1;

public class Circle {
	private int x;
	private int y;
	private int r;
	
	/**
	 * Circle의 생성자
	 * x축값 y축값 반지름을 가지고 원을 만든다.
	 * @param x1
	 * @param y1
	 * @param r1
	 */
	public Circle() {
		
	}
	
	public double getArea() {
		return 3.14*r*r;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public Circle(int x, int y, int r) {
		super();
		this.x = x;
		this.y = y;
		this.r = r;
	}
}
