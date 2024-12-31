package in.Abstraction;

import java.util.Scanner;

public class Square extends Shape{
	float s;
	Scanner sc=new Scanner(System.in);
	void input() {
		System.out.println("Enter the side:");
		s=sc.nextFloat();
	}
	@Override
	void calculateArea() {
		Area=s*s;
	}
	@Override
	void displayArea() {
		System.out.println("Area of Square = "+Area);
	}
}
