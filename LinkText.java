package LaunchBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText 
{
	public static void main(String[] args)
	{
		ChromeDriver d1= new ChromeDriver();
	
d1.get("https://grotechminds.com/registration/");
		List<WebElement> skill=d1.findElements(By.id("Skills"));
		
		int count=skill.size();
		System.out.println(count);
			
	for(int i=0;i<count;i++)
	{
		WebElement s1=   skill.get(i);
		
		String link=s1.getText();
		System.out.println(link);
	}
	}
}
