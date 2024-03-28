package studio7;

import java.util.Scanner;

public class Rectangle {
	private int length;
	private int width;
	private int area;
	private int perimeter;
	
	public Rectangle(int l, int w) {
		this.length = l;
		this.width = w;
		area = 0;
		perimeter = 2 * this.length + 2 * this.width;
	}
	
	public int getArea() {
		area = length * width;
		return area;
	}
	
	public int getPerimeter() {
		perimeter = 2 * length + 2 * width;
		return perimeter;
	}
	
	public boolean smaller(Rectangle r) {
		if(this.area < r.getArea()) {
			return true;
		}
		return false;
	}
	
	public boolean square() {
		return length == width;
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("length: ");
		int l = in.nextInt();
		System.out.println("");
		
		System.out.print("width: ");
		int w = in.nextInt();
		
		Rectangle hello = new Rectangle(l, w);
		System.out.println("area: " + hello.getArea());
		System.out.println("perimeter: " + hello.getPerimeter());
		
		//test smaller and square blah blah blah
	}
	
	
}
