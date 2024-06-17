package LaunchBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonReg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver d1= new ChromeDriver();
d1.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fsign%2Fs%2F%3F_encoding%3DUTF8%26k%3Dsign%2520in%26ref_%3Dnavm_hdr_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=anywhere_v2_us&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
d1.findElement(By.className("a-row")).click();
d1.findElement(By.name("customerName")).sendKeys("chaitraP");
d1.findElement(By.name("email")).sendKeys("chaitra@gmail.com");
d1.findElement(By.name("password")).sendKeys("ch@132");
d1.findElement(By.name("passwordCheck")).sendKeys("ch@132");
d1.findElement(By.id("continue")).click();
}
}