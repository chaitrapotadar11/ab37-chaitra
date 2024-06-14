package Corejava;

public class Four {
	static void add()
	{
		System.out.println("Addition");
	}
	static void sub()
	{
		System.out.println("Substraction");
	}
	static void mul()
	{
		System.out.println("Multiplication");
	}
	static void div()
	{
		System.out.println("Division");
	}
	 void addition()
	{
		System.out.println("1");
	}
	 void substraction()
	{
		System.out.println("2");
	}
	 void multiplication()
	{
		System.out.println("3");
	}
	 void division()
	{
		System.out.println("4");
	}
	public static void main(String[] args) 
	{
		Four a1= new Four();
		a1.addition();
		a1.substraction();
		a1.multiplication();
		a1.division();
		System.out.println("Main Method");
		add();
		sub();
		mul();
		div();
	}

}


