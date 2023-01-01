package pages;
import iSAFE.ApplicationKeywords;
import baseClass.BaseClass;

public class MainPage extends ApplicationKeywords
{	
	private static final String btn_login = "Login Button#xpath=//nav[contains(@class,'navbar')]//a[contains(@href,'login')]";
	private static final String lnk_createAFund = "Create a Fund Quick Link#xpath=//a[contains(text(),'Create a fund')]";
	private static final String lnk_QuickLinks_FindInvestors = "Find Investors Quick Link#xpath=//a[contains(text(),'Find investors')]";
	private static final String lnk_QuickLinks_ScaleDealflow = "Scale Dealflow Quick Link#xpath=//a[contains(text(),'Scale dealflow')]";
	private static final String lnk_QuickLinks_ManagePortfolios = "Manage Portfolios Quick Link#xpath=//a[contains(text(),'Manage portfolios')]";
	private static final String lnk_QuickLinks_BuildaCVC = "Buils a CVC Quick Link#xpath=//a[contains(text(),'Build a CVC')]";


	public MainPage(BaseClass obj) 
	{
		super(obj);
	}
	/**
	 *This method is used to verify the main page elements display.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_MainPage_displayed()	{
		try 		{
			waitForElementToDisplay(btn_login, this.elementLoadWaitTime);
			if(isElementDisplayed(btn_login))			{
				testStepPassed("Main page is displayed");	
			}	
			else testStepFailed("Main page was not displayed");				
		} 
		catch (Exception e) 		{

			testStepFailed("Main page element is not displayed"+e.getClass());
			e.printStackTrace();
		}	}
	/**
	 *This method is used to click on login button
	 *
	 *@author VijayaKumar.U
	 */
	public void click_login_button()	{
		try {
			waitForElementToDisplay(btn_login, this.elementLoadWaitTime);
			clickOn(btn_login);
			testStepPassed("Navigated to the login form.");	
		}
		catch (Exception e) 		{

			testStepFailed("Could not display the login button."+e.getClass());
			e.printStackTrace();
		}	}
	/**
	 *This method is used to click and navigate to the create fund page.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_CreateaFund_QuickLink()	{
		try {
			waitForElementToDisplay(lnk_createAFund, this.elementLoadWaitTime);
			clickOn(lnk_createAFund);
			testStepPassed("Create Fund Link verified.");	
			
		}
		catch (Exception e) 		{
			e.printStackTrace();
			testStepFailed("Could not display the Quick Links ."+e.getClass());
		}	}
	/**
	 *This method is used to click find investor link.
	 *
	 *@author VijayaKumar.U
	 */
	
	public void click_FindInvestors_QuickLink()	{
		try {
			waitForElementToDisplay(lnk_QuickLinks_FindInvestors, this.elementLoadWaitTime);
			if(isElementDisplayed(lnk_QuickLinks_FindInvestors)) {
				clickOn(lnk_QuickLinks_FindInvestors);
				testStepPassed("Find investor link verified.");		
			}
			else {
				
				testStepFailed("Find investor is not displayed");
			}		}
		catch (Exception e) 		{
			e.printStackTrace(); //Newly Added
			testStepFailed("Could not verify the link."+e.getClass());
		}	}
	/**
	 *This method is used to click Scale deal flow link. 
	 *
	 *@author VijayaKumar.U
	 */
	
	public void click_ScaleDealflow_QuickLink()	{
		try {
			waitForElementToDisplay(lnk_QuickLinks_ScaleDealflow, this.elementLoadWaitTime);
			if(isElementDisplayed(lnk_QuickLinks_ScaleDealflow)) {
				clickOn(lnk_QuickLinks_ScaleDealflow);
				testStepPassed("Scale Deal flow Link verified.");	
			}
			else {
				testStepFailed("Scale Deal flow Link is not displayed.");

			}		}
		catch (Exception e) 		{
			testStepFailed("Could not verify the link."+e.getClass());
		}	}
	/**
	 *This method is used to click link in Manage Portfolios.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_ManagePortfolios_QuickLink()	{
		try {
			waitForElementToDisplay(lnk_QuickLinks_ManagePortfolios, this.elementLoadWaitTime);
			clickOn(lnk_QuickLinks_ManagePortfolios);
			testStepPassed("Manage Portfolio Link verified.");	
		}
		catch (Exception e) 		{
			testStepFailed("Could not verify the link."+e.getClass());
		}	}
	/**
	 *This method is used to click the link in BuildCVC.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_BuildaCVC_QuickLink()	{
		try {
			waitForElementToDisplay(lnk_QuickLinks_BuildaCVC, this.elementLoadWaitTime);
			clickOn(lnk_QuickLinks_BuildaCVC);
			testStepPassed("Buildcvc Link verified.");	
		}
		catch (Exception e) 		{
			testStepFailed("Could not verify the link."+e.getClass());
		}	}

}
