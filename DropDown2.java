package LaunchBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver d1 = new ChromeDriver();
d1.get("https://www.amazon.in");
WebElement sea=d1.findElement(By.id("searchDropdownBox"));

Select s1=new Select(sea);
s1.selectByVisibleText("Beauty");
	}

}
