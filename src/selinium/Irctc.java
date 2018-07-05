package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Irctc {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		//System.setProperty("WebDriver.chrome.driver", "E:\\softwares\\Testing\\chromedriver.exe");
driver.get("http://irctc.co.in");
if (!driver.findElement(By.id("otpId")).isSelected()) 
{
	driver.findElement(By.id("otpId")).click();	
}
/*driver.findElement(By.id("otpId")).click();
Sleeper.sleepTightInSeconds(5);
driver.findElement(By.id("otpId")).click();*/
	}
}
