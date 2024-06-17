package LaunchBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Alllinks1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver d1 = new ChromeDriver();
		d1.get("https://www.google.com/");
		List<WebElement> e1=d1.findElements(By.tagName("a"));
		
		int count=e1.size();
		System.out.println(count);
			
	for(int i=0;i<count;i++)
	{
		WebElement s1=   e1.get(i);
		
		String link=s1.getAttribute("href");
		System.out.println(link);
		
	}

	}
}
