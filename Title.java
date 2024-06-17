package LaunchBasic;

import org.openqa.selenium.chrome.ChromeDriver;

public class Title {

	public static void main(String[] args) {
		ChromeDriver d1 = new ChromeDriver();
		d1.manage().window().maximize();
		d1.get("https://www.google.com");
		String title= d1.getTitle();
		System.out.println(title);
	}

}
