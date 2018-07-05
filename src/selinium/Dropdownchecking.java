package selinium;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class Dropdownchecking 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/");
		Select blist=new Select(driver.findElement(By.id("drlist")));
		List<WebElement> brlist=blist.getOptions();
		int brcount=brlist.size()-1;
		String expbranch,actbranch;
		expbranch="ameerpet";
		boolean brexist=false;
		for (int i = 0; i < brcount; i++)
		{
			actbranch=brlist.get(i).getText();
		if (expbranch.equalsIgnoreCase(actbranch))
		{
	brexist=true;
	break;
		}
	}	
		if (brexist)
		{
		System.out.println("Test Pass");
		}		
		else {
			System.out.println("Test Fail");
		}
		}
	}

