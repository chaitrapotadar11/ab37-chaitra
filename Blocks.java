package Corejava;


public class Blocks
{
		Blocks() //Constructor
		{
			System.out.println("i am constructor");
		}
		
		static //SIB
		{
	       System.out.println("i am SIB");
	    }
		
		//IIB
		{
			System.out.println("i am IIB");
		}
		
		public static void main(String[] args) //Main method
		{
			System.out.println("I am main method");
			new Blocks();
		}
		}

