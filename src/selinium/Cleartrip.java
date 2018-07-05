package selinium;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.server.browserlaunchers.Sleeper;
public class Cleartrip {
	public static void main(String[] args)
	{
 WebDriver driver=new FirefoxDriver();
 driver.manage().deleteAllCookies();
 driver.get("https://cleartrip.com/");
// Sleeper.sleepTightInSeconds(5);
 //driver.findElement(By.id("RoundTrip")).click();
/* driver.findElement(By.id("FromTag")).sendKeys("BAN");
 Sleeper.sleepTightInSeconds(5);
 List<WebElement> cities=driver.findElements(By.xpath("html/body/ul[1]/li/a"));
System.out.println(cities.size());
for (int i = 0; i <cities.size(); i++)
{
System.out.println(cities.get(i).getText());
}*/
 List<WebElement> radios;
 radios=driver.findElements(By.xpath("//Form/nav/ul/li/label"));
 System.out.println(radios.size());
 for (int i = 0; i <radios.size(); i++)
 {
 String radiotitle=radios.get(i).getAttribute("title");
 System.out.println(radiotitle);
 }
	}
}

	

