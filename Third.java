package Corejava;

public class Third {

	static void add()
	{
		int a=10;
		int b=20;
		int sum=(a+b);
		System.out.println(sum);
	}
	static void sub()
	{
		int a=30;
		int b=20;
		int res=(a-b);
		System.out.println(res);
		
	}
	static void mul()
	{
		int a=10;
		int b=20;
		int Multiplication=(a*b);
		System.out.println(Multiplication);
	}
	static void div()
	{
		int a=20;
		int b=20;
		int Division=(a/b);
		System.out.println(Division);
	}

	public static void main(String[] args) 
	{
		System.out.println("Main Method");
		add();
		sub();
		mul();
		div();
	}
	
}



