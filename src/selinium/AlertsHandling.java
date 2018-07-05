package selinium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertsHandling {

	public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.irctc.co.in/");
	driver.findElement(By.linkText("Flights")).click();
	/*String msg=driver.switchTo().alert().getText();
	System.out.println(msg);
	driver.switchTo().alert().accept();
	String crrwindowid=driver.getWindowHandle();
	System.out.println(crrwindowid);*/
	Set<String> allWindows=driver.getWindowHandles();
	System.out.println(allWindows);
	}

}
