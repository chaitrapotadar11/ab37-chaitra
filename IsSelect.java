package LaunchBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver d1 = new ChromeDriver();
		d1.get("file:///C:/Users/hp/Downloads/learningHTML1.html");
		WebElement e1 = d1.findElement(By.id("123"));
		boolean b1 = e1.isSelected();
		if(b1==true)
		{
			System.out.println("It is Selected");
		}
		else
		{
			System.out.println("It is not Selected");
			e1.click();
		}
		
		
	}

}
