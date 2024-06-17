package LaunchBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Json {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver d1 = new ChromeDriver();
d1.get("file:///C:/Users/hp/Downloads/learningHTML1.html");
d1.findElement(By.xpath("(/html/body/form)[2]/input[1]")).click();
d1.findElement(By.xpath("(/html/body/form)[2]/input[2]")).click();
d1.findElement(By.xpath("(/html/body/form)[2]/input[3]")).click();
d1.findElement(By.xpath("/html/body/input[4]")).click();
d1.findElement(By.xpath("/html/body/input[5]")).click();
d1.findElement(By.xpath("/html/body/input[6]")).click();

	}

}
