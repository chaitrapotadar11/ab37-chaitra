package LaunchBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Grotech3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver d1= new ChromeDriver();
d1.get("https://grotechminds.com/registration/");
WebElement e1= d1.findElement(By.id("fname"));
e1.sendKeys("Chaitra");
WebElement e2= d1.findElement(By.id("lname"));
e2.sendKeys("Potadar");
WebElement e3= d1.findElement(By.id("email"));
e3.sendKeys("Chaitra@gmail.com");
WebElement e4= d1.findElement(By.id("password"));
e4.sendKeys("Chaitra@123");

WebElement e6= d1.findElement(By.id("Female"));
e6.click();
WebElement e7= d1.findElement(By.id("Present-Address"));
e7.sendKeys("Belgaum");
WebElement e8= d1.findElement(By.id("Permanent-Address"));
e8.sendKeys("Bangalore");
WebElement e9= d1.findElement(By.id("Pincode"));
e9.sendKeys("591213");

	}

}
