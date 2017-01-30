package com.welcome.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ShapeTest {

	private Triangle triangle;
	private Square square;
	private Polygon polygon;
	private static final double DELTA = 1e-15;
	
	@Before
	public void setUp() throws Exception {
		triangle = new Triangle();
		square = new Square();
		polygon = new Polygon();
	}

	@Test
	public void test_area_of_triangle() 
	{
		double result = 0.5 * 8 * 8;
		Assert.assertEquals(result, triangle.area(), DELTA);
	}
	
	public void test_area_of_square()
	{
		double result = 8 * 8;
		Assert.assertEquals(result, square.area(), DELTA);
	}
	
	public void test_circumference_of_triange()
	{
		int result = 8 + 8 + 10;
		Assert.assertEquals(result, triangle.circumference(), DELTA);
	}
	
	public void test_circumference_of_square()
	{
		int result = (8 * 2) + (8 * 2);
		Assert.assertEquals(result, square.circumference());
	}
	
	public void test_area_of_polygon()
	{
		// { 4,  4,  8,  8, -4, -4 }
		// { 6, -4, -4, -8, -8,  6 }
		Assert.assertEquals(128, polygon.area(), DELTA);
	}
}
