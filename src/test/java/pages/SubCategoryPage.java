package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.Iterator;
import java.util.Set;

public class SubCategoryPage {
	
	
	WebDriver driver;
	
	public SubCategoryPage(WebDriver driver)
	{
		
		this.driver = driver;
	}
	
	@FindBy(name = "layered_id_attribute_group_3")
	WebElement size;
	
	@FindBy(name = "layered_id_feature_11")
	WebElement style;
	
	@FindBy(name = "layered_condition_new")
	WebElement condition;
	
//	@FindBy(how=How.XPATH, using = "//img[@src='http://automationpractice.com/img/p/1/1-home_default.jpg']")
//	WebElement imageLink;
	
	@FindBy(xpath = "//div[@class='right-block']/div[2]/a[@class='button ajax_add_to_cart_button btn btn-default']")
	WebElement addCartButton;
	
	@FindBy(xpath = "//*[text()='Product successfully added to your shopping cart']")
	WebElement successMessage;
	
	@FindBy(xpath = "//*[text()='Proceed to checkout']")
	WebElement checkOutButton;
	
	public void sizeSelection(){
		size.click();
	}

	public void styleSelection(){
		style.click();
	}
	
	public void conditionSelection(){
		condition.click();
	}

	public void addCartButtonClick(){
		addCartButton.click();
	}
	
	public String successMsg(){
		String successMsgText = successMessage.getText();
		return successMsgText;
	}
	
	public void checkOutButton(){
		checkOutButton.click();
	}


	
	

}
