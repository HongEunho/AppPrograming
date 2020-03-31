package kr.ac.sejong.java1;

public class Sphere extends Circle{
	private int z;
	
	public Sphere(int x, int y, int z, int r) {
		//super(x,y,r);
		setX(x);
		setY(y);
		setR(r);
		this.z = z;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public double getVolume() {
		return 4/3.0*3.14*getR()*getR()*getR();
	}
}
