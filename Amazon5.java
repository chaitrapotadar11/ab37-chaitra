package LaunchBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver d1 = new ChromeDriver();
d1.get("https://www.amazon.in/");
WebElement e1= d1.findElement(By.id("twotabsearchtextbox"));
e1.sendKeys("mouse");
Thread.sleep(2000);

List<WebElement> e2= d1.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
int count=e2.size();
System.out.println(count);
e2.get(count-7).click();


	}
}
