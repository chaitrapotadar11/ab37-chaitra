package Corejava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) 
	{
		try
		{
		int rollno[] = new int[3];
		 for(int i=0;i<=4;i++)
		 {
			 Scanner s1=new Scanner(System.in);
			 System.out.println("Enter the value of index"+i);
			 rollno[i]=s1.nextInt();
		 }
		}
		 catch(InputMismatchException a3)
		 {
			 System.out.println("inputMissmatch");
		 }

	}

}
