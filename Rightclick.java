package LaunchBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver d1 = new ChromeDriver();
d1.get("https://www.google.com");
WebElement e1 = d1.findElement(By.linkText("Gmail"));

Actions a1= new Actions(d1);
a1.contextClick(e1).perform();

	}

}
