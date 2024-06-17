package LaunchBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggetion {

	public static void main(String[] args) throws InterruptedException                                  //get size 0 =coz selenium is working faster than applicatiomn so we need to give thread.slee(1000);
	                                                                                                         // then it will give u ans 10
	{
		// TODO Auto-generated method stub
ChromeDriver d1 = new ChromeDriver();
d1.get("https://www.google.com/");
WebElement e1 = d1.findElement(By.name("q"));
if(e1.isDisplayed()&&e1.isEnabled())
{
	e1.sendKeys("India");
}
Thread.sleep(1000);
List<WebElement> cou=d1.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
 int count = cou.size();
 System.out.println(count);
 
      // cou.get(1).click();
       //cou.get(3).click();
 //
 //cou.get(1).click();
   cou.get(count -7).click();
 

	}

}
