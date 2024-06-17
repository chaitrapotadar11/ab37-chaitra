package LaunchBasic;

import org.apache.poi.hslf.record.InteractiveInfoAtom.Link;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLT {

	public static void main(String[] args) {
		ChromeDriver d1= new ChromeDriver();
		d1.get("https://www.amazon.com/");
		
		for(link_text in links)
		{
			d1.findElement(By.partialLinkText("United")).click();
			d1.findElement(By.partialLinkText("Us")).click();
		}
		
		
	}
	

}
