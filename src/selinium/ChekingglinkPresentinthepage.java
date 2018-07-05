package selinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChekingglinkPresentinthepage {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		String expresult,actresult;
		expresult="Gmail";
		boolean resultexist=false;
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for (int i = 0; i < links.size(); i++) 
		{
		actresult=links.get(i).getText();
		if(expresult.equalsIgnoreCase(actresult))
		{
		resultexist=true;
		break;
		}
		}
	if (resultexist)
	{
	System.out.println(expresult+" link is present test pass");	
	}
	else
	{
		System.out.println(expresult+" link is not  present test Fail");	
	}
		}
}
