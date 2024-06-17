package LaunchBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver d1 = new ChromeDriver();
d1.get("https://www.google.com/");
d1.findElement(By.cssSelector("#APjFqb")).sendKeys("India");
	}

}
