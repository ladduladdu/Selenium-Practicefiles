package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Arjuncalender {

	public static void main(String[] args) {	
		String dof="15/01/2019"; 
		String [] temp=dof.split("/");
		String dt,mon,year;
		dt=temp[0];		
		mon=temp[1];
		year=temp[2];
		WebDriver driver=new FirefoxDriver();
	driver.manage().deleteAllCookies();
		driver.get("http://cleartrip.com");
		driver.findElement(By.id("DepartDate")).click();
		String calyear;
		calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		while (calyear.equals(year))
				{
			driver.findElement(By.className("nextMonth")).click();
			//driver.findElement(By.className("ui-datepicker-year")).getText();
		}
		/*String calmon;
		calmon=driver.findElement(By.className("ui-datepicker-month")).getText();
		while (!calmon.equalsIgnoreCase(mon))
		{
	driver.findElement(By.className("nextMonth")).click();
	driver.findElement(By.className("ui-datepicker-month")).getText();
		}*/
	}

}
