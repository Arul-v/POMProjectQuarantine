package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.CartSummaryPage;
import pages.SiteHomePage;
import pages.SubCategoryPage;

public class OrderPlacement extends TestBase {
	
	@Test
	public void init() throws Exception{
		
		SiteHomePage homePageObj = PageFactory.initElements(driver, SiteHomePage.class);
		homePageObj.pageTitleText();
		homePageObj.selectCategory();
		
		SubCategoryPage subCatPageObj = PageFactory.initElements(driver, SubCategoryPage.class);
		subCatPageObj.sizeSelection();
		subCatPageObj.styleSelection();
		subCatPageObj.conditionSelection();
		subCatPageObj.addCartButtonClick();
		windowHandling();
		subCatPageObj.successMsg();
		subCatPageObj.checkOutButton();
		
		CartSummaryPage summaryPgObj = PageFactory.initElements(driver, CartSummaryPage.class);
		summaryPgObj.cartTitle();
		summaryPgObj.cartQty();
		if((summaryPgObj.cartQty()).equals("1"))
		System.out.println("Order Placed Successfully!");
		summaryPgObj.prcCheckOut();
		summaryPgObj.loginTitle();
		if((summaryPgObj.loginTitle()).equals("AUTHENTICATION"));
		System.out.println("Order Reaches Login Page.");
		
	}
	

}
