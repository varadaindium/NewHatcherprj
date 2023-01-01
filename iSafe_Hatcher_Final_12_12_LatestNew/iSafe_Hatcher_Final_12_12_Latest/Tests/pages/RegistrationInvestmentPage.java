package pages;
import iSAFE.ApplicationKeywords;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import baseClass.BaseClass;

public class RegistrationInvestmentPage extends ApplicationKeywords
{	
	private static final String lbl_Investment = "Investment Heading#xpath=//div[contains(@class,'application-form')]//*[text()='Investment']";
	private static final String drp_InvestmentForm_Industries = "Industires Dropdown in Investment Form#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//span[contains(text(),'Industries')]/parent::label/parent::div/parent::div/parent::div//div[contains(@class,'multiselect__select')]";
	private static final String txt_InvestmentForm_Industries = "Industires Textbox in Investment Form#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//span[contains(text(),'Industries')]/parent::label/parent::div/parent::div/parent::div//input";
	private static final String drp_InvestmentForm_PreferredInvestmentStage = "Preferred Investment Stage Dropdown in Investment Form#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//span[contains(text(),'Preferred Investment Stage')]/parent::label/parent::div/parent::div/parent::div//div[contains(@class,'multiselect__select')]";
	private static final String txt_InvestmentForm_PreferredInvestmentStage = "Preferred Investment Stage Textbox in Investment Form#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//span[contains(text(),'Preferred Investment Stage')]/parent::label/parent::div/parent::div/parent::div//input";
	private static final String dragButton_InvestmentForm_InvestmentSize_From = "Investment Size From Drag Button in Investment Form#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//span[contains(text(),'Investment size')]/parent::label/parent::div//span[contains(@class,'irs-handle from')]";
	private static final String dragButton_InvestmentForm_InvestmentSize_To = "Investment Size To Drag Button in Investment Form#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//span[contains(text(),'Investment size')]/parent::label/parent::div//span[contains(@class,'irs-handle to')]";
	private static final String lbl_InvestmentForm_InvestmentSize_From_Amount = "Investment Size From Amount Label in Investment Form#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//span[contains(text(),'Investment size')]/parent::label/parent::div//span[contains(@class,'irs-from')]";
	private static final String lbl_InvestmentForm_InvestmentSize_To_Amount = "Investment Size To Amount Label in Investment Form#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//span[contains(text(),'Investment size')]/parent::label/parent::div//span[contains(@class,'irs-to')]";	
	private static final String btn_InvestmentForm_Back = "Back button in Investor Details Form#xpath=//div[contains(@class,'application-form')]//button[contains(text(),'Back')]";
	private static final String btn_InvestmentForm_Next = "Next button in Investment Form#xpath=//div[contains(@class,'application-form')]//button[contains(text(),'Next')]";
	
	private static final String lbl_InvestmentForm_Industries = "Industries Label in Investor Details Form#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//span[contains(text(),'Industries')]";
	private static final String lbl_InvestmentForm_PreferredInvestmentStage = "Preferred Investment Stage Label in Investor Details Form#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//span[contains(text(),'Preferred Investment Stage')]";
	private static final String lbl_InvestmentForm_InvestmentSize = "Investment Size Label in Investor Details Form#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//span[contains(text(),'Investment size')]";


	
	public RegistrationInvestmentPage(BaseClass obj) 
	{
		super(obj);
	}
	/**
	*This method is used to verify the display of the investment label in the registraion page.
	*
	*@author VijayaKumar.U
	*/
	//------------Edited by Priya.V added Else-part-enchanced catch block------//
	public void verify_Registration_Investment_displayed()
	{
		
		try 
		{
			waitForElementToDisplay(lbl_Investment, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_Investment))
			{
				testStepPassed("Registration Investment page is displayed");	
			}
			else {
				
				testStepFailed("Registration Investment page is not displayed");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Registration Investment page element is not displayed"+e.getClass());
		}
	}
	/**
	*This method is used to verify the display of the elements in the investment page.
	*
	*@author VijayaKumar.U
	*/
	
	public void verify_Investor_Registration_InvestmentPage_Elements_labels_displayed()
	{
		waitForElementToDisplay(lbl_Investment, this.elementLoadWaitTime);
		try 
		{
			if(isElementDisplayed(lbl_InvestmentForm_Industries))
			{
				testStepPassed("Industries Label is displayed");	
			}
			else {
				testStepFailed("Industries Label is not displayed");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Industries Label could not be verified."+e.getClass());
		}
		
		try 
		{
			if(isElementDisplayed(lbl_InvestmentForm_PreferredInvestmentStage))
			{
				testStepPassed("Preferred Investment Stage Label is displayed");	
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Preferred Investment Stage Label is not displayed");
		}
		
		try 
		{
			if(isElementDisplayed(lbl_InvestmentForm_InvestmentSize))
			{
				testStepPassed("Investment Size Label is displayed");	
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Investment Size Label is not displayed");
		}
	}
	/**
	*This method is used to verify the elements of the investment form.
	*
	*@author VijayaKumar.U
	*/
	public void verify_Investor_Registration_InvestmentPage_Elements_displayed()
	{
		waitForElementToDisplay(lbl_Investment, this.elementLoadWaitTime);
		try 
		{
			if(isElementDisplayed(drp_InvestmentForm_Industries))
			{
				testStepPassed("Industries Dropdown is displayed");	
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Industries Dropdown is not displayed");
		}
		
		try 
		{
			if(isElementDisplayed(drp_InvestmentForm_PreferredInvestmentStage))
			{
				testStepPassed("Preferred Investment Stage Dropdown is displayed");	
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Preferred Investment Stage Dropdown is not displayed");
		}
	}
	/**
	*This method is used to verify the display of the correct place holder of the registration-investment page. 
	*
	*@author VijayaKumar.U
	*/
	public void verify_Investor_Registration_InvestmentPage_Elements_PlaceHolderText_displayed()
	{
		waitForElementToDisplay(lbl_Investment, this.elementLoadWaitTime);
		try 
		{
			String placeholderText = driver.findElement(By.xpath("//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//span[contains(text(),'Industries')]/parent::label/parent::div/parent::div/parent::div//input")).getAttribute("placeholder");
			if(placeholderText.contains("Type or select industries from the list"))
			{
				testStepPassed("Correct Industries Placeholder text is displayed");	
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Correct Industries Placeholder text is not displayed");
		}
		
		try 
		{
			String placeholderText = driver.findElement(By.xpath("//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//span[contains(text(),'Preferred Investment Stage')]/parent::label/parent::div/parent::div/parent::div//input")).getAttribute("placeholder");
			if(placeholderText.contains("Type or select investment stage from the list"))
			{
				testStepPassed("Correct Preferred Investment Stage Placeholder text is displayed");	
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Correct Preferred Investment Stage Placeholder text is not displayed");
		}
	}
	/**
	*This method is used to select the industries in the dropdown. 
	*
	*@param industries
	*
	*@author VijayaKumar.U
	*/
	public void select_Industries(String industries)
	{
		waitForElementToDisplay(drp_InvestmentForm_Industries, this.elementLoadWaitTime);
		clickOn(drp_InvestmentForm_Industries);
		waitTime(1);
		typeIn(txt_InvestmentForm_Industries, industries);
		waitTime(1);
			
		List <WebElement> optlst = driver.findElements(By.xpath("//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//span[contains(text(),'Industries')]/parent::label/parent::div/parent::div/parent::div//div[contains(@class,'multiselect__content-wrapper')]//ul//li//span//span"));
		int optlstcount = optlst.size();
				
		for (WebElement opt : optlst) 
		{
			String text = opt.getText();
			
			if (text.equalsIgnoreCase(industries)) 
			{
				opt.click();
				break;
			}
		}
	}
	/**
	*This method is used to select the preferred investment stage.
	*
	*@author VijayaKumar.U
	*/
	public void select_PreferredInvestmentStage(String preferredInvestmentStage)
	{
		waitForElementToDisplay(drp_InvestmentForm_PreferredInvestmentStage, this.elementLoadWaitTime);
		clickOn(drp_InvestmentForm_PreferredInvestmentStage);
		waitTime(1);
		typeIn(txt_InvestmentForm_PreferredInvestmentStage, preferredInvestmentStage);
		waitTime(1);
		
		List <WebElement> optlst = driver.findElements(By.xpath("//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//span[contains(text(),'Preferred Investment Stage')]/parent::label/parent::div/parent::div/parent::div//div[contains(@class,'multiselect__content-wrapper')]//ul//li//span//span"));
		int optlstcount = optlst.size();
		for (WebElement opt : optlst) 
		{
			String text = opt.getText();
		
			if (text.equalsIgnoreCase(preferredInvestmentStage)) 
			{
				opt.click();
				break;
			}
		}
	}
	/**
	*This method is used to click back in investment form.
	*
	*@author VijayaKumar.U
	*/
	public void click_Back_button()
	{
		waitForElementToDisplay(btn_InvestmentForm_Back, this.elementLoadWaitTime);
		clickOn(btn_InvestmentForm_Back);
	}
	/**
	*This method is used to click the next button
	*
	*@author VijayaKumar.U
	*/
	public void click_Next_button()
	{
		waitForElementToDisplay(btn_InvestmentForm_Next, this.elementLoadWaitTime);
		clickOn(btn_InvestmentForm_Next);
	}
	/**
	*This method is used to fill investment form .
	*
	*@param industries
	*@param preferredInvestmentStage
	*
	*@author VijayaKumar.U
	*/
	public void fillInvestmentForm(String industries, String preferredInvestmentStage)
	{
		select_Industries(industries);
		select_PreferredInvestmentStage(preferredInvestmentStage);
	}
	/**
	*This method is used to click next in the investment form.
	*
	*@author VijayaKumar.U
	*/
	public void click_Next_InvestmentForm()
	{
		//scrollToNextInvestmentRegistration();
		clickOn("Application Form#xpath=(//div[contains(@class,'application-form-container')])[1]");
        
        pressPageDown();
		click_Next_button();
	}
	/**
	*This method is used to click the back button investment form.
	*
	*@author VijayaKumar.U
	*/
	public void click_Back_InvestmentForm()
	{
		
		scrollToBackInvestmentRegistration();
		click_Back_button();
	}
}