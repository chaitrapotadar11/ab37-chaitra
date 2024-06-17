package LaunchBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assign3 {
public static void main(String args[])
{   //(//input[@class='inputtext _58mg _5dba _2ph-'])[1]
	EdgeDriver driver =new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	
	WebElement cn =driver.findElement(By.xpath("(//a)[3]"));
	cn.click();
	
	WebElement un =driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	un.sendKeys("chaitra");
	
	WebElement las= driver.findElement(By.name("lastname"));
	las.sendKeys("P");
		
		WebElement em =driver.findElement(By.name("reg_email__"));
		em.sendKeys("chaitra@gmail.com");
		
		WebElement re_em =driver.findElement(By.name("reg_email_confirmation__"));
		re_em.sendKeys("chaitra@gmail.com");
		
		WebElement un_pass =driver.findElement(By.name("reg_passwd__"));
		un_pass.sendKeys("chai123");
	
	
}
}