package Corejava;

abstract class One
{
	abstract void add();
	abstract void sub();
}
abstract class Level extends One
{
	abstract void mul();
	void login()
	{
		System.out.println("1");
		}
}
public class Multilevel1 extends Level
{

	public static void main(String[] args) 
	{
		Multilevel1 a1=new Multilevel1();
		a1.add();
        a1.sub();
        a1.mul();
        a1.login();
	}

	@Override
	void mul() {
		System.out.println("2");
		
	}

	@Override
	void add() {
		// TODO Auto-generated method stub
		System.out.println("3");
	}

	@Override
	void sub() {
		// TODO Auto-generated method stub
		System.out.println("4");
	}


}
