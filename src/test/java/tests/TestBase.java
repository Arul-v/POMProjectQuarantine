package tests;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/*
1. Launch URL
2. Get the title of the page
3. Select women category
4. Choose T-shirts in women sub menu
5. In catalog - > Select size, styles and condition
6. Then add to CArt and verify the item in cart
*/
public class TestBase {
	
	public static WebDriver driver =  null;
	
	@BeforeTest
	public void initialize() throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "c:\\Automation\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.automationpractice.com/");
		driver.getTitle();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	public void windowHandling() throws Exception{
		
		String mainWindow = driver.getWindowHandle();
		Set<String> set = driver.getWindowHandles();
		Iterator<String> itr = set.iterator();
		while(itr.hasNext())
		{
			String childWindow = itr.next();
			if(!(mainWindow.equals(childWindow)))
			{
				driver.switchTo().window(childWindow);
			}
		}
		
	}
	
	@AfterTest
	public void closeApp()
	{
		
		driver.quit();
		
		
	}

}
