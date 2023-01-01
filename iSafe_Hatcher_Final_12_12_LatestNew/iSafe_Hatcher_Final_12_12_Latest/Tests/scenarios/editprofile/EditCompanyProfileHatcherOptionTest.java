package scenarios.editprofile;

import iSAFE.ApplicationKeywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseClass.BaseClass;

import pages.MainPage;
import pages.LoginPage;
import pages.RegistrationCompanyPage;
import pages.RegistrationFounderPage;
import pages.RegistrationInvestmentHistoryPage;
import pages.RegistrationVideoInterviewPage;
import pages.UserProfilePage;
import pages.HomePage;
import pages.CompanyProfilePage;
import pages.ProfileUpdateRegistrationPage;
import pages.CohortPage;


public class EditCompanyProfileHatcherOptionTest extends ApplicationKeywords
{
	private Boolean status = false;

	BaseClass obj;

	MainPage mainPage;
	LoginPage loginPage;
	RegistrationCompanyPage registrationCompanyPage;
	RegistrationFounderPage registrationFounderPage;
	RegistrationInvestmentHistoryPage registrationInvestmentHistoryPage;
	RegistrationVideoInterviewPage registrationVideoInterviewPage;
	UserProfilePage userProfilePage;
	HomePage homePage;
	CompanyProfilePage companyProfilePage;
	ProfileUpdateRegistrationPage profileUpdateRegistrationPage;
	CohortPage cohortPage;

	public EditCompanyProfileHatcherOptionTest(BaseClass obj) 
	{
		super(obj);
		this.obj = obj;
	}

	public void mainTest() 
	{
		try
		{
			testStepInfo("");
			testStepInfo("*******************************");
			testStepInfo("Test Execution Started");
			testStepInfo("*******************************");
			testStepInfo("");

			obj.driver = driver;

			mainPage = new MainPage(obj);
			loginPage = new LoginPage(obj);
			registrationCompanyPage = new RegistrationCompanyPage(obj);
			registrationFounderPage = new RegistrationFounderPage(obj);
			registrationInvestmentHistoryPage = new RegistrationInvestmentHistoryPage(obj);
			registrationVideoInterviewPage = new RegistrationVideoInterviewPage(obj);
			userProfilePage = new UserProfilePage(obj);
			homePage = new HomePage(obj);
			companyProfilePage = new CompanyProfilePage(obj);
			profileUpdateRegistrationPage = new ProfileUpdateRegistrationPage(obj);



			testStepInfo("");
			testStepInfo("*******************************");
			testStepInfo("Data Inputs");
			testStepInfo("*******************************");
			testStepInfo("");

			String adminEmailId = retrieve("adminEmailId");
			String adminPassword = retrieve("adminPassword");

			String tempVariable1 = generateRandomString();
			String newCompanyLegalNameData = retrieve("newCompanyLegalName");
			String newCompanyLegalName = newCompanyLegalNameData+tempVariable1;
			String newCompanyWebsite = retrieve("newCompanyWebsite");
			String newCompanyCity = retrieve("newCompanyCity");
			String newCompanyCountry = retrieve("newCompanyCountry");
			String newCompanyDescription = retrieve("newCompanyDescription");
			String tempVariable = getCurrentDateinYearMonthDateFormat();
			String newCompanyIncorporationDate = tempVariable;
			String newCompanyBusinessStatus = retrieve("newCompanyBusinessStatus");
			String newCompanyIndustries = retrieve("newCompanyIndustries");
			String newCompanyUNSDGs = retrieve("newCompanyUNSDGs");

			String newFounderSalutation = retrieve("newFounderSalutation");
			String tempVariable3 = generateRandomString();
			String newFounderFirstNameData = retrieve("newFounderFirstName");
			String newFounderFirstName = newFounderFirstNameData+tempVariable3;
			String tempVariable4 = generateRandomString();
			String newFounderLastNameData = retrieve("newFounderLastName");
			String newFounderLastName = newFounderLastNameData+tempVariable4;
			String newFounderJobTitle = retrieve("newFounderJobTitle");
			String newFounderMobileNumber = retrieve("newFounderMobileNumber");
			String newFounderEmailAddress = retrieve("newFounderEmailAddress");
			String newFounderBio = retrieve("newFounderBio");
			String newFounderHighestEducation = retrieve("newFounderHighestEducation");
			String newFounderProffesionalQualifications = retrieve("newFounderProffesionalQualifications");

			String newInvestmentCapitalAmount = retrieve("newInvestmentCapitalAmount");
			String newInvestmentCurrentInvestmentRound = retrieve("newInvestmentCurrentInvestmentRound");
			String newInvestmentCapitalExchangePercentage = retrieve("newInvestmentCapitalExchangePercentage");
			String newInvestmentFundingRounds = retrieve("newInvestmentFundingRounds");

			String tempVariable2 = generateRandomString();
			String newEditCompanyLegalNameHatcherdata = retrieve("newEditCompanyLegalNameHatcher");
			String newEditCompanyLegalNameHatcher = newEditCompanyLegalNameHatcherdata+tempVariable2;
			String tempVariable5 = generateRandomString();
			String newEditCompanyFriendlyNameHatcherData = retrieve("newEditCompanyFriendlyNameHatcher");
			String newEditCompanyFriendlyNameHatcher = newEditCompanyFriendlyNameHatcherData+tempVariable5;
			String newEditCompanyJurisdictionHatcher = retrieve("newEditCompanyJurisdictionHatcher");
			String newEditCompanyGoverningBodyHatcher = retrieve("newEditCompanyGoverningBodyHatcher");
			String newEditRegistrationNumberHatcher = retrieve("newEditRegistrationNumberHatcher");

			String newEditCompanyFormerNameHatcher = retrieve("newEditCompanyFormerNameHatcher");

			String newEditContactAddressHatcher = retrieve("newEditContactAddressHatcher");
			String newEditContactUnitorSuiteHatcher = retrieve("newEditContactUnitorSuiteHatcher");
			String newEditContactCityHatcher = retrieve("newEditContactCityHatcher");
			String newEditContactPostalCodeHatcher = retrieve("newEditContactPostalCodeHatcher");
			String newEditContactStateHatcher = retrieve("newEditContactStateHatcher");
			String newEditContactCountryHatcher = retrieve("newEditContactCountryHatcher");
			String newEditContactLatitudeHatcher = retrieve("newEditContactLatitudeHatcher");
			String newEditContactLongitudeHatcher = retrieve("newEditContactLongitudeHatcher");
			String newEditContactCompanyEmailHatcher = retrieve("newEditContactCompanyEmailHatcher");
			String newEditContactPhoneHatcher = retrieve("newEditContactPhoneHatcher");

			String newEditDescriptionHatcher = retrieve("newEditDescriptionHatcher");

			String newEditDigitalCrunchbaseHatcherHatcher = retrieve("newEditDigitalCrunchbaseHatcher");
			String newEditDigitalFacebookHatcher = retrieve("newEditDigitalFacebookHatcher");
			String newEditDigitalInstagramHatcher = retrieve("newEditDigitalInstagramHatcher");
			String newEditDigitalAngellistHatcher = retrieve("newEditDigitalAngellistHatcher");
			String newEditDigitalMediumHatcher = retrieve("newEditDigitalMediumHatcher");
			String newEditDigitalLinkedInHatcher = retrieve("newEditDigitalLinkedInHatcher");
			String newEditDigitalPinterestHatcher = retrieve("newEditDigitalPinterestHatcher");
			String newEditDigitalRSSFeedHatcher = retrieve("newEditDigitalRSSFeedHatcher");
			String newEditDigitalTwitterHatcher = retrieve("newEditDigitalTwitterHatcher");
			String newEditDigitalVimeoHatcher = retrieve("newEditDigitalVimeoHatcher");
			String newEditDigitalWebsiteHatcher = retrieve("newEditDigitalWebsiteHatcher");
			String newEditDigitalYouTubeHatcher = retrieve("newEditDigitalYouTubeHatcher");

			String newEditFinanceLegalAuditorHatcher = retrieve("newEditFinanceLegalAuditorHatcher");
			String newEditFinanceLegalBankHatcher = retrieve("newEditFinanceLegalBankHatcher");
			String newEditFinanceLegalBankABANumberHatcher = retrieve("newEditFinanceLegalBankABANumberHatcher");
			String newEditFinanceLegalBankAccountNameHatcher = retrieve("newEditFinanceLegalBankAccountNameHatcher");
			String newEditFinanceLegalBankAccountNumberHatcher = retrieve("newEditFinanceLegalBankAccountNumberHatcher");
			String newEditFinanceLegalBankAddressHatcher = retrieve("newEditFinanceLegalBankAddressHatcher");
			String newEditFinanceLegalBankIntermediaryHatcher = retrieve("newEditFinanceLegalBankIntermediaryHatcher");
			String newEditFinanceLegalIntermediaryBankABANumberHatcher = retrieve("newEditFinanceLegalIntermediaryBankABANumberHatcher");
			String newEditFinanceLegalIntermediaryBankAddressHatcher = retrieve("newEditFinanceLegalIntermediaryBankAddressHatcher");
			String newEditFinanceLegalIntermediaryBankSWIFTBICHatcher = retrieve("newEditFinanceLegalIntermediaryBankSWIFTBICHatcher");
			String newEditFinanceLegalBankSwiftCodeHatcher = retrieve("newEditFinanceLegalBankSwiftCodeHatcher");
			String newEditFinanceLegalBankIBANCodeHatcher = retrieve("newEditFinanceLegalBankIBANCodeHatcher");
			String newEditFinanceLegalBankInstructionsHatcher = retrieve("newEditFinanceLegalBankInstructionsHatcher");
			String newEditFinanceLegalCompanySecretaryHatcher = retrieve("newEditFinanceLegalCompanySecretaryHatcher");
			String newEditFinanceLegalCurrencyHatcher = retrieve("newEditFinanceLegalCurrencyHatcher");
			String newEditFinanceLegalFinancialYearEndHatcher = retrieve("newEditFinanceLegalFinancialYearEndHatcher");
			String newEditFinanceLegalLawFirmHatcher = retrieve("newEditFinanceLegalLawFirmHatcher");

			String newEditIndustryHatcher = retrieve("newEditIndustryHatcher");

			String newEditKeywordHatcher = retrieve("newEditKeywordHatcher");

			String newEditRegionHatcher = retrieve("newEditRegionHatcher");

			String newEditCommunitySettingsAccountStatus = retrieve("newEditCommunitySettingsAccountStatus");
			String newEditCommunitySettingsAccountType = retrieve("newEditCommunitySettingsAccountType");
			String newEditCommunitySettingsBusinessType = retrieve("newEditCommunitySettingsBusinessType");
			String newEditCommunitySettingsDealflowStatus = retrieve("newEditCommunitySettingsDealflowStatus");
			String newEditCommunitySettingsHealthorPortfolioStatus = retrieve("newEditCommunitySettingsHealthorPortfolioStatus");
			String newEditCommunitySettingsPlacementAgent = retrieve("newEditCommunitySettingsPlacementAgent");
			String newEditCommunitySettingsScoreVisibility = retrieve("newEditCommunitySettingsScoreVisibility");


			testStepPassed("Admin Mail Id : "+adminEmailId);
			testStepPassed("Admin Password : "+adminPassword);

			testStepPassed("");
			testStepPassed("New Company Legal Name : "+newCompanyLegalName);
			testStepPassed("New Company Website : "+newCompanyWebsite);
			testStepPassed("New Company City : "+newCompanyCity);
			testStepPassed("New Company Country : "+newCompanyCountry);
			testStepPassed("New CompanyDescription : "+newCompanyDescription);
			testStepPassed("New Company Incorporation Date : "+newCompanyIncorporationDate);
			testStepPassed("New Company Business Status : "+newCompanyBusinessStatus);
			testStepPassed("New Company Industries : "+newCompanyIndustries);
			testStepPassed("New Company UNSDGs : "+newCompanyUNSDGs);

			testStepPassed("");
			testStepPassed("New Founder Salutation : "+newFounderSalutation);
			testStepPassed("New Founder First Name : "+newFounderFirstName);
			testStepPassed("New Founder Last Name : "+newFounderLastName);
			testStepPassed("New Founder Job Title : "+newFounderJobTitle);
			testStepPassed("New Founder Mobile Number : "+newFounderMobileNumber);
			testStepPassed("New Founder Email Address : "+newFounderEmailAddress);
			testStepPassed("New Founder Bio : "+newFounderBio);
			testStepPassed("New Founder Highest Education : "+newFounderHighestEducation);
			testStepPassed("New Founder Proffesional Qualifications : "+newFounderProffesionalQualifications);

			testStepPassed("");
			testStepPassed("New Investment Capital Amount : "+newInvestmentCapitalAmount);
			testStepPassed("New Investment Current Investment Round : "+newInvestmentCurrentInvestmentRound);
			testStepPassed("New Investment Capital Exchange Percentage : "+newInvestmentCapitalExchangePercentage);
			testStepPassed("New Investment Funding Rounds : "+newInvestmentFundingRounds);

			testStepPassed("");
			testStepPassed("Company Edit Data");
			testStepPassed("*********************");
			testStepPassed("Company Legal Name Hatcher Edit Data : "+newEditCompanyLegalNameHatcher);
			testStepPassed("Company Friendly Name Hatcher Edit Data : "+newEditCompanyFriendlyNameHatcher);
			testStepPassed("Company Jurisdiction Hatcher Edit Data : "+newEditCompanyJurisdictionHatcher);
			testStepPassed("Company Governing Body Hatcher Edit Data : "+newEditCompanyGoverningBodyHatcher);
			testStepPassed("Company Registration Number Hatcher Edit Data : "+newEditRegistrationNumberHatcher);

			testStepPassed("");
			testStepPassed("Company Former Names Edit Data");
			testStepPassed("************************************");
			testStepPassed("Company Former Names Hatcher Edit Data : "+newEditCompanyFormerNameHatcher);

			testStepPassed("");
			testStepPassed("Contact Edit Data");
			testStepPassed("**********************");
			testStepPassed("Contact Address Hatcher Edit Data : "+newEditContactAddressHatcher);
			testStepPassed("Contact Unit/Suite Hatcher Edit Data : "+newEditContactUnitorSuiteHatcher);
			testStepPassed("Contact City Hatcher Edit Data : "+newEditContactCityHatcher);
			testStepPassed("Contact Postal code Hatcher Edit Data : "+newEditContactPostalCodeHatcher);
			testStepPassed("Contact State Hatcher Edit Data : "+newEditContactStateHatcher);
			testStepPassed("Contact Country Hatcher Edit Data : "+newEditContactCountryHatcher);
			testStepPassed("Contact Latitude Hatcher Edit Data : "+newEditContactLatitudeHatcher);
			testStepPassed("Contact Longitude Hatcher Edit Data : "+newEditContactLongitudeHatcher);
			testStepPassed("Contact Company Email Hatcher Edit Data : "+newEditContactCompanyEmailHatcher);
			testStepPassed("Contact Phone Hatcher Edit Data : "+newEditContactPhoneHatcher);

			testStepPassed("");
			testStepPassed("Description Edit Data");
			testStepPassed("********************************");
			testStepPassed("Description Hatcher Edit Data : "+newEditDescriptionHatcher);

			testStepPassed("");
			testStepPassed("Digital Edit Data");
			testStepPassed("**********************");
			testStepPassed("Digital  Hatcher Crunchbase Hatcher Edit Data : "+newEditDigitalCrunchbaseHatcherHatcher);
			testStepPassed("Digital  Hatcher Facebook Hatcher Edit Data : "+newEditDigitalFacebookHatcher);
			testStepPassed("Digital  Hatcher Instagram Hatcher Edit Data : "+newEditDigitalInstagramHatcher);
			testStepPassed("Digital  Hatcher Angellist Hatcher Edit Data : "+newEditDigitalAngellistHatcher);
			testStepPassed("Digital  Hatcher Medium Hatcher Edit Data : "+newEditDigitalMediumHatcher);
			testStepPassed("Digital  Hatcher Linked InHatcher Edit Data : "+newEditDigitalLinkedInHatcher);
			testStepPassed("Digital  Hatcher Pinterest Hatcher Edit Data : "+newEditDigitalPinterestHatcher);
			testStepPassed("Digital  Hatcher RSSFeed Hatcher Edit Data : "+newEditDigitalRSSFeedHatcher);
			testStepPassed("Digital  Hatcher Twitter Hatcher Edit Data : "+newEditDigitalTwitterHatcher);
			testStepPassed("Digital  Hatcher Vimeo Hatcher Edit Data : "+newEditDigitalVimeoHatcher);
			testStepPassed("Digital  Hatcher Website HatcherEdit Data : "+newEditDigitalWebsiteHatcher);
			testStepPassed("Digital  Hatcher YouTube HatcherEdit Data : "+newEditDigitalYouTubeHatcher);

			testStepPassed("");
			testStepPassed("Finance and Legal Edit Data");
			testStepPassed("*********************************");
			testStepPassed("Finance and Legal Auditor Hatcher Edit Data : "+newEditFinanceLegalAuditorHatcher);
			testStepPassed("Finance and Legal Bank Hatcher Edit Data : "+newEditFinanceLegalBankHatcher);
			testStepPassed("Finance and Legal Bank ABA Number Hatcher Edit Data : "+newEditFinanceLegalBankABANumberHatcher);
			testStepPassed("Finance and Legal Bank Account Name Hatcher Edit Data : "+newEditFinanceLegalBankAccountNameHatcher);
			testStepPassed("Finance and Legal Bank Account Number Hatcher Edit Data : "+newEditFinanceLegalBankAccountNumberHatcher);
			testStepPassed("Finance and Legal Bank Address Hatcher Edit Data : "+newEditFinanceLegalBankAddressHatcher);
			testStepPassed("Finance and Legal Bank Intermediary Hatcher Edit Data : "+newEditFinanceLegalBankIntermediaryHatcher);
			testStepPassed("Finance and Legal Intermediary Bank ABA Number Hatcher Edit Data : "+newEditFinanceLegalIntermediaryBankABANumberHatcher);
			testStepPassed("Finance and Legal Intermediary Bank Address Hatcher Edit Data : "+newEditFinanceLegalIntermediaryBankAddressHatcher);
			testStepPassed("Finance and Legal Intermediary Bank SWIFT BIC Hatcher Edit Data : "+newEditFinanceLegalIntermediaryBankSWIFTBICHatcher);
			testStepPassed("Finance and Legal Bank Swift Code Hatcher Edit Data : "+newEditFinanceLegalBankSwiftCodeHatcher);
			testStepPassed("Finance and Legal Bank IBAN Code Hatcher Edit Data : "+newEditFinanceLegalBankIBANCodeHatcher);
			testStepPassed("Finance and Legal Bank Instructions Hatcher Edit Data : "+newEditFinanceLegalBankInstructionsHatcher);
			testStepPassed("Finance and Legal Company Secretary Hatcher Edit Data : "+newEditFinanceLegalCompanySecretaryHatcher);
			testStepPassed("Finance and Legal Currency Hatcher Edit Data : "+newEditFinanceLegalCurrencyHatcher);
			testStepPassed("Finance and Legal Financial Year End Hatcher Edit Data : "+newEditFinanceLegalFinancialYearEndHatcher);
			testStepPassed("Finance and Legal Law Firm Hatcher Edit Data : "+newEditFinanceLegalLawFirmHatcher);

			
			testStepPassed("");
			testStepPassed("Industry Edit Data");
			testStepPassed("**********************************");
			testStepPassed("Industry Hatcher Edit Data : "+newEditIndustryHatcher);
			
			testStepPassed("");
			testStepPassed("Keyword Edit Data");
			testStepPassed("**********************************");
			testStepPassed("Keyword Hatcher Edit Data : "+newEditKeywordHatcher);

			testStepPassed("");
			testStepPassed("Regions Names Edit Data");
			testStepPassed("**********************************");
			testStepPassed("Regions Hatcher Edit Data : "+newEditRegionHatcher);

			testStepPassed("");
			testStepPassed("Community Settings Edit Data");
			testStepPassed("***********************************");
			testStepPassed("Community Settings Account Status Hatcher Edit Data : "+newEditCommunitySettingsAccountStatus);
			testStepPassed("Community Settings Account Type Hatcher Edit Data : "+newEditCommunitySettingsAccountType);
			testStepPassed("Community Settings Business Type Hatcher Edit Data : "+newEditCommunitySettingsBusinessType);
			testStepPassed("Community Settings Dealflow Status Hatcher Edit Data : "+newEditCommunitySettingsDealflowStatus);
			testStepPassed("Community Settings Health / Portfolio Status Hatcher Edit Data : "+newEditCommunitySettingsHealthorPortfolioStatus);
			testStepPassed("Community Settings Placement Agent Hatcher Edit Data : "+newEditCommunitySettingsPlacementAgent);
			testStepPassed("Community Settings Score Visibility Hatcher Edit Data : "+newEditCommunitySettingsScoreVisibility);
					
			testStepInfo("");
			testStepInfo("************************************");
			testStepInfo("Execution Steps Started");
			testStepInfo("************************************");
			testStepInfo("");

			clearCookies();

			openApplicationMainPageByHittingURL();
			
			mainPage.verify_MainPage_displayed();

	
			mainPage.click_login_button();

			loginPage.verify_LoginPage_displayed();

			loginPage.loginIntoApplication(adminEmailId, adminPassword);

			userProfilePage.verify_UserProfilePage_OppurtunitiesTab_displayed();
			
			
			/******************************Add Company using Add Deal Option********************************************/

			click_AddDeal_Actions_Menu();
			cohortPage.verify_Cohort_Page_displayed();
			cohortPage.select_Cohort(" value ");//chk in UI
			cohortPage.click_Submit_button();

			registrationCompanyPage.verify_Registration_Company_displayed();

			registrationCompanyPage.fillCompanyInformation(newCompanyLegalName, newCompanyWebsite, newCompanyCity, newCompanyCountry, newCompanyDescription, newCompanyIncorporationDate, newCompanyBusinessStatus, newCompanyIndustries, newCompanyUNSDGs);

			registrationCompanyPage.click_Next_CompanyInformation();

			registrationFounderPage.verify_Registration_Founder_displayed();

			registrationFounderPage.fillFounderCompanyRegistration(newFounderSalutation, newFounderFirstName, newFounderLastName, newFounderJobTitle, newFounderMobileNumber, newFounderEmailAddress, newFounderBio, newFounderHighestEducation, newFounderProffesionalQualifications);

			registrationFounderPage.click_Next_FounderInformation();

			registrationInvestmentHistoryPage.verify_Registration_InvestmentHistory_displayed();

			registrationInvestmentHistoryPage.fillInvestmentInformation(newInvestmentCapitalAmount, newInvestmentCurrentInvestmentRound, newInvestmentCapitalExchangePercentage, newInvestmentFundingRounds);

			registrationInvestmentHistoryPage.click_Next_InvestmentHistory();

			registrationVideoInterviewPage.verify_Registration_VideoInterview_displayed();

			registrationVideoInterviewPage.skipVideoInterview();
			
			profileUpdateRegistrationPage.verify_ProfileUpdateRegistration_Page_displayed();
			
			profileUpdateRegistrationPage.get_InvestorandAccelerator_List();
						
			profileUpdateRegistrationPage.click_UpdateYourProfile_button();

			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_ProfileTab_CompanyProfilePage_displayed();

			companyProfilePage.verify_CorrespondingCompanyProfilePage_displayed_by_CompanyName(newCompanyLegalName);
			

			/******************************Add Company using Add Deal Option********************************************/
			
			
			companyProfilePage.editCompanyProfile();

			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_EditCompany_CompanyProfilePage_displayed();

			companyProfilePage.verify_CompanySection_EditCompany_CompanyProfilePage_displayed();

			companyProfilePage.verify_CompanyFormerNamesSection_EditCompany_CompanyProfilePage_displayed();

			companyProfilePage.verify_ContactDetailsSection_EditCompany_CompanyProfilePage_displayed();

			companyProfilePage.verify_DescriptionSection_EditCompany_CompanyProfilePage_displayed();

			companyProfilePage.verify_DigitalFootprintSection_EditCompany_CompanyProfilePage_displayed();

			companyProfilePage.verify_FinanceandLegalSection_EditCompany_CompanyProfilePage_displayed();

			companyProfilePage.verify_IndustrySection_EditCompany_CompanyProfilePage_displayed();

			companyProfilePage.verify_KeywordsSection_EditCompany_CompanyProfilePage_displayed();

			companyProfilePage.verify_RegionsSection_EditCompany_CompanyProfilePage_displayed();

			companyProfilePage.verify_MarketingMetricsSection_EditCompany_CompanyProfilePage_displayed();

			companyProfilePage.verify_CommunitySettingsSection_EditCompany_CompanyProfilePage_displayed();

			WebElement element = driver.findElement(By.xpath("//div[contains(@id,'company')]//span[contains(text(),'Company')]"));

			scrolltoElementView(element);

			testStepInfo("");
			testStepInfo("Company Section Details Before Editing");
			testStepInfo("***********************************************");

			String CompanySection_LegalName_HatcherOption_Value_BeforeEdited = companyProfilePage.get_CompanySection_LegalName_HatcherOption_Value();
		
			String CompanySection_FriendlyName_HatcherOption_Value_BeforeEdited = companyProfilePage.get_CompanySection_FriendlyName_HatcherOption_Value();

			String CompanySection_IncorporationDate_HatcherOption_Value_BeforeEdited = companyProfilePage.get_CompanySection_IncorporationDate_HatcherOption_Value();

			String CompanySection_Jurisdiction_HatcherOption_Value_BeforeEdited = companyProfilePage.get_CompanySection_Jurisdiction_HatcherOption_Value();

			String CompanySection_GoveringBody_HatcherOption_Value_BeforeEdited = companyProfilePage.get_CompanySection_GoveringBody_HatcherOption_Value();

			String CompanySection_RegistrationNumber_HatcherOption_Value_BeforeEdited = companyProfilePage.get_CompanySection_RegistrationNumber_HatcherOption_Value();

			testStepPassed("Company Section LegalName Hatcher Option Value Before Edited :"+CompanySection_LegalName_HatcherOption_Value_BeforeEdited);

			testStepPassed("Company Section FriendlyName Hatcher Option Value Before Edited :"+CompanySection_FriendlyName_HatcherOption_Value_BeforeEdited);

			testStepPassed("Company Section Incorporation Date Hatcher Option Value Before Edited :"+CompanySection_IncorporationDate_HatcherOption_Value_BeforeEdited);

			testStepPassed("Company Section Jurisdiction Hatcher Option Value Before Edited :"+CompanySection_Jurisdiction_HatcherOption_Value_BeforeEdited);

			testStepPassed("Company Section Govering Body Hatcher Option Value Before Edited :"+CompanySection_GoveringBody_HatcherOption_Value_BeforeEdited);

			testStepPassed("Company Section Registration Number Hatcher Option Value Before Edited :"+CompanySection_RegistrationNumber_HatcherOption_Value_BeforeEdited);

			testStepPassed("");
			
			try 
			{
				if (CompanySection_LegalName_HatcherOption_Value_BeforeEdited.equalsIgnoreCase(newCompanyLegalName)) 
				{
					testStepPassed("Company Legal Name is same as the name entered during the company sign up");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("Company Legal Name is not same as the name entered during the company sign up");
			}
			
			try 
			{
				if (CompanySection_FriendlyName_HatcherOption_Value_BeforeEdited.equalsIgnoreCase(newCompanyLegalName)) 
				{
					testStepPassed("Company Friendly Name is same as the name entered during the company sign up");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("Company Friendly Name is not same as the name entered during the company sign up");
			}
			
			testStepPassed("");

			companyProfilePage.enter_CompanySection_HatcherValues(newEditCompanyLegalNameHatcher, newEditCompanyFriendlyNameHatcher, newCompanyIncorporationDate, newEditCompanyJurisdictionHatcher, newEditCompanyGoverningBodyHatcher, newEditRegistrationNumberHatcher);

			companyProfilePage.click_CompanySection_Save_Changes_Button();

			verify_Company_Section_EditCompanyProfile_Updated_Successfully();

			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_EditCompany_CompanyProfilePage_displayed();

			testStepPassed("");

			String CompanySection_LegalName_HatcherOption_Value_AfterEdited = companyProfilePage.get_CompanySection_LegalName_HatcherOption_Value();

			String CompanySection_FriendlyName_HatcherOption_Value_AfterEdited = companyProfilePage.get_CompanySection_FriendlyName_HatcherOption_Value();

			String CompanySection_IncorporationDate_HatcherOption_Value_AfterEdited = companyProfilePage.get_CompanySection_IncorporationDate_HatcherOption_Value();
		
			String CompanySection_Jurisdiction_HatcherOption_Value_AfterEdited = companyProfilePage.get_CompanySection_Jurisdiction_HatcherOption_Value();

			String CompanySection_GoveringBody_HatcherOption_Value_AfterEdited = companyProfilePage.get_CompanySection_GoveringBody_HatcherOption_Value();

			String CompanySection_RegistrationNumber_HatcherOption_Value_AfterEdited = companyProfilePage.get_CompanySection_RegistrationNumber_HatcherOption_Value();


			testStepInfo("");
			testStepInfo("Company Section Details After Editing");
			testStepInfo("***********************************************");

			testStepPassed("Company Section LegalName Hatcher Option Value After Edited :"+CompanySection_LegalName_HatcherOption_Value_AfterEdited);

			testStepPassed("Company Section FriendlyName Hatcher Option Value After Edited :"+CompanySection_FriendlyName_HatcherOption_Value_AfterEdited);

			testStepPassed("Company Section Incorporation Date Hatcher Option Value After Edited :"+CompanySection_IncorporationDate_HatcherOption_Value_AfterEdited);

			testStepPassed("Company Section Jurisdiction Hatcher Option Value After Edited :"+CompanySection_Jurisdiction_HatcherOption_Value_AfterEdited);

			testStepPassed("Company Section Govering Body Hatcher Option Value After Edited :"+CompanySection_GoveringBody_HatcherOption_Value_AfterEdited);

			testStepPassed("Company Section Registration Number Hatcher Option Value After Edited :"+CompanySection_RegistrationNumber_HatcherOption_Value_AfterEdited);
			
			testStepPassed("");
			
			try 
			{
				if (CompanySection_LegalName_HatcherOption_Value_AfterEdited.equalsIgnoreCase(newEditCompanyLegalNameHatcher)) 
				{
					testStepPassed("Company Section Legal Name Hatcher Value After edited is same as the edited value");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("Company Section Legal Name Hatcher Value After edited is not same as the edited value");
			}
						
			try 
			{
				if (CompanySection_FriendlyName_HatcherOption_Value_AfterEdited.equalsIgnoreCase(newEditCompanyFriendlyNameHatcher)) 
				{
					testStepPassed("Company Section Friendly Name Hatcher Value After edited is same as the edited value");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("Company Section Friendly Name Hatcher Value After edited is not same as the edited value");
			}
									
			try 
			{
				if (CompanySection_Jurisdiction_HatcherOption_Value_AfterEdited.equalsIgnoreCase(newEditCompanyJurisdictionHatcher)) 
				{
					testStepPassed("Company Section Jurisdiction Hatcher Value After edited is same as the edited value");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("Company Section Jurisdiction Hatcher Value After edited is not same as the edited value");
			}
						
			try 
			{
				if (CompanySection_GoveringBody_HatcherOption_Value_AfterEdited.equalsIgnoreCase(newEditCompanyGoverningBodyHatcher)) 
				{
					testStepPassed("Company Section Govering Body Hatcher Value After edited is same as the edited value");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("Company Section Govering Body Hatcher Value After edited is not same as the edited value");
			}
			
			try 
			{
				if (CompanySection_RegistrationNumber_HatcherOption_Value_AfterEdited.equalsIgnoreCase(newEditRegistrationNumberHatcher)) 
				{
					testStepPassed("Company Section Registration Number Hatcher Value After edited is same as the edited value");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("Company Section Registration Number Hatcher Value After edited is not same as the edited value");
			}
			
			testStepPassed("");

			testStepInfo("");
			testStepInfo("Company Former Names Section Details");
			testStepInfo("***************************************************");

			scrollToTopofPage();

			WebElement element2 = driver.findElement(By.xpath("//div[contains(@id,'former-names')]//span[contains(text(),'Company Former Names')]"));

			scrolltoElementView(element2);

			companyProfilePage.enter_CompanyFormerNamesSection_FormerName(newEditCompanyFormerNameHatcher);

			companyProfilePage.click_CompanyFormerNamesSection_SaveChanges_Button();

			companyProfilePage.verify_CompanyFormerNamesSection_Updated_SuccessMessage_displayed(newEditCompanyFormerNameHatcher);

			scrollToTopofPage();

			WebElement element3 = driver.findElement(By.xpath("//div[contains(@id,'contact')]//span[contains(text(),'Contact Details')]"));

			scrolltoElementView(element3);

			testStepInfo("");
			testStepInfo("Contact Section Details Before Editing");
			testStepInfo("***********************************************");

			String ContactSection_MainContact_HatcherOption_Value_BeforeEdited = companyProfilePage.get_ContactSection_MainContact_HatcherOption_Value();

			String ContactSection_Address_HatcherOption_Value_BeforeEdited = companyProfilePage.get_ContactSection_Address_HatcherOption_Value();

			String ContactSection_UnitorSuite_HatcherOption_Value_BeforeEdited = companyProfilePage.get_ContactSection_UnitorSuite_HatcherOption_Value();

			String ContactSection_City_HatcherOption_Value_BeforeEdited = companyProfilePage.get_ContactSection_City_HatcherOption_Value();

			String ContactSection_PostalCode_HatcherOption_Value_BeforeEdited = companyProfilePage.get_ContactSection_PostalCode_HatcherOption_Value();

			String ContactSection_State_HatcherOption_Value_BeforeEdited = companyProfilePage.get_ContactSection_State_HatcherOption_Value();

			String ContactSection_Latitude_HatcherOption_Value_BeforeEdited = companyProfilePage.get_ContactSection_Latitude_HatcherOption_Value();

			String ContactSection_Longitude_HatcherOption_Value_BeforeEdited = companyProfilePage.get_ContactSection_Longitude_HatcherOption_Value();

			String ContactSection_CompanyEmail_HatcherOption_Value_BeforeEdited = companyProfilePage.get_ContactSection_CompanyEmail_HatcherOption_Value();

			String ContactSection_Phone_HatcherOption_Value_BeforeEdited = companyProfilePage.get_ContactSection_Phone_HatcherOption_Value();

			testStepPassed("Contact Section Main Contact Hatcher Option Value Before Edited :"+ContactSection_MainContact_HatcherOption_Value_BeforeEdited);

			testStepPassed("Contact Section Address Hatcher Option Value Before Edited :"+ContactSection_Address_HatcherOption_Value_BeforeEdited);

			testStepPassed("Contact Section Unit / Suite Hatcher Option Value Before Edited :"+ContactSection_UnitorSuite_HatcherOption_Value_BeforeEdited);

			testStepPassed("Contact Section City Hatcher Option Value Before Edited :"+ContactSection_City_HatcherOption_Value_BeforeEdited);

			testStepPassed("Contact Section PostalCode Hatcher Option Value Before Edited :"+ContactSection_PostalCode_HatcherOption_Value_BeforeEdited);

			testStepPassed("Contact Section State Hatcher Option Value Before Edited :"+ContactSection_State_HatcherOption_Value_BeforeEdited);

			testStepPassed("Contact Section Latitude Hatcher Option Value Before Edited :"+ContactSection_Latitude_HatcherOption_Value_BeforeEdited);

			testStepPassed("Contact Section Longitude Hatcher Option Value Before Edited :"+ContactSection_Longitude_HatcherOption_Value_BeforeEdited);

			testStepPassed("Contact Section Company Email Hatcher Option Value Before Edited :"+ContactSection_CompanyEmail_HatcherOption_Value_BeforeEdited);

			testStepPassed("Contact Section Phone Hatcher Option Value Before Edited :"+ContactSection_Phone_HatcherOption_Value_BeforeEdited);

			testStepPassed("");

			WebElement element4 = driver.findElement(By.xpath("//div[contains(@id,'contact')]//span[contains(text(),'Contact Details')]"));

			scrolltoElementView(element4);

			companyProfilePage.clear_ContactSection_HatcherValues();

			companyProfilePage.enter_ContactSection_HatcherValues(newEditContactAddressHatcher, newEditContactUnitorSuiteHatcher, newEditContactCityHatcher, newEditContactPostalCodeHatcher, newEditContactStateHatcher, newEditContactCountryHatcher, newEditContactLatitudeHatcher, newEditContactLongitudeHatcher, newEditContactCompanyEmailHatcher, newEditContactPhoneHatcher);

			companyProfilePage.click_ContactSection_Save_Changes_Button();

			verify_Contact_Section_EditCompanyProfile_Updated_Successfully();

			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_EditCompany_CompanyProfilePage_displayed();

			testStepPassed("");

			WebElement element5 = driver.findElement(By.xpath("//div[contains(@id,'contact')]//span[contains(text(),'Contact Details')]"));

			scrolltoElementView(element5);

			testStepInfo("");
			testStepInfo("Contact Section Details After Editing");
			testStepInfo("***********************************************");

			String ContactSection_MainContact_HatcherOption_Value_AfterEdited = companyProfilePage.get_ContactSection_MainContact_HatcherOption_Value();

			String ContactSection_Address_HatcherOption_Value_AfterEdited = companyProfilePage.get_ContactSection_Address_HatcherOption_Value();
			String ContactSection_UnitorSuite_HatcherOption_Value_AfterEdited = companyProfilePage.get_ContactSection_UnitorSuite_HatcherOption_Value();

			String ContactSection_City_HatcherOption_Value_AfterEdited = companyProfilePage.get_ContactSection_City_HatcherOption_Value();

			String ContactSection_PostalCode_HatcherOption_Value_AfterEdited = companyProfilePage.get_ContactSection_PostalCode_HatcherOption_Value();

			String ContactSection_State_HatcherOption_Value_AfterEdited = companyProfilePage.get_ContactSection_State_HatcherOption_Value();

			String ContactSection_Country_HatcherOption_Value_AfterEdited = companyProfilePage.get_ContactSection_Country_HatcherOption_Value();

			String ContactSection_Latitude_HatcherOption_Value_AfterEdited = companyProfilePage.get_ContactSection_Latitude_HatcherOption_Value();

			String ContactSection_Longitude_HatcherOption_Value_AfterEdited = companyProfilePage.get_ContactSection_Longitude_HatcherOption_Value();

			String ContactSection_CompanyEmail_HatcherOption_Value_AfterEdited = companyProfilePage.get_ContactSection_CompanyEmail_HatcherOption_Value();

			String ContactSection_Phone_HatcherOption_Value_AfterEdited = companyProfilePage.get_ContactSection_Phone_HatcherOption_Value();

			testStepPassed("Contact Section Main Contact Hatcher Option Value After Edited :"+ContactSection_MainContact_HatcherOption_Value_AfterEdited);

			testStepPassed("Contact Section Address Hatcher Option Value After Edited :"+ContactSection_Address_HatcherOption_Value_AfterEdited);

			testStepPassed("Contact Section Unit / Suite Hatcher Option Value After Edited :"+ContactSection_UnitorSuite_HatcherOption_Value_AfterEdited);

			testStepPassed("Contact Section City Hatcher Option Value After Edited :"+ContactSection_City_HatcherOption_Value_AfterEdited);

			testStepPassed("Contact Section PostalCode Hatcher Option Value After Edited :"+ContactSection_PostalCode_HatcherOption_Value_AfterEdited);
			
			testStepPassed("Contac tSection State Hatcher Option Value After Edited :"+ContactSection_State_HatcherOption_Value_AfterEdited);

			testStepPassed("Contact Section Country Hatcher Option Value After Edited :"+ContactSection_Country_HatcherOption_Value_AfterEdited);

			testStepPassed("Contact Section Latitude Hatcher Option Value After Edited :"+ContactSection_Latitude_HatcherOption_Value_AfterEdited);

			testStepPassed("Contact Section Longitude Hatcher Option Value After Edited :"+ContactSection_Longitude_HatcherOption_Value_AfterEdited);

			testStepPassed("Contact Section Company Email Hatcher Option Value After Edited :"+ContactSection_CompanyEmail_HatcherOption_Value_AfterEdited);

			testStepPassed("Contact Section Phone Hatcher Option Value After Edited :"+ContactSection_Phone_HatcherOption_Value_AfterEdited);

			testStepPassed("");
			
			try 
			{
				if (ContactSection_Address_HatcherOption_Value_AfterEdited.equalsIgnoreCase(newEditContactAddressHatcher)) 
				{
					testStepPassed("Contact Section Address Hatcher Value After edited is same as the edited value");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("Contact Section Address Hatcher Value After edited is not same as the edited value");
			}
			
			try 
			{
				if (ContactSection_UnitorSuite_HatcherOption_Value_AfterEdited.equalsIgnoreCase(newEditContactUnitorSuiteHatcher)) 
				{
					testStepPassed("Contact Section Unit / Suite Hatcher Value After edited is same as the edited value");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("Contact Section Unit / Suite Hatcher Value After edited is not same as the edited value");
			}
			
			try 
			{
				if (ContactSection_City_HatcherOption_Value_AfterEdited.equalsIgnoreCase(newEditContactCityHatcher)) 
				{
					testStepPassed("Contact Section City Hatcher Value After edited is same as the edited value");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("Contact Section City Hatcher Value After edited is same as the edited value");
			}
			
			try 
			{
				if (ContactSection_PostalCode_HatcherOption_Value_AfterEdited.equalsIgnoreCase(newEditContactPostalCodeHatcher)) 
				{
					testStepPassed("Contact Section Postal Code Hatcher Value After edited is same as the edited value");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("Contact Section Postal Code Hatcher Value After edited is not same as the edited value");
			}
			
			try 
			{
				if (ContactSection_State_HatcherOption_Value_AfterEdited.equalsIgnoreCase(newEditContactStateHatcher)) 
				{
					testStepPassed("Contact Section State Hatcher Value After edited is same as the edited value");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("Contact Section State Hatcher Value After edited is not same as the edited value");
			}
			
			try 
			{
				if (ContactSection_Latitude_HatcherOption_Value_AfterEdited.equalsIgnoreCase(newEditContactLatitudeHatcher)) 
				{
					testStepPassed("Contact Section Latitude Hatcher Value After edited is same as the edited value");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("Contact Section Latitude Hatcher Value After edited is not same as the edited value");
			}
			
			try 
			{
				if (ContactSection_Longitude_HatcherOption_Value_AfterEdited.equalsIgnoreCase(newEditContactLongitudeHatcher)) 
				{
					testStepPassed("Contact Section Longitude Hatcher Value After edited is same as the edited value");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("Contact Section Longitude Hatcher Value After edited is not same as the edited value");
			}
			
			try 
			{
				if (ContactSection_CompanyEmail_HatcherOption_Value_AfterEdited.equalsIgnoreCase(newEditContactCompanyEmailHatcher)) 
				{
					testStepPassed("Contact Section Company Email Hatcher Value After edited is same as the edited value");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("Contact Section Company Email Hatcher Value After edited is not same as the edited value");
			}
			
			try 
			{
				if (ContactSection_Phone_HatcherOption_Value_AfterEdited.equalsIgnoreCase(newEditContactPhoneHatcher)) 
				{
					testStepPassed("Contact Section Phone Hatcher Value After edited is same as the edited value");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("Contact Section Phone Hatcher Value After edited is not same as the edited value");
			}
		
			
			testStepPassed("");



			scrollToTopofPage();


			WebElement element6 = driver.findElement(By.xpath("//div[contains(@id,'description')]//span[contains(text(),'Description')]"));

			scrolltoElementView(element6);

			testStepInfo("");
			testStepInfo("Description Section Details Before Editing");
			testStepInfo("***********************************************");

			String DescriptionSection_Description_HatcherOption_Value_BeforeEdited = companyProfilePage.get_DescriptionSection_HatcherOption_Value();

			//String DescriptionSection_Description_ClearbitOption_Value_BeforeEdited = companyProfilePage.get_DescriptionSection_ClearbitOption_Value();

			//String DescriptionSection_Description_TwitterOption_Value_BeforeEdited = companyProfilePage.get_DescriptionSection_TwitterOption_Value();

			//String DescriptionSection_Description_LinkedInOption_Value_BeforeEdited = companyProfilePage.get_DescriptionSection_LinkedInOption_Value();


			testStepPassed("Description Section Description Hatcher Option Value Before Edited :"+DescriptionSection_Description_HatcherOption_Value_BeforeEdited);

			//testStepPassed("Description Section Description Clearbit Option Value Before Edited :"+DescriptionSection_Description_ClearbitOption_Value_BeforeEdited);

			//testStepPassed("Description Section Description Twitter Option Value Before Edited :"+DescriptionSection_Description_TwitterOption_Value_BeforeEdited);

			//testStepPassed("Description Section Description LinkedIn Option Value Before Edited :"+DescriptionSection_Description_LinkedInOption_Value_BeforeEdited);

			testStepPassed("");


			companyProfilePage.clear_DescriptionSection_HatcherValues();

			companyProfilePage.enter_DescriptionSection_HatcherValues(newEditDescriptionHatcher);

			companyProfilePage.click_DescriptionSection_Save_Changes_Button();

			verify_Description_Section_EditCompanyProfile_Updated_Successfully();

			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_EditCompany_CompanyProfilePage_displayed();

			WebElement element7 = driver.findElement(By.xpath("//div[contains(@id,'description')]//span[contains(text(),'Description')]"));

			scrolltoElementView(element7);


			testStepInfo("");
			testStepInfo("Description Section Details After Editing");
			testStepInfo("***********************************************");

			String DescriptionSection_Description_HatcherOption_Value_AfterEdited = companyProfilePage.get_DescriptionSection_HatcherOption_Value();

			//String DescriptionSection_Description_ClearbitOption_Value_AfterEdited = companyProfilePage.get_DescriptionSection_ClearbitOption_Value();

			//String DescriptionSection_Description_TwitterOption_Value_AfterEdited = companyProfilePage.get_DescriptionSection_TwitterOption_Value();

			//String DescriptionSection_Description_LinkedInOption_Value_AfterEdited = companyProfilePage.get_DescriptionSection_LinkedInOption_Value();


			testStepPassed("Description Section Description Hatcher Option Value After Edited :"+DescriptionSection_Description_HatcherOption_Value_AfterEdited);

			//testStepPassed("Description Section Description Clearbit Option Value After Edited :"+DescriptionSection_Description_ClearbitOption_Value_AfterEdited);

			//testStepPassed("Description Section Description Twitter Option Value After Edited :"+DescriptionSection_Description_TwitterOption_Value_AfterEdited);

			//testStepPassed("Description Section Description LinkedIn Option Value After Edited :"+DescriptionSection_Description_LinkedInOption_Value_AfterEdited);
			
			testStepPassed("");
			
			try 
			{
				if (DescriptionSection_Description_HatcherOption_Value_AfterEdited.equalsIgnoreCase(newEditDescriptionHatcher)) 
				{
					testStepPassed("Description Section Phone Hatcher Value After edited is same as the edited value");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("Description Section Phone Hatcher Value After edited is not same as the edited value");
			}

			testStepPassed("");




			scrollToTopofPage();

			WebElement element8 = driver.findElement(By.xpath("//div[contains(@id,'digital')]//span[contains(text(),'Digital Footprint')]"));

			scrolltoElementView(element8);


			testStepInfo("");
			testStepInfo("Digital Foot Print Section Details Before Editing");
			testStepInfo("********************************************************");			

			String DigitalFootPrintSection_Crunchbase_HatcherOption_Value_BeforeEdited = companyProfilePage.get_DigitalFootPrintSection_Crunchbase_HatcherOption_Value();

			//String DigitalFootPrintSection_Crunchbase_ClearbitOption_Value_BeforeEdited = companyProfilePage.get_DigitalFootPrintSection_Crunchbase_ClearbitOption_Value();

			String DigitalFootPrintSection_Facebook_HatcherOption_Value_BeforeEdited = companyProfilePage.get_DigitalFootPrintSection_Facebook_HatcherOption_Value();

			//String DigitalFootPrintSection_Facebook_ClearbitOption_Value_BeforeEdited = companyProfilePage.get_DigitalFootPrintSection_Facebook_ClearbitOption_Value();

			String DigitalFootPrintSection_Instagram_HatcherOption_Value_BeforeEdited = companyProfilePage.get_DigitalFootPrintSection_Instagram_HatcherOption_Value();

			String DigitalFootPrintSection_Angellist_HatcherOption_Value_BeforeEdited = companyProfilePage.get_DigitalFootPrintSection_Angellist_HatcherOption_Value();

			String DigitalFootPrintSection_Medium_HatcherOption_Value_BeforeEdited = companyProfilePage.get_DigitalFootPrintSection_Medium_HatcherOption_Value();

			String DigitalFootPrintSection_LinkedIn_HatcherOption_Value_BeforeEdited = companyProfilePage.get_DigitalFootPrintSection_LinkedIn_HatcherOption_Value();

			//String DigitalFootPrintSection_LinkedIn_ClearbitOption_Value_BeforeEdited = companyProfilePage.get_DigitalFootPrintSection_LinkedIn_ClearbitOption_Value();

			String DigitalFootPrintSection_Pinterest_HatcherOption_Value_BeforeEdited = companyProfilePage.get_DigitalFootPrintSection_Pinterest_HatcherOption_Value();

			String DigitalFootPrintSection_RSSFeed_HatcherOption_Value_BeforeEdited = companyProfilePage.get_DigitalFootPrintSection_RSSFeed_HatcherOption_Value();

			String DigitalFootPrintSection_Twitter_HatcherOption_Value_BeforeEdited = companyProfilePage.get_DigitalFootPrintSection_Twitter_HatcherOption_Value();

			//String DigitalFootPrintSection_Twitter_ClearbitOption_Value_BeforeEdited = companyProfilePage.get_DigitalFootPrintSection_Twitter_ClearbitOption_Value();

			String DigitalFootPrintSection_Vimeo_HatcherOption_Value_BeforeEdited = companyProfilePage.get_DigitalFootPrintSection_Vimeo_HatcherOption_Value();

			String DigitalFootPrintSection_Websiter_HatcherOption_Value_BeforeEdited = companyProfilePage.get_DigitalFootPrintSection_Website_HatcherOption_Value();

			//String DigitalFootPrintSection_Websiter_ClearbitOption_Value_BeforeEdited = companyProfilePage.get_DigitalFootPrintSection_Website_ClearbitOption_Value();

			//String DigitalFootPrintSection_Websiter_MOZOption_Value_BeforeEdited = companyProfilePage.get_DigitalFootPrintSection_Website_MOZOption_Value();

			String DigitalFootPrintSection_YouTube_HatcherOption_Value_BeforeEdited = companyProfilePage.get_DigitalFootPrintSection_YouTube_HatcherOption_Value();


			testStepPassed("Digital Foot Print Section Crunchbase Hatcher Option Value Before Edited :"+DigitalFootPrintSection_Crunchbase_HatcherOption_Value_BeforeEdited);

			//testStepPassed("Digital Foot Print Section Crunchbase Clearbit Option Value Before Edited :"+DigitalFootPrintSection_Crunchbase_ClearbitOption_Value_BeforeEdited);

			testStepPassed("Digital Foot Print Section Facebook Hatcher Option Value Before Edited :"+DigitalFootPrintSection_Facebook_HatcherOption_Value_BeforeEdited);

			//testStepPassed("Digital Foot Print Section Facebook Clearbit Option Value Before Edited :"+DigitalFootPrintSection_Facebook_ClearbitOption_Value_BeforeEdited);

			testStepPassed("Digital Foot Print Section Instagram Hatcher Option Value Before Edited :"+DigitalFootPrintSection_Instagram_HatcherOption_Value_BeforeEdited);

			testStepPassed("Digital Foot Print Section Angellist Hatcher Option Value Before Edited :"+DigitalFootPrintSection_Angellist_HatcherOption_Value_BeforeEdited);

			testStepPassed("Digital Foot Print Section Medium Hatcher Option Value Before Edited :"+DigitalFootPrintSection_Medium_HatcherOption_Value_BeforeEdited);

			testStepPassed("Digital Foot Print Section LinkedIn Hatcher Option Value Before Edited :"+DigitalFootPrintSection_LinkedIn_HatcherOption_Value_BeforeEdited);

			//testStepPassed("Digital Foot Print Section LinkedIn Clearbit Option Value Before Edited :"+DigitalFootPrintSection_LinkedIn_ClearbitOption_Value_BeforeEdited);

			testStepPassed("Digital Foot Print Section Pinterest Hatcher Option Value Before Edited :"+DigitalFootPrintSection_Pinterest_HatcherOption_Value_BeforeEdited);

			//testStepPassed("Digital Foot Print Section RSS Feed Hatcher Option Value Before Edited :"+DigitalFootPrintSection_RSSFeed_HatcherOption_Value_BeforeEdited);

			testStepPassed("Digital Foot Print Section Twitter Hatcher Option Value Before Edited :"+DigitalFootPrintSection_Twitter_HatcherOption_Value_BeforeEdited);

			//testStepPassed("Digital Foot Print Section Twitter Clearbit Option Value Before Edited :"+DigitalFootPrintSection_Twitter_ClearbitOption_Value_BeforeEdited);

			testStepPassed("Digital Foot Print Section Vimeo Hatcher Option Value Before Edited :"+DigitalFootPrintSection_Vimeo_HatcherOption_Value_BeforeEdited);

			testStepPassed("Digital Foot Print Section Website Hatcher Option Value Before Edited :"+DigitalFootPrintSection_Websiter_HatcherOption_Value_BeforeEdited);

			//testStepPassed("Digital Foot Print Section Website Clearbit Option Value Before Edited :"+DigitalFootPrintSection_Websiter_ClearbitOption_Value_BeforeEdited);

			//testStepPassed("Digital Foot Print Section Website MOZ Option Value Before Edited :"+DigitalFootPrintSection_Websiter_MOZOption_Value_BeforeEdited);

			testStepPassed("Digital Foot Print Section YouTube Hatcher Option Value Before Edited :"+DigitalFootPrintSection_YouTube_HatcherOption_Value_BeforeEdited);



			testStepPassed("");

			WebElement element9 = driver.findElement(By.xpath("//div[contains(@id,'digital')]//span[contains(text(),'Digital Footprint')]"));

			scrolltoElementView(element9);

			//companyProfilePage.clear_DigitalFootPrintSection_HatcherValues();

			WebElement element10 = driver.findElement(By.xpath("//div[contains(@id,'digital')]//span[contains(text(),'Digital Footprint')]"));

			scrolltoElementView(element10);

			companyProfilePage.enter_DigitalFootPrintSection_HatcherValues(newEditDigitalCrunchbaseHatcherHatcher,newEditDigitalFacebookHatcher,newEditDigitalInstagramHatcher,newEditDigitalAngellistHatcher,newEditDigitalMediumHatcher,newEditDigitalLinkedInHatcher,newEditDigitalPinterestHatcher,newEditDigitalRSSFeedHatcher,newEditDigitalTwitterHatcher,newEditDigitalVimeoHatcher,newEditDigitalWebsiteHatcher,newEditDigitalYouTubeHatcher);

			companyProfilePage.click_DigitalFootPrintSection_Save_Changes_Button();

			verify_Digital_Section_EditCompanyProfile_Updated_Successfully();

			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_EditCompany_CompanyProfilePage_displayed();

			testStepPassed("");



			WebElement element11 = driver.findElement(By.xpath("//div[contains(@id,'digital')]//span[contains(text(),'Digital Footprint')]"));

			scrolltoElementView(element11);



			testStepInfo("");
			testStepInfo("Digital Foot Print Section Details After Editing");
			testStepInfo("********************************************************");			

			String DigitalFootPrintSection_Crunchbase_HatcherOption_Value_AfterEdited = companyProfilePage.get_DigitalFootPrintSection_Crunchbase_HatcherOption_Value();

			//String DigitalFootPrintSection_Crunchbase_ClearbitOption_Value_AfterEdited = companyProfilePage.get_DigitalFootPrintSection_Crunchbase_ClearbitOption_Value();

			String DigitalFootPrintSection_Facebook_HatcherOption_Value_AfterEdited = companyProfilePage.get_DigitalFootPrintSection_Facebook_HatcherOption_Value();

			//String DigitalFootPrintSection_Facebook_ClearbitOption_Value_AfterEdited = companyProfilePage.get_DigitalFootPrintSection_Facebook_ClearbitOption_Value();

			String DigitalFootPrintSection_Instagram_HatcherOption_Value_AfterEdited = companyProfilePage.get_DigitalFootPrintSection_Instagram_HatcherOption_Value();

			String DigitalFootPrintSection_Angellist_HatcherOption_Value_AfterEdited = companyProfilePage.get_DigitalFootPrintSection_Angellist_HatcherOption_Value();

			String DigitalFootPrintSection_Medium_HatcherOption_Value_AfterEdited = companyProfilePage.get_DigitalFootPrintSection_Medium_HatcherOption_Value();

			String DigitalFootPrintSection_LinkedIn_HatcherOption_Value_AfterEdited = companyProfilePage.get_DigitalFootPrintSection_LinkedIn_HatcherOption_Value();

			//String DigitalFootPrintSection_LinkedIn_ClearbitOption_Value_AfterEdited = companyProfilePage.get_DigitalFootPrintSection_LinkedIn_ClearbitOption_Value();

			String DigitalFootPrintSection_Pinterest_HatcherOption_Value_AfterEdited = companyProfilePage.get_DigitalFootPrintSection_Pinterest_HatcherOption_Value();

			String DigitalFootPrintSection_RSSFeed_HatcherOption_Value_AfterEdited = companyProfilePage.get_DigitalFootPrintSection_RSSFeed_HatcherOption_Value();

			String DigitalFootPrintSection_Twitter_HatcherOption_Value_AfterEdited = companyProfilePage.get_DigitalFootPrintSection_Twitter_HatcherOption_Value();

			//String DigitalFootPrintSection_Twitter_ClearbitOption_Value_AfterEdited = companyProfilePage.get_DigitalFootPrintSection_Twitter_ClearbitOption_Value();

			String DigitalFootPrintSection_Vimeo_HatcherOption_Value_AfterEdited = companyProfilePage.get_DigitalFootPrintSection_Vimeo_HatcherOption_Value();

			String DigitalFootPrintSection_Websiter_HatcherOption_Value_AfterEdited = companyProfilePage.get_DigitalFootPrintSection_Website_HatcherOption_Value();

			//String DigitalFootPrintSection_Websiter_ClearbitOption_Value_AfterEdited = companyProfilePage.get_DigitalFootPrintSection_Website_ClearbitOption_Value();

			String DigitalFootPrintSection_Websiter_MOZOption_Value_AfterEdited = companyProfilePage.get_DigitalFootPrintSection_Website_MOZOption_Value();

			String DigitalFootPrintSection_YouTube_HatcherOption_Value_AfterEdited = companyProfilePage.get_DigitalFootPrintSection_YouTube_HatcherOption_Value();


			testStepPassed("Digital Foot Print Section Crunchbase Hatcher Option Value After Edited :"+DigitalFootPrintSection_Crunchbase_HatcherOption_Value_AfterEdited);

			//testStepPassed("Digital Foot Print Section Crunchbase Clearbit Option Value After Edited :"+DigitalFootPrintSection_Crunchbase_ClearbitOption_Value_AfterEdited);

			testStepPassed("Digital Foot Print Section Facebook Hatcher Option Value After Edited :"+DigitalFootPrintSection_Facebook_HatcherOption_Value_AfterEdited);

			//testStepPassed("Digital Foot Print Section Facebook Clearbit Option Value After Edited :"+DigitalFootPrintSection_Facebook_ClearbitOption_Value_AfterEdited);

			testStepPassed("Digital Foot Print Section Instagram Hatcher Option Value After Edited :"+DigitalFootPrintSection_Instagram_HatcherOption_Value_AfterEdited);

			testStepPassed("Digital Foot Print Section Angellist Hatcher Option Value After Edited :"+DigitalFootPrintSection_Angellist_HatcherOption_Value_AfterEdited);

			testStepPassed("Digital Foot Print Section Medium Hatcher Option Value After Edited :"+DigitalFootPrintSection_Medium_HatcherOption_Value_AfterEdited);

			testStepPassed("Digital Foot Print Section LinkedIn Hatcher Option Value After Edited :"+DigitalFootPrintSection_LinkedIn_HatcherOption_Value_AfterEdited);

			//testStepPassed("Digital Foot Print Section LinkedIn Clearbit Option Value After Edited :"+DigitalFootPrintSection_LinkedIn_ClearbitOption_Value_AfterEdited);

			testStepPassed("Digital Foot Print Section Pinterest Hatcher Option Value After Edited :"+DigitalFootPrintSection_Pinterest_HatcherOption_Value_AfterEdited);

			testStepPassed("Digital Foot Print Section RSS Feed Hatcher Option Value After Edited :"+DigitalFootPrintSection_RSSFeed_HatcherOption_Value_AfterEdited);

			testStepPassed("Digital Foot Print Section Twitter Hatcher Option Value After Edited :"+DigitalFootPrintSection_Twitter_HatcherOption_Value_AfterEdited);

			//testStepPassed("Digital Foot Print Section Twitter Clearbit Option Value After Edited :"+DigitalFootPrintSection_Twitter_ClearbitOption_Value_AfterEdited);

			testStepPassed("Digital Foot Print Section Vimeo Hatcher Option Value After Edited :"+DigitalFootPrintSection_Vimeo_HatcherOption_Value_AfterEdited);

			testStepPassed("Digital Foot Print Section Website Hatcher Option Value After Edited :"+DigitalFootPrintSection_Websiter_HatcherOption_Value_AfterEdited);

			//testStepPassed("Digital Foot Print Section Website Clearbit Option Value After Edited :"+DigitalFootPrintSection_Websiter_ClearbitOption_Value_AfterEdited);

			testStepPassed("Digital Foot Print Section Website MOZ Option Value After Edited :"+DigitalFootPrintSection_Websiter_MOZOption_Value_AfterEdited);

			testStepPassed("Digital Foot Print Section YouTube Hatcher Option Value After Edited :"+DigitalFootPrintSection_YouTube_HatcherOption_Value_AfterEdited);
			
			testStepPassed("");
			
			
			try 
			{
				if (DigitalFootPrintSection_Crunchbase_HatcherOption_Value_AfterEdited.equalsIgnoreCase(newEditDigitalCrunchbaseHatcherHatcher)) 
				{
					testStepPassed("Digital Foot Print Section Crunchbase Hatcher Value After edited is same as the edited value");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("Digital Foot Print Section Crunchbase Hatcher Value After edited is not same as the edited value");
			}

			
			try 
			{
				if (DigitalFootPrintSection_Facebook_HatcherOption_Value_AfterEdited.equalsIgnoreCase(newEditDigitalFacebookHatcher)) 
				{
					testStepPassed("Digital Foot Print Section Facebook Hatcher Value After edited is same as the edited value");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("Digital Foot Print Section Facebook Hatcher Value After edited is not same as the edited value");
			}

			
			try 
			{
				if (DigitalFootPrintSection_Instagram_HatcherOption_Value_AfterEdited.equalsIgnoreCase(newEditDigitalInstagramHatcher)) 
				{
					testStepPassed("Digital Foot Print Section Instagram Hatcher Value After edited is same as the edited value");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("Digital Foot Print Section Instagram Hatcher Value After edited is not same as the edited value");
			}

			
			try 
			{
				if (DigitalFootPrintSection_Angellist_HatcherOption_Value_AfterEdited.equalsIgnoreCase(newEditDigitalAngellistHatcher)) 
				{
					testStepPassed("Digital Foot Print Section Angellist Hatcher Value After edited is same as the edited value");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("Digital Foot Print Section Angellist Hatcher Value After edited is not same as the edited value");
			}

			
			try 
			{
				if (DigitalFootPrintSection_Medium_HatcherOption_Value_AfterEdited.equalsIgnoreCase(newEditDigitalMediumHatcher)) 
				{
					testStepPassed("Digital Foot Print Section Medium Hatcher Value After edited is same as the edited value");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("Digital Foot Print Section Medium Hatcher Value After edited is not same as the edited value");
			}

			
			try 
			{
				if (DigitalFootPrintSection_LinkedIn_HatcherOption_Value_AfterEdited.equalsIgnoreCase(newEditDigitalLinkedInHatcher)) 
				{
					testStepPassed("Digital Foot Print Section LinkedIn Hatcher Value After edited is same as the edited value");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("Digital Foot Print Section LinkedIn Hatcher Value After edited is not same as the edited value");
			}

			
			try 
			{
				if (DigitalFootPrintSection_Pinterest_HatcherOption_Value_AfterEdited.equalsIgnoreCase(newEditDigitalPinterestHatcher)) 
				{
					testStepPassed("Digital Foot Print Section Pinterest Hatcher Value After edited is same as the edited value");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("Digital Foot Print Section Pinterest Hatcher Value After edited is not same as the edited value");
			}

			
			try 
			{
				if (DigitalFootPrintSection_RSSFeed_HatcherOption_Value_AfterEdited.equalsIgnoreCase(newEditDigitalRSSFeedHatcher)) 
				{
					testStepPassed("Digital Foot Print Section RSS Feed Hatcher Value After edited is same as the edited value");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("Digital Foot Print Section RSS Feed Hatcher Value After edited is not same as the edited value");
			}

			try 
			{
				if (DigitalFootPrintSection_Twitter_HatcherOption_Value_AfterEdited.equalsIgnoreCase(newEditDigitalTwitterHatcher)) 
				{
					testStepPassed("Digital Foot Print Section Twitter Hatcher Value After edited is same as the edited value");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("Digital Foot Print Section Twitter Hatcher Value After edited is not same as the edited value");
			}

			try 
			{
				if (DigitalFootPrintSection_Vimeo_HatcherOption_Value_AfterEdited.equalsIgnoreCase(newEditDigitalVimeoHatcher)) 
				{
					testStepPassed("Digital Foot Print Section Vimeo Hatcher Value After edited is same as the edited value");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("Digital Foot Print Section Vimeo Hatcher Value After edited is not same as the edited value");
			}

			
			try 
			{
				if (DigitalFootPrintSection_Websiter_HatcherOption_Value_AfterEdited.equalsIgnoreCase(newEditDigitalWebsiteHatcher)) 
				{
					testStepPassed("Digital Foot Print Section Website Hatcher Value After edited is same as the edited value");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("Digital Foot Print Section Website Hatcher Value After edited is not same as the edited value");
			}

			
			try 
			{
				if (DigitalFootPrintSection_YouTube_HatcherOption_Value_AfterEdited.equalsIgnoreCase(newEditDigitalYouTubeHatcher)) 
				{
					testStepPassed("Digital Foot Print Section Youtube Hatcher Value After edited is same as the edited value");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("Digital Foot Print Section Youtube Hatcher Value After edited is not same as the edited value");
			}	

			testStepPassed("");



			scrollToTopofPage();

			WebElement element12 = driver.findElement(By.xpath("//div[contains(@id,'finance_legal')]//span[contains(text(),'Finance & Legal')]"));

			scrolltoElementView(element12);


			testStepInfo("");
			testStepInfo("Finance and Legal Section Details Before Editing");
			testStepInfo("**********************************************************");			

			String FinanceandLegalSection_Auditor_HatcherOption_Value_BeforeEdited = companyProfilePage.get_FinanceandLegalSection_Auditor_HatcherOption_Value();

			String FinanceandLegalSection_Bank_HatcherOption_Value_BeforeEdited = companyProfilePage.get_FinanceandLegalSection_Bank_HatcherOption_Value();

			String FinanceandLegalSection_BankABANumber_HatcherOption_Value_BeforeEdited = companyProfilePage.get_FinanceandLegalSection_BankABANumber_HatcherOption_Value();

					String FinanceandLegalSection_BankAccountNumber_HatcherOption_Value_BeforeEdited = companyProfilePage.get_FinanceandLegalSection_BankAccountNumber_HatcherOption_Value();

			String FinanceandLegalSection_BankAddress_HatcherOption_Value_BeforeEdited = companyProfilePage.get_FinanceandLegalSection_BankAddress_HatcherOption_Value();

			String FinanceandLegalSection_BankIntermediary_HatcherOption_Value_BeforeEdited = companyProfilePage.get_FinanceandLegalSection_BankIntermediary_HatcherOption_Value();

			String FinanceandLegalSection_IntermediaryBankABANumber_HatcherOption_Value_BeforeEdited = companyProfilePage.get_FinanceandLegalSection_IntermediaryBankABANumber_HatcherOption_Value();

			String FinanceandLegalSection_IntermediaryBankAddress_HatcherOption_Value_BeforeEdited = companyProfilePage.get_FinanceandLegalSection_IntermediaryBankAddress_HatcherOption_Value();

			String FinanceandLegalSection_IntermediaryBankSWIFTBIC_HatcherOption_Value_BeforeEdited = companyProfilePage.get_FinanceandLegalSection_IntermediaryBankSWIFTBIC_HatcherOption_Value();

			String FinanceandLegalSection_BankSwiftCode_HatcherOption_Value_BeforeEdited = companyProfilePage.get_FinanceandLegalSection_BankSwiftCode_HatcherOption_Value();

			String FinanceandLegalSection_BankIBANCode_HatcherOption_Value_BeforeEdited = companyProfilePage.get_FinanceandLegalSection_BankIBANCode_HatcherOption_Value();

			String FinanceandLegalSection_BankInstructions_HatcherOption_Value_BeforeEdited = companyProfilePage.get_FinanceandLegalSection_BankInstructions_HatcherOption_Value();

			String FinanceandLegalSection_CompanySecretary_HatcherOption_Value_BeforeEdited = companyProfilePage.get_FinanceandLegalSection_CompanySecretary_HatcherOption_Value();

			String FinanceandLegalSection_Currency_HatcherOption_Value_BeforeEdited = companyProfilePage.get_FinanceandLegalSection_Currency_HatcherOption_Value();

			String FinanceandLegalSection_FinancialYearEnd_HatcherOption_Value_BeforeEdited = companyProfilePage.get_FinanceandLegalSection_FinancialYearEnd_HatcherOption_Value();

			String FinanceandLegalSection_LawFirm_HatcherOption_Value_BeforeEdited = companyProfilePage.get_FinanceandLegalSection_LawFirm_HatcherOption_Value();



			testStepPassed("Finance and Legal Section Auditor Hatcher Option Value Before Edited :"+FinanceandLegalSection_Auditor_HatcherOption_Value_BeforeEdited);

			testStepPassed("Finance and Legal Section Bank Hatcher Option Value Before Edited :"+FinanceandLegalSection_Bank_HatcherOption_Value_BeforeEdited);

			testStepPassed("Finance and Legal Section Bank ABA Number Hatcher Option Value Before Edited :"+FinanceandLegalSection_BankABANumber_HatcherOption_Value_BeforeEdited);

			testStepPassed("Finance and Legal Section Bank Account Number Hatcher Option Value Before Edited :"+FinanceandLegalSection_BankAccountNumber_HatcherOption_Value_BeforeEdited);

			testStepPassed("Finance and Legal Section Bank Address Hatcher Option Value Before Edited :"+FinanceandLegalSection_BankAddress_HatcherOption_Value_BeforeEdited);

			testStepPassed("Finance and Legal Section Bank Intermediary Hatcher Option Value Before Edited :"+FinanceandLegalSection_BankIntermediary_HatcherOption_Value_BeforeEdited);

			testStepPassed("Finance and Legal Section Intermediary Bank ABA Number Hatcher Option Value Before Edited :"+FinanceandLegalSection_IntermediaryBankABANumber_HatcherOption_Value_BeforeEdited);

			testStepPassed("Finance and Legal Section Intermediary Bank Address Hatcher Option Value Before Edited :"+FinanceandLegalSection_IntermediaryBankAddress_HatcherOption_Value_BeforeEdited);

			testStepPassed("Finance and Legal Section Intermediary Bank SWIFT BIC Hatcher Option Value Before Edited :"+FinanceandLegalSection_IntermediaryBankSWIFTBIC_HatcherOption_Value_BeforeEdited);

			testStepPassed("Finance and Legal Section Bank Swift Code Hatcher Option Value Before Edited :"+FinanceandLegalSection_BankSwiftCode_HatcherOption_Value_BeforeEdited);

			testStepPassed("Finance and Legal Section Bank IBAN Code Hatcher Option Value Before Edited :"+FinanceandLegalSection_BankIBANCode_HatcherOption_Value_BeforeEdited);

			testStepPassed("Finance and Legal Section Bank Instructions Hatcher Option Value Before Edited :"+FinanceandLegalSection_BankInstructions_HatcherOption_Value_BeforeEdited);

			testStepPassed("Finance and Legal Section Company Secretary Hatcher Option Value Before Edited :"+FinanceandLegalSection_CompanySecretary_HatcherOption_Value_BeforeEdited);

			testStepPassed("Finance and Legal Section Currency Hatcher Option Value Before Edited :"+FinanceandLegalSection_Currency_HatcherOption_Value_BeforeEdited);

			testStepPassed("Finance and Legal Section Financial Year End Hatcher Option Value Before Edited :"+FinanceandLegalSection_FinancialYearEnd_HatcherOption_Value_BeforeEdited);

			testStepPassed("Finance and Legal Section Law Firm Hatcher Option Value Before Edited :"+FinanceandLegalSection_LawFirm_HatcherOption_Value_BeforeEdited);


			testStepPassed("");

			WebElement element13 = driver.findElement(By.xpath("//div[contains(@id,'finance_legal')]//span[contains(text(),'Finance & Legal')]"));

			scrolltoElementView(element13);

			companyProfilePage.clear_FinanceandLegalSection_HatcherValues();

			WebElement element14 = driver.findElement(By.xpath("//div[contains(@id,'finance_legal')]//span[contains(text(),'Finance & Legal')]"));

			scrolltoElementView(element14);

			companyProfilePage.enter_FinanceandLegalSection_HatcherValues(newEditFinanceLegalAuditorHatcher,newEditFinanceLegalBankHatcher,newEditFinanceLegalBankABANumberHatcher,newEditFinanceLegalBankAccountNameHatcher,newEditFinanceLegalBankAccountNumberHatcher,newEditFinanceLegalBankAddressHatcher,newEditFinanceLegalBankIntermediaryHatcher,newEditFinanceLegalIntermediaryBankABANumberHatcher,newEditFinanceLegalIntermediaryBankAddressHatcher,newEditFinanceLegalIntermediaryBankSWIFTBICHatcher,newEditFinanceLegalBankSwiftCodeHatcher,newEditFinanceLegalBankIBANCodeHatcher,newEditFinanceLegalBankInstructionsHatcher,newEditFinanceLegalCompanySecretaryHatcher,newEditFinanceLegalCurrencyHatcher,newEditFinanceLegalFinancialYearEndHatcher,newEditFinanceLegalLawFirmHatcher);

			companyProfilePage.click_FinanceandLegalSection_Save_Changes_Button();

			verify_Finance_Section_EditCompanyProfile_Updated_Successfully();

			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_EditCompany_CompanyProfilePage_displayed();

			testStepPassed("");


			WebElement element15 = driver.findElement(By.xpath("//div[contains(@id,'finance_legal')]//span[contains(text(),'Finance & Legal')]"));

			scrolltoElementView(element15);


			testStepInfo("");
			testStepInfo("Finance and Legal Section Details After Editing");
			testStepInfo("**********************************************************");			

			String FinanceandLegalSection_Auditor_HatcherOption_Value_AfterEdited = companyProfilePage.get_FinanceandLegalSection_Auditor_HatcherOption_Value();

			String FinanceandLegalSection_Bank_HatcherOption_Value_AfterEdited = companyProfilePage.get_FinanceandLegalSection_Bank_HatcherOption_Value();

			String FinanceandLegalSection_BankABANumber_HatcherOption_Value_AfterEdited = companyProfilePage.get_FinanceandLegalSection_BankABANumber_HatcherOption_Value();

					String FinanceandLegalSection_BankAccountNumber_HatcherOption_Value_AfterEdited = companyProfilePage.get_FinanceandLegalSection_BankAccountNumber_HatcherOption_Value();

			String FinanceandLegalSection_BankAddress_HatcherOption_Value_AfterEdited = companyProfilePage.get_FinanceandLegalSection_BankAddress_HatcherOption_Value();

			String FinanceandLegalSection_BankIntermediary_HatcherOption_Value_AfterEdited = companyProfilePage.get_FinanceandLegalSection_BankIntermediary_HatcherOption_Value();

			String FinanceandLegalSection_IntermediaryBankABANumber_HatcherOption_Value_AfterEdited = companyProfilePage.get_FinanceandLegalSection_IntermediaryBankABANumber_HatcherOption_Value();

			String FinanceandLegalSection_IntermediaryBankAddress_HatcherOption_Value_AfterEdited = companyProfilePage.get_FinanceandLegalSection_IntermediaryBankAddress_HatcherOption_Value();

			String FinanceandLegalSection_IntermediaryBankSWIFTBIC_HatcherOption_Value_AfterEdited = companyProfilePage.get_FinanceandLegalSection_IntermediaryBankSWIFTBIC_HatcherOption_Value();

			String FinanceandLegalSection_BankSwiftCode_HatcherOption_Value_AfterEdited = companyProfilePage.get_FinanceandLegalSection_BankSwiftCode_HatcherOption_Value();

			String FinanceandLegalSection_BankIBANCode_HatcherOption_Value_AfterEdited = companyProfilePage.get_FinanceandLegalSection_BankIBANCode_HatcherOption_Value();

			String FinanceandLegalSection_BankInstructions_HatcherOption_Value_AfterEdited = companyProfilePage.get_FinanceandLegalSection_BankInstructions_HatcherOption_Value();

			String FinanceandLegalSection_CompanySecretary_HatcherOption_Value_AfterEdited = companyProfilePage.get_FinanceandLegalSection_CompanySecretary_HatcherOption_Value();

			String FinanceandLegalSection_Currency_HatcherOption_Value_AfterEdited = companyProfilePage.get_FinanceandLegalSection_Currency_HatcherOption_Value();

			String FinanceandLegalSection_FinancialYearEnd_HatcherOption_Value_AfterEdited = companyProfilePage.get_FinanceandLegalSection_FinancialYearEnd_HatcherOption_Value();

			String FinanceandLegalSection_LawFirm_HatcherOption_Value_AfterEdited = companyProfilePage.get_FinanceandLegalSection_LawFirm_HatcherOption_Value();



			testStepPassed("Finance and Legal Section Auditor Hatcher Option Value After Edited :"+FinanceandLegalSection_Auditor_HatcherOption_Value_AfterEdited);

			testStepPassed("Finance and Legal Section Bank Hatcher Option Value After Edited :"+FinanceandLegalSection_Bank_HatcherOption_Value_AfterEdited);

			testStepPassed("Finance and Legal Section Bank ABA Number Hatcher Option Value After Edited :"+FinanceandLegalSection_BankABANumber_HatcherOption_Value_AfterEdited);

				testStepPassed("Finance and Legal Section Bank Account Number Hatcher Option Value After Edited :"+FinanceandLegalSection_BankAccountNumber_HatcherOption_Value_AfterEdited);

			testStepPassed("Finance and Legal Section Bank Address Hatcher Option Value After Edited :"+FinanceandLegalSection_BankAddress_HatcherOption_Value_AfterEdited);

			testStepPassed("Finance and Legal Section Bank Intermediary Hatcher Option Value After Edited :"+FinanceandLegalSection_BankIntermediary_HatcherOption_Value_AfterEdited);

			testStepPassed("Finance and Legal Section Intermediary Bank ABA Number Hatcher Option Value After Edited :"+FinanceandLegalSection_IntermediaryBankABANumber_HatcherOption_Value_AfterEdited);

			testStepPassed("Finance and Legal Section Intermediary Bank Address Hatcher Option Value After Edited :"+FinanceandLegalSection_IntermediaryBankAddress_HatcherOption_Value_AfterEdited);

			testStepPassed("Finance and Legal Section Intermediary Bank SWIFT BIC Hatcher Option Value After Edited :"+FinanceandLegalSection_IntermediaryBankSWIFTBIC_HatcherOption_Value_AfterEdited);

			testStepPassed("Finance and Legal Section Bank Swift Code Hatcher Option Value After Edited :"+FinanceandLegalSection_BankSwiftCode_HatcherOption_Value_AfterEdited);

			testStepPassed("Finance and Legal Section Bank IBAN Code Hatcher Option Value After Edited :"+FinanceandLegalSection_BankIBANCode_HatcherOption_Value_AfterEdited);

			testStepPassed("Finance and Legal Section Bank Instructions Hatcher Option Value After Edited :"+FinanceandLegalSection_BankInstructions_HatcherOption_Value_AfterEdited);

			testStepPassed("Finance and Legal Section Company Secretary Hatcher Option Value After Edited :"+FinanceandLegalSection_CompanySecretary_HatcherOption_Value_AfterEdited);

			testStepPassed("Finance and Legal Section Currency Hatcher Option Value After Edited :"+FinanceandLegalSection_Currency_HatcherOption_Value_AfterEdited);

			testStepPassed("Finance and Legal Section Financial Year End Hatcher Option Value After Edited :"+FinanceandLegalSection_FinancialYearEnd_HatcherOption_Value_AfterEdited);

			testStepPassed("Finance and Legal Section Law Firm Hatcher Option Value After Edited :"+FinanceandLegalSection_LawFirm_HatcherOption_Value_AfterEdited);

			testStepPassed("");
			
			try 
			{
				if (FinanceandLegalSection_Auditor_HatcherOption_Value_AfterEdited.equalsIgnoreCase(newEditFinanceLegalAuditorHatcher)) 
				{
					testStepPassed("Finance and Legal Section Auditor Hatcher Value After edited is same as the edited value");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("Finance and Legal Section Auditor Hatcher Value After edited is same as the edited value");
			}
			
			try 
			{
				if (FinanceandLegalSection_Bank_HatcherOption_Value_AfterEdited.equalsIgnoreCase(newEditFinanceLegalBankHatcher)) 
				{
					testStepPassed("Finance and Legal Section Bank Hatcher Value After edited is same as the edited value");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("Finance and Legal Section Bank Hatcher Value After edited is same as the edited value");
			}	

			
			try 
			{
				if (FinanceandLegalSection_BankABANumber_HatcherOption_Value_AfterEdited.equalsIgnoreCase(newEditFinanceLegalBankABANumberHatcher)) 
				{
					testStepPassed("Finance and Legal Section Bank ABA Number Hatcher Value After edited is same as the edited value");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("Finance and Legal Section Bank ABA Number Hatcher Value After edited is same as the edited value");
			}	

					
			try 
			{
				if (FinanceandLegalSection_BankAccountNumber_HatcherOption_Value_AfterEdited.equalsIgnoreCase(newEditFinanceLegalBankAccountNumberHatcher)) 
				{
					testStepPassed("Finance and Legal Section Bank Account Number Hatcher Value After edited is same as the edited value");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("Finance and Legal Section Bank Account Number Hatcher Value After edited is same as the edited value");
			}	

			
			try 
			{
				if (FinanceandLegalSection_BankAddress_HatcherOption_Value_AfterEdited.equalsIgnoreCase(newEditFinanceLegalBankAddressHatcher)) 
				{
					testStepPassed("Finance and Legal Section Bank Address Hatcher Value After edited is same as the edited value");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("Finance and Legal Section Bank Address Hatcher Value After edited is same as the edited value");
			}	

			
			try 
			{
				if (FinanceandLegalSection_BankIntermediary_HatcherOption_Value_AfterEdited.equalsIgnoreCase(newEditFinanceLegalBankIntermediaryHatcher)) 
				{
					testStepPassed("Finance and Legal Section Bank Intermediary Hatcher Value After edited is same as the edited value");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("Finance and Legal Section Bank Intermediary Hatcher Value After edited is same as the edited value");
			}	

			
			try 
			{
				if (FinanceandLegalSection_IntermediaryBankABANumber_HatcherOption_Value_AfterEdited.equalsIgnoreCase(newEditFinanceLegalIntermediaryBankABANumberHatcher)) 
				{
					testStepPassed("Finance and Legal Section Intermediary Bank ABA Number Hatcher Value After edited is same as the edited value");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("Finance and Legal Section Intermediary Bank ABA Number Hatcher Value After edited is same as the edited value");
			}	

			
			try 
			{
				if (FinanceandLegalSection_IntermediaryBankAddress_HatcherOption_Value_AfterEdited.equalsIgnoreCase(newEditFinanceLegalIntermediaryBankAddressHatcher)) 
				{
					testStepPassed("Finance and Legal Section Intermediary Bank Address Hatcher Value After edited is same as the edited value");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("Finance and Legal Section Intermediary Bank Address Hatcher Value After edited is same as the edited value");
			}	

			
			try 
			{
				if (FinanceandLegalSection_IntermediaryBankSWIFTBIC_HatcherOption_Value_AfterEdited.equalsIgnoreCase(newEditFinanceLegalIntermediaryBankSWIFTBICHatcher)) 
				{
					testStepPassed("Finance and Legal Section Intermediary Bank SWIFT BIC Hatcher Value After edited is same as the edited value");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("Finance and Legal Section Intermediary Bank SWIFT BIC Hatcher Value After edited is same as the edited value");
			}	

			
			try 
			{
				if (FinanceandLegalSection_BankSwiftCode_HatcherOption_Value_AfterEdited.equalsIgnoreCase(newEditFinanceLegalBankSwiftCodeHatcher)) 
				{
					testStepPassed("Finance and Legal Section Bank Swift Code Hatcher Value After edited is same as the edited value");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("Finance and Legal Section Bank Swift Code Hatcher Value After edited is same as the edited value");
			}	

			
			try 
			{
				if (FinanceandLegalSection_BankIBANCode_HatcherOption_Value_AfterEdited.equalsIgnoreCase(newEditFinanceLegalBankIBANCodeHatcher)) 
				{
					testStepPassed("Finance and Legal Section Bank IBAN Code Hatcher Value After edited is same as the edited value");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("Finance and Legal Section Bank IBAN Code Hatcher Value After edited is same as the edited value");
			}	

			
			try 
			{
				if (FinanceandLegalSection_BankInstructions_HatcherOption_Value_AfterEdited.equalsIgnoreCase(newEditFinanceLegalBankInstructionsHatcher)) 
				{
					testStepPassed("Finance and Legal Section Bank Instructions Hatcher Value After edited is same as the edited value");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("Finance and Legal Section Bank Instructions Hatcher Value After edited is same as the edited value");
			}	

			
			try 
			{
				if (FinanceandLegalSection_CompanySecretary_HatcherOption_Value_AfterEdited.equalsIgnoreCase(newEditFinanceLegalCompanySecretaryHatcher)) 
				{
					testStepPassed("Finance and Legal Section Company Secretary Hatcher Value After edited is same as the edited value");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("Finance and Legal Section Company Secretary Hatcher Value After edited is same as the edited value");
			}	

			
			try 
			{
				if (FinanceandLegalSection_LawFirm_HatcherOption_Value_AfterEdited.equalsIgnoreCase(newEditFinanceLegalLawFirmHatcher)) 
				{
					testStepPassed("Finance and Legal Section Law Firm Hatcher Value After edited is same as the edited value");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("Finance and Legal Section Law Firm Hatcher Value After edited is same as the edited value");
			}	
			
			testStepPassed("");

			testStepInfo("");
			testStepInfo("Industry Section Details Before Editing");
			testStepInfo("**********************************************************");			

			WebElement element16 = driver.findElement(By.xpath("//div[contains(@id,'industry')]//span[contains(text(),'Industry')]"));

			scrolltoElementView(element16);

			testStepPassed("");

			companyProfilePage.click_IndustrySection_Industry_HatcherOption_RadioButton();

			companyProfilePage.select_IndustrySection_Industry_HatcherOption_Textbox(newEditIndustryHatcher);

			companyProfilePage.click_IndustrySection_SaveChanges_Button();

			verify_Industry_Section_EditCompanyProfile_Updated_Successfully();

			WebElement element24 = driver.findElement(By.xpath("//div[contains(@id,'industry')]//span[contains(text(),'Industry')]"));

			scrolltoElementView(element24);

			companyProfilePage.verify_SelectedIndustry_displayed(newEditIndustryHatcher);

			testStepPassed("");


			WebElement element17 = driver.findElement(By.xpath("//div[contains(@id,'keywords')]//span[contains(text(),'Keywords')]"));

			scrolltoElementView(element17);

			testStepInfo("");
			testStepInfo("Keywords Section Details Before Editing");
			testStepInfo("**********************************************");			

			String KeywordsSection_Keywords_HatcherOption_Value_BeforeEdited = companyProfilePage.get_KeywordsSection_HatcherOption_Value();

			testStepPassed("Keywords Section Keywords Hatcher Option Value Before Edited :"+KeywordsSection_Keywords_HatcherOption_Value_BeforeEdited);

			testStepPassed("");

			WebElement element18 = driver.findElement(By.xpath("//div[contains(@id,'keywords')]//span[contains(text(),'Keywords')]"));

			scrolltoElementView(element18);

			companyProfilePage.enter_KeywordsSection_HatcherValues(newEditKeywordHatcher);

			companyProfilePage.click_KeywordsSection_SaveChanges_Button();

			verify_Keywords_Section_EditCompanyProfile_Updated_Successfully();

			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_EditCompany_CompanyProfilePage_displayed();

			testStepPassed("");

			WebElement element19 = driver.findElement(By.xpath("//div[contains(@id,'keywords')]//span[contains(text(),'Keywords')]"));

			scrolltoElementView(element19);

			testStepInfo("");
			testStepInfo("Keywords Section Details After Editing");
			testStepInfo("**********************************************");			

			String KeywordsSection_Keywords_HatcherOption_Value_AfterEdited = companyProfilePage.get_KeywordsSection_HatcherOption_Value();

			testStepPassed("Keywords Section Keywords Hatcher Option Value After Edited :"+KeywordsSection_Keywords_HatcherOption_Value_AfterEdited);

			testStepPassed("");
			
			try 
			{
				if (KeywordsSection_Keywords_HatcherOption_Value_AfterEdited.equalsIgnoreCase(newEditKeywordHatcher)) 
				{
					testStepPassed("Keywords Section Law Firm Hatcher Value After edited is same as the edited value");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("Keywords Section Law Firm Hatcher Value After edited is same as the edited value");
			}	

			testStepPassed("");

			WebElement element22 = driver.findElement(By.xpath("//div[contains(@id,'regions')]//span[contains(text(),'Regions')]"));

			scrolltoElementView(element22);

			testStepPassed("");
			
			testStepInfo("");
			testStepInfo("Region Section Details Before Editing");
			testStepInfo("**********************************************");			

			companyProfilePage.click_RegionsSection_Regions_HatcherOption_RadioButton();

			companyProfilePage.select_RegionsSection_Regions_HatcherOption_Textbox(newEditRegionHatcher);

			companyProfilePage.click_RegionsSection_SaveChanges_Button();

			verify_Regions_Section_EditCompanyProfile_Updated_Successfully();

			WebElement element25 = driver.findElement(By.xpath("//div[contains(@id,'regions')]//span[contains(text(),'Regions')]"));

			scrolltoElementView(element25);

			testStepPassed("");
			testStepInfo("");
			testStepInfo("Marketing Metrics Section Details ");
			testStepInfo("*****************************************");			


			WebElement element20 = driver.findElement(By.xpath("//div[contains(@id,'marketing')]//span[contains(text(),'Marketing Metrics')]"));

			scrolltoElementView(element20);

			String MarketingMetricsSection_AlexaRanking_HatcherOption_Value_BeforeEdited = companyProfilePage.get_MarketingMetricsSection_AlexaBanking_HatcherOption_Value();

			String MarketingMetricsSection_Competitors_HatcherOption_Value_BeforeEdited = companyProfilePage.get_MarketingMetricsSection_Competitors_HatcherOption_Value();

			String MarketingMetricsSection_CompetitorRankings_HatcherOption_Value_BeforeEdited = companyProfilePage.get_MarketingMetricsSection_CompetitorRankings_HatcherOption_Value();

			String MarketingMetricsSection_DomainsLinkingIn_HatcherOption_Value_BeforeEdited = companyProfilePage.get_MarketingMetricsSection_DomainsLinkingIn_HatcherOption_Value();

			String MarketingMetricsSection_FacebookLikes_HatcherOption_Value_BeforeEdited = companyProfilePage.get_MarketingMetricsSection_FacebookLikes_HatcherOption_Value();

			String MarketingMetricsSection_LinkedinEmployees_HatcherOption_Value_BeforeEdited = companyProfilePage.get_MarketingMetricsSection_LinkedinEmployees_HatcherOption_Value();

			String MarketingMetricsSection_LinkedinFollowers_HatcherOption_Value_BeforeEdited = companyProfilePage.get_MarketingMetricsSection_LinkedinFollowers_HatcherOption_Value();

			String MarketingMetricsSection_MOZDomainAuthority_HatcherOption_Value_BeforeEdited = companyProfilePage.get_MarketingMetricsSection_MOZDomainAuthority_HatcherOption_Value();

			String MarketingMetricsSection_OrganicTraffic_HatcherOption_Value_BeforeEdited = companyProfilePage.get_MarketingMetricsSection_OrganicTraffic_HatcherOption_Value();

			String MarketingMetricsSection_TranscoRanking_HatcherOption_Value_BeforeEdited = companyProfilePage.get_MarketingMetricsSection_TranscoRanking_HatcherOption_Value();

			String MarketingMetricsSection_TwitterFollowers_HatcherOption_Value_BeforeEdited = companyProfilePage.get_MarketingMetricsSection_TwitterFollowers_HatcherOption_Value();

			testStepPassed("Marketing Metrics Section Alexa Ranking Hatcher Option Value Before Edited :"+MarketingMetricsSection_AlexaRanking_HatcherOption_Value_BeforeEdited);

			testStepPassed("Marketing Metrics Section Competitors Hatcher Option Value Before Edited :"+MarketingMetricsSection_Competitors_HatcherOption_Value_BeforeEdited);

			testStepPassed("Marketing Metrics Section Competitor Rankings Hatcher Option Value Before Edited :"+MarketingMetricsSection_CompetitorRankings_HatcherOption_Value_BeforeEdited);

			testStepPassed("Marketing Metrics Section Domains Linking In Rankings Hatcher Option Value Before Edited :"+MarketingMetricsSection_DomainsLinkingIn_HatcherOption_Value_BeforeEdited);

			testStepPassed("Marketing Metrics Section Facebook Likes Rankings Hatcher Option Value Before Edited :"+MarketingMetricsSection_FacebookLikes_HatcherOption_Value_BeforeEdited);

			testStepPassed("Marketing Metrics Section Linkedin Employees Hatcher Option Value Before Edited :"+MarketingMetricsSection_LinkedinEmployees_HatcherOption_Value_BeforeEdited);

			testStepPassed("Marketing Metrics Section Linkedin Followers Hatcher Option Value Before Edited :"+MarketingMetricsSection_LinkedinFollowers_HatcherOption_Value_BeforeEdited);

			testStepPassed("Marketing Metrics Section MOZ Domain Authority Hatcher Option Value Before Edited :"+MarketingMetricsSection_MOZDomainAuthority_HatcherOption_Value_BeforeEdited);

			testStepPassed("Marketing Metrics Section Organic Traffic Hatcher Option Value Before Edited :"+MarketingMetricsSection_OrganicTraffic_HatcherOption_Value_BeforeEdited);

			testStepPassed("Marketing Metrics Section Transco Ranking Hatcher Option Value Before Edited :"+MarketingMetricsSection_TranscoRanking_HatcherOption_Value_BeforeEdited);

			testStepPassed("Marketing Metrics Section Twitter Followers Hatcher Option Value Before Edited :"+MarketingMetricsSection_TwitterFollowers_HatcherOption_Value_BeforeEdited);

			testStepPassed("");

			WebElement element21 = driver.findElement(By.xpath("//div[contains(@id,'syndicate_settings')]//span[contains(text(),'Community Settings')]"));

			scrolltoElementView(element21);

			testStepInfo("");
			testStepInfo("Community Settings Section Details Before Editing");
			testStepInfo("*********************************************************");			

			String CommunitySettingsSection_AccountStatus_BeforeEdited = companyProfilePage.get_CommunitySettingsSection_AccountStatus_HatcherOption_Value();

			String CommunitySettingsSection_AccountType_BeforeEdited = companyProfilePage.get_CommunitySettingsSection_AccountType_HatcherOption_Value();

			String CommunitySettingsSection_BusinessType_BeforeEdited = companyProfilePage.get_CommunitySettingsSection_BusinessType_HatcherOption_Value();

			String CommunitySettingsSection_DealFlowStatus_BeforeEdited = companyProfilePage.get_CommunitySettingsSection_DealFlowStatus_HatcherOption_Value();

			String CommunitySettingsSection_PlacementAgent_BeforeEdited = companyProfilePage.get_CommunitySettingsSection_PlacementAgent_HatcherOption_Value();

			String CommunitySettingsSection_RelationshipManager_BeforeEdited = companyProfilePage.get_CommunitySettingsSection_RelationshipManager_HatcherOption_Value();

			String CommunitySettingsSection_ScoreVisibility_BeforeEdited = companyProfilePage.get_CommunitySettingsSection_ScoreVisibility_HatcherOption_Value();


			testStepPassed("Community Settings Section Account Status Value Before Edited :"+CommunitySettingsSection_AccountStatus_BeforeEdited);

			testStepPassed("Community Settings Section Account Type Value Before Edited :"+CommunitySettingsSection_AccountType_BeforeEdited);

			testStepPassed("Community Settings Section Business Type Value Before Edited :"+CommunitySettingsSection_BusinessType_BeforeEdited);

			testStepPassed("Community Settings Section Deal Flow Status Value Before Edited :"+CommunitySettingsSection_DealFlowStatus_BeforeEdited);

			testStepPassed("Community Settings Section Placement Agent Value Before Edited :"+CommunitySettingsSection_PlacementAgent_BeforeEdited);

			testStepPassed("Community Settings Section Relationship Manager Value Before Edited :"+CommunitySettingsSection_RelationshipManager_BeforeEdited);

			testStepPassed("Community Settings Section Score Visibility Value Before Edited :"+CommunitySettingsSection_ScoreVisibility_BeforeEdited);


			testStepPassed("");

			companyProfilePage.enter_CommunitySettingsSection_HatcherValues(newEditCommunitySettingsAccountStatus,newEditCommunitySettingsAccountType,newEditCommunitySettingsBusinessType,newEditCommunitySettingsDealflowStatus,newEditCommunitySettingsHealthorPortfolioStatus,newEditCommunitySettingsPlacementAgent,newEditCommunitySettingsScoreVisibility);

			companyProfilePage.click_CommunitySettingsSection_Save_Changes_Button();

			verify_CommunitySettings_Section_EditCompanyProfile_Updated_Successfully();

			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_EditCompany_CompanyProfilePage_displayed();

			testStepPassed("");

			WebElement element23 = driver.findElement(By.xpath("//div[contains(@id,'syndicate_settings')]//span[contains(text(),'Community Settings')]"));

			scrolltoElementView(element23);

			testStepInfo("");
			testStepInfo("Community Settings Details After Editing");
			testStepInfo("**************************************************");			

			String CommunitySettingsSection_AccountStatus_AfterEdited = companyProfilePage.get_CommunitySettingsSection_AccountStatus_HatcherOption_Value();

			String CommunitySettingsSection_AccountType_AfterEdited = companyProfilePage.get_CommunitySettingsSection_AccountType_HatcherOption_Value();

			String CommunitySettingsSection_BusinessType_AfterEdited = companyProfilePage.get_CommunitySettingsSection_BusinessType_HatcherOption_Value();

			String CommunitySettingsSection_PlacementAgent_AfterEdited = companyProfilePage.get_CommunitySettingsSection_PlacementAgent_HatcherOption_Value();

			String CommunitySettingsSection_RelationshipManager_AfterEdited = companyProfilePage.get_CommunitySettingsSection_RelationshipManager_HatcherOption_Value();

			String CommunitySettingsSection_ScoreVisibility_AfterEdited = companyProfilePage.get_CommunitySettingsSection_ScoreVisibility_HatcherOption_Value();


			testStepPassed("Community Settings Section Account Status Value After Edited :"+CommunitySettingsSection_AccountStatus_AfterEdited);

			testStepPassed("Community Settings Section Account Type Value After Edited :"+CommunitySettingsSection_AccountType_AfterEdited);

			testStepPassed("Community Settings Section Business Type Value After Edited :"+CommunitySettingsSection_BusinessType_AfterEdited);

			testStepPassed("Community Settings Section Placement Agent Value After Edited :"+CommunitySettingsSection_PlacementAgent_AfterEdited);

			testStepPassed("Community Settings Section Relationship Manager Value After Edited :"+CommunitySettingsSection_RelationshipManager_AfterEdited);

			testStepPassed("Community Settings Section Score Visibility Value After Edited :"+CommunitySettingsSection_ScoreVisibility_AfterEdited);

			testStepPassed("");
			
			try 
			{
				if (CommunitySettingsSection_AccountStatus_AfterEdited.equalsIgnoreCase(newEditCommunitySettingsAccountStatus)) 
				{
					testStepPassed("Community Settings Section Account Status Hatcher Value After edited is same as the edited value");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("Community Settings Section Account Status Hatcher Value After edited is same as the edited value");
			}	
			
			try 
			{
				if (CommunitySettingsSection_AccountType_AfterEdited.equalsIgnoreCase(newEditCommunitySettingsAccountType)) 
				{
					testStepPassed("Community Settings Section Account Type Hatcher Value After edited is same as the edited value");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("Community Settings Section Account Type Hatcher Value After edited is same as the edited value");
			}	
			
			try 
			{
				if (CommunitySettingsSection_PlacementAgent_AfterEdited.equalsIgnoreCase(newEditCommunitySettingsPlacementAgent)) 
				{
					testStepPassed("Community Settings Section Placement Agent Hatcher Value After edited is same as the edited value");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("Community Settings Section Placement Agent Hatcher Value After edited is same as the edited value");
			}	
			
			try 
			{
				if (CommunitySettingsSection_ScoreVisibility_AfterEdited.equalsIgnoreCase(newEditCommunitySettingsScoreVisibility)) 
				{
					testStepPassed("Community Settings Section Score Visibility Hatcher Value After edited is same as the edited value");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("Community Settings Section Score Visibility Hatcher Value After edited is same as the edited value");
			}	

			testStepPassed("");

			scrollToTopofPage();
			
			
			
			/**********Deleting Company Profile from App**********/

			companyProfilePage.deleteCompanyProfile();

			verify_Company_Deleted_Successfully();

			homePage.verify_HomePage_displayed();

			logoutFromApplication();
			
			mainPage.verify_MainPage_displayed();
			
			/**********Deleting Company Profile from App**********/
		
			testStepInfo("");
			testStepInfo("************************************");
			testStepInfo("Execution Steps Completed");
			testStepInfo("************************************");
			testStepInfo("");

			testStepInfo("");
			testStepInfo("*******************************");
			testStepInfo("Test Execution Completed");
			testStepInfo("*******************************");
			
		}
		catch(Exception e)
		{
			System.err.println(e.toString());
		}
		finally
		{
			if(this.testFailure||this.obj.testFailure||mainPage.testFailure||loginPage.testFailure||registrationCompanyPage.testFailure||registrationFounderPage.testFailure||registrationInvestmentHistoryPage.testFailure||registrationVideoInterviewPage.testFailure||userProfilePage.testFailure||homePage.testFailure||companyProfilePage.testFailure||profileUpdateRegistrationPage.testFailure||cohortPage.testFailure)
			{
				this.testFailure = true;
			}
		}
	}
}