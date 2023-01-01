package pages;
import iSAFE.ApplicationKeywords;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import baseClass.BaseClass;

public class PopupDialogWindows extends ApplicationKeywords
{	

	/*********************************Add New Contact***********************/
	private static final String lbl_AddNewUser_SettingsPage_ModalDialogWindow_NewUserAddedSuccessMessage = "New User Added success message in Add New User Modal Dialog Window#xpath=//div[contains(@class,'popup') and contains(@class,'success') and contains(@class,'show')]//div[contains(text(),'User added Successfully')]";
	private static final String btm_AddNewUser_SettingsPage_ModalDialogWindow_NewUserAddedSuccessMessage_Ok = "Ok Button of New User Added success message in Add New User Modal Dialog Window#xpath=//div[contains(@class,'popup') and contains(@class,'success') and contains(@class,'show')]//button[contains(text(),'Ok')]";
	private static final String lbl_AddNewContact_ModalDialogWindow_Heading = "Add New Contact Modal Window Label#xpath=//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//div[contains(@class,'modal-title')]//*[contains(text(),'Add New Listing')]";
	private static final String lnk_AddNewContact_ModalDialogWindow_Close = "Add New Contact Modal Window Close Link#xpath=//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//a[contains(@class,'modal-button-close')]";
	private static final String lnk_AddNewContact_AddOrganization_ModalDialogWindow_Close = "Add Organization New Contact Modal Window Close Link#xpath=//div[contains(@id,'modal-add-admin-org')]//div[contains(@class,'modal-dialog modal')]//a[contains(@class,'modal-button-close')]";
	private static final String drp_Salutation_AddNewContact_ModalDialogWindow = "Salutation dropdown in Add New Contact Modal Window#xpath=//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//label[contains(text(),'Salutation')]/parent::div//select";
	private static final String txt_FirstName_AddNewContact_ModalDialogWindow = "First Name Textbox in Add New Contact Modal Window#xpath=//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//label[contains(text(),'First Name')]/parent::div//input";
	private static final String txt_LastName_AddNewContact_ModalDialogWindow = "Last Name Textbox in Add New Contact Modal Window#xpath=//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//label[contains(text(),'Last Name')]/parent::div//input";
	private static final String txt_Email_AddNewContact_ModalDialogWindow = "Email Textbox in Add New Contact Modal Window#xpath=//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//label[contains(text(),'Email')]/parent::div//input";
	private static final String txt_JobTitleAddNewContact_ModalDialogWindow = "Job Title Textbox in Add New Contact Modal Window#xpath=//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//label[contains(text(),'Job title')]/parent::div//input";
	private static final String txt_Phone_AddNewContact_ModalDialogWindow = "Phone Textbox in Add New Contact Modal Window#xpath=//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//label[contains(text(),'Phone')]/parent::div//input";
	private static final String txt_LinkedIn_AddNewContact_ModalDialogWindow = "LinkedIn Textbox in Add New Contact Modal Window#xpath=//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//label[contains(text(),'LinkedIn')]/parent::div//input";
	private static final String txt_AboutPerson_AddNewContact_ModalDialogWindow = "About Person Textbox in Add New Contact Modal Window#xpath=//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//textarea[contains(@name,'bio')]";
	private static final String txt_Address_AddNewContact_ModalDialogWindow = "Address Textarea in Add New Contact Modal Window#xpath=//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//input[contains(@placeholder,'Address')]";
	private static final String txt_Apartment_AddNewContact_ModalDialogWindow = "Apartment Textbox in Add New Contact Modal Window#xpath=//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//input[contains(@placeholder,'Apartment')]";
	private static final String txt_City_AddNewContact_ModalDialogWindow = "City Textbox in Add New Contact Modal Window#xpath=//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//input[contains(@placeholder,'City')]";
	private static final String txt_State_AddNewContact_ModalDialogWindow = "State Textbox in Add New Contact Modal Window#xpath=//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//input[contains(@placeholder,'State')]";
	private static final String txt_PostalCode_AddNewContact_ModalDialogWindow = "Postal Code Textbox in Add New Contact Modal Window#xpath=//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//input[contains(@placeholder,'Postal code')]";
	private static final String txt_Country_AddNewContact_ModalDialogWindow = "Country Textbox in Add New Contact Modal Window#xpath=//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//input[contains(@placeholder,'Country')]";
	private static final String lst_AutoCompleteList_Country_AddNewContact_ModalDialogWindow = "Country autocomplete list in Add New Contact Modal Window#xpath=//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//input[contains(@placeholder,'Country')]//parent::div//div[contains(@class,'autcomplete-list')]";
	private static final String drp_AccountType_AddNewContact_ModalDialogWindow = "Account Type Dropdown in Add New Contact Modal Window#xpath=//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//label[contains(text(),'Account Type')]/parent::div//select";
	private static final String drp_TypeOfBusiness_AddNewContact_ModalDialogWindow = "Type of Business Dropdown in Add New Contact Modal Window#xpath=//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//label[contains(text(),'Type of business')]/parent::div//select";
	private static final String drp_ListingAddedBy_AddNewContact_ModalDialogWindow = "Listing Added By Dropdown in Add New Contact Modal Window#xpath=//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//label[contains(text(),'Listing Added By')]/parent::div//select";
	private static final String drp_SendInvite_AddNewContact_ModalDialogWindow = "Send Invite Dropdown in Add New Contact Modal Window#xpath=//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//label[contains(text(),'Send Invite')]/parent::div//select";
	private static final String drp_Industry_AddNewContact_ModalDialogWindow = "Industry Dropdown in Add New Contact Modal Window#xpath=//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//label[contains(text(),'Industry')]//following::div[contains(@class,'multiselect')]//div[contains(@class,'multiselect__select')]";
	private static final String txt_Industry_AddNewContact_ModalDialogWindow = "Industry Textbox in Add New Contact Modal Window#xpath=//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//label[contains(text(),'Industry')]//parent::div//input";
	private static final String lbl_Industry_InvalidErrorMessage_AddNewContact_ModalDialogWindow = "Industry Invalid Error Message in Add New Contact Modal Window#xpath=//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//label[contains(text(),'Industry')]//following::div[contains(@class,'multiselect')]//div[contains(@class,'multiselect__select')]//parent::div[contains(@class,'multiselect')]//ul[contains(@class,'multiselect__content')]//li//span//span[contains(text(),'No results found. Consider changing the search query')]";
	private static final String btn_AddIndividual_AddNewContact_ModalDialogWindow = "Add Individual Button in Add New Contact Modal Window#xpath=//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//button[contains(text(),'Add individual')]";
	private static final String btn_AddOrganization_AddNewContact_ModalDialogWindow = "Add Organization Dropdown in Add New Contact Modal Window#xpath=//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//button[contains(text(),'Add organization')]";
	private static final String btn_AddIndividual_Disabled_AddNewContact_ModalDialogWindow = "Add Individual Button Disabled in Add New Contact Modal Window#xpath=//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//button[contains(text(),'Add individual') and contains(@class,'disabled')]";
	private static final String lbl_AddOrganization_AddNewContact_ModalDialogWindow_Heading = "Add Organization in Add New Contact Modal Window Label#xpath=//div[contains(@id,'modal-add-admin-org')]//div[contains(@class,'modal-dialog modal')]//div[contains(@class,'modal-title')]//*[contains(text(),'Add New Listing')]";
	private static final String txt_Legalname_AddOrganization_AddNewContact = "Legal Name Textbox of Add Organization in Add New Contact Modal Window#xpath=//div[contains(@id,'modal-add-admin-org')]//div[contains(@class,'modal-dialog modal')]//label[contains(text(),'Company Name')]/parent::div//input[contains(@name,'company')]";
	private static final String lst_AutoCompleteListLegalname_AddOrganization_AddNewContact = "Auto Complete list of Legal Name Textbox of Add Organization in Add New Contact Modal Window#xpath=//div[contains(@id,'modal-add-admin-org')]//div[contains(@class,'modal-dialog modal')]//label[contains(text(),'Company Name')]/parent::div//input[contains(@name,'company')]//parent::div//div[contains(@class,'autcomplete-list')]";
	private static final String txt_Website_AddOrganization_AddNewContact = "Website Textbox of Add Organization in Add New Contact Modal Window#xpath=//div[contains(@id,'modal-add-admin-org')]//div[contains(@class,'modal-dialog modal')]//label[contains(text(),'Website')]/parent::div//input";
	private static final String txt_PhoneNumber_AddOrganization_AddNewContact = "Phone Number Textbox of Add Organization in Add New Contact Modal Window#xpath=//div[contains(@id,'modal-add-admin-org')]//div[contains(@class,'modal-dialog modal')]//label[contains(text(),'Phone')]/parent::div//input";
	private static final String txt_LinkedIn_AddOrganization_AddNewContact = "LinkedIn Textbox of Add Organization in Add New Contact Modal Window#xpath=//div[contains(@id,'modal-add-admin-org')]//div[contains(@class,'modal-dialog modal')]//label[contains(text(),'LinkedIn')]/parent::div//input";
	private static final String txt_Description_AddOrganization_AddNewContact = "Description Textbox of Add Organization in Add New Contact Modal Window#xpath=//div[contains(@id,'modal-add-admin-org')]//div[contains(@class,'modal-dialog modal')]//label[contains(text(),'Description')]/parent::div//textarea";
	private static final String drp_EmploymentStatus_AddOrganization_AddNewContact = "Employment Status Dropdown of Add Organization in Add New Contact Modal Window#xpath=//div[contains(@id,'modal-add-admin-org')]//div[contains(@class,'modal-dialog modal')]//label[contains(text(),'Employment Status')]/parent::div//select";
	private static final String drp_AddCompanytoPortfolio_AddOrganization_AddNewContact = "Add Company to Portfolio Dropdown of Add Organization in Add New Contact Modal Window#xpath=//div[contains(@id,'modal-add-admin-org')]//div[contains(@class,'modal-dialog modal')]//label[contains(text(),'Add Company to Portfolio')]/parent::div//select";
	private static final String lnk_Clear_AddOrganization_AddNewContact = "Clear Link of Add Organization in Add New Contact Modal Window#xpath=//div[contains(@id,'modal-add-admin-org')]//div[contains(@class,'modal-dialog modal')]//a[contains(text(),'Clear')]";	
	private static final String btn_Back_AddOrganization_AddNewContact = "Back Button of Add Organization in Add New Contact Modal Window#xpath=//div[contains(@id,'modal-add-admin-org')]//div[contains(@class,'modal-dialog modal')]//button[contains(text(),'Back')]";
	private static final String btn_AddNewListing_AddOrganization_AddNewContact = "Add New Listing Button of Add Organization in Add New Contact Modal Window#xpath=//div[contains(@id,'modal-add-admin-org')]//div[contains(@class,'modal-dialog modal')]//button[contains(text(),'Add New Listing')]";
	private static final String btn_AddNewListing_Disabled_AddOrganization_AddNewContact = "Add New Listing Button Diabled of Add Organization in Add New Contact Modal Window#xpath=//div[contains(@id,'modal-add-admin-org')]//div[contains(@class,'modal-dialog modal')]//button[contains(text(),'Add New Listing') and contains(@disabled,'disabled')]";

	private static final String lbl_Salutation_MadatorySysmbol_AddNewContact_ModalDialogWindow = "Salutation Mandatory Symbol in Add New Contact Modal Window#xpath=//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//label[contains(text(),'Salutation')]//span[contains(text(),'*')]";
	private static final String lbl_FirstName_MadatorySysmbol_AddNewContact_ModalDialogWindow = "First Name Mandatory Symbol in Add New Contact Modal Window#xpath=//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//label[contains(text(),'First Name')]//span[contains(text(),'*')]";
	private static final String lbl_LastName_MadatorySysmbol_AddNewContact_ModalDialogWindow = "Last Name Mandatory Symbol in Add New Contact Modal Window#xpath=//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//label[contains(text(),'Last Name')]//span[contains(text(),'*')]";
	private static final String lbl_Email_MadatorySysmbol_AddNewContact_ModalDialogWindow = "Email Mandatory Symbol in Add New Contact Modal Window#xpath=//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//label[contains(text(),'Email')]//span[contains(text(),'*')]";
	private static final String lbl_Country_MadatorySysmbol_AddNewContact_ModalDialogWindow = "Country Mandatory Symbol in Add New Contact Modal Window#xpath=//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//input[contains(@placeholder,'Country') and contains(@class,'border-danger')]";
	private static final String lbl_LegalName_MadatorySysmbol_AddOrganization_AddNewContact_ModalDialogWindow = "Legal Name Mandatory Symbol in Add Organization of Add New Contact Modal Window#xpath=//div[contains(@id,'modal-add-admin-org')]//div[contains(@class,'modal-dialog modal')]//label[contains(text(),'Company Name')]/span[contains(text(),'*')]";
	private static final String lbl_Website_MadatorySysmbol_AddOrganization_AddNewContact_ModalDialogWindow = "Website Mandatory Symbol in Add Organization of Add New Contact Modal Window#xpath=//div[contains(@id,'modal-add-admin-org')]//div[contains(@class,'modal-dialog modal')]//label[contains(text(),'Website')]/span[contains(text(),'*')]";

	/*********************************Add New Contact***********************/



	/*********************************Company Profile Page Data Room Tab***********************/

	/*********************************Share Company Profile Page***********************/

	private static final String lbl_Share_CompanyProfilePage_ModalDialogWindow = "Share Company Profile Page Modal Window#xpath=//div[contains(@id,'org-sharing-modal')]//div[contains(@class,'modal-content')]";
	private static final String lbl_Share_CompanyProfilePage_ModalDialogWindow_Heading = "ShareCompany Profile Page Modal Window Heading Label#xpath=//div[contains(@id,'org-sharing-modal')]//div[contains(@class,'modal-content')]//div[contains(@class,'modal-title')]//*[contains(text(),'Share')]";
	private static final String lnk_Share_CompanyProfilePage_ModalDialogWindow_Close = "Close Share Company Profile Page Modal Window Link#xpath=//div[contains(@id,'org-sharing-modal')]//div[contains(@class,'modal-content')]//a[contains(@class,'modal-button-close')]";
	private static final String txt_Share_CompanyProfilePage_ModalDialogWindow_EmailAddress = "Emaill Address Textbox in Share Company Profile Page Modal Window#xpath=//div[contains(@id,'org-sharing-modal')]//div[contains(@class,'modal-content')]//input[contains(@name,'email')]";
	private static final String btn_Share_CompanyProfilePage_ModalDialogWindow_Share = "Share Button in Share Company Profile Page Modal Window Label#xpath=//div[contains(@id,'org-sharing-modal')]//div[contains(@class,'modal-content')]//button[contains(text(),'Share')]";
	private static final String chk_Share_CompanyProfilePage_ModalDialogWindow_CapTable = "Captable Checkbox in Share Company Profile Page Modal Window Label#xpath=//div[contains(@id,'org-sharing-modal')]//div[contains(@class,'modal-content')]//span[contains(text(),'Cap Table')]/preceding-sibling::input[contains(@type,'checkbox')]";
	private static final String chk_Share_CompanyProfilePage_ModalDialogWindow_DataRoom = "DataRoom Checkbox in Share Company Profile Page Modal Window Label#xpath=//div[contains(@id,'org-sharing-modal')]//div[contains(@class,'modal-content')]//span[contains(text(),'Data Room')]/preceding-sibling::input[contains(@type,'checkbox')]";
	private static final String chk_Share_CompanyProfilePage_ModalDialogWindow_KPIs = "KPIs Checkbox in Share Company Profile Page Modal Window Label#xpath=//div[contains(@id,'org-sharing-modal')]//div[contains(@class,'modal-content')]//span[contains(text(),'KPIs')]/preceding-sibling::input[contains(@type,'checkbox')]";
	private static final String lbl_Share_CompanyProfilePage_Shared_SuccessMessage = "Organization Shared success Message Label#xpath=//div[contains(@id,'org-sharing-modal')]//div[contains(@class,'modal-content')]//form[contains(@class,'sharing-form')]//div[contains(@class,'alert-success')]//span[contains(text(),'Organization has been successfully shared')]";
	private static final String btn_Share_CompanyProfilePage_ModalDialogWindow_Close = "Share Company Profile Page Modal Window Close Button#xpath=//div[contains(@id,'org-sharing-modal')]//div[contains(@class,'modal-content')]//button[contains(text(),'Close')]";

	private static final String lbl_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow = "Share Company Profile Page User Not Found Modal Window#xpath=//div[contains(@id,'org-sharing-modal')]//div[contains(@class,'modal-content')]//div//small[contains(text(),'User not found')]";
	private static final String drp_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Salutation = "Salutation Dropdown Share Company Profile Page User Not Found Modal Window#xpath=//div[contains(@id,'org-sharing-modal')]//div[contains(@class,'modal-content')]//label[contains(text(),'Salutation')]/parent::div//select";
	private static final String txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_FirstName = "First Name Textbox Share Company Profile Page User Not Found Modal Window#xpath=//div[contains(@id,'org-sharing-modal')]//div[contains(@class,'modal-content')]//label[contains(text(),'First Name')]/parent::div//input";
	private static final String txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_LastName = "Last Name Textbox Share Company Profile Page User Not Found Modal Window#xpath=//div[contains(@id,'org-sharing-modal')]//div[contains(@class,'modal-content')]//label[contains(text(),'Last Name')]/parent::div//input";
	private static final String txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Email = "Email Textbox Share Company Profile Page User Not Found Modal Window#xpath=//div[contains(@id,'org-sharing-modal')]//div[contains(@class,'modal-content')]//label[contains(text(),'Email')]/parent::div//input";
	private static final String txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_LegalName = "Legal Name Textbox Share Company Profile Page User Not Found Modal Window#xpath=//div[contains(@id,'org-sharing-modal')]//div[contains(@class,'modal-content')]//label[contains(text(),'Legal name')]/parent::div//input";
	private static final String lst_AutoCompleteList_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_LegalName = "Legal Name autocomplete list in Share Company Profile Page User Not Found Modal Window#xpath=//div[contains(@id,'org-sharing-modal')]//div[contains(@class,'modal-content')]//label[contains(text(),'Legal name')]/parent::div//div[contains(@class,'autcomplete-list')]";
	private static final String txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Address = "Address Textbox Share Company Profile Page User Not Found Modal Window#xpath=//div[contains(@id,'org-sharing-modal')]//div[contains(@class,'modal-content')]//label[contains(text(),'Address')]/parent::div//input";
	private static final String txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_City = "City Textbox Share Company Profile Page User Not Found Modal Window#xpath=//div[contains(@id,'org-sharing-modal')]//div[contains(@class,'modal-content')]//label[contains(text(),'City')]/parent::div//input";
	private static final String txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_PostalCode = "Postal Code Textbox Share Company Profile Page User Not Found Modal Window#xpath=//div[contains(@id,'org-sharing-modal')]//div[contains(@class,'modal-content')]//label[contains(text(),'Postal code')]/parent::div//input";
	private static final String txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_State = "State Textbox Share Company Profile Page User Not Found Modal Window#xpath=//div[contains(@id,'org-sharing-modal')]//div[contains(@class,'modal-content')]//label[contains(text(),'State')]/parent::div//input";
	private static final String txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Country = "Country Textbox Share Company Profile Page User Not Found Modal Window#xpath=//div[contains(@id,'org-sharing-modal')]//div[contains(@class,'modal-content')]//label[contains(text(),'Country')]/parent::div//input";
	
	private static final String txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Website = "Website Textbox Share Company Profile Page User Not Found Modal Window#xpath=//div[contains(@id,'org-sharing-modal')]//div[contains(@class,'modal-content')]//label[contains(text(),'Website')]/parent::div//input";
	private static final String txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Phone = "Phone Textbox Share Company Profile Page User Not Found Modal Window#xpath=//div[contains(@id,'org-sharing-modal')]//div[contains(@class,'modal-content')]//label[contains(text(),'Phone')]/parent::div//input";

	private static final String lbl_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Salutation_Mandatory = "Salutation Dropdown Madatory Symbol in Share Company Profile Page User Not Found Modal Window#xpath=//div[contains(@id,'org-sharing-modal')]//div[contains(@class,'modal-content')]//label[contains(text(),'Salutation') and contains(text(),'*')]";
	private static final String lbl_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_FirstName_Mandatory = "First Name Textbox Madatory Symbol in Share Company Profile Page User Not Found Modal Window#xpath=//div[contains(@id,'org-sharing-modal')]//div[contains(@class,'modal-content')]//label[contains(text(),'First Name') and contains(text(),'*')]";
	private static final String lbl_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_LastName_Mandatory = "Last Name Textbox Madatory Symbol in Share Company Profile Page User Not Found Modal Window#xpath=//div[contains(@id,'org-sharing-modal')]//div[contains(@class,'modal-content')]//label[contains(text(),'Last Name') and contains(text(),'*')]";
	private static final String lbl_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Email_Mandatory = "Email Textbox Madatory Symbol in Share Company Profile Page User Not Found Modal Window#xpath=//div[contains(@id,'org-sharing-modal')]//div[contains(@class,'modal-content')]//label[contains(text(),'Email') and contains(text(),'*')]";
	private static final String lbl_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_LegalName_Mandatory = "Legal Name Textbox Madatory Symbol in Share Company Profile Page User Not Found Modal Window#xpath=//div[contains(@id,'org-sharing-modal')]//div[contains(@class,'modal-content')]//label[contains(text(),'Legal name') and contains(text(),'*')]";
	private static final String lbl_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Country_Mandatory = "Country Textbox Madatory Symbol in Share Company Profile Page User Not Found Modal Window#xpath=//div[contains(@id,'org-sharing-modal')]//div[contains(@class,'modal-content')]//label[contains(text(),'Country') and contains(text(),'*')]";
	private static final String lbl_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Website_Mandatory = "Website Textbox Madatory Symbol in hare Company Profile Page User Not Found Modal Window#xpath=//div[contains(@id,'org-sharing-modal')]//div[contains(@class,'modal-content')]//label[contains(text(),'Website') and contains(text(),'*')]";
	private static final String lbl_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Phone_Mandatory = "Phone Textbox Madatory Symbol in Share Company Profile Page User Not Found Modal Window#xpath=//div[contains(@id,'org-sharing-modal')]//div[contains(@class,'modal-content')]//label[contains(text(),'Phone') and contains(text(),'*')]";
	
	
	private static final String lbl_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Salutation_Missing_ErrorMessage = "Salutation Dropdown missing error message in Share Company Profile Page User Not Found Modal Window#xpath=//div[contains(@id,'org-sharing-modal')]//div[contains(@class,'modal-content')]//div[contains(@class,'alert')]//span[contains(text(),'Missing required input: salutation')]";
	private static final String lbl_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_FirstName_Missing_ErrorMessage = "First Name textbox missing error message in Share Company Profile Page User Not Found Modal Window#xpath=//div[contains(@id,'org-sharing-modal')]//div[contains(@class,'modal-content')]//div[contains(@class,'alert')]//span[contains(text(),'Missing required input: first_name')]";
	private static final String lbl_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_LastName_Missing_ErrorMessage = "Last Name textbox missing error message in Share Company Profile Page User Not Found Modal Window#xpath=//div[contains(@id,'org-sharing-modal')]//div[contains(@class,'modal-content')]//div[contains(@class,'alert')]//span[contains(text(),'Missing required input: last_name')]";
	private static final String lbl_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Email_Missing_ErrorMessage = "Email textbox missing error message in Share Company Profile Page User Not Found Modal Window#xpath=//div[contains(@id,'org-sharing-modal')]//div[contains(@class,'modal-content')]//div[contains(@class,'alert')]//span[contains(text(),'Missing required input: email')]";
	private static final String lbl_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Legalname_Missing_ErrorMessage = "Legal Name textbox missing error message in Share Company Profile Page User Not Found Modal Window#xpath=//div[contains(@id,'org-sharing-modal')]//div[contains(@class,'modal-content')]//div[contains(@class,'alert')]//span[contains(text(),'Missing required input: company')]";
	private static final String lbl_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Country_Missing_ErrorMessage = "Country textbox missing error message in Share Company Profile Page User Not Found Modal Window#xpath=//div[contains(@id,'org-sharing-modal')]//div[contains(@class,'modal-content')]//div[contains(@class,'alert')]//span[contains(text(),'Missing required input: country')]";
	private static final String lbl_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Website_Missing_ErrorMessage = "Website textbox missing error message in Share Company Profile Page User Not Found Modal Window#xpath=//div[contains(@id,'org-sharing-modal')]//div[contains(@class,'modal-content')]//div[contains(@class,'alert')]//span[contains(text(),'Missing required input: website')]";
	private static final String lbl_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Phone_Missing_ErrorMessage = "Phone textbox missing error message in Share Company Profile Page User Not Found Modal Window#xpath=//div[contains(@id,'org-sharing-modal')]//div[contains(@class,'modal-content')]//div[contains(@class,'alert')]//span[contains(text(),'Missing required input: phone')]";


	/*********************************Share Company Profile Page***********************/



	/*********************************Share Data Room***********************/

	

	/*********************************Share Data Room***********************/



	/*********************************Create/Add Folder Data Room***********************/

	private static final String lbl_CreateorAddFolder_DataRoom_ModalDialogWindow = "Add/Create Folder Modal Dialog Window#xpath=//div[contains(@id,'dataroom-folder-modal')]//div[contains(@class,'modal-content')]";
	private static final String lbl_CreateorAddFolder_DataRoom_ModalDialogWindow_Heading = "Add/Create Folder Modal Dialog Window Heading Label#xpath=//div[contains(@id,'dataroom-folder-modal')]//div[contains(@class,'modal-content')]//div[contains(@class,'modal-title') and contains(text(),'Create')]";
	private static final String lnk_CreateorAddFolder_DataRoom_ModalDialogWindow_Close = "Close Add/Create Folder Data Room Modal Window Link#xpath=//div[contains(@id,'dataroom-folder-modal')]//div[contains(@class,'modal-content')]//a[contains(@class,'modal-button-close')]";
	private static final String txt_CreateorAddFolder_DataRoom_ModalDialogWindow_FolderName = "Folder Name Textbox in Add/Create Folder Modal Dialog Window#xpath=(//div[contains(@id,'dataroom-folder-modal')]//div[contains(@class,'modal-content')]//label[contains(text(),'New Folder Name')]/following-sibling::input)[1]";
	private static final String btn_CreateorAddFolder_DataRoom_ModalDialogWindow_Create = "Add Button in Add/Create Folder Modal Dialog Window#xpath=//div[contains(@id,'dataroom-folder-modal')]//div[contains(@class,'modal-content')]//button[contains(text(),'Create')]";

	/*********************************Create/Add Folder Data Room***********************/


	/*********************************Edit/Update Folder Data Room***********************/

	private static final String lbl_EditorUpdateFolder_DataRoom_ModalDialogWindow = "Edit/Update Folder Modal Dialog Window#xpath=//div[contains(@id,'dataroom-folder-modal')]//div[contains(@class,'modal-content')]";
	private static final String lbl_EditorUpdateFolder_DataRoom_ModalDialogWindow_Heading = "Edit/Update Folder Modal Dialog Window Heading Label#xpath=//div[contains(@id,'dataroom-folder-modal')]//div[contains(@class,'modal-content')]//div[contains(@class,'modal-title') and contains(text(),'Edit')]";
	private static final String lnk_EditorUpdateFolder_DataRoom_ModalDialogWindow_Close = "Close Edit/Update Folder Data Room Modal Window Link#xpath=//div[contains(@id,'dataroom-folder-modal')]//div[contains(@class,'modal-content')]//a[contains(@class,'modal-button-close')]";
	private static final String txt_EditorUpdateFolder_DataRoom_ModalDialogWindow_FolderName = "Folder Name Textbox in Edit/Update Folder Modal Dialog Window#xpath=(//div[contains(@id,'dataroom-folder-modal')]//div[contains(@class,'modal-content')]//label[contains(text(),'New Folder Name')]/following-sibling::input)[1]";
	private static final String btn_EditorUpdateFolder_DataRoom_ModalDialogWindow_Edit = "Edit Button in Edit/Update Folder Modal Dialog Window#xpath=//div[contains(@id,'dataroom-folder-modal')]//div[contains(@class,'modal-content')]//button[contains(text(),'Edit')]";

	/*********************************Edit/Update Folder Data Room***********************/


	/*********************************Delete Folder Data Room***********************/

	private static final String lbl_DeleteFolderDataRoom_ModalDialogWindow = "Delete Folder Modal Dialog Window#xpath=//div[contains(@id,'dataroom-confirmation-modal')]//div[contains(@class,'modal-content')]";
	private static final String lbl_DeleteFolderDataRoom_ModalDialogWindow_Heading = "Delete Folder Modal Dialog Window Heading Label#xpath=//div[contains(@id,'dataroom-confirmation-modal')]//div[contains(@class,'modal-content')]//div[contains(@class,'modal-title')]//*[contains(text(),'delete room')]";
	private static final String lnk_DeleteFolder_DataRoom_ModalDialogWindow_Close = "Close Delete Folder Data Room Modal Window Link#xpath=//div[contains(@id,'dataroom-confirmation-modal')]//div[contains(@class,'modal-content')]//a[contains(@class,'modal-button-close')]";
	private static final String btn_DeleteFolder_DataRoom_ModalDialogWindow_Delete = "Delete Button in Delete Folder Modal Dialog Window#xpath=//div[contains(@id,'dataroom-confirmation-modal')]//div[contains(@class,'modal-content')]//span[contains(text(),'Delete')]";
	private static final String lbl_DeleteFolderDataRoom_ModalDialogWindow_CompanyProfileSection = "Company Profile Section Delete Folder Heading in Delete Folder Modal Dialog Window#xpath=//div[contains(@id,'dataroom-confirmation-modal')]//div[contains(@class,'modal-content')]//div[contains(@class,'modal-title')]//small[contains(text(),'Company Profile')]";
	private static final String lbl_DeleteFolderDataRoom_ModalDialogWindow_DueDiligenceSection = "Due Diligence Section Delete Folder Heading in Delete Folder Modal Dialog Window#xpath=//div[contains(@id,'dataroom-confirmation-modal')]//div[contains(@class,'modal-content')]//div[contains(@class,'modal-title')]//small[contains(text(),'Due Diligence')]";
	private static final String lbl_DeleteFolderDataRoom_ModalDialogWindow_InvestmentsSection = "Investments Section Delete Folder Heading in Delete Folder Modal Dialog Window#xpath=//div[contains(@id,'dataroom-confirmation-modal')]//div[contains(@class,'modal-content')]//div[contains(@class,'modal-title')]//small[contains(text(),'Investments')]";
	private static final String lbl_DeleteFolderDataRoom_ModalDialogWindow_FinancialsSection = "Financials Section Delete Folder Heading in Delete Folder Modal Dialog Window#xpath=//div[contains(@id,'dataroom-confirmation-modal')]//div[contains(@class,'modal-content')]//div[contains(@class,'modal-title')]//small[contains(text(),'Financials')]";
	private static final String lbl_DeleteFolderDataRoom_ModalDialogWindow_LegalSection = "Legal Section Delete Folder Heading in Delete Folder Modal Dialog Window#xpath=//div[contains(@id,'dataroom-confirmation-modal')]//div[contains(@class,'modal-content')]//div[contains(@class,'modal-title')]//small[contains(text(),'Legal')]";
	private static final String lbl_DeleteFolderDataRoom_ModalDialogWindow_ShareholderUpdatesSection = "Shareholder Updates Section Delete Folder Heading in Delete Folder Modal Dialog Window#xpath=//div[contains(@id,'dataroom-confirmation-modal')]//div[contains(@class,'modal-content')]//div[contains(@class,'modal-title')]//small[contains(text(),'Shareholder Updates')]";
	private static final String lbl_DeleteFolderDataRoom_ModalDialogWindow_ManagementTeamSection = "Management Team Section Delete Folder Heading in Delete Folder Modal Dialog Window#xpath=//div[contains(@id,'dataroom-confirmation-modal')]//div[contains(@class,'modal-content')]//div[contains(@class,'modal-title')]//small[contains(text(),'Management Team')]";
	private static final String lbl_DeleteFolderDataRoom_ModalDialogWindow_IPortechnologySection = "IP/technology Section Delete Folder Heading in Delete Folder Modal Dialog Window#xpath=//div[contains(@id,'dataroom-confirmation-modal')]//div[contains(@class,'modal-content')]//div[contains(@class,'modal-title')]//small[contains(text(),'IP/technology')]";
	private static final String lbl_DeleteFolderDataRoom_ModalDialogWindow_InboxSection = "Inbox Section Delete Folder Heading in Delete Folder Modal Dialog Window#xpath=//div[contains(@id,'dataroom-confirmation-modal')]//div[contains(@class,'modal-content')]//div[contains(@class,'modal-title')]//small[contains(text(),'Inbox')]";

	/*********************************Delete Folder Data Room***********************/


	/*********************************Edit Folder Data Room***********************/

	private static final String lbl_EditFolder_DataRoom_ModalDialogWindow = "Edit Folder Modal Dialog Window#xpath=//div[contains(@id,'dataroom-folder-modal')]//div[contains(@class,'modal-content')]";
	private static final String lbl_EditFolder_DataRoom_ModalDialogWindow_Heading = "Edit Folder Modal Dialog Window Heading Label#xpath=//div[contains(@id,'dataroom-folder-modal')]//div[contains(@class,'modal-content')]//div[contains(@class,'modal-title') and contains(text(),'Update Folder Name')]";
	private static final String lnk_EditFolder_DataRoom_ModalDialogWindow_Close = "Close Edit Folder Data Room Modal Window Link#xpath=//div[contains(@id,'dataroom-folder-modal')]//div[contains(@class,'modal-content')]//a[contains(@class,'modal-button-close')]";
	private static final String txt_EditFolder_DataRoom_ModalDialogWindow_FolderName = "Folder Name Textbox in Edit Folder Modal Dialog Window#xpath=(//div[contains(@id,'dataroom-folder-modal')]//div[contains(@class,'modal-content')]//label[contains(text(),'New Folder Name')]/following-sibling::input)[1]";
	private static final String btn_EditFolder_DataRoom_ModalDialogWindow_Add = "Add Button in Edit Folder Modal Dialog Window#xpath=//div[contains(@id,'dataroom-folder-modal')]//div[contains(@class,'modal-content')]//button[contains(text(),'Edit')]";

	/*********************************Edit Folder Data Room***********************/


	/*********************************Upload File Data Room***********************/

	private static final String lbl_UploadFile_DataRoom_ModalDialogWindow = "Upload File Modal Dialog Window#xpath=//div[contains(@id,'dataroom-content-modal')]//div[contains(@class,'modal-content')]";
	private static final String lbl_UploadFile_DataRoom_ModalDialogWindow_Heading = "Upload File Modal Dialog Window Heading Label#xpath=//div[contains(@id,'dataroom-content-modal') and contains(@class,'fade show')]//div[contains(@class,'modal-content')]//div[contains(@class,'modal-title')]//*[contains(text(),'Upload')]";
	private static final String lnk_UploadFile_DataRoom_ModalDialogWindow_AddDocument_Heading = "Add Document Heading Link in Upload File Modal Dialog Window#xpath=//div[contains(@id,'dataroom-content-modal')]//div[contains(@class,'modal-content')]//ul[contains(@class,'folder_tabs')]//li//a[contains(text(),'Add Document')]";
	private static final String lnk_UploadFile_DataRoom_ModalDialogWindow_UploadMultipleFiles_Heading = "Upload Multiple Files Heading Link in Upload File Modal Dialog Window#xpath=//div[contains(@id,'dataroom-content-modal')]//div[contains(@class,'modal-content')]//ul[contains(@class,'folder_tabs')]//li//a[contains(text(),'upload multiple files')]";
	private static final String lnk_UploadFile_DataRoom_ModalDialogWindow_CreateDocuSignDocument_Heading = "Create Docu Sign Document Heading Link in Upload File Modal Dialog Window#xpath=//div[contains(@id,'dataroom-content-modal')]//div[contains(@class,'modal-content')]//ul[contains(@class,'folder_tabs')]//li//a[contains(text(),'Create DocuSign Document')]";
	private static final String lnk_UploadFile_DataRoom_ModalDialogWindow_Close = "Close Upload File Data Room Modal Window Link#xpath=//div[contains(@id,'dataroom-content-modal')]//div[contains(@class,'modal-content')]//a[contains(@class,'modal-button-close')]";

	private static final String txt_UploadFile_DataRoom_ModalDialogWindow_AddDocument_FileName = "File Name textbox of Add Document Tab in Upload File Modal Dialog Window#xpath=//div[contains(@id,'dataroom-content-modal')]//div[contains(@class,'modal-content')]//label[contains(text(),'File Name')]//following-sibling::input";
	private static final String drp_UploadFile_DataRoom_ModalDialogWindow_AddDocument_FileType = "File Type Dropdown of Add Document Tab in Upload File Modal Dialog Window#xpath=//div[contains(@id,'dataroom-content-modal')]//div[contains(@class,'modal-content')]//label[contains(text(),'File Type')]//following-sibling::select";
	private static final String txt_UploadFile_DataRoom_ModalDialogWindow_AddDocument_CustomFileType = "Custom File Type Textbox of Add Document Tab in Upload File Modal Dialog Window#xpath=//div[contains(@id,'dataroom-content-modal')]//div[contains(@class,'modal-content')]//label[contains(text(),'File Type')]//following-sibling::input";
	private static final String drp_UploadFile_DataRoom_ModalDialogWindow_AddDocument_DocumentPermissions = "Document Permissions Dropdown of Add Document Tab in Upload File Modal Dialog Window#xpath=//div[contains(@id,'dataroom-content-modal')]//div[contains(@class,'modal-content')]//label[contains(text(),'Document Permissions')]//following-sibling::select";
	private static final String txt_UploadFile_DataRoom_ModalDialogWindow_AddDocument_DocumentSignedDate = "Document Signed Dated of Add Document Tab in Upload File Modal Dialog Window#xpath=//div[contains(@id,'dataroom-content-modal')]//div[contains(@class,'modal-content')]//label[contains(text(),'Document signed / Event date')]//following::div//input";
	private static final String btn_UploadFile_DataRoom_ModalDialogWindow_AddDocument_ChooseFile = "Choose File Textbox of Add Document Tab in Upload File Modal Dialog Window#xpath=//div[contains(@id,'dataroom-content-modal')]//div[contains(@class,'modal-content')]//input[contains(@type,'file')]";

	private static final String lbl_ScreenshotManager_ModalDialogWindow_FileUploadedSuccessMessage = "File uploaded success message in Screenshot Manager Modal Dialog Window#xpath=//div[contains(@class,'icon-success')]//div[contains(text(),'Screenshot uploaded')]";
	private static final String btn_ScreenshotManager_ModalDialogWindow_FileUploadedSuccessMessage_OK = "Ok Button of File uploaded success message in Screenshot Manager Modal Dialog Window#xpath=//div[contains(@class,'icon-success')]//button[contains(text(),'Ok')]";
	private static final String txt_UploadFile_DataRoom_ModalDialogWindow_UploadMultipleFiles_FirstRecord_FileName = "First Record File Name Textbox of Upload Multiple Files Tab in Upload File Modal Dialog Window#xpath=//div[contains(@id,'dataroom-content-modal')]//div[contains(@class,'modal-content')]//table//tbody//tr[1]//td[1]//input";
	private static final String drp_UploadFile_DataRoom_ModalDialogWindow_UploadMultipleFiles_FirstRecord_FileType = "First Record File Type Dropdown of Upload Multiple Files Tab in Upload File Modal Dialog Window#xpath=//div[contains(@id,'dataroom-content-modal')]//div[contains(@class,'modal-content')]//table//tbody//tr[1]//td[2]//select";
	private static final String txt_UploadFile_DataRoom_ModalDialogWindow_UploadMultipleFiles_FirstRecord_FileType = "First Record File Type Custom File Name Textbox of Upload Multiple Files Tab in Upload File Modal Dialog Window#xpath=//div[contains(@id,'dataroom-content-modal')]//div[contains(@class,'modal-content')]//table//tbody//tr[1]//td[2]//input";
	private static final String drp_UploadFile_DataRoom_ModalDialogWindow_UploadMultipleFiles_FirstRecord_DocumentPermission = "First Record Document Permission Dropdown of Upload Multiple Files Tab in Upload File Modal Dialog Window#xpath=//div[contains(@id,'dataroom-content-modal')]//div[contains(@class,'modal-content')]//table//tbody//tr[1]//td[3]//select";
	private static final String drp_UploadFile_DataRoom_ModalDialogWindow_UploadMultipleFiles_FirstRecord_DocumentSignedDate = "First Record Document Signed date of of Upload Multiple Files Tab in Upload File Modal Dialog Window#xpath=//div[contains(@id,'dataroom-content-modal')]//div[contains(@class,'modal-content')]//table//tbody//tr[1]//td[4]//input";
	private static final String btn_UploadFile_DataRoom_ModalDialogWindow_UploadMultipleFiles_FirstRecord_Delete = "First Record Delete Button of Upload Multiple Files Tab in Upload File Modal Dialog Window#xpath=//div[contains(@id,'dataroom-content-modal')]//div[contains(@class,'modal-content')]//table//tbody//tr[1]//td[5]//span[contains(@title,'Remove')]";
	private static final String btn_UploadFile_DataRoom_ModalDialogWindow_UploadMultipleFiles_AddNewFile = "Add New file button of Upload Multiple Files Tab in Upload File Modal Dialog Window#xpath=//div[contains(@id,'dataroom-content-modal')]//div[contains(@class,'modal-content')]//span[contains(text(),'Add New File')]";


	private static final String txt_UploadFile_DataRoom_ModalDialogWindow_CreateDocuSignDocument_FileName = "File Name textbox of Create Docu Sign Document Tab in Upload File Modal Dialog Window#xpath=//div[contains(@id,'dataroom-content-modal')]//div[contains(@class,'modal-content')]//label[contains(text(),'File Name')]//following-sibling::input";
	private static final String drp_UploadFile_DataRoom_ModalDialogWindow_CreateDocuSignDocument_FileType = "File Type Dropdown of Create Docu Sign Document Tab in Upload File Modal Dialog Window#xpath=//div[contains(@id,'dataroom-content-modal')]//div[contains(@class,'modal-content')]//label[contains(text(),'File Type')]//following-sibling::select";
	private static final String txt_UploadFile_DataRoom_ModalDialogWindow_CreateDocuSignDocument_CustomFileType = "Custom File Type Textbox of Create Docu Sign Document Tab in Upload File Modal Dialog Window#xpath=//div[contains(@id,'dataroom-content-modal')]//div[contains(@class,'modal-content')]//label[contains(text(),'File Type')]//following-sibling::input";
	private static final String drp_UploadFile_DataRoom_ModalDialogWindow_CreateDocuSignDocument_DocumentPermissions = "Document Permissions Dropdown of Create Docu Sign Document Tab in Upload File Modal Dialog Window#xpath=//div[contains(@id,'dataroom-content-modal')]//div[contains(@class,'modal-content')]//label[contains(text(),'Document Permissions')]//following-sibling::select";
	private static final String chk_UploadFile_DataRoom_ModalDialogWindow_CreateDocuSignDocument_SendContractForSignImmediately = "Document Signed Checkbox of Create Docu Sign Document Tab in Upload File Modal Dialog Window#xpath=//div[contains(@id,'dataroom-content-modal')]//div[contains(@class,'modal-content')]//label[contains(text(),'Send contract out for signing immediately')]//input";


	private static final String btn_UploadFile_DataRoom_ModalDialogWindow_Upload = "Upload Button in Edit Folder Modal Dialog Window#xpath=//div[contains(@id,'dataroom-content-modal')]//div[contains(@class,'modal-content')]//span[contains(text(),'Upload')]";

	/*********************************Upload File Data Room***********************/


	/*********************************Edit File of Data Room***********************/

	private static final String lbl_EditFile_DataRoom_ModalDialogWindow_Heading = "Edit File Modal Dialog Window Heading Label#xpath=//div[contains(@id,'dataroom-edit-content-modal')]//div[contains(@class,'modal-content')]//div[contains(@class,'title')]//*[contains(text(),'Edit')]";
	private static final String lnk_EditFile_DataRoom_ModalDialogWindow_Close = "Close Link of Edit File Modal Dialog Window#xpath=//div[contains(@id,'dataroom-edit-content-modal')]//div[contains(@class,'modal-content')]//a[contains(@class,'close')]";
	private static final String txt_EditFile_DataRoom_ModalDialogWindow_DocumentTitle = "Document Title Textbox in Edit File Dialog Window#xpath=//div[contains(@id,'dataroom-edit-content-modal')]//div[contains(@class,'modal-content')]//label[contains(text(),'Document Title')]//following-sibling::input";
	private static final String drp_EditFile_DataRoom_ModalDialogWindow_FileType = "File Type Dropdown in Edit File Dialog Window#xpath=//div[contains(@id,'dataroom-edit-content-modal')]//div[contains(@class,'modal-content')]//label[contains(text(),'File Type')]//following-sibling::select";
	private static final String drp_EditFile_DataRoom_ModalDialogWindow_DocumentPermissions = "Document Permissions Dropdown in Edit File Dialog Window#xpath=//div[contains(@id,'dataroom-edit-content-modal')]//div[contains(@class,'modal-content')]//label[contains(text(),'Document Permissions')]//following-sibling::select";
	private static final String drp_EditFile_DataRoom_ModalDialogWindow_Folder = "Folder Dropdown in Edit File Dialog Window#xpath=//div[contains(@id,'dataroom-edit-content-modal')]//div[contains(@class,'modal-content')]//label[contains(text(),'folder')]//following-sibling::select";
	private static final String txt_EditFile_DataRoom_ModalDialogWindow_DocumentSignedorEventDate = "Document Signed or Event Date Textbox in Edit File Dialog Window#xpath=//div[contains(@id,'dataroom-edit-content-modal')]//div[contains(@class,'modal-content')]//label[contains(text(),'Document signed / Event date')]//following-sibling::div//input";
	private static final String btn_EditFile_DataRoom_ModalDialogWindow_Edit = "Edit Button in Edit File Dialog Window#xpath=//div[contains(@id,'dataroom-edit-content-modal')]//div[contains(@class,'modal-content')]//button[contains(text(),'Edit')]";

	/*********************************Edit File of Data Room***********************/


	/*********************************Delete File of Data Room***********************/

	private static final String lbl_DeleteFile_DataRoom_ModalDialogWindow = "Delete File Modal Dialog Window#xpath=//div[contains(@id,'dataroom-confirmation-modal')]//div[contains(@class,'modal-content')]";
	private static final String lbl_DeleteFile_DataRoom_ModalDialogWindow_Heading = "Delete File Modal Dialog Window Heading Label#xpath=private static final String lbl_DeleteFile_DataRoom_ModalDialogWindow_Heading = \"Delete File Modal Dialog Window Heading Label#xpath=//div[contains(@id,'dataroom-edit-content-modal')]//div[contains(@class,'modal-content')]//div[contains(@class,'title')]//*[contains(text(),'Edit')]\";";
	private static final String lbl_DeleteFile_DataRoom_ModalDialogWindow_FileName = "File Name Label in Delete File Modal Dialog Window#xpath=//div[contains(@id,'dataroom-confirmation-modal')]//div[contains(@class,'modal-content')]//div[contains(@class,'modal-title')]//*[contains(text(),'Delete')]//small";
	private static final String btn_DeleteFile_DataRoom_ModalDialogWindow_Delete = "Delete Button in Delete File Modal Dialog Window#xpath=//div[contains(@id,'dataroom-confirmation-modal')]//div[contains(@class,'modal-content')]//span[contains(text(),'Delete')]";
	private static final String lnk_DeleteFile_DataRoom_ModalDialogWindow_Close = "Close Link of Delete File Modal Dialog Window#xpath=//div[contains(@id,'dataroom-confirmation-modal')]//div[contains(@class,'modal-content')]//a[contains(@class,'close')]";

	/*********************************Delete File of Data Room***********************/


	/*********************************Delete Folder of Data Room***********************/

	private static final String lbl_DeleteFolder_DataRoom_ModalDialogWindow = "Delete Folder Modal Dialog Window#xpath=//div[contains(@id,'dataroom-folder-modal')]//div[contains(@class,'modal-content')]//div[contains(@class,'modal-title') and contains(text(),'delete folder')]";
	private static final String lbl_DeleteFolder_DataRoom_ModalDialogWindow_FolderName = "Folder Name Label in Delete Folder Modal Dialog Window#xpath=//div[contains(@id,'dataroom-folder-modal')]//div[contains(@class,'modal-content')]//p";
	private static final String btn_DeleteFolder_DataRoom_ModalDialogWindow_DeleteFolder = "Delete Button in Delete Folder Modal Dialog Window#xpath=//div[contains(@id,'dataroom-folder-modal')]//div[contains(@class,'modal-content')]//button[contains(text(),'delete folder')]";
	private static final String lnk_DeleteFolder_DataRoom_ModalDialogWindow_CloseWindow = "Close Link of Delete Folder Modal Dialog Window#xpath=//div[contains(@id,'dataroom-folder-modal')]//div[contains(@class,'modal-content')]//a[contains(@class,'close')]";

	/*********************************Delete Folder of Data Room***********************/


	/*********************************Company Profile Page Data Room Tab***********************/

	private static final String txt_CompanyProfilePage_UploadPresentation_DialogWindow_UploadFile = "Upload File Textbox in Upload Presentation Dialog window in Company Profile Page#xpath=(//div[contains(@id,'modal-upload-presentation')]//div[contains(@class,'modal-content')]//div[contains(@class,'title')]//*[contains(text(),'Upload Presentation')])[1]//parent::div//parent::div[contains(@class,'body')]//input[contains(@id,'input-presentation-file')]";
	private static final String btn_CompanyProfilePage_UploadPresentation_DialogWindow_Upload = "Upload Button in Upload Presentation Dialog window in Company Profile Page#xpath=(//div[contains(@id,'modal-upload-presentation')]//div[contains(@class,'modal-content')]//div[contains(@class,'title')]//*[contains(text(),'Upload Presentation')])[1]//parent::div//parent::div//button[contains(text(),'Upload')]";
	private static final String txt_CompanyProfilePage_UploadPresentation_DialogWindow_FileName = "File Name Textbox in Upload Presentation Dialog window in Company Profile Page#xpath=(//div[contains(@id,'modal-upload-presentation')]//div[contains(@class,'modal-content')]//div[contains(@class,'title')]//*[contains(text(),'Upload Presentation')])[1]//parent::div//parent::div[contains(@class,'body')]//input[contains(@class,'document_title')]";
	private static final String lbl_CompanyProfilePage_UpdateCompanyData_DialogWindow = "Update Company Data Dialog window in Company Profile Page#xpath=//div[contains(@class,'modal-content')]//*[contains(text(),'Update Company Data')]";
	private static final String lnk_CompanyProfilePage_UpdateCompanyData_DialogWindow_Close = "Close link in Update Company Data Dialog window in Company Profile Page#xpath=//div[contains(@class,'modal-content')]//*[contains(text(),'Update Company Data')]//preceding-sibling::a";
	private static final String lbl_CompanyProfilePage_UploadPresentation_DialogWindow = "Upload Presentation Dialog window in Company Profile Page#xpath=(//div[contains(@id,'modal-upload-presentation')]//div[contains(@class,'modal-content')]//div[contains(@class,'title')]//*[contains(text(),'Upload Presentation')])[1]";
	private static final String lnk_CompanyProfilePage_UploadPresentation_DialogWindow_Close = "Close Link in Upload Presentation Dialog window in Company Profile Page#xpath=(//div[contains(@id,'modal-upload-presentation')]//div[contains(@class,'modal-content')]//div[contains(@class,'title')]//*[contains(text(),'Upload Presentation')])[1]/parent::div//preceding-sibling::a";
	private static final String lbl_CompanyProfilePage_UploadVideo_DialogWindow = "Upload Video Dialog window in Company Profile Page#xpath=//div[contains(@class,'upload-video-media')]//div[contains(@class,'modal-content')]//*[contains(text(),'Upload Video')]";
	private static final String lnk_CompanyProfilePage_UploadVideo_DialogWindow_Close = "Upload Video Dialog window in Company Profile Page#xpath=//div[contains(@class,'upload-video-media')]//div[contains(@class,'modal-content')]//*[contains(text(),'Upload Video')]//parent::div//preceding-sibling::a";
	private static final String lbl_CompanyProfilePage_CustomizeProfile_DialogWindow = "Customize Profile Dialog window in Company Profile Page#xpath=//div[contains(@class,'modal-content')]//*[contains(text(),'Customize Profile')]";
	private static final String lnk_CompanyProfilePage_CustomizeProfile_DialogWindow_Close = "Close Link in Customize Profile Dialog window in Company Profile Page#xpath=//div[contains(@class,'modal-content')]//*[contains(text(),'Customize Profile')]//preceding-sibling::a";
	private static final String lbl_CompanyProfilePage_MergeCompany_DialogWindow = "Merge Company Dialog window in Company Profile Page#xpath=//div[contains(@class,'modal-content')]//*[contains(text(),'Merge Company')]";
	private static final String lnk_CompanyProfilePage_MergeCompany_DialogWindow_Close = "Close Link in Merge Company Dialog window in Company Profile Page#xpath=//div[contains(@class,'modal-content')]//*[contains(text(),'Merge Company')]//preceding-sibling::a";
	private static final String lbl_CompanyProfilePage_ViewUserAccessList_DialogWindow = "View User Access List Dialog window in Company Profile Page#xpath=//div[contains(@id,'org-recipient-access-modal')]//div[contains(@class,'modal-content')]//*[contains(text(),'User Access List')]";
	private static final String lnk_CompanyProfilePage_ViewUserAccessList_DialogWindow_Close = "Close Link in View User Access List Dialog window in Company Profile Page#xpath=//div[contains(@id,'org-recipient-access-modal')]//div[contains(@class,'modal-content')]//*[contains(text(),'User Access List')]//preceding-sibling::a";
	private static final String lbl_CompanyProfilePage_PrintReport_DialogWindow = "Print Report Dialog window in Company Profile Page#xpath=//div[contains(@id,'org-print-report-modal')]//div[contains(@class,'modal-content')]//*[contains(text(),'Print Report')]";
	private static final String lnk_CompanyProfilePage_PrintReport_DialogWindow_Close = "Close Link in Print Report Dialog window in Company Profile Page#xpath=//div[contains(@id,'org-print-report-modal')]//div[contains(@class,'modal-content')]//*[contains(text(),'Print Report')]//parent::*//parent::div//preceding-sibling::a";
	private static final String lbl_CompanyProfilePage_ViewProfileasPublic_DialogWindow = "View Profile as Public Dialog window in Company Profile Page#xpath=//div[contains(@class,'org-page')]//div[contains(@class,'notification-primary')]//span[contains(text(),'You are currently viewing this profile as public')]";
	private static final String lbl_UploadPresentation_ModalDialogWindow_FileUploadedSuccessMessage = "File uploaded success message in Upload Presentation Modal Dialog Window#xpath=//div[contains(@class,'icon-success')]//div[contains(text(),'Presentation uploaded')]";
	private static final String btn_UploadPresentation_ModalDialogWindow_FileUploadedSuccessMessage_OK = "Ok Button of File uploaded success message in Upload Presentation Modal Dialog Window#xpath=//div[contains(@class,'icon-success')]//button[contains(text(),'OK')]";

	
	private static final String chk_ViewUserAccessList_ModalDialogWindow_Checkbox1 = "Checkbox 1 in View User Access List Modal Dialog Window#xpath=(//div[contains(@id,'org-recipient-access-modal')]//div[contains(@class,'modal-content')]//*[contains(text(),'User Access List')]//parent::div//input[contains(@type,'checkbox') and contains(@class,'recipient')])[1]";
	private static final String chk_ViewUserAccessList_ModalDialogWindow_Checkbox2 = "Checkbox 2 in View User Access List Modal Dialog Window#xpath=(//div[contains(@id,'org-recipient-access-modal')]//div[contains(@class,'modal-content')]//*[contains(text(),'User Access List')]//parent::div//input[contains(@type,'checkbox') and contains(@class,'recipient')])[2]";
	private static final String chk_ViewUserAccessList_ModalDialogWindow_Checkbox3 = "Checkbox 3 in View User Access List Modal Dialog Window#xpath=(//div[contains(@id,'org-recipient-access-modal')]//div[contains(@class,'modal-content')]//*[contains(text(),'User Access List')]//parent::div//input[contains(@type,'checkbox') and contains(@class,'recipient')])[3]";
	private static final String chk_ViewUserAccessList_ModalDialogWindow_Checkbox4 = "Checkbox 4 in View User Access List Modal Dialog Window#xpath=(//div[contains(@id,'org-recipient-access-modal')]//div[contains(@class,'modal-content')]//*[contains(text(),'User Access List')]//parent::div//input[contains(@type,'checkbox') and contains(@class,'recipient')])[4]";
	private static final String lnk_ViewUserAccessList_ModalDialogWindow_DotsDots = "Dots Dots Link in View User Access List Modal Dialog Window#xpath=";
	private static final String btn_ViewUserAccessList_ModalDialogWindow_Update = "Update Button in View User Access List Modal Dialog Window#xpath=//div[contains(@id,'org-recipient-access-modal')]//div[contains(@class,'modal-content')]//*[contains(text(),'User Access List')]//parent::div//button[contains(text(),'Update')]";

	/*********************************Add Admin User in User Settings Page***********************/

	private static final String lbl_AddAdminUser_SettingsPage_ModalDialogWindow = "Add Admin User Modal Dialog Window#xpath=//div[contains(@id,'modal-add-admin-user') and contains(@class,'show')]";
	private static final String drp_AddAdminUserSettingsPage_ModalDialogWindow_Salutation = "Salutation dropdown in Add Admin User Modal Dialog Window#xpath=//div[contains(@id,'modal-add-admin-user') and contains(@class,'show')]//label[contains(text(),'Salutation')]//following-sibling::select";
	private static final String txt_AddAdminUserSettingsPage_ModalDialogWindow_FirstName = "First Name textbox in Add Admin User Modal Dialog Window#xpath=//div[contains(@id,'modal-add-admin-user') and contains(@class,'show')]//label[contains(text(),'First Name')]//following-sibling::input";
	private static final String txt_AddAdminUserSettingsPage_ModalDialogWindow_LastName = "Last Name textbox in Add Admin User Modal Dialog Window#xpath=//div[contains(@id,'modal-add-admin-user') and contains(@class,'show')]//label[contains(text(),'Last Name')]//following-sibling::input";
	private static final String txt_AddAdminUserSettingsPage_ModalDialogWindow_Email = "Email Textbox in Add Admin User Modal Dialog Window#xpath=//div[contains(@id,'modal-add-admin-user') and contains(@class,'show')]//label[contains(text(),'Email')]//following-sibling::input";
	private static final String txt_AddAdminUserSettingsPage_ModalDialogWindow_JobTitle = "Job Title textbox in Add Admin User Modal Dialog Window#xpath=//div[contains(@id,'modal-add-admin-user') and contains(@class,'show')]//label[contains(text(),'Job title')]//following-sibling::input";
	private static final String txt_AddAdminUserSettingsPage_ModalDialogWindow_Phone = "Phone textbox in Add Admin User Modal Dialog Window#xpath=//div[contains(@id,'modal-add-admin-user') and contains(@class,'show')]//label[contains(text(),'Phone')]//parent::div//div[contains(@class,'tel-input')]//input";
	private static final String txt_AddAdminUserSettingsPage_ModalDialogWindow_LinkedIn = "LinkedIn textbox in Add Admin User Modal Dialog Window#xpath=//div[contains(@id,'modal-add-admin-user') and contains(@class,'show')]//label[contains(text(),'LinkedIn')]//following-sibling::input";
	private static final String txt_AddAdminUserSettingsPage_ModalDialogWindow_AboutPerson = "About Person textbox in Add Admin User Modal Dialog Window#xpath=//div[contains(@id,'modal-add-admin-user') and contains(@class,'show')]//textarea[contains(@placeholder,'About this person')]";
	private static final String txt_AddAdminUserSettingsPage_ModalDialogWindow_Address = "Address textbox in Add Admin User Modal Dialog Window#xpath=//div[contains(@id,'modal-add-admin-user') and contains(@class,'show')]//input[contains(@placeholder,'Address')]";
	private static final String txt_AddAdminUserSettingsPage_ModalDialogWindow_Appartment = "Appartment textbox in Add Admin User Modal Dialog Window#xpath=//div[contains(@id,'modal-add-admin-user') and contains(@class,'show')]//input[contains(@placeholder,'Suite / Apartment')]";
	private static final String txt_AddAdminUserSettingsPage_ModalDialogWindow_City = "City textbox in Add Admin User Modal Dialog Window#xpath=//div[contains(@id,'modal-add-admin-user') and contains(@class,'show')]//input[contains(@placeholder,'City')]";
	private static final String txt_AddAdminUserSettingsPage_ModalDialogWindow_State = "State textbox in Add Admin User Modal Dialog Window#xpath=//div[contains(@id,'modal-add-admin-user') and contains(@class,'show')]//input[contains(@placeholder,'State')]";
	private static final String txt_AddAdminUserSettingsPage_ModalDialogWindow_PostalCode = "Postal Code textbox in Add Admin User Modal Dialog Window#xpath=//div[contains(@id,'modal-add-admin-user') and contains(@class,'show')]//input[contains(@placeholder,'Postal code')]";
	private static final String txt_AddAdminUserSettingsPage_ModalDialogWindow_Country = "Country textbox in Add Admin User Modal Dialog Window#xpath=//div[contains(@id,'modal-add-admin-user') and contains(@class,'show')]//input[contains(@placeholder,'Country')]";
	private static final String drp_AddAdminUserSettingsPage_ModalDialogWindow_AccountType = "Account Type dropdown in Add Admin User Modal Dialog Window#xpath=//div[contains(@id,'modal-add-admin-user') and contains(@class,'show')]//label[contains(text(),'Account Type')]//following-sibling::select";
	private static final String drp_AddAdminUserSettingsPage_ModalDialogWindow_Typeofbusiness = "Type of business dropdown in Add Admin User Modal Dialog Window#xpath=//div[contains(@id,'modal-add-admin-user') and contains(@class,'show')]//label[contains(text(),'Type of business')]//following-sibling::select";
	private static final String drp_AddAdminUserSettingsPage_ModalDialogWindow_ListingAddedBy = "Listing Added By dropdown in Add Admin User Modal Dialog Window#xpath=//div[contains(@id,'modal-add-admin-user') and contains(@class,'show')]//label[contains(text(),'Listing Added By')]//following-sibling::select";
	private static final String drp_AddAdminUserSettingsPage_ModalDialogWindow_SendInvite = "Send Invite dropdown in Add Admin User Modal Dialog Window#xpath=//div[contains(@id,'modal-add-admin-user') and contains(@class,'show')]//label[contains(text(),'Send Invite')]//following-sibling::select";
	private static final String drp_AddAdminUserSettingsPage_ModalDialogWindow_Industry = "Industry dropdown in Add Admin User Modal Dialog Window#xpath=(//div[contains(@id,'modal-add-admin-user') and contains(@class,'show')]//label[contains(text(),'Industry')]//following::div[contains(@class,'multiselect')]//div[contains(@class,'multiselect__select')])[1]";
	private static final String txt_AddAdminUserSettingsPage_ModalDialogWindow_Industry = "Industry textbox in Add Admin User Modal Dialog Window#xpath=//div[contains(@id,'modal-add-admin-user') and contains(@class,'show')]//label[contains(text(),'Industry')]//parent::div//following-sibling::input";
	private static final String btn_AddAdminUserSettingsPage_ModalDialogWindow_AddIndividual = "Add Individual button in Add Admin User Modal Dialog Window#xpath=//div[contains(@id,'modal-add-admin-user') and contains(@class,'show')]//button[contains(text(),'Add individual')]";
	private static final String btn_AddAdminUserSettingsPage_ModalDialogWindow_AddOrganization = "Add organization button in Add Admin User Modal Dialog Window#xpath=//div[contains(@id,'modal-add-admin-user') and contains(@class,'show')]//button[contains(text(),'Add organization')]";

	private static final String txt_AddNewUserSettingsPage_ModalDialogWindow_AddOrganization_Legalname = "Legal Name Textbox of Add Organization in Add New User Modal Window in User Settings Page#xpath=(//div[contains(@id,'modal-add-admin-org')]//div[contains(@class,'modal-dialog modal')])[1]//label[contains(text(),'Legal name')]/parent::div//input[contains(@name,'company')]";
	private static final String lst_AddNewUserSettingsPage_ModalDialogWindow_AddOrganization_AutoCompleteListLegalname = "Auto Complete list of Legal Name Textbox of Add Organization in Add New User Modal Window in User Settings Page#xpath=(//div[contains(@id,'modal-add-admin-org')]//div[contains(@class,'modal-dialog modal')])[1]//label[contains(text(),'Legal name')]/parent::div//input[contains(@name,'company')]//parent::div//div[contains(@class,'autcomplete-list')]";
	private static final String txt_AddNewUserSettingsPage_ModalDialogWindow_AddOrganization_Website = "Website Textbox of Add Organization in Add New User Modal Window in User Settings Page#xpath=(//div[contains(@id,'modal-add-admin-org')]//div[contains(@class,'modal-dialog modal')])[1]//label[contains(text(),'Website')]/parent::div//input";
	private static final String txt_AddNewUserSettingsPage_ModalDialogWindow_AddOrganization_PhoneNumber = "Phone Number Textbox of Add Organization in Add New User Modal Window in User Settings Page#xpath=(//div[contains(@id,'modal-add-admin-org')]//div[contains(@class,'modal-dialog modal')])[1]//label[contains(text(),'Phone')]/parent::div//input";
	private static final String txt_AddNewUserSettingsPage_ModalDialogWindow_AddOrganization_LinkedIn = "LinkedIn Textbox of Add Organization in Add New User Modal Window in User Settings Page#xpath=(//div[contains(@id,'modal-add-admin-org')]//div[contains(@class,'modal-dialog modal')])[1]//label[contains(text(),'LinkedIn')]/parent::div//input";
	private static final String txt_AddNewUserSettingsPage_ModalDialogWindow_AddOrganization_Description = "Description Textbox of Add Organization in Add New User Modal Window in User Settings Page#xpath=(//div[contains(@id,'modal-add-admin-org')]//div[contains(@class,'modal-dialog modal')])[1]//label[contains(text(),'Description')]/parent::div//textarea";
	private static final String drp_AddNewUserSettingsPage_ModalDialogWindow_AddOrganization_EmploymentStatus = "Employment Status Dropdown of Add Organization in Add New User Modal Window in User Settings Page#xpath=(//div[contains(@id,'modal-add-admin-org')]//div[contains(@class,'modal-dialog modal')])[1]//label[contains(text(),'Employment Status')]/parent::div//select";
	private static final String drp_AddNewUserSettingsPage_ModalDialogWindow_AddOrganization_AddCompanytoPortfolio = "Add Company to Portfolio Dropdown of Add Organization in Add New User Modal Window in User Settings Page#xpath=(//div[contains(@id,'modal-add-admin-org')]//div[contains(@class,'modal-dialog modal')])[1]//label[contains(text(),'Add Company to Portfolio')]/parent::div//select";
	private static final String lnk_AddNewUserSettingsPage_ModalDialogWindow_AddOrganization_Clear_AddOrganization = "Clear Link of Add Organization in Add New User Modal Window in User Settings Page#xpath=(//div[contains(@id,'modal-add-admin-org')]//div[contains(@class,'modal-dialog modal')])[1]//a[contains(text(),'Clear')]";	
	private static final String btn_AddNewUserSettingsPage_ModalDialogWindow_AddOrganization_Back_AddOrganization = "Back Button of Add Organization in Add New User Modal Window in User Settings Page#xpath=(//div[contains(@id,'modal-add-admin-org')]//div[contains(@class,'modal-dialog modal')])[1]//button[contains(text(),'Back')]";
	private static final String btn_AddNewUserSettingsPage_ModalDialogWindow_AddOrganization_AddNewListing = "Add New Listing Button of Add Organization in Add New User Modal Window in User Settings Page#xpath=(//div[contains(@id,'modal-add-admin-org')]//div[contains(@class,'modal-dialog modal')])[1]//button[contains(text(),'Add New Listing')]";


	/*********************************Add Admin User in User Settings Page***********************/
	private static final String lbl_CompanyProfilePage_Profile_MainPage_ScreenshotManager_Dialogwindow = "Screenshot Manager Dialog window of Company Profile Main Page#xpath=//div[contains(@class,'screenshot-manager')]";
	private static final String lnk_CompanyProfilePage_Profile_MainPage_ScreenshotManager_Dialogwindow_Close = "Screenshot Manager Dialog window Close Link of Company Profile Main Page#xpath=//div[contains(@class,'screenshot-manager')]//a[contains(@class,'close')]";
	private static final String txt_CompanyProfilePage_Profile_MainPage_ScreenshotManager_Dialogwindow_FileName = "File Name textbox in Screenshot Manager Dialog window of Company Profile Main Page#xpath=//div[contains(@class,'screenshot-manager')]//input[contains(@placeholder,'Enter alt text')]";
	private static final String txt_CompanyProfilePage_Profile_MainPage_ScreenshotManager_Dialogwindow_FileUpload = "File Upload textbox in Screenshot Manager Dialog window of Company Profile Main Page#xpath=//div[contains(@class,'screenshot-manager')]//input[contains(@type,'file')]";
	private static final String chk_CompanyProfilePage_Profile_MainPage_ScreenshotManager_Dialogwindow_GrabScreenshotofWebsite = "Grab screenhot of website checkbox in Screenshot Manager Dialog window of Company Profile Main Page#xpath=//div[contains(@class,'screenshot-manager')]//input[contains(@type,'checkbox')]";
	private static final String btn_CompanyProfilePage_Profile_MainPage_ScreenshotManager_Dialogwindow_UploadScreenshot_Upload = "Upload button in upload screenhot of Screenshot Manager Dialog window of Company Profile Main Page#xpath=(//div[contains(@class,'screenshot-manager')]//a[contains(text(),'Upload')])[1]";
	private static final String btn_CompanyProfilePage_Profile_MainPage_ScreenshotManager_Dialogwindow_PasteScreenshot_Upload = "Paste button in upload screenhot of Screenshot Manager Dialog window of Company Profile Main Page#xpath=(//div[contains(@class,'screenshot-manager')]//a[contains(text(),'Upload')])[2]";

	private static final String lnk_MergeCompany_ModalDialogWindow_Close = "Close Link in Merge Company Modal Dialog Window#xpath=//div[contains(@class,'modal-content')]//*[contains(text(),'Merge Company')]//parent::div//parent::div//a[contains(@class,'close')]";
	private static final String txt_MergeCompany_ModalDialogWindow_OrganizationName = "Organization Name Textbox in Merge Company Modal Dialog Window#xpath=//div[contains(@class,'modal-content')]//*[contains(text(),'Merge Company')]//parent::div//input[contains(@type,'search')]";
	private static final String lst_MergeCompany_ModalDialogWindow_OrganizationName_List = "Organization Name List in Organization Name Textbox in Merge Company Modal Dialog Window#xpath=//div[contains(@class,'modal-content')]//*[contains(text(),'Merge Company')]//parent::div//input[contains(@type,'search')]//parent::div//following-sibling::div[contains(@class,'list')]";
	private static final String btn_MergeCompany_ModalDialogWindow_Submit = "Submit Button in Merge Company Modal Dialog Window#xpath=//div[contains(@class,'modal-content')]//*[contains(text(),'Merge Company')]//parent::div//a[contains(text(),'Submit')]";

	/*********************************Add Admin Staff in User Settings Page***********************/
	private static final String lst_AutoCompleteList_Country_AddAdminUserSettingsPage_ModalDialogWindow = "Country autocomplete list in Add New User Modal Window in User settings page#xpath=//div[contains(@id,'modal-add-admin-user') and contains(@class,'show')]//input[contains(@placeholder,'Country')]//parent::div//div[contains(@class,'autcomplete-list')]";
	private static final String lbl_AddAdminStaff_SettingsPage_ModalDialogWindow = "Add Admin Staff Modal Dialog Window#xpath=//div[contains(@id,'modal-add-admin-staff') and contains(@class,'show')]";
	private static final String drp_AddAdminStaff_SettingsPage_ModalDialogWindow_Salutation = "Salutation dropdown in Add Admin Staff Modal Dialog Window#xpath=//div[contains(@id,'modal-add-admin-staff') and contains(@class,'show')]//label[contains(text(),'Salutation')]//following-sibling::select";
	private static final String txt_AddAdminStaff_SettingsPage_ModalDialogWindow_FirstName = "First Name textbox in Add Admin Staff Modal Dialog Window#xpath=//div[contains(@id,'modal-add-admin-staff') and contains(@class,'show')]//label[contains(text(),'First Name')]//following-sibling::input";
	private static final String txt_AddAdminStaff_SettingsPage_ModalDialogWindowLastName = "Last Name textbox in Add Admin Staff Modal Dialog Window#xpath=//div[contains(@id,'modal-add-admin-staff') and contains(@class,'show')]//label[contains(text(),'Last Name')]//following-sibling::input";
	private static final String txt_AddAdminStaff_SettingsPage_ModalDialogWindow_Email = "Email textbox in Add Admin Staff Modal Dialog Window#xpath=//div[contains(@id,'modal-add-admin-staff') and contains(@class,'show')]//label[contains(text(),'Email')]//following-sibling::input";
	private static final String txt_AddAdminStaff_SettingsPage_ModalDialogWindow_JobTitle = "Job Title textbox in Add Admin Staff Modal Dialog Window#xpath=//div[contains(@id,'modal-add-admin-staff') and contains(@class,'show')]//label[contains(text(),'Job title')]//following-sibling::input";
	private static final String txt_AddAdminStaff_SettingsPage_ModalDialogWindow_Phone = "Phone textbox in Add Admin Staff Modal Dialog Window#xpath=//div[contains(@id,'modal-add-admin-staff') and contains(@class,'show')]//label[contains(text(),'Phone')]//parent::div//div[contains(@class,'tel-input')]//input";
	private static final String drp_AddAdminStaff_SettingsPage_ModalDialogWindow_SystemAccess = "System Access dropdown in Add Admin Staff Modal Dialog Window#xpath=//div[contains(@id,'modal-add-admin-staff') and contains(@class,'show')]//label[contains(text(),'System Access')]//following-sibling::select";
	private static final String drp_AddAdminStaff_SettingsPage_ModalDialogWindow_InvestmentCommitteeMember = "Investment Committee Member dropdown in Add Admin Staff Modal Dialog Window#xpath=//div[contains(@id,'modal-add-admin-staff') and contains(@class,'show')]//label[contains(text(),'Investment Committee Member')]//following-sibling::select";
	private static final String drp_AddAdminStaff_SettingsPage_ModalDialogWindow_Mentor = "Mentor dropdown in Add Admin Staff Modal Dialog Window#xpath=//div[contains(@id,'modal-add-admin-staff') and contains(@class,'show')]//label[contains(text(),'Mentor')]//following-sibling::select";
	private static final String chk_AddAdminStaff_SettingsPage_ModalDialogWindow_SendInvite = "Send Invite Checkbox in Add Admin Staff Modal Dialog Window#xpath=//div[contains(@id,'modal-add-admin-staff') and contains(@class,'show')]//label[contains(text(),'Send Invite')]//input[contains(@type,'checkbox')]";
	private static final String btm_AddAdminStaff_SettingsPage_ModalDialogWindow_AddTeamMember = "Add Team Member button in Add Admin Staff Modal Dialog Window#xpath=//div[contains(@id,'modal-add-admin-staff') and contains(@class,'show')]//button[contains(text(),'Add Team Member')]";
	private static final String lbl_AddAdminStaff_SettingsPage_ModalDialogWindow_StaffAddedSuccessMessage = "Staff Added success message in Add Admin Staff Modal Dialog Window#xpath=//div[contains(@class,'popup') and contains(@class,'success') and contains(@class,'show')]//div[contains(text(),'Staff Added Successfully')]";
	private static final String btm_AddAdminStaff_SettingsPage_ModalDialogWindow_StaffAddedSuccessMessage_Ok = "Ok Button of Staff Added success message in Add Admin Staff Modal Dialog Window#xpath=//div[contains(@class,'popup') and contains(@class,'success') and contains(@class,'show')]//button[contains(text(),'Ok')]";


	/*********************************Add Admin Staff in User Settings Page***********************/
	private static final String lnk_CustomizeProfile_ModalDialogWindow_Close = "Close Link in Customize Profile Modal Dialog Window#xpath=//div[contains(@class,'modal-content')]//*[contains(text(),'Customize Profile')]//parent::div//a[contains(@class,'close')]";
	private static final String txt_CustomizeProfile_ModalDialogWindow_PrimaryBrandcolor = "Primary Brand Color Textbox in Customize Profile Modal Dialog Window#xpath=//div[contains(@class,'modal-content')]//*[contains(text(),'Customize Profile')]//parent::div//input[contains(@name,'color_primary')]";
	private static final String txt_CustomizeProfile_ModalDialogWindow_SecondaryBrandcolor = "Secondary Brand Color Textbox in Customize Profile Modal Dialog Window#xpath=//div[contains(@class,'modal-content')]//*[contains(text(),'Customize Profile')]//parent::div//input[contains(@name,'color_info')]";
	private static final String txt_CustomizeProfile_ModalDialogWindow_SuccessBrandcolor = "Sucess Color Textbox in Customize Profile Modal Dialog Window#xpath=//div[contains(@class,'modal-content')]//*[contains(text(),'Customize Profile')]//parent::div//input[contains(@name,'color_success')]";
	private static final String txt_CustomizeProfile_ModalDialogWindow_DangerBrandcolor = "Danger Color Textbox in Customize Profile Modal Dialog Window#xpath=//div[contains(@class,'modal-content')]//*[contains(text(),'Customize Profile')]//parent::div//input[contains(@name,'color_danger')]";
	private static final String btn_CustomizeProfile_ModalDialogWindow_Upload = "Upload Button in Customize Profile Modal Dialog Window#xpath=//div[contains(@class,'modal-content')]//*[contains(text(),'Customize Profile')]//parent::div//button[contains(text(),'Upload')]";
	private static final String lbl_AddCaptcha_SettingsPage_ModalDialogWindow = "Add Captcha Modal Dialog Window#xpath=//div[contains(@class,'modal-dialog modal')]//*[contains(@id,'myModalLabel') and contains(text(),'Settings > CAPTCHA')]";
	private static final String txt_IPAddress_AddCaptcha_SettingsPage_ModalDialogWindow = "IP Address Textbox in Add Captcha Modal Dialog Window#xpath=//div[contains(@class,'modal-dialog modal')]//*[contains(@id,'myModalLabel') and contains(text(),'Settings > CAPTCHA')]/parent::div//input[contains(@name,'ip_address')]";
	private static final String btn_Submit_AddCaptcha_SettingsPage_ModalDialogWindow = "Submit Button in Add Captcha Modal Dialog Window#xpath=//div[contains(@class,'modal-dialog modal')]//*[contains(@id,'myModalLabel') and contains(text(),'Settings > CAPTCHA')]/parent::div//button[contains(text(),'Submit')]";
	
	public PopupDialogWindows(BaseClass obj) 
	{
		super(obj);
	}

	/**
	*@author VijayaKumar.U
	*This method is to verify the display of add new contact element in the dialog window
	*/
	public void verify_CreateContact_ModalDialog_Window_displayed(){
		try 	{
			waitForElementToDisplay(lbl_AddNewContact_ModalDialogWindow_Heading, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_AddNewContact_ModalDialogWindow_Heading))
			{
				testStepPassed("Create Contact Modal Dialog Window is displayed");	
			}
		} 
		catch (Exception e) {
			testStepFailed("Create Contact Modal Dialog Window is not displayed");
		}
	}
	/**
	*@author VijayaKumar.U
	*@param verify display of the place holder elements in the create contact
		*/
	public void verify_CreateContact_elements_placeholderText_displayed()	{
		try {
			waitForElementToDisplay(txt_FirstName_AddNewContact_ModalDialogWindow, this.elementLoadWaitTime);
			String firstNamePlaceholdertext = driver.findElement(By.xpath("//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//label[contains(text(),'First Name')]/parent::div//input")).getAttribute("placeholder"); 
			if (firstNamePlaceholdertext.equalsIgnoreCase("First Name")) 			{
				testStepPassed("First Name place holder text is displayed in Add Contact Dialog Window");
			}		} 
		catch (Exception e) 		{
			testStepFailed("First Name place holder text is not displayed in Add Contact Dialog Window");
		}

		try 		{
			waitForElementToDisplay(txt_LastName_AddNewContact_ModalDialogWindow, this.elementLoadWaitTime);
			String firstNamePlaceholdertext = driver.findElement(By.xpath("//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//label[contains(text(),'Last Name')]/parent::div//input")).getAttribute("placeholder"); 
			if (firstNamePlaceholdertext.equalsIgnoreCase("Last Name")) 			{
				testStepPassed("Last Name place holder text is displayed in Add Contact Dialog Window");
			}		} 
		catch (Exception e) 		{
			testStepFailed("Last Name place holder text is not displayed in Add Contact Dialog Window");
		}
		try 	{
			waitForElementToDisplay(txt_Email_AddNewContact_ModalDialogWindow, this.elementLoadWaitTime);
			String firstNamePlaceholdertext = driver.findElement(By.xpath("//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//label[contains(text(),'Email')]/parent::div//input")).getAttribute("placeholder"); 
			if (firstNamePlaceholdertext.equalsIgnoreCase("Email")) 
			{
				testStepPassed("Email Address place holder text is displayed in Add Contact Dialog Window");
			}
		} 
		catch (Exception e) 		{
			testStepFailed("Email Address place holder text is not displayed in Add Contact Dialog Window");
		}

		try 		{
			waitForElementToDisplay(txt_JobTitleAddNewContact_ModalDialogWindow, this.elementLoadWaitTime);
			String firstNamePlaceholdertext = driver.findElement(By.xpath("//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//label[contains(text(),'Job title')]/parent::div//input")).getAttribute("placeholder"); 
			if (firstNamePlaceholdertext.equalsIgnoreCase("Job title")) 			{
				testStepPassed("Job Title place holder text is displayed in Add Contact Dialog Window");
			}		} 
		catch (Exception e) 		{
			testStepFailed("Job Title place holder text is not displayed in Add Contact Dialog Window");
		}

		try 		{
			waitForElementToDisplay(txt_Phone_AddNewContact_ModalDialogWindow, this.elementLoadWaitTime);
			String firstNamePlaceholdertext = driver.findElement(By.xpath("//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//label[contains(text(),'Phone')]/parent::div//input")).getAttribute("placeholder"); 
			if (firstNamePlaceholdertext.equalsIgnoreCase("Enter mobile no.")) 
			{
				testStepPassed("Phone place holder text is displayed in Add Contact Dialog Window");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Phone place holder text is not displayed in Add Contact Dialog Window");
		}

		try 
		{
			waitForElementToDisplay(txt_LinkedIn_AddNewContact_ModalDialogWindow, this.elementLoadWaitTime);
			String firstNamePlaceholdertext = driver.findElement(By.xpath("//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//label[contains(text(),'LinkedIn')]/parent::div//input")).getAttribute("placeholder"); 
			if (firstNamePlaceholdertext.equalsIgnoreCase("LinkedIn (Complete URL)")) 
			{
				testStepPassed("LinkedIn place holder text is displayed in Add Contact Dialog Window");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("LinkedIn place holder text is not displayed in Add Contact Dialog Window");
		}

		try 
		{
			waitForElementToDisplay(txt_AboutPerson_AddNewContact_ModalDialogWindow, this.elementLoadWaitTime);
			String firstNamePlaceholdertext = driver.findElement(By.xpath("//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//textarea[contains(@name,'bio')]")).getAttribute("placeholder"); 
			if (firstNamePlaceholdertext.equalsIgnoreCase("About this person...")) 
			{
				testStepPassed("About this person place holder text is displayed in Add Contact Dialog Window");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("About this person place holder text is not displayed in Add Contact Dialog Window");
		}

		try 
		{
			waitForElementToDisplay(txt_Address_AddNewContact_ModalDialogWindow, this.elementLoadWaitTime);
			String firstNamePlaceholdertext = driver.findElement(By.xpath("//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//input[contains(@placeholder,'Address')]")).getAttribute("placeholder"); 
			if (firstNamePlaceholdertext.equalsIgnoreCase("Address")) 
			{
				testStepPassed("Address place holder text is displayed in Add Contact Dialog Window");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Address place holder text is not displayed in Add Contact Dialog Window");
		}

		try 
		{
			waitForElementToDisplay(txt_Apartment_AddNewContact_ModalDialogWindow, this.elementLoadWaitTime);
			String firstNamePlaceholdertext = driver.findElement(By.xpath("//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//input[contains(@placeholder,'Apartment')]")).getAttribute("placeholder"); 
			if (firstNamePlaceholdertext.equalsIgnoreCase("Suite / Apartment")) 
			{
				testStepPassed("Suite / Apartment place holder text is displayed in Add Contact Dialog Window");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Suite / Apartment place holder text is not displayed in Add Contact Dialog Window");
		}

		try 
		{
			waitForElementToDisplay(txt_City_AddNewContact_ModalDialogWindow, this.elementLoadWaitTime);
			String firstNamePlaceholdertext = driver.findElement(By.xpath("//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//input[contains(@placeholder,'City')]")).getAttribute("placeholder"); 
			if (firstNamePlaceholdertext.equalsIgnoreCase("City")) 
			{
				testStepPassed("City place holder text is displayed in Add Contact Dialog Window");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("City place holder text is not displayed in Add Contact Dialog Window");
		}

		try 
		{
			waitForElementToDisplay(txt_State_AddNewContact_ModalDialogWindow, this.elementLoadWaitTime);
			String firstNamePlaceholdertext = driver.findElement(By.xpath("//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//input[contains(@placeholder,'State')]")).getAttribute("placeholder"); 
			if (firstNamePlaceholdertext.equalsIgnoreCase("State")) 
			{
				testStepPassed("State place holder text is displayed in Add Contact Dialog Window");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("State place holder text is not displayed in Add Contact Dialog Window");
		}

		try 
		{
			waitForElementToDisplay(txt_PostalCode_AddNewContact_ModalDialogWindow, this.elementLoadWaitTime);
			String firstNamePlaceholdertext = driver.findElement(By.xpath("//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//input[contains(@placeholder,'Postal code')]")).getAttribute("placeholder"); 
			if (firstNamePlaceholdertext.equalsIgnoreCase("Postal code")) 
			{
				testStepPassed("Postal code place holder text is displayed in Add Contact Dialog Window");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Postal code place holder text is not displayed in Add Contact Dialog Window");
		}

		try 
		{
			waitForElementToDisplay(txt_Country_AddNewContact_ModalDialogWindow, this.elementLoadWaitTime);
			String firstNamePlaceholdertext = driver.findElement(By.xpath("//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//input[contains(@placeholder,'Country')]")).getAttribute("placeholder"); 
			if (firstNamePlaceholdertext.equalsIgnoreCase("Country")) 
			{
				testStepPassed("Country place holder text is displayed in Add Contact Dialog Window");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Country place holder text is not displayed in Add Contact Dialog Window");
		}

		try 
		{
			waitForElementToDisplay(txt_Industry_AddNewContact_ModalDialogWindow, this.elementLoadWaitTime);
			String firstNamePlaceholdertext = driver.findElement(By.xpath("//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//label[contains(text(),'Industry')]//parent::div//input")).getAttribute("placeholder"); 
			if (firstNamePlaceholdertext.equalsIgnoreCase("Search")) 
			{
				testStepPassed("Search Industry place holder text is displayed in Add Contact Dialog Window");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Search Industry place holder text is not displayed in Add Contact Dialog Window");
		}
	}
	/**
	*@author VijayaKumar.U
	*This method is used to verify the mandatorysymbols displayed
	*
	*/
	public void verify_CreateContact_elements_MandatorySymbol_displayed()
	{
		try 
		{
			waitForElementToDisplay(lbl_Salutation_MadatorySysmbol_AddNewContact_ModalDialogWindow, this.elementLoadWaitTime);
			if (isElementDisplayed(lbl_Salutation_MadatorySysmbol_AddNewContact_ModalDialogWindow)) 
			{
				testStepPassed("Salutation Mandatory Symbol is displayed in Add Contact Dialog Window");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Salutation Mandatory Symbol is not displayed in Add Contact Dialog Window");
		}

		try 
		{
			waitForElementToDisplay(lbl_FirstName_MadatorySysmbol_AddNewContact_ModalDialogWindow, this.elementLoadWaitTime);
			if (isElementDisplayed(lbl_FirstName_MadatorySysmbol_AddNewContact_ModalDialogWindow)) 
			{
				testStepPassed("First Name Mandatory Symbol is displayed in Add Contact Dialog Window");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("First Name Mandatory Symbol is not displayed in Add Contact Dialog Window");
		}

		try 
		{
			waitForElementToDisplay(lbl_LastName_MadatorySysmbol_AddNewContact_ModalDialogWindow, this.elementLoadWaitTime);
			if (isElementDisplayed(lbl_LastName_MadatorySysmbol_AddNewContact_ModalDialogWindow)) 
			{
				testStepPassed("Last Name Mandatory Symbol is displayed in Add Contact Dialog Window");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Last Name Mandatory Symbol is not displayed in Add Contact Dialog Window");
		}

		try 
		{
			waitForElementToDisplay(lbl_Email_MadatorySysmbol_AddNewContact_ModalDialogWindow, this.elementLoadWaitTime);
			if (isElementDisplayed(lbl_Email_MadatorySysmbol_AddNewContact_ModalDialogWindow)) 
			{
				testStepPassed("Email Mandatory Symbol is displayed in Add Contact Dialog Window");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Email Mandatory Symbol is not displayed in Add Contact Dialog Window");
		}

		try 
		{
			waitForElementToDisplay(lbl_Country_MadatorySysmbol_AddNewContact_ModalDialogWindow, this.elementLoadWaitTime);
			if (isElementDisplayed(lbl_Country_MadatorySysmbol_AddNewContact_ModalDialogWindow)) 
			{
				testStepPassed("Country Mandatory Symbol is displayed in Add Contact Dialog Window");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Country Mandatory Symbol is not displayed in Add Contact Dialog Window");
		}
	}

	/**
	*@author VijayaKumar.U
	*
	* this method is used to verify the elements of add organiztion page
	*
	*/
	public void verify_AddOrganization_CreateContact_elements_placeholderText_displayed()
	{
		try 
		{
			waitForElementToDisplay(txt_Legalname_AddOrganization_AddNewContact, this.elementLoadWaitTime);
			String firstNamePlaceholdertext = driver.findElement(By.xpath("//div[contains(@id,'modal-add-admin-org')]//div[contains(@class,'modal-dialog modal')]//label[contains(text(),'Company Name')]/parent::div//input[contains(@name,'company')]")).getAttribute("placeholder"); 
			if (firstNamePlaceholdertext.equalsIgnoreCase("Type company name to search")) 
			{
				testStepPassed("Legal Name place holder text is displayed in Add Organozation Page of Add Contact Dialog Window");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Legal Name place holder text is not displayed in Add Organozation Page of Add Contact Dialog Window");
		}

		try 
		{
			waitForElementToDisplay(txt_Website_AddOrganization_AddNewContact, this.elementLoadWaitTime);
			String firstNamePlaceholdertext = driver.findElement(By.xpath("//div[contains(@id,'modal-add-admin-org')]//div[contains(@class,'modal-dialog modal')]//label[contains(text(),'Website')]/parent::div//input")).getAttribute("placeholder"); 
			if (firstNamePlaceholdertext.equalsIgnoreCase("Website")) 
			{
				testStepPassed("Website place holder text is displayed in Add Organozation Page of Add Contact Dialog Window");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Website place holder text is not displayed in Add Organozation Page of Add Contact Dialog Window");
		}

		try 
		{
			waitForElementToDisplay(txt_PhoneNumber_AddOrganization_AddNewContact, this.elementLoadWaitTime);
			String firstNamePlaceholdertext = driver.findElement(By.xpath("//div[contains(@id,'modal-add-admin-org')]//div[contains(@class,'modal-dialog modal')]//label[contains(text(),'Phone')]/parent::div//input")).getAttribute("placeholder"); 
			if (firstNamePlaceholdertext.equalsIgnoreCase("Enter mobile no.")) 
			{
				testStepPassed("Phone Number place holder text is displayed in Add Organozation Page of Add Contact Dialog Window");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Phone Number place holder text is dnot isplayed in Add Organozation Page of Add Contact Dialog Window");
		}

		try 
		{
			waitForElementToDisplay(txt_LinkedIn_AddOrganization_AddNewContact, this.elementLoadWaitTime);
			String firstNamePlaceholdertext = driver.findElement(By.xpath("//div[contains(@id,'modal-add-admin-org')]//div[contains(@class,'modal-dialog modal')]//label[contains(text(),'LinkedIn')]/parent::div//input")).getAttribute("placeholder"); 
			if (firstNamePlaceholdertext.equalsIgnoreCase("LinkedIn (Complete URL)")) 
			{
				testStepPassed("LinkedIn place holder text is displayed in Add Organozation Page of Add Contact Dialog Window");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("LinkedIn place holder text is not displayed in Add Contact Dialog Window");
		}

		try 
		{
			waitForElementToDisplay(txt_Description_AddOrganization_AddNewContact, this.elementLoadWaitTime);
			String firstNamePlaceholdertext = driver.findElement(By.xpath("//div[contains(@id,'modal-add-admin-org')]//div[contains(@class,'modal-dialog modal')]//label[contains(text(),'Description')]/parent::div//textarea")).getAttribute("placeholder"); 
			if (firstNamePlaceholdertext.equalsIgnoreCase("Description")) 
			{
				testStepPassed("Description place holder text is displayed in Add Organozation Page of Add Contact Dialog Window");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Description place holder text is not displayed in Add Organozation Page of Add Contact Dialog Window");
		}
	}
	/**
	*This method is used to verify the display of elements of add organisation window
	*
	*@author VijayaKumar.U
	*/
	public void verify_AddOrganization_CreateContact_elements_MandatorySymbol_displayed()
	{
		try 
		{
			waitForElementToDisplay(lbl_LegalName_MadatorySysmbol_AddOrganization_AddNewContact_ModalDialogWindow, this.elementLoadWaitTime);
			if (isElementDisplayed(lbl_LegalName_MadatorySysmbol_AddOrganization_AddNewContact_ModalDialogWindow))
			{
				testStepPassed("Legal Name Mandatory Symbol is displayed in Add Organization of Add Contact Dialog Window");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Legal Name Mandatory Symbol is not displayed in Add Organization of Add Contact Dialog Window");
		}

		try 
		{
			waitForElementToDisplay(lbl_Website_MadatorySysmbol_AddOrganization_AddNewContact_ModalDialogWindow, this.elementLoadWaitTime);
			if (isElementDisplayed(lbl_Website_MadatorySysmbol_AddOrganization_AddNewContact_ModalDialogWindow))
			{
				testStepPassed("Website Mandatory Symbol is displayed in Add Organization of Add Contact Dialog Window");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Website Mandatory Symbol is not displayed in Add Organization of Add Contact Dialog Window");
		}
	}
	/**
	*@author VijayaKumar.U
	*
	*This method is used to get the saltuation value
	*/
	public String get_CreateContact_Salutation_Value()
	{
		String text =getText(drp_Salutation_AddNewContact_ModalDialogWindow);
		 
		return text;
	}
	/**
	*@author VijayaKumar.U
	*
	*This method is used to close the dialog window of create contact
	*
	*/
	public void click_Close_CreateContact_ModalDialog_Window()
	{
		waitForElementToDisplay(lnk_AddNewContact_ModalDialogWindow_Close, this.elementLoadWaitTime);
		clickOn(lnk_AddNewContact_ModalDialogWindow_Close);
	}
	/**
	*@author VijayaKumar.U
	*
	*This method enables the user to close the add organisation dialog window
	*
	*/
	public void click_Close_AddOrganization_CreateContact_ModalDialog_Window()
	{
		waitForElementToDisplay(lnk_AddNewContact_AddOrganization_ModalDialogWindow_Close, this.elementLoadWaitTime);
		clickOn(lnk_AddNewContact_AddOrganization_ModalDialogWindow_Close);
	}

	/**
	*@author VijayaKumar.U
	*
	*This method is used to select the salutation from the dialog window
	*
	*@param salutation
	*/
	public void select_Salutation_CreateContact_ModalDialog_Window(String salutation)
	{
		waitForElementToDisplay(drp_Salutation_AddNewContact_ModalDialogWindow, this.elementLoadWaitTime);
		selectFromDropdown(drp_Salutation_AddNewContact_ModalDialogWindow, salutation);
	}
	/**
	*@author VijayaKumar.U
	*
	*This method is used to enter the first name in contact dialog window
	*
	*@param first name
	*
	*/
	public void enter_FirstName_CreateContact_ModalDialog_Window(String firstName)
	{
		waitForElementToDisplay(txt_FirstName_AddNewContact_ModalDialogWindow, this.elementLoadWaitTime);
		clearEditBox(txt_FirstName_AddNewContact_ModalDialogWindow);
		typeIn(txt_FirstName_AddNewContact_ModalDialogWindow, firstName);
	}
	/**
	*@author VijayaKumar.U
	*
	*This method is used to enter the last name in the contact dialog window
	*
	*@param lastname
	*
	*/
	public void enter_LastName_CreateContact_ModalDialog_Window(String lastName)
	{
		waitForElementToDisplay(txt_LastName_AddNewContact_ModalDialogWindow, this.elementLoadWaitTime);
		clearEditBox(txt_LastName_AddNewContact_ModalDialogWindow);
		typeIn(txt_LastName_AddNewContact_ModalDialogWindow, lastName);
	}
	/**
	*@author VijayaKumar.U
	*
	*This method is used to enter the email in the contact window
	*
	*@param email
	*
	*/
	public void enter_Email_CreateContact_ModalDialog_Window(String email)
	{
		waitForElementToDisplay(txt_Email_AddNewContact_ModalDialogWindow, this.elementLoadWaitTime);
		clearEditBox(txt_Email_AddNewContact_ModalDialogWindow);
		typeIn(txt_Email_AddNewContact_ModalDialogWindow, email);
	}
	/**
	*@author VijayaKumar.U
	*
	*This method is used to enter the job title.
	*
	*@param job title
	*
	*/
	public void enter_JobTitle_CreateContact_ModalDialog_Window(String Jobtitle)
	{
		waitForElementToDisplay(txt_JobTitleAddNewContact_ModalDialogWindow, this.elementLoadWaitTime);
		clearEditBox(txt_JobTitleAddNewContact_ModalDialogWindow);
		typeIn(txt_JobTitleAddNewContact_ModalDialogWindow, Jobtitle);
	}
	/**
	*@author VijayaKumar.U
	*
	*This method is used to enter phone no
	*
	*@param phoneno
	*
	*/
	public void enter_PhoneNo_CreateContact_ModalDialog_Window(String phoneNo)
	{
		waitForElementToDisplay(txt_Phone_AddNewContact_ModalDialogWindow, this.elementLoadWaitTime);
		clearEditBox(txt_Phone_AddNewContact_ModalDialogWindow);
		typeIn(txt_Phone_AddNewContact_ModalDialogWindow, phoneNo);
	}
	/**
	*@author VijayaKumar.U
	*
	*This method is used to enter the LinkedIn details
	*
	*@param linkedIn
	*
	*/
	public void enter_LinkedIn_CreateContact_ModalDialog_Window(String linnkedIn)
	{
		waitForElementToDisplay(txt_LinkedIn_AddNewContact_ModalDialogWindow, this.elementLoadWaitTime);
		clearEditBox(txt_LinkedIn_AddNewContact_ModalDialogWindow);
		typeIn(txt_LinkedIn_AddNewContact_ModalDialogWindow, linnkedIn);
	}
	/**
	*@author VijayaKumar.U
	*
	*This method is used to enter the About person 
	*
	*@param aboutPerson
	*
	*/
	public void enter_AboutPerson_CreateContact_ModalDialog_Window(String aboutPerson)
	{
		waitForElementToDisplay(txt_AboutPerson_AddNewContact_ModalDialogWindow, this.elementLoadWaitTime);
		clearEditBox(txt_AboutPerson_AddNewContact_ModalDialogWindow);
		typeIn(txt_AboutPerson_AddNewContact_ModalDialogWindow, aboutPerson);
	}
	/**
	*@author VijayaKumar.U
	*
	*This method is used to enter the address in the dialog box
	*
	*@param address
	*
	*/
	public void enter_Address_CreateContact_ModalDialog_Window(String address)
	{
		waitForElementToDisplay(txt_Address_AddNewContact_ModalDialogWindow, this.elementLoadWaitTime);
		clearEditBox(txt_Address_AddNewContact_ModalDialogWindow);
		typeIn(txt_Address_AddNewContact_ModalDialogWindow, address);
	}
	/**
	*@author VijayaKumar.U
	*
	*This method is used to enter the apartment in the dialog window
	*
	*@param apratment
	*
	*/
	public void enter_Apartment_CreateContact_ModalDialog_Window(String apartment)
	{
		waitForElementToDisplay(txt_Apartment_AddNewContact_ModalDialogWindow, this.elementLoadWaitTime);
		clearEditBox(txt_Apartment_AddNewContact_ModalDialogWindow);
		typeIn(txt_Apartment_AddNewContact_ModalDialogWindow, apartment);
	}
	/**
	*@author VijayaKumar.U
	*This method is used to enter the city details in create contact dialog window.
	*@param city
	*
	*/
	public void enter_City_CreateContact_ModalDialog_Window(String city)
	{
		waitForElementToDisplay(txt_City_AddNewContact_ModalDialogWindow, this.elementLoadWaitTime);
		clearEditBox(txt_City_AddNewContact_ModalDialogWindow);
		typeIn(txt_City_AddNewContact_ModalDialogWindow, city);
	}
	/**
	*@author VijayaKumar.U
	*
	*This method is used to enter the state details in Create contact dialog box
	*
	*@param state
	*
	*/
	public void enter_State_CreateContact_ModalDialog_Window(String state)
	{
		waitForElementToDisplay(txt_State_AddNewContact_ModalDialogWindow, this.elementLoadWaitTime);
		clearEditBox(txt_State_AddNewContact_ModalDialogWindow);
		typeIn(txt_State_AddNewContact_ModalDialogWindow, state);
	}
	/**
	*@author VijayaKumar.U
	*
	*This method is used to enter the Postal code in create contact dialog window
	*
	*@param postalCode
	*
	*/
	public void enter_PostalCode_CreateContact_ModalDialog_Window(String postalCode)
	{
		waitForElementToDisplay(txt_PostalCode_AddNewContact_ModalDialogWindow, this.elementLoadWaitTime);
		clearEditBox(txt_PostalCode_AddNewContact_ModalDialogWindow);
		typeIn(txt_PostalCode_AddNewContact_ModalDialogWindow, postalCode);
	}
	/**
	*@author VijayaKumar.U
	*
	*The method is used to select the country in the Contact dialog window.
	*
	*@param country
	*/
	public void select_Country_CreateContact_ModalDialog_Window(String country)
	{
		waitForElementToDisplay(txt_Country_AddNewContact_ModalDialogWindow, this.elementLoadWaitTime);
		clearEditBox(txt_Country_AddNewContact_ModalDialogWindow);
		typeIn(txt_Country_AddNewContact_ModalDialogWindow, country);
		waitForElementToDisplay(lst_AutoCompleteList_Country_AddNewContact_ModalDialogWindow, this.elementLoadWaitTime);
		driver.findElement(By.xpath("//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//input[contains(@placeholder,'Country')]//parent::div//div[contains(@class,'autcomplete-list')]//a[@title='"+country+"']")).click();
	}
	/**
	*@author VijayaKumar.U
	*
	*This method is used to select the Account type in the create contact dialog window
	*
	*@param accountType
	*/
	public void select_AccountType_CreateContact_ModalDialog_Window(String accountType)
	{
		waitForElementToDisplay(drp_AccountType_AddNewContact_ModalDialogWindow, this.elementLoadWaitTime);
		selectFromDropdown(drp_AccountType_AddNewContact_ModalDialogWindow, accountType);
	}
	/**
	*@author VijayaKumar.U
	*
	*This method is used to select the type of Business.
	*@param typeOfBusiness
	*/
	public void select_TypeOfBusiness_CreateContact_ModalDialog_Window(String typeOfBusiness)
	{
		waitForElementToDisplay(drp_TypeOfBusiness_AddNewContact_ModalDialogWindow, this.elementLoadWaitTime);
		selectFromDropdown(drp_TypeOfBusiness_AddNewContact_ModalDialogWindow, typeOfBusiness);
	}
	/**
	*@author VijayaKumar.U
	*
	*This method is used to select the listing Added
	*
	*@param listingAddedBy
	*/
	public void select_ListingAddedBy_CreateContact_ModalDialog_Window(String listingAddedBy)
	{
		waitForElementToDisplay(drp_ListingAddedBy_AddNewContact_ModalDialogWindow, this.elementLoadWaitTime);
		selectFromDropdown(drp_ListingAddedBy_AddNewContact_ModalDialogWindow, listingAddedBy);
	}
	/**
	*@author VijayaKumar.U
	*
	*This method is used to select send invite in the corresponding dialog window
	*
	*@param sendInvite
	*/
	public void select_SendInvite_CreateContact_ModalDialog_Window(String sendInvite)
	{
		waitForElementToDisplay(drp_SendInvite_AddNewContact_ModalDialogWindow, this.elementLoadWaitTime);
		selectFromDropdown(drp_SendInvite_AddNewContact_ModalDialogWindow, sendInvite);
	}
	/**
	*@author VijayaKumar.U
	*
	*This method is used to select industry in the corresponding dialog window
	*
	*@param sendInvite
	*/
	public void select_Industry_CreateContact_ModalDialog_Window(String industry)
	{
		waitForElementToDisplay(drp_Industry_AddNewContact_ModalDialogWindow, this.elementLoadWaitTime);
		clickOn(drp_Industry_AddNewContact_ModalDialogWindow);
		waitTime(1);
		clearEditBox(txt_Industry_AddNewContact_ModalDialogWindow);
		typeIn(txt_Industry_AddNewContact_ModalDialogWindow, industry);
		waitTime(1);
		List <WebElement> optlst = driver.findElements(By.xpath("//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//label[contains(text(),'Industry')]//following::div[contains(@class,'multiselect')]//div[contains(@class,'multiselect__select')]//parent::div[contains(@class,'multiselect')]//ul[contains(@class,'multiselect__content')]//li//span//span"));
		int optlstcount = optlst.size();
		for (WebElement opt : optlst) 
		{
			String text = opt.getText();
			if (text.equalsIgnoreCase(industry)) 
			{
				opt.click();
				break;
			}
		}
	}

	/**
	*@author VijayaKumar.U
	*
	*This method is used to click and add the individual in add contact.
	*
	*/
	public void click_AddIndividual_Button_CreateContact_ModalDialog_Window()
	{
		waitForElementToDisplay(btn_AddIndividual_AddNewContact_ModalDialogWindow, this.elementLoadWaitTime);
		clickOn(btn_AddIndividual_AddNewContact_ModalDialogWindow);
	}

	public void click_AddOrganization_Button_CreateContact_ModalDialog_Window()
	{
		waitForElementToDisplay(btn_AddOrganization_AddNewContact_ModalDialogWindow, this.elementLoadWaitTime);
		clickOn(btn_AddOrganization_AddNewContact_ModalDialogWindow);
	}
	/**
	*@author VijayaKumar.U
	*
	*This method is used to fill the details in the create contact window
	*
	*@param firstname,lastname,email
	*@param jobTitle,phone,linkedIn,aboutPerson
	*@param address,apartment,etc.
	*
	*/
	public void fillCreateNewContact(String salutation, String firstName, String lastname, String email, String jobTitle, String phone, String linkedIn, String aboutPerson, String address, String apartment, String city, String state, String postalCode, String country, String accountType, String typeOfBusiness, String listingAddedby, String sendInvite, String industry)
	{
		select_Salutation_CreateContact_ModalDialog_Window(salutation);
		enter_FirstName_CreateContact_ModalDialog_Window(firstName);
		enter_LastName_CreateContact_ModalDialog_Window(lastname);
		enter_Email_CreateContact_ModalDialog_Window(email);
		enter_JobTitle_CreateContact_ModalDialog_Window(jobTitle);
		enter_PhoneNo_CreateContact_ModalDialog_Window(phone);
		enter_LinkedIn_CreateContact_ModalDialog_Window(linkedIn);
		enter_AboutPerson_CreateContact_ModalDialog_Window(aboutPerson);
		enter_Address_CreateContact_ModalDialog_Window(address);
		enter_Apartment_CreateContact_ModalDialog_Window(apartment);
		enter_City_CreateContact_ModalDialog_Window(city);
		enter_State_CreateContact_ModalDialog_Window(state);
		enter_PostalCode_CreateContact_ModalDialog_Window(postalCode);
		select_Country_CreateContact_ModalDialog_Window(country);
		select_AccountType_CreateContact_ModalDialog_Window(accountType);
		select_TypeOfBusiness_CreateContact_ModalDialog_Window(typeOfBusiness);
		select_SendInvite_CreateContact_ModalDialog_Window(sendInvite);
		select_Industry_CreateContact_ModalDialog_Window(industry);
	}
	/**
	*@author VijayaKumar.U
	*This method is used to click and add the individual in dialog window.
	*
	*/
	public void click_AddIndividual_Button_CreateContact()
	{
		driver.findElement(By.xpath("//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]")).click();
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//button[contains(text(),'Add individual')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

		click_AddIndividual_Button_CreateContact_ModalDialog_Window();

	}
	/**
	*@author VijayaKumar.U
	*This method is used to add organization in create contact
	*
	*/
	public void click_AddOrganization_Button_CreateContact()
	{
		driver.findElement(By.xpath("//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]")).click();
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]//button[contains(text(),'Add organization')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		click_AddOrganization_Button_CreateContact_ModalDialog_Window();
	}
	/**
	*@author VijayaKumar.U
	*This method is used to verify the add organization .
	*
	*/
	public void verify_AddOrganization_CreateContact_ModalDialog_Window_displayed()
	{
		try	{
			waitForElementToDisplay(lbl_AddOrganization_AddNewContact_ModalDialogWindow_Heading, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_AddOrganization_AddNewContact_ModalDialogWindow_Heading))
			{
				testStepPassed("Add Organization of Create Contact Modal Dialog Window is displayed");	
			}		} 
		catch (Exception e)	{
			testStepFailed("Add Organization of Create Contact Modal Dialog Window is not displayed");
		}
	}
	/**
	*@author VijayaKumar.U
	*
	*This method is used to get the attribute value of the phone number element.
	*
	*/
	public String get_PhoneNumber_AddOrganization_AddContact_Value()
	{
		String text = getAttributeValue(txt_PhoneNumber_AddOrganization_AddNewContact, "value").trim();
		return text;
	}
	/**
	*@author VijayaKumar.U
	*
	*This method returns the text values of linkedIn .
	*/
	public String get_LinkedIN_AddOrganization_AddContact_Value()
	{
		String text = getAttributeValue(txt_LinkedIn_AddOrganization_AddNewContact, "value").trim();
		return text;
	}
	/**
	*@author VijayaKumar.U
	*
	*This method used to enter the legal name details in the add organization window.
	*
	*@param legalName
	*/
	public void enter_LegalName_AddOrganization_CreateContact_ModalDialog_Window(String legalName)
	{
		waitForElementToDisplay(txt_Legalname_AddOrganization_AddNewContact, this.elementLoadWaitTime);
		clearEditBox(txt_Legalname_AddOrganization_AddNewContact);
		typeIn(txt_Legalname_AddOrganization_AddNewContact, legalName);
	}
	/**
	*@author VijayaKumar.U
	*
	*This method is used to enter the legalName to an existing organisation.
	*
	*@param legalName
	*
	*/
	public void enter_LegalName_AddExsistingOrganization_CreateContact_ModalDialog_Window(String legalName)
	{
		waitForElementToDisplay(txt_Legalname_AddOrganization_AddNewContact, this.elementLoadWaitTime);
		clearEditBox(txt_Legalname_AddOrganization_AddNewContact);
		typeIn(txt_Legalname_AddOrganization_AddNewContact, legalName);

		try 		{
			waitForElementToDisplay(lst_AutoCompleteListLegalname_AddOrganization_AddNewContact, this.elementLoadWaitTime);
			if (isElementDisplayed(lst_AutoCompleteListLegalname_AddOrganization_AddNewContact)) 
			{
				testStepPassed("Company Search Bar auto complete is displayed");
				String getUserProfileNamefromAutoCompleteList = driver.findElement(By.xpath("(//div[contains(@id,'modal-add-admin-org')]//div[contains(@class,'modal-dialog modal')]//label[contains(text(),'Company Name')]/parent::div//input[contains(@name,'company')]//parent::div//div[contains(@class,'autcomplete-list')]//a)[1]")).getAttribute("title").trim();
				try 				{
					if (getUserProfileNamefromAutoCompleteList.contains(legalName)) 					{
						testStepPassed("Searched Company Corresponding Profile is displayed");

						waitTime(1);

						driver.findElement(By.xpath("(//div[contains(@id,'modal-add-admin-org')]//div[contains(@class,'modal-dialog modal')]//label[contains(text(),'Company Name')]/parent::div//input[contains(@name,'company')]//parent::div//div[contains(@class,'autcomplete-list')]//a)[1]//div")).click();
					}			} 
				catch (Exception e) 	{
					testStepFailed("Searched Company Corresponding Profile is not displayed");
				}	}		} 
		catch (Exception e) 	{
			testStepFailed("Company Search Bar auto complete is not displayed");
		}	}
	/**
	*@author VijayaKumar.U
	*
	*This method is used to enter the website in the add organisation window.
	*
	*@param website
	*/
	public void enter_Website_AddOrganization_CreateContact_ModalDialog_Window(String website)
	{
		waitForElementToDisplay(txt_Website_AddOrganization_AddNewContact, this.elementLoadWaitTime);
		clearEditBox(txt_Website_AddOrganization_AddNewContact);
		typeIn(txt_Website_AddOrganization_AddNewContact, website);
	}
	/**
	*@author VijayaKumar.U
	*
	*This method is used to enter the phone  in the corresponding window
	*
	*@param phone
	*/
	public void enter_Phone_AddOrganization_CreateContact_ModalDialog_Window(String phone)
	{
		waitForElementToDisplay(txt_PhoneNumber_AddOrganization_AddNewContact, this.elementLoadWaitTime);
		clearEditBox(txt_PhoneNumber_AddOrganization_AddNewContact);
		typeIn(txt_PhoneNumber_AddOrganization_AddNewContact, phone);
	}
	/**
	*@author VijayaKumar.U
	*
	*This method is used to enter the LinkedIn details in the corresponding window.
	*
	*@param linkedIn
	*/
	public void enter_LinkedIn_AddOrganization_CreateContact_ModalDialog_Window(String linkedIn)
	{
		waitForElementToDisplay(txt_LinkedIn_AddOrganization_AddNewContact, this.elementLoadWaitTime);
		clearEditBox(txt_LinkedIn_AddOrganization_AddNewContact);
		typeIn(txt_LinkedIn_AddOrganization_AddNewContact, linkedIn);
	}
	/**
	*@author VijayaKumar.U
	*
	*This method is used to enter the description in the corresponding window
	*
	*@param description
	*
	*/
	public void enter_Description_AddOrganization_CreateContact_ModalDialog_Window(String description)
	{
		waitForElementToDisplay(txt_Description_AddOrganization_AddNewContact, this.elementLoadWaitTime);
		clearEditBox(txt_Description_AddOrganization_AddNewContact);
		typeIn(txt_Description_AddOrganization_AddNewContact, description);
	}
	/**
	*@author VijayaKumar.U
	*
	*This method is used to select the employment status in the corresponding window.
	*
	*@param employeeStatus
	*/
	public void select_EmploymentStatus_AddOrganization_CreateContact_ModalDialog_Window(String employmentStatus)
	{
		waitForElementToDisplay(drp_EmploymentStatus_AddOrganization_AddNewContact, this.elementLoadWaitTime);
		selectFromDropdown(drp_EmploymentStatus_AddOrganization_AddNewContact, employmentStatus);
	}
	/**
	*@author VijayaKumar.U
	*
	*This method is used to select the Portfolio of the company in the corresponding window.
	*@param addCompanyToPortfolio
	*/
	public void select_AddCompanyToPortfolio_AddOrganization_CreateContact_ModalDialog_Window(String addCompanyToPortfolio)
	{
		waitForElementToDisplay(drp_AddCompanytoPortfolio_AddOrganization_AddNewContact, this.elementLoadWaitTime);
		selectFromDropdown(drp_AddCompanytoPortfolio_AddOrganization_AddNewContact, addCompanyToPortfolio);
	}
	/**
	*@author VijayaKumar.U
	*
	*This method is used to verify the display of the link clear.
	*/
	public void click_Clear_Link_AddOrganization_CreateContact_ModalDialog_Window()
	{
		waitForElementToDisplay(lnk_Clear_AddOrganization_AddNewContact, this.elementLoadWaitTime);
		clickOn(lnk_Clear_AddOrganization_AddNewContact);
	}
	/**
	*@author VijayaKumar.U
	*
	*This is method is used to verify the back button in the newContact dialog window.
	*
	*/
	public void click_Back_Button_AddOrganization_CreateContact_ModalDialog_Window()
	{
		waitForElementToDisplay(btn_Back_AddOrganization_AddNewContact, this.elementLoadWaitTime);
		clickOn(btn_Back_AddOrganization_AddNewContact);
	}
	/**
	*This method is used to verify the add newListing button in the corresponding window.
	*
	*@author VijayaKumar.U
	*/
	public void click_AddNewListing_Button_AddOrganization_CreateContact_ModalDialog_Window()
	{
		waitForElementToDisplay(btn_AddNewListing_AddOrganization_AddNewContact, this.elementLoadWaitTime);
		clickOn(btn_AddNewListing_AddOrganization_AddNewContact);
	}
	/**
	*This method is used to fill the new Organization details in the window.
	*
	*@param legalname,website,phone,linkedIn;
	*@param description,employmentStatus,addCompanyToPortfolio
	*
	*@author VijayaKumar.U
	*/
	public void fill_Add_NewOrganization_CreateNewContact(String legalName, String website, String phone, String linkedIn, String description, String employmentStatus, String addCompanyToPortfolio)
	{
		enter_LegalName_AddOrganization_CreateContact_ModalDialog_Window(legalName);
		enter_Website_AddOrganization_CreateContact_ModalDialog_Window(website);
		enter_Phone_AddOrganization_CreateContact_ModalDialog_Window(phone);
		enter_LinkedIn_AddOrganization_CreateContact_ModalDialog_Window(linkedIn);
		enter_Description_AddOrganization_CreateContact_ModalDialog_Window(description);
		select_EmploymentStatus_AddOrganization_CreateContact_ModalDialog_Window(employmentStatus);
		select_AddCompanyToPortfolio_AddOrganization_CreateContact_ModalDialog_Window(addCompanyToPortfolio);
	}
	/**
	*This method is used to enter the existing organizatioin legal name and employment status.
	*
	*@param legalname
	*@param employmentStatus
	*
	*@author VijayaKumar.U
	*/
	public void fill_Add_ExistingOrganization_CreateNewContact(String legalName, String employmentStatus)
	{
		enter_LegalName_AddExsistingOrganization_CreateContact_ModalDialog_Window(legalName);
		select_EmploymentStatus_AddOrganization_CreateContact_ModalDialog_Window(employmentStatus);
	}
	/**
	*This method is used to clear the values in the corresponding element
	*
	*@author VijayaKumar.U
	*/
	public void click_Clear_AddedOrganization_CreateNewContact()
	{
		click_Clear_Link_AddOrganization_CreateContact_ModalDialog_Window();
	}
	/**
	*This method is used to verify the back button in the corresponding window.
	*
	*@author VijayaKumar.U
	*/
	public void click_Back_Button_AddedOrganization_CreateContact()
	{
		driver.findElement(By.xpath("//div[contains(@id,'modal-add-admin-org')]//div[contains(@class,'modal-dialog modal')]")).click();
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'modal-add-admin-org')]//div[contains(@class,'modal-dialog modal')]//button[contains(text(),'Back')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		click_Back_Button_AddOrganization_CreateContact_ModalDialog_Window();
	}
	/**
	*This method is used to click the new listing button add organization in create contact.
	*
	*@author VijayaKumar.U
	*/
	public void click_AddNew_Listing_Button_AddedOrganization_CreateContact()
	{
		driver.findElement(By.xpath("//div[contains(@id,'modal-add-admin-org')]//div[contains(@class,'modal-dialog modal')]")).click();
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'modal-add-admin-org')]//div[contains(@class,'modal-dialog modal')]//button[contains(text(),'Add New Listing')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		click_AddNewListing_Button_AddOrganization_CreateContact_ModalDialog_Window();
	}
	/**
	*This method is used to verify the invalid message for create contact Modal Dialog window.
	*
	*@author VijayaKumar.U
	*/
	public void verify_InvalidIndustry_Message_CreateContact_ModalDialog_Window_displayed()
	{
		
		try 
		{
			waitForElementToDisplay(lbl_Industry_InvalidErrorMessage_AddNewContact_ModalDialogWindow, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_Industry_InvalidErrorMessage_AddNewContact_ModalDialogWindow))
			{
				testStepPassed("Invalid Industry error message of Create Contact Modal Dialog Window is displayed");

				clearEditBox(txt_Industry_AddNewContact_ModalDialogWindow);
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Invalid Industry error message of Create Contact Modal Dialog Window is not displayed");
		}
	}
	/**
	*This method is used to verify the display of the individual button in create contact.
	*
	*@author VijayaKumar.U
	*/
	public void verify_AddIndividual_Button_Disabled_CreateContact_ModalDialog_Window_displayed()
	{
		
		try 
		{
			waitForElementToDisplay(btn_AddIndividual_Disabled_AddNewContact_ModalDialogWindow, this.elementLoadWaitTime);
			if(isElementDisplayed(btn_AddIndividual_Disabled_AddNewContact_ModalDialogWindow))
			{
				testStepPassed("Add Individual button is disabled in Create Contact Modal Dialog Window");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Add Individual button is not disabled in Create Contact Modal Dialog Window");
		}
	}
	/**
	*This method is used to verify the add listing button.
	*
	*@author VijayaKumar.U
	*/
	public void verify_AddListing_Button_Disabled_CreateContact_ModalDialog_Window_displayed()
	{
		
		try 
		{
			waitForElementToDisplay(btn_AddNewListing_Disabled_AddOrganization_AddNewContact, this.elementLoadWaitTime);
			if(isElementDisplayed(btn_AddNewListing_Disabled_AddOrganization_AddNewContact))
			{
				testStepPassed("Add New Listing button is disabled in Create Contact Modal Dialog Window");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Add New Listing button is not disabled in Create Contact Modal Dialog Window");
		}
	}

	/*********************************Company Profile Page Data Room***********************************************/


	/*********************************Company Profile Page Share Window***********************************************/
	/**
	*This method is used to verify the display of share label in the company profile page.
	*
	*@author VijayaKumar.U
	*/
	public void verify_CompanyProfilePage_Share_ModalDialog_Window_displayed()	{
		try 		{
			waitForElementToDisplay(lbl_Share_CompanyProfilePage_ModalDialogWindow, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_Share_CompanyProfilePage_ModalDialogWindow))
			{
				testStepPassed("Company Profile Page Share Modal Dialog Window is displayed");	
			}		} 
		catch (Exception e)		{
			testStepFailed("Company Profile Page Share Modal Dialog Window is not displayed");
		}	}
	/**
	*This method is used to verify the display of the heading in the Company Profile Page
	*
	*@author VijayaKumar.U
	*/
	public void verify_CompanyProfilePage_Share_ModalDialog_Window_Heading_displayed()	{
			try	{
			waitForElementToDisplay(lbl_Share_CompanyProfilePage_ModalDialogWindow_Heading, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_Share_CompanyProfilePage_ModalDialogWindow_Heading))
			{
				testStepPassed("Company Profile Page Share Modal Dialog Window Heading is displayed");	
			}		} 
		catch (Exception e) {
			testStepFailed("Company Profile Page Share Modal Dialog Window Heading is not displayed");
		}	}
	/**
	*This method is used to verify the display of company name in the dialog window.
	*
	*@author VijayaKumar.U
	*/
	public void verify_Corresponding_CompanyProfilePage_Share_Window_displayed(String companyName)	{
		
		try 		{
			String companyNameinShareWindow = driver.findElement(By.xpath("(//div[contains(@id,'org-sharing-modal')]//div[contains(@class,'modal-content')]//div[contains(@class,'modal-title')]//small)[1]")).getText().trim();

			if(companyNameinShareWindow.equalsIgnoreCase(companyName))
			{
				testStepPassed(companyName+" Company Profile Page Share window is displayed correctly");	
			}		} 
		catch (Exception e) 		{
			testStepFailed(companyName+" Company Profile Page Share window is not displayed correctly");
		}	}
	/**
	*This method is used to close the Profile Page window.
	*
	*@author VijayaKumar.U
	*/
	public void click_Share_CompanyProfilePage_Window_Close()
	{
		waitForElementToDisplay(lnk_Share_CompanyProfilePage_ModalDialogWindow_Close, this.elementLoadWaitTime);
		clickOn(lnk_Share_CompanyProfilePage_ModalDialogWindow_Close);	
	}
	/**
	*This method is used to enter the email Address in the corresponding page
	*
	*@author VijayaKumar.U
	*/
	public void enter_Share_CompanyProfilePage_Window_EmailAddress(String emailAddress)
	{
		waitForElementToDisplay(txt_Share_CompanyProfilePage_ModalDialogWindow_EmailAddress, this.elementLoadWaitTime);
		typeIn(txt_Share_CompanyProfilePage_ModalDialogWindow_EmailAddress, emailAddress);	
	}
	/**
	*This method is used to verify the share button in the Company Profile Page.
	*
	*@author VijayaKumar.U
	*/
	public void click_Share_CompanyProfilePage_Window_Share_Button()
	{
		waitForElementToDisplay(btn_Share_CompanyProfilePage_ModalDialogWindow_Share, this.elementLoadWaitTime);
		clickOn(btn_Share_CompanyProfilePage_ModalDialogWindow_Share);	
	}
	/**
	*This method is used to verify the Cap Table checkbox in the Company profile page.
	*
	*@author VijayaKumar.U
	*/
	public void click_Share_CompanyProfilePage_Window_CapTable_Checkbox()
	{
		waitForElementToDisplay(chk_Share_CompanyProfilePage_ModalDialogWindow_CapTable, this.elementLoadWaitTime);
		clickOn(chk_Share_CompanyProfilePage_ModalDialogWindow_CapTable);	
	}
	/**
	*This method is used to enable the check box of the data room window of the company profile page.
	*
	*@author VijayaKumar.U
	*/
	public void click_Share_CompanyProfilePage_Window_DataRoom_Checkbox()
	{
		waitForElementToDisplay(chk_Share_CompanyProfilePage_ModalDialogWindow_DataRoom, this.elementLoadWaitTime);
		clickOn(chk_Share_CompanyProfilePage_ModalDialogWindow_DataRoom);	
	}
	/**
	*This method is used to enable the check box of KPI in the company profile page.
	*
	*@author VijayaKumar.U
	*/
	public void click_Share_CompanyProfilePage_Window_KPIs_Checkbox()
	{
		waitForElementToDisplay(chk_Share_CompanyProfilePage_ModalDialogWindow_KPIs, this.elementLoadWaitTime);
		clickOn(chk_Share_CompanyProfilePage_ModalDialogWindow_KPIs);	
	}
	/**
	*This method is used to close the company profile page window.
	*
	*@author VijayaKumar.U
	*/
	public void click_Share_CompanyProfilePage_Window_Close_Button()
	{
		waitForElementToDisplay(btn_Share_CompanyProfilePage_ModalDialogWindow_Close, this.elementLoadWaitTime);
		clickOn(btn_Share_CompanyProfilePage_ModalDialogWindow_Close);	
	}

	/**
	*This method is used to fill the details in the company profile page.
	*
	*@author VijayaKumar.U
	*/
	public void fill_Share_CompanyProfilePage(String emailAddress)
	{
		enter_Share_CompanyProfilePage_Window_EmailAddress(emailAddress);
	}
	/**
	*This method is used to enable the button by clicking the share company profile page.
	*
	*@author VijayaKumar.U
	*/
	public void click_ShareCompanyProfilePage_Share_Button()
	{
		click_Share_CompanyProfilePage_Window_Share_Button();
	}
	/**
	*This method is used to close the the share company profile page.
	*
	*@author VijayaKumar.U
	*/
	public void click_ShareCompanyProfilePage_Close_Button()
	{
		click_Share_CompanyProfilePage_Window_Close_Button();
	}
	/**
	*This method is used to verify the success message in the data room.
	*
	*@author VijayaKumar.U
	*/
	public void verify_ShareDataRoom_DataRoomShared_SuccessMessage_displayed()
	{
		try 
		{
			waitForElementToDisplay(lbl_Share_CompanyProfilePage_Shared_SuccessMessage, this.elementLoadWaitTime);
			if (isElementDisplayed(lbl_Share_CompanyProfilePage_Shared_SuccessMessage)); 
			{
				testStepPassed("Company Profile Page successfully Shared message is displayed");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Company Profile Page successfully Shared message is not displayed");
		}
	}
	/**
	*This method is used to verify user not found dialog msg display. 
	*
	*@author VijayaKumar.U
	*/
	public void verify_CompanyProfilePage_Share_UserNotFound_ModalDialog_Window_displayed()
	{
		waitForElementToDisplay(lbl_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow, this.elementLoadWaitTime);
		if(isElementDisplayed(lbl_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow))
		{
			testStepPassed("Company Profile Page Share User Not Found Modal Dialog Window Heading is displayed");	
		}
		else 
		{
			testStepFailed("Company Profile Page Share User Not Found Modal Dialog Window Heading is not displayed");
		}
	}
	/**
	*This method is used to verify mandatory fields display in the dialog window.
	*
	*@author VijayaKumar.U
	*/
	public void verify_CompanyProfilePage_Share_UserNotFound_ModalDialog_Window_MandatoryFields_displayed()
	{
		waitForElementToDisplay(lbl_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Salutation_Mandatory, this.elementLoadWaitTime);
		if(isElementDisplayed(lbl_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Salutation_Mandatory))
		{
			testStepPassed("Salutation Mandatory Symbol is displayed in Company Profile Page Share User Not Found Modal Dialog Window");	
		}
		else 
		{
			testStepFailed("Salutation Mandatory Symbol is not displayed in Company Profile Page Share User Not Found Modal Dialog Window");
		}
		
		waitForElementToDisplay(lbl_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_FirstName_Mandatory, this.elementLoadWaitTime);
		if(isElementDisplayed(lbl_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_FirstName_Mandatory))
		{
			testStepPassed("First Name Mandatory Symbol is displayed in Company Profile Page Share User Not Found Modal Dialog Window");	
		}
		else 
		{
			testStepFailed("First Name Mandatory Symbol is not displayed in Company Profile Page Share User Not Found Modal Dialog Window");
		}
		
		waitForElementToDisplay(lbl_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_LastName_Mandatory, this.elementLoadWaitTime);
		if(isElementDisplayed(lbl_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_LastName_Mandatory))
		{
			testStepPassed("Last Name Mandatory Symbol is displayed in Company Profile Page Share User Not Found Modal Dialog Window");	
		}
		else 
		{
			testStepFailed("Last Name Mandatory Symbol is not displayed in Company Profile Page Share User Not Found Modal Dialog Window");
		}
		
		waitForElementToDisplay(lbl_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Email_Mandatory, this.elementLoadWaitTime);
		if(isElementDisplayed(lbl_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Email_Mandatory))
		{
			testStepPassed("Email Mandatory Symbol is displayed in Company Profile Page Share User Not Found Modal Dialog Window");	
		}
		else 
		{
			testStepFailed("Email Mandatory Symbol is not displayed in Company Profile Page Share User Not Found Modal Dialog Window");
		}
		
		waitForElementToDisplay(lbl_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_LegalName_Mandatory, this.elementLoadWaitTime);
		if(isElementDisplayed(lbl_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_LegalName_Mandatory))
		{
			testStepPassed("Legal Name Mandatory Symbol is displayed in Company Profile Page Share User Not Found Modal Dialog Window");	
		}
		else 
		{
			testStepFailed("Legal Name Mandatory Symbol is not displayed in Company Profile Page Share User Not Found Modal Dialog Window");
		}
		
		waitForElementToDisplay(lbl_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Country_Mandatory, this.elementLoadWaitTime);
		if(isElementDisplayed(lbl_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Country_Mandatory))
		{
			testStepPassed("Country Mandatory Symbol is displayed in Company Profile Page Share User Not Found Modal Dialog Window");	
		}
		else 
		{
			testStepFailed("Country Mandatory Symbol is not displayed in Company Profile Page Share User Not Found Modal Dialog Window");
		}

		waitForElementToDisplay(lbl_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Website_Mandatory, this.elementLoadWaitTime);
		if(isElementDisplayed(lbl_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Website_Mandatory))
		{
			testStepPassed("Website Mandatory Symbol is displayed in Company Profile Page Share User Not Found Modal Dialog Window");	
		}
		else 
		{
			testStepFailed("Website Mandatory Symbol is not displayed in Company Profile Page Share User Not Found Modal Dialog Window");
		}
		
		waitForElementToDisplay(lbl_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Phone_Mandatory, this.elementLoadWaitTime);
		if(isElementDisplayed(lbl_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Phone_Mandatory))
		{
			testStepPassed("Phone Mandatory Symbol is displayed in Company Profile Page Share User Not Found Modal Dialog Window");	
		}
		else 
		{
			testStepFailed("Phone Mandatory Symbol is not displayed in Company Profile Page Share User Not Found Modal Dialog Window");
		}
	}
	/**
	*This method is used to verify the display of placeholders in the company profile page.
	*
	*@author VijayaKumar.U
	*/
	public void verify_CompanyProfilePage_Share_UserNotFound_ModalDialog_Window_Placeholders_displayed()
	{
		waitForElementToDisplay(txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_FirstName, this.elementLoadWaitTime);
		String text = getAttributeValue(txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_FirstName, "placeholder");
		if(text.equalsIgnoreCase("First Name"))
		{
			testStepPassed("First Name text box placeholder is displayed as expected in Company Profile Page Share User Not Found Modal Dialog Window");	
		}
		else 
		{
			testStepFailed("First Name text box placeholder is not displayed as expected in Company Profile Page Share User Not Found Modal Dialog Window");
		}
		
		waitForElementToDisplay(txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_LastName, this.elementLoadWaitTime);
		String text2 = getAttributeValue(txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_LastName, "placeholder");
		if(text2.equalsIgnoreCase("Last Name"))
		{
			testStepPassed("Last Name text box placeholder is displayed as expected in Company Profile Page Share User Not Found Modal Dialog Window");	
		}
		else 
		{
			testStepFailed("Last Name text box placeholder is not displayed as expected in Company Profile Page Share User Not Found Modal Dialog Window");
		}
		
		waitForElementToDisplay(txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_LegalName, this.elementLoadWaitTime);
		String text3 = getAttributeValue(txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_LegalName, "placeholder");
		if(text3.equalsIgnoreCase("Legal name"))
		{
			testStepPassed("Legal name text box placeholder is displayed as expected in Company Profile Page Share User Not Found Modal Dialog Window");	
		}
		else 
		{
			testStepFailed("Legal name text box placeholder is not displayed as expected in Company Profile Page Share User Not Found Modal Dialog Window");
		}
		
		waitForElementToDisplay(txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Address, this.elementLoadWaitTime);
		String text4 = getAttributeValue(txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Address, "placeholder");
		if(text4.equalsIgnoreCase("Address"))
		{
			testStepPassed("Address text box placeholder is displayed as expected in Company Profile Page Share User Not Found Modal Dialog Window");	
		}
		else 
		{
			testStepFailed("Address text box placeholder is not displayed as expected in Company Profile Page Share User Not Found Modal Dialog Window");
		}
		
		waitForElementToDisplay(txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_City, this.elementLoadWaitTime);
		String text5 = getAttributeValue(txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_City, "placeholder");
		if(text5.equalsIgnoreCase("City"))
		{
			testStepPassed("City text box placeholder is displayed as expected in Company Profile Page Share User Not Found Modal Dialog Window");	
		}
		else 
		{
			testStepFailed("City text box placeholder is not displayed as expected in Company Profile Page Share User Not Found Modal Dialog Window");
		}
		
		waitForElementToDisplay(txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_PostalCode, this.elementLoadWaitTime);
		String text6 = getAttributeValue(txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_PostalCode, "placeholder");
		if(text6.equalsIgnoreCase("Postal code"))
		{
			testStepPassed("Postal code text box placeholder is displayed as expected in Company Profile Page Share User Not Found Modal Dialog Window");	
		}
		else 
		{
			testStepFailed("Postal code text box placeholder is not displayed as expected in Company Profile Page Share User Not Found Modal Dialog Window");
		}
		
		waitForElementToDisplay(txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_State, this.elementLoadWaitTime);
		String text7 = getAttributeValue(txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_State, "placeholder");
		if(text7.equalsIgnoreCase("State"))
		{
			testStepPassed("State text box placeholder is displayed as expected in Company Profile Page Share User Not Found Modal Dialog Window");	
		}
		else 
		{
			testStepFailed("State text box placeholder is not displayed as expected in Company Profile Page Share User Not Found Modal Dialog Window");
		}
		
		waitForElementToDisplay(txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Country, this.elementLoadWaitTime);
		String text8 = getAttributeValue(txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Country, "placeholder");
		if(text8.equalsIgnoreCase("Country"))
		{
			testStepPassed("Country text box placeholder is displayed as expected in Company Profile Page Share User Not Found Modal Dialog Window");	
		}
		else 
		{
			testStepFailed("Country text box placeholder is not displayed as expected in Company Profile Page Share User Not Found Modal Dialog Window");
		}
		
		waitForElementToDisplay(txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Website, this.elementLoadWaitTime);
		String text9 = getAttributeValue(txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Website, "placeholder");
		if(text9.equalsIgnoreCase("Website"))
		{
			testStepPassed("Website text box placeholder is displayed as expected in Company Profile Page Share User Not Found Modal Dialog Window");	
		}
		else 
		{
			testStepFailed("Website text box placeholder is not displayed as expected in Company Profile Page Share User Not Found Modal Dialog Window");
		}
		
		waitForElementToDisplay(txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Phone, this.elementLoadWaitTime);
		String text10 = getAttributeValue(txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Phone, "placeholder");
		if(text10.equalsIgnoreCase("Enter a phone number"))
		{
			testStepPassed("Enter a phone number text box placeholder is displayed as expected in Company Profile Page Share User Not Found Modal Dialog Window");	
		}
		else 
		{
			testStepFailed("Enter a phone number text box placeholder is not displayed as expected in Company Profile Page Share User Not Found Modal Dialog Window");
		}
	}

	/**
	*This method is used to select the salutation in the window.
	*@param salutation
	*
	*@author VijayaKumar.U
	*/
	public void select_Salutation_Share_CompanyProfilePage_UserNotFound_Window(String salutation)
	{
		waitForElementToDisplay(drp_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Salutation, this.elementLoadWaitTime);
		selectFromDropdown(drp_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Salutation, salutation);	
	}
	/**
	*This method is used to enter the firstname input in the company porfile page.
	*
	*@author VijayaKumar.U
	*/
	public void enter_FirstName_Share_CompanyProfilePage_UserNotFound_Window(String firstName)
	{
		waitForElementToDisplay(txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_FirstName, this.elementLoadWaitTime);
		clearEditBox(txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_FirstName);
		typeIn(txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_FirstName, firstName);	
	}
	/**
	*This method is used to enter the lastname input in the company porfile page.
	*
	*@author VijayaKumar.U
	*/
	public void enter_LastName_Share_CompanyProfilePage_UserNotFound_Window(String lastName)
	{
		waitForElementToDisplay(txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_LastName, this.elementLoadWaitTime);
		clearEditBox(txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_LastName);
		typeIn(txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_LastName, lastName);	
	}
	/**
	*This method is used to enter the email input in the company porfile page.
	*
	*@author VijayaKumar.U
	*/
	public void enter_Email_Share_CompanyProfilePage_UserNotFound_Window(String email)
	{
		waitForElementToDisplay(txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Email, this.elementLoadWaitTime);
		clearEditBox(txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Email);
		typeIn(txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Email, email);	
	}
	/**
	*This method is used to enable email share in the share company porfile page.
	*
	*@author VijayaKumar.U
	*/
	public void clear_Email_Share_CompanyProfilePage_UserNotFound_Window()
	{
		waitForElementToDisplay(txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Email, this.elementLoadWaitTime);
		clearEditBox(txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Email);
	}
	/**
	*This method is used to enter the LegalName input in the share company porfile page.
	*
	*@author VijayaKumar.U
	*/
	public void enter_NewLegalName_Share_CompanyProfilePage_UserNotFound_Window(String legalName)
	{
		waitForElementToDisplay(txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_LegalName, this.elementLoadWaitTime);
		clearEditBox(txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_LegalName);
		typeIn(txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_LegalName, legalName);
	}
	/**
	*This method is used to enter the existing LegalName input in the share company porfile page.
	*
	*@author VijayaKumar.U
	*/
	public void enter_ExistingLegalName_Share_CompanyProfilePage_UserNotFound_Window(String legalName)
	{
		waitForElementToDisplay(txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_LegalName, this.elementLoadWaitTime);
		clearEditBox(txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_LegalName);
		typeIn(txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_LegalName, legalName);
		waitForElementToDisplay(lst_AutoCompleteList_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_LegalName, this.elementLoadWaitTime);
		driver.findElement(By.xpath("//div[contains(@id,'org-sharing-modal')]//div[contains(@class,'modal-content')]//label[contains(text(),'Legal name')]/parent::div//div[contains(@class,'autcomplete-list')]//a//span//strong[text()='"+legalName+"']")).click();
	}
	/**
	*This method is used to enter the address input in the share company porfile page.
	*
	*@author VijayaKumar.U
	*/
	public void enter_Address_Share_CompanyProfilePage_UserNotFound_Window(String address)
	{
		waitForElementToDisplay(txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Address, this.elementLoadWaitTime);
		clearEditBox(txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Address);
		typeIn(txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Address, address);	
	}
	/**
	*This method is used to enter the city input in the share company porfile page.
	*
	*@author VijayaKumar.U
	*/
	public void enter_City_Share_CompanyProfilePage_UserNotFound_Window(String city)
	{
		waitForElementToDisplay(txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_City, this.elementLoadWaitTime);
		clearEditBox(txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_City);
		typeIn(txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_City, city);	
	}
	/**
	*This method is used to enter the postal code input in the share company porfile page.
	*
	*@author VijayaKumar.U
	*/
	public void enter_PostalCode_Share_CompanyProfilePage_UserNotFound_Window(String postalCode)
	{
		waitForElementToDisplay(txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_PostalCode, this.elementLoadWaitTime);
		clearEditBox(txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_PostalCode);
		typeIn(txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_PostalCode, postalCode);	
	}
	/**
	*This method is used to enter the state input in the share company porfile page.
	*
	*@author VijayaKumar.U
	*/
	public void enter_State_Share_CompanyProfilePage_UserNotFound_Window(String state)
	{
		waitForElementToDisplay(txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_State, this.elementLoadWaitTime);
		clearEditBox(txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_State);
		typeIn(txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_State, state);	
	}
	/**
	*This method is used to enter the country input in the company porfile page.
	*
	*@author VijayaKumar.U
	*/
	public void enter_Country_Share_CompanyProfilePage_UserNotFound_Window(String country)
	{
		waitForElementToDisplay(txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Country, this.elementLoadWaitTime);
		clearEditBox(txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Country);
		typeIn(txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Country, country);
		
		waitTime(2);
		driver.findElement(By.xpath("//div[contains(@id,'org-sharing-modal')]//div[contains(@class,'modal-content')]//label[contains(text(),'Country')]/parent::div//div[contains(@class,'autcomplete-list')]//a//span//strong[text()='"+country+"']")).click();
	}
	/**
	*This method is used to enter the website input in the company porfile page.
	*
	*@author VijayaKumar.U
	*/
	public void enter_Website_Share_CompanyProfilePage_UserNotFound_Window(String website)
	{
		waitForElementToDisplay(txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Website, this.elementLoadWaitTime);
		clearEditBox(txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Website);
		typeIn(txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Website, website);	
	}
	/**
	*This method is used to enter the phone input in the share company porfile page.
	*
	*@author VijayaKumar.U
	*/
	public void enter_Phone_Share_CompanyProfilePage_UserNotFound_Window(String phone)
	{
		waitForElementToDisplay(txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Phone, this.elementLoadWaitTime);
		clearEditBox(txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Phone);
		typeIn(txt_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Phone, phone);
	}
	/**
	*This method is used to enter the input details in the new company profile page.
	*
	*@param salutation,firstname,lastname;
	*@param email,legalname,address,city,postal code.
	*@param state,country,website,phone.
	*@author VijayaKumar.U
	*/
	public void fill_Share_UserNotFound_CompanyProfilePage_NewCompanyLegalName(String salutation, String firstName, String lastName, String email, String legalName, String address, String city, String postalCode, String state, String country, String website, String phone)
	{
		select_Salutation_Share_CompanyProfilePage_UserNotFound_Window(salutation);
		enter_FirstName_Share_CompanyProfilePage_UserNotFound_Window(firstName);
		enter_LastName_Share_CompanyProfilePage_UserNotFound_Window(lastName);
		enter_Email_Share_CompanyProfilePage_UserNotFound_Window(email);
		enter_NewLegalName_Share_CompanyProfilePage_UserNotFound_Window(legalName);
		enter_Address_Share_CompanyProfilePage_UserNotFound_Window(address);
		enter_City_Share_CompanyProfilePage_UserNotFound_Window(city);
		enter_PostalCode_Share_CompanyProfilePage_UserNotFound_Window(postalCode);
		enter_State_Share_CompanyProfilePage_UserNotFound_Window(state);
		enter_Country_Share_CompanyProfilePage_UserNotFound_Window(country);
		enter_Website_Share_CompanyProfilePage_UserNotFound_Window(website);
		enter_Phone_Share_CompanyProfilePage_UserNotFound_Window(phone);
	}
	/**
	*This method is used to fill the inputs in ExistingCompanyLegalName
	*@param salutation,firstname,lastname;
	*@param email,legalname;
	*
	*@author VijayaKumar.U
	*/
	public void fill_Share_UserNotFound_CompanyProfilePage_ExistingCompanyLegalName(String salutation, String firstName, String lastName, String email, String legalName, String address, String city, String postalCode, String state, String country, String website, String phone)
	{
		select_Salutation_Share_CompanyProfilePage_UserNotFound_Window(salutation);
		enter_FirstName_Share_CompanyProfilePage_UserNotFound_Window(firstName);
		enter_LastName_Share_CompanyProfilePage_UserNotFound_Window(lastName);
		enter_Email_Share_CompanyProfilePage_UserNotFound_Window(email);
		enter_ExistingLegalName_Share_CompanyProfilePage_UserNotFound_Window(legalName);
		waitTime(1);
	}
	/**
	*This method is used to verify the error msg for salutation.
	*
	*@author VijayaKumar.U
	*/
	public void verify_Salutation_EmptyErrorMessage_Share_UserNotFound_CompanyProfilePage_displayed()
	{
		waitForElementToDisplay(lbl_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Salutation_Missing_ErrorMessage, this.elementLoadWaitTime);
		if (isElementDisplayed(lbl_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Salutation_Missing_ErrorMessage)) 
		{
			testStepPassed("Salutation missing error message is displayed");
		} 
		else 
		{
			testStepFailed("Salutation missing error message is not displayed");
		}
	}
	/**
	*This method is used to verify the first name missing in the error message.
	*
	*@author VijayaKumar.U
	*/
	public void verify_FirstName_EmptyErrorMessage_Share_UserNotFound_CompanyProfilePage_displayed()
	{
		waitForElementToDisplay(lbl_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_FirstName_Missing_ErrorMessage, this.elementLoadWaitTime);
		if (isElementDisplayed(lbl_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_FirstName_Missing_ErrorMessage)) 
		{
			testStepPassed("First Name missing error message is displayed");
		} 
		else 
		{
			testStepFailed("First Name missing error message is not displayed");
		}
	}
	/**
	*This method is used to verify the last name missing in the error message.
	*
	*@author VijayaKumar.U
	*/
	public void verify_LastName_EmptyErrorMessage_Share_UserNotFound_CompanyProfilePage_displayed()
	{
		waitForElementToDisplay(lbl_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_LastName_Missing_ErrorMessage, this.elementLoadWaitTime);
		if (isElementDisplayed(lbl_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_LastName_Missing_ErrorMessage)) 
		{
			testStepPassed("Last Name missing error message is displayed");
		} 
		else 
		{
			testStepFailed("Last Name missing error message is not displayed");
		}
	}
	/**
	*This method is used to verify the first email missing in the error message.
	*
	*@author VijayaKumar.U
	*/
	public void verify_Email_EmptyErrorMessage_Share_UserNotFound_CompanyProfilePage_displayed()
	{
		waitForElementToDisplay(lbl_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Email_Missing_ErrorMessage, this.elementLoadWaitTime);
		if (isElementDisplayed(lbl_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Email_Missing_ErrorMessage)) 
		{
			testStepPassed("Email missing error message is displayed");
		} 
		else 
		{
			testStepFailed("Email missing error message is not displayed");
		}
	}
	/**
	*This method is used to verify the legal name missing in the error message.
	*
	*@author VijayaKumar.U
	*/
	public void verify_LegalName_EmptyErrorMessage_Share_UserNotFound_CompanyProfilePage_displayed()
	{
		waitForElementToDisplay(lbl_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Legalname_Missing_ErrorMessage, this.elementLoadWaitTime);
		if (isElementDisplayed(lbl_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Legalname_Missing_ErrorMessage)) 
		{
			testStepPassed("Legal Name missing error message is displayed");
		} 
		else 
		{
			testStepFailed("Legal Name missing error message is not displayed");
		}
	}
	/**
	*This method is used to verify the missing country in the error message.
	*
	*@author VijayaKumar.U
	*/
	public void verify_Country_EmptyErrorMessage_Share_UserNotFound_CompanyProfilePage_displayed()
	{
		waitForElementToDisplay(lbl_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Country_Missing_ErrorMessage, this.elementLoadWaitTime);
		if (isElementDisplayed(lbl_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Country_Missing_ErrorMessage)) 
		{
			testStepPassed("Country missing error message is displayed");
		} 
		else 
		{
			testStepFailed("Country missing error message is not displayed");
		}
	}
	/**
	*This method is used to verify the error message when webpage is not found.
	*
	*@author VijayaKumar.U
	*/
	public void verify_Website_EmptyErrorMessage_Share_UserNotFound_CompanyProfilePage_displayed()
	{
		waitForElementToDisplay(lbl_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Website_Missing_ErrorMessage, this.elementLoadWaitTime);
		if (isElementDisplayed(lbl_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Website_Missing_ErrorMessage)) 
		{
			testStepPassed("Website missing error message is displayed");
		} 
		else 
		{
			testStepFailed("Website missing error message is not displayed");
		}
	}
	/**
	*This method is used to verify the error message is displayed when phone contact is missing in Company profile.
	*
	*@author VijayaKumar.U
	*/
	public void verify_Phone_EmptyErrorMessage_Share_UserNotFound_CompanyProfilePage_displayed()
	{
		waitForElementToDisplay(lbl_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Phone_Missing_ErrorMessage, this.elementLoadWaitTime);
		if (isElementDisplayed(lbl_Share_CompanyProfilePage_UserNotFound_ModalDialogWindow_Phone_Missing_ErrorMessage)) 
		{
			testStepPassed("Phone missing error message is displayed");
		} 
		else 
		{
			testStepFailed("Phone missing error message is not displayed");
		}
	}

	/*********************************Company Profile Page Share Window***********************************************/




	/*********************************Data Room Create/Add Folder Dialog Window***********************************************/
	/**
	*This method is used to verify the modal dialog window display in data Room.
	*
	*@author VijayaKumar.U
	*/
	public void verify_Dataroom_AddorCreateFolder_ModalDialog_Window_displayed()
	{
		
		try 
		{
			waitForElementToDisplay(lbl_CreateorAddFolder_DataRoom_ModalDialogWindow, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_CreateorAddFolder_DataRoom_ModalDialogWindow))
			{
				testStepPassed("Data Room Add/Create Folder Modal Dialog Window is displayed");	
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Data Room Add/Create Folder Modal Dialog Window is not displayed");
		}
	}
	/**
	*This method is used to verify the display of dialog window for Data Room creation or addition.
	*
	*@author VijayaKumar.U
	*/
	public void verify_Dataroom_AddorCreateFolder_ModalDialog_Window_Heading_displayed()
	{
		
		try 
		{
			waitForElementToDisplay(lbl_CreateorAddFolder_DataRoom_ModalDialogWindow_Heading, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_CreateorAddFolder_DataRoom_ModalDialogWindow_Heading))
			{
				testStepPassed("Data Room Add/Create Folder Modal Dialog Window Heading is displayed");	
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Data Room Add/Create Folder Modal Dialog Window Heading is not displayed");
		}
	}
	/**
	*This method is used to close the window of create folder.
	*
	*@author VijayaKumar.U
	*/
	public void click_AddorCreateFolder_DataRoom_Window_Close_Link()
	{
		waitForElementToDisplay(lnk_CreateorAddFolder_DataRoom_ModalDialogWindow_Close, this.elementLoadWaitTime);
		clickOn(lnk_CreateorAddFolder_DataRoom_ModalDialogWindow_Close);	
	}
	/**
	*This method is used to enter the folder name in the data room add folder window.
	*@param foldername
	*
	*@author VijayaKumar.U
	*/
	public void enter_AddorCreateFolder_DataRoom_Window_FolderName(String folderName)
	{
		waitForElementToDisplay(txt_CreateorAddFolder_DataRoom_ModalDialogWindow_FolderName, this.elementLoadWaitTime);
		typeIn(txt_CreateorAddFolder_DataRoom_ModalDialogWindow_FolderName, folderName);	
	}
	/**
	*This method is used to add folder in data room.
	*
	*@author VijayaKumar.U
	*/
	public void click_AddorCreateFolder_DataRoom_Window_Add_Button()
	{
		waitForElementToDisplay(btn_CreateorAddFolder_DataRoom_ModalDialogWindow_Create, this.elementLoadWaitTime);
		clickOn(btn_CreateorAddFolder_DataRoom_ModalDialogWindow_Create);	
	}
	/**
	*This method is used to fill folder name in the data room.
	*@param folder name 
	*
	*@author VijayaKumar.U
	*/
	public void AddorCreateFolder_DataRoom_fillCreateFolder(String folderName)
	{
		enter_AddorCreateFolder_DataRoom_Window_FolderName(folderName);
	}
	/**
	*This method is used to click and add folder
	*
	*@author VijayaKumar.U
	*/
	public void click_AddorCreateFolder_DataRoom_AddFolder()
	{
		click_AddorCreateFolder_DataRoom_Window_Add_Button();
	}

	/*********************************Data Room Create/Add Folder Dialog Window***********************************************/





	/*********************************Data Room Edit/Update Folder Dialog Window***********************************************/
	/**
	*This method is used to verify the editor update folder in dataroom
	*
	*@author VijayaKumar.U
	*/
	public void verify_Dataroom_EditorUpdateFolder_ModalDialog_Window_displayed()
	{
	
		try 
		{
			waitForElementToDisplay(lbl_EditorUpdateFolder_DataRoom_ModalDialogWindow, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_EditorUpdateFolder_DataRoom_ModalDialogWindow))
			{
				testStepPassed("Data Room Edit/Update Folder Modal Dialog Window is displayed");	
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Data Room Edit/Update Folder Modal Dialog Window is not displayed");
		}
	}
	/**
	*This method is used to verify the display pf the edit or update heading in data room
	*
	*@author VijayaKumar.U
	*/
	public void verify_Dataroom_EditorUpdateFolder_ModalDialog_Window_Heading_displayed()
	{
		
		try 
		{
			waitForElementToDisplay(lbl_EditorUpdateFolder_DataRoom_ModalDialogWindow_Heading, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_EditorUpdateFolder_DataRoom_ModalDialogWindow_Heading))
			{
				testStepPassed("Data Room Edit/Update Folder Modal Dialog Window Heading is displayed");	
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Data Room Edit/Update Folder Modal Dialog Window Heading is not displayed");
		}
	}
	/**
	*This method is used to close the editor update in data room window.
	*
	*@author VijayaKumar.U
	*/
	public void click_EditorUpdateFolder_DataRoom_Window_Close_Link()
	{
		waitForElementToDisplay(lnk_EditorUpdateFolder_DataRoom_ModalDialogWindow_Close, this.elementLoadWaitTime);
		clickOn(lnk_EditorUpdateFolder_DataRoom_ModalDialogWindow_Close);	
	}
	/**
	*This method is used to enter the folder name in the data room window.
	*
	*@author VijayaKumar.U
	*/
	public void enter_EditorUpdateFolder_DataRoom_Window_FolderName(String folderName)
	{
		waitForElementToDisplay(txt_EditorUpdateFolder_DataRoom_ModalDialogWindow_FolderName, this.elementLoadWaitTime);
		typeIn(txt_EditorUpdateFolder_DataRoom_ModalDialogWindow_FolderName, folderName);	
	}
	/**
	*This method is used to click edit button in data room.
	*
	*@author VijayaKumar.U
	*/
	public void click_EditorUpdateFolder_DataRoom_Window_Edit_Button()
	{
		waitForElementToDisplay(btn_EditorUpdateFolder_DataRoom_ModalDialogWindow_Edit, this.elementLoadWaitTime);
		clickOn(btn_EditorUpdateFolder_DataRoom_ModalDialogWindow_Edit);	
	}
	/**
	*This method is used to fill the Edit Folder in Data Room.
	*
	*@author VijayaKumar.U
	*/
	public void EditorUpdateFolder_DataRoom_fillEditFolder(String folderName)
	{
		enter_EditorUpdateFolder_DataRoom_Window_FolderName(folderName);
	}
	/**
	*This method is used to edit the Folder in Data Room.
	*
	*@author VijayaKumar.U
	*/
	public void click_EditorUpdateFolder_DataRoom_EditFolder()
	{
		click_EditorUpdateFolder_DataRoom_Window_Edit_Button();
	}

	/*********************************Data Room Create/Add Folder Dialog Window***********************************************/



	/*********************************Delete Folder Data Room***********************/
	/**
	*This method is used to verify the deletion of folder in the corresponding window.
	*
	*@author VijayaKumar.U
	*/
	public void verify_Dataroom_DeleteFolder_ModalDialog_Window_displayed()
	{
		
		try 
		{
			waitForElementToDisplay(lbl_DeleteFolderDataRoom_ModalDialogWindow, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_DeleteFolderDataRoom_ModalDialogWindow))
			{
				testStepPassed("Data Room Delete Folder Modal Dialog Window is displayed");	
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Data Room Delete Folder Modal Dialog Window is not displayed");
		}
	}
	/**
	*This method is used to verify the display of in the data room
	*
	*@author VijayaKumar.U
	*/
	public void verify_Dataroom_DeleteFolder_ModalDialog_Window_Heading_displayed()
	{
		
		try 
		{
			waitForElementToDisplay(lbl_DeleteFolderDataRoom_ModalDialogWindow_Heading, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_DeleteFolderDataRoom_ModalDialogWindow_Heading))
			{
				testStepPassed("Data Room Delete Folder Modal Dialog Window Heading is displayed");	
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Data Room Share Delete Folder Dialog Window Heading is not displayed");
		}
	}
	/**
	*This method is used to click close the link delete in the data room.
	*
	*@author VijayaKumar.U
	*/
	public void click_DeleteFolder_DataRoom_Window_Close_Link()
	{
		waitForElementToDisplay(lnk_DeleteFolder_DataRoom_ModalDialogWindow_Close, this.elementLoadWaitTime);
		clickOn(lnk_DeleteFolder_DataRoom_ModalDialogWindow_Close);	
	}
	/**
	*This method is used to click add button in data room window.
	*
	*@author VijayaKumar.U
	*/
	public void click_DeleteFolder_DataRoom_Window_Add_Button()
	{
		waitForElementToDisplay(btn_DeleteFolder_DataRoom_ModalDialogWindow_Delete, this.elementLoadWaitTime);
		clickOn(btn_DeleteFolder_DataRoom_ModalDialogWindow_Delete);	
	}
	/**
	*This method is used to verify the delete folder dialog window.
	*
	*@author VijayaKumar.U
	*/
	public void verify_Dataroom_CompayProfile_DeleteFolder_ModalDialog_Window_displayed()
	{
		try 
		{
			waitForElementToDisplay(lbl_DeleteFolderDataRoom_ModalDialogWindow_CompanyProfileSection, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_DeleteFolderDataRoom_ModalDialogWindow_CompanyProfileSection))
			{
				testStepPassed("Data Room Company Profile Delete Folder Modal Dialog Window is displayed");	
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Data Room Company Profile Delete Folder Modal Dialog Window is not displayed");
		}	}
	/**
	*This method is used to verify the due diligence in data room
	*
	*@author VijayaKumar.U
	*/
	public void verify_Dataroom_DueDiligence_DeleteFolder_ModalDialog_Window_displayed()
	{
		
		try 
		{
			waitForElementToDisplay(lbl_DeleteFolderDataRoom_ModalDialogWindow_DueDiligenceSection, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_DeleteFolderDataRoom_ModalDialogWindow_DueDiligenceSection))
			{
				testStepPassed("Data Room Due Diligence Delete Folder Modal Dialog Window is displayed");	
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Data Room Due Diligence Delete Folder Modal Dialog Window is not displayed");
		}	}
	/**
	*This method is used to verify the investmenets section display in data room.
	*
	*@author VijayaKumar.U
	*/
	public void verify_Dataroom_Investments_DeleteFolder_ModalDialog_Window_displayed()
	{
		
		try 
		{
			waitForElementToDisplay(lbl_DeleteFolderDataRoom_ModalDialogWindow_InvestmentsSection, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_DeleteFolderDataRoom_ModalDialogWindow_InvestmentsSection))
			{
				testStepPassed("Data Room Investments Delete Folder Modal Dialog Window is displayed");	
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Data Room Investments Delete Folder Modal Dialog Window is not displayed");
		}	}
	/**
	*This method is used to verify the financials display in the data room 
	*
	*@author VijayaKumar.U
	*/
	public void verify_Dataroom_Financials_DeleteFolder_ModalDialog_Window_displayed()
	{
			try 		{
			waitForElementToDisplay(lbl_DeleteFolderDataRoom_ModalDialogWindow_FinancialsSection, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_DeleteFolderDataRoom_ModalDialogWindow_FinancialsSection))
			{
				testStepPassed("Data Room Financials Delete Folder Modal Dialog Window is displayed");	
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Data Room Financials Delete Folder Modal Dialog Window is not displayed");
		}	}
	/**
	*This method is used to verify the legal section in the data room.
	*
	*@author VijayaKumar.U
	*/
	public void verify_Dataroom_Legal_DeleteFolder_ModalDialog_Window_displayed()
	{
		
		try {
			waitForElementToDisplay(lbl_DeleteFolderDataRoom_ModalDialogWindow_LegalSection, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_DeleteFolderDataRoom_ModalDialogWindow_LegalSection))
			{
				testStepPassed("Data Room Legal Delete Folder Modal Dialog Window is displayed");	
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Data Room Legal Delete Folder Modal Dialog Window is not displayed");
		}	}
	/**
	*This method is used to verify the share holder section updates in the data room.
	*
	*@author VijayaKumar.U
	*/
	public void verify_Dataroom_ShareholderUpdates_DeleteFolder_ModalDialog_Window_displayed()
	{
		
		try 
		{
			waitForElementToDisplay(lbl_DeleteFolderDataRoom_ModalDialogWindow_ShareholderUpdatesSection, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_DeleteFolderDataRoom_ModalDialogWindow_ShareholderUpdatesSection))
			{
				testStepPassed("Data Room Shareholder Updates Delete Folder Modal Dialog Window is displayed");	
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Data Room Shareholder Updates Delete Folder Modal Dialog Window is not displayed");
		}	}
	/**
	*This method is used to verify the display of the management team in the window.
	*
	*@author VijayaKumar.U
	*/
	public void verify_Dataroom_ManagementTeam_DeleteFolder_ModalDialog_Window_displayed()
	{
		try 	{
			waitForElementToDisplay(lbl_DeleteFolderDataRoom_ModalDialogWindow_ManagementTeamSection, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_DeleteFolderDataRoom_ModalDialogWindow_ManagementTeamSection))
			{
				testStepPassed("Data Room Management Team Delete Folder Modal Dialog Window is displayed");	
			}		} 
		catch (Exception e) 
		{
			testStepFailed("Data Room Management Team Delete Folder Modal Dialog Window is not displayed");
		}	}
	/**
	*This method is used to verify the port technology display in delete folder window.
	*
	*@author VijayaKumar.U
	*/
	public void verify_Dataroom_IPortechnology_DeleteFolder_ModalDialog_Window_displayed()
	{
			try 	{
			waitForElementToDisplay(lbl_DeleteFolderDataRoom_ModalDialogWindow_IPortechnologySection, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_DeleteFolderDataRoom_ModalDialogWindow_IPortechnologySection))
			{
				testStepPassed("Data Room IP/technology Delete Folder Modal Dialog Window is displayed");	
			}		} 
		catch (Exception e) 
		{
			testStepFailed("Data Room IP/technology Delete Folder Modal Dialog Window is not displayed");
		}	}
	/**
	*This method is used to verify the inbox in the delete folder window.
	*
	*@author VijayaKumar.U
	*/
	public void verify_Dataroom_Inbox_DeleteFolder_ModalDialog_Window_displayed()
	{
			try 		{
			waitForElementToDisplay(lbl_DeleteFolderDataRoom_ModalDialogWindow_InboxSection, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_DeleteFolderDataRoom_ModalDialogWindow_InboxSection))
			{
				testStepPassed("Data Room Inbox Delete Folder Modal Dialog Window is displayed");	
			}		} 
		catch (Exception e) 
		{
			testStepFailed("Data Room Inbox Delete Folder Modal Dialog Window is not displayed");
		}	}

	/*********************************Delete Folder Data Room***********************/



	/*********************************Data Room Edit Folder Dialog Window***********************************************/
	/**
	*This method is used to verify the display of the modal dialog window.
	*
	*@author VijayaKumar.U
	*/
	public void verify_Dataroom_EditFolder_ModalDialog_Window_displayed()
	{
		
		try 
		{
			waitForElementToDisplay(lbl_EditFolder_DataRoom_ModalDialogWindow, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_EditFolder_DataRoom_ModalDialogWindow))
			{
				testStepPassed("Data Room Edit Folder Modal Dialog Window is displayed");	
			}		} 
		catch (Exception e) 
		{
			testStepFailed("Data Room Edit Folder Modal Dialog Window is not displayed");
		}	}
	/**
	*This method is used to verify the display of the heading the data room edit folder dialog window.
	*
	*@author VijayaKumar.U
	*/
	public void verify_Dataroom_EditFolder_ModalDialog_Window_Heading_displayed()
	{
		
		try {
			waitForElementToDisplay(lbl_EditFolder_DataRoom_ModalDialogWindow_Heading, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_EditFolder_DataRoom_ModalDialogWindow_Heading))
			{
				testStepPassed("Data Room Edit Folder Modal Dialog Window Heading is displayed");	
			}		} 
		catch (Exception e) 
		{
			testStepFailed("Data Room Edit Folder Dialog Window Heading is not displayed");
		}	}
	/**
	*This method is used to close the dialog window in the edit folder .
	*
	*@author VijayaKumar.U
	*/
	public void click_EditFolder_DataRoom_Window_Close_Link()
	{
		waitForElementToDisplay(lnk_EditFolder_DataRoom_ModalDialogWindow_Close, this.elementLoadWaitTime);
		clickOn(lnk_EditFolder_DataRoom_ModalDialogWindow_Close);	
	}
	/**
	*This method is used to enter the folder name in the data room window.
	*
	*@author VijayaKumar.U
	*/
	public void enter_EditFolder_DataRoom_Window_FolderName(String folderName)
	{
		waitForElementToDisplay(txt_EditFolder_DataRoom_ModalDialogWindow_FolderName, this.elementLoadWaitTime);
		typeIn(txt_EditFolder_DataRoom_ModalDialogWindow_FolderName, folderName);	
	}
	/**
	*This method is used to clicke add to edit the folder in data room.
	*
	*@author VijayaKumar.U
	*/
	public void click_editFolder_DataRoom_Window_Add_Button()
	{
		waitForElementToDisplay(btn_EditFolder_DataRoom_ModalDialogWindow_Add, this.elementLoadWaitTime);
		clickOn(btn_EditFolder_DataRoom_ModalDialogWindow_Add);	
	}

	/*********************************Data Room Edit Folder Dialog Window***********************************************/




	/*********************************Data Room Upload File Dialog Window***********************************************/
	/**
	*This method is used to verify the data room dialog window.
	*
	*@author VijayaKumar.U
	*/
	public void verify_Dataroom_UploadFile_ModalDialog_Window_displayed()
	{
		
		try 
		{
			waitForElementToDisplay(lbl_UploadFile_DataRoom_ModalDialogWindow, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_UploadFile_DataRoom_ModalDialogWindow))
			{
				testStepPassed("Data Room Upload File Modal Dialog Window is displayed");	
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Data Room Upload File Modal Dialog Window is not displayed");
		}
	}
	/**
	*This method is used to verify the display of heading in the upload file dialog window.
	*
	*@author VijayaKumar.U
	*/
	public void verify_Dataroom_UploadFile_ModalDialog_Window_Heading_displayed()
	{
		
		try 
		{
			waitForElementToDisplay(lbl_UploadFile_DataRoom_ModalDialogWindow_Heading, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_UploadFile_DataRoom_ModalDialogWindow_Heading))
			{
				testStepPassed("Data Room Upload File Modal Dialog Window Heading is displayed");	
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Data Room Upload File Dialog Window Heading is not displayed");
		}
	}
	/**
	*This method is used to verify the display the upload file tab.
	*
	*@author VijayaKumar.U
	*/
	public void verify_Dataroom_UploadFileTabs_ModalDialog_Window_displayed()
	{
		String uploadFileLabelnameslst = "Upload,upload multiple files,Create DocuSign Document";

		String[] uploadFileLabelnames = uploadFileLabelnameslst.split(",");
		int count = uploadFileLabelnames.length;
		for (int i = 0; i < count; i++) 
		{
			String name = uploadFileLabelnames[i];
			try 
			{
				if (driver.findElement(By.xpath("//div[contains(@id,'dataroom-content-modal')]//div[contains(@class,'modal-content')]//ul[contains(@class,'folder_tabs')]//li//a[contains(text(),'"+name+"')]")).isDisplayed()) 
				{
					testStepPassed(name+" tab is displayed as expected in Upload File Dialog Window");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed(name+" tab is not displayed as expected in Upload File Dialog Window");
			}
		}
	}
	/**
	*This method is used to add document using link in data room.
	*
	*@author VijayaKumar.U
	*/
	public void click_UploadFile_DataRoom_Window_AddDocumentTab_Link()
	{
		waitForElementToDisplay(lnk_UploadFile_DataRoom_ModalDialogWindow_AddDocument_Heading, this.elementLoadWaitTime);
		clickOn(lnk_UploadFile_DataRoom_ModalDialogWindow_AddDocument_Heading);	
	}
	/**
	*This method is used to upload multiple files using link
	*
	*@author VijayaKumar.U
	*/
	public void click_UploadFile_DataRoom_Window_UploadMultipleFilesTab_Link()
	{
		waitForElementToDisplay(lnk_UploadFile_DataRoom_ModalDialogWindow_UploadMultipleFiles_Heading, this.elementLoadWaitTime);
		clickOn(lnk_UploadFile_DataRoom_ModalDialogWindow_UploadMultipleFiles_Heading);	
	}
	/**
	*This method is used to verify the link in create document sign window.
	*
	*@author VijayaKumar.U
	*/
	public void click_UploadFile_DataRoom_Window_CreateDocuSignDocumentTab_Link()
	{
		waitForElementToDisplay(lnk_UploadFile_DataRoom_ModalDialogWindow_CreateDocuSignDocument_Heading, this.elementLoadWaitTime);
		clickOn(lnk_UploadFile_DataRoom_ModalDialogWindow_CreateDocuSignDocument_Heading);	
	}
	/**
	*This method is used to verify the link and close the window.
	*
	*@author VijayaKumar.U
	*/
	public void click_UploadFile_DataRoom_Window_Close_Link()
	{
		waitForElementToDisplay(lnk_UploadFile_DataRoom_ModalDialogWindow_Close, this.elementLoadWaitTime);
		clickOn(lnk_UploadFile_DataRoom_ModalDialogWindow_Close);	
	}
	/**
	*This method is used to enter the filename in the data room
	*
	*@author VijayaKumar.U
	*/
	public void enter_UploadFile_DataRoom_Window_FileName(String fileName)
	{
		waitForElementToDisplay(txt_UploadFile_DataRoom_ModalDialogWindow_AddDocument_FileName, this.elementLoadWaitTime);
		clearEditBox(txt_UploadFile_DataRoom_ModalDialogWindow_AddDocument_FileName);
		typeIn(txt_UploadFile_DataRoom_ModalDialogWindow_AddDocument_FileName, fileName);	
	}
	/**
	*This method is used to get the file name value  .
	*
	*@author VijayaKumar.U
	*/
	public String get_UploadFile_DataRoom_Window_FileName_Value()
	{
		
		String text = getAttributeValue(txt_UploadFile_DataRoom_ModalDialogWindow_AddDocument_FileName, "value").trim();
		return text;
	}
	/**
	*This method is used to select the file type in the drop down in data room.
	*
	*@author VijayaKumar.U
	*/
	public void select_UploadFile_DataRoom_Window_FileType(String fileType)
	{
		waitForElementToDisplay(drp_UploadFile_DataRoom_ModalDialogWindow_AddDocument_FileType, this.elementLoadWaitTime);
		selectFromDropdown(drp_UploadFile_DataRoom_ModalDialogWindow_AddDocument_FileType, fileType);
	}
	/**
	*This method is used to enter the custom file type in the data room window.
	*
	*@author VijayaKumar.U
	*/
	public void enter_UploadFile_DataRoom_Window_CustomFileName(String customFileType)
	{
		waitForElementToDisplay(txt_UploadFile_DataRoom_ModalDialogWindow_AddDocument_CustomFileType, this.elementLoadWaitTime);
		typeIn(txt_UploadFile_DataRoom_ModalDialogWindow_AddDocument_CustomFileType, customFileType);	
	}
	/**
	*This method is used to select the document permission for the upload file in data room. 
	*
	*@author VijayaKumar.U
	*/
	public void select_UploadFile_DataRoom_Window_DocumentPermissions(String documentPermissions)
	{
		waitForElementToDisplay(drp_UploadFile_DataRoom_ModalDialogWindow_AddDocument_DocumentPermissions, this.elementLoadWaitTime);
		selectFromDropdown(drp_UploadFile_DataRoom_ModalDialogWindow_AddDocument_DocumentPermissions, documentPermissions);
	}
	/**
	*This method is used to enter the file path to be uploaded.
	*@param filePath
	*
	*@author VijayaKumar.U
	*/
	public void enter_UploadFile_DataRoom_Window_filePath(String filePath)
	{
		waitForElementToDisplay(btn_UploadFile_DataRoom_ModalDialogWindow_AddDocument_ChooseFile, this.elementLoadWaitTime);
		typeIn(btn_UploadFile_DataRoom_ModalDialogWindow_AddDocument_ChooseFile, filePath);
	}
	/**
	*This method is used to select a document signed date for the update.
	*@param documentSignedDate
	*
	*@author VijayaKumar.U
	*/
	public void select_UploadFile_DataRoom_Window_DocumentSignedDate(String documentSignedDate)
	{
		waitForElementToDisplay(txt_UploadFile_DataRoom_ModalDialogWindow_AddDocument_DocumentSignedDate, this.elementLoadWaitTime);
		typeIn(txt_UploadFile_DataRoom_ModalDialogWindow_AddDocument_DocumentSignedDate, documentSignedDate);
		waitTime(1);

		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'dataroom-content-modal')]//div[contains(@class,'modal-content')]//label[contains(text(),'Document signed / Event date')]/parent::div//div[@class='vdp-datepicker'][1]//div[contains(@class,'vdp-datepicker__calendar')]//div//span[contains(@class,'today')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

		driver.findElement(By.xpath("//div[contains(@id,'dataroom-content-modal')]//div[contains(@class,'modal-content')]//label[contains(text(),'Document signed / Event date')]/parent::div//div[@class='vdp-datepicker'][1]//div[contains(@class,'vdp-datepicker__calendar')]//div//span[contains(@class,'today')]")).click();
	}
	/**
	*This method is used to choose the file to upload in the data room.
	*
	*@author VijayaKumar.U
	*/
	public void click_UploadFile_DataRoom_Window_ChooseFile()
	{
		waitForElementToDisplay(btn_UploadFile_DataRoom_ModalDialogWindow_AddDocument_ChooseFile, this.elementLoadWaitTime);
		clickOnSpecialElement(btn_UploadFile_DataRoom_ModalDialogWindow_AddDocument_ChooseFile);	
	}
	/**
	*This method is used to choose the file .
	*
	*@author VijayaKumar.U
	*/
	public void click_UploadMultipleFiles_AddNewFile_DataRoom_Window_ChooseFile()
	{
		waitForElementToDisplay(btn_UploadFile_DataRoom_ModalDialogWindow_UploadMultipleFiles_AddNewFile, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'dataroom-content-modal')]//div[contains(@class,'modal-content')]//span[contains(text(),'Add New File')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

		clickOn(btn_UploadFile_DataRoom_ModalDialogWindow_UploadMultipleFiles_AddNewFile);	
	}

	/**
	*This method is used to enter the filename to sign the document in the data room.
	*@param fileName
	*
	*@author VijayaKumar.U
	*/

	public void enter_CreateDocuSignDocument_DataRoom_Window_FileName(String fileName)
	{
		waitForElementToDisplay(txt_UploadFile_DataRoom_ModalDialogWindow_CreateDocuSignDocument_FileName, this.elementLoadWaitTime);
		clearEditBox(txt_UploadFile_DataRoom_ModalDialogWindow_CreateDocuSignDocument_FileName);
		typeIn(txt_UploadFile_DataRoom_ModalDialogWindow_CreateDocuSignDocument_FileName, fileName);	
	}
	/**
	*This method is used to return the filename value.
	*
	*@author VijayaKumar.U
	*/
	public String get_CreateDocuSignDocument_DataRoom_Window_FileName_Value()
	{
		
		String text = getAttributeValue(txt_UploadFile_DataRoom_ModalDialogWindow_CreateDocuSignDocument_FileName, "value").trim();
		return text;
	}
	/**
	*This method is used to select the file type in the dropdown box.
	*@param fileType
	*
	*@author VijayaKumar.U
	*/
	public void select_CreateDocuSignDocument_DataRoom_Window_FileTypr(String fileType)
	{
		waitForElementToDisplay(drp_UploadFile_DataRoom_ModalDialogWindow_CreateDocuSignDocument_FileType, this.elementLoadWaitTime);
		selectFromDropdown(drp_UploadFile_DataRoom_ModalDialogWindow_CreateDocuSignDocument_FileType, fileType);
	}
	/**
	*This method is used to enter the file name for the custom file type.
	*
	*@author VijayaKumar.U
	*/
	public void enter_CreateDocuSignDocument_DataRoom_Window_CustomFileName(String customFileType)
	{
		waitForElementToDisplay(txt_UploadFile_DataRoom_ModalDialogWindow_CreateDocuSignDocument_CustomFileType, this.elementLoadWaitTime);
		typeIn(txt_UploadFile_DataRoom_ModalDialogWindow_CreateDocuSignDocument_CustomFileType, customFileType);	
	}
	/**
	*This method is used to select the document permission from the drop down
	*
	*@param documentPermission
	*
	*@author VijayaKumar.U
	*/
	public void select_CreateDocuSignDocument_DataRoom_Window_DocumentPermissions(String documentPermissions)
	{
		waitForElementToDisplay(drp_UploadFile_DataRoom_ModalDialogWindow_CreateDocuSignDocument_DocumentPermissions, this.elementLoadWaitTime);
		selectFromDropdown(drp_UploadFile_DataRoom_ModalDialogWindow_CreateDocuSignDocument_DocumentPermissions, documentPermissions);
	}
	/**
	*This method is used to accompalish the contract for sign document operation
	*
	*@author VijayaKumar.U
	*/
	public void click_CreateDocuSignDocument_DataRoom_Window_SendContracttoSignImmediately()
	{
		waitForElementToDisplay(chk_UploadFile_DataRoom_ModalDialogWindow_CreateDocuSignDocument_SendContractForSignImmediately, this.elementLoadWaitTime);
		clickOn(chk_UploadFile_DataRoom_ModalDialogWindow_CreateDocuSignDocument_SendContractForSignImmediately);	
	}
	/**
	*This method is used to click the upload button in data room.
	*
	*@author VijayaKumar.U
	*/
	public void click_UploadFile_DataRoom_Window_UploadButton()
	{
		waitForElementToDisplay(btn_UploadFile_DataRoom_ModalDialogWindow_Upload, this.elementLoadWaitTime);
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'dataroom-content-modal')]//div[contains(@class,'modal-content')]//span[contains(text(),'Upload')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

		clickOn(btn_UploadFile_DataRoom_ModalDialogWindow_Upload);	
	}
	/**
	*This method is used to verify the visibility of the File upload in Data Room.
	*@param file name,file type,document Permission
	*@param documentSidnedDate,filepath
	*
	*@author VijayaKumar.U
	*/

	public void fill_AddDocumentTab_UploadFile_Window(String fileName, String fileType, String documentPermission, String documentSignedDate, String filePath)
	{
		enter_UploadFile_DataRoom_Window_FileName(fileName);
		select_UploadFile_DataRoom_Window_FileType(fileType);
		select_UploadFile_DataRoom_Window_DocumentPermissions(documentPermission);
		
		try 	{
			if (driver.findElement(By.xpath("//div[contains(@id,'dataroom-content-modal')]//div[contains(@class,'modal-content')]//input[contains(@class,'file_input')]")).isDisplayed()) 
			{
				testStepPassed("File Upload Textbox is Visible");

				WebElement ele = driver.findElement(By.xpath("//div[contains(@id,'dataroom-content-modal')]//div[contains(@class,'modal-content')]//input[contains(@class,'file_input')]")); 
				ele.sendKeys(filePath);
			}		}
		catch (Exception e) 		{
			testStepFailed("File Upload Textbox is not Visible");
		}	}

	public void close_UploadFile_DataRoom_Window()	{
		click_UploadFile_DataRoom_Window_Close_Link();
	}


	/**
	*This method is used to verify the visibility of the File edit window in Data Room.
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
	*This method is used to clear the edit box of the title document in dialog window of data Room.
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
	*This method is used to select newFileType in the dropdown boc.
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
	*This method is used to select the permissions in the drop down box
	*@param newnewDocumentPermissions
	*
	*@author VijayaKumar.U
	*/
	public void select_EditFile_DataRoom_Window_DocumentPermissions(String newDocumentPermissions)
	{
		waitForElementToDisplay(drp_EditFile_DataRoom_ModalDialogWindow_DocumentPermissions, this.elementLoadWaitTime);
		selectFromDropdown(drp_EditFile_DataRoom_ModalDialogWindow_DocumentPermissions, newDocumentPermissions);
	}
	/**
	*This method is used to verify the visibility of the dropdown for edit file in a folder in Data Room.
	*
	*@param newFolder
	*@author VijayaKumar.U
	*/
	public void select_EditFile_DataRoom_Window_Folder(String newFolder)
	{
		waitForElementToDisplay(drp_EditFile_DataRoom_ModalDialogWindow_Folder, this.elementLoadWaitTime);
		selectFromDropdown(drp_EditFile_DataRoom_ModalDialogWindow_Folder, newFolder);
	}
	/**
	*This method is used to verify the display of edit file button  in Data Room.
	*
	*@author VijayaKumar.U
	*/
	public void click_EditFile_DataRoom_Window_EditButton()
	{
		waitForElementToDisplay(btn_EditFile_DataRoom_ModalDialogWindow_Edit, this.elementLoadWaitTime);
		clickOn(btn_EditFile_DataRoom_ModalDialogWindow_Edit);
	}
	/**
	*This method is used to verify the dialog window is closed in Data Room.
	*
	*@author VijayaKumar.U
	*/
	public void click_EditFile_DataRoom_Window_Close()
	{
		waitForElementToDisplay(lnk_EditFile_DataRoom_ModalDialogWindow_Close, this.elementLoadWaitTime);
		clickOn(lnk_EditFile_DataRoom_ModalDialogWindow_Close);
	}


	/*********************************Edit File Data Room***********************/


	/*********************************Delete File of Data Room***********************/
	/**
	*This method is used to verify the display message for delete file in Data Room.
	*
	*@author VijayaKumar.U
	*/
	public void verify_DeleteFile_DataRoom_Window_displayed()
	{
		try 
		{
			waitForElementToDisplay(lbl_DeleteFile_DataRoom_ModalDialogWindow, this.elementLoadWaitTime);
			if (isElementDisplayed(lbl_DeleteFile_DataRoom_ModalDialogWindow_Heading)) 
			{
				testStepPassed("Delete File Window is displayed");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Delete File Window is not displayed");
		}
	}
	/**
	*This method is used to verify the correct file is deleted in Data Room.
	*
	*@author VijayaKumar.U
	*/
	public void verify_CorrectDeleteFile_DataRoom_Window_FileName_displayed(String fileName)
	{
		waitForElementToDisplay(lbl_DeleteFile_DataRoom_ModalDialogWindow_Heading, this.elementLoadWaitTime);
		String fileNameinDeleteFileWindow = getText(lbl_DeleteFile_DataRoom_ModalDialogWindow_FileName).trim();
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
	*This method is used to verify the visibility of the delete file button in Data Room.
	*
	*@author VijayaKumar.U
	*/
	public void click_DeleteFile_DataRoom_Window_DeleteButton()
	{
		waitForElementToDisplay(btn_DeleteFile_DataRoom_ModalDialogWindow_Delete, this.elementLoadWaitTime);
		clickOn(btn_DeleteFile_DataRoom_ModalDialogWindow_Delete);
	}
	/**
	*This method is used to verify the deletion of file in Data Room.
	*
	*@author VijayaKumar.U
	*/
	public void click_DeleteFile_DataRoom_Window_Close()
	{
		try 
		{
		waitForElementToDisplay(lnk_DeleteFile_DataRoom_ModalDialogWindow_Close, this.elementLoadWaitTime);
		clickOn(lnk_DeleteFile_DataRoom_ModalDialogWindow_Close);}
		catch (Exception e){
		testStepFailed("Element is not displayed."+e.getClass());
		}}


	/*********************************Delete File of Data Room***********************/


	/*********************************Delete Folder of Data Room***********************/
	/**
	*This method is used to verify the display of the delete folder in data room.
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
	*This method is used to verify the folder name in the delete folder window of the data room.
	*
	*@author VijayaKumar.U
	*/
	public void verify_CorrectDeleteFolder_DataRoom_Window_FileName_displayed(String folderName)
	{
		waitForElementToDisplay(lbl_DeleteFolder_DataRoom_ModalDialogWindow_FolderName, this.elementLoadWaitTime);
		String folderNameinDeleteFileWindowFull = getText(lbl_DeleteFolder_DataRoom_ModalDialogWindow_FolderName).trim();
		String editedText = folderNameinDeleteFileWindowFull.substring(folderNameinDeleteFileWindowFull.lastIndexOf("")+1, folderNameinDeleteFileWindowFull.length()-1).trim();
		String fileNameinDeleteFileWindow = editedText;
		try 
		{
			if (fileNameinDeleteFileWindow.equalsIgnoreCase(folderName)) 
			{
				testStepPassed("Correct Delete Folder window for the Folder "+folderName+" is displayed");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Correct Delete Folder window for the Folder "+folderName+" is not displayed."+e.getClass());
		}
	}

	/**
	*This method is used to verify the delete button in data room.
	*
	*@author VijayaKumar.U
	*/
	public void click_DeleteFolder_DataRoom_Window_DeleteButton()
	{
		waitForElementToDisplay(btn_DeleteFolder_DataRoom_ModalDialogWindow_DeleteFolder, this.elementLoadWaitTime);
		clickOn(btn_DeleteFolder_DataRoom_ModalDialogWindow_DeleteFolder);
	}
	/**
	*This method is used to delete folder in data room.
	*
	*@author VijayaKumar.U
	*/
	public void click_DeleteFolder_DataRoom_Window_Close()
	{
		waitForElementToDisplay(lnk_DeleteFolder_DataRoom_ModalDialogWindow_CloseWindow, this.elementLoadWaitTime);
		clickOn(lnk_DeleteFolder_DataRoom_ModalDialogWindow_CloseWindow);
	}

	/**
	*This method is used to verify the folder name in delete mode in data room .
	*
	*@author VijayaKumar.U
	*/
	public void verify_DataRoomPage_CompanyProfileSection_DeleteFolder(String folderName)
	{
		verify_DeleteFolder_DataRoom_Window_displayed();

		verify_CorrectDeleteFolder_DataRoom_Window_FileName_displayed(folderName);

		click_DeleteFolder_DataRoom_Window_DeleteButton();
	}
	/*********************************Delete Folder of Data Room***********************/



	/*********************************Company Profile Page Data Room***********************************************/






	/*********************************Add Admin Staff in User Settings Page***********************/
	/**
	*This method is used to select the salutation in settings page as admin staff.
	*
	*@author VijayaKumar.U
	*/
	public void select_Salutation_AddAdminStaff_Window_SettingsPage(String salutation)
	{
		waitForElementToDisplay(drp_AddAdminStaff_SettingsPage_ModalDialogWindow_Salutation, this.elementLoadWaitTime);
		selectFromDropdown(drp_AddAdminStaff_SettingsPage_ModalDialogWindow_Salutation, salutation);
	}

	/**
	*This method is used to enter the first name in settings page as admin staff.
	*
	*@author VijayaKumar.U
	*/
	public void enter_FirstName_AddAdminStaff_Window_SettingsPage(String firstName)
	{
		waitForElementToDisplay(txt_AddAdminStaff_SettingsPage_ModalDialogWindow_FirstName, this.elementLoadWaitTime);
		clearEditBox(txt_AddAdminStaff_SettingsPage_ModalDialogWindow_FirstName);
		typeIn(txt_AddAdminStaff_SettingsPage_ModalDialogWindow_FirstName, firstName);
	}
	/**
	*This method is used to enter the last name in settings page as admin staff.
	*
	*@author VijayaKumar.U
	*/
	public void enter_LastName_AddAdminStaff_Window_SettingsPage(String lastName)
	{
		waitForElementToDisplay(txt_AddAdminStaff_SettingsPage_ModalDialogWindowLastName, this.elementLoadWaitTime);
		clearEditBox(txt_AddAdminStaff_SettingsPage_ModalDialogWindowLastName);
		typeIn(txt_AddAdminStaff_SettingsPage_ModalDialogWindowLastName, lastName);
	}
	/**
	*This method is used to edit the email details in settings page of admin staff.
	*
	*@author VijayaKumar.U
	*/
	public void enter_Email_AddAdminStaff_Window_SettingsPage(String email)
	{
		waitForElementToDisplay(txt_AddAdminStaff_SettingsPage_ModalDialogWindow_Email, this.elementLoadWaitTime);
		clearEditBox(txt_AddAdminStaff_SettingsPage_ModalDialogWindow_Email);
		typeIn(txt_AddAdminStaff_SettingsPage_ModalDialogWindow_Email, email);
	}
	/**
	*This method is used to clear and enter the job title in the dialog window of the admin staff settings.
	*
	*@author VijayaKumar.U
	*/
	public void enter_JobTitle_AddAdminStaff_Window_SettingsPage(String jobTitle)
	{
		waitForElementToDisplay(txt_AddAdminStaff_SettingsPage_ModalDialogWindow_JobTitle, this.elementLoadWaitTime);
		clearEditBox(txt_AddAdminStaff_SettingsPage_ModalDialogWindow_JobTitle);
		typeIn(txt_AddAdminStaff_SettingsPage_ModalDialogWindow_JobTitle, jobTitle);
	}
	/**
	*This method is used to enter the phone contact in settings page .
	*
	*@author VijayaKumar.U
	*/
	public void enter_Phone_AddAdminStaff_Window_SettingsPage(String phone)
	{
		waitForElementToDisplay(txt_AddAdminStaff_SettingsPage_ModalDialogWindow_Phone, this.elementLoadWaitTime);
		clearEditBox(txt_AddAdminStaff_SettingsPage_ModalDialogWindow_Phone);
		typeIn(txt_AddAdminStaff_SettingsPage_ModalDialogWindow_Phone, phone);
	}
	/**
	*This method is used to select system access in settings page of Add Admin.
	*
	*@author VijayaKumar.U
	*/
	public void select_SystemAccess_AddAdminStaff_Window_SettingsPage(String systemAccess)
	{
		waitForElementToDisplay(drp_AddAdminStaff_SettingsPage_ModalDialogWindow_SystemAccess, this.elementLoadWaitTime);
		selectFromDropdown(drp_AddAdminStaff_SettingsPage_ModalDialogWindow_SystemAccess, systemAccess);
	}
	/**
	*This method is used to select the investment committee member in settings page.
	*
	*@author VijayaKumar.U
	*/
	public void select_InvestmentCommitteeMember_AddAdminStaff_Window_SettingsPage(String investmentCommitteeMember)
	{
		waitForElementToDisplay(drp_AddAdminStaff_SettingsPage_ModalDialogWindow_InvestmentCommitteeMember, this.elementLoadWaitTime);
		selectFromDropdown(drp_AddAdminStaff_SettingsPage_ModalDialogWindow_InvestmentCommitteeMember, investmentCommitteeMember);
	}
	/**
	*This method is used to select mentor in settings page.
	*
	*@author VijayaKumar.U
	*/
	public void select_Mentor_AddAdminStaff_Window_SettingsPage(String mentor)
	{
		waitForElementToDisplay(drp_AddAdminStaff_SettingsPage_ModalDialogWindow_Mentor, this.elementLoadWaitTime);
		selectFromDropdown(drp_AddAdminStaff_SettingsPage_ModalDialogWindow_Mentor, mentor);
	}
	/**
	*This method is used to send invite to admin Staff in settings.
	*
	*@author VijayaKumar.U
	*/
	public void click_SendInvite_AddAdminStaff_Window_SettingsPage()
	{
		waitForElementToDisplay(chk_AddAdminStaff_SettingsPage_ModalDialogWindow_SendInvite, this.elementLoadWaitTime);
		clickOn(chk_AddAdminStaff_SettingsPage_ModalDialogWindow_SendInvite);
	}
	/**
	*This method is used to verify the visibility of the File upload in Data Room.
	*
	*@author VijayaKumar.U
	*/
	public void click_AddTeamMember_Button_AddAdminStaff_Window_SettingsPage()
	{
		waitForElementToDisplay(btm_AddAdminStaff_SettingsPage_ModalDialogWindow_AddTeamMember, this.elementLoadWaitTime);
		clickOn(btm_AddAdminStaff_SettingsPage_ModalDialogWindow_AddTeamMember);
	}
	/**
	*This method is used to fill the team member admin settings.
	*
	*@author VijayaKumar.U
	*/
	public void fill_AddTeamMember_AddAdminStaff_Window_SettingsPage(String salutation, String firstName, String lastName, String email, String jobTitle, String phone, String systemAccess, String investmentCommitteeMember, String mentor)
	{
		select_Salutation_AddAdminStaff_Window_SettingsPage(salutation);

		enter_FirstName_AddAdminStaff_Window_SettingsPage(firstName);

		enter_LastName_AddAdminStaff_Window_SettingsPage(lastName);

		enter_Email_AddAdminStaff_Window_SettingsPage(email);

		enter_JobTitle_AddAdminStaff_Window_SettingsPage(jobTitle);

		enter_Phone_AddAdminStaff_Window_SettingsPage(phone);

		select_SystemAccess_AddAdminStaff_Window_SettingsPage(systemAccess);

		select_InvestmentCommitteeMember_AddAdminStaff_Window_SettingsPage(investmentCommitteeMember);

		select_Mentor_AddAdminStaff_Window_SettingsPage(mentor);

		
	}
	/**
	*This method is used to verify the visibility of the Staff Added Successfully Message.
	*
	*@author VijayaKumar.U
	*/
	public void click_AddTeamMemberButton_AddTeamMember_AddAdminStaff_Window_SettingsPage()
	{
		click_AddTeamMember_Button_AddAdminStaff_Window_SettingsPage();
	}
	/**
	*This method is used to verify the visibility of the Staff Added Successfully Message.
	*
	*@author VijayaKumar.U
	*/
	public void AddTeamMember_AddAdminStaff_Window_SettingsPage(String salutation, String firstName, String lastName, String email, String jobTitle, String phone, String systemAccess, String investmentCommitteeMember, String mentor)
	{
		fill_AddTeamMember_AddAdminStaff_Window_SettingsPage(salutation, firstName, lastName, email, jobTitle, phone, systemAccess, investmentCommitteeMember, mentor);

		click_AddTeamMemberButton_AddTeamMember_AddAdminStaff_Window_SettingsPage();
	}
	/**
	*This method is used to verify the visibility of the Staff Added Successfully Message.
	*
	*@author VijayaKumar.U
	*/
	public void verify_AddTeamMember_SuccessMessage_displayed_AddAdminStaff_Window_SettingsPage()
	{
		try 
		{
			waitForElementToDisplay(lbl_AddAdminStaff_SettingsPage_ModalDialogWindow_StaffAddedSuccessMessage, this.elementLoadWaitTime);

			if (isElementDisplayed(lbl_AddAdminStaff_SettingsPage_ModalDialogWindow_StaffAddedSuccessMessage)) 
			{
				testStepPassed("Staff Added Successfully Message is displayed");

				clickOn(btm_AddAdminStaff_SettingsPage_ModalDialogWindow_StaffAddedSuccessMessage_Ok);
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Staff Added Successfully Message is not displayed");
		}
	}


	/*********************************Add Admin Staff in User Settings Page***********************/






	/*********************************Add New User in User Settings Page***********************/
	/**
	*This method is used to verify the visibility of the Staff Added Successfully Message.
	*
	*@author VijayaKumar.U
	*/
	public void select_Salutation_AddNewUser_Window_SettingsPage(String salutation)
	{
		waitForElementToDisplay(drp_AddAdminUserSettingsPage_ModalDialogWindow_Salutation, this.elementLoadWaitTime);
		selectFromDropdown(drp_AddAdminUserSettingsPage_ModalDialogWindow_Salutation, salutation);
	}
	/**
	*This method is used to verify the visibility of the Staff Added Successfully Message.
	*
	*@author VijayaKumar.U
	*/
	public void enter_FirstName_AddNewUser_Window_SettingsPage(String firstName)
	{
		waitForElementToDisplay(txt_AddAdminUserSettingsPage_ModalDialogWindow_FirstName, this.elementLoadWaitTime);
		typeIn(txt_AddAdminUserSettingsPage_ModalDialogWindow_FirstName, firstName);
	}
	/**
	*This method is used to verify the visibility of the Staff Added Successfully Message.
	*
	*@author VijayaKumar.U
	*/
	public void enter_LastName_AddNewUser_Window_SettingsPage(String lastName)
	{
		waitForElementToDisplay(txt_AddAdminUserSettingsPage_ModalDialogWindow_LastName, this.elementLoadWaitTime);
		typeIn(txt_AddAdminUserSettingsPage_ModalDialogWindow_LastName, lastName);
	}
	/**
	*This method is used to verify the visibility of the Staff Added Successfully Message.
	*
	*@author VijayaKumar.U
	*/
	public void enter_Email_AddNewUser_Window_SettingsPage(String email)
	{
		waitForElementToDisplay(txt_AddAdminUserSettingsPage_ModalDialogWindow_Email, this.elementLoadWaitTime);
		typeIn(txt_AddAdminUserSettingsPage_ModalDialogWindow_Email, email);
	}
	/**
	*This method is used to verify the visibility of the Staff Added Successfully Message.
	*
	*@author VijayaKumar.U
	*/
	public void enter_JobTitle_AddNewUser_Window_SettingsPage(String Jobtitle)
	{
		waitForElementToDisplay(txt_AddAdminUserSettingsPage_ModalDialogWindow_JobTitle, this.elementLoadWaitTime);
		typeIn(txt_AddAdminUserSettingsPage_ModalDialogWindow_JobTitle, Jobtitle);
	}
	/**
	*This method is used to verify the visibility of the Staff Added Successfully Message.
	*
	*@author VijayaKumar.U
	*/
	public void enter_PhoneNo_AddNewUser_Window_SettingsPage(String phoneNo)
	{
		waitForElementToDisplay(txt_AddAdminUserSettingsPage_ModalDialogWindow_Phone, this.elementLoadWaitTime);
		typeIn(txt_AddAdminUserSettingsPage_ModalDialogWindow_Phone, phoneNo);
	}
	/**
	*This method is used to verify the visibility of the Staff Added Successfully Message.
	*
	*@author VijayaKumar.U
	*/
	public void enter_LinkedIn_AddNewUser_Window_SettingsPage(String linnkedIn)
	{
		waitForElementToDisplay(txt_AddAdminUserSettingsPage_ModalDialogWindow_LinkedIn, this.elementLoadWaitTime);
		typeIn(txt_AddAdminUserSettingsPage_ModalDialogWindow_LinkedIn, linnkedIn);
	}
	/**
	*This method is used to verify the visibility of the Staff Added Successfully Message.
	*
	*@author VijayaKumar.U
	*/
	public void enter_AboutPerson_AddNewUser_Window_SettingsPage(String aboutPerson)
	{
		waitForElementToDisplay(txt_AddAdminUserSettingsPage_ModalDialogWindow_AboutPerson, this.elementLoadWaitTime);
		typeIn(txt_AddAdminUserSettingsPage_ModalDialogWindow_AboutPerson, aboutPerson);
	}
	/**
	*This method is used to verify the visibility of the Staff Added Successfully Message.
	*
	*@author VijayaKumar.U
	*/
	public void enter_Address_AddNewUser_Window_SettingsPage(String address)
	{
		waitForElementToDisplay(txt_AddAdminUserSettingsPage_ModalDialogWindow_Address, this.elementLoadWaitTime);
		typeIn(txt_AddAdminUserSettingsPage_ModalDialogWindow_Address, address);
	}
	/**
	*This method is used to verify the visibility of the Staff Added Successfully Message.
	*
	*@author VijayaKumar.U
	*/
	public void enter_Apartment_AddNewUser_Window_SettingsPage(String apartment)
	{
		waitForElementToDisplay(txt_AddAdminUserSettingsPage_ModalDialogWindow_Appartment, this.elementLoadWaitTime);
		typeIn(txt_AddAdminUserSettingsPage_ModalDialogWindow_Appartment, apartment);
	}
	/**
	*This method is used to verify the visibility of the Staff Added Successfully Message.
	*
	*@author VijayaKumar.U
	*/
	public void enter_City_AddNewUser_Window_SettingsPage(String city)
	{
		waitForElementToDisplay(txt_AddAdminUserSettingsPage_ModalDialogWindow_City, this.elementLoadWaitTime);
		typeIn(txt_AddAdminUserSettingsPage_ModalDialogWindow_City, city);
	}
	/**
	*This method is used to verify the visibility of the Staff Added Successfully Message.
	*
	*@author VijayaKumar.U
	*/
	public void enter_State_AddNewUser_Window_SettingsPage(String state)
	{
		waitForElementToDisplay(txt_AddAdminUserSettingsPage_ModalDialogWindow_State, this.elementLoadWaitTime);
		typeIn(txt_AddAdminUserSettingsPage_ModalDialogWindow_State, state);
	}
	/**
	*This method is used to verify the visibility of the Staff Added Successfully Message.
	*
	*@author VijayaKumar.U
	*/
	public void enter_PostalCode_AddNewUser_Window_SettingsPage(String postalCode)
	{
		waitForElementToDisplay(txt_AddAdminUserSettingsPage_ModalDialogWindow_PostalCode, this.elementLoadWaitTime);
		typeIn(txt_AddAdminUserSettingsPage_ModalDialogWindow_PostalCode, postalCode);
	}
	/**
	*This method is used to verify the visibility of the Staff Added Successfully Message.
	*
	*@author VijayaKumar.U
	*/
	

	public void select_Country_AddNewUser_Window_SettingsPage(String country)
	{
		waitForElementToDisplay(txt_AddAdminUserSettingsPage_ModalDialogWindow_Country, this.elementLoadWaitTime);
		typeIn(txt_AddAdminUserSettingsPage_ModalDialogWindow_Country, country);
		waitForElementToDisplay(lst_AutoCompleteList_Country_AddAdminUserSettingsPage_ModalDialogWindow, this.elementLoadWaitTime);
		driver.findElement(By.xpath("//div[contains(@id,'modal-add-admin-user') and contains(@class,'show')]//input[contains(@placeholder,'Country')]//parent::div//div[contains(@class,'autcomplete-list')]//a[@title='"+country+"']")).click();
	}
	/**
	*This method is used to select the account type in the corresponding window.
	*
	*@author VijayaKumar.U
	*/
	public void select_AccountType_AddNewUser_Window_SettingsPage(String accountType)
	{
		waitForElementToDisplay(drp_AddAdminUserSettingsPage_ModalDialogWindow_AccountType, this.elementLoadWaitTime);
		selectFromDropdown(drp_AddAdminUserSettingsPage_ModalDialogWindow_AccountType, accountType);
	}
	/**
	*This method is used to select the type od business in the corresponding window.
	*
	*@author VijayaKumar.U
	*/
	public void select_TypeOfBusiness_AddNewUser_Window_SettingsPage(String typeOfBusiness)
	{
		waitForElementToDisplay(drp_AddAdminUserSettingsPage_ModalDialogWindow_Typeofbusiness, this.elementLoadWaitTime);
		selectFromDropdown(drp_AddAdminUserSettingsPage_ModalDialogWindow_Typeofbusiness, typeOfBusiness);
	}
	/**
	*This method is used to select the listing added added by the user.
	*
	*@author VijayaKumar.U
	*/
	public void select_ListingAddedBy_AddNewUser_Window_SettingsPage(String listingAddedBy)
	{
		waitForElementToDisplay(drp_AddAdminUserSettingsPage_ModalDialogWindow_ListingAddedBy, this.elementLoadWaitTime);
		selectFromDropdown(drp_AddAdminUserSettingsPage_ModalDialogWindow_ListingAddedBy, listingAddedBy);
	}
	/**
	*This method is used to select the send invite in the window.
	*
	*@author VijayaKumar.U
	*/
	public void select_SendInvite_AddNewUser_Window_SettingsPage(String sendInvite)	{
		waitForElementToDisplay(drp_AddAdminUserSettingsPage_ModalDialogWindow_SendInvite, this.elementLoadWaitTime);
		selectFromDropdown(drp_AddAdminUserSettingsPage_ModalDialogWindow_SendInvite, sendInvite);
	}
	/**
	*This method is used to select the industry in the settings window
	*
	*@author VijayaKumar.U
	*/
	public void select_Industry_AddNewUser_Window_SettingsPage(String industry)	{
		waitForElementToDisplay(drp_AddAdminUserSettingsPage_ModalDialogWindow_Industry, this.elementLoadWaitTime);
		clickOn(drp_AddAdminUserSettingsPage_ModalDialogWindow_Industry);
		waitTime(1);
		typeIn(txt_AddAdminUserSettingsPage_ModalDialogWindow_Industry, industry);
		waitTime(1);
		List <WebElement> optlst = driver.findElements(By.xpath("//div[contains(@id,'modal-add-admin-user') and contains(@class,'show')]//label[contains(text(),'Industry')]//following::div[contains(@class,'multiselect')]//div[contains(@class,'multiselect__select')]//parent::div[contains(@class,'multiselect')]//ul[contains(@class,'multiselect__content')]//li//span//span"));
		int optlstcount = optlst.size();
		for (WebElement opt : optlst) 
		{
			String text = opt.getText();
			if (text.equalsIgnoreCase(industry)) 
			{
				opt.click();
				break;
			}		}	}
	/**
	*This method is used to click the add individual button in the settings page
	*
	*@author VijayaKumar.U
	*/
	public void click_AddIndividual_Button_AddNewUser_Window_SettingsPage()
	{
		driver.findElement(By.xpath("//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]")).click();
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'modal-add-admin-user') and contains(@class,'show')]//button[contains(text(),'Add individual')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

		waitForElementToDisplay(btn_AddAdminUserSettingsPage_ModalDialogWindow_AddIndividual, this.elementLoadWaitTime);
		clickOn(btn_AddAdminUserSettingsPage_ModalDialogWindow_AddIndividual);
	}
	/**
	*This method is used to click the 
	*
	*@author VijayaKumar.U
	*/
	public void click_AddOrganization_AddNewUser_Window_SettingsPage()
	{
		driver.findElement(By.xpath("//div[contains(@id,'modal-add-admin-user')]//div[contains(@class,'modal-dialog modal')]")).click();
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'modal-add-admin-user') and contains(@class,'show')]//button[contains(text(),'Add organization')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

		waitForElementToDisplay(btn_AddAdminUserSettingsPage_ModalDialogWindow_AddOrganization, this.elementLoadWaitTime);
		clickOn(btn_AddAdminUserSettingsPage_ModalDialogWindow_AddOrganization);
	}
	/**
	*This method is used to 
	*
	*@author VijayaKumar.U
	*/
	public void enter_LegalName_AddOrganization_AddNewUser_Window_SettingsPage(String legalName)
	{
		waitForElementToDisplay(txt_AddNewUserSettingsPage_ModalDialogWindow_AddOrganization_Legalname, this.elementLoadWaitTime);
		clearEditBox(txt_AddNewUserSettingsPage_ModalDialogWindow_AddOrganization_Legalname);
		typeIn(txt_AddNewUserSettingsPage_ModalDialogWindow_AddOrganization_Legalname, legalName);
	}
	/**
	*This method is used to 
	*
	*@author VijayaKumar.U
	*/
	public void enter_LegalName_AddExsistingOrganization_AddNewUser_Window_SettingsPage(String legalName)
	{
		waitForElementToDisplay(txt_AddNewUserSettingsPage_ModalDialogWindow_AddOrganization_Legalname, this.elementLoadWaitTime);
		clearEditBox(txt_AddNewUserSettingsPage_ModalDialogWindow_AddOrganization_Legalname);
		typeIn(txt_AddNewUserSettingsPage_ModalDialogWindow_AddOrganization_Legalname, legalName);

		try 
		{
			waitForElementToDisplay(lst_AddNewUserSettingsPage_ModalDialogWindow_AddOrganization_AutoCompleteListLegalname, this.elementLoadWaitTime);
			if (isElementDisplayed(lst_AddNewUserSettingsPage_ModalDialogWindow_AddOrganization_AutoCompleteListLegalname)) 
			{
				testStepPassed("Company Search Bar auto complete is displayed");
				String getUserProfileNamefromAutoCompleteList = driver.findElement(By.xpath("((//div[contains(@id,'modal-add-admin-org')]//div[contains(@class,'modal-dialog modal')])[1]//label[contains(text(),'Legal name')]/parent::div//input[contains(@name,'company')]//parent::div//div[contains(@class,'autcomplete-list')]//a)[1]")).getAttribute("title").trim();
				try 
				{
					if (getUserProfileNamefromAutoCompleteList.contains(legalName)) 
					{
						testStepPassed("Searched Company Corresponding Profile is displayed");

						waitTime(1);

						driver.findElement(By.xpath("((//div[contains(@id,'modal-add-admin-org')]//div[contains(@class,'modal-dialog modal')])[1]//label[contains(text(),'Legal name')]/parent::div//input[contains(@name,'company')]//parent::div//div[contains(@class,'autcomplete-list')]//a)[1]//div")).click();
					}
				} 
				catch (Exception e) 
				{
					testStepFailed("Searched Company Corresponding Profile is not displayed");
				}
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Company Search Bar auto complete is not displayed");
		}
	}
	/**
	*This method is used to 
	*
	*@author VijayaKumar.U
	*/
	public void enter_Website_AddOrganization_AddNewUser_Window_SettingsPage(String website)
	{
		waitForElementToDisplay(txt_AddNewUserSettingsPage_ModalDialogWindow_AddOrganization_Website, this.elementLoadWaitTime);
		clearEditBox(txt_AddNewUserSettingsPage_ModalDialogWindow_AddOrganization_Website);
		typeIn(txt_AddNewUserSettingsPage_ModalDialogWindow_AddOrganization_Website, website);
	}
	/**
	*This method is used to 
	*
	*@author VijayaKumar.U
	*/
	public void enter_Phone_AddOrganization_AddNewUser_Window_SettingsPage(String phone)
	{
		waitForElementToDisplay(txt_AddNewUserSettingsPage_ModalDialogWindow_AddOrganization_PhoneNumber, this.elementLoadWaitTime);
		clearEditBox(txt_AddNewUserSettingsPage_ModalDialogWindow_AddOrganization_PhoneNumber);
		typeIn(txt_AddNewUserSettingsPage_ModalDialogWindow_AddOrganization_PhoneNumber, phone);
	}
	/**
	*This method is used to 
	*
	*@author VijayaKumar.U
	*/
	public void enter_LinkedIn_AddOrganization_AddNewUser_Window_SettingsPage(String linkedIn)
	{
		waitForElementToDisplay(txt_AddNewUserSettingsPage_ModalDialogWindow_AddOrganization_LinkedIn, this.elementLoadWaitTime);
		clearEditBox(txt_AddNewUserSettingsPage_ModalDialogWindow_AddOrganization_LinkedIn);
		typeIn(txt_AddNewUserSettingsPage_ModalDialogWindow_AddOrganization_LinkedIn, linkedIn);
	}
	/**
	*This method is used to 
	*
	*@author VijayaKumar.U
	*/
	public void enter_Description_AddOrganization_AddNewUser_Window_SettingsPage(String description)
	{
		waitForElementToDisplay(txt_AddNewUserSettingsPage_ModalDialogWindow_AddOrganization_Description, this.elementLoadWaitTime);
		clearEditBox(txt_AddNewUserSettingsPage_ModalDialogWindow_AddOrganization_Description);
		typeIn(txt_AddNewUserSettingsPage_ModalDialogWindow_AddOrganization_Description, description);
	}
	/**
	*This method is used to 
	*
	*@author VijayaKumar.U
	*/
	public void select_EmploymentStatus_AddOrganization_AddNewUser_Window_SettingsPage(String employmentStatus)
	{
		waitForElementToDisplay(drp_AddNewUserSettingsPage_ModalDialogWindow_AddOrganization_EmploymentStatus, this.elementLoadWaitTime);
		selectFromDropdown(drp_AddNewUserSettingsPage_ModalDialogWindow_AddOrganization_EmploymentStatus, employmentStatus);
	}
	/**
	*This method is used to 
	*
	*@author VijayaKumar.U
	*/
	public void select_AddCompanyToPortfolio_AddOrganization_AddNewUser_Window_SettingsPage(String addCompanyToPortfolio)
	{
		waitForElementToDisplay(drp_AddNewUserSettingsPage_ModalDialogWindow_AddOrganization_AddCompanytoPortfolio, this.elementLoadWaitTime);
		selectFromDropdown(drp_AddNewUserSettingsPage_ModalDialogWindow_AddOrganization_AddCompanytoPortfolio, addCompanyToPortfolio);
	}
	/**
	*This method is used to 
	*
	*@author VijayaKumar.U
	*/
	public void click_Clear_Link_AddOrganization_AddNewUser_Window_SettingsPage()
	{
		waitForElementToDisplay(lnk_AddNewUserSettingsPage_ModalDialogWindow_AddOrganization_Clear_AddOrganization, this.elementLoadWaitTime);
		clickOn(lnk_AddNewUserSettingsPage_ModalDialogWindow_AddOrganization_Clear_AddOrganization);
	}
	/**
	*This method is used to 
	*
	*@author VijayaKumar.U
	*/
	public void click_Back_Button_AddOrganization_AddNewUser_Window_SettingsPage()
	{
		waitForElementToDisplay(btn_AddNewUserSettingsPage_ModalDialogWindow_AddOrganization_Back_AddOrganization, this.elementLoadWaitTime);
		clickOn(btn_AddNewUserSettingsPage_ModalDialogWindow_AddOrganization_Back_AddOrganization);
	}
	/**
	*This method is used to 
	*
	*@author VijayaKumar.U
	*/
	public void click_AddNewListing_Button_AddOrganization_AddNewUser_Window_SettingsPage()
	{
		waitForElementToDisplay(btn_AddNewUserSettingsPage_ModalDialogWindow_AddOrganization_AddNewListing, this.elementLoadWaitTime);
		clickOn(btn_AddNewUserSettingsPage_ModalDialogWindow_AddOrganization_AddNewListing);
	}

	/**
	*This method is used to 
	*
	*@author VijayaKumar.U
	*/
	public void fill_AddNewUser_AddNewUser_Window_SettingsPage(String salutation, String firstName, String lastname, String email, String jobTitle, String phone, String linkedIn, String aboutPerson, String address, String apartment, String city, String state, String postalCode, String country, String accountType, String typeOfBusiness, String listingAddedby, String sendInvite, String industry)
	{
		select_Salutation_AddNewUser_Window_SettingsPage(salutation);
		enter_FirstName_AddNewUser_Window_SettingsPage(firstName);
		enter_LastName_AddNewUser_Window_SettingsPage(lastname);
		enter_Email_AddNewUser_Window_SettingsPage(email);
		enter_JobTitle_AddNewUser_Window_SettingsPage(jobTitle);
		enter_PhoneNo_AddNewUser_Window_SettingsPage(phone);
		enter_LinkedIn_AddNewUser_Window_SettingsPage(linkedIn);
		enter_AboutPerson_AddNewUser_Window_SettingsPage(aboutPerson);
		enter_Address_AddNewUser_Window_SettingsPage(address);
		enter_Apartment_AddNewUser_Window_SettingsPage(apartment);
		enter_City_AddNewUser_Window_SettingsPage(city);
		enter_State_AddNewUser_Window_SettingsPage(state);
		enter_PostalCode_AddNewUser_Window_SettingsPage(postalCode);
		select_Country_AddNewUser_Window_SettingsPage(country);
		select_AccountType_AddNewUser_Window_SettingsPage(accountType);
		select_TypeOfBusiness_AddNewUser_Window_SettingsPage(typeOfBusiness);
		
		select_SendInvite_AddNewUser_Window_SettingsPage(sendInvite);
		select_Industry_AddNewUser_Window_SettingsPage(industry);
	}
	/**
	*This method is used to 
	*
	*@author VijayaKumar.U
	*/
	public void fill_Add_NewOrganization_AddNewUser_Window_SettingsPage(String legalName, String website, String phone, String linkedIn, String description, String employmentStatus, String addCompanyToPortfolio)
	{
		enter_LegalName_AddOrganization_AddNewUser_Window_SettingsPage(legalName);
		enter_Website_AddOrganization_AddNewUser_Window_SettingsPage(website);
		enter_Phone_AddOrganization_AddNewUser_Window_SettingsPage(phone);
		enter_LinkedIn_AddOrganization_AddNewUser_Window_SettingsPage(linkedIn);
		enter_Description_AddOrganization_AddNewUser_Window_SettingsPage(description);
		select_EmploymentStatus_AddOrganization_AddNewUser_Window_SettingsPage(employmentStatus);
		select_AddCompanyToPortfolio_AddOrganization_AddNewUser_Window_SettingsPage(addCompanyToPortfolio);
	}
	/**
	*This method is used to 
	*
	*@author VijayaKumar.U
	*/
	public void click_AddNewListing_Button_AddedOrganization_AddNewUser_Window_SettingsPage()
	{
		driver.findElement(By.xpath("(//div[contains(@id,'modal-add-admin-org')]//div[contains(@class,'modal-dialog modal')])[1]")).click();
		WebElement element = driver.findElement(By.xpath("(//div[contains(@id,'modal-add-admin-org')]//div[contains(@class,'modal-dialog modal')])[1]//button[contains(text(),'Add New Listing')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		click_AddNewListing_Button_AddOrganization_AddNewUser_Window_SettingsPage();
	}

	/**
	*This method is used to 
	*
	*@author VijayaKumar.U
	*/
	public void fill_Add_ExistingOrganization_AddNewUser_Window_SettingsPage(String legalName, String employmentStatus)
	{
		enter_LegalName_AddExsistingOrganization_AddNewUser_Window_SettingsPage(legalName);
		select_EmploymentStatus_AddOrganization_AddNewUser_Window_SettingsPage(employmentStatus);
	}

	/**
	*This method is used to 
	*
	*@author VijayaKumar.U
	*/

	public void click_AddIndividualButton_AddNewUser_AddAdminStaff_Window_SettingsPage()
	{
		click_AddIndividual_Button_AddNewUser_Window_SettingsPage();
	}
	/**
	*This method is used to 
	*
	*@author VijayaKumar.U
	*/
	public void click_AddOrganizationButton_AddNewUser_AddAdminStaff_Window_SettingsPage()
	{
		click_AddOrganization_AddNewUser_Window_SettingsPage();
	}
	/**
	*This method is used to 
	*
	*@author VijayaKumar.U
	*/
	public void AddNewIndividualUser_Window_SettingsPage(String salutation, String firstName, String lastName, String email, String jobTitle, String phone, String linkedIn, String aboutPerson, String address, String appartment, String city, String state, String postalCode, 	String country, String accountType, String typeOfbusiness, String listingAddedby, String sendInvite, String industry)
	{
		fill_AddNewUser_AddNewUser_Window_SettingsPage(salutation, firstName, lastName, email, jobTitle, phone, linkedIn, aboutPerson, address, appartment, city, state, postalCode, country, accountType, typeOfbusiness, listingAddedby, sendInvite, industry);

		click_AddIndividualButton_AddNewUser_AddAdminStaff_Window_SettingsPage();
	}
	/**
	*This method is used to 
	*
	*@author VijayaKumar.U
	*/
	public void AddNewUserWithNewOrganization_Window_SettingsPage(String salutation, String firstName, String lastName, String email, String jobTitle, String phone, String linkedIn, String aboutPerson, String address, String appartment, String city, String state, String postalCode, String country, String accountType, String typeOfbusiness, String listingAddedby, String sendInvite, String industry, String legalName, String website, String description, String employmentStatus, String addCompanyToPortfolio)
	{
		fill_AddNewUser_AddNewUser_Window_SettingsPage(salutation, firstName, lastName, email, jobTitle, phone, linkedIn, aboutPerson, address, appartment, city, state, postalCode, country, accountType, typeOfbusiness, listingAddedby, sendInvite, industry);

		click_AddOrganizationButton_AddNewUser_AddAdminStaff_Window_SettingsPage();

		fill_Add_NewOrganization_AddNewUser_Window_SettingsPage(legalName, website, phone, linkedIn, description, employmentStatus, employmentStatus);

		click_AddNewListing_Button_AddedOrganization_AddNewUser_Window_SettingsPage();
	}
	/**
	*This method is used to 
	*
	*@author VijayaKumar.U
	*/
	public void AddNewUserWithExistingOrganization_Window_SettingsPage(String salutation, String firstName, String lastName, String email, String jobTitle, String phone, String linkedIn, String aboutPerson, String address, String appartment, String city, String state, String postalCode, String country, String accountType, String typeOfbusiness, String listingAddedby, String sendInvite, String industry, String legalName, String employmentStatus)
	{
		fill_AddNewUser_AddNewUser_Window_SettingsPage(salutation, firstName, lastName, email, jobTitle, phone, linkedIn, aboutPerson, address, appartment, city, state, postalCode, country, accountType, typeOfbusiness, listingAddedby, sendInvite, industry);

		click_AddOrganizationButton_AddNewUser_AddAdminStaff_Window_SettingsPage();

		fill_Add_ExistingOrganization_AddNewUser_Window_SettingsPage(legalName, employmentStatus);

		click_AddNewListing_Button_AddedOrganization_AddNewUser_Window_SettingsPage();
	}

	
	/**
	*This method is used to 
	*
	*@author VijayaKumar.U
	*/

	public void verify_AddNewUser_SuccessMessage_displayed_AddUser_Window_SettingsPage()
	{
		try 
		{
			waitForElementToDisplay(lbl_AddNewUser_SettingsPage_ModalDialogWindow_NewUserAddedSuccessMessage, this.elementLoadWaitTime);

			if (isElementDisplayed(lbl_AddNewUser_SettingsPage_ModalDialogWindow_NewUserAddedSuccessMessage)) 
			{
				testStepPassed("User Added Successfully Message is displayed");

				clickOn(btm_AddNewUser_SettingsPage_ModalDialogWindow_NewUserAddedSuccessMessage_Ok);
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("User Added Successfully Message is not displayed");
		}
	}

	/*********************************Add New User in User Settings Page***********************/

	/**
	*This method is used to 
	*
	*@author VijayaKumar.U
	*/
	
	public void click_UploadPresentation_DialogWindow_UploadButton()
	{
		waitForElementToDisplay(btn_CompanyProfilePage_UploadPresentation_DialogWindow_Upload, this.elementLoadWaitTime);
		
		clickOn(btn_CompanyProfilePage_UploadPresentation_DialogWindow_Upload);
	}
	/**
	*This method is used to 
	*
	*@author VijayaKumar.U
	*/
	public void enter_fileName_UploadPresentation_DialogWindow_displayed(String fileName)
	{
		waitForElementToDisplay(txt_CompanyProfilePage_UploadPresentation_DialogWindow_FileName, this.elementLoadWaitTime);
		
		typeIn(txt_CompanyProfilePage_UploadPresentation_DialogWindow_FileName, fileName);
	}
	/**
	*This method is used to 
	*
	*@author VijayaKumar.U
	*/
	public void verify_emptyFileName_errorMessage_UploadPresentation_DialogWindow_displayed(String fileName)
	{
		waitForElementToDisplay(txt_CompanyProfilePage_UploadPresentation_DialogWindow_FileName, this.elementLoadWaitTime);
		
		typeIn(txt_CompanyProfilePage_UploadPresentation_DialogWindow_FileName, fileName);
		
		if (driver.findElement(By.xpath("(//div[contains(@id,'modal-upload-presentation')]//div[contains(@class,'modal-content')]//div[contains(@class,'title')]//*[contains(text(),'Upload Presentation')])[1]//parent::div//parent::div//button[contains(text(),'Upload')]")).isDisplayed()) 
		{
			testStepPassed("Upload Button is disabled");
		} 
		else 
		{
			testStepFailed("Upload Button is not disabled");
		}
	}
	/**
	*This method is used to 
	*
	*@author VijayaKumar.U
	*/
	public void verify_FileName_PlaceHolder_UploadPresentation_DialogWindow_displayed()
	{
		waitForElementToDisplay(txt_CompanyProfilePage_UploadPresentation_DialogWindow_FileName, this.elementLoadWaitTime);
		
		String text = getAttributeValue(txt_CompanyProfilePage_UploadPresentation_DialogWindow_FileName, "placeholder");
		
		if (text.contains("Enter name")) 
		{
			testStepPassed("File Name Placeholder text is displayed");
		} 
		else 
		{
			testStepFailed("File Name Placeholder text is not displayed");
		}
	}
	
	
	private static final String lbl_CompanyProfilePage_Profile_MainPage_EditDescription_Dialogwindow = "Edit Description Dialog window of Company Profile Main Page#xpath=//div[contains(@class,'edit-description show')]";
	private static final String txt_CompanyProfilePage_Profile_MainPage_EditDescription_Dialogwindow_Textbox = "Textbox in Edit Description Dialog window of Company Profile Main Page#xpath=//div[contains(@class,'edit-description show')]//div[contains(@class,'note-editable')]";
	private static final String btn_CompanyProfilePage_Profile_MainPage_EditDescription_Dialogwindow_Update = "Updatre Button in Edit Description Dialog window of Company Profile Main Page#xpath=//div[contains(@class,'edit-description show')]//button[contains(text(),'Update')]";
	private static final String lbl_CompanyProfilePage_Profile_MainPage_EditDescription_SuccessWindow = "Success window of  Edit Description Dialog window of Company Profile Main Page#xpath=//div[contains(@class,'icon-success')]";
	private static final String lbl_CompanyProfilePage_Profile_MainPage_EditDescription_SuccessWindow_Text = "Success window Text of  Edit Description Dialog window of Company Profile Main Page#xpath=//div[contains(@class,'icon-success')]//div[contains(text(),'Description section has been updated')]";
	private static final String btn_CompanyProfilePage_Profile_MainPage_EditDescription_SuccessWindow_OK = "Ok Button of Success Window Edit Description Dialog window of Company Profile Main Page#xpath=//div[contains(@class,'icon-success')]//button[contains(text(),'Ok')]";
	/**
	*This method is used to 
	*
	*@author VijayaKumar.U
	*/
	
	public void edit_CompanyDescription_CompanyProfilePage(String companyDescription)
	{
		waitForElementToDisplay(lbl_CompanyProfilePage_Profile_MainPage_EditDescription_Dialogwindow, this.elementLoadWaitTime);

		if (isElementDisplayed(lbl_CompanyProfilePage_Profile_MainPage_EditDescription_Dialogwindow)) 
		{
			testStepPassed("Edit Description window is displayed");

			clearEditBox(txt_CompanyProfilePage_Profile_MainPage_EditDescription_Dialogwindow_Textbox);

			typeIn(txt_CompanyProfilePage_Profile_MainPage_EditDescription_Dialogwindow_Textbox, companyDescription);

			clickOn(btn_CompanyProfilePage_Profile_MainPage_EditDescription_Dialogwindow_Update);

			waitForElementToDisplay(lbl_CompanyProfilePage_Profile_MainPage_EditDescription_SuccessWindow, this.elementLoadWaitTime);

			if (isElementDisplayed(lbl_CompanyProfilePage_Profile_MainPage_EditDescription_SuccessWindow)) 
			{
				testStepPassed("Edit Description Window updated Success is displayed");

				clickOn(btn_CompanyProfilePage_Profile_MainPage_EditDescription_SuccessWindow_OK);
			}
			else
			{
				testStepFailed("Edit Description Window updated Success is not displayed");
			}
		} 
		else 
		{
			testStepFailed("Edit Description window is not displayed");
		}
	}
	
	/**
	*This method is used to 
	*
	*@author VijayaKumar.U
	*/
	public void verify_UploadPresentation_ModalDialogWindow_FileUploadedSuccessMessage()
	{
		try 
		{
			waitForElementToDisplay(lbl_UploadPresentation_ModalDialogWindow_FileUploadedSuccessMessage, this.elementLoadWaitTime);

			if (isElementDisplayed(lbl_UploadPresentation_ModalDialogWindow_FileUploadedSuccessMessage)) 
			{
				testStepPassed("File Uploaded in Upload Prresentation Window is displayed");

				clickOn(btn_UploadPresentation_ModalDialogWindow_FileUploadedSuccessMessage_OK);
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("File Uploaded in Upload Prresentation Window is not displayed");
		}
	}
	/**
	*This method is used to verify the update company data in the corresponding window.
	*
	*@author VijayaKumar.U
	*/

	public void verify_UpdateCompanyData_DialogWindow_displayed()
	{
		waitForElementToDisplay(lbl_CompanyProfilePage_UpdateCompanyData_DialogWindow, this.elementLoadWaitTime);
		
		if (isElementDisplayed(lbl_CompanyProfilePage_UpdateCompanyData_DialogWindow)) 
		{
			testStepPassed("Upload Company data Dialog window is displayed");
		} 
		else 
		{
			testStepFailed("Upload Company data Dialog window is not displayed");
		}
	}
	/**
	*This method is used to verify the upload presentation in the window.
	*
	*@author VijayaKumar.U
	*/
	public void verify_UploadPresentation_DialogWindow_displayed()
	{
		waitForElementToDisplay(lbl_CompanyProfilePage_UploadPresentation_DialogWindow, this.elementLoadWaitTime);
		
		if (isElementDisplayed(lbl_CompanyProfilePage_UploadPresentation_DialogWindow)) 
		{
			testStepPassed("Upload Presentation Dialog window is displayed");
		} 
		else 
		{
			testStepFailed("Upload Presentation Dialog window is not displayed");
		}
	}
	/**
	*This method is used to verify the upload video window.
	*
	*@author VijayaKumar.U
	*/
	public void verify_UploadVideo_DialogWindow_displayed()
	{
		waitForElementToDisplay(lbl_CompanyProfilePage_UploadVideo_DialogWindow, this.elementLoadWaitTime);
		
		if (isElementDisplayed(lbl_CompanyProfilePage_UploadVideo_DialogWindow)) 
		{
			testStepPassed("Upload Video Dialog window is displayed");
		} 
		else 
		{
			testStepFailed("Upload Video Dialog window is not displayed");
		}
	}
	/**
	*This method is used to verify the customise profile window.
	*
	*@author VijayaKumar.U
	*/
	public void verify_CustomizeProfile_DialogWindow_displayed()
	{
		waitForElementToDisplay(lbl_CompanyProfilePage_CustomizeProfile_DialogWindow, this.elementLoadWaitTime);
		
		if (isElementDisplayed(lbl_CompanyProfilePage_CustomizeProfile_DialogWindow)) 
		{
			testStepPassed("Customize Profile Dialog window is displayed");
		} 
		else 
		{
			testStepFailed("Customize Profile Dialog window is not displayed");
		}
	}
	/**
	*This method is used to verify the merge company display in the window.
	*
	*@author VijayaKumar.U
	*/
	public void verify_MergeCompany_DialogWindow_displayed()
	{
		waitForElementToDisplay(lbl_CompanyProfilePage_MergeCompany_DialogWindow, this.elementLoadWaitTime);
		
		if (isElementDisplayed(lbl_CompanyProfilePage_MergeCompany_DialogWindow)) 
		{
			testStepPassed("Merge Company Dialog window is displayed");
		} 
		else 
		{
			testStepFailed("Merge Company Dialog window is not displayed");
		}
	}
	/**
	*This method is used to verify the view user access in corresponding window.
	*
	*@author VijayaKumar.U
	*/
	public void verify_ViewUserAccessListCompany_DialogWindow_displayed()
	{
		waitForElementToDisplay(lbl_CompanyProfilePage_ViewUserAccessList_DialogWindow, this.elementLoadWaitTime);
		
		if (isElementDisplayed(lbl_CompanyProfilePage_ViewUserAccessList_DialogWindow)) 
		{
			testStepPassed("View Access User List Dialog window is displayed");
		} 
		else 
		{
			testStepFailed("View Access User List Dialog window is not displayed");
		}
	}
	/**
	*This method is used to verify the display of print report dialogue window.
	*
	*@author VijayaKumar.U
	*/
	public void verify_PrintReport_DialogWindow_displayed()
	{
		waitForElementToDisplay(lbl_CompanyProfilePage_PrintReport_DialogWindow, this.elementLoadWaitTime);
		
		if (isElementDisplayed(lbl_CompanyProfilePage_PrintReport_DialogWindow)) 
		{
			testStepPassed("Print Report Dialog window is displayed");
		} 
		else 
		{
			testStepFailed("Print Report Dialog window is not displayed");
		}
	}
	/**
	*This method is used to verify the view profile in the window.
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
	*This method is used to click and update the company data.
	*
	*@author VijayaKumar.U
	*/
	public void click_UpdateCompanyData_DialogWindow_CloseLink()
	{
		waitForElementToDisplay(lnk_CompanyProfilePage_UpdateCompanyData_DialogWindow_Close, this.elementLoadWaitTime);
		
		clickOn(lnk_CompanyProfilePage_UpdateCompanyData_DialogWindow_Close);
	}
	/**
	*This method is used to click and upload the representation in the dialog window.
	*
	*@author VijayaKumar.U
	*/
	public void click_UploadPresentation_DialogWindow_CloseLink()
	{
		waitForElementToDisplay(lnk_CompanyProfilePage_UploadPresentation_DialogWindow_Close, this.elementLoadWaitTime);
		
		clickOn(lnk_CompanyProfilePage_UploadPresentation_DialogWindow_Close);
	}
	/**
	*This method is used to verify close operation for video upload window.
	*
	*@author VijayaKumar.U
	*/
	public void click_UploadVideo_DialogWindow_CloseLink()
	{
		waitForElementToDisplay(lnk_CompanyProfilePage_UploadVideo_DialogWindow_Close, this.elementLoadWaitTime);
		
		clickOn(lnk_CompanyProfilePage_UploadVideo_DialogWindow_Close);
	}
	/**
	*This method is used to close the customise profile window.
	*
	*@author VijayaKumar.U
	*/
	public void click_CustomizeProfile_DialogWindow_CloseLink()
	{
		waitForElementToDisplay(lnk_CompanyProfilePage_CustomizeProfile_DialogWindow_Close, this.elementLoadWaitTime);
		
		clickOn(lnk_CompanyProfilePage_CustomizeProfile_DialogWindow_Close);
	}
	/**
	*This method is used to merge and close the company dialog window.
	*
	*@author VijayaKumar.U
	*/
	public void click_MergeCompany_DialogWindow__CloseLink()
	{
		waitForElementToDisplay(lnk_CompanyProfilePage_MergeCompany_DialogWindow_Close, this.elementLoadWaitTime);
		
		clickOn(lnk_CompanyProfilePage_MergeCompany_DialogWindow_Close);
	}
	/**
	*This method is used to verify the view user access link.
	*
	*@author VijayaKumar.U
	*/
	public void click_ViewUserAccessListCompany_DialogWindow__CloseLink()
	{
		waitForElementToDisplay(lnk_CompanyProfilePage_ViewUserAccessList_DialogWindow_Close, this.elementLoadWaitTime);
		
		clickOn(lnk_CompanyProfilePage_ViewUserAccessList_DialogWindow_Close);
	}
	/**
	*This method is used to verify the print report window close operation.
	*
	*@author VijayaKumar.U
	*/
	public void click_PrintReport_DialogWindow__CloseLink()
	{
		waitForElementToDisplay(lnk_CompanyProfilePage_PrintReport_DialogWindow_Close, this.elementLoadWaitTime);
		
		clickOn(lnk_CompanyProfilePage_PrintReport_DialogWindow_Close);
	}
	
	/**
	*This method is used to verify the screenshot manager display.
	*
	*@author VijayaKumar.U
	*/
	public void verify_ScreenshotManager_DialogWindow_displayed()
	{
		waitForElementToDisplay(lbl_CompanyProfilePage_Profile_MainPage_ScreenshotManager_Dialogwindow, this.elementLoadWaitTime);
		
		if (isElementDisplayed(lbl_CompanyProfilePage_Profile_MainPage_ScreenshotManager_Dialogwindow)) 
		{
			testStepPassed("Screenshot Manager Dialog window is displayed");
		} 
		else 
		{
			testStepFailed("Screenshot Manager Dialog window is not displayed");
		}
	}
	/**
	*This method is used to verify the close window operation of screenshot manager.
	*
	*@author VijayaKumar.U
	*/
	public void click_Close_ScreenshotManager_DialogWindow()
	{
		waitForElementToDisplay(lnk_CompanyProfilePage_Profile_MainPage_ScreenshotManager_Dialogwindow_Close, this.elementLoadWaitTime);
		
		clickOn(lnk_CompanyProfilePage_Profile_MainPage_ScreenshotManager_Dialogwindow_Close);
	}
	/**
	*This method is used to verify the placeholder in the screenshot manager.
	*
	*@author VijayaKumar.U
	*/
	public void verify_Placeholder_ScreenshotManager_DialogWindow()
	{
		waitForElementToDisplay(txt_CompanyProfilePage_Profile_MainPage_ScreenshotManager_Dialogwindow_FileName, this.elementLoadWaitTime);
		
		String text = getAttributeValue(txt_CompanyProfilePage_Profile_MainPage_ScreenshotManager_Dialogwindow_FileName, "placeholder");
		
		if (text.contains("Enter alt text")) 
		{
			testStepPassed("Placeholder is displayed correctly for File name textbox in Screenshot Manager Dialog window");
		} 
		else 
		{
			testStepFailed("Placeholder is not displayed correctly for File name textbox in Screenshot Manager Dialog window");
		}
	}
	/**
	*This method is used to enter the filename in screenshot manager.
	*
	*@author VijayaKumar.U
	*/
	public void enter_FileName_ScreenshotManager_DialogWindow(String fileName)
	{
		waitForElementToDisplay(txt_CompanyProfilePage_Profile_MainPage_ScreenshotManager_Dialogwindow_FileName, this.elementLoadWaitTime);
		
		typeIn(txt_CompanyProfilePage_Profile_MainPage_ScreenshotManager_Dialogwindow_FileName, fileName);
	}
	/**
	*This method is used to upload the screenshot in the window.
	*
	*@author VijayaKumar.U
	*/
	public void click_UploadButton_UploadScreenshot_ScreenshotManager_DialogWindow()
	{
		waitForElementToDisplay(btn_CompanyProfilePage_Profile_MainPage_ScreenshotManager_Dialogwindow_UploadScreenshot_Upload, this.elementLoadWaitTime);
		
		clickOn(btn_CompanyProfilePage_Profile_MainPage_ScreenshotManager_Dialogwindow_UploadScreenshot_Upload);
	}
	
	/**
	*This method is used to upload file path in the screenshot manager
	*
	*@param filepath
	*
	*@author VijayaKumar.U
	*/
	public void upload_FilePath_ScreenshotManager_DialogWindow(String filePath)
	{
		waitForElementToDisplay(txt_CompanyProfilePage_Profile_MainPage_ScreenshotManager_Dialogwindow_FileUpload, this.elementLoadWaitTime);
		
		if (driver.findElement(By.xpath("//div[contains(@class,'screenshot-manager')]//input[contains(@type,'file')]")).isDisplayed()) 
		{
			testStepPassed("Upload Button is disabled");			
		} 
		else 
		{
			testStepFailed("Upload Button is not disabled");
		}
	}
	/**
	*This method is used to verify the success message for the file upload.
	*
	*@author VijayaKumar.U
	*/
	public void verify_UploadScreenShotManager_ModalDialogWindow_FileUploadedSuccessMessage()
	{
		try 
		{
			waitForElementToDisplay(lbl_ScreenshotManager_ModalDialogWindow_FileUploadedSuccessMessage, this.elementLoadWaitTime);

			if (isElementDisplayed(lbl_ScreenshotManager_ModalDialogWindow_FileUploadedSuccessMessage)) 
			{
				testStepPassed("File Uploaded in Screenshot Manager Success Message Window is displayed");

				clickOn(btn_ScreenshotManager_ModalDialogWindow_FileUploadedSuccessMessage_OK);
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("File Uploaded in Screenshot Manager Success Message Window is not displayed");
		}
	}
	
	/**
	*This method is used to close the customize profile window.
	*
	*
	*@author VijayaKumar.U
	*/

	public void click_CustomizeProfile_DialogWindow_Close()
	{
		waitForElementToDisplay(lnk_CustomizeProfile_ModalDialogWindow_Close, this.elementLoadWaitTime);
		
		clickOn(lnk_CustomizeProfile_ModalDialogWindow_Close);
	}
	/**
	*This method is used to enterthe primary color in the customize profile window.
	*
	*@param primaryColor
	*
	*@author VijayaKumar.U
	*/
	public void enter_PrimaryColor_CustomizeProfile_DialogWindow(String primaryColor)
	{
		waitForElementToDisplay(txt_CustomizeProfile_ModalDialogWindow_PrimaryBrandcolor, this.elementLoadWaitTime);
		
		typeIn(txt_CustomizeProfile_ModalDialogWindow_PrimaryBrandcolor, primaryColor);
	}
	/**
	*This method is used to enter the secondary color in the customize profile window.
	*
	*@param secondaryColor
	*
	*@author VijayaKumar.U
	*/
	public void enter_SecondaryColor_CustomizeProfile_DialogWindow(String secondaryColor)
	{
		waitForElementToDisplay(txt_CustomizeProfile_ModalDialogWindow_SecondaryBrandcolor, this.elementLoadWaitTime);
		
		typeIn(txt_CustomizeProfile_ModalDialogWindow_SecondaryBrandcolor, secondaryColor);
	}
	/**
	*This method is used to enter the brand color in the window.
*@param brandColor
	*@author VijayaKumar.U
	*/
	public void enter_BrandColor_CustomizeProfile_DialogWindow(String brandColor)
	{
		waitForElementToDisplay(txt_CustomizeProfile_ModalDialogWindow_SuccessBrandcolor, this.elementLoadWaitTime);
		
		typeIn(txt_CustomizeProfile_ModalDialogWindow_SuccessBrandcolor, brandColor);
	}
	/**
	*This method is used to enter the danger color in the customize profile window.
	*@param dangerColor
	*
	*@author VijayaKumar.U
	*/
	public void enter_DangerColor_CustomizeProfile_DialogWindow(String dangerColor)
	{
		waitForElementToDisplay(txt_CustomizeProfile_ModalDialogWindow_DangerBrandcolor, this.elementLoadWaitTime);
		
		typeIn(txt_CustomizeProfile_ModalDialogWindow_DangerBrandcolor, dangerColor);
	}
	/**
	*This method is used to verify the upload button in customize profile window.
	*
	*@author VijayaKumar.U
	*/
	public void click_UploadButton_CustomizeProfile_DialogWindow()
	{
		waitForElementToDisplay(btn_CustomizeProfile_ModalDialogWindow_Upload, this.elementLoadWaitTime);
		
		clickOn(btn_CustomizeProfile_ModalDialogWindow_Upload);
	}
	/**
	*This method is used to verify the place holder of customize profile window.
	*
	*@author VijayaKumar.U
	*/
	public void verify_PlaceholderText_CustomizeProfile_DialogWindow()
	{
		String text = getAttributeValue(txt_CustomizeProfile_ModalDialogWindow_PrimaryBrandcolor, "placeholder");
		
		if (text.contains("i.e.#1498DB")) 
		{
			testStepPassed("Correct Placeholder text is displayed for Primary Color Textbox in Customize Profile Dialog window");
		} 
		else 
		{
			testStepFailed("Correct Placeholder text is not displayed for Primary Color Textbox in Customize Profile Dialog window");
		}
		
		String text2 = getAttributeValue(txt_CustomizeProfile_ModalDialogWindow_SecondaryBrandcolor, "placeholder");
		
		if (text2.contains("i.e.#006096")) 
		{
			testStepPassed("Correct Placeholder text is displayed for Secondary Color Textbox in Customize Profile Dialog window");
		} 
		else 
		{
			testStepFailed("Correct Placeholder text is not displayed for Secondary Color Textbox in Customize Profile Dialog window");
		}
		
		String text3 = getAttributeValue(txt_CustomizeProfile_ModalDialogWindow_SuccessBrandcolor, "placeholder");
		
		if (text3.contains("i.e.#14DB3E")) 
		{
			testStepPassed("Correct Placeholder text is displayed for Success Color Textbox in Customize Profile Dialog window");
		} 
		else 
		{
			testStepFailed("Correct Placeholder text is not displayed for Success Color Textbox in Customize Profile Dialog window");
		}
		
		String text4 = getAttributeValue(txt_CustomizeProfile_ModalDialogWindow_DangerBrandcolor, "placeholder");
		
		if (text4.contains("i.e.rgb(219, 20, 144)")) 
		{
			testStepPassed("Correct Placeholder text is displayed for Danger Color Textbox in Customize Profile Dialog window");
		} 
		else 
		{
			testStepFailed("Correct Placeholder text is not displayed for Danger Color Textbox in Customize Profile Dialog window");
		}
	}
	
	/**
	*This method is used to click and merge the company in the close window.
	*
	*@author VijayaKumar.U
	*/
	public void click_MergeCompany_DialogWindow_Close()
	{
		waitForElementToDisplay(lnk_MergeCompany_ModalDialogWindow_Close, this.elementLoadWaitTime);
		
		clickOn(lnk_MergeCompany_ModalDialogWindow_Close);
	}
	/**
	*This method is used to verify the place holder in the merge company window.
	*
	*@author VijayaKumar.U
	*/
	public void verify_PlaceholderText_MergeCompany_DialogWindow()
	{
		String text = getAttributeValue(txt_MergeCompany_ModalDialogWindow_OrganizationName, "placeholder");
		
		if (text.contains("Enter Organization Name")) 
		{
			testStepPassed("Correct Placeholder text is displayed for Organization Name Textbox in Merge Company Dialog window");
		} 
		else 
		{
			testStepFailed("Correct Placeholder text is not displayed for Organization Name Textbox in Merge Company Dialog window");
		}
	}
	/**
	*This method is used to enter the organization name.
	*
	*@author VijayaKumar.U
	*/
	public void enter_OrganizationName_MergeCompany_DialogWindow(String organizationName)
	{
		waitForElementToDisplay(txt_MergeCompany_ModalDialogWindow_OrganizationName, this.elementLoadWaitTime);
		
		typeIn(txt_MergeCompany_ModalDialogWindow_OrganizationName, organizationName);
	}
	/**
	*This method is used to click and merge the customize profile
	*
	*@author VijayaKumar.U
	*/
	public void click_Submit_MergeCompany_CustomizeProfile_DialogWindow()
	{
		waitForElementToDisplay(btn_MergeCompany_ModalDialogWindow_Submit, this.elementLoadWaitTime);
		
		clickOn(btn_MergeCompany_ModalDialogWindow_Submit);
	}
	/**
	*This method is used to verify the merge of existing company legal name
	*
	*@param company legal name
	*
	*@author VijayaKumar.U
	*/
	public void verify_CompanyMergedWithexisitingCompany(String companyLegalname)
	{
		waitForElementToDisplay(lbl_CompanyProfilePage_MergeCompany_DialogWindow, this.elementLoadWaitTime);
		
		enter_OrganizationName_MergeCompany_DialogWindow(companyLegalname);
		
		waitForElementToDisplay(lst_MergeCompany_ModalDialogWindow_OrganizationName_List, this.elementLoadWaitTime);
		
		driver.findElement(By.xpath("(//div[contains(@class,'modal-content')]//*[contains(text(),'Merge Company')]//parent::div//input[contains(@type,'search')]//parent::div//following-sibling::div[contains(@class,'list')]//a)[1]")).click();
	}
	
	/**
	*This method is used to verify the window display for Add captcha
	*
	*@author VijayaKumar.U
	*/
	
	
	public void verify_AddCaptcha_ModalDialog_Window_displayed()
	{
		
		try 
		{
			waitForElementToDisplay(lbl_AddCaptcha_SettingsPage_ModalDialogWindow, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_AddCaptcha_SettingsPage_ModalDialogWindow))
			{
				testStepPassed("Add Captcha Modal Dialog Window is displayed");	
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Add Captcha Modal Dialog Window is not displayed");
		}
	}
	
	/**
	*This method is used to enter and ipAddress.
	*
	*@author VijayaKumar.U
	*/
	public void enter_IpAddress_AddCaptcha_DialogWindow(String ipAddress)
	{
		waitForElementToDisplay(txt_IPAddress_AddCaptcha_SettingsPage_ModalDialogWindow, this.elementLoadWaitTime);
		
		clearEditBox(txt_IPAddress_AddCaptcha_SettingsPage_ModalDialogWindow);
		
		typeIn(txt_IPAddress_AddCaptcha_SettingsPage_ModalDialogWindow, ipAddress);
	}
	/**
	*This method is used to Add captcha and submit the dialog window
	*
	*
	*@author VijayaKumar.U
	*/
	public void click_Submitbutton_AddCaptcha_DialogWindow()
	{
		waitForElementToDisplay(btn_Submit_AddCaptcha_SettingsPage_ModalDialogWindow, this.elementLoadWaitTime);
		
		clickOn(btn_Submit_AddCaptcha_SettingsPage_ModalDialogWindow);
	}
	/**
	*This method is used to enter and submit the ipAddress.
	*@param ipAddress
	*
	*@author VijayaKumar.U
	*/
	
	public void submit_IpAddress_AddCaptcha_DialogWindow(String ipAddress)
	{
		enter_IpAddress_AddCaptcha_DialogWindow(ipAddress);
		
		click_Submitbutton_AddCaptcha_DialogWindow();
	}
	
	
	
	
	
	
	
}