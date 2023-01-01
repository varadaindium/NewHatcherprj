package scenarios.editprofile;

import iSAFE.ApplicationKeywords;


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

public class EditCompanyProfileClearbitandLinkedInOptionTest extends ApplicationKeywords
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

	public EditCompanyProfileClearbitandLinkedInOptionTest(BaseClass obj) 
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
			cohortPage = new CohortPage(obj);

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


			testStepPassed("New Founder Job Title : "+newFounderJobTitle);
			testStepPassed("New Founder Mobile Number : "+newFounderMobileNumber);
			testStepPassed("New Founder Bio : "+newFounderBio);
			testStepPassed("New Founder Highest Education : "+newFounderHighestEducation);
			testStepPassed("New Founder Proffesional Qualifications : "+newFounderProffesionalQualifications);

			testStepPassed("");
			testStepPassed("New Investment Capital Amount : "+newInvestmentCapitalAmount);
			testStepPassed("New Investment Current Investment Round : "+newInvestmentCurrentInvestmentRound);
			testStepPassed("New Investment Capital Exchange Percentage : "+newInvestmentCapitalExchangePercentage);
			testStepPassed("New Investment Funding Rounds : "+newInvestmentFundingRounds);

			
			
			
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


			companyProfilePage.verify_CompanySection_ClearbitOption_EditCompany_CompanyProfilePage_Elements_displayed();
			
			companyProfilePage.verify_CompanySection_LinkedInOption_EditCompany_CompanyProfilePage_Elements_displayed();
			
			companyProfilePage.verify_ContactSection_ClearbitOption_EditCompany_CompanyProfilePage_Elements_displayed();
			
			companyProfilePage.verify_ContactSection_LinkedInOption_EditCompany_CompanyProfilePage_Elements_displayed();
			
			companyProfilePage.verify_DescriptionSection_ClearbitOption_EditCompany_CompanyProfilePage_Elements_displayed();
			
			companyProfilePage.verify_DescriptionSection_LinkedInOption_EditCompany_CompanyProfilePage_Elements_displayed();
			
			companyProfilePage.verify_DigitalFootprintSection_ClearbitOption_EditCompany_CompanyProfilePage_Elements_displayed();

			companyProfilePage.verify_KeywordsSection_ClearbitOption_EditCompany_CompanyProfilePage_Elements_displayed();
	

			testStepPassed("");
			
			String CompanySection_LegalName_ClearbitOption_Value = companyProfilePage.get_CompanySection_LegalName_ClearbitOption_Value();
			
			String CompanySection_FriendlyName_ClearbitOption_Value = companyProfilePage.get_CompanySection_FriendlyName_ClearbitOption_Value();
			
			String CompanySection_FriendlyName_LinkedInOption_Value = companyProfilePage.get_CompanySection_FriendlyName_LinkedInOption_Value();
			
			String CompanySection_IncorporationDate_ClearbitOption_Value = companyProfilePage.get_CompanySection_IncorporationDate_ClearbitOption_Value();
			
			testStepPassed("Company Section LegalName Clearbit Option Value Before Edited : "+CompanySection_LegalName_ClearbitOption_Value);

			testStepPassed("Company Section FriendlyName Clearbit Option Value Before Edited : "+CompanySection_FriendlyName_ClearbitOption_Value);

			testStepPassed("Company Section FriendlyName LinkedIn Option Value Before Edited : "+CompanySection_FriendlyName_LinkedInOption_Value);

			testStepPassed("Company Section Incorporation Date Clearbit Option Value Before Edited : "+CompanySection_IncorporationDate_ClearbitOption_Value);

			testStepPassed("");
			
			
			
			testStepPassed("");
			
			String ContactSection_Address_ClearbitOption_Value = companyProfilePage.get_ContactSection_Address_ClearbitOption_Value();

			String ContactSection_Address_LinkedInOption_Value = companyProfilePage.get_ContactSection_Address_LinkedInOption_Value();

			String ContactSection_UnitorSuite_ClearbitOption_Value = companyProfilePage.get_ContactSection_UnitorSuite_ClearbitOption_Value();

			String ContactSection_City_ClearbitOption_Value = companyProfilePage.get_ContactSection_City_ClearbitOption_Value();

			String ContactSection_City_LinkedInOption_Value = companyProfilePage.get_ContactSection_City_LinkedInOption_Value();

			String ContactSection_PostalCode_ClearbitOption_Value = companyProfilePage.get_ContactSection_PostalCode_ClearbitOption_Value();

			String ContactSection_PostalCode_LinkedInOption_Value = companyProfilePage.get_ContactSection_PostalCode_LinkedInOption_Value();

			String ContactSection_State_ClearbitOption_Value = companyProfilePage.get_ContactSection_State_ClearbitOption_Value();

			String ContactSection_Latitude_ClearbitOption_Value = companyProfilePage.get_ContactSection_Latitude_ClearbitOption_Value();

			String ContactSection_Longitude_ClearbitOption_Value = companyProfilePage.get_ContactSection_Longitude_ClearbitOption_Value();
			
			testStepPassed("Contact Section Address Clearbit Option Value : "+ContactSection_Address_ClearbitOption_Value);

			testStepPassed("Contact Section Address LinkedIn Option Value : "+ContactSection_Address_LinkedInOption_Value);

			testStepPassed("Contact Section Unit / Suite Clearbit Option Value : "+ContactSection_UnitorSuite_ClearbitOption_Value);

			testStepPassed("Contact Section City Clearbit Option Value : "+ContactSection_City_ClearbitOption_Value);

			testStepPassed("Contact Section City LinkedIn Option Value : "+ContactSection_City_LinkedInOption_Value);

			testStepPassed("Contact Section PostalCode Clearbit Option Value : "+ContactSection_PostalCode_ClearbitOption_Value);

			testStepPassed("Contact Section PostalCode LinkedIn Option Value : "+ContactSection_PostalCode_LinkedInOption_Value);

			testStepPassed("Contac tSection State Clearbit Option Value : "+ContactSection_State_ClearbitOption_Value);

			testStepPassed("Contact Section Latitude Clearbit Option Value : "+ContactSection_Latitude_ClearbitOption_Value);

			testStepPassed("Contact Section Longitude Clearbit Option Value : "+ContactSection_Longitude_ClearbitOption_Value);

			testStepPassed("");

			
			testStepPassed("");
			
			String DescriptionSection_Description_ClearbitOption_Value = companyProfilePage.get_DescriptionSection_ClearbitOption_Value();

			String DescriptionSection_Description_LinkedInOption_Value = companyProfilePage.get_DescriptionSection_LinkedInOption_Value();
			
			testStepPassed("Description Section Description Clearbit Option Value After Edited : "+DescriptionSection_Description_ClearbitOption_Value);

			testStepPassed("Description Section Description LinkedIn Option Value After Edited : "+DescriptionSection_Description_LinkedInOption_Value);

			testStepPassed("");


			testStepPassed("");
			
			String DigitalFootPrintSection_Crunchbase_ClearbitOption_Value = companyProfilePage.get_DigitalFootPrintSection_Crunchbase_ClearbitOption_Value();

			String DigitalFootPrintSection_Facebook_ClearbitOption_Value = companyProfilePage.get_DigitalFootPrintSection_Facebook_ClearbitOption_Value();

			String DigitalFootPrintSection_LinkedIn_ClearbitOption_Value = companyProfilePage.get_DigitalFootPrintSection_LinkedIn_ClearbitOption_Value();

			String DigitalFootPrintSection_Twitter_ClearbitOption_Value = companyProfilePage.get_DigitalFootPrintSection_Twitter_ClearbitOption_Value();

			String DigitalFootPrintSection_Websiter_ClearbitOption_Value = companyProfilePage.get_DigitalFootPrintSection_Website_ClearbitOption_Value();
			
			testStepPassed("Digital Foot Print Section Crunchbase Clearbit Option Value : "+DigitalFootPrintSection_Crunchbase_ClearbitOption_Value);
			
			testStepPassed("Digital Foot Print Section Facebook Clearbit Option Value : "+DigitalFootPrintSection_Facebook_ClearbitOption_Value);

			testStepPassed("Digital Foot Print Section LinkedIn Clearbit Option Value : "+DigitalFootPrintSection_LinkedIn_ClearbitOption_Value);

			testStepPassed("Digital Foot Print Section Twitter Clearbit Option Value : "+DigitalFootPrintSection_Twitter_ClearbitOption_Value);

			testStepPassed("Digital Foot Print Section Website Clearbit Option Value : "+DigitalFootPrintSection_Websiter_ClearbitOption_Value);

			testStepPassed("");
			
			testStepPassed("");
		
			String KeywordsSection_Keywords_ClearbitOption_Value = companyProfilePage.get_KeywordsSection_ClearbitOption_Value();
			
			testStepPassed("Keywords Section Keywords Clearbit Option Value : "+KeywordsSection_Keywords_ClearbitOption_Value);

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