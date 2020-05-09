package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CartSummaryPage {
	
	
	WebDriver driver;
	
	public CartSummaryPage(WebDriver driver)
	{
		this.driver =  driver;
	}
	
	@FindBy(className = "page-heading")
	WebElement cartPageTitle;
	
	@FindBy(className = "ajax_cart_quantity")
	WebElement cartQuantity;
	
	@FindBy(xpath = "//*[text()='Proceed to checkout']")
	WebElement cartCheckOut;
	
	@FindBy(className = "page-heading")
	WebElement authenticatePageTitle;

	public String cartTitle() {
		
		String cartTitleText = cartPageTitle.getText();
		return cartTitleText;
	}
	
	public String cartQty() {
		
		String qtyText = cartQuantity.getText();
		return qtyText;
	}
	
	public void prcCheckOut() {
		
		cartCheckOut.click();
	}
	
	public String loginTitle() {
		
		String loginTitleText = authenticatePageTitle.getText();
		return loginTitleText;
	}
	
}
