package Corejava;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s1= new Scanner(System.in);
String s= s1.next();
String a="";

for(int i=4;i>=0;i--)
{
	char reverse = s.charAt(i);
	a=a+reverse;
}
System.out.println(a);
if(s.equals(a)) {
	
	System.out.println("Palindrome");
}
else
{
	System.out.println("not Palindrome");
}
	}

}
