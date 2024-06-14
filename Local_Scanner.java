package Corejava;

import java.util.Scanner;

public class Local_Scanner {
Scanner s1=new Scanner(System.in);
int a = s1.nextInt();
int b= s1.nextInt();
void add()
{
	int c=a+b;
	System.out.println(c);
}
void substract()
{
	int d=a-b;
	System.out.println(d);
}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Local_Scanner a1 = new Local_Scanner();
		a1.add();
		a1.substract();
	}

}
