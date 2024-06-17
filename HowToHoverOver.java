package LaunchBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HowToHoverOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver d1= new ChromeDriver();
d1.get("https://www.amazon.in/");
WebElement hh=d1.findElement(By.xpath("//span[@class='nav-line-2 '] "));
 Actions a1= new Actions(d1);
a1.moveToElement(hh).perform();
WebElement sign=d1.findElement(By.xpath("(//span[.='Sign in'])[1]"));
sign.click();
WebElement emai=d1.findElement(By.xpath("//input[@name='email']"));
emai.sendKeys("chaitrazp1996@gmail.com");
WebElement con=d1.findElement(By.xpath("//input[@id='continue']"));
con.click();
	}

}
