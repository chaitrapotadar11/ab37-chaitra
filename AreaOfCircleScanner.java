package Corejava;

import java.util.Scanner;

public class AreaOfCircleScanner
{
	final static double pi=3.142;

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value r");
		int r= s1.nextInt();
		System.out.println("Enter the value radius");
		double radius= s1.nextDouble();
		System.out.println("Area of Circle is");
		double Area= pi*r*r;
		System.out.println(Area);
	}

}

