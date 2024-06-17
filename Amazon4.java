package LaunchBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver d1 = new ChromeDriver();
	d1.get("https://www.amazon.com/");
	d1.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
	d1.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
	d1.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
	d1.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
	d1.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
	d1.findElement(By.id("twotabsearchtextbox")).sendKeys("Software Books");
	d1.findElement(By.id("nav-search-submit-button")).click();
	

	}

}
