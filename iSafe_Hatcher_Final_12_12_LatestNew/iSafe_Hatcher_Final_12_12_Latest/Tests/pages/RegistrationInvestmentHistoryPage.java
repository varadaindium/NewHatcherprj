package pages;

import iSAFE.ApplicationKeywords;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import baseClass.BaseClass;

public class RegistrationInvestmentHistoryPage extends ApplicationKeywords {
	private static final String lbl_InvestmentHistory = "Investment History Heading#xpath=//*[text()='Investment history']";
	private static final String txt_InvestmentHistory_Capital = "Capital Amount#xpath=//span[contains(text(),'How much capital')]/parent::label/parent::div//input";
	private static final String drp_InvestmentHistory_Currency = "Current Format Dropdown#xpath=//span[contains(text(),'Currency')]/parent::label/parent::div//div[contains(@class,'multiselect__select')]";
	private static final String txt_InvestmentHistory_Currency = "Current Format Textbox #xpath=//span[contains(text(),'Currency')]/parent::label/parent::div//input";
	private static final String drp_InvestmentHistory_CurrentInvestmentRound = "Current Investment round Dropdown #xpath=//span[contains(text(),'Current investment round')]/parent::label/parent::div//div[contains(@class,'multiselect__select')]";
	private static final String txt_InvestmentHistory_CurrentInvestmentRound = "Current Investment round Textbox in Investment History Form#xpath=//span[contains(text(),'Current investment round')]/parent::label/parent::div//input";
	private static final String txt_InvestmentHistory_PercentageofExchangeCapital = "Percentage of Exchnage Capital Textbox in Investment History Form#xpath=//span[contains(text(),'exchange of capital')]/parent::label/parent::div//input";
	private static final String drp_InvestmentHistory_FundingRounds = "Funding Rounds Dropdown#xpath=//span[contains(text(),'previous funding round')]/parent::label/parent::div//div[contains(@class,'multiselect__select')]";
	private static final String txt_InvestmentHistory_FundingRounds = "Funding Rounds Textbox#xpath=//span[contains(text(),'previous funding round')]/parent::label/parent::div//input";//updated

	private static final String drp_InvestmentHistory_Stage = "Stage Dropdown#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//span[contains(text(),'Stage')]/parent::label/parent::div//div[contains(@class,'multiselect__select')]";
	private static final String txt_InvestmentHistory_Stage = "Stage Textbox in Investment History Form#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//span[contains(text(),'Stage')]/parent::label/parent::div//input";

	private static final String txt_InvestmentHistory_HowMuchCapitalDidYouRaise = "How much capital did you raise Textbox in Investment History Form#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//span[contains(text(),'How much capital did you raise')]/parent::label/parent::div//input";
	private static final String txt_InvestmentHistory_PercentageofYourBusinessinExchangeofCapital = "Percentage of your business in exchange of capital Textbox in Investment History Form#xpath=(//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//span[contains(text(),'What percentage of your business in exchange of capital')]/parent::label/parent::div//input)[2]";

	private static final String txt_InvestmentHistory_DateClosed = "Date Closed Textbox in Investment History Form#xpath=(//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//span[contains(text(),'Date closed')]/parent::label/parent::div//input)[1]";
	//	private static final String tbl_InvestmentHistory_DateClosed = "Date Closed Table in Investment History Form#xpath=(//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//span[contains(text(),'Date closed')]/parent::label/parent::div//input/following-sibling::div//div[contains(@class,'grid-container')])[1]";
	private static final String tbl_InvestmentHistory_DateClosed = "Date Closed Table in Investment History Form#xpath=//span[contains(text(),'Date closed')]/parent::label/parent::div//input/following-sibling::div//div[contains(@class,'vc-grid-container vc-weeks')]";
	private static final String txt_InvestmentHistory_InvestorsDuringThisRound = "Investors during this round Textbox in Investment History Form#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//span[contains(text(),'Investors during this round')]/parent::label/parent::div//input";
	private static final String lnk_InvestmentHistory_RemoveThisFundingRound = "Remove this funding round link in Investment History Form#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//a[contains(text(),'Remove this funding round')]";
	private static final String lnk_InvestmentHistory_AddMoreFundingRound = "Add more funding round link in Investment History Form#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//span[contains(text(),'Add more funding round')]";

	private static final String btn_InvestmentHistory_Back = "Back button in Investment History Form#xpath=//a[contains(text(),'Back')]";
	private static final String btn_InvestmentHistory_Next = "Next button in Investment History Form#xpath=//button[contains(text(),'Next')]";

	private static final String lbl_InvestmentHistory_Capital = "Capital Label #xpath=//span[contains(text(),'How much capital')]";
	private static final String lbl_InvestmentHistory_Currency = "Currency Label #xpath=//span[contains(text(),'Currency')]";
	private static final String lbl_InvestmentHistory_CurrentInvestmentRound = "Current Investment Round #xpath=//span[contains(text(),'Current investment round')]";
	private static final String lbl_InvestmentHistory_PercentageofExchangeCapital = "Percentage of Exchnage Capital Label#xpath=//span[contains(text(),'exchange of capital')]";
	private static final String lbl_InvestmentHistory_FundingRounds = "Funding Rounds Label#xpath=//span[contains(text(),'previous funding round')]";//updated
	private static final String lbl_InvestmentHistory_Stage = "Stage Label in Investment History Form#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//span[text()='Stage']";

	private static final String lbl_InvestmentHistory_HowMuchCapitalDidYouRaise = "How much capital did you raise Label in Investment History Form#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//span[contains(text(),'How much capital did you raise')]";
	private static final String lbl_InvestmentHistory_PercentageofYourBusinessinExchangeofCapital = "Percentage of your business in exchange of capital Label in Investment History Form#xpath=(//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//span[contains(text(),'What percentage of your business in exchange of capital')])[2]";
	private static final String lbl_InvestmentHistory_DateClosed = "Date closed Label in Investment History Form#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//span[contains(text(),'Date closed')]";
	private static final String lbl_InvestmentHistory_InvestorsDuringThisRound = "Investors during this round Label in Investment History Form#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//span[contains(text(),'Investors during this round')]";

	private static final String lbl_InvestmentHistory_Currency_Invalid_ErrorMessage = "Invalid Currency Error Message is displayed in Investment History Form#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//span[contains(text(),'Currency')]/parent::label/parent::div//div[contains(@class,'multiselect__content-wrapper')]//ul[contains(@class,'multiselect__content')]//li//span[contains(@class,'multiselect__option')]//span[contains(text(),'No results found. Consider changing the search query')]";
	private static final String lbl_InvestmentHistory_CurrentInvestmentRound_Invalid_ErrorMessage = "Invalid Current Investment round Error Message is displayed in Investment History Form#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//span[contains(text(),'Current investment round')]/parent::label/parent::div//div[contains(@class,'multiselect__content-wrapper')]//ul[contains(@class,'multiselect__content')]//li//span[contains(@class,'multiselect__option')]//span[contains(text(),'No results found. Consider changing the search query')]";
	private static final String lbl_InvestmentHistory_FundingRound_Invalid_ErrorMessage = "Invalid Funding Round Error Message is displayed in Investment History Form#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//span[contains(text(),'funding round')]/parent::label/parent::div//div[contains(@class,'multiselect__content-wrapper')]//ul[contains(@class,'multiselect__content')]//li//span[contains(@class,'multiselect__option')]//span[contains(text(),'No results found. Consider changing the search query')]";
	private static final String lbl_InvestmentHistory_Stage_Invalid_ErrorMessage = "Invalid Stage Error Message is displayed in Investment History Form#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//span[contains(text(),'Stage')]/parent::label/parent::div//div[contains(@class,'multiselect__content-wrapper')]//ul[contains(@class,'multiselect__content')]//li//span[contains(@class,'multiselect__option')]//span[contains(text(),'No results found. Consider changing the search query')]";
	private static final String lst_InvestmentHistory_Currency_OptionsContainer = "Currency Options Container is displayed in Investment History Form#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//span[contains(text(),'Currency')]/parent::label/parent::div//div[contains(@class,'multiselect__content-wrapper')]";
	private static final String lst_InvestmentHistory_CurrentInvestmentRound_OptionsContainer = "Current Investment round Options Container is displayed in Investment History Form#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//span[contains(text(),'Current investment round')]/parent::label/parent::div//div[contains(@class,'multiselect__content-wrapper')]";
	private static final String lst_InvestmentHistory_FundingRound_OptionsContainer = "Funding Round Options Container is displayed in Investment History Form#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//span[contains(text(),'funding round')]/parent::label/parent::div//div[contains(@class,'multiselect__content-wrapper')]";
	private static final String lst_InvestmentHistory_Stage_OptionsContainer = "Stage Options Container is displayed in Investment History Form#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//span[contains(text(),'Stage')]/parent::label/parent::div//div[contains(@class,'multiselect__content-wrapper')]";
	private static final String lbl_InvestmentHistory_FundingRound_No_OptionsSelected = "Funding Round No Option selected in Investment History Form#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//span[contains(text(),'previous funding round')]/parent::label/parent::div//input/parent::div/parent::div//div[contains(@class,'multiselect__content-wrapper')]//li[contains(@class,'multiselect__element')]//span[contains(@class,'option--selected')]//span[contains(text(),'No')]";

	private static final String lbl_InvestmentHistory_Currency_Value = "Currency value of Investment History page#xpath=(//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//span[contains(text(),'Currency')]/parent::label/parent::div//input/following::span[contains(@class,'multiselect__single')])[1]";
	private static final String lbl_InvestmentHistory_CurrentInvestmentRound_Value = "Current Investment round value of Investment History page#xpath=(//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//span[contains(text(),'Current investment round')]/parent::label/parent::div//input/following::span[contains(@class,'multiselect__single')])[1]";
	private static final String lbl_InvestmentHistory_PreviousInvestmentRound_Value = "Previous Investment round value of Investment History page#xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//span[contains(text(),'Do you have any previous funding round')]/parent::label/parent::div//input/following::span[contains(@class,'multiselect__placeholder')]";
private static final String tbl_DateRightArrow="RightArrowDate#xpath=//a//i[@class='fal fa-angle-right text-color nav-arrows']";
private static final String tbl_DatePicked="PickDate#xpath=//span[contains(text(),'14')]";
//private static final String lbl_msg="PleaseMsg#xpath=//h5[contains(text(),'Please provide')]";
	public RegistrationInvestmentHistoryPage(BaseClass obj) {
		super(obj);
	}

	/**
	 * This method is used to verify the display the investment history in the
	 * registration.
	 *
	 * @author VijayaKumar.U
	 */
	public void verify_Registration_InvestmentHistory_displayed() {
		try {
			waitForElementToDisplay(lbl_InvestmentHistory, this.elementLoadWaitTime);
			if (isElementDisplayed(lbl_InvestmentHistory)) {
				testStepPassed("Investment History page is displayed");
			} // Newly Added � Start
			else {
				testStepFailed("Investment History page is not displayed");
			}
		} catch (Exception e) {
			//			testStepFailed("Investment History page is not displayed");
			testStepFailed("Could not verify the display of the investment history in the registration. Exception: "
					+ e.getClass());
			e.printStackTrace();
		} // Newly Added � End
	}

	/**
	 * This method is used to verify the page elements of investment history page.
	 *
	 * @author VijayaKumar.U
	 */
	public void verify_PlaceHolderInvestmentHistory_After_Pressing_Tab() {
		try 
		{      
			waitForElementToDisplay(txt_InvestmentHistory_Capital, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_InvestmentHistory_Capital)) {
				clickOn(txt_InvestmentHistory_Capital);
				String press = Keys.chord(Keys.TAB);
				enter_CapitalAmount(press);
				String value = driver.switchTo().activeElement().getAttribute("placeholder");       
				if (value.equalsIgnoreCase("Select Currency")) 
				{
					testStepPassed(value+" place holder text is displayed After tab in Capital amount text box");
				}	
				else{
					
					}
				}
		}

		catch (NoSuchElementException e) 
		{
			e.printStackTrace();
			testStepFailed("Element not displayed"+e.getClass());
		}
	}
	public void verify_PlaceHolderInvestmentHistory_After_Pressing_ShiftAndTab() {
		try 
		{      
			waitForElementToDisplay(txt_InvestmentHistory_Currency, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_InvestmentHistory_Currency)) {
				clickOn(txt_InvestmentHistory_Currency);
				String press = Keys.chord(Keys.SHIFT,Keys.TAB);
				//enter_CapitalAmount(press);
			    typeIn(txt_InvestmentHistory_Currency, press);
				String value = driver.switchTo().activeElement().getAttribute("placeholder");       
				if (value.equalsIgnoreCase("$0 - $50,000,000")) 
				{
					testStepPassed(value+" place holder text is displayed After tab in Capital amount text box");
				}			}
		}

		catch (NoSuchElementException e) 
		{
			e.printStackTrace();
			testStepFailed("Element not displayed"+e.getClass());
		}
	}
	//newly added
	public void verify_Registration_InvestmentHistoryPage_Elements_displayed() {

		try {
			String[] allInvestmentHistoryPage = {lbl_InvestmentHistory_Capital,txt_InvestmentHistory_Capital,lbl_InvestmentHistory_Currency,drp_InvestmentHistory_Currency,lbl_InvestmentHistory_CurrentInvestmentRound,drp_InvestmentHistory_CurrentInvestmentRound,lbl_InvestmentHistory_PercentageofExchangeCapital,txt_InvestmentHistory_PercentageofExchangeCapital,lbl_InvestmentHistory_PreviousInvestmentRound_Value,drp_InvestmentHistory_FundingRounds,btn_InvestmentHistory_Back,btn_InvestmentHistory_Next};
			//newly added			

			for (String elementTobeVerified : allInvestmentHistoryPage) {
				WebElement ele = findWebElement(elementTobeVerified);
				scrolltoElementView(ele);
				if (isElementDisplayed(elementTobeVerified)) {

					testStepPassed(elementTobeVerified.split("#xpath")[0] + " was displayed on the page");
				
				} else {

					testStepFailed(elementTobeVerified.split("#xpath")[0] + " was not displayed on the  page");
				}	

			} }
		catch (Exception e) {
			testStepFailed("Investment History Page elements could not be verified");
			e.printStackTrace();
		}}
	public void verify_allElementsFirstLetter_InUpperCase()  {

		try {

			String[] allplaceholderElements = {lbl_InvestmentHistory_Capital,txt_InvestmentHistory_Capital,lbl_InvestmentHistory_Currency,drp_InvestmentHistory_Currency,lbl_InvestmentHistory_CurrentInvestmentRound,drp_InvestmentHistory_CurrentInvestmentRound,lbl_InvestmentHistory_PercentageofExchangeCapital,txt_InvestmentHistory_PercentageofExchangeCapital,lbl_InvestmentHistory_PreviousInvestmentRound_Value,drp_InvestmentHistory_FundingRounds};

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
	public void verify_labelElementsWith_FundingRoundFirstLetter_InUpperCase()  {

		try {

			String[] allplaceholderElements = {lbl_InvestmentHistory_PreviousInvestmentRound_Value,lbl_InvestmentHistory_Stage,drp_InvestmentHistory_Stage,lbl_InvestmentHistory_HowMuchCapitalDidYouRaise,txt_InvestmentHistory_HowMuchCapitalDidYouRaise,lbl_InvestmentHistory_PercentageofYourBusinessinExchangeofCapital,txt_InvestmentHistory_PercentageofYourBusinessinExchangeofCapital,lbl_InvestmentHistory_DateClosed,tbl_InvestmentHistory_DateClosed,txt_InvestmentHistory_DateClosed,lbl_InvestmentHistory_InvestorsDuringThisRound,txt_InvestmentHistory_InvestorsDuringThisRound,lnk_InvestmentHistory_RemoveThisFundingRound,lnk_InvestmentHistory_AddMoreFundingRound,btn_InvestmentHistory_Back,btn_InvestmentHistory_Next};

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
	public void verify_Registration_InvestmentHistoryPage_Elements_WithSelect_Round_Yes_displayed() {

		try {
			String[] allInvestHistoryPage = {lbl_InvestmentHistory_Stage,drp_InvestmentHistory_Stage,lbl_InvestmentHistory_HowMuchCapitalDidYouRaise,
					txt_InvestmentHistory_HowMuchCapitalDidYouRaise,lbl_InvestmentHistory_PercentageofYourBusinessinExchangeofCapital,
					txt_InvestmentHistory_PercentageofYourBusinessinExchangeofCapital,lbl_InvestmentHistory_DateClosed,
					txt_InvestmentHistory_DateClosed,lbl_InvestmentHistory_InvestorsDuringThisRound,
					txt_InvestmentHistory_InvestorsDuringThisRound,lnk_InvestmentHistory_RemoveThisFundingRound,
					lnk_InvestmentHistory_AddMoreFundingRound};
			//newly added			

			for (String elementTobeVerified : allInvestHistoryPage) {
				WebElement ele = findWebElement(elementTobeVerified);
				scrolltoElementView(ele);
				if (isElementDisplayed(elementTobeVerified)) {

					testStepPassed(elementTobeVerified.split("#xpath")[0] + " was displayed on the  page");
				} else {
					testStepFailed(elementTobeVerified.split("#xpath")[0] + " was not displayed on the  page");
				}	

			} }
		catch (Exception e) {
			testStepFailed("Investment History Page elements could not be verified");
			e.printStackTrace();
		}}

	public void verifyDateClosed() {
		try {
			WebElement ele = findWebElement(txt_InvestmentHistory_DateClosed);
			scrolltoElementView(ele);

			waitForElementToDisplay(txt_InvestmentHistory_DateClosed, this.elementLoadWaitTime);
			clickOn(txt_InvestmentHistory_DateClosed);
			waitTime(1);
			if(isElementDisplayed(txt_InvestmentHistory_DateClosed)) {//edited
				testStepPassed(txt_InvestmentHistory_DateClosed.split("#xpath")[0] + " was displayed on the  page");
			} else {
				testStepFailed(txt_InvestmentHistory_DateClosed.split("#xpath")[0] + " was not displayed on the  page");
			}	

			//WebElement yesElement=findWebElement("Yes option in Funding round#xpath=//span[contains(text(),'previous funding round')]/parent::label/parent::div//div[contains(@class,'multiselect__content-wrapper')]//ul//li//span//span[contains(text(),'Yes')]");
			//selectFromDropdown(drp_InvestmentHistory_FundingRounds, "Yes");

			waitTime(1);
		}
		catch (Exception e) {
			testStepFailed("Investment History Page elements could not be verified");
			e.printStackTrace();
		}
	}
	public void date_ClosedSelect() {
		try {
			if(isElementDisplayed(tbl_DateRightArrow)) {
				clickOn(tbl_DateRightArrow);
				testStepPassed("The Right Arrow present in the Date Closed Element.");
				if(isElementDisplayed(tbl_DatePicked)) {
					clickOn(tbl_DatePicked);
					testStepPassed("The Date is selected .");
					}
				else {
					testStepFailed("The Date is not selected.");
				}
			
				}
			else {
				testStepFailed("The Right Arrow is not present in the display");
			}
		}
		catch (Exception e) {
			testStepFailed("Investment History Page elements could not be verified");
			e.printStackTrace();
		}
	}
	/*public void verify_Registration_InvestmentHistoryPage_Elements_displayed() {
		waitForElementToDisplay(lbl_InvestmentHistory, this.elementLoadWaitTime);
		try {
			if (isElementDisplayed(txt_InvestmentHistory_Capital)) {
				testStepPassed("How much Capital Textbox is displayed");
			}
		} catch (Exception e) {
			testStepFailed("How much Capital Textbox is not displayed");
		}

		try {
			if (isElementDisplayed(drp_InvestmentHistory_Currency)) {
				testStepPassed("Currency Dropdown is displayed");
			}
		} catch (Exception e) {
			testStepFailed("Currency Dropdown is not displayed");
		}

		try {
			if (isElementDisplayed(drp_InvestmentHistory_CurrentInvestmentRound)) {
				testStepPassed("Current Investment Round Dropdown is displayed");
			}
		} catch (Exception e) {
			testStepFailed("Current Investment Round Dropdown is not displayed");
		}

		try {
			if (isElementDisplayed(txt_InvestmentHistory_PercentageofExchangeCapital)) {
				testStepPassed("Percentage of Exchange Capital Textbox is displayed");
			}
		} catch (Exception e) {
			testStepFailed("Percentage of Exchange Capital Textbox is not displayed");
		}

		try {
			if (isElementDisplayed(drp_InvestmentHistory_FundingRounds)) {
				testStepPassed("Funding Rounds Dropdown is displayed");
			}
		} catch (Exception e) {
			testStepFailed("Funding Rounds Dropdown is not displayed");
		}

		try {
			if (isElementDisplayed(btn_InvestmentHistory_Back)) {
				testStepPassed("Back Button is displayed");
			}
		} catch (Exception e) {
			testStepFailed("Back Button is not displayed");
		}

		try {
			if (isElementDisplayed(btn_InvestmentHistory_Next)) {
				testStepPassed("Next Button is displayed");
			}
		} catch (Exception e) {
			testStepFailed("Next Button is not displayed");
		}

		select_PreviousFundingRounds_Yes_Option();

		try {
			if (isElementDisplayed(drp_InvestmentHistory_Stage)) {
				testStepPassed("Stage Dropdown is displayed");
			}
		} catch (Exception e) {
			testStepFailed("Stage Dropdown is not displayed");
		}

		try {
			if (isElementDisplayed(txt_InvestmentHistory_HowMuchCapitalDidYouRaise)) {
				testStepPassed("How much capital did you raise Textbox is displayed");
			}
		} catch (Exception e) {
			testStepFailed("How much capital did you raise Textbox is not displayed");
		}

		try {
			if (isElementDisplayed(txt_InvestmentHistory_PercentageofYourBusinessinExchangeofCapital)) {
				testStepPassed("What percentage of your business in exchange of capital Textbox is displayed");
			}
		} catch (Exception e) {
			testStepFailed("What percentage of your business in exchange of capital Textbox is not displayed");
		}

		try {
			if (isElementDisplayed(txt_InvestmentHistory_DateClosed)) {
				testStepPassed("Date closed Textbox is displayed");
			}
		} catch (Exception e) {
			testStepFailed("Date closed Textbox is not displayed");
		}

		try {
			if (isElementDisplayed(txt_InvestmentHistory_InvestorsDuringThisRound)) {
				testStepPassed("Investors during this round Textbox is displayed");
			}
		} catch (Exception e) {
			testStepFailed("Investors during this round Textbox is not displayed");
		}

		try {
			if (isElementDisplayed(lnk_InvestmentHistory_RemoveThisFundingRound)) {
				testStepPassed("Remove this Funding Round Link is displayed");
			}
		} catch (Exception e) {
			testStepFailed("Remove this Funding Round Link is not displayed");
		}

		try {
			if (isElementDisplayed(lnk_InvestmentHistory_AddMoreFundingRound)) {
				testStepPassed("Add more funding round link is displayed");
			}
		} catch (Exception e) {
			testStepFailed("Add more funding round link is not displayed");
		}

		select_PreviousFundingRounds_No_Option();
	}*/

	/**
	 * This method is used to verify the labels display available in the investment
	 * history page,
	 *
	 * @author VijayaKumar.U
	 */
	public void verify_Registration_InvestmentHistoryPage_Elements_labels_displayed() {
		waitForElementToDisplay(lbl_InvestmentHistory, this.elementLoadWaitTime);
		try {
			if (isElementDisplayed(lbl_InvestmentHistory_Capital)) {
				testStepPassed("How much Capital Label is displayed");
			}
		} catch (Exception e) {
			testStepFailed("How much Capital Label is not displayed");
		}

		try {
			if (isElementDisplayed(lbl_InvestmentHistory_Currency)) {
				testStepPassed("Currency Label is displayed");
			}
		} catch (Exception e) {
			testStepFailed("Currency Label is not displayed");
		}

		try {
			if (isElementDisplayed(lbl_InvestmentHistory_CurrentInvestmentRound)) {
				testStepPassed("Current Investment Round Label is displayed");
			}
		} catch (Exception e) {
			testStepFailed("Current Investment Round Label is not displayed");
		}

		try {
			if (isElementDisplayed(lbl_InvestmentHistory_PercentageofExchangeCapital)) {
				testStepPassed("Percentage of Exchange Capital Label is displayed");
			}
		} catch (Exception e) {
			testStepFailed("Percentage of Exchange Capital Label is not displayed");
		}

		try {
			if (isElementDisplayed(lbl_InvestmentHistory_FundingRounds)) {
				testStepPassed("Funding Rounds Label is displayed");
			}
		} catch (Exception e) {
			testStepFailed("Funding Rounds Label is not displayed");
		}

		select_PreviousFundingRounds_Yes_Option();

		try {
			if (isElementDisplayed(lbl_InvestmentHistory_Stage)) {
				testStepPassed("Stage Label is displayed");
			}
		} catch (Exception e) {
			testStepFailed("Stage Label is not displayed");
		}

		try {
			if (isElementDisplayed(lbl_InvestmentHistory_HowMuchCapitalDidYouRaise)) {
				testStepPassed("How much capital did you raise Label is displayed");
			}
		} catch (Exception e) {
			testStepFailed("How much capital did you raise Label is not displayed");
		}

		try {
			if (isElementDisplayed(lbl_InvestmentHistory_PercentageofYourBusinessinExchangeofCapital)) {
				testStepPassed("What percentage of your business in exchange of capital Label is displayed");
			}
		} catch (Exception e) {
			testStepFailed("What percentage of your business in exchange of capital Label is not displayed");
		}

		try {
			if (isElementDisplayed(lbl_InvestmentHistory_DateClosed)) {
				testStepPassed("Date closed Label is displayed");
			}
		} catch (Exception e) {
			testStepFailed("Date closed Label is not displayed");
		}

		try {
			if (isElementDisplayed(lbl_InvestmentHistory_InvestorsDuringThisRound)) {
				testStepPassed("Investors during this round Label is displayed");
			}
		} catch (Exception e) {
			testStepFailed("Investors during this round Label is not displayed");
		}

		select_PreviousFundingRounds_No_Option();
	}
	public void verify_elements_placeholderTextFirstLetterCaps_displayed()	{

		try {

			String[] allplaceholderElements = {};
			for (String pageholderElement : allplaceholderElements) {
				if (isElementDisplayed(pageholderElement)) {

					String value = getAttributeValue(pageholderElement, "placeholder");

					char[] charArray = value.toCharArray();

					if(Character.isUpperCase(charArray[0]))      {


						testStepPassed(pageholderElement.split("#xpath")[0] + " - placeholder value is displayed");

					}          } else {

						testStepFailed(pageholderElement.split("#xpath")[0] + " placeholder was not displayed.");

					}    }

		} catch (Exception e) {
			e.printStackTrace();
			testStepFailed("Could not verify placeholder elements" + e.getClass());
		}
	}

	/**
	 * This method is used to verify the placeholder text display in the investment
	 * history page.
	 *
	 * @author VijayaKumar.U
	 */
	public void verify_Registration_InvestmentHistoryrPage_Default_DropdownValues_displayed()
	{
		try 
		{
			String placeholderText = getText(lbl_InvestmentHistory_Currency_Value).trim();
			if(placeholderText.contains("US Dollar ($)"))
			{
				testStepPassed("Correct currency default value is displayed");	
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Correct currency default value is not displayed");
		}

		try 
		{
			String placeholderText = getText(lbl_InvestmentHistory_CurrentInvestmentRound_Value).trim();
			if(placeholderText.contains("Formation"))
			{
				testStepPassed("Correct Current Investment round default value is displayed");	
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Correct Current Investment round default value is not displayed");
		}
	}

	public void verify_Registration_InvestmentHistoryrPage_Elements_PlaceHolderText_displayed() {
		waitForElementToDisplay(lbl_InvestmentHistory, this.elementLoadWaitTime);
		try {

			String placeholderText = driver.findElement(By.xpath(
					"//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//span[contains(text(),'How much capital are you seeking')]/parent::label/parent::div//input"))
					.getAttribute("placeholder");
			if (placeholderText.contains("$0 - $50,000,000")) {
				testStepPassed("Correct How much capital are you seeking Placeholder text is displayed");
			}
		} catch (Exception e) {
			testStepFailed("Correct How much capital are you seeking Placeholder text is not displayed");
		}

		try {
			String placeholderText = driver.findElement(By.xpath(
					"//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//span[contains(text(),'Current investment round')]/parent::label/parent::div//input"))
					.getAttribute("placeholder");
			if (placeholderText.contains("Select your current investment round")) {
				testStepPassed("Correct Current investment round Placeholder text is displayed");
			}
		} catch (Exception e) {
			testStepFailed("Correct Current investment round Placeholder text is not displayed");
		}

		try {
			String placeholderText = driver.findElement(By.xpath(
					"//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//span[contains(text(),'What percentage of your business in exchange of capital')]/parent::label/parent::div//input"))
					.getAttribute("placeholder");
			if (placeholderText.contains("i.e. 10%")) {
				testStepPassed(
						"Correct What percentage of your business in exchange of capital Placeholder text is displayed");
			}
		} catch (Exception e) {
			testStepFailed(
					"Correct What percentage of your business in exchange of capital Placeholder text is not displayed");
		}

		try {
			String placeholderText = driver.findElement(By.xpath(
					"//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//span[contains(text(),'Do you have any previous funding round')]/parent::label/parent::div//input"))
					.getAttribute("placeholder");
			if (placeholderText.contains("Select")) {
				testStepPassed("Correct Do you have any previous funding round Placeholder text is displayed");
			}
		} catch (Exception e) {
			testStepFailed("Correct Do you have any previous funding round Placeholder text is not displayed");
		}

		select_PreviousFundingRounds_Yes_Option();

		try {
			String placeholderText = driver.findElement(By.xpath(
					"//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//span[contains(text(),'Stage')]/parent::label/parent::div//input"))
					.getAttribute("placeholder");
			if (placeholderText.contains("Select your current investment round")) {
				testStepPassed("Correct Stage Placeholder text is displayed");
			}
		} catch (Exception e) {
			testStepFailed("Correct Stage Placeholder text is not displayed");
		}

		try {
			String placeholderText = driver.findElement(By.xpath(
					"//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//span[contains(text(),'How much capital did you raise')]/parent::label/parent::div//input"))
					.getAttribute("placeholder");
			if (placeholderText.contains("$0 - $50,000,000")) {
				testStepPassed("Correct How much capital did you raise Placeholder text is displayed");
			}
		} catch (Exception e) {
			testStepFailed("Correct How much capital did you raise Placeholder text is not displayed");
		}

		try {
			String placeholderText = driver.findElement(By.xpath(
					"(//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//span[contains(text(),'What percentage of your business in exchange of capital')]/parent::label/parent::div//input)[2]"))
					.getAttribute("placeholder");
			if (placeholderText.contains("i.e. 10%")) {
				testStepPassed("What percentage of your business in exchange of capital Placeholder text is displayed");
			}
		} catch (Exception e) {
			testStepFailed("What percentage of your business in exchange of capital Placeholder text is not displayed");
		}

		try {
			String placeholderText = driver.findElement(By.xpath(
					"(//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//span[contains(text(),'Date closed')]/parent::label/parent::div//input)[1]"))
					.getAttribute("placeholder");
			if (placeholderText.contains("Select Closing Date")) {
				testStepPassed("Correct Date closed Placeholder text is displayed");
			}
		} catch (Exception e) {
			testStepFailed("Correct Date closed Placeholder text is not displayed");
		}

		try {
			String placeholderText = driver.findElement(By.xpath(
					"//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//span[contains(text(),'Investors during this round')]/parent::label/parent::div//input"))
					.getAttribute("placeholder");
			if (placeholderText.contains("Enter investor names, separated by commas")) {
				testStepPassed("Correct Investors during this round Placeholder text is displayed");
			}
		} catch (Exception e) {
			testStepFailed("Correct Investors during this round Placeholder text is not displayed");
		}

		select_PreviousFundingRounds_No_Option();
	}

	/**
	 * This method is used to enter the capital amount,
	 * 
	 * @param capital Amount
	 *
	 * @author VijayaKumar.U
	 */
	public void enter_CapitalAmount(String capitalAmount) {
		
		try{
			WebElement ele = findWebElement(txt_InvestmentHistory_Capital);
			scrolltoElementView(ele);
			waitForElementToDisplay(txt_InvestmentHistory_Capital, this.elementLoadWaitTime);
		
		typeIn(txt_InvestmentHistory_Capital, capitalAmount);
//		String value =getText(txt_InvestmentHistory_Capital);
//		if(value.equals(capitalAmount)) {
//			testStepPassed(value+" Provided value is available in the Capital amount field");//updated
//		}
//		else {
//			testStepFailed(value+" Provided value is not available in the Capital amount field");
//		}
		}
		catch (Exception e) {
			testStepFailed("Capital amount can not be verified.");
		}
	}

	/**
	 * This method is used to select the the currency format
	 *
	 * @param currency format
	 *
	 * @author VijayaKumar.U
	 */
	public void select_CurrencyFormat(String currencyFormat) {
		waitForElementToDisplay(drp_InvestmentHistory_Currency, this.elementLoadWaitTime);
		clickOn(drp_InvestmentHistory_Currency);
		waitTime(1);
		typeIn(txt_InvestmentHistory_Currency, currencyFormat);
		waitTime(1);
		driver.findElement(By.xpath(
				"//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//span[contains(text(),'Currency')]/parent::label/parent::div//div[contains(@class,'multiselect__content-wrapper')]//ul//li[1]"))
		.click();
	}

	/**
	 * This method is used to select the current investment round .
	 *
	 * @param current Investment Round
	 *
	 * @author VijayaKumar.U
	 */
	public void select_CurrentInvestmentRound(String currentInvestmentRound) {
		waitForElementToDisplay(drp_InvestmentHistory_CurrentInvestmentRound, this.elementLoadWaitTime);
		clickOn(drp_InvestmentHistory_CurrentInvestmentRound);
		waitTime(1);
		typeIn(txt_InvestmentHistory_CurrentInvestmentRound, currentInvestmentRound);
		waitTime(1);
		List<WebElement> optlst = driver.findElements(By.xpath(
				"//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//span[contains(text(),'Current investment round')]/parent::label/parent::div//div[contains(@class,'multiselect__content-wrapper')]//ul//li//span//span"));
		int optlstcount = optlst.size();
		for (WebElement opt : optlst) {
			String text = opt.getText();
			if (text.equalsIgnoreCase(currentInvestmentRound)) {
				opt.click();
				break;
			}
		}
	}

	/**
	 * This method is used to enter the percentage of exchange capital.
	 * 
	 * @param investmentHistoryPercentageofExchangeCapital
	 *
	 * @author VijayaKumar.U
	 */
	public void enter_PercentageofExchangeCapital(String investmentHistoryPercentageofExchangeCapital) {
		waitForElementToDisplay(txt_InvestmentHistory_PercentageofExchangeCapital, this.elementLoadWaitTime);
		typeIn(txt_InvestmentHistory_PercentageofExchangeCapital, investmentHistoryPercentageofExchangeCapital);
		//String value= getText(txt_InvestmentHistory_PercentageofExchangeCapital);
		
	}
	

	/**
	 * This method is used to select the funding rounds .
	 * 
	 * @param previousFundingRounds
	 *
	 * @author VijayaKumar.U
	 */
	public void select_PreviousFundingRounds(String previousFundingRounds) {
		waitForElementToDisplay(drp_InvestmentHistory_FundingRounds, this.elementLoadWaitTime);
		clickOn(drp_InvestmentHistory_FundingRounds);
		waitTime(1);
		typeIn(txt_InvestmentHistory_FundingRounds, previousFundingRounds);
		waitTime(1);
		List<WebElement> optlst = driver.findElements(By.xpath(
				"//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//span[contains(text(),'previous funding round')]/parent::label/parent::div//div[contains(@class,'multiselect__content-wrapper')]//ul//li//span//span"));
		int optlstcount = optlst.size();
		for (WebElement opt : optlst) {
			String text = opt.getText();
			if (text.equalsIgnoreCase(previousFundingRounds)) {
				opt.click();
				break;
			}
		}
	}

	/**
	 * This method is used to select the option yes in the previous funding rounds.
	 *
	 * @author VijayaKumar.U
	 */
	public void select_PreviousFundingRounds_Yes_Option() {
		WebElement ele = findWebElement(drp_InvestmentHistory_FundingRounds);
		scrolltoElementView(ele);
		waitForElementToDisplay(drp_InvestmentHistory_FundingRounds, this.elementLoadWaitTime);
		
		clickOn(drp_InvestmentHistory_FundingRounds);
		waitTime(1);
		String optYes="OptionYes#xpath=//div[contains(@class,'multiselect__content-wrapper')]//ul//li//span//span[contains(text(),'Yes')]";
		clickOn(optYes);
		//WebElement yesElement=findWebElement("Yes option in Funding round#xpath=//span[contains(text(),'previous funding round')]/parent::label/parent::div//div[contains(@class,'multiselect__content-wrapper')]//ul//li//span//span[contains(text(),'Yes')]");
		//selectFromDropdown(drp_InvestmentHistory_FundingRounds, "Yes");

		waitTime(1);
	}
	
	
	public void select_PreviousFundingRounds_No_Option() {

		waitForElementToDisplay(drp_InvestmentHistory_FundingRounds, this.elementLoadWaitTime);
		clickOn(drp_InvestmentHistory_FundingRounds);
		waitTime(1);
		String optNo="OptionYes#xpath=//div[contains(@class,'multiselect__content-wrapper')]//ul//li//span//span[contains(text(),'No')]";
		clickOn(optNo);
		//WebElement yesElement=findWebElement("Yes option in Funding round#xpath=//span[contains(text(),'previous funding round')]/parent::label/parent::div//div[contains(@class,'multiselect__content-wrapper')]//ul//li//span//span[contains(text(),'Yes')]");
		//selectFromDropdown(drp_InvestmentHistory_FundingRounds, "Yes");

		waitTime(1);
	}
	/**
	 * This method is used to select the no option in the funding rounds.
	 *
	 * @author VijayaKumar.U
	 */
	/*public void select_PreviousFundingRounds_No_Option() {
		waitForElementToDisplay(drp_InvestmentHistory_FundingRounds, this.elementLoadWaitTime);
		clickOn(drp_InvestmentHistory_FundingRounds);
		waitTime(1);
		typeIn(txt_InvestmentHistory_FundingRounds, "No");
		waitTime(1);
		List<WebElement> optlst = driver.findElements(By.xpath(
				"//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//span[contains(text(),'previous funding round')]/parent::label/parent::div//div[contains(@class,'multiselect__content-wrapper')]//ul//li//span//span"));
		int optlstcount = optlst.size();
		for (WebElement opt : optlst) {
			String text = opt.getText();
			if (text.equalsIgnoreCase("No")) {
				opt.click();
				break;
			}
		}
	}*/

	public void select_PreviousFundingRounds_Yes_Option_Updated() {
		try {
			waitForElementToDisplay(drp_InvestmentHistory_FundingRounds, this.elementLoadWaitTime);
			clickOn(drp_InvestmentHistory_FundingRounds);
			waitTime(1);
			String selectFundingRoung= "Funding Round#xpath=//span[contains(text(),'Do you have any previous funding round(s)?')]//parent::label//parent::div//span[contains(@class,'multiselect__option')]//span[text()='Yes']";
			waitForElementToDisplay(selectFundingRoung, this.elementLoadWaitTime);
			clickOn(selectFundingRoung);		
			System.out.println();}
		catch(Exception e) {
			testStepFailed("Could not select No in the drop down"+e.getClass());e.printStackTrace();
		}
	}
	public void select_PreviousFundingRounds_No_Option_Updated() {
		try {
			WebElement ele = findWebElement(drp_InvestmentHistory_FundingRounds);
			scrolltoElementView(ele);
			waitForElementToDisplay(drp_InvestmentHistory_FundingRounds, this.elementLoadWaitTime);
			clickOn(drp_InvestmentHistory_FundingRounds);
			waitTime(1);
			String selectFundingRoung= "Funding Round#xpath=//span[contains(text(),'Do you have any previous funding round(s)?')]//parent::label//parent::div//span[contains(@class,'multiselect__option')]//span[text()='No']";
			waitForElementToDisplay(selectFundingRoung, this.elementLoadWaitTime);
			clickOn(selectFundingRoung);
			System.out.println();}
		
		catch(Exception e) {
			testStepFailed("Could not select No in the drop down"+e.getClass());e.printStackTrace();
		}
	}
	
	/**
	 * This method is used to click back button.
	 *
	 * @author VijayaKumar.U
	 */
	public void click_Back_button() {
		WebElement ele = findWebElement(btn_InvestmentHistory_Back);
		scrolltoElementView(ele);
		waitForElementToDisplay(btn_InvestmentHistory_Back, this.elementLoadWaitTime);
		clickOn(btn_InvestmentHistory_Back);

	}

	/**
	 * This method is used to click next button.
	 *
	 * @author VijayaKumar.U
	 */
	public void click_Next_button() {
		pressPageDown();
		waitForElementToDisplay(btn_InvestmentHistory_Next, this.elementLoadWaitTime);
		clickOn(btn_InvestmentHistory_Next);
	}

	/**
	 * This method is used to click and remove the funding round.
	 *
	 * @author VijayaKumar.U
	 */
	public void click_RemoveThisFundingRound_button() {
		waitForElementToDisplay(lnk_InvestmentHistory_RemoveThisFundingRound, this.elementLoadWaitTime);
		clickOn(lnk_InvestmentHistory_RemoveThisFundingRound);
	}

	/**
	 * This method is used to fill the investment info.
	 *
	 * @param capitalAmount,currentInvestmentround
	 * @param capitalExchangePercentage,fundingRounds
	 *
	 * @author VijayaKumar.U
	 */
	public void fillInvestmentInformation(String capitalAmount, String currentInvestmentround,
			String capitalExchangePercentage, String fundingRounds) {
		enter_CapitalAmount(capitalAmount);
		select_CurrentInvestmentRound(currentInvestmentround);
		enter_PercentageofExchangeCapital(capitalExchangePercentage);
		select_PreviousFundingRounds_No_Option_Updated();
		//select_PreviousFundingRounds(fundingRounds);
	}

	/**
	 * This method is used to clear the investement info.
	 *
	 * @author VijayaKumar.U
	 */
	public void clear_InvestmentInformation() {
		clearEditBox(txt_InvestmentHistory_Capital);
		clearEditBox(txt_InvestmentHistory_PercentageofExchangeCapital);
	}

	/**
	 * This method is used to click and move next to investment history.
	 *
	 * @author VijayaKumar.U
	 */

	public void click_Next_InvestmentHistory() {
		WebElement ele = findWebElement(btn_InvestmentHistory_Next);
		scrolltoElementView(ele);

		click_Next_button();
	}

	/**
	 * This method is used to click and move back for investment history.
	 *
	 * @author VijayaKumar.U
	 */
	public void click_Back_InvestmentHistory() {
		try {
			WebElement ele = findWebElement(btn_InvestmentHistory_Back);
			scrolltoElementView(ele);
			pressPageDowntillelementVisible();
			waitForElementToDisplay(btn_InvestmentHistory_Back, this.elementLoadWaitTime);
			clickOn(btn_InvestmentHistory_Back);
			//click_Back_button();
		} // Newly Added � Start
		catch (Exception e) {
			testStepFailed("Could not click and move back for investment history. Exception: " + e.getClass());
			e.printStackTrace();
		}
		// Newly Added � End
	}

	/**
	 * This method is used to click and remove investment history
	 *
	 * @author VijayaKumar.U
	 */
	public void click_RemoveThisFundingRound_InvestmentHistory() {

		verify_removeFundingRound();
		click_RemoveThisFundingRound_button();
	}

	/**
	 * This method is used to select the no option in previous round funding.
	 *
	 * @author VijayaKumar.U
	 */
	public void verify_PreviousFundingRounds_InvestmentHistory_No_Option_displayed() {
		try {
			if (isElementDisplayed(lbl_InvestmentHistory_FundingRound_No_OptionsSelected)) {
				testStepPassed("No option is selected for Previous Funding Round");
			}
		} catch (Exception e) {
			testStepFailed("No option is not selected for Previous Funding Round");
		}
	}

	/**
	 * This method is used to verify the stage dropdown is displayed.
	 *
	 * @author VijayaKumar.U
	 */
	public void verify_Stage_InvestmentHistory_displayed() {
		try {
			if (isElementDisplayed(drp_InvestmentHistory_Stage)) {
				testStepPassed("Stage dropdown is displayed");
			}
		} catch (Exception e) {
			testStepFailed("Stage dropdown is not displayed");
		}
	}

	/**
	 * This method is used to verify the calendar display date is closed.
	 *
	 * @author VijayaKumar.U
	 */
	public void verify_DateClosed_Calender_displayed() {
		scrollToViewDateClosed(locator);

		waitForElementToDisplay(txt_InvestmentHistory_DateClosed, this.elementLoadWaitTime);
		clickOn(txt_InvestmentHistory_DateClosed);
		waitTime(1);
		try {
			if (isElementDisplayed(tbl_InvestmentHistory_DateClosed)) {
				testStepPassed("Date  Calendar is displayed");
				driver.findElement(By.xpath(
						"//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//div[contains(@class,'custom-datepicker')]//div[contains(@class,'vc-pane')]//div[contains(@class,'vc-grid-container')]//div[contains(@class,'is-today')]"))
				.click();
			}
		} catch (Exception e) {
			testStepFailed("Date Calendar is not displayed");
		}
	}

	/**
	 * This method is used to verify the error message of invalidity of highest
	 * education.
	 * 
	 * @param stage
	 *
	 * @author VijayaKumar.U
	 */
	public void verify_Stage_ErrorMessage_displayed_InvalidHighestEducation(String stage) {
		try {
		WebElement ele = findWebElement(drp_InvestmentHistory_Stage);
		scrolltoElementView(ele);
//scrolltolementview
		waitForElementToDisplay(drp_InvestmentHistory_Stage, this.elementLoadWaitTime);
		clickOn(drp_InvestmentHistory_Stage);
		waitTime(1);
		typeIn(txt_InvestmentHistory_Stage, stage);
		waitTime(1);
		
			if (isElementDisplayed(lbl_InvestmentHistory_Stage_Invalid_ErrorMessage)) {
				testStepPassed("No results found message is displayed for invalid Stage keyword");
			}
		} catch (Exception e) {
			testStepFailed("No results found message is not displayed for invalid Stage keyword");
		}
		
	}

	/**
	 * This method is used to enter the investor round details.
	 *
	 * @author VijayaKumar.U
	 */
	public void enter_InvestorsDuringThisRound(String investorsDuringThisRound) {

		waitForElementToDisplay(txt_InvestmentHistory_InvestorsDuringThisRound, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath(
				"//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//span[contains(text(),'Investors during this round')]/parent::label/parent::div//span[contains(text(),'Investors during this round')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		typeIn(txt_InvestmentHistory_InvestorsDuringThisRound, investorsDuringThisRound);
	}

	/**
	 * This method is used to clear the investor round .
	 *
	 * @author VijayaKumar.U
	 */
	public void clear_InvestorsDuringThisRound() {
		waitForElementToDisplay(txt_InvestmentHistory_InvestorsDuringThisRound, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath(
				"//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//span[contains(text(),'Investors during this round')]/parent::label/parent::div//span[contains(text(),'Investors during this round')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		clearEditBox(txt_InvestmentHistory_InvestorsDuringThisRound);
	}

	/**
	 * This method is used to enter the captial raise amount.
	 *
	 * @author VijayaKumar.U
	 */
	public void enter_HowMuchCapitalDidYouRaise(String howMuchCapitalDidYouRaise) {

		driver.findElement(By.xpath(
				"//div[contains(@class,'section bg-lighter overflow-auto')]//div[contains(@class,'application-form-container')]"))
		.click();
		WebElement element = driver.findElement(By.xpath(
				"//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//span[contains(text(),'How much capital did you raise')]/parent::label/parent::div//input"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

		waitForElementToDisplay(txt_InvestmentHistory_HowMuchCapitalDidYouRaise, this.elementLoadWaitTime);
		typeIn(txt_InvestmentHistory_HowMuchCapitalDidYouRaise, howMuchCapitalDidYouRaise);
	}

	/**
	 * This method is used to clear the captial raise amount .
	 *
	 * @author VijayaKumar.U
	 */
	public void clear_HowMuchCapitalDidYouRaise() {
		waitForElementToDisplay(txt_InvestmentHistory_HowMuchCapitalDidYouRaise, this.elementLoadWaitTime);
		clearEditBox(txt_InvestmentHistory_HowMuchCapitalDidYouRaise);
	}

	/**
	 * This method is used to enter the percentage of exchange of capital.
	 * 
	 * @param percentageofYourBusinessinExchangeofCapital
	 *
	 * @author VijayaKumar.U
	 */
	public void enter_PercentageofYourBusinessinExchangeofCapital(String percentageofYourBusinessinExchangeofCapital) {
		pressPageDown();
		waitForElementToDisplay(txt_InvestmentHistory_PercentageofYourBusinessinExchangeofCapital,
				this.elementLoadWaitTime);

		WebElement element = driver.findElement(By.xpath(
				"//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//span[contains(text(),'What percentage of your business in exchange of capital')]/parent::label/parent::div//span[contains(text(),'What percentage of your business in exchange of capital')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

		typeIn(txt_InvestmentHistory_PercentageofYourBusinessinExchangeofCapital,
				percentageofYourBusinessinExchangeofCapital);
	}

	/**
	 * This method is used to clear the percentage of exchangeof capital.
	 *
	 * @author VijayaKumar.U
	 */
	public void clear_PercentageofYourBusinessinExchangeofCapital() {
		waitForElementToDisplay(txt_InvestmentHistory_PercentageofYourBusinessinExchangeofCapital,
				this.elementLoadWaitTime);

		WebElement element = driver.findElement(By.xpath(
				"(//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//span[contains(text(),'What percentage of your business in exchange of capital')]/parent::label/parent::div//input)[2]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

		clearEditBox(txt_InvestmentHistory_PercentageofYourBusinessinExchangeofCapital);
	}

	/**
	 * This method is used to verify the display of the error message for invalid
	 * highest education.
	 *
	 * @author VijayaKumar.U
	 */
	public void verify_Currency_ErrorMessage_displayed_Invalid(String currency) {
		waitForElementToDisplay(drp_InvestmentHistory_Currency, this.elementLoadWaitTime);
		clickOn(drp_InvestmentHistory_Currency);
		waitTime(1);
		typeIn(txt_InvestmentHistory_Currency, currency);
		waitTime(1);
		try {
			if (isElementDisplayed(lbl_InvestmentHistory_Currency_Invalid_ErrorMessage)) {
				testStepPassed("No results found message is displayed for invalid Currency keyword");
			}
		} catch (Exception e) {
			testStepFailed("No results found message is not displayed for invalid Currency keyword");
		}
		clearEditBox(txt_InvestmentHistory_Currency);
		clickOn(drp_InvestmentHistory_Currency);
	}


}