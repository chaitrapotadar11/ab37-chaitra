package LaunchBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver d1 = new ChromeDriver();
d1.get("https://www.amazon.in/");
WebElement e1= d1.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
e1.sendKeys("shoes");
Thread.sleep(1000);
List<WebElement> r1= d1.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
int count = r1.size();
System.out.println(count);

	}

}
