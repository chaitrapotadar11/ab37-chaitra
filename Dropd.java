package LaunchBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver d1 = new ChromeDriver();
d1.get("https://www.amazon.com/");
WebElement e1=d1.findElement(By.id("searchDropdownBox"));
e1.sendKeys(Keys.ARROW_DOWN);
e1.sendKeys(Keys.ARROW_DOWN);
e1.sendKeys(Keys.ARROW_DOWN);
e1.sendKeys(Keys.ARROW_DOWN);
	}

}
