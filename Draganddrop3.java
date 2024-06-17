package LaunchBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver d1 = new ChromeDriver();
d1.get("https://grotechminds.com/drag-and-drop/");
WebElement drag=d1.findElement(By.id("drag1"));
WebElement drop=d1.findElement(By.id("div2"));
Actions a1 = new Actions(d1);
a1.dragAndDrop(drag, drop).perform();
	}

}
