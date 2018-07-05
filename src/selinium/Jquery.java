package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Jquery {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		WebElement srcelement,tgtelement;
		srcelement =driver.findElement(By.id("draggable"));
		tgtelement =driver.findElement(By.id("droppable"));
		Actions act=new Actions(driver);
		act.dragAndDrop(srcelement, tgtelement);
		act.build().perform();
	}

}
