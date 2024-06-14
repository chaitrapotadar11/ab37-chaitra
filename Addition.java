package Corejava;

public class Addition {
	
		Addition(int a)
		{
			System.out.println("first constructor");
		}
		Addition (int a , double b){
			System.out.println("second constructor");
		}
		Addition(int a , double b , char c){
			System.out.println("third constructor");
		}
		Addition(int a , double b , boolean d){
			System.out.println("fourth constructor");
		}
		Addition(int a , double b ,String e){
			System.out.println("fifth constructor");
		}
		public static void main(String[] args)
		{
			new Addition (98);
			new Addition (1, 0.001);
			new Addition (1 , 0.005 , 'A');
			new Addition (1 , 0.005 , true);
			new Addition (1 , 0.005 , "Thenameis");
			
		
		}
	}


	
