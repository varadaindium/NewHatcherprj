package pages;
import iSAFE.ApplicationKeywords;

//import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import baseClass.BaseClass;

public class CohortPage extends ApplicationKeywords
{	
	private static final String lbl_Cohort = "Cohort Heading#xpath=//div[contains(@class,'application-form-container')]//*[contains(text(),'Which cohort are you applying to')]";
	private static final String drp_Cohort_Name = "Cohort Name Dropdown#xpath=//div[contains(@class,'hatcher-info-select hatcher')]//div[contains(@class,'multiselect__select')]";
	private static final String txt_Cohort_Name = "Cohort Name Textbox#xpath=//div[contains(@class,'hatcher-info-select hatcher')]//input[contains(@id,'cohort_selection')]";
	private static final String lst_Cohort_Name = "Cohort Name List#xpath=//div[contains(@class,'hatcher-info-select hatcher')]//div[contains(@class,'multiselect__content-wrapper')]//ul//li[contains(@class,'multiselect__element')]//span[contains(@class,'multiselect__option')]//span";
	private static final String lst_Cohort_First_Option = "Cohort First Option List#xpath=(//div[contains(@class,'hatcher-info-select hatcher')]//div[contains(@class,'multiselect__content-wrapper')]//ul//li[contains(@class,'multiselect__element')]//span[contains(@class,'multiselect__option')]//span)[1]";
	private static final String btn_Cohort_Submit = "Submit button in Cohort Page#xpath=//button[contains(@name,'cohort_selection_btn')]";
	
	public CohortPage(BaseClass obj) 
	{
		super(obj);
	}
	
	public void verify_Cohort_Page_displayed()
	{
		try 
		{
			waitForElementToDisplay(lbl_Cohort, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_Cohort))
			{
				testStepPassed("Cohort page is displayed");	
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			testStepFailed("Cohort page is not displayed");
		}
	}

	public void select_Cohort(String cohortValue)
	{
		waitForElementToDisplay(drp_Cohort_Name, this.elementLoadWaitTime);
		clickOn(drp_Cohort_Name);
		waitForElementToDisplay(txt_Cohort_Name, this.elementLoadWaitTime);
		typeIn(txt_Cohort_Name, cohortValue);
		waitForElementToDisplay(lst_Cohort_Name, this.elementLoadWaitTime);
		clickOn(lst_Cohort_First_Option);
	}
	
	public void click_Submit_button()
	{
		waitForElementToDisplay(btn_Cohort_Submit, this.elementLoadWaitTime);
		clickOn(btn_Cohort_Submit);
	}	
}