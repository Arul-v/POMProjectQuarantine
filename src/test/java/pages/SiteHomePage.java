package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SiteHomePage {
	
	WebDriver driver;

	public SiteHomePage(WebDriver driver)
	{
		this.driver = driver;	
	}
	
	@FindBy(className= "logo img-responsive")
	WebElement pageTitle;

	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[1]")
	WebElement WomenCategory;
	
	@FindBy(xpath =  "//*[@id='block_top_menu']/ul/li[1]/ul[1]/li[1]/ul[1]/li[1]")
	WebElement tShirtSelection;
	
	
//	@FindBy(how=How.CLASS_NAME, using = "logo img-responsive")
//	WebElement pageTitle;
//
//	@FindBy(how=How.XPATH, using = "//*[@id='block_top_menu']/ul/li[1]")
//	WebElement WomenCategory;
//	
//	@FindBy(how=How.XPATH, using = "//*[@id='block_top_menu']/ul/li[1]/ul[1]/li[1]/ul[1]/li[1]")
//	WebElement tShirtSelection;
	
	public String pageTitleText() {
		String pageTitleIs = pageTitle.getText();
		return pageTitleIs;
	}
	
	public void selectCategory() {
		
		Actions action = new Actions(driver);
		action.moveToElement(WomenCategory);
		action.moveToElement(tShirtSelection);
		action.click().build().perform();
	}
		
}
