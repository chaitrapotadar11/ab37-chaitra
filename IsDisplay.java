package LaunchBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver d1 = new ChromeDriver();
d1.get("https://www.google.com/");
WebElement e1 = d1.findElement(By.name("q"));
if(e1.isDisplayed()&& e1.isEnabled())
{
e1.sendKeys("India");

	}

}
}
