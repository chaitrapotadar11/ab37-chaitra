package LaunchBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver d1 = new ChromeDriver();
d1.get("https://www.amazon.com/");
WebElement e1=d1.findElement(By.id("searchDropdownBox"));

Select s1 = new Select(e1);
s1.selectByVisibleText("Electronics");
	}

}
