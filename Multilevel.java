package Corejava;

class Five
{
	static void div()
	{
		System.out.println("Division");
	}
}
class Four extends Five
{
	static void mul()
	{
		System.out.println("Multiplication");
	}
}

	class Three extends Four
	{
		static void add()
		{
			System.out.println("Addition");
		}
	}
	class Two extends Three
	{
		static void sub()
		{
			System.out.println("Substraction");
		}
	}
	public class Multilevel extends Two
	{
	static void area()
	{
		System.out.println("2");
	}
		public static void main(String[] args)
		{
			
			add();
			sub();
			mul();
			div();
			area();
			
		}
	}
