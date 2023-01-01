package pages;
import iSAFE.ApplicationKeywords;


import org.openqa.selenium.By;

import baseClass.BaseClass;

public class CreatePasswordPage extends ApplicationKeywords
{	
	private static final String lbl_CreatePassword = "Create Password#xpath=//div[contains(@class,'application-form')]//*[text()='Create your password']";
	private static final String txt_CreatePassword_Password = "Password Textbox in Create Password Page#xpath=//div[contains(@class,'application-form')]//input[@name='password']";
	private static final String txt_CreatePassword_ConfirmPassword = "Confirm Password Textbox in Create Password Page#xpath=//div[contains(@class,'application-form')]//input[@name='password_confirmation']";
	private static final String btn_CreatePassword_CreatePassword = "Create Password Button in Create Password Page#xpath=//div[contains(@class,'application-form')]//button[contains(text(),'Create Password')]";
	private static final String lbl_CreatePassword_CreatePassword_MadatorySymbol = "Create Password Mandatory Symbol#xpath=//div[contains(@class,'application-form')]//label[contains(text(),'Password*')]";
	private static final String lbl_CreatePassword_CreatePassword_ConfirmPassword_MandatorySymbol = "Create Confirm Password Mandatory Symbol#xpath=//div[contains(@class,'application-form')]//label[contains(text(),'Confirm Password*')]";
	private static final String lnk_CreatePassword_Password_ShowIcon = "Create Password Textbox Show Icon#xpath=//div[contains(@class,'application-form')]//input[@name='password']/parent::div//following-sibling::span//img";
	private static final String lnk_CreatePassword_ConfirmPassword_ShowIcon = "Create Confirm Password Textbox Show Icon#xpath=//div[contains(@class,'application-form')]//input[@name='password_confirmation']/parent::div//following-sibling::span//img";
	private static final String lbl_CreatePassword_Password_InsufficientCharacter_ErrorMessage = "Create Password Password Textbox Insufficient text error message#xpath=//div[contains(@class,'application-form')]//input[@name='password']/parent::div/parent::div/following-sibling::div[contains(@class,'row')]//span[contains(text(),'Password should be min. 8 and max. 20 characters')]";
	private static final String lnk_CreatePassword_ConfirmPassword_Password_NotMatch_ErrorMessage = "Create Confirm Password Not Match error message#xpath=//div[contains(@class,'application-form')]//input[@name='password_confirmation']/parent::div/parent::div/following-sibling::div[contains(@class,'row')]//span[contains(text(),'Please check your input. The passwords did not match.')]";
	
	public CreatePasswordPage(BaseClass obj) 
	{
		super(obj);
	}
	/**
	*This method is used to create password .
	*
	*@author VijayaKumar.U
	*/
	public void verify_CreatePassword_Page_displayed(){
				try 		{
			waitForElementToDisplay(lbl_CreatePassword, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_CreatePassword))			{
				testStepPassed("Create Password page is displayed");	
			}	
			else
				{
				testStepFailed("Create Password page is not displayed");	
				}} 
		catch (Exception e) 		{
			testStepFailed("Create Password page is not displayed");
		}	}
	/**
	*This method is used to enter the password.
	*
	*@author VijayaKumar.U
	*/
	public void enter_Password(String password)	{
		waitForElementToDisplay(txt_CreatePassword_Password, this.elementLoadWaitTime);
		clearEditBox(txt_CreatePassword_Password);
		typeIn(txt_CreatePassword_Password, password);
	}
	/**
	*This method is used to enter the confirmed password.
	*
	*@author VijayaKumar.U
	*/
	public void enter_ConfirmPassword(String confirmPassword)	{
		waitForElementToDisplay(txt_CreatePassword_ConfirmPassword, this.elementLoadWaitTime);
		clearEditBox(txt_CreatePassword_ConfirmPassword);
		typeIn(txt_CreatePassword_ConfirmPassword, confirmPassword);
	}
	/**
	*This method is used to click the create password button.
	*
	*@author VijayaKumar.U
	*/	
	public void click_CreatePassword_button()	{
		waitForElementToDisplay(btn_CreatePassword_CreatePassword, this.elementLoadWaitTime);
		clickOn(btn_CreatePassword_CreatePassword);
	}
	/**
	*This method is used to create password icon.
	*
	*@author VijayaKumar.U
	*/
	public void click_CreatePassword_ShowIcon()	{
		waitForElementToDisplay(lnk_CreatePassword_Password_ShowIcon, this.elementLoadWaitTime);
		clickOn(lnk_CreatePassword_Password_ShowIcon);
	}
	/**
	*This method is used to click on the confirm password icon.
	*
	*@author VijayaKumar.U
	*/
	public void click_CreateConfirmPassword_ShowIcon()	{
		waitForElementToDisplay(lnk_CreatePassword_ConfirmPassword_ShowIcon, this.elementLoadWaitTime);
		clickOn(lnk_CreatePassword_ConfirmPassword_ShowIcon);
	}
	/**
	*This method is used to fill the password form
	*
	*@param password , confirm password.
	*@author VijayaKumar.U
	*/
	public void fillPasswordForm(String password, String confirmPassword)	{
		enter_Password(password);
		enter_ConfirmPassword(confirmPassword);
	}
	/**
	*This method is used to switch to create password page.
	*
	*@author VijayaKumar.U
	*/
	public void click_CreatePassword_CreatePasswordPage()	{
		click_CreatePassword_button();
	}
	/**
	*This method is used to click on show icon of password textbox.
	*
	*@author VijayaKumar.U
	*/
	public void click_ShowIcon_CreatePasswordTextbox_CreatePasswordPage()	{
		click_CreatePassword_ShowIcon();
	}
	/**
	*This method is used to click the confirm password text.
	*
	*@author VijayaKumar.U
	*/
	public void click_ShowIcon_CreateConfirmPasswordTextbox_CreatePasswordPage()	{
		click_CreateConfirmPassword_ShowIcon();
	}
	/**
	*This method is used to verify the placeholder text displayed in the password element.
	*
	*@author VijayaKumar.U
	*/
	public void verify_CreatePassword_elements_placeholderText_displayed()	{
		try 		{
			waitForElementToDisplay(txt_CreatePassword_Password, this.elementLoadWaitTime);
			String passwordPlaceholdertext = driver.findElement(By.xpath("//div[contains(@class,'application-form')]//input[@name='password']")).getAttribute("placeholder"); 
			if (passwordPlaceholdertext.equalsIgnoreCase("Enter Password")) 			{
				testStepPassed("Create Password place holder text is displayed in Create Password Page");
			}		
			else{
				testStepFailed("Create Password place holder text is not displayed in Create Password Page");
			}} 
		catch (Exception e) 		{
			testStepFailed("Create Password place holder text is not displayed in Create Password Page");
		}
		
		try 		{
			waitForElementToDisplay(txt_CreatePassword_ConfirmPassword, this.elementLoadWaitTime);
			String confirmPasswordPlaceholdertext = driver.findElement(By.xpath("//div[contains(@class,'application-form')]//input[@name='password_confirmation']")).getAttribute("placeholder"); 
			if (confirmPasswordPlaceholdertext.equalsIgnoreCase("Confirm Password")) 			{
				testStepPassed("Create Confirm Password place holder text is displayed in Create Password Page");
			}		
			else {
				testStepPassed("Create Confirm Password place holder text is not displayed in Create Password Page");
			}
				
		} 
		catch (Exception e) 		{
			testStepFailed("Create Confirm Password place holder text is not displayed in Create Password Page");
		}	}
	/**
	*This method is used to verify the display of mandatory symbol in password box. 
	*
	*@author VijayaKumar.U
	*/
	public void verify_CreatePassword_elements_MandatorySymbol_displayed()	{
		try 		{
			waitForElementToDisplay(lbl_CreatePassword_CreatePassword_MadatorySymbol, this.elementLoadWaitTime);
			if (isElementDisplayed(lbl_CreatePassword_CreatePassword_MadatorySymbol)) 			{
				testStepPassed("Password Mandatory Symbol is displayed in Create Password Page");
			}		
			else{
				testStepFailed("Password Mandatory Symbol is not displayed in Create Password Page");
			}} 
		catch (Exception e) 		{
			testStepFailed("Password Mandatory Symbol is not displayed in Create Password Page");
		}

		try 		{
			waitForElementToDisplay(lbl_CreatePassword_CreatePassword_ConfirmPassword_MandatorySymbol, this.elementLoadWaitTime);
			if (isElementDisplayed(lbl_CreatePassword_CreatePassword_ConfirmPassword_MandatorySymbol)) 			{
				testStepPassed("Confirm Password Mandatory Symbol is displayed in Create Password Page");
			}		
			else {
				testStepFailed("Confirm Password Mandatory Symbol is not displayed in Create Password Page");
			}	
		} 
		catch (Exception e) 		{
			testStepFailed("Confirm Password Mandatory Symbol is not displayed in Create Password Page");
		}	}
	/**
	*This method is used to verify th functionality of the password icon.
	*
	*@author VijayaKumar.U
	*/
	public void verify_CreatePassword_PasswordIcon_functionality()	{
		try {
			waitForElementToDisplay(lnk_CreatePassword_Password_ShowIcon, this.elementLoadWaitTime);
			String passwordTextboxType = driver.findElement(By.xpath("//div[contains(@class,'application-form')]//input[@name='password']")).getAttribute("type");
				try {
				if (passwordTextboxType.equalsIgnoreCase("password"))	{
					testStepPassed("Password textbox type is password");
					click_ShowIcon_CreatePasswordTextbox_CreatePasswordPage();
					waitTime(1);
					String passwordTextboxType2 = driver.findElement(By.xpath("//div[contains(@class,'application-form')]//input[@name='password']")).getAttribute("type");
					
					try 					{
						if (passwordTextboxType2.equalsIgnoreCase("text")) 						{
							testStepPassed("Password textbox type is text");
						}				else {
							testStepFailed("Password is not valid.");
						}	} 
					catch (Exception e) 					{
						testStepFailed("Password textbox type is not text");
					}		}		} 
			catch (Exception e) {
				testStepFailed("Password textbox type is not password");
			}		} 
		catch (Exception e) 		{
			testStepFailed("Password Mandatory Symbol is not displayed in Create Password Page");
		}

		try {
			waitForElementToDisplay(lnk_CreatePassword_ConfirmPassword_ShowIcon, this.elementLoadWaitTime);
			
			String passwordTextboxType = driver.findElement(By.xpath("//div[contains(@class,'application-form')]//input[@name='password_confirmation']")).getAttribute("type");
			
			try 	{
				if (passwordTextboxType.equalsIgnoreCase("password")) 		{
					testStepPassed("Password textbox type is password");
					
					click_ShowIcon_CreateConfirmPasswordTextbox_CreatePasswordPage();
					
					waitTime(1);
					
					String passwordTextboxType2 = driver.findElement(By.xpath("//div[contains(@class,'application-form')]//input[@name='password_confirmation']")).getAttribute("type");
					
					try {
						if (passwordTextboxType2.equalsIgnoreCase("text")) 	{
							testStepPassed("Password textbox type is text");
						}	else {
							testStepFailed("Password textbox type is not text");
						}	} 
					catch (Exception e) {
						testStepFailed("Password type is invalid"+e.getClass());e.printStackTrace();
					}		}	} 
			catch (Exception e) {
				testStepFailed("Password textbox type is not password");e.printStackTrace();
			}	} 
		catch (Exception e) {
			testStepFailed("Password Mandatory Symbol is not displayed in Create Password Page");e.printStackTrace();
		}}
	/**
	*This method is used to verify the password insufficient error message.
	*
	*@author VijayaKumar.U
	*/
	public void verify_PasswordTextboxInSufficientErrorMessage_CreatePassword_displayed(){
		try 	{
			waitForElementToDisplay(lbl_CreatePassword_Password_InsufficientCharacter_ErrorMessage, this.elementLoadWaitTime);
			if (isElementDisplayed(lbl_CreatePassword_Password_InsufficientCharacter_ErrorMessage)) 	{
				testStepPassed("Password textbox insufficient character error message is displayed in Create Password Page");
			}		
			else{
				testStepFailed("Password textbox insufficient character error message is not displayed in Create Password Page");
			}} 
		catch (Exception e) 	{
			testStepFailed("Password textbox has error."+e.getClass());e.printStackTrace();
		}	}
	/**
	*This method is used to verify the error message for the password mismatch.
	*
	*@author VijayaKumar.U
	*/
	public void verify_ConfirmPasswordTextboxNotMatchErrorMessage_CreatePassword_displayed()	{
		try 		{
			waitForElementToDisplay(lnk_CreatePassword_ConfirmPassword_Password_NotMatch_ErrorMessage, this.elementLoadWaitTime);
			if (isElementDisplayed(lnk_CreatePassword_ConfirmPassword_Password_NotMatch_ErrorMessage)) 			{
				testStepPassed("Confirm Password text is not matching with password text error message is displayed in Create Password Page");
			}		
			else{
				
				testStepFailed("Confirm Password text is not matching with password text error message is not displayed in Create Password Page");
			}} 
		catch (Exception e) 		{
			testStepFailed("Confirm Password text is not valid"+e.getClass());e.printStackTrace();
		}
	}
	
}