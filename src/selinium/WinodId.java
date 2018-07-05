package selinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WinodId {

	public static void main(String[] args) {
WebDriver driver=new FirefoxDriver();
		driver.get("http://irctc.co.in");
		String crrWindowid=driver.getWindowHandle();
		System.out.println(crrWindowid);
		
	}

}
