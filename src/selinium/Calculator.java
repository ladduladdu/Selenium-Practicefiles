package selinium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calculator {

	public static void main(String[] args) {
	
	WebDriver driver=new FirefoxDriver();
	driver.get("http://calc.qedgetech.com/");
	 String v1,v2;
	 v1="100";
	 v2="200";
	 int expvalue=Integer.parseInt(v1) + Integer.parseInt(v2);
	  for(int i=0;i<v1.length();i++)
	 {
	 char value1=v1.charAt(i);
	 driver.findElement(By.xpath("//*[@value='"+value1+"']")).click(); 
	 }
     driver.findElement(By.xpath("//*[@value='+']")).click();
     
     	 for(int j=0;j<v1.length();j++)
     	 {
	 char value2=v2.charAt(j);
	 driver.findElement(By.xpath("//*[@value='"+value2+"']")).click();
     	 }
     	 
	 driver.findElement(By.xpath("//*[@value='=']")).click();
	
	 String temp=driver.findElement(By.name("display")).getAttribute("value");
     	
	 int actvalue=Integer.parseInt(temp);
	 if(expvalue==actvalue)
	 {
		 System.out.println("Addition test passs");
	 }
	 else
	 {
		 System.out.println("Addition test Fail");
		 driver.close();
	 }
	 }
	}
