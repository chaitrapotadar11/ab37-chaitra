package Corejava;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value a");
		byte a= s1.nextByte();
		System.out.println("Enter the value b");
		int b= s1.nextInt();
		System.out.println("Enter the value c");
		long c= s1.nextLong();
		System.out.println("Enter the value d");
		short d= s1.nextShort();
		System.out.println("Enter the value e");
		double e= s1.nextDouble();
		System.out.println("Enter the value f");
		boolean f= s1.nextBoolean();
		System.out.println("Enter the value g");
		float g= s1.nextFloat();
		System.out.println("Enter the value h");
		String h= s1.next();
		
	}

}
