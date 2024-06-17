package LaunchBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sbi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver d1 = new ChromeDriver();
d1.get("https://retail.onlinesbi.sbi/retail/login.htm");

d1.findElement(By.id("username")).sendKeys("chaitra");
d1.findElement(By.name("password")).sendKeys("chai123");
d1.findElement(By.name("password")).sendKeys("chai123");
	}

}
