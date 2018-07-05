package selinium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class LaunchingChrome 
{
	public static void main(String[] args) 
	{
	
//System.setProperty("webdriver.gecko.driver", "‪‪‪F:\\Testing\\geckodriver.exe");
//WebDriver driver=new ChromeDriver();
	
		WebDriver driver=new FirefoxDriver();
	driver.manage().deleteAllCookies();
	driver.get("http://google.com");
	driver.navigate().to("http://Facebook.com");
	driver.navigate().back();
	driver.navigate().forward();
	driver.close();
	driver.quit();
	}

}
