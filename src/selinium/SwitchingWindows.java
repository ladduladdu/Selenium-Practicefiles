package selinium;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class SwitchingWindows {
public static void main(String[] args) {
WebDriver driver=new FirefoxDriver();
driver.get("https://naukri.com/");
driver.findElement(By.xpath("//div[2]/div/ul/li[3]/a")).click();
Set<String> allWindows=driver.getWindowHandles();
Object[] windows=allWindows.toArray();
String window1=windows[0].toString();
String window2=windows[1].toString();
String window3=windows[2].toString();
System.out.println(window1);
System.out.println(window2);
System.out.println(window3);
System.out.println(driver.getTitle());
driver.switchTo().window(window3);
driver.findElement(By.linkText("Aegis Jobs")).click();
System.out.println(driver.getTitle());
driver.switchTo().window(window2);
System.out.println(driver.getTitle());
driver.switchTo().window(window1);
System.out.println(driver.getTitle());
driver.switchTo().window(window2);
driver.close();
driver.quit();
	}

}
