package dropdown;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class Dropdown3 {

	@Test
	public void selectDDvalues() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","/Users/kabbosmac/Desktop/qa/chromedriver");
    WebDriver driver=new ChromeDriver(); 		
	driver.get("https://www.facebook.com/reg/");
	driver.manage().window().maximize();
	WebElement month_dropdown=driver.findElement(By.id("month"));
	Select month_dd=new Select(month_dropdown);
	
	List<WebElement>month_list=month_dd.getOptions();
	int total_month=month_list.size();
	Assert.assertEquals(total_month, 12);
	
	System.out.println("Total month count is"+total_month);
	
	for(WebElement ele:month_list)
	{
		String month_name=ele.getText();
		System.out.println("Months are ===="+month_name);
		
		

	
	}


	}

	
	
}

