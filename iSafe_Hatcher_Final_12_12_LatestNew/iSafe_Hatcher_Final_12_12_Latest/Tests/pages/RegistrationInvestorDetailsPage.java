package pages;
import iSAFE.ApplicationKeywords;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import baseClass.BaseClass;

public class RegistrationInvestorDetailsPage extends ApplicationKeywords
{	
	private static final String lbl_InvestorDetailsForm = "Investor Details Heading#xpath=//*[text()='Investor Details']";
	private static final String drp_InvestorDetailsForm_Salutation = "Salutation Dropdown in Investor Details Form#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-investor')]//span[contains(text(),'Salutation')]/parent::label/parent::div//div[contains(@class,'multiselect__select')]";
	private static final String txt_InvestorDetailsForm_Salutation = "Salutation Textbox in Investor Details Form#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-investor')]//span[contains(text(),'Salutation')]/parent::label/parent::div//input";
	private static final String txt_InvestorDetailsForm_JobTitle = "Job Title Textbox in Investor Details Form#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-investor')]//span[contains(text(),'Job title')]/parent::label/parent::div//input";
	private static final String txt_InvestorDetailsForm_MobileNumber = "Mobile Number Investor Details in Company Form#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-investor')]//span[contains(text(),'Mobile number')]/parent::label/parent::div//input[contains(@placeholder,'Enter a phone number')]";
	private static final String drp_InvestorDetailsForm_InvestorType = "Investor Type Dropdown in Investor Details Form#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-investor')]//span[contains(text(),'Investor type')]/parent::label/parent::div//div[contains(@class,'multiselect__select')]";
	private static final String txt_InvestorDetailsForm_InvestorType = "Investor Type Textbox in Investor Details Form#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-investor')]//span[contains(text(),'Investor type')]/parent::label/parent::div//input";
	private static final String btn_InvestorDetailsForm_Back = "Back button in Investor Details Form#xpath=//div[contains(@class,'application-form')]//button[contains(text(),'Back')]";
	private static final String btn_InvestorDetailsForm_Next = "Next button in Investor Details Form#xpath=//div[contains(@class,'application-form')]//button[contains(text(),'Next')]";

	private static final String lbl_InvestorType_Invalid_ErrorMessage = "Invalid Investor Type Error Message is displayed in Investor Details Form#xpath=//span[contains(text(),'Investor type')]/parent::label/parent::div//div[contains(@class,'multiselect__content-wrapper')]//ul[contains(@class,'multiselect__content')]//li//span[contains(@class,'multiselect__option')]//span[contains(text(),'No results found. Consider changing the search query')]";
	private static final String lbl_Salutation_Invalid_ErrorMessage = "Invalid Salutation Error Message is displayed in Investor Details Form#xpath=//span[contains(text(),'Salutation')]/parent::label/parent::div//div[contains(@class,'multiselect__content-wrapper')]//ul[contains(@class,'multiselect__content')]//li//span[contains(@class,'multiselect__option')]//span[contains(text(),'No results found. Consider changing the search query')]";

	private static final String lbl_InvestorDetailsForm_Salutation = "Salutation Label in Investor Details Form#xpath=//span[contains(text(),'Salutation')]";
	private static final String lbl_InvestorDetailsForm_JobTitle = "Job Title Label in Investor Details Form#xpath=//span[contains(text(),'Job title')]";
	private static final String lbl_InvestorDetailsForm_MobileNumber = "Mobile Number Label in Investor Details Form#xpath=//span[contains(text(),'Mobile number')]";
	private static final String lbl_InvestorDetailsForm_InvestorType = "Investor Type Label in Investor Details Form#xpath=//span[contains(text(),'Investor type')]";

	private static final String lst_InvestorDetailsForm_Salutation_OptionsList = "Options List of Salutation Dropdown in Investor Details Form#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-investor')]//span[contains(text(),'Salutation')]/parent::label/parent::div//div[contains(@class,'multiselect__select')]/following-sibling::div[contains(@class,'multiselect__content-wrapper')]//ul[contains(@class,'multiselect__content')]";


	public RegistrationInvestorDetailsPage(BaseClass obj) 
	{
		super(obj);
	}
	/**
	 *This method is used to verify display of the investor details in the form.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_Registration_InvestorDetailsForm_displayed()
	{

		try 
		{
			waitForElementToDisplay(lbl_InvestorDetailsForm, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_InvestorDetailsForm))
			{
				testStepPassed("Registration Investor Details page is displayed");	
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Registration Investor Details page is not displayed");
		}
	}
	/**
	 *This method is used to verify the elements in label displayed in the investor details page.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_Investor_Registration_InvestorDetailsPage_Elements_labels_displayed()
	{
	}
	/**
	 *This method is used to verify the display of elements in investor details page.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_Investor_Registration_InvestorDetailsPage_Elements_displayed()
	{
		try {
			String[] allInvestorLabelsElements = {lbl_InvestorDetailsForm_Salutation,lbl_InvestorDetailsForm_JobTitle,lbl_InvestorDetailsForm_MobileNumber,lbl_InvestorDetailsForm_InvestorType};
			for (String elementTobeVerified : allInvestorLabelsElements) {
				if (isElementDisplayed(elementTobeVerified)) {
					testStepPassed(elementTobeVerified.split("#xpath")[0] + " was displayed on the CompanyPage");
				} else {
					testStepFailed(elementTobeVerified.split("#xpath")[0] + " was not displayed on the CompanyPage");
				}	

			} }
		catch (Exception e) {
			testStepFailed("CompanyPage label elements could not be verified");
			e.printStackTrace();
		}
	}
	/**
	 *This method is used to verify the placeholder elements in the job title.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_Investor_Registration_InvestorDetailsPage_Elements_PlaceHolderText_displayed()
	{
		waitForElementToDisplay(lbl_InvestorDetailsForm, this.elementLoadWaitTime);
		try 
		{
			String placeholderText = driver.findElement(By.xpath("//div[contains(@class,'application-form')]//div[contains(@id,'tab-investor')]//span[contains(text(),'Job title')]/parent::label/parent::div//input")).getAttribute("placeholder");
			if(placeholderText.contains("e.g. CEO"))
			{
				testStepPassed("Correct Job Title Placeholder text is displayed");	
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Correct Job Title Placeholder text is not displayed");
		}

		try 
		{
			String placeholderText = driver.findElement(By.xpath("//div[contains(@class,'application-form')]//div[contains(@id,'tab-investor')]//span[contains(text(),'Mobile number')]/parent::label/parent::div//input[contains(@type,'tel')]")).getAttribute("placeholder");
			if(placeholderText.contains("e.g. https://www.mywebsite.com"))
			{
				testStepPassed("Correct Mobile Number Placeholder text is displayed");	
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Correct Mobile Number Placeholder text is not displayed");
		}
	}
	/**
	 *This method is used to select the salutation in investor details in form.
	 *@param salutation
	 *
	 *@author VijayaKumar.U
	 */
	/*public void select_Salutation(String salutation)
	{
		System.out.println("STARTT"+this.testFailure);
		try {
			waitForElementToDisplay(drp_InvestorDetailsForm_Salutation, this.elementLoadWaitTime);
			clickOn(drp_InvestorDetailsForm_Salutation);
			waitTime(1);
			typeIn(txt_InvestorDetailsForm_Salutation, salutation);
			waitTime(1);
//			 String press = Keys.chord(Keys.ENTER);
//			driver.findElement(By.xpath("//span[contains(text(),'Salutation')]/parent::label/parent::div//input")).sendKeys(press);
//			

			List <WebElement> optlst =	findWebElements("salution#xpath=//li[@class='multiselect__element']//span[@class='multiselect__option']");
		//	List <WebElement> optlst = driver.findElements(By.xpath("//div[contains(@class,'application-form')]//div[contains(@id,'tab-founder')]//span[contains(text(),'Salutation')]/parent::label/parent::div//div[contains(@class,'multiselect__content-wrapper')]//ul//li//span//span"));
			int optlstcount = optlst.size();

			for (WebElement opt : optlst) 
			{
				String text = opt.getText();

				if (text.equalsIgnoreCase(salutation)) 
				{
					opt.click();
					break;
				}
			}

//			waitForElementToDisplay(drp_InvestorDetailsForm_Salutation, this.elementLoadWaitTime);
//			clickOn(drp_InvestorDetailsForm_Salutation);
//			waitTime(1);
//			typeIn(txt_InvestorDetailsForm_Salutation, salutation);
//			waitTime(1);
////findWebElements(salutation)
//			List <WebElement> optlst2 = driver.findElements(By.xpath("//div[contains(@class,'application-form')]//div[contains(@id,'tab-founder')]//span[contains(text(),'Salutation')]/parent::label/parent::div//div[contains(@class,'multiselect__content-wrapper')]//ul//li//span//span"));
//			int optlstcount2 = optlst2.size();
//
//			for (WebElement opt2 : optlst2) 
//			{
//				String text2 = opt2.getText();
//				if (text2.equalsIgnoreCase(salutation)) 
//				{
//					opt2.click();
//					break;
//				}
//			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Correct Mobile Number Placeholder text is not displayed"+e.getClass());
		}
		System.out.println("ENDDD" +this.testFailure);
	}//li[@class='multiselect__element']//span[@class='multiselect__option']
	/**
	 *This method is used to enter the job title.
	 *@param job title
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_JobTitle(String jobTitle)
	{
		waitForElementToDisplay(txt_InvestorDetailsForm_JobTitle, this.elementLoadWaitTime);
		typeIn(txt_InvestorDetailsForm_JobTitle, jobTitle);
	}
	/**
	 *This method is used to enter the mobile number.
	 *@param mobileNumber
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_MobileNumber(String mobileNumber)
	{
		waitForElementToDisplay(txt_InvestorDetailsForm_MobileNumber, this.elementLoadWaitTime);
		typeIn(txt_InvestorDetailsForm_MobileNumber, mobileNumber);
	}
	/**
	 *This method is used to select the investor Type
	 *
	 *@param investorType
	 *
	 *@author VijayaKumar.U
	 */
	public void select_InvestorType(String investorType)
	{
		waitForElementToDisplay(drp_InvestorDetailsForm_InvestorType, this.elementLoadWaitTime);
		clickOn(drp_InvestorDetailsForm_InvestorType);
		waitTime(1);
		typeIn(txt_InvestorDetailsForm_InvestorType, investorType);
		waitTime(1);

		List <WebElement> optlst = driver.findElements(By.xpath("//div[contains(@class,'application-form')]//div[contains(@id,'tab-investor')]//span[contains(text(),'Investor type')]/parent::label/parent::div//div[contains(@class,'multiselect__content-wrapper')]//ul//li//span//span"));
		int optlstcount = optlst.size();

		for (WebElement opt : optlst) 
		{
			String text = opt.getText();

			if (text.equalsIgnoreCase(investorType)) 
			{
				opt.click();
				break;
			}
		}
	}
	/**
	 *This method is used to click back button in the Investor form.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_Back_button()
	{
		waitForElementToDisplay(btn_InvestorDetailsForm_Back, this.elementLoadWaitTime);
		clickOn(btn_InvestorDetailsForm_Back);
	}
	/**
	 *This method is used to click the next button in the investor form details.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_Next_button()
	{
		//	waitForElementToDisplay(btn_InvestorDetailsForm_Next, this.elementLoadWaitTime);
		clickOnSpecialElement(btn_InvestorDetailsForm_Next);
	}
	/**
	 *This method is used to fill the investor details of information form.
	 *
	 *@param salutation,jobTitle
	 *@param mobileNumber,investorType
	 *
	 *@author VijayaKumar.U
	 */
	public void fillInvestorDetailsInformation(String salutation, String jobTitle, String mobileNumber, String investorType)
	{
		enter_JobTitle(jobTitle);
		enter_MobileNumber(mobileNumber);
		select_InvestorType(investorType);
	}

	public void verify_elements_Label_InUpperCase()  {
		try {
			String[] allInvestorLabelsElements = {txt_InvestorDetailsForm_MobileNumber,};
			for (String labelElement : allInvestorLabelsElements) {
				if (isElementDisplayed(labelElement)) {
					String value = getAttributeValue(labelElement,"placeholder");
					char[] charArray = value.toCharArray();
					if(Character.isUpperCase(charArray[0]))
					{
						testStepPassed(value+ " - label value is begin with upper case");
					}
				} else {
					testStepFailed(labelElement.split("#xpath")[0] + " label was not displayed.");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			testStepFailed("Could not verify placeholder elements" + e.getClass());
		}
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void fillInvestorDetails_WithoutPhoneNumberInformation(String salutation, String jobTitle, String mobileNumber, String investorType)
	{
		enter_JobTitle(jobTitle);
		select_InvestorType(investorType);
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void fillInvestorDetails_mandatoryInformation(String investorType)
	{
		select_InvestorType(investorType);
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void fillInvestorDetails_NonMandatoryInformation(String salutation, String jobTitle, String mobileNumber)
	{
		enter_JobTitle(jobTitle);
		enter_MobileNumber(mobileNumber);
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void click_Next_InvestorDetailsInformation()
	{
		//		driver.findElement(By.xpath("//div[contains(@class,'section bg-lighter overflow-auto')]//div[contains(@class,'application-form-container')]")).click();
		//		WebElement element = driver.findElement(By.xpath("//div[contains(@class,'application-form')]//button[contains(text(),'Next')]"));
		//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

		click_Next_button();
	}
	public void click_Next_InvestorDetailsInformationwithEnterKey()
	{
		//		driver.findElement(By.xpath("//div[contains(@class,'section bg-lighter overflow-auto')]//div[contains(@class,'application-form-container')]")).click();
		//		WebElement element = driver.findElement(By.xpath("//div[contains(@class,'application-form')]//button[contains(text(),'Next')]"));
		//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

		String press = Keys.chord(Keys.ENTER);
		driver.findElement(By.xpath("//button[contains(text(),'Next')]")).sendKeys(press);

	}
	public void verifyNextButton_isdisabled()
	{
		try 
		{
			String disabledText = getAttributeValue(btn_InvestorDetailsForm_Next, "disabled");
			if(disabledText.equals("true"))
			{
				testStepPassed("Next button is in Disabled State");	
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Next button is not in Disabled State");
		}
	}
	/**
	 *This method is used to navigate back from InvestorDetailsInformation.
	 *
	 *
	 *@author VijayaKumar.U
	 */
	public void click_Back_InvestorDetailsInformation()
	{
		driver.findElement(By.xpath("//div[contains(@class,'section bg-lighter overflow-auto')]//div[contains(@class,'application-form-container')]")).click();
		WebElement element = driver.findElement(By.xpath("//div[contains(@class,'application-form')]//button[contains(text(),'Back')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

		click_Back_button();
	}
	/**
	 *This method is used to clear the the Investor Company page form.
	 *
	 *@author VijayaKumar.U
	 */
	public void clear_Investor_CompanyPage_Form()
	{
		clearEditBox(txt_InvestorDetailsForm_JobTitle);
		clearEditBox(txt_InvestorDetailsForm_MobileNumber);
	}
	/**
	 *This method is used to verify the Invalid Salutation error message.
	 *
	 *@param salutation
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_Investor_Salutation_ErrorMessage_displayed_InvalidSalutation(String salutation)
	{
		waitForElementToDisplay(drp_InvestorDetailsForm_Salutation, this.elementLoadWaitTime);
		clickOn(drp_InvestorDetailsForm_Salutation);
		waitTime(1);
		typeIn(txt_InvestorDetailsForm_Salutation, salutation);
		waitTime(1);
		try 
		{
			if (isElementDisplayed(lbl_Salutation_Invalid_ErrorMessage)) 
			{
				testStepPassed("No results found message is displayed for invalid Salutation keyword");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("No results found message is not displayed for invalid Salutation keyword");
		}
		clearEditBox(txt_InvestorDetailsForm_Salutation);
		clickOn(lbl_InvestorDetailsForm);

	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_Investor_InvestorType_ErrorMessage_displayed_InvalidInvestorType(String investorType)
	{
		waitForElementToDisplay(drp_InvestorDetailsForm_InvestorType, this.elementLoadWaitTime);
		clickOn(drp_InvestorDetailsForm_InvestorType);
		waitTime(1);
		typeIn(txt_InvestorDetailsForm_InvestorType, investorType);
		waitTime(1);
		try 
		{
			if (isElementDisplayed(lbl_InvestorType_Invalid_ErrorMessage)) 
			{
				testStepPassed("No results found message is displayed for invalid Country keyword");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("No results found message is not displayed for invalid Country keyword");
		}
		clearEditBox(txt_InvestorDetailsForm_InvestorType);
		driver.findElement(By.xpath("//div[contains(@class,'section bg-lighter overflow-auto')]//div[contains(@class,'application-form-container')]")).click();

	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_Salutation_Dropdown_Values_displayed()
	{
		waitForElementToDisplay(drp_InvestorDetailsForm_Salutation, this.elementLoadWaitTime);
		clickOn(drp_InvestorDetailsForm_Salutation);
		waitTime(1);
		try 
		{
			if (isElementDisplayed(lst_InvestorDetailsForm_Salutation_OptionsList)) 
			{
				testStepPassed("Salutation Dropdown Options list is displayed");

				List<WebElement> optionsList = driver.findElements(By.xpath("//div[contains(@class,'application-form')]//div[contains(@id,'tab-investor')]//span[contains(text(),'Salutation')]/parent::label/parent::div//div[contains(@class,'multiselect__select')]/following-sibling::div[contains(@class,'multiselect__content-wrapper')]//ul[contains(@class,'multiselect__content')]//li[contains(@class,'multiselect__element')]"));

				int optionsListCount = optionsList.size();

				testStepPassed("Total Options available for Salutation : "+optionsListCount);

				for (int i = 1; i <= optionsListCount; i++) 
				{
					String text = driver.findElement(By.xpath("(//div[contains(@class,'application-form')]//div[contains(@id,'tab-investor')]//span[contains(text(),'Salutation')]/parent::label/parent::div//div[contains(@class,'multiselect__select')]/following-sibling::div[contains(@class,'multiselect__content-wrapper')]//ul[contains(@class,'multiselect__content')]//li[contains(@class,'multiselect__element')]//span//span)["+i+"]")).getText().trim();
					testStepPassed(i+". Option Value : "+text);
					ArrayList<String> arr = new ArrayList<String>(Arrays.asList("Mr","Ms","Mrs","Miss","Other"));
					boolean value = arr.contains(text);
					String str = new Boolean(value).toString();
					try 
					{
						if (str.equalsIgnoreCase("True")) 
						{
							testStepPassed(text+" value is displayed in Option list as expected");
						}
					} 
					catch (Exception e) 
					{
						testStepFailed(text+" value is not displayed in Option list as expected");
					}
				}
			}
			clickOn(lbl_InvestorDetailsForm);
		} 
		catch (Exception e) 
		{
			testStepFailed("Salutation Dropdown Options list is not displayed");
		}
		//		driver.findElement(By.xpath("//div[contains(@class,'section bg-lighter overflow-auto')]//div[contains(@class,'application-form-container')]")).click();
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_InvestorDetailsForm_MobileNUmber_length25Characters_displayed()
	{
		String len = driver.findElement(By.xpath("//div[contains(@class,'application-form')]//div[contains(@id,'tab-investor')]//span[contains(text(),'Mobile number')]/parent::label/parent::div//input[contains(@type,'tel')]")).getAttribute("maxlength").trim();
		int lenint = Integer.parseInt(len);
		try 
		{
			if(lenint==25)
			{
				testStepPassed("Mobile Number max length is 25 characters as expected");	
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Mobile Number max length is not 25 characters as expected");
		}
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public String get_InvestorDetailsPage_JobTitle_Value()
	{

		String text = getAttributeValue(txt_InvestorDetailsForm_JobTitle, "value").trim();
		return text;
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public String get_InvestorDetailsPage_PhoneNumber_Value()
	{

		String text = getAttributeValue(txt_InvestorDetailsForm_MobileNumber, "value").trim();
		return text;
	}
	/**
	 *This method is used to select the 
	 *
	 *@author VijayaKumar.U
	 */
	public void select_InvestorDetailsPage_PhoneNumber_India_Value()
	{
		driver.findElement(By.xpath("//div[contains(@class,'phone-number')]//div[contains(@class,'vti__dropdown')]")).click();
		waitTime(1);
		driver.findElement(By.xpath("(//div[contains(@class,'phone-number')]//div[contains(@class,'vti__dropdown')]//ul[contains(@class,'vti__dropdown-list')]//li//strong[contains(text(),'India')])[2]")).click();
	}
}