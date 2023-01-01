package pages;
import iSAFE.ApplicationKeywords;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import baseClass.BaseClass;

public class RegistrationCompanyPage extends ApplicationKeywords
{	
	//	private static final String lbl_Company = "Company Heading#xpath=//div[contains(@class,'application-form')]//*[text()='Company']";
	//	private static final String txt_companyForm_CompanyName = "Legal Name Textbox in Company Form#xpath=//span[contains(text(),'Company Name')]/parent::label/parent::div//input";
	//	private static final String txt_companyForm_Website = "Website Textbox in Company Form#xpath=//span[contains(text(),'Website')]/parent::label/parent::div//input";
	//	private static final String txt_companyForm_City = "City Textbox in Company Form#xpath=//span[contains(text(),'City')]/parent::label/parent::div//input";
	//	private static final String drp_companyForm_Country = "Country Dropdown in Company Form#xpath=//span[contains(text(),'Country')]/ancestor::label/parent::div//div[contains(@class,'multiselect__select')]";
	//	private static final String txt_CompanyForm_Country = "Country Textbox in Company Form#xpath=//span[contains(text(),'Country')]/parent::label/parent::div//input";
	//	private static final String txt_CompanyForm_CompanyDescription = "Company Description Textbox in Company Form#xpath=//span[contains(text(),'Company description')]//parent::label//parent::div//textarea";
	//	private static final String txt_CompanyForm_IncorporationDate = "Incorporation Date Textbox in Company Form#xpath=//span[contains(text(),'Incorporation date')]/parent::label/parent::div//input[@type='text']";
	//	private static final String tbl_CompanyForm_IncorporationDate = "Incorporation Date Table in Company Form#xpath=(//div[contains(@class,'application-form')]//div[contains(@id,'tab-company')]//span[contains(text(),'Incorporation date')]/parent::label/parent::div//input/following-sibling::div//div[contains(@class,'grid-container')])[1]";
	//	private static final String drp_CompanyForm_BusinessStatus = "Business Status Dropdown in Company Form#xpath=//span[contains(text(),'Business status')]/parent::label/parent::div//div[contains(@class,'multiselect__select')]";
	//	private static final String txt_CompanyForm_BusinessStatus = "Business Status Textbox in Company Form#xpath=//span[contains(text(),'Business status')]/parent::label/parent::div//input";
	//	private static final String drp_CompanyForm_Industries = "Industries Dropdown in Company Form#xpath=//span[contains(text(),'Industries')]/parent::label/parent::div/parent::div/parent::div//div[contains(@class,'multiselect__select')]";
	//	private static final String txt_CompanyForm_Industries = "Industries Textbox in Company Form#xpath=//span[contains(text(),'Industries')]/ancestor::div//input[@placeholder='Type or select industry from the list']";
	//	private static final String drp_CompanyForm_PlanCompatibleWithUNSDG = "Plan Compatible With UN SDG Dropdown in Company Form#xpath=//span[contains(text(),'UN SDGs')]/parent::label/parent::div/parent::div/parent::div//div[contains(@class,'multiselect__select')]";
	//	private static final String txt_CompanyForm_PlanCompatibleWithUNSDG = "Plan Compatible With UN SDG Textbox in Company Form#xpath=//span[contains(text(),'UN SDGs')]/ancestor::div//input[@placeholder='Select from the list']";
	//	private static final String lnk_CompanyForm_PitchDeck_Browse = "Pitch Deck Browse Link in Company Form#xpath=//span[contains(text(),'Pitch deck')]/parent::label//parent::div//span[contains(text(),'click to upload')]";
	//	private static final String lnk_CompanyForm_CapTable_Browse = "Cap Table Browse Link in Company Form#xpath=//span[contains(text(),'Cap Table')]/parent::label//parent::div//span[contains(text(),'click to upload')]";
	//	private static final String btn_CompanyForm_Next = "Next button in Company Form#xpath=//button[contains(text(),'Next')]";
	//	private static final String btn_PitchDeck_Browse = "PitchDeck_Browse in Company Form#xpath=//span[contains(text(),'Pitch deck')]//parent::label//parent::div//div//span[contains(text(),'click to upload')]";
	//
	//
	//	private static final String lbl_companyForm_CompanyName = "Legal Name Label in Company Form#xpath=//span[contains(text(),'Company Name')]";
	//	private static final String lbl_companyForm_Website = "Website Label in Company Form#xpath=//span[contains(text(),'Website')]";
	//	private static final String lbl_companyForm_City = "City Label in Company Form#xpath=//span[contains(text(),'City')]";
	//	private static final String lbl_companyForm_Country = "Country Label in Company Form#xpath=//span[text()='Country']";
	//	private static final String lbl_CompanyForm_CompanyDescription = "Company Description Label in Company Form#xpath=//span[contains(text(),'Company description')]";
	//	private static final String lbl_CompanyForm_IncorporationDate = "Incorporation Date Label in Company Form#xpath=//span[contains(text(),'Incorporation date')]";
	//	private static final String lbl_CompanyForm_BusinessStatus = "Business Status Label in Company Form#xpath=//span[contains(text(),'Business status')]";
	//	private static final String lbl_CompanyForm_Industries = "Industries Label in Company Form#xpath=//span[contains(text(),'Industries')]";
	//	private static final String lbl_CompanyForm_UNSDG = "UNSDG Label in Company Form#xpath=//span[contains(text(),'Is your plan compatible with UN SDGs')]";
	//	private static final String lbl_CompanyForm_PitchDeck = "Pitch Deck Label in Company Form#xpath=//span[contains(text(),'Pitch deck')]";
	//	private static final String lbl_CompanyForm_CapTable = "Cap Table Label in Company Form#xpath=//span[contains(text(),'Cap Table')]";
	//
	//	private static final String lbl_CompanyForm_InValidWebsite_error_Message = "Invalid Website Error Message Label in Company Form#xpath=//span[contains(text(),'Website')]/parent::label/parent::div//i[contains(@class,'validation-error-message')]/following::span[1]";
	//	private static final String lbl_CompanyForm_CompanyDescription_LessThan100Characters_Red_Message = "Company Description Less Then 100 Characters Message displayed in Red in Company Form#xpath=//textarea/following::span[contains(text(),'minimum 100 characters') and contains(@style,'color: red')]";
	//	private static final String lbl_CompanyForm_CompanyDescription_100Characters_Green_Message = "Company Description Characters Message displayed in Green in Company Form#xpath=//span[contains(text(),'Company description')]/parent::label/parent::div//textarea/following::span[1][contains(text(),'minimum 100 characters') and contains(@style,'color: green')]";
	//
	//	private static final String lbl_Country_Invalid_ErrorMessage = "Invalid Country Error Message is displayed in Company Form#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-company')]//span[contains(text(),'Country')]/parent::label/parent::div//div[contains(@class,'multiselect__content-wrapper')]//ul[contains(@class,'multiselect__content')]//li//span[contains(@class,'multiselect__option')]//span[contains(text(),'No results found. Consider changing the search query')]";
	//	//Newly added - Start 
	//	private static final String lbl_companyNamePlaceholder = "Company Name Placeholder#xpath=//input[contains(@placeholder,'Hatcher Plus Pte Ltd')]";
	//	private static final String lbl_websitePlaceholder = "Website Placeholder#xpath=//input[contains(@placeholder,'mywebsite')]";
	//	private static final String lbl_cityPlaceholder = "City Placeholder in Company Form#xpath=//input[contains(@placeholder,'New York')]";
	//	private static final String lbl_companyDescriptionPlaceholder = "Company Description Placeholder#xpath=//textarea[contains(@placeholder,'Overview of the business')]";
	//	private static final String lbl_CompanyIncorporationDatePlaceholder ="CompanyForm_IncorporationDate=//input[contains(@class,'form-control date-field hasDatepicker')]";
	//	private static final String lbl_businessStatusplaceholder = "Business Status placeholder#xpath=//input[contains(@placeholder,'Select your business status')]";
	//	private static final String lbl_industryPlaceholder = "Industry Placeholder#xpath=//input[contains(@placeholder,'Type or select industry from the list')]";
	//	private static final String lbl_UNSDGPlaceholder = "UNSDG Placeholder#xpath=//input[contains(@placeholder,'Select from the list')]";
	//
	//	private static final String lbl_companyFormContainer = "Company Form Container#xpath=//div[contains(@class,'section bg-lighter overflow-auto')]//div[contains(@class,'application-form-container')]";
	//	private static final String btn_next = "Next button#xpath=//button[contains(text(),'Next')]";
	//	private static final String btn_incorporationDate = "Incorporation Date#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-company')]//div[contains(@class,'custom-datepicker')]//div[contains(@class,'vc-pane')]//div[contains(@class,'vc-grid-container')]//div[contains(@class,'is-today')]";
	//	private static final String btn_defaultHighlightedDateStringinCalendar = "Default Highlighted Date String in Calendar#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-company')]//div[contains(@class,'custom-datepicker')]//div[contains(@class,'vc-pane')]//div[contains(@class,'vc-grid-container')]//div[contains(@class,'is-today')]//div[contains(@class,'highlights')]//following-sibling::span";
	//	//Newly added - End

	private static final String lbl_Company = "Company Heading#xpath=//div[contains(@class,'application-form')]//*[text()='Company']";
	private static final String txt_companyForm_CompanyName = "Legal Name Textbox in Company Form#xpath=//span[contains(text(),'Company Name')]/parent::label/parent::div//input";
	private static final String txt_companyForm_Website = "Website Textbox in Company Form#xpath=//span[contains(text(),'Website')]/parent::label/parent::div//input";
	private static final String txt_companyForm_City = "City Textbox in Company Form#xpath=//span[contains(text(),'City')]/parent::label/parent::div//input";
	private static final String drp_companyForm_Country = "Country Dropdown in Company Form#xpath=//span[contains(text(),'Country')]/ancestor::label/parent::div//div[contains(@class,'multiselect__select')]";
	private static final String txt_CompanyForm_Country = "Country Textbox in Company Form#xpath=//span[contains(text(),'Country')]/parent::label/parent::div//input";
	private static final String txt_CompanyForm_CompanyDescription = "Company Description Textbox in Company Form#xpath=//span[contains(text(),'Company description')]//parent::label//parent::div//textarea";
	private static final String txt_CompanyForm_IncorporationDate = "Incorporation Date Textbox in Company Form#xpath=//span[contains(text(),'Incorporation date')]/parent::label/parent::div//input[@type='text']";
	private static final String tbl_CompanyForm_IncorporationDate = "Incorporation Date Table in Company Form#xpath=(//div[contains(@class,'application-form')]//div[contains(@id,'tab-company')]//span[contains(text(),'Incorporation date')]/parent::label/parent::div//input/following-sibling::div//div[contains(@class,'grid-container')])[1]";
	private static final String tbl_CompanyForm_IncorporationDateIcon = "Incorporation Date Table in Company Form#xpath=//img[contains(@src,'calendar')]";
	private static final String drp_CompanyForm_BusinessStatus = "Business Status Dropdown in Company Form#xpath=//span[contains(text(),'Business status')]/ancestor::label/parent::div//div[contains(@class,'multiselect__select')]";
	private static final String txt_CompanyForm_BusinessStatus = "Business Status Textbox in Company Form#xpath=//input[contains(@placeholder,'Select your business status')]";
	private static final String drp_CompanyForm_Industries = "Industries Dropdown in Company Form#xpath=//span[contains(text(),'Industries')]/parent::label/parent::div/parent::div/parent::div//div[contains(@class,'multiselect__select')]";
	private static final String txt_CompanyForm_Industries = "Industries Textbox in Company Form#xpath=//span[contains(text(),'Industries')]/ancestor::div//input[@placeholder='Type or select industry from the list']";
	private static final String drp_CompanyForm_PlanCompatibleWithUNSDG = "Plan Compatible With UN SDG Dropdown in Company Form#xpath=//span[contains(text(),'UN SDGs')]/parent::label/parent::div/parent::div/parent::div//div[contains(@class,'multiselect__select')]";
	private static final String txt_CompanyForm_PlanCompatibleWithUNSDG = "Plan Compatible With UN SDG Textbox in Company Form#xpath=//span[contains(text(),'UN SDGs')]/ancestor::div//input[@placeholder='Select from the list']";
	private static final String lnk_CompanyForm_PitchDeck_Browse = "Pitch Deck Browse Link in Company Form#xpath=//span[contains(text(),'Pitch deck')]/parent::label//parent::div//span[contains(text(),'click to upload')]";
	private static final String lnk_CompanyForm_CapTable_Browse = "Cap Table Browse Link in Company Form#xpath=//span[contains(text(),'Cap Table')]/parent::label//parent::div//span[contains(text(),'click to upload')]";
	private static final String btn_CompanyForm_Next = "Next button in Company Form#xpath=//button[contains(text(),'Next')]";
	private static final String btn_PitchDeck_Browse = "PitchDeck_Browse in Company Form#xpath=//span[contains(text(),'Pitch deck')]//parent::label//parent::div//div//span[contains(text(),'click to upload')]";


	private static final String lbl_companyForm_CompanyName = "Legal Name Label in Company Form#xpath=//span[contains(text(),'Company Name')]";
	private static final String lbl_companyForm_Website = "Website Label in Company Form#xpath=//span[contains(text(),'Website')]";
	private static final String lbl_companyForm_City = "City Label in Company Form#xpath=//span[contains(text(),'City')]";
	private static final String lbl_companyForm_Country = "Country Label in Company Form#xpath=//span[text()='Country']";
	private static final String lbl_CompanyForm_CompanyDescription = "Company Description Label in Company Form#xpath=//span[contains(text(),'Company description')]";
	private static final String lbl_CompanyForm_IncorporationDate = "Incorporation Date Label in Company Form#xpath=//span[contains(text(),'Incorporation date')]";
	private static final String lbl_CompanyForm_BusinessStatus = "Business Status Label in Company Form#xpath=//span[contains(text(),'Business status')]";
	private static final String lbl_CompanyForm_Industries = "Industries Label in Company Form#xpath=//span[contains(text(),'Industries')]";
	private static final String lbl_CompanyForm_UNSDG = "UNSDG Label in Company Form#xpath=//span[contains(text(),'Is your plan compatible with UN SDGs')]";
	private static final String lbl_CompanyForm_PitchDeck = "Pitch Deck Label in Company Form#xpath=//span[contains(text(),'Pitch deck')]";
	private static final String lbl_CompanyForm_CapTable = "Cap Table Label in Company Form#xpath=//span[contains(text(),'Cap Table')]";

	private static final String lbl_CompanyForm_InValidWebsite_error_Message = "Invalid Website Error Message Label in Company Form#xpath=//span[contains(text(),'Website')]/parent::label/parent::div//i[contains(@class,'validation-error-message')]/following::span[1]";
	private static final String lbl_CompanyForm_CompanyDescription_LessThan100Characters_Red_Message = "Company Description Less Then 100 Characters Message displayed in Red in Company Form#xpath=//textarea/following::span[contains(text(),'minimum 100 characters') and contains(@style,'color: red')]";
	private static final String lbl_CompanyForm_CompanyDescription_100Characters_Green_Message = "Company Description Characters Message displayed in Green in Company Form#xpath=//span[contains(text(),'Company description')]/parent::label/parent::div//textarea/following::span[1][contains(text(),'minimum 100 characters') and contains(@style,'color: green')]";

	private static final String lbl_Country_Invalid_ErrorMessage = "Invalid Country Error Message is displayed in Company Form#xpath=//span[contains(text(),'No results found. Consider changing the search query')]";
	private static final String lbl_Country_Invalid_ErrorMessageinBusiness = "Invalid Country Error Message is displayed in Company Form#xpath=//span[contains(text(),'Business status')]/ancestor::label/parent::div//div[contains(@class,'multiselect')]//span[contains(text(),'No results found. Consider changing the search query')]";
	private static final String lbl_Country_Invalid_ErrorMessageinIndustries = "Invalid Country Error Message is displayed in Company Form#xpath=//span[contains(text(),'Industries')]/parent::label/parent::div/parent::div/parent::div//div[contains(@class,'multiselect__content-wrapper')]//span[contains(text(),'No elements found. Consider changing the search query')]";
	private static final String lbl_Country_Invalid_ErrorMessageinUNSDGs = "Invalid UNSDGs Error Message is displayed in Company Form#xpath=//span[contains(text(),'UN SDGs')]/parent::label/parent::div/parent::div/parent::div//div[contains(@class,'multiselect__content-wrapper')]//span[contains(text(),'No elements found. Consider changing the search query')]";

	//Newly added - Start 
	private static final String lbl_companyNamePlaceholder = "Company Name Placeholder#xpath=//input[contains(@placeholder,'Hatcher Plus Pte Ltd')]";
	private static final String lbl_websitePlaceholder = "Website Placeholder#xpath=//input[contains(@placeholder,'website')]";
	private static final String lbl_cityPlaceholder = "City Placeholder in Company Form#xpath=//input[contains(@placeholder,'New York')]";
	private static final String lbl_companyDescriptionPlaceholder = "Company Description Placeholder#xpath=//textarea[contains(@placeholder,'Overview of the business')]";
	private static final String lbl_businessStatusplaceholder = "Business Status placeholder#xpath=//input[contains(@placeholder,'Select your business status')]";
	private static final String lbl_industryPlaceholder = "Industry Placeholder#xpath=//input[contains(@placeholder,'Type or select industry from the list')]";
	private static final String lbl_UNSDGPlaceholder = "UNSDG Placeholder#xpath=//input[contains(@placeholder,'Select from the list')]";

	private static final String lbl_companyFormContainer = "Company Form Container#xpath=//div[contains(@class,'section bg-lighter overflow-auto')]//div[contains(@class,'application-form-container')]";
	private static final String btn_next = "Next button#xpath=//button[contains(text(),'Next')]";
	private static final String btn_incorporationDate = "Incorporation Date#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-company')]//div[contains(@class,'custom-datepicker')]//div[contains(@class,'vc-pane')]//div[contains(@class,'vc-grid-container')]//div[contains(@class,'is-today')]";
	private static final String btn_defaultHighlightedDateStringinCalendar = "Default Highlighted Date String in Calendar#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-company')]//div[contains(@class,'custom-datepicker')]//div[contains(@class,'vc-pane')]//div[contains(@class,'vc-grid-container')]//div[contains(@class,'is-today')]//div[contains(@class,'highlights')]//following-sibling::span";
	//Newly added - End




	public RegistrationCompanyPage(BaseClass obj) 
	{
		super(obj);
	}
	/**
	 *This method is used to verify the display of the company label.
	 *
	 *@author VijayaKumar.U
	 */
	//----------Edited by Priya.V added the Else part-----------//
	public void verify_Registration_Company_displayed()	{
		try		{
			//	waitForElementToDisplay(lbl_Company, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_Company))	{
				testStepPassed("Registration Company page is displayed");	
			}		
			else {
				testStepFailed("Registration Company page is not displayed");

			}			} 
		catch (Exception e)	{
			testStepFailed("Could not verify the Registration Company page."+e.getClass());
			e.printStackTrace();
		}
	}

	/**
	 *This method is used to verify the registration elements label displayed.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_Registration_CompanyPage_ElementsAndLabels_displayed()	{
		try {
			waitForElementToDisplay(lbl_Company, this.elementLoadWaitTime);
			String[] pageElements = { lbl_companyForm_CompanyName, lbl_companyForm_Website, lbl_companyForm_City, lbl_companyForm_Country, lbl_CompanyForm_CompanyDescription, lbl_CompanyForm_IncorporationDate, lbl_CompanyForm_BusinessStatus, lbl_CompanyForm_Industries, lbl_CompanyForm_UNSDG, lbl_CompanyForm_PitchDeck, lbl_CompanyForm_CapTable,txt_companyForm_CompanyName,txt_companyForm_Website,txt_companyForm_City,drp_companyForm_Country,txt_CompanyForm_CompanyDescription,txt_CompanyForm_IncorporationDate, drp_CompanyForm_BusinessStatus,drp_CompanyForm_Industries,drp_CompanyForm_PlanCompatibleWithUNSDG,lnk_CompanyForm_PitchDeck_Browse,lnk_CompanyForm_CapTable_Browse,btn_CompanyForm_Next };
			for (String pageElement : pageElements) {
				if (isElementDisplayed(pageElement)) {
					testStepPassed(pageElement.split("#xpath")[0] + " was displayed in Company Page");
				} else {
					testStepFailed(pageElement.split("#xpath")[0] + " was not displayed in Company Page");
				}}	
		}		 
		catch (Exception e) {
			e.printStackTrace();
			testStepFailed("Failed to verify the lables of company page elements " + e.getClass());
		}	}

	
	/**
	 *This method is used to verify registration elements display.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_Registration_CompanyPage_Elements_PlaceHolderText_displayed()	{
		try {
			String[] allplaceholderElements = {lbl_companyNamePlaceholder,lbl_websitePlaceholder,lbl_cityPlaceholder,};
			for (String pageholderElement : allplaceholderElements) {
				if (isElementDisplayed(pageholderElement)) {
					testStepPassed(pageholderElement.split("#xpath")[0] + " placeholder was displayed .");
				} else {
					testStepFailed(pageholderElement.split("#xpath")[0] + " placeholder was not displayed.");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			testStepFailed("Could not verify placeholder elements" + e.getClass());
		}
	}
	/*public void verify_Registration_CompanyPage_Elements_PlaceHolderText_displayed()	{
		try {
			waitForElementToDisplay(lbl_Company, this.elementLoadWaitTime);
			try 		{
				String placeholderText = getAttributeValue(lbl_companyNamePlaceholder, "placeholder");  
				if(placeholderText.contains("e.g. Hatcher Plus Pte Ltd"))			{
					testStepPassed("Correct Company Legal Name Placeholder text is displayed");	
				}	else testStepFailed("Correct Company Legal Name Placeholder text is not displayed");	} 
			catch (Exception e) 		{
				e.printStackTrace();
				testStepFailed("Correct Company Legal Name Placeholder text is not displayed" + e.getClass());
			}

			try 	{
				String placeholderText = getAttributeValue(lbl_websitePlaceholder, "placeholder");
				if(placeholderText.contains("e.g. https://www.mywebsite.com"))			{
					testStepPassed("Correct Website Placeholder text is displayed");	
				}	else testStepFailed("Correct Website Placeholder text is not displayed");	} 
			catch (Exception e) 		{
				e.printStackTrace();
				testStepFailed("Correct Website Placeholder text is not displayed" + e.getClass());
			}

			try 	{
				String placeholderText = getAttributeValue(lbl_cityPlaceholder, "placeholder");

				if(placeholderText.contains("e.g. New York"))			{
					testStepPassed("Correct City Placeholder text is displayed");	
				}else testStepFailed("Correct City Placeholder text is not displayed");	
			} 
			catch (Exception e) 		{
				e.printStackTrace();
				testStepFailed("Correct City Placeholder text is not displayed" + e.getClass());
			}

			try 	{
				String placeholderText = getAttributeValue(lbl_companyDescriptionPlaceholder, "placeholder");

				if(placeholderText.contains("Overview of the business"))	{
					testStepPassed("Correct Company Description Placeholder text is displayed");	
				}	testStepFailed("Correct Company Description Placeholder text is not displayed");	} 
			catch (Exception e) 	{
				e.printStackTrace();
				testStepFailed("Correct Company Description Placeholder text is not displayed" + e.getClass());
			}

			try 	{
				String placeholderText = getAttributeValue(lbl_CompanyIncorporationDatePlaceholder, "placeholder");
				if(placeholderText.contains("Incorporation date"))
				{
					testStepPassed("Correct Incorporation Date Placeholder text is displayed");	
				}testStepFailed("Correct Incorporation Date Placeholder text is not displayed");
			} 
			catch (Exception e)	{
				e.printStackTrace();
				testStepFailed("Correct Incorporation Date Placeholder text is not displayed" + e.getClass());
			}
			try {
				String placeholderText = getAttributeValue(lbl_businessStatusplaceholder, "placeholder");  
				if(placeholderText.contains("Select your business status"))			{
					testStepPassed("Correct Business Status Placeholder text is displayed");	
				}	testStepFailed("Correct Business Status Placeholder text is not displayed");	} 
			catch (Exception e)	{
				e.printStackTrace();
				testStepFailed("Correct Business Status Placeholder text is not displayed" + e.getClass());
			}
			try 	{
				String placeholderText = getAttributeValue(lbl_industryPlaceholder, "placeholder");  
				if(placeholderText.contains("Type or select industry from the list")){
					testStepPassed("Correct Industry Placeholder text is displayed");	
				}	testStepFailed("Correct Industry Placeholder text is not displayed");	} 
			catch (Exception e)	{
				e.printStackTrace();
				testStepFailed("Correct Industry Placeholder text is not displayed" + e.getClass());
			}
			try 	{
				String placeholderText = getAttributeValue(lbl_UNSDGPlaceholder, "placeholder");  
				if(placeholderText.contains("Select from the list"))			{
					testStepPassed("Correct UNSDG Placeholder text is displayed");	
				}	testStepFailed("Correct UNSDG Placeholder text is not displayed");	} 
			catch (Exception e)	{
				e.printStackTrace();
				testStepFailed("Correct UNSDG Placeholder text is not displayed" + e.getClass());
			}}
		catch (Exception e)	{
			e.printStackTrace();
			testStepFailed("Failed to verify placeholder text of company page elements " + e.getClass());}
	}*/

	/**
	 *This method is used to enter legal Name.
	 *@param legalName
	 *@author VijayaKumar.U
	 */
	public void enter_LegalName(String legalName)
	{
		try {
			WebElement ele = findWebElement(txt_companyForm_CompanyName);
			scrolltoElementView(ele);
			waitForElementToDisplay(txt_companyForm_CompanyName, this.elementLoadWaitTime);
			typeIn(txt_companyForm_CompanyName, legalName);
		} catch (Exception e) {
			e.printStackTrace();
			testStepFailed("Could not enter the legal name " + e.getClass());
		}
	}
	/**
	 *This method is used to enter website.
	 *@param website
	 *@author VijayaKumar.U
	 */
	public void enter_Website(String website)
	{try {
		
		waitForElementToDisplay(txt_companyForm_Website, this.elementLoadWaitTime);
		typeIn(txt_companyForm_Website, website);}
	catch (Exception e) {
		e.printStackTrace();
		testStepFailed("Could not enter the website name " + e.getClass());
	}
	}
	/**
	 *This method is used to enter city.
	 *@param city
	 *@author VijayaKumar.U
	 */
	public void enter_City(String city)
	{try {
		waitForElementToDisplay(txt_companyForm_City, this.elementLoadWaitTime);
		typeIn(txt_companyForm_City, city);}
	catch (Exception e) {
		e.printStackTrace();
		testStepFailed("Could not enter the city name " + e.getClass());
	}
	}//Newly Added - end

	/**
	 *This method is used to select country.
	 *
	 *@author VijayaKumar.U
	 */
	public void select_Country(String country)
	{
		try {
			waitForElementToDisplay(drp_companyForm_Country, this.elementLoadWaitTime);
			clickOn(drp_companyForm_Country);
			waitTime(1);
			typeIn(txt_CompanyForm_Country, country);
			waitTime(1);
			String press = Keys.chord(Keys.ENTER);
			driver.findElement(By.xpath("//span[contains(text(),'Country')]/parent::label/parent::div//input")).sendKeys(press);
		} catch (Exception e) {
			e.printStackTrace();
			testStepFailed("Could not enter the legal name " + e.getClass());
		}

	}

	public void verify_select_Country(String country)
	{
		try {
			waitForElementToDisplay(drp_companyForm_Country, this.elementLoadWaitTime);
			clickOn(drp_companyForm_Country);
			waitTime(1);
			typeIn(txt_CompanyForm_Country, country);
			waitTime(1);
		} catch (Exception e) {
			e.printStackTrace();
			testStepFailed("Could not enter the legal name " + e.getClass());
		}

		List <WebElement> optlst = driver.findElements(By.xpath("//div[contains(@class,'application-form')]//div[contains(@id,'tab-company')]//span[contains(text(),'Country')]/parent::label/parent::div//div[contains(@class,'multiselect__content-wrapper')]//ul//li//span//span"));
		int optlstcount = optlst.size();

		for (WebElement opt : optlst) 
		{
			String text = opt.getText();
			if (text.equalsIgnoreCase(country)) 
			{
				opt.click();
				break;
			}
		}

		waitForElementToDisplay(drp_companyForm_Country, this.elementLoadWaitTime);
		clickOn(drp_companyForm_Country);
		waitTime(1);
		typeIn(txt_CompanyForm_Country, country);
		waitTime(1);

		List <WebElement> optlst2 = driver.findElements(By.xpath("//div[contains(@class,'application-form')]//div[contains(@id,'tab-company')]//span[contains(text(),'Country')]/parent::label/parent::div//div[contains(@class,'multiselect__content-wrapper')]//ul//li//span//span"));
		int optlstcount2 = optlst2.size();

		for (WebElement opt2 : optlst2) 
		{
			String text2 = opt2.getText();
			if (text2.equalsIgnoreCase(country)) 
			{
				opt2.click();
				break;
			}		}}

	/**
	 *This method is used to clear company description.
	 *
	 *@author VijayaKumar.U
	 */
	public void clear_CompanyDescription()
	{try {

		driver.findElement(By.xpath("//div[contains(@class,'application-form')]//div[contains(@id,'tab-company')]//span[contains(text(),'Company description')]/parent::label/parent::div//textarea")).clear();
	}catch (Exception e) {
		e.printStackTrace();
		testStepFailed("Could not clear description " + e.getClass());
	}}


	/**
	 *This method is used to enter the company description.
	 *@param companyDescription
	 *@author VijayaKumar.U
	 */
	public void enter_CompanyDescription(String companyDescription)
	{
		try {
			clickOn("Application Form#xpath=(//div[contains(@class,'application-form-container')])[1]");
			pressPageDown();
			waitForElementToDisplay(txt_CompanyForm_CompanyDescription, this.elementLoadWaitTime);
			typeIn(txt_CompanyForm_CompanyDescription, companyDescription);

		} catch (Exception e) {
			e.printStackTrace();
			testStepFailed("Could not enter description" + e.getClass());
		}}

	/**
	 *This method is used to enter the date.
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_IncorporationDate(String incorporationDate)
	{
		waitForElementToDisplay(txt_CompanyForm_IncorporationDate, this.elementLoadWaitTime);
		typeIn(txt_CompanyForm_IncorporationDate, incorporationDate);
		waitTime(1);
		driver.findElement(By.xpath("//div[contains(@class,'application-form')]//div[contains(@id,'tab-company')]//div[contains(@class,'custom-datepicker')]//div[contains(@class,'vc-pane')]//div[contains(@class,'vc-grid-container')]//div[contains(@class,'is-today')]")).click();
	}

	/**
	 *This method is used to verify display of date in calendar
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_IncorporationDate_Calender_displayed()
	{try 
	{
		waitForElementToDisplay(txt_CompanyForm_IncorporationDate, this.elementLoadWaitTime);
		clickOn(txt_CompanyForm_IncorporationDate);
		waitTime(1);

		if (isElementDisplayed(tbl_CompanyForm_IncorporationDate))
		{
			testStepPassed("Incorporation Date Calendar is displayed");
			clickOn(btn_incorporationDate);
		}else testStepFailed("Incorporation Date Calendar is not displayed");
	} 
	catch (Exception e) 
	{e.printStackTrace();
	testStepFailed("Incorporation Date Calendar is not displayed" + e.getClass());
	}
	}

	/**
	 *This method is used to verify date highlighted .
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_Todays_Date_Highlighted_ByDefault_IncorporationDate_Calender_displayed()	{
		try {
			waitForElementToDisplay(txt_CompanyForm_IncorporationDate, this.elementLoadWaitTime);
			clickOn(txt_CompanyForm_IncorporationDate);
			waitTime(1);

			if (isElementDisplayed(tbl_CompanyForm_IncorporationDate))	{
				testStepPassed("Incorporation Date Calendar is displayed");
				Date date = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("dd");
				String formattedDate = sdf.format(date);
				int todayDate = Integer.parseInt(formattedDate);
				String defaultHighlightedDateStringinCalendar = getText(btn_defaultHighlightedDateStringinCalendar).trim();
				int defaultHighlightedDateinCalendar = Integer.parseInt(defaultHighlightedDateStringinCalendar);
				try {
					if (defaultHighlightedDateinCalendar==todayDate){
						testStepPassed("Today's date is highlighted by default in calendar");
					}	else testStepFailed("Today's date is not highlighted by default in calendar");} 
				catch (Exception e)	{
					testStepFailed("Today's date is not highlighted by default in calendar");
				}		}		} 
		catch (Exception e) 		{e.printStackTrace();
		testStepFailed("Incorporation Date Calendar is not displayed" + e.getClass());
		}
	}

	/**
	 *This method is used to select business status.
	 *
	 *@author VijayaKumar.U
	 */
	public void select_BusinessStatus(String businessStatus)
	{
		WebElement ele = findWebElement(drp_CompanyForm_BusinessStatus);
		scrolltoElementView(ele);
		waitForElementToDisplay(drp_CompanyForm_BusinessStatus, this.elementLoadWaitTime);
		clickOn(drp_CompanyForm_BusinessStatus);
		waitTime(1);
		typeIn(txt_CompanyForm_BusinessStatus, businessStatus);
		waitTime(1);

		List <WebElement> optlst = driver.findElements(By.xpath("//div[contains(@class,'application-form')]//div[contains(@id,'tab-company')]//span[contains(text(),'Business status')]/parent::label/parent::div//div[contains(@class,'multiselect__content-wrapper')]//ul//li//span//span"));
		int optlstcount = optlst.size();

		for (WebElement opt : optlst) 		{
			String text = opt.getText();
			if (text.equalsIgnoreCase(businessStatus))	{
				opt.click();
				break;
			}		}			}
	/**
	 *This method is used to select Industries.
	 *
	 *@author VijayaKumar.U
	 */
	public void select_Industries(String industries)	{
		pressPageDowntillelementVisible();
		waitForElementToDisplay(drp_CompanyForm_Industries, this.elementLoadWaitTime);
		clickOn(drp_CompanyForm_Industries);
		//waitTime(1);
		typeIn(txt_CompanyForm_Industries, industries);
		//waitTime(1);
		String industry="Industry#xpath=//span[contains(text(),'Industries')]/parent::label/parent::div/parent::div/parent::div//div[contains(@class,'multiselect__content-wrapper')]//ul//li//span//span";
		List <WebElement> optlst =findWebElements(industry);
		int optlstcount = optlst.size();

		for (WebElement opt : optlst) {
			String text = opt.getText();
			if (text.equalsIgnoreCase(industries)) 	{
				opt.click();
				break;
			}	}	}
	/**
	 *This method is used to select plan in CompatibleUNSDG.
	 *
	 *@author VijayaKumar.U
	 */
	public void select_PlanCompatibleUNSDG(String planCompatibleUNSDG)
	{
		waitForElementToDisplay(drp_CompanyForm_PlanCompatibleWithUNSDG, this.elementLoadWaitTime);
		clickOn(drp_CompanyForm_PlanCompatibleWithUNSDG);
		waitTime(1);
		typeIn(txt_CompanyForm_PlanCompatibleWithUNSDG,planCompatibleUNSDG);
		//waitTime(1);
		String selectPlan="Plan#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-company')]//span[contains(text(),'UN SDGs')]/parent::label/parent::div/parent::div/parent::div//div[contains(@class,'multiselect__content-wrapper')]//ul//li//span//span";
		List <WebElement> optlist = findWebElements(selectPlan);
		int optlstcount = optlist.size();		
		for (WebElement opt : optlist) 
		{
			String text = opt.getText();
			if (text.equalsIgnoreCase(planCompatibleUNSDG)) 
			{
				opt.click();
				break;
			}
		}
	}
	/**
	 *This method is used to select multiple PlanCompatibleUNSDG Option.
	 *
	 *@author VijayaKumar.U
	 */
	public void select_Multiple_PlanCompatibleUNSDG_Option_Selected(String planCompatibleUNSDG1, String planCompatibleUNSDG2, String planCompatibleUNSDG3)
	{
		waitForElementToDisplay(drp_CompanyForm_PlanCompatibleWithUNSDG, this.elementLoadWaitTime);
		ArrayList<String> arr = new ArrayList<String>();
		arr.add(planCompatibleUNSDG1);
		arr.add(planCompatibleUNSDG2);
		arr.add(planCompatibleUNSDG3);
		int arrSize = arr.size();
		for (int i = 0; i < arrSize; i++) 		{
			String optionText = arr.get(i);
			clickOn(drp_CompanyForm_PlanCompatibleWithUNSDG);
			waitTime(1);
			typeIn(txt_CompanyForm_PlanCompatibleWithUNSDG, optionText);
			waitTime(1);
			List <WebElement> optlst = driver.findElements(By.xpath("//div[contains(@class,'application-form')]//div[contains(@id,'tab-company')]//span[contains(text(),'UN SDGs')]/parent::label/parent::div/parent::div/parent::div//div[contains(@class,'multiselect__content-wrapper')]//ul//li//span//span"));
			int optlstcount = optlst.size();
			for (WebElement opt : optlst) 	{
				String text = opt.getText();
				if (text.equalsIgnoreCase(optionText)) 
				{
					opt.click();
					break;
				}		}	}
		waitTime(1);
		List <WebElement> selectedOption = driver.findElements(By.xpath("//div[contains(@class,'application-form')]//div[contains(@id,'tab-company')]//span[contains(text(),'UN SDGs')]/parent::label/parent::div/parent::div/parent::div//input/parent::div/parent::div/following-sibling::div[contains(@class,'custom-selected-tags')]//div[contains(@class,'custom-tags-container')]"));
		int selectedOptionsize = selectedOption.size();
		try 		{
			if (selectedOptionsize==arrSize) 			{
				testStepPassed("Option selected count in Plan Compatible UNSDG dropdown and Selected options list count are same");
			}		} 
		catch (Exception e) 		{
			testStepFailed("Option selected count in Plan Compatible UNSDG dropdown and Selected options list count are not same");
		}	}
	//Newly Added - Start
	/**
	 *This method is used to click next button.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_Next_button()	{
		try {
			waitForElementToDisplay(btn_CompanyForm_Next, this.elementLoadWaitTime);
			clickOn(btn_CompanyForm_Next);
		}
		catch (Exception e){
			e.printStackTrace();
			testStepFailed("Element is not displayed."+e.getClass());
		}}

	/**
	 *This method is used to clear the details in the company page form
	 *
	 *@author VijayaKumar.U
	 */
	public void clear_CompanyPage_Form()
	{try {
		clearEditBox(txt_companyForm_CompanyName);
		clearEditBox(txt_companyForm_Website);
		clearEditBox(txt_companyForm_City);
		clearEditBox(txt_CompanyForm_CompanyDescription);
	}
	catch (Exception e){
		e.printStackTrace();		
		testStepFailed("Element is not displayed."+e.getClass());
	}}
	//Newly Added - End
	/**
	 *This method is used to fill company information
	 *
	 *@author VijayaKumar.U
	 */
	public void fillCompanyInformation(String legalName, String website, String city, String country, String companyDescription, String incorporationDate, String businessStatus, String industries, String UNSDGs)
	{

		enter_LegalName(legalName);
		enter_Website(website);
		enter_City(city);

		pressPageDown();
		select_Country(country);
		enter_CompanyDescription(companyDescription);

		select_BusinessStatus(businessStatus);
		pressPageDowntillelementVisible();
		select_Industries(industries);
		pressPageDowntillelementVisible();
		select_PlanCompatibleUNSDG(UNSDGs);
	}
	/**
	 *This method is used to get the company legal name.
	 *
	 *@author VijayaKumar.U
	 */
	public String get_CompanyLegalName_Value()
	{
		String text = getText(txt_companyForm_CompanyName);
		return text;
	}
	/**
	 *This method is used to fill company info without legal name
	 *@param website,city,country,companydescription,incorporatedate,businessStatus,industries,etc.
	 *@author VijayaKumar.U
	 */
	public void fillCompanyInformationWithoutLegalName(String website, String city, String country, String companyDescription, String incorporationDate, String businessStatus, String industries, String UNSDGs)
	{
		enter_Website(website);
		enter_City(city);
		select_Country(country);
		enter_CompanyDescription(companyDescription);
		waitTime(1);
		pressPageDown();

		pressPageDown();
		select_BusinessStatus(businessStatus);
		pressPageDown();
		select_Industries(industries);
		select_PlanCompatibleUNSDG(UNSDGs);
	}
	/**
	 *This method is used to fill Company Information Without Industries and UNSDG.
	 *
	 *@author VijayaKumar.U
	 */
	public void fillCompanyInformationWithoutIndustriesandUNSDG(String legalName, String website, String city, String country, String companyDescription, String incorporationDate, String businessStatus)
	{
		enter_LegalName(legalName);
		enter_Website(website);
		enter_City(city);
		select_Country(country);
		enter_CompanyDescription(companyDescription);
		//waitTime(1);
		pressPageDown();

		pressPageDown();
		select_BusinessStatus(businessStatus);
		pressPageDown();
	}

	/**
	 *This method is used to navigate to the next Company Information .
	 *
	 *@author VijayaKumar.U
	 */
	public void click_Next_CompanyInformation()
	{
		try {

			
			WebElement ele = findWebElement(btn_CompanyForm_Next);
			scrolltoElementView(ele);
			pressPageDown();
			click_Next_button();

		} catch (Exception e) {
			e.printStackTrace();
			testStepFailed("Could not click on next in Company Information" + e.getClass());
		}
	}

	public void click_Next_CompanyInformationUsingEnterKey()
	{
		try {
			//edited
			clickOn("Application Form#xpath=(//div[contains(@class,'application-form-container')])[1]");
			pressPageDown();
			String press = Keys.chord(Keys.ENTER);
			driver.findElement(By.xpath("//button[contains(text(),'Next')]")).sendKeys(press);

		} catch (Exception e) {
			e.printStackTrace();
			testStepFailed("Could not click on next in Company Information" + e.getClass());
		}
	}

	/**
	 *This method is used to click on form container
	 *
	 *@author VijayaKumar.U
	 */
	public void clickOnFormContainer()
	{
		try {
			clickOn(lbl_companyFormContainer);

		} catch (Exception e) {
			e.printStackTrace();
			testStepFailed("Could not click on Form container" + e.getClass());
		}
	}

	/**
	 *This method is used to verify invalid website format msgs.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_Invalid_Website_Format_Error_Message_displayed()
	{
		try 
		{
			waitForElementToDisplay(lbl_CompanyForm_InValidWebsite_error_Message, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_CompanyForm_InValidWebsite_error_Message))
			{
				testStepPassed("Enter Valid Website address error message is displayed");	
			}
			else testStepFailed("Enter Valid Website address error message is not displayed");
		} 
		catch (Exception e) 
		{e.printStackTrace();
		testStepFailed("Enter Valid Website address error message is not displayed " + e.getClass());
		}
	}

	public void upload(String filename,String filename2) {

		try {
			String currentDir = System.getProperty("user.dir");
			WebElement ele = findWebElement(btn_PitchDeck_Browse);
			scrolltoElementView(ele);

			clickOn(btn_PitchDeck_Browse);
			//			untime.getRuntime().exec("C:\\Users\\Mukesh_50\\Desktop\\My blog\\AutoIT\\fileUpload3.exe"+" "+"C:\\Users\\Mukesh_50\\Downloads\\HATHWAY.tx//t");
			System.out.println();
			waitTime(5);

			//Runtime.getRuntime().exec("E:\\Data\\Official\\Latest_Project\\iSafe_Hatcher\\FileToUpload\\cUpload.exe"+" "+"E:\\Data\\Official\\Latest_Project\\iSafe_Hatcher\\FileToUpload\\"+filename);
			Runtime.getRuntime().exec(currentDir+"\\FileToUpload\\cUpload.exe"+" "+currentDir+"\\FileToUpload\\"+filename);

			waitTime(10);
			System.out.println();
			String pageElement = "file #xpath=//a[contains(text(),'"+filename+"')]";
			String fileload = "file load#xpath= //a[contains(text(),'"+filename+"')]//parent::div//following-sibling::img";
			waitForElement(pageElement);
			if (isElementDisplayed(pageElement)) {
				testStepInfo(filename+" file - was displayed in Company Page");
				waitForElement(fileload);
				System.out.println();
			} else {
				testStepFailed(filename+"file - was not displayed in Company Page");
			}
			waitTime(10);
			clickOn(btn_PitchDeck_Browse);
			//			untime.getRuntime().exec("C:\\Users\\Mukesh_50\\Desktop\\My blog\\AutoIT\\fileUpload3.exe"+" "+"C:\\Users\\Mukesh_50\\Downloads\\HATHWAY.tx//t");
			System.out.println();
			waitTime(5);
			Runtime.getRuntime().exec(currentDir+"\\FileToUpload\\cUpload.exe"+" "+currentDir+"\\FileToUpload\\"+filename2);
			waitTime(10);
			String pageElement2 = "file #xpath=//a[contains(text(),'"+filename2+"')]";
			String fileload2 = "file load#xpath= //a[contains(text(),'"+filename2+"')]//parent::div//following-sibling::img";
			System.out.println();
			waitForElement(pageElement2);
			if (isElementDisplayed(pageElement2)) {
				testStepInfo(filename2.split("#xpath")[0] + " was displayed in Company Page");
				waitForElement(fileload2);

			} else {
				testStepFailed(filename2.split("#xpath")[0] + " was not displayed in Company Page");
			}

		}
		catch (Exception e) {
			e.printStackTrace();

			testStepFailed("Could not enter mandatory information" + e.getClass());
		}
	}


	/**
	 *This method is used to fill mandatory company info.
	 *@param legalName,website,companyDescription
	 *@author VijayaKumar.U
	 */
	public void fillMandatoryCompanyInformation(String legalName, String website, String companyDescription)
	{try {
		enter_LegalName(legalName);
		enter_Website(website);
		enter_CompanyDescription(companyDescription);
		waitTime(1);}
	catch (Exception e) {
		e.printStackTrace();
		testStepFailed("Could not enter mandatory information" + e.getClass());
	}
	}

	/**
	 *This method is used to verify the company description is less than 100 chars.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_CompanyDescription_LessThan_100Characters_RedColour_Message_displayed()	{
		try {
			waitForElementToDisplay(lbl_CompanyForm_CompanyDescription_LessThan100Characters_Red_Message, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_CompanyForm_CompanyDescription_LessThan100Characters_Red_Message))	{
				testStepPassed("Company description Less than 100 Characters Red Colour message is displayed");	
			}	else testStepFailed("Company description Less than 100 Characters Red Colour message is not displayed");} 
		catch (Exception e) 	{e.printStackTrace();
		testStepFailed("Company description Less than 100 Characters Red Colour message is not displayed "+ e.getClass());
		}
	}

	/**
	 *This method is used to verify the green colour message displayed when exceed 100 chars.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_CompanyDescription_100Characters_GreenColour_Message_displayed(){
		try {
			waitForElementToDisplay(lbl_CompanyForm_CompanyDescription_100Characters_Green_Message, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_CompanyForm_CompanyDescription_100Characters_Green_Message))	{
				testStepPassed("Company description 100 Characters Green Colour message is displayed");	
			}	else	testStepFailed("Company description 100 Characters Green Colour message is not displayed"); } 
		catch (Exception e) 	{
			e.printStackTrace();
			testStepFailed("Company description 100 Characters Green Colour message is not displayed" + e.getClass());
		}	}


	/**
	 *This method is used to verify investor label elements in company page.
	 *
	 *@author VijayaKumar.U
	 */

	public void verify_Investor_Registration_CompanyPage_Elements_labels_displayed(){
		try {
			String[] allInvestorLabelsElements = {lbl_companyForm_CompanyName,lbl_companyForm_Website,lbl_companyForm_City,lbl_companyForm_Country};
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
		}}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	//---------Edited by Priya.V-----Investor_Registration_CompanyPage_text box Elements--- method Enhancement----//
	public void verify_Investor_Registration_CompanyPage_Elements_displayed()	{
		try {
			String[] allInvestorElements = {txt_companyForm_CompanyName,txt_companyForm_Website,txt_companyForm_City,drp_companyForm_Country};
			for (String elementTobeVerified : allInvestorElements) {
				if (isElementDisplayed(elementTobeVerified)) {
					testStepInfo(elementTobeVerified.split("#xpath")[0] + " was displayed on the CompanyPage");
				} else {
					testStepFailed(elementTobeVerified.split("#xpath")[0] + " was not displayed on the CompanyPage");
				}	

			} }
		catch (Exception e) {
			testStepFailed("CompanyPage Textbox elements could not be verified");
			e.printStackTrace();
		}}


	/**
	 *This method is used to clear and edit the investor page form.
	 *
	 *@author VijayaKumar.U
	 */
	public void clear_Investor_CompanyPage_Form()	{	
		clearEditBox(txt_companyForm_CompanyName);
		clearEditBox(txt_companyForm_Website);
		clearEditBox(txt_companyForm_City);
	}
	/**
	 *This method is used to verify the registration of investor page elements
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_Investor_Registration_CompanyPage_Elements_PlaceHolderText_displayed()	{

		try {
			String[] allInvestorLabelsElements = {lbl_companyNamePlaceholder,lbl_websitePlaceholder,lbl_cityPlaceholder};
			for (String elementTobeVerified : allInvestorLabelsElements) {
				if (isElementDisplayed(elementTobeVerified)) {
					testStepInfo(elementTobeVerified.split("#xpath")[0] + " was displayed on the CompanyPage");
				} else {
					testStepFailed(elementTobeVerified.split("#xpath")[0] + " was not displayed on the CompanyPage");
				}	

			} }
		catch (Exception e) {
			testStepFailed("CompanyPage label elements could not be verified");
			e.printStackTrace();
		}}
	public void verify_elements_Label_InUpperCase()  {
		try {
			String[] allInvestorLabelsElements = {lbl_companyForm_CompanyName,lbl_companyForm_Website,lbl_companyForm_City,lbl_companyForm_Country};
			for (String labelElement : allInvestorLabelsElements) {
				if (isElementDisplayed(labelElement)) {
					String value = getText(labelElement);
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
	 *This method is used to fill investor details in company info.
	 *@param legal name,website,city,country
	 *@author VijayaKumar.U
	 */
	public void fillInvestorCompanyInformation(String legalName, String website, String city, String country)	{
		enter_LegalName(legalName);
		enter_Website(website);
		enter_City(city);
		select_Country(country);
	}
	/**
	 *This method is used to fill investor info without website address.
	 *
	 *@author VijayaKumar.U
	 */
	public void fillInvestorCompanyInformationWithoutWebsiteAddress(String legalName, String city, String country)
	{
		enter_LegalName(legalName);
		enter_City(city);

		select_Country(country);
		verify_select_Country(country);
	}
	/**
	 *This method is used to fill investor without legal name.
	 *@param website,city,country.
	 *@author VijayaKumar.U
	 */
	public void fillInvestorCompanyInformationWithoutLegalname(String website, String city, String country)
	{
		enter_Website(website);
		enter_City(city);
		select_Country(country);
		verify_select_Country(country);
	}
	public void fillInvestorCompany(String legalName,String website, String city, String country)
	{
		enter_LegalName(legalName);
		enter_Website(website);
		enter_City(city);
		select_Country(country);
		verify_select_Country(country);
	}
	/**
	 *This method is used to fill investor info without city.
	 *@param legal name ,website,country.
	 *@author VijayaKumar.U
	 */
	public void fillInvestorCompanyInformationWithoutCity(String legalName, String website, String country)
	{
		enter_LegalName(legalName);
		enter_Website(website);
		select_Country(country);
	}
	/**
	 *This method is used to verify the next button is disabled.
	 *
	 *@author VijayaKumar.U
	 */
	public void verifyNextButton_isdisabled()
	{
		try 
		{
			String disabledText = getAttributeValue(btn_next, "disabled");
			if(disabledText.equals("true"))
			{
				testStepPassed("Next button is in Disabled State");	
			}
			else {
				testStepFailed("Next button is not in Disabled State");//newly added
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Next button verification failed"+e.getClass());e.printStackTrace();
		}
	}

	public void verify_PlaceHolder_After_Pressing_Tab() {
		try 
		{      
			waitForElementToDisplay(txt_companyForm_CompanyName, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_companyForm_CompanyName)) {
				clickOn(txt_companyForm_CompanyName);
				String press = Keys.chord(Keys.TAB);
				enter_LegalName(press);
				String value = driver.switchTo().activeElement().getAttribute("placeholder");       
				if (value.contains("www.websitename.com")) 
				{
					testStepPassed(value+" place holder text is displayed After tab in first name text box");
				}
			}

		}

		catch (NoSuchElementException e) 
		{
			e.printStackTrace();
			testStepFailed("Signup button is not in disabled state in SignUp Page");
		}
	}

	public void verify_PlaceHolder_After_Pressing_Shift_And_Tab() {
		try 
		{      
			waitForElementToDisplay(txt_companyForm_Website, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_companyForm_Website)) {
				clickOn(txt_companyForm_Website);
				String press = Keys.chord(Keys.SHIFT,Keys.TAB);
				enter_Website(press);
				String value = driver.switchTo().activeElement().getAttribute("placeholder");       
				if (value.contains("Ltd")) 
				{
					testStepPassed(value+" place holder text is displayed After Shift + tab in Last name text box");
				}
				else {
					testStepFailed("Place holder doesnot support shift tab keys ");//newly added
				}
			}

		}

		catch (NoSuchElementException e) 
		{
			e.printStackTrace();
			testStepFailed("Signup button is not in disabled state in SignUp Page");
		}
	}


	public void verifyNextButton_isenabled()
	{
		try 
		{
			if(isElementDisplayed(btn_CompanyForm_Next))
			{
				testStepPassed("Next button is in Enabled State");	
			}
			else {
				testStepFailed("Next button is not in Enabled State");//newly added
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Next button is not verified"+e.getClass());e.printStackTrace();
		}
	}/**
	 *This method is used to error message display for currency in investor info.
	 *@param currency.
	 *
	 *@author VijayaKumar.U
	 */
	//	public void verify_Investor_Country_ErrorMessage_displayed_InvalidCountry(String currency)
	//	{
	//		waitForElementToDisplay(drp_companyForm_Country, this.elementLoadWaitTime);
	//		clickOn(drp_companyForm_Country);
	//		waitTime(1);
	//		typeIn(txt_CompanyForm_Country, currency);
	//		waitTime(1);
	//		try 
	//		{
	//			if (isElementDisplayed(lbl_Country_Invalid_ErrorMessage)) 			{
	//				testStepPassed("No results found message is displayed for invalid Country keyword");
	//			}
	//			else {
	//				testStepFailed("No results found message is not displayed for invalid Country keyword");
	//			}
	//		} 
	//		catch (Exception e) 
	//		{
	//			testStepFailed("No results found message is not displayed for invalid Country keyword");
	//		}
	//		clearEditBox(txt_CompanyForm_Country);
	//		driver.findElement(By.xpath("//div[contains(@class,'section bg-lighter overflow-auto')]//div[contains(@class,'application-form-container')]")).click();
	//
	//	}
	/**
	 *This method is used to get legal name value in company page.
	 *
	 *@author VijayaKumar.U
	 */
	public String get_CompanyPage_LegalName_Value()
	{
		String text = getAttributeValue(txt_companyForm_CompanyName, "value").trim();
		return text;
	}
	/**
	 *This method is used to get the website value from company page.
	 *
	 *@author VijayaKumar.U
	 */
	public String get_CompanyPage_Website_Value()
	{

		String text = getAttributeValue(txt_companyForm_Website, "value").trim();
		return text;
	}
	/**
	 *This method is used to get city value from company page.
	 *
	 *@author VijayaKumar.U
	 */
	public String get_CompanyPage_City_Value()
	{

		String text = getAttributeValue(txt_companyForm_City, "value").trim();
		return text;
	}

	//Newly Added

	public void verifyNextButton_isenabledforCompanyPage()
	{
		try 
		{ 
			pressPageDowntillelementVisible(btn_CompanyForm_Next);
			if(isElementDisplayed(btn_CompanyForm_Next))
			{
				testStepPassed("Next button is in Enabled State");	
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Next button is not in Enabled State");
		}
	}

	public void verifyNextButton_isdisabledforCompanyPage()
	{
		try 
		{
			String disabledText = getAttributeValue(btn_next, "disabled");
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

	public void select_BusinessStatusforCompanyPage(String businessStatus)
	{
		try {
			WebElement ele = findWebElement(drp_CompanyForm_BusinessStatus);
			scrolltoElementView(ele);
			//	pressPageDowntillelementVisible(drp_CompanyForm_BusinessStatus);
			//	waitForElementToDisplay(drp_CompanyForm_BusinessStatus, this.elementLoadWaitTime);
			clickOn(drp_CompanyForm_BusinessStatus);
			//waitTime(1);
			//			ele.click();
			//			ele.sendKeys(businessStatus);
			typeIn(txt_CompanyForm_BusinessStatus, businessStatus);
			waitTime(1);

			//	List <WebElement> optlst = findWebElements("Business #xpath=//span[contains(text(),'Business status')]/parent::label/parent::div//div[contains(@class,'multiselect__content-wrapper')]//ul//li//span//span");
			List <WebElement> optlst = findWebElements("Business #xpath=//span[contains(text(),'"+businessStatus+"')]");
			int optlstcount = optlst.size();

			for (WebElement opt : optlst) 		{
				String text = opt.getText();
				if (text.equalsIgnoreCase(businessStatus))	{
					opt.click();
					break;
				}		}			}
		catch (Exception e)	{
			e.printStackTrace();
			testStepFailed("Could not clear description " + e.getClass());		}	
	}

	public void verify_Investor_Country_ErrorMessage_displayed_InvalidCountry(String currency)
	{

		try 
		{waitForElementToDisplay(drp_companyForm_Country, this.elementLoadWaitTime);
		clickOn(drp_companyForm_Country);
		waitTime(1);
		typeIn(txt_CompanyForm_Country, currency);
		waitTime(1);
		if (isElementDisplayed(lbl_Country_Invalid_ErrorMessage)) 			{
			testStepPassed("No results found message is displayed for invalid Country keyword");
		}
		} 
		catch (Exception e) 
		{
			testStepFailed("No results found message is not displayed for invalid Country keyword");
		}
		//	clearEditBox(txt_CompanyForm_Country);
		//	driver.findElement(By.xpath("//div[contains(@class,'section bg-lighter overflow-auto')]//div[contains(@class,'application-form-container')]")).click();

	}

	public void verify_Investor_Country_ErrorMessage_displayed_InvalidBusiness(String businessStatus)
	{

		try 
		{
			WebElement ele = findWebElement(drp_CompanyForm_BusinessStatus);
			scrolltoElementView(ele);
			clickOn(drp_CompanyForm_BusinessStatus);
			typeIn(txt_CompanyForm_BusinessStatus, businessStatus);
			waitTime(1);
			if (isElementDisplayed(lbl_Country_Invalid_ErrorMessageinBusiness)) 			{
				testStepPassed("No results found message is displayed for invalid business Status keyword");
			}else {
				testStepFailed("No results found message is not displayed for invalid business Status keyword");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("No results found message is not displayed for invalid business Status keyword");
		}
		//	clearEditBox(txt_CompanyForm_Country);
		//	driver.findElement(By.xpath("//div[contains(@class,'section bg-lighter overflow-auto')]//div[contains(@class,'application-form-container')]")).click();

	}

	public void select_IndustriesforCompanyPage(String industries)	{

		try{			
			WebElement ele = findWebElement(drp_CompanyForm_BusinessStatus);
			scrolltoElementView(ele);
			clickOn(drp_CompanyForm_Industries);
			//	waitTime(1);
			typeIn(txt_CompanyForm_Industries, industries);
			waitTime(1);
			//List <WebElement> optlst = driver.findElements(By.xpath("//div[contains(@class,'application-form')]//div[contains(@id,'tab-company')]//span[contains(text(),'Industries')]/parent::label/parent::div/parent::div/parent::div//div[contains(@class,'multiselect__content-wrapper')]//ul//li//span//span"));
			List <WebElement> optlst = findWebElements("Business #xpath=//span[contains(text(),'"+industries+"')]");

			int optlstcount = optlst.size();

			for (WebElement opt : optlst) {
				String text = opt.getText();
				if (text.equalsIgnoreCase(industries)) 	{
					opt.click();
					break;
				}	}	
		}catch (Exception e)	{
			e.printStackTrace();
			testStepFailed("Could not clear description " + e.getClass());		}	
	}

	public void verify_Investor_Country_ErrorMessage_displayed_InvalidIndustries(String industries)
	{

		try 
		{
			//			WebElement ele = findWebElement(drp_CompanyForm_Industries);
			//			scrolltoElementView(ele);
			clickOn(drp_CompanyForm_Industries);
			//waitTime(1);
			typeIn(txt_CompanyForm_Industries, industries);
			//	waitTime(1);

			if (isElementDisplayed(lbl_Country_Invalid_ErrorMessageinIndustries)) 			{
				testStepPassed("No results found message is displayed for invalid Industries keyword");
			}
			else {
				testStepFailed("No results found message is not displayed for invalid Industries keyword");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("No results found message is not displayed for invalid Industries keyword");
		}
		//	clearEditBox(txt_CompanyForm_Country);
		//		driver.findElement(By.xpath("//div[contains(@class,'section bg-lighter overflow-auto')]//div[contains(@class,'application-form-container')]")).click();

	}	

	public void verify_Investor_Country_ErrorMessage_displayed_InvalidUNSDGforCompanyPage(String planCompatibleUNSDG)
	{

		try 
		{
			WebElement ele = findWebElement(drp_CompanyForm_PlanCompatibleWithUNSDG);
			scrolltoElementView(ele);
			waitForElementToDisplay(drp_CompanyForm_PlanCompatibleWithUNSDG, this.elementLoadWaitTime);
			clickOn(drp_CompanyForm_PlanCompatibleWithUNSDG);
			waitTime(1);
			typeIn(txt_CompanyForm_PlanCompatibleWithUNSDG, planCompatibleUNSDG);
			waitTime(1);

			if (isElementDisplayed(lbl_Country_Invalid_ErrorMessageinUNSDGs)) 			{
				testStepPassed("No results found message is displayed for invalid UNSGS keyword");
			}
			else {
				testStepFailed("No results found message is not displayed for invalid UNSGS keyword");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("No results found message is not displayed for invalid Industries keyword");
		}

		

	}
	/**
	 *This method is used to select multiple PlanCompatibleUNSDG Option.
	 *
	 *@author VijayaKumar.U
	 */
	public void select_Multiple_PlanCompatibleUNSDG_Option_SelectedforCompanyPage(String planCompatibleUNSDG1, String planCompatibleUNSDG2, String planCompatibleUNSDG3)
	{
		try{
			WebElement ele = findWebElement(drp_CompanyForm_PlanCompatibleWithUNSDG);
			scrolltoElementView(ele);
			waitForElementToDisplay(drp_CompanyForm_PlanCompatibleWithUNSDG, this.elementLoadWaitTime);
			ArrayList<String> arr = new ArrayList<String>();
			arr.add(planCompatibleUNSDG1);
			arr.add(planCompatibleUNSDG2);
			arr.add(planCompatibleUNSDG3);
			int arrSize = arr.size();
			for (int i = 0; i < arrSize; i++) 		{
				String optionText = arr.get(i);
				clickOn(drp_CompanyForm_PlanCompatibleWithUNSDG);
				waitTime(1);
				typeIn(txt_CompanyForm_PlanCompatibleWithUNSDG, optionText);
				waitTime(1);
				List <WebElement> optlst = findWebElements("PlanCompatible With UNSDG #xpath=//span[contains(text(),'"+optionText+"')]");
				int optlstcount = optlst.size();
				for (WebElement opt : optlst) 	{
					String text = opt.getText();
					if (text.equalsIgnoreCase(optionText)) 
					{
						opt.click();
						break;
					}		}	
			}
			waitTime(1);
			List <WebElement> selectedOption = driver.findElements(By.xpath("//span[contains(text(),'UN SDGs')]/ancestor::div[@class='custom-multiselect']//span[@class='custom-tags']"));
			int selectedOptionsize = selectedOption.size();

			if (selectedOptionsize==arrSize) 			{
				testStepPassed("Option selected count in Plan Compatible UNSDG dropdown and Selected options list count are same");
			}		
		} 
		catch (Exception e) 		{
			testStepFailed("Option selected count in Plan Compatible UNSDG dropdown and Selected options list count are not same");
		}	}

	public void select_PlanCompatibleUNSDGforCompanyPageforCompanyPage(String planCompatibleUNSDG)
	{
		try 
		{
			WebElement ele = findWebElement(drp_CompanyForm_PlanCompatibleWithUNSDG);
			scrolltoElementView(ele);
			waitForElementToDisplay(drp_CompanyForm_PlanCompatibleWithUNSDG, this.elementLoadWaitTime);
			clickOn(drp_CompanyForm_PlanCompatibleWithUNSDG);
			waitTime(1);
			typeIn(txt_CompanyForm_PlanCompatibleWithUNSDG, planCompatibleUNSDG);
			waitTime(1);
			List <WebElement> optlst = findWebElements("PlanCompatible With UNSDG #xpath=//span[contains(text(),'"+planCompatibleUNSDG+"')]");
			int optlstcount = optlst.size();		
			for (WebElement opt : optlst) 
			{
				String text = opt.getText();
				if (text.equalsIgnoreCase(planCompatibleUNSDG)) 
				{
					opt.click();
					break;
				}
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Unable to select Plan Compatible - UNSDG for CompanyPage");
		}
	}

}