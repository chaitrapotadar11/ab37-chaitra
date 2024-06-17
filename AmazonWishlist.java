package LaunchBasic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AmazonWishlist {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method 
		ChromeDriver d1 = new ChromeDriver();
		d1.get("https://www.amazon.in/");
		d1.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoes");
		d1.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		WebElement e1=d1.findElement(By.xpath("//div[@class='a-section aok-relative s-image-tall-aspect'][1]"));
		e1.click();
		Set<String> shoe=d1.getWindowHandles();
		System.out.println(shoe);
		Iterator<String> a1=shoe.iterator();
		String parent=a1.next();
		String child=a1.next();	
		System.out.println(parent);
		System.out.println(child);
		d1.switchTo().window(child);
		WebElement e2=d1.findElement(By.xpath("//div[@id='wishlistButtonStack']"));
		e2.click();

		
	}

}







