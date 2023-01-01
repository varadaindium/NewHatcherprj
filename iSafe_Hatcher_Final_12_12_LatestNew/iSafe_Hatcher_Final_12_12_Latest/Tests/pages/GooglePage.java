package pages;
import iSAFE.ApplicationKeywords;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import baseClass.BaseClass;

public class GooglePage extends ApplicationKeywords
{	
	private static final String txt_SearchTextbox = "Search Textbox#xpath=//input[contains(@name,'q')]";
	private static final String lbl_SearchResultsPage = "Search Results Page#xpath=(//div[contains(@id,'rcnt')])[1]";
	private static final String lbl_IpAddess = "IP Address in Search Results Page#xpath=(//div[contains(@id,'rcnt')])[1]//span[contains(text(),'Your public IP address')]/parent::span/parent::div/preceding-sibling::div//span//span";

	public GooglePage(BaseClass obj) 
	{
		super(obj);
	}
	/**
	*This method is used to verify the display of google page.
	*
	*@author VijayaKumar.U
	*/
	public void verify_Google_Page_displayed()
	{
		try {
		waitForElementToDisplay(txt_SearchTextbox, this.elementLoadWaitTime);
		if(isElementDisplayed(txt_SearchTextbox))
		{
			testStepPassed("Google page is displayed");	
		}
		else
		{
			testStepFailed("Google page is not displayed");
		} 
	}
		catch (Exception e){
			testStepFailed("Failed to verify the page elementss."+e.getClass());
			}}
	
	/**
	*This method is used to get the IP Address.
	*
	*@author VijayaKumar.U
	*/
	public String get_MyIPAddress()
	{
		waitForElementToDisplay(txt_SearchTextbox, this.elementLoadWaitTime);
		clearEditBox(txt_SearchTextbox);
		typeIn(txt_SearchTextbox, "my ip address");
		driver.findElement(By.xpath("//input[contains(@name,'q')]")).sendKeys(Keys.ENTER);
		waitForElementToDisplay(lbl_SearchResultsPage, this.elementLoadWaitTime);
		String myPublicIpAddress = driver.findElement(By.xpath("(//div[contains(@id,'rcnt')])[1]//span[contains(text(),'Your public IP address')]/parent::span/parent::div/preceding-sibling::div//span//span")).getText();
		return myPublicIpAddress;
	}
}