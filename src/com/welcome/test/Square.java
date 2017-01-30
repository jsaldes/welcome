package com.welcome.test;

import com.welcome.test.Helpers;

public class Square implements Shapable {
	private int x;
	private int y;
	
	public Square()
	{
		System.out.println("Basic Geometry!");
		System.out.println("Type height of square: ");
		this.x = Helpers.readInput();
		System.out.println("Type width of square: ");
		this.y = Helpers.readInput();
	}
	
	@Override
	public int circumference()
	{
		return (this.x * 2) + (this.y * 2);
	}
	
	@Override
	public double area()
	{
		return this.x * this.y;
	}
	
	public String toString()
	{
		return "Your square have an circumference of " + this.circumference() + " and an area of " + this.area() + "\n";
	}
}
