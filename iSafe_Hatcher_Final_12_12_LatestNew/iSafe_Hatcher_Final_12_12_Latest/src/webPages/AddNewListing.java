package webPages;

import java.util.List;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import baseClass.BaseClass;
import iSAFE.ApplicationKeywords;
import pages.EmailReaderPage;

public class AddNewListing extends ApplicationKeywords
{	 
	private static final String txt_AddContactFirstName = "First Name Textbox #xpath=//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//label[contains(text(),'First Name')]/parent::div//input";
	private static final String txt_AddContactLastName = "Last Name Textbox #xpath=//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//label[contains(text(),'Last Name')]/parent::div//input";
	private static final String txt_AddContactEmail= "Email Textbox #xpath=//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//label[contains(text(),'Email')]/parent::div//input";
	private static final String txt_AddContactJobTitle = "Job Title Textbox #xpath=//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//label[contains(text(),'Job title')]/parent::div//input";
	private static final String txt_AddContactPhoneNumber= "Phone Textbox #xpath=//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//label[contains(text(),'Phone')]/parent::div//input";
	private static final String txt_AddContactLinkedIn = "LinkedIn Textbox #xpath=//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//label[contains(text(),'LinkedIn')]/parent::div//input";
	private static final String txt_AddContactAboutPerson = "About Person Textbox #xpath=//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//textarea[contains(@name,'bio')]";
	private static final String txt_AddContactAddress = "Address Textarea #xpath=//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//input[contains(@placeholder,'Address')]";
	private static final String txt_AddContactAppartment = "Apartment Textbox #xpath=//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//input[contains(@placeholder,'Apartment')]";
	private static final String txt_AddContactcity = "City Textbox #xpath=//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//input[contains(@placeholder,'City')]";
	private static final String txt_AddContactstate = "State Textbox #xpath=//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//input[contains(@placeholder,'State')]";
	private static final String txt_AddContactPostalCode = "Postal Code Textbox #xpath=//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//input[contains(@placeholder,'Postal code')]";
	private static final String lbl_Country="Country labelr#xpath=//span[@class='text-danger']/parent::label[text()='Country']";
	private static final String txt_AddContactCountry = "Country Textbox #xpath=//span[@class='text-danger']/parent::label[text()='Country']/following-sibling::div/input[@type='search']";
	private static final String txt_SelectCountry = "Select Country#xpath=//span[@class='text-danger']/parent::label[text()='Country']/following-sibling::div/input[@type='search']/following-sibling::div//strong";
	//	private static final String txt_Industry="Industry value of search #xpath=//div[@class='col-md-12 multiselect-lg']//input[@placeholder='Search']";


	/**verify and click Action*/


	/**Text field*/

	private static final String lbl_Salutation ="Salutation#xpath=//label[text()='Salutation']";
	private static final String lbl_FirstName="FirstName label#xpath=//label[text()='First Name']";
	private static final String lbl_LinkedIn="LinkedIn label#xpath=//label[text()='LinkedIn']";

	private static final String count_value="count the character#xpath=//div[@class='form-group col-md-6 col-lg-3']//input[@name='"+"TextField"+"']";


	/**Information of details**/

	private static final String lbl_Address="Address#xpath=//label[text()='Address']";
	private static final String lbl_Appartment=" Suite Appartment#xpath=//div[@class='form-group col-md-6']//label[contains(text(),'Suite / Apartment')]";
	private static final String lbl_City="City Field label#xpath=//label[contains(text(),'City')]";
	private static final String lbl_State="State#xpath=//label[contains(text(),'State')]";
	private static final String lbl_PotalCode="Postal Code label#xpath=//label[contains(text(),'Postal code')]";
	//	private static final String lbl_Industry="Select Industry Type #xpath=//label[text()='Industry']";

	/**Displayed **/

	private static final String dropdown_accountType="Account Type#xpath=//div[@class='form-group col-md-3']//select[@class='form-control']//option[normalize-space(text())='Investor']";
	private static final String txt_SelectAccountType="Selected Account Type#xpath=//div[@class='form-group col-md-3']//select[@class='form-control']//option[normalize-space(text())='"+"accountType"+"']";
	private static final String dropdown_bussinessType="Business Type#xpath=//div[@class='form-group col-md-3']//select[@class='form-control']//option[normalize-space(text())='Corporate VC']";
	private static final String txt_SelectBussinessType="Selected Bussiness Type#xpath=//div[@class='form-group col-md-3']//select[@class='form-control']//option[normalize-space(text())='"+"bussinessType"+"']";    
	private static final String dropdown_listingAddedBy="Listing Added By#xpath=//select[@placeholder='Select']";
	private static final String txt_SelectList="Selected list#xpath=//select[@placeholder='Select']//option[normalize-space(text())='"+"listing"+"']";





	private static final String btn_Indivitual="Add indivitial button #xpath=//button[text()='Add individual']";
	//button[text()='Add organization']
	//button[text()='Add individual']


	/****************/
	private static final String clk_menuDetails=" select Menus left Panel#xpath=//span[contains(text(),'<PLACEHOLDER>')]//ancestor::a[@class='dropdown-anchor']";
	private static final String clk_menuItems=" select Menus Items#xpath=//ul//li//a[contains(text(),'<PLACEHOLDER>')]";

	public static final String btn_SideBar= "List Of Sidebar Button#xpath=//div[@class='sidebar-link-left']//span";
	public static final String drp_Actions= "Actions DropDown#xpath=//ul[@class='dropdown-menu bg-light dropdown-add-actions show']//li";
	private static final String txt_AddListingDialogBox = "Add New Listing Dialog Box#xpath=//div[@id='modal-add-admin-user']//h4[text()='Add New Listing']"; 

	private static final String img_ProfileIcon = "Profile Icon#xpath=//a[@id='dropdownUserButton']";
	private static final String btn_AddListingCLose="Add Listing Close button#xpath=//div[@id='modal-add-admin-user']//a[@class='modal-button-close']";
	private static final String txt_AddContactMiddleName = "Middle Name Textbox #xpath=//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//label[contains(text(),'Middle Name')]/parent::div//input";

	private static final String lbl_LastName="lastName label#xpath=//label[text()='Last Name']";
	private static final String lbl_Email="Email label#xpath=//label[text()='Email']";
	private static final String lbl_jobTitle="JobTitle label#xpath=//label[text()='Job title']";
	private static final String lbl_phoneNumber="Country label#xpath=//label[text()='Phone']";

	public static final String txt_Insidesalutation = "Text Value Mr#xpath=//option[@value='mr']|//option[@value='ms']|//option[@value='mrs']|//option[@value='miss']|//option[@value='other']";
	public static final String txt_Salutation = "Label for Salutation#xpath=//label[text()='Salutation']";
	public static final String btn_InsideSalutation = "Button Salutation#xpath=//div[@id='modal-add-admin-user']//label[text()='Salutation']/following-sibling::select";

	public static final String txt_FirstName ="Text box FirstName#xpath=//input[@class='form-control req-field'][@name='first_name']";
	public static final String txt_MiddleName ="Text box FirstName#xpath=//input[@class='form-control req-field'][@name='middle_name']";
	public static final String txt_LastName ="Text box FirstName#xpath=//input[@class='form-control req-field'][@name='last_name']";

	public static final String txt_Email ="Text box FirstName#xpath=//input[@class='form-control req-field'][@name='email']";
	public static final String txt_JobTitle="Text box in JobTitle#xpath=//div[@class='form-group col-md-6 col-lg-3']//input[@placeholder='Job title']";

	public static final String txt_PhoneNumber="TypeIn PhoneNumber#xpath=//div[@class='form-group col-md-6 col-lg-3']//input[@name='telephone']";
	private static final String lbl_Bio="verify  Bio label is present#xpath=//label[text()='Bio']";
	private static final String txt_Bio="Type Text In Bio#xpath=//div[@class='note-editable']";
	public static final String txt_LinkedIn="TypeIn LinkedIn#xpath=//label[text()='LinkedIn']//following-sibling::input";

	private static final String txt_IndustryTextBox = "Industry Textbox#xpath=//label[text()='Industry']/following-sibling::div//input[@type='text']";
    private static final String txt_SeletedIndustry = "Selected Industry Textbox#xpath=//label[text()='Industry']/following-sibling::div//span[@class='custom__tag']";
   

	BaseClass obj;
	public AddNewListing (BaseClass obj) 
	{
		super(obj);
		this.obj = obj;
	}


	//HTCHR_AC_SCR_001_TC_024
	public void validateMaxFirstNameLength(String firstNameLength) {
		try {
			verifyElementIsDisplayed(lbl_FirstName);
			maximunMinimumValidation(txt_AddContactFirstName,firstNameLength);

		} catch (Exception e) {
			testStepFailed("Exception in validateMaxFirstNameLength method "+e.toString());
			e.printStackTrace();
		}
	}


	//HTCHR_AC_SCR_001_TC_025
	public void validateMaxFirstNameError(String firstNameLength ) {
		try {
			verifyElementIsDisplayed(lbl_FirstName);
			validateMaxCountCharacterOfErrorMessage(txt_AddContactFirstName,txt_AddContactMiddleName,txt_AddContactMiddleName,firstNameLength);//Need to change Middle Name Locator once entered error message handled in application
		} catch (Exception e) {
			testStepFailed("Exception in validateMaxFirstNameError method "+e.toString());
			e.printStackTrace();
		}
	}
	//HTCHR_AC_SCR_001_TC_026
	public void validateMaxLastNameLength(String lastNameLength) {
		try {
			verifyElementIsDisplayed(lbl_LastName);
			maximunMinimumValidation(txt_AddContactLastName,lastNameLength);

		} catch (Exception e) {
			testStepFailed("Exception in validateMaxLastNameLength method "+e.toString());
			e.printStackTrace();
		}
	}
	//HTCHR_AC_SCR_001_TC_027
	public void validateMaxLastNameError(String lastNameLength ) {
		try {
			verifyElementIsDisplayed(lbl_LastName);
			validateMaxCountCharacterOfErrorMessage(txt_AddContactLastName,txt_AddContactEmail,txt_AddContactEmail,lastNameLength);//Need to change EmailId Locator once entered error message handled in application
		} catch (Exception e) {
			testStepFailed("Exception in validateMaxLastNameError method "+e.toString());
			e.printStackTrace();
		}
	}

	//HTCHR_AC_SCR_001_TC_028
	public void validateMaxEmailLength(String emailLength) {
		try {
			verifyElementIsDisplayed(lbl_Email);
			maximunMinimumAlphaNumericValidation(txt_AddContactEmail,emailLength);

		} catch (Exception e) {
			testStepFailed("Exception in validateMaxEmailLength method "+e.toString());
			e.printStackTrace();
		}
	}
	//HTCHR_AC_SCR_001_TC_029
	public void validateMaxEmailError(String emailLength ) {
		try {
			verifyElementIsDisplayed(lbl_Email);
			validateMaxCountAlphaNumericOfErrorMessage(txt_AddContactEmail,txt_AddContactJobTitle,txt_AddContactJobTitle,emailLength);//Need to change JobTitle Locator once entered error message handled in application
		} catch (Exception e) {
			testStepFailed("Exception in validateMaxEmailError method "+e.toString());
			e.printStackTrace();
		}
	}
	//HTCHR_AC_SCR_001_TC_030
	public void validateMaxJobTitleLength(String jobTitleLength) {
		try {
			verifyElementIsDisplayed(lbl_jobTitle);
			maximunMinimumValidation(txt_AddContactJobTitle,jobTitleLength);

		} catch (Exception e) {
			testStepFailed("Exception in validateMaxJobTitleLength method "+e.toString());
			e.printStackTrace();
		}
	}
	//HTCHR_AC_SCR_001_TC_031
	public void validateMaxJobTitleError(String jobTitleLength ) {
		try {
			verifyElementIsDisplayed(lbl_jobTitle);
			validateMaxCountCharacterOfErrorMessage(txt_AddContactJobTitle,txt_AddContactPhoneNumber,txt_AddContactPhoneNumber,jobTitleLength);//Need to change PhoneNumber Locator once entered error message handled in application
		} catch (Exception e) {
			testStepFailed("Exception in validateMaxJobTitleError method "+e.toString());
			e.printStackTrace();
		}
	}
	//HTCHR_AC_SCR_001_TC_032
	public void validateMaxPhoneLength(String phoneLength) {
		try {
			verifyElementIsDisplayed(lbl_phoneNumber);
			maximunMinimumValidationNumbers(txt_AddContactPhoneNumber,phoneLength);

		} catch (Exception e) {
			testStepFailed("Exception in validateMaxPhoneLength method "+e.toString());
			e.printStackTrace();
		}
	}
	//HTCHR_AC_SCR_001_TC_033
	public void validateMaxPhoneError(String phoneLength ) {
		try {
			verifyElementIsDisplayed(lbl_phoneNumber);
			validateMaxCountNumbersOfErrorMessage(txt_AddContactPhoneNumber,txt_AddContactLinkedIn,txt_AddContactLinkedIn,phoneLength);//Need to change LinkedIn Locator once entered error message handled in application
		} catch (Exception e) {
			testStepFailed("Exception in validateMaxPhoneError method "+e.toString());
			e.printStackTrace();
		}
	}
	//HTCHR_AC_SCR_001_TC_034
	public void validateLessLinkedInLength(String linkedInLength) {
		try {
			verifyElementIsDisplayed(lbl_LinkedIn);
			maximunMinimumAsciiValidation(txt_AddContactLinkedIn,linkedInLength);
		} catch (Exception e) {
			testStepFailed("Exception in validateLessLinkedInLength method "+e.toString());
			e.printStackTrace();
		}
	}

	//HTCHR_AC_SCR_001_TC_035
	public void validateLinkedInError(String linkedInLength ) {
		try {
			verifyElementIsDisplayed(lbl_LinkedIn);
			validateMaxCountAsciiOfErrorMessage(txt_AddContactLinkedIn,txt_AddContactAddress,txt_AddContactAddress,linkedInLength);//Need to change Address Locator once entered error message handled in application
		} catch (Exception e) {
			testStepFailed("Exception in validateLinkedInError method "+e.toString());
			e.printStackTrace();
		}
	}

	//HTCHR_AC_SCR_001_TC_038
	public void validateLessAddressLength(String addressLength) {
		try {
			scrollDown(btn_Indivitual);
			verifyElementIsDisplayed(lbl_Address);
			maximunMinimumAlphaNumericValidation(txt_AddContactAddress,addressLength);
		} catch (Exception e) {
			testStepFailed("Exception in validateLessAddressLength method "+e.toString());
			e.printStackTrace();
		}
	}

	//HTCHR_AC_SCR_001_TC_039
	public void validateAddressError(String addressLength ) {
		try {
			scrollDown(btn_Indivitual);
			verifyElementIsDisplayed(lbl_Address);
			validateMaxCountAlphaNumericOfErrorMessage(txt_AddContactAddress,txt_AddContactAppartment,txt_AddContactAppartment,addressLength);//Need to change Apartment Locator once entered error message handled in application
		} catch (Exception e) {
			testStepFailed("Exception in validateAddressError method "+e.toString());
			e.printStackTrace();
		}
	}

	//HTCHR_AC_SCR_001_TC_040
	public void validateLessApartmentLength(String apartmentLength) {
		try {
			scrollDown(btn_Indivitual);
			verifyElementIsDisplayed(lbl_Appartment);
			maximunMinimumAlphaNumericValidation(txt_AddContactAppartment,apartmentLength);
		} catch (Exception e) {
			testStepFailed("Exception in validateLessApartmentLength method "+e.toString());
			e.printStackTrace();
		}
	}

	//HTCHR_AC_SCR_001_TC_041
	public void validateApartmentError(String apartmentLength ) {
		try {
			scrollDown(btn_Indivitual);
			verifyElementIsDisplayed(lbl_Appartment);
			validateMaxCountAlphaNumericOfErrorMessage(txt_AddContactAppartment,txt_AddContactcity,txt_AddContactcity,apartmentLength);//Need to change City Locator once entered error message handled in application
		} catch (Exception e) {
			testStepFailed("Exception in validateApartmentError method "+e.toString());
			e.printStackTrace();
		}
	}

	//HTCHR_AC_SCR_001_TC_042
	public void validateLessCityLength(String cityLength) {
		try {
			scrollDown(btn_Indivitual);
			verifyElementIsDisplayed(lbl_City);
			maximunMinimumValidation(txt_AddContactcity,cityLength);

		} catch (Exception e) {
			testStepFailed("Exception in validateLessCityLength method "+e.toString());
			e.printStackTrace();
		}
	}

	//HTCHR_AC_SCR_001_TC_043
	public void validateCityError(String cityLength ) {
		try {
			scrollDown(btn_Indivitual);
			verifyElementIsDisplayed(lbl_City);
			validateMaxCountCharacterOfErrorMessage(txt_AddContactcity,txt_AddContactstate,txt_AddContactstate,cityLength);//Need to change State Locator once entered error message handled in application
		} catch (Exception e) {
			testStepFailed("Exception in validateCityError method "+e.toString());
			e.printStackTrace();
		}
	}

	//HTCHR_AC_SCR_001_TC_044
	public void validateLessStateLength(String stateLength) {
		try {
			scrollDown(btn_Indivitual);
			verifyElementIsDisplayed(lbl_State);
			maximunMinimumValidation(txt_AddContactstate,stateLength);

		} catch (Exception e) {
			testStepFailed("Exception in validateLessStateLength method "+e.toString());
			e.printStackTrace();
		}
	}

	//HTCHR_AC_SCR_001_TC_045
	public void validateStateError(String stateLength ) {
		try {
			scrollDown(btn_Indivitual);
			verifyElementIsDisplayed(lbl_State);
			validateMaxCountCharacterOfErrorMessage(txt_AddContactstate,txt_AddContactPostalCode,txt_AddContactPostalCode,stateLength);//Need to change Postal Locator once entered error message handled in application
		} catch (Exception e) {
			testStepFailed("Exception in validateStateError method "+e.toString());
			e.printStackTrace();
		}
	}

	//HTCHR_AC_SCR_001_TC_046
	public void validateLessPostalCodeLength(String postalCodeLength) {
		try {
			scrollDown(btn_Indivitual);
			verifyElementIsDisplayed(lbl_PotalCode);
			maximunMinimumValidationNumbers(txt_AddContactPostalCode,postalCodeLength);

		} catch (Exception e) {
			testStepFailed("Exception in validateLessPostalCodeLength method "+e.toString());
			e.printStackTrace();
		}
	}
	//HTCHR_AC_SCR_001_TC_047
	public void validatePostalCodeError(String postalCodeLength ) {
		try {
			scrollDown(btn_Indivitual);
			verifyElementIsDisplayed(lbl_PotalCode);
			validateMaxCountNumbersOfErrorMessage(txt_AddContactPostalCode,txt_AddContactCountry,txt_AddContactCountry,postalCodeLength);//Need to change Country Locator once entered error message handled in application
		} catch (Exception e) {
			testStepFailed("Exception in validatePostalCodeError method "+e.toString());
			e.printStackTrace();
		}
	}
	//Future uses

	public void verifyUserDetailsInFillingForm(String firstName,String lastName,String Email,String jobTitle,String Phone,String LinkedIn,String TextBio) {


		try {
			waitForElementToDisplay( lbl_Salutation, 5);
			validateFirstName(firstName);
			validateFirstName(lastName);
			validateEmail(Email);
			validateJobTitle(jobTitle);
			validatePhone(Phone);
			validateLinkedIn(LinkedIn);
			//due to no placeholder for about person
			verifyElementIsDisplayed(lbl_Bio);	

		} 
		catch (Exception e) 		{

			testStepFailed("Exception in LaunchApplication"+e.toString());
			e.printStackTrace();
		}	}

	public void validateFirstName(String firstName) {
		try {
			verifyElementIsDisplayed(lbl_FirstName);
			getElementInPlaceholder(txt_AddContactFirstName,firstName);
		} catch (Exception e) {
			testStepFailed("Exception in validtadeFirstName method "+e.toString());
			e.printStackTrace();
		}
	}
	public void validateLastName(String lastName) {
		try {
			verifyElementIsDisplayed(txt_AddContactLastName);
			getElementInPlaceholder(txt_AddContactLastName,lastName);
		} catch (Exception e) {
			testStepFailed("Exception in validtadeLastName method "+e.toString());
			e.printStackTrace();
		}
	}
	public void validateEmail(String Email) {
		try {
			verifyElementIsDisplayed(txt_AddContactEmail);
			getElementInPlaceholder(txt_AddContactEmail,Email);
		} catch (Exception e) {
			testStepFailed("Exception in validtadeEmail method "+e.toString());
			e.printStackTrace();
		}
	}
	public void validateJobTitle(String jobTitle) {
		try {
			verifyElementIsDisplayed(txt_AddContactJobTitle);
			getElementInPlaceholder(txt_AddContactJobTitle,jobTitle);
		} catch (Exception e) {
			testStepFailed("Exception in validateJobTitle method "+e.toString());
			e.printStackTrace();
		}
	}

	public void validatePhone(String Phone) {
		try {
			verifyElementIsDisplayed(txt_AddContactPhoneNumber);
			getElementInPlaceholder(txt_AddContactPhoneNumber,Phone);
		} catch (Exception e) {
			testStepFailed("Exception in validtadePhone method "+e.toString());
			e.printStackTrace();
		}
	}
	public void validateLinkedIn(String LinkedIn) {
		try {
			verifyElementIsDisplayed(txt_AddContactLinkedIn);
			getElementInPlaceholder(txt_AddContactLinkedIn,LinkedIn);
		} catch (Exception e) {
			testStepFailed("Exception in validtadeLinkedIn method "+e.toString());
			e.printStackTrace();
		}
	}

	public void validateBio() {
		try {
			verifyElementIsDisplayed(lbl_Bio);
		} catch (Exception e) {
			testStepFailed("Exception in validtadeLinkedIn method "+e.toString());
			e.printStackTrace();
		}
	}


	public void verifyUserDetailsFillingInformation(String Address,String Appartment,String city,String State,String country,String Potalcode) {


		try {
			scrollDown(btn_Indivitual);
			validateAddress( Address);
			validateApartment(Appartment);
			validateCity(city);
			validatestate(State);
			validatePotalCode(Potalcode);
			validateCountry(country);


		} 
		catch (Exception e) 	{

			testStepFailed("Exception in LaunchApplication"+e.toString());
			e.printStackTrace();
		}	}


	public void validateAddress(String address) {
		try {
			scrollDown(btn_Indivitual);
			verifyElementIsDisplayed(lbl_Address);
			getElementInPlaceholder(txt_AddContactAddress,address);
		} catch (Exception e) {
			testStepFailed("Exception in validtadeAddress method "+e.toString());
			e.printStackTrace();
		}
	}

	public void validateApartment(String apartment) {
		try {
			scrollDown(btn_Indivitual);
			verifyElementIsDisplayed(lbl_Appartment);
			getElementInPlaceholder(txt_AddContactAppartment,apartment);
		} catch (Exception e) {
			testStepFailed("Exception in validtadeApartment method "+e.toString());
			e.printStackTrace();
		}
	}
	public void validateCity(String city) {
		try {
			scrollDown(btn_Indivitual);
			verifyElementIsDisplayed(lbl_City);
			getElementInPlaceholder(txt_AddContactcity,city);
		} catch (Exception e) {
			testStepFailed("Exception in validtadeCity method "+e.toString());
			e.printStackTrace();
		}
	}

	public void validatestate(String state) {
		try {
			scrollDown(btn_Indivitual);
			verifyElementIsDisplayed(lbl_State);
			getElementInPlaceholder(txt_AddContactstate,state);
		} catch (Exception e) {
			testStepFailed("Exception in validatestate method "+e.toString());
			e.printStackTrace();
		}
	}
	public void validatePotalCode(String PotalCode) {
		try {
			scrollDown(btn_Indivitual);
			verifyElementIsDisplayed(lbl_PotalCode);
			getElementInPlaceholder(txt_AddContactPostalCode,PotalCode);
		} catch (Exception e) {
			testStepFailed("Exception in validtadePotalCode method "+e.toString());
			e.printStackTrace();
		}
	}
	public void validateCountry(String Country) {
		try {
			scrollDown(btn_Indivitual);
			verifyElementIsDisplayed(lbl_Country);
			getElementInPlaceholder(txt_AddContactCountry,Country);
		} catch (Exception e) {
			testStepFailed("Exception in validtadeCountry method "+e.toString());
			e.printStackTrace();
		}
	}
	public void validateIndustry(String Industry) {
		try {
			scrollDown(btn_Indivitual);
			verifyElementIsDisplayed(lbl_Industry);
			getElementInPlaceholder(txt_Industry,Industry);
		} catch (Exception e) {
			testStepFailed("Exception in validtadeCountry method "+e.toString());
			e.printStackTrace();
		}
	}

	public void verifyDefaultTypes()
	{
		try {
			String[] verifyTypes= {dropdown_accountType,dropdown_bussinessType,dropdown_listingAddedBy};
			for(String elements:verifyTypes)
			{
				if(isElementDisplayed(elements))
				{
					String types = getText(elements);
					testStepPassed(types);
				}
				else
				{
					testStepFailed(elements.split("#")[0]+" was not displayed in the page");
				}
			}
		} catch (Exception e) 
		{
			testStepFailed("Failed to elements. Exception : " +e.getMessage());
		}        
	}

	public void clickOn_AccountType() 
	{
		verifyElementIsDisplayed(dropdown_accountType);    
		clickOn(dropdown_accountType);
		clickOn(txt_SelectAccountType);
	}
	public void clickOn_TypeOfBussiness()
	{
		verifyElementIsDisplayed(dropdown_bussinessType);    
		clickOn(dropdown_bussinessType);
		clickOn(txt_SelectBussinessType);
	}
	public void clickOn_ListingAdded()
	{
		verifyElementIsDisplayed(dropdown_listingAddedBy);    
		clickOn(dropdown_listingAddedBy);
		clickOn(txt_SelectList);
	}

	public void verifyDefaultAccountTypeIsPresent(String informationTypes)
	{
		scrollDown(btn_Indivitual);
		WebElement element=findWebElement(txt_SelectAccountType);
		String accountType=element.getText();
		if(informationTypes.equals(accountType))
		{
			testStepPassed("successfully enter the default value:" +accountType);
		}
		else
		{
			testStepFailed("Not enter the default value");
		}
	}

	public void verifyDefaultTypeOfBussinessIsPresent(String informationTypes)
	{
		scrollDown(btn_Indivitual);
		WebElement element=findWebElement(txt_SelectBussinessType);
		String accountType=element.getText();
		if(informationTypes.equals(accountType))
		{
			testStepPassed("successfully enter the default value:" +accountType);
		}
		else
		{
			testStepFailed("Not enter the default value");
		}
	}

	public void verifyDefaultTypeOfListedBy(String informationTypes)
	{

		scrollDown(btn_Indivitual);
		WebElement element=findWebElement(txt_SelectList);
		String accountType=element.getText();
		if(informationTypes.equals(accountType))
		{
			testStepPassed("successfully enter the default value:" +accountType);
		}
		else
		{
			testStepFailed("Not enter the default value");
		}
	}




	public void industryDefaultSearchName(){
		try {


			WebElement element=findWebElement(txt_Industry);

			String placeholders = element.getText();
			testStepPassed("Placeholder is "+placeholders);

		}catch (Exception e)         
		{
			testStepFailed("Exception in placeholder"+e.toString());
			e.printStackTrace();
		}    
	}
	
	
	public void verifyDefaultSelectedOption(String accountTypes,String bussinessTypes,String listingTypes,String sendInviteTypes, String Search, String salutationTypes) {

		try {

			verifyDefaultElementIsSelected(accountTypes);
			verifyDefaultElementIsSelected(bussinessTypes);
			verifyDefaultElementIsSelected(listingTypes);
			verifyDefaultElementIsSelected(sendInviteTypes);
			getElementInPlaceholder(txt_Industry,Search);
			verifyDefaultElementIsSelected(salutationTypes);
		} catch (Exception e) {
			testStepFailed("Exception in placeholder"+e.toString());
			e.printStackTrace();
		}
	}

	public void clickOnMenuItems(String menu, String menuType, String objLocator)
	{
		try
		{
			verifyElementIsDisplayed(btn_SideBar);
			getElementAndClick(btn_SideBar, menu);

			verifyElementIsDisplayed(drp_Actions);
			getElementAndClick(drp_Actions, menuType);

			waitForElementToDisplay(objLocator, 20);
			verifyElementIsDisplayed(objLocator);//
			testStepPassed("Successfully navigate to " + menuType+ " Page");
		} 
		catch (Exception e)    
		{
			testStepFailed("Exception in method clickOnMenuItems: "+e.toString());
		}    
	}
	public void closeAddListingPopup()
	{
		try 
		{
			verifyElementIsDisplayed(btn_AddListingCLose);
			clickOn(btn_AddListingCLose);
			verifyElementIsDisplayed(img_ProfileIcon);
			testStepPassed("Successfully navigate to Home Page");

		}
		catch (Exception e)         
		{
			testStepFailed("Exception in method closeAddListingPopup: "+e.toString());
		}    
	}

	public void selectCountry(String inputText)
	{
		try
		{
			verifyElementIsDisplayed(txt_AddContactCountry);
			typeIn(txt_AddContactCountry, inputText);
			waitForElementToDisplay(txt_SelectCountry, 10);
			getElementAndClick(txt_SelectCountry, inputText);

		} 
		catch (Exception e)    
		{
			testStepFailed("Exception in method selectCountry: "+e.toString());
		}    
	}
	public void validateSalutation(String allMenu,String allMenuType,String salutation) {
		try {
			clickOnMenuItems(allMenu,allMenuType,txt_AddListingDialogBox);
			verifyDefaultElementIsSelected(salutation);
		} catch (Exception e) {
			testStepFailed("Exception in validateSalutation method "+e.toString());
			e.printStackTrace();
		}
	}
	//68 //75
	public void validateAddNewListing(String sideBarText,String addNewText,String salutationOption, String firstName, String middleName, String lastName, String Email, String JobTextBox, String PhoneNo,
			String linkedInTextBox, String enterBioDetails, String enterAddress,String apartmentNo,String cityName,String stateName,String postalCode,String countryName,String accountTypesofList,String listOfAccountType,String listOfBusinessType,
			String listingAddBy,String ListofsendInvite,String inputText,String sucessMsg,String userName)
	{
		try
		{
			validateAddNewbutton(sideBarText, addNewText);
			EnterAddNewListDetails(salutationOption, firstName, middleName, lastName, Email,JobTextBox, PhoneNo, linkedInTextBox,enterBioDetails);
			createAddress(enterAddress, apartmentNo, cityName,  stateName, postalCode,countryName,accountTypesofList, listOfAccountType, listOfBusinessType, listingAddBy, ListofsendInvite, inputText);
			validateAddIndividual();
			validateUsersucessfulMessage(sucessMsg);
			validateAddUserName(userName);
		}
		catch(Exception e)
		{
			testStepFailed("Exception in the Method validateAddNewListing:"+e.toString());
		}

	}
	//68
	public void EnterAddNewListDetails(String salutationOption, String firstName, String middleName, String lastName, String Email, String JobTextBox, String PhoneNo, 
			String linkedInTextBox,String enterBioDetails) 
	{
		try
		{
			waitForElementToDisplay(txt_Salutation, 10);
			selectDropDown(btn_InsideSalutation,salutationOption);
			getText(txt_Insidesalutation, salutationOption);
			typeIn(txt_FirstName, firstName);
			typeIn(txt_MiddleName,middleName);
			typeIn(txt_LastName, lastName);
			typeIn(txt_Email, Email);
			typeIn(txt_JobTitle, JobTextBox);
			typeIn(txt_PhoneNumber, PhoneNo);
			clickOn(txt_LinkedIn);
			typeIn(txt_LinkedIn,linkedInTextBox);
			validateBioDetail(enterBioDetails);
		}
		catch(Exception e)
		{
			testStepFailed("Exception in the Method EnterAddNewListDetails:"+e.toString());
		}
	}
	public void validateBioDetail(String enterBioDetails)
	{
		try
		{
			scrollDownElement(lbl_Bio);
			verifyElementIsDisplayed(lbl_Bio);
			if(isElementDisplayed(txt_Bio))
			{
				typeIn(txt_Bio, enterBioDetails);
				waitTime(2);
				getText(txt_Bio,enterBioDetails);
			}
		}
		catch(Exception e)
		{
			testStepFailed("Exception in the Method validateBioDetail:"+e.toString());
		}
	}

	private static final String txt_Apartment="Apartment Field Place Holder#xpath=//input[contains(@placeholder,'Suite / Apartment')]";
	private static final String txt_City="City Field Place Holder#xpath=//div[@class='form-group col-md-3']//input[contains(@placeholder,'City')]";
	private static final String txt_State="State Field Place Holder#xpath=//div[@class='form-group col-md-3']//input[contains(@placeholder,'State')]";       
	private static final String txt_PotalCode="Postal Code Field #xpath=//input[contains(@placeholder,'Postal code')]";
	private static final String lst_SelectCountry = "Select Country#xpath=//span[@class='text-danger']/parent::label[text()='Country']/following-sibling::div/input[@type='search']/following-sibling::div//strong";
	private static final String txt_Address="TypeIn Address#xpath=//div[@class='form-group col-md-6']//child::input[@placeholder='Address']";

	public static final String drp_AccountTypeList = "List of Account Type#xpath=//div[@id='modal-add-admin-user']//label[text()='Account Type']/following-sibling::select/child::option";
	public static final String txt_ListOfValue = "Select the value Type#xpath=//div[@class='form-group col-md-3']//descendant::select//child::option";
	public static final String btn_AccountType ="Account Type#xpath=//div[@id='modal-add-admin-user']//label[text()='Account Type']/following-sibling::select";
	public static final String btn_BusinessOfType ="Business Type#xpath=//div[@id='modal-add-admin-user']//label[text()='Type of business']/following-sibling::select";
	public static final String btn_ListingAddedBy="Listing Added By#xpath=//div[@id='modal-add-admin-user']//label[text()='Listing Added By']/following-sibling::select";
	public static final String btn_SendInvite="Send Invite#xpath=//div[@id='modal-add-admin-user']//label[text()='Send Invite']/following-sibling::select";
	public static final String lbl_Industry = "Industry label#xpath=//div[@id='modal-add-admin-user']//label[text()='Industry']";
	public static final String txt_Industry = "Industry Textbox#xpath=//label[text()='Industry']/following-sibling::div//input[@type='text']";
	public static final String lst_SelectIndustry = "Select Industry#xpath=//li[@class='multiselect__element']//child::span//child::span";
	public static final String btn_AddIndividual = "Add Individual Button#xpath=//button[text()='Add individual']";
	public static final String btn_AddOrganisation = "Add Organisation Button#xpath=//button[text()='Add individual']";
	public static final String txt_SucessfulMessage = "User Sucessfully Message#xpath=//div[@role='dialog']//div[contains(text() , 'User added Successfully')]";
	public static final String txt_UserName = "UserName#xpath=//span[@class='member-user-full-name']";



	public void createAddress(String enterAddress,String apartmentNo,String cityName,String stateName, String postalCode,String countryName,String accountTypesofList,String listOfAccountType,String listOfBusinessType,
			String listingAddBy,String ListofsendInvite,String selectIndustry)
	{
		try
		{
			
			validateAddressDetails(enterAddress, apartmentNo, cityName, stateName, postalCode);
			selectCountry(countryName);
			validateDropDownListofValue(btn_AccountType,drp_AccountTypeList,accountTypesofList);
			validateDropDown(btn_AccountType,listOfAccountType);
			validateDropDown(btn_BusinessOfType,listOfBusinessType);
			validateDropDown(btn_ListingAddedBy,listingAddBy);
			validateDropDown(btn_SendInvite,ListofsendInvite);
			selectIndustry(selectIndustry);

		}
		catch(Exception e)
		{
			testStepFailed("Exception in the Method validateBioDetail:"+e.toString());
		}
	}
	public void validateAddressDetails(String enterAddress,String apartmentNo,String cityName,String stateName,String postalCode)
	{
		try
		{
			scrollDownElement(btn_AddIndividual);
			verifyElementIsDisplayed(lbl_Address);
			if(isElementDisplayed(txt_Bio))
			{
				typeIn(txt_Address, enterAddress);
				waitTime(2);

				typeIn(txt_Apartment,apartmentNo);
				typeIn(txt_City, cityName);

				typeIn(txt_State, stateName);
				typeIn(txt_PotalCode, postalCode);
			}
		}
		catch(Exception e)
		{
			testStepFailed("Exception in the Method validateAddressDetails:"+e.toString());
		}
	}

	public void validateDropDown(String objLocator, String listOfAccountType)
	{
		try
		{
			waitForElementToDisplay(objLocator, 10);
			if(isElementDisplayed(objLocator))
			{
				clickOn(objLocator);
				selectDropDown(objLocator,listOfAccountType);

			}
		}

		catch(Exception e)
		{
			testStepFailed("Exception in the Method validateAddressDetails:"+e.toString());
		}
	}


	public void validateDropDownListofValue(String objLocatorKey,String objLocatorValue,String listOfValue)
	{
		try
		{
			String[] dropDownValue= listOfValue.split("##");
			clickOn(objLocatorKey);
			for (int i = 0; i < dropDownValue.length; i++) 
			{
				waitTime(1);
				getText(objLocatorValue, dropDownValue[i]);
			}
		}
		catch(Exception e)
		{
			testStepFailed("Exception in the Method validateDropDownListofValue:"+e.toString());
		}
	}
	public void validateAddUserName(String userName){
		{
			try
			{
				waitForElementToDisplay(txt_UserName, 30);
				if(elementDisplayed(txt_UserName))
				{
					getText(txt_UserName,userName);
				}
				else
				{
					testStepFailed("Couldn't able locate UserName");
				}
			}
			catch(Exception e)
			{
				testStepFailed("Exception in the Method validateAddUserSucess:"+e.toString());
			}
		}
	}

	public void validateUsersucessfulMessage(String expectedText)
	{
		try
		{

			//                        WebElement element = findWebElement(txt_SucessfulMessage);
			//                        element.getText();
			//                        if(element.equals(expectedText))
			//                        {
			//                            testStepPassed("User Details Added Successfully");
			//                        }
			//                        else
			//                        {
			//                            testStepFailed("couldn't able to locate user successfully Message");
			//                        }
		}
		catch(Exception e)
		{
			testStepFailed("Exception in the Method validateAddUserSucess:"+e.toString());
		}
	}

	public void validateAddIndividual()
	{
		try
		{
			scrollDownElement(btn_AddIndividual);
			verifyElementIsEnabled(btn_AddIndividual);
			verifyElementIsEnabled(btn_AddOrganisation);
			clickOn(btn_AddIndividual);
			testStepPassed("User Details Add sucessfully");
			waitTime(10);
		}
		catch(Exception e)
		{
			testStepFailed("Exception in the Method validateAddindividual:"+e.toString());
		}
	}
	public void selectIndustry(String inputText)
    {
        try
        {
            verifyElementIsDisplayed(txt_IndustryTextBox);
            typeIn(txt_IndustryTextBox, inputText);
            waitForElementToDisplay(lst_SelectIndustry, 10);
            getElementAndClick(lst_SelectIndustry, inputText);
            getText(txt_SeletedIndustry, inputText);
        }
        catch (Exception e)    
        {
            testStepFailed("Exception in method selectIndustry: "+e.toString());
        }    
	}
	//HTCHR_AC_SCR_002_TC_074
	public void validMandatoryNonMandatoryFields(String sideBarText,String addNewText,String salutationOption, String firstName, String middleName, String lastName, String Email, String JobTextBox, String PhoneNo,
			String linkedInTextBox, String enterBioDetails, String enterAddress,String apartmentNo,String cityName,String stateName,String postalCode,String countryName,String accountTypesofList,String listOfAccountType,String listOfBusinessType,
			String listingAddBy,String ListofsendInvite,String inputText)
	{
		try
		{
			validateAddNewbutton(sideBarText, addNewText);
			EnterAddNewListDetails(salutationOption, firstName, middleName, lastName, Email,JobTextBox, PhoneNo, linkedInTextBox,enterBioDetails);
			createAddress(enterAddress, apartmentNo, cityName,  stateName, postalCode,countryName,accountTypesofList, listOfAccountType, listOfBusinessType, listingAddBy, ListofsendInvite, inputText);
			scrollDownElement(btn_AddIndividual);
			verifyElementIsEnabled(btn_AddIndividual);
			verifyElementIsEnabled(btn_AddOrganisation);
			scrollUpElement(txt_Salutation);
			clickOn(btn_AddListingCLose);
		}
		catch(Exception e)
		{
			testStepFailed("Exception in the Method validateAddNewListing:"+e.toString());
		}
	}

	//HTCHR_AC_SCR_002_TC_073
	public void validNonMandatoryFields(String sideBarText, String addNewText,String middleName, String JobTextBox, String PhoneNo, 
			String linkedInTextBox,String enterBioDetails,String enterAddress,String apartmentNo,String cityName,String stateName,String postalCode,String listOfAccountType,String listOfBusinessType,
			String listingAddBy, String ListofsendInvite,String selectIndustry)
	{
		try
		{
			validateAddNewbutton(sideBarText, addNewText);

			typeIn(txt_MiddleName,middleName);
			typeIn(txt_JobTitle, JobTextBox);
			typeIn(txt_PhoneNumber, PhoneNo);
			clickOn(txt_LinkedIn);
			typeIn(txt_LinkedIn,linkedInTextBox);
			validateBioDetail(enterBioDetails);

			validateAddressDetails(enterAddress, apartmentNo, cityName, stateName, postalCode);
			validateDropDown(btn_AccountType,listOfAccountType);
			validateDropDown(btn_BusinessOfType,listOfBusinessType);
			validateDropDown(btn_ListingAddedBy,listingAddBy);
			validateDropDown(btn_SendInvite,ListofsendInvite);
			selectIndustry(selectIndustry);

			scrollDownElement(btn_AddIndividual);
			verifyElementIsNotEnabled(btn_AddIndividual);
			verifyElementIsNotEnabled(btn_AddOrganisation);
			scrollUpElement(txt_Salutation);
			clickOn(btn_AddListingCLose);
		}
		catch(Exception e)
		{
			testStepFailed("Exception in the Method validMandatoryFields:"+e.toString());
		}


	}
	 public void validMandatoryFields(String sideBarText,String addNewText,String salutationOption, String firstName, String lastName, String Email,String country)
	    {
	        try
	        {
	            validateAddNewbutton(sideBarText, addNewText);
	            waitForElementToDisplay(txt_Salutation, 10);
	            selectDropDown(btn_InsideSalutation,salutationOption);
	            getText(txt_Insidesalutation, salutationOption);
	            typeIn(txt_FirstName, firstName);
	            typeIn(txt_LastName, lastName);
	            typeIn(txt_Email, Email);
	            selectCountry(country);
	        }
	        catch(Exception e)
	        {
	            testStepFailed("Exception in the Method validMandatoryFields:"+e.toString());
	        }
}
	 //HTCHR_AC_SCR_001_TC_070
	    public void validMadatoryFiledsSucess(String sideBarText,String addNewText,String salutationOption, String firstName, String lastName, String Email,String country, String sucessMsg, String userName)
	    {
	        try
	        {
	            validMandatoryFields(sideBarText,addNewText,salutationOption,firstName, lastName, Email, country);
	            validateAddIndividual();
	            validateUsersucessfulMessage(sucessMsg);
	            validateAddUserName(userName);
	        }
	        catch(Exception e)
	        {
	            testStepFailed("Exception in the Method validateAddNewListing:"+e.toString());
	        }
	    }
	    
	    
	    
public void readMailBox(String emailServer,String emailId,String emailPassword,String emailSubject)
	    {
	        try
	        {
	        	EmailReaderPage	emailReaderPage = new EmailReaderPage(obj);
	        	String addNewContactActivateUrl = emailReaderPage.getNewContactActivateURL(emailServer, emailId, emailPassword, emailSubject);
				driver.get(addNewContactActivateUrl);   	
	        
	        }
catch(Exception e)
{
    testStepFailed("Exception in the Method validateAddNewListing:"+e.toString());
}
}
}













