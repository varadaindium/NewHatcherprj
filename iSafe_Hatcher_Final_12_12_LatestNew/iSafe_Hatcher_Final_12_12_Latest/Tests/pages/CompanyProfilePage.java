package pages;
import iSAFE.ApplicationKeywords;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


import baseClass.BaseClass;

public class CompanyProfilePage extends ApplicationKeywords
{	
	private static final String lbl_CompanyProfilePage_Heading = "Company Profile Page Heading#xpath=//a[contains(@class,'active') and contains(text(),'Profile')]";
	private static final String lnk_CompanyProfilePage_Profile = "Profile Link in Company Profile Page#xpath=//div[contains(@class,'section')]//div[contains(@class,'midnav')]//a[contains(text(),'Profile')]";
	private static final String lnk_CompanyProfilePage_Fundraising = "Fundraising Link in Company Profile Page#xpath=//div[contains(@class,'section')]//div[contains(@class,'midnav')]//a[contains(text(),'Fundraising')]";
	private static final String lnk_CompanyProfilePage_CapTable = "Captable Link in Company Profile Page#xpath=//div[contains(@class,'section')]//div[contains(@class,'midnav')]//a[contains(text(),'Cap Table')]";
	private static final String lnk_CompanyProfilePage_DataRoom = "Data Room Link in Company Profile Page#xpath=//div[contains(@class,'section')]//div[contains(@class,'midnav')]//a[contains(text(),'Data Room')]";
	private static final String lnk_CompanyProfilePage_KPI = "KPI Link in Company Profile Page#xpath=//div[contains(@class,'section')]//div[contains(@class,'midnav')]//a[contains(text(),'KPI')]";
	private static final String lbl_CompanyProfilePage_ProfileTab = "Profile Tab Heading Label in Company Profile Page#xpath=//div[contains(@class,'section')]//div[contains(@class,'midnav')]//a[contains(@class,'active') and contains(text(),'Profile')]";
	private static final String lbl_CompanyProfilePage_FundraisingTab = "Profile Tab Heading Label in Company Profile Page#xpath=//div[contains(@class,'section')]//div[contains(@class,'midnav')]//a[contains(@class,'active') and contains(text(),'Fundraising')]";
	private static final String lbl_CompanyProfilePage_CapTableTab = "Profile Tab Heading Label in Company Profile Page#xpath=//div[contains(@class,'section')]//div[contains(@class,'midnav')]//a[contains(@class,'active') and contains(text(),'Cap Table')]";
	private static final String lbl_CompanyProfilePage_DataRoomTab = "Profile Tab Heading Label in Company Profile Page#xpath=//div[contains(@class,'section')]//div[contains(@class,'midnav')]//a[contains(@class,'active') and contains(text(),'Data Room')]";
	private static final String lbl_CompanyProfilePage_KPITab = "Profile Tab Heading Label in Company Profile Page#xpath=//div[contains(@class,'section')]//div[contains(@class,'midnav')]//a[contains(@class,'active') and contains(text(),'KPI')]";
	private static final String lnk_CompanyProfilePage_TopMenu_ToggleDots = "Top Menu Toggle Dots Link in Company Profile Page#xpath=//div[contains(@class,'section')]//a[contains(@id,'dropdownDealflow')]//i";
	private static final String lbl_CompanyProfilePage_TopMenu_ToggleDots_MenuContainer = "Top Menu Toggle Dots Menu container label in Company Profile Page#xpath=(//ul[contains(@class,'dropdown-menu bg-light show')])[1]";
	private static final String lnk_CompanyProfilePage_TopMenu_ToggleDots_MenuContainer_Edit = "Edit Top Menu Toggle Dots Menu container link in Company Profile Page#xpath=(//ul[contains(@class,'dropdown-menu bg-light show')])[1]//li//a[contains(text(),'Edit')]";
	private static final String lnk_CompanyProfilePage_TopMenu_ToggleDots_MenuContainer_UpdateCompanyData = "Update Company Data Top Menu Toggle Dots Menu container link in Company Profile Page#xpath=(//ul[contains(@class,'dropdown-menu bg-light show')])[1]//li//a[contains(text(),'Update Company Data')]";
	private static final String lnk_CompanyProfilePage_TopMenu_ToggleDots_MenuContainer_UploadPresentation = "Upload Presentation Top Menu Toggle Dots Menu container link in Company Profile Page#xpath=(//ul[contains(@class,'dropdown-menu bg-light show')])[1]//li//a[contains(text(),'Upload Presentation')]";
	private static final String lnk_CompanyProfilePage_TopMenu_ToggleDots_MenuContainer_UploadVideo = "Upload Video Top Menu Toggle Dots Menu container link in Company Profile Page#xpath=(//ul[contains(@class,'dropdown-menu bg-light show')])[1]//li//a[contains(text(),'Upload Video')]";
	private static final String lnk_CompanyProfilePage_TopMenu_ToggleDots_MenuContainer_CustomizeProfile = "Customize Profile Top Menu Toggle Dots Menu container link in Company Profile Page#xpath=(//ul[contains(@class,'dropdown-menu bg-light show')])[1]//li//a[contains(text(),'Customize Profile')]";
	private static final String lnk_CompanyProfilePage_TopMenu_ToggleDots_MenuContainer_MergeCompany = "Merge Company Top Menu Toggle Dots Menu container link in Company Profile Page#xpath=(//ul[contains(@class,'dropdown-menu bg-light show')])[1]//li//a[contains(text(),'Merge Company')]";
	private static final String lnk_CompanyProfilePage_TopMenu_ToggleDots_MenuContainer_ViewUserAccessList = "View User Access List Top Menu Toggle Dots Menu container link in Company Profile Page#xpath=(//ul[contains(@class,'dropdown-menu bg-light show')])[1]//li//a[contains(text(),'View User Access List')]";
	private static final String lnk_CompanyProfilePage_TopMenu_ToggleDots_MenuContainer_DeleteCompany = "Delete Company Top Menu Toggle Dots Menu container link in Company Profile Page#xpath=(//ul[contains(@class,'dropdown-menu bg-light show')])[1]//li//a[contains(@title,'delete_org')]";
	private static final String lnk_CompanyProfilePage_TopMenu_ToggleDots_MenuContainer_PrintReport = "Print Report Top Menu Toggle Dots Menu container link in Company Profile Page#xpath=(//ul[contains(@class,'dropdown-menu bg-light show')])[1]//li//a[contains(text(),'Print Report')]";
	private static final String lnk_CompanyProfilePage_TopMenu_ToggleDots_MenuContainer_ViewProfileasPublic = "View Profile as Public Top Menu Toggle Dots Menu container link in Company Profile Page#xpath=(//ul[contains(@class,'dropdown-menu bg-light show')])[1]//li//a[contains(text(),'View Profile as Public')]";

	private static final String lbl_CompanyProfilePage_DeleteUserConfirmDialog = "Delete Company Confirm Dialog in Company Profile Page#xpath=//form[contains(@class,'modal fade delete-confirmation show')]//div[contains(@class,'modal-dialog')]";
	private static final String btn_CompanyProfilePage_DeleteUserConfirmDialog_Delete = "Delete Button in Delete User Confirm Dialog in Company Profile Page#xpath=//form[contains(@class,'modal fade delete-confirmation show')]//div[contains(@class,'modal-dialog')]//button[contains(text(),'Delete')]";

	private static final String lbl_CompanyProfilePage_Profile_MainPage = "Company Profile Main Page Label#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'hatcher-box')]//*[contains(text(),'About')]";
	private static final String lbl_CompanyProfilePage_Profile_MainPage_Description = "Company Profile Description in Main Page Label#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'hatcher-box')]//div[contains(@class,'external-data-description')]//span";
	private static final String lnk_CompanyProfilePage_Profile_MainPage_EditDescription_DoggleDots = "Edit Description Doggle Dots of Company Profile Main Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'hatcher-box')]//a[contains(@id,'dropdownProfileOptions')]";
	private static final String lst_CompanyProfilePage_Profile_MainPage_EditDescription_OptionsList = "Edit Description Options List of Company Profile Main Page#xpath=//ul[contains(@aria-labelledby,'dropdownProfileOptions')]";
	private static final String lnk_CompanyProfilePage_Profile_MainPage_EditDescription_OptionsList_EditDescription = "Edit Description Link in Options List of Company Profile Main Page#xpath=//ul[contains(@aria-labelledby,'dropdownProfileOptions')]//li//a[contains(text(),'Edit Description')]";
	private static final String lnk_CompanyProfilePage_Profile_MainPage_EditDescription_OptionsList_EditLogo = "Edit Logo Link in Options List of Company Profile Main Page#xpath=//ul[contains(@aria-labelledby,'dropdownProfileOptions')]//li//a[contains(text(),'Edit Logo')]";

	private static final String lnk_CompanyProfilePage_Profile_MainPage_About_DoggleDots = "About Company Doggle Dots of Company Profile Main Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'hatcher-box')]//a[contains(@id,'dropdownDealflow')]";
	private static final String lst_CompanyProfilePage_Profile_MainPage_About_OptionsList = "About Company Options List of Company Profile Main Page#xpath=//body/ul[contains(@aria-labelledby,'dropdownDealflow')]";
	private static final String lnk_CompanyProfilePage_Profile_MainPage_About_OptionsList_UploadPresentation = "Upload Presentation Link of About Company in Options List of Company Profile Main Page#xpath=//body/ul[contains(@aria-labelledby,'dropdownDealflow')]//li//a[contains(text(),'Upload Presentation')]";
	private static final String lnk_CompanyProfilePage_Profile_MainPage_About_OptionsList_UploadScreenshot = "Upload Screenshot Link of About Company in Options List of Company Profile Main Page#xpath=//body/ul[contains(@aria-labelledby,'dropdownDealflow')]//li//a[contains(text(),'Upload Screenshot')]";

	private static final String lnk_CompanyProfilePage_Share = "Share Link in Company Profile Page#xpath=//div[contains(@class,'org-page')]//a[contains(text(),'Share')]";


	private static final String lbl_CompanyProfilePage_EditProfilePage_CompanySection = "Company section #xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'company')]";
	private static final String lbl_CompanyProfilePage_EditProfilePage_CompanyFormerNamesSection = "Company former Names section#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'former-names')]";
	private static final String lbl_CompanyProfilePage_EditProfilePage_ContactDetailsSection = "Contact Details section #xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]";
	private static final String lbl_CompanyProfilePage_EditProfilePage_DescriptionSection = "Description section#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'description')]";
	private static final String lbl_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection = "Digital Foot Print section#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]";
	private static final String lbl_CompanyProfilePage_EditProfilePage_FinanceandLegalSection = "Finance and Legal section#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]";
	private static final String lbl_CompanyProfilePage_EditProfilePage_IndustrySection = "Industry section#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'industry')]";
	private static final String lbl_CompanyProfilePage_EditProfilePage_KeywordsSection = "Keywords section#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'keywords')]";
	private static final String lbl_CompanyProfilePage_EditProfilePage_RegionsSection = "Regions section#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'regions')]";
	private static final String lbl_CompanyProfilePage_EditProfilePage_MarketingMetricsSection = "Marketing Metrics section#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]";
	private static final String lbl_CompanyProfilePage_EditProfilePage_CommunitySettingsSection = "Community Settings section#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'syndicate_settings')]";

	/******************************Edit Company Profile Page Starting**********************************/

	/******************************Company Section*******************************/
//EP means EditProfile
	//private static final String lbl_CompanyProfilePage_EditProfilePage_CompanySection_LegalName = "Legal Name Label in Company section of Company Edit Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'company')]//*[text()='Legal Name']";
	//private static final String lbl_CompanyProfilePage_EditProfilePage_CompanySection_FriendlyName = "Friendly Name Label in Company section of Company Edit Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'company')]//*[text()='Friendly Name']";
	//private static final String lbl_CompanyProfilePage_EditProfilePage_CompanySection_IncorporationDate = "Incorporation date Label in Company section of Company Edit Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'company')]//*[text()='Incorporation date']";
	//private static final String lbl_CompanyProfilePage_EditProfilePage_CompanySection_Jurisdiction = "Jurisdiction Label in Company section of Company Edit Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'company')]//*[text()='Jurisdiction']";
	private static final String lbl_EP_CompanySection_GoverningBody = "Governing Body Label in Company section#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'company')]//*[text()='Governing Body']";
	private static final String lbl_EP_CompanySection_RegistrationNumber = "Registration Number Label in Company section#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'company')]//*[text()='Registration Number']";

	public static final String lnk_EP_CompanySection_Back = "Back Link in Company section#xpath=//div[contains(@id,'profile-panel')]//*[contains(text(),'Edit Company')]//a";
	public static final String rdb_EP_CompanySection_LegalName_HatcherOption = "Legal Name Hatcher-Company section#xpath=//*[text()='Legal Name']/parent::div/following-sibling::div//input[@type='radio' and @value='Hatcher']";
	public static final String txt_EP_CompanySection_LegalName_HatcherOption = "Legal Name Hatcher-Company section#xpath=//*[text()='Legal Name']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']";
	public static final String rdb_EP_CompanySection_LegalName_ClearbitOption = "Legal Name-Company section#xpath=//*[text()='Legal Name']/parent::div/following-sibling::div//input[@type='radio' and @value='Clearbit']";
	public static final String txt_EP_CompanySection_LegalName_ClearbitOption = "Legal Name Clearbit-Company section#xpath=//*[text()='Legal Name']/parent::div/following-sibling::div//input[contains(@value,'Clearbit')]/parent::label/following-sibling::input[@type='text']";
	
	public static final String rdb_EP_CompanySection_FriendlyName_HatcherOption = "Friendly Name Hatcher Option - Company section#xpath=//*[text()='Friendly Name']/parent::div/following-sibling::div//input[@type='radio' and @value='Hatcher']";
	public static final String txt_EP_CompanySection_FriendlyName_HatcherOption = "Friendly Name Hatcher Option -Company section#xpath=//*[text()='Friendly Name']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']";
	public static final String rdb_EP_CompanySection_FriendlyName_ClearbitOption = "Friendly Name Clearbit Option - Company section#xpath=//*[text()='Friendly Name']/parent::div/following-sibling::div//input[@type='radio' and @value='Clearbit']";
	public static final String txt_EP_CompanySection_FriendlyName_ClearbitOption = "Friendly Name Clearbit Option - Company section#xpath=//*[text()='Friendly Name']/parent::div/following-sibling::div//input[contains(@value,'Clearbit')]/parent::label/following-sibling::input[@type='text']";
	public static final String rdb_EP_CompanySection_FriendlyName_LinkedInOption = "Friendly Name LinkedIn Option - Company section#xpath=//*[text()='Friendly Name']/parent::div/following-sibling::div//input[@type='radio' and @value='LinkedIn']";
	private static final String txt_EP_CompanySection_FriendlyName_LinkedInOption = "Friendly Name LinkedIn Option - Company section#xpath=//*[text()='Friendly Name']/parent::div/following-sibling::div//input[contains(@value,'LinkedIn')]/parent::label/following-sibling::input[@type='text']";
	
	private static final String rdb_EP_CompanySection_IncorporationDate_HatcherOption = "Incorporation Date Hatcher- Company section#xpath=//*[text()='Incorporation date']/parent::div/following-sibling::div//input[@type='radio' and @value='Hatcher']";
	private static final String txt_EP_CompanySection_IncorporationDate_HatcherOption = "Incorporation Date Hatcher - Company section#xpath=//*[text()='Incorporation date']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::div[contains(@class,'datepicker')]//input";
	private static final String rdb_EP_CompanySection_IncorporationDate_ClearbitOption = "Incorporation Date Clearbit Option Radiobutton - Company section#xpath=//*[text()='Incorporation date']/parent::div/following-sibling::div//input[@type='radio' and @value='Clearbit']";
	public static final String txt_EP_CompanySection_IncorporationDate_ClearbitOption = "Incorporation Date Clearbit Option Textbox - Company section#xpath=//*[text()='Incorporation date']/parent::div/following-sibling::div//input[contains(@value,'Clearbit')]/parent::label/following-sibling::div[contains(@class,'datepicker')]//input";
	
	private static final String rdb_EP_CompanySection_Jurisdiction_HatcherOption = "Jurisdiction Hatcher Option Radiobutton - Company sectione#xpath=//*[text()='Jurisdiction']/parent::div/following-sibling::div//input[@type='radio' and @value='Hatcher']";
	private static final String drp_EP_CompanySection_Jurisdiction_HatcherOption = "Jurisdiction Hatcher Option Dropdown - Company section#xpath=//*[text()='Jurisdiction']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::div//div[contains(@class,'multiselect__select')]";
	public static final String txt_EP_CompanySection_Jurisdiction_HatcherOption = "Jurisdiction Hatcher Option - Company section#xpath=//*[text()='Jurisdiction']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/parent::div//input[@type='text']";
	private static final String rdb_EP_CompanySection_Jurisdiction_LinkedInOption = "Jurisdiction LinkedIn Option -Company section#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'company')]//*[text()='Jurisdiction']/parent::div/following-sibling::div//input[@type='radio' and @value='LinkedIn']";
	private static final String drp_EP_CompanySection_Jurisdiction_LinkedInOption = "Jurisdiction LinkedIn Option -Company section#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'company')]//*[text()='Jurisdiction']/parent::div/following-sibling::div//input[contains(@value,'LinkedIn')]/parent::label/following-sibling::div//div[contains(@class,'multiselect__select')]";
	public static final String txt_EP_CompanySection_Jurisdiction_LinkedInOption = "Jurisdiction LinkedIn Option - Company section#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'company')]//*[text()='Jurisdiction']/parent::div/following-sibling::div//input[contains(@value,'LinkedIn')]/parent::label/parent::div//input[@type='text']";
	
	private static final String rdb_EP_CompanySection_GoverningBody_HatcherOption = "Governing Body Hatcher Option - Company section#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'company')]//*[text()='Governing Body']/parent::div/following-sibling::div//input[@type='radio' and @value='Hatcher']";
	private static final String drp_EP_CompanySection_GoverningBody_HatcherOption = "Governing Body Hatcher Option -Company section#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'company')]//*[text()='Governing Body']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::div//div[contains(@class,'multiselect__select')]";
	public static final String txt_EP_CompanySection_GoverningBody_HatcherOption = "Governing Body Hatcher Option - Company section#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'company')]//*[text()='Governing Body']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/parent::div//input[@type='text']";
	private static final String rdb_EP_CompanySection_RegistrationNumber_HatcherOption = "Registration Number Hatcher Option Radiobutton in Company section of Company Edit Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'company')]//*[text()='Registration Number']/parent::div/following-sibling::div//input[@type='radio' and @value='Hatcher']";
	public static final String txt_EP_CompanySection_RegistrationNumber_HatcherOption = "Registration Number Hatcher Option Textbox in Company section of Company Edit Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'company')]//*[text()='Registration Number']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']";
	private static final String btn_EP_CompanySection_SaveChanges = "Save Changes Button in Company section of Company Edit Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'company')]//button[text()='Save Changes']";
	private static final String lbl__EP_CompanySection_Jurisdiction_HatcherOption_errorMessage = "Jurisdiction Hatcher Option Textbox Element Not Found Error Message in Company section of Company Edit Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'company')]//*[text()='Jurisdiction']/parent::div/following-sibling::div//label[contains(text(),'Hatcher')]//parent::div//ul[contains(@class,'multiselect__content')]//li//span[contains(text(),'No elements found. Consider changing the search query')]";
	private static final String lbl_EP_CompanySection_GoverningBody_HatcherOption_elementNotFoud_errorMessage = "Governing Body Hatcher Option Textbox Element Not Found Error Message in Company section of Company Edit Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'company')]//*[text()='Governing Body']/parent::div/following-sibling::div//label[contains(text(),'Hatcher')]//parent::div//ul[contains(@class,'multiselect__content')]//li//span[contains(text(),'No elements found. Consider changing the search query')]";

	/******************************Company Former Names Section*******************************/

	//private static final String tbl_CompanyProfilePage_EditProfilePage_CompanyFormerNamesSection_Table = "Table in Company Former Names section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'former-names')]//table//th[contains(text(),'Former Names')]";
	private static final String txt_EP_CompanyFormerNamesSection_FormerName = "Former Name Textbox in Company Former Names section of Edit Profile Page in Company Profile Page#xpath=(//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'former-names')]//table//tbody//input)[1]";
	private static final String lnk_EP_CompanyFormerNamesSection_FormerName_Close = "Former Name New Row Close Link in Company Former Names section of Edit Profile Page in Company Profile Page#xpath=(//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'former-names')]//table//tbody//input)[1]/parent::td/following-sibling::td//a";
	private static final String btn_EP_CompanyFormerNamesSection_SaveChanges = "Save Changes Button in Company Former Names section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'former-names')]//button[text()='Save Changes']";
	private static final String lbl_EP_CompanyFormerNamesSection_Updated_SuccessMessage = "Company Former Names Updated Success Message of Edit Profile Page in Company Profile Page#xpath=//div[contains(@class,'swal2-popup swal2-modal swal2-icon-success')]//*[contains(text(),'Former Names section has been updated!')]";	
	private static final String btn_EP_CompanyFormerNamesSection_Updated_SuccessMessage_OK = "OK Button- Success Message#xpath=//div[contains(@class,'swal2-popup swal2-modal swal2-icon-success')]//button[contains(text(),'Ok')]";

	//newly added

	private static final String tbl_EP_CompanyFormerNamesSection_Table = "Former Name Text#xpath=//table//th[contains(text(),'Former Names')]";
	private static final String txt_CompanyProfilePage_placeholder_CompanyFormerNamesSection_FormerName ="TextBox_FormerName_CompanyFormerSection#xpath=//input[contains(@placeholder,'Type former name')]";
	private static final String txt_CompanyFormerName_Existing_First="Former Name Text First#xpath=(//tr[contains(@class,'org-edit-new-former-names')])[1]";


	/******************************Contact Section*******************************/

	private static final String lbl_EP_ContactDetailsSection_MainContact = "Main Contact -Contact Details section#xpath=//*[text()='Main Contact']";
	private static final String lbl_EP_ContactDetailsSection_Address = "Address label- Contact Details section #xpath=//div[contains(@id,'contact')]//*[text()='Address']";
	private static final String lbl_EP_ContactDetailsSection_UnitSuite = "Unit/Suite label in Contact Details section#xpath=//*[text()='Unit/Suite']";
	private static final String lbl_EP_ContactDetailsSection_City = "City label in Contact Details#xpath=//div[contains(@id,'contact')]//*[text()='City']";
	private static final String lbl_EP_ContactDetailsSection_PostalCode = "Postal Code label in Contact Details#xpath=//div[contains(@id,'contact')]//*[text()='Postal code']";
	private static final String lbl_EP_ContactDetailsSection_State = "State label in Contact Details section#xpath=//div[contains(@id,'contact')]//*[text()='State']";
	private static final String lbl_EP_ContactDetailsSection_Country = "Country label in Contact Details section #xpath=//div[contains(@id,'contact')]//*[text()='Country']";
	private static final String lbl_EP_ContactDetailsSection_Latitude = "Latitude label in Contact Details section#xpath=//div[contains(@id,'contact')]//*[text()='Latitude']";
	private static final String lbl_EP_ContactDetailsSection_Longitude = "Longitude label in Contact Details section#xpath=//div[contains(@id,'contact')]//*[text()='Longitude']";
	private static final String lbl_EP_ContactDetailsSection_CompanyEmail = "Company Email label in Contact Details#xpath=//div[contains(@id,'contact')]//*[text()='Company Email']";
	private static final String lbl_EP_ContactDetailsSection_Phone = "Phone label in Contact Details section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='Phone']";

	private static final String rdb_EP_ContactDetailsSection_MainContact_HatcherOption = "Main Contact Hatcher Option - Contact Details section#xpath=//div[contains(@id,'contact')]//*[text()='Main Contact']/parent::div/following-sibling::div//input[@type='radio' and @value='Hatcher']";
	private static final String drp_EP_ContactDetailsSection_MainContact_HatcherOption = "Main Contact Hatcher Option Dropdown in Contact Details section#xpath=//div[contains(@id,'contact')]//*[text()='Main Contact']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::div//div[contains(@class,'multiselect__select')]";
	public static final String txt_EP_ContactDetailsSection_MainContact_HatcherOption = "Main Contact Hatcher Option Textbox in Contact Details section#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='Main Contact']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/parent::div//input[@type='text']";
	
	public static final String rdb_EP_ContactDetailsSection_Address_HatcherOption = "Address Hatcher Option Radiobutton in Contact Details section#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='Address']/parent::div/following-sibling::div//input[@type='radio' and @value='Hatcher']";
	public static final String txt_EP_ContactDetailsSection_Address_HatcherOption = "Address Hatcher Option Textbox in Contact Details section#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='Address']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']";
	
	public static final String rdb_EP_ContactDetailsSection_Address_ClearbitOption = "Address Clearbit Option Radiobutton in Contact Details section#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='Address']/parent::div/following-sibling::div//input[@type='radio' and @value='Clearbit']";
	public static final String txt_EP_ContactDetailsSection_Address_ClearbitOption = "Address Clearbit Option Textbox in Contact Details section#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='Address']/parent::div/following-sibling::div//input[contains(@value,'Clearbit')]/parent::label/following-sibling::input[@type='text']";
	
	public static final String rdb_EP_ContactDetailsSection_Address_LinkedInOption = "Address LinkedIn Option Radiobutton in Contact Details sectione#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='Address']/parent::div/following-sibling::div//input[@type='radio' and @value='LinkedIn']";
	public static final String txt_EP_ContactDetailsSection_Address_LinkedInOption = "Address LinkedIn Option Textbox in Contact Details section#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='Address']/parent::div/following-sibling::div//input[contains(@value,'LinkedIn')]/parent::label/following-sibling::input[@type='text']";
	
	public static final String rdb_EP_ContactDetailsSection_UnitSuite_HatcherOption = "Unit/Suite Hatcher Option Radiobutton in Contact Details section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='Unit/Suite']/parent::div/following-sibling::div//input[@type='radio' and @value='Hatcher']";
	public static final String txt_EP_ContactDetailsSection_UnitSuite_HatcherOption = "Unit/Suite Hatcher Option Textbox in Contact Details section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='Unit/Suite']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']";
	
	public static final String rdb_EP_ContactDetailsSection_UnitSuite_ClearbitOption = "Unit/Suite Clearbit Option Radiobutton in Contact Details section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='Unit/Suite']/parent::div/following-sibling::div//input[@type='radio' and @value='Clearbit']";
	public static final String txt_EP_ContactDetailsSection_UnitSuite_ClearbitOption = "Unit/Suite Clearbit Option Textbox in Contact Details section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='Unit/Suite']/parent::div/following-sibling::div//input[contains(@value,'Clearbit')]/parent::label/following-sibling::input[@type='text']";
	
	public static final String rdb_EP_ContactDetailsSection_City_HatcherOption = "City Hatcher Option Radiobutton in Contact Details section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='City']/parent::div/following-sibling::div//input[@type='radio' and @value='Hatcher']";
	public static final String txt_EP_ContactDetailsSection_City_HatcherOption = "City Hatcher Option Textbox in Contact Details section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='City']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']";
	
	public static final String rdb_EP_ContactDetailsSection_City_ClearbitOption = "City Clearbit Option Radiobutton in Contact Details section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='City']/parent::div/following-sibling::div//input[@type='radio' and @value='Clearbit']";
	public static final String txt_EP_ContactDetailsSection_City_ClearbitOption = "City Clearbit Option Textbox in Contact Details section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='City']/parent::div/following-sibling::div//input[contains(@value,'Clearbit')]/parent::label/following-sibling::input[@type='text']";
	
	public static final String rdb_EP_ContactDetailsSection_City_LinkedInOption = "City LinkedIn Option Radiobutton in Contact Details section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='City']/parent::div/following-sibling::div//input[@type='radio' and @value='LinkedIn']";
	public static final String txt_EP_ContactDetailsSection_City_LinkedInOption = "City LinkedIn Option Textbox in Contact Details section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='City']/parent::div/following-sibling::div//input[contains(@value,'LinkedIn')]/parent::label/following-sibling::input[@type='text']";
	
	public static final String rdb_EP_ContactDetailsSection_PostalCode_HatcherOption = "Postal Code Hatcher Option Radiobutton in Contact Details section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='Postal code']/parent::div/following-sibling::div//input[@type='radio' and @value='Hatcher']";
	public static final String txt_EP_ContactDetailsSection_PostalCode_HatcherOption = "Postal Code Hatcher Option Textbox in Contact Details section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='Postal code']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']";
	
	public static final String rdb_EP_ContactDetailsSection_PostalCode_ClearbitOption = "Postal Code Clearbit Option Radiobutton in Contact Details section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='Postal code']/parent::div/following-sibling::div//input[@type='radio' and @value='Clearbit']";
	public static final String txt_EP_ContactDetailsSection_PostalCode_ClearbitOption = "Postal Code Clearbit Option Textbox in Contact Details section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='Postal code']/parent::div/following-sibling::div//input[contains(@value,'Clearbit')]/parent::label/following-sibling::input[@type='text']";
	
	public static final String rdb_EP_ContactDetailsSection_PostalCode_LinkedInOption = "Postal Code LinkedIn Option Radiobutton in Contact Details section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='Postal code']/parent::div/following-sibling::div//input[@type='radio' and @value='LinkedIn']";
	public static final String txt_EP_ContactDetailsSection_PostalCode_LinkedInOption = "Postal Code LinkedIn Option Textbox in Contact Details section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='Postal code']/parent::div/following-sibling::div//input[contains(@value,'LinkedIn')]/parent::label/following-sibling::input[@type='text']";
	
	public static final String rdb_EP_ContactDetailsSection_State_HatcherOption = "State Hatcher Option Radiobutton in Contact Details section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='State']/parent::div/following-sibling::div//input[@type='radio' and @value='Hatcher']";
	public static final String txt_EP_ContactDetailsSection_State_HatcherOption = "State Hatcher Option Textbox in Contact Details section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='State']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']";
	
	public static final String rdb_EP_ContactDetailsSection_State_ClearbitOption = "State Clearbit Option Radiobutton in Contact Details section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='State']/parent::div/following-sibling::div//input[@type='radio' and @value='Clearbit']";
	public static final String txt_EP_ContactDetailsSection_State_ClearbitOption = "State Clearbit Option Textbox in Contact Details section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='State']/parent::div/following-sibling::div//input[contains(@value,'Clearbit')]/parent::label/following-sibling::input[@type='text']";
	
	public static final String rdb_EP_ContactDetailsSection_Country_HatcherOption = "Country Hatcher Option Radiobutton in Contact Details section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='Country']/parent::div/following-sibling::div//input[@type='radio' and @value='Hatcher']";
	public static final String drp_EP_ContactDetailsSection_Country_HatcherOption = "Country Hatcher Option Dropdown in Contact Details section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='Country']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::div//div[contains(@class,'multiselect__select')]";
	public static final String txt_EP_ContactDetailsSection_Country_HatcherOption = "Country Hatcher Option Textbox in Contact Details section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='Country']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/parent::div//input[@type='text']";
	
	public static final String rdb_EP_ContactDetailsSection_Country_ClearbitOption = "Country Clearbit Option Radiobutton in Contact Details section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='Country']/parent::div/following-sibling::div//input[@type='radio' and @value='Clearbit']";
	public static final String drp_EP_ContactDetailsSection_Country_ClearbitOption = "Country Clearbit Option Dropdown in Contact Details section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='Country']/parent::div/following-sibling::div//input[contains(@value,'Clearbit')]/parent::label/following-sibling::div//div[contains(@class,'multiselect__select')]";
	public static final String txt_EP_ContactDetailsSection_Country_ClearbitOption = "Country Clearbit Option Textbox in Contact Details section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='Country']/parent::div/following-sibling::div//input[contains(@value,'Clearbit')]/parent::label/parent::div//input[@type='text']";
	
	public static final String rdb_EP_ContactDetailsSection_Country_LinkedInOption = "Country LinkedIn Option Radiobutton in Contact Details section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='Country']/parent::div/following-sibling::div//input[@type='radio' and @value='LinkedIn']";
	public static final String drp_EP_ContactDetailsSection_Country_LinkedInOption = "Country LinkedIn Option Dropdown in Contact Details section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='Country']/parent::div/following-sibling::div//input[contains(@value,'LinkedIn')]/parent::label/following-sibling::div//div[contains(@class,'multiselect__select')]";
	
	public static final String txt_EP_ContactDetailsSection_Country_LinkedInOption = "Country LinkedIn Option Textbox in Contact Details section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='Country']/parent::div/following-sibling::div//input[contains(@value,'LinkedIn')]/parent::label/parent::div//input[@type='text']";
	public static final String rdb_EP_ContactDetailsSection_Latitude_HatcherOption = "Latitude Hatcher Option Radiobutton in Contact Details section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='Latitude']/parent::div/following-sibling::div//input[@type='radio' and @value='Hatcher']";
	
	public static final String txt_EP_ContactDetailsSection_Latitude_HatcherOption = "Latitude Hatcher Option Textbox in Contact Details section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='Latitude']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']";
	public static final String rdb_EP_ContactDetailsSection_Latitude_ClearbitOption = "Latitude Clearbit Option Radiobutton in Contact Details section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='Latitude']/parent::div/following-sibling::div//input[@type='radio' and @value='Clearbit']";
	
	public static final String txt_EP_ContactDetailsSection_Latitude_ClearbitOption = "Latitude Clearbit Option Textbox in Contact Details section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='Latitude']/parent::div/following-sibling::div//input[contains(@value,'Clearbit')]/parent::label/following-sibling::input[@type='text']";
	public static final String rdb_EP_ContactDetailsSection_Longitude_HatcherOption = "Longitude Hatcher Option Radiobutton in Contact Details section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='Longitude']/parent::div/following-sibling::div//input[@type='radio' and @value='Hatcher']";
	
	public static final String txt_EP_ContactDetailsSection_Longitude_HatcherOption = "Longitude Hatcher Option Textbox in Contact Details section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='Longitude']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']";
	public static final String rdb_CompanyProfilePage_EditProfilePage_ContactDetailsSection_Longitude_ClearbitOption_RadioButton = "Longitude Clearbit Option Radiobutton in Contact Details section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='Longitude']/parent::div/following-sibling::div//input[@type='radio' and @value='Clearbit']";
	public static final String txt_CompanyProfilePage_EditProfilePage_ContactDetailsSection_Longitude_ClearbitOption_Textbox = "Longitude Clearbit Option Textbox in Contact Details section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='Longitude']/parent::div/following-sibling::div//input[contains(@value,'Clearbit')]/parent::label/following-sibling::input[@type='text']";
	public static final String rdb_CompanyProfilePage_EditProfilePage_ContactDetailsSection_CompanyEmail_HatcherOption_RadioButton = "Company Email Hatcher Option Radiobutton in Contact Details section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='Company Email']/parent::div/following-sibling::div//input[@type='radio' and @value='Hatcher']";
	public static final String txt_EditProfilePage_ContactDetailsSection_CompanyEmail_HatcherOption = "Company Email Hatcher Option Textbox in Contact Details section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='Company Email']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']";
	public static final String rdb_EditProfilePage_ContactDetailsSection_Phone_HatcherOption = "Phone Hatcher Option Radiobutton in Contact Details section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='Phone']/parent::div/following-sibling::div//input[@type='radio' and @value='Hatcher']";
	public static final String txt_CompanyProfilePage_EditProfilePage_ContactDetailsSection_Phone_HatcherOption_Textbox = "Phone Hatcher Option Textbox in Contact Details section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='Phone']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/parent::div//input[@type='tel']";
	public static final String btn_CompanyProfilePage_EditProfilePage_ContactDetailsSection_SaveChanges = "SaveChanges Button in Contact Details section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//button[text()='Save Changes']";

	public static final String lbl_CompanyProfilePage_EditProfilePage_ContactDetailsSection_Country_HatcherOption_Textbox_elementNotFoud_errorMessage = "Country Hatcher Option Textbox Element Not Found Error Message in Company section of Company Edit Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='Country']/parent::div/following-sibling::div//label[contains(text(),'Hatcher')]//parent::div//ul[contains(@class,'multiselect__content')]//li//span[contains(text(),'No elements found. Consider changing the search query')]";

	/******************************Description Section*******************************/

	public static final String rdb_CompanyProfilePage_EditProfilePage_DescriptionSection_Description_HatcherOption_RadioButton = "Description Hatcher Option Radiobutton in Description Section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'description')]//input[contains(@type,'radio') and contains(@value,'Hatcher')]";
	public static final String txt_CompanyProfilePage_EditProfilePage_DescriptionSection_Description_HatcherOption_Textbox = "Description Hatcher Option Textbox in Description Section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'description')]//input[contains(@type,'radio') and contains(@value,'Hatcher')]/parent::label//parent::div//div[contains(@class,'note-editable')]";
	public static final String rdb_CompanyProfilePage_EditProfilePage_DescriptionSection_Description_ClearbitOption_RadioButton = "Description Clearbit Option Radiobutton in Description Section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'description')]//input[contains(@type,'radio') and contains(@value,'Clearbit')]";
	public static final String txt_CompanyProfilePage_EditProfilePage_DescriptionSection_Description_ClearbitOption_Textbox = "Description Clearbit Option Textbox in Description Section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'description')]//input[contains(@type,'radio') and contains(@value,'Clearbit')]/parent::label//parent::div//div[contains(@class,'note-editable')]";
	public static final String rdb_CompanyProfilePage_EditProfilePage_DescriptionSection_Description_TwitterOption_RadioButton = "Description Twitter Option Radiobutton in Description Section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'description')]//input[contains(@type,'radio') and contains(@value,'Twitter')]";
	public static final String txt_CompanyProfilePage_EditProfilePage_DescriptionSection_Description_TwitterOption_Textbox = "Description Twitter Option Textbox in Description Section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'description')]//input[contains(@type,'radio') and contains(@value,'Twitter')]/parent::label//parent::div//div[contains(@class,'note-editable')]";
	public static final String rdb_CompanyProfilePage_EditProfilePage_DescriptionSection_Description_LinkedInOption_RadioButton = "Description LinkedIn Option Radiobutton in Description Section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'description')]//input[contains(@type,'radio') and contains(@value,'LinkedIn')]";
	public static final String txt_CompanyProfilePage_EditProfilePage_DescriptionSection_Description_LinkedInOption_Textbox = "Description LinkedIn Option Textbox in Description Section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'description')]//input[contains(@type,'radio') and contains(@value,'LinkedIn')]/parent::label//parent::div//div[contains(@class,'note-editable')]";
	public static final String btn_CompanyProfilePage_EditProfilePage_DescriptionSection_SaveChanges = "SaveChanges  Button in Description Section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'description')]//button[text()='Save Changes']";

	/******************************Digital Footprint*******************************/

	public static final String lbl_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_Crunchbase = "Crunchbase Label in Digital Foot Print section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='Crunchbase']";
	public static final String lbl_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_Facebook = "Facebook Label in Digital Foot Print section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='Facebook']";
	public static final String lbl_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_Instagram = "Instagram Label in Digital Foot Print section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='Instagram']";
	public static final String lbl_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_Angellist = "Angellist Label in Digital Foot Print section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='Angellist']";
	private static final String lbl_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_Medium = "Medium Label in Digital Foot Print section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='Medium']";
	public static final String lbl_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_LinkedIn = "LinkedIn Label in Digital Foot Print section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='LinkedIn']";
	public static final String lbl_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_Pinterest = "Pinterest Label in Digital Foot Print section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='Pinterest']";
	public static final String lbl_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_RSSFeed = "RSS Feed Label in Digital Foot Print section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='RSS Feed']";
	public static final String lbl_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_Twitter = "Twitter Label in Digital Foot Print section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='Twitter']";
	public static final String lbl_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_Vimeo = "Vimeo Label in Digital Foot Print section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='Vimeo']";
	public static final String lbl_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_Website = "Website Label in Digital Foot Print section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='Website']";
	public static final String lbl_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_YouTube = "YouTube Label in Digital Foot Print section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='YouTube']";

	public static final String rdb_EP_DigitalFootPrintSection_Crunchbase_HatcherOption = "Crunchbase Hatcher Option Radiobutton in Digital Foot Print section #xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='Crunchbase']/parent::div/following-sibling::div//input[@type='radio' and @value='Hatcher']";
	public static final String txt_EP_DigitalFootPrintSection_Crunchbase_HatcherOption = "Crunchbase Hatcher Option Textbox in Digital Foot Print section#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='Crunchbase']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']";
	public static final String rdb_EP_DigitalFootPrintSection_Crunchbase_ClearbitOption = "Crunchbase Clearbit Option Radiobutton in Digital Foot Print section#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='Crunchbase']/parent::div/following-sibling::div//input[@type='radio' and @value='Clearbit']";
	public static final String txt_EP_DigitalFootPrintSection_Crunchbase_ClearbitOption = "Crunchbase Clearbit Option Textbox in Digital Foot Print section#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='Crunchbase']/parent::div/following-sibling::div//input[contains(@value,'Clearbit')]/parent::label/following-sibling::input[@type='text']";
	
	public static final String rdb_EP_DigitalFootPrintSection_Facebook_HatcherOption = "Facebook Hatcher Option - Digital Foot Print section#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='Facebook']/parent::div/following-sibling::div//input[@type='radio' and @value='Hatcher']";
	public static final String txt_EP_DigitalFootPrintSection_Facebook_HatcherOption = "Facebook Hatcher Option -Digital Foot Print section#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='Facebook']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']";
	public static final String rdb_EP_DigitalFootPrintSection_Facebook_ClearbitOption = "Facebook Clearbit Option - Digital Foot Print section #xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='Facebook']/parent::div/following-sibling::div//input[@type='radio' and @value='Clearbit']";
	public static final String txt_EP_DigitalFootPrintSection_Facebook_ClearbitOption = "Facebook Clearbit Option - Digital Foot Print section#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='Facebook']/parent::div/following-sibling::div//input[contains(@value,'Clearbit')]/parent::label/following-sibling::input[@type='text']";
	
	public static final String rdb_EP_DigitalFootPrintSection_Instagram_HatcherOption = "Instagram Hatcher Option- Digital Foot Print section#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='Instagram']/parent::div/following-sibling::div//input[@type='radio' and @value='Hatcher']";
	public static final String txt_EP_DigitalFootPrintSection_Instagram_HatcherOption = "Instagram Hatcher Option-Digital Foot Print section#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='Instagram']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']";
	
	public static final String rdb_EP_DigitalFootPrintSection_Angellist_HatcherOption = "Angellist Hatcher Option  Radiobutton in Digital Foot Print section#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='Angellist']/parent::div/following-sibling::div//input[@type='radio' and @value='Hatcher']";
	public static final String txt_EP_DigitalFootPrintSection_Angellist_HatcherOption = "Angellist Hatcher Option Textbox in Digital Foot Print section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='Angellist']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']";
	public static final String rdb_EP_DigitalFootPrintSection_Medium_HatcherOption = "Medium Hatcher Option Radiobutton in Digital Foot Print section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='Medium']/parent::div/following-sibling::div//input[@type='radio' and @value='Hatcher']";
	public static final String txt_EP_DigitalFootPrintSection_Medium_HatcherOption = "Medium Hatcher Option Textbox in Digital Foot Print section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='Medium']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']";
	
	public static final String rdb_EP_DigitalFootPrintSection_LinkedIn_HatcherOption = "LinkedIn Hatcher Option Radiobutton in Digital Foot Print section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='LinkedIn']/parent::div/following-sibling::div//input[@type='radio' and @value='Hatcher']";
	public static final String txt_EP_DigitalFootPrintSection_LinkedIn_HatcherOption = "LinkedIn Hatcher Option Textbox in Digital Foot Print section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='LinkedIn']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']";
	public static final String rdb_EditProfilePage_DigitalFootPrintSection_LinkedIn_ClearbitOption = "LinkedIn Clearbit Option Radiobutton in Digital Foot Print section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='LinkedIn']/parent::div/following-sibling::div//input[@type='radio' and @value='Clearbit']";
	public static final String txt_EditProfilePage_DigitalFootPrintSection_LinkedIn_ClearbitOption = "LinkedIn Clearbit Option Textbox in Digital Foot Print section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='LinkedIn']/parent::div/following-sibling::div//input[contains(@value,'Clearbit')]/parent::label/following-sibling::input[@type='text']";
	public static final String rdb_EditProfilePage_DigitalFootPrintSection_Pinterest_HatcherOption = "Pinterest Hatcher Option Radiobutton in Digital Foot Print section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='Pinterest']/parent::div/following-sibling::div//input[@type='radio' and @value='Hatcher']";
	public static final String txt_EditProfilePage_DigitalFootPrintSection_Pinterest_HatcherOption = "Pinterest Hatcher Option Textbox in Digital Foot Print section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='Pinterest']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']";
	public static final String rdb_EditProfilePage_DigitalFootPrintSection_RSSFeed_HatcherOption = "RSS Feed Hatcher Option Radiobutton in Digital Foot Print section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='RSS Feed']/parent::div/following-sibling::div//input[@type='radio' and @value='Hatcher']";
	public static final String txt_EditProfilePage_DigitalFootPrintSection_RSSFeed_HatcherOption = "RSS Feed Hatcher Option Textbox in Digital Foot Print section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='RSS Feed']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']";
	
	public static final String rdb_EP_DigitalFootPrintSection_Twitter_HatcherOption = "Twitter Hatcher Option Radiobutton in Digital Foot Print section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='Twitter']/parent::div/following-sibling::div//input[@type='radio' and @value='Hatcher']";
	public static final String txt_EP_DigitalFootPrintSection_Twitter_HatcherOption = "Twitter Hatcher Option Textbox in Digital Foot Print section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='Twitter']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']";
	public static final String rdb_EP_DigitalFootPrintSection_Twitter_ClearbitOption = "Twitter Clearbit Option Radiobutton in Digital Foot Print section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='Twitter']/parent::div/following-sibling::div//input[@type='radio' and @value='Clearbit']";
	public static final String txt_EP_DigitalFootPrintSection_Twitter_ClearbitOption = "Twitter Clearbit Option Textbox in Digital Foot Print section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='Twitter']/parent::div/following-sibling::div//input[contains(@value,'Clearbit')]/parent::label/following-sibling::input[@type='text']";
	public static final String rdb_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_Vimeo_HatcherOption_RadioButton = "Vimeo Hatcher Option Radiobutton in Digital Foot Print section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='Vimeo']/parent::div/following-sibling::div//input[@type='radio' and @value='Hatcher']";
	public static final String txt_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_Vimeo_HatcherOption_Textbox = "Vimeo Hatcher Option Textbox in Digital Foot Print section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='Vimeo']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']";
	public static final String rdb_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_Website_HatcherOption_RadioButton = "Website Hatcher Option Radiobutton in Digital Foot Print section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='Website']/parent::div/following-sibling::div//input[@type='radio' and @value='Hatcher']";
	public static final String txt_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_Website_HatcherOption_Textbox = "Website Hatcher Option Textbox in Digital Foot Print section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='Website']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']";
	public static final String rdb_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_Website_ClearbitOption_RadioButton = "Website Clearbit Option Radiobutton in Digital Foot Print section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='Website']/parent::div/following-sibling::div//input[@type='radio' and @value='Clearbit']";
	public static final String txt_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_Website_ClearbitOption_Textbox = "Website Clearbit Option Textbox in Digital Foot Print section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='Website']/parent::div/following-sibling::div//input[contains(@value,'Clearbit')]/parent::label/following-sibling::input[@type='text']";
	public static final String rdb_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_Website_MOZOption_RadioButton = "Website MOZ Option Radiobutton in Digital Foot Print section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='Website']/parent::div/following-sibling::div//input[@type='radio' and @value='MOZ']";
	public static final String txt_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_Website_MOZOption_Textbox = "Website MOZ Option Textbox in Digital Foot Print section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='Website']/parent::div/following-sibling::div//input[contains(@value,'MOZ')]/parent::label/following-sibling::input[@type='text']";
	public static final String rdb_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_YouTube_HatcherOption_RadioButton = "YouTube Hatcher Option Radiobutton in Digital Foot Print section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='YouTube']/parent::div/following-sibling::div//input[@type='radio' and @value='Hatcher']";
	public static final String txt_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_YouTube_HatcherOption_Textbox = "YouTube Hatcher Option Textbox in Digital Foot Print section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='YouTube']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']";
	public static final String btn_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_SaveChanges = "Save Chnages Button in Digital Foot Print section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//button[text()='Save Changes']";


	/******************************Finance & Legal*******************************/
	public static final String lbl_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_Auditor = "Auditor Label in Finance and Legal section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Auditor']";
	private static final String lbl_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_Bank = "Bank Label in Finance and Legal section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Bank']";
	private static final String lbl_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankABANumber = "Bank ABA Number Label in Finance and Legal section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Bank ABA Number']";
	private static final String lbl_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankAccountName = "Bank Account Name Label in Finance and Legal section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Bank Account Name']";
	private static final String lbl_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankAccountNumber = "Bank Account Number Label in Finance and Legal section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Bank Account Number']";
	private static final String lbl_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankAddress = "Bank Address Label in Finance and Legal section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Bank Address']";
	private static final String lbl_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankIntermediary = "Bank Intermediary Label in Finance and Legal section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Bank Intermediary']";
	private static final String lbl_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_IntermediaryBankABANumber = "Intermediary Bank ABA Number Label in Finance and Legal section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Intermediary Bank ABA Number']";
	private static final String lbl_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_IntermediaryBankAddress = "Intermediary Bank Address Label in Finance and Legal section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Intermediary Bank Address']";
	private static final String lbl_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_IntermediaryBankSWIFTBIC = "Intermediary Bank SWIFT BIC Label in Finance and Legal section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Intermediary Bank SWIFT BIC']";
	private static final String lbl_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankSwiftCode = "Bank Swift Code Label in Finance and Legal section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Bank Swift Code']";
	private static final String lbl_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankIBANCode = "Bank IBAN Code Label in Finance and Legal section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Bank IBAN Code']";
	private static final String lbl_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankInstructions = "Bank Instructions Label in Finance and Legal section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Bank Instructions']";
	private static final String lbl_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_CompanySecretary = "Company Secretary Label in Finance and Legal section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Company Secretary']";
	private static final String lbl_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_Currency = "Currency Label in Finance and Legal section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Currency']";
	private static final String lbl_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_FinancialYearEnd = "Financial Year End Label in Finance and Legal section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Financial Year End']";
	private static final String lbl_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_LawFirm = "Law Firm Label in Finance and Legal section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Law Firm']";

	public static final String rdb_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_Auditor_HatcherOption_RadioButton = "Auditor Hatcher Option Radiobutton in Finance and Legal section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Auditor']/parent::div/following-sibling::div//input[@type='radio' and @value='Hatcher']";
	public static final String txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_Auditor_HatcherOption_Textbox = "Auditor Hatcher Option Textbox in Finance and Legal section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Auditor']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']";
	public static final String rdb_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_Bank_HatcherOption_RadioButton = "Bank Hatcher Option Radiobutton in Finance and Legal section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Bank']/parent::div/following-sibling::div//input[@type='radio' and @value='Hatcher']";
	public static final String txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_Bank_HatcherOption_Textbox = "Bank Hatcher Option Textbox in Finance and Legal section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Bank']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']";
	public static final String rdb_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankABANumber_HatcherOption_RadioButton = "Bank ABA Number Hatcher Option Radiobutton in Finance and Legal section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Bank ABA Number']/parent::div/following-sibling::div//input[@type='radio' and @value='Hatcher']";
	public static final String txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankABANumber_HatcherOption_Textbox = "Bank ABA Number Hatcher Option Textbox in Finance and Legal section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Bank ABA Number']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']";
	public static final String rdb_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankAccountName_HatcherOption_RadioButton = "Bank Account Name Hatcher Option Radiobutton in Finance and Legal section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Bank Account Name']/parent::div/following-sibling::div//input[@type='radio' and @value='Hatcher']";
	public static final String txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankAccountName_HatcherOption_Textbox = "Bank Account Name Hatcher Option Textbox in Finance and Legal section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Bank Account Name']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']";
	public static final String rdb_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankAccountNumber_HatcherOption_RadioButton = "Bank Account Number Hatcher Option Radiobutton in Finance and Legal section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Bank Account Number']/parent::div/following-sibling::div//input[@type='radio' and @value='Hatcher']";
	public static final String txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankAccountNumber_HatcherOption_Textbox = "Bank Account Number Hatcher Option Textbox in Finance and Legal section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Bank Account Number']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']";
	public static final String rdb_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankAddress_HatcherOption_RadioButton = "Bank Address Hatcher Option Radiobutton in Finance and Legal section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Bank Address']/parent::div/following-sibling::div//input[@type='radio' and @value='Hatcher']";
	public static final String txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankAddress_HatcherOption_Textbox = "Bank Address Hatcher Option Textbox in Finance and Legal section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Bank Address']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']";
	public static final String rdb_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankIntermediary_HatcherOption_RadioButton = "Bank Intermediary Hatcher Option Radiobutton in Finance and Legal section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Bank Intermediary']/parent::div/following-sibling::div//input[@type='radio' and @value='Hatcher']";
	public static final String txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankIntermediary_HatcherOption_Textbox = "Bank Intermediary Hatcher Option Textbox in Finance and Legal section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Bank Intermediary']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']";
	public static final String rdb_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_IntermediaryBankABANumber_HatcherOption_RadioButton = "Intermediary Bank ABA Number Hatcher Option Radiobutton in Finance and Legal section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Intermediary Bank ABA Number']/parent::div/following-sibling::div//input[@type='radio' and @value='Hatcher']";
	public static final String txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_IntermediaryBankABANumber_HatcherOption_Textbox = "Intermediary Bank ABA Number Hatcher Option Textbox in Finance and Legal section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Intermediary Bank ABA Number']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']";
	public static final String rdb_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_IntermediaryBankAddress_HatcherOption_RadioButton = "Intermediary Bank Address Hatcher Option Radiobutton in Finance and Legal section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Intermediary Bank Address']/parent::div/following-sibling::div//input[@type='radio' and @value='Hatcher']";
	public static final String txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_IntermediaryBankAddress_HatcherOption_Textbox = "Intermediary Bank Address Hatcher Option Textbox in Finance and Legal section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Intermediary Bank Address']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']";
	public static final String rdb_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_IntermediaryBankSWIFTBIC_HatcherOption_RadioButton = "Intermediary Bank SWIFT BIC Hatcher Option Radiobutton in Finance and Legal section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Intermediary Bank SWIFT BIC']/parent::div/following-sibling::div//input[@type='radio' and @value='Hatcher']";
	public static final String txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_IntermediaryBankSWIFTBIC_HatcherOption_Textbox = "Intermediary Bank SWIFT BIC Hatcher Option Textbox in Finance and Legal section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Intermediary Bank SWIFT BIC']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']";
	public static final String rdb_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankSwiftCode_HatcherOption_RadioButton = "Bank Swift Code Hatcher Option Radiobutton in Finance and Legal section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Bank Swift Code']/parent::div/following-sibling::div//input[@type='radio' and @value='Hatcher']";
	public static final String txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankSwiftCode_HatcherOption_Textbox = "Bank Swift Code Hatcher Option Textbox in Finance and Legal section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Bank Swift Code']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']";
	public static final String rdb_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankIBANCode_HatcherOption_RadioButton = "Bank IBAN Code Hatcher Option Radiobutton in Finance and Legal section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Bank IBAN Code']/parent::div/following-sibling::div//input[@type='radio' and @value='Hatcher']";
	public static final String txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankIBANCode_HatcherOption_Textbox = "Bank IBAN Code Hatcher Option Textbox in Finance and Legal section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Bank IBAN Code']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']";
	public static final String rdb_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankInstructions_HatcherOption_RadioButton = "Bank Instructions Hatcher Option Radiobutton in Finance and Legal section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Bank Instructions']/parent::div/following-sibling::div//input[@type='radio' and @value='Hatcher']";
	public static final String txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankInstructions_HatcherOption_Textbox = "Bank Instructions Hatcher Option Textbox in Finance and Legal section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Bank Instructions']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']";
	public static final String rdb_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_CompanySecretary_HatcherOption_RadioButton = "Company Secretary Hatcher Option Radiobutton in Finance and Legal section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Company Secretary']/parent::div/following-sibling::div//input[@type='radio' and @value='Hatcher']";
	public static final String txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_CompanySecretary_HatcherOption_Textbox = "Company Secretary Hatcher Option Textbox in Finance and Legal section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Company Secretary']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']";
	public static final String rdb_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_Currency_HatcherOption_RadioButton = "Currency Hatcher Option Radiobutton in Finance and Legal section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Currency']/parent::div/following-sibling::div//input[@type='radio' and @value='Hatcher']";
	public static final String drp_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_Currency_HatcherOption_Dropdown = "Currency Hatcher Option Dropdown in Finance and Legal section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Currency']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::select";
	public static final String rdb_EP_FinanceandLegalSection_FinancialYearEnd_HatcherOption = "Financial Year End Hatcher Option Radiobutton in Finance and Legal section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Financial Year End']/parent::div/following-sibling::div//input[@type='radio' and @value='Hatcher']";
	public static final String drp_EP_FinanceandLegalSection_FinancialYearEnd_HatcherOption = "Financial Year End Hatcher Option Dropdown in Finance and Legal section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Financial Year End']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::select";
	public static final String rdb_EP_FinanceandLegalSection_LawFirm_HatcherOption = "Law Firm End Hatcher Option Radiobutton in Finance and Legal section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Law Firm']/parent::div/following-sibling::div//input[@type='radio' and @value='Hatcher']";
	public static final String txt_EP_FinanceandLegalSection_LawFirm_HatcherOption = "Law Firm End Hatcher Option Textbox in Finance and Legal section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Law Firm']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']";	
	public static final String btn_EP_FinanceandLegalSection_SaveChanges = "Save Changes Button in Finance and Legal section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//button[text()='Save Changes']";


	/******************************Industry*******************************/
	public static final String rdb_EP_IndustrySection_Industry_HatcherOption = "Industry Hatcher Option Radiobutton in Industry section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'industry')]//label[contains(text(),'Hatcher')]/parent::div//input[@type='radio' and @value='Hatcher']";
	public static final String txt_EP_IndustrySection_Industry_HatcherOption = "Industry Hatcher Option textbox in Industry section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'industry')]//label[contains(text(),'Hatcher')]/parent::div//input[@type='search']";
	public static final String btn_EP_IndustrySection_SaveChanges = "Save Changes Button in Industry section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'industry')]//button[text()='Save Changes']";

	/******************************Keywords*******************************/
	private static final String rdb_EP_KeywordsSection_Keywords_HatcherOption = "Keywords Hatcher Option Radiobutton in Keywords section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'keywords')]//label[contains(text(),'Hatcher')]/parent::div//input[@type='radio' and @value='Hatcher']";
	private static final String txt_EP_KeywordsSection_Keywords_HatcherOption = "Keywords Hatcher Option Textbox in Keywords section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'keywords')]//label[contains(text(),'Hatcher')]/parent::div//textarea";
	private static final String rdb_EP_KeywordsSection_Keywords_ClearbitOption = "Keywords Clearbit Option Radiobutton in Keywords section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'keywords')]//label[contains(text(),'Clearbit')]/parent::div//input[@type='radio' and @value='Clearbit']";
	private static final String txt_EP_KeywordsSection_Keywords_ClearbitOption = "Keywords Clearbit Option Textbox in Keywords section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'keywords')]//label[contains(text(),'Clearbit')]/parent::div//textarea";
	private static final String btn_EP_KeywordsSection_SaveChanges = "Save Changes Button in Keywords section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'keywords')]//button[text()='Save Changes']";

	/******************************Regions*******************************/
	public static final String rdb_EP_RegionsSection_Regions_HatcherOption = "Regions  Hatcher Option Radiobutton in Regions section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'regions')]//label[contains(text(),'Hatcher')]/parent::div//input[@type='radio' and @value='Hatcher']";
	public static final String txt_EP_RegionsSection_Regions_HatcherOption = "Regions  Hatcher Option Textbox in Regions section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'regions')]//label[contains(text(),'Hatcher')]/parent::div//input[@type='search']";
	public static final String btn_EP_RegionsSection_SaveChanges = "Save Changes Button in Regions section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'regions')]//button[text()='Save Changes']";

	/******************************Marketing Metrics*******************************/
	private static final String lbl_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_AlexaRanking = "Alexa Ranking Label in Marketing Metrics section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Alexa Ranking']";
	private static final String lbl_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_Competitors = "Competitors Label in Marketing Metrics section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Competitors']";
	private static final String lbl_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_CompetitorRankings = "Competitor Rankings Label in Marketing Metrics section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Competitor Rankings']";
	private static final String lbl_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_DomainsLinkingIn = "Domains Linking In Label in Marketing Metrics section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Domains Linking In']";
	private static final String lbl_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_FacebookLikes = "Facebook Likes Label in Marketing Metrics section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Facebook Likes']";
	private static final String lbl_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_LinkedinEmployees = "Linkedin Employees Label in Marketing Metrics section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Linkedin Employees']";
	private static final String lbl_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_LinkedinFollowers = "Linkedin Followers Label in Marketing Metrics section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Linkedin Followers']";
	private static final String lbl_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_MOZDomainAuthority = "MOZ Domain Authority Label in Marketing Metrics section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='MOZ Domain Authority']";
	private static final String lbl_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_OrganicTraffic = "Organic Traffic Label in Marketing Metrics section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Organic Traffic']";
	private static final String lbl_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_TranscoRanking = "Transco Ranking Label in Marketing Metrics section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Transco Ranking']";
	private static final String lbl_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_TwitterFollowers = "Twitter Followers Label in Marketing Metrics section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Twitter Followers']";

	private static final String rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_AlexaRanking_HatcherOption_RadioButton = "Alexa Ranking Hatcher Option Radiobutton in Marketing Metrics section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Alexa Ranking']/parent::div/following-sibling::div//input[@type='radio' and @value='Hatcher']";
	private static final String txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_AlexaRanking_HatcherOption_Textbox = "Alexa Ranking Hatcher Option Textbox in Marketing Metrics section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Alexa Ranking']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']";
	private static final String rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_AlexaRanking_ClearbitOption_RadioButton = "Alexa Ranking Clearbit Option Radiobutton in Marketing Metrics section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Alexa Ranking']/parent::div/following-sibling::div//input[@type='radio' and @value='Clearbit']";
	private static final String txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_AlexaRanking_ClearbitOption_Textbox = "Alexa Ranking Clearbit Option Textbox in Marketing Metrics section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Alexa Ranking']/parent::div/following-sibling::div//input[contains(@value,'Clearbit')]/parent::label/following-sibling::input[@type='text']";
	private static final String rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_Competitors_HatcherOption_RadioButton = "Competitors Hatcher Option Radiobutton in Marketing Metrics section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Competitors']/parent::div/following-sibling::div//input[@type='radio' and @value='Hatcher']";
	private static final String txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_Competitors_HatcherOption_Textbox = "Competitors Hatcher Option Textbox in Marketing Metrics section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Competitors']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']";
	private static final String rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_Competitors_SEMRushOption_RadioButton = "Competitors SEMRush Option Radiobutton in Marketing Metrics section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Competitors']/parent::div/following-sibling::div//input[@type='radio' and @value='SEMRush']";
	private static final String txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_Competitors_SEMRushOption_Textbox = "Competitors SEMRush Option Textbox in Marketing Metrics section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Competitors']/parent::div/following-sibling::div//label[contains(text(),'SEMRush')]/parent::div//input[contains(@type,'text')]";
	private static final String rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_CompetitorRankings_HatcherOption_RadioButton = "Competitor Rankings Hatcher Option Radiobutton in Marketing Metrics section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Competitor Rankings']/parent::div/following-sibling::div//input[@type='radio' and @value='Hatcher']";
	private static final String txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_CompetitorRankings_HatcherOption_Textbox = "Competitor Rankings Hatcher Option Textbox in Marketing Metrics section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Competitor Rankings']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']";
	private static final String rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_DomainsLinkingIn_HatcherOption_RadioButton = "Domains Linking In Hatcher Option Radiobutton in Marketing Metrics section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Domains Linking In']/parent::div/following-sibling::div//input[@type='radio' and @value='Hatcher']";
	private static final String txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_DomainsLinkingIn_HatcherOption_Textbox = "Domains Linking In Hatcher Option Textbox in Marketing Metrics section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Domains Linking In']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']";
	private static final String rdb_EP_MarketingMetricsSection_DomainsLinkingIn_MOZOption = "Domains Linking In MOZ Option Radiobutton in Marketing Metrics section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Domains Linking In']/parent::div/following-sibling::div//input[@type='radio' and @value='MOZ']";
	private static final String txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_DomainsLinkingIn_MOZOption_Textbox = "Domains Linking In MOZ Option Textbox in Marketing Metrics section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Domains Linking In']/parent::div/following-sibling::div//input[contains(@value,'MOZ')]/parent::label/following-sibling::input[@type='text']";
	private static final String rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_FacebookLikes_HatcherOption_RadioButton = "Facebook Likes Hatcher Option Radiobutton in Marketing Metrics section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Facebook Likes']/parent::div/following-sibling::div//input[@type='radio' and @value='Hatcher']";
	private static final String txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_FacebookLikes_HatcherOption_Textbox = "Facebook Likes Hatcher Option Textbox in Marketing Metrics section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Facebook Likes']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']";
	private static final String rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_FacebookLikes_ClearbitOption_RadioButton = "Facebook Likes Clearbit Option Radiobutton in Marketing Metrics section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Facebook Likes']/parent::div/following-sibling::div//input[@type='radio' and @value='Clearbit']";
	private static final String txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_FacebookLikes_ClearbitOption_Textbox = "Facebook Likes Clearbit Option Textbox in Marketing Metrics section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Facebook Likes']/parent::div/following-sibling::div//input[contains(@value,'Clearbit')]/parent::label/following-sibling::input[@type='text']";
	private static final String rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_LinkedinEmployees_HatcherOption_RadioButton = "Linkedin Employees Hatcher Option Radiobutton in Marketing Metrics section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Linkedin Employees']/parent::div/following-sibling::div//input[@type='radio' and @value='Hatcher']";
	private static final String txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_LinkedinEmployees_HatcherOption_Textbox = "Linkedin Employees Hatcher Option Textbox in Marketing Metrics section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Linkedin Employees']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']";
	private static final String rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_LinkedinEmployees_ClearbitOption_RadioButton = "Linkedin Employees Clearbit Option Radiobutton in Marketing Metrics section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Linkedin Employees']/parent::div/following-sibling::div//input[@type='radio' and @value='Clearbit']";
	private static final String txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_LinkedinEmployees_ClearbitOption_Textbox = "Linkedin Employees Clearbit Option Textbox in Marketing Metrics section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Linkedin Employees']/parent::div/following-sibling::div//input[contains(@value,'Clearbit')]/parent::label/following-sibling::input[@type='text']";
	private static final String rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_LinkedinEmployees_LinkedInOption_RadioButton = "Linkedin Employees LinkedIn  Option Radiobutton in Marketing Metrics section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Linkedin Employees']/parent::div/following-sibling::div//input[@type='radio' and @value='LinkedIn']";
	private static final String txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_LinkedinEmployees_LinkedInOption_Textbox = "Linkedin Employees LinkedIn  Option Textbox in Marketing Metrics section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Linkedin Employees']/parent::div/following-sibling::div//input[contains(@value,'LinkedIn')]/parent::label/following-sibling::input[@type='text']";
	private static final String rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_LinkedinFollowers_HatcherOption_RadioButton = "Linkedin Followers Hatcher Option Radiobutton in Marketing Metrics section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Linkedin Followers']/parent::div/following-sibling::div//input[@type='radio' and @value='Hatcher']";
	private static final String txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_LinkedinFollowers_HatcherOption_Textbox = "Linkedin Followers Hatcher Option Textbox in Marketing Metrics section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Linkedin Followers']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']";
	private static final String rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_LinkedinFollowers_LinkedInOption_RadioButton = "Linkedin Followers LinkedIn Option Radiobutton in Marketing Metrics section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Linkedin Followers']/parent::div/following-sibling::div//input[@type='radio' and @value='LinkedIn']";
	private static final String txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_LinkedinFollowers_LinkedInOption_Textbox = "Linkedin Followers LinkedIn Option Textbox in Marketing Metrics section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Linkedin Followers']/parent::div/following-sibling::div//input[contains(@value,'LinkedIn')]/parent::label/following-sibling::input[@type='text']";
	private static final String rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_MOZDomainAuthority_HatcherOption_RadioButton = "MOZ Domain Authority Hatcher Option Radiobutton in Marketing Metrics section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='MOZ Domain Authority']/parent::div/following-sibling::div//input[@type='radio' and @value='Hatcher']";
	private static final String txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_MOZDomainAuthority_HatcherOption_Textbox = "MOZ Domain Authority Hatcher Option Textbox in Marketing Metrics section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='MOZ Domain Authority']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']";
	private static final String rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_MOZDomainAuthority_MOZOption_RadioButton = "MOZ Domain Authority MOZ Option Radiobutton in Marketing Metrics section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='MOZ Domain Authority']/parent::div/following-sibling::div//input[@type='radio' and @value='MOZ']";
	private static final String txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_MOZDomainAuthority_MOZOption_Textbox = "MOZ Domain Authority MOZ Option Textbox in Marketing Metrics section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='MOZ Domain Authority']/parent::div/following-sibling::div//input[contains(@value,'MOZ')]/parent::label/following-sibling::input[@type='text']";
	private static final String rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_OrganicTraffic_HatcherOption_RadioButton = "Alexa Ranking Hatcher Option Radiobutton in Marketing Metrics section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Organic Traffic']/parent::div/following-sibling::div//input[@type='radio' and @value='Hatcher']";
	private static final String txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_OrganicTraffic_HatcherOption_Textbox = "Alexa Ranking Hatcher Option Textbox in Marketing Metrics section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Organic Traffic']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']";
	private static final String rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_OrganicTraffic_SEMRushOrganicTrafficOption_RadioButton = "Organic Traffic SEMRushOrganicTraffic Option Radiobutton in Marketing Metrics section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Organic Traffic']/parent::div/following-sibling::div//input[@type='radio' and @value='SEMRushOrganicTraffic ']";
	private static final String txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_OrganicTraffic_SEMRushOrganicTraffic_Textbox = "Organic Traffic SEMRushOrganicTraffic Option Textbox in Marketing Metrics section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Organic Traffic']/parent::div/following-sibling::div//input[contains(@value,'SEMRushOrganicTraffic')]/parent::label/following-sibling::input[@type='text']";
	private static final String rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_TranscoRanking_HatcherOption_RadioButton = "Transco Ranking Hatcher Option Radiobutton in Marketing Metrics section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Transco Ranking']/parent::div/following-sibling::div//input[@type='radio' and @value='Hatcher']";
	private static final String txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_TranscoRanking_HatcherOption_Textbox = "Transco Ranking Hatcher Option Textbox in Marketing Metrics section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Transco Ranking']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']";
	private static final String rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_TwitterFollowers_HatcherOption_RadioButton = "Twitter Followers Hatcher Option Radiobutton in Marketing Metrics section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Twitter Followers']/parent::div/following-sibling::div//input[@type='radio' and @value='Hatcher']";
	private static final String txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_TwitterFollowers_HatcherOption_Textbox = "Twitter Followers Hatcher Option Textbox in Marketing Metrics section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Twitter Followers']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']";
	private static final String rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_TwitterFollowers_ClearbitOption_RadioButton = "Twitter Followers Clearbit Option Radiobutton in Marketing Metrics section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Twitter Followers']/parent::div/following-sibling::div//input[@type='radio' and @value='Clearbit']";
	private static final String txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_TwitterFollowers_ClearbitOption_Textbox = "Twitter Followers Clearbit Option Textbox in Marketing Metrics section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Twitter Followers']/parent::div/following-sibling::div//input[contains(@value,'Clearbit')]/parent::label/following-sibling::input[@type='text']";
	private static final String rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_SaveChanges = "Save Changes Button in Marketing Metrics section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//button[text()='Save Changes']";


	/******************************Community Settings*******************************/

	private static final String lbl_CompanyProfilePage_EditProfilePage_CommunitySettingsSection_AccountStatus = "Account Status Label in Community Settings section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'syndicate_settings')]//*[contains(text(),'Account Status')]";
	private static final String lbl_CompanyProfilePage_EditProfilePage_CommunitySettingsSection_AccountType = "Account Type Label in Community Settings section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'syndicate_settings')]//*[contains(text(),'Account Type')]";
	private static final String lbl_CompanyProfilePage_EditProfilePage_CommunitySettingsSection_BusinessType = "Business Type Label in Community Settings section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'syndicate_settings')]//*[contains(text(),'Business Type')]";
	private static final String lbl_CompanyProfilePage_EditProfilePage_CommunitySettingsSection_DealflowStatus = "Dealflow Status Label in Community Settings section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'syndicate_settings')]//*[contains(text(),'Dealflow Status')]";
	private static final String lbl_CompanyProfilePage_EditProfilePage_CommunitySettingsSection_HealthPortfolioStatus = "Health / Portfolio Status Label in Community Settings section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'syndicate_settings')]//*[contains(text(),'Health / Portfolio Status')]";
	private static final String lbl_CompanyProfilePage_EditProfilePage_CommunitySettingsSection_PlacementAgent = "Placement Agent Label in Community Settings section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'syndicate_settings')]//*[contains(text(),'Placement Agent')]";
	private static final String lbl_CompanyProfilePage_EditProfilePage_CommunitySettingsSection_MainContact = "Main Contact Label in Community Settings section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'syndicate_settings')]//*[contains(text(),'Main Contact')]";
	private static final String lbl_CompanyProfilePage_EditProfilePage_CommunitySettingsSection_RelationshipManager = "Relationship Manager Label in Community Settings section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'syndicate_settings')]//*[contains(text(),'Relationship Manager')]";
	private static final String lbl_CompanyProfilePage_EditProfilePage_CommunitySettingsSection_ScoreVisibility = "Score Visibility Label in Community Settings section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'syndicate_settings')]//*[contains(text(),'Score Visibility')]";

	private static final String drp_CompanyProfilePage_EditProfilePage_CommunitySettingsSection_AccountStatus = "Account Status Dropdown in Community Settings section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'syndicate_settings')]//*[contains(text(),'Account Status')]/parent::div//select";
	private static final String drp_CompanyProfilePage_EditProfilePage_CommunitySettingsSection_AccountType = "Account Type Dropdown in Community Settings section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'syndicate_settings')]//*[contains(text(),'Account Type')]/parent::div//select";
	private static final String drp_CompanyProfilePage_EditProfilePage_CommunitySettingsSection_BusinessType = "Business Type Dropdown in Community Settings section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'syndicate_settings')]//*[contains(text(),'Business Type')]/parent::div//select";
	private static final String drp_CompanyProfilePage_EditProfilePage_CommunitySettingsSection_DealflowStatus = "Dealflow Status Dropdown in Community Settings section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'syndicate_settings')]//*[contains(text(),'Dealflow Status')]/parent::div//select";
	private static final String drp_CompanyProfilePage_EditProfilePage_CommunitySettingsSection_HealthPortfolioStatus = "Health / Portfolio Status Dropdown in Community Settings section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'syndicate_settings')]//*[contains(text(),'Health / Portfolio Status')]/parent::div//select";
	private static final String drp_CompanyProfilePage_EditProfilePage_CommunitySettingsSection_PlacementAgent = "Placement Agent Dropdown in Community Settings section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'syndicate_settings')]//*[contains(text(),'Placement Agent')]/parent::div//select";
	private static final String drp_CompanyProfilePage_EditProfilePage_CommunitySettingsSection_MainContact = "Main Contact Dropdown in Community Settings section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'syndicate_settings')]//*[contains(text(),'Main Contact')]/parent::div//select";
	private static final String drp_CompanyProfilePage_EditProfilePage_CommunitySettingsSection_RelationshipManager = "Relationship Manager Dropdown in Community Settings section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'syndicate_settings')]//*[contains(text(),'Relationship Manager')]/parent::div//select";
	private static final String drp_CompanyProfilePage_EditProfilePage_CommunitySettingsSection_ScoreVisibility = "Score Visibility Dropdown in Community Settings section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'syndicate_settings')]//*[contains(text(),'Score Visibility')]/parent::div//select";
	private static final String drp_CompanyProfilePage_EditProfilePage_CommunitySettingsSection_SaveChanges = "Save Changes Button in Community Settings section of Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'syndicate_settings')]//button[text()='Save Changes']";

	/******************************Edit Company Profile Page Ending**********************************/



	/******************************Edit Company Profile Page Starting**********************************/




	/******************************Data Room Page Starting**********************************/

	private static final String lbl_CompanyProfilePage_DataRoomSection = "Data Room section Heading Label in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]";
	private static final String lnk_CompanyProfilePage_DataRoom_Share = "Share Data Room Link in Company Profile Page#xpath=//div[contains(@class,'org-page')]//*[contains(@class,'')]//a[contains(text(),'Share')]";
	private static final String txt_CompanyProfilePage_DataRoomSection_Filter_Textbox = "Filter Textbox of Data Room section in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//div[contains(@id,'dataroom-table_filter')]//input[contains(@type,'search')]";

	private static final String lbl_CompanyProfilePage_DataRoomPage_CompanyProfileSection = "Company Profile Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Company Profile')]/parent::td//div[contains(@class,'tab-content')]";
	private static final String lbl_CompanyProfilePage_DataRoomPage_DueDiligenceSection = "Due Diligence Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Due Diligence')]/parent::td//div[contains(@class,'tab-content')]";
	private static final String lbl_CompanyProfilePage_DataRoomPage_InvestmentsSection = "Investments Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Investments')]/parent::td//div[contains(@class,'tab-content')]";
	private static final String lbl_CompanyProfilePage_DataRoomPage_FinancialsSection = "Financials Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Financials')]/parent::td//div[contains(@class,'tab-content')]";
	private static final String lbl_CompanyProfilePage_DataRoomPage_LegalSection = "Legal Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Legal')]/parent::td//div[contains(@class,'tab-content')]";
	private static final String lbl_CompanyProfilePage_DataRoomPage_ShareholderUpdatesSection = "Shareholder Updates Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Shareholder Updates')]/parent::td//div[contains(@class,'tab-content')]";
	private static final String lbl_CompanyProfilePage_DataRoomPage_ManagementTeamSection = "Management Team Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Management Team')]/parent::td//div[contains(@class,'tab-content')]";
	private static final String lbl_CompanyProfilePage_DataRoomPage_IPorTechnologySection = "IP/technology Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'IP/technology')]/parent::td//div[contains(@class,'tab-content')]";
	private static final String lbl_CompanyProfilePage_DataRoomPage_InboxSection = "Inbox Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Inbox')]/parent::td//div[contains(@class,'tab-content')]";

	private static final String lnk_CompanyProfilePage_DataRoomPage_CompanyProfileSection_EditDataRoom_ToggleDots = "Edit DataRoom Toggle dots in Company Profile Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//*[contains(text(),'Company Profile')]//span[contains(@class,'dropdown dropleft')]//a[contains(@class,'dropdownMenuEditDataroom')]";
	private static final String lnk_CompanyProfilePage_DataRoomPage_DueDiligenceSection_EditDataRoom_ToggleDots = "Edit DataRoom Toggle dots in Due Diligence Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Due Diligence')]//a[contains(@id,'dropdownMenuEditDataroom')]";
	private static final String lnk_CompanyProfilePage_DataRoomPage_InvestmentsSection_EditDataRoom_ToggleDots = "Edit DataRoom Toggle dots in Investments Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Investments')]//a[contains(@id,'dropdownMenuEditDataroom')]";
	private static final String lnk_CompanyProfilePage_DataRoomPage_FinancialsSection_EditDataRoom_ToggleDots = "Edit DataRoom Toggle dots in Financials Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Financials')]//a[contains(@id,'dropdownMenuEditDataroom')]";
	private static final String lnk_CompanyProfilePage_DataRoomPage_LegalSection_EditDataRoom_ToggleDots = "Edit DataRoom Toggle dots in Legal Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Legal')]//a[contains(@id,'dropdownMenuEditDataroom')]";
	private static final String lnk_CompanyProfilePage_DataRoomPage_ShareholderUpdatesSection_EditDataRoom_ToggleDots = "Edit DataRoom Toggle dots in Shareholder Updates Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Shareholder Updates')]//a[contains(@id,'dropdownMenuEditDataroom')]";
	private static final String lnk_CompanyProfilePage_DataRoomPage_ManagementTeamSection_EditDataRoom_ToggleDots = "Edit DataRoom Toggle dots in Management Team Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Management Team')]//a[contains(@id,'dropdownMenuEditDataroom')]";
	private static final String lnk_CompanyProfilePage_DataRoomPage_IPorTechnologySection_EditDataRoom_ToggleDots = "Edit DataRoom Toggle dots in IP/technology Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'IP/technology')]//a[contains(@id,'dropdownMenuEditDataroom')]";
	private static final String lnk_CompanyProfilePage_DataRoomPage_InboxSection_EditDataRoom_ToggleDots = "Edit DataRoom Toggle dots in Inbox Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Inbox')]//a[contains(@id,'dropdownMenuEditDataroom')]";

	private static final String lnk_CompanyProfilePage_DataRoomPage_AddFolder = "Add Folder Link of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//*[contains(text(),'Company Profile')]//span[contains(@class,'dropdown dropleft')]//a[contains(@class,'dropdownMenuEditDataroom')]/following-sibling::ul//li//a[contains(text(),'Add Folder')]";
	private static final String lnk_CompanyProfilePage_DataRoomPage_DeleteRoom = "Delete Room Link of Data Room Page in Company Profile Page#xpath=//body/ul[contains(@aria-labelledby,'dropdownMenuEditDataroom') and contains(@class,'dropdown-menu')]//li//a[contains(text(),'delete room')]";

	private static final String lnk_CompanyProfilePage_DataRoomPage_CompanyProfileSection_DefaultFolder = "Default Folder Link of Company Profile Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Company Profile')]/parent::td//div[contains(@class,'midnav')]//a[contains(text(),'Default Folder')]";
	private static final String lnk_CompanyProfilePage_DataRoomPage_DueDiligenceSection_DefaultFolder = "Default Folder Link of Due Diligence Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),' Due Diligence')]/parent::td//div[contains(@class,'midnav')]//a[contains(text(),'Default Folder')]";
	private static final String lnk_CompanyProfilePage_DataRoomPage_InvestmentsSection_DefaultFolder = "Default Folder Link of Investments Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),' Investments')]/parent::td//div[contains(@class,'midnav')]//a[contains(text(),'Default Folder')]";
	private static final String lnk_CompanyProfilePage_DataRoomPage_FinancialsSection_DefaultFolder = "Default Folder Link of Financials Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Financials')]/parent::td//div[contains(@class,'midnav')]//a[contains(text(),'Default Folder')]";
	private static final String lnk_CompanyProfilePage_DataRoomPage_LegalSection_DefaultFolder = "Default Folder Link of Legal Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Legal')]/parent::td//div[contains(@class,'midnav')]//a[contains(text(),'Default Folder')]";
	private static final String lnk_CompanyProfilePage_DataRoomPage_ShareholderUpdatesSection_DefaultFolder = "Default Folder Link of Shareholder Updates Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Shareholder Updates')]/parent::td//div[contains(@class,'midnav')]//a[contains(text(),'Default Folder')]";
	private static final String lnk_CompanyProfilePage_DataRoomPage_ManagementTeamSection_DefaultFolder = "Default Folder Link of Management Team Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Management Team')]/parent::td//div[contains(@class,'midnav')]//a[contains(text(),'Default Folder')]";
	private static final String lnk_CompanyProfilePage_DataRoomPage_IPorTechnologySection_DefaultFolder = "Default Folder Link of IP/technology Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'IP/technology')]/parent::td//div[contains(@class,'midnav')]//a[contains(text(),'Default Folder')]";
	private static final String lnk_CompanyProfilePage_DataRoomPage_InboxSection_DefaultFolder = "Default Folder Link of Inbox Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Inbox')]/parent::td//div[contains(@class,'midnav')]//a[contains(text(),'Default Folder')]";

	private static final String lbl_CompanyProfilePage_DataRoomPage_CompanyProfileSection_DefaultFolder_Container = "Default Folder container of Company Profile Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Company Profile')]/parent::td//div[contains(@class,'tab-content')]//div[contains(@class,'default') and contains(@class,'active')]";
	private static final String lbl_CompanyProfilePage_DataRoomPage_DueDiligenceSection_DefaultFolder_Container = "Default Folder container of Due Diligence Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Due Diligence')]/parent::td//div[contains(@class,'tab-content')]//div[contains(@class,'default') and contains(@class,'active')]";
	private static final String lbl_CompanyProfilePage_DataRoomPage_InvestmentsSection_DefaultFolder_Container = "Default Folder container of Investments Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Investments')]/parent::td//div[contains(@class,'tab-content')]//div[contains(@class,'default') and contains(@class,'active')]";
	private static final String lbl_CompanyProfilePage_DataRoomPage_FinancialsSection_DefaultFolder_Container = "Default Folder container of Financials Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Financials')]/parent::td//div[contains(@class,'tab-content')]//div[contains(@class,'default') and contains(@class,'active')]";
	private static final String lbl_CompanyProfilePage_DataRoomPage_LegalSection_DefaultFolder_Container = "Default Folder container of Legal Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Legal')]/parent::td//div[contains(@class,'tab-content')]//div[contains(@class,'default') and contains(@class,'active')]";
	private static final String lbl_CompanyProfilePage_DataRoomPage_ShareholderUpdatesSection_DefaultFolder_Container = "Default Folder container of Shareholder Updates Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Shareholder Updates')]/parent::td//div[contains(@class,'tab-content')]//div[contains(@class,'default') and contains(@class,'active')]";
	private static final String lbl_CompanyProfilePage_DataRoomPage_ManagementTeamSection_DefaultFolder_Container = "Default Folder container of Management Team Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Management Team')]/parent::td//div[contains(@class,'tab-content')]//div[contains(@class,'default') and contains(@class,'active')]";
	private static final String lbl_CompanyProfilePage_DataRoomPage_IPorTechnologySection_DefaultFolder_Container = "Default Folder container of IP/technology Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'IP/technology')]/parent::td//div[contains(@class,'tab-content')]//div[contains(@class,'default') and contains(@class,'active')]";
	private static final String lbl_CompanyProfilePage_DataRoomPage_InboxSection_DefaultFolder_Container = "Default Folder container of Inbox Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Inbox')]/parent::td//div[contains(@class,'tab-content')]//div[contains(@class,'default') and contains(@class,'active')]";

	private static final String btn_CompanyProfilePage_DataRoomPage_CompanyProfileSection_AddDocument = "Add Document Button of Company Profile Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//*[contains(text(),'Company Profile')]/following-sibling::div//div[contains(@class,'active show')]//div[contains(@class,'management-options')]//span[contains(text(),'Add Document')]";
	private static final String btn_CompanyProfilePage_DataRoomPage_DueDiligenceSection_AddDocument = "Add Document Button of Due Diligence Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Due Diligence')]/parent::td//div[contains(@class,'tab-content')]//a[contains(text(),'Add Document')]";
	private static final String btn_CompanyProfilePage_DataRoomPage_InvestmentsSection_AddDocument = "Add Document Button of Investments Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Investments')]/parent::td//div[contains(@class,'tab-content')]//a[contains(text(),'Add Document')]";
	private static final String btn_CompanyProfilePage_DataRoomPage_FinancialsSection_AddDocument = "Add Document Button of Financials Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Financials')]/parent::td//div[contains(@class,'tab-content')]//a[contains(text(),'Add Document')]";
	private static final String btn_CompanyProfilePage_DataRoomPage_LegalSection_AddDocument = "Add Document Button of Legal Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Legal')]/parent::td//div[contains(@class,'tab-content')]//a[contains(text(),'Add Document')]";
	private static final String btn_CompanyProfilePage_DataRoomPage_ShareholderUpdatesSection_AddDocument = "Add Document Button of Shareholder Updates Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Shareholder Updates')]/parent::td//div[contains(@class,'tab-content')]//a[contains(text(),'Add Document')]";
	private static final String btn_CompanyProfilePage_DataRoomPage_ManagementTeamSection_AddDocument = "Add Document Button of Management Team Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Management Team')]/parent::td//div[contains(@class,'tab-content')]//a[contains(text(),'Add Document')]";
	private static final String btn_CompanyProfilePage_DataRoomPage_IPorTechnologySection_AddDocument = "Add Document Button of IP/technology Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'IP/technology')]/parent::td//div[contains(@class,'tab-content')]//a[contains(text(),'Add Document')]";
	private static final String btn_CompanyProfilePage_DataRoomPage_InboxSection_AddDocument = "Add Document Button of Inbox Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Inbox')]/parent::td//div[contains(@class,'tab-content')]//a[contains(text(),'Add Document')]";

	private static final String lnk_CompanyProfilePage_DataRoomPage_CompanyProfileSection_EditFolder_ToggleDots = "Edit Folder Toggle dots in Company Profile Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//*[contains(text(),'Company Profile')]/parent::div//a[contains(@class,'active')]/parent::div/following-sibling::div//div[contains(@class,'active show')]//div[contains(@class,'management-options')]//span[contains(@id,'dropdownMenuEditFolder')]";
	private static final String lnk_CompanyProfilePage_DataRoomPage_DueDiligenceSection_EditFolder_ToggleDots = "Edit Folder Toggle dots in Due Diligence Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Due Diligence')]/parent::td//div[contains(@class,'tab-content')]//div[contains(@class,'active')]//a[contains(@id,'dropdownMenuEditFolder')]";
	private static final String lnk_CompanyProfilePage_DataRoomPage_InvestmentsSection_EditFolder_ToggleDots = "Edit Folder Toggle dots in Investments Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Investments')]/parent::td//div[contains(@class,'tab-content')]//div[contains(@class,'active')]//a[contains(@id,'dropdownMenuEditFolder')]";
	private static final String lnk_CompanyProfilePage_DataRoomPage_FinancialsSection_EditFolder_ToggleDots = "Edit Folder Toggle dots in Financials Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Financials')]/parent::td//div[contains(@class,'tab-content')]//div[contains(@class,'active')]//a[contains(@id,'dropdownMenuEditFolder')]";
	private static final String lnk_CompanyProfilePage_DataRoomPage_LegalSection_EditFolder_ToggleDots = "Edit Folder Toggle dots in Legal Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Legal')]/parent::td//div[contains(@class,'tab-content')]//div[contains(@class,'active')]//a[contains(@id,'dropdownMenuEditFolder')]";
	private static final String lnk_CompanyProfilePage_DataRoomPage_ShareholderUpdatesSection_EditFolder_ToggleDots = "Edit Folder Toggle dots in Shareholder Updates Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Shareholder Updates')]/parent::td//div[contains(@class,'tab-content')]//div[contains(@class,'active')]//a[contains(@id,'dropdownMenuEditFolder')]";
	private static final String lnk_CompanyProfilePage_DataRoomPage_ManagementTeamSection_EditFolder_ToggleDots = "Edit Folder Toggle dots in Management Team Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Management Team')]/parent::td//div[contains(@class,'tab-content')]//div[contains(@class,'active')]//a[contains(@id,'dropdownMenuEditFolder')]";
	private static final String lnk_CompanyProfilePage_DataRoomPage_IPorTechnologySection_EditFolder_ToggleDots = "Edit Folder Toggle dots in IP/technology Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'IP/technology')]/parent::td//div[contains(@class,'tab-content')]//div[contains(@class,'active')]//a[contains(@id,'dropdownMenuEditFolder')]";
	private static final String lnk_CompanyProfilePage_DataRoomPage_InboxSection_EditFolder_ToggleDots = "Edit Folder Toggle dots in Inbox Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Inbox')]/parent::td//div[contains(@class,'tab-content')]//div[contains(@class,'active')]//a[contains(@id,'dropdownMenuEditFolder')]";

	private static final String lnk_CompanyProfilePage_DataRoomPage_CompanyProfileSection_EditFolderName = "Edit Folder Name Link of Company Profile Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//*[contains(text(),'Company Profile')]/following-sibling::div//div[contains(@class,'active show')]//div[contains(@class,'management-options')]//span[contains(@id,'dropdownMenuEditFolder')]/following-sibling::ul//li//a[contains(text(),'Edit Folder Name')]";
	private static final String lnk_CompanyProfilePage_DataRoomPage_DueDiligenceSection_EditFolderName = "Edit Folder Name Link of Due Diligence Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Due Diligence')]/parent::td//div[contains(@class,'tab-content')]//div[contains(@class,'active')]//ul[contains(@aria-labelledby,'dropdownMenuEditFolder')]//li//a[contains(text(),'Edit Folder Name')]";
	private static final String lnk_CompanyProfilePage_DataRoomPage_InvestmentsSection_EditFolderName = "Edit Folder Name Link of Investments Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Investments')]/parent::td//div[contains(@class,'tab-content')]//div[contains(@class,'active')]//ul[contains(@aria-labelledby,'dropdownMenuEditFolder')]//li//a[contains(text(),'Edit Folder Name')]";
	private static final String lnk_CompanyProfilePage_DataRoomPage_FinancialsSection_EditFolderName = "Edit Folder Name Link of Financials Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Financials')]/parent::td//div[contains(@class,'tab-content')]//div[contains(@class,'active')]//ul[contains(@aria-labelledby,'dropdownMenuEditFolder')]//li//a[contains(text(),'Edit Folder Name')]";
	private static final String lnk_CompanyProfilePage_DataRoomPage_LegalSection_EditFolderName = "Edit Folder Name Link of Legal Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Legal')]/parent::td//div[contains(@class,'tab-content')]//div[contains(@class,'active')]//ul[contains(@aria-labelledby,'dropdownMenuEditFolder')]//li//a[contains(text(),'Edit Folder Name')]";
	private static final String lnk_CompanyProfilePage_DataRoomPage_ShareholderUpdatesSection_EditFolderName = "Edit Folder Name Link of Shareholder Updates Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Shareholder Updates')]/parent::td//div[contains(@class,'tab-content')]//div[contains(@class,'active')]//ul[contains(@aria-labelledby,'dropdownMenuEditFolder')]//li//a[contains(text(),'Edit Folder Name')]";
	private static final String lnk_CompanyProfilePage_DataRoomPage_ManagementTeamSection_EditFolderName = "Edit Folder Name Link of Management Team Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Management Team')]/parent::td//div[contains(@class,'tab-content')]//div[contains(@class,'active')]//ul[contains(@aria-labelledby,'dropdownMenuEditFolder')]//li//a[contains(text(),'Edit Folder Name')]";
	private static final String lnk_CompanyProfilePage_DataRoomPage_IPorTechnologySection_EditFolderName = "Edit Folder Name Link of IP/technology Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'IP/technology')]/parent::td//div[contains(@class,'tab-content')]//div[contains(@class,'active')]//ul[contains(@aria-labelledby,'dropdownMenuEditFolder')]//li//a[contains(text(),'Edit Folder Name')]";
	private static final String lnk_CompanyProfilePage_DataRoomPage_InboxSection_EditFolderName = "Edit Folder Name Link of Inbox Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Inbox')]/parent::td//div[contains(@class,'tab-content')]//div[contains(@class,'active')]//ul[contains(@aria-labelledby,'dropdownMenuEditFolder')]//li//a[contains(text(),'Edit Folder Name')]";

	private static final String lnk_CompanyProfilePage_DataRoomPage_CompanyProfileSection_DeleteFolder = "Delete Folder Link of Company Profile Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//*[contains(text(),'Company Profile')]/parent::div//a[contains(@class,'active')]/parent::div/following-sibling::div//div[contains(@class,'active show')]//div[contains(@class,'management-options')]//span[contains(@id,'dropdownMenuEditFolder')]/following-sibling::ul//li//a[contains(text(),'delete folder')]";
	private static final String lnk_CompanyProfilePage_DataRoomPage_DueDiligenceSection_DeleteFolder = "Delete Folder Link of Due Diligence Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Due Diligence')]/parent::td//div[contains(@class,'tab-content')]//div[contains(@class,'active')]//ul[contains(@aria-labelledby,'dropdownMenuEditFolder')]//li//a[contains(text(),'delete folder')]";
	private static final String lnk_CompanyProfilePage_DataRoomPage_InvestmentsSection_DeleteFolder = "Delete Folder Link of Investments Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Investments')]/parent::td//div[contains(@class,'tab-content')]//div[contains(@class,'active')]//ul[contains(@aria-labelledby,'dropdownMenuEditFolder')]//li//a[contains(text(),'delete folder')]";
	private static final String lnk_CompanyProfilePage_DataRoomPage_FinancialsSection_DeleteFolder = "Delete Folder Link of Financials Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Financials')]/parent::td//div[contains(@class,'tab-content')]//div[contains(@class,'active')]//ul[contains(@aria-labelledby,'dropdownMenuEditFolder')]//li//a[contains(text(),'delete folder')]";
	private static final String lnk_CompanyProfilePage_DataRoomPage_LegalSection_DeleteFolder = "Delete Folder Link of Legal Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Legal')]/parent::td//div[contains(@class,'tab-content')]//div[contains(@class,'active')]//ul[contains(@aria-labelledby,'dropdownMenuEditFolder')]//li//a[contains(text(),'delete folder";
	private static final String lnk_CompanyProfilePage_DataRoomPage_ShareholderUpdatesSection_DeleteFolder = "Delete Folder Link of Shareholder Updates Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Shareholder Updates')]/parent::td//div[contains(@class,'tab-content')]//div[contains(@class,'active')]//ul[contains(@aria-labelledby,'dropdownMenuEditFolder')]//li//a[contains(text(),'delete folder')]";
	private static final String lnk_CompanyProfilePage_DataRoomPage_ManagementTeamSection_DeleteFolder = "Delete Folder Link of Management Team Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Management Team')]/parent::td//div[contains(@class,'tab-content')]//div[contains(@class,'active')]//ul[contains(@aria-labelledby,'dropdownMenuEditFolder')]//li//a[contains(text(),'delete folder')]";
	private static final String lnk_CompanyProfilePage_DataRoomPage_IPorTechnologySection_DeleteFolder = "Delete Folder Link of IP/technology Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'IP/technology')]/parent::td//div[contains(@class,'tab-content')]//div[contains(@class,'active')]//ul[contains(@aria-labelledby,'dropdownMenuEditFolder')]//li//a[contains(text(),'delete folder')]";
	private static final String lnk_CompanyProfilePage_DataRoomPage_InboxSection_DeleteFolder = "Delete Folder Link of Inbox Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Inbox')]/parent::td//div[contains(@class,'tab-content')]//div[contains(@class,'active')]//ul[contains(@aria-labelledby,'dropdownMenuEditFolder')]//li//a[contains(text(),'delete folder')]";


	/*********************************Edit File Data Room***********************/

	private static final String lbl_EditFile_DataRoom_ModalDialogWindow_Heading = "Edit File Modal Dialog Window Heading Label#xpath=//div[contains(@id,'dataroom-edit-content-modal')]//div[contains(@class,'modal-content')]//div[contains(@class,'title')]//*[contains(text(),'Edit')]";
	private static final String lnk_EditFile_DataRoom_ModalDialogWindow_Close = "Close Link of Edit File Modal Dialog Window#xpath=//div[contains(@id,'dataroom-edit-content-modal')]//div[contains(@class,'modal-content')]//a[contains(@class,'close')]";
	private static final String txt_EditFile_DataRoom_ModalDialogWindow_DocumentTitle = "Document Title Textbox in Edit File Dialog Window#xpath=//div[contains(@id,'dataroom-edit-content-modal')]//div[contains(@class,'modal-content')]//label[contains(text(),'Document Title')]//following-sibling::input";
	private static final String drp_EditFile_DataRoom_ModalDialogWindow_FileType = "File Type Dropdown in Edit File Dialog Window#xpath=//div[contains(@id,'dataroom-edit-content-modal')]//div[contains(@class,'modal-content')]//label[contains(text(),'File Type')]//following-sibling::select";
	private static final String drp_EditFile_DataRoom_ModalDialogWindow_DocumentPermissions = "Document Permissions Dropdown in Edit File Dialog Window#xpath=//div[contains(@id,'dataroom-edit-content-modal')]//div[contains(@class,'modal-content')]//label[contains(text(),'Document Permissions')]//following-sibling::select";
	private static final String drp_EditFile_DataRoom_ModalDialogWindow_Folder = "Folder Dropdown in Edit File Dialog Window#xpath=//div[contains(@id,'dataroom-edit-content-modal')]//div[contains(@class,'modal-content')]//label[contains(text(),'folder')]//following-sibling::select";
	private static final String txt_EditFile_DataRoom_ModalDialogWindow_DocumentSignedorEventDate = "Document Signed or Event Date Textbox in Edit File Dialog Window#xpath=//div[contains(@id,'dataroom-edit-content-modal')]//div[contains(@class,'modal-content')]//label[contains(text(),'Document signed / Event date')]//following-sibling::div//input";
	private static final String btn_EditFile_DataRoom_ModalDialogWindow_Edit = "Edit Button in Edit File Dialog Window#xpath=//div[contains(@id,'dataroom-edit-content-modal')]//div[contains(@class,'modal-content')]//button[contains(text(),'Edit')]";

	/*********************************Edit File Data Room***********************/

	/*********************************File Action List of Data Room***********************/

	private static final String lbl_CompanyProfilePage_DataRoomPage_CompanyProfileSection_FileViewer = "File Viewer of Company Profile Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'cover')]//*[contains(text(),'File Viewer')]";
	private static final String lst_CompanyProfilePage_DataRoomPage_CompanyProfileSection_FileActionList = "File Action List of Company Profile Section of Data Room Page in Company Profile Page#xpath=(//div[contains(@id,'data_room-panel')]//*[contains(text(),'Company Profile')]/following-sibling::div//div[contains(@class,'tab-content')]//div[contains(@class,'content row')])[1]//ul";
	private static final String lst_CompanyProfilePage_DataRoomPage_CompanyProfileSection_FileActionList_View = "View Link in File Action List of Company Profile Section of Data Room Page in Company Profile Page#xpath=(//div[contains(@id,'data_room-panel')]//*[contains(text(),'Company Profile')]/following-sibling::div//div[contains(@class,'tab-content')]//div[contains(@class,'content row')])[1]//ul//li//a[contains(text(),'View')]";
	private static final String lst_CompanyProfilePage_DataRoomPage_CompanyProfileSection_FileActionList_Edit = "Edit Link in File Action List of Company Profile Section of Data Room Page in Company Profile Page#xpath=(//div[contains(@id,'data_room-panel')]//*[contains(text(),'Company Profile')]/following-sibling::div//div[contains(@class,'tab-content')]//div[contains(@class,'content row')])[1]//ul//li//a[contains(text(),'Edit')]";
	private static final String lst_CompanyProfilePage_DataRoomPage_CompanyProfileSection_FileActionList_Delete = "Delete Link in File Action List of Company Profile Section of Data Room Page in Company Profile Page#xpath=(//div[contains(@id,'data_room-panel')]//*[contains(text(),'Company Profile')]/following-sibling::div//div[contains(@class,'tab-content')]//div[contains(@class,'content row')])[1]//ul//li//a[contains(text(),'Delete')]";
	private static final String lst_CompanyProfilePage_DataRoomPage_CompanyProfileSection_FileActionList_Download = "Download Link in File Action List of Company Profile Section of Data Room Page in Company Profile Page#xpath=(//div[contains(@id,'data_room-panel')]//*[contains(text(),'Company Profile')]/following-sibling::div//div[contains(@class,'tab-content')]//div[contains(@class,'content row')])[1]//ul//li//a[contains(text(),'Download')]";

	private static final String lbl_CompanyProfilePage_DataRoomPage_DueDiligenceSection_FileViewer = "File Viewer of Due Diligence Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'cover')]//*[contains(text(),'File Viewer')]";
	private static final String lst_CompanyProfilePage_DataRoomPage_DueDiligenceSection_FileActionList = "File Action List of Due Diligence Section of Data Room Page in Company Profile Page#xpath=(//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Due Diligence')]/parent::td//div[contains(@class,'tab-content')]//div[contains(@class,'active')]//div[contains(@class,'row content')]//ul)[1]";
	private static final String lst_CompanyProfilePage_DataRoomPage_DueDiligenceSection_FileActionList_View = "View Link in File Action List of Due Diligence Section of Data Room Page in Company Profile Page#xpath=(//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Due Diligence')]/parent::td//div[contains(@class,'tab-content')]//div[contains(@class,'active')]//div[contains(@class,'row content')]//ul)[1]//li//a[contains(text(),'View')]";
	private static final String lst_CompanyProfilePage_DataRoomPage_DueDiligenceSection_FileActionList_Edit = "Edit Link in File Action List of Due Diligence Section of Data Room Page in Company Profile Page#xpath=(//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Due Diligence')]/parent::td//div[contains(@class,'tab-content')]//div[contains(@class,'active')]//div[contains(@class,'row content')]//ul)[1]//li//a[contains(text(),'Edit')]";
	private static final String lst_CompanyProfilePage_DataRoomPage_DueDiligenceSection_FileActionList_Delete = "Delete Link in File Action List of Due Diligence Section of Data Room Page in Company Profile Page#xpath=(//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Due Diligence')]/parent::td//div[contains(@class,'tab-content')]//div[contains(@class,'active')]//div[contains(@class,'row content')]//ul)[1]//li//a[contains(text(),'Delete')]";
	private static final String lst_CompanyProfilePage_DataRoomPage_DueDiligenceSection_FileActionList_Download = "Download Link in File Action List of Due Diligence Section of Data Room Page in Company Profile Page#xpath=(//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Due Diligence')]/parent::td//div[contains(@class,'tab-content')]//div[contains(@class,'active')]//div[contains(@class,'row content')]//ul)[1]//li//a[contains(text(),'Download')]";


	/*********************************File Action List of Data Room***********************/


	/*********************************Delete File of Data Room***********************/

	private static final String lbl_DeleteFile_DataRoom_ModalDialogWindow = "Delete File Modal Dialog Window#xpath=//div[contains(@id,'dataroom-confirmation-modal')]//div[contains(@class,'modal-content')]";
	private static final String lbl_DeleteFile_DataRoom_ModalDialogWindow_Heading = "Delete File Modal Dialog Window Heading Label#xpath=//div[contains(@id,'dataroom-confirmation-modal')]//div[contains(@class,'modal-content')]//div[contains(@class,'modal-title')]//*[contains(text(),'delete')]";
	private static final String lbl_DeleteFile_DataRoom_ModalDialogWindow_FileName = "File Name Label in Delete File Modal Dialog Window#xpath=//div[contains(@id,'dataroom-confirmation-modal')]//div[contains(@class,'modal-content')]//div[contains(@class,'modal-title')]//*[contains(text(),'delete')]//small";
	private static final String btn_DeleteFile_DataRoom_ModalDialogWindow_Delete = "Delete Button in Delete File Modal Dialog Window#xpath=//div[contains(@id,'dataroom-confirmation-modal')]//div[contains(@class,'modal-content')]//span[contains(text(),'delete')]";
	private static final String lnk_DeleteFile_DataRoom_ModalDialogWindow_Close = "Close Link of Delete File Modal Dialog Window#xpath=//div[contains(@id,'dataroom-confirmation-modal')]//div[contains(@class,'modal-content')]//a[contains(@class,'close')]";

	/*********************************Delete File of Data Room***********************/


	/*********************************Delete Folder of Data Room***********************/

	private static final String lbl_DeleteFolder_DataRoom_ModalDialogWindow = "Delete Folder Modal Dialog Window#xpath=//div[contains(@id,'dataroom-confirmation-modal')]//div[contains(@class,'modal-content')]//div[contains(@class,'modal-title')]//*[contains(text(),'delete')]";
	private static final String lbl_DeleteFolder_DataRoom_ModalDialogWindow_FolderName = "Folder Name Label in Delete Folder Modal Dialog Window#xpath=//div[contains(@id,'dataroom-confirmation-modal')]//div[contains(@class,'modal-content')]//div[contains(@class,'modal-title')]//*[contains(text(),'delete')]//span//small";
	private static final String btn_DeleteFolder_DataRoom_ModalDialogWindow_DeleteFolder = "Delete Button in Delete Folder Modal Dialog Window#xpath=//div[contains(@id,'dataroom-confirmation-modal')]//div[contains(@class,'modal-content')]//span[contains(text(),'delete')]";
	private static final String lnk_DeleteFolder_DataRoom_ModalDialogWindow_CloseWindow = "Close Link of Delete Folder Modal Dialog Window#xpath=//div[contains(@id,'dataroom-confirmation-modal')]//div[contains(@class,'modal-content')]//a[contains(@class,'close')]";

	/*********************************Delete Folder of Data Room***********************/



	/******************************Data Room Page End**********************************/

	private static final String lbl_CompanyProfilePage_DataRoomPage_CompanyProfileSection_Content = "Company Profile Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//*[contains(text(),'Company Profile')]/following-sibling::div//div[contains(@class,'midnav')]";
	private static final String lbl_CompanyProfilePage_DataRoomPage_DueDiligenceSection_Content = "Company Profile Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Due Diligence')]/parent::td";

	private static final String lbl_Website_NewTab_CompanyProfilePage = "Website in New Tab in Company Profile Page#xpath=";
	private static final String lbl_CompanyProfilePage_DataRoomPage_CompanyProfileSection_DefaultFolder = "Default Folder of Company Profile Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//*[contains(text(),'Company Profile')]/following-sibling::div//div[contains(@class,'midnav')]//a[contains(text(),'Default Folder') and contains(@class,'active')]";
	private static final String lbl_CompanyProfilePage_DataRoomPage_DueDiligenceSection_DefaultFolder = "Default Folder of Due Diligence Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Due Diligence')]/parent::td//div[contains(@class,'midnav')]//a[contains(text(),'Default Folder')and contains(@class,'active')]";
	private static final String lbl_company="Company#xpath=//div[contains(@id,'company')]//span[contains(text(),'Company')]";


	private static final String lnk_Website_externalLinks_About_CompanyProfilePage = "Website Link of external Links of about Section of Company Profile Main Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'external-links')]//a[1]";
	private static final String lnk_LinkedIn_externalLinks_About_CompanyProfilePage = "LinkedIn Link of external Links of about Section of Company Profile Main Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'external-links')]//a[2]";
	private static final String lnk_Facebook_externalLinks_About_CompanyProfilePage = "Facebook Link of external Links of about Section of Company Profile Main Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'external-links')]//a[3]";
	private static final String lnk_Instagram_externalLinks_About_CompanyProfilePage = "Instagram Link of external Links of about Section of Company Profile Main Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'external-links')]//a[4]";
	private static final String lnk_AngelList_externalLinks_About_CompanyProfilePage = "AngelList Link of external Links of about Section of Company Profile Main Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'external-links')]//a[5]";
	private static final String lnk_Medium_externalLinks_About_CompanyProfilePage = "Medium Link of external Links of about Section of Company Profile Main Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'external-links')]//a[6]";
	private static final String lnk_Twitter_externalLinks_About_CompanyProfilePage = "Twitter Link of external Links of about Section of Company Profile Main Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'external-links')]//a[7]";
	private static final String lnk_Crucnhbase_externalLinks_About_CompanyProfilePage = "Crunchbase Link of external Links of about Section of Company Profile Main Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'external-links')]//a[8]";
	private static final String lnk_Youtube_externalLinks_About_CompanyProfilePage = "Youtube Link of external Links of about Section of Company Profile Main Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'external-links')]//a[9]";
	private static final String lbl_CompanyProfilePage_ViewProfileasPublic_DialogWindow = "View Profile as Public Dialog window in Company Profile Page#xpath=//div[contains(@class,'org-page')]//div[contains(@class,'notification-primary')]//span[contains(text(),'You are currently viewing this profile as public')]";
	private static final String lnk_CompanyProfilePage_Profile_MainPage_Contact_DoggleDots = "Contact Doggle Dots of Company Profile Main Page#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'hatcher-box-padded contact')]//*[contains(text(),'Contact')]//a[contains(@id,'dropdownEngagement')]";
	private static final String lst_CompanyProfilePage_Profile_MainPage_Contact_OptionsList = "Contact Options List of Company Profile Main Page#xpath=//body/ul[contains(@aria-labelledby,'dropdownEngagement')]";
	private static final String lnk_CompanyProfilePage_Profile_MainPage_Contact_OptionsList_Edit = "Edit Link of Contact Company in Options List of Company Profile Main Page#xpath=//body/ul[contains(@aria-labelledby,'dropdownEngagement')]//li//a[contains(text(),'Edit')]";


	private static final String ContactSection_Country_LinkedInOption_SingleSelection="Country-Contact Section#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='Country']/parent::div/following-sibling::div//label[contains(text(),'LinkedIn')]/parent::div//div[contains(@class,'multiselect__select')]//following-sibling::div//span[contains(text(),'select option')]";
	private static final String ContactSection_Country_LinkedInOption_MultipleSelection="Country-Contact Section-Multiple selection#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='Country']/parent::div/following-sibling::div//label[contains(text(),'LinkedIn')]/parent::div//div[contains(@class,'multiselect__select')]//following-sibling::div//span[contains(@class,'multiselect__single')]";
	private static final String ContactSection_Country_ClearbitOption_NoSelection="Country_ClearbitOption_NoSelection#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='Country']/parent::div/following-sibling::div//label[contains(text(),'Clearbit')]/parent::div//div[contains(@class,'multiselect__select')]//following-sibling::div//span[contains(text(),'select option')]";
	private static final String ContactSection_Country_ClearbitOption_MultipleSelection="ClearbitOption_MultipleSelection#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='Country']/parent::div/following-sibling::div//label[contains(text(),'Clearbit')]/parent::div//div[contains(@class,'multiselect__select')]//following-sibling::div//span[contains(@class,'multiselect__single')]";
	private static final String DataRoom_CompanyProfile_Tab="DataRoom Company Profile #xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Company Profile')]/parent::td//div[contains(@class,'tab-content')]//div[contains(@class,'active')]//div[contains(@class,'row content')])[1]";
	private static final String DataRoom_dueDiligence_dropdownMenuLinkTask="DataRoom_dueDiligence_dropdownMenuLinkTask #xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Due Diligence')]/parent::td//div[contains(@class,'tab-content')]//div[contains(@class,'active')]//div[contains(@class,'row content')]//a[contains(@id,'dropdownMenuLinkTask')])[1]";

	private static final String fileNamefromApp ="fileNamefromApp#xpath=//div[contains(@id,'cover')]//div[contains(@class,'transparent-form')]//div[contains(@class,'country-list')]";
	private static final String lbl_File_Viewer="File_Viewer#xpath=//div[contains(@id,'cover')]//*[contains(text(),'File Viewer')]";

	//newly added
	private static final String lnk_DoggleDots_EditMenu="Link DoggleDots_Edit Menu#xpath=(//a[contains(@id,'dropdownDealflow')]//i)[1]";
	//private static final String lnk_CompanyProfilePage_TopMenu_ToggleDots_MenuContainer_Edit = "Edit Top Menu Toggle Dots Menu container link in Company Profile Page#xpath=(//ul[contains(@class,'dropdown-menu bg-light show')])[1]//li//a[contains(text(),'Edit')]";
	private static final String lnk_CompanyProfilePage_EditProfilePage = "Edit Profile Page in Company Profile Page#xpath=//div[contains(@id,'profile-panel')]//*[contains(text(),'Edit Company')]";//updated
	private static final String lbl_CompanyProfilePage_EditProfilePage_CompanySection_LegalName = "Legal Name Label in Company section#xpath=//div[contains(@id,'company')]//*[text()='Legal Name']";
	private static final String lbl_CompanyProfilePage_EditProfilePage_CompanySection_FriendlyName = "Friendly Name Label in Company section of Company Edit Profile Page#xpath=//div[contains(@id,'company')]//*[text()='Friendly Name']";
	private static final String lbl_CompanyProfilePage_EditProfilePage_CompanySection_IncorporationDate = "Incorporation date Label in Company section of Company Edit Profile Page#xpath=//div[contains(@id,'company')]//*[text()='Incorporation date']";
	private static final String lbl_CompanyProfilePage_EditProfilePage_CompanySection_Jurisdiction = "Jurisdiction Label in Company section of Company Edit Profile Page#xpath=//div[contains(@id,'company')]//*[text()='Jurisdiction']";


//newly added
	private static final String lbl_Share_CompanyProfilePage_ModalDialogWindow = "Share Company Profile Page Modal Window#xpath=//div[contains(@id,'org-sharing-modal')]//div[contains(@class,'modal-title')]//*[contains(text(),'Share')]";
	private static final String btn_Share_CompanyProfilePage_ModalDialogWindow_Share = "Share Button in Share Company Profile Page Modal Window Label#xpath=//div[contains(@id,'org-sharing-modal')]//button[contains(text(),'Share')]";
	private static final String lbl_Valid_EmailAddress_Error_Meessage_ModalDialogWindow_Share = "Enter valid email address in Share Company Profile Page Modal Window Label#xpath=//span[contains(text(),'Please enter a valid email address')]";
	private static final String lbl_User_Found_Meessage_ModalDialogWindow_Share = "User Found Message in Share Company Profile Page Modal Window Label#xpath=//div[contains(@id,'org-sharing-modal')]//div[contains(@class,'modal-title')]//*[contains(text(),'User found')]";
	private static final String lbl_Organization_Shared_Meessage_ModalDialogWindow_Share = "Enter valid email address in Share Company Profile Page Modal Window Label#xpath=//span[contains(text(),'Organization has been successfully shared')]";
	private static final String txt_Share_CompanyProfilePage_ModalDialogWindow_EmailAddress = "Emaill Address Textbox in Share Company Profile Page Modal Window#xpath=//div[contains(@id,'org-sharing-modal')]//input[contains(@name,'email')]";
	private static final String btn_Close_CompanyProfilePage_ModalDialogWindow_Share = "Close Button in Share Company Profile Page Modal Window Label#xpath=//div[contains(@id,'org-sharing-modal')]//button[contains(text(),'Close')]";
	private static final String lbl_User_Not_Found_Meessage_ModalDialogWindow_Share = "User Found Message in Share Company Profile Page Modal Window Label#xpath=//div[contains(@id,'org-sharing-modal')]//div[contains(@class,'modal-title')]//*[contains(text(),'*User not found')]";
	
	
	private static final String lbl_Salutation_Mandatory_AddNewContact_ModalDialogWindow = "Salutation dropdown asterisk in Add New Contact Modal Window#xpath=//div[contains(@id,'org-sharing-modal')]//label[text()='Salutation' and @class='required-field']";
	private static final String drp_Salutation_AddNew_Contact_ModalDialogWindow = "Salutation dropdown in Add New Contact Modal Window#xpath=//div[contains(@id,'org-sharing-modal')]//label[contains(text(),'Salutation')]/parent::div//select";
	private static final String txt_FirstName_Mandatory_AddNewContact_ModalDialogWindow = "First Name Textbox asterisk in Add New Contact Modal Window#xpath=//div[contains(@id,'org-sharing-modal')]//label[(contains(text(),'First Name')) and @class='required-field']";
	private static final String txt_FirstName_AddNew_Contact_ModalDialogWindow = "First Name Textbox in Add New Contact Modal Window#xpath=//div[contains(@id,'org-sharing-modal')]//label[contains(text(),'First Name')]/parent::div//input";
	private static final String txt_LastName_Mandatory_AddNewContact_ModalDialogWindow = "Last Name Textbox asterisk in Add New Contact Modal Window#xpath=//div[contains(@id,'org-sharing-modal')]//label[(contains(text(),'Last Name')) and @class='required-field']";
	private static final String txt_LastName_AddNew_Contact_ModalDialogWindow = "Last Name Textbox in Add New Contact Modal Window#xpath=//div[contains(@id,'org-sharing-modal')]//label[contains(text(),'Last Name')]/parent::div//input";
	private static final String txt_Email_AddNew_Contact_ModalDialogWindow = "Email Textbox in Add New Contact Modal Window#xpath=//div[contains(@id,'org-sharing-modal')]//input[@name='email']";
	private static final String txt_Email_Mandatory_AddNewContact_ModalDialogWindow= "Email Textbox asterisk in Add New Contact Modal Window#xpath=//div[contains(@id,'org-sharing-modal')]//label[(contains(text(),'Email')) and @class='required-field']";
	private static final String txt_CompanyName_Mandatory_AddNewContact_ModalDialogWindow = "Company Name Textbox asterisk in Add New Contact Modal Window#xpath=//div[contains(@id,'org-sharing-modal')]//label[(contains(text(),'Company Name')) and @class='required-field']";
	private static final String txt_CompanyName_AddNew_Contact_ModalDialogWindow = "Company Name Textbox in Add New Contact Modal Window#xpath=//div[contains(@id,'org-sharing-modal')]//input[contains(@placeholder,'Company Name')]";
	private static final String txt_Country_Mandatory_AddNewContact_ModalDialogWindow = "Country Textbox asterisk in Add New Contact Modal Window#xpath=//div[contains(@id,'org-sharing-modal')]//label[(contains(text(),'Country')) and @class='required-field']";
	private static final String txt_Country_AddNew_Contact_ModalDialogWindow = "Country Textbox in Add New Contact Modal Window#xpath=//div[contains(@id,'org-sharing-modal')]//input[contains(@placeholder,'Country')]";
	private static final String txt_Website_Mandatory_AddNewContact_ModalDialogWindow = "Website Textbox asterisk in Add New Contact Modal Window#xpath=//div[contains(@id,'org-sharing-modal')]//label[(contains(text(),'Website')) and @class='required-field']";
	private static final String txt_Website_AddNew_Contact_ModalDialogWindow = "Website Textbox in Add New Contact Modal Window#xpath=//div[contains(@id,'org-sharing-modal')]//input[contains(@placeholder,'Website')]";
	private static final String txt_Phone_Mandatory_AddNewContact_ModalDialogWindow = "Phone Textbox asterisk in Add New Contact Modal Window#xpath=//div[contains(@id,'org-sharing-modal')]//label[(contains(text(),'Website')) and @class='required-field']";
	private static final String txt_Phone_AddNew_Contact_ModalDialogWindow = "Phone Textbox in Add New Contact Modal Window#xpath=//div[contains(@id,'org-sharing-modal')]//input[contains(@placeholder,'phone')]";

	//newly added-Dec-12
	
	private static final String txt_Address_AddNew_Contact_ModalDialogWindow = "Address Textbox in Add New Contact Modal Window#xpath=//div[contains(@id,'org-sharing-modal')]//input[contains(@placeholder,'Address')]";
	private static final String txt_City_AddNew_Contact_ModalDialogWindow = "Phone Textbox in Add New Contact Modal Window#xpath=//div[contains(@id,'org-sharing-modal')]//input[contains(@placeholder,'City')]";
	private static final String txt_State_AddNew_Contact_ModalDialogWindow = "State Textbox in Add New Contact Modal Window#xpath=//div[contains(@id,'org-sharing-modal')]//input[contains(@placeholder,'State')]";
	private static final String txt_PostalCode_AddNew_Contact_ModalDialogWindow = "PostalCode Textbox in Add New Contact Modal Window#xpath=//div[contains(@id,'org-sharing-modal')]//input[contains(@placeholder,'Postal code')]";
	private static final String msg_invalid_FirstName_errormessage="First Name - Invalid Message#xpath=//div[(contains(@title,'First'))and @class='text-danger ml-1']";
	private static final String msg_invalid_LastName_errormessage="First Name - Invalid Message#xpath=//div[(contains(@title,'Last'))and @class='text-danger ml-1']";
	private static final String msg_invalid_Email_errormessage="First Name - Invalid Message#xpath=//div[(contains(@title,'Email'))and @class='text-danger ml-1']";
	private static final String msg_invalid_CompanyName_errormessage="First Name - Invalid Message#xpath=//div[(contains(@title,'CompanyName'))and @class='text-danger ml-1']";
	private static final String msg_invalid_Country_errormessage="First Name - Invalid Message#xpath=//div[(contains(@title,'country'))and @class='text-danger ml-1']";
	private static final String msg_invalid_Website_errormessage="First Name - Invalid Message#xpath=//div[(contains(@title,' URL is not valid'))and @class='text-danger ml-1']";
	
	//newly-added-Upload 
	private static final String lnk_UploadPresentation_ToggleDots_Opts="Upload Presentation Option in Toggle Dots#xpath=//a[contains(text(),'Upload Presentation')]";
	private static final String lbl_heading_Upload_Presentation="Headling Upload Presentation#xpath=//div[contains(@class,'modal-body p-4')]//following::h4[contains(text(),'Upload Presentation')]";
	private static final String txt_UploadPresentation_inputBox="Upload Presentation InputBox#xpath=//input[(contains(@placeholder,'Enter name...'))and @class='form-control upload_deck_document_title']";
	private static final String lbl_fileFormats_UploadDialogWindow="File Formats in Upload Dialog Window#xpath=";
	
	private static final String btn_Upload="Upload Button#xpath=//div[contains(@class,'text-center pt-2 pb-2')]//following::button[contains(text(),'Upload')]";
	private static final String btn_close_UploadPresentation="Close Symbol in Upload Presentation#path=(//a[contains(@class,'modal-button-close')]//i)[1]";
	
	
		public CompanyProfilePage(BaseClass obj) 
	{
		super(obj);
	}

	/**
	 *This method is used to verify the company Profile is displayed.
	 *
	 *@author VijayaKumar.U
	 */

	public void verify_CompanyProfilePage_displayed()
	{
		try {
			waitForElementToDisplay(lbl_CompanyProfilePage_Heading, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_CompanyProfilePage_Heading))	{
				testStepPassed("Company Profile Page is displayed");	
			}	
		} 
		catch (Exception e) {
			testStepFailed("Company Profile Page is not displayed"+e.getClass());e.printStackTrace();//edited
		}	}

	/**
	 *This method is used to verify the display of main Profile in company profile page.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_CompanyProfilePage_MainProfilePage_displayed()
	{
		try {
			waitForElementToDisplay(lbl_CompanyProfilePage_Profile_MainPage, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_CompanyProfilePage_Profile_MainPage))
			{
				testStepPassed("Company Profile Main Page is displayed");	
			}
			else
			{
				testStepFailed("Company Profile Main Page is not displayed");
			}		} 
		catch (Exception e) {
			testStepFailed("Company Profile Main Page is not displayed"+e.getClass());e.printStackTrace();//edited
		}	}

	/**
	 *This method is used to verify the display of the corresponding company profile.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_CorrespondingCompanyProfilePage_displayed(String emailAddressWhileLogin)	{
		String emailAddressinApplication = driver.findElement(By.xpath("(//div[contains(@id,'profile-panel')]//div[contains(@class,'hatcher-box')]//*[contains(text(),'Contact')])[3]/following-sibling::div[contains(@class,'hatcher-box-border')]//tr[3]//a")).getText().trim();
		try		{
			if (emailAddressinApplication.equalsIgnoreCase(emailAddressWhileLogin))	{
				testStepPassed("Correct Company Profile page is displayed for the User with email address "+emailAddressWhileLogin);
			}	} 
		catch (Exception e)	{
			testStepFailed("Correct Company Profile page is not displayed for the User with email address "+emailAddressWhileLogin);
		}	}

	/**
	 *This method is used to correct the company profile for the user .
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_CorrespondingCompanyProfilePage_displayed_by_CompanyName(String companyName)	{
		String companyNameinApplication = driver.findElement(By.xpath("//div[contains(@class,'section')]//*[contains(@class,'post-title')]")).getText().trim();
		try	{
			if (companyNameinApplication.contains(companyName))			{
				testStepPassed("Correct Company Profile page is displayed for the User with Company Name "+companyName);
			}		
			else{
				testStepFailed("Correct Company Profile page is not displayed for the User with Company Name "+companyName);
			} 
		}
		catch (Exception e)		{
			testStepFailed(" "+e.getClass());
		}	}

	/**
	 *This method is used to click and edit the company profile page details.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_EditProfile_Back_Link()
	{
		try{
			waitForElementToDisplay(lnk_EP_CompanySection_Back, this.elementLoadWaitTime);
			clickOn(lnk_EP_CompanySection_Back);
		}
		catch (Exception e){
			testStepFailed("Element is not displayed."+e.getClass());
		}}
	/**
	 *This method is used to click the Profile name in the Company Profile page.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_MidNav_Profile()
	{
		waitForElementToDisplay(lnk_CompanyProfilePage_Profile, this.elementLoadWaitTime);
		clickOn(lnk_CompanyProfilePage_Profile);
	}
	/**
	 *This method is used to click on The Fundraising in company profile page.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_MidNav_Fundraising()
	{
		waitForElementToDisplay(lnk_CompanyProfilePage_Fundraising, this.elementLoadWaitTime);
		clickOn(lnk_CompanyProfilePage_Fundraising);
	}
	/**
	 *This method is used to click the Mid Nav of the CapTable.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_MidNav_CapTable()
	{
		waitForElementToDisplay(lnk_CompanyProfilePage_CapTable, this.elementLoadWaitTime);
		clickOn(lnk_CompanyProfilePage_CapTable);
	}
	/**
	 *This method is used to click the MidNav in Data Room.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_MidNav_DataRoom()
	{
		waitForElementToDisplay(lnk_CompanyProfilePage_DataRoom, this.elementLoadWaitTime);
		clickOn(lnk_CompanyProfilePage_DataRoom);
	}
	/**
	 *This method is used to click KPI in the Mid Nav.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_MidNav_KPI()
	{
		waitForElementToDisplay(lnk_CompanyProfilePage_KPI, this.elementLoadWaitTime);
		clickOn(lnk_CompanyProfilePage_KPI);
	}
	/**
	 *This method is used to click the profile tab link.
	 *
	 *@author VijayaKumar.U
	 */

	public void click_ProfileTab_Link()
	{
		click_MidNav_Profile();
	}
	/**
	 *This method is used to click the Fundraising tab link.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_FundraisingTab_Link()
	{
		click_MidNav_Fundraising();
	}
	/**
	 *This method is used to click the captable Tab link.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_CaptableTab_Link()
	{
		click_MidNav_CapTable();
	}
	/**
	 *This method is used to click the Mid Nav link of the Data Room. 
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DataRoomTab_Link()
	{
		click_MidNav_DataRoom();
	}
	/**
	 *This method is used to click Mid navigation of KPI link.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_KPITab_Link()
	{
		click_MidNav_KPI();
	}
	/**
	 *This method is used to verify the display of the Profile Tab in Company Profile Page.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_ProfileTab_CompanyProfilePage_displayed(){
		try 		{
			waitForElementToDisplay(lbl_CompanyProfilePage_ProfileTab, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_CompanyProfilePage_ProfileTab))			{
				testStepPassed("Profile Tab is displayed in Comapany Profile Page");	
			}	
			else{
				testStepFailed("Profile Tab is not displayed in Comapany Profile Page");//newly added-else block

			}	} 
		catch (Exception e) 		{
			testStepFailed("The Element in the Company profile page could not be verified."+e.getClass());e.printStackTrace();
		}	}
	/**
	 *This method is used to verify the Fundrising Tab is displayed in Company Profile page.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_FundraisingTab_CompanyProfilePage_displayed(){
		try 		{
			waitForElementToDisplay(lbl_CompanyProfilePage_FundraisingTab, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_CompanyProfilePage_FundraisingTab))			{
				testStepPassed("Fundrising Tab is displayed in Comapany Profile Page");	
			}		else{
				testStepFailed("Fundrising Tab is not displayed in Comapany Profile Page");//newly added-else block

			}} 
		catch (Exception e) 		{
			testStepFailed("The Element in the Comapany Profile Page could not be verified"+e.getClass());e.printStackTrace();
		}	}
	/**
	 *This method is used to verify the Captable Tab display.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_CapTableTab_CompanyProfilePage_displayed(){
		try	{
			waitForElementToDisplay(lbl_CompanyProfilePage_CapTableTab, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_CompanyProfilePage_CapTableTab))			{
				testStepPassed("Cap Table Tab is displayed in Comapany Profile Page");	
			}		} 
		catch (Exception e)		{
			testStepFailed("Cap Table Tab is not displayed in Comapany Profile Page");
		}	}
	/**
	 *This method is used to verify the Data Room Tab display in Company Profile Page.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_DataRoomTab_CompanyProfilePage_displayed()	{
		try		{
			waitForElementToDisplay(lbl_CompanyProfilePage_DataRoomTab, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_CompanyProfilePage_DataRoomTab))			{
				testStepPassed("Data Room Tab is displayed in Comapany Profile Page");	
			}		} 
		catch (Exception e)		{
			testStepFailed("Data Room Tab is not displayed in Comapany Profile Page");
		}	}
	/**
	 *This method is used to verify the display of Data Room Section in Company Profile Page.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_DataRoomSection_CompanyProfilePage_displayed()	{
		try 		{
			waitForElementToDisplay(lbl_CompanyProfilePage_DataRoomSection, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_CompanyProfilePage_DataRoomSection))			{
				testStepPassed("Data Room Section is displayed in Comapany Profile Page");	
			}		} 
		catch (Exception e) 		{
			testStepFailed("Data Room Section is not displayed in Comapany Profile Page");
		}	}
	/**
	 *This method is used to verify the display of KPI tab in Company Profile Page.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_KPI_CompanyProfilePage_displayed()	{
		try 		{
			waitForElementToDisplay(lbl_CompanyProfilePage_KPITab, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_CompanyProfilePage_KPITab))			{
				testStepPassed("KPI Tab is displayed in Comapany Profile Page");	
			}		} 
		catch (Exception e) 		{
			testStepFailed("KPI Tab is not displayed in Comapany Profile Page");
		}	}
	/**
	 *This method is used to access the Toggle dots for the menu.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_TopNavMenu_ToggleDots()	{
		waitForElementToDisplay(lnk_CompanyProfilePage_TopMenu_ToggleDots, this.elementLoadWaitTime);
		clickOn(lnk_CompanyProfilePage_TopMenu_ToggleDots);
	}
	/**
	 *This method is used to verify the display of the Menu container in top menu.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_TopNavMenu_ToggleDots_MenuContainer_displayed()	{
		try		{
			waitForElementToDisplay(lbl_CompanyProfilePage_TopMenu_ToggleDots_MenuContainer, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_CompanyProfilePage_TopMenu_ToggleDots_MenuContainer))			{
				testStepPassed("Company Profile Page Top Menu Conatiner is displayed");	
			}		} 
		catch (Exception e)		{
			testStepFailed("Company Profile Page Top Menu Conatiner is not displayed");
		}	}
	/**
	 *This method is used to click the edit the menu container in the Toggle Dots.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_EditComapny_ToggleDots_TopNavMenu()	{
		try{
			waitForElementToDisplay(lnk_CompanyProfilePage_TopMenu_ToggleDots_MenuContainer_Edit, this.elementLoadWaitTime);
			clickOn(lnk_CompanyProfilePage_TopMenu_ToggleDots_MenuContainer_Edit);
		}
		catch (Exception e){
			testStepFailed("Could not edit the details."+e.getClass());
		}}

	/**
	 *This method is used to click and update the company data with the menu available in the toggle dots.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_UpdateCompanyData_ToggleDots_TopNavMenu()	{
		try{
			waitForElementToDisplay(lnk_CompanyProfilePage_TopMenu_ToggleDots_MenuContainer_UpdateCompanyData, this.elementLoadWaitTime);
			clickOn(lnk_CompanyProfilePage_TopMenu_ToggleDots_MenuContainer_UpdateCompanyData);
		}
		catch (Exception e){
			testStepFailed("Could not update the company data ."+e.getClass());
		}}

	/**
	 *This method is used to upload the presentation using the toggle dots in top menu.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_UploadPresentation_ToggleDots_TopNavMenu()	{
		try {
			waitForElementToDisplay(lnk_CompanyProfilePage_TopMenu_ToggleDots_MenuContainer_UploadPresentation, this.elementLoadWaitTime);
			clickOn(lnk_CompanyProfilePage_TopMenu_ToggleDots_MenuContainer_UploadPresentation);
		}
		catch (Exception e){
			testStepFailed("Couldnt upload the presentation."+e.getClass());
		}}	
	/**
	 *This method is used to upload video using toggle dots.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_UploadVideo_ToggleDots_TopNavMenu()	{
		waitForElementToDisplay(lnk_CompanyProfilePage_TopMenu_ToggleDots_MenuContainer_UploadVideo, this.elementLoadWaitTime);
		clickOn(lnk_CompanyProfilePage_TopMenu_ToggleDots_MenuContainer_UploadVideo);
	}
	/**
	 *This method is used to customize Profile.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_CustomizeProfile_ToggleDots_TopNavMenu()	{
		waitForElementToDisplay(lnk_CompanyProfilePage_TopMenu_ToggleDots_MenuContainer_CustomizeProfile, this.elementLoadWaitTime);
		clickOn(lnk_CompanyProfilePage_TopMenu_ToggleDots_MenuContainer_CustomizeProfile);
	}
	/**
	 *This method is used to merge company using toggle dots in Company Profile Page.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_MergeCompany_ToggleDots_TopNavMenu()	{
		waitForElementToDisplay(lnk_CompanyProfilePage_TopMenu_ToggleDots_MenuContainer_MergeCompany, this.elementLoadWaitTime);
		clickOn(lnk_CompanyProfilePage_TopMenu_ToggleDots_MenuContainer_MergeCompany);
	}
	/**
	 *This method is used to view the user access list in the menu.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_ViewUserAccessList_ToggleDots_TopNavMenu()	{
		waitForElementToDisplay(lnk_CompanyProfilePage_TopMenu_ToggleDots_MenuContainer_ViewUserAccessList, this.elementLoadWaitTime);
		clickOn(lnk_CompanyProfilePage_TopMenu_ToggleDots_MenuContainer_ViewUserAccessList);
	}
	/**
	 *This method is used to click and delete the company in the toggle menu.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DeleteComapny_ToggleDots_TopNavMenu()	{
		waitForElementToDisplay(lnk_CompanyProfilePage_TopMenu_ToggleDots_MenuContainer_DeleteCompany, this.elementLoadWaitTime);
		clickOn(lnk_CompanyProfilePage_TopMenu_ToggleDots_MenuContainer_DeleteCompany);
	}
	/**
	 *This method is used to click and print the report .
	 *
	 *@author VijayaKumar.U
	 */
	public void click_PrintReport_ToggleDots_TopNavMenu()	{
		try {
			waitForElementToDisplay(lnk_CompanyProfilePage_TopMenu_ToggleDots_MenuContainer_PrintReport, this.elementLoadWaitTime);
			clickOn(lnk_CompanyProfilePage_TopMenu_ToggleDots_MenuContainer_PrintReport);
		}
		catch (Exception e) 		{
			testStepFailed("Delete Company Confirm Dialog is not displayed");
		}	}
	/**
	 *This method is used to view the profile as public in the toggle menu.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_ViewProfileasPublicToggleDots_TopNavMenu()	{
		try {
			waitForElementToDisplay(lnk_CompanyProfilePage_TopMenu_ToggleDots_MenuContainer_ViewProfileasPublic, this.elementLoadWaitTime);
			clickOn(lnk_CompanyProfilePage_TopMenu_ToggleDots_MenuContainer_ViewProfileasPublic);
		}
		catch (Exception e) {
			testStepFailed("View Profile Public is not displayed"+e.getClass());
		}	}
	/**
	 *This method is used to click and the confirm the deletion of the company.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DeleteButton_Confirm_DeleteCompany_Dialog()	{
		try {
			waitForElementToDisplay(lbl_CompanyProfilePage_DeleteUserConfirmDialog, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_CompanyProfilePage_DeleteUserConfirmDialog))			{
				testStepPassed("Delete Company Confirm Dialog is displayed");
				clickOn(btn_CompanyProfilePage_DeleteUserConfirmDialog_Delete);
			}		} 
		catch (Exception e) {
			testStepFailed("Delete Company Confirm Dialog is not displayed"+e.getClass());
		}	}

	/**
	 *This method is used to view the company description in the company profile page.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DoggleDits_CompanyDescription_CompanyProfilePage()	{
		try 		{
			waitForElementToDisplay(lnk_CompanyProfilePage_Profile_MainPage_EditDescription_DoggleDots, this.elementLoadWaitTime);

			clickOn(lnk_CompanyProfilePage_Profile_MainPage_EditDescription_DoggleDots);
		}
		catch (Exception e) 		{
			testStepFailed("Company description not displayed"+e.getClass());
		}	}
	/**
	 *This method is used to click and edit the description of company in the company profile page.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_EditDescription_CompanyDescription_CompanyProfilePage()
	{
		try{
			waitForElementToDisplay(lst_CompanyProfilePage_Profile_MainPage_EditDescription_OptionsList, this.elementLoadWaitTime);

			clickOn(lnk_CompanyProfilePage_Profile_MainPage_EditDescription_OptionsList_EditDescription);
		}
		catch (Exception e){
			testStepFailed("Main page description could not be verified."+e.getClass());
		}}
	/**
	 *This method is used to edit the description by clicking the logo in company profile page.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_EditLogo_CompanyDescription_CompanyProfilePage()
	{
		try{
			waitForElementToDisplay(lst_CompanyProfilePage_Profile_MainPage_EditDescription_OptionsList, this.elementLoadWaitTime);

			clickOn(lnk_CompanyProfilePage_Profile_MainPage_EditDescription_OptionsList_EditLogo);
		}
		catch (Exception e){
			testStepFailed("Editing of the description of company in Company profile."+e.getClass());
		}}
	/**
	 *This method is used to click doggle and edit description of the company in profile page.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_EditDescriptionLink_CompanyDescription_CompanyProfilePage()
	{
		try{
			click_DoggleDits_CompanyDescription_CompanyProfilePage();

			click_EditDescription_CompanyDescription_CompanyProfilePage();
		}
		catch (Exception e){
			testStepFailed("Could not edit the description of company."+e.getClass());
		}}
	/**
	 *This method is used to click and DoggleDits to view About content of the Company profile.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DoggleDits_About_CompanyProfilePage()
	{
		try{
			waitForElementToDisplay(lnk_CompanyProfilePage_Profile_MainPage_About_DoggleDots, this.elementLoadWaitTime);

			clickOn(lnk_CompanyProfilePage_Profile_MainPage_About_DoggleDots);
		}
		catch (Exception e){
			testStepFailed("Couldnt verify the Profile page."+e.getClass());
		}}	
	/**
	 *This method is used to upload the presentation in the Company PRofile Page.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_UploadPresentation_About_CompanyProfilePage()
	{
		try {
			waitForElementToDisplay(lst_CompanyProfilePage_Profile_MainPage_About_OptionsList, this.elementLoadWaitTime);

			clickOn(lnk_CompanyProfilePage_Profile_MainPage_About_OptionsList_UploadPresentation);
		}
		catch (Exception e){
			testStepFailed("Element is not displayed."+e.getClass());
		}}
	/**
	 *This method is used to click and upload the screenshot of the profile in main page.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_UploadScreenshot_About_CompanyProfilePage()
	{
		waitForElementToDisplay(lst_CompanyProfilePage_Profile_MainPage_About_OptionsList, this.elementLoadWaitTime);

		clickOn(lnk_CompanyProfilePage_Profile_MainPage_About_OptionsList_UploadScreenshot);
	}
	/**
	 *This method is used to click doggle dits and upload the screenshot link-About in the Company Profile Page.
	 *
	 *@author VijayaKumar.U
	 */

	public void click_UploadScreenshotLink_About_CompanyProfilePage()
	{
		click_DoggleDits_About_CompanyProfilePage();

		click_UploadScreenshot_About_CompanyProfilePage();
	}

	/**
	 *This method is used to edit the company profile in the menu.
	 *
	 *@author VijayaKumar.U
	 */
	public void editCompanyProfile()
	{
		click_TopNavMenu_ToggleDots();
		click_TopNavMenu_ToggleDots_MenuContainer_displayed();
		click_EditComapny_ToggleDots_TopNavMenu();
	}
	/**
	 *This method is used to update the company data using the toggle menu.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_UpdateCompanyData()
	{
		click_TopNavMenu_ToggleDots();
		click_TopNavMenu_ToggleDots_MenuContainer_displayed();
		click_UpdateCompanyData_ToggleDots_TopNavMenu();
	}
	/**
	 *This method is used to upload the presentation using the toggle menu.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_UploadPresentation()
	{
		click_TopNavMenu_ToggleDots();
		click_TopNavMenu_ToggleDots_MenuContainer_displayed();
		click_UploadPresentation_ToggleDots_TopNavMenu();
	}
	/**
	 *This method is used to click and upload video in the menu.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_UploadVideo()
	{
		click_TopNavMenu_ToggleDots();
		click_TopNavMenu_ToggleDots_MenuContainer_displayed();
		click_UploadVideo_ToggleDots_TopNavMenu();
	}
	/**
	 *This method is used to customize the company profile using toggle dots.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_CustomizeCompanyProfile()
	{
		click_TopNavMenu_ToggleDots();
		click_TopNavMenu_ToggleDots_MenuContainer_displayed();
		click_CustomizeProfile_ToggleDots_TopNavMenu();
	}
	/**
	 *This method is used to click and merge the company using toggle dots.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_MergeCompany()
	{
		click_TopNavMenu_ToggleDots();
		click_TopNavMenu_ToggleDots_MenuContainer_displayed();
		click_MergeCompany_ToggleDots_TopNavMenu();
	}
	/**
	 *This method is used to select the view user access list.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_ViewUserAccessList()
	{
		click_TopNavMenu_ToggleDots();
		click_TopNavMenu_ToggleDots_MenuContainer_displayed();
		click_ViewUserAccessList_ToggleDots_TopNavMenu();
	}

	/**
	 *This method is used to delete the company Profile.	*
	 *@author VijayaKumar.U
	 *
	 */
	public void deleteCompanyProfile()
	{
		click_TopNavMenu_ToggleDots();
		click_TopNavMenu_ToggleDots_MenuContainer_displayed();
		click_DeleteComapny_ToggleDots_TopNavMenu();
		click_DeleteButton_Confirm_DeleteCompany_Dialog();
	}

	/**
	 *This method is used to verify and print the report.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_PrintReport()
	{
		click_TopNavMenu_ToggleDots();
		click_TopNavMenu_ToggleDots_MenuContainer_displayed();
		click_PrintReport_ToggleDots_TopNavMenu();
	}
	/**
	 *This method is used to view profile as public.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_ViewProfileasPublic()
	{
		click_TopNavMenu_ToggleDots();
		click_TopNavMenu_ToggleDots_MenuContainer_displayed();
		click_ViewProfileasPublicToggleDots_TopNavMenu();
	}



	/**
	 *This method is used to verify the display of company section in profile page.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_CompanySection_EditCompany_CompanyProfilePage_displayed()	{
		try {
			waitForElementToDisplay(lbl_CompanyProfilePage_EditProfilePage_CompanySection, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_CompanyProfilePage_EditProfilePage_CompanySection))	{
				testStepPassed("Company Section in Edit Company of Company Profile Page is displayed");	
			}		} 
		catch (Exception e) {
			testStepFailed("Company Section in Edit Company of Company Profile Page is displayed");
		}	}
	/**
	 *This method is used to verify the display of edit profile in company page.
	 *
	 *@author VijayaKumar.U
	 */

	public void verify_EditProfile_CompanyPage_displayed()	{
		waitForElementToDisplay(lnk_CompanyProfilePage_EditProfilePage, this.elementLoadWaitTime);
		if(isElementDisplayed(lnk_CompanyProfilePage_EditProfilePage))	{
			testStepPassed("Edit Company Profile Page is displayed");	
		}
		else{
			testStepFailed("Edit Company Profile Page is not displayed");
		}	}

	/**
	 *This method is used to verify the display of the former names section.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_CompanyFormerNamesSection_EditCompany_CompanyProfilePage_displayed()	{
		try {
			WebElement element = findWebElement(lbl_CompanyProfilePage_EditProfilePage_CompanyFormerNamesSection);
			scrolltoElementView(element);
			if(isElementDisplayed(lbl_CompanyProfilePage_EditProfilePage_CompanyFormerNamesSection)){
				testStepPassed("Company Former Names Section in Edit Company of Company Profile Page is displayed");	
			}		} 
		catch (Exception e) {
			testStepFailed("Company Former Names  Section in Edit Company of Company Profile Page is displayed");
		}	}
	/**
	 *This method is used to verify the contact details section.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_ContactDetailsSection_EditCompany_CompanyProfilePage_displayed()	{
		try {
			waitForElementToDisplay(lbl_CompanyProfilePage_EditProfilePage_ContactDetailsSection, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_CompanyProfilePage_EditProfilePage_ContactDetailsSection))
			{
				testStepPassed("Contact Details Section in Edit Company of Company Profile Page is displayed");	
			}	} 
		catch (Exception e) {
			testStepFailed("Contact Details  Section in Edit Company of Company Profile Page is displayed");
		}	}
	/**
	 *This method is used to verify the display of the description section.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_DescriptionSection_EditCompany_CompanyProfilePage_displayed()	{
		try {
			waitForElementToDisplay(lbl_CompanyProfilePage_EditProfilePage_DescriptionSection, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_CompanyProfilePage_EditProfilePage_DescriptionSection))
			{
				testStepPassed("Description Section in Edit Company of Company Profile Page is displayed");	
			}	} 
		catch (Exception e) 	{
			testStepFailed("Description  Section in Edit Company of Company Profile Page is displayed");
		}	}
	/**
	 *This method is used to verify the display of digital foot print section
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_DigitalFootprintSection_EditCompany_CompanyProfilePage_displayed(){
		try 		{
			waitForElementToDisplay(lbl_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection))
			{
				testStepPassed("Digital Footprint Section in Edit Company of Company Profile Page is displayed");	
			}		} 
		catch (Exception e) 		{
			testStepFailed("Digital Footprint  Section in Edit Company of Company Profile Page is displayed");
		}	}
	/**
	 *This method is used to verify the display of the finance and legal section
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_FinanceandLegalSection_EditCompany_CompanyProfilePage_displayed()	{
		try 	{
			waitForElementToDisplay(lbl_CompanyProfilePage_EditProfilePage_FinanceandLegalSection, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_CompanyProfilePage_EditProfilePage_FinanceandLegalSection))
			{
				testStepPassed("Finance & Legal Section in Edit Company of Company Profile Page is displayed");	
			}		} 
		catch (Exception e) {
			testStepFailed("Finance & Legal Section in Edit Company of Company Profile Page is displayed");
		}	}
	/**
	 *This method is used to verify the display of industry section.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_IndustrySection_EditCompany_CompanyProfilePage_displayed()	{
		try 	{
			waitForElementToDisplay(lbl_CompanyProfilePage_EditProfilePage_IndustrySection, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_CompanyProfilePage_EditProfilePage_IndustrySection))
			{
				testStepPassed("Industry Section in Edit Company of Company Profile Page is displayed");	
			}	} 
		catch (Exception e) {
			testStepFailed("Industry Section in Edit Company of Company Profile Page is displayed");
		}	}
	/**
	 *This method is used to verify the display of keywords section
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_KeywordsSection_EditCompany_CompanyProfilePage_displayed()	{
		try 	{
			waitForElementToDisplay(lbl_CompanyProfilePage_EditProfilePage_KeywordsSection, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_CompanyProfilePage_EditProfilePage_KeywordsSection))
			{
				testStepPassed("Keywords Section in Edit Company of Company Profile Page is displayed");	
			}	} 
		catch (Exception e)	{
			testStepFailed("Keywords Section in Edit Company of Company Profile Page is displayed");
		}	}
	/**
	 *This method is used to verify the display of region section. 
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_RegionsSection_EditCompany_CompanyProfilePage_displayed(){
		try {
			waitForElementToDisplay(lbl_CompanyProfilePage_EditProfilePage_RegionsSection, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_CompanyProfilePage_EditProfilePage_RegionsSection))
			{
				testStepPassed("Regions Section in Edit Company of Company Profile Page is displayed");	
			}	} 
		catch (Exception e) {
			testStepFailed("Regions Section in Edit Company of Company Profile Page is displayed");
		}	}
	/**
	 *This method is used to verify the display of marketing metrics section.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_MarketingMetricsSection_EditCompany_CompanyProfilePage_displayed()	{
		try {
			waitForElementToDisplay(lbl_CompanyProfilePage_EditProfilePage_MarketingMetricsSection, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_CompanyProfilePage_EditProfilePage_MarketingMetricsSection))	{
				testStepPassed("Marketing Metrics Section in Edit Company of Company Profile Page is displayed");	
			}		} 
		catch (Exception e) {
			testStepFailed("Marketing Metrics Section in Edit Company of Company Profile Page is displayed");
		}	}
	/**
	 *This method is used to verify the display of the community settings section.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_CommunitySettingsSection_EditCompany_CompanyProfilePage_displayed()	{
		try {
			waitForElementToDisplay(lbl_CompanyProfilePage_EditProfilePage_CommunitySettingsSection, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_CompanyProfilePage_EditProfilePage_CommunitySettingsSection))
			{
				testStepPassed("Community Settings Section in Edit Company of Company Profile Page is displayed");	
			}	} 
		catch (Exception e) {
			testStepFailed("Community Settings Section in Edit Company of Company Profile Page is displayed");
		}	}
	/**
	 *This method is used to verify the display company section.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_CompanySection_EditCompany_CompanyProfilePage_Labels_displayed()	{
		String companyLabelnameslst = "Legal Name,Friendly Name,Incorporation date,Jurisdiction,Governing Body,Registration Number";

		String[] companyLabelnames = companyLabelnameslst.split(",");
		int count = companyLabelnames.length;
		for (int i = 0; i < count; i++) 		{
			String name = companyLabelnames[i];
			try 			{
				if (driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'company')]//*[text()='"+name+"']")).isDisplayed()) 
				{
					testStepPassed(name+" label is displayed correctly in Company Section of Edit Profile Page");
				}	} 
			catch (Exception e) 	{
				testStepFailed(name+" label is not displayed correctly in Company Section of Edit Profile Page");
			}	}	}
	/**
	 *This method is used to verify the display of contact section.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_ContactSection_EditCompany_CompanyProfilePage_Labels_displayed()	{
		String companyLabelnameslst = "Main Contact,Address,Unit/Suite,City,Postal code,State,Country,Latitude,Longitude,Company Email,Phone";

		String[] companyLabelnames = companyLabelnameslst.split(",");
		int count = companyLabelnames.length;
		for (int i = 0; i < count; i++) 	{
			String name = companyLabelnames[i];
			try 	{
				if (driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='"+name+"']")).isDisplayed()) 
				{
					testStepPassed(name+" label is displayed correctly in Contact Section of Edit Profile Page");
				}	} 
			catch (Exception e) {
				testStepFailed(name+" label is not displayed correctly in Contact Section of Edit Profile Page");
			}	}	}
	/**
	 *This method is used to display of the digital foot print section. 
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_DigitalFootPrintSection_EditCompany_CompanyProfilePage_Labels_displayed()	{
		String companyLabelnameslst = "Crunchbase,Facebook,Instagram,Angellist,Medium,LinkedIn,Pinterest,RSS Feed,Twitter,Vimeo,Website,YouTube";

		String[] companyLabelnames = companyLabelnameslst.split(",");
		int count = companyLabelnames.length;
		for (int i = 0; i < count; i++) 	{
			String name = companyLabelnames[i];
			try 	{
				if (driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='"+name+"']")).isDisplayed()) 
				{
					testStepPassed(name+" label is displayed correctly in Digital Foot Print Section of Edit Profile Page");
				}	} 
			catch (Exception e) {
				testStepFailed(name+" label is not displayed correctly in Digital Foot Print Section of Edit Profile Page");
			}	}}
	/**
	 *This method is used to verify display of labels in finance legal section.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_FinanceandLegalSection_EditCompany_CompanyProfilePage_Labels_displayed()	{
		String companyLabelnameslst = "Auditor,Bank,Bank ABA Number,Bank Account Name,Bank Account Number,Bank Address,Bank Intermediary,Intermediary Bank ABA Number,Intermediary Bank Address,Intermediary Bank SWIFT BIC,Bank Swift Code,Bank IBAN Code,Bank Instructions,Company Secretary,Currency,Financial Year End,Law Firm";

		String[] companyLabelnames = companyLabelnameslst.split(",");
		int count = companyLabelnames.length;
		for (int i = 0; i < count; i++) 	{
			String name = companyLabelnames[i];
			try 	{
				if (driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='"+name+"']")).isDisplayed()) 
				{
					testStepPassed(name+" label is displayed correctly in Finance and Legal Section of Edit Profile Page");
				}			} 
			catch (Exception e) 	{
				testStepFailed(name+" label is not displayed correctly in Finance and Legal Section of Edit Profile Page");
			}	}}
	/**
	 *This method is used to display label of marketing section.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_MarketingMetricsSection_EditCompany_CompanyProfilePage_Labels_displayed()	{
		String companyLabelnameslst = "Alexa Ranking,Competitors,Competitor Rankings,Domains Linking In,Facebook Likes,Linkedin Employees,Linkedin Followers,MOZ Domain Authority,Organic Traffic,Transco Ranking,Twitter Followers";

		String[] companyLabelnames = companyLabelnameslst.split(",");
		int count = companyLabelnames.length;
		for (int i = 0; i < count; i++) 	{
			String name = companyLabelnames[i];
			try 	{
				if (driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='"+name+"']")).isDisplayed()) 
				{
					testStepPassed(name+" label is displayed correctly in Marketing Metrics Section of Edit Profile Page");
				}		} 
			catch (Exception e) 	{
				testStepFailed(name+" label is not displayed correctly in Marketing Metrics Section of Edit Profile Page");
			}	}	}
	/**
	 *This method is used to verify the label of the community settings section.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_CommunitySettingsSection_EditCompany_CompanyProfilePage_Labels_displayed(){
		String companyLabelnameslst = "Account Status,Account Type,Business Type,Dealflow Status,Health / Portfolio Status,Placement Agent,Main Contact,Relationship Manager,Score Visibility";

		String[] companyLabelnames = companyLabelnameslst.split(",");
		int count = companyLabelnames.length;
		for (int i = 0; i < count; i++) 	{
			String name = companyLabelnames[i];
			try 	{
				if (driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'syndicate_settings')]//*[contains(text(),'"+name+"')]")).isDisplayed()) 
				{
					testStepPassed(name+" label is displayed correctly in Community Settings Section of Edit Profile Page");
				}		} 
			catch (Exception e) {
				testStepFailed(name+" label is not displayed correctly in Community Settings Section of Edit Profile Page");
			}	}}

	/**
	 *This method is used to display the  Company Profile page elements
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_CompanySection_EditCompany_CompanyProfilePage_Elements_displayed(){
		try {
			waitForElementToDisplay(rdb_EP_CompanySection_LegalName_HatcherOption, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_EP_CompanySection_LegalName_HatcherOption)) 
			{
				testStepPassed("Legal Name Hacther Option Radiobutton is displayed in Company Section of Edit Profile Page");
			}		}
		catch (Exception e) {		
			testStepFailed("Legal Name Hacther Option Radiobutton is not displayed in Company Section of Edit Profile Page");
		}

		try 	{
			waitForElementToDisplay(txt_EP_CompanySection_LegalName_HatcherOption, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_EP_CompanySection_LegalName_HatcherOption)) 
			{
				testStepPassed("Legal Name Hacther Option Textbox is displayed in Company Section of Edit Profile Page");
			}		}
		catch (Exception e) 	{
			testStepFailed("Legal Name Hacther Option Textbox is not displayed in Company Section of Edit Profile Page");
		}

		try {
			waitForElementToDisplay(rdb_EP_CompanySection_LegalName_ClearbitOption, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_EP_CompanySection_LegalName_ClearbitOption)) 
			{
				testStepPassed("Legal Name Clearbit Option Hacther Radiobutton is displayed in Company Section of Edit Profile Page");
			}		}
		catch (Exception e) {
			testStepFailed("Legal Name Clearbit Option Radiobutton is not displayed in Company Section of Edit Profile Page");
		}

		try {
			waitForElementToDisplay(txt_EP_CompanySection_LegalName_ClearbitOption, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_EP_CompanySection_LegalName_ClearbitOption)) 
			{
				testStepPassed("Legal Name Clearbit Option Textbox is displayed in Company Section of Edit Profile Page");
			}		}
		catch (Exception e)	{
			testStepFailed("Legal Name Clearbit Option Textbox is not displayed in Company Section of Edit Profile Page");
		}

		try 	{
			waitForElementToDisplay(rdb_EP_CompanySection_FriendlyName_HatcherOption, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_EP_CompanySection_FriendlyName_HatcherOption)) 
			{
				testStepPassed("Friendly Name Hacther Option Radiobutton is displayed in Company Section of Edit Profile Page");
			}		}
		catch (Exception e) 	{
			testStepFailed("Friendly Name Hacther Option Radiobutton is not displayed in Company Section of Edit Profile Page");
		}

		try {
			waitForElementToDisplay(txt_EP_CompanySection_FriendlyName_HatcherOption, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_EP_CompanySection_FriendlyName_HatcherOption)) 
			{
				testStepPassed("Friendly Name Hacther Option Textbox is displayed in Company Section of Edit Profile Page");
			}		}
		catch (Exception e) {		
			testStepFailed("Friendly Name Hacther Option Textbox is not displayed in Company Section of Edit Profile Page");
		}


		try 
		{
			waitForElementToDisplay(rdb_EP_CompanySection_FriendlyName_ClearbitOption, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_EP_CompanySection_FriendlyName_ClearbitOption)) 
			{
				testStepPassed("Friendly Name Clearbit Option Radiobutton is displayed in Company Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Friendly Name Clearbit Option Radiobutton is not displayed in Company Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(txt_EP_CompanySection_FriendlyName_ClearbitOption, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_EP_CompanySection_FriendlyName_ClearbitOption)) 
			{
				testStepPassed("Friendly Name Clearbit Textbox is displayed in Company Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Friendly Name Clearbit Textbox is not displayed in Company Section of Edit Profile Page");
		}


		try 
		{
			waitForElementToDisplay(rdb_EP_CompanySection_FriendlyName_LinkedInOption, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_EP_CompanySection_FriendlyName_LinkedInOption)) 
			{
				testStepPassed("Friendly Name LinkedIn Option Radiobutton is displayed in Company Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Friendly Name LinkedIn Option Radiobutton is not displayed in Company Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(txt_EP_CompanySection_FriendlyName_LinkedInOption, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_EP_CompanySection_FriendlyName_LinkedInOption)) 
			{
				testStepPassed("Friendly Name LinkedIn Option Textbox is displayed in Company Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Friendly Name LinkedIn Option Textbox is not displayed in Company Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(rdb_EP_CompanySection_IncorporationDate_HatcherOption, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_EP_CompanySection_IncorporationDate_HatcherOption)) 
			{
				testStepPassed("Incorporation Date Hacther OptionRadiobutton is displayed in Company Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Incorporation Date Hacther Option Radiobutton is not displayed in Company Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(txt_EP_CompanySection_IncorporationDate_HatcherOption, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_EP_CompanySection_IncorporationDate_HatcherOption)) 
			{
				testStepPassed("Incorporation Date Hacther Option Textbox is displayed in Company Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Incorporation Date Hacther Option Textbox is not displayed in Company Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(rdb_EP_CompanySection_IncorporationDate_ClearbitOption, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_EP_CompanySection_IncorporationDate_ClearbitOption)) 
			{
				testStepPassed("Incorporation Date Clearbit Option Radiobutton is displayed in Company Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Incorporation Date Clearbit Option Radiobutton is not displayed in Company Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(txt_EP_CompanySection_IncorporationDate_ClearbitOption, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_EP_CompanySection_IncorporationDate_ClearbitOption)) 
			{
				testStepPassed("Incorporation Date Clearbit Option Textbox is displayed in Company Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Incorporation Date Clearbit Option Textbox is not displayed in Company Section of Edit Profile Page");
		}


		try 
		{
			waitForElementToDisplay(rdb_EP_CompanySection_Jurisdiction_HatcherOption, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_EP_CompanySection_Jurisdiction_HatcherOption)) 
			{
				testStepPassed("Jurisdiction Hacther Option Radiobutton is displayed in Company Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Jurisdiction Hacther Option Radiobutton is not displayed in Company Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(drp_EP_CompanySection_Jurisdiction_HatcherOption, this.elementLoadWaitTime);
			if (isElementDisplayed(drp_EP_CompanySection_Jurisdiction_HatcherOption)) 
			{
				testStepPassed("Jurisdiction Hacther Option Textbox is displayed in Company Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Jurisdiction Hacther Option Textbox is not displayed in Company Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(rdb_EP_CompanySection_Jurisdiction_LinkedInOption, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_EP_CompanySection_Jurisdiction_LinkedInOption)) 
			{
				testStepPassed("Jurisdiction LinkedIn Option Radiobutton is displayed in Company Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Jurisdiction LinkedIn Option Radiobutton is not displayed in Company Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(drp_EP_CompanySection_Jurisdiction_LinkedInOption, this.elementLoadWaitTime);
			if (isElementDisplayed(drp_EP_CompanySection_Jurisdiction_LinkedInOption)) 
			{
				testStepPassed("Jurisdiction LinkedIn Option Dropdown is displayed in Company Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Jurisdiction LinkedIn Option Dropdown is not displayed in Company Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(rdb_EP_CompanySection_GoverningBody_HatcherOption, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_EP_CompanySection_GoverningBody_HatcherOption)) 
			{
				testStepPassed("Governing Body Hacther Option Radiobutton is displayed in Company Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Governing Body vRadiobutton is not displayed in Company Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(drp_EP_CompanySection_GoverningBody_HatcherOption, this.elementLoadWaitTime);
			if (isElementDisplayed(drp_EP_CompanySection_GoverningBody_HatcherOption)) 
			{
				testStepPassed("Governing Body Hacther Option Textbox is displayed in Company Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Governing Body Hacther Option Textbox is not displayed in Company Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(rdb_EP_CompanySection_RegistrationNumber_HatcherOption, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_EP_CompanySection_RegistrationNumber_HatcherOption)) 
			{
				testStepPassed("Registration Number Hacther Option Radiobutton is displayed in Company Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Registration Number Hacther Option Radiobutton is not displayed in Company Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(txt_EP_CompanySection_RegistrationNumber_HatcherOption, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_EP_CompanySection_RegistrationNumber_HatcherOption)) 
			{
				testStepPassed("Registration Number Hacther Option Textbox is displayed in Company Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Registration Number Hacther Option Textbox is not displayed in Company Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(btn_EP_CompanySection_SaveChanges, this.elementLoadWaitTime);
			if (isElementDisplayed(btn_EP_CompanySection_SaveChanges)) 
			{
				testStepPassed("Save Chnages Button is displayed in Company Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Save Chnages Button is not displayed in Company Section of Edit Profile Page");
		}
	}
	/**
	 *This method is used to verify the display of the company former section elements.
	 *
	 *@author VijayaKumar.U
	 */

	public void verify_CompanyFormerSection_EditCompany_CompanyProfilePage_Elements_displayed()
	{
		try 
		{
			waitForElementToDisplay(tbl_EP_CompanyFormerNamesSection_Table, this.elementLoadWaitTime);
			if (isElementDisplayed(tbl_EP_CompanyFormerNamesSection_Table)) 
			{
				testStepPassed("Company Former Names Table is displayed in Company Former Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Company Former Names Table is not displayed in Company Former Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(txt_EP_CompanyFormerNamesSection_FormerName, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_EP_CompanyFormerNamesSection_FormerName)) 
			{
				testStepPassed("Company Formaer Name textbox in Company Former Names Table is displayed in Company Former Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Company Formaer Name textbox in Company Former Names Table is not displayed in Company Former Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(btn_EP_CompanyFormerNamesSection_SaveChanges, this.elementLoadWaitTime);
			if (isElementDisplayed(btn_EP_CompanyFormerNamesSection_SaveChanges)) 
			{
				testStepPassed("Save Chnages Button is displayed in Company Former Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Save Chnages Button is not displayed in Company Former Section of Edit Profile Page");
		}
	}
	/**
	 *This method is used to verify display of elements in contact details.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_ContactDetailsSection_EditCompany_CompanyProfilePage_Elements_displayed()
	{
		try 
		{
			waitForElementToDisplay(rdb_EP_ContactDetailsSection_MainContact_HatcherOption, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_EP_ContactDetailsSection_MainContact_HatcherOption)) 
			{
				testStepPassed("Main Contact Hacther Option Radiobutton is displayed in Contact Details Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Main Contact Hacther Option Radiobutton is not displayed in Contact Details Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(drp_EP_ContactDetailsSection_MainContact_HatcherOption, this.elementLoadWaitTime);
			if (isElementDisplayed(drp_EP_ContactDetailsSection_MainContact_HatcherOption)) 
			{
				testStepPassed("Main Contact Hacther Option Dropdown is displayed in Contact Details Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Main Contact Hacther Option Dropdown is not displayed in Contact Details Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(rdb_EP_ContactDetailsSection_Address_HatcherOption, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_EP_ContactDetailsSection_Address_HatcherOption)) 
			{
				testStepPassed("Address Hacther Option Radiobutton is displayed in Contact Details Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Address Hacther Option Radiobutton is not displayed in Contact Details Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(txt_EP_ContactDetailsSection_Address_HatcherOption, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_EP_ContactDetailsSection_Address_HatcherOption)) 
			{
				testStepPassed("Address Hacther Option Textbox is displayed in Contact Details Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Address Hacther Option Textbox is not displayed in Contact Details Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(rdb_EP_ContactDetailsSection_Address_ClearbitOption, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_EP_ContactDetailsSection_Address_ClearbitOption)) 
			{
				testStepPassed("Address Clearbit Option Radiobutton is displayed in Contact Details Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Address Clearbit Option Radiobutton is not displayed in Contact Details Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(txt_EP_ContactDetailsSection_Address_ClearbitOption, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_EP_ContactDetailsSection_Address_ClearbitOption)) 
			{
				testStepPassed("Address Clearbit Option Textbox is displayed in Contact Details Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Address Clearbit Option Textbox is not displayed in Contact Details Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(rdb_EP_ContactDetailsSection_Address_LinkedInOption, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_EP_ContactDetailsSection_Address_LinkedInOption)) 
			{
				testStepPassed("Address LinkedIn Option Radiobutton is displayed in Contact Details Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Address LinkedIn Option Radiobutton is not displayed in Contact Details Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(txt_EP_ContactDetailsSection_Address_LinkedInOption, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_EP_ContactDetailsSection_Address_LinkedInOption)) 
			{
				testStepPassed("Address LinkedIn Option Textbox is displayed in Contact Details Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Address LinkedIn Option Textbox is not displayed in Contact Details Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(rdb_EP_ContactDetailsSection_UnitSuite_HatcherOption, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_EP_ContactDetailsSection_UnitSuite_HatcherOption)) 
			{
				testStepPassed("Unite/Suite Hacther Option Radiobutton is displayed in Contact Details Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Unite/Suite Hacther Option Radiobutton is not displayed in Contact Details Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(txt_EP_ContactDetailsSection_UnitSuite_HatcherOption, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_EP_ContactDetailsSection_UnitSuite_HatcherOption)) 
			{
				testStepPassed("Unite/Suite Hacther Option Textbox is displayed in Contact Details Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Unite/Suite Hacther Option Textbox is not displayed in Contact Details Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(rdb_EP_ContactDetailsSection_UnitSuite_ClearbitOption, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_EP_ContactDetailsSection_UnitSuite_ClearbitOption)) 
			{
				testStepPassed("Unite/Suite Clearbit Option Radiobutton is displayed in Contact Details Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Unite/Suite Clearbit Option Radiobutton is not displayed in Contact Details Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(txt_EP_ContactDetailsSection_UnitSuite_ClearbitOption, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_EP_ContactDetailsSection_UnitSuite_ClearbitOption)) 
			{
				testStepPassed("Unite/Suite Clearbit Option Textbox is displayed in Contact Details Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Unite/Suite Clearbit Option Textbox is not displayed in Contact Details Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(rdb_EP_ContactDetailsSection_City_HatcherOption, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_EP_ContactDetailsSection_City_HatcherOption)) 
			{
				testStepPassed("City Hacther Option Radiobutton is displayed in Contact Details Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("City Hacther Option Radiobutton is not displayed in Contact Details Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(txt_EP_ContactDetailsSection_City_HatcherOption, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_EP_ContactDetailsSection_City_HatcherOption)) 
			{
				testStepPassed("City Hacther Option Textbox is displayed in Contact Details Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("City Hacther Option Textbox is not displayed in Contact Details Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(rdb_EP_ContactDetailsSection_City_ClearbitOption, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_EP_ContactDetailsSection_City_ClearbitOption)) 
			{
				testStepPassed("City Clearbit Option Radiobutton is displayed in Contact Details Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("City Clearbit Option Radiobutton is not displayed in Contact Details Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(txt_EP_ContactDetailsSection_City_ClearbitOption, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_EP_ContactDetailsSection_City_ClearbitOption)) 
			{
				testStepPassed("City Clearbit Option Textbox is displayed in Contact Details Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("City Clearbit Option Textbox is not displayed in Contact Details Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(rdb_EP_ContactDetailsSection_City_LinkedInOption, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_EP_ContactDetailsSection_City_LinkedInOption)) 
			{
				testStepPassed("City LinkedIn Option Radiobutton is displayed in Contact Details Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("City LinkedIn Option Radiobutton is not displayed in Contact Details Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(txt_EP_ContactDetailsSection_City_LinkedInOption, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_EP_ContactDetailsSection_City_LinkedInOption)) 
			{
				testStepPassed("City LinkedIn Option Textbox is displayed in Contact Details Section of Edit Profile Page");
			}
		}
		catch (Exception e) 		{
			testStepFailed("City LinkedIn Option Textbox is not displayed in Contact Details Section of Edit Profile Page");
		}

		try 		{
			waitForElementToDisplay(rdb_EP_ContactDetailsSection_PostalCode_HatcherOption, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_EP_ContactDetailsSection_PostalCode_HatcherOption)) 
			{
				testStepPassed("Postal Code Hacther Option Radiobutton is displayed in Contact Details Section of Edit Profile Page");
			}		}	
		catch (Exception e) 		{
			testStepFailed("Postal Code Hacther Option Radiobutton is not displayed in Contact Details Section of Edit Profile Page");
		}

		try 		{
			waitForElementToDisplay(txt_EP_ContactDetailsSection_PostalCode_HatcherOption, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_EP_ContactDetailsSection_PostalCode_HatcherOption)) 
			{
				testStepPassed("Postal Code Hacther Option Textbox is displayed in Contact Details Section of Edit Profile Page");
			}		}
		catch (Exception e) 		{
			testStepFailed("Postal Code Hacther Option Textbox is not displayed in Contact Details Section of Edit Profile Page");
		}

		try 		{
			waitForElementToDisplay(rdb_EP_ContactDetailsSection_PostalCode_ClearbitOption, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_EP_ContactDetailsSection_PostalCode_ClearbitOption)) 
			{
				testStepPassed("Postal Code Clearbit Option Radiobutton is displayed in Contact Details Section of Edit Profile Page");
			}		}
		catch (Exception e) 		{
			testStepFailed("Postal Code Clearbit Option Radiobutton is not displayed in Contact Details Section of Edit Profile Page");
		}

		try 		{
			waitForElementToDisplay(txt_EP_ContactDetailsSection_PostalCode_ClearbitOption, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_EP_ContactDetailsSection_PostalCode_ClearbitOption)) 
			{
				testStepPassed("Postal Code Clearbit Option Textbox is displayed in Contact Details Section of Edit Profile Page");
			}		}
		catch (Exception e) 		{
			testStepFailed("Postal Code Clearbit Option Textbox is not displayed in Contact Details Section of Edit Profile Page");
		}

		try 		{
			waitForElementToDisplay(rdb_EP_ContactDetailsSection_PostalCode_LinkedInOption, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_EP_ContactDetailsSection_PostalCode_LinkedInOption)) 
			{
				testStepPassed("Postal Code LinkedIn Option Radiobutton is displayed in Contact Details Section of Edit Profile Page");
			}		}
		catch (Exception e) 		{
			testStepFailed("Postal Code LinkedIn Option Radiobutton is not displayed in Contact Details Section of Edit Profile Page");
		}

		try 		{
			waitForElementToDisplay(txt_EP_ContactDetailsSection_PostalCode_LinkedInOption, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_EP_ContactDetailsSection_PostalCode_LinkedInOption)) 
			{
				testStepPassed("Postal Code LinkedIn Option Textbox is displayed in Contact Details Section of Edit Profile Page");
			}		}
		catch (Exception e) 		{
			testStepFailed("Postal Code LinkedIn Option Textbox is not displayed in Contact Details Section of Edit Profile Page");
		}

		try 		{
			waitForElementToDisplay(rdb_EP_ContactDetailsSection_State_HatcherOption, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_EP_ContactDetailsSection_State_HatcherOption)) 
			{
				testStepPassed("State Hacther Option Radiobutton is displayed in Contact Details Section of Edit Profile Page");
			}		}
		catch (Exception e) 		{
			testStepFailed("State Hacther Option Radiobutton is not displayed in Contact Details Section of Edit Profile Page");
		}

		try {
			waitForElementToDisplay(txt_EP_ContactDetailsSection_State_HatcherOption, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_EP_ContactDetailsSection_State_HatcherOption)) 
			{
				testStepPassed("State Hacther Option Textbox is displayed in Contact Details Section of Edit Profile Page");
			}		}
		catch (Exception e) 		{
			testStepFailed("State Hacther Option Textbox is not displayed in Contact Details Section of Edit Profile Page");
		}

		try 		{
			waitForElementToDisplay(rdb_EP_ContactDetailsSection_State_ClearbitOption, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_EP_ContactDetailsSection_State_ClearbitOption)) 
			{
				testStepPassed("State Clearbit Option Radiobutton is displayed in Contact Details Section of Edit Profile Page");
			}		}
		catch (Exception e)		{
			testStepFailed("State Clearbit Option Radiobutton is not displayed in Contact Details Section of Edit Profile Page");
		}

		try 		{
			waitForElementToDisplay(txt_EP_ContactDetailsSection_State_ClearbitOption, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_EP_ContactDetailsSection_State_ClearbitOption)) 
			{
				testStepPassed("State Clearbit Option Textbox is displayed in Contact Details Section of Edit Profile Page");
			}		}
		catch (Exception e) 		{
			testStepFailed("State Clearbit Option Textbox is not displayed in Contact Details Section of Edit Profile Page");
		}

		try 	{
			waitForElementToDisplay(rdb_EP_ContactDetailsSection_Country_HatcherOption, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_EP_ContactDetailsSection_Country_HatcherOption)) 
			{
				testStepPassed("Country Hacther Option Radiobutton is displayed in Contact Details Section of Edit Profile Page");
			}		}
		catch (Exception e) 		{
			testStepFailed("Country Hacther Option Radiobutton is not displayed in Contact Details Section of Edit Profile Page");
		}

		try 		{
			waitForElementToDisplay(drp_EP_ContactDetailsSection_Country_HatcherOption, this.elementLoadWaitTime);
			if (isElementDisplayed(drp_EP_ContactDetailsSection_Country_HatcherOption)) 
			{
				testStepPassed("Country Hacther Option Dropdown is displayed in Contact Details Section of Edit Profile Page");
			}		}
		catch (Exception e) 		{
			testStepFailed("Country Hacther Option Dropdown is not displayed in Contact Details Section of Edit Profile Page");
		}

		try 		{
			waitForElementToDisplay(rdb_EP_ContactDetailsSection_Country_ClearbitOption, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_EP_ContactDetailsSection_Country_ClearbitOption)) 
			{
				testStepPassed("Country Clearbit Option Radiobutton is displayed in Contact Details Section of Edit Profile Page");
			}		}
		catch (Exception e) 		{
			testStepFailed("Country Clearbit Option Radiobutton is not displayed in Contact Details Section of Edit Profile Page");
		}

		try 		{
			waitForElementToDisplay(drp_EP_ContactDetailsSection_Country_ClearbitOption, this.elementLoadWaitTime);
			if (isElementDisplayed(drp_EP_ContactDetailsSection_Country_ClearbitOption)) 
			{
				testStepPassed("Country Clearbit Option Dropdown is displayed in Contact Details Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Country Clearbit Option Dropdown is not displayed in Contact Details Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(rdb_EP_ContactDetailsSection_Country_LinkedInOption, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_EP_ContactDetailsSection_Country_LinkedInOption)) 
			{
				testStepPassed("Country LinkedIn Option Radiobutton is displayed in Contact Details Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Country LinkedIn Option Radiobutton is not displayed in Contact Details Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(drp_EP_ContactDetailsSection_Country_LinkedInOption, this.elementLoadWaitTime);
			if (isElementDisplayed(drp_EP_ContactDetailsSection_Country_LinkedInOption)) 
			{
				testStepPassed("Country LinkedIn Option Dropdown is displayed in Contact Details Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Country LinkedIn Option Dropdown is not displayed in Contact Details Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(rdb_EP_ContactDetailsSection_Latitude_HatcherOption, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_EP_ContactDetailsSection_Latitude_HatcherOption)) 
			{
				testStepPassed("Latitude Hacther Option Radiobutton is displayed in Contact Details Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Latitude Hacther Option Radiobutton is not displayed in Contact Details Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(txt_EP_ContactDetailsSection_Latitude_HatcherOption, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_EP_ContactDetailsSection_Latitude_HatcherOption)) 
			{
				testStepPassed("Latitude Hacther Option Textbox is displayed in Contact Details Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Latitude Hacther Option Textbox is not displayed in Contact Details Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(rdb_EP_ContactDetailsSection_Latitude_ClearbitOption, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_EP_ContactDetailsSection_Latitude_ClearbitOption)) 
			{
				testStepPassed("Latitude Clearbit Option Radiobutton is displayed in Contact Details Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Latitude Clearbit Option Radiobutton is not displayed in Contact Details Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(txt_EP_ContactDetailsSection_Latitude_ClearbitOption, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_EP_ContactDetailsSection_Latitude_ClearbitOption)) 
			{
				testStepPassed("Latitude Clearbit Option Textbox is displayed in Contact Details Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Latitude Clearbit Option Textbox is not displayed in Contact Details Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(rdb_EP_ContactDetailsSection_Longitude_HatcherOption, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_EP_ContactDetailsSection_Longitude_HatcherOption)) 
			{
				testStepPassed("Longitude Hacther Option Radiobutton is displayed in Contact Details Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Longitude Hacther Option Radiobutton is not displayed in Contact Details Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(txt_EP_ContactDetailsSection_Longitude_HatcherOption, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_EP_ContactDetailsSection_Longitude_HatcherOption)) 
			{
				testStepPassed("Longitude Hacther Option Textbox is displayed in Contact Details Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Longitude Hacther Option Textbox is not displayed in Contact Details Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(rdb_CompanyProfilePage_EditProfilePage_ContactDetailsSection_Longitude_ClearbitOption_RadioButton, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_CompanyProfilePage_EditProfilePage_ContactDetailsSection_Longitude_ClearbitOption_RadioButton)) 
			{
				testStepPassed("Longitude Clearbit Option Radiobutton is displayed in Contact Details Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Longitude Clearbit Option Radiobutton is not displayed in Contact Details Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_ContactDetailsSection_Longitude_ClearbitOption_Textbox, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_CompanyProfilePage_EditProfilePage_ContactDetailsSection_Longitude_ClearbitOption_Textbox)) 
			{
				testStepPassed("Longitude Clearbit Option Textbox is displayed in Contact Details Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Longitude Clearbit Option Textbox is not displayed in Contact Details Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(rdb_CompanyProfilePage_EditProfilePage_ContactDetailsSection_CompanyEmail_HatcherOption_RadioButton, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_CompanyProfilePage_EditProfilePage_ContactDetailsSection_CompanyEmail_HatcherOption_RadioButton)) 
			{
				testStepPassed("Company Email Hacther Option Radiobutton is displayed in Contact Details Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Company Email Hacther Option Radiobutton is not displayed in Contact Details Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(txt_EditProfilePage_ContactDetailsSection_CompanyEmail_HatcherOption, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_EditProfilePage_ContactDetailsSection_CompanyEmail_HatcherOption)) 
			{
				testStepPassed("Company Email Hacther Option Textbox is displayed in Contact Details Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Company Email Hacther Option Textbox is not displayed in Contact Details Section of Edit Profile Page"+e.getClass());
		}

		try 
		{
			waitForElementToDisplay(rdb_EditProfilePage_ContactDetailsSection_Phone_HatcherOption, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_EditProfilePage_ContactDetailsSection_Phone_HatcherOption)) 
			{
				testStepPassed("Phone Hacther Radiobutton is displayed in Contact Details Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Phone Hacther Radiobutton is not displayed in Contact Details Section of Edit Profile Page"+e.getClass());
		}

		try 
		{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_ContactDetailsSection_Phone_HatcherOption_Textbox, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_CompanyProfilePage_EditProfilePage_ContactDetailsSection_Phone_HatcherOption_Textbox)) 
			{
				testStepPassed("Phone Textbox is displayed in Contact Details Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Phone Textbox is not displayed in Contact Details Section of Edit Profile Page"+e.getClass());
		}

		try 
		{
			waitForElementToDisplay(btn_CompanyProfilePage_EditProfilePage_ContactDetailsSection_SaveChanges, this.elementLoadWaitTime);
			if (isElementDisplayed(btn_CompanyProfilePage_EditProfilePage_ContactDetailsSection_SaveChanges)) 
			{
				testStepPassed("Save Changes Button is displayed in Contact Details Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Save Changes Button is not displayed in Contact Details Section of Edit Profile Page"+e.getClass());
		}
	}
	/**
	 *This method is used to verify the display of the elements in description section.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_DescriptionSection_EditCompany_CompanyProfilePage_Elements_displayed()
	{
		try 
		{
			waitForElementToDisplay(rdb_CompanyProfilePage_EditProfilePage_DescriptionSection_Description_HatcherOption_RadioButton, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_CompanyProfilePage_EditProfilePage_DescriptionSection_Description_HatcherOption_RadioButton)) 
			{
				testStepPassed("Description Hacther Option Radiobutton is displayed in Description Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Description Hacther Option Radiobutton is not displayed in Description Section of Edit Profile Page"+e.getClass());
		}

		try 
		{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_DescriptionSection_Description_HatcherOption_Textbox, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_CompanyProfilePage_EditProfilePage_DescriptionSection_Description_HatcherOption_Textbox)) 
			{
				testStepPassed("Description Hacther Option Textbox is displayed in Description Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Description Hacther Option Textbox is not displayed in Description Section of Edit Profile Page"+e.getClass());
		}

		try 
		{
			waitForElementToDisplay(rdb_CompanyProfilePage_EditProfilePage_DescriptionSection_Description_ClearbitOption_RadioButton, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_CompanyProfilePage_EditProfilePage_DescriptionSection_Description_ClearbitOption_RadioButton)) 
			{
				testStepPassed("Description Clearbit Option Radiobutton is displayed in Description Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Description Clearbit Option Radiobutton is not displayed in Description Section of Edit Profile Page"+e.getClass());
		}

		try 
		{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_DescriptionSection_Description_ClearbitOption_Textbox, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_CompanyProfilePage_EditProfilePage_DescriptionSection_Description_ClearbitOption_Textbox)) 
			{
				testStepPassed("Description Clearbit Option Textbox is displayed in Description Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Description Clearbit Option Textbox is not displayed in Description Section of Edit Profile Page"+e.getClass());
		}

		try 
		{
			waitForElementToDisplay(rdb_CompanyProfilePage_EditProfilePage_DescriptionSection_Description_TwitterOption_RadioButton, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_CompanyProfilePage_EditProfilePage_DescriptionSection_Description_TwitterOption_RadioButton)) 
			{
				testStepPassed("Description Twitter Option Radiobutton is displayed in Description Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Description Twitter Option Radiobutton is not displayed in Description Section of Edit Profile Page"+e.getClass());
		}

		try 
		{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_DescriptionSection_Description_TwitterOption_Textbox, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_CompanyProfilePage_EditProfilePage_DescriptionSection_Description_TwitterOption_Textbox)) 
			{
				testStepPassed("Description Twitter Option Textbox is displayed in Description Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Description Twitter Option Textbox is not displayed in Description Section of Edit Profile Page"+e.getClass());
		}
		try 
		{
			waitForElementToDisplay(rdb_CompanyProfilePage_EditProfilePage_DescriptionSection_Description_LinkedInOption_RadioButton, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_CompanyProfilePage_EditProfilePage_DescriptionSection_Description_LinkedInOption_RadioButton)) 
			{
				testStepPassed("Description LinkedIn Option Radiobutton is displayed in Description Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Description LinkedIn Option Radiobutton is not displayed in Description Section of Edit Profile Page"+e.getClass());
		}

		try 
		{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_DescriptionSection_Description_LinkedInOption_Textbox, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_CompanyProfilePage_EditProfilePage_DescriptionSection_Description_LinkedInOption_Textbox)) 
			{
				testStepPassed("Description LinkedIn Option Textbox is displayed in Description Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Description LinkedIn Option Textbox is not displayed in Description Section of Edit Profile Page"+e.getClass());
		}

		try 
		{
			waitForElementToDisplay(btn_CompanyProfilePage_EditProfilePage_DescriptionSection_SaveChanges, this.elementLoadWaitTime);
			if (isElementDisplayed(btn_CompanyProfilePage_EditProfilePage_DescriptionSection_SaveChanges)) 
			{
				testStepPassed("Save Changes Button is displayed in Description Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Save Changes Button is not displayed in Description Section of Edit Profile Page."+e.getClass());
		}
	}

	/**
	 *This method is used to verify the elements in digital foot print section.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_DigitalFootPrintSection_EditCompany_CompanyProfilePage_Elements_displayed()
	{
		try 
		{
			waitForElementToDisplay(rdb_EP_DigitalFootPrintSection_Crunchbase_HatcherOption, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_EP_DigitalFootPrintSection_Crunchbase_HatcherOption)) 
			{
				testStepPassed("Crunchbase Hacther Option Radiobutton is displayed in Digital Foot Print Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Crunchbase Hacther Option Radiobutton is not displayed in Digital Foot Print Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(txt_EP_DigitalFootPrintSection_Crunchbase_HatcherOption, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_EP_DigitalFootPrintSection_Crunchbase_HatcherOption)) 
			{
				testStepPassed("Crunchbase Hacther Option Textbox is displayed in Digital Foot Print Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Crunchbase Hacther Option Textbox is not displayed in Digital Foot Print Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(rdb_EP_DigitalFootPrintSection_Crunchbase_ClearbitOption, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_EP_DigitalFootPrintSection_Crunchbase_ClearbitOption)) 
			{
				testStepPassed("Crunchbase Clearbit Option Radiobutton is displayed in Digital Foot Print Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Crunchbase Clearbit Option Radiobutton is not displayed in Digital Foot Print Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(txt_EP_DigitalFootPrintSection_Crunchbase_ClearbitOption, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_EP_DigitalFootPrintSection_Crunchbase_ClearbitOption)) 
			{
				testStepPassed("Crunchbase Clearbit Option Textbox is displayed in Digital Foot Print Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Crunchbase Clearbit Option Textbox is not displayed in Digital Foot Print Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(rdb_EP_DigitalFootPrintSection_Facebook_HatcherOption, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_EP_DigitalFootPrintSection_Facebook_HatcherOption)) 
			{
				testStepPassed("Facebook Hacther Option Radiobutton is displayed in Digital Foot Print Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Facebook Hacther Option Radiobutton is not displayed in Digital Foot Print Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(txt_EP_DigitalFootPrintSection_Facebook_HatcherOption, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_EP_DigitalFootPrintSection_Facebook_HatcherOption)) 
			{
				testStepPassed("Facebook Hacther Option Textbox is displayed in Digital Foot Print Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Facebook Hacther Option Textbox is not displayed in Digital Foot Print Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(rdb_EP_DigitalFootPrintSection_Facebook_ClearbitOption, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_EP_DigitalFootPrintSection_Facebook_ClearbitOption)) 
			{
				testStepPassed("Facebook Clearbit Option Radiobutton is displayed in Digital Foot Print Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Facebook Clearbit Option Radiobutton is not displayed in Digital Foot Print Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(txt_EP_DigitalFootPrintSection_Facebook_ClearbitOption, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_EP_DigitalFootPrintSection_Facebook_ClearbitOption)) 
			{
				testStepPassed("Facebook Clearbit Option Textbox is displayed in Digital Foot Print Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Facebook Clearbit Option Textbox is not displayed in Digital Foot Print Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(rdb_EP_DigitalFootPrintSection_Instagram_HatcherOption, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_EP_DigitalFootPrintSection_Instagram_HatcherOption)) 
			{
				testStepPassed("Instagaram Hatcher Option Radiobutton is displayed in Digital Foot Print Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Instagaram Hatcher Option Radiobutton is not displayed in Digital Foot Print Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(txt_EP_DigitalFootPrintSection_Instagram_HatcherOption, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_EP_DigitalFootPrintSection_Instagram_HatcherOption)) 
			{
				testStepPassed("Instagaram Hatcher Option Textbox is displayed in Digital Foot Print Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Instagaram Hatcher Option Textbox is not displayed in Digital Foot Print Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(rdb_EP_DigitalFootPrintSection_Angellist_HatcherOption, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_EP_DigitalFootPrintSection_Angellist_HatcherOption)) 
			{
				testStepPassed("Angellist Hacther Option Radiobutton is displayed in Digital Foot Print Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Angellist Hacther Option Radiobutton is not displayed in Digital Foot Print Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(txt_EP_DigitalFootPrintSection_Angellist_HatcherOption, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_EP_DigitalFootPrintSection_Angellist_HatcherOption)) 
			{
				testStepPassed("Angellist Hacther Option Textbox is displayed in Digital Foot Print Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Angellist Hacther Option Textbox is not displayed in Digital Foot Print Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(rdb_EP_DigitalFootPrintSection_Medium_HatcherOption, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_EP_DigitalFootPrintSection_Medium_HatcherOption)) 
			{
				testStepPassed("Medium Hacther Option Radiobutton is displayed in Digital Foot Print Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Medium Hacther Option Radiobutton is not displayed in Digital Foot Print Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(txt_EP_DigitalFootPrintSection_Medium_HatcherOption, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_EP_DigitalFootPrintSection_Medium_HatcherOption)) 
			{
				testStepPassed("Medium Hacther Option Textbox is displayed in Digital Foot Print Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Medium Hacther Option Textbox is not displayed in Digital Foot Print Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(rdb_EP_DigitalFootPrintSection_LinkedIn_HatcherOption, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_EP_DigitalFootPrintSection_LinkedIn_HatcherOption)) 
			{
				testStepPassed("LinkedIn Hacther Option Radiobutton is displayed in Digital Foot Print Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("LinkedIn Hacther Option Radiobutton is not displayed in Digital Foot Print Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(txt_EP_DigitalFootPrintSection_LinkedIn_HatcherOption, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_EP_DigitalFootPrintSection_LinkedIn_HatcherOption)) 
			{
				testStepPassed("LinkedIn Hacther Option Textbox is displayed in Digital Foot Print Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("LinkedIn Hacther Option Textbox is not displayed in Digital Foot Print Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(rdb_EditProfilePage_DigitalFootPrintSection_LinkedIn_ClearbitOption, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_EditProfilePage_DigitalFootPrintSection_LinkedIn_ClearbitOption)) 
			{
				testStepPassed("LinkedIn Clearbit Option Radiobutton is displayed in Digital Foot Print Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("LinkedIn Clearbit Option Radiobutton is not displayed in Digital Foot Print Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(txt_EditProfilePage_DigitalFootPrintSection_LinkedIn_ClearbitOption, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_EditProfilePage_DigitalFootPrintSection_LinkedIn_ClearbitOption)) 
			{
				testStepPassed("LinkedIn Clearbit Option Textbox is displayed in Digital Foot Print Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("LinkedIn Clearbit Option Textbox is not displayed in Digital Foot Print Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(rdb_EditProfilePage_DigitalFootPrintSection_Pinterest_HatcherOption, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_EditProfilePage_DigitalFootPrintSection_Pinterest_HatcherOption)) 
			{
				testStepPassed("Pinterest Hacther Option Radiobutton is displayed in Digital Foot Print Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Pinterest Hacther Option Radiobutton is not displayed in Digital Foot Print Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(txt_EditProfilePage_DigitalFootPrintSection_Pinterest_HatcherOption, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_EditProfilePage_DigitalFootPrintSection_Pinterest_HatcherOption)) 
			{
				testStepPassed("Pinterest Hacther Option Textbox is displayed in Digital Foot Print Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Pinterest Hacther Option Textbox is not displayed in Digital Foot Print Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(rdb_EditProfilePage_DigitalFootPrintSection_RSSFeed_HatcherOption, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_EditProfilePage_DigitalFootPrintSection_RSSFeed_HatcherOption)) 
			{
				testStepPassed("RSS Feed Hacther Option Radiobutton is displayed in Digital Foot Print Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("RSS Feed Hacther Option Radiobutton is not displayed in Digital Foot Print Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(txt_EditProfilePage_DigitalFootPrintSection_RSSFeed_HatcherOption, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_EditProfilePage_DigitalFootPrintSection_RSSFeed_HatcherOption)) 
			{
				testStepPassed("RSS Feed Hacther Option Textbox is displayed in Digital Foot Print Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("RSS Feed Hacther Option Textbox is not displayed in Digital Foot Print Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(rdb_EP_DigitalFootPrintSection_Twitter_HatcherOption, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_EP_DigitalFootPrintSection_Twitter_HatcherOption)) 
			{
				testStepPassed("Twitter Hacther Option Radiobutton is displayed in Digital Foot Print Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Twitter Hacther Option Radiobutton is not displayed in Digital Foot Print Section of Edit Profile Page");
		}

		try 		{
			waitForElementToDisplay(txt_EP_DigitalFootPrintSection_Twitter_HatcherOption, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_EP_DigitalFootPrintSection_Twitter_HatcherOption)) 
			{
				testStepPassed("Twitter Hacther Option Textbox is displayed in Digital Foot Print Section of Edit Profile Page");
			}		}
		catch (Exception e) 		{
			testStepFailed("Twitter Hacther Option Textbox is not displayed in Digital Foot Print Section of Edit Profile Page");
		}

		try 		{
			waitForElementToDisplay(rdb_EP_DigitalFootPrintSection_Twitter_ClearbitOption, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_EP_DigitalFootPrintSection_Twitter_ClearbitOption)) 
			{
				testStepPassed("Twitter Clearbit Option Radiobutton is displayed in Digital Foot Print Section of Edit Profile Page");
			}		}
		catch (Exception e) 		{
			testStepFailed("Twitter Clearbit Option Radiobutton is not displayed in Digital Foot Print Section of Edit Profile Page");
		}

		try 		{
			waitForElementToDisplay(txt_EP_DigitalFootPrintSection_Twitter_ClearbitOption, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_EP_DigitalFootPrintSection_Twitter_ClearbitOption)) 
			{
				testStepPassed("Twitter Clearbit Option Textbox is displayed in Digital Foot Print Section of Edit Profile Page");
			}		}	
		catch (Exception e) 
		{
			testStepFailed("Twitter Clearbit Option Textbox is not displayed in Digital Foot Print Section of Edit Profile Page");
		}

		try 		{
			waitForElementToDisplay(rdb_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_Vimeo_HatcherOption_RadioButton, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_Vimeo_HatcherOption_RadioButton)) 
			{
				testStepPassed("Vimeo Hacther Option Radiobutton is displayed in Digital Foot Print Section of Edit Profile Page");
			}		}
		catch (Exception e) 		{
			testStepFailed("Vimeo Hacther Option Radiobutton is not displayed in Digital Foot Print Section of Edit Profile Page");
		}

		try 		{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_Vimeo_HatcherOption_Textbox, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_Vimeo_HatcherOption_Textbox)) 
			{
				testStepPassed("Vimeo Hacther Option Textbox is displayed in Digital Foot Print Section of Edit Profile Page");
			}		}
		catch (Exception e) 		{
			testStepFailed("Vimeo Hacther Option Textbox is not displayed in Digital Foot Print Section of Edit Profile Page");
		}

		try 		{
			waitForElementToDisplay(rdb_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_Website_HatcherOption_RadioButton, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_Website_HatcherOption_RadioButton)) 
			{
				testStepPassed("Website Hacther Option Radiobutton is displayed in Digital Foot Print Section of Edit Profile Page");
			}		}
		catch (Exception e)		{
			testStepFailed("Website Hacther Option Radiobutton is not displayed in Digital Foot Print Section of Edit Profile Page");
		}

		try{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_Website_HatcherOption_Textbox, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_Website_HatcherOption_Textbox)) 
			{
				testStepPassed("Website Hacther Option Textbox is displayed in Digital Foot Print Section of Edit Profile Page");
			}		}
		catch (Exception e) 		{
			testStepFailed("Website Hacther Option Textbox is not displayed in Digital Foot Print Section of Edit Profile Page");
		}

		try {
			waitForElementToDisplay(rdb_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_Website_HatcherOption_RadioButton, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_Website_HatcherOption_RadioButton)) 
			{
				testStepPassed("Website Hacther Option Radiobutton is displayed in Digital Foot Print Section of Edit Profile Page");
			}		}
		catch (Exception e)		{
			testStepFailed("Website Hacther Option Radiobutton is not displayed in Digital Foot Print Section of Edit Profile Page");
		}

		try 	{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_Website_HatcherOption_Textbox, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_Website_HatcherOption_Textbox)) 
			{
				testStepPassed("Website Hacther Option Textbox is displayed in Digital Foot Print Section of Edit Profile Page");
			}		}
		catch (Exception e) 		{
			testStepFailed("Website Hacther Option Textbox is not displayed in Digital Foot Print Section of Edit Profile Page");
		}

		try {
			waitForElementToDisplay(rdb_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_Website_ClearbitOption_RadioButton, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_Website_ClearbitOption_RadioButton)) 
			{
				testStepPassed("Website Clearbit Option Radiobutton is displayed in Digital Foot Print Section of Edit Profile Page");
			}		}
		catch (Exception e)		{
			testStepFailed("Website Clearbit Option Radiobutton is not displayed in Digital Foot Print Section of Edit Profile Page");
		}

		try 		{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_Website_ClearbitOption_Textbox, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_Website_ClearbitOption_Textbox)) 
			{
				testStepPassed("Website Clearbit Option Textbox is displayed in Digital Foot Print Section of Edit Profile Page");
			}		}
		catch (Exception e) 		{
			testStepFailed("Website Clearbit Option Textbox is not displayed in Digital Foot Print Section of Edit Profile Page");
		}

		try 		{
			waitForElementToDisplay(rdb_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_Website_MOZOption_RadioButton, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_Website_MOZOption_RadioButton)) 
			{
				testStepPassed("Website MOZ Option Radiobutton is displayed in Digital Foot Print Section of Edit Profile Page");
			}		}
		catch (Exception e) 		{
			testStepFailed("Website MOZ Option Radiobutton is not displayed in Digital Foot Print Section of Edit Profile Page");
		}

		try 	{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_Website_MOZOption_Textbox, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_Website_MOZOption_Textbox)) 
			{
				testStepPassed("Website MOZ Option Textbox is displayed in Digital Foot Print Section of Edit Profile Page");
			}
		}
		catch (Exception e) {
			testStepFailed("Website MOZ Option Textbox is not displayed in Digital Foot Print Section of Edit Profile Page");
		}
		try{
			waitForElementToDisplay(rdb_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_YouTube_HatcherOption_RadioButton, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_YouTube_HatcherOption_RadioButton)) 
			{
				testStepPassed("Youtube Hacther Radiobutton is displayed in Digital Foot Print Section of Edit Profile Page");
			}		}
		catch (Exception e) 		{
			testStepFailed("Youtube Hacther Radiobutton is not displayed in Digital Foot Print Section of Edit Profile Page");
		}

		try 		{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_YouTube_HatcherOption_Textbox, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_YouTube_HatcherOption_Textbox)) 
			{
				testStepPassed("Youtube Textbox is displayed in Digital Foot Print Section of Edit Profile Page");
			}		}
		catch (Exception e) 		{
			testStepFailed("Youtube Textbox is not displayed in Digital Foot Print Section of Edit Profile Page");
		}	

		try 		{
			waitForElementToDisplay(btn_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_SaveChanges, this.elementLoadWaitTime);
			if (isElementDisplayed(btn_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_SaveChanges)) 
			{
				testStepPassed("Save Changes Button is displayed in Digital Foot Print Section of Edit Profile Page");
			}		}
		catch (Exception e) 		{
			testStepFailed("Save Changes Button is not displayed in Digital Foot Print Section of Edit Profile Page");
		}
	}
	/**
	 *This method is used to verify the elements of the finance and legal section.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_FinanceandLegalSection_EditCompany_CompanyProfilePage_Elements_displayed()	{
		try 		{
			waitForElementToDisplay(rdb_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_Auditor_HatcherOption_RadioButton, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_Auditor_HatcherOption_RadioButton)) 
			{
				testStepPassed("Auditor Hacther Option Radiobutton is displayed in Finance and Legal Section of Edit Profile Page");
			}		}
		catch (Exception e) 		{
			testStepFailed("Auditor Hacther Option Radiobutton is not displayed in Finance and Legal Section of Edit Profile Page");
		}

		try 		{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_Auditor_HatcherOption_Textbox, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_Auditor_HatcherOption_Textbox)) 
			{
				testStepPassed("Auditor Hacther Option Textbox is displayed in Finance and Legal Section of Edit Profile Page");
			}		}
		catch (Exception e) 		{
			testStepFailed("Auditor Hacther Option Textbox is not displayed in Finance and Legal Section of Edit Profile Page");
		}	

		try 		{
			waitForElementToDisplay(rdb_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_Bank_HatcherOption_RadioButton, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_Bank_HatcherOption_RadioButton)) 
			{
				testStepPassed("Bank Hacther Option Radiobutton is displayed in Finance and Legal Section of Edit Profile Page");
			}		}
		catch (Exception e) 		{
			testStepFailed("Bank Hacther Option Radiobutton is not displayed in Finance and Legal Section of Edit Profile Page");
		}

		try 		{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_Bank_HatcherOption_Textbox, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_Bank_HatcherOption_Textbox)) 
			{
				testStepPassed("Hacther Option Textbox is displayed in Finance and Legal Section of Edit Profile Page");
			}		}
		catch (Exception e) 		{
			testStepFailed("Bank Hacther Option Textbox is not displayed in Finance and Legal Section of Edit Profile Page");
		}	

		try 		{
			waitForElementToDisplay(rdb_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankABANumber_HatcherOption_RadioButton, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankABANumber_HatcherOption_RadioButton)) 
			{
				testStepPassed("Bank ABA Number Hacther Option Radiobutton is displayed in Finance and Legal Section of Edit Profile Page");
			}		}
		catch (Exception e) {
			testStepFailed("Bank ABA Number Hacther Option Radiobutton is not displayed in Finance and Legal Section of Edit Profile Page");
		}

		try 		{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankABANumber_HatcherOption_Textbox, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankABANumber_HatcherOption_Textbox)) 
			{
				testStepPassed("Bank ABA Number Hacther Option Textbox is displayed in Finance and Legal Section of Edit Profile Page");
			}
		}
		catch (Exception e)	{
			testStepFailed("Bank ABA Number Hacther Option Textbox is not displayed in Finance and Legal Section of Edit Profile Page");
		}	

		try 		{
			waitForElementToDisplay(rdb_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankAccountName_HatcherOption_RadioButton, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankAccountName_HatcherOption_RadioButton)) 
			{
				testStepPassed("Bank Account Name Hacther Option Radiobutton is displayed in Finance and Legal Section of Edit Profile Page");
			}		}
		catch (Exception e) 		{
			testStepFailed("Bank Account Name Hacther Option Radiobutton is not displayed in Finance and Legal Section of Edit Profile Page");
		}

		try 	{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankAccountName_HatcherOption_Textbox, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankAccountName_HatcherOption_Textbox)) 
			{
				testStepPassed("Bank Account Name Hacther Option Textbox is displayed in Finance and Legal Section of Edit Profile Page");
			}
		}
		catch (Exception e) 		{
			testStepFailed("Bank Account Name Hacther Option Textbox is not displayed in Finance and Legal Section of Edit Profile Page");
		}	

		try		{
			waitForElementToDisplay(rdb_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankAccountNumber_HatcherOption_RadioButton, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankAccountNumber_HatcherOption_RadioButton)) 
			{
				testStepPassed("Bank Account Number Hacther Option Radiobutton is displayed in Finance and Legal Section of Edit Profile Page");
			}
		}
		catch (Exception e) 		{
			testStepFailed("Bank Account Number Hacther Option Radiobutton is not displayed in Finance and Legal Section of Edit Profile Page");
		}

		try 		{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankAccountNumber_HatcherOption_Textbox, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankAccountNumber_HatcherOption_Textbox)) 
			{
				testStepPassed("Bank Account Number Hacther Option Textbox is displayed in Finance and Legal Section of Edit Profile Page");
			}		}
		catch (Exception e)		{
			testStepFailed("Bank Account Number Hacther Option Textbox is not displayed in Finance and Legal Section of Edit Profile Page");
		}	

		try 	{
			waitForElementToDisplay(rdb_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankAddress_HatcherOption_RadioButton, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankAddress_HatcherOption_RadioButton)) 
			{
				testStepPassed("Bank Address Hacther Option Radiobutton is displayed in Finance and Legal Section of Edit Profile Page");
			}		}
		catch (Exception e) 		{
			testStepFailed("Bank Address Hacther Option Radiobutton is not displayed in Finance and Legal Section of Edit Profile Page");
		}

		try 		{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankAddress_HatcherOption_Textbox, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankAddress_HatcherOption_Textbox)) 
			{
				testStepPassed("Bank Address Hacther Option Textbox is displayed in Finance and Legal Section of Edit Profile Page");
			}		}
		catch (Exception e)		{
			testStepFailed("Bank Address Hacther Option Textbox is not displayed in Finance and Legal Section of Edit Profile Page");
		}	

		try 		{
			waitForElementToDisplay(rdb_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankIntermediary_HatcherOption_RadioButton, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankIntermediary_HatcherOption_RadioButton)) 
			{
				testStepPassed("Bank Intermediary Hacther Option Radiobutton is displayed in Finance and Legal Section of Edit Profile Page");
			}		}
		catch (Exception e)		{
			testStepFailed("Bank Intermediary Hacther Option Radiobutton is not displayed in Finance and Legal Section of Edit Profile Page");
		}

		try 	{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankIntermediary_HatcherOption_Textbox, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankIntermediary_HatcherOption_Textbox)) 
			{
				testStepPassed("Bank Intermediary Hacther Option Textbox is displayed in Finance and Legal Section of Edit Profile Page");
			}		}
		catch (Exception e) 		{
			testStepFailed("Bank Intermediary Hacther Option Textbox is not displayed in Finance and Legal Section of Edit Profile Page");
		}	

		try 		{
			waitForElementToDisplay(rdb_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_IntermediaryBankABANumber_HatcherOption_RadioButton, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_IntermediaryBankABANumber_HatcherOption_RadioButton)) 
			{
				testStepPassed("Intermediary Bank ABA Number Hacther Option Radiobutton is displayed in Finance and Legal Section of Edit Profile Page");
			}
		}
		catch (Exception e) {
			testStepFailed("Intermediary Bank ABA Number Hacther Option Radiobutton is not displayed in Finance and Legal Section of Edit Profile Page");
		}

		try	{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_IntermediaryBankABANumber_HatcherOption_Textbox, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_IntermediaryBankABANumber_HatcherOption_Textbox)) 
			{
				testStepPassed("Intermediary Bank ABA Number Hacther Option Textbox is displayed in Finance and Legal Section of Edit Profile Page");
			}	}
		catch (Exception e) {
			testStepFailed("Intermediary Bank ABA Number Hacther Option Textbox is not displayed in Finance and Legal Section of Edit Profile Page");
		}	

		try {
			waitForElementToDisplay(rdb_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_IntermediaryBankAddress_HatcherOption_RadioButton, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_IntermediaryBankAddress_HatcherOption_RadioButton)) 
			{
				testStepPassed("Intermediary Bank Address Hacther Option Radiobutton is displayed in Finance and Legal Section of Edit Profile Page");
			}		}
		catch (Exception e) 	{
			testStepFailed("Intermediary Bank Address Hacther Option Radiobutton is not displayed in Finance and Legal Section of Edit Profile Page");
		}

		try		{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_IntermediaryBankAddress_HatcherOption_Textbox, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_IntermediaryBankAddress_HatcherOption_Textbox)) 
			{
				testStepPassed("Intermediary Bank Address Hacther Option Textbox is displayed in Finance and Legal Section of Edit Profile Page");
			}
		}
		catch (Exception e) 	{
			testStepFailed("Intermediary Bank Address Hacther Option Textbox is not displayed in Finance and Legal Section of Edit Profile Page");
		}	

		try 	{
			waitForElementToDisplay(rdb_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_IntermediaryBankSWIFTBIC_HatcherOption_RadioButton, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_IntermediaryBankSWIFTBIC_HatcherOption_RadioButton)) 
			{
				testStepPassed("Intermediary Bank SWIFT BIC Hacther Option Radiobutton is displayed in Finance and Legal Section of Edit Profile Page");
			}		}
		catch (Exception e) 	{
			testStepFailed("Intermediary Bank SWIFT BIC Hacther Option Radiobutton is not displayed in Finance and Legal Section of Edit Profile Page");
		}
		try 	{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_IntermediaryBankSWIFTBIC_HatcherOption_Textbox, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_IntermediaryBankSWIFTBIC_HatcherOption_Textbox)) 
			{
				testStepPassed("Intermediary Bank SWIFT BIC Hacther Option Textbox is displayed in Finance and Legal Section of Edit Profile Page");
			}		}
		catch (Exception e) 
		{
			testStepFailed("Intermediary Bank SWIFT BIC Hacther Option Textbox is not displayed in Finance and Legal Section of Edit Profile Page");
		}	

		try 	{
			waitForElementToDisplay(rdb_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankSwiftCode_HatcherOption_RadioButton, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankSwiftCode_HatcherOption_RadioButton)) 
			{
				testStepPassed("Bank Swift Code Hacther Option Radiobutton is displayed in Finance and Legal Section of Edit Profile Page");
			}		}
		catch (Exception e)
		{
			testStepFailed("Bank Swift Code Hacther Option Radiobutton is not displayed in Finance and Legal Section of Edit Profile Page");
		}

		try 		{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankSwiftCode_HatcherOption_Textbox, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankSwiftCode_HatcherOption_Textbox)) 
			{
				testStepPassed("Bank Swift Code Hacther Option Textbox is displayed in Finance and Legal Section of Edit Profile Page");
			}
		}
		catch (Exception e) 		{
			testStepFailed("Bank Swift Code Hacther Option Textbox is not displayed in Finance and Legal Section of Edit Profile Page");
		}	

		try 		{
			waitForElementToDisplay(rdb_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankIBANCode_HatcherOption_RadioButton, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankIBANCode_HatcherOption_RadioButton)) 
			{
				testStepPassed("Bank IBAN Code Hacther Option Radiobutton is displayed in Finance and Legal Section of Edit Profile Page");
			}
		}
		catch (Exception e) 		{
			testStepFailed("Bank IBAN Code Hacther Option Radiobutton is not displayed in Finance and Legal Section of Edit Profile Page");
		}

		try 		{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankIBANCode_HatcherOption_Textbox, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankIBANCode_HatcherOption_Textbox)) 
			{
				testStepPassed("Bank IBAN Code Hacther Option Textbox is displayed in Finance and Legal Section of Edit Profile Page");
			}
		}
		catch (Exception e)		{
			testStepFailed("Bank IBAN Code Hacther Option Textbox is not displayed in Finance and Legal Section of Edit Profile Page");
		}	

		try 		{
			waitForElementToDisplay(rdb_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankInstructions_HatcherOption_RadioButton, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankInstructions_HatcherOption_RadioButton)) 
			{
				testStepPassed("Bank Instructions Hacther Option Radiobutton is displayed in Finance and Legal Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Bank Instructions Hacther Option Radiobutton is not displayed in Finance and Legal Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankInstructions_HatcherOption_Textbox, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankInstructions_HatcherOption_Textbox)) 
			{
				testStepPassed("Bank Instructions Hacther Option Textbox is displayed in Finance and Legal Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Bank Instructions Hacther Option Textbox is not displayed in Finance and Legal Section of Edit Profile Page");
		}	

		try 
		{
			waitForElementToDisplay(rdb_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_CompanySecretary_HatcherOption_RadioButton, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_CompanySecretary_HatcherOption_RadioButton)) 
			{
				testStepPassed("Company Secretary Hacther Option Radiobutton is displayed in Finance and Legal Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Company Secretary Hacther Option Radiobutton is not displayed in Finance and Legal Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_CompanySecretary_HatcherOption_Textbox, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_CompanySecretary_HatcherOption_Textbox)) 
			{
				testStepPassed("Company Secretary Hacther Option Textbox is displayed in Finance and Legal Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Company Secretary Hacther Option Textbox is not displayed in Finance and Legal Section of Edit Profile Page");
		}	

		try 
		{
			waitForElementToDisplay(rdb_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_Currency_HatcherOption_RadioButton, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_Currency_HatcherOption_RadioButton)) 
			{
				testStepPassed("Currency Hacther Option Radiobutton is displayed in Finance and Legal Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Currency Hacther Option Radiobutton is not displayed in Finance and Legal Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(drp_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_Currency_HatcherOption_Dropdown, this.elementLoadWaitTime);
			if (isElementDisplayed(drp_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_Currency_HatcherOption_Dropdown)) 
			{
				testStepPassed("Currency Hacther Option Dropdown is displayed in Finance and Legal Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Currency Hacther Option Dropdown is not displayed in Finance and Legal Section of Edit Profile Page");
		}	

		try 
		{
			waitForElementToDisplay(rdb_EP_FinanceandLegalSection_FinancialYearEnd_HatcherOption, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_EP_FinanceandLegalSection_FinancialYearEnd_HatcherOption)) 
			{
				testStepPassed("Financial Year End Hacther Option Radiobutton is displayed in Finance and Legal Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Financial Year End Hacther Option Radiobutton is not displayed in Finance and Legal Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(drp_EP_FinanceandLegalSection_FinancialYearEnd_HatcherOption, this.elementLoadWaitTime);
			if (isElementDisplayed(drp_EP_FinanceandLegalSection_FinancialYearEnd_HatcherOption)) 
			{
				testStepPassed("Financial Year End Hacther Option Dropdown is displayed in Finance and Legal Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Financial Year End Hacther Option Dropdown is not displayed in Finance and Legal Section of Edit Profile Page");
		}	

		try 
		{
			waitForElementToDisplay(rdb_EP_FinanceandLegalSection_LawFirm_HatcherOption, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_EP_FinanceandLegalSection_LawFirm_HatcherOption)) 
			{
				testStepPassed("Law Firm Hacther Option Radiobutton is displayed in Finance and Legal Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Law Firm Hacther Option Radiobutton is not displayed in Finance and Legal Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(txt_EP_FinanceandLegalSection_LawFirm_HatcherOption, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_EP_FinanceandLegalSection_LawFirm_HatcherOption)) 
			{
				testStepPassed("Law Firm Hacther Option Textbox is displayed in Finance and Legal Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Law Firm Hacther Option Textbox is not displayed in Finance and Legal Section of Edit Profile Page");
		}	

		try 
		{
			waitForElementToDisplay(btn_EP_FinanceandLegalSection_SaveChanges, this.elementLoadWaitTime);
			if (isElementDisplayed(btn_EP_FinanceandLegalSection_SaveChanges)) 
			{
				testStepPassed("Save Changes Button is displayed in Finance and Legal Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Save Changes Button is not displayed in Finance and Legal Section of Edit Profile Page");
		}
	}
	/**
	 *This method is used to display of industry hatcher radio button.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_IndustrySection_EditCompany_CompanyProfilePage_Elements_displayed()
	{
		try 
		{
			waitForElementToDisplay(rdb_EP_IndustrySection_Industry_HatcherOption, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_EP_IndustrySection_Industry_HatcherOption)) 
			{
				testStepPassed("Industry Hacther Option Radiobutton is displayed in Industry Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Industry Hacther Option Radiobutton is not displayed in Industry Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(txt_EP_IndustrySection_Industry_HatcherOption, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_EP_IndustrySection_Industry_HatcherOption)) 
			{
				testStepPassed("Industry Hacther Option Textbox is displayed in Industry Section of Edit Profile Page");
			}
		}
		catch (Exception e) 		{
			testStepFailed("Industry Hacther Option Textbox is not displayed in Industry Section of Edit Profile Page");
		}

		try 		{
			waitForElementToDisplay(btn_EP_IndustrySection_SaveChanges, this.elementLoadWaitTime);
			if (isElementDisplayed(btn_EP_IndustrySection_SaveChanges)) 
			{
				testStepPassed("Save Changes Button is displayed in Industry Section of Edit Profile Page");
			}
		}
		catch (Exception e) 		{
			testStepFailed("Save Changes Button is not displayed in Industry Section of Edit Profile Page");
		}
	}
	/**
	 *This method is used to verify the display of the radio button for the keywords hatcher.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_KeywordsSection_EditCompany_CompanyProfilePage_Elements_displayed()	{
		try 		{
			waitForElementToDisplay(rdb_EP_KeywordsSection_Keywords_HatcherOption, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_EP_KeywordsSection_Keywords_HatcherOption)) 
			{
				testStepPassed("Keywords Hacther Option Radiobutton is displayed in Keywords Section of Edit Profile Page");
			}		}
		catch (Exception e) 		{
			testStepFailed("Keywords Hacther Option Radiobutton is not displayed in Keywords Section of Edit Profile Page");
		}

		try 		{
			waitForElementToDisplay(txt_EP_KeywordsSection_Keywords_HatcherOption, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_EP_KeywordsSection_Keywords_HatcherOption)) 
			{
				testStepPassed("Keywords Hacther Option Textbox is displayed in Keywords Section of Edit Profile Page");
			}		}
		catch (Exception e) 	{
			testStepFailed("Keywords Hacther Option Textbox is not displayed in Keywords Section of Edit Profile Page");
		}

		try 		{
			waitForElementToDisplay(rdb_EP_KeywordsSection_Keywords_ClearbitOption, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_EP_KeywordsSection_Keywords_ClearbitOption)) 
			{
				testStepPassed("Keywords Clearbit Option Radiobutton is displayed in Keywords Section of Edit Profile Page");
			}		}
		catch (Exception e) 		{
			testStepFailed("Keywords Clearbit Option Radiobutton is not displayed in Keywords Section of Edit Profile Page");
		}

		try 		{
			waitForElementToDisplay(txt_EP_KeywordsSection_Keywords_ClearbitOption, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_EP_KeywordsSection_Keywords_ClearbitOption)) 
			{
				testStepPassed("Keywords Clearbit Option Textbox is displayed in Keywords Section of Edit Profile Page");
			}
		}
		catch (Exception e)		{
			testStepFailed("Keywords Clearbit Option Textbox is not displayed in Keywords Section of Edit Profile Page");
		}

		try 		{
			waitForElementToDisplay(btn_EP_KeywordsSection_SaveChanges, this.elementLoadWaitTime);
			if (isElementDisplayed(btn_EP_KeywordsSection_SaveChanges)) 
			{
				testStepPassed("Save Changes Button is displayed in Keywords Section of Edit Profile Page");
			}		}
		catch (Exception e) 		{
			testStepFailed("Save Changes Button is not displayed in Keywords Section of Edit Profile Page");
		}	}
	/**
	 *This method is used to verify the display of radio button regions in edit profile page.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_RegionsSection_EditCompany_CompanyProfilePage_Elements_displayed()	{
		try 		{
			waitForElementToDisplay(rdb_EP_RegionsSection_Regions_HatcherOption, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_EP_RegionsSection_Regions_HatcherOption)) 
			{
				testStepPassed("Regions Hacther Option Radiobutton is displayed in Regions Section of Edit Profile Page");
			}		}
		catch (Exception e) 		{
			testStepFailed("Regions Hacther Option Radiobutton is not displayed in Regions Section of Edit Profile Page");
		}

		try 		{
			waitForElementToDisplay(txt_EP_RegionsSection_Regions_HatcherOption, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_EP_RegionsSection_Regions_HatcherOption)) 
			{
				testStepPassed("Regions Hacther Option Textbox is displayed in Regions Section of Edit Profile Page");
			}		}
		catch (Exception e) 		{
			testStepFailed("Regions Hacther Option Textbox is not displayed in Regions Section of Edit Profile Page");
		}

		try 		{
			waitForElementToDisplay(btn_EP_RegionsSection_SaveChanges, this.elementLoadWaitTime);
			if (isElementDisplayed(btn_EP_RegionsSection_SaveChanges)) 
			{
				testStepPassed("Save Changes Button is displayed in Regions Section of Edit Profile Page");
			}		}
		catch (Exception e) 		{
			testStepFailed("Save Changes Button is not displayed in Regions Section of Edit Profile Page");
		}
	}
	/**
	 *This method is used to display maketing metrics option radio button.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_MarketingMetricsSection_EditCompany_CompanyProfilePage_Elements_displayed()	{
		try{
			waitForElementToDisplay(rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_AlexaRanking_HatcherOption_RadioButton, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_AlexaRanking_HatcherOption_RadioButton)) 
			{
				testStepPassed("Alexa Ranking Hacther Option Radiobutton is displayed in Marketing Metrics Section of Edit Profile Page");
			}		}
		catch (Exception e) 		{
			testStepFailed("Alexa Ranking Hacther Option Radiobutton is not displayed in Marketing Metrics Section of Edit Profile Page");
		}

		try {
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_AlexaRanking_HatcherOption_Textbox, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_AlexaRanking_HatcherOption_Textbox)) 
			{
				testStepPassed("Alexa Ranking Hacther Option Textbox is displayed in Marketing Metrics Section of Edit Profile Page");
			}		}
		catch (Exception e) 		{
			testStepFailed("Alexa Ranking Hacther Option Textbox is not displayed in Marketing Metrics Section of Edit Profile Page");
		}	

		try {
			waitForElementToDisplay(rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_AlexaRanking_ClearbitOption_RadioButton, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_AlexaRanking_ClearbitOption_RadioButton)) 
			{
				testStepPassed("Alexa Ranking Clearbit Option Radiobutton is displayed in Marketing Metrics Section of Edit Profile Page");
			}		}
		catch (Exception e) 		{
			testStepFailed("Alexa Ranking Clearbit Option Radiobutton is not displayed in Marketing Metrics Section of Edit Profile Page");
		}

		try{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_AlexaRanking_ClearbitOption_Textbox, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_AlexaRanking_ClearbitOption_Textbox)) 
			{
				testStepPassed("Alexa Ranking Clearbit Option Textbox is displayed in Marketing Metrics Section of Edit Profile Page");
			}		}
		catch (Exception e) 		{
			testStepFailed("Alexa Ranking Clearbit Option Textbox is not displayed in Marketing Metrics Section of Edit Profile Page");
		}	

		try{
			waitForElementToDisplay(rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_Competitors_HatcherOption_RadioButton, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_Competitors_HatcherOption_RadioButton)) 
			{
				testStepPassed("Competitors Hacther Option Radiobutton is displayed in Marketing Metrics Section of Edit Profile Page");
			}		}
		catch (Exception e) 		{
			testStepFailed("Competitors Hacther Option Radiobutton is not displayed in Marketing Metrics Section of Edit Profile Page");
		}

		try {
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_Competitors_HatcherOption_Textbox, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_Competitors_HatcherOption_Textbox)) 
			{
				testStepPassed("Competitors Hacther Option Textbox is displayed in Marketing Metrics Section of Edit Profile Page");
			}		}
		catch (Exception e)		{
			testStepFailed("Competitors Hacther Option Textbox is not displayed in Marketing Metrics Section of Edit Profile Page");
		}	

		try {
			waitForElementToDisplay(rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_Competitors_SEMRushOption_RadioButton, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_Competitors_SEMRushOption_RadioButton)) 
			{
				testStepPassed("Competitors SEMRush Option Radiobutton is displayed in Marketing Metrics Section of Edit Profile Page");
			}		}
		catch (Exception e) 	{
			testStepFailed("Competitors SEMRush Option Radiobutton is not displayed in Marketing Metrics Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_Competitors_SEMRushOption_Textbox, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_Competitors_SEMRushOption_Textbox)) 
			{
				testStepPassed("Competitors SEMRush Option Textbox is displayed in Marketing Metrics Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Competitors SEMRush Option Textbox is not displayed in Marketing Metrics Section of Edit Profile Page");
		}	

		try 
		{
			waitForElementToDisplay(rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_CompetitorRankings_HatcherOption_RadioButton, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_CompetitorRankings_HatcherOption_RadioButton)) 
			{
				testStepPassed("Competitor Rankings Hacther Option Radiobutton is displayed in Marketing Metrics Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Competitor Rankings Hacther Option Radiobutton is not displayed in Marketing Metrics Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_CompetitorRankings_HatcherOption_Textbox, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_CompetitorRankings_HatcherOption_Textbox)) 
			{
				testStepPassed("Competitor Rankings Hacther Option Textbox is displayed in Marketing Metrics Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Competitor Rankings Hacther Option Textbox is not displayed in Marketing Metrics Section of Edit Profile Page");
		}	

		try 
		{
			waitForElementToDisplay(rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_DomainsLinkingIn_HatcherOption_RadioButton, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_DomainsLinkingIn_HatcherOption_RadioButton)) 
			{
				testStepPassed("Domains Linking In Hacther Option Radiobutton is displayed in Marketing Metrics Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Domains Linking In Hacther Option Radiobutton is not displayed in Marketing Metrics Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_DomainsLinkingIn_HatcherOption_Textbox, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_DomainsLinkingIn_HatcherOption_Textbox)) 
			{
				testStepPassed("Domains Linking In Hacther Option Textbox is displayed in Marketing Metrics Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Domains Linking In Hacther Option Textbox is not displayed in Marketing Metrics Section of Edit Profile Page");
		}	

		try 
		{
			waitForElementToDisplay(rdb_EP_MarketingMetricsSection_DomainsLinkingIn_MOZOption, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_EP_MarketingMetricsSection_DomainsLinkingIn_MOZOption)) 
			{
				testStepPassed("Domains Linking In MOZ Option Radiobutton is displayed in Marketing Metrics Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Domains Linking In MOZ Option Radiobutton is not displayed in Marketing Metrics Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_DomainsLinkingIn_MOZOption_Textbox, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_DomainsLinkingIn_MOZOption_Textbox)) 
			{
				testStepPassed("Domains Linking In MOZ Option Textbox is displayed in Marketing Metrics Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Domains Linking In MOZ Option Textbox is not displayed in Marketing Metrics Section of Edit Profile Page");
		}	

		try 
		{
			waitForElementToDisplay(rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_FacebookLikes_HatcherOption_RadioButton, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_FacebookLikes_HatcherOption_RadioButton)) 
			{
				testStepPassed("Facebook Likes Hacther Option Radiobutton is displayed in Marketing Metrics Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Facebook Likes Hacther Option Radiobutton is not displayed in Marketing Metrics Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_FacebookLikes_HatcherOption_Textbox, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_FacebookLikes_HatcherOption_Textbox)) 
			{
				testStepPassed("Facebook Likes Hacther Option Textbox is displayed in Marketing Metrics Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Facebook Likes Hacther Option Textbox is not displayed in Marketing Metrics Section of Edit Profile Page");
		}	

		try 
		{
			waitForElementToDisplay(rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_FacebookLikes_ClearbitOption_RadioButton, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_FacebookLikes_ClearbitOption_RadioButton)) 
			{
				testStepPassed("Facebook Likes Clearbit Option Radiobutton is displayed in Marketing Metrics Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Facebook Likes Clearbit Option Radiobutton is not displayed in Marketing Metrics Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_FacebookLikes_ClearbitOption_Textbox, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_FacebookLikes_ClearbitOption_Textbox)) 
			{
				testStepPassed("Facebook Likes Clearbit Option Textbox is displayed in Marketing Metrics Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Facebook Likes Clearbit Option Textbox is not displayed in Marketing Metrics Section of Edit Profile Page");
		}	

		try 
		{
			waitForElementToDisplay(rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_LinkedinEmployees_HatcherOption_RadioButton, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_LinkedinEmployees_HatcherOption_RadioButton)) 
			{
				testStepPassed("Linkedin Employees Hatcher Option Radiobutton is displayed in Marketing Metrics Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Linkedin Employees Hatcher Option Radiobutton is not displayed in Marketing Metrics Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_LinkedinEmployees_HatcherOption_Textbox, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_LinkedinEmployees_HatcherOption_Textbox)) 
			{
				testStepPassed("Linkedin Employees Hatcher Option Textbox is displayed in Marketing Metrics Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Linkedin Employees Hatcher Option Textbox is not displayed in Marketing Metrics Section of Edit Profile Page");
		}	

		try 
		{
			waitForElementToDisplay(rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_LinkedinEmployees_ClearbitOption_RadioButton, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_LinkedinEmployees_ClearbitOption_RadioButton)) 
			{
				testStepPassed("Linkedin Employees Clearbit Option Radiobutton is displayed in Marketing Metrics Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Linkedin Employees Clearbit Option Radiobutton is not displayed in Marketing Metrics Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_LinkedinEmployees_ClearbitOption_Textbox, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_LinkedinEmployees_ClearbitOption_Textbox)) 
			{
				testStepPassed("Linkedin Employees Clearbit Option Textbox is displayed in Marketing Metrics Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Linkedin Employees Clearbit Option Textbox is not displayed in Marketing Metrics Section of Edit Profile Page");
		}	

		try 
		{
			waitForElementToDisplay(rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_LinkedinEmployees_LinkedInOption_RadioButton, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_LinkedinEmployees_LinkedInOption_RadioButton)) 
			{
				testStepPassed("Linkedin Employees LinkedIn Option Radiobutton is displayed in Marketing Metrics Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Linkedin Employees LinkedIn Option Radiobutton is not displayed in Marketing Metrics Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_LinkedinEmployees_LinkedInOption_Textbox, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_LinkedinEmployees_LinkedInOption_Textbox)) 
			{
				testStepPassed("Linkedin Employees LinkedIn Option Textbox is displayed in Marketing Metrics Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Linkedin Employees LinkedIn Option Textbox is not displayed in Marketing Metrics Section of Edit Profile Page");
		}	

		try 
		{
			waitForElementToDisplay(rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_LinkedinFollowers_HatcherOption_RadioButton, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_LinkedinFollowers_HatcherOption_RadioButton)) 
			{
				testStepPassed("Linkedin Followers Hacther Option Radiobutton is displayed in Marketing Metrics Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Linkedin Followers Hacther Option Radiobutton is not displayed in Marketing Metrics Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_LinkedinFollowers_HatcherOption_Textbox, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_LinkedinFollowers_HatcherOption_Textbox)) 
			{
				testStepPassed("Linkedin Followers Hacther Option Textbox is displayed in Marketing Metrics Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Linkedin Followers Hacther Option Textbox is not displayed in Marketing Metrics Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_LinkedinFollowers_LinkedInOption_RadioButton, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_LinkedinFollowers_LinkedInOption_RadioButton)) 
			{
				testStepPassed("Linkedin Followers LinkedIn Option Radiobutton is displayed in Marketing Metrics Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Linkedin Followers LinkedIn Option Radiobutton is not displayed in Marketing Metrics Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_LinkedinFollowers_LinkedInOption_Textbox, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_LinkedinFollowers_LinkedInOption_Textbox)) 
			{
				testStepPassed("Linkedin Followers LinkedIn Option Textbox is displayed in Marketing Metrics Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Linkedin Followers LinkedIn Option Textbox is not displayed in Marketing Metrics Section of Edit Profile Page");
		}	

		try 
		{
			waitForElementToDisplay(rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_MOZDomainAuthority_HatcherOption_RadioButton, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_MOZDomainAuthority_HatcherOption_RadioButton)) 
			{
				testStepPassed("MOZ Domain Authority Hacther Option Radiobutton is displayed in Marketing Metrics Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("MOZ Domain Authority Hacther Option Radiobutton is not displayed in Marketing Metrics Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_MOZDomainAuthority_HatcherOption_Textbox, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_MOZDomainAuthority_HatcherOption_Textbox)) 
			{
				testStepPassed("MOZ Domain Authority Hacther Option Textbox is displayed in Marketing Metrics Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("MOZ Domain Authority Hacther Option Textbox is not displayed in Marketing Metrics Section of Edit Profile Page");
		}	

		try 
		{
			waitForElementToDisplay(rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_MOZDomainAuthority_MOZOption_RadioButton, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_MOZDomainAuthority_MOZOption_RadioButton)) 
			{
				testStepPassed("MOZ Domain Authority MOZ Option Radiobutton is displayed in Marketing Metrics Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("MOZ Domain Authority MOZ Option Radiobutton is not displayed in Marketing Metrics Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_MOZDomainAuthority_MOZOption_Textbox, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_MOZDomainAuthority_MOZOption_Textbox)) 
			{
				testStepPassed("MOZ Domain MOZ Option Textbox is displayed in Marketing Metrics Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("MOZ Domain MOZ Option Textbox is not displayed in Marketing Metrics Section of Edit Profile Page");
		}	

		try 
		{
			waitForElementToDisplay(rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_OrganicTraffic_HatcherOption_RadioButton, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_OrganicTraffic_HatcherOption_RadioButton)) 
			{
				testStepPassed("Organic Traffic Hacther Option Radiobutton is displayed in Marketing Metrics Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Organic Traffic Hacther Option Radiobutton is not displayed in Marketing Metrics Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_OrganicTraffic_HatcherOption_Textbox, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_OrganicTraffic_HatcherOption_Textbox)) 
			{
				testStepPassed("Organic Traffic Hacther Option Textbox is displayed in Marketing Metrics Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Organic Traffic Hacther Option Textbox is not displayed in Marketing Metrics Section of Edit Profile Page");
		}	

		try 
		{
			waitForElementToDisplay(rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_OrganicTraffic_SEMRushOrganicTrafficOption_RadioButton, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_OrganicTraffic_SEMRushOrganicTrafficOption_RadioButton)) 
			{
				testStepPassed("Organic Traffic SEMRushOrganicTraffic Option Radiobutton is displayed in Marketing Metrics Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Organic Traffic SEMRushOrganicTraffic Option Radiobutton is not displayed in Marketing Metrics Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_OrganicTraffic_SEMRushOrganicTraffic_Textbox, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_OrganicTraffic_SEMRushOrganicTraffic_Textbox)) 
			{
				testStepPassed("Organic Traffic SEMRushOrganicTraffic Option Textbox is displayed in Marketing Metrics Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Organic Traffic SEMRushOrganicTraffic Option Textbox is not displayed in Marketing Metrics Section of Edit Profile Page");
		}	

		try 
		{
			waitForElementToDisplay(rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_TranscoRanking_HatcherOption_RadioButton, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_TranscoRanking_HatcherOption_RadioButton)) 
			{
				testStepPassed("Transco Ranking Hacther Option Radiobutton is displayed in Marketing Metrics Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Transco Ranking Hacther Option Radiobutton is not displayed in Marketing Metrics Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_TranscoRanking_HatcherOption_Textbox, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_TranscoRanking_HatcherOption_Textbox)) 
			{
				testStepPassed("Transco Ranking Hacther Option Textbox is displayed in Marketing Metrics Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Transco Ranking Hacther Option Textbox is not displayed in Marketing Metrics Section of Edit Profile Page");
		}	

		try 
		{
			waitForElementToDisplay(rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_TwitterFollowers_HatcherOption_RadioButton, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_TwitterFollowers_HatcherOption_RadioButton)) 
			{
				testStepPassed("Twitter Followers Hacther Option Radiobutton is displayed in Marketing Metrics Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Twitter Followers Hacther Option  Radiobutton is not displayed in Marketing Metrics Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_TwitterFollowers_HatcherOption_Textbox, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_TwitterFollowers_HatcherOption_Textbox)) 
			{
				testStepPassed("Twitter Followers Hacther Option Textbox is displayed in Marketing Metrics Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Twitter Followers Hacther Option Textbox is not displayed in Marketing Metrics Section of Edit Profile Page");
		}			

		try 
		{
			waitForElementToDisplay(rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_TwitterFollowers_ClearbitOption_RadioButton, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_TwitterFollowers_ClearbitOption_RadioButton)) 
			{
				testStepPassed("Twitter Followers Clearbit Option Radiobutton is displayed in Marketing Metrics Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Twitter Followers Clearbit Option  Radiobutton is not displayed in Marketing Metrics Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_TwitterFollowers_ClearbitOption_Textbox, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_TwitterFollowers_ClearbitOption_Textbox)) 
			{
				testStepPassed("Twitter Followers Clearbit Option Textbox is displayed in Marketing Metrics Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Twitter Followers Clearbit Option Textbox is not displayed in Marketing Metrics Section of Edit Profile Page");
		}			

		try 
		{
			waitForElementToDisplay(rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_SaveChanges, this.elementLoadWaitTime);
			if (isElementDisplayed(rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_SaveChanges)) 
			{
				testStepPassed("Save Changes Button is displayed in Marketing Metrics Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Save Changes Button is not displayed in Marketing Metrics Section of Edit Profile Page");
		}
	}
	/**
	 *This method is used to verify the elements of the marketing metrics section.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_MarketingMetricsSection_EditCompany_CompanyProfilePage_Elements_disabled()
	{
		try 
		{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_AlexaRanking_HatcherOption_Textbox, this.elementLoadWaitTime);
			if (driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Alexa Ranking']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text'  and contains(@readonly,'readonly')]")).isDisplayed()) 
			{
				testStepPassed("Alexa Ranking Hatcher Option Textbox is in Readonly Mode in Marketing Metrics Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Alexa Ranking Hatcher Option Textbox is not in Readonly Mode in Marketing Metrics Section of Edit Profile Page");
		}	

		try 
		{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_AlexaRanking_ClearbitOption_Textbox, this.elementLoadWaitTime);
			if (driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Alexa Ranking']/parent::div/following-sibling::div//input[contains(@value,'Clearbit')]/parent::label/following-sibling::input[@type='text' and contains(@readonly,'readonly')]")).isDisplayed()) 
			{
				testStepPassed("Alexa Ranking Hatcher Option Textbox is in Readonly Mode in Marketing Metrics Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Alexa Ranking Hatcher Option Textbox is not in Readonly Mode in Marketing Metrics Section of Edit Profile Page");
		}	

		try 
		{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_Competitors_HatcherOption_Textbox, this.elementLoadWaitTime);
			if (driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Competitors']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text' and contains(@readonly,'readonly')]")).isDisplayed()) 
			{
				testStepPassed("Competitors Hatcher Option Textbox is in Readonly Mode in Marketing Metrics Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Competitors Hatcher Option Textbox is not in Readonly Mode in Marketing Metrics Section of Edit Profile Page");
		}	

		try 
		{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_Competitors_SEMRushOption_Textbox, this.elementLoadWaitTime);
			if (driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Competitors']/parent::div/following-sibling::div//input[contains(@value,'SEMRush')]/parent::label/following-sibling::input[@type='text' and contains(@readonly,'readonly')]")).isDisplayed()) 
			{
				testStepPassed("Competitors SEMRush Option Textbox is in Readonly Mode in Marketing Metrics Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Competitors SEMRush Option Textbox is not in Readonly Mode in Marketing Metrics Section of Edit Profile Page");
		}	

		try 
		{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_CompetitorRankings_HatcherOption_Textbox, this.elementLoadWaitTime);
			if (driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Competitor Rankings']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text' and contains(@readonly,'readonly')]")).isDisplayed()) 
			{
				testStepPassed("Competitor Rankings Hatcher Option Textbox is in Readonly Mode in Marketing Metrics Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Competitor Rankings Hatcher Option Textbox is not in Readonly Mode in Marketing Metrics Section of Edit Profile Page");
		}	

		try 
		{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_DomainsLinkingIn_HatcherOption_Textbox, this.elementLoadWaitTime);
			if (driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Domains Linking In']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text' and contains(@readonly,'readonly')]")).isDisplayed()) 
			{
				testStepPassed("Domains Linking In Hatcher Option Textbox is in Readonly Mode in Marketing Metrics Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Domains Linking In Hatcher Option Textbox is not in Readonly Mode in Marketing Metrics Section of Edit Profile Page");
		}	

		try 
		{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_DomainsLinkingIn_MOZOption_Textbox, this.elementLoadWaitTime);
			if (driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Domains Linking In']/parent::div/following-sibling::div//input[contains(@value,'MOZ')]/parent::label/following-sibling::input[@type='text' and contains(@readonly,'readonly')]")).isDisplayed()) 
			{
				testStepPassed("Domains Linking In MOZ Option Textbox is in Readonly Mode in Marketing Metrics Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Domains Linking In MOZ Option Textbox is not in Readonly Mode in Marketing Metrics Section of Edit Profile Page");
		}	

		try 
		{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_FacebookLikes_HatcherOption_Textbox, this.elementLoadWaitTime);
			if (driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Facebook Likes']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text' and contains(@readonly,'readonly')]")).isDisplayed()) 
			{
				testStepPassed("Facebook Likes Hatcher Option Textbox is in Readonly Mode in Marketing Metrics Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Facebook Likes Hatcher Option Textbox is not in Readonly Mode in Marketing Metrics Section of Edit Profile Page");
		}	

		try 
		{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_FacebookLikes_ClearbitOption_Textbox, this.elementLoadWaitTime);
			if (driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Facebook Likes']/parent::div/following-sibling::div//input[contains(@value,'Clearbit')]/parent::label/following-sibling::input[@type='text' and contains(@readonly,'readonly')]")).isDisplayed()) 
			{
				testStepPassed("Facebook Likes Clearbit Option Textbox is in Readonly Mode in Marketing Metrics Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Facebook Likes Clearbit Option Textbox is not in Readonly Mode in Marketing Metrics Section of Edit Profile Page");
		}	

		try 
		{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_LinkedinEmployees_HatcherOption_Textbox, this.elementLoadWaitTime);
			if (driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Linkedin Employees']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text' and contains(@readonly,'readonly')]")).isDisplayed()) 
			{
				testStepPassed("Linkedin Employees Hatcher Option Textbox is in Readonly Mode in Marketing Metrics Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Linkedin Employees Hatcher Option Textbox is not in Readonly Mode in Marketing Metrics Section of Edit Profile Page");
		}	

		try 
		{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_LinkedinEmployees_ClearbitOption_Textbox, this.elementLoadWaitTime);
			if (driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Linkedin Employees']/parent::div/following-sibling::div//input[contains(@value,'Clearbit')]/parent::label/following-sibling::input[@type='text' and contains(@readonly,'readonly')]")).isDisplayed()) 
			{
				testStepPassed("Linkedin Employees Clearbit Option Textbox is in Readonly Mode in Marketing Metrics Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Linkedin Employees Clearbit Option Textbox is not in Readonly Mode in Marketing Metrics Section of Edit Profile Page");
		}	

		try 
		{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_LinkedinEmployees_LinkedInOption_Textbox, this.elementLoadWaitTime);
			if (driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Linkedin Employees']/parent::div/following-sibling::div//input[contains(@value,'LinkedIn')]/parent::label/following-sibling::input[@type='text' and contains(@readonly,'readonly')]")).isDisplayed()) 
			{
				testStepPassed("Linkedin Employees LinkedIn Option Textbox is in Readonly Mode in Marketing Metrics Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Linkedin Employees LinkedIn Option Textbox is not in Readonly Mode in Marketing Metrics Section of Edit Profile Page");
		}	

		try 
		{
			waitForElementToDisplay(rdb_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_LinkedinFollowers_HatcherOption_RadioButton, this.elementLoadWaitTime);
			if (driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Linkedin Followers']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text' and contains(@readonly,'readonly')]")).isDisplayed()) 
			{
				testStepPassed("Linkedin Followers Hatcher Option Textbox is in Readonly Mode in Marketing Metrics Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Linkedin Followers Hatcher Option Textbox is not in Readonly Mode in Marketing Metrics Section of Edit Profile Page");
		}	

		try 
		{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_LinkedinFollowers_LinkedInOption_Textbox, this.elementLoadWaitTime);
			if (driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Linkedin Followers']/parent::div/following-sibling::div//input[contains(@value,'LinkedIn')]/parent::label/following-sibling::input[@type='text' and contains(@readonly,'readonly')]")).isDisplayed()) 
			{
				testStepPassed("Linkedin Followers Hatcher Option Textbox is in Readonly Mode in Marketing Metrics Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Linkedin Followers Hatcher Option Textbox is not in Readonly Mode in Marketing Metrics Section of Edit Profile Page");
		}	

		try 
		{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_MOZDomainAuthority_HatcherOption_Textbox, this.elementLoadWaitTime);
			if (driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='MOZ Domain Authority']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text' and contains(@readonly,'readonly')]")).isDisplayed()) 
			{
				testStepPassed("MOZ Domain Authority Hatcher Option Textbox is in Readonly Mode in Marketing Metrics Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("MOZ Domain Authority Hatcher Option Textbox is not in Readonly Mode in Marketing Metrics Section of Edit Profile Page");
		}	

		try 
		{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_MOZDomainAuthority_MOZOption_Textbox, this.elementLoadWaitTime);
			if (driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='MOZ Domain Authority']/parent::div/following-sibling::div//input[contains(@value,'MOZ')]/parent::label/following-sibling::input[@type='text' and contains(@readonly,'readonly')]")).isDisplayed())
			{
				testStepPassed("MOZ Domain Authority MOZ Option Textbox is in Readonly Mode in Marketing Metrics Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("MOZ Domain Authority MOZ Option Textbox is not in Readonly Mode in Marketing Metrics Section of Edit Profile Page");
		}	

		try 
		{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_OrganicTraffic_HatcherOption_Textbox, this.elementLoadWaitTime);
			if (driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Organic Traffic']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text' and contains(@readonly,'readonly')]")).isDisplayed())
			{
				testStepPassed("Organic Traffic Hatcher Option Textbox is in Readonly Mode in Marketing Metrics Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Organic Traffic Hatcher Option Textbox is not in Readonly Mode in Marketing Metrics Section of Edit Profile Page");
		}	

		try 
		{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_OrganicTraffic_SEMRushOrganicTraffic_Textbox, this.elementLoadWaitTime);
			if (driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Organic Traffic']/parent::div/following-sibling::div//label[contains(text(),'SEMRushOrganicTraffic')]/parent::div//input[contains(@type,'text') and @readonly='readonly']")).isDisplayed()) 
			{
				testStepPassed("Organic Traffic SEMRushOrganicTraffic Option Textbox is in Readonly Mode in Marketing Metrics Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Organic Traffic SEMRushOrganicTraffic Option Textbox is not in Readonly Mode in Marketing Metrics Section of Edit Profile Page");
		}	

		try 
		{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_TranscoRanking_HatcherOption_Textbox, this.elementLoadWaitTime);
			if (driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Transco Ranking']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text' and contains(@readonly,'readonly')]")).isDisplayed())
			{
				testStepPassed("Transco Ranking Hatcher Option Textbox is in Readonly Mode in Marketing Metrics Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Transco Ranking Hatcher Option Textbox is not in Readonly Mode in Marketing Metrics Section of Edit Profile Page");
		}	

		try 
		{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_TwitterFollowers_HatcherOption_Textbox, this.elementLoadWaitTime);
			if (driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Twitter Followers']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text' and contains(@readonly,'readonly')]")).isDisplayed()) 
			{
				testStepPassed("Twitter Followers Hatcher Option Textbox is in Readonly Mode in Marketing Metrics Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Twitter Followers Hatcher Option Textbox is not in Readonly Mode in Marketing Metrics Section of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_TwitterFollowers_ClearbitOption_Textbox, this.elementLoadWaitTime);
			if (driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'marketing')]//*[text()='Twitter Followers']/parent::div/following-sibling::div//input[contains(@value,'Clearbit')]/parent::label/following-sibling::input[@type='text' and contains(@readonly,'readonly')]")).isDisplayed()) 
			{
				testStepPassed("Twitter Followers Hatcher Option Textbox is in Readonly Mode in Marketing Metrics Section of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Twitter Followers Hatcher Option Textbox is not in Readonly Mode in Marketing Metrics Section of Edit Profile Page");
		}
	}
	/**
	 *This method is used to verify the display of the community settings section in company profile page.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_CommunitySettingsSection_EditCompany_CompanyProfilePage_Elements_displayed()
	{
		try 
		{
			waitForElementToDisplay(drp_CompanyProfilePage_EditProfilePage_CommunitySettingsSection_AccountStatus, this.elementLoadWaitTime);
			if (isElementDisplayed(drp_CompanyProfilePage_EditProfilePage_CommunitySettingsSection_AccountStatus)) 
			{
				testStepPassed("Account Status Hatcher Option Dropdown is displayed in Community Settings of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Account Status Hatcher Option Dropdown is not displayed in Community Settings of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(drp_CompanyProfilePage_EditProfilePage_CommunitySettingsSection_AccountType, this.elementLoadWaitTime);
			if (isElementDisplayed(drp_CompanyProfilePage_EditProfilePage_CommunitySettingsSection_AccountType)) 
			{
				testStepPassed("Account Type Hatcher Option Dropdown is displayed in Community Settings of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Account Type Hatcher Option Dropdown is not displayed in Community Settings of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(drp_CompanyProfilePage_EditProfilePage_CommunitySettingsSection_BusinessType, this.elementLoadWaitTime);
			if (isElementDisplayed(drp_CompanyProfilePage_EditProfilePage_CommunitySettingsSection_BusinessType)) 
			{
				testStepPassed("Business Type Hatcher Option Dropdown is displayed in Community Settings of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Business Type Hatcher Option Dropdown is not displayed in Community Settings of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(drp_CompanyProfilePage_EditProfilePage_CommunitySettingsSection_DealflowStatus, this.elementLoadWaitTime);
			if (isElementDisplayed(drp_CompanyProfilePage_EditProfilePage_CommunitySettingsSection_DealflowStatus)) 
			{
				testStepPassed("Dealflow Status Hatcher Option Dropdown is displayed in Community Settings of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Dealflow Status Hatcher Option Dropdown is not displayed in Community Settings of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(drp_CompanyProfilePage_EditProfilePage_CommunitySettingsSection_HealthPortfolioStatus, this.elementLoadWaitTime);
			if (isElementDisplayed(drp_CompanyProfilePage_EditProfilePage_CommunitySettingsSection_HealthPortfolioStatus)) 
			{
				testStepPassed("Health / Portfolio Status Hatcher Option Dropdown is displayed in Community Settings of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Health / Portfolio Status Hatcher Option Dropdown is not displayed in Community Settings of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(drp_CompanyProfilePage_EditProfilePage_CommunitySettingsSection_PlacementAgent, this.elementLoadWaitTime);
			if (isElementDisplayed(drp_CompanyProfilePage_EditProfilePage_CommunitySettingsSection_PlacementAgent)) 
			{
				testStepPassed("Placement Agent Hatcher Option Dropdown is displayed in Community Settings of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Placement Agent Hatcher Option Dropdown is not displayed in Community Settings of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(drp_CompanyProfilePage_EditProfilePage_CommunitySettingsSection_MainContact, this.elementLoadWaitTime);
			if (isElementDisplayed(drp_CompanyProfilePage_EditProfilePage_CommunitySettingsSection_MainContact)) 
			{
				testStepPassed("Main Contact Hatcher Option Dropdown is displayed in Community Settings of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Main Contact Hatcher Option Dropdown is not displayed in Community Settings of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(drp_CompanyProfilePage_EditProfilePage_CommunitySettingsSection_RelationshipManager, this.elementLoadWaitTime);
			if (isElementDisplayed(drp_CompanyProfilePage_EditProfilePage_CommunitySettingsSection_RelationshipManager)) 
			{
				testStepPassed("Relationship Manager Hatcher Option Dropdown is displayed in Community Settings of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Relationship Manager Hatcher Option Dropdown is not displayed in Community Settings of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(drp_CompanyProfilePage_EditProfilePage_CommunitySettingsSection_ScoreVisibility, this.elementLoadWaitTime);
			if (isElementDisplayed(drp_CompanyProfilePage_EditProfilePage_CommunitySettingsSection_ScoreVisibility)) 
			{
				testStepPassed("Score Visibility Hatcher Option Dropdown is displayed in Community Settings of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Score Visibility Hatcher Option Dropdown is not displayed in Community Settings of Edit Profile Page");
		}

		try 
		{
			waitForElementToDisplay(drp_CompanyProfilePage_EditProfilePage_CommunitySettingsSection_SaveChanges, this.elementLoadWaitTime);
			if (isElementDisplayed(drp_CompanyProfilePage_EditProfilePage_CommunitySettingsSection_SaveChanges)) 
			{
				testStepPassed("Save Changes Button is displayed in Community Settings of Edit Profile Page");
			}
		}
		catch (Exception e) 
		{
			testStepFailed("Save Changes Button is not displayed in Community Settings of Edit Profile Page");
		}
	}

	/********************************************************************************************************************************************************/
	/**
	 *This method is used to enable the radio button for the hatcher in legal name section.
	 *
	 *@author VijayaKumar.U
	 */
	/*public void click_CompanySection_LegalName_HatcherOption_RadioButton()
	{
		try {
			WebElement ele = findWebElement(rdb_CompanyProfilePage_EditProfilePage_CompanySection_LegalName_HatcherOption_RadioButton);
			if(ele.isSelected()){
				testStepPassed("The Hatcher Radio button is selected.");
		clickOn(rdb_CompanyProfilePage_EditProfilePage_CompanySection_LegalName_HatcherOption_RadioButton);
	}
			else{
				testStepFailed("The Hatcher option radio button could not be selected.");

			}}
		catch (Exception e) {
			e.printStackTrace();
			testStepFailed("Could not verify company profile page elements" + e.getClass());
		}
}*/	
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_CompanySection_LegalName_HatcherOption_Textbox(String legalName)
	{
		try {
			//waitForElementToDisplay(txt_EP_CompanySection_LegalName_HatcherOption, this.elementLoadWaitTime);
			WebElement element = findWebElement(txt_EP_CompanySection_LegalName_HatcherOption);
			scrolltoElementView(element);

			clearEditBox(txt_EP_CompanySection_LegalName_HatcherOption);
			typeIn(txt_EP_CompanySection_LegalName_HatcherOption, legalName);
			verify_textboxvalid(txt_EP_CompanySection_LegalName_HatcherOption, legalName);
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
			testStepFailed("Could not verify company profile page elements" + e.getClass());
		}
	}
	
	

	/**
	 *This method is used to enable the radio button of clearbit option.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_CompanySection_LegalName_ClearbitOption_RadioButton()
	{WebElement element = findWebElement(txt_EP_CompanySection_LegalName_HatcherOption);
	scrolltoElementView(element);
		
		try {
			WebElement ele = findWebElement(rdb_EP_CompanySection_LegalName_ClearbitOption);
			if(ele.isSelected()){
				testStepPassed("The Clearbit Radio button is selected.");
				
			}
			else{
				clickOn(rdb_EP_CompanySection_LegalName_ClearbitOption);
				testStepFailed("The Clear bit radio button could not be selected.");

			}}
		catch (Exception e) {
			e.printStackTrace();
			testStepFailed("Could not verify company profile page elements" + e.getClass());
		}
	}
	/**
	 *This method is used to enter the data in the legal name of clearbit option.
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_CompanySection_LegalName_ClearbitOption_Textbox(String legalName)
	{
		waitForElementToDisplay(txt_EP_CompanySection_LegalName_ClearbitOption, this.elementLoadWaitTime);
		clearEditBox(txt_EP_CompanySection_LegalName_ClearbitOption);
		typeIn(txt_EP_CompanySection_LegalName_ClearbitOption, legalName);
	}
	/**
	 *This method is used to enable the radio button for friendly name .
	 *
	 *@author VijayaKumar.U
	 */
	public void click_CompanySection_FriendlyName_HatcherOption_RadioButton()
	{
		clickOn(rdb_EP_CompanySection_FriendlyName_HatcherOption);
	}
	/**
	 *This method is used to 
	 *
	 *@param friend name
	 *@author VijayaKumar.U
	 */
	public void enter_CompanySection_FriendlyName_HatcherOption_Textbox(String friendlyName)
	{
		scrollToElement(txt_EP_CompanySection_FriendlyName_HatcherOption);
		waitForElementToDisplay(txt_EP_CompanySection_FriendlyName_HatcherOption, this.elementLoadWaitTime);
		
		clearEditBox(txt_EP_CompanySection_FriendlyName_HatcherOption);
		typeIn(txt_EP_CompanySection_FriendlyName_HatcherOption, friendlyName);
		verify_textboxvalid(txt_EP_CompanySection_FriendlyName_HatcherOption, friendlyName);
	}
	/**
	 *This method is used to enable the radio button of friendly name in clearbit option.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_CompanySection_FriendlyName_ClearbitOption_RadioButton()
	{
		clickOn(rdb_EP_CompanySection_FriendlyName_ClearbitOption);
	}
	/**
	 *This method is used to to enter data in the clearbit friendly name.
	 *
	 *@param friendlyName
	 *@author VijayaKumar.U
	 */
	public void enter_CompanySection_FriendlyName_ClearbitOption_Textbox(String friendlyName)
	{
		waitForElementToDisplay(txt_EP_CompanySection_FriendlyName_ClearbitOption, this.elementLoadWaitTime);
		clearEditBox(txt_EP_CompanySection_FriendlyName_ClearbitOption);
		typeIn(txt_EP_CompanySection_FriendlyName_ClearbitOption, friendlyName);
	}
	/**
	 *This method is used to enable the radio button of linkedIn option.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_CompanySection_FriendlyName_LinkedInOption_RadioButton()
	{
		clickOn(rdb_EP_CompanySection_FriendlyName_LinkedInOption);
	}
	/**
	 *This method is used to enter the friendly name in linkedIn.
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_CompanySection_FriendlyName_LinkedIn_Textbox(String friendlyName)
	{
		waitForElementToDisplay(txt_EP_CompanySection_FriendlyName_LinkedInOption, this.elementLoadWaitTime);
		clearEditBox(txt_EP_CompanySection_FriendlyName_LinkedInOption);
		typeIn(txt_EP_CompanySection_FriendlyName_LinkedInOption, friendlyName);
	}
	/**
	 *This method is used to enable the radio button of incorporate Date.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_CompanySection_IncorporationDate_HatcherOption_RadioButton()
	{
		clickOn(rdb_EP_CompanySection_IncorporationDate_HatcherOption);
	}
	/**
	 *This method is used to enter the date of incorporate in hatcher
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_CompanySection_IncorporationDateHatcherOption_Textbox(String incorporationDate)
	{
		WebElement element = findWebElement(txt_EP_CompanySection_IncorporationDate_HatcherOption);
		scrollToElement(txt_EP_CompanySection_IncorporationDate_HatcherOption);
		//waitForElementToDisplay(txt_EP_CompanySection_IncorporationDate_HatcherOption, this.elementLoadWaitTime);
		clearEditBox(txt_EP_CompanySection_IncorporationDate_HatcherOption);
		typeIn(txt_EP_CompanySection_IncorporationDate_HatcherOption, incorporationDate);


	}
	/**
	 *This method is used to enable radiobutton in incorporate date 
	 *
	 *@author VijayaKumar.U
	 */
	public void click_CompanySection_IncorporationDate_ClearbitOption_RadioButton()
	{
		clickOn(rdb_EP_CompanySection_IncorporationDate_ClearbitOption);
	}
	/**
	 *This method is used to enter the incorporate date in the clear bit option
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_CompanySection_IncorporationDate_ClearbitOption_Textbox(String incorporationDate)
	{
		waitForElementToDisplay(txt_EP_CompanySection_IncorporationDate_ClearbitOption, this.elementLoadWaitTime);
		clearEditBox(txt_EP_CompanySection_IncorporationDate_ClearbitOption);
		typeIn(txt_EP_CompanySection_IncorporationDate_ClearbitOption, incorporationDate);
		waitTime(1);
		driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'company')]//*[text()='Incorporation date']/parent::div/following-sibling::div//label[contains(text(),'Clearbit')]/parent::div//following::div[contains(@class,'date-selector')]//div[contains(@class,'vc-grid-container')]//div[contains(@class,'vc-grid-cell')]//div[contains(@class,'highlights')]")).click();
	}
	/**
	 *This method is used to enable radio button of jurisdiction in company section
	 *
	 *@author VijayaKumar.U
	 */
	public void click_CompanySection_Jurisdiction_HatcherOption_RadioButton()
	{
		clickOn(rdb_EP_CompanySection_Jurisdiction_HatcherOption);
	}
	
	/**
	 *This method is used to enter the jurisdiction of hatcher
	 *
	 *@author VijayaKumar.U
	 */
	public void select_CompanySection_Jurisdiction_From_list(String jurisdiction)
	{
		WebElement element = findWebElement(drp_EP_CompanySection_Jurisdiction_HatcherOption);
		scrolltoElementView(element);
		//waitForElementToDisplay(drp_EP_CompanySection_Jurisdiction_HatcherOption, this.elementLoadWaitTime);
		
		clickOn(drp_EP_CompanySection_Jurisdiction_HatcherOption);
		waitTime(1);
		typeIn(txt_EP_CompanySection_Jurisdiction_HatcherOption, jurisdiction);
		waitTime(1);

		List <WebElement> optlst = driver.findElements(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'company')]//*[text()='Jurisdiction']/parent::div/following-sibling::div//label[contains(text(),'Hatcher')]//parent::div//ul[contains(@class,'multiselect__content')]//li//span//span"));
		int optlstcount = optlst.size();

		for (WebElement opt : optlst) 
		{
			String text = opt.getText();
			if (text.equalsIgnoreCase(jurisdiction)) 
			{
				opt.click();
				break;
			}
		}		
	}
	/**
	 *This method is used to display the error message when element is not found
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_Jurisdiction_HatcherOption_errorMessage_Displayed(String jurisdiction)
	{
		WebElement element = findWebElement(drp_EP_CompanySection_Jurisdiction_HatcherOption);
		scrolltoElementView(element);

		//clearEditBox(txt_EP_CompanySection_Jurisdiction_HatcherOption);
		waitForElementToDisplay(drp_EP_CompanySection_Jurisdiction_HatcherOption, this.elementLoadWaitTime);
		clickOn(drp_EP_CompanySection_Jurisdiction_HatcherOption);
		waitTime(1);
		typeIn(txt_EP_CompanySection_Jurisdiction_HatcherOption, jurisdiction);
		waitTime(1);
		if (isElementDisplayed(lbl__EP_CompanySection_Jurisdiction_HatcherOption_errorMessage)) 
		{
			testStepPassed("No elements found. Consider changing the search query message is displayed for Jurisdication Dropdown");
			clickOn(lbl_CompanyProfilePage_EditProfilePage_CompanySection);
		} 
		else 
		{
			testStepFailed("No elements found. Consider changing the search query message is not displayed for Jurisdication Dropdown");
		}
	}
	/**
	 *This method is used to enable the radio button of jurisdiction of company section
	 *
	 *@author VijayaKumar.U
	 */
	public void click_CompanySection_Jurisdiction_LinkedInOption_RadioButton()
	{
		clickOn(rdb_EP_CompanySection_Jurisdiction_LinkedInOption);
	}
	/**
	 *This method is used to enter the text in linkedIn jurisdiction.
	 *
	 *@author VijayaKumar.U
	 */
	public void select_CompanySection_Jurisdiction_LinkedIn_Textbox(String jurisdiction)
	{
		waitForElementToDisplay(drp_EP_CompanySection_Jurisdiction_LinkedInOption, this.elementLoadWaitTime);
		clickOn(drp_EP_CompanySection_Jurisdiction_LinkedInOption);
		waitTime(1);
		typeIn(txt_EP_CompanySection_Jurisdiction_LinkedInOption, jurisdiction);
		waitTime(1);

		List <WebElement> optlst = driver.findElements(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'company')]//*[text()='Jurisdiction']/parent::div/following-sibling::div//label[contains(text(),'LinkedIn')]//parent::div//ul[contains(@class,'multiselect__content')]//li//span//span"));
		int optlstcount = optlst.size();

		for (WebElement opt : optlst) 
		{
			String text = opt.getText();
			if (text.equalsIgnoreCase(jurisdiction)) 
			{
				opt.click();
				break;
			}
		}		
	}
	/**
	 *This method is used to enable the radio button of governing body in company section.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_CompanySection_GoverningBody_Hatcher_RadioButton()
	{
		clickOn(rdb_EP_CompanySection_GoverningBody_HatcherOption);
	}
	/**
	 *This method is used to select the governing body in company section
	 *
	 *@author VijayaKumar.U
	 */
	public void select_CompanySection_GoverningBody(String governingBody)
	{
		WebElement element = findWebElement(drp_EP_CompanySection_GoverningBody_HatcherOption);
		scrolltoElementView(element);
		clickOn(drp_EP_CompanySection_GoverningBody_HatcherOption);
		waitTime(1);
		typeIn(txt_EP_CompanySection_GoverningBody_HatcherOption, governingBody);
		waitTime(1);

		List <WebElement> optlst = driver.findElements(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'company')]//*[text()='Governing Body']/parent::div/following-sibling::div//label[contains(text(),'Hatcher')]//parent::div//ul[contains(@class,'multiselect__content')]//li//span//span"));
		int optlstcount = optlst.size();

		for (WebElement opt : optlst) 
		{
			String text = opt.getText();
			if (text.equalsIgnoreCase(governingBody)) 
			{
				opt.click();
				break;
			}
		}		
	}

	/**
	 *This method is used to display error message when governing body is not found.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_CompanySection_GoverningBody_elementNotFound_errorMessage_Displayed(String governingBody)
	{
		WebElement element = findWebElement(drp_EP_CompanySection_GoverningBody_HatcherOption);
		scrolltoElementView(element);
		waitForElementToDisplay(drp_EP_CompanySection_GoverningBody_HatcherOption, this.elementLoadWaitTime);
		clickOn(drp_EP_CompanySection_GoverningBody_HatcherOption);
		waitTime(1);
		typeIn(txt_EP_CompanySection_GoverningBody_HatcherOption, governingBody);
		waitTime(1);
		if (isElementDisplayed(lbl_EP_CompanySection_GoverningBody_HatcherOption_elementNotFoud_errorMessage)) 
		{
			testStepPassed("No elements found. Consider changing the search query message is displayed for Governing Body Dropdown");
			clickOn(lbl_CompanyProfilePage_EditProfilePage_CompanySection);
		} 
		else 
		{
			testStepFailed("No elements found. Consider changing the search query message is not displayed Governing Body Dropdown");
		}
	}
	/**
	 *This method is used to enable radio button of registation number.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_CompanySection_RegistrationNumber_HatcherOption_RadioButton()
	{//if selected
		clickOn(rdb_EP_CompanySection_RegistrationNumber_HatcherOption);
	}
	/**
	 *This method is used to enter the registration number
	 *
	 *@param registrationNumber
	 *@author VijayaKumar.U
	 */
	public void enter_CompanySection_RegistrationNumber_HatcherOption_Textbox(String registrationNumber)
	{
		waitForElementToDisplay(txt_EP_CompanySection_RegistrationNumber_HatcherOption, this.elementLoadWaitTime);
		clearEditBox(txt_EP_CompanySection_RegistrationNumber_HatcherOption);
		typeIn(txt_EP_CompanySection_RegistrationNumber_HatcherOption, registrationNumber);
		verify_textboxvalid(txt_EP_CompanySection_RegistrationNumber_HatcherOption, registrationNumber);
		
	}
	/**
	 *This method is used to save the changes in company section.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_CompanySection_SaveChanges_Button()
	{
		try {

			if(isElementDisplayed(btn_EP_CompanySection_SaveChanges)) {
				clickOn(btn_EP_CompanySection_SaveChanges);
			}
			else
				testStepFailed("Save button is not displayed in the page.");

		}
		catch(Exception e) {
			testStepFailed("The Save button couldnt be displayed in the page."+e.getClass());e.printStackTrace();

		}		}

	/********************************************************************************************************************************************************/
	/**
	 *This method is used to enter the former name 
	 *@param companyFormerName
	 *
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_CompanyFormerNamesSection_FormerName(String companyFormerName)
	{

		waitForElementToDisplay(txt_EP_CompanyFormerNamesSection_FormerName, this.elementLoadWaitTime);
		clearEditBox(txt_EP_CompanyFormerNamesSection_FormerName);
		typeIn(txt_EP_CompanyFormerNamesSection_FormerName, companyFormerName);
	}
	/**
	 *This method is used to get the Former name 
	 *
	 *@author VijayaKumar.U
	 */
	public String get_CompanyFormerNamesSection_FormerName_Placeholder()
	{
		WebElement element = findWebElement(txt_EP_CompanyFormerNamesSection_FormerName);
		scrolltoElementView(element);
		waitForElementToDisplay(txt_EP_CompanyFormerNamesSection_FormerName, this.elementLoadWaitTime);
		String placeHolder = getAttributeValue(txt_EP_CompanyFormerNamesSection_FormerName, "placeholder");
		return placeHolder;
	}
	/**
	 *This method is used to close the new record button
	 *
	 *@author VijayaKumar.U
	 */
	public void click_CompanyFormerNamesSection_CloseNewRecordRow_Button()
	{
		clickOn(lnk_EP_CompanyFormerNamesSection_FormerName_Close);
	}
	/**
	 *This method is used to click save changes
	 *
	 *@author VijayaKumar.U
	 */
	public void click_CompanyFormerNamesSection_SaveChanges_Button()
	{
		
		clickOn(btn_EP_CompanyFormerNamesSection_SaveChanges);
	}
	/**
	 *This method is used to verify the success message displayed for update
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_CompanyFormerNamesSection_Updated_SuccessMessage_displayed(String companyFormerName)
	{
		try
		{
			waitForElementToDisplay(lbl_EP_CompanyFormerNamesSection_Updated_SuccessMessage, this.elementLoadWaitTime);
			if (isElementDisplayed(lbl_EP_CompanyFormerNamesSection_Updated_SuccessMessage)) 
			{
				testStepPassed("Company Former Section is updated Successfully");
				clickOn(btn_EP_CompanyFormerNamesSection_Updated_SuccessMessage_OK);
				refreshPage();
				waitTime(1);
				String formerNameValue = driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'former-names')]//table//tr//td[1]")).getText().trim();
				try 
				{
					if (formerNameValue.equalsIgnoreCase(companyFormerName)) 
					{
						testStepPassed("Company Name Updated is displayed correctly in Company former Names Section Table");
					}
				} 
				catch (Exception e) 
				{
					testStepFailed("Company Name Updated is not displayed correctly in Company former Names Section Table");
				}
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Company Former Section is not updated Successfully");
		}
	}
	/********************************************************************************************************************************************************/	
	/**
	 *This method is used to enable radio button main contact in main contact
	 *
	 *@author VijayaKumar.U
	 */
	public void click_ContactDetailsSection_MainContact_HatcherOption_RadioButton()
	{
		clickOn(rdb_EP_ContactDetailsSection_MainContact_HatcherOption);
	}
	/**
	 *This method is used to enter the main contact for hatcheroption
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_ContactDetailsSection_MainContact_HatcherOption_Textbox(String mainContact)
	{
		waitForElementToDisplay(drp_EP_ContactDetailsSection_MainContact_HatcherOption, this.elementLoadWaitTime);
		clickOn(drp_EP_ContactDetailsSection_MainContact_HatcherOption);
		waitTime(1);
		typeIn(txt_EP_ContactDetailsSection_MainContact_HatcherOption, mainContact);
		waitTime(1);
	}
	/**
	 *This method is used to verify the error message display for contact details
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_ContactDetailsSection_MainContact_NoResults_ErrorMessage_displayed()
	{
		try 
		{
			if (driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='Main Contact']/parent::div/following-sibling::div//div[contains(@class,'multiselect__content')]//ul//li//span[contains(text(),'No elements found. Consider changing the search query.')]")).isDisplayed()) 
			{
				testStepFailed("Main Contact No Results found error message is displayed for Invalid contact serach keyword");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Main Contact No Results found error message is not displayed for Invalid contact serach keyword");
		}
	}
	/**
	 *This method is used to enable radio button in address of contact block
	 *
	 *@author VijayaKumar.U
	 */
	public void click_ContactDetailsSection_Address_HatcherOption_RadioButton()
	{
		clickOn(rdb_EP_ContactDetailsSection_Address_HatcherOption);
	}
	/**
	 *This method is used to enter the data for address in hatcher option
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_ContactDetailsSection_Address_HatcherOption_Textbox(String address)
	{
		waitForElementToDisplay(txt_EP_ContactDetailsSection_Address_HatcherOption, this.elementLoadWaitTime);
		clearEditBox(txt_EP_ContactDetailsSection_Address_HatcherOption);
		typeIn(txt_EP_ContactDetailsSection_Address_HatcherOption, address);
		verify_textboxvalid(txt_EP_ContactDetailsSection_Address_HatcherOption, address);
	}	
	/**
	 *This method is used to enable radio button of the address in contact details
	 *
	 *@author VijayaKumar.U
	 */
	public void click_ContactDetailsSection_Address_ClearbitOption_RadioButton()
	{
		clickOn(rdb_EP_ContactDetailsSection_Address_ClearbitOption);
	}
	/**
	 *This method is used to enter the address for the clearbit in contact section
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_ContactDetailsSection_Address_ClearbitOption_Textbox(String address)
	{
		waitForElementToDisplay(txt_EP_ContactDetailsSection_Address_ClearbitOption, this.elementLoadWaitTime);
		clearEditBox(txt_EP_ContactDetailsSection_Address_ClearbitOption);
		typeIn(txt_EP_ContactDetailsSection_Address_ClearbitOption, address);
	}	
	/**
	 *This method is used to enable the radio button of address of contact section
	 *
	 *@author VijayaKumar.U
	 */
	public void click_ContactDetailsSection_Address_LinkedInOption_RadioButton()
	{
		clickOn(rdb_EP_ContactDetailsSection_Address_LinkedInOption);
	}
	/**
	 *This method is used to enter the address of linkedIn in contact
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_ContactDetailsSection_Address_LinkedInOption_Textbox(String address)
	{
		waitForElementToDisplay(txt_EP_ContactDetailsSection_Address_LinkedInOption, this.elementLoadWaitTime);
		clearEditBox(txt_EP_ContactDetailsSection_Address_LinkedInOption);
		typeIn(txt_EP_ContactDetailsSection_Address_LinkedInOption, address);
	}	
	/**
	 *This method is used to enable the radio of uniteSuite.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_ContactDetailsSection_UnitorSuite_HatcherOption_RadioButton()
	{
		clickOn(rdb_EP_ContactDetailsSection_UnitSuite_HatcherOption);
	}
	/**
	 *This method is used to enter the uniteSuite in hatcher
	 *@param unitorSuite
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_ContactDetailsSection_UnitorSuite_HatcherOption_Textbox(String unitorSuite)
	{
		waitForElementToDisplay(txt_EP_ContactDetailsSection_UnitSuite_HatcherOption, this.elementLoadWaitTime);
		clearEditBox(txt_EP_ContactDetailsSection_UnitSuite_HatcherOption);
		typeIn(txt_EP_ContactDetailsSection_UnitSuite_HatcherOption, unitorSuite);
	}	
	/**
	 *This method is used to enable unitorSuite.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_ContactDetailsSection_UnitorSuite_ClearbitOption_RadioButton()
	{
		clickOn(rdb_EP_ContactDetailsSection_UnitSuite_ClearbitOption);
	}
	/**
	 *This method is used to enter the clearbit unitorsuite
	 *@param unitorsuite
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_ContactDetailsSection_UnitorSuite_ClearbitOption_Textbox(String unitorSuite)
	{
		waitForElementToDisplay(txt_EP_ContactDetailsSection_UnitSuite_ClearbitOption, this.elementLoadWaitTime);
		clearEditBox(txt_EP_ContactDetailsSection_UnitSuite_ClearbitOption);
		typeIn(txt_EP_ContactDetailsSection_UnitSuite_ClearbitOption, unitorSuite);
	}
	/**
	 *This method is used to enable city for hatcher
	 *
	 *
	 *@author VijayaKumar.U
	 */
	public void click_ContactDetailsSection_City_HatcherOption_RadioButton()
	{
		clickOn(rdb_EP_ContactDetailsSection_City_HatcherOption);
	}
	/**
	 *This method is used to enter the city details
	 *@param city
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_ContactDetailsSection_City_HatcherOption_Textbox(String city)
	{
		waitForElementToDisplay(txt_EP_ContactDetailsSection_City_HatcherOption, this.elementLoadWaitTime);
		clearEditBox(txt_EP_ContactDetailsSection_City_HatcherOption);
		typeIn(txt_EP_ContactDetailsSection_City_HatcherOption, city);
	}	
	/**
	 *This method is used to enablethe city radio buttons
	 *
	 *@author VijayaKumar.U
	 */
	public void click_ContactDetailsSection_City_ClearbitOption_RadioButton()
	{
		clickOn(rdb_EP_ContactDetailsSection_City_ClearbitOption);
	}
	/**
	 *This method is used to enter the clearbit city details
	 *@param city
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_ContactDetailsSection_City_ClearbitOption_Textbox(String city)
	{
		waitForElementToDisplay(txt_EP_ContactDetailsSection_City_ClearbitOption, this.elementLoadWaitTime);
		clearEditBox(txt_EP_ContactDetailsSection_City_ClearbitOption);
		typeIn(txt_EP_ContactDetailsSection_City_ClearbitOption, city);
	}	
	/**
	 *This method is used to enable radio of city in LinkedIn option
	 *
	 *@author VijayaKumar.U
	 */
	public void click_ContactDetailsSection_City_LinkedInOption_RadioButton()
	{
		clickOn(rdb_EP_ContactDetailsSection_City_LinkedInOption);
	}
	/**
	 *This method is used to enter the city.
	 *
	 *@city
	 *@author VijayaKumar.U
	 */
	public void enter_ContactDetailsSection_City_LinkedInOption_Textbox(String city)
	{
		waitForElementToDisplay(txt_EP_ContactDetailsSection_City_LinkedInOption, this.elementLoadWaitTime);
		clearEditBox(txt_EP_ContactDetailsSection_City_LinkedInOption);
		typeIn(txt_EP_ContactDetailsSection_City_LinkedInOption, city);
	}	
	/**
	 *This method is used to enable the Postal code radio button
	 *
	 *@author VijayaKumar.U
	 */
	public void click_ContactDetailsSection_PostalCode_HatcherOption()
	{
		clickOn(rdb_EP_ContactDetailsSection_PostalCode_HatcherOption);
	}
	/**
	 *This method is used to enter the Postal code 
	 *@param postalcode
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_ContactDetailsSection_PostalCode_HatcherOption_Textbox(String postalCode)
	{
		waitForElementToDisplay(txt_EP_ContactDetailsSection_PostalCode_HatcherOption, this.elementLoadWaitTime);
		clearEditBox(txt_EP_ContactDetailsSection_PostalCode_HatcherOption);
		typeIn(txt_EP_ContactDetailsSection_PostalCode_HatcherOption, postalCode);
	}	
	/**
	 *This method is used to enable the postalcode radio for clearbit
	 *
	 *@author VijayaKumar.U
	 */
	public void click_ContactDetailsSection_PostalCode_ClearbitOption_RadioButton()
	{
		clickOn(rdb_EP_ContactDetailsSection_PostalCode_ClearbitOption);
	}
	/**
	 *This method is used to enter the postal code for clearbit
	 *@param postalcode
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_ContactDetailsSection_PostalCode_ClearbitOption_Textbox(String postalCode)
	{
		waitForElementToDisplay(txt_EP_ContactDetailsSection_PostalCode_ClearbitOption, this.elementLoadWaitTime);
		clearEditBox(txt_EP_ContactDetailsSection_PostalCode_ClearbitOption);
		typeIn(txt_EP_ContactDetailsSection_PostalCode_ClearbitOption, postalCode);
	}	
	/**
	 *This method is used to enable the postal code for linkedIn
	 *
	 *@author VijayaKumar.U
	 */
	public void click_ContactDetailsSection_PostalCode_LinkedInOption_RadioButton()
	{
		clickOn(rdb_EP_ContactDetailsSection_PostalCode_LinkedInOption);
	}
	/**
	 *This method is used to enter the postal code 
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_ContactDetailsSection_PostalCode_LinkedInOption_Textbox(String postalCode)
	{
		waitForElementToDisplay(txt_EP_ContactDetailsSection_PostalCode_LinkedInOption, this.elementLoadWaitTime);
		clearEditBox(txt_EP_ContactDetailsSection_PostalCode_LinkedInOption);
		typeIn(txt_EP_ContactDetailsSection_PostalCode_LinkedInOption, postalCode);
	}	
	/**
	 *This method is used to enable the state radio button under hatcher
	 *
	 *@author VijayaKumar.U
	 */
	public void click_ContactDetailsSection_State_HatcherOption_RadioButton()
	{
		clickOn(rdb_EP_ContactDetailsSection_State_HatcherOption);
	}
	/**
	 *This method is used to enter the state details
	 *@param state
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_ContactDetailsSection_State_HatcherOption_Textbox(String state)
	{
		waitForElementToDisplay(txt_EP_ContactDetailsSection_State_HatcherOption, this.elementLoadWaitTime);
		clearEditBox(txt_EP_ContactDetailsSection_State_HatcherOption);
		typeIn(txt_EP_ContactDetailsSection_State_HatcherOption, state);
	}	
	/**
	 *This method is used to enable the state radio button for clearbit 
	 *
	 *@author VijayaKumar.U
	 */
	public void click_ContactDetailsSection_State_ClearbitOption_RadioButton()
	{
		clickOn(rdb_EP_ContactDetailsSection_State_ClearbitOption);
	}
	/**
	 *This method is used to enter the state details
	 *@param state
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_ContactDetailsSection_State_ClearbitOption_Textbox(String state)
	{
		waitForElementToDisplay(txt_EP_ContactDetailsSection_State_ClearbitOption, this.elementLoadWaitTime);
		clearEditBox(txt_EP_ContactDetailsSection_State_ClearbitOption);
		typeIn(txt_EP_ContactDetailsSection_State_ClearbitOption, state);
	}	

	/**
	 *This method is used to enable the country for hatcher
	 *
	 *@author VijayaKumar.U
	 */
	public void click_ContactDetailsSection_Country_HatcherOption_RadioButton()
	{
		clickOn(rdb_EP_ContactDetailsSection_Country_HatcherOption);
	}
	/**
	 *This method is used to select the country details
	 *@param country
	 *
	 *@author VijayaKumar.U
	 */
	public void select_ContactDetailsSection_Country_HatcherOption(String country)
	{
		waitForElementToDisplay(drp_EP_ContactDetailsSection_Country_HatcherOption, this.elementLoadWaitTime);
		clickOn(drp_EP_ContactDetailsSection_Country_HatcherOption);
		waitTime(1);
		typeIn(txt_EP_ContactDetailsSection_Country_HatcherOption, country);
		waitTime(1);

		List <WebElement> optlst = driver.findElements(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='Country']/parent::div/following-sibling::div//label[contains(text(),'Hatcher')]//parent::div//ul[contains(@class,'multiselect__content')]//li//span//span"));
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
	}
	/**
	 *This method is used to display error message when country is not selected
	 *
	 *@author VijayaKumar.U
	 */
	public void select_ContactSection_Country_elementNotFound_errorMessage_Displayed(String governingBody)
	{
		waitForElementToDisplay(drp_EP_ContactDetailsSection_Country_HatcherOption, this.elementLoadWaitTime);
		clickOn(drp_EP_ContactDetailsSection_Country_HatcherOption);
		waitTime(1);
		typeIn(txt_EP_ContactDetailsSection_Country_HatcherOption, governingBody);
		waitTime(1);
		if (isElementDisplayed(lbl_CompanyProfilePage_EditProfilePage_ContactDetailsSection_Country_HatcherOption_Textbox_elementNotFoud_errorMessage)) 
		{
			testStepPassed("No elements found. Consider changing the search query message is displayed for Country Dropdown");
			clickOn(lbl_CompanyProfilePage_EditProfilePage_ContactDetailsSection);
		} 
		else 
		{
			testStepFailed("No elements found. Consider changing the search query message is not displayed Country Dropdown");
		}
	}
	/**
	 *This method is used to enable the country radio button for clearbit
	 *
	 *@author VijayaKumar.U
	 */
	public void click_ContactDetailsSection_Country_ClearbitOption_RadioButton()
	{
		clickOn(rdb_EP_ContactDetailsSection_Country_ClearbitOption);
	}
	/**
	 *This method is used to select the country for clearbit
	 *@param country
	 *
	 *@author VijayaKumar.U
	 */
	public void select_ContactDetailsSection_Country_ClearbitOption(String country)
	{
		waitForElementToDisplay(drp_EP_ContactDetailsSection_Country_ClearbitOption, this.elementLoadWaitTime);
		clickOn(drp_EP_ContactDetailsSection_Country_ClearbitOption);
		waitTime(1);
		typeIn(txt_EP_ContactDetailsSection_Country_ClearbitOption, country);
		waitTime(1);

		List <WebElement> optlst = driver.findElements(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='Country']/parent::div/following-sibling::div//label[contains(text(),'Clearbit')]//parent::div//ul[contains(@class,'multiselect__content')]//li//span//span"));
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
	}
	/**
	 *This method is used to enable the radio button of linkedIn in Contact details.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_ContactDetailsSection_Country_LinkedInOption_RadioButton()
	{
		try {
			clickOn(rdb_EP_ContactDetailsSection_Country_LinkedInOption);
		}
		catch (Exception e){
			testStepFailed("Element is not displayed."+e.getClass());
		}}	
	/**
	 *This method is used to select the country in LinkedIn of the Contact details.
	 *
	 *@param country
	 *@author VijayaKumar.U
	 */
	public void select_ContactDetailsSection_Country_LinkedInOption(String country)
	{
		try{

			waitForElementToDisplay(drp_EP_ContactDetailsSection_Country_LinkedInOption, this.elementLoadWaitTime);
			clickOn(drp_EP_ContactDetailsSection_Country_LinkedInOption);
			waitTime(1);
			typeIn(txt_EP_ContactDetailsSection_Country_LinkedInOption, country);
			waitTime(1);

			List <WebElement> optlst = driver.findElements(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='Country']/parent::div/following-sibling::div//label[contains(text(),'LinkedIn')]//parent::div//ul[contains(@class,'multiselect__content')]//li//span//span"));
			int optlstcount = optlst.size();

			for (WebElement opt : optlst) 
			{
				String text = opt.getText();
				if (text.equalsIgnoreCase(country)) 
				{
					opt.click();
					break;
				}	}	}
		catch (Exception e){
			testStepFailed("Couldnot select the option."+e.getClass());
		}}
	/**
	 *This method is used to enable radio button of the latitude in Contact details .
	 *
	 *@author VijayaKumar.U
	 */
	public void click_ContactDetailsSection_Latitude_HatcherOption_RadioButton()
	{
		try {
			if(isElementDisplayed(rdb_EP_ContactDetailsSection_Latitude_HatcherOption)){
				clickOn(rdb_EP_ContactDetailsSection_Latitude_HatcherOption);
			}
			else {
				testStepFailed(" not displayed.");
			}}

		catch (Exception e){
			testStepFailed("Couldnot enable the Latitube radio element."+e.getClass());
		}}
	/**
	 *This method is used to enter the latitude in the contact detail section.
	 *@param latitude
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_ContactDetailsSection_Latitude_HatcherOption_Textbox(String latitude)
	{
		try {
			waitForElementToDisplay(txt_EP_ContactDetailsSection_Latitude_HatcherOption, this.elementLoadWaitTime);
			clearEditBox(txt_EP_ContactDetailsSection_Latitude_HatcherOption);
			typeIn(txt_EP_ContactDetailsSection_Latitude_HatcherOption, latitude);
		}
		catch (Exception e){
			testStepFailed("Couldnot select the option."+e.getClass());
		}}
	/**
	 *This method is used to enable the latitude radio for clearbit
	 *
	 *@author VijayaKumar.U
	 */
	public void click_ContactDetailsSection_Latitude_ClearbitOption_RadioButton()
	{
		clickOn(rdb_EP_ContactDetailsSection_Latitude_ClearbitOption);
	}
	/**
	 *This method is used to enter the latitude details
	 *@param latitude
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_ContactDetailsSection_Latitude_ClearbitOption_Textbox(String latitude)
	{
		waitForElementToDisplay(txt_EP_ContactDetailsSection_Latitude_ClearbitOption, this.elementLoadWaitTime);
		clearEditBox(txt_EP_ContactDetailsSection_Latitude_ClearbitOption);
		typeIn(txt_EP_ContactDetailsSection_Latitude_ClearbitOption, latitude);
	}	
	/**
	 *This method is used to enable the radio button for longitude
	 *
	 *@author VijayaKumar.U
	 */
	public void click_ContactDetailsSection_Longitude_HatcherOption_RadioButton()
	{
		clickOn(rdb_EP_ContactDetailsSection_Longitude_HatcherOption);
	}
	/**
	 *This method is used to enter the logitude details
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_ContactDetailsSection_Longitude_HatcherOption_Textbox(String longitude)
	{
		waitForElementToDisplay(txt_EP_ContactDetailsSection_Longitude_HatcherOption, this.elementLoadWaitTime);
		clearEditBox(txt_EP_ContactDetailsSection_Longitude_HatcherOption);
		typeIn(txt_EP_ContactDetailsSection_Longitude_HatcherOption, longitude);
	}	
	/**
	 *This method is used to enable the radio button for longitude
	 *
	 *@author VijayaKumar.U
	 */
	public void click_ContactDetailsSection_Longitude_ClearbitOption_RadioButton()
	{
		clickOn(rdb_CompanyProfilePage_EditProfilePage_ContactDetailsSection_Longitude_ClearbitOption_RadioButton);
	}
	/**
	 *This method is used to enter the longitude details in clearbit 
	 *@param longitude
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_ContactDetailsSection_Longitude_ClearbitOption_Textbox(String longitude)
	{
		waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_ContactDetailsSection_Longitude_ClearbitOption_Textbox, this.elementLoadWaitTime);
		clearEditBox(txt_CompanyProfilePage_EditProfilePage_ContactDetailsSection_Longitude_ClearbitOption_Textbox);
		typeIn(txt_CompanyProfilePage_EditProfilePage_ContactDetailsSection_Longitude_ClearbitOption_Textbox, longitude);
	}	
	/**
	 *This method is used to enable the company email for hatcher
	 *
	 *@author VijayaKumar.U
	 */
	public void click_ContactDetailsSection_CompanyEmail_HatcherOption_RadioButton()
	{
		clickOn(rdb_CompanyProfilePage_EditProfilePage_ContactDetailsSection_CompanyEmail_HatcherOption_RadioButton);
	}
	/**
	 *This method is used to enter the company email .
	 *@param companyEmail
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_ContactDetailsSection_CompanyEmail_HatcherOption_Textbox(String companyEmail)
	{
		waitForElementToDisplay(txt_EditProfilePage_ContactDetailsSection_CompanyEmail_HatcherOption, this.elementLoadWaitTime);
		clearEditBox(txt_EditProfilePage_ContactDetailsSection_CompanyEmail_HatcherOption);
		typeIn(txt_EditProfilePage_ContactDetailsSection_CompanyEmail_HatcherOption, companyEmail);
	}	
	/**
	 *This method is used to enable the phone for hatcher
	 *
	 *@author VijayaKumar.U
	 */
	public void click_ContactDetailsSection_Phone_Hatcher_RadioButton()
	{
		clickOn(rdb_EditProfilePage_ContactDetailsSection_Phone_HatcherOption);
	}
	/**
	 *This method is used to enter the phone details in contact details 
	 *@param phone
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_ContactDetailsSection_Phone(String phone)
	{
		waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_ContactDetailsSection_Phone_HatcherOption_Textbox, this.elementLoadWaitTime);
		clearEditBox(txt_CompanyProfilePage_EditProfilePage_ContactDetailsSection_Phone_HatcherOption_Textbox);
		typeIn(txt_CompanyProfilePage_EditProfilePage_ContactDetailsSection_Phone_HatcherOption_Textbox, phone);
	}
	/**
	 *This method is used to save the changes done 
	 *
	 *@author VijayaKumar.U
	 */
	public void click_ContactDetailsSection_SaveChanges_Button()
	{
		clickOn(btn_CompanyProfilePage_EditProfilePage_ContactDetailsSection_SaveChanges);
	}

	/********************************************************************************************************************************************************/	
	/**
	 *This method is used to enable the description for hatcher
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DescriptionSection_Description_HatcherOption_RadioButton()
	{
		clickOn(rdb_CompanyProfilePage_EditProfilePage_DescriptionSection_Description_HatcherOption_RadioButton);
	}
	/**
	 *This method is used to enter the company former name
	 *@param company Former name
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_DescriptionSection_RegistrationNumber_HatcherOption_Textbox(String companyFormerName)
	{
		waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_DescriptionSection_Description_HatcherOption_Textbox, this.elementLoadWaitTime);
		clearEditBox(txt_CompanyProfilePage_EditProfilePage_DescriptionSection_Description_HatcherOption_Textbox);
		typeIn(txt_CompanyProfilePage_EditProfilePage_DescriptionSection_Description_HatcherOption_Textbox, companyFormerName);
	}
	/**
	 *This method is used to enable radio button for description of clearbit
	 *
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DescriptionSection_Description_ClearbitOption_RadioButton()
	{
		clickOn(rdb_CompanyProfilePage_EditProfilePage_DescriptionSection_Description_ClearbitOption_RadioButton);
	}
	/**
	 *This method is used to enter the registration number
	 *@param companyFormerName
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_DescriptionSection_RegistrationNumber_ClearbitOption_Textbox(String companyFormerName)
	{
		waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_DescriptionSection_Description_ClearbitOption_Textbox, this.elementLoadWaitTime);
		clearEditBox(txt_CompanyProfilePage_EditProfilePage_DescriptionSection_Description_ClearbitOption_Textbox);
		typeIn(txt_CompanyProfilePage_EditProfilePage_DescriptionSection_Description_ClearbitOption_Textbox, companyFormerName);
	}
	/**
	 *This method is used to enable the twitter
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DescriptionSection_Description_TwitterOption_RadioButton()
	{
		clickOn(rdb_CompanyProfilePage_EditProfilePage_DescriptionSection_Description_TwitterOption_RadioButton);
	}
	/**
	 *This method is used to enable the description for twitter
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_DescriptionSection_RegistrationNumber_TwitterOption_Textbox(String companyFormerName)
	{
		waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_DescriptionSection_Description_TwitterOption_Textbox, this.elementLoadWaitTime);
		clearEditBox(txt_CompanyProfilePage_EditProfilePage_DescriptionSection_Description_TwitterOption_Textbox);
		typeIn(txt_CompanyProfilePage_EditProfilePage_DescriptionSection_Description_TwitterOption_Textbox, companyFormerName);
	}
	/**
	 *This method is used to enable radio button of linkedIn
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DescriptionSection_Description_LinkedInOption_RadioButton()
	{
		clickOn(rdb_CompanyProfilePage_EditProfilePage_DescriptionSection_Description_LinkedInOption_RadioButton);
	}
	/**
	 *This method is used to enter the registration number input data.
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_DescriptionSection_RegistrationNumber_LinkedInOption_Textbox(String companyFormerName)
	{
		waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_DescriptionSection_Description_LinkedInOption_Textbox, this.elementLoadWaitTime);
		clearEditBox(txt_CompanyProfilePage_EditProfilePage_DescriptionSection_Description_LinkedInOption_Textbox);
		typeIn(txt_CompanyProfilePage_EditProfilePage_DescriptionSection_Description_LinkedInOption_Textbox, companyFormerName);
	}
	/**
	 *This method is used to save the changes in description section
	 *
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DescriptionSection_SaveChanges_Button()
	{
		clickOn(btn_CompanyProfilePage_EditProfilePage_DescriptionSection_SaveChanges);
	}

	/********************************************************************************************************************************************************/
	/**
	 *This method is used to enable radio button of digital foot print section crunchbase.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DigitalFootPrintSection_Crunchbase_HatcherOption_RadioButton()
	{
		clickOn(rdb_EP_DigitalFootPrintSection_Crunchbase_HatcherOption);
	}
	/**
	 *This method is used to enter the data for the crunch base of digital foot print section.
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_DigitalFootPrintSection_Crunchbase_HatcherOption_Textbox(String crunchbase)
	{
		waitForElementToDisplay(txt_EP_DigitalFootPrintSection_Crunchbase_HatcherOption, this.elementLoadWaitTime);
		clearEditBox(txt_EP_DigitalFootPrintSection_Crunchbase_HatcherOption);
		typeIn(txt_EP_DigitalFootPrintSection_Crunchbase_HatcherOption, crunchbase);
	}
	/**
	 *This method is used to enable radio button of clearbit option in the respective section.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DigitalFootPrintSection_Crunchbase_ClearbitOption_RadioButton()
	{
		clickOn(rdb_EP_DigitalFootPrintSection_Crunchbase_ClearbitOption);
	}
	/**
	 *This method is used to enter the data for the crunch base of clear bit.
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_DigitalFootPrintSection_Crunchbase_ClearbitOption_Textbox(String crunchbase)
	{
		waitForElementToDisplay(txt_EP_DigitalFootPrintSection_Crunchbase_ClearbitOption, this.elementLoadWaitTime);
		clearEditBox(txt_EP_DigitalFootPrintSection_Crunchbase_ClearbitOption);
		typeIn(txt_EP_DigitalFootPrintSection_Crunchbase_ClearbitOption, crunchbase);
	}
	/**
	 *This method is used to enable the facebook radio button
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DigitalFootPrintSection_Facebook_HatcherOption_RadioButton()
	{
		clickOn(rdb_EP_DigitalFootPrintSection_Facebook_HatcherOption);
	}
	/**
	 *This method is used to enter the data for facebook of hatcher option
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_DigitalFootPrintSection_Facebook_HatcherOption_Textbox(String facebook)
	{
		waitForElementToDisplay(txt_EP_DigitalFootPrintSection_Facebook_HatcherOption, this.elementLoadWaitTime);
		clearEditBox(txt_EP_DigitalFootPrintSection_Facebook_HatcherOption);
		typeIn(txt_EP_DigitalFootPrintSection_Facebook_HatcherOption, facebook);
	}
	/**
	 *This method is used to enable the clearbit radio for facebook.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DigitalFootPrintSection_Facebook_ClearbitOption_RadioButton()
	{
		clickOn(rdb_EP_DigitalFootPrintSection_Facebook_ClearbitOption);
	}
	/**
	 *This method is used to enter the facebook details for clearbit
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_DigitalFootPrintSection_Facebook_ClearbitOption_Textbox(String facebook)
	{
		waitForElementToDisplay(txt_EP_DigitalFootPrintSection_Facebook_ClearbitOption, this.elementLoadWaitTime);
		clearEditBox(txt_EP_DigitalFootPrintSection_Facebook_ClearbitOption);
		typeIn(txt_EP_DigitalFootPrintSection_Facebook_ClearbitOption, facebook);
	}
	/**
	 *This method is used to enable the instagram radio for hatcher option.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DigitalFootPrintSection_Instagram_HatcherOption_RadioButton()
	{
		clickOn(rdb_EP_DigitalFootPrintSection_Instagram_HatcherOption);
	}
	/**
	 *This method is used to enter the instagram details for hatcher option
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_DigitalFootPrintSection_Instagram_HatcherOption_Textbox(String instagram)
	{
		waitForElementToDisplay(txt_EP_DigitalFootPrintSection_Instagram_HatcherOption, this.elementLoadWaitTime);
		clearEditBox(txt_EP_DigitalFootPrintSection_Instagram_HatcherOption);
		typeIn(txt_EP_DigitalFootPrintSection_Instagram_HatcherOption, instagram);
	}
	/**
	 *This method is used to enable the angelist radio button.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DigitalFootPrintSection_Angellist_HatcherOption_RadioButton()
	{
		clickOn(rdb_EP_DigitalFootPrintSection_Angellist_HatcherOption);
	}
	/**
	 *This method is used to enter the details foe angel list of the hatcher option.
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_DigitalFootPrintSection_Angellist_HatcherOption_Textbox(String angellist)
	{
		waitForElementToDisplay(txt_EP_DigitalFootPrintSection_Angellist_HatcherOption, this.elementLoadWaitTime);
		clearEditBox(txt_EP_DigitalFootPrintSection_Angellist_HatcherOption);
		typeIn(txt_EP_DigitalFootPrintSection_Angellist_HatcherOption, angellist);
	}
	/**
	 *This method is used to enable the radio button of the hatcher option in Digital Foot print medium.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DigitalFootPrintSection_Medium_HatcherOption_RadioButton()
	{
		clickOn(rdb_EP_DigitalFootPrintSection_Medium_HatcherOption);
	}
	/**
	 *This method is used to enter inputs in DigitalFootPrintSection Medium HatcherOption.
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_DigitalFootPrintSection_Medium_HatcherOption_Textbox(String medium)
	{
		waitForElementToDisplay(txt_EP_DigitalFootPrintSection_Medium_HatcherOption, this.elementLoadWaitTime);
		clearEditBox(txt_EP_DigitalFootPrintSection_Medium_HatcherOption);
		typeIn(txt_EP_DigitalFootPrintSection_Medium_HatcherOption, medium);
	}
	/**
	 *This method is used to enable radio button of the hatcher option in digital footprint.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DigitalFootPrintSection_LinkedIn_HatcherOption_RadioButton()
	{
		clickOn(rdb_EP_DigitalFootPrintSection_LinkedIn_HatcherOption);
	}
	/**
	 *This method is used to edit the Text data of LinkedIn -Digital footprint
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_DigitalFootPrintSection_LinkedIn_HatcherOption_Textbox(String linkedIn)
	{
		waitForElementToDisplay(txt_EP_DigitalFootPrintSection_LinkedIn_HatcherOption, this.elementLoadWaitTime);
		clearEditBox(txt_EP_DigitalFootPrintSection_LinkedIn_HatcherOption);
		typeIn(txt_EP_DigitalFootPrintSection_LinkedIn_HatcherOption, linkedIn);
	}
	/**
	 *This method is used to enable the radio button of LinkedIn - Digital Footprint.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DigitalFootPrintSection_LinkedIn_ClearbitOption_RadioButton()
	{
		clickOn(rdb_EditProfilePage_DigitalFootPrintSection_LinkedIn_ClearbitOption);
	}
	/**
	 *This method is used to edit and enter the LinkedIn details.
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_DigitalFootPrintSection_LinkedIn_ClearbitOption_Textbox(String linkedIn)
	{
		waitForElementToDisplay(txt_EditProfilePage_DigitalFootPrintSection_LinkedIn_ClearbitOption, this.elementLoadWaitTime);
		clearEditBox(txt_EditProfilePage_DigitalFootPrintSection_LinkedIn_ClearbitOption);
		typeIn(txt_EditProfilePage_DigitalFootPrintSection_LinkedIn_ClearbitOption, linkedIn);
	}
	/**
	 *This method is used to enable the Pinterest in the digital foot print section .
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DigitalFootPrintSection_Pinterest_HatcherOption_RadioButton()
	{
		clickOn(rdb_EditProfilePage_DigitalFootPrintSection_Pinterest_HatcherOption);
	}
	/**
	 *This method is used to enter the Digital Footprint section.
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_DigitalFootPrintSection_PinterestHatcherOption_Textbox(String pinterest)
	{
		waitForElementToDisplay(txt_EditProfilePage_DigitalFootPrintSection_Pinterest_HatcherOption, this.elementLoadWaitTime);
		clearEditBox(txt_EditProfilePage_DigitalFootPrintSection_Pinterest_HatcherOption);
		typeIn(txt_EditProfilePage_DigitalFootPrintSection_Pinterest_HatcherOption, pinterest);
	}
	/**
	 *This method is used to click the radio button for RSSFeed.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DigitalFootPrintSection_RSSFeed_HatcherOption_RadioButton()
	{
		clickOn(rdb_EditProfilePage_DigitalFootPrintSection_RSSFeed_HatcherOption);
	}
	/**
	 *This method is used to enter the data for RSSFeed for hatcher option
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_DigitalFootPrintSection_RSSFeed_HatcherOption_Textbox(String rSSFeed)
	{
		waitForElementToDisplay(txt_EditProfilePage_DigitalFootPrintSection_RSSFeed_HatcherOption, this.elementLoadWaitTime);
		clearEditBox(txt_EditProfilePage_DigitalFootPrintSection_RSSFeed_HatcherOption);
		typeIn(txt_EditProfilePage_DigitalFootPrintSection_RSSFeed_HatcherOption, rSSFeed);
	}
	/**
	 *This method is used to enable the twitter option.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DigitalFootPrintSection_Twitter_HatcherOption_RadioButton()
	{
		clickOn(rdb_EP_DigitalFootPrintSection_Twitter_HatcherOption);
	}
	/**
	 *This method is used to enter the twitter details foe digital foot print
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_DigitalFootPrintSection_Twitter_HatcherOption_Texbox(String twitter)
	{
		waitForElementToDisplay(txt_EP_DigitalFootPrintSection_Twitter_HatcherOption, this.elementLoadWaitTime);
		clearEditBox(txt_EP_DigitalFootPrintSection_Twitter_HatcherOption);
		typeIn(txt_EP_DigitalFootPrintSection_Twitter_HatcherOption, twitter);
	}
	/**
	 *This method is used to enable the radio button of digital foot print.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DigitalFootPrintSection_Twitter_ClearbitOption_RadioButton()
	{
		clickOn(rdb_EP_DigitalFootPrintSection_Twitter_ClearbitOption);
	}
	/**
	 *This method is used to enter the inputd for twitter
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_DigitalFootPrintSection_Twitter_ClearbitOption_Texbox(String twitter)
	{
		waitForElementToDisplay(txt_EP_DigitalFootPrintSection_Twitter_ClearbitOption, this.elementLoadWaitTime);
		clearEditBox(txt_EP_DigitalFootPrintSection_Twitter_ClearbitOption);
		typeIn(txt_EP_DigitalFootPrintSection_Twitter_ClearbitOption, twitter);
	}
	/**
	 *This method is used to enable radio of vimeo in digital footprint
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DigitalFootPrintSection_Vimeo_HatcherOption_RadioButton()
	{
		clickOn(rdb_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_Vimeo_HatcherOption_RadioButton);
	}
	/**
	 *This method is used to enter the vimeo details in appropriate text box
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_DigitalFootPrintSection_Vimeo_HatcherOption_Textbox(String vimeo)
	{
		waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_Vimeo_HatcherOption_Textbox, this.elementLoadWaitTime);
		clearEditBox(txt_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_Vimeo_HatcherOption_Textbox);
		typeIn(txt_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_Vimeo_HatcherOption_Textbox, vimeo);
	}
	/**
	 *This method is used to enable the website option.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DigitalFootPrintSection_Website_HatcherOption_RadioButton()
	{
		clickOn(rdb_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_Website_HatcherOption_RadioButton);
	}
	/**
	 *This method is used to enter the website details in the appropriate textbox
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_DigitalFootPrintSection_Website_HatcherOption_Textbox(String website)
	{
		waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_Website_HatcherOption_Textbox, this.elementLoadWaitTime);
		clearEditBox(txt_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_Website_HatcherOption_Textbox);
		typeIn(txt_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_Website_HatcherOption_Textbox, website);
	}
	/**
	 *This method is used to enable the radio buton for website of clearbit 
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DigitalFootPrintSection_Website_ClearbitOption_RadioButton()
	{
		clickOn(rdb_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_Website_ClearbitOption_RadioButton);
	}
	/**
	 *This method is used to enter the website inputs of clearbit
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_DigitalFootPrintSection_Website_ClearbitOption_Textbox(String website)
	{
		waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_Website_ClearbitOption_Textbox, this.elementLoadWaitTime);
		clearEditBox(txt_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_Website_ClearbitOption_Textbox);
		typeIn(txt_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_Website_ClearbitOption_Textbox, website);
	}
	/**
	This method is used to enable the radio button for MOZO option in website.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DigitalFootPrintSection_Website_MOZOption_RadioButton()
	{
		clickOn(rdb_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_Website_MOZOption_RadioButton);
	}

	/**
	 *This method is used to enter the Website details of MOZO option
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_DigitalFootPrintSection_Website_MOZOption_Textbox(String website)
	{
		waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_Website_MOZOption_Textbox, this.elementLoadWaitTime);
		clearEditBox(txt_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_Website_MOZOption_Textbox);
		typeIn(txt_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_Website_MOZOption_Textbox, website);
	}
	/**
	 *This method is used to enable the radio button of yutube.
	 *
	 *@author VijayaKumar.U
	 */

	public void click_DigitalFootPrintSection_YouTube_Hatcher_RadioButton()
	{
		clickOn(rdb_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_YouTube_HatcherOption_RadioButton);
	}
	/**
	 *This method is used to enter the details of youtube in the digital foot print
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_DigitalFootPrintSection_YouTube(String youTube)
	{
		waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_YouTube_HatcherOption_Textbox, this.elementLoadWaitTime);
		clearEditBox(txt_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_YouTube_HatcherOption_Textbox);
		typeIn(txt_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_YouTube_HatcherOption_Textbox, youTube);
	}
	/**
	 *This method is used to save the changes in digital footprint section
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DigitalFootPrintSection_SaveChanges_Button()
	{
		clickOn(btn_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_SaveChanges);
	}

	/********************************************************************************************************************************************************/
	/**
	 *This method is used to enable auditor radio for finance and legal section
	 *
	 *@author VijayaKumar.U
	 */
	public void click_FinanceandLegalSection_Auditor_Hatcher_RadioButton()
	{
		clickOn(rdb_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_Auditor_HatcherOption_RadioButton);
	}
	/**
	 *This method is used to enter the auditor details for finance and legal section
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_FinanceandLegalSection_Auditor_HatcherOption_Textbox(String auditor)
	{
		waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_Auditor_HatcherOption_Textbox, this.elementLoadWaitTime);
		clearEditBox(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_Auditor_HatcherOption_Textbox);
		typeIn(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_Auditor_HatcherOption_Textbox, auditor);
	}
	/**
	 *This method is used to enable bank radio button for finance and legal section
	 *
	 *@author VijayaKumar.U
	 */
	public void click_FinanceandLegalSection_Bank_HatcherOption_RadioButton()
	{
		clickOn(rdb_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_Bank_HatcherOption_RadioButton);
	}
	/**
	 *This method is used to enter the bank details for finance and legal section
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_FinanceandLegalSection_Bank_HatcherOption_Textbox(String bank)
	{
		waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_Bank_HatcherOption_Textbox, this.elementLoadWaitTime);
		clearEditBox(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_Bank_HatcherOption_Textbox);
		typeIn(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_Bank_HatcherOption_Textbox, bank);
	}
	/**
	 *This method is used to enable the bankABA number radio for finance and legal section
	 *
	 *@author VijayaKumar.U
	 */
	public void click_FinanceandLegalSection_BankABANumber_HatcherOption_RadioButton()
	{
		clickOn(rdb_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankABANumber_HatcherOption_RadioButton);
	}
	/**
	 *This method is used to enter the Bank ABA number for finance and legal section
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_FinanceandLegalSection_BankABANumber_HatcherOption_Textbox(String bankABANumber)
	{
		waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankABANumber_HatcherOption_Textbox, this.elementLoadWaitTime);
		clearEditBox(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankABANumber_HatcherOption_Textbox);
		typeIn(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankABANumber_HatcherOption_Textbox, bankABANumber);
	}
	/**
	 *This method is used to enable the bank aCC number for finance and legal section
	 *
	 *@author VijayaKumar.U
	 */
	public void click_FinanceandLegalSection_BankAccountName_HatcherOption_RadioButton()
	{
		clickOn(rdb_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankAccountName_HatcherOption_RadioButton);
	}
	/**
	 *This method is used to enter the bank ACc number for finance and legal section.
	 *@param bankAccountName
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_FinanceandLegalSection_BankAccountName_HatcherOption_Textbox(String bankAccountName)
	{
		waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankAccountName_HatcherOption_Textbox, this.elementLoadWaitTime);
		clearEditBox(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankAccountName_HatcherOption_Textbox);
		typeIn(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankAccountName_HatcherOption_Textbox, bankAccountName);
	}
	/**
	 *This method is used to enable radio for the bank acc number
	 *
	 *@author VijayaKumar.U
	 */
	public void click_FinanceandLegalSection_BankAccountNumber_HatcherOption_RadioButton()
	{
		clickOn(rdb_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankAccountNumber_HatcherOption_RadioButton);
	}
	/**
	 *This method is used to enter the bank ACC number for finance and legal section
	 *@param bankAccountNumber
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_FinanceandLegalSection_BankAccountNumber_HatcherOption_Textbox(String bankAccountNumber)
	{
		waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankAccountNumber_HatcherOption_Textbox, this.elementLoadWaitTime);
		clearEditBox(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankAccountNumber_HatcherOption_Textbox);
		typeIn(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankAccountNumber_HatcherOption_Textbox, bankAccountNumber);
	}
	/**
	 *This method is used to enable bank address radio
	 *
	 *@author VijayaKumar.U
	 */
	public void click_FinanceandLegalSection_BankAddress_HatcherOption_RadioButton()
	{
		clickOn(rdb_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankAddress_HatcherOption_RadioButton);
	}
	/**
	 *This method is used to enable bankAddress for finance and legal section.
	 *@param bankAddress
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_FinanceandLegalSection_BankAddress_HatcherOption_Textbox(String bankAddress)
	{
		waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankAddress_HatcherOption_Textbox, this.elementLoadWaitTime);
		clearEditBox(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankAddress_HatcherOption_Textbox);
		typeIn(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankAddress_HatcherOption_Textbox, bankAddress);
	}
	/**
	 *This method is used to enable bank intermediary for FinanceandLegalSection.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_FinanceandLegalSection_BankIntermediary_HatcherOption_RadioButton()
	{
		clickOn(rdb_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankIntermediary_HatcherOption_RadioButton);
	}
	/**
	 *This method is used to enter the bank intermediary for FinanceandLegalSection 
	 *
	 *@param bankIntermediary
	 *@author VijayaKumar.U
	 */
	public void enter_FinanceandLegalSection_BankIntermediary_HatcherOption_Textbox(String bankIntermediary)
	{
		waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankIntermediary_HatcherOption_Textbox, this.elementLoadWaitTime);
		clearEditBox(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankIntermediary_HatcherOption_Textbox);
		typeIn(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankIntermediary_HatcherOption_Textbox, bankIntermediary);
	}
	/**
	 *This method is used to enable the Bank ABA Number for FinanceandLegalSection
	 *
	 *@author VijayaKumar.U
	 */
	public void click_FinanceandLegalSection_IntermediaryBankABANumber_HatcherOption_RadioButton()
	{
		clickOn(rdb_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_IntermediaryBankABANumber_HatcherOption_RadioButton);
	}
	/**
	 *This method is used to IntermediaryBankABANumber data into the FinanceandLegalSection.
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_FinanceandLegalSection_IntermediaryBankABANumber_HatcherOption_Textbox(String intermediaryBankABANumber)
	{
		waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_IntermediaryBankABANumber_HatcherOption_Textbox, this.elementLoadWaitTime);
		clearEditBox(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_IntermediaryBankABANumber_HatcherOption_Textbox);
		typeIn(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_IntermediaryBankABANumber_HatcherOption_Textbox, intermediaryBankABANumber);
	}
	/**
	 *This method is used to enable the radio for IntermediaryBankAddress in FinanceandLegalSection.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_FinanceandLegalSection_IntermediaryBankAddress_HatcherOption_RadioButton()
	{
		clickOn(rdb_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_IntermediaryBankAddress_HatcherOption_RadioButton);
	}
	/**
	 *This method is used to enter IntermediaryBankAddress for finance and legal section.
	 *@param intermediaryBankAddress
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_FinanceandLegalSection_IntermediaryBankAddress_HatcherOption_Textbox(String intermediaryBankAddress)
	{
		waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_IntermediaryBankAddress_HatcherOption_Textbox, this.elementLoadWaitTime);
		clearEditBox(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_IntermediaryBankAddress_HatcherOption_Textbox);
		typeIn(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_IntermediaryBankAddress_HatcherOption_Textbox, intermediaryBankAddress);
	}
	/**
	 *This method is used to enable the radio for IntermediaryBankSWIFTBIC for FinanceandLegalSection.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_FinanceandLegalSection_IntermediaryBankSWIFTBIC_HatcherOption_RadioButton()
	{
		clickOn(rdb_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_IntermediaryBankSWIFTBIC_HatcherOption_RadioButton);
	}
	/**
	 *This method is used to enter the intermediaryBankSWIFTBIC for finance and legal section
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_FinanceandLegalSection_IntermediaryBankSWIFTBIC_HatcherOption_Textbox(String intermediaryBankSWIFTBIC)
	{
		waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_IntermediaryBankSWIFTBIC_HatcherOption_Textbox, this.elementLoadWaitTime);
		clearEditBox(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_IntermediaryBankSWIFTBIC_HatcherOption_Textbox);
		typeIn(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_IntermediaryBankSWIFTBIC_HatcherOption_Textbox, intermediaryBankSWIFTBIC);
	}
	/**
	 *This method is used to enable radio button for bank swift code.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_FinanceandLegalSection_BankSwiftCode_HatcherOption_RadioButton()
	{
		clickOn(rdb_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankSwiftCode_HatcherOption_RadioButton);
	}
	/**
	 *This method is used to enter the bank seift code for finance and legal section.
	 *@param bankSwiftCode
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_FinanceandLegalSection_BankSwiftCode_HatcherOption_Textbox(String bankSwiftCode)
	{
		waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankSwiftCode_HatcherOption_Textbox, this.elementLoadWaitTime);
		clearEditBox(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankSwiftCode_HatcherOption_Textbox);
		typeIn(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankSwiftCode_HatcherOption_Textbox, bankSwiftCode);
	}
	/**
	 *This method is used to enable radio for Bank IBAN code .
	 *
	 *@author VijayaKumar.U
	 */
	public void click_FinanceandLegalSection_BankIBANCode_HatcherOption_RadioButton()
	{
		clickOn(rdb_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankIBANCode_HatcherOption_RadioButton);
	}
	/**
	 *This method is used to enter the BankIBAN Code for finance and legal section.
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_FinanceandLegalSection_BankIBANCode_HatcherOption_Textbox(String bankIBANCode)
	{
		waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankIBANCode_HatcherOption_Textbox, this.elementLoadWaitTime);
		clearEditBox(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankIBANCode_HatcherOption_Textbox);
		typeIn(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankIBANCode_HatcherOption_Textbox, bankIBANCode);
	}
	/**
	 *This method is used to enable radio for bank instruction
	 *
	 *@author VijayaKumar.U
	 */
	public void click_FinanceandLegalSection_BankInstructions_HatcherOption_RadioButton()
	{
		clickOn(rdb_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankInstructions_HatcherOption_RadioButton);
	}
	/**
	 *This method is used to enter the bank instruction for finance and legal section
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_FinanceandLegalSection_BankInstructions_HatcherOption_Textbox(String bankInstructions)
	{
		waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankInstructions_HatcherOption_Textbox, this.elementLoadWaitTime);
		clearEditBox(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankInstructions_HatcherOption_Textbox);
		typeIn(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankInstructions_HatcherOption_Textbox, bankInstructions);
	}
	/**
	 *This method is used to enable company Secretary for finance and legal section
	 *
	 *@author VijayaKumar.U
	 */
	public void click_FinanceandLegalSection_CompanySecretary_HatcherOption_RadioButton()
	{
		clickOn(rdb_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_CompanySecretary_HatcherOption_RadioButton);
	}
	/**
	 *This method is used to enter the company secretary for finance legal section
	 *
	 *@param companySecretary
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_FinanceandLegalSection_CompanySecretary_HatcherOption_Textbox(String companySecretary)
	{
		waitForElementToDisplay(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_CompanySecretary_HatcherOption_Textbox, this.elementLoadWaitTime);
		clearEditBox(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_CompanySecretary_HatcherOption_Textbox);
		typeIn(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_CompanySecretary_HatcherOption_Textbox, companySecretary);
	}
	/**
	 *This method is used to enable radio for currency in finance and legal section
	 *
	 *@author VijayaKumar.U
	 */
	public void click_FinanceandLegalSection_Currency_HatcherOption_RadioButton()
	{
		clickOn(rdb_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_Currency_HatcherOption_RadioButton);
	}
	/**
	 *This method is used to select the the currency in drop down for finance section
	 *
	 *@author VijayaKumar.U
	 */
	public void select_FinanceandLegalSection_Currency_HatcherOption_Dropdown(String currency)
	{
		waitForElementToDisplay(drp_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_Currency_HatcherOption_Dropdown, this.elementLoadWaitTime);
		selectFromDropdown(drp_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_Currency_HatcherOption_Dropdown, currency);
	}
	/**
	 *This method is used to enable the radio button for financial  year end
	 *
	 *@author VijayaKumar.U
	 */
	public void click_FinanceandLegalSection_FinancialYearEnd_HatcherOption_RadioButton()
	{
		clickOn(rdb_EP_FinanceandLegalSection_FinancialYearEnd_HatcherOption);
	}
	/**
	 *This method is used to select the FinancialYearEnd in drop down .
	 *
	 *@param FinancialYearEnd
	 *
	 *@author VijayaKumar.U
	 */
	public void select_FinanceandLegalSection_FinancialYearEnd_HatcherOption_Dropdown(String financialYearEnd)
	{
		waitForElementToDisplay(drp_EP_FinanceandLegalSection_FinancialYearEnd_HatcherOption, this.elementLoadWaitTime);
		selectFromDropdown(drp_EP_FinanceandLegalSection_FinancialYearEnd_HatcherOption, financialYearEnd);
	}
	/**
	 *This method is used to enable the law firm
	 *
	 *@author VijayaKumar.U
	 */
	public void click_FinanceandLegalSection_LawFirm_HatcherOption_RadioButton()
	{
		clickOn(rdb_EP_FinanceandLegalSection_LawFirm_HatcherOption);
	}
	/**
	 *This method is used to enter the lawFirm in Finance and legal section
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_FinanceandLegalSection_LawFirm_HatcherOption_Textbox(String lawFirm)
	{
		waitForElementToDisplay(txt_EP_FinanceandLegalSection_LawFirm_HatcherOption, this.elementLoadWaitTime);
		clearEditBox(txt_EP_FinanceandLegalSection_LawFirm_HatcherOption);
		typeIn(txt_EP_FinanceandLegalSection_LawFirm_HatcherOption, lawFirm);
	}
	/**
	 *This method is used to save changes in finance and legal section
	 *
	 *@author VijayaKumar.U
	 */
	public void click_FinanceandLegalSection_SaveChanges_Button()
	{
		clickOn(btn_EP_FinanceandLegalSection_SaveChanges);
	}

	/********************************************************************************************************************************************************/
	/**
	 *This method is used to enable in industry of radio button in industry section
	 *
	 *@author VijayaKumar.U
	 */
	public void click_IndustrySection_Industry_HatcherOption_RadioButton()	{
		clickOn(rdb_EP_IndustrySection_Industry_HatcherOption);
	}
	/**
	 *This method is used to select the industry in the section .
	 *
	 *@param industry
	 *
	 *@author VijayaKumar.U
	 */
	public void select_IndustrySection_Industry_HatcherOption_Textbox(String industry)	{
		waitForElementToDisplay(txt_EP_IndustrySection_Industry_HatcherOption, this.elementLoadWaitTime);
		typeIn(txt_EP_IndustrySection_Industry_HatcherOption, industry);
		waitTime(1);

		List <WebElement> optlst = driver.findElements(By.xpath("//span[contains(@class,'select2-results')]//li"));
		int optlstcount = optlst.size();

		for (WebElement opt : optlst) 		{
			String text = opt.getText();
			if (text.equalsIgnoreCase(industry)) 		{
				opt.click();
				break;
			}	}		}
	/**
	 *This method is used to save changes in the industry section.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_IndustrySection_SaveChanges_Button()	{
		clickOn(btn_EP_IndustrySection_SaveChanges);
	}
	/**
	 *This method is used to verify the industry display.
	 *
	 *@param industry
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_SelectedIndustry_displayed(String industry)	{
		List <WebElement> industries = driver.findElements(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'industry')]//input[contains(@type,'search')]/parent::li/preceding-sibling::li[contains(@class,'selection__choice')]"));
		int industriesCount = industries.size();
		try {
			if (industriesCount==2) {
				testStepPassed("New Added industry is updated successfully");
				String optionText = driver.findElement(By.xpath("(//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'industry')]//input[contains(@type,'search')]/parent::li/preceding-sibling::li[contains(@class,'selection__choice')])[2]")).getAttribute("title").trim();
				try {
					if (optionText.equalsIgnoreCase(industry))	{
						testStepPassed("Correct added industry is displayed");
					}	} 
				catch (Exception e) {
					testStepFailed("Correct added industry is not displayed");
				}	}	} 
		catch (Exception e) 		{
			testStepFailed("New Added industry is not updated successfully");
		}
	}
	/**
	 *This method is used to verify the removal functionality for industry.
	 *
	 *@param industry
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_RemoveIndustry_functionality(String industry)	{
		List <WebElement> industries = driver.findElements(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'industry')]//input[contains(@type,'search')]/parent::li/preceding-sibling::li[contains(@class,'selection__choice')]"));
		int industriesCount = industries.size();
		if (industriesCount==2) 		{
			testStepPassed("New Added industry is updated successfully");
			String optionText = driver.findElement(By.xpath("(//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'industry')]//input[contains(@type,'search')]/parent::li/preceding-sibling::li[contains(@class,'selection__choice')])[2]")).getAttribute("title").trim();
			if (optionText.equalsIgnoreCase(industry)) 			{
				testStepPassed("Correct added industry is displayed");

				driver.findElement(By.xpath("(//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'industry')]//input[contains(@type,'search')]/parent::li/preceding-sibling::li[contains(@class,'selection__choice')])[2]//span[contains(@class,'remove')]")).click();

				waitTime(1);

				clickOn(lbl_CompanyProfilePage_EditProfilePage_IndustrySection);

				List <WebElement> industries2 = driver.findElements(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'industry')]//input[contains(@type,'search')]/parent::li/preceding-sibling::li[contains(@class,'selection__choice')]"));
				int industriesCount2 = industries2.size();
				if (industriesCount2==1) 				{
					testStepPassed("Correct added industry is removed as expected");
				}
				else				{
					testStepFailed("Correct added industry is not removed as expected");
				}
			}
			else			{
				testStepFailed("Correct added industry is not displayed");
			}	}
		else	{	testStepFailed("New Added industry is not updated successfully");
		}
	}
	/**
	 *This method is used to verify the display of error message for invalid industry 
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_InvalidIndustry_ErrorMessage_displayed(String industry)
	{
		waitForElementToDisplay(txt_EP_IndustrySection_Industry_HatcherOption, this.elementLoadWaitTime);
		typeIn(txt_EP_IndustrySection_Industry_HatcherOption, industry);
		waitTime(1);
		if (driver.findElement(By.xpath("//span[contains(@class,'results')]//ul//li[contains(text(),'No results found')]")).isDisplayed()) 
		{
			testStepPassed("Invalid Industry search error message is displayed");

			clickOn(lbl_CompanyProfilePage_EditProfilePage_IndustrySection);
		} 
		else 	{
			testStepFailed("Invalid Industry search error message is not displayed");
		}	}

	/********************************************************************************************************************************************************/
	/**
	 *This method is used to enable keywords option.
	 *
	 *@author VijayaKumar.U
	 */

	public void click_KeywordsSection_Keywords_HatcherOption_RadioButton()
	{
		clickOn(rdb_EP_KeywordsSection_Keywords_HatcherOption);
	}
	/**
	 *This method is used to enter the keyword for hatcher
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_KeywordsSection_Keyword_HatcherOption_Textbox(String keyword)
	{
		waitForElementToDisplay(txt_EP_KeywordsSection_Keywords_HatcherOption, this.elementLoadWaitTime);
		clearEditBox(txt_EP_KeywordsSection_Keywords_HatcherOption);
		typeIn(txt_EP_KeywordsSection_Keywords_HatcherOption, keyword);
	}
	/**
	 *This method is used to enable keywords for clearbit
	 *
	 *@author VijayaKumar.U
	 */
	public void click_KeywordsSection_Keywords_ClearbitOption_RadioButton()
	{
		clickOn(rdb_EP_KeywordsSection_Keywords_ClearbitOption);
	}
	/**
	 *This method is used to enter the keyword for clearbit
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_KeywordsSection_Keyword_ClearbitOption_Textbox(String keyword)
	{
		waitForElementToDisplay(txt_EP_KeywordsSection_Keywords_ClearbitOption, this.elementLoadWaitTime);
		clearEditBox(txt_EP_KeywordsSection_Keywords_ClearbitOption);
		typeIn(txt_EP_KeywordsSection_Keywords_ClearbitOption, keyword);
	}
	/**
	 *This method is used to save changes of keyword section
	 *
	 *@author VijayaKumar.U
	 */
	public void click_KeywordsSection_SaveChanges_Button()
	{
		WebElement element = findWebElement("//div[contains(@id,'keywords')]//label[contains(text(),'Hatcher')]/parent::div//textarea");
		scrolltoElementView(element);
		clickOn(btn_EP_KeywordsSection_SaveChanges);
	}

	/********************************************************************************************************************************************************/
	/**
	 *This method is used to enable region radio in corresponding section
	 *
	 *@author VijayaKumar.U
	 */
	public void click_RegionsSection_Regions_HatcherOption_RadioButton()
	{
		clickOn(rdb_EP_RegionsSection_Regions_HatcherOption);
	}
	/**
	 *This method is used to select the region in the section
	 *
	 *@author VijayaKumar.U
	 */
	public void select_RegionsSection_Regions_HatcherOption_Textbox(String regions)
	{
		waitForElementToDisplay(txt_EP_RegionsSection_Regions_HatcherOption, this.elementLoadWaitTime);
		typeIn(txt_EP_RegionsSection_Regions_HatcherOption, regions);
		waitTime(1);

		List <WebElement> optlst = driver.findElements(By.xpath("//span[contains(@class,'select2-results')]//li"));
		int optlstcount = optlst.size();

		for (WebElement opt : optlst) 
		{
			String text = opt.getText();
			if (text.equalsIgnoreCase(regions)) 
			{
				opt.click();
				break;
			}
		}		
	}
	/**
	 *This method is used to verify the error message for invalid region entries
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_InvalidRegions_ErrorMessage_displayed(String regions)
	{
		waitForElementToDisplay(txt_EP_RegionsSection_Regions_HatcherOption, this.elementLoadWaitTime);
		typeIn(txt_EP_RegionsSection_Regions_HatcherOption, regions);
		waitTime(1);
		if (driver.findElement(By.xpath("//span[contains(@class,'results')]//ul//li[contains(text(),'No results found')]")).isDisplayed()) 
		{
			testStepPassed("Invalid Region search error message is displayed");

			clickOn(lbl_CompanyProfilePage_EditProfilePage_RegionsSection);
		} 
		else 
		{
			testStepFailed("Invalid Region search error message is not displayed");
		}
	}
	/**
	 *This method is used to save changes in the region section
	 *
	 *@author VijayaKumar.U
	 */
	public void click_RegionsSection_SaveChanges_Button()
	{
		clickOn(btn_EP_RegionsSection_SaveChanges);
	}
	/**
	 *This method is used to verify the display of selected region 
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_SelectedRegions_displayed(String regions)
	{
		List <WebElement> industries = driver.findElements(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'industry')]//input[contains(@type,'search')]/parent::li/preceding-sibling::li[contains(@class,'selection__choice')]"));
		int industriesCount = industries.size();
		try 
		{
			if (industriesCount==2) 
			{
				testStepPassed("New Added Region is updated successfully");
				String optionText = driver.findElement(By.xpath("(//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'region')]//input[contains(@type,'search')]/parent::li/preceding-sibling::li[contains(@class,'selection__choice')])[2]")).getAttribute("title").trim();
				try 
				{
					if (optionText.equalsIgnoreCase(regions)) 
					{
						testStepPassed("Correct added Region is displayed");
					}
				} 
				catch (Exception e) 
				{
					testStepFailed("Correct added Region is not displayed");
				}
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("New Added Region is not updated successfully");
		}
	}
	/**
	 *This method is used to verify the removal of  region functionality
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_RemoveRegion_functionality(String regions)
	{
		List <WebElement> regionsName = driver.findElements(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'region')]//input[contains(@type,'search')]/parent::li/preceding-sibling::li[contains(@class,'selection__choice')]"));
		int regionsCount = regionsName.size();
		if (regionsCount==1) 
		{
			testStepPassed("New Added Region is updated successfully");
			String optionText = driver.findElement(By.xpath("(//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'region')]//input[contains(@type,'search')]/parent::li/preceding-sibling::li[contains(@class,'selection__choice')])[1]")).getAttribute("title").trim();
			if (optionText.equalsIgnoreCase(regions)) 
			{
				testStepPassed("Correct added Region is displayed");

				driver.findElement(By.xpath("(//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'region')]//input[contains(@type,'search')]/parent::li/preceding-sibling::li[contains(@class,'selection__choice')])[1]//span[contains(@class,'remove')]")).click();

				waitTime(1);

				clickOn(lbl_CompanyProfilePage_EditProfilePage_RegionsSection);

				if (driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'region')]//input[contains(@type,'search')]/parent::li/preceding-sibling::li[contains(@class,'selection__choice')]")).isDisplayed()) 
				{
					testStepFailed("Correct added Region is not removed as expected");

				}
				else
				{
					testStepPassed("Correct added Region is removed as expected");

				}
			}
			else
			{
				testStepFailed("Correct added Region is not displayed");
			}
		}
		else
		{
			testStepFailed("New Added Region is not updated successfully");
		}
	}

	/********************************************************************************************************************************************************/
	/**
	 *This method is used to select the account status.
	 *
	 *@author VijayaKumar.U
	 */
	public void select_CommunitySettingsSection_AccountStatus(String accountStatus)
	{
		waitForElementToDisplay(drp_CompanyProfilePage_EditProfilePage_CommunitySettingsSection_AccountStatus, this.elementLoadWaitTime);


		List <WebElement> optlst = driver.findElements(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'syndicate_settings')]//*[contains(text(),'Account Status')]/parent::div//select//option"));
		int optlstcount = optlst.size();

		for (WebElement opt : optlst) 
		{
			String text = opt.getText();
			if (text.equalsIgnoreCase(accountStatus)) 
			{
				opt.click();
				break;
			}
		}		
	}
	/**
	 *This method is used to select the account type.
	 *@param account type
	 *
	 *@author VijayaKumar.U
	 */
	public void select_CommunitySettingsSection_AccountType(String accountType)
	{
		waitForElementToDisplay(drp_CompanyProfilePage_EditProfilePage_CommunitySettingsSection_AccountType, this.elementLoadWaitTime);


		List <WebElement> optlst = driver.findElements(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'syndicate_settings')]//*[contains(text(),'Account Type')]/parent::div//select//option"));
		int optlstcount = optlst.size();

		for (WebElement opt : optlst) 
		{
			String text = opt.getText();
			if (text.equalsIgnoreCase(accountType)) 
			{
				opt.click();
				break;
			}
		}		
	}
	/**
	 *This method is used to select the account type
	 *
	 *@param account type
	 *
	 *@author VijayaKumar.U
	 */
	public void select_CommunitySettingsSection_AccountType_New(String accountType)
	{
		selectFromDropdown(drp_CompanyProfilePage_EditProfilePage_CommunitySettingsSection_AccountType, accountType);
	}
	/**
	 *This method is used to select the business type
	 *
	 *@param business type.
	 *
	 *@author VijayaKumar.U
	 */
	public void select_CommunitySettingsSection_BusinessType(String businessType)
	{
		waitForElementToDisplay(drp_CompanyProfilePage_EditProfilePage_CommunitySettingsSection_BusinessType, this.elementLoadWaitTime);


		List <WebElement> optlst = driver.findElements(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'syndicate_settings')]//*[contains(text(),'Business Type')]/parent::div//select//option"));
		int optlstcount = optlst.size();

		for (WebElement opt : optlst) 
		{
			String text = opt.getText();
			if (text.equalsIgnoreCase(businessType)) 
			{
				opt.click();
				break;
			}
		}	
	}
	/**
	 *This method is used to select the dealflow status
	 *
	 *@param dealflowStatus
	 *
	 *@author VijayaKumar.U
	 */
	public void select_CommunitySettingsSection_DealflowStatus(String dealflowStatus)
	{
		waitForElementToDisplay(drp_CompanyProfilePage_EditProfilePage_CommunitySettingsSection_DealflowStatus, this.elementLoadWaitTime);


		List <WebElement> optlst = driver.findElements(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'syndicate_settings')]//*[contains(text(),'Dealflow Status')]/parent::div//select//option"));
		int optlstcount = optlst.size();

		for (WebElement opt : optlst) 
		{
			String text = opt.getText();
			if (text.equalsIgnoreCase(dealflowStatus)) 
			{
				opt.click();
				break;
			}
		}	
	}
	/**
	 *This method is used to select the health portfolio
	 *
	 *@param healthorPortfolioStatus
	 *
	 *@author VijayaKumar.U
	 */
	public void select_CommunitySettingsSection_HealthorPortfolioStatus(String healthorPortfolioStatus)
	{
		waitForElementToDisplay(drp_CompanyProfilePage_EditProfilePage_CommunitySettingsSection_HealthPortfolioStatus, this.elementLoadWaitTime);


		List <WebElement> optlst = driver.findElements(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'syndicate_settings')]//*[contains(text(),'Health / Portfolio Status')]/parent::div//select//option"));
		int optlstcount = optlst.size();

		for (WebElement opt : optlst) 
		{
			String text = opt.getText();
			if (text.equalsIgnoreCase(healthorPortfolioStatus)) 
			{
				opt.click();
				break;
			}
		}	
	}
	/**
	 *This method is used to select the placement Agent
	 *
	 *@param placement Agent
	 *
	 *@author VijayaKumar.U
	 */
	public void select_CommunitySettingsSection_PlacementAgent(String placementAgent)
	{
		waitForElementToDisplay(drp_CompanyProfilePage_EditProfilePage_CommunitySettingsSection_PlacementAgent, this.elementLoadWaitTime);


		List <WebElement> optlst = driver.findElements(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'syndicate_settings')]//*[contains(text(),'Placement Agent')]/parent::div//select//option"));
		int optlstcount = optlst.size();

		for (WebElement opt : optlst) 
		{
			String text = opt.getText();
			if (text.equalsIgnoreCase(placementAgent)) 
			{
				opt.click();
				break;
			}
		}	
	}
	/**
	 *This method is used to select the main contact
	 *
	 *@param mainContact
	 *@author VijayaKumar.U
	 */
	public void select_CommunitySettingsSection_MainContact(String mainContact)
	{
		waitForElementToDisplay(drp_CompanyProfilePage_EditProfilePage_CommunitySettingsSection_MainContact, this.elementLoadWaitTime);
		selectFromDropdown(drp_CompanyProfilePage_EditProfilePage_CommunitySettingsSection_MainContact, mainContact);
	}
	/**
	 *This method is used to select the relationship Manager.
	 *
	 *@param relationshipManager
	 *
	 *@author VijayaKumar.U
	 */
	public void select_CommunitySettingsSection_relationshipManager(String relationshipManager)
	{
		waitForElementToDisplay(drp_CompanyProfilePage_EditProfilePage_CommunitySettingsSection_RelationshipManager, this.elementLoadWaitTime);
		selectFromDropdown(drp_CompanyProfilePage_EditProfilePage_CommunitySettingsSection_RelationshipManager, relationshipManager);
	}
	/**
	 *This method is used to select the score visibility 
	 *
	 *@param scoreVisibility
	 *
	 *@author VijayaKumar.U
	 */
	public void select_CommunitySettingsSection_ScoreVisibility(String scoreVisibility)
	{
		waitForElementToDisplay(drp_CompanyProfilePage_EditProfilePage_CommunitySettingsSection_ScoreVisibility, this.elementLoadWaitTime);
		List <WebElement> optlst = driver.findElements(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'syndicate_settings')]//*[contains(text(),'Score Visibility')]/parent::div//select//option"));
		int optlstcount = optlst.size();

		for (WebElement opt : optlst) 
		{
			String text = opt.getText();
			if (text.equalsIgnoreCase(scoreVisibility)) 
			{
				opt.click();
				break;
			}
		}	
	}
	/**
	 *This method is used to save the changes in the community section
	 *
	 *@author VijayaKumar.U
	 */
	public void click_CommunitySettingsSection_SaveChanges_Button()
	{
		clickOn(drp_CompanyProfilePage_EditProfilePage_CommunitySettingsSection_SaveChanges);
	}

	/********************************************************************************************************************************************************/



	/********************************************************************************************************************************************************/
	/**
	 *This method is used to get the legal name for hatcher option
	 *
	 *@author VijayaKumar.U
	 */
	public String get_CompanySection_LegalName_HatcherOption_Value()
	{
		String text = getAttributeValue(txt_EP_CompanySection_LegalName_HatcherOption, "value").trim();
		return text;
	}
	/**
	 *This method is used to get the legal name for clear bit
	 *
	 *@author VijayaKumar.U
	 */
	public String get_CompanySection_LegalName_ClearbitOption_Value()
	{

		String text = getAttributeValue(txt_EP_CompanySection_LegalName_ClearbitOption, "value").trim();
		return text;
	}
	/**
	 *This method is used to get friend name for hatcher
	 *
	 *@author VijayaKumar.U
	 */
	public String get_CompanySection_FriendlyName_HatcherOption_Value()
	{
		String text = getAttributeValue(txt_EP_CompanySection_FriendlyName_HatcherOption, "value").trim();
		return text;
	}
	/**
	 *This method is used to get the friendly name for the clearbit
	 *
	 *@author VijayaKumar.U
	 */
	public String get_CompanySection_FriendlyName_ClearbitOption_Value()
	{
		String text = getAttributeValue(txt_EP_CompanySection_FriendlyName_ClearbitOption, "value").trim();
		return text;
	}
	/**
	 *This method is used to get the friendly name for linkendIn
	 *
	 *@author VijayaKumar.U
	 */
	public String get_CompanySection_FriendlyName_LinkedInOption_Value()
	{

		String text = getAttributeValue(txt_EP_CompanySection_FriendlyName_LinkedInOption, "value").trim();
		return text;
	}
	/**
	 *This method is used to get the incorporate date
	 *
	 *
	 *@author VijayaKumar.U
	 */
	public String get_CompanySection_IncorporationDate_HatcherOption_Value()
	{

		String text = getAttributeValue(txt_EP_CompanySection_IncorporationDate_HatcherOption, "value").trim();
		return text;
	}
	/**
	 *This method is used to get the incorporate date value.
	 *
	 *@author VijayaKumar.U
	 */
	public String get_CompanySection_IncorporationDate_ClearbitOption_Value()
	{
		String text = getAttributeValue(txt_EP_CompanySection_IncorporationDate_ClearbitOption, "value").trim();
		return text;
	}
	/**
	 *This method is used to get the jurisdiction in company section
	 *
	 *@author VijayaKumar.U
	 */
	public String get_CompanySection_Jurisdiction_HatcherOption_Value()
	{
		String text = null;
		try 
		{
			if (driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'company')]//*[text()='Jurisdiction']/parent::div/following-sibling::div//label[contains(text(),'Hatcher')]/parent::div//div[contains(@class,'multiselect__select')]//following-sibling::div//span[contains(text(),'select option')]")).isDisplayed()) 
			{
				text="";
			}
		} 
		catch (Exception e) 
		{

			text = driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'company')]//*[text()='Jurisdiction']/parent::div/following-sibling::div//label[contains(text(),'Hatcher')]/parent::div//div[contains(@class,'multiselect__select')]//following-sibling::div//span[contains(@class,'multiselect__single')]")).getText();
		}
		return text;
	}
	/**
	 *This method is used to get the jurisdiction for linkedIn
	 *
	 *@author VijayaKumar.U
	 */
	public String get_CompanySection_Jurisdiction_LinkedInOption_Value()
	{
		String text = null;
		try 
		{
			if (driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'company')]//*[text()='Jurisdiction']/parent::div/following-sibling::div//label[contains(text(),'LinkedIn')]/parent::div//div[contains(@class,'multiselect__select')]//following-sibling::div//span[contains(text(),'select option')]")).isDisplayed()) 
			{
				text="";
			}
		} 
		catch (Exception e) 
		{
			text = driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'company')]//*[text()='Jurisdiction']/parent::div/following-sibling::div//label[contains(text(),'LinkedIn')]/parent::div//div[contains(@class,'multiselect__select')]//following-sibling::div//span[contains(@class,'multiselect__single')]")).getText();
		}
		return text;
	}
	/**
	 *This method is used to get the governing body for hatcher option
	 *
	 *@author VijayaKumar.U
	 */
	public String get_CompanySection_GoveringBody_HatcherOption_Value()
	{
		String text = null;
		try 
		{
			if (driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'company')]//*[text()='Governing Body']/parent::div/following-sibling::div//label[contains(text(),'Hatcher')]/parent::div//div[contains(@class,'multiselect__select')]//following-sibling::div//span[contains(text(),'select option')]")).isDisplayed()) 
			{
				text="";
			}
		} 
		catch (Exception e) 
		{

			text = driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'company')]//*[text()='Governing Body']/parent::div/following-sibling::div//label[contains(text(),'Hatcher')]/parent::div//div[contains(@class,'multiselect__select')]//following-sibling::div//span[contains(@class,'multiselect__single')]")).getText();
		}
		return text;
	}
	/**
	 *This method is used to enter the registration number
	 *
	 *@author VijayaKumar.U
	 */
	public String get_CompanySection_RegistrationNumber_HatcherOption_Value()
	{
		String text = getAttributeValue(txt_EP_CompanySection_RegistrationNumber_HatcherOption, "value").trim();
		return text;
	}	

	/********************************************************************************************************************************************************/
	/**
	 *This method is used to get the main contact value.
	 *
	 *@author VijayaKumar.U
	 */
	public String get_ContactSection_MainContact_HatcherOption_Value()	{
		String text = null;
		try 		{
			if (driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='Main Contact']/parent::div/following-sibling::div//label[contains(text(),'Hatcher')]/parent::div//div[contains(@class,'multiselect__select')]//following-sibling::div//span[contains(text(),'select option')]")).isDisplayed()) 
			{

				text="";
			}		} 
		catch (Exception e) 		{
			text = driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='Main Contact']/parent::div/following-sibling::div//label[contains(text(),'Hatcher')]/parent::div//div[contains(@class,'multiselect__select')]//following-sibling::div//span[contains(@class,'multiselect__single')]")).getText();
		}
		return text;
	}
	/**
	 *This method is used to get the address value for the contact section.
	 *
	 *@author VijayaKumar.U
	 */
	public String get_ContactSection_Address_HatcherOption_Value()
	{

		String text = getAttributeValue(txt_EP_ContactDetailsSection_Address_HatcherOption, "value").trim();
		return text;
	}
	/**
	 *This method is used to get the address of clearbit option.
	 *
	 *@author VijayaKumar.U
	 */
	public String get_ContactSection_Address_ClearbitOption_Value()
	{

		String text = getAttributeValue(txt_EP_ContactDetailsSection_Address_ClearbitOption, "value").trim();
		return text;
	}
	/**
	 *This method is used to get the address of LinkedIn option.
	 *
	 *@author VijayaKumar.U
	 */
	public String get_ContactSection_Address_LinkedInOption_Value()
	{

		String text = getAttributeValue(txt_EP_ContactDetailsSection_Address_LinkedInOption, "value").trim();
		return text;
	}
	/**
	 *This method is used to get the value for the unitorSuite.
	 *
	 *@author VijayaKumar.U
	 */
	public String get_ContactSection_UnitorSuite_HatcherOption_Value()
	{

		String text = getAttributeValue(txt_EP_ContactDetailsSection_UnitSuite_HatcherOption, "value").trim();
		return text;
	}
	/**
	 *This method is used to get the unitorsuite for clearbit
	 *
	 *@author VijayaKumar.U
	 */
	public String get_ContactSection_UnitorSuite_ClearbitOption_Value()
	{

		String text = getAttributeValue(txt_EP_ContactDetailsSection_UnitSuite_ClearbitOption, "value").trim();
		return text;
	}
	/**
	 *This method is used to get the city for hatcher option
	 *
	 *@author VijayaKumar.U
	 */
	public String get_ContactSection_City_HatcherOption_Value()
	{

		String text = getAttributeValue(txt_EP_ContactDetailsSection_City_HatcherOption, "value").trim();
		return text;
	}
	/**
	 *This method is used to get the city for clearbit option
	 *
	 *@author VijayaKumar.U
	 */
	public String get_ContactSection_City_ClearbitOption_Value()
	{

		String text = getAttributeValue(txt_EP_ContactDetailsSection_City_ClearbitOption, "value").trim();
		return text;
	}
	/**
	 *This method is used to get the city for linkedIn
	 *
	 *@author VijayaKumar.U
	 */
	public String get_ContactSection_City_LinkedInOption_Value()
	{

		String text = getAttributeValue(txt_EP_ContactDetailsSection_City_LinkedInOption, "value").trim();
		return text;
	}
	/**
	 *This method is used to get the postal code for contact section
	 *
	 *@author VijayaKumar.U
	 */
	public String get_ContactSection_PostalCode_HatcherOption_Value()
	{

		String text = getAttributeValue(txt_EP_ContactDetailsSection_PostalCode_HatcherOption, "value").trim();
		return text;
	}
	/**
	 *This method is used to get postalcode for clearbit
	 *
	 *@author VijayaKumar.U
	 */
	public String get_ContactSection_PostalCode_ClearbitOption_Value()
	{

		String text = getAttributeValue(txt_EP_ContactDetailsSection_PostalCode_ClearbitOption, "value").trim();
		return text;
	}
	/**
	 *This method is used to get the postal code for linkedIn option 
	 *
	 *@author VijayaKumar.U
	 */
	public String get_ContactSection_PostalCode_LinkedInOption_Value()
	{

		String text = getAttributeValue(txt_EP_ContactDetailsSection_PostalCode_LinkedInOption, "value").trim();
		return text;
	}
	/**
	 *This method is used to get the state for hatcher
	 *
	 *@author VijayaKumar.U
	 */
	public String get_ContactSection_State_HatcherOption_Value()
	{

		String text = getAttributeValue(txt_EP_ContactDetailsSection_State_HatcherOption, "value").trim();
		return text;
	}
	/**
	 *This method is used to get the state for clear bit option
	 *
	 *@author VijayaKumar.U
	 */
	public String get_ContactSection_State_ClearbitOption_Value()
	{

		String text = getAttributeValue(txt_EP_ContactDetailsSection_State_ClearbitOption, "value").trim();
		return text;
	}
	/**
	 *This method is used to get the country of hatcher 
	 *
	 *@author VijayaKumar.U
	 */
	public String get_ContactSection_Country_HatcherOption_Value()	{
		String text = null;
		try 		{
			if (driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='Country']/parent::div/following-sibling::div//label[contains(text(),'Hatcher')]/parent::div//div[contains(@class,'multiselect__select')]//following-sibling::div//span[contains(text(),'select option')]")).isDisplayed()) 
			{
				testStepPassed("No Option is seleted");
				text="";
			}		} 
		catch (Exception e) {
			text = driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='Country']/parent::div/following-sibling::div//label[contains(text(),'Hatcher')]/parent::div//div[contains(@class,'multiselect__select')]//following-sibling::div//span[contains(@class,'multiselect__single')]")).getText();
		}
		return text;
	}
	/**
	 *This method is used to get the 
	 *
	 *@author VijayaKumar.U
	 */

	public String get_ContactSection_Country_ClearbitOption_Value()
	{
		String text = null;
		try 
		{
			if (isElementDisplayed(ContactSection_Country_ClearbitOption_NoSelection)) 
			{
				testStepPassed("No Option is seleted");
				text="";
			}
		} 
		catch (Exception e) 		{

			text = getText(ContactSection_Country_ClearbitOption_MultipleSelection);
		}
		return text;
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */

	public String get_ContactSection_Country_LinkedInOption_Value()	{
		String text = null;
		try {	
			if (isElementDisplayed(ContactSection_Country_LinkedInOption_SingleSelection)) 
			{
				text="";
			}		} 
		catch (Exception e) {
			text = getText(ContactSection_Country_LinkedInOption_MultipleSelection);
		}
		return text;
	}
	/**
	 *This method is used to get the latitude for hatcher in contact section.
	 *
	 *@author VijayaKumar.U
	 */
	public String get_ContactSection_Latitude_HatcherOption_Value()	{
		String text = getAttributeValue(txt_EP_ContactDetailsSection_Latitude_HatcherOption, "value").trim();
		return text;
	}
	/**
	 *This method is used to get tge latitude for clearbit option.
	 *
	 *@author VijayaKumar.U
	 */
	public String get_ContactSection_Latitude_ClearbitOption_Value()
	{

		String text = getAttributeValue(txt_EP_ContactDetailsSection_Latitude_ClearbitOption, "value").trim();
		return text;
	}
	/**
	 *This method is used to get longitude of hatcher option in contact section.
	 *
	 *@author VijayaKumar.U
	 */
	public String get_ContactSection_Longitude_HatcherOption_Value()
	{

		String text = getAttributeValue(txt_EP_ContactDetailsSection_Longitude_HatcherOption, "value").trim();
		return text;
	}
	/**
	 *This method is used to get the longitude of the clearbit contact section.
	 *
	 *@author VijayaKumar.U
	 */
	public String get_ContactSection_Longitude_ClearbitOption_Value()
	{

		String text = getAttributeValue(txt_CompanyProfilePage_EditProfilePage_ContactDetailsSection_Longitude_ClearbitOption_Textbox, "value").trim();
		return text;
	}
	/**
	 *This method is used to get the contact section of company email.
	 *
	 *@author VijayaKumar.U
	 */
	public String get_ContactSection_CompanyEmail_HatcherOption_Value()
	{

		String text = getAttributeValue(txt_EditProfilePage_ContactDetailsSection_CompanyEmail_HatcherOption, "value").trim();
		return text;
	}
	/**
	 *This method is used to get the phone number in contact section.
	 *
	 *@author VijayaKumar.U
	 */
	public String get_ContactSection_Phone_HatcherOption_Value()
	{

		String text = getAttributeValue(txt_CompanyProfilePage_EditProfilePage_ContactDetailsSection_Phone_HatcherOption_Textbox, "value").trim();
		return text;
	}

	/********************************************************************************************************************************************************/
	/**
	 *This method is used to get the description for hatcher.
	 *
	 *@author VijayaKumar.U
	 */
	public String get_DescriptionSection_HatcherOption_Value()
	{

		String text = getText(txt_CompanyProfilePage_EditProfilePage_DescriptionSection_Description_HatcherOption_Textbox).trim();
		return text;
	}
	/**
	 *This method is used to get the description for clearbit option.
	 *
	 *@author VijayaKumar.U
	 */
	public String get_DescriptionSection_ClearbitOption_Value()
	{

		String text = getText(txt_CompanyProfilePage_EditProfilePage_DescriptionSection_Description_ClearbitOption_Textbox).trim();
		return text;
	}
	/**
	 *This method is used to get the description of twitter.
	 *
	 *@author VijayaKumar.U
	 */
	public String get_DescriptionSection_TwitterOption_Value()
	{

		String text = getText(txt_CompanyProfilePage_EditProfilePage_DescriptionSection_Description_TwitterOption_Textbox).trim();
		return text;
	}
	/**
	 *This method is used to get description of linkedin option
	 *
	 *@author VijayaKumar.U
	 */
	public String get_DescriptionSection_LinkedInOption_Value()
	{

		String text = getText(txt_CompanyProfilePage_EditProfilePage_DescriptionSection_Description_LinkedInOption_Textbox).trim();
		return text;
	}

	/********************************************************************************************************************************************************/
	/**
	 *This method is used to get the crunch base of hatcher option
	 *
	 *@author VijayaKumar.U
	 */
	public String get_DigitalFootPrintSection_Crunchbase_HatcherOption_Value()
	{

		String text = getAttributeValue(txt_EP_DigitalFootPrintSection_Crunchbase_HatcherOption, "value").trim();
		return text;
	}
	/**
	 *This method is used to get the crunchbase of clearbit option
	 *
	 *@author VijayaKumar.U
	 */
	public String get_DigitalFootPrintSection_Crunchbase_ClearbitOption_Value()
	{

		String text = getAttributeValue(txt_EP_DigitalFootPrintSection_Crunchbase_ClearbitOption, "value").trim();
		return text;
	}
	/**
	 *This method is used to get the facebook data for digital foot print section.
	 *
	 *@author VijayaKumar.U
	 */
	public String get_DigitalFootPrintSection_Facebook_HatcherOption_Value()
	{

		String text = getAttributeValue(txt_EP_DigitalFootPrintSection_Facebook_HatcherOption, "value").trim();
		return text;
	}
	/**
	 *This method is used to get facebook in digital foot print section .
	 *
	 *@author VijayaKumar.U
	 */
	public String get_DigitalFootPrintSection_Facebook_ClearbitOption_Value()
	{

		String text = getAttributeValue(txt_EP_DigitalFootPrintSection_Facebook_ClearbitOption, "value").trim();
		return text;
	}
	/**
	 *This method is used to get the instagram value for the digital section.
	 *
	 *@author VijayaKumar.U
	 */
	public String get_DigitalFootPrintSection_Instagram_HatcherOption_Value()
	{

		String text = getAttributeValue(txt_EP_DigitalFootPrintSection_Instagram_HatcherOption, "value").trim();
		return text;
	}
	/**
	 *This method is used to get the angel list in the digital section.
	 *
	 *@author VijayaKumar.U
	 */
	public String get_DigitalFootPrintSection_Angellist_HatcherOption_Value()
	{

		String text = getAttributeValue(txt_EP_DigitalFootPrintSection_Angellist_HatcherOption, "value").trim();
		return text;
	}
	/**
	 *This method is used to get medium value.
	 *
	 *@author VijayaKumar.U
	 */
	public String get_DigitalFootPrintSection_Medium_HatcherOption_Value()
	{

		String text = getAttributeValue(txt_EP_DigitalFootPrintSection_Medium_HatcherOption, "value").trim();
		return text;
	}
	/**
	 *This method is used to get linkedIN in DigitalFootPrintSection value for hatcher
	 *
	 *@author VijayaKumar.U
	 */
	public String get_DigitalFootPrintSection_LinkedIn_HatcherOption_Value()
	{

		String text = getAttributeValue(txt_EP_DigitalFootPrintSection_LinkedIn_HatcherOption, "value").trim();
		return text;
	}
	/**
	 *This method is used to get the value for the linkedIN in DigitalFootPrintSection
	 *
	 *@author VijayaKumar.U
	 */
	public String get_DigitalFootPrintSection_LinkedIn_ClearbitOption_Value()
	{

		String text = getAttributeValue(txt_EditProfilePage_DigitalFootPrintSection_LinkedIn_ClearbitOption, "value").trim();
		return text;
	}
	/**
	 *This method is used to get the value for the pinterest in the DigitalFootPrintSection
	 *
	 *@author VijayaKumar.U
	 */
	public String get_DigitalFootPrintSection_Pinterest_HatcherOption_Value()
	{
		String text = getAttributeValue(txt_EditProfilePage_DigitalFootPrintSection_Pinterest_HatcherOption, "value").trim();
		return text;
	}
	/**
	 *This method is used to get value for the RSSFEED .
	 *
	 *@author VijayaKumar.U
	 */
	public String get_DigitalFootPrintSection_RSSFeed_HatcherOption_Value()
	{

		String text = getAttributeValue(txt_EditProfilePage_DigitalFootPrintSection_RSSFeed_HatcherOption, "value").trim();
		return text;
	}
	/**
	 *This method is used to value for twitter in hatcher option
	 *
	 *@author VijayaKumar.U
	 */
	public String get_DigitalFootPrintSection_Twitter_HatcherOption_Value()
	{

		String text = getAttributeValue(txt_EP_DigitalFootPrintSection_Twitter_HatcherOption, "value").trim();
		return text;
	}
	/**
	 *This method is used to get the twitter value for clear bit.
	 *
	 *@author VijayaKumar.U
	 */
	public String get_DigitalFootPrintSection_Twitter_ClearbitOption_Value()
	{

		String text = getAttributeValue(txt_EP_DigitalFootPrintSection_Twitter_ClearbitOption, "value").trim();
		return text;
	}
	/**
	 *This method is used to get the value for the vimeo - hatcher
	 *
	 *@author VijayaKumar.U
	 */
	public String get_DigitalFootPrintSection_Vimeo_HatcherOption_Value()
	{
		String text = getAttributeValue(txt_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_Vimeo_HatcherOption_Textbox, "value").trim();
		return text;
	}
	/**
	 *This method is used to get the value for Website_HatcherOption
	 *
	 *@author VijayaKumar.U
	 */
	public String get_DigitalFootPrintSection_Website_HatcherOption_Value()
	{
		String text = getAttributeValue(txt_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_Website_HatcherOption_Textbox, "value").trim();
		return text;
	}
	/**
	 *This method is used to get value for Website_MOZOption
	 *
	 *@author VijayaKumar.U
	 */
	public String get_DigitalFootPrintSection_Website_ClearbitOption_Value()
	{

		String text = getAttributeValue(txt_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_Website_ClearbitOption_Textbox, "value").trim();
		return text;
	}
	/**
	 *This method is used to get value for Website_MOZOption
	 *
	 *@author VijayaKumar.U
	 */
	public String get_DigitalFootPrintSection_Website_MOZOption_Value()
	{
		String text = getAttributeValue(txt_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_Website_MOZOption_Textbox, "value").trim();
		return text;
	}
	/**
	 *This method is used to get the value for DigitalFootPrintSection_YouTube_HatcherOption
	 *
	 *@author VijayaKumar.U
	 */
	public String get_DigitalFootPrintSection_YouTube_HatcherOption_Value()
	{
		String text = getAttributeValue(txt_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_YouTube_HatcherOption_Textbox, "value").trim();
		return text;
	}

	/********************************************************************************************************************************************************/
	/**
	 *This method is used to get the BankABANumber_HatcherOption_
	 *
	 *@author VijayaKumar.U
	 */
	public String get_FinanceandLegalSection_Auditor_HatcherOption_Value()
	{
		String text = getAttributeValue(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_Auditor_HatcherOption_Textbox, "value").trim();
		return text;
	}
	/**
	 *This method is used to value for bank for FinanceandLegalSection
	 *
	 *@author VijayaKumar.U
	 */
	public String get_FinanceandLegalSection_Bank_HatcherOption_Value()
	{
		String text = getAttributeValue(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_Bank_HatcherOption_Textbox, "value").trim();
		return text;
	}
	/**
	 *This method is used to get BankABANumber_HatcherOption 
	 *
	 *@author VijayaKumar.U
	 */
	public String get_FinanceandLegalSection_BankABANumber_HatcherOption_Value()
	{
		String text = getAttributeValue(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankABANumber_HatcherOption_Textbox, "value").trim();
		return text;
	}

	/**
	 *This method is used to get the BankAccountNumber
	 *
	 *@author VijayaKumar.U
	 */
	public String get_FinanceandLegalSection_BankAccountNumber_HatcherOption_Value()
	{

		String text = getAttributeValue(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankAccountNumber_HatcherOption_Textbox, "value").trim();
		return text;
	}
	/**
	 *This method is used to get the value for BankAddress
	 *
	 *@author VijayaKumar.U
	 */
	public String get_FinanceandLegalSection_BankAddress_HatcherOption_Value()
	{
		String text = getAttributeValue(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankAddress_HatcherOption_Textbox, "value").trim();
		return text;
	}
	/**
	 *This method is used to get the value for BankIntermediary
	 *
	 *@author VijayaKumar.U
	 */
	public String get_FinanceandLegalSection_BankIntermediary_HatcherOption_Value()
	{
		String text = getAttributeValue(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankIntermediary_HatcherOption_Textbox, "value").trim();
		return text;
	}
	/**
	 *This method is used to get the ABA number for the finance section.
	 *
	 *@author VijayaKumar.U
	 */
	public String get_FinanceandLegalSection_IntermediaryBankABANumber_HatcherOption_Value()
	{

		String text = getAttributeValue(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_IntermediaryBankABANumber_HatcherOption_Textbox, "value").trim();
		return text;
	}
	/**
	 *This method is used to get the intermediary address in finance section.
	 *
	 *@author VijayaKumar.U
	 */
	public String get_FinanceandLegalSection_IntermediaryBankAddress_HatcherOption_Value()
	{

		String text = getAttributeValue(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_IntermediaryBankAddress_HatcherOption_Textbox, "value").trim();
		return text;
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public String get_FinanceandLegalSection_IntermediaryBankSWIFTBIC_HatcherOption_Value()
	{

		String text = getAttributeValue(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_IntermediaryBankSWIFTBIC_HatcherOption_Textbox, "value").trim();
		return text;
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public String get_FinanceandLegalSection_BankSwiftCode_HatcherOption_Value()
	{

		String text = getAttributeValue(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankSwiftCode_HatcherOption_Textbox, "value").trim();
		return text;
	}
	/**
	 *This method is used to Bank code value for the finance section.
	 *
	 *@author VijayaKumar.U
	 */
	public String get_FinanceandLegalSection_BankIBANCode_HatcherOption_Value()
	{

		String text = getAttributeValue(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankIBANCode_HatcherOption_Textbox, "value").trim();
		return text;
	}
	/**
	 *This method is used to get the bank instruction for the finance section.
	 *
	 *@author VijayaKumar.U
	 */
	public String get_FinanceandLegalSection_BankInstructions_HatcherOption_Value()
	{

		String text = getAttributeValue(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankInstructions_HatcherOption_Textbox, "value").trim();
		return text;
	}
	/**
	 *This method is used to get the company secretary details of finance and legal.
	 *
	 *@author VijayaKumar.U
	 */
	public String get_FinanceandLegalSection_CompanySecretary_HatcherOption_Value()
	{

		String text = getAttributeValue(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_CompanySecretary_HatcherOption_Textbox, "value").trim();
		return text;
	}
	/**
	 *This method is used to get the currency details .
	 *
	 *@author VijayaKumar.U
	 */
	public String get_FinanceandLegalSection_Currency_HatcherOption_Value()
	{

		String text = null;
		String textfromApp = getAttributeValue(drp_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_Currency_HatcherOption_Dropdown, "value").trim();
		text = driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Currency']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::select//option[@value='USD']")).getText().trim();
		return text;
	}
	/**
	 *This method is used to get the financial year details.
	 *
	 *@author VijayaKumar.U
	 */
	public String get_FinanceandLegalSection_FinancialYearEnd_HatcherOption_Value()
	{

		String text = getAttributeValue(drp_EP_FinanceandLegalSection_FinancialYearEnd_HatcherOption, "value").trim();
		return text;
	}
	/**
	 *This method is used to get the law firm details .
	 *
	 *@author VijayaKumar.U
	 */
	public String get_FinanceandLegalSection_LawFirm_HatcherOption_Value()
	{
		String text = getAttributeValue(txt_EP_FinanceandLegalSection_LawFirm_HatcherOption, "value").trim();
		return text;
	}

	/********************************************************************************************************************************************************/
	/**
	 *This method is used to get the keywords for the hatcher option.
	 *
	 *@author VijayaKumar.U
	 */
	public String get_KeywordsSection_HatcherOption_Value()
	{
		String text = getAttributeValue(txt_EP_KeywordsSection_Keywords_HatcherOption, "value").trim();
		return text;
	}
	/**
	 *This method is used to return the keywords for the clear bit option.
	 *
	 *@author VijayaKumar.U
	 */
	public String get_KeywordsSection_ClearbitOption_Value()
	{
		String text = getAttributeValue(txt_EP_KeywordsSection_Keywords_ClearbitOption, "value").trim();
		return text;
	}

	/********************************************************************************************************************************************************/
	/**
	 *This method is used to get the Alexa banking for hatcher option.
	 *
	 *@author VijayaKumar.U
	 */
	public String get_MarketingMetricsSection_AlexaBanking_HatcherOption_Value()
	{

		String text = getAttributeValue(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_AlexaRanking_HatcherOption_Textbox, "value").trim();
		return text;
	}
	/**
	 *This method is used to get the alexa banking for the clearbit option.
	 *
	 *@author VijayaKumar.U
	 */
	public String get_MarketingMetricsSection_AlexaBanking_ClearbitOption_Value()
	{

		String text = getAttributeValue(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_AlexaRanking_ClearbitOption_Textbox, "value").trim();
		return text;
	}
	/**
	 *This method is used to return the competitors for hatcher option.
	 *
	 *@author VijayaKumar.U
	 */
	public String get_MarketingMetricsSection_Competitors_HatcherOption_Value()
	{

		String text = getAttributeValue(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_Competitors_HatcherOption_Textbox, "value").trim();
		return text;
	}
	/**
	 *This method is used to return the competitors SEMRush option.
	 *
	 *@author VijayaKumar.U
	 */
	public String get_MarketingMetricsSection_Competitors_SEMRushOption_Value()
	{

		String text = getAttributeValue(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_Competitors_SEMRushOption_Textbox, "value").trim();
		return text;
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public String get_MarketingMetricsSection_CompetitorRankings_HatcherOption_Value()
	{
		String text = getAttributeValue(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_CompetitorRankings_HatcherOption_Textbox, "value").trim();
		return text;
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public String get_MarketingMetricsSection_DomainsLinkingIn_HatcherOption_Value()
	{
		String text = getAttributeValue(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_DomainsLinkingIn_HatcherOption_Textbox, "value").trim();
		return text;
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public String get_MarketingMetricsSection_DomainsLinkingIn_MOZOption_Value()
	{
		String text = getAttributeValue(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_DomainsLinkingIn_MOZOption_Textbox, "value").trim();
		return text;
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public String get_MarketingMetricsSection_FacebookLikes_HatcherOption_Value()
	{
		String text = getAttributeValue(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_FacebookLikes_HatcherOption_Textbox, "value").trim();
		return text;
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public String get_MarketingMetricsSection_FacebookLikes_ClearbitOption_Value()
	{
		String text = getAttributeValue(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_FacebookLikes_ClearbitOption_Textbox, "value").trim();
		return text;
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public String get_MarketingMetricsSection_LinkedinEmployees_HatcherOption_Value()
	{
		String text = getAttributeValue(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_LinkedinEmployees_HatcherOption_Textbox, "value").trim();
		return text;
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public String get_MarketingMetricsSection_LinkedinEmployees_ClearbitOption_Value()
	{
		String text = getAttributeValue(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_LinkedinEmployees_ClearbitOption_Textbox, "value").trim();
		return text;
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public String get_MarketingMetricsSection_LinkedinEmployees_LinkedInOption_Value()
	{
		String text = getAttributeValue(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_LinkedinEmployees_LinkedInOption_Textbox, "value").trim();
		return text;
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public String get_MarketingMetricsSection_LinkedinFollowers_HatcherOption_Value()
	{
		String text = getAttributeValue(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_LinkedinFollowers_HatcherOption_Textbox, "value").trim();
		return text;
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public String get_MarketingMetricsSection_LinkedinFollowers_LinkedInOption_Value()
	{
		String text = getAttributeValue(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_LinkedinFollowers_LinkedInOption_Textbox, "value").trim();
		return text;
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public String get_MarketingMetricsSection_MOZDomainAuthority_HatcherOption_Value()
	{
		String text = getAttributeValue(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_MOZDomainAuthority_HatcherOption_Textbox, "value").trim();
		return text;
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public String get_MarketingMetricsSection_MOZDomainAuthority_MOZOption_Value()
	{
		String text = getAttributeValue(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_MOZDomainAuthority_MOZOption_Textbox, "value").trim();
		return text;
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public String get_MarketingMetricsSection_OrganicTraffic_HatcherOption_Value()
	{
		String text = getAttributeValue(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_OrganicTraffic_HatcherOption_Textbox, "value").trim();
		return text;
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public String get_MarketingMetricsSection_OrganicTraffic_SEMRushOrganicTrafficOption_Value()
	{
		String text = getAttributeValue(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_OrganicTraffic_SEMRushOrganicTraffic_Textbox, "value").trim();
		return text;
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public String get_MarketingMetricsSection_TranscoRanking_HatcherOption_Value()
	{
		String text = getAttributeValue(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_TranscoRanking_HatcherOption_Textbox, "value").trim();
		return text;
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public String get_MarketingMetricsSection_TwitterFollowers_HatcherOption_Value()
	{
		String text = getAttributeValue(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_TwitterFollowers_HatcherOption_Textbox, "value").trim();
		return text;
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public String get_MarketingMetricsSection_TwitterFollowers_ClearbitOption_Value()
	{
		String text = getAttributeValue(txt_CompanyProfilePage_EditProfilePage_MarketingMetricsSection_TwitterFollowers_ClearbitOption_Textbox, "value").trim();
		return text;
	}

	/********************************************************************************************************************************************************/
	/**
	 *This method is used to return the account status in community settings.
	 *
	 *@author VijayaKumar.U
	 */
	public String get_CommunitySettingsSection_AccountStatus_HatcherOption_Value()
	{
		String text = null;
		String textfromApp = getAttributeValue(drp_CompanyProfilePage_EditProfilePage_CommunitySettingsSection_AccountStatus, "value").trim();
		int textNo = Integer.parseInt(textfromApp);
		if (textNo==0) 
		{
			text="Inactive";
		}
		else if (textNo==1) 
		{
			text="Active";
		}
		return text;
	}
	/**
	 *This method is used to return the account type in the community settings.
	 *
	 *@author VijayaKumar.U
	 */
	public String get_CommunitySettingsSection_AccountType_HatcherOption_Value()
	{
		String text = null;
		String textfromApp = getAttributeValue(drp_CompanyProfilePage_EditProfilePage_CommunitySettingsSection_AccountType, "value").trim();
		int textNo = Integer.parseInt(textfromApp);
		if (textNo==1) 
		{
			text="Entrepreneur";
		}
		else if (textNo==2) 
		{
			text="Investor";
		}
		else if (textNo==3) 
		{
			text="Expert";
		}
		return text;
	}
	/**
	 *This method is used to get the business type for community section.
	 *
	 *@author VijayaKumar.U
	 */
	public String get_CommunitySettingsSection_BusinessType_HatcherOption_Value()
	{
		String text = null;
		String textfromApp = getAttributeValue(drp_CompanyProfilePage_EditProfilePage_CommunitySettingsSection_BusinessType, "value").trim();
		int textNo = Integer.parseInt(textfromApp);
		if (textNo==10) 
		{
			text="Business Customers";
		}
		else if (textNo==20) 
		{
			text="Consumer Customers";
		}
		else if (textNo==95) 
		{
			text="Other";
		}
		return text;
	}
	/**
	 *This method is used to get the dealFlowStatus in hatcher option
	 *
	 *@author VijayaKumar.U
	 */
	public String get_CommunitySettingsSection_DealFlowStatus_HatcherOption_Value()
	{

		String text = null;
		String textfromApp = getAttributeValue(drp_CompanyProfilePage_EditProfilePage_CommunitySettingsSection_DealflowStatus, "value").trim();
		int textNo = Integer.parseInt(textfromApp);
		if (textNo==0) 
		{
			text="Passed";
		}
		else if (textNo==10) 
		{
			text="Unscreened";
		}
		else if (textNo==20) 
		{
			text="Screened";
		}
		else if (textNo==30) 
		{
			text="IC";
		}
		else if (textNo==40) 
		{
			text="Portfolio";
		}
		else if (textNo==50) 
		{
			text="Opportunities";
		}
		return text;
	}
	/**
	 *This method is used to get the HealthorPortfolioStatus .
	 *
	 *@author VijayaKumar.U
	 */
	public String get_CommunitySettingsSection_HealthorPortfolioStatus_HatcherOption_Value()
	{

		String text = null;
		String textfromApp = getAttributeValue(drp_CompanyProfilePage_EditProfilePage_CommunitySettingsSection_HealthPortfolioStatus, "value").trim();
		int textNo = Integer.parseInt(textfromApp);
		if (textNo==0) 
		{
			text="Out of Business";
		}
		else if (textNo==1) 
		{
			text="Status Unknown";
		}
		else if (textNo==5) 
		{
			text="Outlook Uncertain";
		}
		else if (textNo==10) 
		{
			text="Update Provided";
		}
		else if (textNo==20) 
		{
			text="Recently Funded";
		}
		else if (textNo==30) 
		{
			text="Audited Financials Uploaded";
		}
		else if (textNo==40) 
		{
			text="Acquired/Sold";
		}
		return text;
	}
	/**
	 *This method is used to get the placement agent for hatcher option.
	 *
	 *@author VijayaKumar.U
	 */
	public String get_CommunitySettingsSection_PlacementAgent_HatcherOption_Value()
	{

		String text = null;
		String textfromApp = getAttributeValue(drp_CompanyProfilePage_EditProfilePage_CommunitySettingsSection_PlacementAgent, "value").trim();
		int textNo = Integer.parseInt(textfromApp);
		if (textNo==0) 
		{
			text="No";
		}
		else if (textNo==1) 
		{
			text="Yes";
		}
		return text;
	}
	/**
	 *This method is used to get the main contact for hatcher option in community settings.
	 *
	 *@author VijayaKumar.U
	 */
	public String get_CommunitySettingsSection_MainContact_HatcherOption_Value()
	{
		String text = null;
		text = driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'syndicate_settings')]//*[contains(text(),'Main Contact')]/parent::div//select//option[not(contains(@value,'0'))]")).getText().trim();
		return text;
	}
	/**
	 *This method is used to get the RelationshipManager for hatcher
	 *
	 *@author VijayaKumar.U
	 */
	public String get_CommunitySettingsSection_RelationshipManager_HatcherOption_Value()
	{

		String text = null;
		String textfromApp = getAttributeValue(drp_CompanyProfilePage_EditProfilePage_CommunitySettingsSection_RelationshipManager, "value").trim();
		int textNo = Integer.parseInt(textfromApp);
		text = driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'syndicate_settings')]//*[contains(text(),'Relationship Manager')]/parent::div//select//option[contains(@value,'"+textNo+"')]")).getText().trim();
		return text;
	}
	/**
	 *This method is used to get the score Visibility for hatcher option
	 *
	 *@author VijayaKumar.U
	 */
	public String get_CommunitySettingsSection_ScoreVisibility_HatcherOption_Value()
	{

		String text = null;
		String textfromApp = getAttributeValue(drp_CompanyProfilePage_EditProfilePage_CommunitySettingsSection_ScoreVisibility, "value").trim();
		int textNo = Integer.parseInt(textfromApp);
		if (textNo==0) 
		{
			text="Show everyone";
		}
		else if (textNo==50) 
		{
			text="Hide For Everyone";
		}
		return text;
	}

	/********************************************************************************************************************************************************/
	/**
	 *This method is used to clear the company section.
	 *
	 *@author VijayaKumar.U
	 */
	public void clear_CompanySection_HatcherValues()
	{

		select_CompanySection_LegalName_HatcherOption();
		clearEditBox(txt_EP_CompanySection_LegalName_HatcherOption);
		click_CompanySection_FriendlyName_HatcherOption_RadioButton();
		clearEditBox(txt_EP_CompanySection_FriendlyName_HatcherOption);
		pressPageDown();
		click_CompanySection_RegistrationNumber_HatcherOption_RadioButton();
		clearEditBox(txt_EP_CompanySection_RegistrationNumber_HatcherOption);
	}
	/**
	 *This method is used to clear the contact section.
	 *
	 *@author VijayaKumar.U
	 */
	public void clear_ContactSection_HatcherValues()
	{
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'contact')]//span[contains(text(),'Contact Details')]"));
		scrolltoElementView(element);
		click_ContactDetailsSection_Address_HatcherOption_RadioButton();
		clearEditBox(txt_EP_ContactDetailsSection_Address_HatcherOption);
		click_ContactDetailsSection_UnitorSuite_HatcherOption_RadioButton();
		clearEditBox(txt_EP_ContactDetailsSection_UnitSuite_HatcherOption);
		click_ContactDetailsSection_City_HatcherOption_RadioButton();
		clearEditBox(txt_EP_ContactDetailsSection_City_HatcherOption);
		click_ContactDetailsSection_PostalCode_HatcherOption();
		clearEditBox(txt_EP_ContactDetailsSection_PostalCode_HatcherOption);
		click_ContactDetailsSection_State_HatcherOption_RadioButton();
		clearEditBox(txt_EP_ContactDetailsSection_State_HatcherOption);
		pressPageDown();
		click_ContactDetailsSection_Latitude_HatcherOption_RadioButton();
		clearEditBox(txt_EP_ContactDetailsSection_Latitude_HatcherOption);
		click_ContactDetailsSection_Longitude_HatcherOption_RadioButton();
		clearEditBox(txt_EP_ContactDetailsSection_Longitude_HatcherOption);
		click_ContactDetailsSection_CompanyEmail_HatcherOption_RadioButton();
		clearEditBox(txt_EditProfilePage_ContactDetailsSection_CompanyEmail_HatcherOption);
		click_ContactDetailsSection_Phone_Hatcher_RadioButton();
		clearEditBox(txt_CompanyProfilePage_EditProfilePage_ContactDetailsSection_Phone_HatcherOption_Textbox);
	}
	/**
	 *This method is used to clear the description section
	 *
	 *@author VijayaKumar.U
	 */
	public void clear_DescriptionSection_HatcherValues()
	{
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'description')]//span[contains(text(),'Description')]"));
		scrolltoElementView(element);
		click_DescriptionSection_Description_HatcherOption_RadioButton();
		clearEditBox(txt_CompanyProfilePage_EditProfilePage_DescriptionSection_Description_HatcherOption_Textbox);
	}
	/**
	 *This method is used to clear digital foot print section.
	 *
	 *@author VijayaKumar.U
	 */
	public void clear_DigitalFootPrintSection_HatcherValues()
	{
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'digital')]//span[contains(text(),'Digital Footprint')]"));
		scrolltoElementView(element);
		click_DigitalFootPrintSection_Crunchbase_HatcherOption_RadioButton();
		clearEditBox(txt_EP_DigitalFootPrintSection_Crunchbase_HatcherOption);
		click_DigitalFootPrintSection_Facebook_HatcherOption_RadioButton();
		clearEditBox(txt_EP_DigitalFootPrintSection_Facebook_HatcherOption);
		click_DigitalFootPrintSection_Instagram_HatcherOption_RadioButton();
		clearEditBox(txt_EP_DigitalFootPrintSection_Instagram_HatcherOption);
		click_DigitalFootPrintSection_Angellist_HatcherOption_RadioButton();
		clearEditBox(txt_EP_DigitalFootPrintSection_Angellist_HatcherOption);
		click_DigitalFootPrintSection_Medium_HatcherOption_RadioButton();
		clearEditBox(txt_EP_DigitalFootPrintSection_Medium_HatcherOption);
		click_DigitalFootPrintSection_LinkedIn_HatcherOption_RadioButton();
		clearEditBox(txt_EP_DigitalFootPrintSection_LinkedIn_HatcherOption);
		pressPageDown();
		click_DigitalFootPrintSection_Pinterest_HatcherOption_RadioButton();
		clearEditBox(txt_EditProfilePage_DigitalFootPrintSection_Pinterest_HatcherOption);
		click_DigitalFootPrintSection_RSSFeed_HatcherOption_RadioButton();
		clearEditBox(txt_EditProfilePage_DigitalFootPrintSection_RSSFeed_HatcherOption);
		click_DigitalFootPrintSection_Twitter_HatcherOption_RadioButton();
		clearEditBox(txt_EP_DigitalFootPrintSection_Twitter_HatcherOption);
		click_DigitalFootPrintSection_Vimeo_HatcherOption_RadioButton();
		clearEditBox(txt_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_Vimeo_HatcherOption_Textbox);
		click_DigitalFootPrintSection_Website_HatcherOption_RadioButton();
		clearEditBox(txt_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_Website_HatcherOption_Textbox);
		click_DigitalFootPrintSection_YouTube_Hatcher_RadioButton();
		clearEditBox(txt_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_YouTube_HatcherOption_Textbox);
	}
	/**
	 *This method is used to clear the finance and legal section
	 *
	 *@author VijayaKumar.U
	 */
	public void clear_FinanceandLegalSection_HatcherValues()
	{
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'finance_legal')]//span[contains(text(),'Finance & Legal')]"));
		scrolltoElementView(element);
		click_FinanceandLegalSection_Auditor_Hatcher_RadioButton();
		clearEditBox(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_Auditor_HatcherOption_Textbox);
		click_FinanceandLegalSection_Bank_HatcherOption_RadioButton();
		clearEditBox(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_Bank_HatcherOption_Textbox);
		click_FinanceandLegalSection_BankABANumber_HatcherOption_RadioButton();
		clearEditBox(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankABANumber_HatcherOption_Textbox);
		click_FinanceandLegalSection_BankAccountName_HatcherOption_RadioButton();
		clearEditBox(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankAccountName_HatcherOption_Textbox);
		click_FinanceandLegalSection_BankAccountNumber_HatcherOption_RadioButton();
		clearEditBox(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankAccountNumber_HatcherOption_Textbox);
		click_FinanceandLegalSection_BankAddress_HatcherOption_RadioButton();
		clearEditBox(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankAddress_HatcherOption_Textbox);
		pressPageDown();
		click_FinanceandLegalSection_BankIntermediary_HatcherOption_RadioButton();
		clearEditBox(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankIntermediary_HatcherOption_Textbox);
		click_FinanceandLegalSection_IntermediaryBankABANumber_HatcherOption_RadioButton();
		clearEditBox(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_IntermediaryBankABANumber_HatcherOption_Textbox);
		click_FinanceandLegalSection_IntermediaryBankAddress_HatcherOption_RadioButton();
		clearEditBox(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_IntermediaryBankAddress_HatcherOption_Textbox);
		click_FinanceandLegalSection_IntermediaryBankSWIFTBIC_HatcherOption_RadioButton();
		clearEditBox(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_IntermediaryBankSWIFTBIC_HatcherOption_Textbox);
		click_FinanceandLegalSection_BankSwiftCode_HatcherOption_RadioButton();
		clearEditBox(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankSwiftCode_HatcherOption_Textbox);
		click_FinanceandLegalSection_BankIBANCode_HatcherOption_RadioButton();
		clearEditBox(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankIBANCode_HatcherOption_Textbox);
		click_FinanceandLegalSection_BankInstructions_HatcherOption_RadioButton();
		clearEditBox(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankInstructions_HatcherOption_Textbox);
		click_FinanceandLegalSection_CompanySecretary_HatcherOption_RadioButton();
		clearEditBox(txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_CompanySecretary_HatcherOption_Textbox);
		click_FinanceandLegalSection_LawFirm_HatcherOption_RadioButton();
		clearEditBox(txt_EP_FinanceandLegalSection_LawFirm_HatcherOption);
	}
	/**
	 *This method is used to clear the keywords section.
	 *
	 *@author VijayaKumar.U
	 */
	public void clear_KeywordsSection_HatcherValues()
	{
		scrollToElement(rdb_EP_KeywordsSection_Keywords_HatcherOption);
		click_KeywordsSection_Keywords_HatcherOption_RadioButton();
		clearEditBox(txt_EP_KeywordsSection_Keywords_HatcherOption);
	}

	/********************************************************************************************************************************************************/
	/**
	 *This method is used to enter the company section hatcher values
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_CompanySection_HatcherValues(String legalName, String friendlyName, String incorporatioDate, String jurisdiction, String governingBody, String registrationNumber)
	{
		WebElement element = findWebElement(lbl_company);
		scrolltoElementView(element);
		select_CompanySection_LegalName_HatcherOption();
		enter_CompanySection_LegalName_HatcherOption_Textbox(legalName);
		select_CompanySection_FriendlyName_HatcherOption();
		enter_CompanySection_FriendlyName_HatcherOption_Textbox(friendlyName);
		click_CompanySection_IncorporationDate_HatcherOption_RadioButton();
		enter_CompanySection_IncorporationDateHatcherOption_Textbox(incorporatioDate);
		WebElement element2 = driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'company')]//*[text()='Incorporation date']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::div[contains(@class,'datepicker')]//input"));
		scrolltoElementView(element2);
		click_CompanySection_Jurisdiction_HatcherOption_RadioButton();
		select_CompanySection_Jurisdiction_From_list(jurisdiction);
		click_CompanySection_GoverningBody_Hatcher_RadioButton();
		select_CompanySection_GoverningBody(governingBody);
		click_CompanySection_RegistrationNumber_HatcherOption_RadioButton();
		enter_CompanySection_RegistrationNumber_HatcherOption_Textbox(registrationNumber);
	}
	public void fill_CompanySection_HatcherValues(String legalName, String friendlyName, String incorporatioDate, String jurisdiction, String governingBody, String registrationNumber)
	{
		WebElement element = findWebElement("//div[contains(@id,'company')]//span[contains(text(),'Company')]");
		scrolltoElementView(element);
		select_CompanySection_LegalName_HatcherOption();
		enter_CompanySection_LegalName_HatcherOption_Textbox(legalName);
		select_CompanySection_FriendlyName_HatcherOption();
		enter_CompanySection_FriendlyName_HatcherOption_Textbox(friendlyName);
		click_CompanySection_IncorporationDate_HatcherOption_RadioButton();
		enter_CompanySection_IncorporationDateHatcherOption_Textbox(incorporatioDate);
		WebElement element2 = driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'company')]//*[text()='Incorporation date']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::div[contains(@class,'datepicker')]//input"));
		scrolltoElementView(element2);
		click_CompanySection_Jurisdiction_HatcherOption_RadioButton();
		select_CompanySection_Jurisdiction_From_list(jurisdiction);
		click_CompanySection_GoverningBody_Hatcher_RadioButton();
		select_CompanySection_GoverningBody(governingBody);
		click_CompanySection_RegistrationNumber_HatcherOption_RadioButton();
		enter_CompanySection_RegistrationNumber_HatcherOption_Textbox(registrationNumber);
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void click_CompanySection_Save_Changes_Button()
	{

		click_CompanySection_SaveChanges_Button();
	}

	/********************************************************************************************************************************************************/
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_ContactSection_HatcherValues(String address, String unitorSuite, String city, String postalCode, String state, String country, String latitude, String longitude, String companyEmail, String phone)
	{
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'contact')]//span[contains(text(),'Contact Details')]"));
		scrolltoElementView(element);
		click_ContactDetailsSection_MainContact_HatcherOption_RadioButton();
		click_ContactDetailsSection_Address_HatcherOption_RadioButton();
		enter_ContactDetailsSection_Address_HatcherOption_Textbox(address);
		click_ContactDetailsSection_UnitorSuite_HatcherOption_RadioButton();
		enter_ContactDetailsSection_UnitorSuite_HatcherOption_Textbox(unitorSuite);
		click_ContactDetailsSection_City_HatcherOption_RadioButton();
		enter_ContactDetailsSection_City_HatcherOption_Textbox(city);
		click_ContactDetailsSection_PostalCode_HatcherOption();
		enter_ContactDetailsSection_PostalCode_HatcherOption_Textbox(postalCode);
		WebElement element2 = driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='Postal code']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']"));
		scrolltoElementView(element2);
		click_ContactDetailsSection_State_HatcherOption_RadioButton();
		enter_ContactDetailsSection_State_HatcherOption_Textbox(state);
		click_ContactDetailsSection_Country_HatcherOption_RadioButton();
		select_ContactDetailsSection_Country_HatcherOption(country);
		click_ContactDetailsSection_Latitude_HatcherOption_RadioButton();
		enter_ContactDetailsSection_Latitude_HatcherOption_Textbox(latitude);
		click_ContactDetailsSection_Longitude_HatcherOption_RadioButton();
		enter_ContactDetailsSection_Longitude_HatcherOption_Textbox(longitude);
		WebElement element3 = driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='Longitude']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']"));
		scrolltoElementView(element3);
		click_ContactDetailsSection_CompanyEmail_HatcherOption_RadioButton();
		enter_ContactDetailsSection_CompanyEmail_HatcherOption_Textbox(companyEmail);
		click_ContactDetailsSection_Phone_Hatcher_RadioButton();
		enter_ContactDetailsSection_Phone(phone);
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void click_ContactSection_Save_Changes_Button()
	{

		click_ContactDetailsSection_SaveChanges_Button();
	}

	/********************************************************************************************************************************************************/
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_DescriptionSection_HatcherValues(String description)
	{

		click_DescriptionSection_Description_HatcherOption_RadioButton();
		enter_DescriptionSection_RegistrationNumber_HatcherOption_Textbox(description);
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DescriptionSection_Save_Changes_Button()
	{

		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'description')]//input[contains(@type,'radio') and contains(@value,'Hatcher')]/parent::label//parent::div//div[contains(@class,'note-editable')]"));
		scrolltoElementView(element);
		click_DescriptionSection_SaveChanges_Button();
	}

	/********************************************************************************************************************************************************/
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_DigitalFootPrintSection_HatcherValues(String crunchBase, String facebook, String Instagram, String angellist, String medium, String linkedIn, String Pinterest, String rssFeed, String twitter, String vimeo, String website, String youtube)
	{
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'digital')]//span[contains(text(),'Digital Footprint')]"));
		scrolltoElementView(element);
		click_DigitalFootPrintSection_Crunchbase_HatcherOption_RadioButton();
		enter_DigitalFootPrintSection_Crunchbase_HatcherOption_Textbox(crunchBase);
		click_DigitalFootPrintSection_Facebook_HatcherOption_RadioButton();
		enter_DigitalFootPrintSection_Facebook_HatcherOption_Textbox(facebook);
		click_DigitalFootPrintSection_Instagram_HatcherOption_RadioButton();
		enter_DigitalFootPrintSection_Instagram_HatcherOption_Textbox(Instagram);
		click_DigitalFootPrintSection_Angellist_HatcherOption_RadioButton();
		enter_DigitalFootPrintSection_Angellist_HatcherOption_Textbox(angellist);
		click_DigitalFootPrintSection_Medium_HatcherOption_RadioButton();
		enter_DigitalFootPrintSection_Medium_HatcherOption_Textbox(medium);

		click_DigitalFootPrintSection_LinkedIn_HatcherOption_RadioButton();
		enter_DigitalFootPrintSection_LinkedIn_HatcherOption_Textbox(linkedIn);	

		click_DigitalFootPrintSection_Pinterest_HatcherOption_RadioButton();
		enter_DigitalFootPrintSection_PinterestHatcherOption_Textbox(Pinterest);
		click_DigitalFootPrintSection_RSSFeed_HatcherOption_RadioButton();
		enter_DigitalFootPrintSection_RSSFeed_HatcherOption_Textbox(rssFeed);
		click_DigitalFootPrintSection_Twitter_HatcherOption_RadioButton();
		enter_DigitalFootPrintSection_Twitter_HatcherOption_Texbox(twitter);
		click_DigitalFootPrintSection_Vimeo_HatcherOption_RadioButton();
		enter_DigitalFootPrintSection_Vimeo_HatcherOption_Textbox(vimeo);
		click_DigitalFootPrintSection_Website_HatcherOption_RadioButton();
		enter_DigitalFootPrintSection_Website_HatcherOption_Textbox(website);
		click_DigitalFootPrintSection_YouTube_Hatcher_RadioButton();
		enter_DigitalFootPrintSection_YouTube(youtube);
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DigitalFootPrintSection_Save_Changes_Button()
	{

		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='YouTube']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']"));
		scrolltoElementView(element);
		click_DigitalFootPrintSection_SaveChanges_Button();
	}

	/********************************************************************************************************************************************************/
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_FinanceandLegalSection_HatcherValues(String auditor, String bank, String bankABANumber, String bankAccountName, String bankAccountNumber, String bankAddress, String bankIntermediary, String intermediaryBankABANumber, String intermediaryBankAddress, String intermediaryBankSWIFTBIC, String bankSwiftCode, String bankibanCode, String bankInstructions, String companySecretary, String currency, String financialYearEnd, String lawFirm)
	{
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'finance_legal')]//span[contains(text(),'Finance & Legal')]"));
		scrolltoElementView(element);
		click_FinanceandLegalSection_Auditor_Hatcher_RadioButton();
		enter_FinanceandLegalSection_Auditor_HatcherOption_Textbox(auditor);
		click_FinanceandLegalSection_Bank_HatcherOption_RadioButton();
		enter_FinanceandLegalSection_Bank_HatcherOption_Textbox(bank);
		click_FinanceandLegalSection_BankABANumber_HatcherOption_RadioButton();
		enter_FinanceandLegalSection_BankABANumber_HatcherOption_Textbox(intermediaryBankABANumber);
		click_FinanceandLegalSection_BankAccountName_HatcherOption_RadioButton();
		enter_FinanceandLegalSection_BankAccountName_HatcherOption_Textbox(bankAccountName);
		click_FinanceandLegalSection_BankAccountNumber_HatcherOption_RadioButton();
		enter_FinanceandLegalSection_BankAccountNumber_HatcherOption_Textbox(bankAccountNumber);
		WebElement element2 = driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Bank Account Number']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']"));
		scrolltoElementView(element2);
		click_FinanceandLegalSection_BankAddress_HatcherOption_RadioButton();
		enter_FinanceandLegalSection_BankAddress_HatcherOption_Textbox(intermediaryBankAddress);
		click_FinanceandLegalSection_BankIntermediary_HatcherOption_RadioButton();
		enter_FinanceandLegalSection_BankIntermediary_HatcherOption_Textbox(bankIntermediary);
		click_FinanceandLegalSection_IntermediaryBankABANumber_HatcherOption_RadioButton();
		enter_FinanceandLegalSection_IntermediaryBankABANumber_HatcherOption_Textbox(intermediaryBankABANumber);
		click_FinanceandLegalSection_IntermediaryBankAddress_HatcherOption_RadioButton();
		enter_FinanceandLegalSection_IntermediaryBankAddress_HatcherOption_Textbox(intermediaryBankAddress);
		click_FinanceandLegalSection_IntermediaryBankSWIFTBIC_HatcherOption_RadioButton();
		enter_FinanceandLegalSection_IntermediaryBankSWIFTBIC_HatcherOption_Textbox(intermediaryBankSWIFTBIC);
		WebElement element3 = driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Intermediary Bank SWIFT BIC']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']"));
		scrolltoElementView(element3);
		click_FinanceandLegalSection_BankSwiftCode_HatcherOption_RadioButton();
		enter_FinanceandLegalSection_BankSwiftCode_HatcherOption_Textbox(bankSwiftCode);
		click_FinanceandLegalSection_BankIBANCode_HatcherOption_RadioButton();
		enter_FinanceandLegalSection_BankIBANCode_HatcherOption_Textbox(bankibanCode);
		click_FinanceandLegalSection_BankInstructions_HatcherOption_RadioButton();
		enter_FinanceandLegalSection_BankInstructions_HatcherOption_Textbox(bankInstructions);
		click_FinanceandLegalSection_CompanySecretary_HatcherOption_RadioButton();
		enter_FinanceandLegalSection_CompanySecretary_HatcherOption_Textbox(companySecretary);
		WebElement element4 = driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Company Secretary']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']"));
		scrolltoElementView(element4);
		click_FinanceandLegalSection_Currency_HatcherOption_RadioButton();
		select_FinanceandLegalSection_Currency_HatcherOption_Dropdown(currency);
		click_FinanceandLegalSection_FinancialYearEnd_HatcherOption_RadioButton();
		select_FinanceandLegalSection_FinancialYearEnd_HatcherOption_Dropdown(financialYearEnd);
		click_FinanceandLegalSection_LawFirm_HatcherOption_RadioButton();
		enter_FinanceandLegalSection_LawFirm_HatcherOption_Textbox(lawFirm);
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void click_FinanceandLegalSection_Save_Changes_Button()
	{

		WebElement element4 = driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Law Firm']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']"));
		scrolltoElementView(element4);
		click_FinanceandLegalSection_SaveChanges_Button();
	}

	/********************************************************************************************************************************************************/
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_KeywordsSection_HatcherValues(String keywords)
	{
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'keywords')]//span[contains(text(),'Keywords')]"));
		scrolltoElementView(element);
		click_KeywordsSection_Keywords_HatcherOption_RadioButton();
		enter_KeywordsSection_Keyword_HatcherOption_Textbox(keywords);
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void click_KeywordsSection_Save_Changes_Button()
	{

		click_KeywordsSection_SaveChanges_Button();
	}


	/********************************************************************************************************************************************************/
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_CommunitySettingsSection_HatcherValues(String accountStatus, String accountType, String businessType, String dealflowStatus, String healthorPortfolioStatus, String placementAgent, String scoreVisibility)
	{
		scrollToBottomofPage();
		select_CommunitySettingsSection_AccountStatus(accountStatus);
		select_CommunitySettingsSection_AccountType(accountType);
		select_CommunitySettingsSection_BusinessType(businessType);

		select_CommunitySettingsSection_PlacementAgent(placementAgent);
		select_CommunitySettingsSection_ScoreVisibility(scoreVisibility);
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void click_CommunitySettingsSection_Save_Changes_Button()
	{
		scrollToBottomofPage();
		click_CommunitySettingsSection_SaveChanges_Button();
	}

	/********************************************************************************************************************************************************/
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_CompanySection_ClearbitOption_EditCompany_CompanyProfilePage_Elements_displayed()
	{
		String companyLabelnameslst = "Legal Name,Friendly Name";

		String[] companyLabelnames = companyLabelnameslst.split(",");
		int count = companyLabelnames.length;
		for (int i = 0; i < count; i++) 
		{
			String name = companyLabelnames[i];
			try 
			{
				if (driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'company')]//*[text()='"+name+"']/parent::div/following-sibling::div//input[@type='radio' and @value='Clearbit']")).isDisplayed()) 
				{
					testStepPassed("Clearbit option Radiobutton is displayed for the label "+name+ " in company section of edit company profile page");

					try 
					{
						if (driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'company')]//*[text()='"+name+"']/parent::div/following-sibling::div//input[contains(@value,'Clearbit')]/parent::label/following-sibling::input[@type='text']")).isDisplayed()) 
						{
							testStepPassed("Clearbit option Textbox is displayed for the label "+name+ " in company section of edit company profile page");
						}
					} 
					catch (Exception e) 
					{
						testStepFailed("Clearbit option Textbox is not displayed for the label "+name+ " in company section of edit company profile page");
					}
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("Clearbit option Radiobutton is not displayed for the label "+name+ " in company section of edit company profile page");
			}
		}
	}

	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_CompanySection_LinkedInOption_EditCompany_CompanyProfilePage_Elements_displayed()
	{
		String companyLabelnameslst = "Friendly Name,Jurisdiction";

		String[] companyLabelnames = companyLabelnameslst.split(",");
		int count = companyLabelnames.length;
		for (int i = 0; i < count; i++) 
		{
			String name = companyLabelnames[i];
			try 
			{
				if (driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'company')]//*[text()='"+name+"']/parent::div/following-sibling::div//input[@type='radio' and @value='LinkedIn']")).isDisplayed()) 
				{
					testStepPassed("LinkedIn option Radiobutton is displayed for the label "+name+ " in company section of edit company profile page");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("LinkedIn option Radiobutton is not displayed for the label "+name+ " in company section of edit company profile page");
			}

			try 
			{
				if (isElementDisplayed(txt_EP_CompanySection_FriendlyName_LinkedInOption)) 
				{
					testStepPassed("Linked option Textbox is displayed for the label "+name+" in company section of edit company profile page");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("LinkedIn option Textbox is not displayed for the label "+name+ " in company section of edit company profile page");
			}

			try 
			{
				if (isElementDisplayed(drp_EP_CompanySection_Jurisdiction_LinkedInOption)) 
				{
					testStepPassed("LinkedIn option Dropdown is displayed for the label "+name+ " in company section of edit company profile page");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("LinkedIn option Dropdown is not displayed for the label "+name+ " in company section of edit company profile page");
			}
		}
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_ContactSection_ClearbitOption_EditCompany_CompanyProfilePage_Elements_displayed()
	{
		String companyLabelnameslst = "Address,Unit/Suite,City,Postal code,State,Country,Latitude,Longitude";

		String[] companyLabelnames = companyLabelnameslst.split(",");
		int count = companyLabelnames.length;
		for (int i = 0; i < count; i++) 
		{
			String name = companyLabelnames[i];
			try 
			{
				if (driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='"+name+"']/parent::div/following-sibling::div//input[@type='radio' and @value='Clearbit']")).isDisplayed()) 
				{
					testStepPassed("Clearbit option Radiobutton is displayed for the label "+name+ " in contact section of edit company profile page");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("Clearbit option Radiobutton is not displayed for the label "+name+ " in contact section of edit company profile page");
			}
		}

		try 
		{
			if (isElementDisplayed(txt_EP_ContactDetailsSection_Address_ClearbitOption)) 
			{
				testStepPassed("Clearbit option Textbox is displayed for the label Address in contact section of edit company profile page");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Clearbit option Textbox is not displayed for the label Address in contact section of edit company profile page");
		}

		try 
		{
			if (isElementDisplayed(txt_EP_ContactDetailsSection_UnitSuite_ClearbitOption)) 
			{
				testStepPassed("Clearbit option Textbox is displayed for the label Unit / Suite in contact section of edit company profile page");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Clearbit option Textbox is not displayed for the label Unit / Suite in contact section of edit company profile page");
		}

		try 
		{
			if (isElementDisplayed(txt_EP_ContactDetailsSection_City_ClearbitOption)) 
			{
				testStepPassed("Clearbit option Textbox is displayed for the label City in contact section of edit company profile page");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Clearbit option Textbox is not displayed for the label City in contact section of edit company profile page");
		}

		try 
		{
			if (isElementDisplayed(txt_EP_ContactDetailsSection_PostalCode_ClearbitOption)) 
			{
				testStepPassed("Clearbit option Textbox is displayed for the label Postal Code in contact section of edit company profile page");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Clearbit option Textbox is not displayed for the label Postal Code in contact section of edit company profile page");
		}

		try 
		{
			if (isElementDisplayed(txt_EP_ContactDetailsSection_State_ClearbitOption)) 
			{
				testStepPassed("Clearbit option Textbox is displayed for the label State in contact section of edit company profile page");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Clearbit option Textbox is not displayed for the label State in contact section of edit company profile page");
		}

		try 
		{
			if (isElementDisplayed(txt_EP_ContactDetailsSection_Latitude_ClearbitOption)) 
			{
				testStepPassed("Clearbit option Textbox is displayed for the label Latitude in contact section of edit company profile page");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Clearbit option Textbox is not displayed for the label Latitude in contact section of edit company profile page");
		}

		try 
		{
			if (isElementDisplayed(txt_CompanyProfilePage_EditProfilePage_ContactDetailsSection_Longitude_ClearbitOption_Textbox)) 
			{
				testStepPassed("Clearbit option Textbox is displayed for the label Longitude in contact section of edit company profile page");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Clearbit option Textbox is not displayed for the label Longitude in contact section of edit company profile page");
		}
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_ContactSection_LinkedInOption_EditCompany_CompanyProfilePage_Elements_displayed()
	{
		String companyLabelnameslst = "Address,City,Postal code,Country";

		String[] companyLabelnames = companyLabelnameslst.split(",");
		int count = companyLabelnames.length;
		for (int i = 0; i < count; i++) 
		{
			String name = companyLabelnames[i];
			try 
			{
				if (driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'contact')]//*[text()='"+name+"']/parent::div/following-sibling::div//input[@type='radio' and @value='LinkedIn']")).isDisplayed()) 
				{
					testStepPassed("LinkedIn option Radiobutton is displayed for the label "+name+ " in contact section of edit company profile page");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("LinkedIn option Radiobutton is not displayed for the label "+name+ " in contact section of edit company profile page");
			}
		}

		try 
		{
			if (isElementDisplayed(txt_EP_ContactDetailsSection_Address_LinkedInOption)) 
			{
				testStepPassed("LinkedIn option Textbox is displayed for the label Address in contact section of edit company profile page");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("LinkedIn option Textbox is not displayed for the label Address in contact section of edit company profile page");
		}

		try 
		{
			if (isElementDisplayed(txt_EP_ContactDetailsSection_City_LinkedInOption)) 
			{
				testStepPassed("LinkedIn option Textbox is displayed for the label City in contact section of edit company profile page");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("LinkedIn option Textbox is not displayed for the label City in contact section of edit company profile page");
		}

		try 
		{
			if (isElementDisplayed(txt_EP_ContactDetailsSection_PostalCode_LinkedInOption)) 
			{
				testStepPassed("LinkedIn option Textbox is displayed for the label Postal Code in contact section of edit company profile page");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("LinkedIn option Textbox is not displayed for the label Postal Code in contact section of edit company profile page");
		}

		try 
		{
			if (isElementDisplayed(drp_EP_ContactDetailsSection_Country_LinkedInOption)) 
			{
				testStepPassed("LinkedIn option Dropdown is displayed for the label Country in contact section of edit company profile page");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("LinkedIn option Dropdown is not displayed for the label Country in contact section of edit company profile page");
		}
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_DescriptionSection_ClearbitOption_EditCompany_CompanyProfilePage_Elements_displayed()
	{
		try 
		{
			if (isElementDisplayed(rdb_CompanyProfilePage_EditProfilePage_DescriptionSection_Description_ClearbitOption_RadioButton)) 
			{
				testStepPassed("Clearbit option Radiobutton is displayed for the label Description in Description section of edit company profile page");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Clearbit option Radiobutton is not displayed for the label Description in Description section of edit company profile page");
		}

		try 
		{
			if (isElementDisplayed(txt_CompanyProfilePage_EditProfilePage_DescriptionSection_Description_ClearbitOption_Textbox)) 
			{
				testStepPassed("Clearbit option Textbox is displayed for the label Description in Description section of edit company profile page");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Clearbit option Textbox is not displayed for the label Description in Description section of edit company profile page");
		}
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_DescriptionSection_LinkedInOption_EditCompany_CompanyProfilePage_Elements_displayed()

	{
		try 
		{
			if (isElementDisplayed(rdb_CompanyProfilePage_EditProfilePage_DescriptionSection_Description_LinkedInOption_RadioButton)) 
			{
				testStepPassed("LinkedIn option Radiobutton is displayed for the label Description in Description section of edit company profile page");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("LinkedIn option Radiobutton is not displayed for the label Description in Description section of edit company profile page");
		}

		try 
		{
			if (isElementDisplayed(txt_CompanyProfilePage_EditProfilePage_DescriptionSection_Description_LinkedInOption_Textbox)) 
			{
				testStepPassed("LinkedIn option Textbox is displayed for the label Description in Description section of edit company profile page");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("LinkedIn option Textbox is not displayed for the label Description in Description section of edit company profile page");
		}
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_DigitalFootprintSection_ClearbitOption_EditCompany_CompanyProfilePage_Elements_displayed()
	{
		String companyLabelnameslst = "Crunchbase,Facebook,LinkedIn,Twitter,Website";

		String[] companyLabelnames = companyLabelnameslst.split(",");
		int count = companyLabelnames.length;
		for (int i = 0; i < count; i++) 
		{
			String name = companyLabelnames[i];
			try 
			{
				if (driver.findElement(By.xpath("//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='"+name+"']/parent::div/following-sibling::div//input[@type='radio' and @value='Clearbit']")).isDisplayed()) 
				{
					testStepPassed("Clearbit option Radiobutton is displayed for the label "+name+ " in DigitalFootprint section of edit company profile page");

					try 
					{
						if (driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='"+name+"']/parent::div/following-sibling::div//input[contains(@value,'Clearbit')]/parent::label/following-sibling::input[@type='text']")).isDisplayed()) 
						{
							testStepPassed("Clearbit option Textbox is displayed for the label "+name+ " in DigitalFootprint section of edit company profile page");
						}
					} 
					catch (Exception e) 
					{
						testStepFailed("Clearbit option Textbox is not displayed for the label "+name+ " in DigitalFootprint section of edit company profile page");
					}
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("Clearbit option Radiobutton is not displayed for the label "+name+ " in DigitalFootprint section of edit company profile page");
			}
		}
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_KeywordsSection_ClearbitOption_EditCompany_CompanyProfilePage_Elements_displayed()
	{
		try 
		{
			if (isElementDisplayed(rdb_EP_KeywordsSection_Keywords_ClearbitOption)) 
			{
				testStepPassed("Clearbit option Radiobutton is displayed for the label Keywords in Keywords section of edit company profile page");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Clearbit option Radiobutton is not displayed for the label Keywords in Keywords section of edit company profile page");
		}

		try 
		{
			if (isElementDisplayed(txt_EP_KeywordsSection_Keywords_ClearbitOption)) 
			{
				testStepPassed("Clearbit option Textbox is displayed for the label Keywords in Keywords section of edit company profile page");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Clearbit option Textbox is not displayed for the label Keywords in Keywords section of edit company profile page");
		}
	}

	/*************************************************************************************************************************************************************/
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void click_CompanyProfile_Section_Share_Link()
	{

		movetoTopofPage();
		waitForElementToDisplay(lnk_CompanyProfilePage_Share, this.elementLoadWaitTime);
		clickOn(lnk_CompanyProfilePage_Share);
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void search_Document_DataRoom(String documentname)
	{
		waitForElementToDisplay(txt_CompanyProfilePage_DataRoomSection_Filter_Textbox, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//div[contains(@id,'dataroom-table_filter')]//input[contains(@type,'search')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		typeIn(txt_CompanyProfilePage_DataRoomSection_Filter_Textbox, documentname);
		waitTime(1);
	}

	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_CompanyProfile_Section_DataRoom_CompanyProfilePage_displayed()
	{
		try 
		{
			waitForElementToDisplay(lbl_CompanyProfilePage_DataRoomPage_CompanyProfileSection, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_CompanyProfilePage_DataRoomPage_CompanyProfileSection))
			{
				testStepPassed("Company Profile Section in Data Room of Company Profile Page is displayed");	
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Company Profile Section in Data Room of Company Profile Page is not displayed");
		}
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_DueDiligence_Section_DataRoom_CompanyProfilePage_displayed()
	{
		try 
		{
			waitForElementToDisplay(lbl_CompanyProfilePage_DataRoomPage_DueDiligenceSection, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_CompanyProfilePage_DataRoomPage_DueDiligenceSection))
			{
				testStepPassed("Due Diligence Section in Data Room of Company Profile Page is displayed");	
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Due Diligence Section in Data Room of Company Profile Page is not displayed");
		}
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_Investments_Section_DataRoom_CompanyProfilePage_displayed()
	{
		try 
		{
			waitForElementToDisplay(lbl_CompanyProfilePage_DataRoomPage_InvestmentsSection, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_CompanyProfilePage_DataRoomPage_InvestmentsSection))
			{
				testStepPassed("Investments Section in Data Room of Company Profile Page is displayed");	
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Investments Section in Data Room of Company Profile Page is not displayed");
		}
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_Financials_Section_DataRoom_CompanyProfilePage_displayed()
	{
		try 
		{
			waitForElementToDisplay(lbl_CompanyProfilePage_DataRoomPage_FinancialsSection, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_CompanyProfilePage_DataRoomPage_FinancialsSection))
			{
				testStepPassed("Financials Section in Data Room of Company Profile Page is displayed");	
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Financials Section in Data Room of Company Profile Page is not displayed");
		}
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_Legal_Section_DataRoom_CompanyProfilePage_displayed()
	{
		try 
		{
			waitForElementToDisplay(lbl_CompanyProfilePage_DataRoomPage_LegalSection, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_CompanyProfilePage_DataRoomPage_LegalSection))
			{
				testStepPassed("Legal Section in Data Room of Company Profile Page is displayed");	
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Legal Section in Data Room of Company Profile Page is not displayed");
		}
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_ShareholderUpdates_Section_DataRoom_CompanyProfilePage_displayed()
	{
		try 
		{
			waitForElementToDisplay(lbl_CompanyProfilePage_DataRoomPage_ShareholderUpdatesSection, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_CompanyProfilePage_DataRoomPage_ShareholderUpdatesSection))
			{
				testStepPassed("Shareholder Updates Section in Data Room of Company Profile Page is displayed");	
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Shareholder Updates Section in Data Room of Company Profile Page is not displayed");
		}
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_ManagementTeam_Section_DataRoom_CompanyProfilePage_displayed()
	{
		try 
		{
			waitForElementToDisplay(lbl_CompanyProfilePage_DataRoomPage_ManagementTeamSection, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_CompanyProfilePage_DataRoomPage_ManagementTeamSection))
			{
				testStepPassed("Management Team Section in Data Room of Company Profile Page is displayed");	
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Management Team Section in Data Room of Company Profile Page is not displayed");
		}
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_IPorTechnology_Section_DataRoom_CompanyProfilePage_displayed()
	{
		try 
		{
			waitForElementToDisplay(lbl_CompanyProfilePage_DataRoomPage_IPorTechnologySection, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_CompanyProfilePage_DataRoomPage_IPorTechnologySection))
			{
				testStepPassed("IP/Technology Section in Data Room of Company Profile Page is displayed");	
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("IP/Technology Section in Data Room of Company Profile Page is not displayed");
		}
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_Inbox_Section_DataRoom_CompanyProfilePage_displayed()
	{
		try 
		{
			waitForElementToDisplay(lbl_CompanyProfilePage_DataRoomPage_InboxSection, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_CompanyProfilePage_DataRoomPage_InboxSection))
			{
				testStepPassed("Inbox Section in Data Room of Company Profile Page is displayed");	
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Inbox Section in Data Room of Company Profile Page is not displayed");
		}
	}

	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public String get_FileName_CompanySection_Section_DataRoom_CompanyProfilePage_displayed()
	{
		String fileName = driver.findElement(By.xpath("(//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Company Profile')]/parent::td//div[contains(@class,'tab-content')]//a[contains(@title,'View')])[1]")).getText().trim();
		return fileName;
	}

	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */

	public void click_DataRoomPage_CompanyProfileSection_EditDataRoom_ToggleDots()
	{
		waitForElementToDisplay(lnk_CompanyProfilePage_DataRoomPage_CompanyProfileSection_EditDataRoom_ToggleDots, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//label[contains(text(),'Find')]/following-sibling::input"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		clickOn(lnk_CompanyProfilePage_DataRoomPage_CompanyProfileSection_EditDataRoom_ToggleDots);
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DataRoomPage_DueDiligenceSection_EditDataRoom_ToggleDots()
	{
		waitForElementToDisplay(lnk_CompanyProfilePage_DataRoomPage_DueDiligenceSection_EditDataRoom_ToggleDots, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Company Profile')]/parent::td"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		clickOn(lnk_CompanyProfilePage_DataRoomPage_DueDiligenceSection_EditDataRoom_ToggleDots);
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DataRoomPage_InvestmentsSection_EditDataRoom_ToggleDots()
	{
		waitForElementToDisplay(lnk_CompanyProfilePage_DataRoomPage_InvestmentsSection_EditDataRoom_ToggleDots, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Due Diligence')]/parent::td"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		clickOn(lnk_CompanyProfilePage_DataRoomPage_InvestmentsSection_EditDataRoom_ToggleDots);
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DataRoomPage_FinancialsSection_EditDataRoom_ToggleDots()
	{
		waitForElementToDisplay(lnk_CompanyProfilePage_DataRoomPage_FinancialsSection_EditDataRoom_ToggleDots, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Investments')]/parent::td"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		clickOn(lnk_CompanyProfilePage_DataRoomPage_FinancialsSection_EditDataRoom_ToggleDots);
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DataRoomPage_LegalSection_EditDataRoom_ToggleDots()
	{
		waitForElementToDisplay(lnk_CompanyProfilePage_DataRoomPage_LegalSection_EditDataRoom_ToggleDots, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Financials')]/parent::td"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		clickOn(lnk_CompanyProfilePage_DataRoomPage_LegalSection_EditDataRoom_ToggleDots);
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DataRoomPage_ShareholderUpdatesSection_EditDataRoom_ToggleDots()
	{
		waitForElementToDisplay(lnk_CompanyProfilePage_DataRoomPage_ShareholderUpdatesSection_EditDataRoom_ToggleDots, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Legal')]/parent::td"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		clickOn(lnk_CompanyProfilePage_DataRoomPage_ShareholderUpdatesSection_EditDataRoom_ToggleDots);
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DataRoomPage_ManagementTeamSection_EditDataRoom_ToggleDots()
	{
		waitForElementToDisplay(lnk_CompanyProfilePage_DataRoomPage_ManagementTeamSection_EditDataRoom_ToggleDots, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Shareholder Updates')]/parent::td"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		clickOn(lnk_CompanyProfilePage_DataRoomPage_ManagementTeamSection_EditDataRoom_ToggleDots);
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DataRoomPage_IPorTechnologySection_EditDataRoom_ToggleDots()
	{
		waitForElementToDisplay(lnk_CompanyProfilePage_DataRoomPage_IPorTechnologySection_EditDataRoom_ToggleDots, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Management Team')]/parent::td"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		clickOn(lnk_CompanyProfilePage_DataRoomPage_IPorTechnologySection_EditDataRoom_ToggleDots);
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DataRoomPage_InboxSection_EditDataRoom_ToggleDots()
	{
		waitForElementToDisplay(lnk_CompanyProfilePage_DataRoomPage_InboxSection_EditDataRoom_ToggleDots, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'IP/technology')]/parent::td"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		clickOn(lnk_CompanyProfilePage_DataRoomPage_InboxSection_EditDataRoom_ToggleDots);
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DataRoomPage_AddFolder_Link()
	{
		waitForElementToDisplay(lnk_CompanyProfilePage_DataRoomPage_AddFolder, this.elementLoadWaitTime);

		clickOn(lnk_CompanyProfilePage_DataRoomPage_AddFolder);
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DataRoomPage_DeleteRoom_Link()
	{
		waitForElementToDisplay(lnk_CompanyProfilePage_DataRoomPage_DeleteRoom, this.elementLoadWaitTime);

		clickOn(lnk_CompanyProfilePage_DataRoomPage_DeleteRoom);
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DataRoomPage_CompanyProfileSection_DefaultFolder_Link()
	{
		waitForElementToDisplay(lnk_CompanyProfilePage_DataRoomPage_CompanyProfileSection_DefaultFolder, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Company Profile')]/parent::td//div[contains(@class,'midnav')]//a[contains(text(),'Default Folder')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		clickOn(lnk_CompanyProfilePage_DataRoomPage_CompanyProfileSection_DefaultFolder);
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DataRoomPage_DueDiligenceSection_DefaultFolder_Link()
	{
		waitForElementToDisplay(lnk_CompanyProfilePage_DataRoomPage_DueDiligenceSection_DefaultFolder, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),' Due Diligence')]/parent::td//div[contains(@class,'midnav')]//a[contains(text(),'Default Folder')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		clickOn(lnk_CompanyProfilePage_DataRoomPage_DueDiligenceSection_DefaultFolder);
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DataRoomPage_InvestmentsSection_DefaultFolder_Link()
	{
		waitForElementToDisplay(lnk_CompanyProfilePage_DataRoomPage_InvestmentsSection_DefaultFolder, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),' Investments')]/parent::td//div[contains(@class,'midnav')]//a[contains(text(),'Default Folder')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		clickOn(lnk_CompanyProfilePage_DataRoomPage_InvestmentsSection_DefaultFolder);
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DataRoomPage_FinancialsSection_DefaultFolder_Link()
	{
		waitForElementToDisplay(lnk_CompanyProfilePage_DataRoomPage_FinancialsSection_DefaultFolder, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Financials')]/parent::td//div[contains(@class,'midnav')]//a[contains(text(),'Default Folder')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		clickOn(lnk_CompanyProfilePage_DataRoomPage_FinancialsSection_DefaultFolder);
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DataRoomPage_LegalSection_DefaultFolder_Link()
	{
		waitForElementToDisplay(lnk_CompanyProfilePage_DataRoomPage_LegalSection_DefaultFolder, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Legal')]/parent::td//div[contains(@class,'midnav')]//a[contains(text(),'Default Folder')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		clickOn(lnk_CompanyProfilePage_DataRoomPage_LegalSection_DefaultFolder);
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DataRoomPage_ShareholderUpdatesSection_DefaultFolder_Link()
	{
		waitForElementToDisplay(lnk_CompanyProfilePage_DataRoomPage_ShareholderUpdatesSection_DefaultFolder, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Shareholder Updates')]/parent::td//div[contains(@class,'midnav')]//a[contains(text(),'Default Folder')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		clickOn(lnk_CompanyProfilePage_DataRoomPage_ShareholderUpdatesSection_DefaultFolder);
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DataRoomPage_ManagementTeamSection_DefaultFolder_Link()
	{
		waitForElementToDisplay(lnk_CompanyProfilePage_DataRoomPage_ManagementTeamSection_DefaultFolder, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Management Team')]/parent::td//div[contains(@class,'midnav')]//a[contains(text(),'Default Folder')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		clickOn(lnk_CompanyProfilePage_DataRoomPage_ManagementTeamSection_DefaultFolder);
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DataRoomPage_IPorTechnologySection_DefaultFolder_Link()
	{
		waitForElementToDisplay(lnk_CompanyProfilePage_DataRoomPage_IPorTechnologySection_DefaultFolder, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'IP/technology')]/parent::td//div[contains(@class,'midnav')]//a[contains(text(),'Default Folder')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		clickOn(lnk_CompanyProfilePage_DataRoomPage_IPorTechnologySection_DefaultFolder);
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DataRoomPage_InboxSection_DefaultFolder_Link()
	{
		waitForElementToDisplay(lnk_CompanyProfilePage_DataRoomPage_InboxSection_DefaultFolder, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Inbox')]/parent::td//div[contains(@class,'midnav')]//a[contains(text(),'Default Folder')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		clickOn(lnk_CompanyProfilePage_DataRoomPage_InboxSection_DefaultFolder);
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_DataRoom_CompanyProfilePage_DefaultFolderSection_displayed()
	{
		String sectionNameslst = "Company Profile,Due Diligence,Investments,Financials,Legal,Shareholder Updates,Management Team,IP/technology,Inbox";

		String[] sectionLabelnames = sectionNameslst.split(",");
		int count = sectionLabelnames.length;
		for (int i = 0; i < count; i++) 
		{
			String name = sectionLabelnames[i];
			try 
			{
				if (driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'"+name+"')]/parent::td//a[contains(@class,'default') and contains(@class,'active')]")).isDisplayed()) 
				{
					testStepPassed(name+" section Default Folder is displayed");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed(name+" section Default Folder is not displayed");
			}
		}
	}

	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DataRoomPage_CompanyProfileSection_AddDocument_Button()
	{
		waitForElementToDisplay(btn_CompanyProfilePage_DataRoomPage_CompanyProfileSection_AddDocument, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//label[contains(text(),'Find')]/following-sibling::input"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		clickOn(btn_CompanyProfilePage_DataRoomPage_CompanyProfileSection_AddDocument);
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DataRoomPage_DueDiligenceSection_AddDocument_Button()
	{
		waitForElementToDisplay(btn_CompanyProfilePage_DataRoomPage_DueDiligenceSection_AddDocument, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Due Diligence')]/parent::td"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		clickOn(btn_CompanyProfilePage_DataRoomPage_DueDiligenceSection_AddDocument);
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DataRoomPage_InvestmentsSection_AddDocument_Button()
	{
		waitForElementToDisplay(btn_CompanyProfilePage_DataRoomPage_InvestmentsSection_AddDocument, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Investments')]/parent::td"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		clickOn(btn_CompanyProfilePage_DataRoomPage_InvestmentsSection_AddDocument);
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DataRoomPage_FinancialsSection_AddDocument_Button()
	{
		waitForElementToDisplay(btn_CompanyProfilePage_DataRoomPage_FinancialsSection_AddDocument, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Financials')]/parent::td"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		clickOn(btn_CompanyProfilePage_DataRoomPage_FinancialsSection_AddDocument);
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DataRoomPage_LegalSection_AddDocument_Button()
	{
		waitForElementToDisplay(btn_CompanyProfilePage_DataRoomPage_LegalSection_AddDocument, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Legal')]/parent::td"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		clickOn(btn_CompanyProfilePage_DataRoomPage_LegalSection_AddDocument);
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DataRoomPage_ShareholderUpdatesSection_AddDocument_Button()
	{
		waitForElementToDisplay(btn_CompanyProfilePage_DataRoomPage_ShareholderUpdatesSection_AddDocument, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Shareholder Updates')]/parent::td"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		clickOn(btn_CompanyProfilePage_DataRoomPage_ShareholderUpdatesSection_AddDocument);
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DataRoomPage_ManagementTeamSection_AddDocument_Button()
	{
		waitForElementToDisplay(btn_CompanyProfilePage_DataRoomPage_ManagementTeamSection_AddDocument, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Management Team')]/parent::td"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		clickOn(btn_CompanyProfilePage_DataRoomPage_ManagementTeamSection_AddDocument);
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DataRoomPage_IPorTechnologySection_AddDocument_Button()
	{
		waitForElementToDisplay(btn_CompanyProfilePage_DataRoomPage_IPorTechnologySection_AddDocument, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'IP/technology')]/parent::td"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		clickOn(btn_CompanyProfilePage_DataRoomPage_IPorTechnologySection_AddDocument);
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DataRoomPage_InboxSection_AddDocument_Button()
	{
		waitForElementToDisplay(btn_CompanyProfilePage_DataRoomPage_InboxSection_AddDocument, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Inbox')]/parent::td"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		clickOn(btn_CompanyProfilePage_DataRoomPage_InboxSection_AddDocument);
	}

	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DataRoomPage_CompanyProfileSection_EditFolder_ToggleDots()
	{
		waitForElementToDisplay(lnk_CompanyProfilePage_DataRoomPage_CompanyProfileSection_EditFolder_ToggleDots, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//*[contains(text(),'Company Profile')]/parent::div//div[contains(@class,'active show')]//div[contains(@class,'content-list')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		clickOn(lnk_CompanyProfilePage_DataRoomPage_CompanyProfileSection_EditFolder_ToggleDots);
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DataRoomPage_DueDiligenceSection_EditFolder_ToggleDots()
	{
		waitForElementToDisplay(lnk_CompanyProfilePage_DataRoomPage_DueDiligenceSection_EditFolder_ToggleDots, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Due Diligence')]/parent::td"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		clickOn(lnk_CompanyProfilePage_DataRoomPage_DueDiligenceSection_EditFolder_ToggleDots);
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DataRoomPage_InvestmentsSection_EditFolder_ToggleDots()
	{
		waitForElementToDisplay(lnk_CompanyProfilePage_DataRoomPage_InvestmentsSection_EditFolder_ToggleDots, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Investments')]/parent::td"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		clickOn(lnk_CompanyProfilePage_DataRoomPage_InvestmentsSection_EditFolder_ToggleDots);
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DataRoomPage_FinancialsSection_EditFolder_ToggleDots()
	{
		waitForElementToDisplay(lnk_CompanyProfilePage_DataRoomPage_FinancialsSection_EditFolder_ToggleDots, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Financials')]/parent::td"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		clickOn(lnk_CompanyProfilePage_DataRoomPage_FinancialsSection_EditFolder_ToggleDots);
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DataRoomPage_LegalSection_EditFolder_ToggleDots()
	{
		waitForElementToDisplay(lnk_CompanyProfilePage_DataRoomPage_LegalSection_EditFolder_ToggleDots, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Legal')]/parent::td"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		clickOn(lnk_CompanyProfilePage_DataRoomPage_LegalSection_EditFolder_ToggleDots);
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DataRoomPage_ShareholderUpdatesSection_EditFolder_ToggleDots()
	{
		waitForElementToDisplay(lnk_CompanyProfilePage_DataRoomPage_ShareholderUpdatesSection_EditFolder_ToggleDots, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Shareholder Updates')]/parent::td"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		clickOn(lnk_CompanyProfilePage_DataRoomPage_ShareholderUpdatesSection_EditFolder_ToggleDots);
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DataRoomPage_ManagementTeamSection_EditFolder_ToggleDots()
	{
		waitForElementToDisplay(lnk_CompanyProfilePage_DataRoomPage_ManagementTeamSection_EditFolder_ToggleDots, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Management Team')]/parent::td"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		clickOn(lnk_CompanyProfilePage_DataRoomPage_ManagementTeamSection_EditFolder_ToggleDots);
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DataRoomPage_IPorTechnologySection_EditFolder_ToggleDots()
	{
		waitForElementToDisplay(lnk_CompanyProfilePage_DataRoomPage_IPorTechnologySection_EditFolder_ToggleDots, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'IP/technology')]/parent::td"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		clickOn(lnk_CompanyProfilePage_DataRoomPage_IPorTechnologySection_EditFolder_ToggleDots);
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DataRoomPage_InboxSection_EditFolder_ToggleDots()
	{
		waitForElementToDisplay(lnk_CompanyProfilePage_DataRoomPage_InboxSection_EditFolder_ToggleDots, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Inbox')]/parent::td"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		clickOn(lnk_CompanyProfilePage_DataRoomPage_InboxSection_EditFolder_ToggleDots);
	}

	/**
	 *This method is used to verify the CompanyProfileSection of data Roompage
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DataRoomPage_CompanyProfileSection_EditFolderName_Link()
	{
		waitForElementToDisplay(lnk_CompanyProfilePage_DataRoomPage_CompanyProfileSection_EditFolderName, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//*[contains(text(),'Company Profile')]/parent::div//div[contains(@class,'content-list')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		clickOn(lnk_CompanyProfilePage_DataRoomPage_CompanyProfileSection_EditFolderName);
	}
	/**
	 *This method is used to verify the DueDiligenceSection Link
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DataRoomPage_DueDiligenceSection_EditFolderName_Link()
	{
		waitForElementToDisplay(lnk_CompanyProfilePage_DataRoomPage_DueDiligenceSection_EditFolderName, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Due Diligence')]/parent::td//div[contains(@class,'tab-content')]//ul[contains(@aria-labelledby,'dropdownMenuEditFolder')]//li//a[contains(text(),'Edit Folder Name')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		clickOn(lnk_CompanyProfilePage_DataRoomPage_DueDiligenceSection_EditFolderName);
	}
	/**
	 *This method is used to verify the investment section link
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DataRoomPage_InvestmentsSection_EditFolderName_Link()
	{
		waitForElementToDisplay(lnk_CompanyProfilePage_DataRoomPage_InvestmentsSection_EditFolderName, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Investments')]/parent::td//div[contains(@class,'tab-content')]//ul[contains(@aria-labelledby,'dropdownMenuEditFolder')]//li//a[contains(text(),'Edit Folder Name')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		clickOn(lnk_CompanyProfilePage_DataRoomPage_InvestmentsSection_EditFolderName);
	}
	/**
	 *This method is used to verify the financialsection link
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DataRoomPage_FinancialsSection_EditFolderName_Link()
	{
		waitForElementToDisplay(lnk_CompanyProfilePage_DataRoomPage_FinancialsSection_EditFolderName, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Financials')]/parent::td//div[contains(@class,'tab-content')]//ul[contains(@aria-labelledby,'dropdownMenuEditFolder')]//li//a[contains(text(),'Edit Folder Name')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		clickOn(lnk_CompanyProfilePage_DataRoomPage_FinancialsSection_EditFolderName);
	}
	/**
	 *This method is used to verify the legal section link
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DataRoomPage_LegalSection_EditFolderName_Link()
	{
		waitForElementToDisplay(lnk_CompanyProfilePage_DataRoomPage_LegalSection_EditFolderName, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Legal')]/parent::td//div[contains(@class,'tab-content')]//ul[contains(@aria-labelledby,'dropdownMenuEditFolder')]//li//a[contains(text(),'Edit Folder Name')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		clickOn(lnk_CompanyProfilePage_DataRoomPage_LegalSection_EditFolderName);
	}
	/**
	 *This method is used to verify the ShareholderUpdatesSection link
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DataRoomPage_ShareholderUpdatesSection_EditFolderName_Link()
	{
		waitForElementToDisplay(lnk_CompanyProfilePage_DataRoomPage_ShareholderUpdatesSection_EditFolderName, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Shareholder Updates')]/parent::td//div[contains(@class,'tab-content')]//ul[contains(@aria-labelledby,'dropdownMenuEditFolder')]//li//a[contains(text(),'Edit Folder Name')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		clickOn(lnk_CompanyProfilePage_DataRoomPage_ShareholderUpdatesSection_EditFolderName);
	}
	/**
	 *This method is used to verify the ManagementTeamSection Link
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DataRoomPage_ManagementTeamSection_EditFolderName_Link()
	{
		waitForElementToDisplay(lnk_CompanyProfilePage_DataRoomPage_ManagementTeamSection_EditFolderName, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Management Team')]/parent::td//div[contains(@class,'tab-content')]//ul[contains(@aria-labelledby,'dropdownMenuEditFolder')]//li//a[contains(text(),'Edit Folder Name')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		clickOn(lnk_CompanyProfilePage_DataRoomPage_ManagementTeamSection_EditFolderName);
	}
	/**
	 *This method is used to verify the IPorTechnologySection Link
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DataRoomPage_IPorTechnologySection_EditFolderName_Link()
	{
		waitForElementToDisplay(lnk_CompanyProfilePage_DataRoomPage_IPorTechnologySection_EditFolderName, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath(""));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		clickOn(lnk_CompanyProfilePage_DataRoomPage_IPorTechnologySection_EditFolderName);
	}
	/**
	 *This method is used to verify the link of inbox section.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DataRoomPage_InboxSection_EditFolderName_Link()
	{
		waitForElementToDisplay(lnk_CompanyProfilePage_DataRoomPage_InboxSection_EditFolderName, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Inbox')]/parent::td//div[contains(@class,'tab-content')]//ul[contains(@aria-labelledby,'dropdownMenuEditFolder')]//li//a[contains(text(),'Edit Folder Name')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		clickOn(lnk_CompanyProfilePage_DataRoomPage_InboxSection_EditFolderName);
	}
	/**
	 *This method is used to verify the delete folder link in the company profile section
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DataRoomPage_CompanyProfileSection_DeleteFolder_Link()
	{
		waitForElementToDisplay(lnk_CompanyProfilePage_DataRoomPage_CompanyProfileSection_DeleteFolder, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//*[contains(text(),'Company Profile')]/parent::div//div[contains(@class,'content-list')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		clickOn(lnk_CompanyProfilePage_DataRoomPage_CompanyProfileSection_DeleteFolder);
	}
	/**
	 *This method is used to verify the link in data room page.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DataRoomPage_DueDiligenceSection_DeleteFolder_Link()
	{
		waitForElementToDisplay(lnk_CompanyProfilePage_DataRoomPage_DueDiligenceSection_DeleteFolder, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Due Diligence')]/parent::td"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		clickOn(lnk_CompanyProfilePage_DataRoomPage_DueDiligenceSection_DeleteFolder);
	}
	/**
	 *This method is used to verify the delete folder link in the investment section.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DataRoomPage_InvestmentsSection_DeleteFolder_Link()
	{
		waitForElementToDisplay(lnk_CompanyProfilePage_DataRoomPage_InvestmentsSection_DeleteFolder, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Investments')]/parent::td"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		clickOn(lnk_CompanyProfilePage_DataRoomPage_InvestmentsSection_DeleteFolder);
	}
	/**
	 *This method is used to verify the financial section delete folder link
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DataRoomPage_FinancialsSection_DeleteFolder_Link()
	{
		waitForElementToDisplay(lnk_CompanyProfilePage_DataRoomPage_FinancialsSection_DeleteFolder, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Financials')]/parent::td"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		clickOn(lnk_CompanyProfilePage_DataRoomPage_FinancialsSection_DeleteFolder);
	}
	/**
	 *This method is used to verify the delete folder link in the legal section.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DataRoomPage_LegalSection_DeleteFolder_Link()
	{
		waitForElementToDisplay(lnk_CompanyProfilePage_DataRoomPage_LegalSection_DeleteFolder, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Legal')]/parent::td"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		clickOn(lnk_CompanyProfilePage_DataRoomPage_LegalSection_DeleteFolder);
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DataRoomPage_ShareholderUpdatesSection_DeleteFolder_Link()
	{
		waitForElementToDisplay(lnk_CompanyProfilePage_DataRoomPage_ShareholderUpdatesSection_DeleteFolder, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Shareholder Updates')]/parent::td"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		clickOn(lnk_CompanyProfilePage_DataRoomPage_ShareholderUpdatesSection_DeleteFolder);
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DataRoomPage_ManagementTeamSection_DeleteFolder_Link()
	{
		waitForElementToDisplay(lnk_CompanyProfilePage_DataRoomPage_ManagementTeamSection_DeleteFolder, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Management Team')]/parent::td"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		clickOn(lnk_CompanyProfilePage_DataRoomPage_ManagementTeamSection_DeleteFolder);
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DataRoomPage_IPorTechnologySection_DeleteFolder_Link()
	{
		waitForElementToDisplay(lnk_CompanyProfilePage_DataRoomPage_IPorTechnologySection_DeleteFolder, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'IP/technology')]/parent::td"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		clickOn(lnk_CompanyProfilePage_DataRoomPage_IPorTechnologySection_DeleteFolder);
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DataRoomPage_InboxSection_DeleteFolder_Link()
	{
		waitForElementToDisplay(lnk_CompanyProfilePage_DataRoomPage_InboxSection_DeleteFolder, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Inbox')]/parent::td"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		clickOn(lnk_CompanyProfilePage_DataRoomPage_InboxSection_DeleteFolder);
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */

	public void verify_CompanyProfile_DataRoomTab_displayed()
	{
		try 
		{
			waitForElementToDisplay(lnk_CompanyProfilePage_DataRoom, this.elementLoadWaitTime);
			if (isElementDisplayed(lnk_CompanyProfilePage_DataRoom)) 
			{
				testStepPassed("DataRoom Tab is displayed in Company profile Page");	
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("DataRoom Tab is not displayed in Company profile Page");
		}
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_CompanyProfile_DataRoomTab_isnotdisplayed()
	{
		try 
		{
			if (isElementDisplayed(lnk_CompanyProfilePage_DataRoom)) 
			{
				testStepFailed("DataRoom Tab is displayed in Company profile Page");	
			}
		} 
		catch (Exception e) 
		{
			testStepPassed("DataRoom Tab is not displayed in Company profile Page");
		}
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */


	public void click_DataRoomPage_CompanyProfileSection_Folder_Link(String folderName)
	{
		waitForElementToDisplay(lbl_CompanyProfilePage_DataRoomPage_CompanyProfileSection_Content, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//label[contains(text(),'Find')]/following-sibling::input"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//*[contains(text(),'Company Profile')]/following-sibling::div//div[contains(@class,'midnav')]//a[contains(text(),'"+folderName+"')]")).click();
	}

	private static final String lbl_CompanyProfilePage_DataRoomPage_DueDiligenceSection_New = "Due Diligence Section of Data Room Page in Company Profile Page#xpath=//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Due Diligence')]/parent::td";

	public void click_DataRoomPage_DueDiligenceSection_Folder_Link(String folderName)
	{
		waitForElementToDisplay(lbl_CompanyProfilePage_DataRoomPage_DueDiligenceSection, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Due Diligence')]/parent::td"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Due Diligence')]/parent::td//div[contains(@class,'midnav')]//a[contains(text(),'"+folderName+"')]")).click();
	}

	public void click_DataRoomPage_InvestmentsSection_Folder_Link(String folderName)
	{
		waitForElementToDisplay(btn_CompanyProfilePage_DataRoomPage_InvestmentsSection_AddDocument, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Investments')]/parent::td"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Investments')]/parent::td//div[contains(@class,'midnav')]//a[contains(text(),'"+folderName+"')]")).click();
	}

	public void click_DataRoomPage_FinancialsSection_Folder_Link(String folderName)
	{
		waitForElementToDisplay(btn_CompanyProfilePage_DataRoomPage_FinancialsSection_AddDocument, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Financials')]/parent::td"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Financials')]/parent::td//div[contains(@class,'midnav')]//a[contains(text(),'"+folderName+"')]")).click();
	}

	public void click_DataRoomPage_LegalProfileSection_Folder_Link(String folderName)
	{
		waitForElementToDisplay(btn_CompanyProfilePage_DataRoomPage_LegalSection_AddDocument, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Legal')]/parent::td"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Legal')]/parent::td//div[contains(@class,'midnav')]//a[contains(text(),'"+folderName+"')]")).click();
	}
	/**
	 *This method is used to verify the ShareholderUpdatesSection.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DataRoomPage_ShareholderUpdatesSection_Folder_Link(String folderName)
	{
		waitForElementToDisplay(btn_CompanyProfilePage_DataRoomPage_ShareholderUpdatesSection_AddDocument, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Shareholder Updates')]/parent::td"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Shareholder Updates')]/parent::td//div[contains(@class,'midnav')]//a[contains(text(),'"+folderName+"')]")).click();
	}
	/**
	 *This method is used to verify the ManagementTeamSection.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DataRoomPage_ManagementTeamSection_Folder_Link(String folderName)
	{
		waitForElementToDisplay(btn_CompanyProfilePage_DataRoomPage_ManagementTeamSection_AddDocument, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Management Team')]/parent::td"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Management Team')]/parent::td//div[contains(@class,'midnav')]//a[contains(text(),'"+folderName+"')]")).click();
	}
	/**
	 *This method is used to verify the IPortechnologySection.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DataRoomPage_IPortechnologySection_Folder_Link(String folderName)
	{
		waitForElementToDisplay(btn_CompanyProfilePage_DataRoomPage_IPorTechnologySection_AddDocument, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'IP/technology')]/parent::td"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'IP/technology')]/parent::td//div[contains(@class,'midnav')]//a[contains(text(),'"+folderName+"')]")).click();
	}
	/**
	 *This method is used to verify theinbox link.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DataRoomPage_InboxSection_Folder_Link(String folderName)
	{
		waitForElementToDisplay(btn_CompanyProfilePage_DataRoomPage_InboxSection_AddDocument, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Inbox')]/parent::td"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Inbox')]/parent::td//div[contains(@class,'midnav')]//a[contains(text(),'"+folderName+"')]")).click();
	}

	/**
	 *This method is used to verify the display of the default folder in data room.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_DataRoom_CompanySection_DefaultFolder_displayed()	{	
		try 		{
			waitForElementToDisplay(lbl_CompanyProfilePage_DataRoomPage_CompanyProfileSection_DefaultFolder, this.elementLoadWaitTime);
			if (driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//*[contains(text(),'Company Profile')]/following-sibling::div//div[contains(@class,'midnav')]//a[contains(text(),'Default Folder') and contains(@class,'active')]")).isDisplayed()) 
			{
				testStepPassed("Company Profile Section Default Folder is displayed");
			}		} 
		catch (Exception e) 		{
			testStepFailed("Company Profile Section Default Folder is not displayed");
		}	}
	/**
	 *This method is used to verify the display of dataroom default folder.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_DataRoom_DueDiligenceSection_DefaultFolder_displayed()	{
		try 		{
			waitForElementToDisplay(lbl_CompanyProfilePage_DataRoomPage_DueDiligenceSection_DefaultFolder, this.elementLoadWaitTime);
			if (driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Due Diligence')]/parent::td//div[contains(@class,'midnav')]//a[contains(text(),'Default Folder') and contains(@class,'active')]")).isDisplayed()) 
			{
				testStepPassed("Due Diligence Section Default Folder is displayed");
			}		} 
		catch (Exception e) 		{
			testStepFailed("Due Diligence Section Default Folder is not displayed");
		}	}
	/**
	 *This method is used to verify the display of the company section in create folder.
	 *
	 *@author VijayaKumar.U
	 */

	public void verify_DataRoom_CompanySection_CreatedFolder_displayed(String folderName)	{	
		try 		{
			waitTime(2);
			if (driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//*[contains(text(),'Company Profile')]/following-sibling::div/div[contains(@class,'midnav')]//a[contains(text(),'"+folderName+"') and contains(@class,'active')]")).isDisplayed()) 
			{
				testStepPassed("Company Profile Section "+folderName+" Folder is displayed");
			}		} 
		catch (Exception e) 		{
			testStepFailed("Company Profile Section "+folderName+" Folder is not displayed");
		}
	}
	/**
	 *This method is used to verify the dueDiligence display of create folder
	 *
	 *@param folderName
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_DataRoom_DueDiligenceSection_CreatedFolder_displayed(String folderName)	{
		try 		{
			waitTime(2);
			if (driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Due Diligence')]/parent::td//div[contains(@class,'midnav')]//a[contains(text(),'"+folderName+"') and contains(@class,'active')]")).isDisplayed()) 
			{
				testStepPassed("Due Diligence Section "+folderName+" Folder is displayed");
			}		} 
		catch (Exception e) 		{
			testStepFailed("Due Diligence Section "+folderName+" Folder is not displayed");
		}
	}
	/**
	 *This method is used to verify the data room page for edit of file
	 *
	 *@param folderName,fileName
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_DataRoomPage_CompanyProfileSection_EditFile_View_File(String folderName, String fileName)	{
		try 		{
			if (driver.findElement(By.xpath("(//div[contains(@id,'data_room-panel')]//*[contains(text(),'Company Profile')]/parent::div//div[contains(@class,'midnav')]//a[contains(text(),'"+folderName+"') and contains(@class,'active')]/parent::div/parent::div//following-sibling::div[contains(@class,'tab-content-dataroom')]//div[contains(@class,'active show')]//div[contains(@class,'content row')])[1]//a[contains(@id,'dropdownMenuLinkTask')]")).isDisplayed()) 
			{
				testStepPassed("File uploaded is displayed");

				driver.findElement(By.xpath("(//div[contains(@id,'data_room-panel')]//*[contains(text(),'Company Profile')]/parent::div//div[contains(@class,'midnav')]//a[contains(text(),'"+folderName+"') and contains(@class,'active')]/parent::div/parent::div//following-sibling::div[contains(@class,'tab-content-dataroom')]//div[contains(@class,'active show')]//div[contains(@class,'content row')])[1]//a[contains(@id,'dropdownMenuLinkTask')]")).click();

				try 			{
					waitForElementToDisplay(lst_CompanyProfilePage_DataRoomPage_CompanyProfileSection_FileActionList, this.elementLoadWaitTime);

					waitTime(2);

					if (driver.findElement(By.xpath("(//div[contains(@id,'data_room-panel')]//*[contains(text(),'Company Profile')]/parent::div//div[contains(@class,'midnav')]//a[contains(text(),'"+folderName+"') and contains(@class,'active')]/parent::div/parent::div//following-sibling::div[contains(@class,'tab-content-dataroom')]//div[contains(@class,'active show')]//div[contains(@class,'content row')])[1]//ul")).isDisplayed()) 
					{
						testStepPassed("File uploaded Task List is displayed");

						clickOn(lst_CompanyProfilePage_DataRoomPage_CompanyProfileSection_FileActionList_View);

						waitTime(2);

						ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());

						driver.switchTo().window(tabs.get(1));

						try 						{
							waitForElementToDisplay(lbl_CompanyProfilePage_DataRoomPage_CompanyProfileSection_FileViewer, this.elementLoadWaitTime);

							if(isElementDisplayed(lbl_File_Viewer)) 
							{
								testStepPassed("File View Window is displayed");

								try 			{
									getText(fileNamefromApp).trim();

									if (fileNamefromApp.equalsIgnoreCase(fileName)) 						{
										testStepPassed("Correct File View Window for the file " +fileName+" is displayed");
									}					} 
								catch (Exception e) 					{
									testStepFailed("Correct File View Window for the file " +fileName+" is not displayed");
								}				}						} 
						catch (Exception e) 			{
							testStepFailed("File View Window is not displayed");
						}

						driver.close();

						driver.switchTo().window(tabs.get(0));
					}				} 
				catch (Exception e) 				{
					testStepFailed("File uploaded Task List is not displayed");
				}			}		} 
		catch (Exception e) 		{
			testStepFailed("File uploaded is not displayed");
		}	}
	/**
	 *This method is used to verify the view of the file in due diligence section
	 *
	 *@param filename
	 *
	 *@author VijayaKumar.U
	 */

	public void verify_DataRoomPage_DueDiligenceSection_EditFile_View_File(String fileName)
	{
		try 
		{
			if (isElementDisplayed(DataRoom_dueDiligence_dropdownMenuLinkTask)) 
			{
				testStepPassed("File uploaded is displayed");

				clickOn(DataRoom_dueDiligence_dropdownMenuLinkTask);

				try 
				{
					waitForElementToDisplay(lst_CompanyProfilePage_DataRoomPage_DueDiligenceSection_FileActionList, this.elementLoadWaitTime);

					if (isElementDisplayed(lst_CompanyProfilePage_DataRoomPage_DueDiligenceSection_FileActionList_View)) 
					{
						testStepPassed("File uploaded Task List is displayed");

						clickOn(lst_CompanyProfilePage_DataRoomPage_DueDiligenceSection_FileActionList_View);

						waitTime(2);

						ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());

						driver.switchTo().window(tabs.get(1));

						try 
						{
							waitForElementToDisplay(lbl_CompanyProfilePage_DataRoomPage_DueDiligenceSection_FileViewer, this.elementLoadWaitTime);

							if (driver.findElement(By.xpath("//div[contains(@id,'cover')]//*[contains(text(),'File Viewer')]")).isDisplayed()) 
							{
								testStepPassed("File View Window is displayed");

								try 
								{
									String fileNamefromApp = driver.findElement(By.xpath("//div[contains(@id,'cover')]//div[contains(@class,'transparent-form')]//div[contains(@class,'country-list')]")).getText().trim();

									if (fileNamefromApp.equalsIgnoreCase(fileName)) 
									{
										testStepPassed("Correct File View Window for the file " +fileName+" is displayed");
									}
								} 
								catch (Exception e) 
								{
									testStepFailed("Correct File View Window for the file " +fileName+" is not displayed");
								}
							}
						} 
						catch (Exception e) 
						{
							testStepFailed("File View Window is not displayed");
						}

						driver.close();

						driver.switchTo().window(tabs.get(0));
					}
				} 
				catch (Exception e) 
				{
					testStepFailed("File uploaded Task List is not displayed");
				}			}		} 
		catch (Exception e) 
		{
			testStepFailed("File uploaded is not displayed");
		}	}

	/*********************************Edit File Data Room***********************/
	/**
	 *This method is used to verify the the display of the file edited in the data room
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_EditFile_DataRoom_Window_displayed()
	{
		try 
		{
			waitForElementToDisplay(lbl_EditFile_DataRoom_ModalDialogWindow_Heading, this.elementLoadWaitTime);
			if (isElementDisplayed(lbl_EditFile_DataRoom_ModalDialogWindow_Heading)) 
			{
				testStepPassed("Edit File Window is displayed");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Edit File Window is not displayed");
		}
	}
	/**
	 *This method is used to edit the document title in the data room
	 *
	 *@param newFileName
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_EditFile_DataRoom_Window_DocumentTitle(String newFileName)
	{
		waitForElementToDisplay(txt_EditFile_DataRoom_ModalDialogWindow_DocumentTitle, this.elementLoadWaitTime);
		clearEditBox(txt_EditFile_DataRoom_ModalDialogWindow_DocumentTitle);
		typeIn(txt_EditFile_DataRoom_ModalDialogWindow_DocumentTitle, newFileName);
	}
	/**
	 *This method is used to select and edit the file type in data room.
	 *@param newFileType
	 *
	 *@author VijayaKumar.U
	 */
	public void select_EditFile_DataRoom_Window_FileType(String newFileType)
	{
		waitForElementToDisplay(drp_EditFile_DataRoom_ModalDialogWindow_FileType, this.elementLoadWaitTime);
		selectFromDropdown(drp_EditFile_DataRoom_ModalDialogWindow_FileType, newFileType);
	}
	/**
	 *This method is used to select and edit the document permission.
	 *
	 *@param newDocumentPermissions
	 *
	 *@author VijayaKumar.U
	 */
	public void select_EditFile_DataRoom_Window_DocumentPermissions(String newDocumentPermissions)
	{
		waitForElementToDisplay(drp_EditFile_DataRoom_ModalDialogWindow_DocumentPermissions, this.elementLoadWaitTime);
		selectFromDropdown(drp_EditFile_DataRoom_ModalDialogWindow_DocumentPermissions, newDocumentPermissions);
	}
	/**
	 *This method is used to select and edit the file in data room.
	 *
	 *@param newFolder
	 *
	 *@author VijayaKumar.U
	 */
	public void select_EditFile_DataRoom_Window_Folder(String newFolder)
	{
		waitForElementToDisplay(drp_EditFile_DataRoom_ModalDialogWindow_Folder, this.elementLoadWaitTime);
		selectFromDropdown(drp_EditFile_DataRoom_ModalDialogWindow_Folder, newFolder);
	}
	/**
	 *This method is used to to edit the file in data room.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_EditFile_DataRoom_Window_EditButton()
	{
		waitForElementToDisplay(btn_EditFile_DataRoom_ModalDialogWindow_Edit, this.elementLoadWaitTime);
		clickOn(btn_EditFile_DataRoom_ModalDialogWindow_Edit);
	}
	/**
	 *This method is used to edit the file and close window.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_EditFile_DataRoom_Window_Close()
	{
		waitForElementToDisplay(lnk_EditFile_DataRoom_ModalDialogWindow_Close, this.elementLoadWaitTime);
		clickOn(lnk_EditFile_DataRoom_ModalDialogWindow_Close);
	}

	/*********************************Edit File Data Room***********************/
	/**
	 *This method is used to verify the dataroom for editing file.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_DataRoomPage_CompanyProfileSection_EditFile_Edit_File(String oldCompanyFileName, String newCompanyFileName, String newCompanyFileType, String newCompanyDocumentPermissions, String newFolder){
		try {
			if (driver.findElement(By.xpath("(//div[contains(@id,'data_room-panel')]//*[contains(text(),'Company Profile')]/following-sibling::div//div[contains(@class,'tab-content')]//div[contains(@class,'content row')])[1]//a[contains(@id,'dropdownMenuLinkTask')]")).isDisplayed()) 
			{
				testStepPassed("File uploaded is displayed");

				driver.findElement(By.xpath("(//div[contains(@id,'data_room-panel')]//*[contains(text(),'Company Profile')]/following-sibling::div//div[contains(@class,'tab-content')]//div[contains(@class,'content row')])[1]//a[contains(@id,'dropdownMenuLinkTask')]")).click();
				try 	{
					waitForElementToDisplay(lst_CompanyProfilePage_DataRoomPage_CompanyProfileSection_FileActionList, this.elementLoadWaitTime);

					if (driver.findElement(By.xpath("(//div[contains(@id,'data_room-panel')]//*[contains(text(),'Company Profile')]/following-sibling::div//div[contains(@class,'tab-content')]//div[contains(@class,'content row')])[1]//ul")).isDisplayed())	{
						testStepPassed("File uploaded Task List is displayed");
						clickOn(lst_CompanyProfilePage_DataRoomPage_CompanyProfileSection_FileActionList_Edit);
						verify_EditFile_DataRoom_Window_displayed();
						String oldCompanyFileNameinApp = getText(txt_EditFile_DataRoom_ModalDialogWindow_DocumentTitle).trim();
						try	{
							if (oldCompanyFileNameinApp.equalsIgnoreCase(oldCompanyFileName))							{
								testStepPassed("Company File Name entered during File Upload and in edit File Window are same");
							}	} 
						catch (Exception e)	{
							testStepFailed("Company File Name entered during File Upload and in edit File Window are not same");
						}
						enter_EditFile_DataRoom_Window_DocumentTitle(newCompanyFileName);

						select_EditFile_DataRoom_Window_FileType(newCompanyFileType);

						select_EditFile_DataRoom_Window_DocumentPermissions(newCompanyDocumentPermissions);

						select_EditFile_DataRoom_Window_Folder(newFolder);

						click_EditFile_DataRoom_Window_EditButton();
					}
				} 
				catch (Exception e) 		{
					testStepFailed("File uploaded Task List is not displayed");
				}			}		} 
		catch (Exception e) 		{
			testStepFailed("File uploaded is not displayed");
		}	}
	/**
	 *This method is used to verify the Data Room with due diligence section.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_DataRoomPage_DueDiligenceSection_EditFile(String oldDueDiligenceFileName, String newDueDiligenceFileName, String newDueDiligenceFileType, String newDueDiligenceDocumentPermissions, String newFolder){
		try		{
			if (driver.findElement(By.xpath("(//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Due Diligence')]/parent::td//div[contains(@class,'tab-content')]//div[contains(@class,'active')]//div[contains(@class,'row content')]//a[contains(@id,'dropdownMenuLinkTask')])[1]")).isDisplayed()) 
			{
				testStepPassed("File uploaded is displayed");

				driver.findElement(By.xpath("(//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Due Diligence')]/parent::td//div[contains(@class,'tab-content')]//div[contains(@class,'active')]//div[contains(@class,'row content')]//a[contains(@id,'dropdownMenuLinkTask')])[1]")).click();

				try		{
					waitForElementToDisplay(lst_CompanyProfilePage_DataRoomPage_DueDiligenceSection_FileActionList, this.elementLoadWaitTime);

					if (driver.findElement(By.xpath("(//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Due Diligence')]/parent::td//div[contains(@class,'tab-content')]//div[contains(@class,'active')]//div[contains(@class,'row content')]//ul)[1]")).isDisplayed()) 
					{
						testStepPassed("File uploaded Task List is displayed");

						clickOn(lst_CompanyProfilePage_DataRoomPage_DueDiligenceSection_FileActionList_Edit);

						verify_EditFile_DataRoom_Window_displayed();

						String oldCompanyFileNameinApp = getText(txt_EditFile_DataRoom_ModalDialogWindow_DocumentTitle).trim();

						try	{
							if (oldCompanyFileNameinApp.equalsIgnoreCase(oldDueDiligenceFileName)) 							{
								testStepPassed("CDue Diligence Name entered during File Upload and in edit File Window are same");
							}	} 
						catch (Exception e) 						{
							testStepFailed("Due Diligence Name entered during File Upload and in edit File Window are not same");
						}

						enter_EditFile_DataRoom_Window_DocumentTitle(newDueDiligenceFileName);

						select_EditFile_DataRoom_Window_FileType(newDueDiligenceFileType);

						select_EditFile_DataRoom_Window_DocumentPermissions(newDueDiligenceDocumentPermissions);

						select_EditFile_DataRoom_Window_Folder(newFolder);

						click_EditFile_DataRoom_Window_EditButton();
					}				} 
				catch (Exception e) 				{
					testStepFailed("File uploaded Task List is not displayed");
				}		}		} 
		catch (Exception e)		{
			testStepFailed("File uploaded is not displayed");
		}	}

	/**
	 *This method is used to verify DataRoomPage Company Profile Section downl oadFile
	 *
	 *@param filename
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_DataRoomPage_CompanyProfileSection_Download_File()	{
		try 		{
			if (driver.findElement(By.xpath("(//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Company Profile')]/parent::td//div[contains(@class,'tab-content')]//div[contains(@class,'active')]//div[contains(@class,'row content')]//a[contains(@id,'dropdownMenuLinkTask')])[1]")).isDisplayed()) 
			{
				testStepPassed("File uploaded is displayed");
				try 				{
					waitForElementToDisplay(lst_CompanyProfilePage_DataRoomPage_CompanyProfileSection_FileActionList, this.elementLoadWaitTime);

					if (driver.findElement(By.xpath("(//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Company Profile')]/parent::td//div[contains(@class,'tab-content')]//div[contains(@class,'active')]//div[contains(@class,'row content')]//ul)[1]")).isDisplayed()) 
					{
						testStepPassed("File uploaded Task List is displayed");

						String downloadFileLink = getAttributeValue(lst_CompanyProfilePage_DataRoomPage_CompanyProfileSection_FileActionList_Download, "href");

						testStepPassed("Download File Link : "+downloadFileLink);

						String userDirectory = System.getProperty("user.dir");

						String path = userDirectory+"\\wget\\wget.exe";

						String downloadpath = userDirectory+"\\Downloads";

						String wget_command = "cmd /c "+path+" -P "+downloadpath+" --no-check-certificate "+downloadFileLink;

						Runtime.getRuntime().exec(wget_command);

						waitTime(5);

						Runtime.getRuntime().exec("taskkill /f /im cmd.exe");
					}				} 
				catch (Exception e) {
					testStepFailed("File uploaded Task List is not displayed");
				}	}	} 
		catch (Exception e) 	{
			testStepFailed("File uploaded is not displayed");
		}	}

	/*********************************Delete File of Data Room***********************/

	public void verify_DeleteFile_DataRoom_Window_displayed()	{
		try 	{
			waitForElementToDisplay(lbl_DeleteFile_DataRoom_ModalDialogWindow_Heading, this.elementLoadWaitTime);
			if (isElementDisplayed(lbl_DeleteFile_DataRoom_ModalDialogWindow_Heading)) 		{
				testStepPassed("Delete File Window is displayed");
			}		} 
		catch (Exception e) 	{
			testStepFailed("Delete File Window is not displayed");
		}	}
	/**
	 *This method is used to verify deletion of correct filename
	 *
	 *@param filename
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_CorrectDeleteFile_DataRoom_Window_FileName_displayed(String fileName)
	{
		waitForElementToDisplay(lbl_DeleteFile_DataRoom_ModalDialogWindow_Heading, this.elementLoadWaitTime);
		String fileNameinDeleteFileWindow = getText(lbl_DeleteFile_DataRoom_ModalDialogWindow_FileName).trim();
		testStepPassed("fileNameinDeleteFileWindow :"+fileNameinDeleteFileWindow);
		testStepPassed("fileName :"+fileName);

		try 
		{
			if (fileNameinDeleteFileWindow.equalsIgnoreCase(fileName)) 
			{
				testStepPassed("Correct Delete File window for the file "+fileName+" is displayed");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Correct Delete File window for the file "+fileName+" is not displayed");
		}
	}
	/**
	 *This method is used to delete the file in dataRoom window.
	 *
	 *@param filename
	 *
	 *@author VijayaKumar.U
	 */

	public void click_DeleteFile_DataRoom_Window_DeleteButton()
	{
		waitForElementToDisplay(btn_DeleteFile_DataRoom_ModalDialogWindow_Delete, this.elementLoadWaitTime);
		clickOn(btn_DeleteFile_DataRoom_ModalDialogWindow_Delete);
	}
	/**
	 *This method is used to close DeleteFile data room window.
	 *
	 *@param filename
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DeleteFile_DataRoom_Window_Close()
	{
		waitForElementToDisplay(lnk_DeleteFile_DataRoom_ModalDialogWindow_Close, this.elementLoadWaitTime);
		clickOn(lnk_DeleteFile_DataRoom_ModalDialogWindow_Close);
	}


	/*********************************Delete File of Data Room***********************/
	/**
	 *This method is used to verify DataRoomPage Company Profile Section DeleteFile
	 *
	 *@param filename
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_DataRoomPage_CompanyProfileSection_DeleteFile(String folderName, String fileName)
	{
		try		{
			if (driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//*[contains(text(),'Company Profile')]/following-sibling::div//div[contains(@class,'midnav1')]//a[contains(text(),'"+folderName+"') and contains(@class,'active')]/parent::div/following-sibling::div[contains(@class,'tab-content')]//div[contains(@class,'active show')]//div[contains(@class,'content row')]//a[contains(@id,'dropdownMenuLinkTask')]")).isDisplayed()) 
			{
				testStepPassed("File uploaded is displayed");

				driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//*[contains(text(),'Company Profile')]/following-sibling::div//div[contains(@class,'midnav1')]//a[contains(text(),'"+folderName+"') and contains(@class,'active')]/parent::div/following-sibling::div[contains(@class,'tab-content')]//div[contains(@class,'active show')]//div[contains(@class,'content row')]//a[contains(@id,'dropdownMenuLinkTask')]")).click();

				try {

					waitTime(2);

					if (driver.findElement(By.xpath("(//div[contains(@id,'data_room-panel')]//*[contains(text(),'Company Profile')]/following-sibling::div/div[contains(@class,'midnav')]//a[contains(text(),'"+folderName+"') and contains(@class,'active')]/parent::div/following-sibling::div//div[contains(@class,'active show')]//ul)[1]")).isDisplayed()) 
					{
						testStepPassed("File uploaded Task List is displayed");

						driver.findElement(By.xpath("(//div[contains(@id,'data_room-panel')]//*[contains(text(),'Company Profile')]/following-sibling::div/div[contains(@class,'midnav')]//a[contains(text(),'"+folderName+"') and contains(@class,'active')]/parent::div/following-sibling::div//div[contains(@class,'active show')]//ul)[1]//li//a[contains(text(),'Delete')]")).click();

						verify_DeleteFile_DataRoom_Window_displayed();

						click_DeleteFile_DataRoom_Window_DeleteButton();
					}	} 
				catch (Exception e) 
				{
					testStepFailed("File uploaded Task List is not displayed");
				}	}	} 
		catch (Exception e) 
		{
			testStepFailed("File uploaded is not displayed");
		}	}

	/**
	 *This method is used to verify the due diligence section in data room
	 *
	 *@param filename
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_DataRoomPage_DueDiligenceSection_DeleteFile(String fileName)
	{
		try		{
			if (driver.findElement(By.xpath("(//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Due Diligence')]/parent::td//div[contains(@class,'tab-content')]//div[contains(@class,'active')]//div[contains(@class,'row content')]//a[contains(@id,'dropdownMenuLinkTask')])[1]")).isDisplayed()) 
			{
				testStepPassed("File uploaded is displayed");

				driver.findElement(By.xpath("(//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Due Diligence')]/parent::td//div[contains(@class,'tab-content')]//div[contains(@class,'active')]//div[contains(@class,'row content')]//a[contains(@id,'dropdownMenuLinkTask')])[1]")).click();

				try 
				{
					waitForElementToDisplay(lst_CompanyProfilePage_DataRoomPage_DueDiligenceSection_FileActionList, this.elementLoadWaitTime);

					if (driver.findElement(By.xpath("(//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Due Diligence')]/parent::td//div[contains(@class,'tab-content')]//div[contains(@class,'active')]//div[contains(@class,'row content')]//ul)[1]")).isDisplayed()) 
					{
						testStepPassed("File uploaded Task List is displayed");

						clickOn(lst_CompanyProfilePage_DataRoomPage_DueDiligenceSection_FileActionList_Delete);

						verify_DeleteFile_DataRoom_Window_displayed();

						click_DeleteFile_DataRoom_Window_DeleteButton();
					}
				} 
				catch (Exception e) 
				{
					testStepFailed("File uploaded Task List is not displayed");
				}
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("File uploaded is not displayed");
		}
	}

	/*********************************Delete Folder of Data Room***********************/
	/**
	 *This method is used to display of the folder deletion in data Room .
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_DeleteFolder_DataRoom_Window_displayed()
	{
		try 
		{
			waitForElementToDisplay(lbl_DeleteFolder_DataRoom_ModalDialogWindow, this.elementLoadWaitTime);
			if (isElementDisplayed(lbl_DeleteFolder_DataRoom_ModalDialogWindow)) 
			{
				testStepPassed("Delete Folder Window is displayed");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Delete Folder Window is not displayed");
		}
	}
	/**
	 *This method is used to verify the correct folder deletion in the data room window.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_CorrectDeleteFolder_DataRoom_Window_FileName_displayed(String folderName)
	{
		waitForElementToDisplay(lbl_DeleteFolder_DataRoom_ModalDialogWindow_FolderName, this.elementLoadWaitTime);
		String folderNameinDeleteFileWindowFull = getText(lbl_DeleteFolder_DataRoom_ModalDialogWindow_FolderName).trim();
		String editedText = folderNameinDeleteFileWindowFull.substring(folderNameinDeleteFileWindowFull.lastIndexOf("are you sure you want to delete folder")+39, folderNameinDeleteFileWindowFull.length()-1).trim();
		String folderNameinDeleteFolderWindow = editedText;

		testStepPassed("Folder Name in Delete Folder Window :"+folderNameinDeleteFolderWindow);
		testStepPassed("Folder Name :"+folderName);

		try 
		{
			if (folderNameinDeleteFolderWindow.equalsIgnoreCase(folderName)) 
			{
				testStepPassed("Correct Delete Folder window for the Folder "+folderName+" is displayed");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Correct Delete Folder window for the Folder "+folderName+" is not displayed");
		}
	}
	/**
	 *This method is used to delete the folder in the data Room.
	 *
	 *@author VijayaKumar.U
	 */

	public void click_DeleteFolder_DataRoom_Window_DeleteButton()
	{
		waitForElementToDisplay(btn_DeleteFolder_DataRoom_ModalDialogWindow_DeleteFolder, this.elementLoadWaitTime);
		clickOn(btn_DeleteFolder_DataRoom_ModalDialogWindow_DeleteFolder);
	}
	/**
	 *This method is used to close the folder in data room.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DeleteFolder_DataRoom_Window_Close()
	{
		waitForElementToDisplay(lnk_DeleteFolder_DataRoom_ModalDialogWindow_CloseWindow, this.elementLoadWaitTime);
		clickOn(lnk_DeleteFolder_DataRoom_ModalDialogWindow_CloseWindow);
	}
	/**
	 *This method is used to verify the company profile section in data room page.
	 *
	 *@author VijayaKumar.U
	 */

	public void verify_DataRoomPage_CompanyProfileSection_DeleteFolder(String folderName)
	{
		verify_DeleteFolder_DataRoom_Window_displayed();

		click_DeleteFolder_DataRoom_Window_DeleteButton();
	}

	/**
	 *This method is used to verify the delete folder in data room page with due diligence.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_DataRoomPage_DueDiligenceSection_DeleteFolder(String folderName)
	{
		verify_DeleteFolder_DataRoom_Window_displayed();

		verify_CorrectDeleteFolder_DataRoom_Window_FileName_displayed(folderName);

		click_DeleteFolder_DataRoom_Window_DeleteButton();
	}
	/**
	 *This method is used to verify the deletion of folder in the data room page.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_DataRoomPage_CompanyProfileSection_Folder_Deleted(String folderName)
	{
		waitForElementToDisplay(lbl_CompanyProfilePage_DataRoomPage_CompanyProfileSection_Content, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//label[contains(text(),'Find')]/following-sibling::input"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		try 
		{
			if (driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//*[contains(text(),'Company Profile')]/following-sibling::div//div[contains(@class,'midnav')]//a[contains(text(),'"+folderName+"')]")).isDisplayed()) 
			{
				testStepFailed("Created Folder "+folderName+" is not deleted");
			}
		} 
		catch (Exception e) 
		{
			testStepPassed("Created Folder "+folderName+" is deleted");
		}
	}
	/**
	 *This method is used to verify the deletion of the folder.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_DataRoomPage_DueDiligenceSection_Folder_Deleted(String folderName)
	{
		waitForElementToDisplay(lbl_CompanyProfilePage_DataRoomPage_DueDiligenceSection_Content, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Due Diligence')]/parent::td"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		try 
		{
			if (driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Due Diligence')]/parent::td//div[contains(@class,'midnav')]//a[contains(text(),'"+folderName+"')]")).isDisplayed()) 
			{
				testStepFailed("Created Folder "+folderName+" is not deleted");
			}
		} 
		catch (Exception e) 
		{
			testStepPassed("Created Folder "+folderName+" is deleted");
		}
	}

	/*********************************Delete Folder of Data Room***********************/
	/**
	 *This method is used to restrict the document permission.
	 *
	 *@author VijayaKumar.U
	 */
	public void Change_DataRoomPage_CompanyProfileSection_EditFile_Restrict_Document_Permission(String companyDocumentPermissions)
	{
		try 
		{
			if (driver.findElement(By.xpath("(//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Company Profile')]/parent::td//div[contains(@class,'tab-content')]//div[contains(@class,'active')]//div[contains(@class,'row content')]//a[contains(@id,'dropdownMenuLinkTask')])[1]")).isDisplayed()) 
			{
				testStepPassed("File uploaded is displayed");

				driver.findElement(By.xpath("(//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Company Profile')]/parent::td//div[contains(@class,'tab-content')]//div[contains(@class,'active')]//div[contains(@class,'row content')]//a[contains(@id,'dropdownMenuLinkTask')])[1]")).click();

				try 
				{
					waitForElementToDisplay(lst_CompanyProfilePage_DataRoomPage_CompanyProfileSection_FileActionList, this.elementLoadWaitTime);

					if (driver.findElement(By.xpath("(//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Company Profile')]/parent::td//div[contains(@class,'tab-content')]//div[contains(@class,'active')]//div[contains(@class,'row content')]//ul)[1]")).isDisplayed()) 
					{
						testStepPassed("File uploaded Task List is displayed");

						clickOn(lst_CompanyProfilePage_DataRoomPage_CompanyProfileSection_FileActionList_Edit);

						verify_EditFile_DataRoom_Window_displayed();

						select_EditFile_DataRoom_Window_DocumentPermissions(companyDocumentPermissions);

						click_EditFile_DataRoom_Window_EditButton();
					}
				} 
				catch (Exception e) 
				{
					testStepFailed("File uploaded Task List is not displayed");
				}
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("File uploaded is not displayed");
		}
	}

	/**
	 *This method is used to get the description company profile page.
	 *
	 *@author VijayaKumar.U
	 */
	public String get_Description_CompanyprofilePage()
	{

		String text = getText(lbl_CompanyProfilePage_Profile_MainPage_Description);

		return text;
	}
	/**
	 *This method is used to verify the profile public view.
	 *
	 *@author VijayaKumar.U
	 */


	public void verify_ViewProfileasPublic_DialogWindow_displayed()
	{
		waitForElementToDisplay(lbl_CompanyProfilePage_ViewProfileasPublic_DialogWindow, this.elementLoadWaitTime);

		if (isElementDisplayed(lbl_CompanyProfilePage_ViewProfileasPublic_DialogWindow)) 
		{
			testStepPassed("Company Profile page is displayed as public");
		} 
		else 
		{
			testStepFailed("Company Profile page is not displayed as public");
		}
	}
	/**
	 *This method is used to click doggledits company profile page.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_DoggleDits_Contact_CompanyProfilePage()
	{
		waitForElementToDisplay(lnk_CompanyProfilePage_Profile_MainPage_Contact_DoggleDots, this.elementLoadWaitTime);

		clickOn(lnk_CompanyProfilePage_Profile_MainPage_Contact_DoggleDots);
	}
	/**
	 *This method is used to click and edit contact in company profile page.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_Edit_Contact_CompanyProfilePage()
	{
		waitForElementToDisplay(lst_CompanyProfilePage_Profile_MainPage_Contact_OptionsList, this.elementLoadWaitTime);

		clickOn(lnk_CompanyProfilePage_Profile_MainPage_Contact_OptionsList_Edit);
	}
	/**
	 *This method is used to verify the edit link .
	 *
	 *@author VijayaKumar.U
	 */
	public void click_EditLink_Contact_CompanyProfilePage()
	{
		click_DoggleDits_Contact_CompanyProfilePage();

		click_Edit_Contact_CompanyProfilePage();
	}

	/**
	 *This method is used to verify the website link.
	 *
	 *@author VijayaKumar.U
	 */


	public void click_Website_ExternalLinks_About_CompanyProfilePage()
	{
		waitForElementToDisplay(lnk_Website_externalLinks_About_CompanyProfilePage, this.elementLoadWaitTime);

		clickOn(lnk_Website_externalLinks_About_CompanyProfilePage);
	}
	/**
	 *This method is used to verify the linkedIn external link.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_LinkedIn_ExternalLinks_About_CompanyProfilePage()
	{
		waitForElementToDisplay(lnk_LinkedIn_externalLinks_About_CompanyProfilePage, this.elementLoadWaitTime);

		clickOn(lnk_LinkedIn_externalLinks_About_CompanyProfilePage);
	}
	/**
	 *This method is used to verify the facebook external link .
	 *
	 *@author VijayaKumar.U
	 */
	public void click_Facebook_ExternalLinks_About_CompanyProfilePage()
	{
		waitForElementToDisplay(lnk_Facebook_externalLinks_About_CompanyProfilePage, this.elementLoadWaitTime);

		clickOn(lnk_Facebook_externalLinks_About_CompanyProfilePage);
	}
	/**
	 *This method is used to verify the instagram link.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_Instagram_ExternalLinks_About_CompanyProfilePage()
	{
		waitForElementToDisplay(lnk_Instagram_externalLinks_About_CompanyProfilePage, this.elementLoadWaitTime);

		clickOn(lnk_Instagram_externalLinks_About_CompanyProfilePage);
	}
	/**
	 *This method is used to verify the angel list link.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_AngelList_ExternalLinks_About_CompanyProfilePage()
	{
		waitForElementToDisplay(lnk_AngelList_externalLinks_About_CompanyProfilePage, this.elementLoadWaitTime);

		clickOn(lnk_AngelList_externalLinks_About_CompanyProfilePage);
	}
	/**
	 *This method is used to verify the medium external link.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_Medium_ExternalLinks_About_CompanyProfilePage()
	{
		waitForElementToDisplay(lnk_Medium_externalLinks_About_CompanyProfilePage, this.elementLoadWaitTime);

		clickOn(lnk_Medium_externalLinks_About_CompanyProfilePage);
	}
	/**
	 *This method is used to verify the click twitter external link.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_Twitter_ExternalLinks_About_CompanyProfilePage()
	{
		waitForElementToDisplay(lnk_Twitter_externalLinks_About_CompanyProfilePage, this.elementLoadWaitTime);

		clickOn(lnk_Twitter_externalLinks_About_CompanyProfilePage);
	}
	/**
	 *This method is used to verify the crunch base external link about.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_Crunchbase_ExternalLinks_About_CompanyProfilePage()
	{
		waitForElementToDisplay(lnk_Crucnhbase_externalLinks_About_CompanyProfilePage, this.elementLoadWaitTime);

		clickOn(lnk_Crucnhbase_externalLinks_About_CompanyProfilePage);
	}
	/**
	 *This method is used to verify the youtube external link about.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_Youtube_ExternalLinks_About_CompanyProfilePage()
	{
		waitForElementToDisplay(lnk_Youtube_externalLinks_About_CompanyProfilePage, this.elementLoadWaitTime);

		clickOn(lnk_Youtube_externalLinks_About_CompanyProfilePage);
	}

	/**
	 *This method is used to verify the display of website tab.
	 *
	 *@author VijayaKumar.U
	 */

	public void verify_Website_NewTab_displayed()
	{
		click_Website_ExternalLinks_About_CompanyProfilePage();

		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());

		driver.switchTo().window(tabs.get(1));

		waitForElementToDisplay(lbl_Website_NewTab_CompanyProfilePage, this.elementLoadWaitTime);

		String pageTitle = driver.getTitle();

		if (pageTitle.contains("Google")) 
		{
			testStepPassed("Google Tab is displayed");
		} 
		else 
		{
			testStepFailed("Google Tab is not displayed");
		}

		driver.close();

		driver.switchTo().window(tabs.get(0));
	}	
	/**
	 *This method is used to verify the display of linkedIn tab. 
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_LinkedIn_NewTab_displayed()
	{
		click_LinkedIn_ExternalLinks_About_CompanyProfilePage();

		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());

		driver.switchTo().window(tabs.get(1));

		waitForElementToDisplay(lbl_Website_NewTab_CompanyProfilePage, this.elementLoadWaitTime);

		String pageTitle = driver.getTitle();

		if (pageTitle.contains("LinkedIn")) 
		{
			testStepPassed("LinkedIn Tab is displayed");
		} 
		else 
		{
			testStepFailed("LinkedIn Tab is not displayed");
		}

		driver.close();

		driver.switchTo().window(tabs.get(0));
	}	
	/**
	 *This method is used to verify the facebook tab display.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_Facebook_NewTab_displayed()
	{
		click_Facebook_ExternalLinks_About_CompanyProfilePage();

		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());

		driver.switchTo().window(tabs.get(1));

		waitForElementToDisplay(lbl_Website_NewTab_CompanyProfilePage, this.elementLoadWaitTime);

		String pageTitle = driver.getTitle();

		if (pageTitle.contains("Facebook")) 	{	
			testStepPassed("Facebook Tab is displayed");
		} 
		else 		{
			testStepFailed("Facebook Tab is not displayed");
		}

		driver.close();

		driver.switchTo().window(tabs.get(0));
	}	
	/**
	 *This method is used to verify the instagram display.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_Instagram_NewTab_displayed()	{
		click_Instagram_ExternalLinks_About_CompanyProfilePage();

		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());

		driver.switchTo().window(tabs.get(1));

		waitForElementToDisplay(lbl_Website_NewTab_CompanyProfilePage, this.elementLoadWaitTime);

		String pageTitle = driver.getTitle();

		if (pageTitle.contains("Instagram")) 		{
			testStepPassed("Instagram Tab is displayed");
		} 
		else 	{
			testStepFailed("Instagram Tab is not displayed");
		}

		driver.close();

		driver.switchTo().window(tabs.get(0));
	}	
	/**
	 *This method is used to verify the angel List tab display.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_AngelList_NewTab_displayed()	{
		click_AngelList_ExternalLinks_About_CompanyProfilePage();

		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());

		driver.switchTo().window(tabs.get(1));

		waitForElementToDisplay(lbl_Website_NewTab_CompanyProfilePage, this.elementLoadWaitTime);

		String pageTitle = driver.getTitle();

		if (pageTitle.contains("AngelList")) 
		{
			testStepPassed("AngelList Tab is displayed");
		} 
		else 
		{
			testStepFailed("AngelList Tab is not displayed");
		}

		driver.close();

		driver.switchTo().window(tabs.get(0));
	}	
	/**
	 *This method is used to verify the display of medium tab.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_Medium_NewTab_displayed()
	{
		click_Medium_ExternalLinks_About_CompanyProfilePage();

		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());

		driver.switchTo().window(tabs.get(1));

		waitForElementToDisplay(lbl_Website_NewTab_CompanyProfilePage, this.elementLoadWaitTime);

		String pageTitle = driver.getTitle();

		if (pageTitle.contains("Medium")) 
		{
			testStepPassed("Medium Tab is displayed");
		} 
		else 
		{
			testStepFailed("Medium Tab is not displayed");
		}

		driver.close();

		driver.switchTo().window(tabs.get(0));
	}	
	/**
	 *This method is used to verify the twitter tab.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_Twitter_NewTab_displayed()
	{
		click_Twitter_ExternalLinks_About_CompanyProfilePage();

		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());

		driver.switchTo().window(tabs.get(1));

		waitForElementToDisplay(lbl_Website_NewTab_CompanyProfilePage, this.elementLoadWaitTime);

		String pageTitle = driver.getTitle();

		if (pageTitle.contains("Twitter")) 
		{
			testStepPassed("Twitter Tab is displayed");
		} 
		else 
		{
			testStepFailed("Twitter Tab is not displayed");
		}

		driver.close();

		driver.switchTo().window(tabs.get(0));
	}	
	/**
	 *This method is used to verify the crunchBase tab.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_CrunchBase_NewTab_displayed()
	{
		click_Crunchbase_ExternalLinks_About_CompanyProfilePage();

		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());

		driver.switchTo().window(tabs.get(1));

		waitForElementToDisplay(lbl_Website_NewTab_CompanyProfilePage, this.elementLoadWaitTime);

		String pageTitle = driver.getTitle();

		if (pageTitle.contains("Crunchbase")) 
		{
			testStepPassed("Crunchbase Tab is displayed");
		} 
		else 
		{
			testStepFailed("Crunchbase Tab is not displayed");
		}

		driver.close();

		driver.switchTo().window(tabs.get(0));
	}	
	/**
	 *This method is used to verify the youtube newTab display.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_Youtube_NewTab_displayed()
	{
		click_Youtube_ExternalLinks_About_CompanyProfilePage();

		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());

		driver.switchTo().window(tabs.get(1));

		waitForElementToDisplay(lbl_Website_NewTab_CompanyProfilePage, this.elementLoadWaitTime);

		String pageTitle = driver.getTitle();

		if (pageTitle.contains("YouTube")) 
		{
			testStepPassed("YouTube Tab is displayed");
		} 
		else 
		{
			testStepFailed("YouTube Tab is not displayed");
		}

		driver.close();

		driver.switchTo().window(tabs.get(0));
	}	

	//newlyadded-Priya------------------------------------------------------------------------------//
	
	
	
	
	
	public void verify_CompanyProfilePageHeading_displayed()
	{
		try {
			waitForElementToDisplay(lbl_CompanyProfilePage_Heading,30);
			if(isElementDisplayed(lbl_CompanyProfilePage_Heading))	{
				testStepPassed("Company Profile Page is displayed");	
			}	
			else {
				testStepPassed("Company Profile Page is not displayed");	
			}
		} 
		catch (Exception e) {
			testStepFailed("Company Profile Page is not displayed"+e.getClass());e.printStackTrace();//edited
		}	}

	public void click_editCompanyProfilePage_Flow_Updated()
	{

		try {
			if(isElementDisplayed(lnk_DoggleDots_EditMenu)){
				testStepPassed("Link ToggleDots is displayed.");
				clickOn(lnk_DoggleDots_EditMenu);
				if(isElementDisplayed(lnk_CompanyProfilePage_TopMenu_ToggleDots_MenuContainer_Edit)){
					testStepPassed("Link ToggleDots is displayed.");
					clickOn(lnk_CompanyProfilePage_TopMenu_ToggleDots_MenuContainer_Edit);

				}
				else {
					testStepFailed("Edit link is not displayed.");
				}	
				}
			else {
				testStepFailed("Link ToggleDots is not displayed.");
			}
			}
		catch(Exception e){
			testStepFailed("Couldnot enable the element."+e.getClass());e.printStackTrace();
		}
		}

	public void verify_EditCompany_CompanyProfilePage_displayed()	{
		try {
			waitForElementToDisplay(lnk_CompanyProfilePage_EditProfilePage, this.elementLoadWaitTime);
			if(isElementDisplayed(lnk_CompanyProfilePage_EditProfilePage))
			{
				testStepPassed("Edit Company Profile Page is displayed");	
			}		
			else {
				testStepFailed("Edit Company Profile Page is not displayed.");
			}
		} 
		catch (Exception e){
			testStepFailed("Edit Company Profile Page could not be verified"+e.getClass());e.printStackTrace();
		}	}



	public void verify_EditCompany_CompanyProfilePage_Elements_displayed(){
		try {
			String[] allElements = {lbl_CompanyProfilePage_EditProfilePage_CompanySection,lbl_CompanyProfilePage_EditProfilePage_CompanyFormerNamesSection,
					lbl_CompanyProfilePage_EditProfilePage_ContactDetailsSection,lbl_CompanyProfilePage_EditProfilePage_DescriptionSection,lbl_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection,
					lbl_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection,lbl_CompanyProfilePage_EditProfilePage_FinanceandLegalSection,lbl_CompanyProfilePage_EditProfilePage_IndustrySection,
					lbl_CompanyProfilePage_EditProfilePage_KeywordsSection,lbl_CompanyProfilePage_EditProfilePage_RegionsSection,lbl_CompanyProfilePage_EditProfilePage_MarketingMetricsSection,
					lbl_CompanyProfilePage_EditProfilePage_CommunitySettingsSection};
			for (String pageElement : allElements) {
				WebElement element = findWebElement(pageElement);
				scrolltoElementView(element);

				if (isElementDisplayed(pageElement)) {
					testStepPassed(pageElement.split("#xpath")[0] + "company profile page elements was displayed .");
				} else {
					testStepFailed(pageElement.split("#xpath")[0] + "company profile page elements  was not displayed .");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			testStepFailed("Could not verify company profile page elements" + e.getClass());
		}   }

	public void select_CompanySection_LegalName_HatcherOption()
	{
		try {
			WebElement ele = findWebElement(rdb_EP_CompanySection_LegalName_HatcherOption);
			//scrolltoElementView(ele);
			if(ele.isSelected()){
				testStepInfo("The Hatcher Radio button is selected.");
				
			}
			else{
				clickOn(rdb_EP_CompanySection_LegalName_HatcherOption);
				testStepPassed("The Hatcher option radio button could not be selected.");

			}}
		catch (Exception e) {
			e.printStackTrace();
			testStepFailed("Radio button can not be enabled." + e.getClass());
		}
	}	

	public void select_CompanySection_LegalName_ClearbitOption_RadioButton()
	{
		
			try {
			WebElement ele = findWebElement(rdb_EP_CompanySection_LegalName_ClearbitOption);
			if(ele.isSelected()){
				testStepInfo("The Clearbit Radio button is selected.");

			}
			else{
				clickOn(rdb_EP_CompanySection_LegalName_ClearbitOption);
				testStepPassed("The Clear bit radio button is enabled.");

			}
		}
		catch (Exception e) {
			e.printStackTrace();
			testStepFailed("Radio button can not be enabled." + e.getClass());
		}
	}
	
	public void select_CompanySection_FriendlyName_HatcherOption()
	{
		try {
		WebElement ele = findWebElement(rdb_EP_CompanySection_FriendlyName_HatcherOption);
		if(ele.isSelected()){
			testStepInfo("The Hatcher option Radio button is selected.");
		}
		else{
		clickOn(rdb_EP_CompanySection_FriendlyName_HatcherOption);
	}
		testStepPassed("The Hatcher option radio button is enabled.");
	}
	catch (Exception e) {
		e.printStackTrace();
		testStepFailed("Radio button can not be enabled." + e.getClass());
	}
}

	public void select__CompanySection_IncorporationDate_HatcherOption_RadioButton()
	{
		try {
		WebElement ele = findWebElement(rdb_EP_CompanySection_IncorporationDate_HatcherOption);
		scrolltoElementView(ele);
		if(ele.isSelected()){
			testStepInfo("The Hatcher option Radio for Incorporation date button is selected.");
		}
		else{
		clickOn(rdb_EP_CompanySection_IncorporationDate_HatcherOption);
		testStepPassed("The Hatcher option Radio for Incorporation date button is enabled.");
	}
	}
catch (Exception e) {
	e.printStackTrace();
	testStepFailed("Radio button can not be enabled." + e.getClass());
}
}
	
	public void select_ContactDetailsSection_Phone_Hatcher_RadioButton()
	{
		try {
		WebElement ele = findWebElement(rdb_EditProfilePage_ContactDetailsSection_Phone_HatcherOption);
		scrolltoElementView(ele);
		if(ele.isSelected()){
			testStepPassed("The Hatcher option Radio button is selected.");
		}
		else{
		clickOn(rdb_EditProfilePage_ContactDetailsSection_Phone_HatcherOption);
	}
}
catch (Exception e) {
	e.printStackTrace();
	testStepFailed("Radio button can not be enabled." + e.getClass());
}
}
	
	
	public void verify_EditCompany_AllLabels_FirstLetterUpperCase_displayed(){
		try {
			String[] allElements = {lbl_CompanyProfilePage_EditProfilePage_CompanySection,lbl_CompanyProfilePage_EditProfilePage_CompanyFormerNamesSection,
					lbl_CompanyProfilePage_EditProfilePage_ContactDetailsSection,lbl_CompanyProfilePage_EditProfilePage_DescriptionSection,lbl_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection,
					lbl_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection,lbl_CompanyProfilePage_EditProfilePage_FinanceandLegalSection,lbl_CompanyProfilePage_EditProfilePage_IndustrySection,
					lbl_CompanyProfilePage_EditProfilePage_KeywordsSection,lbl_CompanyProfilePage_EditProfilePage_RegionsSection,lbl_CompanyProfilePage_EditProfilePage_MarketingMetricsSection,
					lbl_CompanyProfilePage_EditProfilePage_CommunitySettingsSection};
			for (String pageElement : allElements) {
				//WebElement element = findWebElement(pageElement);
				//scrolltoElementView(element);

						if (isElementDisplayed(pageElement)) {
						String value = getText(pageElement);
						char[] charArray = value.toCharArray();
						if(Character.isUpperCase(charArray[0]))	{
							testStepPassed(pageElement.split("#xpath")[0] + "label is with first letter Upper case.");
						}	
						else {
							testStepFailed(pageElement.split("#xpath")[0] + " label was not displayed in upper case.");
						}
						//testStepPassed(pageElement.split("#xpath")[0] + "company profile page elements was displayed .");
					} }
			
		} 
		catch (Exception e) {
			e.printStackTrace();
			testStepFailed("Could not verify company profile page elements" + e.getClass());
		}}



	public void verify_FormerNamesSection_FirstLetter_UpperCase()
	{
		try {
			WebElement element = findWebElement(tbl_EP_CompanyFormerNamesSection_Table);
			scrolltoElementView(element);
			if(isElementDisplayed(tbl_EP_CompanyFormerNamesSection_Table)){
				testStepPassed("company profile page elements was displayed .");
				String value = getText(tbl_EP_CompanyFormerNamesSection_Table);
				char[] charArray = value.toCharArray();
				if(Character.isUpperCase(charArray[0]))	{
					testStepPassed(value+ " - label value is begin with upper case");
				}	
				else {
					testStepFailed(value+ " label was not displayed in upper case.");
				}}
			else {
				testStepFailed("company profile page elements was displayed .");
			}		}
		catch (Exception e) {
			e.printStackTrace();
			testStepFailed("Could not verify company profile page CompanyFormerNamesSection elements" + e.getClass());
		}}

	public void enter_FormerNamesSection_FormerName(String companyFormerName)
	{
		try {
			WebElement element = findWebElement(txt_EP_CompanyFormerNamesSection_FormerName);
			scrolltoElementView(element);
			if(isElementDisplayed(txt_EP_CompanyFormerNamesSection_FormerName)){
				clearEditBox(txt_EP_CompanyFormerNamesSection_FormerName);
				typeIn(txt_EP_CompanyFormerNamesSection_FormerName, companyFormerName);}
			else {
				testStepFailed("company profile page CompanyFormerNamesSection element is not displayed."); 
			}

		}
		catch (Exception e) {
			e.printStackTrace();
			testStepFailed("Could not verify company profile page CompanyFormerNamesSection elements" + e.getClass());
		}}


	public void verify_FormerNamesSection_FormerName_Placeholder()
	{
		try {
			WebElement element = findWebElement(txt_CompanyProfilePage_placeholder_CompanyFormerNamesSection_FormerName);
			scrolltoElementView(element);
			if(isElementDisplayed(txt_CompanyProfilePage_placeholder_CompanyFormerNamesSection_FormerName)){
				testStepPassed("The Company Former Name text box is displayed in the Edit profile page.");
				String placeHolder=get_CompanyFormerNamesSection_FormerName_Placeholder();
				if(placeHolder.equalsIgnoreCase("Enter the Former name")) {
					testStepPassed("The Company Former Name text box place holder is verified.");
				}
				else
					testStepFailed("The Company Former Name text box place holder is not displayed.");
			}
			else
				testStepFailed("The Company Former Name text box place holder can not be verified.");
		}
		catch (Exception e) {
			e.printStackTrace();
			testStepFailed("Could not verify company profile page CompanyFormerNamesSection element" + e.getClass());e.printStackTrace();
		}
		}

	
	
	
	public void verify_Display_Of_New_Textbox_CompanyFormerName(String newEditCompanyFormerNameHatcher) {
		try {
			WebElement element = findWebElement(tbl_EP_CompanyFormerNamesSection_Table);
			scrolltoElementView(element);
			if(isElementDisplayed(tbl_EP_CompanyFormerNamesSection_Table)){
				testStepPassed("The Company Former Name text box is displayed.");	
				typeIn(tbl_EP_CompanyFormerNamesSection_Table,newEditCompanyFormerNameHatcher);
				if(isElementDisplayed(txt_CompanyProfilePage_placeholder_CompanyFormerNamesSection_FormerName)){
					testStepPassed("The Company Former Name text box is displayed for Editing.");				
				}
				else {
					testStepFailed("The Company Former Name text box place holder is not displayed.");
				}

			}
			else {
				testStepFailed("The Company Former Name text box is not displayed.");

			}
		}
		catch (Exception e) {
			e.printStackTrace();
			testStepFailed("Could not verify company profile page CompanyFormerNamesSection with new text box for editing." + e.getClass());e.printStackTrace();
		}
		}

	
	
	public void verify_Display_Of_Already_Existing_CompanyFormerName() {
		try {
			WebElement element = findWebElement(txt_CompanyProfilePage_placeholder_CompanyFormerNamesSection_FormerName);
			scrolltoElementView(element);
			if(isElementDisplayed(txt_CompanyProfilePage_placeholder_CompanyFormerNamesSection_FormerName)){
				testStepPassed("The Company Former Name text box is displayed.");	
				if(isElementDisplayed(txt_CompanyFormerName_Existing_First))
					testStepPassed("The already existing Company Former Name text is displayed.");	
				else
					testStepFailed("The already existing Company Former Name text is not displayed.");
			}
			else
			{
				testStepFailed("The Company Former Name text box is not displayed.");
			}
		}

		catch (Exception e) {
			e.printStackTrace();
			testStepFailed("Could not verify company profile page CompanyFormerNamesSection with new text box for editing." + e.getClass());e.printStackTrace();
		}}

	
	
	public void verify_EditCompany_AllLabels_ContactDetails_FirstLetterUpperCase_displayed(){
		try {
			String[] allElements = {lbl_EP_ContactDetailsSection_MainContact,lbl_EP_ContactDetailsSection_Address,
					lbl_EP_ContactDetailsSection_UnitSuite,lbl_EP_ContactDetailsSection_City,
					lbl_EP_ContactDetailsSection_PostalCode,lbl_EP_ContactDetailsSection_State,
					lbl_EP_ContactDetailsSection_Country,lbl_EP_ContactDetailsSection_Latitude,
					lbl_EP_ContactDetailsSection_Longitude,lbl_EP_ContactDetailsSection_CompanyEmail,
					lbl_EP_ContactDetailsSection_Phone	};
			for (String pageElement : allElements) {
				WebElement element = findWebElement(pageElement);
				scrolltoElementView(element);

				
					if (isElementDisplayed(pageElement)) {
						String value = getText(pageElement);
						char[] charArray = value.toCharArray();
						if(Character.isUpperCase(charArray[0]))	{
							testStepPassed(value+ " - label value is begin with upper case");
						}	
						else {
							testStepFailed(pageElement.split("#xpath")[0] + " label was not displayed in upper case.");
						}
						testStepPassed(pageElement.split("#xpath")[0] + "company profile page ContactDetails elements was displayed .");
					} }
			
		} catch (Exception e) {
			e.printStackTrace();
			testStepFailed("Could not verify company profile page elements" + e.getClass());e.printStackTrace();
		}
		}

	public void select_ContactDetailsSection_MainContact_HatcherOption()
	{
		try {
			WebElement ele = findWebElement(rdb_EP_ContactDetailsSection_MainContact_HatcherOption);
			scrolltoElementView(ele);
			if(ele.isSelected()){
				testStepInfo("The Hatcher option Radio button is selected.");
			}
			else{
		clickOn(rdb_EP_ContactDetailsSection_MainContact_HatcherOption);
		testStepPassed("The Hatcher option Radio button is enabled.");
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
			testStepFailed("Radio button can not be enabled." + e.getClass());e.printStackTrace();
		}
		}
	
	public void select_DigitalFootPrintSection_Crunchbase_HatcherOption_RadioButton()
	{
		
		try {
			WebElement ele = findWebElement(rdb_EP_DigitalFootPrintSection_Crunchbase_HatcherOption);
			scrolltoElementView(ele);
			if(ele.isSelected()){
				testStepInfo("The Hatcher option Radio button is selected.");
			}
			else{
			clickOn(rdb_EP_DigitalFootPrintSection_Crunchbase_HatcherOption);
			testStepPassed("The Hatcher option Radio button is enabled.");
		}
		
	}
	catch (Exception e) {
		e.printStackTrace();
		testStepFailed("Radio button can not be enabled." + e.getClass());e.printStackTrace();
	}
	}
	
	
	
	public void select_DigitalFootPrintSection_Instagram_HatcherOption_RadioButton()
	{
		
		try {
			WebElement ele = findWebElement(rdb_EP_DigitalFootPrintSection_Instagram_HatcherOption);
			scrolltoElementView(ele);
			if(ele.isSelected()){
				testStepInfo("The Hatcher option Radio button is selected.");
			}
			else{
			clickOn(rdb_EP_DigitalFootPrintSection_Instagram_HatcherOption);
			testStepPassed("The Hatcher option Radio button is enabled.");
		}
		
	}
	catch (Exception e) {
		e.printStackTrace();
		testStepFailed("Radio button can not be enabled." + e.getClass());e.printStackTrace();
	}
	}
	
	
	
	public void select_ContactDetailsSection_Address_HatcherOption()
	{
		try {
		WebElement ele = findWebElement(rdb_EP_ContactDetailsSection_Address_HatcherOption);
		scrolltoElementView(ele);
		if(ele.isSelected()){
			testStepInfo("The Hatcher option Radio button is selected.");
		}
		else{
		clickOn(rdb_EP_ContactDetailsSection_Address_HatcherOption);
		
		testStepPassed("The Hatcher option Radio button is enabled.");
		}		
		
	}
	catch (Exception e) {
		e.printStackTrace();
		testStepFailed("Radio button can not be enabled." + e.getClass());e.printStackTrace();
	}
	}
	
	
	public void select_ContactDetailsSection_UnitorSuite_HatcherOption()
	{
		try {
		WebElement ele = findWebElement(rdb_EP_ContactDetailsSection_UnitSuite_ClearbitOption);
		if(ele.isSelected()){
			testStepInfo("The Hatcher option Radio button is selected.");
		}
		else{
		clickOn(rdb_EP_ContactDetailsSection_UnitSuite_ClearbitOption);
		
		testStepPassed("The Hatcher option Radio button is enabled.");
		}		
		
	}
	catch (Exception e) {
		e.printStackTrace();
		testStepFailed("Radio button can not be enabled." + e.getClass());e.printStackTrace();
	}
	}
	
	
	
	public void select_ContactDetailsSection_City_HatcherOption()
	{
		try {
			WebElement ele = findWebElement(rdb_EP_ContactDetailsSection_City_HatcherOption);
			if(ele.isSelected()){
				testStepInfo("The Hatcher option Radio button is selected.");
			}
			else{
		clickOn(rdb_EP_ContactDetailsSection_City_HatcherOption);
		testStepPassed("The Hatcher option Radio button is enabled.");
			}		
			
		}
		catch (Exception e) {
			e.printStackTrace();
			testStepFailed("Radio button can not be enabled." + e.getClass());e.printStackTrace();
		}
		}
	
	public void select_ContactDetailsSection_PostalCode_HatcherOption()
	{
		try {
			WebElement ele = findWebElement(txt_EP_ContactDetailsSection_PostalCode_HatcherOption);
			if(ele.isSelected()){
				testStepInfo("The Hatcher option Radio button is selected.");
			}
			else{
		clickOn(txt_EP_ContactDetailsSection_PostalCode_HatcherOption);
		testStepPassed("The Hatcher option Radio button is enabled.");
			}		
			
		}
		catch (Exception e) {
			e.printStackTrace();
			testStepFailed("Radio button can not be enabled." + e.getClass());e.printStackTrace();
		}
		}
	
	public void click_ContactDetailsSection_Country_HatcherOption()
	{
		try {
	
		WebElement ele = findWebElement(rdb_EP_ContactDetailsSection_Country_HatcherOption);
		if(ele.isSelected()){
			testStepInfo("The Hatcher option Radio button is selected.");
		}
		else{
		clickOn(rdb_EP_ContactDetailsSection_Country_HatcherOption);
		testStepPassed("The Hatcher option Radio button is enabled.");
		}		
		
	}
	catch (Exception e) {
		e.printStackTrace();
		testStepFailed("Radio button can not be enabled." + e.getClass());e.printStackTrace();
	}
	}


	public void select_ContactDetailsSection_Phone_HatcherOption()
	{
		try {
			WebElement ele = findWebElement(rdb_EditProfilePage_ContactDetailsSection_Phone_HatcherOption);
			if(ele.isSelected()){
				testStepInfo("The Hatcher option Radio button is selected.");
			}
			else{
		clickOn(rdb_EditProfilePage_ContactDetailsSection_Phone_HatcherOption);
		testStepPassed("The Hatcher option Radio button is enabled.");
			}		
			
		}
		catch (Exception e) {
			e.printStackTrace();
			testStepFailed("Radio button can not be enabled." + e.getClass());e.printStackTrace();
		}
		}

	
	
	public void select_DigitalFootPrintSection_Angellist_HatcherOption_RadioButton()
	{
		try {
			WebElement ele = findWebElement(rdb_EP_DigitalFootPrintSection_Angellist_HatcherOption);
			if(ele.isSelected()){
				testStepInfo("The Hatcher option Radio button is selected.");
			}
			else{
		clickOn(rdb_EP_DigitalFootPrintSection_Angellist_HatcherOption);
		testStepPassed("The Hatcher option Radio button is enabled.");
			}
			}
		catch (Exception e) {
			e.printStackTrace();
			testStepFailed("Radio button can not be enabled." + e.getClass());e.printStackTrace();
		}
		}
	
	
	
	public void select_DigitalFootPrintSection_Medium_HatcherOption_RadioButton()
	{
		try {
			WebElement ele = findWebElement(rdb_EP_DigitalFootPrintSection_Medium_HatcherOption);
			if(ele.isSelected()){
				testStepInfo("The Hatcher option Radio button is selected.");
			}
			else{
		clickOn(rdb_EP_DigitalFootPrintSection_Medium_HatcherOption);
		testStepPassed("The Hatcher option Radio button is enabled.");
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
			testStepFailed("Radio button can not be enabled." + e.getClass());
		}
		}
	
	
	
	
	public void select_DigitalFootPrintSection_LinkedIn_HatcherOption_RadioButton()
	{
		try {
			WebElement ele = findWebElement(rdb_EP_DigitalFootPrintSection_LinkedIn_HatcherOption);
			if(ele.isSelected()){
				testStepInfo("The Hatcher option Radio button is selected.");
			}
			else{
		clickOn(rdb_EP_DigitalFootPrintSection_LinkedIn_HatcherOption);
		testStepPassed("The Hatcher option Radio button is enabled.");
			}
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
			testStepFailed("Radio button can not be enabled." + e.getClass());e.printStackTrace();
		}
		}
	
	
	
	
	public void select_DigitalFootPrintSection_Pinterest_HatcherOption()
	{
		try {
			WebElement ele = findWebElement(rdb_EditProfilePage_DigitalFootPrintSection_Pinterest_HatcherOption);
			if(ele.isSelected()){
				testStepPassed("The Hatcher option Radio button is selected.");
			}
			else{
		clickOn(rdb_EditProfilePage_DigitalFootPrintSection_Pinterest_HatcherOption);
		testStepInfo("The Hatcher option Radio button is enabled.");
			}
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
			testStepFailed("Radio button can not be enabled." + e.getClass());e.printStackTrace();
		}
		}
	
	
	
	public void select_DigitalFootPrintSection_Rssfeed_HatcherOption()
	{
		try {
			WebElement ele = findWebElement(rdb_EditProfilePage_DigitalFootPrintSection_RSSFeed_HatcherOption);
			if(ele.isSelected()){
				testStepInfo("The Hatcher option Radio button is selected.");//update
			}
			else{
		clickOn(rdb_EditProfilePage_DigitalFootPrintSection_RSSFeed_HatcherOption);
		testStepPassed("The Hatcher option Radio button is enabled.");
			}
			
			}
		catch (Exception e) {
			e.printStackTrace();
			testStepFailed("Radio button can not be enabled." + e.getClass());e.printStackTrace();
		}
		}
	
	
	
	public void select_DigitalFootPrintSection_Twitter_HatcherOption()
	{
		try {
			WebElement ele = findWebElement(rdb_EditProfilePage_DigitalFootPrintSection_RSSFeed_HatcherOption);
			if(ele.isSelected()){
				testStepInfo("The Hatcher option Radio button is selected.");//update
			}
			else{
		clickOn(rdb_EditProfilePage_DigitalFootPrintSection_RSSFeed_HatcherOption);
		testStepPassed("The Hatcher option Radio button is enabled.");
			}
			
			}
		catch (Exception e) {
			e.printStackTrace();
			testStepFailed("Radio button can not be enabled." + e.getClass());e.printStackTrace();
		}
		}
	
	
	
	public void select_DigitalFootPrintSection_Address_HatcherOption()
	{
		try {
			WebElement ele = findWebElement(rdb_EP_ContactDetailsSection_Address_HatcherOption);
			if(ele.isSelected()){
				testStepInfo("The Hatcher option Radio button is selected.");//update
			}
			else{
		clickOn(rdb_EP_ContactDetailsSection_Address_HatcherOption);
		testStepPassed("The Hatcher option Radio button is enabled.");
			}
			
			}
		catch (Exception e) {
			e.printStackTrace();
			testStepFailed("Radio button can not be enabled." + e.getClass());e.printStackTrace();
		}
	}
	
	
	
	public void select_DigitalFootPrintSection_City_HatcherOption()
	{
		try {
			WebElement ele = findWebElement(rdb_EP_ContactDetailsSection_Address_HatcherOption);
			if(ele.isSelected()){
				testStepInfo("The Hatcher option Radio button is selected.");//update
			}
			else{
		clickOn(rdb_EP_ContactDetailsSection_City_HatcherOption);
	}
			testStepPassed("The Hatcher option Radio button is enabled.");
				
		}
	catch (Exception e) {
		e.printStackTrace();
		testStepFailed("Radio button can not be enabled." + e.getClass());e.printStackTrace();
	}
}

	
	public void click_ContactDetailsSection_Latitude_HatcherOption()
	{
		try {
			WebElement ele = findWebElement(rdb_EP_ContactDetailsSection_Latitude_HatcherOption);
			if(ele.isSelected()){
				testStepInfo("The Hatcher option Radio button is selected.");//update
			}
			else {
				clickOn(rdb_EP_ContactDetailsSection_Latitude_HatcherOption);
				testStepPassed("The Hatcher option Radio button is enabled.");
			}}

		catch (Exception e){
			testStepFailed("Couldnot enable the Latitube radio element."+e.getClass());
		}}	
	
	public void click_FinanceandLegalSection_LawFirm_HatcherOption()
	{
		try {
		WebElement ele = findWebElement(rdb_EP_FinanceandLegalSection_LawFirm_HatcherOption);
		if(ele.isSelected()){
			testStepInfo("The Hatcher option Radio button is selected.");//update
		}
		else {
		
		clickOn(rdb_EP_FinanceandLegalSection_LawFirm_HatcherOption);
		testStepPassed("The Hatcher option Radio button is enabled.");
	}}

catch (Exception e){
	testStepFailed("Couldnot enable the Latitube radio element."+e.getClass());
}}	
	
	public void click_CompanySection_Jurisdiction_HatcherOption()
	{
		try {
			if(!isElementDisplayed(drp_EP_CompanySection_Jurisdiction_HatcherOption)) {
		        WebElement element = findWebElement(drp_EP_CompanySection_Jurisdiction_HatcherOption);
		        scrolltoElementView(element);
		       
			if(element.isSelected()){
				testStepInfo("The Hatcher option Radio button is selected.");//update
			}
			else {
		clickOn(rdb_EP_CompanySection_Jurisdiction_HatcherOption);
		testStepPassed("The Hatcher option Radio button is enabled.");
			}
			}
			}

		catch (Exception e){
			testStepFailed("Couldnot enable the Latitube radio element."+e.getClass());
		}
		}	
	
	public void click_CompanySection_GoverningBody_Hatcher()
	{
		try {
			if(!isElementDisplayed(drp_EP_CompanySection_Jurisdiction_HatcherOption)) {
		        WebElement element = findWebElement(drp_EP_CompanySection_Jurisdiction_HatcherOption);
		        scrolltoElementView(element);
			if(element.isSelected()){
				testStepInfo("The Hatcher option Radio button is selected.");//update
			}
			else {
				clickOn(rdb_EP_CompanySection_GoverningBody_HatcherOption);
				testStepPassed("The Hatcher option Radio button is enabled.");
			}
			}
			}

		catch (Exception e){
			testStepFailed("Couldnot enable the Latitube radio element."+e.getClass());
		}
		}	
	
	public void click_CompanySection_RegistrationNumber_HatcherOption()
	{
		try {
			if(!isElementDisplayed(drp_EP_CompanySection_Jurisdiction_HatcherOption)) {
			WebElement ele = findWebElement(rdb_EP_CompanySection_RegistrationNumber_HatcherOption);
			scrolltoElementView(ele);
			if(ele.isSelected()){
				testStepInfo("The Hatcher option Radio button is selected.");//update
			}
			else {
		clickOn(rdb_EP_CompanySection_RegistrationNumber_HatcherOption);
		testStepPassed("The Hatcher option Radio button is enabled.");
			}
			}
		}
		catch (Exception e){
			testStepFailed("Couldnot enable the Latitube radio element."+e.getClass());
		}
		}	
	
	public void verify_Asterisk_Present_in_Add_NewContact_Modal_ElementsAndLabels()	{
		try {
			waitForElementToDisplay(lbl_Salutation_Mandatory_AddNewContact_ModalDialogWindow, this.elementLoadWaitTime);
			String[] pageElements = { lbl_Salutation_Mandatory_AddNewContact_ModalDialogWindow,txt_FirstName_Mandatory_AddNewContact_ModalDialogWindow,txt_LastName_Mandatory_AddNewContact_ModalDialogWindow,
					txt_Email_Mandatory_AddNewContact_ModalDialogWindow,txt_CompanyName_Mandatory_AddNewContact_ModalDialogWindow,txt_Country_Mandatory_AddNewContact_ModalDialogWindow,
					txt_Website_Mandatory_AddNewContact_ModalDialogWindow,txt_Phone_Mandatory_AddNewContact_ModalDialogWindow};
			for (String pageElement : pageElements) {
				if (isElementDisplayed(pageElement)) {
					testStepPassed(pageElement.split("#xpath")[0] + " is displayed in Add NewContact Modal Dialog Window");
				} else {
					testStepFailed(pageElement.split("#xpath")[0] + " is not displayed in Add NewContact Modal Dialog Window");
				}}	
		}		 
		catch (Exception e) {
			e.printStackTrace();
			testStepFailed("Failed to verify the lables of Add NewContact Modal Dialog Window elements " + e.getClass());
		}	}

public void verify_CompanyProfilePage_Share_ModalDialog_Window_displayed()	{
	try {
		waitForElementToDisplay(lbl_Share_CompanyProfilePage_ModalDialogWindow, this.elementLoadWaitTime);
		if(isElementDisplayed(lbl_Share_CompanyProfilePage_ModalDialogWindow))
		{
			testStepPassed("Company Profile Page Share Modal Dialog Window is displayed");	
		}		
	} 
	catch (Exception e)		{
		testStepFailed("Company Profile Page Share Modal Dialog Window is not displayed");e.printStackTrace();
	}	
}
public void verify_ErrorMessage_AddContact_ModalDialog_Window(String field)	{
	try {
		click_Share_CompanyProfilePage_Window_Share_Button();			
		String err_message = "Error Message#xpath=//span[contains(text(),'Missing required input: "+field+"')]";
		waitForElementToDisplay(err_message, this.elementLoadWaitTime);
		if(isElementDisplayed(err_message))
		{
			String value = getText(err_message);
			testStepPassed(value+" - error message is displayed after "+field+" is empty");	
		}
		else {
			testStepFailed("Error message is not displayed after "+field+" is empty");	
		}
	} 
	catch (Exception e)		{
		e.printStackTrace();
		testStepFailed("Failed to verify the Error Message in Add Contact after "+field+" is empty" + e.getClass());

	}	
}
public void verify_email_populated(String email) {
	try {
	String email_value = getAttributeValue(txt_Email_AddNew_Contact_ModalDialogWindow, "value");
	if(email.equalsIgnoreCase(email_value)) {
		testStepPassed(email+" - value is auto-populated in email field");	
	}
	else {
		testStepFailed(email+" - value is not auto-populated in email field");	
	}
} 
catch (Exception e)		{
	e.printStackTrace();
	testStepFailed("value is not auto-populated in email field" + e.getClass());

}	
}

public void click_Share_CompanyProfilePage_Window_Share_Button(){
	try {
		waitForElementToDisplay(btn_Share_CompanyProfilePage_ModalDialogWindow_Share, this.elementLoadWaitTime);
		clickOn(btn_Share_CompanyProfilePage_ModalDialogWindow_Share);
	}
	catch (Exception e)		{
		testStepFailed("Share button is not displayed in Company Profile Page Share Modal Dialog Window");e.printStackTrace();
	}				
}

public void verify_Valid_EmailAddress_Error_Message_ModalDialogWindow_Share()
{
	try {
		if (isElementDisplayed(lbl_Valid_EmailAddress_Error_Meessage_ModalDialogWindow_Share)) 
		{
			testStepPassed("'Please enter a valid email address' - is displayed after clicking Share button with empty email address");		
		} 
		else 
		{
			testStepFailed("'Please enter a valid email address' - is not displayed after clicking Share button with empty email address");
		}
		clickOn(btn_Close_CompanyProfilePage_ModalDialogWindow_Share);
	}
	catch (Exception e)		{
		testStepFailed("Expected Message is not displayed"+ e.getClass());e.printStackTrace();
	}	
}

public void verify_UserFound_Message_ModalDialogWindow_Share(String emailAddress)
{
	try {
		
		waitForElementToDisplay(txt_Share_CompanyProfilePage_ModalDialogWindow_EmailAddress, this.elementLoadWaitTime);
		typeIn(txt_Share_CompanyProfilePage_ModalDialogWindow_EmailAddress, emailAddress);	
		clickOn(btn_Share_CompanyProfilePage_ModalDialogWindow_Share);
		waitForElementToDisplay(lbl_User_Found_Meessage_ModalDialogWindow_Share, this.elementLoadWaitTime);
		
		if (isElementDisplayed(lbl_User_Found_Meessage_ModalDialogWindow_Share)) 
		{
			testStepPassed("'User found' - is displayed after clicking Share button with empty email address");		
		} 
		else 
		{
			testStepFailed("'User found' - is not displayed after clicking Share button with empty email address");
		}
	}
	catch (Exception e)		{
		testStepFailed("Expected Message is not displayed"+ e.getClass());
	}	
}

public void verify_UserNotFound_Message_ModalDialogWindow_Share(String emailAddress)
{
	try {
		
		waitForElementToDisplay(txt_Share_CompanyProfilePage_ModalDialogWindow_EmailAddress, this.elementLoadWaitTime);
		typeIn(txt_Share_CompanyProfilePage_ModalDialogWindow_EmailAddress, emailAddress);	
		clickOn(btn_Share_CompanyProfilePage_ModalDialogWindow_Share);
		waitForElementToDisplay(lbl_User_Not_Found_Meessage_ModalDialogWindow_Share, this.elementLoadWaitTime);
		
		if (isElementDisplayed(lbl_User_Not_Found_Meessage_ModalDialogWindow_Share)) 
		{
			testStepPassed("'User Not found' - is displayed after clicking Share button with new email address");		
		} 
		else 
		{
			testStepFailed("'User Not found' - is not displayed after clicking Share button with new email address");
		}
	}
	catch (Exception e)		{
		testStepFailed("Expected Message is not displayed"+ e.getClass());
	}	
}

public void verify_OrganisationShared_Message_ModalDialogWindow_Share()
{
	try {
		if (isElementDisplayed(lbl_Organization_Shared_Meessage_ModalDialogWindow_Share)) 
		{
			testStepPassed("'Organization has been successfully shared' - is displayed after clicking Share button with empty email address");		
		} 
		else 
		{
			testStepFailed("'Organization has been successfully shared' - is not displayed after clicking Share button with empty email address");
		}
		clickOn(btn_Close_CompanyProfilePage_ModalDialogWindow_Share);
	}
	catch (Exception e)		{
		testStepFailed("Expected Message is not displayed"+ e.getClass());
	}	
}
	
	
public void select_Salutation_Share_AddNewContact_ModalDialogWindow(String salutation)
{
	try {
			
			waitForElementToDisplay(lbl_Salutation_Mandatory_AddNewContact_ModalDialogWindow, this.elementLoadWaitTime);
			
			clickOn(drp_Salutation_AddNew_Contact_ModalDialogWindow); 
			waitTime(1);
			typeIn(drp_Salutation_AddNew_Contact_ModalDialogWindow,salutation);
			waitTime(1);

			List <WebElement> optlst = findWebElements(drp_Salutation_AddNew_Contact_ModalDialogWindow);
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
		}
		
	
	catch (Exception e) {
		e.printStackTrace();
		testStepFailed("Could not verify company profile page elements" + e.getClass());
	}
}


public void enter_FirstName_Share_AddNewContact_ModalDialogWindow(String firstName)	{
	try {
		waitForElementToDisplay(txt_FirstName_AddNew_Contact_ModalDialogWindow, this.elementLoadWaitTime);
		if(!firstName.isEmpty()) {
			typeIn(txt_FirstName_AddNew_Contact_ModalDialogWindow, firstName);
			if(!isElementDisplayed(msg_invalid_FirstName_errormessage)) {
				testStepPassed("The firstname is entered.");	
		}
			
			else {
				testStepFailed("Invalid Firstname entered.");
			}
		}
			
	}
	catch (Exception e) 		{
		testStepFailed("could not enter the firstname."+e.getClass());e.printStackTrace();
	}	}


public void enter_LastName_Share_AddNewContact_ModalDialogWindow(String lastName)	{
	try {
		waitForElementToDisplay(txt_LastName_AddNew_Contact_ModalDialogWindow, this.elementLoadWaitTime);
		if(!lastName.isEmpty()) {
			typeIn(txt_LastName_AddNew_Contact_ModalDialogWindow, lastName);
			if(!isElementDisplayed(msg_invalid_LastName_errormessage)) {
				testStepPassed("The Lastname is entered.");	
		}
			
			else {
				testStepFailed("Invalid Lastname entered.");
			}
		}
	}
	catch (Exception e) 		{
		testStepFailed("could not enter the lastname."+e.getClass());e.printStackTrace();
	}	}


public void enter_Email_Share_AddNewContact_ModalDialogWindow(String email)	{
	try {
		waitForElementToDisplay(txt_Email_AddNew_Contact_ModalDialogWindow, this.elementLoadWaitTime);
		if(!email.isEmpty()) {
			typeIn(txt_Email_AddNew_Contact_ModalDialogWindow, email);
			if(!isElementDisplayed(msg_invalid_Email_errormessage)) {
				testStepPassed("The Email is entered.");	
		}
			
			else {
				testStepFailed("Invalid Email entered.");
			}
		}
	}
	catch (Exception e) 		{
		testStepFailed("could not enter the email."+e.getClass());e.printStackTrace();
	}	}

public void enter_CompanyName_Share_AddNewContact_ModalDialogWindow(String companyName)	{
	try {
		waitForElementToDisplay(txt_CompanyName_AddNew_Contact_ModalDialogWindow, this.elementLoadWaitTime);
		if(!companyName.isEmpty()) {
			typeIn(txt_CompanyName_AddNew_Contact_ModalDialogWindow, companyName);
			if(!isElementDisplayed(msg_invalid_CompanyName_errormessage)) {
				testStepPassed("The CompanyName is entered .");	
		}
			
			else {
				testStepFailed("Invalid CompanyName entered.");
			}
		}
	}
	catch (Exception e) 		{
		testStepFailed("could not enter the companyName."+e.getClass());e.printStackTrace();
	}	}




public void enter_Address_Share_AddNewContact_ModalDialogWindow(String Address)	{
	try {
		waitForElementToDisplay(txt_Address_AddNew_Contact_ModalDialogWindow, this.elementLoadWaitTime);
		
			typeIn(txt_Address_AddNew_Contact_ModalDialogWindow, Address);
			testStepPassed("The Address is entered.");	
		
	}
	catch (Exception e) 		{
		testStepFailed("could not enter the Address."+e.getClass());e.printStackTrace();
	}	}


public void enter_City_Share_AddNewContact_ModalDialogWindow(String city)	{
	try {
		waitForElementToDisplay(txt_City_AddNew_Contact_ModalDialogWindow, this.elementLoadWaitTime);
		
			typeIn(txt_City_AddNew_Contact_ModalDialogWindow, city);
			testStepPassed("The City is entered.");	
		
	}
	catch (Exception e) 		{
		testStepFailed("could not enter the City."+e.getClass());e.printStackTrace();
	}	}

public void enter_PostalCode_Share_AddNewContact_ModalDialogWindow(String postalCode)	{
	try {
		waitForElementToDisplay(txt_PostalCode_AddNew_Contact_ModalDialogWindow, this.elementLoadWaitTime);
		
			typeIn(txt_PostalCode_AddNew_Contact_ModalDialogWindow, postalCode);
			testStepPassed("The PostalCode is entered.");	
		
	}
	catch (Exception e) 		{
		testStepFailed("could not enter the PostalCode."+e.getClass());e.printStackTrace();
	}	}

public void enter_State_Share_AddNewContact_ModalDialogWindow(String state)	{
	try {
		waitForElementToDisplay(txt_State_AddNew_Contact_ModalDialogWindow, this.elementLoadWaitTime);
		
			typeIn(txt_State_AddNew_Contact_ModalDialogWindow, state);
			testStepPassed("The PostalCode is entered.");	
		
	}
	catch (Exception e) 		{
		testStepFailed("could not enter the State."+e.getClass());e.printStackTrace();
	}	}

public void enter_Country_Share_AddNewContact_ModalDialogWindow(String country)	{
	try {
		waitForElementToDisplay(txt_CompanyName_AddNew_Contact_ModalDialogWindow, this.elementLoadWaitTime);
		if(!country.isEmpty()) {
			typeIn(txt_CompanyName_AddNew_Contact_ModalDialogWindow, country);
			if(isElementDisplayed(msg_invalid_Country_errormessage)) {
			testStepPassed("The country is entered.");	
		}
			else
				testStepFailed("Invalid Country details.");
	}
		}
	catch (Exception e) 		{
		testStepFailed("could not enter the country."+e.getClass());e.printStackTrace();
	}	}

public void enter_website_Share_AddNewContact_ModalDialogWindow(String website)	{
	try {
		waitForElementToDisplay(txt_Website_AddNew_Contact_ModalDialogWindow, this.elementLoadWaitTime);
		if(!website.isEmpty()) {
			typeIn(txt_Website_AddNew_Contact_ModalDialogWindow, website);
			if(isElementDisplayed(msg_invalid_Website_errormessage)) {
			testStepPassed("The website is entered.");	
		}
			else
				testStepFailed("Invalid website details.");
	}
	}
	catch (Exception e) 		{
		testStepFailed("could not enter the website."+e.getClass());e.printStackTrace();
	}	
	}

public void enter_Phone_Share_AddNewContact_ModalDialogWindow(String phone)	{
	try {
		waitForElementToDisplay(txt_Phone_AddNew_Contact_ModalDialogWindow, this.elementLoadWaitTime);
		if(!phone.isEmpty()) {
			typeIn(txt_Phone_AddNew_Contact_ModalDialogWindow, phone);
			if(isElementDisplayed(msg_invalid_Website_errormessage)) {
			testStepPassed("The Phone is entered.");	
		}
			else
				testStepFailed("Invalid Phone details.");
	}
	}
	catch (Exception e) 		{
		testStepFailed("could not enter the Phone."+e.getClass());e.printStackTrace();
	}	
	}

public void clear_AllValues_AddNewContact_ModalDialogWindow()	{
	try {
		clearEditBox(drp_Salutation_AddNew_Contact_ModalDialogWindow);
		clearEditBox(txt_FirstName_AddNew_Contact_ModalDialogWindow);
		clearEditBox(txt_LastName_AddNew_Contact_ModalDialogWindow);
		clearEditBox(txt_Email_AddNew_Contact_ModalDialogWindow);
		clearEditBox(txt_CompanyName_AddNew_Contact_ModalDialogWindow);
		clearEditBox(txt_Address_AddNew_Contact_ModalDialogWindow);
		clearEditBox(txt_Country_AddNew_Contact_ModalDialogWindow);
		clearEditBox(txt_City_AddNew_Contact_ModalDialogWindow);
		clearEditBox(txt_PostalCode_AddNew_Contact_ModalDialogWindow);
		clearEditBox(txt_State_AddNew_Contact_ModalDialogWindow);
		clearEditBox(txt_Website_AddNew_Contact_ModalDialogWindow);
		clearEditBox(txt_Phone_AddNew_Contact_ModalDialogWindow);

	}
		
	catch (Exception e) 		{
			testStepFailed("could not clear the values."+e.getClass());e.printStackTrace();
		}	
	}

public void verify_Presentation_Upload_Flow() {
	try {
		if(isElementDisplayed(lnk_DoggleDots_EditMenu)){
			testStepPassed("Link ToggleDots is displayed.");
			clickOn(lnk_DoggleDots_EditMenu);
			if(isElementDisplayed(lnk_UploadPresentation_ToggleDots_Opts)) {
				clickOn(lnk_UploadPresentation_ToggleDots_Opts);
				
			}
			else {
				testStepFailed("The Upload Presentation link is not displayed.");
			}
			}
			else
			{
				testStepFailed("The Toggle dots link is not displayed.");
			}
		
		}
	catch(Exception e){
		testStepFailed("Couldnot enable the element."+e.getClass());e.printStackTrace();
	}
	}

public void verify_Upload_Presentation_heading_ModalDialog_displayed()
{
	try {
		waitForElementToDisplay(lbl_heading_Upload_Presentation, this.elementLoadWaitTime);
		if(isElementDisplayed(lbl_heading_Upload_Presentation))	{
			testStepPassed("Upload Presentation Dialog Window is displayed");	
		}	
		else
		{
			testStepFailed("Upload Presentation Dialog Window is not displayed");	
		}
	} 
	catch (Exception e) {
		testStepFailed("Upload Presentation Dialog Window can not be displayed"+e.getClass());e.printStackTrace();
	}	
	}


public void verify_Upload_Presentation_textbox_ModalDialog_displayed()
{
	try {
		waitForElementToDisplay(txt_UploadPresentation_inputBox, this.elementLoadWaitTime);
		if(isElementDisplayed(txt_UploadPresentation_inputBox))	{
			testStepPassed("Upload Presentation input box is displayed in the dialog window.");	
		}	
		else
		{
			testStepFailed("Upload Presentation input box is not displayed in the  Dialog Window");	
		}
	} 
	catch (Exception e) {
		testStepFailed("Upload Presentation input box can not be verified"+e.getClass());e.printStackTrace();
	}	
	}

public void enter_Upload_Presentation_textbox_ModalDialog(String filename)
{
	try {
		waitForElementToDisplay(txt_UploadPresentation_inputBox, this.elementLoadWaitTime);
		if(isElementDisplayed(txt_UploadPresentation_inputBox))	{
			typeIn(txt_UploadPresentation_inputBox,filename);
			testStepPassed("The Filename "+filename+"enterd is valid. ");
		}	
		else
		{
			testStepFailed("The Filename "+filename+" entered is invalid.");	
		}
	} 
	catch (Exception e) {
		testStepFailed("The given filename can not be verified"+e.getClass());e.printStackTrace();
	}	
	}

public void verify_Upload_Presentation_Elements_ModalDialog(String filename)
{
	
		try {
			String[] allElements = {lbl_heading_Upload_Presentation,txt_UploadPresentation_inputBox,btn_Upload,btn_close_UploadPresentation};
			for (String pageElement : allElements) {
				
				if (isElementDisplayed(pageElement)) {
					testStepPassed(pageElement.split("#xpath")[0] + "upload presentation dialog window elements was displayed .");
				} else {
					testStepFailed(pageElement.split("#xpath")[0] + "upload presentation dialog window elements  was not displayed .");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			testStepFailed("Could not verify upload presentation dialog window elements" + e.getClass());
		}   }
	





public void verify_Upload_Presentation_Button_ModalDialog_displayed()
{
	try {
		waitForElementToDisplay(btn_Upload, this.elementLoadWaitTime);
		if(isElementDisplayed(btn_Upload))	{
			testStepPassed("Upload Presentation button is displayed in the dialog window.");	
		}	
		else
		{
			testStepFailed("Upload Presentation button is not displayed in the  Dialog Window");	
		}
	} 
	catch (Exception e) {
		testStepFailed("Upload Presentation button can not be verified"+e.getClass());e.printStackTrace();
	}	
	}

	
public void verify_Upload_Presentation_Close_Button_ModalDialog_displayed()
{
	try {
		waitForElementToDisplay(btn_close_UploadPresentation, this.elementLoadWaitTime);
		if(isElementDisplayed(btn_close_UploadPresentation))	{
			testStepPassed("Close button is displayed in the dialog window.");	
		}	
		else
		{
			testStepFailed("Close button is not displayed in the  Dialog Window");	
		}
	} 
	catch (Exception e) {
		testStepFailed("Close button can not be verified"+e.getClass());e.printStackTrace();
	}	
	}
	




}
