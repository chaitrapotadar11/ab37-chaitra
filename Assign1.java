package LaunchBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign1 {

	public static void main(String[] args) {
		ChromeDriver d1= new ChromeDriver();
		d1.get("https://www.google.com");
		d1.findElement(By.name("q")).sendKeys("India");
		d1.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

}
