package selinium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample 
{
	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();	
		driver.manage().deleteAllCookies();
	System.setProperty("WebDriver.gecko.driver","E:\\softwares\\Testing\\geckodriver.exe");
		driver.get("https://www.flipkart.com/");
		driver.navigate().to("https://www.flipkart.com/");
		driver.findElement(By.linkText("Log In")).click();
		//driver.findElement(By.id("identifierId")).sendKeys("mallikarjuna547");
		//driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();	
		//driver.findElement(By.cssSelector(".whsOnd.zHQkBf")).sendKeys("rosanna9949");
	}
}
