package LaunchBasic;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver d1= new ChromeDriver();
		d1.get("https://www.facebook.com");
		System.out.println(d1.getWindowHandle());
		System.out.println(d1.getWindowHandles());

	}

}
