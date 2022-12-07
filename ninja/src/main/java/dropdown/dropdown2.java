package dropdown;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown2 {
	@Test
	public void selectDDvalues() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","/Users/kabbosmac/Desktop/qa/chromedriver");
    WebDriver driver=new ChromeDriver(); 		
	driver.get("https://www.facebook.com/reg/");
	driver.manage().window().maximize();
	WebElement month_dropdown=driver.findElement(By.id("month"));
	Select month_dd=new Select(month_dropdown);
	
	WebElement selected_value=month_dd.getFirstSelectedOption();
	System.out.println("before Selection Selected Value is "+selected_value.getText());

	month_dd.selectByIndex(3);
	
	//it will select march
	
	WebElement selected_value1=month_dd.getFirstSelectedOption();
	System.out.println("After Selection Selected Value is "+selected_value1.getText());

	}



}
