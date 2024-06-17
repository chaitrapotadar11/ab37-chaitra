package LaunchBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick2 {
public static void main(String[] args)
{
	ChromeDriver d1 = new ChromeDriver();
	d1.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_8701n5vjln_e&adgrpid=150668182221&hvpone=&hvptwo=&hvadid=674893540028&hvpos=&hvnetw=g&hvrand=9754548396415762909&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9152876&hvtargid=kwd-316976920040&hydadcr=5628_2359484&gad_source=1");
	WebElement e1 = d1.findElement(By.linkText("Fresh"));
	Actions a1= new Actions(d1);
	a1.contextClick(e1).perform();
}
}
