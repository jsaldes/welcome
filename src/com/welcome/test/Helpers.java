package com.welcome.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Helpers {
	/**
	 * Make sure input it of type integer else fail with appropriate
	 * error message.
	 * 
	 * @return integer
	 */
	public static int readInput()
	{
		int result = 0;
		Scanner sc = new Scanner(System.in);
		try
		{
			result = sc.nextInt();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Execution failed: Input needs to be of type double.");
		}
		return result;
	}
}
