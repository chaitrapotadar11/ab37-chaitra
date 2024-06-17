
package LaunchBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google4 
{
	public static void main(String[] args) throws InterruptedException
	{
	ChromeDriver d1 = new ChromeDriver();
	d1.get("https://www.google.com/");
	WebElement e1= d1.findElement(By.name("q"));
	e1.sendKeys("india");
	Thread.sleep(2000);
	List<WebElement> e3=d1.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
	int count=e3.size();
	System.out.println(count);
	e3.get(count-7).click();
	}
}
