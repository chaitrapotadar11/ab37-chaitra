package Corejava;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="chai_*tra";
		int count=0;
		
		for(int i=0;i<s1.length();i++)
		{
			char c= s1.charAt(i);
			if(!(Character.isLetter(c)) && !(Character.isDigit(c)));
			count++;
		}
		
	
	System.out.println("nor of characters:");
	}
}
