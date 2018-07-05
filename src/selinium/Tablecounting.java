package selinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tablecounting {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
		driver.findElement(By.xpath("//img[@src='images/emp_btn.jpg']")).click();
		WebElement emptable;
		emptable=driver.findElement(By.id("DGBanker"));
		List<WebElement> rows,cols;
		rows=emptable.findElements(By.tagName("tr"));
		//System.out.println("No of Rows:"+rows.size());
		for (int i = 0; i < rows.size()-1; i++) 
		{
		cols=rows.get(i).findElements(By.tagName("td"));
		String empid=cols.get(0).getText();
		String ename=cols.get(1).getText();
		System.out.println(empid+""+ename);
		}
		
	}

}
