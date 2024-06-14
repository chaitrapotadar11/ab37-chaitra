package Corejava;

import java.util.Scanner;

public class Switch 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter a value of a");
		int a= s1.nextInt();
		
		switch(a)
		{
		case 1: System.out.println("addition");
			     break;
		case 2: System.out.println("substraction");
	     break;
		case 3: System.out.println("multiplication");
	     break;
		case 4: System.out.println("division");
	     break;
		}
		

	}

}
