package selinium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;

public class FacebookaccountCreation {

	public static void main(String[] args) 
	{
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	String name,surnam;
	name="guru";
	surnam="aoogty";
driver.findElement(By.id("u_0_l")).sendKeys(name);
driver.findElement(By.id("u_0_n")).sendKeys(surnam);
driver.findElement(By.id("u_0_q")).sendKeys("9700198135");
driver.findElement(By.id("u_0_x")).sendKeys("@@@@@@rjun");
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
//Sleeper.sleepTightInSeconds(5);
driver.findElement(By.id("u_0_c")).click();
driver.findElement(By.id("u_0_13")).click();
if (driver.findElement(By.tagName("a")).isDisplayed())
		{
	System.out.println("Faceook account created");	
} else 
{
	System.out.println("Faceook account not created");	
}
	}
}
