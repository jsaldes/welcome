package com.welcome.test;

import com.welcome.test.Helpers;

public class Triangle implements Shapable {
	private int a;
	private int b;
	private int c;
	
	public Triangle()
	{
		System.out.println("Please define a triangle by specifying sides A, B, C: ");
		System.out.println("Side A (base line): ");
		this.a = Helpers.readInput();
		System.out.println("Side B (height): ");
		this.b = Helpers.readInput();
		System.out.println("Side C: ");
		this.c = Helpers.readInput();
	}
	
	@Override
	public int circumference() {
		return this.a + this.b + this.c;
	}

	@Override
	public double area() {
		return 0.5 * this.a * this.b;
	}
	
	public String toString()
	{
		return "Your triangle have an circumference of " + this.circumference() + " and an area of " + this.area() + "\n";
	}
}
