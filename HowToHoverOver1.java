package LaunchBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HowToHoverOver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver d1 = new ChromeDriver();
d1.get("https://www.flipkart.com/");
WebElement fash=d1.findElement(By.xpath("(//span[.='Fashion'])[1]"));
Actions a1= new Actions(d1);
a1.moveToElement(fash).perform();

WebElement men =d1.findElement(By.xpath("(//a[@class='_3490ry'])[2]"));
men.click();


	}

}
