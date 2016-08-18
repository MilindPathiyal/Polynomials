// Milind Pathiyal

// Driver program for a simple polynomial calculator

import java.util.*;
public class PolyDriver
{
	public static void start()
	{
		// declare three Polynomials, a, b, c
		Polynomial a = new Polynomial();
		Polynomial b = new Polynomial();
		Polynomial c = new Polynomial();
		
    	boolean done = false;
    	Scanner keys = new Scanner(System.in);
    	while (!done)
    	{
    		System.out.println("\nWelcome to the polynomial calculator");	
    		System.out.println("1. Set polynomial a");
    		System.out.println("2. Set polynomial b");
    		System.out.println("3. Add a + b");
    		System.out.println("4. Subtract a - b");
    		System.out.println("5. Multiply a * b");
    		System.out.println("6. Square a");
    		System.out.println("7. Get the square root of a");
    		System.out.println("0. Quit");
    		int input = keys.nextInt();
    		if (input == 1)
    		{
    			System.out.println("Enter the the coefficients for the 2, 1, and 0 powers for a");
    			int second = keys.nextInt();
    			int first = keys.nextInt();
    			int zero = keys.nextInt();
    			a.setPoly(second, first, zero);
    			System.out.println("a now equals " + a);
    		}
    		else if (input == 2)
    		{
    			System.out.println("Enter the coefficients for the 2, 1, and 0 powers for b");
    			int second = keys.nextInt();
    			int first = keys.nextInt();
    			int zero = keys.nextInt();
    			b.setPoly(second, first, zero);
    			System.out.println("b now equals " + b);
    		}
    		else if (input == 3)
    		{
    			c = a.add(b);
    			System.out.println(a + " + " + b + " = " + c);
    		}
    		
    		else if (input == 4)
    		{
    			c = a.subtract(b);
    			System.out.println(a + " - " + b + " = " + c);
    		}
    		else if (input == 5)
    		{
    			c = a.multiply(b);			// only works with x2 coefficient of 0
    			System.out.println(a + " * " + b + " = " + c);
    		}
    		else if (input == 6)
    		{
    			System.out.print(a + " squared = ");
    			a.square();					// only works with x2 coefficient of 0
    			System.out.println(a);
    		}
    		else if (input == 7)
    		{
    			System.out.print("The square root of " + a + " = ");
    			a.squareRoot();				// only works with perfect squares
    			System.out.println(a);
    		}
    		else if (input == 0)
    		{
    			done = true;
    			System.out.println("Goodbye");
    			
    		}			
    	}
	}	
}	

