package LaunchBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     ChromeDriver d1 = new ChromeDriver();
d1.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_1aeuamiuit_e&adgrpid=58746164597&hvpone=&hvptwo=&hvadid=617721280249&hvpos=&hvnetw=g&hvrand=15977312285316758986&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9148188&hvtargid=kwd-310023233972&hydadcr=5903_2362026");
	WebElement sh =d1.findElement(By.xpath("(//input)[5]"));
	sh.sendKeys("shoes");
	WebElement submit =d1.findElement(By.xpath("(//input)[6]"));
	submit.click();
	
	}
	
	
	
	

}
