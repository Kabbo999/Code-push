package yamaha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class r6 {

	public static void main(String[] args) {
		
	    System.setProperty("webdriver.chrome.driver","/Users/kabbosmac/Desktop/qa/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		//System.out.println(driver.getTitle());

	}

}
