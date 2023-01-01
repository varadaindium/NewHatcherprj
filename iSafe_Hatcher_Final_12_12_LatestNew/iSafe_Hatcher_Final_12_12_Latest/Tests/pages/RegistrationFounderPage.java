package pages;

import iSAFE.ApplicationKeywords;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.MoveToOffsetAction;

import baseClass.BaseClass;

public class RegistrationFounderPage extends ApplicationKeywords {
	private static final String lbl_Founder = "Founder Heading#xpath=//*[text()='Founder']";//updated
	//private static final String drp_FounderForm_Salutation = "Salutation Dropdown in Founder Form#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-founder')]//span[contains(text(),'Salutation')]/parent::label/parent::div//div[contains(@class,'multiselect__select')]";

	private static final String lst_FounderForm_Salutation_OptionsList = "Salutation Dropdown Options List in Founder Form#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-founder')]//span[contains(text(),'Salutation')]/parent::label/parent::div//div[contains(@class,'multiselect__content-wrapper')]//ul[contains(@class,'multiselect__content')]";


	private static final String txt_FounderForm_Salutation = "Salutation Textbox in Founder Form#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-founder')]//span[contains(text(),'Salutation')]/parent::label/parent::div//input";



	private static final String drp_FounderForm_HighestEducation = "Highest Education Dropdown in Founder Form#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-founder')]//span[contains(text(),'Highest education')]/parent::label/parent::div//div[contains(@class,'multiselect__select')]";


	private static final String lbl_FounderForm_HighestEducation = "Highest Education Label in Founder Form#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-founder')]//label//span[contains(text(),'Highest education')]";

	private static final String drp_FounderForm_Salutation = "Salutation Dropdown #xpath=//span[contains(text(),'Salutation')]/parent::label/parent::div//div[contains(@class,'multiselect__select')]";//updated
	//private static final String lst_FounderForm_Salutation_OptionsList = "Salutation Dropdown Options List#xpath=//span[contains(text(),'Salutation')]/parent::label/parent::div//div[contains(@class,'multiselect__content-wrapper')]//ul";//updated
	//private static final String txt_FounderForm_Salutation = "Salutation Textbox #xpath=//input[contains(@placeholder,'Select Salutation...')]";//updated
	private static final String txt_FounderForm_FirstName = "First Name Textbox#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-founder')]//span[contains(text(),'First Name')]/parent::label/parent::div//input";
	private static final String txt_FounderForm_LastName = "Last Name Textbox#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-founder')]//span[contains(text(),'Last Name')]/parent::label/parent::div//input";
	private static final String txt_FounderForm_JobTitle = "Job Title Textbox#xpath=//span[contains(text(),'Job title')]/parent::label/parent::div//input";
	private static final String txt_FounderForm_LinkedInURL="LinkedIn#xpath=//span[contains(text(),'Linkedin ')]/parent::label/parent::div//input";
	
	private static final String txt_FounderForm_MobileNumber = "Mobile Number Textbox#xpath=//span[contains(text(),'Mobile number')]/parent::label/parent::div//input";
	private static final String txt_FounderForm_EmailAddress = "Email Address Textbox#xpath=//span[contains(text(),'Email Address')]/parent::label/parent::div//input";
	private static final String chk_FounderForm_SendInvitationToEnterpreneur = "Send InvitationCheckbox#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-founder')]//input[contains(@id,'send-invitation-email-to-the-entrepreneur')]";
	private static final String txt_FounderForm_FounderBio = "Founder Bio Textbox#xpath=//span[contains(text(),'Founder bio')]/parent::label/parent::div//textarea";//updated
	//private static final String drp_FounderForm_HighestEducation = "Highest Education Dropdown#xpath=//span[contains(text(),'Highest education')]/parent::label/parent::div//div[contains(@class,'multiselect__select')]";
	private static final String txt_FounderForm_HighestEducation = "Highest Education#xpath=//span[contains(text(),'Highest education')]/parent::label/parent::div//input";
	private static final String txt_FounderForm_ProfessionalQualifications = "Professional Qualifications#xpath=//span[contains(text(),'Professional qualifications')]/parent::label/parent::div//textarea";
	private static final String btn_FounderForm_Back = "Back button#xpath=//a[contains(text(),'Back')]";
	private static final String btn_FounderForm_Next = "Next button#xpath=//button[contains(text(),'Next')]";

	private static final String lbl_FounderForm_Salutation = "Salutation Label #xpath=//span[contains(text(),'Salutation')]";
	private static final String lbl_FounderForm_JobTitle = "Job Title Label #xpath=//span[contains(text(),'Job title')]";
	private static final String lbl_FounderForm_MobileNumber = "Mobile Number#xpath=//span[contains(text(),'Mobile number')]";
	private static final String lbl_FounderForm_FounderBio = "Founder Bio Label#xpath=//span[contains(text(),'Founder bio')]";
	//private static final String lbl_FounderForm_HighestEducation = "Highest Education Label in Founder Form#xpath=//span[contains(text(),'Highest education')]";
	private static final String lbl_FounderForm_ProfessionalQualifications = "Professional Qualifications Label in Founder Form#xpath=//span[contains(text(),'Professional qualifications')]";

	private static final String lbl_FounderForm_FounderBio_LessThan100Characters_Red_Message = "Founder Bio Less Then 100 Characters Message in Red#xpath=//span[contains(text(),'Founder bio')]/parent::label/parent::div//textarea/following::span[1][contains(text(),'minimum 100 characters') and contains(@style,'color: red')]";
	private static final String lbl_FounderForm_FounderBio_100Characters_Green_Message = "Founder Bio Characters Message is displayed in Green#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-founder')]//span[contains(text(),'Founder bio')]/parent::label/parent::div//textarea/following::span[1][contains(text(),'minimum 100 characters') and contains(@style,'color: green')]";
	private static final String lbl_FounderForm_Salutation_Invalid_ErrorMessage = "Invalid Salutation Error Message is displayed in Founder Form#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-founder')]//span[contains(text(),'Salutation')]/parent::label/parent::div//div[contains(@class,'multiselect__content-wrapper')]//ul[contains(@class,'multiselect__content')]//li//span[contains(@class,'multiselect__option')]//span[contains(text(),'No results found. Consider changing the search query')]";
	private static final String lbl_FounderForm_MobileNumber_InvalidFormatErrorMessage = "Mobile Number Invalid format error message is displayed in Founder Form#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-founder')]//label//span[contains(text(),'Mobile number')]/following::small[contains(text(),'incorrect phone number format')]";
	private static final String lst_FounderForm_HighestEducation_OptionsContainer = "Highest education Options Container is displayed in Founder Form#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-founder')]//span[contains(text(),'Highest education')]/parent::label/parent::div//div[contains(@class,'multiselect__content-wrapper')]";
	private static final String lbl_FounderForm_HighestEducation_Invalid_ErrorMessage = "Invalid Highest Education Error Message is displayed in Founder Form#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-founder')]//span[contains(text(),'Highest education')]/parent::label/parent::div//div[contains(@class,'multiselect__content-wrapper')]//ul[contains(@class,'multiselect__content')]//li//span[contains(@class,'multiselect__option')]//span[contains(text(),'No results found. Consider changing the search query')]";
	// Newly Added - Start
	private static final String lbl_applicationFormContainer = "Application Form Container#xpath=//div[contains(@class,'section bg-lighter overflow-auto')]//div[contains(@class,'application-form-container')]";
	private static final String btn_back = "Back#xpath=//div[contains(@class,'section bg-lighter overflow-auto')]//div[contains(@class,'application-form-container')]";
	private static final String lbl_defaultSalutaion = "Default Salutation#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-founder')]//span[contains(text(),'Salutation')]/parent::label/parent::div//div[contains(@class,'multiselect__content-wrapper')]//ul[contains(@class,'multiselect__content')]//li[contains(@class,'multiselect__element')]//span[contains(@class,'option--selected')]//span";
	private static final String list_salutationOptions = "Salutation option list#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-founder')]//span[contains(text(),'Salutation')]/parent::label/parent::div//div[contains(@class,'multiselect__content-wrapper')]//ul[contains(@class,'multiselect__content')]//li[contains(@class,'multiselect__element')]//span//span";
	private static final String list_optionsFounderFormSalutation = "Option List in founder form for salutation#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-founder')]//span[contains(text(),'Salutation')]/parent::label/parent::div//div[contains(@class,'multiselect__content-wrapper')]//ul//li//span//span";
	private static final String list_optionsHighestEducation = "Option List in for highest education#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-founder')]//span[contains(text(),'Highest education')]/parent::label/parent::div//div[contains(@class,'multiselect__content-wrapper')]//ul//li//span//span";
	private static final String lbl_highestEducationFounderInfo2 = "Highest education - founder info 2#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-founder')]//span[contains(text(),'Highest education')]/parent::label/parent::div//span[contains(text(),'Highest education')]";
	// Newly Added - End

	public RegistrationFounderPage(BaseClass obj) {
		super(obj);
	}

	// Newly Added - Start
	/**
	 * This method is used to verify the display of the founder registration
	 *
	 * @author VijayaKumar.U
	 */
	public void verify_Registration_Founder_displayed() {
		try {
			waitForElementToDisplay(lbl_Founder, this.elementLoadWaitTime);
			if (isElementDisplayed(lbl_Founder)) {
				testStepPassed("Registration Founder page is displayed");
			} else
				testStepFailed("Registration Founder page is not displayed");
		} catch (Exception e) {
			testStepFailed("Registration Founder page is not displayed " + e.getClass());
			e.printStackTrace();
		}
	}
	// Newly Added - End

	/**
	 * This method is used to verify the elements displayed in FounderPage
	 *
	 * @author VijayaKumar.U
	 */


	public void verify_Registration_FounderPage_Elements_displayed() {
		try {
			//waitForElementToDisplay(lbl_Founder, this.elementLoadWaitTime);
			String[] elementsInRegistrationFounderPage = { drp_FounderForm_Salutation, txt_FounderForm_JobTitle,
					txt_FounderForm_MobileNumber, txt_FounderForm_FounderBio, drp_FounderForm_HighestEducation,
					txt_FounderForm_ProfessionalQualifications, btn_FounderForm_Back, btn_FounderForm_Next };

			for (String elementInRegistrationFounderPage : elementsInRegistrationFounderPage) {
			//	pressPageDowntillelementVisibleforFounderForm(elementInRegistrationFounderPage);
				WebElement element = findWebElement(elementInRegistrationFounderPage);
	            scrolltoElementView(element);
				if (isElementDisplayed(elementInRegistrationFounderPage)) {
					testStepPassed(elementInRegistrationFounderPage.split("#")[0] + "was displayed");

				} else {

					testStepFailed(elementInRegistrationFounderPage.split("#")[0] + "was not displayed");
				}
			}

		} catch (Exception e) {
			testStepFailed(
					"Could not verify display of elements in Registration Founder page. Exception: " + e.getClass());
			e.printStackTrace();
		}
		// Newly Added - End
	}

	/**
	 * This method is used to element labels in founder form
	 *
	 * @author VijayaKumar.U
	 */

	// Newly Added - Start
	public void verify_Registration_FounderPage_Elements_labels_TextBox_displayed() {
		try {
			//waitForElementToDisplay(lbl_Founder, this.elementLoadWaitTime);
			String[] elementsInFounderForm = { lbl_FounderForm_Salutation,drp_FounderForm_Salutation, lbl_FounderForm_JobTitle,
					txt_FounderForm_JobTitle,lbl_FounderForm_MobileNumber,txt_FounderForm_MobileNumber, 
					lbl_FounderForm_FounderBio,txt_FounderForm_FounderBio, lbl_FounderForm_HighestEducation,
					drp_FounderForm_HighestEducation,lbl_FounderForm_ProfessionalQualifications,
					txt_FounderForm_ProfessionalQualifications };
			for (String elementInRegistrationFounderPage : elementsInFounderForm) {
				pressPageDowntillelementVisibleforFounderForm(elementInRegistrationFounderPage);
				if (isElementDisplayed(elementInRegistrationFounderPage)) {
					testStepPassed(elementInRegistrationFounderPage.split("#")[0] + " -  was displayed");
				} 
				else {
					pressPageDowntillelementVisibleforFounderForm(elementInRegistrationFounderPage);
					testStepFailed(elementInRegistrationFounderPage.split("#")[0] + " -  was not displayed");
				}
			}
		} catch (Exception e) {
			testStepFailed("Could not verify display of elements in Founder form. Exception: " + e.getClass());
			e.printStackTrace();
		}
		// Newly Added - End

	}

	/**
	 * This method is used to verify the presence of placeholders in founder form
	 *
	 * @author VijayaKumar.U
	 */

	public void verify_Registration_FounderPage_Elements_PlaceHolderText_SpellingChk() {
		try {
			waitForElementToDisplay(lbl_Founder, this.elementLoadWaitTime);
			HashMap<String, String> elementAndPlaceHolderValue = new HashMap<String, String>();
			String placeholderValue = "";
			elementAndPlaceHolderValue.put(txt_FounderForm_JobTitle, "e.g. CEO");
			elementAndPlaceHolderValue.put(txt_FounderForm_MobileNumber, "Enter a phone number");
			elementAndPlaceHolderValue.put(txt_FounderForm_FounderBio,
					"Please provide an introduction for potential investors - about yourself, personal bio and what led you to become an entrepreneur");
			elementAndPlaceHolderValue.put(txt_FounderForm_HighestEducation, "Select your highest qualification");
			elementAndPlaceHolderValue.put(txt_FounderForm_ProfessionalQualifications,
					"List down the professional qualifications / certifications which you possess");

			for (String element : elementAndPlaceHolderValue.keySet()) {
				placeholderValue = "";
				placeholderValue = findWebElement(element).getAttribute("placeholder");
				if (placeholderValue.contains(elementAndPlaceHolderValue.get(element))) {
					testStepPassed("Placeholder value was verified for " + element.split("#")[0]);
				} else {
					pressPageDowntillelementVisibleforFounderForm(element);
					testStepFailed("Placeholder value was not the expected value for " + element.split("#")[0]);
				}
			}
		} catch (Exception e) {
			testStepFailed("Could not verify placeholder value for relevant  elements in Founder form. Exception: "
					+ e.getClass());
			e.printStackTrace();
		}
		// Newly Added - End

	}

	/**
	 * This method is used to select the salutation in founder form
	 *
	 * @author VijayaKumar.U
	 */
	public void select_Salutation(String salutation) {
		try {
			waitForElementToDisplay(drp_FounderForm_Salutation, this.elementLoadWaitTime);
			clickOn(drp_FounderForm_Salutation);
			System.out.println("Debug: (To be removed) --> clicked/selected item from dropdown");
			waitTime(1);
			typeIn(txt_FounderForm_Salutation, salutation);
			System.out.println("Debug: (To be removed) --> typed item in dropdown text box");
			waitTime(1);
			//		List<WebElement> optlst = driver.findElements(By.xpath(
			//				"//div[contains(@class,'application-form')]//div[contains(@id,'tab-founder')]//span[contains(text(),'Salutation')]/parent::label/parent::div//div[contains(@class,'multiselect__content-wrapper')]//ul//li//span//span"));
			List<WebElement> optlst = findWebElements(list_optionsFounderFormSalutation);// Newly Added
			//		int optlstcount = optlst.size();
			for (WebElement opt : optlst) {
				String text = opt.getText();
				if (text.equalsIgnoreCase(salutation)) {
					opt.click();
					break;
				}
			}
			waitForElementToDisplay(drp_FounderForm_Salutation, this.elementLoadWaitTime);
			clickOn(drp_FounderForm_Salutation);
			waitTime(1);
			typeIn(txt_FounderForm_Salutation, salutation);
			waitTime(1);
			//		List<WebElement> optlst2 = driver.findElements(By.xpath(
			//				"//div[contains(@class,'application-form')]//div[contains(@id,'tab-founder')]//span[contains(text(),'Salutation')]/parent::label/parent::div//div[contains(@class,'multiselect__content-wrapper')]//ul//li//span//span"));
			List<WebElement> optlst2 = findWebElements(list_optionsFounderFormSalutation);// Newly Added
			//		int optlstcount2 = optlst2.size();
			for (WebElement opt2 : optlst2) {
				String text2 = opt2.getText();
				if (text2.equalsIgnoreCase(salutation)) {
					opt2.click();
					String salutationSelected=opt2.getText();
					testStepPassed("Salutation Selected"+salutationSelected);
					break;
				}
			} // Newly Added � Start
		} catch (Exception e) {
			testStepFailed("Could not select salutation in founder form. Exception: " + e.getClass());
			e.printStackTrace();
		}}
	// Newly Added � End
	public void select_Salutation1(String salutation) {
		{
			try {
				waitForElementToDisplay(drp_FounderForm_Salutation, this.elementLoadWaitTime);
				clickOn(drp_FounderForm_Salutation);
				waitTime(1);
				typeIn(txt_FounderForm_Salutation, salutation);
				waitTime(1);

				List <WebElement> optlst = findWebElements(list_optionsFounderFormSalutation);
				
			//	List <WebElement> optlst = findWebElements("Salution#xpath=//span[@class='multiselect__option']//span[text()='"+salutation+"']");
				int optlstcount = optlst.size();

				for (WebElement opt : optlst) 
				{
					String text = opt.getText();

					if (text.equalsIgnoreCase(salutation)) 
					{
						opt.click();
						String selSal="selected Salutation#xpath=//span[contains(@class,'multiselect__single')]";
						waitForElementToDisplay(selSal, this.elementLoadWaitTime);
						
						String salutationSelected=getText(selSal);
						if(salutationSelected.equalsIgnoreCase(salutation)) {
							testStepPassed("Salutation Selected"+salutationSelected);
							}
						else {
							System.out.println();
						}
						break;
					}
				}		
			}
			catch(Exception e) {
				testStepFailed("Invalid Salutation "+e.getClass());e.printStackTrace();
			}
		}}

		/**
		 * This method is used to enter first name in founderform
		 * 
		 * @param firstname
		 *
		 * @author VijayaKumar.U
		 */
		public void enter_FirstName(String firstName) {
			waitForElementToDisplay(txt_FounderForm_FirstName, this.elementLoadWaitTime);
			clearEditBox(txt_FounderForm_FirstName);
			typeIn(txt_FounderForm_FirstName, firstName);
		}

		/**
		 * This method is used to enter the last name
		 * 
		 * @param lastname
		 *
		 * @author VijayaKumar.U
		 */
		public void enter_LastName(String lastName) {
			waitForElementToDisplay(txt_FounderForm_LastName, this.elementLoadWaitTime);
			clearEditBox(txt_FounderForm_LastName);
			typeIn(txt_FounderForm_LastName, lastName);
		}

		/**
		 * This method is used to enter the job title
		 * 
		 * @param jobTitle
		 *
		 * @author VijayaKumar.U
		 */
		public void enter_JobTitle(String jobTitle) {
			try {
				waitForElementToDisplay(txt_FounderForm_JobTitle, this.elementLoadWaitTime);
				clearEditBox(txt_FounderForm_JobTitle);
				typeIn(txt_FounderForm_JobTitle, jobTitle);
			} catch (Exception e) {
				testStepFailed("Could not enter the job title. Exception: " + e.getClass());
				e.printStackTrace();
			}
			// Newly Added - End

		}
		public void verify_PlaceHolderFounderPage_After_Pressing_Tab() {
			try 
			{      
				waitForElementToDisplay(txt_FounderForm_MobileNumber, this.elementLoadWaitTime);
				if (isElementDisplayed(txt_FounderForm_MobileNumber)) {
					clickOn(txt_FounderForm_MobileNumber);
					String press = Keys.chord(Keys.TAB);
					typeIn(txt_FounderForm_MobileNumber, press);
					String value = driver.switchTo().activeElement().getAttribute("placeholder");       
					if (value.equalsIgnoreCase("Linkedin URL")) 
					{
						testStepPassed(value+" place holder text is displayed After tab in text box");
					}			}
			}

			catch (NoSuchElementException e) 
			{
				e.printStackTrace();
				testStepFailed("Element not displayed"+e.getClass());
			}
		}
		public void verify_PlaceHolderFounderPage_After_Pressing_ShiftAndTab() {
			try 
			{      
				waitForElementToDisplay(txt_FounderForm_LinkedInURL, this.elementLoadWaitTime);
				if (isElementDisplayed(txt_FounderForm_LinkedInURL)) {
					clickOn(txt_FounderForm_LinkedInURL);
					String press = Keys.chord(Keys.SHIFT,Keys.TAB);
					typeIn(txt_FounderForm_LinkedInURL, press);
					String value = driver.switchTo().activeElement().getAttribute("placeholder");       
					if (value.equalsIgnoreCase("Enter a phone number")) 
					{
						testStepPassed(value+" place holder text is displayed After tab+shift in  text box");
					}			}
			}

			catch (NoSuchElementException e) 
			{
				e.printStackTrace();
				testStepFailed("Element not displayed"+e.getClass());
			}
		}
		/**
		 * This method is used to enter the mobile Number
		 * 
		 * @param mobile Number
		 *
		 * @author VijayaKumar.U
		 */
		public void enter_MobileNumber(String mobileNumber) {
			try {
				waitForElementToDisplay(txt_FounderForm_MobileNumber, this.elementLoadWaitTime);
				clearEditBox(txt_FounderForm_MobileNumber);
				typeIn(txt_FounderForm_MobileNumber, mobileNumber);
			} // Newly Added - Start
			catch (Exception e) {
				testStepFailed("Could not enter the mobile Number. Exception: " + e.getClass());
				e.printStackTrace();
			}
			// Newly Added - End

		}

		/**
		 * This method is used to enter the emailAddress
		 * 
		 * @param emailAddress
		 *
		 * @author VijayaKumar.U
		 */
		public void enter_EmailAddress(String emailAddress) {
			waitForElementToDisplay(txt_FounderForm_EmailAddress, this.elementLoadWaitTime);
			clearEditBox(txt_FounderForm_EmailAddress);
			typeIn(txt_FounderForm_EmailAddress, emailAddress);
		}

		/**
		 * This method is used to click and send the invtation email to entrepreneur
		 *
		 * @author VijayaKumar.U
		 */
		public void click_SendInvitationEmailToEntrepreneur() {
			waitForElementToDisplay(btn_FounderForm_Back, this.elementLoadWaitTime);
			clickOn(chk_FounderForm_SendInvitationToEnterpreneur);
		}

		/**
		 * This method is used to enter the founderBio
		 * 
		 * @param foumderBio
		 *
		 * @author VijayaKumar.U
		 */
		public void enter_FounderBio(String founderBio) {
			try {

				clearEditBox(txt_FounderForm_FounderBio);
				typeIn(txt_FounderForm_FounderBio, founderBio);
			} 
			catch (Exception e) {
				testStepFailed("Could not enter founder bio. Exception: " + e.getClass());
				e.printStackTrace();
			}


		}
		public void verify_allElementsFirstLetter_InUpperCase()  {

			try {

				String[] allplaceholderElements = {txt_FounderForm_JobTitle,txt_FounderForm_MobileNumber,txt_FounderForm_ProfessionalQualifications };

				for (String pageholderElement : allplaceholderElements) {

					if (isElementDisplayed(pageholderElement)) {

						String value = getAttributeValue(pageholderElement, "placeholder");

						char[] charArray = value.toCharArray();

						if(Character.isUpperCase(charArray[0]))      {

							testStepPassed(value+ " - the first letter of place holder begins with upper case");

						}          } else {

							testStepFailed(pageholderElement.split("#xpath")[0] + " - the first letter of place holder does not begin with upper case.");

						}    }

			} catch (Exception e) {

				e.printStackTrace();

				testStepFailed("Could not verify placeholder elements" + e.getClass());

			}     }
		public void verify_labelElementsFirstLetter_InUpperCase()  {

			try {

				String[] allplaceholderElements = { lbl_FounderForm_Salutation, lbl_FounderForm_JobTitle,lbl_FounderForm_MobileNumber, lbl_FounderForm_FounderBio, lbl_FounderForm_HighestEducation,lbl_FounderForm_ProfessionalQualifications,btn_FounderForm_Back,btn_FounderForm_Next };

				for (String pageholderElement : allplaceholderElements) {

					if (isElementDisplayed(pageholderElement)) {

						String value = getText(pageholderElement);

						char[] charArray = value.toCharArray();

						if(Character.isUpperCase(charArray[0]))      {

							testStepPassed(value+ " - the first letter of the label begins with upper case");

						}          } else {

							testStepFailed(pageholderElement.split("#xpath")[0] + "the first letter of the label does not begin with Uppercase.");

						}    }

			} catch (Exception e) {

				e.printStackTrace();

				testStepFailed("Could not verify placeholder elements" + e.getClass());

			}     }
		/**
		 * This method is used to select the highest education
		 * 
		 * @param highestEducation
		 *
		 * @author VijayaKumar.U
		 */
		public void select_HighestEducation(String highestEducation) {
			try {
				waitForElementToDisplay(drp_FounderForm_HighestEducation, this.elementLoadWaitTime);
				clickOn(drp_FounderForm_HighestEducation);
				waitTime(1);
				typeIn(txt_FounderForm_HighestEducation, highestEducation);
				waitTime(1);
				//		List<WebElement> optlst = driver.findElements(By.xpath(
				//				"//div[contains(@class,'application-form')]//div[contains(@id,'tab-founder')]//span[contains(text(),'Highest education')]/parent::label/parent::div//div[contains(@class,'multiselect__content-wrapper')]//ul//li//span//span"));
				List<WebElement> optlst = findWebElements(list_optionsHighestEducation);// Newly Added
				//		int optlstcount = optlst.size();
				for (WebElement opt : optlst) {
					String text = opt.getText();
					if (text.equalsIgnoreCase(highestEducation)) {
						opt.click();
						break;
					}
				} // Newly Added � Start
			} catch (Exception e) {
				testStepFailed("Could not select from highest education list. Exception: " + e.getClass());
				e.printStackTrace();
			}
			// Newly Added � End
		}

		/**
		 * This method is used to enter the qualification
		 * 
		 * @param professionalQualification
		 *
		 * @author VijayaKumar.U
		 */
		public void enter_ProfessionalQualifications(String professionalQualifications) {
			try {
				WebElement element = findWebElement(txt_FounderForm_ProfessionalQualifications);
	            scrolltoElementView(element);
				waitForElementToDisplay(txt_FounderForm_ProfessionalQualifications, this.elementLoadWaitTime);
				clearEditBox(txt_FounderForm_ProfessionalQualifications);
				typeIn(txt_FounderForm_ProfessionalQualifications, professionalQualifications);
			} catch (Exception e) {
				testStepFailed("Could not enter the professional qualification. Exception: " + e.getClass());
				e.printStackTrace();
			}
			// Newly Added - End

		}

		/**
		 * This method is used to click the back button in the founder form
		 *
		 * @author VijayaKumar.U
		 */
		public void click_Back_button() {
			try {
				waitForElementToDisplay(btn_FounderForm_Back, this.elementLoadWaitTime);
				clickOn(btn_FounderForm_Back);
			} // Newly Added - Start
			catch (Exception e) {
				e.printStackTrace();
				testStepFailed("Could not click on the back button " + e.getClass());
			}
		} // Newly Added - End

		/**
		 * This method is used to click the next button in the founder form
		 *
		 * @author VijayaKumar.U
		 */
		public void click_Next_button_FounderForm() {
			try {
				clickOn("Application Form#xpath=(//div[contains(@class,'application-form-container')])[1]");
				pressPageDown();
				waitForElementToDisplay(btn_FounderForm_Next, this.elementLoadWaitTime);
				clickOn(btn_FounderForm_Next);
			} // Newly Added - Start
			catch (Exception e) {
				testStepFailed("Could not click the next button in the founder form. Exception: " + e.getClass());
				e.printStackTrace();
			}
			// Newly Added - End

		}

		/**
		 * This method is used to fill the founder information
		 * 
		 * @param saltuation
		 * @param jobtitle
		 * @param mobileNumber
		 * @param founderBio
		 * @param highestQualification , professional Qualification
		 * @author VijayaKumar.U
		 */
		public void fillFounderInformation(String salutation, String jobtitle, String mobileNumber, String founderBio,
				String highesteducation, String proffesionalQualifications) {
			select_Salutation1(salutation);
			enter_JobTitle(jobtitle);
			enter_MobileNumber(mobileNumber);
			pressPageDown();
			enter_FounderBio(founderBio);
			waitTime(1);
			pressPageDown();
			select_HighestEducation(highesteducation);
			enter_ProfessionalQualifications(proffesionalQualifications);
		}

		/**
		 * This method is used to fill the founder info 2
		 * 
		 * @param saltuation
		 * @param jobtitle
		 * @param mobileNumber
		 * @param founderBio
		 * @param highestQualification , professional Qualification
		 * @author VijayaKumar.U
		 */
		public void fillFounderInformation2(String salutationSpecialCharacters, String jobtitle, String mobileNumber, String founderBio,
				String highesteducation, String proffesionalQualifications) {
			try {
				select_Salutation(salutationSpecialCharacters);
				enter_JobTitle(jobtitle);
				enter_MobileNumber(mobileNumber);
				enter_FounderBio(founderBio);
				waitTime(1);

				WebElement element = findWebElement(lbl_highestEducationFounderInfo2);// Newly Added
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
				select_HighestEducation(highesteducation);

				enter_ProfessionalQualifications(proffesionalQualifications);
			} // Newly Added � Start
			catch (Exception e) {
				testStepFailed("Could not fill the founder info 2. Exception: " + e.getClass());
				e.printStackTrace();
			}
			// Newly Added � End

		}

		/**
		 * This method is used to fill the info for mandatory fields
		 * 
		 * @param founderBio
		 *
		 * @author VijayaKumar.U
		 */
		public void fillFounderInformation_MandatoryFields(String founderBio) {
			try {
				enter_FounderBio(founderBio);
				waitTime(1);
				pressPageDown();
			} // Newly Added - Start
			catch (Exception e) {
				testStepFailed(
						"Could not fill the info for mandatory fields in founder information. Exception: " + e.getClass());
				e.printStackTrace();
			}
			// Newly Added - End

		}

		/**
		 * This method is used to fill the nonMandatoryFields
		 ** 
		 * @param saltuation
		 * @param jobtitle
		 * @param mobileNumber
		 * @param founderBio
		 * @param highestQualification , professional Qualification
		 *
		 * @author VijayaKumar.U
		 */
		public void fillFounderInformation_NonMandatoryFields(String salutation, String jobtitle, String mobileNumber,
				String highesteducation, String proffesionalQualifications) {
			try {
				select_Salutation1(salutation);
				enter_JobTitle(jobtitle);
				enter_MobileNumber(mobileNumber);
				waitTime(1);
				pressPageDown();
				select_HighestEducation(highesteducation);
				enter_ProfessionalQualifications(proffesionalQualifications);
				// Newly Added - Start
			} catch (Exception e) {
				testStepFailed(
						"Could not fill the non Mandatory Fields in founder information. Exception: " + e.getClass());
				e.printStackTrace();
			}
			// Newly Added � End

		}

		/**
		 * This method is used to clear the form info
		 *
		 * @author VijayaKumar.U
		 */
		public void clear_FounderInformation_Form() {
			try {
				clearEditBox(txt_FounderForm_JobTitle);
				clearEditBox(txt_FounderForm_MobileNumber);
				clearEditBox(txt_FounderForm_FounderBio);
				clearEditBox(txt_FounderForm_ProfessionalQualifications);
				refreshPage();
				// Newly Added - Start
			} catch (Exception e) {
				testStepFailed("Could not clear relevant edit boxes in foundation form. Exception: " + e.getClass());
				e.printStackTrace();
			}
			// Newly Added - End

		}

		/**
		 * This method is used to fill the company registration
		 * 
		 * @param saltuation
		 * @param jobtitle
		 * @param mobileNumber
		 * @param founderBio
		 * @param highestQualification , professional Qualification
		 * @author VijayaKumar.U
		 */

		public void fillFounderCompanyRegistration(String salutation, String firstName, String lastName, String jobTitle,
				String mobileNumber, String emailAddress, String founderBio, String highestEducation,
				String professionalQualifications) {
			select_Salutation(salutation);
			enter_FirstName(firstName);
			enter_LastName(lastName);
			enter_JobTitle(jobTitle);
			enter_MobileNumber(mobileNumber);
			enter_EmailAddress(emailAddress);
			waitTime(1);
			pressPageDown();
			enter_FounderBio(founderBio);
			select_HighestEducation(highestEducation);
			enter_ProfessionalQualifications(professionalQualifications);
		}

		/**
		 * This method is used to fill the info along with the invitation through check
		 * box
		 *
		 * @author VijayaKumar.U
		 */
		public void fillFounderCompanyRegistrationWithSendInvitationCheckbox(String salutation, String firstName,
				String lastName, String jobTitle, String mobileNumber, String emailAddress, String founderBio,
				String highestEducation, String professionalQualifications) {
			select_Salutation(salutation);
			enter_FirstName(firstName);
			enter_LastName(lastName);
			enter_JobTitle(jobTitle);
			enter_MobileNumber(mobileNumber);
			enter_EmailAddress(emailAddress);
			waitTime(1);
			pressPageDown();
			click_SendInvitationEmailToEntrepreneur();
			enter_FounderBio(founderBio);
			select_HighestEducation(highestEducation);
			enter_ProfessionalQualifications(professionalQualifications);
		}

		/**
		 * This method is used to click next in founder info
		 *
		 * @author VijayaKumar.U
		 */

		/*public void click_Next_FounderInformation() {
		try {
			clickOnApplicationFormContainer();
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btn_FounderForm_Next);
			//clickOn("To perform Scroll Down#xpath=(//div[contains(@class,'application-form-container')])[1]");  

			//click_Next_button();
		} catch (Exception e) {
			testStepFailed("Could not click next in founder info. Exception: " + e.getClass());
			e.printStackTrace();
		}
//Newly Added � End
	}*/



		public void click_Next_FounderInformation() {
			try {
				//		driver.findElement(By.xpath(
				//				"//div[contains(@class,'section bg-lighter overflow-auto')]//div[contains(@class,'application-form-container')]"))
				//				.click();
				//		WebElement element = driver
				//				.findElement(By.xpath("//div[contains(@class,'application-form')]//button[contains(text(),'Next')]"));
				//	clickOnApplicationFormContainer();
				clickOnSpecialElement(btn_FounderForm_Next);
				//	click_Next_button();
			} catch (Exception e) {
				testStepFailed("Could not click next in founder info. Exception: " + e.getClass());
				e.printStackTrace();
			}}
		// Newly Added - Start
		/**
		 * This method is used to click back in founder info
		 *
		 * @author VijayaKumar.U
		 */
		public void click_Back_FounderInformation() {
			try {
				clickOnApplicationFormContainer();
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btn_back);
				clickOn(btn_FounderForm_Back);
				//click_Back_button();
			} catch (Exception e) {
				e.printStackTrace();
				testStepFailed("Could not click on back button" + e.getClass());
			}
		}

		// Newly Added - End
		/**
		 * This method is used to verify the whether the next button is disabled
		 *
		 * @author VijayaKumar.U
		 */
		public void verify_Registration_Founder_Next_Button_disabled() {
			try {
				waitForElementToDisplay(lbl_Founder, this.elementLoadWaitTime);
				if (isElementDisplayed(btn_FounderForm_Next)) {
					String disabledState = driver
							.findElement(
									By.xpath("//div[contains(@class,'application-form')]//button[contains(text(),'Next')]"))
							.getAttribute("disabled");
					try {
						if (disabledState.equalsIgnoreCase("disabled")) {
							testStepPassed("Next Button in Founder page is in Disabled State");
						}
					} catch (Exception e) {
						testStepFailed("Next Button in Founder page is not in Disabled State");
					}
				}
			} catch (Exception e) {
				testStepFailed("Registration Founder page is not displayed");
			}
		}
		public void verify_Registration_Founder_Next_Button_enabled() {
			try {
				waitForElementToDisplay(lbl_Founder, this.elementLoadWaitTime);
				if (isElementDisplayed(btn_FounderForm_Next)) {
					String disabledState = driver
							.findElement(
									By.xpath("//div[contains(@class,'application-form')]//button[contains(text(),'Next')]"))
							.getAttribute("disabled");
					try {
						if (disabledState.equalsIgnoreCase("enabled")) {
							testStepPassed("Next Button in Founder page is in enabled State");
						}
					} catch (Exception e) {
						testStepFailed("Next Button in Founder page is not in enabled State");
					}
				}
			} catch (Exception e) {
				testStepFailed("Registration Founder page is not displayed");
			}
		}
		/**
		 * This method is used to verify the display of message in red colour for bio
		 * less than 100 characters
		 *
		 * @author VijayaKumar.U
		 */
		public void verify_FounderBio_LessThan_100Characters_RedColour_Message_displayed() {

			try {
				waitForElementToDisplay(lbl_FounderForm_FounderBio_LessThan100Characters_Red_Message,
						this.elementLoadWaitTime);
				if (isElementDisplayed(lbl_FounderForm_FounderBio_LessThan100Characters_Red_Message)) {
					testStepPassed("Founder Bio Less than 100 Characters Red Colour message is displayed");
				} // Newly Added - Start
				else {
					testStepFailed("Founder Bio Less than 100 Characters Red Colour message was not  displayed");
				}
			} catch (Exception e) {
				//			
				testStepFailed(
						"Could not verify the display of message in red colour for bio less than 100 characters. Exception: "
								+ e.getClass());
				e.printStackTrace();
			}
			// Newly Added - End

		}

		/**
		 * This method is used to display of message in green color for the given
		 * characters
		 *
		 * @author VijayaKumar.U
		 */
		public void verify_FounderBio_100Characters_GreenColour_Message_displayed() {

			try {
				waitForElementToDisplay(lbl_FounderForm_FounderBio_100Characters_Green_Message, this.elementLoadWaitTime);
				if (isElementDisplayed(lbl_FounderForm_FounderBio_100Characters_Green_Message)) {
					testStepPassed("Founder Bio 100 Characters Green Colour message is displayed");
				}
				// Newly Added - Start
				else {
					testStepFailed("Founder Bio 100 Characters Green Colour message was not displayed");
				}
			} catch (Exception e) {
				testStepFailed(
						"Could not verify the display of Founder Bio 100 Characters Green Colour message. Exception: "
								+ e.getClass());
				e.printStackTrace();
			}
			// Newly Added � End
		}

		/**
		 * This method is used to verify the dropdown of salutation
		 *
		 * @author VijayaKumar.U
		 */
		public void verify_Salutation_DropdownValues() {

			try {
			
				// Moved
				String lbl_optNameslst = "Mr,Ms,Mrs,Miss,Other";
				String[] optNames = lbl_optNameslst.split(",");
				int optNamesCount = optNames.length;
				waitForElementToDisplay(txt_FounderForm_Salutation, this.elementLoadWaitTime);
				// Moved
				if (isElementDisplayed(lst_FounderForm_Salutation_OptionsList)) {
					testStepPassed("Salutation dropdown is displayed");
					waitTime(20);
					List<WebElement> salutionOptionList = findWebElements(list_salutationOptions);// Newly Added � End
					int salutionOptionCount = salutionOptionList.size();
					for (int i = 1; i <= salutionOptionCount; i++) {

						String salutationOptioninApplication = driver.findElement(By.xpath("(//span[contains(text(),'Salutation')]/parent::label/parent::div//div[contains(@class,'multiselect__content-wrapper')]//ul[contains(@class,'multiselect__content')]//li[contains(@class,'multiselect__element')]//span//span)["	+ i + "]")).getText().trim();
						for (int j = 0; j < optNamesCount; j++) {
							String salutationOptionExpected = optNames[j];

							if (salutationOptioninApplication.equalsIgnoreCase(salutationOptionExpected)) {
								//								
								testStepPassed(
										"Salutation Option Name is same as expected for: " + salutationOptionExpected);
							} }		}
					// Newly Added � Start
				} else {
					testStepFailed("Salutation Dropdown Options List in Founder Form was not displayed");
				}
			} catch (Exception e) {

				testStepFailed("Dropdown of salutation options could not be verified. Exception: " + e.getClass());
				e.printStackTrace();
			}
			// Newly Added � End

		}


		/**
		 * This method is used to verify the display of default salutation
		 *
		 * @author VijayaKumar.U
		 */
		public void verify_Default_Salutation_displayed() {

			// Newly Added - Start
			try {
				waitForElementToDisplay(drp_FounderForm_Salutation, this.elementLoadWaitTime);
				String defaultSalutationText = getText(lst_FounderForm_Salutation_OptionsList).trim();
				if (defaultSalutationText.equalsIgnoreCase("Mr")) {
					clickOn(defaultSalutationText);
					testStepPassed("Mr is selected as Default Salutation");
				} 
			} catch (Exception e) {

				testStepFailed("Default Salutation could not be verified. Exception: " + e.getClass());
				e.printStackTrace();
			}
			// Newly Added - End
		}

		/*public void verify_Salutation_Filter_MO_displayed() {

			// Newly Added - Start
			try {
				int count=0;
				waitForElementToDisplay(drp_FounderForm_Salutation, this.elementLoadWaitTime);
				String filterSalutationText = getText(lst_FounderForm_Salutation_OptionsList).trim();
				if ((filterSalutationText.charAt(0)=='M') ||(filterSalutationText.charAt(0)=='O')) {
					count++;
					testStepPassed("The Number of filtered salutation values:"+count);
				} 
			} catch (Exception e) {

				testStepFailed("Default Salutation could not be verified. Exception: " + e.getClass());
				e.printStackTrace();
			}
			// Newly Added - End
		}*/

		public void verify_Salutation_Dropdown_Values_displayed(String salutation)
		{
			waitForElementToDisplay(drp_FounderForm_Salutation, this.elementLoadWaitTime);
			clickOn(drp_FounderForm_Salutation);
			waitTime(1);
			waitTime(1);
			typeIn(txt_FounderForm_Salutation, salutation);

			try 
			{
				if (isElementDisplayed(lst_FounderForm_Salutation_OptionsList)) 
				{
					testStepPassed("Salutation Dropdown Options list is displayed");
					List <WebElement> optionsList = findWebElements(list_optionsFounderFormSalutation);
				//	List<WebElement> optionsList = driver.findElements(By.xpath("//div[contains(@class,'application-form')]//div[contains(@id,'tab-investor')]//span[contains(text(),'Salutation')]/parent::label/parent::div//div[contains(@class,'multiselect__select')]/following-sibling::div[contains(@class,'multiselect__content-wrapper')]//ul[contains(@class,'multiselect__content')]//li[contains(@class,'multiselect__element')]"));
					int optionsListCount = optionsList.size();
					testStepPassed("Total Options available for Salutation : "+optionsListCount);
					for (int i = 1; i <= optionsListCount; i++) 
					{
						String filterSalutationText = driver.findElement(By.xpath("(//div[contains(@class,'application-form')]//div[contains(@id,'tab-investor')]//span[contains(text(),'Salutation')]/parent::label/parent::div//div[contains(@class,'multiselect__select')]/following-sibling::div[contains(@class,'multiselect__content-wrapper')]//ul[contains(@class,'multiselect__content')]//li[contains(@class,'multiselect__element')]//span//span)["+i+"]")).getText().trim();
						testStepPassed(i+". Option Value : "+filterSalutationText);
						if ((filterSalutationText.charAt(0)=='M')) {

							testStepPassed("filtered salutation values:");
						}
					}
				}
				//			clickOn(lbl_InvestorDetailsForm);
			} 
			catch (Exception e) 
			{
				testStepFailed("Salutation Dropdown Options list is not displayed");
			}
			//		driver.findElement(By.xpath("//div[contains(@class,'section bg-lighter overflow-auto')]//div[contains(@class,'application-form-container')]")).click();
		}

		public void verify_JobTitle_displayed() {

			// Newly Added - Start
			try {
				waitForElementToDisplay(txt_FounderForm_JobTitle, this.elementLoadWaitTime);
				String jobTitleText = getText(txt_FounderForm_JobTitle);
				if (isElementDisplayed(txt_FounderForm_JobTitle)) {

					testStepPassed("JobTitle accepts alpha numberic,special chars,Upper and lower case text. ");
				} 
			} catch (Exception e) {

				testStepFailed("Element could not be verified. Exception: " + e.getClass());
				e.printStackTrace();
			}
			// Newly Added - End
		}
		/**
		 * This method is used to verify the error message for invalid salutation
		 * 
		 * @param salutation
		 *
		 * @author VijayaKumar.U
		 */
		public void verify_Salutation_ErrorMessage_displayed_InvalidSalutation(String salutation) {

			try {
				// Moved
				//clickOn("Application Form#xpath=(//div[contains(@class,'application-form-container')])[1]");	
				pressPageDowntillelementVisibleforFounderForm(drp_FounderForm_Salutation);
				waitForElementToDisplay(drp_FounderForm_Salutation, this.elementLoadWaitTime);
				clickOn(drp_FounderForm_Salutation);
				waitTime(1);
				typeIn(txt_FounderForm_Salutation, salutation);
				waitTime(1);
				// Moved
				if (isElementDisplayed(lbl_FounderForm_Salutation_Invalid_ErrorMessage)) {
					testStepPassed("No results found message is displayed for invalid salutation keyword");
				} // Newly Added - Start
				else {
					testStepFailed("No results found message was not displayed for invalid salutation keyword");
				}
				// Moved
				clickOn(drp_FounderForm_Salutation);
				// Moved
			} catch (Exception e) {
				testStepFailed("Could not verify the error message for invalid salutation. Exception: " + e.getClass());
				e.printStackTrace();
			}

		}

		/**
		 * This method is used to verify the display of error message for invalid
		 * mobilenumber
		 *
		 * @author VijayaKumar.U
		 */
		public void verify_MobileNumber_Invalid_ErrorMessage_displayed() {
			try {
				waitForElementToDisplay(txt_FounderForm_MobileNumber, this.elementLoadWaitTime);
				if (isElementDisplayed(lbl_FounderForm_MobileNumber_InvalidFormatErrorMessage)) {
					testStepPassed("Invalid Phone Number Format error message is displayed");
				} // Newly Added - Start
				else {
					testStepFailed("Invalid Phone Number Format error message was not displayed");
				}
			} catch (Exception e) {

				testStepFailed("Could not verify the display of error message for invalid mobile number. Exception: "
						+ e.getClass());
				e.printStackTrace();

			}
		}

		/**
		 * This method is used to verify the highest education drop down
		 *
		 * @author VijayaKumar.U
		 */
		public void verify_HighestEducation_Dropdown_Option_displayed() {

			try {
				WebElement element = findWebElement(drp_FounderForm_HighestEducation);
	            scrolltoElementView(element);
				waitForElementToDisplay(lbl_FounderForm_HighestEducation, this.elementLoadWaitTime);
				clickOn(drp_FounderForm_HighestEducation);
				waitTime(1);
				// Moved
				waitForElementToDisplay(lst_FounderForm_HighestEducation_OptionsContainer, this.elementLoadWaitTime);
				if (isElementDisplayed(lst_FounderForm_HighestEducation_OptionsContainer)) {
					testStepPassed("Highest education Options container is displayed");
				} // Newly Added - Start
				else {
					testStepFailed("Highest education Options container was not displayed");
				}
				// Moved
				clickOn(drp_FounderForm_HighestEducation);
				// Moved
			} catch (Exception e) {

				testStepFailed("Could not verify the highest education drop down. Exception: " + e.getClass());
				e.printStackTrace();
			}

		}

		/**
		 * This method is used to verify the error message for invalid highest Education
		 *
		 * @author VijayaKumar.U
		 */
		public void verify_HighestEducation_ErrorMessage_displayed_InvalidHighestEducation(String highestEducation) {

			try {

				waitForElementToDisplay(drp_FounderForm_HighestEducation, this.elementLoadWaitTime);
				clickOn(drp_FounderForm_HighestEducation);
				waitTime(1);
				typeIn(txt_FounderForm_HighestEducation, highestEducation);
				waitTime(1);

				if (isElementDisplayed(lbl_FounderForm_HighestEducation_Invalid_ErrorMessage)) {
					testStepPassed("No results found message is displayed for invalid Highest Education keyword");
				}
				// Newly Added - Start
				else {
					testStepFailed("No results found message was not displayed for invalid Highest Education keyword");
				}

				clearEditBox(txt_FounderForm_HighestEducation);
				clickOn(drp_FounderForm_HighestEducation);

			} catch (Exception e) {
				testStepFailed(
						"Could not verify the error message for invalid highest Education. Exception: " + e.getClass());
				e.printStackTrace();
			}

		}

		// Newly Added - Start
		/**
		 * This method is used to click back in founder info
		 *
		 * @author VijayaKumar.U
		 */
		public void clickOnApplicationFormContainer() {
			try {
				clickOn(lbl_applicationFormContainer);
			} catch (Exception e) {
				testStepFailed("Could not click on application form container. Exception: " + e.getClass());
				e.printStackTrace();
			}
		}
		// Newly Added - End
	}