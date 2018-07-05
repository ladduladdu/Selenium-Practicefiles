package selinium;

import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CntingRowsInaTable {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://money.rediff.com/tools/forex");
		/*WebElement currenttable;
		currenttable=driver.findElement(By.className("dataTable"));
		List<WebElement> rows=currenttable.findElements(By.tagName("tr"));
		System.out.println(rows.size()-1);*/
		
		List<WebElement> rows=driver.findElement(By.className("dataTable")).findElements(By.tagName("tr"));
		System.out.println(rows.size()-1);
	}

}
