package LaunchBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon6 {

		public static void main(String[] args) throws InterruptedException
		{
		ChromeDriver d1 = new ChromeDriver();
		d1.get("https://www.amazon.in/");
		WebElement e1= d1.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("mouse");
		Thread.sleep(2000);
		List<WebElement> e3=d1.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int count=e3.size();
		System.out.println(count);
		e3.get(7).click();
	}

}
