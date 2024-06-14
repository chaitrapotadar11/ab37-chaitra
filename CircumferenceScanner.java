package Corejava;

import java.util.Scanner;

public class CircumferenceScanner 
{
	final static double pi=3.142;

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value of r");
		int r=s1.nextInt();
		System.out.println("Circumference of circle is");
		double circle=2*pi*r;
		System.out.println(circle);
		
		

	}

}
