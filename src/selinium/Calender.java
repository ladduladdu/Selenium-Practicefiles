package selinium;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.server.browserlaunchers.Sleeper;
public class Calender {
	public static void main(String[] args) {	
		String dof="9/July/2019";
		String [] temp=dof.split("/");
		String dt,month,year;
		dt=temp[0];		
		month=temp[1];
		year=temp[2];		
		WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://cleartrip.com");
		driver.findElement(By.id("DepartDate")).click();
	//	Sleeper.sleepTightInSeconds(5);
		String calyear;
		calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		while (!calyear.equals(year))
				{
			driver.findElement(By.className("nextMonth")).click();
			calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		}
		String calmon;
		calmon=driver.findElement(By.className("ui-datepicker-month")).getText();
		while (!calmon.equalsIgnoreCase(month))
		{
	driver.findElement(By.className("nextMonth")).click();
	calmon=driver.findElement(By.className("ui-datepicker-month")).getText();
		}
	WebElement cal;
	cal=driver.findElement(By.className("calendar"));
	List<WebElement> rows,cols;
	String caldt;
	rows=cal.findElements(By.tagName("tr"));
	boolean flag=false;
	for (int i = 1; i < rows.size(); i++) 
	{
	cols=rows.get(i).findElements(By.tagName("td"));
	for (int j = 0; j < cols.size(); j++) 
	{
	caldt=cols.get(j).getText();
	
	System.out.println(caldt);
	if (caldt.equals(dt))
	{
	cols.get(j).click();
	flag=true;
    break;
	}
	}
	if (flag) 
	{
	break;	
	}
	}
	}
    }
