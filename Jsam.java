package LaunchBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jsam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver d1 = new ChromeDriver();
		d1.get("file:///C:/Users/hp/Downloads/learningHTML1.html");
		WebElement un=d1.findElement(By.xpath("(/html/body/input)[1]"));
		un.sendKeys("chaitra");
		
		WebElement hin=d1.findElement(By.xpath("(/html/body/input)[2]"));
	hin.sendKeys("chai");
		WebElement pass=d1.findElement(By.xpath("(/html/body/input)[3]"));
		pass.sendKeys("chai123");
		
	}

}
