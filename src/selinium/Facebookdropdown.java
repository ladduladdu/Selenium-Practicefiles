package selinium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebookdropdown 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://facebook.com");
		Select dlist =new Select(driver.findElement(By.id("day")));
		WebElement melement;
		melement=driver.findElement(By.id("month"));
		Select mlist=new Select(melement);
		WebElement yelement;
		yelement=driver.findElement(By.id("year"));
		Select ylist=new Select(yelement);
		//dlist.selectByVisibleText("10");
		dlist.selectByIndex(17);
		mlist.selectByValue("10");
		ylist.selectByVisibleText("1999");
		
}
}
