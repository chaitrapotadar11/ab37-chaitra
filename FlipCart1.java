package LaunchBasic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FlipCart1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver d1 = new ChromeDriver();
d1.get("https://www.flipkart.com/");
WebElement e1=d1.findElement(By.name("q"));
e1.sendKeys("shoes");
e1.sendKeys(Keys.ENTER);

WebElement e2=d1.findElement(By.xpath("//div[@class='wvIX4U']/div[1]"));
e2.click();
Set<String> s1=d1.getWindowHandles();
System.out.println(s1);
Iterator<String> pcid=s1.iterator();
String pid=pcid.next();
String cid=pcid.next();
System.out.println(pid);
System.out.println(cid);

WebElement Buynow=d1.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']"));
Buynow.click();
d1.switchTo().window(cid);
WebElement Buy=d1.findElement(By.xpath("//button[@class='QqFHMw zA2EfJ _7Pd1Fp']"));
Buy.click();

}

}
