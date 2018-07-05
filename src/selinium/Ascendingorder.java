package selinium;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class Ascendingorder {
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Arjun/Desktop/Ascending.html");
		WebElement lelement;
		lelement=driver.findElement(By.id("demo"));
		Select demolist=new Select(lelement);
		List<WebElement> dlist=demolist.getOptions();
		
		String str1,str2;
		boolean ordered=true;
		for (int i = 1; i < dlist.size(); i++) 
		{
		str1=dlist.get(i-1).getText();
		str2=dlist.get(i).getText();
		if(str2.compareTo(str1)<0)
		{
			ordered=false;
			break;
		}
		}
		if (ordered)
		{
		System.out.println("Values are in order test pass");	
		} else 
		{
			System.out.println("Values are not in order test Fail");	
		}
	}

}
