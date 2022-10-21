package QAclick8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UTTest {
	
	@Test
	
	public void startBrowser()
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://opensource-demo.orangehrmlive.com");
	
	Assert.assertTrue(driver.getTitle().contains("Orange"),"Tittle does not match");
	driver.quit();
	}

}
