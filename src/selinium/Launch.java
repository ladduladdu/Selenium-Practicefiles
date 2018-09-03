package selinium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Launch {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "‪E:\\Testing\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		 driver.manage().window().maximize();
		 driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
		 driver.get("http://facebook.com");
	}

}
