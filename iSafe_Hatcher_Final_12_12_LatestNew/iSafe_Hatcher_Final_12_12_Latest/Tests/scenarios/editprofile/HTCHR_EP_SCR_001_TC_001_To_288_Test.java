package scenarios.editprofile;

import iSAFE.ApplicationKeywords;

import java.util.List;

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
import pages.SettingsPage;
import pages.PopupDialogWindows;
import pages.EmailReaderPage;
import pages.CreatePasswordPage;
import pages.ProfileUpdateRegistrationPage;
import pages.CohortPage;

public class HTCHR_EP_SCR_001_TC_001_To_288_Test extends ApplicationKeywords
{
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
	SettingsPage settingsPage;
	PopupDialogWindows popupDialogWindows;
	EmailReaderPage emailReaderPage;
	CreatePasswordPage createPasswordPage;
	ProfileUpdateRegistrationPage profileUpdateRegistrationPage;
	CohortPage cohortPage;
	
	
	public HTCHR_EP_SCR_001_TC_001_To_288_Test(BaseClass obj) 
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
			settingsPage = new SettingsPage(obj);
			popupDialogWindows = new PopupDialogWindows(obj);
			emailReaderPage = new EmailReaderPage(obj);
			createPasswordPage = new CreatePasswordPage(obj);
			profileUpdateRegistrationPage = new ProfileUpdateRegistrationPage(obj);



			testStepInfo("");
			testStepInfo("*******************************");
			testStepInfo("Data Inputs");
			testStepInfo("*******************************");
			testStepInfo("");

			String adminEmailId = retrieve("adminEmailId");
			String adminPassword = retrieve("adminPassword");
			
			String pageOption = retrieve("pageOption");

			String emailServer = retrieve("emailServer");
			String emailId = retrieve("emailId");
			String emailPassword = retrieve("emailPassword");
			String emailSubject = retrieve("emailSubject");

			String newContactSalutation = retrieve("newContactSalutation");
			String tempVariable1 = generateRandomString();
			String newContactFirstNameData = retrieve("newContactFirstName");
			String newContactFirstName = newContactFirstNameData+tempVariable1;
			String tempVariable2 = generateRandomString();
			String newContactLastNameData = retrieve("newContactLastName");
			String newContactLastName = newContactLastNameData+tempVariable2;
			String newContactEmailAddress = retrieve("newContactEmailAddress");
			String newContactJobTitle = retrieve("newContactJobTitle");
			String newContactPhoneNumber = retrieve("newContactPhoneNumber");
			String newContactLinkedIn = retrieve("newContactLinkedIn");
			String newContactAboutPerson = retrieve("newContactAboutPerson");
			String newContactAddress = retrieve("newContactAddress");
			String newContactApartment = retrieve("newContactApartment");
			String newContactCity = retrieve("newContactCity");
			String newContactState = retrieve("newContactState");
			String newContactPostalCode = retrieve("newContactPostalCode");
			String newContactCountry = retrieve("newContactCountry");
			String newContactAccountType = retrieve("newContactAccountType");
			String newContactTypeOfBusiness = retrieve("newContactTypeOfBusiness");
			String newContactListingAddedby = "";
			String newContactSendInvite = retrieve("newContactSendInvite");
			String newContactIndustry = retrieve("newContactIndustry");
			
			String newContactPassword = retrieve("newContactPassword");
			String newContactConfirmPassword = retrieve("newContactConfirmPassword");
			
			String searchProfile = newContactFirstNameData;
			String profileNameFull = newContactLastName+" "+newContactFirstName;
			String profileNameFull2 = newContactFirstName+" "+newContactLastName;

			String tempVariable3 = generateRandomString();
			String newCompanyLegalNameData = retrieve("newCompanyLegalName");
			String newCompanyLegalName = newCompanyLegalNameData+tempVariable3;
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
			String tempVariable4 = generateRandomString();
			String newFounderFirstNameData = retrieve("newFounderFirstName");
			String newFounderFirstName = newFounderFirstNameData+tempVariable4;
			String tempVariable5 = generateRandomString();
			String newFounderLastNameData = retrieve("newFounderLastName");
			String newFounderLastName = newFounderLastNameData+tempVariable5;
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
			
			String tempVariable6 = generateRandomString();
			String newCompanyLegalName2 = newCompanyLegalNameData+tempVariable6;
			
			String tempVariable7 = generateRandomString();
			String newFounderFirstName2 = newFounderFirstNameData+tempVariable7;
			String tempVariable8 = generateRandomString();
			String newFounderLastName2 = newFounderLastNameData+tempVariable8;
			
			String newEditLegalNameSpecialCharacters = generateRandomSpecialCharacterString(10);
			String newEditFriendlyNameSpecialCharacters = generateRandomSpecialCharacterString(10);
			String newEditJurisdictionRandomNumbers = generateRandomNumbersasString(10);
			String newEditJurisdictionSpecialCharacters = generateRandomSpecialCharacterString(10);
			String newEditGoverningBodyRandomNumbers = generateRandomNumbersasString(10);
			String newEditGoverningBodySpecialCharacters = generateRandomSpecialCharacterString(10);
			String newEditRegistrationNumberSpecialCharacters = generateRandomSpecialCharacterString(10);
			String newEditLegalName100Characters = generateRandomString(100);
			String newEditFriendlyName100Characters = generateRandomString(100);
			String newEditRegistrationNumber36Charcaters = generateRandomNumbersasString(36);
			String newEditContactAddressSpecialCharacters256Characters = generateRandomSpecialCharacterString(256);
			String newEditContactUnitorSuiteSpecialCharacters128Characters = generateRandomSpecialCharacterString(128);
			String newEditContactCitySpecialCharacters128Characters = generateRandomSpecialCharacterString(128);
			String newEditContactPostalSpecialCharacters16Characters = generateRandomSpecialCharacterString(16);
			String newEditContactStateSpecialCharacters128Characters = generateRandomSpecialCharacterString(128);
			String newEditContactCountryRandomNumbers = generateRandomNumbersasString(10);
			String newEditContactCountrySpecialCharacters = generateRandomSpecialCharacterString(10);
			String newEditContactLatitudeSpecial10Characters = generateRandomSpecialCharacterString(10);
			String newEditContactLongitudeSpecial10Characters = generateRandomSpecialCharacterString(10);
			String newEditDigitalFootPrintCrunchbaseSpecial128Characters = generateRandomSpecialCharacterString(128);
			String newEditDigitalFootPrintFacebookSpecial128Characters = generateRandomSpecialCharacterString(128);
			String newEditDigitalFootPrintInstagramSpecial128Characters = generateRandomSpecialCharacterString(128);
			String newEditDigitalFootPrintAngellistSpecial128Characters = generateRandomSpecialCharacterString(128);
			String newEditDigitalFootPrintMediumSpecial128Characters = generateRandomSpecialCharacterString(128);
			String newEditDigitalFootPrintLinkedInSpecial128Characters = generateRandomSpecialCharacterString(128);
			String newEditDigitalFootPrintPinterestSpecial128Characters = generateRandomSpecialCharacterString(128);
			String newEditDigitalFootPrintRSSFeedSpecial128Characters = generateRandomSpecialCharacterString(128);
			String newEditDigitalFootPrintTwitterSpecial128Characters = generateRandomSpecialCharacterString(128);
			String newEditDigitalFootPrintVimeoSpecial128Characters = generateRandomSpecialCharacterString(128);
			String newEditDigitalFootPrintWebsiteSpecial128Characters = generateRandomSpecialCharacterString(128);
			String newEditDigitalFootPrintYouTubeSpecial128Characters = generateRandomSpecialCharacterString(128);
			String newEdiFinanceandLegalSectionAuditorSpecial256Characters = generateRandomSpecialCharacterString(256);
			String newEdiFinanceandLegalSectionBankSpecial256Characters = generateRandomSpecialCharacterString(256);
			String newEdiFinanceandLegalSectionBankABANumberSpecial100Characters = generateRandomSpecialCharacterString(100);
			String newEdiFinanceandLegalSectionBankAccountNameSpecial250Characters = generateRandomSpecialCharacterString(250);
			String newEdiFinanceandLegalSectionBankAccountNumberSpecial100Characters = generateRandomSpecialCharacterString(100);
			String newEdiFinanceandLegalSectionBankAddressSpecial512Characters = generateRandomSpecialCharacterString(512);
			String newEdiFinanceandLegalSectionBankIntermediarySpecial100Characters = generateRandomSpecialCharacterString(100);
			String newEdiFinanceandLegalSectionIntermediaryBankABANumberSpecial100Characters = generateRandomSpecialCharacterString(100);
			String newEdiFinanceandLegalSectionIntermediaryBankAddressSpecial500Characters = generateRandomSpecialCharacterString(500);
			String newEdiFinanceandLegalSectionIntermediaryBankSWIFTBICSpecial100Characters = generateRandomSpecialCharacterString(100);
			String newEdiFinanceandLegalSectionBankSwiftCodeSpecial100Characters = generateRandomSpecialCharacterString(100);
			String newEdiFinanceandLegalSectionBankIBANCodeSpecial100Characters = generateRandomSpecialCharacterString(100);
			String newEdiFinanceandLegalSectionBankInstructionsSpecial500Characters = generateRandomSpecialCharacterString(500);
			String newEdiFinanceandLegalSectionCompanySecretarySpecial128Characters = generateRandomSpecialCharacterString(128);
			String newEdiFinanceandLegalSectionLawFirmSpecial256Characters = generateRandomSpecialCharacterString(256);
			String newEditIndustryHatcher = "Accounting";
			String newEditInvalidIndustryHatcher = generateRandomSpecialCharacterString(10);
			String newEditInvalidKeywordHatcher = generateRandomSpecialCharacterString(10);
			String newEditInvalidRegionsHatcher = generateRandomSpecialCharacterString(10);
			String newEditRegionHatcher = "China";
			String newAccountTypeEntrepreneur = "Entrepreneur";
			String newAccountTypeInvestor = "Investor";
			String newAccountTypeExpert = "Expert";
			
			String newShareSalutation = retrieve("newShareSalutation");
			String newShareFirstName = retrieve("newShareFirstName");
			String newShareLastName = retrieve("newShareLastName");
			String newShareEmail = generateRandomEmailAddress();
			String newShareLegalName = retrieve("newShareLegalName");
			String newShareAddress = retrieve("newShareAddress");
			String newShareCity = retrieve("newShareCity");
			String newSharePostalCode = retrieve("newSharePostalCode");
			String newShareState = retrieve("newShareState");
			String newShareCountry = retrieve("newShareCountry");
			String newShareWebsite = retrieve("newShareWebsite");
			String newSharePhone = retrieve("newSharePhone");
			String newShareEmail2 = generateRandomEmailAddress();
			String newShareEmail3 = generateRandomEmailAddress();
			String newShareEmail4 = generateRandomEmailAddress();
			String newShareEmail5 = generateRandomEmailAddress();
			
			String newShareFirstNameSpecial100Characters = generateRandomSpecialCharacterString(100);
			String newShareLastNameSpecial100Characters = generateRandomSpecialCharacterString(100);
			String newShareLegalNameSpecial100Characters = generateRandomSpecialCharacterString(100);
			String newShareAddressSpecial256Characters = generateRandomSpecialCharacterString(256);
			String newShareCitySpecial128Characters = generateRandomSpecialCharacterString(128);
			String newSharePostalCodeSpecial16Characters = generateRandomSpecialCharacterString(16);
			String newShareStateSpecial128Characters = generateRandomSpecialCharacterString(128);
			
			String newCompanyEditDescription = "Test Edit Company Description Test Edit Company Description Test Edit Company Description Test Edit Company Description Test Edit Company Description Test Edit Company Description Test Edit Company Description ";
			String emptyFileUploadPresentation = "";
			
			String fileLocationData = retrieve("fileLocation");
			String fileLocation = "\\"+fileLocationData+"\\";
			String file1 = retrieve("file1");
			String file2 = retrieve("file2");
			String filePath1 = get_working_Directory_Path()+fileLocation+file1;
			String filePath2 = get_working_Directory_Path()+fileLocation+file2;

			String fileNameSpecial100Characters = generateRandomSpecialCharacterString(100);
			String screenshotManagerFileName = "Test Screenshot";
			
			String newTestEditDigitalCrunchbaseHatcher = retrieve("newTestEditDigitalCrunchbaseHatcher");
			String newTestEditDigitalFacebookHatcher = retrieve("newTestEditDigitalFacebookHatcher");
			String newTestEditDigitalInstagramHatcher = retrieve("newTestEditDigitalInstagramHatcher");
			String newTestEditDigitalAngellistHatcher = retrieve("newTestEditDigitalAngellistHatcher");
			String newTestEditDigitalMediumHatcher = retrieve("newTestEditDigitalMediumHatcher");
			String newTestEditDigitalLinkedInHatcher = retrieve("newTestEditDigitalLinkedInHatcher");
			String newTestEditDigitalPinterestHatcher = retrieve("newTestEditDigitalPinterestHatcher");
			String newTestEditDigitalRSSFeedHatcher = retrieve("newTestEditDigitalRSSFeedHatcher");
			String newTestEditDigitalTwitterHatcher = retrieve("newTestEditDigitalTwitterHatcher");
			String newTestEditDigitalVimeoHatcher = retrieve("newTestEditDigitalVimeoHatcher");
			String newTestEditDigitalWebsiteHatcher = retrieve("newTestEditDigitalWebsiteHatcher");
			String newTestEditDigitalYouTubeHatcher = retrieve("newTestEditDigitalYouTubeHatcher");
			
						
			testStepPassed("Admin Mail Id : "+adminEmailId);
			testStepPassed("Admin Password : "+adminPassword);
			
			testStepPassed("");
			testStepPassed("Page Option : "+pageOption);

			testStepPassed("");
			testStepPassed("Email Server : "+emailServer);
			testStepPassed("Email Id : "+emailId);
			testStepPassed("Email Password : "+emailPassword);
			testStepPassed("Email Subject : "+emailSubject);

			testStepPassed("");
			testStepPassed("New Contact Salutation : "+newContactSalutation);
			testStepPassed("New Contact First Name : "+newContactFirstName);
			testStepPassed("New Contact Last Name : "+newContactLastName);
			testStepPassed("New Contact Email Address : "+newContactEmailAddress);
			testStepPassed("New Contact Job Title : "+newContactJobTitle);
			testStepPassed("New Contact Phone Number : "+newContactPhoneNumber);
			testStepPassed("New Contact LinkedIn : "+newContactLinkedIn);
			testStepPassed("New Contact About Person : "+newContactAboutPerson);
			testStepPassed("New Contact Address : "+newContactAddress);
			testStepPassed("New Contact Apartment : "+newContactApartment);
			testStepPassed("New Contact City : "+newContactCity);
			testStepPassed("New Contact State : "+newContactState);
			testStepPassed("New Contact Postal Code : "+newContactPostalCode);
			testStepPassed("New Contact Country : "+newContactCountry);
			testStepPassed("New Contact Account Type : "+newContactAccountType);
			testStepPassed("New Contact Type Of Business : "+newContactTypeOfBusiness);
			testStepPassed("New Contact Send Invite : "+newContactSendInvite);
			testStepPassed("New Contact Industry : "+newContactIndustry);

			testStepPassed("");
			testStepPassed("New Contact Password : "+newContactPassword);
			testStepPassed("New Contact Confirm Password : "+newContactConfirmPassword);
			
			testStepPassed("");
			testStepPassed("Search Profile : "+searchProfile);
			testStepPassed("Profile Name Full : "+profileNameFull);
			testStepPassed("Profile Name Full 2 : "+profileNameFull2);


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
			testStepPassed("New Company Legal Name 2 : "+newCompanyLegalName2);

			testStepPassed("");
			testStepPassed("New Founder First Name 2 : "+newFounderFirstName2);
			testStepPassed("New Founder Last Name 2 : "+newFounderLastName2);
						
			testStepPassed("");
			testStepPassed("New Edit Legal Name Special Characters : "+newEditLegalNameSpecialCharacters);
			testStepPassed("New Edit Friendly Name Special Characters : "+newEditFriendlyNameSpecialCharacters);
			testStepPassed("New Edit Jurisdiction Random Numbers : "+newEditJurisdictionRandomNumbers);
			testStepPassed("New Edit Jurisdiction Special Characters : "+newEditJurisdictionSpecialCharacters);
			testStepPassed("New Edit Governing Body Random Numbers : "+newEditGoverningBodyRandomNumbers);
			testStepPassed("New Edit Governing Body Special Characters : "+newEditGoverningBodySpecialCharacters);
			testStepPassed("New Edit Registration Number Special Characters : "+newEditRegistrationNumberSpecialCharacters);
			testStepPassed("New Edit Legal Name 100 Characters : "+newEditLegalName100Characters);
			testStepPassed("New Edit Friednly Name 100 Characters : "+newEditLegalName100Characters);
			testStepPassed("New Edit Registration Number 36 Characters : "+newEditRegistrationNumber36Charcaters);
			testStepPassed("New Edit Address Special Charcater with 256 Characters : "+newEditContactAddressSpecialCharacters256Characters);
			testStepPassed("New Edit Unit/Suite Special Charcater with 128 Characters : "+newEditContactUnitorSuiteSpecialCharacters128Characters);
			testStepPassed("New Edit City Special Charcater with 128 Characters : "+newEditContactCitySpecialCharacters128Characters);
			testStepPassed("New Edit Postal Code Special Charcater with 16 Characters : "+newEditContactPostalSpecialCharacters16Characters);
			testStepPassed("New Edit State Special Charcater with 128 Characters : "+newEditContactStateSpecialCharacters128Characters);
			testStepPassed("New Edit Country Random Numbers : "+newEditContactCountryRandomNumbers);
			testStepPassed("New Edit Country Special Characters : "+newEditContactCountrySpecialCharacters);
			testStepPassed("New Edit Latitude Special Characters with 10 Characters : "+newEditContactLatitudeSpecial10Characters);
			testStepPassed("New Edit Longitude Special Characters with 10 Characters : "+newEditContactLongitudeSpecial10Characters);
			testStepPassed("New Edit Crunchbase Special Characters with 128 Charcaters : "+newEditDigitalFootPrintCrunchbaseSpecial128Characters);
			testStepPassed("New Edit Facebook Special Characters with 128 Charcaters : "+newEditDigitalFootPrintFacebookSpecial128Characters);
			testStepPassed("New Edit Instagram Special Characters with 128 Charcaters : "+newEditDigitalFootPrintInstagramSpecial128Characters);
			testStepPassed("New Edit Angellist Special Characters with 128 Charcaters : "+newEditDigitalFootPrintAngellistSpecial128Characters);
			testStepPassed("New Edit Medium Special Characters with 128 Charcaters : "+newEditDigitalFootPrintMediumSpecial128Characters);
			testStepPassed("New Edit LinkedIn Special Characters with 128 Charcaters : "+newEditDigitalFootPrintLinkedInSpecial128Characters);
			testStepPassed("New Edit Pinterest Special Characters with 128 Charcaters : "+newEditDigitalFootPrintPinterestSpecial128Characters);
			testStepPassed("New Edit RSS Feed Special Characters with 128 Charcaters : "+newEditDigitalFootPrintRSSFeedSpecial128Characters);
			testStepPassed("New Edit Twitter Special Characters with 128 Charcaters : "+newEditDigitalFootPrintTwitterSpecial128Characters);
			testStepPassed("New Edit Vimeo Special Characters with 128 Charcaters : "+newEditDigitalFootPrintVimeoSpecial128Characters);
			testStepPassed("New Edit Website Special Characters with 128 Charcaters : "+newEditDigitalFootPrintWebsiteSpecial128Characters);
			testStepPassed("New Edit YouTube Special Characters with 128 Charcaters : "+newEditDigitalFootPrintYouTubeSpecial128Characters);
			testStepPassed("New Edit Auditor Special Characters with 256 Charcaters : "+newEdiFinanceandLegalSectionAuditorSpecial256Characters);
			testStepPassed("New Edit Bank Special Characters with 256 Charcaters : "+newEdiFinanceandLegalSectionBankSpecial256Characters);
			testStepPassed("New Edit Bank ABA Number Special Characters with 100 Charcaters : "+newEdiFinanceandLegalSectionBankABANumberSpecial100Characters);
			testStepPassed("New Edit Bank Account Name Special Characters with 250 Charcaters : "+newEdiFinanceandLegalSectionBankAccountNameSpecial250Characters);
			testStepPassed("New Edit Bank Account Number Special Characters with 100 Charcaters : "+newEdiFinanceandLegalSectionBankAccountNumberSpecial100Characters);
			testStepPassed("New Edit Bank Address Special Characters with 512 Charcaters : "+newEdiFinanceandLegalSectionBankAddressSpecial512Characters);
			testStepPassed("New Edit Bank Intermediary Special Characters with 100 Charcaters : "+newEdiFinanceandLegalSectionBankIntermediarySpecial100Characters);
			testStepPassed("New Edit Intermediary Bank ABA Number Special Characters with 100 Charcaters : "+newEdiFinanceandLegalSectionIntermediaryBankABANumberSpecial100Characters);
			testStepPassed("New Edit Intermediary Bank Address Special Characters with 500 Charcaters : "+newEdiFinanceandLegalSectionIntermediaryBankAddressSpecial500Characters);
			testStepPassed("New Edit Intermediary Bank SWIFT BIC Special Characters with 100 Charcaters : "+newEdiFinanceandLegalSectionIntermediaryBankSWIFTBICSpecial100Characters);
			testStepPassed("New Edit Bank Swift Code Special Characters with 100 Charcaters : "+newEdiFinanceandLegalSectionBankSwiftCodeSpecial100Characters);
			testStepPassed("New Edit Bank IBAN Code Special Characters with 100 Charcaters : "+newEdiFinanceandLegalSectionBankIBANCodeSpecial100Characters);
			testStepPassed("New Edit Bank Instructions Special Characters with 500 Charcaters : "+newEdiFinanceandLegalSectionBankInstructionsSpecial500Characters);
			testStepPassed("New Edit Company Secretary Special Characters with 128 Charcaters : "+newEdiFinanceandLegalSectionCompanySecretarySpecial128Characters);
			testStepPassed("New Edit Law Firm Special Characters with 256 Charcaters : "+newEdiFinanceandLegalSectionLawFirmSpecial256Characters);
			testStepPassed("Industry Hatcher Edit Data : "+newEditIndustryHatcher);
			testStepPassed("Industry Hatcher Invalid Edit Data : "+newEditInvalidIndustryHatcher);
			testStepPassed("Keyword Hatcher Invalid Edit Data : "+newEditInvalidKeywordHatcher);
			testStepPassed("Region Hatcher Invalid Edit Data : "+newEditInvalidRegionsHatcher);
			testStepPassed("Region Hatcher Edit Data : "+newEditRegionHatcher);
			
			testStepPassed("");
			testStepPassed("New Share Salutation : "+newShareSalutation);
			testStepPassed("New Share First Name : "+newShareFirstName);
			testStepPassed("New Share Last Name : "+newShareLastName);
			testStepPassed("New Share Email : "+newShareEmail);
			testStepPassed("New Share Legal Name : "+newShareLegalName);
			testStepPassed("New Share Address : "+newShareAddress);
			testStepPassed("New Share City : "+newShareCity);
			testStepPassed("New Share Postal Code : "+newSharePostalCode);
			testStepPassed("New Share State : "+newShareState);
			testStepPassed("New Share Country : "+newShareCountry);
			testStepPassed("New Share Website : "+newShareWebsite);
			testStepPassed("New Share Phone : "+newSharePhone);
			
			testStepPassed("");
			testStepPassed("New Share First Name Special100Characters : "+newShareFirstNameSpecial100Characters);
			testStepPassed("New Share Last Name Special100Characterse : "+newShareLastNameSpecial100Characters);
			testStepPassed("New Share Legal Name Special100Characters : "+newShareLegalNameSpecial100Characters);
			testStepPassed("New Share Address Special256Characters : "+newShareAddressSpecial256Characters);
			testStepPassed("New Share City Special128Characters : "+newShareCitySpecial128Characters);
			testStepPassed("New Share Postal Code Special16Characters : "+newSharePostalCodeSpecial16Characters);
			testStepPassed("New Share State Special128Characters : "+newShareStateSpecial128Characters);

			testStepPassed("");
			testStepPassed("New Crunchbase Address : "+newTestEditDigitalCrunchbaseHatcher);
			testStepPassed("New Facebook Address : "+newTestEditDigitalFacebookHatcher);
			testStepPassed("New Instagram Address : "+newTestEditDigitalInstagramHatcher);
			testStepPassed("New Angel List Address : "+newTestEditDigitalAngellistHatcher);
			testStepPassed("New Medium Address : "+newTestEditDigitalMediumHatcher);
			testStepPassed("New LinkedIn Address : "+newTestEditDigitalLinkedInHatcher);
			testStepPassed("New Pinterest Address : "+newTestEditDigitalPinterestHatcher);
			testStepPassed("New RSSFeed Address : "+newTestEditDigitalRSSFeedHatcher);
			testStepPassed("New Twitter Address : "+newTestEditDigitalTwitterHatcher);
			testStepPassed("New Vimeo Address : "+newTestEditDigitalVimeoHatcher);
			testStepPassed("New Website Address : "+newTestEditDigitalWebsiteHatcher);
			testStepPassed("New Youtube Address : "+newTestEditDigitalYouTubeHatcher);
			
			
			testStepInfo("");
			testStepInfo("************************************");
			testStepInfo("Execution Steps Started");
			testStepInfo("************************************");
			testStepInfo("");

			clearCookies();

			openApplicationMainPageByHittingURL();
			

			/**********Checking Mail Id all registered in App and if exists deleting the profile with that Mail Id**********/

			mainPage.verify_MainPage_displayed();
			
			mainPage.click_login_button();
			
			loginPage.verify_LoginPage_displayed();
			
			loginPage.loginIntoApplication(adminEmailId, adminPassword);

			userProfilePage.verify_UserProfilePage_OppurtunitiesTab_displayed();

			click_Settings_Fixed_SideBar_HamburgerMenu();
			
			settingsPage.verify_SettingsPage_displayed();
			
			settingsPage.verify_SettingsPage_BrandingTab_displayed();
			
			settingsPage.select_Pages_dropdown(pageOption);
			
			settingsPage.verify_SettingsPage_UserPage_UsersTab_displayed();
			
			settingsPage.click_SettingsPage_UserPage_UsersTab();
			
			settingsPage.verify_SettingsPage_UserPage_UsersTab_Section_displayed();
			
			settingsPage.verify_Users_DisplayedinApplication_DeleteUser(newContactEmailAddress);
			
			logoutFromApplication();

			mainPage.verify_MainPage_displayed();
			
			/**********Checking Mail Id all registered in App and if exists deleting the profile with that Mail Id**********/
			
			
			
			mainPage.click_login_button();

			loginPage.verify_LoginPage_displayed();

			loginPage.loginIntoApplication(adminEmailId, adminPassword);

			//userProfilePage.verify_UserProfilePage_OppurtunitiesTab_displayed();
			
			
			
			/***********************Adding New Investor Individual Contact*******************************/

			click_AddContact_Actions_Menu();
			cohortPage.verify_Cohort_Page_displayed();
			cohortPage.select_Cohort(" value ");//chk in UI
			cohortPage.click_Submit_button();

			popupDialogWindows.verify_CreateContact_ModalDialog_Window_displayed();

			popupDialogWindows.fillCreateNewContact(newContactSalutation, newContactFirstName, newContactLastName, newContactEmailAddress, newContactJobTitle, newContactPhoneNumber, newContactLinkedIn, newContactAboutPerson, newContactAddress, newContactApartment, newContactCity, newContactState, newContactPostalCode, newContactCountry, newContactAccountType,newContactTypeOfBusiness, newContactListingAddedby, newContactSendInvite, newContactIndustry);

			popupDialogWindows.click_AddIndividual_Button_CreateContact();
	
			userProfilePage.verify_UserProfilePage_ProfileTab_displayed();
			
			userProfilePage.verify_CorrespondingUserProfilePage_displayed_by_ProfileName(profileNameFull2);
			
			logoutFromApplication();

			String addNewContactActivateUrl = emailReaderPage.getNewContactActivateURL(emailServer, emailId, emailPassword, emailSubject);

			driver.get(addNewContactActivateUrl);
			
			createPasswordPage.verify_CreatePassword_Page_displayed();
			
			createPasswordPage.fillPasswordForm(newContactPassword, newContactConfirmPassword);
			
			createPasswordPage.click_CreatePassword_CreatePasswordPage();

			userProfilePage.verify_UserProfilePage_OppurtunitiesTab_displayed();
			
			userProfilePage.verify_CorrespondingUserProfilePage_displayed_by_ProfileName(profileNameFull2);

			logoutFromApplication();
			
			mainPage.verify_MainPage_displayed();

			mainPage.click_login_button();

			loginPage.verify_LoginPage_displayed();

			loginPage.loginIntoApplication(newContactEmailAddress, newContactPassword);
			
			userProfilePage.verify_UserProfilePage_OppurtunitiesTab_displayed();
			
			userProfilePage.verify_CorrespondingUserProfilePage_displayed_by_ProfileName(profileNameFull2);

			logoutFromApplication();
			
			mainPage.verify_MainPage_displayed();
			
			/***********************Adding New Investor Individual Contact*******************************/
			
			

			mainPage.verify_MainPage_displayed();

			mainPage.click_login_button();

			loginPage.verify_LoginPage_displayed();

			loginPage.loginIntoApplication(adminEmailId, adminPassword);

			userProfilePage.verify_UserProfilePage_OppurtunitiesTab_displayed();
			
			
			/******************************Add Company using Add Deal Option********************************************/

			click_AddDeal_Actions_Menu();

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
			
			logoutFromApplication();
			
			mainPage.verify_MainPage_displayed();
			
			/******************************Add Company using Add Deal Option********************************************/
			
			
			mainPage.verify_MainPage_displayed();

			mainPage.click_login_button();

			loginPage.verify_LoginPage_displayed();

			loginPage.loginIntoApplication(adminEmailId, adminPassword);

			userProfilePage.verify_UserProfilePage_OppurtunitiesTab_displayed();
			
			
			/******************************Add Company 2 using Add Deal Option********************************************/

			click_AddDeal_Actions_Menu();

			registrationCompanyPage.verify_Registration_Company_displayed();

			registrationCompanyPage.fillCompanyInformation(newCompanyLegalName2, newCompanyWebsite, newCompanyCity, newCompanyCountry, newCompanyDescription, newCompanyIncorporationDate, newCompanyBusinessStatus, newCompanyIndustries, newCompanyUNSDGs);

			registrationCompanyPage.click_Next_CompanyInformation();

			registrationFounderPage.verify_Registration_Founder_displayed();

			registrationFounderPage.fillFounderCompanyRegistration(newFounderSalutation, newFounderFirstName2, newFounderLastName2, newFounderJobTitle, newFounderMobileNumber, newFounderEmailAddress, newFounderBio, newFounderHighestEducation, newFounderProffesionalQualifications);

			registrationFounderPage.click_Next_FounderInformation();

			registrationInvestmentHistoryPage.verify_Registration_InvestmentHistory_displayed();

			registrationInvestmentHistoryPage.fillInvestmentInformation(newInvestmentCapitalAmount, newInvestmentCurrentInvestmentRound, newInvestmentCapitalExchangePercentage, newInvestmentFundingRounds);

			registrationInvestmentHistoryPage.click_Next_InvestmentHistory();

			registrationVideoInterviewPage.verify_Registration_VideoInterview_displayed();

			registrationVideoInterviewPage.skipVideoInterview();

			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_ProfileTab_CompanyProfilePage_displayed();

			companyProfilePage.verify_CorrespondingCompanyProfilePage_displayed_by_CompanyName(newCompanyLegalName);
						
			/******************************Add Company 2 using Add Deal Option********************************************/

			
			companyProfilePage.editCompanyProfile();

			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_EditCompany_CompanyProfilePage_displayed();



			WebElement element = driver.findElement(By.xpath("//div[contains(@id,'company')]//span[contains(text(),'Company')]"));

			scrolltoElementView(element);

			testStepInfo("");
			testStepInfo("Company Section Legal Name Special Charcaters Validation");
			testStepInfo("**************************************************************************");

			String CompanySection_LegalName_HatcherOption_Value_BeforeEdited_SpecialCharcaters = companyProfilePage.get_CompanySection_LegalName_HatcherOption_Value();
			
			testStepPassed("Company Section Legal Name Hatcher Option Value Before Edited : "+CompanySection_LegalName_HatcherOption_Value_BeforeEdited_SpecialCharcaters);
			
			//companyProfilePage.click_CompanySection_LegalName_HatcherOption_RadioButton();
			
			companyProfilePage.enter_CompanySection_LegalName_HatcherOption_Textbox(newEditLegalNameSpecialCharacters);

			companyProfilePage.click_CompanySection_Save_Changes_Button();

			verify_Company_Section_EditCompanyProfile_Updated_Successfully();

			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_EditCompany_CompanyProfilePage_displayed();

			String CompanySection_LegalName_HatcherOption_Value_AfterEdited_SpecialCharcaters = companyProfilePage.get_CompanySection_LegalName_HatcherOption_Value();
			
			testStepPassed("Company Section Legal Name Hatcher Option Value After Edited with Special Characters : "+CompanySection_LegalName_HatcherOption_Value_AfterEdited_SpecialCharcaters);
			
			if (CompanySection_LegalName_HatcherOption_Value_AfterEdited_SpecialCharcaters.equalsIgnoreCase(newEditLegalNameSpecialCharacters)) 
			{
				testStepPassed("Company Section Legal Name Hatcher Value After edited with Special Charcater is same as the edited value");
			} 
			else 
			{
				testStepFailed("Company Section Legal Name Hatcher Value After edited with Special Charcater is not same as the edited value");
			}
				
			testStepInfo("");
			testStepInfo("Company Section Friendly Name Special Charcaters Validation");
			testStepInfo("***********************************************************************");
			
			String CompanySection_FriendlyName_HatcherOption_Value_BeforeEdited_SpecialCharcaters = companyProfilePage.get_CompanySection_FriendlyName_HatcherOption_Value();
			
			testStepPassed("Company Section Friendly Name Hatcher Option Value Before Edited : "+CompanySection_FriendlyName_HatcherOption_Value_BeforeEdited_SpecialCharcaters);
			
			companyProfilePage.click_CompanySection_FriendlyName_HatcherOption_RadioButton();
			
			companyProfilePage.enter_CompanySection_FriendlyName_HatcherOption_Textbox(newEditFriendlyNameSpecialCharacters);
			
			companyProfilePage.click_CompanySection_Save_Changes_Button();

			verify_Company_Section_EditCompanyProfile_Updated_Successfully();

			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_EditCompany_CompanyProfilePage_displayed();
			
			String CompanySection_FriendlyName_HatcherOption_Value_AfterEdited_SpecialCharcaters = companyProfilePage.get_CompanySection_FriendlyName_HatcherOption_Value();
			
			testStepPassed("Company Section Friendly Name Hatcher Option Value After Edited with Special Characters : "+CompanySection_FriendlyName_HatcherOption_Value_AfterEdited_SpecialCharcaters);
						
			if (CompanySection_FriendlyName_HatcherOption_Value_AfterEdited_SpecialCharcaters.equalsIgnoreCase(newEditFriendlyNameSpecialCharacters)) 
			{
				testStepPassed("Company Section Friendly Name Hatcher Value After edited with Special Charcater is same as the edited value");
			} 
			else 
			{
				testStepFailed("Company Section Friendly Name Hatcher Value After edited with Special Charcater is not same as the edited value");
			}
			
						
			testStepInfo("");
			testStepInfo("Company Section Jurisdiction Numbers and Special Charcaters Error Message Validation");
			testStepInfo("************************************************************************************************************");

			companyProfilePage.click_CompanySection_Jurisdiction_HatcherOption_RadioButton();
			
		//	companyProfilePage.verify_CompanySection_Jurisdiction_HatcherOption_Textbox_elementNotFound_errorMessage_Displayed(newEditJurisdictionRandomNumbers);
			
		//	companyProfilePage.verify_CompanySection_Jurisdiction_HatcherOption_Textbox_elementNotFound_errorMessage_Displayed(newEditJurisdictionSpecialCharacters);
			
			
			testStepInfo("");
			testStepInfo("Company Section Governing Body Numbers and Special Charcaters Error Message Validation");
			testStepInfo("************************************************************************************************************");

			companyProfilePage.click_CompanySection_Jurisdiction_HatcherOption_RadioButton();
			
			companyProfilePage.verify_CompanySection_GoverningBody_elementNotFound_errorMessage_Displayed(newEditGoverningBodyRandomNumbers);
			
			companyProfilePage.verify_CompanySection_GoverningBody_elementNotFound_errorMessage_Displayed(newEditGoverningBodySpecialCharacters);
			
			
			testStepInfo("");
			testStepInfo("Company Section Registration Number Numbers and Special Charcaters Error Message Validation");
			testStepInfo("**********************************************************************************************************************");

			String CompanySection_RegistrationNumber_HatcherOption_Value_BeforeEdited_SpecialCharacters = companyProfilePage.get_CompanySection_RegistrationNumber_HatcherOption_Value();
			
			testStepPassed("Company Section Registration Number Hatcher Option Value Before Edited :"+CompanySection_RegistrationNumber_HatcherOption_Value_BeforeEdited_SpecialCharacters);
			
			companyProfilePage.click_CompanySection_RegistrationNumber_HatcherOption_RadioButton();
			
			companyProfilePage.enter_CompanySection_RegistrationNumber_HatcherOption_Textbox(newEditRegistrationNumberSpecialCharacters);
			
			companyProfilePage.click_CompanySection_Save_Changes_Button();

			verify_Company_Section_EditCompanyProfile_Updated_Successfully();

			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_EditCompany_CompanyProfilePage_displayed();

			String CompanySection_RegistrationNumber_HatcherOption_Value_AfterEdited_SpecialCharcaters = companyProfilePage.get_CompanySection_RegistrationNumber_HatcherOption_Value();
			
			testStepPassed("Company Section Registration Number Hatcher Option Value After Edited with Special Characters : "+CompanySection_RegistrationNumber_HatcherOption_Value_AfterEdited_SpecialCharcaters);
			
			if (CompanySection_RegistrationNumber_HatcherOption_Value_AfterEdited_SpecialCharcaters.equalsIgnoreCase(newEditRegistrationNumberSpecialCharacters)) 
			{
				testStepPassed("Company Section Registration Number Hatcher Value After edited with Special Charcater is same as the edited value");
			} 
			else 
			{
				testStepFailed("Company Section Registration Number Hatcher Value After edited with Special Charcater is not same as the edited value");
			}
			
			
			testStepInfo("");
			testStepInfo("Company Section Legal Name 100 Characters Numbers and Special Charcaters Error Message Validation");
			testStepInfo("**************************************************************************************************************************");

			String CompanySection_LegalName_HatcherOption_Value_BeforeEdited_100Charcaters = companyProfilePage.get_CompanySection_LegalName_HatcherOption_Value();
			
			testStepPassed("Company Section Legal Name Hatcher Option Value Before Edited : "+CompanySection_LegalName_HatcherOption_Value_BeforeEdited_100Charcaters);
			
			//companyProfilePage.click_CompanySection_LegalName_HatcherOption_RadioButton();
			
			companyProfilePage.enter_CompanySection_LegalName_HatcherOption_Textbox(newEditLegalName100Characters);

			companyProfilePage.click_CompanySection_Save_Changes_Button();

			verify_Company_Section_EditCompanyProfile_Updated_Successfully();

			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_EditCompany_CompanyProfilePage_displayed();

			String CompanySection_LegalName_HatcherOption_Value_AfterEdited_100Charcaters = companyProfilePage.get_CompanySection_LegalName_HatcherOption_Value();
			
			testStepPassed("Company Section Legal Name Hatcher Option Value After Edited with Special Characters : "+CompanySection_LegalName_HatcherOption_Value_AfterEdited_100Charcaters);
			
			if (CompanySection_LegalName_HatcherOption_Value_AfterEdited_100Charcaters.equalsIgnoreCase(newEditLegalName100Characters)) 
			{
				testStepPassed("Company Section Legal Name Hatcher Value After edited with 100 Charcaters is same as the edited value");
			} 
			else 
			{
				testStepFailed("Company Section Legal Name Hatcher Value After edited with 100 Charcaters is not same as the edited value");
			}

			testStepInfo("");
			testStepInfo("Company Section Friendly Name 100 Charcaters Validation");
			testStepInfo("***************************************************************************");
			
			String CompanySection_FriendlyName_HatcherOption_Value_BeforeEdited_100Charcaters = companyProfilePage.get_CompanySection_FriendlyName_HatcherOption_Value();
			
			testStepPassed("Company Section Friendly Name Hatcher Option Value Before Edited : "+CompanySection_FriendlyName_HatcherOption_Value_BeforeEdited_100Charcaters);
			
			companyProfilePage.click_CompanySection_FriendlyName_HatcherOption_RadioButton();
			
			companyProfilePage.enter_CompanySection_FriendlyName_HatcherOption_Textbox(newEditFriendlyName100Characters);
			
			companyProfilePage.click_CompanySection_Save_Changes_Button();

			verify_Company_Section_EditCompanyProfile_Updated_Successfully();

			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_EditCompany_CompanyProfilePage_displayed();
			
			String CompanySection_FriendlyName_HatcherOption_Value_AfterEdited_100Charcaters = companyProfilePage.get_CompanySection_FriendlyName_HatcherOption_Value();
			
			testStepPassed("Company Section Friendly Name Hatcher Option Value After Edited with 100 Characters : "+CompanySection_FriendlyName_HatcherOption_Value_AfterEdited_100Charcaters);
						
			if (CompanySection_FriendlyName_HatcherOption_Value_AfterEdited_100Charcaters.equalsIgnoreCase(newEditFriendlyName100Characters)) 
			{
				testStepPassed("Company Section Friendly Name Hatcher Value After edited with 100 Charcater is same as the edited value");
			} 
			else 
			{
				testStepFailed("Company Section Friendly Name Hatcher Value After edited with 100 Charcater is not same as the edited value");
			}
			
			testStepInfo("");
			testStepInfo("Company Section Registration Number Numbers and 36 Charcaters Validation");
			testStepInfo("*********************************************************************************************");

			String CompanySection_RegistrationNumber_HatcherOption_Value_BeforeEdited_36Charcaters = companyProfilePage.get_CompanySection_RegistrationNumber_HatcherOption_Value();
			
			testStepPassed("Company Section Registration Number Hatcher Option Value Before Edited :"+CompanySection_RegistrationNumber_HatcherOption_Value_BeforeEdited_36Charcaters);
			
			companyProfilePage.click_CompanySection_RegistrationNumber_HatcherOption_RadioButton();
			
			companyProfilePage.enter_CompanySection_RegistrationNumber_HatcherOption_Textbox(newEditRegistrationNumber36Charcaters);
			
			companyProfilePage.click_CompanySection_Save_Changes_Button();

			verify_Company_Section_EditCompanyProfile_Updated_Successfully();

			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_EditCompany_CompanyProfilePage_displayed();

			String CompanySection_RegistrationNumber_HatcherOption_Value_AfterEdited_36Charcaters = companyProfilePage.get_CompanySection_RegistrationNumber_HatcherOption_Value();
			
			testStepPassed("Company Section Registration Number Hatcher Option Value After Edited with 36 Characters : "+CompanySection_RegistrationNumber_HatcherOption_Value_AfterEdited_36Charcaters);
			
			if (CompanySection_RegistrationNumber_HatcherOption_Value_AfterEdited_36Charcaters.equalsIgnoreCase(newEditRegistrationNumber36Charcaters)) 
			{
				testStepPassed("Company Section Registration Number Hatcher Value After edited with 100 Charcater is same as the edited value");
			} 
			else 
			{
				testStepFailed("Company Section Registration Number Hatcher Value After edited with 100 Charcater is not same as the edited value");
			}
				testStepInfo("");
			testStepInfo("Company Former Section Validations");
			testStepInfo("********************************************");

			String placeholder = companyProfilePage.get_CompanyFormerNamesSection_FormerName_Placeholder();
			
			if (placeholder.equalsIgnoreCase("Type former name")) 
			{
				testStepPassed("Company Former Section Company Name Hatcher Value Placeholder text is as expected");
			} 
			else 
			{
				testStepFailed("Company Former Section Company Name Hatcher Value Placeholder text is not as expected");
			}
			
			
			companyProfilePage.enter_CompanyFormerNamesSection_FormerName("Test Company");
			
			List <WebElement> companyFormerNames = driver.findElements(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'former-names')]//table//tbody//input"));
			
			int companyFormerNamesCount = companyFormerNames.size();
			
			
			if (companyFormerNamesCount==2) 
			{
				testStepPassed("Company Former Section Company Name 2 textbox is displayed as expected after entering value in first textbox");
			} 
			else 
			{
				testStepFailed("Company Former Section Company Name 2 textbox is not displayed as expected after entering value in first textbox");
			}
			
			companyProfilePage.click_CompanyFormerNamesSection_CloseNewRecordRow_Button();
			
			List <WebElement> companyFormerNames2 = driver.findElements(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'former-names')]//table//tbody//input"));
			
			int companyFormerNamesCount2 = companyFormerNames2.size();

			
			if (companyFormerNamesCount2==1) 
			{
				testStepPassed("Company Former Section Company Name 1 textbox is displayed as expected after deleting first textbox row");
			} 
			else 
			{
				testStepFailed("Company Former Section Company Name 1 textbox is not displayed as expected after deleting first textbox row");
			}
			
				
			
			testStepInfo("");
			testStepInfo("Contact Section Address 256 Charcaters and Special Charcaters Validations");
			testStepInfo("************************************************************************************************");

			String ContactSection_Address_HatcherOption_Value_BeforeEdited_Special256Charcaters = companyProfilePage.get_ContactSection_Address_HatcherOption_Value();
			
			testStepPassed("Contact Section Address Hatcher Option Value Before Edited :"+ContactSection_Address_HatcherOption_Value_BeforeEdited_Special256Charcaters);
			
			companyProfilePage.click_ContactDetailsSection_Address_HatcherOption_RadioButton();
			
			companyProfilePage.enter_ContactDetailsSection_Address_HatcherOption_Textbox(newEditContactAddressSpecialCharacters256Characters);
			
			companyProfilePage.click_ContactSection_Save_Changes_Button();

			verify_Contact_Section_EditCompanyProfile_Updated_Successfully();

			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_EditCompany_CompanyProfilePage_displayed();
			
			String ContactSection_Address_HatcherOption_Value_AfterEdited_Special256Charcaters = companyProfilePage.get_ContactSection_Address_HatcherOption_Value();
			
			testStepPassed("Contact Section Address Hatcher Option Value After Special Charcater and 256 Charcater Edited :"+ContactSection_Address_HatcherOption_Value_AfterEdited_Special256Charcaters);
			
			if (ContactSection_Address_HatcherOption_Value_AfterEdited_Special256Charcaters.equalsIgnoreCase(newEditContactAddressSpecialCharacters256Characters)) 
			{
				testStepPassed("Contact Section Address Hatcher Value After edited with 256 Special Charcater is same as the edited value");
			} 
			else 
			{
				testStepFailed("Contact Section Address Hatcher Value After edited with 256 Special Charcater is not same as the edited value");
			}
			
					
			testStepInfo("");
			testStepInfo("Contact Section Unit/Suite 128 Charcaters and Special Charcaters Validations");
			testStepInfo("**************************************************************************************************");

			String ContactSection_UnitorSuite_HatcherOption_Value_BeforeEdited_Special128Charcaters = companyProfilePage.get_ContactSection_UnitorSuite_HatcherOption_Value();
			
			testStepPassed("Contact Section Unit / Suite Hatcher Option Value Before Edited :"+ContactSection_UnitorSuite_HatcherOption_Value_BeforeEdited_Special128Charcaters);
			
			companyProfilePage.click_ContactDetailsSection_UnitorSuite_HatcherOption_RadioButton();
			
			companyProfilePage.enter_ContactDetailsSection_UnitorSuite_HatcherOption_Textbox(newEditContactUnitorSuiteSpecialCharacters128Characters);

			companyProfilePage.click_ContactSection_Save_Changes_Button();

			verify_Contact_Section_EditCompanyProfile_Updated_Successfully();

			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_EditCompany_CompanyProfilePage_displayed();

			String ContactSection_UnitorSuite_HatcherOption_Value_AfterEdited_Special128Charcaters = companyProfilePage.get_ContactSection_UnitorSuite_HatcherOption_Value();
			
			testStepPassed("Contact Section Unit / Suite Hatcher Option Value After Special Charcater and 128 Charcater Edited :"+ContactSection_UnitorSuite_HatcherOption_Value_AfterEdited_Special128Charcaters);
			
			if (ContactSection_UnitorSuite_HatcherOption_Value_AfterEdited_Special128Charcaters.equalsIgnoreCase(newEditContactUnitorSuiteSpecialCharacters128Characters)) 
			{
				testStepPassed("Contact Section Unit / Suite Hatcher Value After edited with 128 Special Charcater is same as the edited value");
			} 
			else 
			{
				testStepFailed("Contact Section Unit / Suite Hatcher Value After edited with 128 Special Charcater is not same as the edited value");
			}
			
				
			
			testStepInfo("");
			testStepInfo("Contact Section City 128 Characters and Special Charcaters Validations");
			testStepInfo("***************************************************************************************************");

			String ContactSection_City_HatcherOption_Value_BeforeEdited_Special128Charcaters = companyProfilePage.get_ContactSection_City_HatcherOption_Value();
			
			testStepPassed("Contact Section City Hatcher Option Value Before Edited :"+ContactSection_City_HatcherOption_Value_BeforeEdited_Special128Charcaters);
			
			companyProfilePage.click_ContactDetailsSection_City_HatcherOption_RadioButton();
			
			companyProfilePage.enter_ContactDetailsSection_City_HatcherOption_Textbox(newEditContactCitySpecialCharacters128Characters);

			companyProfilePage.click_ContactSection_Save_Changes_Button();

			verify_Contact_Section_EditCompanyProfile_Updated_Successfully();

			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_EditCompany_CompanyProfilePage_displayed();

			String ContactSection_City_HatcherOption_Value_AfterEdited_Special128Charcaters = companyProfilePage.get_ContactSection_City_HatcherOption_Value();
			
			testStepPassed("Contact Section City Hatcher Option Value After Special Charcater and 128 Charcater Edited :"+ContactSection_City_HatcherOption_Value_AfterEdited_Special128Charcaters);
			
			if (ContactSection_City_HatcherOption_Value_AfterEdited_Special128Charcaters.equalsIgnoreCase(newEditContactCitySpecialCharacters128Characters)) 
			{
				testStepPassed("Contact Section City Hatcher Value After edited with 256 Special Charcater is same as the edited value");
			} 
			else 
			{
				testStepFailed("Contact Section City Hatcher Value After edited with 256 Special Charcater is not same as the edited value");
			}
			
					
			
			testStepInfo("");
			testStepInfo("Contact Section Postal Code 16 Characters and Special Charcaters Validations");
			testStepInfo("***************************************************************************************************");

			String ContactSection_PostalCode_HatcherOption_Value_BeforeEdited_Special16Charcaters = companyProfilePage.get_ContactSection_PostalCode_HatcherOption_Value();
			
			testStepPassed("Contact Section Postal Code Hatcher Option Value Before Edited :"+ContactSection_PostalCode_HatcherOption_Value_BeforeEdited_Special16Charcaters);
			
			//companyProfilePage.click_ContactDetailsSection_PostalCode_HatcherOption_RadioButton();
			
			companyProfilePage.enter_ContactDetailsSection_PostalCode_HatcherOption_Textbox(newEditContactPostalSpecialCharacters16Characters);

			companyProfilePage.click_ContactSection_Save_Changes_Button();

			verify_Contact_Section_EditCompanyProfile_Updated_Successfully();

			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_EditCompany_CompanyProfilePage_displayed();

			String ContactSection_PostalCode_HatcherOption_Value_AfterEdited_Special16Charcaters = companyProfilePage.get_ContactSection_PostalCode_HatcherOption_Value();
			
			testStepPassed("Contact Section Postal Code Hatcher Option Value After Special Charcater and 16 Charcater Edited :"+ContactSection_PostalCode_HatcherOption_Value_AfterEdited_Special16Charcaters);
			
			if (ContactSection_PostalCode_HatcherOption_Value_AfterEdited_Special16Charcaters.equalsIgnoreCase(newEditContactPostalSpecialCharacters16Characters)) 
			{
				testStepPassed("Contact Section Postal Code Hatcher Value After edited with 16 Special Charcater is same as the edited value");
			} 
			else 
			{
				testStepFailed("Contact Section Postal Code Hatcher Value After edited with 16 Special Charcater is not same as the edited value");
			}
			
			
						
			testStepInfo("");
			testStepInfo("Contact Section State 128 Characters and Special Charcaters Validations");
			testStepInfo("***************************************************************************************************");

			String ContactSection_State_HatcherOption_Value_BeforeEdited_Special128Charcaters = companyProfilePage.get_ContactSection_State_HatcherOption_Value();
			
			testStepPassed("Contact Section State Hatcher Option Value Before Edited :"+ContactSection_State_HatcherOption_Value_BeforeEdited_Special128Charcaters);
			
			companyProfilePage.click_ContactDetailsSection_State_HatcherOption_RadioButton();
			
			companyProfilePage.enter_ContactDetailsSection_State_HatcherOption_Textbox(newEditContactStateSpecialCharacters128Characters);

			companyProfilePage.click_ContactSection_Save_Changes_Button();

			verify_Contact_Section_EditCompanyProfile_Updated_Successfully();

			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_EditCompany_CompanyProfilePage_displayed();

			String ContactSection_State_HatcherOption_Value_AfterEdited_Special128Charcaters = companyProfilePage.get_ContactSection_State_HatcherOption_Value();
			
			testStepPassed("Contact Section State Hatcher Option Value After Special Charcater and 128 Charcater Edited :"+ContactSection_State_HatcherOption_Value_AfterEdited_Special128Charcaters);
			
			if (ContactSection_State_HatcherOption_Value_AfterEdited_Special128Charcaters.equalsIgnoreCase(newEditContactStateSpecialCharacters128Characters)) 
			{
				testStepPassed("Contact Section State Hatcher Value After edited with 128 Special Charcater is same as the edited value");
			} 
			else 
			{
				testStepFailed("Contact Section State Hatcher Value After edited with 128 Special Charcater is not same as the edited value");
			}
			
						
			testStepInfo("");
			testStepInfo("Contact Section Country Numbers and Special Charcaters Error Message Validation");
			testStepInfo("************************************************************************************************************");

			companyProfilePage.click_ContactDetailsSection_Country_HatcherOption_RadioButton();
			
			companyProfilePage.select_ContactSection_Country_elementNotFound_errorMessage_Displayed(newEditContactCountryRandomNumbers);
			
			companyProfilePage.select_ContactSection_Country_elementNotFound_errorMessage_Displayed(newEditContactCountrySpecialCharacters);
					
						
			testStepInfo("");
			testStepInfo("Contact Section Latitude 10 Characters and Special Charcaters Validations");
			testStepInfo("***************************************************************************************************");

			String ContactSection_Latitude_HatcherOption_Value_BeforeEdited_Special10Charcaters = companyProfilePage.get_ContactSection_Latitude_HatcherOption_Value();
			
			testStepPassed("Contact Section Latitude Hatcher Option Value Before Edited :"+ContactSection_Latitude_HatcherOption_Value_BeforeEdited_Special10Charcaters);
			
			companyProfilePage.click_ContactDetailsSection_Latitude_HatcherOption_RadioButton();
			
			companyProfilePage.enter_ContactDetailsSection_Latitude_HatcherOption_Textbox(newEditContactLatitudeSpecial10Characters);

			companyProfilePage.click_ContactSection_Save_Changes_Button();

			verify_Contact_Section_EditCompanyProfile_Updated_Successfully();

			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_EditCompany_CompanyProfilePage_displayed();

			String ContactSection_Latitude_HatcherOption_Value_AfterEdited_Special10Charcaters = companyProfilePage.get_ContactSection_Latitude_HatcherOption_Value();
			
			testStepPassed("Contact Section Latitude Hatcher Option Value After Special Charcater and 10 Charcater Edited :"+ContactSection_Latitude_HatcherOption_Value_AfterEdited_Special10Charcaters);
			
			if (ContactSection_Latitude_HatcherOption_Value_AfterEdited_Special10Charcaters.equalsIgnoreCase(newEditContactLatitudeSpecial10Characters)) 
			{
				testStepPassed("Contact Section Latitude Hatcher Value After edited with 10 Special Charcater is same as the edited value");
			} 
			else 
			{
				testStepFailed("Contact Section Latitude Hatcher Value After edited with 10 Special Charcater is not same as the edited value");
			}
			
							
			testStepInfo("");
			testStepInfo("Contact Section Longitude 10 Characters and Special Charcaters Validations");
			testStepInfo("***************************************************************************************************");

			String ContactSection_Longitude_HatcherOption_Value_BeforeEdited_Special10Charcaters = companyProfilePage.get_ContactSection_Longitude_HatcherOption_Value();
			
			testStepPassed("Contact Section Longitude Hatcher Option Value Before Edited :"+ContactSection_Longitude_HatcherOption_Value_BeforeEdited_Special10Charcaters);
			
			companyProfilePage.click_ContactDetailsSection_Longitude_HatcherOption_RadioButton();
			
			companyProfilePage.enter_ContactDetailsSection_Longitude_HatcherOption_Textbox(newEditContactLongitudeSpecial10Characters);

			companyProfilePage.click_ContactSection_Save_Changes_Button();

			verify_Contact_Section_EditCompanyProfile_Updated_Successfully();

			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_EditCompany_CompanyProfilePage_displayed();

			String ContactSection_Longitude_HatcherOption_Value_AfterEdited_Special10Charcaters = companyProfilePage.get_ContactSection_Longitude_HatcherOption_Value();
			
			testStepPassed("Contact Section Longitude Hatcher Option Value After Special Charcater and 10 Charcater Edited :"+ContactSection_Longitude_HatcherOption_Value_AfterEdited_Special10Charcaters);
			
			if (ContactSection_Longitude_HatcherOption_Value_AfterEdited_Special10Charcaters.equalsIgnoreCase(newEditContactLongitudeSpecial10Characters)) 
			{
				testStepPassed("Contact Section Longitude Hatcher Value After edited with 10 Special Charcater is same as the edited value");
			} 
			else 
			{
				testStepFailed("Contact Section Longitude Hatcher Value After edited with 10 Special Charcater is not same as the edited value");
			}

			testStepInfo("");
			testStepInfo("Digital Footprint Section Crunchbase 128 Characters and Special Charcaters Validations");
			testStepInfo("*********************************************************************************************************");

			String DigitalFootPrintSection_Crunchbase_HatcherOption_Value_BeforeEdited_Special128Charcaters = companyProfilePage.get_DigitalFootPrintSection_Crunchbase_HatcherOption_Value();
			
			testStepPassed("Digital Footprint Section Crunchbase Hatcher Option Value Before Edited :"+DigitalFootPrintSection_Crunchbase_HatcherOption_Value_BeforeEdited_Special128Charcaters);
			
			companyProfilePage.click_DigitalFootPrintSection_Crunchbase_HatcherOption_RadioButton();
			
			companyProfilePage.enter_DigitalFootPrintSection_Crunchbase_HatcherOption_Textbox(newEditDigitalFootPrintCrunchbaseSpecial128Characters);

			companyProfilePage.click_DigitalFootPrintSection_Save_Changes_Button();

			verify_Digital_Section_EditCompanyProfile_Updated_Successfully();

			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_EditCompany_CompanyProfilePage_displayed();

			String DigitalFootPrintSection_Crunchbase_HatcherOption_Value_AfterEdited_Special128Charcaters = companyProfilePage.get_DigitalFootPrintSection_Crunchbase_HatcherOption_Value();
			
			testStepPassed("Digital Footprint Section Crunchbase Hatcher Option Value After Special Charcater and 128 Charcater Edited :"+DigitalFootPrintSection_Crunchbase_HatcherOption_Value_AfterEdited_Special128Charcaters);
			
			if (DigitalFootPrintSection_Crunchbase_HatcherOption_Value_AfterEdited_Special128Charcaters.equalsIgnoreCase(newEditDigitalFootPrintCrunchbaseSpecial128Characters)) 
			{
				testStepPassed("Digital Footprint Section Crunchbase Hatcher Value After edited with 128 Special Charcater is same as the edited value");
			} 
			else 
			{
				testStepFailed("Digital Footprint Section Crunchbase Hatcher Value After edited with 128 Special Charcater is not same as the edited value");
			}			
			
			
			testStepInfo("");
			testStepInfo("Digital Footprint Section Facebook 128 Characters and Special Charcaters Validations");
			testStepInfo("*******************************************************************************************************************");
			
			WebElement element2 = driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='Crunchbase']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']"));
			scrolltoElementView(element2);

			String DigitalFootPrintSection_Facebook_HatcherOption_Value_BeforeEdited_Special128Charcaters = companyProfilePage.get_DigitalFootPrintSection_Facebook_HatcherOption_Value();
			
			testStepPassed("Digital Footprint Section Facebook Hatcher Option Value Before Edited :"+DigitalFootPrintSection_Facebook_HatcherOption_Value_BeforeEdited_Special128Charcaters);
			
			companyProfilePage.click_DigitalFootPrintSection_Facebook_HatcherOption_RadioButton();
			
			companyProfilePage.enter_DigitalFootPrintSection_Facebook_HatcherOption_Textbox(newEditDigitalFootPrintFacebookSpecial128Characters);

			companyProfilePage.click_DigitalFootPrintSection_Save_Changes_Button();

			verify_Digital_Section_EditCompanyProfile_Updated_Successfully();

			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_EditCompany_CompanyProfilePage_displayed();

			String DigitalFootPrintSection_Facebook_HatcherOption_Value_AfterEdited_Special128Charcaters = companyProfilePage.get_DigitalFootPrintSection_Facebook_HatcherOption_Value();
			
			testStepPassed("Digital Footprint Section Facebook Hatcher Option Value After Special Charcater and 128 Charcater Edited :"+DigitalFootPrintSection_Facebook_HatcherOption_Value_AfterEdited_Special128Charcaters);
			
			if (DigitalFootPrintSection_Facebook_HatcherOption_Value_AfterEdited_Special128Charcaters.equalsIgnoreCase(newEditDigitalFootPrintFacebookSpecial128Characters)) 
			{
				testStepPassed("Digital Footprint Section Facebook Hatcher Value After edited with 128 Special Charcater is same as the edited value");
			} 
			else 
			{
				testStepFailed("Digital Footprint Section Facebook Hatcher Value After edited with 128 Special Charcater is not same as the edited value");
			}			
			
			testStepInfo("");
			testStepInfo("Digital Footprint Section Instagram 128 Characters and Special Charcaters Validations");
			testStepInfo("*********************************************************************************************************");

			WebElement element3 = driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='Facebook']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']"));
			scrolltoElementView(element3);

			String DigitalFootPrintSection_Instagram_HatcherOption_Value_BeforeEdited_Special128Charcaters = companyProfilePage.get_DigitalFootPrintSection_Instagram_HatcherOption_Value();
			
			testStepPassed("Digital Footprint Section Instagram Hatcher Option Value Before Edited :"+DigitalFootPrintSection_Instagram_HatcherOption_Value_BeforeEdited_Special128Charcaters);
			
			companyProfilePage.click_DigitalFootPrintSection_Instagram_HatcherOption_RadioButton();
			
			companyProfilePage.enter_DigitalFootPrintSection_Instagram_HatcherOption_Textbox(newEditDigitalFootPrintInstagramSpecial128Characters);

			companyProfilePage.click_DigitalFootPrintSection_Save_Changes_Button();

			verify_Digital_Section_EditCompanyProfile_Updated_Successfully();

			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_EditCompany_CompanyProfilePage_displayed();

			String DigitalFootPrintSection_Instagram_HatcherOption_Value_AfterEdited_Special128Charcaters = companyProfilePage.get_DigitalFootPrintSection_Instagram_HatcherOption_Value();
			
			testStepPassed("Digital Footprint Section Instagram Hatcher Option Value After Special Charcater and 128 Charcater Edited :"+DigitalFootPrintSection_Instagram_HatcherOption_Value_AfterEdited_Special128Charcaters);
			
			if (DigitalFootPrintSection_Instagram_HatcherOption_Value_AfterEdited_Special128Charcaters.equalsIgnoreCase(newEditDigitalFootPrintInstagramSpecial128Characters)) 
			{
				testStepPassed("Digital Footprint Section Instagram Hatcher Value After edited with 128 Special Charcater is same as the edited value");
			} 
			else 
			{
				testStepFailed("Digital Footprint Section Instagram Hatcher Value After edited with 128 Special Charcater is not same as the edited value");
			}			
			
			
			testStepInfo("");
			testStepInfo("Digital Footprint Section Angellist 128 Characters and Special Charcaters Validations");
			testStepInfo("*********************************************************************************************************");

			WebElement element4 = driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='Instagram']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']"));
			scrolltoElementView(element4);

			String DigitalFootPrintSection_Angellist_HatcherOption_Value_BeforeEdited_Special128Charcaters = companyProfilePage.get_DigitalFootPrintSection_Angellist_HatcherOption_Value();
			
			testStepPassed("Digital Footprint Section Angellist Hatcher Option Value Before Edited :"+DigitalFootPrintSection_Angellist_HatcherOption_Value_BeforeEdited_Special128Charcaters);
			
			companyProfilePage.click_DigitalFootPrintSection_Angellist_HatcherOption_RadioButton();
			
			companyProfilePage.enter_DigitalFootPrintSection_Angellist_HatcherOption_Textbox(newEditDigitalFootPrintAngellistSpecial128Characters);

			companyProfilePage.click_DigitalFootPrintSection_Save_Changes_Button();

			verify_Digital_Section_EditCompanyProfile_Updated_Successfully();

			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_EditCompany_CompanyProfilePage_displayed();

			String DigitalFootPrintSection_Angellist_HatcherOption_Value_AfterEdited_Special128Charcaters = companyProfilePage.get_DigitalFootPrintSection_Angellist_HatcherOption_Value();
			
			testStepPassed("Digital Footprint Section Angellist Hatcher Option Value After Special Charcater and 128 Charcater Edited :"+DigitalFootPrintSection_Angellist_HatcherOption_Value_AfterEdited_Special128Charcaters);
			
			if (DigitalFootPrintSection_Angellist_HatcherOption_Value_AfterEdited_Special128Charcaters.equalsIgnoreCase(newEditDigitalFootPrintAngellistSpecial128Characters)) 
			{
				testStepPassed("Digital Footprint Section Angellist Hatcher Value After edited with 128 Special Charcater is same as the edited value");
			} 
			else 
			{
				testStepFailed("Digital Footprint Section Angellist Hatcher Value After edited with 128 Special Charcater is not same as the edited value");
			}			

			
			testStepInfo("");
			testStepInfo("Digital Footprint Section Medium 128 Characters and Special Charcaters Validations");
			testStepInfo("*********************************************************************************************************");

			WebElement element5 = driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='Angellist']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']"));
			scrolltoElementView(element5);

			String DigitalFootPrintSection_Medium_HatcherOption_Value_BeforeEdited_Special128Charcaters = companyProfilePage.get_DigitalFootPrintSection_Medium_HatcherOption_Value();
			
			testStepPassed("Digital Footprint Section Medium Hatcher Option Value Before Edited :"+DigitalFootPrintSection_Medium_HatcherOption_Value_BeforeEdited_Special128Charcaters);
			
			companyProfilePage.click_DigitalFootPrintSection_Medium_HatcherOption_RadioButton();
			
			companyProfilePage.enter_DigitalFootPrintSection_Medium_HatcherOption_Textbox(newEditDigitalFootPrintMediumSpecial128Characters);

			companyProfilePage.click_DigitalFootPrintSection_Save_Changes_Button();

			verify_Digital_Section_EditCompanyProfile_Updated_Successfully();

			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_EditCompany_CompanyProfilePage_displayed();

			String DigitalFootPrintSection_Medium_HatcherOption_Value_AfterEdited_Special128Charcaters = companyProfilePage.get_DigitalFootPrintSection_Medium_HatcherOption_Value();
			
			testStepPassed("Digital Footprint Section Medium Hatcher Option Value After Special Charcater and 128 Charcater Edited :"+DigitalFootPrintSection_Medium_HatcherOption_Value_AfterEdited_Special128Charcaters);
			
			if (DigitalFootPrintSection_Medium_HatcherOption_Value_AfterEdited_Special128Charcaters.equalsIgnoreCase(newEditDigitalFootPrintMediumSpecial128Characters)) 
			{
				testStepPassed("Digital Footprint Section Medium Hatcher Value After edited with 128 Special Charcater is same as the edited value");
			} 
			else 
			{
				testStepFailed("Digital Footprint Section Medium Hatcher Value After edited with 128 Special Charcater is not same as the edited value");
			}			
			
			testStepInfo("");
			testStepInfo("Digital Footprint Section LinkedIn 128 Characters and Special Charcaters Validations");
			testStepInfo("*********************************************************************************************************");

			WebElement element6 = driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='Medium']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']"));
			scrolltoElementView(element6);

			String DigitalFootPrintSection_LinkedIn_HatcherOption_Value_BeforeEdited_Special128Charcaters = companyProfilePage.get_DigitalFootPrintSection_LinkedIn_HatcherOption_Value();
			
			testStepPassed("Digital Footprint Section LinkedIn Hatcher Option Value Before Edited :"+DigitalFootPrintSection_LinkedIn_HatcherOption_Value_BeforeEdited_Special128Charcaters);
			
			companyProfilePage.click_DigitalFootPrintSection_LinkedIn_HatcherOption_RadioButton();
			
			companyProfilePage.enter_DigitalFootPrintSection_LinkedIn_HatcherOption_Textbox(newEditDigitalFootPrintLinkedInSpecial128Characters);

			companyProfilePage.click_DigitalFootPrintSection_Save_Changes_Button();

			verify_Digital_Section_EditCompanyProfile_Updated_Successfully();

			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_EditCompany_CompanyProfilePage_displayed();

			String DigitalFootPrintSection_LinkedIn_HatcherOption_Value_AfterEdited_Special128Charcaters = companyProfilePage.get_DigitalFootPrintSection_LinkedIn_HatcherOption_Value();
			
			testStepPassed("Digital Footprint Section LinkedIn Hatcher Option Value After Special Charcater and 128 Charcater Edited :"+DigitalFootPrintSection_LinkedIn_HatcherOption_Value_AfterEdited_Special128Charcaters);
			
			if (DigitalFootPrintSection_LinkedIn_HatcherOption_Value_AfterEdited_Special128Charcaters.equalsIgnoreCase(newEditDigitalFootPrintLinkedInSpecial128Characters)) 
			{
				testStepPassed("Digital Footprint Section LinkedIn Hatcher Value After edited with 128 Special Charcater is same as the edited value");
			} 
			else 
			{
				testStepFailed("Digital Footprint Section LinkedIn Hatcher Value After edited with 128 Special Charcater is not same as the edited value");
			}			

			
			
			testStepInfo("");
			testStepInfo("Digital Footprint Section Pinterest 128 Characters and Special Charcaters Validations");
			testStepInfo("*********************************************************************************************************");

			WebElement element7 = driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='LinkedIn']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']"));
			scrolltoElementView(element7);

			String DigitalFootPrintSection_Pinterest_HatcherOption_Value_BeforeEdited_Special128Charcaters = companyProfilePage.get_DigitalFootPrintSection_Pinterest_HatcherOption_Value();
			
			testStepPassed("Digital Footprint Section Pinterest Hatcher Option Value Before Edited :"+DigitalFootPrintSection_Pinterest_HatcherOption_Value_BeforeEdited_Special128Charcaters);
			
			companyProfilePage.click_DigitalFootPrintSection_Pinterest_HatcherOption_RadioButton();
			
			companyProfilePage.enter_DigitalFootPrintSection_PinterestHatcherOption_Textbox(newEditDigitalFootPrintPinterestSpecial128Characters);

			companyProfilePage.click_DigitalFootPrintSection_Save_Changes_Button();

			verify_Digital_Section_EditCompanyProfile_Updated_Successfully();

			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_EditCompany_CompanyProfilePage_displayed();

			String DigitalFootPrintSection_Pinterest_HatcherOption_Value_AfterEdited_Special128Charcaters = companyProfilePage.get_DigitalFootPrintSection_Pinterest_HatcherOption_Value();
			
			testStepPassed("Digital Footprint Section Pinterest Hatcher Option Value After Special Charcater and 128 Charcater Edited :"+DigitalFootPrintSection_Pinterest_HatcherOption_Value_AfterEdited_Special128Charcaters);
			
			if (DigitalFootPrintSection_Pinterest_HatcherOption_Value_AfterEdited_Special128Charcaters.equalsIgnoreCase(newEditDigitalFootPrintPinterestSpecial128Characters)) 
			{
				testStepPassed("Digital Footprint Section Pinterest Hatcher Value After edited with 128 Special Charcater is same as the edited value");
			} 
			else 
			{
				testStepFailed("Digital Footprint Section Pinterest Hatcher Value After edited with 128 Special Charcater is not same as the edited value");
			}			
			
			
			
			testStepInfo("");
			testStepInfo("Digital Footprint Section RSS Feed 128 Characters and Special Charcaters Validations");
			testStepInfo("*********************************************************************************************************");

			WebElement element8 = driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='Pinterest']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']"));
			scrolltoElementView(element8);

			String DigitalFootPrintSection_RSSFeed_HatcherOption_Value_BeforeEdited_Special128Charcaters = companyProfilePage.get_DigitalFootPrintSection_RSSFeed_HatcherOption_Value();
			
			testStepPassed("Digital Footprint Section RSS Feed Hatcher Option Value Before Edited :"+DigitalFootPrintSection_RSSFeed_HatcherOption_Value_BeforeEdited_Special128Charcaters);
			
			companyProfilePage.click_DigitalFootPrintSection_RSSFeed_HatcherOption_RadioButton();
			
			companyProfilePage.enter_DigitalFootPrintSection_RSSFeed_HatcherOption_Textbox(newEditDigitalFootPrintRSSFeedSpecial128Characters);

			companyProfilePage.click_DigitalFootPrintSection_Save_Changes_Button();

			verify_Digital_Section_EditCompanyProfile_Updated_Successfully();

			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_EditCompany_CompanyProfilePage_displayed();

			String DigitalFootPrintSection_RSSFeed_HatcherOption_Value_AfterEdited_Special128Charcaters = companyProfilePage.get_DigitalFootPrintSection_RSSFeed_HatcherOption_Value();
			
			testStepPassed("Digital Footprint Section RSS Feed Hatcher Option Value After Special Charcater and 128 Charcater Edited :"+DigitalFootPrintSection_RSSFeed_HatcherOption_Value_AfterEdited_Special128Charcaters);
			
			if (DigitalFootPrintSection_RSSFeed_HatcherOption_Value_AfterEdited_Special128Charcaters.equalsIgnoreCase(newEditDigitalFootPrintRSSFeedSpecial128Characters)) 
			{
				testStepPassed("Digital Footprint Section RSS Feed Hatcher Value After edited with 128 Special Charcater is same as the edited value");
			} 
			else 
			{
				testStepFailed("Digital Footprint Section RSS Feed Hatcher Value After edited with 128 Special Charcater is not same as the edited value");
			}			
			
			
			testStepInfo("");
			testStepInfo("Digital Footprint Section Twitter 128 Characters and Special Charcaters Validations");
			testStepInfo("*********************************************************************************************************");

			WebElement element9 = driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='RSS Feed']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']"));
			scrolltoElementView(element9);

			String DigitalFootPrintSection_Twitter_HatcherOption_Value_BeforeEdited_Special128Charcaters = companyProfilePage.get_DigitalFootPrintSection_Twitter_HatcherOption_Value();
			
			testStepPassed("Digital Footprint Section Twitter Hatcher Option Value Before Edited :"+DigitalFootPrintSection_Twitter_HatcherOption_Value_BeforeEdited_Special128Charcaters);
			
			companyProfilePage.click_DigitalFootPrintSection_Twitter_HatcherOption_RadioButton();
			
			companyProfilePage.enter_DigitalFootPrintSection_Twitter_HatcherOption_Texbox(newEditDigitalFootPrintTwitterSpecial128Characters);

			companyProfilePage.click_DigitalFootPrintSection_Save_Changes_Button();

			verify_Digital_Section_EditCompanyProfile_Updated_Successfully();

			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_EditCompany_CompanyProfilePage_displayed();

			String DigitalFootPrintSection_Twitter_HatcherOption_Value_AfterEdited_Special128Charcaters = companyProfilePage.get_DigitalFootPrintSection_Twitter_HatcherOption_Value();
			
			testStepPassed("Contact Section Twitter Hatcher Option Value After Special Charcater and 128 Charcater Edited :"+DigitalFootPrintSection_Twitter_HatcherOption_Value_AfterEdited_Special128Charcaters);
			
			if (DigitalFootPrintSection_Twitter_HatcherOption_Value_AfterEdited_Special128Charcaters.equalsIgnoreCase(newEditDigitalFootPrintTwitterSpecial128Characters)) 
			{
				testStepPassed("Digital Footprint Section Twitter Hatcher Value After edited with 128 Special Charcater is same as the edited value");
			} 
			else 
			{
				testStepFailed("Digital Footprint Section Twitter Hatcher Value After edited with 128 Special Charcater is not same as the edited value");
			}			
				
			testStepInfo("");
			testStepInfo("Digital Footprint Section Vimeo 128 Characters and Special Charcaters Validations");
			testStepInfo("*********************************************************************************************************");

			WebElement element10 = driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='Twitter']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']"));
			scrolltoElementView(element10);

			String DigitalFootPrintSection_Vimeo_HatcherOption_Value_BeforeEdited_Special128Charcaters = companyProfilePage.get_DigitalFootPrintSection_Vimeo_HatcherOption_Value();
			
			testStepPassed("Digital Footprint Section Vimeo Hatcher Option Value Before Edited :"+DigitalFootPrintSection_Vimeo_HatcherOption_Value_BeforeEdited_Special128Charcaters);
			
			companyProfilePage.click_DigitalFootPrintSection_Vimeo_HatcherOption_RadioButton();
			
			companyProfilePage.enter_DigitalFootPrintSection_Vimeo_HatcherOption_Textbox(newEditDigitalFootPrintVimeoSpecial128Characters);

			companyProfilePage.click_DigitalFootPrintSection_Save_Changes_Button();

			verify_Digital_Section_EditCompanyProfile_Updated_Successfully();

			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_EditCompany_CompanyProfilePage_displayed();

			String DigitalFootPrintSection_Vimeo_HatcherOption_Value_AfterEdited_Special128Charcaters = companyProfilePage.get_DigitalFootPrintSection_Vimeo_HatcherOption_Value();
			
			testStepPassed("Digital Footprint Section Vimeo Hatcher Option Value After Special Charcater and 128 Charcater Edited :"+DigitalFootPrintSection_Vimeo_HatcherOption_Value_AfterEdited_Special128Charcaters);
			
			if (DigitalFootPrintSection_Vimeo_HatcherOption_Value_AfterEdited_Special128Charcaters.equalsIgnoreCase(newEditDigitalFootPrintVimeoSpecial128Characters)) 
			{
				testStepPassed("Digital Footprint Section Vimeo Hatcher Value After edited with 128 Special Charcater is same as the edited value");
			} 
			else 
			{
				testStepFailed("Digital Footprint Section Vimeo Hatcher Value After edited with 128 Special Charcater is not same as the edited value");
			}			
			
			testStepInfo("");
			testStepInfo("Digital Footprint Section Website 128 Characters and Special Charcaters Validations");
			testStepInfo("*********************************************************************************************************");

			WebElement element11 = driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='Vimeo']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']"));
			scrolltoElementView(element11);

			String DigitalFootPrintSection_Websiter_HatcherOption_Value_BeforeEdited_Special128Charcaters = companyProfilePage.get_DigitalFootPrintSection_Website_HatcherOption_Value();
			
			testStepPassed("Digital Footprint Section Website Hatcher Option Value Before Edited :"+DigitalFootPrintSection_Websiter_HatcherOption_Value_BeforeEdited_Special128Charcaters);
			
			companyProfilePage.click_DigitalFootPrintSection_Website_HatcherOption_RadioButton();
			
			companyProfilePage.enter_DigitalFootPrintSection_Website_HatcherOption_Textbox(newEditDigitalFootPrintWebsiteSpecial128Characters);

			companyProfilePage.click_DigitalFootPrintSection_Save_Changes_Button();

			verify_Digital_Section_EditCompanyProfile_Updated_Successfully();

			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_EditCompany_CompanyProfilePage_displayed();

			String DigitalFootPrintSection_Websiter_HatcherOption_Value_AfterEdited_Special128Charcaters = companyProfilePage.get_DigitalFootPrintSection_Website_HatcherOption_Value();
			
			testStepPassed("Digital Footprint Section Website Hatcher Option Value After Special Charcater and 128 Charcater Edited :"+DigitalFootPrintSection_Websiter_HatcherOption_Value_AfterEdited_Special128Charcaters);
			
			if (DigitalFootPrintSection_Websiter_HatcherOption_Value_AfterEdited_Special128Charcaters.equalsIgnoreCase(newEditDigitalFootPrintWebsiteSpecial128Characters)) 
			{
				testStepPassed("Digital Footprint Section Website Hatcher Value After edited with 128 Special Charcater is same as the edited value");
			} 
			else 
			{
				testStepFailed("Digital Footprint Section Website Hatcher Value After edited with 128 Special Charcater is not same as the edited value");
			}			
			
			
			testStepInfo("");
			testStepInfo("Digital Footprint Section YouTube 128 Characters and Special Charcaters Validations");
			testStepInfo("*********************************************************************************************************");

			WebElement element12 = driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'digital')]//*[text()='Website']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']"));
			scrolltoElementView(element12);

			String DigitalFootPrintSection_YouTube_HatcherOption_Value_BeforeEdited_Special128Charcaters = companyProfilePage.get_DigitalFootPrintSection_YouTube_HatcherOption_Value();
			
			testStepPassed("Digital Footprint Section YouTube Hatcher Option Value Before Edited :"+DigitalFootPrintSection_YouTube_HatcherOption_Value_BeforeEdited_Special128Charcaters);
			
			companyProfilePage.click_DigitalFootPrintSection_YouTube_Hatcher_RadioButton();
			
			companyProfilePage.enter_DigitalFootPrintSection_YouTube(newEditDigitalFootPrintYouTubeSpecial128Characters);

			companyProfilePage.click_DigitalFootPrintSection_Save_Changes_Button();

			verify_Digital_Section_EditCompanyProfile_Updated_Successfully();

			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_EditCompany_CompanyProfilePage_displayed();

			String DigitalFootPrintSection_YouTube_HatcherOption_Value_AfterEdited_Special128Charcaters = companyProfilePage.get_DigitalFootPrintSection_YouTube_HatcherOption_Value();
			
			testStepPassed("Digital Footprint Section YouTube Hatcher Option Value After Special Charcater and 128 Charcater Edited :"+DigitalFootPrintSection_YouTube_HatcherOption_Value_AfterEdited_Special128Charcaters);
			
			if (DigitalFootPrintSection_YouTube_HatcherOption_Value_AfterEdited_Special128Charcaters.equalsIgnoreCase(newEditDigitalFootPrintYouTubeSpecial128Characters)) 
			{
				testStepPassed("Digital Footprint Section YouTube Hatcher Value After edited with 128 Special Charcater is same as the edited value");
			} 
			else 
			{
				testStepFailed("Digital Footprint Section YouTube Hatcher Value After edited with 128 Special Charcater is not same as the edited value");
			}			
			
			testStepInfo("");
			testStepInfo("Finance & Legal Section Auditor 256 Characters and Special Charcaters Validations");
			testStepInfo("**********************************************************************************************************");

			String FinanceandLegalSection_Auditor_HatcherOption_Value_BeforeEdited_Special256Charcaters = companyProfilePage.get_FinanceandLegalSection_Auditor_HatcherOption_Value();
			
			testStepPassed("Finance & Legal Section Auditor Hatcher Option Value Before Edited :"+FinanceandLegalSection_Auditor_HatcherOption_Value_BeforeEdited_Special256Charcaters);
			
			companyProfilePage.click_FinanceandLegalSection_Auditor_Hatcher_RadioButton();
			
			companyProfilePage.enter_FinanceandLegalSection_Auditor_HatcherOption_Textbox(newEdiFinanceandLegalSectionAuditorSpecial256Characters);

			companyProfilePage.click_FinanceandLegalSection_Save_Changes_Button();

			verify_Finance_Section_EditCompanyProfile_Updated_Successfully();

			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_EditCompany_CompanyProfilePage_displayed();

			String FinanceandLegalSection_Auditor_HatcherOption_Value_AfterEdited_Special256Charcaters = companyProfilePage.get_FinanceandLegalSection_Auditor_HatcherOption_Value();
			
			testStepPassed("Finance & Legal Section Auditor Hatcher Option Value After Special Charcater and 256 Charcater Edited :"+FinanceandLegalSection_Auditor_HatcherOption_Value_AfterEdited_Special256Charcaters);
			
			if (FinanceandLegalSection_Auditor_HatcherOption_Value_AfterEdited_Special256Charcaters.equalsIgnoreCase(newEdiFinanceandLegalSectionAuditorSpecial256Characters)) 
			{
				testStepPassed("Finance & Legal Section Auditor Hatcher Value After edited with 256 Special Charcater is same as the edited value");
			} 
			else 
			{
				testStepFailed("Finance & Legal Section Auditor Hatcher Value After edited with 256 Special Charcater is not same as the edited value");
			}			

			
			testStepInfo("");
			testStepInfo("Finance & Legal Section Bank 256 Characters and Special Charcaters Validations");
			testStepInfo("**********************************************************************************************************");

			WebElement element14 = driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Auditor']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']"));
			scrolltoElementView(element14);

			String FinanceandLegalSection_Bank_HatcherOption_Value_BeforeEdited_Special256Charcaters = companyProfilePage.get_FinanceandLegalSection_Bank_HatcherOption_Value();
			
			testStepPassed("Finance & Legal Section Bank Hatcher Option Value Before Edited :"+FinanceandLegalSection_Bank_HatcherOption_Value_BeforeEdited_Special256Charcaters);
			
			companyProfilePage.click_FinanceandLegalSection_Bank_HatcherOption_RadioButton();
			
			companyProfilePage.enter_FinanceandLegalSection_Bank_HatcherOption_Textbox(newEdiFinanceandLegalSectionBankSpecial256Characters);

			companyProfilePage.click_FinanceandLegalSection_Save_Changes_Button();

			verify_Finance_Section_EditCompanyProfile_Updated_Successfully();

			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_EditCompany_CompanyProfilePage_displayed();

			String FinanceandLegalSection_Bank_HatcherOption_Value_AfterEdited_Special256Charcaters = companyProfilePage.get_FinanceandLegalSection_Bank_HatcherOption_Value();
			
			testStepPassed("Finance & Legal Section Bank Hatcher Option Value After Special Charcater and 256 Charcater Edited :"+FinanceandLegalSection_Bank_HatcherOption_Value_AfterEdited_Special256Charcaters);
			
			if (FinanceandLegalSection_Bank_HatcherOption_Value_AfterEdited_Special256Charcaters.equalsIgnoreCase(newEdiFinanceandLegalSectionBankSpecial256Characters)) 
			{
				testStepPassed("Finance & Legal Section Bank Hatcher Value After edited with 256 Special Charcater is same as the edited value");
			} 
			else 
			{
				testStepFailed("Finance & Legal Section Bank Hatcher Value After edited with 256 Special Charcater is not same as the edited value");
			}			

			testStepInfo("");
			testStepInfo("Finance & Legal Section Bank ABA Number 100 Characters and Special Charcaters Validations");
			testStepInfo("**********************************************************************************************************");

			WebElement element15 = driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Bank']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']"));
			scrolltoElementView(element15);

			
			String FinanceandLegalSection_BankABANumber_HatcherOption_Value_BeforeEdited_Special100Charcaters = companyProfilePage.get_FinanceandLegalSection_BankABANumber_HatcherOption_Value();
			
			testStepPassed("Finance & Legal Section Bank ABA Number Hatcher Option Value Before Edited :"+FinanceandLegalSection_BankABANumber_HatcherOption_Value_BeforeEdited_Special100Charcaters);
			
			companyProfilePage.click_FinanceandLegalSection_BankABANumber_HatcherOption_RadioButton();
			
			companyProfilePage.enter_FinanceandLegalSection_BankABANumber_HatcherOption_Textbox(newEdiFinanceandLegalSectionBankABANumberSpecial100Characters);

			companyProfilePage.click_FinanceandLegalSection_Save_Changes_Button();

			verify_Finance_Section_EditCompanyProfile_Updated_Successfully();

			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_EditCompany_CompanyProfilePage_displayed();

			String FinanceandLegalSection_BankABANumber_HatcherOption_Value_AfterEdited_Special100Charcaters = companyProfilePage.get_FinanceandLegalSection_BankABANumber_HatcherOption_Value();
			
			testStepPassed("Finance & Legal Section Bank ABA Number Hatcher Option Value After Special Charcater and 100 Charcater Edited :"+FinanceandLegalSection_BankABANumber_HatcherOption_Value_AfterEdited_Special100Charcaters);
			
			if (FinanceandLegalSection_BankABANumber_HatcherOption_Value_AfterEdited_Special100Charcaters.equalsIgnoreCase(newEdiFinanceandLegalSectionBankABANumberSpecial100Characters)) 
			{
				testStepPassed("Finance & Legal Section Bank ABA Number Hatcher Value After edited with 100 Special Charcater is same as the edited value");
			} 
			else 
			{
				testStepFailed("Finance & Legal Section Bank ABA Number Hatcher Value After edited with 100 Special Charcater is not same as the edited value");
			}			

			testStepInfo("");
			testStepInfo("Finance & Legal Section Bank Account Name 250 Characters and Special Charcaters Validations");
			testStepInfo("**********************************************************************************************************");

			WebElement element16 = driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Bank ABA Number']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']"));
			scrolltoElementView(element16);
			
			companyProfilePage.click_FinanceandLegalSection_BankAccountName_HatcherOption_RadioButton();
			
			companyProfilePage.enter_FinanceandLegalSection_BankAccountName_HatcherOption_Textbox(newEdiFinanceandLegalSectionBankAccountNameSpecial250Characters);

			companyProfilePage.click_FinanceandLegalSection_Save_Changes_Button();

			verify_Finance_Section_EditCompanyProfile_Updated_Successfully();

			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_EditCompany_CompanyProfilePage_displayed();

				
			testStepInfo("");
			testStepInfo("Finance & Legal Section Bank Account Number 100 Characters and Special Charcaters Validations");
			testStepInfo("**********************************************************************************************************");

			WebElement element17 = driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Bank Account Name']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']"));
			scrolltoElementView(element17);

			String FinanceandLegalSection_BankAccountNumber_HatcherOption_Value_BeforeEdited_Special100Charcaters = companyProfilePage.get_FinanceandLegalSection_BankAccountNumber_HatcherOption_Value();
			
			testStepPassed("Finance & Legal Section Bank Account Number Hatcher Option Value Before Edited :"+FinanceandLegalSection_BankAccountNumber_HatcherOption_Value_BeforeEdited_Special100Charcaters);
			
			companyProfilePage.click_FinanceandLegalSection_BankAccountNumber_HatcherOption_RadioButton();
			
			companyProfilePage.enter_FinanceandLegalSection_BankAccountNumber_HatcherOption_Textbox(newEdiFinanceandLegalSectionBankAccountNumberSpecial100Characters);

			companyProfilePage.click_FinanceandLegalSection_Save_Changes_Button();

			verify_Finance_Section_EditCompanyProfile_Updated_Successfully();

			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_EditCompany_CompanyProfilePage_displayed();

			String FinanceandLegalSection_BankAccountNumber_HatcherOption_Value_AfterEdited_Special100Charcaters = companyProfilePage.get_FinanceandLegalSection_BankAccountNumber_HatcherOption_Value();
			
			testStepPassed("Finance & Legal Section Bank Account Number Hatcher Option Value After Special Charcater and 100 Charcater Edited :"+FinanceandLegalSection_BankAccountNumber_HatcherOption_Value_AfterEdited_Special100Charcaters);
			
			if (FinanceandLegalSection_BankAccountNumber_HatcherOption_Value_AfterEdited_Special100Charcaters.equalsIgnoreCase(newEdiFinanceandLegalSectionBankAccountNumberSpecial100Characters)) 
			{
				testStepPassed("Finance & Legal Section Bank Account Number Hatcher Value After edited with 100 Special Charcater is same as the edited value");
			} 
			else 
			{
				testStepFailed("Finance & Legal Section Bank Account Number Hatcher Value After edited with 100 Special Charcater is not same as the edited value");
			}			

			
			testStepInfo("");
			testStepInfo("Finance & Legal Section Bank Address 512 Characters and Special Charcaters Validations");
			testStepInfo("**********************************************************************************************************");

			WebElement element18 = driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Bank Account Number']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']"));
			scrolltoElementView(element18);

			String FinanceandLegalSection_BankAddress_HatcherOption_Value_BeforeEdited_Special512Charcaters = companyProfilePage.get_FinanceandLegalSection_BankAddress_HatcherOption_Value();
			
			testStepPassed("Finance & Legal Section Bank Address Hatcher Option Value Before Edited :"+FinanceandLegalSection_BankAddress_HatcherOption_Value_BeforeEdited_Special512Charcaters);
			
			companyProfilePage.click_FinanceandLegalSection_BankAddress_HatcherOption_RadioButton();
			
			companyProfilePage.enter_FinanceandLegalSection_BankAddress_HatcherOption_Textbox(newEdiFinanceandLegalSectionBankAddressSpecial512Characters);

			companyProfilePage.click_FinanceandLegalSection_Save_Changes_Button();

			verify_Finance_Section_EditCompanyProfile_Updated_Successfully();

			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_EditCompany_CompanyProfilePage_displayed();

			String FinanceandLegalSection_BankAddress_HatcherOption_Value_AfterEdited_Special512Charcaters = companyProfilePage.get_FinanceandLegalSection_BankAddress_HatcherOption_Value();
			
			testStepPassed("Finance & Legal Section Bank Address Hatcher Option Value After Special Charcater and 512 Charcater Edited :"+FinanceandLegalSection_BankAddress_HatcherOption_Value_AfterEdited_Special512Charcaters);
			
			if (FinanceandLegalSection_BankAddress_HatcherOption_Value_AfterEdited_Special512Charcaters.equalsIgnoreCase(newEdiFinanceandLegalSectionBankAddressSpecial512Characters)) 
			{
				testStepPassed("Finance & Legal Section Bank Address Hatcher Value After edited with 512 Special Charcater is same as the edited value");
			} 
			else 
			{
				testStepFailed("Finance & Legal Section Bank Address Hatcher Value After edited with 512 Special Charcater is not same as the edited value");
			}			
	testStepInfo("");
			testStepInfo("Finance & Legal Section Bank Intermediary 100 Characters and Special Charcaters Validations");
			testStepInfo("**********************************************************************************************************");

			WebElement element19 = driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Bank Address']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']"));
			scrolltoElementView(element19);

			String FinanceandLegalSection_BankIntermediary_HatcherOption_Value_BeforeEdited_Special100Charcaters = companyProfilePage.get_FinanceandLegalSection_BankIntermediary_HatcherOption_Value();
			
			testStepPassed("Finance & Legal Section Bank Intermediary Hatcher Option Value Before Edited :"+FinanceandLegalSection_BankIntermediary_HatcherOption_Value_BeforeEdited_Special100Charcaters);
			
			companyProfilePage.click_FinanceandLegalSection_BankIntermediary_HatcherOption_RadioButton();
			
			companyProfilePage.enter_FinanceandLegalSection_BankIntermediary_HatcherOption_Textbox(newEdiFinanceandLegalSectionBankIntermediarySpecial100Characters);

			companyProfilePage.click_FinanceandLegalSection_Save_Changes_Button();

			verify_Finance_Section_EditCompanyProfile_Updated_Successfully();

			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_EditCompany_CompanyProfilePage_displayed();

			String FinanceandLegalSection_BankIntermediary_HatcherOption_Value_AfterEdited_Special100Charcaters = companyProfilePage.get_FinanceandLegalSection_BankIntermediary_HatcherOption_Value();
			
			testStepPassed("Finance & Legal Section Bank Intermediary Hatcher Option Value After Special Charcater and 100 Charcater Edited :"+FinanceandLegalSection_BankIntermediary_HatcherOption_Value_AfterEdited_Special100Charcaters);
			
			if (FinanceandLegalSection_BankIntermediary_HatcherOption_Value_AfterEdited_Special100Charcaters.equalsIgnoreCase(newEdiFinanceandLegalSectionBankIntermediarySpecial100Characters)) 
			{
				testStepPassed("Finance & Legal Section Bank Intermediary Hatcher Value After edited with 100 Special Charcater is same as the edited value");
			} 
			else 
			{
				testStepFailed("Finance & Legal Section Bank Intermediary Hatcher Value After edited with 100 Special Charcater is not same as the edited value");
			}			

					
			
			testStepInfo("");
			testStepInfo("Finance & Legal Section Intermediary Bank ABA Number 100 Characters and Special Charcaters Validations");
			testStepInfo("**********************************************************************************************************");

			WebElement element20 = driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Bank Intermediary']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']"));
			scrolltoElementView(element20);

			String FinanceandLegalSection_IntermediaryBankABANumber_HatcherOption_Value_BeforeEdited_Special100Charcaters = companyProfilePage.get_FinanceandLegalSection_IntermediaryBankABANumber_HatcherOption_Value();
			
			testStepPassed("Finance & Legal Section Intermediary Bank ABA Number Hatcher Option Value Before Edited :"+FinanceandLegalSection_IntermediaryBankABANumber_HatcherOption_Value_BeforeEdited_Special100Charcaters);
			
			companyProfilePage.click_FinanceandLegalSection_IntermediaryBankABANumber_HatcherOption_RadioButton();
			
			companyProfilePage.enter_FinanceandLegalSection_IntermediaryBankABANumber_HatcherOption_Textbox(newEdiFinanceandLegalSectionIntermediaryBankABANumberSpecial100Characters);

			companyProfilePage.click_FinanceandLegalSection_Save_Changes_Button();

			verify_Finance_Section_EditCompanyProfile_Updated_Successfully();

			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_EditCompany_CompanyProfilePage_displayed();

			String FinanceandLegalSection_IntermediaryBankABANumber_HatcherOption_Value_AfterEdited_Special100Charcaters = companyProfilePage.get_FinanceandLegalSection_IntermediaryBankABANumber_HatcherOption_Value();
			
			testStepPassed("Finance & Legal Section Intermediary Bank ABA Number Hatcher Option Value After Special Charcater and 100 Charcater Edited :"+FinanceandLegalSection_IntermediaryBankABANumber_HatcherOption_Value_AfterEdited_Special100Charcaters);
			
			if (FinanceandLegalSection_IntermediaryBankABANumber_HatcherOption_Value_AfterEdited_Special100Charcaters.equalsIgnoreCase(newEdiFinanceandLegalSectionIntermediaryBankABANumberSpecial100Characters)) 
			{
				testStepPassed("Finance & Legal Section Intermediary Bank ABA Number Hatcher Value After edited with 100 Special Charcater is same as the edited value");
			} 
			else 
			{
				testStepFailed("Finance & Legal Section Intermediary Bank ABA Number Hatcher Value After edited with 100 Special Charcater is not same as the edited value");
			}			

					
			
			testStepInfo("");
			testStepInfo("Finance & Legal Section Intermediary Bank Address 500 Characters and Special Charcaters Validations");
			testStepInfo("**********************************************************************************************************");

			WebElement element21 = driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Intermediary Bank ABA Number']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']"));
			scrolltoElementView(element21);

			String FinanceandLegalSection_IntermediaryBankAddress_HatcherOption_Value_BeforeEdited_Special500Charcaters = companyProfilePage.get_FinanceandLegalSection_IntermediaryBankAddress_HatcherOption_Value();
			
			testStepPassed("Finance & Legal Section Intermediary Bank Address Hatcher Option Value Before Edited :"+FinanceandLegalSection_IntermediaryBankAddress_HatcherOption_Value_BeforeEdited_Special500Charcaters);
			
			companyProfilePage.click_FinanceandLegalSection_IntermediaryBankAddress_HatcherOption_RadioButton();
			
			companyProfilePage.enter_FinanceandLegalSection_IntermediaryBankAddress_HatcherOption_Textbox(newEdiFinanceandLegalSectionIntermediaryBankAddressSpecial500Characters);

			companyProfilePage.click_FinanceandLegalSection_Save_Changes_Button();

			verify_Finance_Section_EditCompanyProfile_Updated_Successfully();

			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_EditCompany_CompanyProfilePage_displayed();

			String FinanceandLegalSection_IntermediaryBankAddress_HatcherOption_Value_AfterEdited_Special500Charcaters = companyProfilePage.get_FinanceandLegalSection_IntermediaryBankAddress_HatcherOption_Value();
			
			testStepPassed("Finance & Legal Section Intermediary Bank Address Hatcher Option Value After Special Charcater and 500 Charcater Edited :"+FinanceandLegalSection_IntermediaryBankAddress_HatcherOption_Value_AfterEdited_Special500Charcaters);
			
			if (FinanceandLegalSection_IntermediaryBankAddress_HatcherOption_Value_AfterEdited_Special500Charcaters.equalsIgnoreCase(newEdiFinanceandLegalSectionIntermediaryBankAddressSpecial500Characters)) 
			{
				testStepPassed("Finance & Legal Section Intermediary Bank Address Hatcher Value After edited with 500 Special Charcater is same as the edited value");
			} 
			else 
			{
				testStepFailed("Finance & Legal Section Intermediary Bank Address Hatcher Value After edited with 500 Special Charcater is not same as the edited value");
			}			

			
					
			testStepInfo("");
			testStepInfo("Finance & Legal Section Intermediary Bank SWIFT BIC 100 Characters and Special Charcaters Validations");
			testStepInfo("**********************************************************************************************************");

			WebElement element22 = driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Intermediary Bank Address']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']"));
			scrolltoElementView(element22);

			String FinanceandLegalSection_IntermediaryBankSWIFTBIC_HatcherOption_Value_BeforeEdited_Special100Charcaters = companyProfilePage.get_FinanceandLegalSection_IntermediaryBankSWIFTBIC_HatcherOption_Value();
			
			testStepPassed("Finance & Legal Section Intermediary Bank SWIFT BIC Hatcher Option Value Before Edited :"+FinanceandLegalSection_IntermediaryBankSWIFTBIC_HatcherOption_Value_BeforeEdited_Special100Charcaters);
			
			companyProfilePage.click_FinanceandLegalSection_IntermediaryBankSWIFTBIC_HatcherOption_RadioButton();
			
			companyProfilePage.enter_FinanceandLegalSection_IntermediaryBankSWIFTBIC_HatcherOption_Textbox(newEdiFinanceandLegalSectionIntermediaryBankSWIFTBICSpecial100Characters);

			companyProfilePage.click_FinanceandLegalSection_Save_Changes_Button();

			verify_Finance_Section_EditCompanyProfile_Updated_Successfully();

			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_EditCompany_CompanyProfilePage_displayed();

			String FinanceandLegalSection_IntermediaryBankSWIFTBIC_HatcherOption_Value_AfterEdited_Special100Charcaters = companyProfilePage.get_FinanceandLegalSection_IntermediaryBankSWIFTBIC_HatcherOption_Value();
			
			testStepPassed("Finance & Legal Section Intermediary Bank SWIFT BIC Hatcher Option Value After Special Charcater and 100 Charcater Edited :"+FinanceandLegalSection_IntermediaryBankSWIFTBIC_HatcherOption_Value_AfterEdited_Special100Charcaters);
			
			if (FinanceandLegalSection_IntermediaryBankSWIFTBIC_HatcherOption_Value_AfterEdited_Special100Charcaters.equalsIgnoreCase(newEdiFinanceandLegalSectionIntermediaryBankSWIFTBICSpecial100Characters)) 
			{
				testStepPassed("Finance & Legal Section Intermediary Bank SWIFT BIC Hatcher Value After edited with 100 Special Charcater is same as the edited value");
			} 
			else 
			{
				testStepFailed("Finance & Legal Section Intermediary Bank SWIFT BIC Hatcher Value After edited with 100 Special Charcater is not same as the edited value");
			}			

				
			testStepInfo("");
			testStepInfo("Finance & Legal Section Bank Swift Code 100 Characters and Special Charcaters Validations");
			testStepInfo("**********************************************************************************************************");

			WebElement element23 = driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Intermediary Bank SWIFT BIC']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']"));
			scrolltoElementView(element23);

			String FinanceandLegalSection_BankSwiftCode_HatcherOption_Value_BeforeEdited_Special100Charcaters = companyProfilePage.get_FinanceandLegalSection_BankSwiftCode_HatcherOption_Value();
			
			testStepPassed("Finance & Legal Section Bank Swift Code Hatcher Option Value Before Edited :"+FinanceandLegalSection_BankSwiftCode_HatcherOption_Value_BeforeEdited_Special100Charcaters);
			
			companyProfilePage.click_FinanceandLegalSection_BankSwiftCode_HatcherOption_RadioButton();
			
			companyProfilePage.enter_FinanceandLegalSection_BankSwiftCode_HatcherOption_Textbox(newEdiFinanceandLegalSectionBankSwiftCodeSpecial100Characters);

			companyProfilePage.click_FinanceandLegalSection_Save_Changes_Button();

			verify_Finance_Section_EditCompanyProfile_Updated_Successfully();

			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_EditCompany_CompanyProfilePage_displayed();

			String FinanceandLegalSection_BankSwiftCode_HatcherOption_Value_AfterEdited_Special100Charcaters = companyProfilePage.get_FinanceandLegalSection_BankSwiftCode_HatcherOption_Value();
			
			testStepPassed("Finance & Legal Section Bank Swift Code Hatcher Option Value After Special Charcater and 100 Charcater Edited :"+FinanceandLegalSection_BankSwiftCode_HatcherOption_Value_AfterEdited_Special100Charcaters);
			
			if (FinanceandLegalSection_BankSwiftCode_HatcherOption_Value_AfterEdited_Special100Charcaters.equalsIgnoreCase(newEdiFinanceandLegalSectionBankSwiftCodeSpecial100Characters)) 
			{
				testStepPassed("Finance & Legal Section Bank Swift Code Hatcher Value After edited with 100 Special Charcater is same as the edited value");
			} 
			else 
			{
				testStepFailed("Finance & Legal Section Bank Swift Code Hatcher Value After edited with 100 Special Charcater is not same as the edited value");
			}			
	
			testStepInfo("");
			testStepInfo("Finance & Legal Section Bank IBAN Code 100 Characters and Special Charcaters Validations");
			testStepInfo("**********************************************************************************************************");

			WebElement element24 = driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Bank Swift Code']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']"));
			scrolltoElementView(element24);

			String FinanceandLegalSection_BankIBANCode_HatcherOption_Value_BeforeEdited_Special100Charcaters = companyProfilePage.get_FinanceandLegalSection_BankIBANCode_HatcherOption_Value();
			
			testStepPassed("Finance & Legal Section Bank IBAN Code Hatcher Option Value Before Edited :"+FinanceandLegalSection_BankIBANCode_HatcherOption_Value_BeforeEdited_Special100Charcaters);
			
			companyProfilePage.click_FinanceandLegalSection_BankIBANCode_HatcherOption_RadioButton();
			
			companyProfilePage.enter_FinanceandLegalSection_BankIBANCode_HatcherOption_Textbox(newEdiFinanceandLegalSectionBankIBANCodeSpecial100Characters);

			companyProfilePage.click_FinanceandLegalSection_Save_Changes_Button();

			verify_Finance_Section_EditCompanyProfile_Updated_Successfully();

			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_EditCompany_CompanyProfilePage_displayed();

			String FinanceandLegalSection_BankIBANCode_HatcherOption_Value_AfterEdited_Special100Charcaters = companyProfilePage.get_FinanceandLegalSection_BankIBANCode_HatcherOption_Value();
			
			testStepPassed("Finance & Legal Section Bank IBAN Code Hatcher Option Value After Special Charcater and 100 Charcater Edited :"+FinanceandLegalSection_BankIBANCode_HatcherOption_Value_AfterEdited_Special100Charcaters);
			
			if (FinanceandLegalSection_BankIBANCode_HatcherOption_Value_AfterEdited_Special100Charcaters.equalsIgnoreCase(newEdiFinanceandLegalSectionBankIBANCodeSpecial100Characters)) 
			{
				testStepPassed("Finance & Legal Section Bank IBAN Code Hatcher Value After edited with 100 Special Charcater is same as the edited value");
			} 
			else 
			{
				testStepFailed("Finance & Legal Section Bank IBAN Code Hatcher Value After edited with 100 Special Charcater is not same as the edited value");
			}			
		
			testStepInfo("");
			testStepInfo("Finance & Legal Section Bank Instructions 500 Characters and Special Charcaters Validations");
			testStepInfo("**********************************************************************************************************");

			WebElement element25 = driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Bank IBAN Code']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']"));
			scrolltoElementView(element25);

			String FinanceandLegalSection_BankInstructions_HatcherOption_Value_BeforeEdited_Special500Charcaters = companyProfilePage.get_FinanceandLegalSection_BankInstructions_HatcherOption_Value();
			
			testStepPassed("Finance & Legal Section Bank Instructions Hatcher Option Value Before Edited :"+FinanceandLegalSection_BankInstructions_HatcherOption_Value_BeforeEdited_Special500Charcaters);
			
			companyProfilePage.click_FinanceandLegalSection_BankInstructions_HatcherOption_RadioButton();
			
			companyProfilePage.enter_FinanceandLegalSection_BankInstructions_HatcherOption_Textbox(newEdiFinanceandLegalSectionBankInstructionsSpecial500Characters);

			companyProfilePage.click_FinanceandLegalSection_Save_Changes_Button();

			verify_Finance_Section_EditCompanyProfile_Updated_Successfully();

			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_EditCompany_CompanyProfilePage_displayed();

			String FinanceandLegalSection_BankInstructions_HatcherOption_Value_AfterEdited_Special500Charcaters = companyProfilePage.get_FinanceandLegalSection_BankInstructions_HatcherOption_Value();
			
			testStepPassed("Finance & Legal Section Bank Instructions Hatcher Option Value After Special Charcater and 500 Charcater Edited :"+DigitalFootPrintSection_YouTube_HatcherOption_Value_AfterEdited_Special128Charcaters);
			
			if (FinanceandLegalSection_BankInstructions_HatcherOption_Value_AfterEdited_Special500Charcaters.equalsIgnoreCase(newEdiFinanceandLegalSectionBankInstructionsSpecial500Characters)) 
			{
				testStepPassed("Finance & Legal Section Bank Instructions Hatcher Value After edited with 500 Special Charcater is same as the edited value");
			} 
			else 
			{
				testStepFailed("Finance & Legal Section Bank Instructions Hatcher Value After edited with 500 Special Charcater is not same as the edited value");
			}			
		
			testStepInfo("");
			testStepInfo("Finance & Legal Section Company Secretary 128 Characters and Special Charcaters Validations");
			testStepInfo("**********************************************************************************************************");

			WebElement element26 = driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Bank Instructions']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::input[@type='text']"));
			scrolltoElementView(element26);

			String FinanceandLegalSection_CompanySecretary_HatcherOption_Value_BeforeEdited_Special128Charcaters = companyProfilePage.get_FinanceandLegalSection_CompanySecretary_HatcherOption_Value();
			
			testStepPassed("Finance & Legal Section Company Secretary Hatcher Option Value Before Edited :"+FinanceandLegalSection_CompanySecretary_HatcherOption_Value_BeforeEdited_Special128Charcaters);
			
			companyProfilePage.click_FinanceandLegalSection_CompanySecretary_HatcherOption_RadioButton();
			
			companyProfilePage.enter_FinanceandLegalSection_CompanySecretary_HatcherOption_Textbox(newEdiFinanceandLegalSectionCompanySecretarySpecial128Characters);

			companyProfilePage.click_FinanceandLegalSection_Save_Changes_Button();

			verify_Finance_Section_EditCompanyProfile_Updated_Successfully();

			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_EditCompany_CompanyProfilePage_displayed();

			String FinanceandLegalSection_CompanySecretary_HatcherOption_Value_AfterEdited_Special128Charcaters = companyProfilePage.get_FinanceandLegalSection_CompanySecretary_HatcherOption_Value();
			
			testStepPassed("Finance & Legal Section Company Secretary Hatcher Option Value After Special Charcater and 128 Charcater Edited :"+FinanceandLegalSection_CompanySecretary_HatcherOption_Value_AfterEdited_Special128Charcaters);
			
			if (FinanceandLegalSection_CompanySecretary_HatcherOption_Value_AfterEdited_Special128Charcaters.equalsIgnoreCase(newEdiFinanceandLegalSectionCompanySecretarySpecial128Characters)) 
			{
				testStepPassed("Finance & Legal Section Company Secretary Hatcher Value After edited with 128 Special Charcater is same as the edited value");
			} 
			else 
			{
				testStepFailed("Finance & Legal Section Company Secretary Hatcher Value After edited with 128 Special Charcater is not same as the edited value");
			}			
			testStepInfo("");
			testStepInfo("Finance & Legal Section Law Firm 256 Characters and Special Charcaters Validations");
			testStepInfo("**********************************************************************************************************");

			WebElement element27 = driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'finance_legal')]//*[text()='Financial Year End']/parent::div/following-sibling::div//input[contains(@value,'Hatcher')]/parent::label/following-sibling::select"));
			scrolltoElementView(element27);

			String FinanceandLegalSection_LawFirm_HatcherOption_Value_BeforeEdited_Special256Charcaters = companyProfilePage.get_FinanceandLegalSection_LawFirm_HatcherOption_Value();
			
			testStepPassed("Finance & Legal Section Law Firm Hatcher Option Value Before Edited :"+FinanceandLegalSection_LawFirm_HatcherOption_Value_BeforeEdited_Special256Charcaters);
			
			companyProfilePage.click_FinanceandLegalSection_LawFirm_HatcherOption_RadioButton();
			
			companyProfilePage.enter_FinanceandLegalSection_LawFirm_HatcherOption_Textbox(newEdiFinanceandLegalSectionLawFirmSpecial256Characters);

			companyProfilePage.click_FinanceandLegalSection_Save_Changes_Button();

			verify_Finance_Section_EditCompanyProfile_Updated_Successfully();

			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_EditCompany_CompanyProfilePage_displayed();

			String FinanceandLegalSection_LawFirm_HatcherOption_Value_AfterEdited_Special256Charcaters = companyProfilePage.get_FinanceandLegalSection_LawFirm_HatcherOption_Value();
			
			testStepPassed("Finance & Legal Section Law Firm Hatcher Option Value After Special Charcater and 256 Charcater Edited :"+FinanceandLegalSection_LawFirm_HatcherOption_Value_AfterEdited_Special256Charcaters);
			
			if (FinanceandLegalSection_LawFirm_HatcherOption_Value_AfterEdited_Special256Charcaters.equalsIgnoreCase(newEdiFinanceandLegalSectionLawFirmSpecial256Characters)) 
			{
				testStepPassed("Finance & Legal Section Law Firm Hatcher Value After edited with 256 Special Charcater is same as the edited value");
			} 
			else 
			{
				testStepFailed("Finance & Legal Section Law Firm Hatcher Value After edited with 256 Special Charcater is not same as the edited value");
			}			
			
			
			testStepInfo("");
			testStepInfo("Industry Section Validations");
			testStepInfo("************************************");
			
			WebElement element29 = driver.findElement(By.xpath("//div[contains(@id,'industry')]//span[contains(text(),'Industry')]"));
			scrolltoElementView(element29);


			companyProfilePage.click_IndustrySection_Industry_HatcherOption_RadioButton();

			companyProfilePage.select_IndustrySection_Industry_HatcherOption_Textbox(newEditIndustryHatcher);

			companyProfilePage.click_IndustrySection_SaveChanges_Button();

			verify_Industry_Section_EditCompanyProfile_Updated_Successfully();

			WebElement element28 = driver.findElement(By.xpath("//div[contains(@id,'industry')]//span[contains(text(),'Industry')]"));

			scrolltoElementView(element28);

			companyProfilePage.verify_RemoveIndustry_functionality(newEditIndustryHatcher);

			companyProfilePage.verify_InvalidIndustry_ErrorMessage_displayed(newEditInvalidIndustryHatcher);
			
			testStepInfo("");
			testStepInfo("Keyword Section Validations");
			testStepInfo("************************************");
			
			WebElement element30 = driver.findElement(By.xpath("//div[contains(@id,'keywords')]//span[contains(text(),'Keywords')]"));

			scrolltoElementView(element30);

			companyProfilePage.enter_KeywordsSection_HatcherValues(newEditInvalidKeywordHatcher);

			companyProfilePage.click_KeywordsSection_SaveChanges_Button();

			verify_Keywords_Section_EditCompanyProfile_Updated_Successfully();

			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_EditCompany_CompanyProfilePage_displayed();

			testStepPassed("");

			WebElement element31 = driver.findElement(By.xpath("//div[contains(@id,'keywords')]//span[contains(text(),'Keywords')]"));

			scrolltoElementView(element31);		
			
			
			testStepInfo("");
			testStepInfo("Region Section Validations");
			testStepInfo("*************************************");			


			companyProfilePage.click_RegionsSection_Regions_HatcherOption_RadioButton();

			companyProfilePage.select_RegionsSection_Regions_HatcherOption_Textbox(newEditRegionHatcher);

			companyProfilePage.click_RegionsSection_SaveChanges_Button();

			verify_Regions_Section_EditCompanyProfile_Updated_Successfully();

			WebElement element32 = driver.findElement(By.xpath("//div[contains(@id,'regions')]//span[contains(text(),'Regions')]"));

			scrolltoElementView(element32);

			
			companyProfilePage.verify_InvalidRegions_ErrorMessage_displayed(newEditInvalidRegionsHatcher);
			
			driver.findElement(By.xpath("//div[contains(@id,'profile-panel')]//div[contains(@class,'org-data-list')]//div[contains(@id,'regions')]")).click();
						
			testStepInfo("");
			testStepInfo("Community Settings Section Validations");
			testStepInfo("***********************************************");			

			scrollToBottomofPage();
			
			companyProfilePage.select_CommunitySettingsSection_AccountType_New(newAccountTypeEntrepreneur);
			
			companyProfilePage.click_CommunitySettingsSection_Save_Changes_Button();

			
			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_EditCompany_CompanyProfilePage_displayed();
			
			String CommunitySettingsSection_AccountType_1 = companyProfilePage.get_CommunitySettingsSection_AccountType_HatcherOption_Value();
			
					
			scrollToBottomofPage();
			
			companyProfilePage.select_CommunitySettingsSection_AccountType_New(newAccountTypeInvestor);
			
			companyProfilePage.click_CommunitySettingsSection_Save_Changes_Button();

			verify_CommunitySettings_Section_EditCompanyProfile_Updated_Successfully();

			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_EditCompany_CompanyProfilePage_displayed();
			
			String CommunitySettingsSection_AccountType_2 = companyProfilePage.get_CommunitySettingsSection_AccountType_HatcherOption_Value();
			
			if (CommunitySettingsSection_AccountType_2.equalsIgnoreCase(newAccountTypeInvestor)) 
			{
				testStepPassed("Account Type is same as Investor Expected");
			} 
			else 
			{
				testStepFailed("Account Type is not same as Investor Expected");
			}

			
			
			scrollToBottomofPage();
			
			companyProfilePage.select_CommunitySettingsSection_AccountType_New(newAccountTypeExpert);
			
			companyProfilePage.click_CommunitySettingsSection_Save_Changes_Button();

			verify_CommunitySettings_Section_EditCompanyProfile_Updated_Successfully();

			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_EditCompany_CompanyProfilePage_displayed();
			
			String CommunitySettingsSection_AccountType_3 = companyProfilePage.get_CommunitySettingsSection_AccountType_HatcherOption_Value();
			
			if (CommunitySettingsSection_AccountType_3.equalsIgnoreCase(newAccountTypeExpert)) 
			{
				testStepPassed("Account Type is same as Expert Expected");
			} 
			else 
			{
				testStepFailed("Account Type is not same as Expert Expected");
			}
			
				
			testStepInfo("");
			testStepInfo("Share Company Profile Page to Existing User");
			testStepInfo("*****************************************************");
			
			companyProfilePage.click_CompanyProfile_Section_Share_Link();
			
			popupDialogWindows.verify_CompanyProfilePage_Share_ModalDialog_Window_displayed();
			
			popupDialogWindows.verify_CompanyProfilePage_Share_ModalDialog_Window_Heading_displayed();
			
			popupDialogWindows.verify_Corresponding_CompanyProfilePage_Share_Window_displayed(newCompanyLegalName);
			
			popupDialogWindows.fill_Share_CompanyProfilePage(newContactEmailAddress);
			
			popupDialogWindows.click_ShareCompanyProfilePage_Share_Button();
			
			popupDialogWindows.click_ShareCompanyProfilePage_Share_Button();
			
			waitTime(2);
			
	
			
			popupDialogWindows.click_ShareCompanyProfilePage_Close_Button();
			
			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_EditCompany_CompanyProfilePage_displayed();
		
			
			testStepInfo("");
			testStepInfo("Share Company Profile Page to New User");
			testStepInfo("*****************************************************");	
			
			companyProfilePage.click_CompanyProfile_Section_Share_Link();
			
			popupDialogWindows.verify_CompanyProfilePage_Share_ModalDialog_Window_displayed();
			
			popupDialogWindows.verify_CompanyProfilePage_Share_ModalDialog_Window_Heading_displayed();
			
			popupDialogWindows.verify_Corresponding_CompanyProfilePage_Share_Window_displayed(newCompanyLegalName);
			
			popupDialogWindows.fill_Share_CompanyProfilePage(newShareEmail);
			
			popupDialogWindows.click_ShareCompanyProfilePage_Share_Button();
			
			popupDialogWindows.verify_CompanyProfilePage_Share_UserNotFound_ModalDialog_Window_displayed();
			
			popupDialogWindows.fill_Share_UserNotFound_CompanyProfilePage_NewCompanyLegalName(newShareSalutation, newShareFirstName, newShareLastName, newShareEmail, newShareLegalName, newShareAddress, newShareCity, newSharePostalCode, newShareState, newShareCountry, newShareWebsite, newSharePhone);
			
			popupDialogWindows.click_ShareCompanyProfilePage_Share_Button();
			
			waitTime(2);
		
			popupDialogWindows.click_ShareCompanyProfilePage_Close_Button();
			
			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_EditCompany_CompanyProfilePage_displayed();
						
					
			testStepInfo("");
			testStepInfo("Share Company Profile Page to New User Mandatory Fields  and Placeholders displayed");
			testStepInfo("************************************************************************************************************");	
			
			companyProfilePage.click_CompanyProfile_Section_Share_Link();
			
			popupDialogWindows.verify_CompanyProfilePage_Share_ModalDialog_Window_displayed();
			
			popupDialogWindows.verify_CompanyProfilePage_Share_ModalDialog_Window_Heading_displayed();
			
			popupDialogWindows.verify_Corresponding_CompanyProfilePage_Share_Window_displayed(newCompanyLegalName);
			
			popupDialogWindows.fill_Share_CompanyProfilePage(newShareEmail2);
			
			popupDialogWindows.click_ShareCompanyProfilePage_Share_Button();
			
			popupDialogWindows.verify_CompanyProfilePage_Share_UserNotFound_ModalDialog_Window_displayed();

			popupDialogWindows.verify_CompanyProfilePage_Share_UserNotFound_ModalDialog_Window_MandatoryFields_displayed();
			
			popupDialogWindows.verify_CompanyProfilePage_Share_UserNotFound_ModalDialog_Window_Placeholders_displayed();
			
					
			
			testStepInfo("");
			testStepInfo("Share Company Profile Page to New User Error Message displayed for Empty Mandatory Fields");
			testStepInfo("*************************************************************************************************************");	
			
			popupDialogWindows.enter_Address_Share_CompanyProfilePage_UserNotFound_Window(newShareAddress);
			
			popupDialogWindows.enter_City_Share_CompanyProfilePage_UserNotFound_Window(newShareCity);
			
			popupDialogWindows.enter_PostalCode_Share_CompanyProfilePage_UserNotFound_Window(newSharePostalCode);
			
			popupDialogWindows.enter_State_Share_CompanyProfilePage_UserNotFound_Window(newShareState);
			
			popupDialogWindows.click_ShareCompanyProfilePage_Share_Button();
			
			popupDialogWindows.verify_Salutation_EmptyErrorMessage_Share_UserNotFound_CompanyProfilePage_displayed();
			
			popupDialogWindows.select_Salutation_Share_CompanyProfilePage_UserNotFound_Window(newShareSalutation);
			
			popupDialogWindows.click_ShareCompanyProfilePage_Share_Button();
			
			popupDialogWindows.verify_FirstName_EmptyErrorMessage_Share_UserNotFound_CompanyProfilePage_displayed();
			
			popupDialogWindows.enter_FirstName_Share_CompanyProfilePage_UserNotFound_Window(newShareFirstName);
			
			popupDialogWindows.click_ShareCompanyProfilePage_Share_Button();
			
			popupDialogWindows.verify_LastName_EmptyErrorMessage_Share_UserNotFound_CompanyProfilePage_displayed();
			
			popupDialogWindows.enter_LastName_Share_CompanyProfilePage_UserNotFound_Window(newShareLastName);
			
			popupDialogWindows.click_ShareCompanyProfilePage_Share_Button();
			
			
			popupDialogWindows.verify_LegalName_EmptyErrorMessage_Share_UserNotFound_CompanyProfilePage_displayed();
			
			popupDialogWindows.enter_NewLegalName_Share_CompanyProfilePage_UserNotFound_Window(newShareLegalName);
			
			popupDialogWindows.click_ShareCompanyProfilePage_Share_Button();
			
			popupDialogWindows.verify_Country_EmptyErrorMessage_Share_UserNotFound_CompanyProfilePage_displayed();
			
			popupDialogWindows.enter_Country_Share_CompanyProfilePage_UserNotFound_Window(newShareCountry);
			
			popupDialogWindows.click_ShareCompanyProfilePage_Share_Button();
			
			popupDialogWindows.verify_Website_EmptyErrorMessage_Share_UserNotFound_CompanyProfilePage_displayed();
			
			popupDialogWindows.enter_Website_Share_CompanyProfilePage_UserNotFound_Window(newShareWebsite);
			
			popupDialogWindows.click_ShareCompanyProfilePage_Share_Button();
		
			
			waitTime(2);
			
				
			popupDialogWindows.click_ShareCompanyProfilePage_Close_Button();
			
			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_EditCompany_CompanyProfilePage_displayed();
			
						
			
			testStepInfo("");
			testStepInfo("Share Company Profile Page to New User Window fields with only Mandatory Fields");
			testStepInfo("*************************************************************************************************");	

			companyProfilePage.click_CompanyProfile_Section_Share_Link();
			
			popupDialogWindows.verify_CompanyProfilePage_Share_ModalDialog_Window_displayed();
			
			popupDialogWindows.verify_CompanyProfilePage_Share_ModalDialog_Window_Heading_displayed();
			
			popupDialogWindows.verify_Corresponding_CompanyProfilePage_Share_Window_displayed(newCompanyLegalName);
			
			popupDialogWindows.fill_Share_CompanyProfilePage(newShareEmail3);
			
			popupDialogWindows.click_ShareCompanyProfilePage_Share_Button();
			
			popupDialogWindows.verify_CompanyProfilePage_Share_UserNotFound_ModalDialog_Window_displayed();
			
			popupDialogWindows.select_Salutation_Share_CompanyProfilePage_UserNotFound_Window(newShareSalutation);
			
			popupDialogWindows.enter_FirstName_Share_CompanyProfilePage_UserNotFound_Window(newShareFirstName);
			
			popupDialogWindows.enter_LastName_Share_CompanyProfilePage_UserNotFound_Window(newShareLastName);
			
			popupDialogWindows.enter_NewLegalName_Share_CompanyProfilePage_UserNotFound_Window(newShareLegalName);
			
			popupDialogWindows.enter_Country_Share_CompanyProfilePage_UserNotFound_Window(newShareCountry);
			
			popupDialogWindows.enter_Website_Share_CompanyProfilePage_UserNotFound_Window(newShareWebsite);
			
			popupDialogWindows.enter_Phone_Share_CompanyProfilePage_UserNotFound_Window(newSharePhone);
			
			popupDialogWindows.click_ShareCompanyProfilePage_Share_Button();
			
			waitTime(2);
			
		
			popupDialogWindows.click_ShareCompanyProfilePage_Close_Button();
			
			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_EditCompany_CompanyProfilePage_displayed();
			
			
			testStepInfo("");
			testStepInfo("Share Company Profile Page to New User window fields validations");
			testStepInfo("****************************************************************************");	

			companyProfilePage.click_CompanyProfile_Section_Share_Link();
			
			popupDialogWindows.verify_CompanyProfilePage_Share_ModalDialog_Window_displayed();
			
			popupDialogWindows.verify_CompanyProfilePage_Share_ModalDialog_Window_Heading_displayed();
			
			popupDialogWindows.verify_Corresponding_CompanyProfilePage_Share_Window_displayed(newCompanyLegalName);
			
			popupDialogWindows.fill_Share_CompanyProfilePage(newShareEmail4);
			
			popupDialogWindows.click_ShareCompanyProfilePage_Share_Button();
			
			popupDialogWindows.verify_CompanyProfilePage_Share_UserNotFound_ModalDialog_Window_displayed();

			popupDialogWindows.select_Salutation_Share_CompanyProfilePage_UserNotFound_Window(newShareSalutation);
			
			popupDialogWindows.enter_FirstName_Share_CompanyProfilePage_UserNotFound_Window(newShareFirstNameSpecial100Characters);
			
			popupDialogWindows.enter_LastName_Share_CompanyProfilePage_UserNotFound_Window(newShareLastNameSpecial100Characters);
			
			popupDialogWindows.enter_NewLegalName_Share_CompanyProfilePage_UserNotFound_Window(newShareLegalName);
			
			popupDialogWindows.enter_Address_Share_CompanyProfilePage_UserNotFound_Window(newShareAddress);
			
			popupDialogWindows.enter_City_Share_CompanyProfilePage_UserNotFound_Window(newShareCitySpecial128Characters);
			
			popupDialogWindows.enter_PostalCode_Share_CompanyProfilePage_UserNotFound_Window(newSharePostalCode);
			
			popupDialogWindows.enter_State_Share_CompanyProfilePage_UserNotFound_Window(newShareStateSpecial128Characters);
			
			popupDialogWindows.enter_Country_Share_CompanyProfilePage_UserNotFound_Window(newShareCountry);
			
			popupDialogWindows.enter_Website_Share_CompanyProfilePage_UserNotFound_Window(newShareWebsite);
			
				
			popupDialogWindows.click_ShareCompanyProfilePage_Share_Button();
			
			waitTime(2);
			
				
			popupDialogWindows.click_ShareCompanyProfilePage_Close_Button();
			
			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_EditCompany_CompanyProfilePage_displayed();
			
			companyProfilePage.click_EditProfile_Back_Link();
			
			companyProfilePage.verify_CompanyProfilePage_displayed();
			
			companyProfilePage.verify_CompanyProfilePage_MainProfilePage_displayed();
			
				
			
			testStepInfo("");
			testStepInfo("Edit Company Description in Company Profile Page");
			testStepInfo("****************************************************************************");
			
			String descriptionBeforeEditing = companyProfilePage.get_Description_CompanyprofilePage();
			
			companyProfilePage.click_EditDescriptionLink_CompanyDescription_CompanyProfilePage();

			popupDialogWindows.edit_CompanyDescription_CompanyProfilePage(newCompanyEditDescription);
			
			companyProfilePage.verify_CompanyProfilePage_displayed();
			
			companyProfilePage.verify_CompanyProfilePage_MainProfilePage_displayed();
			
			String descriptionAfterEditing = companyProfilePage.get_Description_CompanyprofilePage();
			
			if (descriptionAfterEditing.equalsIgnoreCase(newCompanyEditDescription)) 
			{
				testStepPassed("Company Description in Company profile page is same as the edited description");
			} 
			else 
			{
				testStepFailed("Company Description in Company profile page is not same as the edited description");
			}
			
			
			testStepInfo("");
			testStepInfo("Upload Presentation Placeholder Empty File Validation");
			testStepInfo("****************************************************************************");

			companyProfilePage.click_UploadPresentation();
			
			popupDialogWindows.verify_UploadPresentation_DialogWindow_displayed();
			
			popupDialogWindows.verify_FileName_PlaceHolder_UploadPresentation_DialogWindow_displayed();
			
			popupDialogWindows.verify_emptyFileName_errorMessage_UploadPresentation_DialogWindow_displayed(emptyFileUploadPresentation);
			
			popupDialogWindows.click_UploadPresentation_DialogWindow_CloseLink();
	
			
			testStepInfo("");
			testStepInfo("Upload Presentation Special Charcater File Name Uploaded Validation");
			testStepInfo("*********************************************************************************************");

			companyProfilePage.verify_CompanyProfilePage_displayed();
			
			companyProfilePage.verify_CompanyProfilePage_MainProfilePage_displayed();
			
			companyProfilePage.click_UploadPresentation();
			
			popupDialogWindows.verify_UploadPresentation_DialogWindow_displayed();
			
			try 
			{
				if (driver.findElement(By.xpath("(//div[contains(@id,'modal-upload-presentation')]//div[contains(@class,'modal-content')]//div[contains(@class,'title')]//*[contains(text(),'Upload Presentation')])[1]//parent::div//parent::div[contains(@class,'body')]//input[contains(@id,'input-presentation-file')]")).isDisplayed()) 
				{
					testStepPassed("File Upload Textbox is Visible");

					WebElement ele = driver.findElement(By.xpath("(//div[contains(@id,'modal-upload-presentation')]//div[contains(@class,'modal-content')]//div[contains(@class,'title')]//*[contains(text(),'Upload Presentation')])[1]//parent::div//parent::div[contains(@class,'body')]//input[contains(@id,'input-presentation-file')]")); 
					ele.sendKeys(filePath1);
				}
			}
			catch (Exception e) 
			{
				testStepFailed("File Upload Textbox is not Visible");
			}
				
			popupDialogWindows.enter_fileName_UploadPresentation_DialogWindow_displayed(fileNameSpecial100Characters);
			
			popupDialogWindows.click_UploadPresentation_DialogWindow_UploadButton();
			
			popupDialogWindows.verify_UploadPresentation_ModalDialogWindow_FileUploadedSuccessMessage();
			
			companyProfilePage.verify_CompanyProfilePage_displayed();
			
			companyProfilePage.verify_CompanyProfilePage_MainProfilePage_displayed();
			
						
			
			testStepInfo("");
			testStepInfo("View Profile as Public");
			testStepInfo("************************************************************************");

			companyProfilePage.click_ViewProfileasPublic();
			
			companyProfilePage.verify_ViewProfileasPublic_DialogWindow_displayed();
			
			navigateBack();
			
			companyProfilePage.verify_CompanyProfilePage_displayed();
			
			companyProfilePage.verify_CompanyProfilePage_MainProfilePage_displayed();
			
			
			
			
			testStepInfo("");
			testStepInfo("Upload Screenshot in Screenshot Manager Dialog Window");
			testStepInfo("*********************************************************************************");

			companyProfilePage.click_UploadScreenshotLink_About_CompanyProfilePage();
			
			popupDialogWindows.verify_ScreenshotManager_DialogWindow_displayed();
			
			popupDialogWindows.click_Close_ScreenshotManager_DialogWindow();
			
			companyProfilePage.verify_CompanyProfilePage_displayed();
			
			companyProfilePage.verify_CompanyProfilePage_MainProfilePage_displayed();
			
			companyProfilePage.click_UploadScreenshotLink_About_CompanyProfilePage();
			
			popupDialogWindows.verify_ScreenshotManager_DialogWindow_displayed();
			
			popupDialogWindows.verify_Placeholder_ScreenshotManager_DialogWindow();
			
			popupDialogWindows.upload_FilePath_ScreenshotManager_DialogWindow(filePath2);
			
			popupDialogWindows.enter_FileName_ScreenshotManager_DialogWindow(screenshotManagerFileName);
			
			popupDialogWindows.click_UploadButton_UploadScreenshot_ScreenshotManager_DialogWindow();
			
			popupDialogWindows.verify_UploadScreenShotManager_ModalDialogWindow_FileUploadedSuccessMessage();
			
			
			
			
			testStepInfo("");
			testStepInfo("Verify Customize Profile Window is displayed Correctly with Placeholder");
			testStepInfo("*****************************************************************************************");

			companyProfilePage.click_CustomizeCompanyProfile();
			
			popupDialogWindows.verify_CustomizeProfile_DialogWindow_displayed();
			
			popupDialogWindows.verify_PlaceholderText_CustomizeProfile_DialogWindow();
			
			popupDialogWindows.click_CustomizeProfile_DialogWindow_CloseLink();
			
			companyProfilePage.verify_CompanyProfilePage_displayed();
			
			companyProfilePage.verify_CompanyProfilePage_MainProfilePage_displayed();
			
			
			
			
			testStepInfo("");
			testStepInfo("Verify Merge Company Window is displayed Correctly with Placeholders");
			testStepInfo("*******************************************************************************************");
			
			companyProfilePage.click_MergeCompany();

			popupDialogWindows.verify_MergeCompany_DialogWindow_displayed();
			
			popupDialogWindows.verify_PlaceholderText_MergeCompany_DialogWindow();
			
			popupDialogWindows.click_MergeCompany_DialogWindow__CloseLink();
			
			companyProfilePage.verify_CompanyProfilePage_displayed();
			
			companyProfilePage.verify_CompanyProfilePage_MainProfilePage_displayed();
			
			
			
			
			testStepInfo("");
			testStepInfo("Merge Company with Existing Company in Merge Company Dialog Window");
			testStepInfo("***************************************************************************************************");

			companyProfilePage.click_MergeCompany();

			popupDialogWindows.verify_MergeCompany_DialogWindow_displayed();

			popupDialogWindows.verify_CompanyMergedWithexisitingCompany(newCompanyLegalName);
			
			popupDialogWindows.click_Submit_MergeCompany_CustomizeProfile_DialogWindow();
			
			companyProfilePage.verify_CompanyProfilePage_displayed();
			
			companyProfilePage.verify_CompanyProfilePage_MainProfilePage_displayed();
			
			
			
			
			testStepInfo("");
			testStepInfo("Verify Edit Company profile Page is Opened by Clicking Edit Link in Contact section");
			testStepInfo("*********************************************************************************************************");

			companyProfilePage.click_EditLink_Contact_CompanyProfilePage();
			
			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_EditCompany_CompanyProfilePage_displayed();
			
			
			
			
			testStepInfo("");
			testStepInfo("Update Legal Name");
			testStepInfo("***********************************");			
			
			movetoTopofPage();
			
			WebElement element33 = driver.findElement(By.xpath("//div[contains(@id,'company')]//span[contains(text(),'Company')]"));

			scrolltoElementView(element33);

			//companyProfilePage.click_CompanySection_LegalName_HatcherOption_RadioButton();
			
			companyProfilePage.enter_CompanySection_LegalName_HatcherOption_Textbox(newCompanyLegalName2);

			companyProfilePage.click_CompanySection_Save_Changes_Button();

			verify_Company_Section_EditCompanyProfile_Updated_Successfully();

			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_EditCompany_CompanyProfilePage_displayed();
			
				
			
			
			scrollToTopofPage();
			
			companyProfilePage.click_EditProfile_Back_Link();
			
			companyProfilePage.verify_CompanyProfilePage_displayed();
			
			companyProfilePage.verify_CompanyProfilePage_MainProfilePage_displayed();
			
			
			
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
			if(this.testFailure||this.obj.testFailure||mainPage.testFailure||loginPage.testFailure||registrationCompanyPage.testFailure||registrationFounderPage.testFailure||registrationInvestmentHistoryPage.testFailure||registrationVideoInterviewPage.testFailure||userProfilePage.testFailure||homePage.testFailure||companyProfilePage.testFailure||settingsPage.testFailure||popupDialogWindows.testFailure||emailReaderPage.testFailure||createPasswordPage.testFailure||profileUpdateRegistrationPage.testFailure||cohortPage.testFailure)
			{
				this.testFailure = true;
			}
		}
	}
}