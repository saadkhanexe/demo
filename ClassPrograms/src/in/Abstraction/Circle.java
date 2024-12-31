package in.Abstraction;

import java.util.Scanner;

public class Circle extends Shape{
	float r;
	Scanner sc=new Scanner(System.in);
	@Override
	void input() {
		System.out.println("Enter the radius:");
		r=sc.nextFloat();
	}
	@Override
	void calculateArea() {
		Area=3.14f*r*r;
	}
	@Override
	void displayArea() {
		System.out.println("Area of Circle = "+Area);
	}
	
	
}
