package com.welcome.test;

import java.util.ArrayList;
import com.welcome.test.Helpers;

public class Polygon implements Shapable {
	private ArrayList<Integer> x = new ArrayList<>();
	private ArrayList<Integer> y = new ArrayList<>();
	private int pts;
	
	public Polygon()
	{
		System.out.println("How many points does the polygon have?");
		this.pts = Helpers.readInput();
		for( int x = 0; x < this.pts; x++ )
		{
			System.out.format("Define x, y position for point at position %d\n", x + 1);
			System.out.println("X: ");
			this.x.add(Helpers.readInput());
			System.out.println("Y: ");
			this.y.add(Helpers.readInput());
		}
	}

	@Override
	public int circumference() {
		return 0;
	}

	@Override
	public double area() {
		int area = 0;
		try
		{
			int j = this.pts - 1;

			for( int i = 0; i < this.pts; i++ )
			{ 
				area = area +  (this.x.get(j) + this.x.get(i)) * (this.y.get(j) - this.y.get(i));
				j = i;
			}
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		return area / 2;
	}
	
	public String toString()
	{
		return "Your polygon have an area of " + this.area() + "\n";
	}
}
