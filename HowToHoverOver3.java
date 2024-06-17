package LaunchBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HowToHoverOver3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver d1 = new ChromeDriver();
		
		d1.get("https://grotechminds.com/");
		WebElement autom =d1.findElement(By.xpath("(//a[@class='elementor-item'])[5]"));
		 Actions a1= new Actions(d1);
		 a1.moveToElement(autom).perform();
	}

}
