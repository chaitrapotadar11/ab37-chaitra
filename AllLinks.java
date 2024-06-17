package LaunchBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver d1 = new ChromeDriver();
d1.get("https://www.google.com/");
List<WebElement> e1=d1.findElements(By.tagName("a"));
int count=e1.size();
System.out.println(count);
	}

}
