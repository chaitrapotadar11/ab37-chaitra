package LaunchBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Grotech {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver d1= new ChromeDriver();
d1.get("https://grotechminds.com/registration/");
d1.findElement(By.id("fname")).sendKeys("manish kumar tivari");
d1.findElement(By.id("fname")).sendKeys(Keys.BACK_SPACE);
d1.findElement(By.id("fname")).sendKeys(Keys.BACK_SPACE);
d1.findElement(By.id("fname")).sendKeys(Keys.BACK_SPACE);
d1.findElement(By.id("fname")).sendKeys(Keys.BACK_SPACE);
d1.findElement(By.id("fname")).sendKeys(Keys.BACK_SPACE);
d1.findElement(By.id("fname")).sendKeys(Keys.BACK_SPACE);
	}

}
