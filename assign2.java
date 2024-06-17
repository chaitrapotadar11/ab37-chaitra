package LaunchBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class assign2
{
public static void main(String args[]){
	
	ChromeDriver d1= new ChromeDriver();
	d1.get("https://www.facebook.com");
	d1.findElement(By.id("email")).sendKeys("Chaitrazp199@gmail.com");
	d1.findElement(By.id("pass")).sendKeys("chai@123");
	d1.findElement(By.name("login")).click();
}
}


