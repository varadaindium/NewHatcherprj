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

public class HTCHR_EP_SCR_001_TC_001_To_288_Updated extends ApplicationKeywords
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
	
	
	public HTCHR_EP_SCR_001_TC_001_To_288_Updated(BaseClass obj) 
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
			cohortPage=new CohortPage(obj);
			
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
			String newEditContactCountryHatcher = retrieve("newEditContactCountryHatcher");
			
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
			String newJurisdictionHatcher = retrieve("newEditCompanyJurisdictionHatcher");
			String newGoverningBodyHatcher = retrieve("newEditCompanyGoverningBodyHatcher");
			String newEditRegistrationNumber = retrieve("newEditRegistrationNumberHatcher");
			
			String newEditCompanyFormerNameHatcher = retrieve("newEditCompanyFormerNameHatcher");
			String newEditContactLatitudeHatcher=retrieve("newEditContactLatitudeHatcher");
			String newEditContactCompanyEmailHatcher=retrieve("newEditContactCompanyEmailHatcher");
			String newEditContactPhoneHatcher=retrieve("newEditContactPhoneHatcher");
			String tempVariable6 = generateRandomString();
			String newCompanyLegalName2 = newCompanyLegalNameData+tempVariable6;
			
			String tempVariable7 = generateRandomString();
			String newFounderFirstName2 = newFounderFirstNameData+tempVariable7;
			String tempVariable8 = generateRandomString();
			String newFounderLastName2 = newFounderLastNameData+tempVariable8;
			String newEditCompanyLegalNameHatcher= retrieve("newEditCompanyLegalNameHatcher");
			String newEditCompanyFriendlyNameHatcher= retrieve("newEditCompanyFriendlyNameHatcher");
			String newEditCompanyJurisdictionHatcher= retrieve("newEditCompanyJurisdictionHatcher");
			String newEditCompanyGoverningBodyHatcher= retrieve("newEditCompanyGoverningBodyHatcher");
			String newEditRegistrationNumberHatcher= retrieve("newEditRegistrationNumberHatcher");
			String newEditFinanceLegalFinancialYearEndHatcher= retrieve("newEditFinanceLegalFinancialYearEndHatcher");
			String newEditFinanceLegalCurrencyHatcher= retrieve("newEditFinanceLegalCurrencyHatcher");
			
			
			String newEditLegalNameSpecialCharacters = generateRandomSpecialCharacterString(10);
			String newEditFriendlyNameSpecialCharacters = generateRandomSpecialCharacterString(10);
			String newEditIncorporateDateNumerals = generateRandomNumbersasString(36);//added
			String newEditIncorporateDateSpecialCharacters = generateRandomSpecialCharacterString(10);
				
			
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
			String newEditContactCountrySplChars = generateRandomSpecialCharacterString(10);
			String newEditContactLatitudeSpecial10Characters = generateRandomSpecialCharacterString(10);
			String newEditContactLongitudeSpecial10Characters = generateRandomSpecialCharacterString(10);
			String newEditContactEmailSpecial10Characters = generateRandomSpecialCharacterString(10);
			
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
			String newEditRegionHatcher1 = "Africa";
			String newEditRegionHatcher2 = "ASia";
			String newAccountTypeEntrepreneur = "Entrepreneur";
			String newAccountTypeInvestor = "Investor";
			String newAccountTypeExpert = "Expert";
			
			String newShareSalutation = retrieve("newShareSalutation");
			String newShareFirstName = retrieve("newShareFirstName");
			String newShareLastName = retrieve("newShareLastName");
			String newShareEmail = retrieve("newShareEmail");
			String newShareLegalName = retrieve("newShareLegalName");
			String newShareAddress = retrieve("newShareAddress");
			String newShareCity = retrieve("newShareCity");
			String newSharePostalCode = retrieve("newSharePostalCode");
			String newShareState = retrieve("newShareState");
			String newShareCountry = retrieve("newShareCountry");
			String newShareWebsite = retrieve("newShareWebsite");
			String newSharePhone = retrieve("newSharePhone");
			String newShareEmailSplchars = generateRandomEmailAddress();
			String newShareEmail3 = generateRandomEmailAddress();
			String newShareEmail4 = generateRandomEmailAddress();
			String newShareEmail5 = generateRandomEmailAddress();
			
			String newShareSalutationSpecial100Characters = generateRandomSpecialCharacterString(100);
			String newShareFirstNameSpecial100Characters = generateRandomSpecialCharacterString(100);
			String newShareLastNameSpecial100Characters = generateRandomSpecialCharacterString(100);
			String newShareEmailSpecial100Characters = generateRandomSpecialCharacterString(100);
			String newShareLegalNameSpecial100Characters = generateRandomSpecialCharacterString(100);
			String newShareCountrySpecial100Characters = generateRandomSpecialCharacterString(100);
			String newShareAddressSpecial256Characters = generateRandomSpecialCharacterString(256);
			String newShareCitySpecial128Characters = generateRandomSpecialCharacterString(128);
			String newSharePhoneSpecial128Characters = generateRandomSpecialCharacterString(128);
			String newShareWebsiteSpecial128Characters = generateRandomSpecialCharacterString(128);
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
			/*testStepPassed("New Edit Legal Name Special Characters : "+newEditLegalNameSpecialCharacters);
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
			testStepPassed("New Share Phone : "+newSharePhone);*/
			
		/*	testStepPassed("");
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
			testStepPassed("New Youtube Address : "+newTestEditDigitalYouTubeHatcher);*/
			
			
			testStepInfo("");
			testStepInfo("************************************");
			testStepInfo("Execution Steps Started");
			testStepInfo("************************************");
			testStepInfo("");

			clearCookies();

			openApplicationMainPageByHittingURL();
			

			/**********Checking Mail Id all registered in App and if exists deleting the profile with that Mail Id**********/

		//	mainPage.verify_MainPage_displayed();			
		//	mainPage.click_login_button();			
		//	loginPage.verify_LoginPage_displayed();			
		//	loginPage.loginIntoApplication(adminEmailId, adminPassword);
			
		//	click_Settings_Fixed_SideBar_HamburgerMenu();			
		//	settingsPage.verify_SettingsPage_displayed();			
			//settingsPage.verify_SettingsPage_BrandingTab_displayed();			
		//	settingsPage.select_Pages_dropdown(pageOption);			
		//	settingsPage.verify_SettingsPage_UserPage_UsersTab_displayed();			
		//	settingsPage.click_SettingsPage_UserPage_UsersTab();			
		//	settingsPage.verify_SettingsPage_UserPage_UsersTab_Section_displayed();			
		//	settingsPage.verify_Users_DisplayedinApplication_DeleteUser(newContactEmailAddress);
			
			mainPage.verify_MainPage_displayed();		
			mainPage.click_login_button();		
			loginPage.verify_LoginPage_displayed();		
			loginPage.loginIntoApplication(adminEmailId, adminPassword);
			click_Settings_Users_Fixed_SideBar_HamburgerMenu();		
			settingsPage.verify_SettingsPage_UserPage_UsersTab_Section_displayed();		
			settingsPage.verify_Users_DisplayedinApplication_DeleteUser(newContactEmailAddress);		
			logoutFromApplication();

			mainPage.verify_MainPage_displayed();
		
			
			/**********Test Cases********************/
			
			testStepInfo("HTCHR_EP_SCR_001_TC_001  -->"+"Verify organisation profile page gets landed successfully.");
			mainPage.click_login_button();
			loginPage.verify_LoginPage_displayed();
			loginPage.loginIntoApplication(adminEmailId, adminPassword);
		//	driver.navigate().to("https://hq.hatcher-staging.com/orgs/441312/profile");
			userProfilePage.verify_UserProfilePage_OppurtunitiesTab_displayed();
			click_AddDeal_Actions_Menu_Updated();
			cohortPage.verify_Cohort_Page_displayed();
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
						
			driver.navigate().to("https://hq.hatcher-staging.com/orgs/441313/profile");
			
			testStepInfo("HTCHR_EP_SCR_001_TC_002  -->"+"Verify the organisation info can be edited.");
			companyProfilePage.verify_CompanyProfilePageHeading_displayed();
			companyProfilePage.verify_ProfileTab_CompanyProfilePage_displayed();
			companyProfilePage.click_ProfileTab_Link();
			companyProfilePage.click_editCompanyProfilePage_Flow_Updated();
			companyProfilePage.verify_EditCompany_CompanyProfilePage_displayed();
			companyProfilePage.verify_EditCompany_CompanyProfilePage_Elements_displayed();
			
			testStepInfo("HTCHR_EP_SCR_001_TC_003  -->"+"Verify the company-legalname with alphanumeric and special characters.");
			refreshPage();
			companyProfilePage.select_CompanySection_LegalName_HatcherOption();
			companyProfilePage.enter_CompanySection_LegalName_HatcherOption_Textbox(newEditLegalNameSpecialCharacters);
			
			testStepInfo("HTCHR_EP_SCR_001_TC_014 -->"+"Verify the legal name accepts lesser than or equal to 100 characters.");
			companyProfilePage.clear_CompanySection_HatcherValues();
			companyProfilePage.enter_CompanySection_LegalName_HatcherOption_Textbox(newEditLegalName100Characters);
									
			testStepInfo("HTCHR_EP_SCR_001_TC_004  -->"+"Verify the company-friendlyname accepts alphanumeric and special characters");
			companyProfilePage.select_CompanySection_FriendlyName_HatcherOption();
			companyProfilePage.enter_CompanySection_FriendlyName_HatcherOption_Textbox(newEditFriendlyNameSpecialCharacters);
						
			testStepInfo("HTCHR_EP_SCR_001_TC_005 -->"+"Verify the company-Incorporation date accepts only numerical.");
			companyProfilePage.select__CompanySection_IncorporationDate_HatcherOption_RadioButton();
			companyProfilePage.enter_CompanySection_IncorporationDateHatcherOption_Textbox(newEditIncorporateDateNumerals);
						
			testStepInfo("HTCHR_EP_SCR_001_TC_006 -->"+"Verify the company-Incorporation date restricts alphabets and special characters.");
			companyProfilePage.select__CompanySection_IncorporationDate_HatcherOption_RadioButton();
			companyProfilePage.enter_CompanySection_IncorporationDateHatcherOption_Textbox(newEditIncorporateDateSpecialCharacters);//fails
						
			testStepInfo("HTCHR_EP_SCR_001_TC_007 -->"+"Verify the company has all the labels with first letter as upper case and with out any misspellings.");
			companyProfilePage.verify_EditCompany_AllLabels_FirstLetterUpperCase_displayed();
			refreshPage();
			//HTCHR_EP_SCR_001_TC_008-Not Automatable
			
			testStepInfo("HTCHR_EP_SCR_001_TC_009 -->"+"Verify the jurisdiction field can be filtered using alphabets alone.");
			companyProfilePage.click_CompanySection_Jurisdiction_HatcherOption();
			companyProfilePage.select_CompanySection_Jurisdiction_From_list(newJurisdictionHatcher);
			companyProfilePage.verify_Jurisdiction_HatcherOption_errorMessage_Displayed(newEditJurisdictionRandomNumbers);
			
			testStepInfo("HTCHR_EP_SCR_001_TC_010 -->"+"Verify the jurisdiction field cannot be filtered using  special characters .");
			companyProfilePage.click_CompanySection_Jurisdiction_HatcherOption();
			companyProfilePage.verify_Jurisdiction_HatcherOption_errorMessage_Displayed(newEditJurisdictionSpecialCharacters);
			
			testStepInfo("HTCHR_EP_SCR_001_TC_011 -->"+"Verify the governing body field can be filtered using alphabets alone .");
			companyProfilePage.click_CompanySection_GoverningBody_Hatcher();
			companyProfilePage.select_CompanySection_GoverningBody(newGoverningBodyHatcher);
			
			testStepInfo("HTCHR_EP_SCR_001_TC_012 -->"+"Verify the governing body field cannot be filtered using numercial, special characters .");
			//companyProfilePage.clear_CompanySection_HatcherValues();
			companyProfilePage.click_CompanySection_GoverningBody_Hatcher();
			//companyProfilePage.select_CompanySection_GoverningBody(newEditGoverningBodyRandomNumbers);
			companyProfilePage.verify_CompanySection_GoverningBody_elementNotFound_errorMessage_Displayed(newEditGoverningBodyRandomNumbers);
			//companyProfilePage.clear_CompanySection_HatcherValues();
			companyProfilePage.click_CompanySection_GoverningBody_Hatcher();
			companyProfilePage.verify_CompanySection_GoverningBody_elementNotFound_errorMessage_Displayed(newEditGoverningBodySpecialCharacters);
			
			testStepInfo("HTCHR_EP_SCR_001_TC_013 -->"+"Verify the registration number field accepts alphanumeric & special characters.");
			companyProfilePage.clear_CompanySection_HatcherValues();
			companyProfilePage.click_CompanySection_RegistrationNumber_HatcherOption();
			companyProfilePage.enter_CompanySection_RegistrationNumber_HatcherOption_Textbox(newEditRegistrationNumberSpecialCharacters);
			
			
			
			//HTCHR_EP_SCR_001_TC_015-to-22deffered
			
			//HTCHR_EP_SCR_001_TC_023--Obsolete
			testStepInfo("HTCHR_EP_SCR_001_TC_024 -->"+"Verify the updated inputs are saved.");
			companyProfilePage.clear_CompanySection_HatcherValues();
			companyProfilePage.fill_CompanySection_HatcherValues(newEditCompanyLegalNameHatcher, newEditCompanyFriendlyNameHatcher, newCompanyIncorporationDate, newEditCompanyJurisdictionHatcher, newEditCompanyGoverningBodyHatcher, newEditRegistrationNumberHatcher);
			companyProfilePage.click_CompanySection_SaveChanges_Button();
			companyProfilePage.verify_Company_Section_EditCompanyProfile_Updated_Successfully();
			
			//FormerNamesSection
			testStepInfo("HTCHR_EP_SCR_001_TC_025 -->"+"Verify the company former names has all the labels with first letter as upper case and with out any misspellings.");
			companyProfilePage.verify_FormerNamesSection_FirstLetter_UpperCase();
			
			testStepInfo("HTCHR_EP_SCR_001_TC_026 -->"+"Verify the company former names has place holder as 'Type former name'.");
			companyProfilePage.get_CompanyFormerNamesSection_FormerName_Placeholder();
			companyProfilePage.verify_FormerNamesSection_FormerName_Placeholder();
			
			testStepInfo("HTCHR_EP_SCR_001_TC_027 -->"+"Verify the company former names displays another provision to input former names and delete option before saving the input.");
			companyProfilePage.verify_CompanyFormerNamesSection_EditCompany_CompanyProfilePage_displayed();
			companyProfilePage.verify_Display_Of_New_Textbox_CompanyFormerName(newEditCompanyFormerNameHatcher);
			
			//HTCHR_EP_SCR_001_TC_028,29-Not Automatable
			
			testStepInfo("HTCHR_EP_SCR_001_TC_030 -->"+"To verify the changes are saved successfully.");
			companyProfilePage.click_CompanyFormerNamesSection_SaveChanges_Button();
			companyProfilePage.verify_CompanyFormerNamesSection_Updated_SuccessMessage_displayed(newEditCompanyFormerNameHatcher);
			
			testStepInfo("HTCHR_EP_SCR_001_TC_031 -->"+"To verify the previous records arent deleted once saved.");
			companyProfilePage.verify_Display_Of_Already_Existing_CompanyFormerName();//review
			
			testStepInfo("HTCHR_EP_SCR_001_TC_032 -->"+"To verify the contact details label first letters as upper case and displayed with out any misspellings.");
			companyProfilePage.verify_EditCompany_AllLabels_ContactDetails_FirstLetterUpperCase_displayed();
			
			//HTCHR_EP_SCR_001_TC_033-LTrim
			
			testStepInfo("HTCHR_EP_SCR_001_TC_034 -->"+"Verify the Main Contact dropdown displays admin name by default.");
			companyProfilePage.select_ContactDetailsSection_MainContact_HatcherOption();
			companyProfilePage.enter_ContactDetailsSection_MainContact_HatcherOption_Textbox(newEditCompanyLegalNameHatcher);
			companyProfilePage.verify_ContactDetailsSection_MainContact_NoResults_ErrorMessage_displayed();
			companyProfilePage.click_ContactDetailsSection_SaveChanges_Button();
			
			testStepInfo("HTCHR_EP_SCR_001_TC_035 -->"+"Verify the main contact- address field accepts alphanumeric (Upper and lower case) and special characters");
			companyProfilePage.select_ContactDetailsSection_Address_HatcherOption();
			companyProfilePage.enter_ContactDetailsSection_Address_HatcherOption_Textbox(newEditContactAddressSpecialCharacters256Characters);
			companyProfilePage.click_ContactDetailsSection_SaveChanges_Button();
			
			//HTCHR_EP_SCR_001_TC_036 to 40 Not Automatable(Except 38)
			testStepInfo("HTCHR_EP_SCR_001_TC_038 -->"+"Verify the main contact- unit/suit field accepts alphanumeric (Upper and lower case) and special characters");
			companyProfilePage.select_ContactDetailsSection_UnitorSuite_HatcherOption();
			companyProfilePage.enter_ContactDetailsSection_UnitorSuite_HatcherOption_Textbox(newEditContactUnitorSuiteSpecialCharacters128Characters);
			verify_textboxvalid(CompanyProfilePage.txt_EP_ContactDetailsSection_UnitSuite_HatcherOption, newEditContactUnitorSuiteSpecialCharacters128Characters);
			
			testStepInfo("HTCHR_EP_SCR_001_TC_041-->"+"Verify the main contact- City field accepts alphanumeric (Upper and lower case) and special characters");
			companyProfilePage.select_ContactDetailsSection_City_HatcherOption();
			companyProfilePage.enter_ContactDetailsSection_City_HatcherOption_Textbox(newEditContactCitySpecialCharacters128Characters);
			verify_textboxvalid(CompanyProfilePage.txt_EP_ContactDetailsSection_City_HatcherOption, newEditContactCitySpecialCharacters128Characters);
			
			testStepInfo("HTCHR_EP_SCR_001_TC_044-->"+"Verify the main contact- Postal code field accepts alphanumeric (Upper and lower case) and special characters");
			companyProfilePage.select_ContactDetailsSection_PostalCode_HatcherOption();
			companyProfilePage.enter_ContactDetailsSection_PostalCode_HatcherOption_Textbox(newEditContactPostalSpecialCharacters16Characters);
			verify_textboxvalid(CompanyProfilePage.txt_EP_ContactDetailsSection_PostalCode_HatcherOption, newEditContactPostalSpecialCharacters16Characters);
			
			testStepInfo("HTCHR_EP_SCR_001_TC_047-->"+"Verify the main contact- State field accepts alphanumeric (Upper and lower case) and special characters");
			companyProfilePage.click_ContactDetailsSection_Country_HatcherOption();
			companyProfilePage.enter_ContactDetailsSection_State_HatcherOption_Textbox(newEditContactStateSpecialCharacters128Characters);
			verify_textboxvalid(CompanyProfilePage.txt_EP_ContactDetailsSection_State_HatcherOption, newEditContactPostalSpecialCharacters16Characters);
			
			testStepInfo("HTCHR_EP_SCR_001_TC_050-->"+"Verify the country dropdown can be selected using alphabets alone");
			companyProfilePage.click_ContactDetailsSection_Country_HatcherOption();
			companyProfilePage.select_ContactDetailsSection_Country_HatcherOption(newEditContactCountryHatcher);
			verify_textboxvalid(CompanyProfilePage.txt_EP_ContactDetailsSection_Country_HatcherOption, newEditContactCountryHatcher);
			
			testStepInfo("HTCHR_EP_SCR_001_TC_051-->"+"Verify the country dropdown cannot be selected using numerical and special characters");
			companyProfilePage.click_ContactDetailsSection_Country_HatcherOption();
			companyProfilePage.select_ContactDetailsSection_Country_HatcherOption(newEditContactCountrySplChars);
			verify_textboxvalid(CompanyProfilePage.txt_EP_ContactDetailsSection_Country_HatcherOption, newEditContactCountrySplChars);
			
			
			testStepInfo("HTCHR_EP_SCR_001_TC_052-->"+"Verify the country dropdown can be selected with only one value");
			companyProfilePage.click_ContactDetailsSection_Country_HatcherOption();
			companyProfilePage.select_ContactDetailsSection_Country_HatcherOption(newEditContactCountryHatcher);
			companyProfilePage.select_ContactDetailsSection_Country_HatcherOption(newEditContactCountryHatcher);
			//chk
			
			testStepInfo("HTCHR_EP_SCR_001_TC_053-->"+"Verify the latitude field accepts alphanumeric, special characters");
			companyProfilePage.click_ContactDetailsSection_Latitude_HatcherOption();
			companyProfilePage.enter_ContactDetailsSection_Latitude_HatcherOption_Textbox(newEditContactLatitudeSpecial10Characters);
			verify_textboxvalid(CompanyProfilePage.txt_EP_ContactDetailsSection_Latitude_HatcherOption, newEditContactLatitudeSpecial10Characters);
			
			//HTCHR_EP_SCR_001_TC_054 to 58 -Not Automatable(Except 56)
			testStepInfo("HTCHR_EP_SCR_001_TC_056-->"+"Verify the longitude field accepts alphanumeric, special characters");
			companyProfilePage.click_ContactDetailsSection_Longitude_HatcherOption_RadioButton();
			companyProfilePage.enter_ContactDetailsSection_Longitude_HatcherOption_Textbox(newEditContactLongitudeSpecial10Characters);
			
			testStepInfo("HTCHR_EP_SCR_001_TC_059-->"+"Verify company email accepts alpanumeric, special characters.");
			companyProfilePage.click_ContactDetailsSection_CompanyEmail_HatcherOption_RadioButton();
			companyProfilePage.enter_ContactDetailsSection_CompanyEmail_HatcherOption_Textbox(newEditContactEmailSpecial10Characters);
			verify_textboxvalid(CompanyProfilePage.txt_EditProfilePage_ContactDetailsSection_CompanyEmail_HatcherOption, newEditContactEmailSpecial10Characters);
			
			testStepInfo("HTCHR_EP_SCR_001_TC_060-->"+"Verify company email has an irrelevant data");
			companyProfilePage.click_ContactDetailsSection_CompanyEmail_HatcherOption_RadioButton();
			companyProfilePage.enter_ContactDetailsSection_CompanyEmail_HatcherOption_Textbox(newEditContactCompanyEmailHatcher);
			verify_textboxvalid(CompanyProfilePage.txt_EditProfilePage_ContactDetailsSection_CompanyEmail_HatcherOption, newEditContactCompanyEmailHatcher);
			
			testStepInfo("HTCHR_EP_SCR_001_TC_061-->"+"Verify phone number accepts only  numerical");
			companyProfilePage.select_ContactDetailsSection_Phone_HatcherOption();
			companyProfilePage.enter_ContactDetailsSection_Phone(newContactPhoneNumber);
			verify_textboxvalid(CompanyProfilePage.txt_CompanyProfilePage_EditProfilePage_ContactDetailsSection_Phone_HatcherOption_Textbox, newContactPhoneNumber);
			
			//script 62 and 63	-To do
			
			
			//HTCHR_EP_SCR_001_TC_063 to 68 - Not Automatable
			//HTCHR_EP_SCR_001_TC_069-->
			//not Automatable
			
			//69 to 71
			
			//72,73,74-Not Automatable
			//digital foot print section
			testStepInfo("HTCHR_EP_SCR_001_TC_075-->"+"Verify the digital footprint- Facebook accepts alphanumeric and special characters.");
			companyProfilePage.select_DigitalFootPrintSection_Crunchbase_HatcherOption_RadioButton();
			companyProfilePage.enter_DigitalFootPrintSection_Crunchbase_HatcherOption_Textbox(newEditDigitalFootPrintCrunchbaseSpecial128Characters);
			verify_textboxvalid(CompanyProfilePage.txt_EP_DigitalFootPrintSection_Crunchbase_HatcherOption, newEditContactCitySpecialCharacters128Characters);
			
			//76,77,78-Not Automatable
			testStepInfo("HTCHR_EP_SCR_001_TC_079-->"+"Verify the digital footprint- Instagram accepts alphanumeric and special characters.");
			companyProfilePage.select_DigitalFootPrintSection_Instagram_HatcherOption_RadioButton();
			companyProfilePage.enter_DigitalFootPrintSection_Instagram_HatcherOption_Textbox(newEditDigitalFootPrintInstagramSpecial128Characters);
			verify_textboxvalid(CompanyProfilePage.txt_EP_DigitalFootPrintSection_Instagram_HatcherOption, newEditContactCitySpecialCharacters128Characters);
			
			//80,81,82-Not Automatable
			
			testStepInfo("HTCHR_EP_SCR_001_TC_083-->"+"Verify the digital footprint- Angellist accepts alphanumeric and special characters.");
			companyProfilePage.select_DigitalFootPrintSection_Angellist_HatcherOption_RadioButton();
			companyProfilePage.enter_DigitalFootPrintSection_Angellist_HatcherOption_Textbox(newEditDigitalFootPrintAngellistSpecial128Characters);
			verify_textboxvalid(CompanyProfilePage.txt_EP_DigitalFootPrintSection_Angellist_HatcherOption, newEditDigitalFootPrintAngellistSpecial128Characters);
			
			//84,85,86-Not Automatable
			
			testStepInfo("HTCHR_EP_SCR_001_TC_087-->"+"Verify the digital footprint- medium accepts alphanumeric and special characters.");
			companyProfilePage.select_DigitalFootPrintSection_Medium_HatcherOption_RadioButton();
			companyProfilePage.enter_DigitalFootPrintSection_Medium_HatcherOption_Textbox(newEditDigitalFootPrintMediumSpecial128Characters);
			verify_textboxvalid(CompanyProfilePage.txt_EP_DigitalFootPrintSection_Medium_HatcherOption, newEditDigitalFootPrintLinkedInSpecial128Characters);
			
			//88,89,90-Not Automatable
			
			testStepInfo("HTCHR_EP_SCR_001_TC_091-->"+"Verify the digital footprint- linkedin accepts alphanumeric and special characters.");
			companyProfilePage.select_DigitalFootPrintSection_LinkedIn_HatcherOption_RadioButton();
			companyProfilePage.enter_DigitalFootPrintSection_LinkedIn_HatcherOption_Textbox(newEditDigitalFootPrintLinkedInSpecial128Characters);
			verify_textboxvalid(CompanyProfilePage.txt_EP_DigitalFootPrintSection_LinkedIn_HatcherOption, newEditDigitalFootPrintLinkedInSpecial128Characters);
			//92,93,94-Not Automatable
			
			testStepInfo("HTCHR_EP_SCR_001_TC_095-->"+"Verify the digital footprint- Pinterest accepts alphanumeric and special characters.");
			companyProfilePage.select_DigitalFootPrintSection_Pinterest_HatcherOption();
			companyProfilePage.enter_DigitalFootPrintSection_PinterestHatcherOption_Textbox(newEditDigitalFootPrintPinterestSpecial128Characters);
			verify_textboxvalid(CompanyProfilePage.txt_EditProfilePage_DigitalFootPrintSection_Pinterest_HatcherOption, newEditDigitalFootPrintPinterestSpecial128Characters);
			
			//96-Not Automatable -Fail
			//97,98-Deferred.
			
			testStepInfo("HTCHR_EP_SCR_001_TC_099-->"+"Verify the digital footprint- Rssfeed accepts alphanumeric and special characters.");
			companyProfilePage.select_DigitalFootPrintSection_Rssfeed_HatcherOption();
			companyProfilePage.enter_DigitalFootPrintSection_RSSFeed_HatcherOption_Textbox(newEditDigitalFootPrintRSSFeedSpecial128Characters);
			verify_textboxvalid(CompanyProfilePage.txt_EditProfilePage_DigitalFootPrintSection_RSSFeed_HatcherOption, newEditDigitalFootPrintRSSFeedSpecial128Characters);
			
			testStepInfo("HTCHR_EP_SCR_001_TC_103-->"+"Verify the digital footprint- Twitter accepts alphanumeric and special characters.");
			companyProfilePage.select_DigitalFootPrintSection_Twitter_HatcherOption();
			companyProfilePage.enter_DigitalFootPrintSection_Twitter_HatcherOption_Texbox(newEditDigitalFootPrintTwitterSpecial128Characters);
			verify_textboxvalid(CompanyProfilePage.txt_EP_DigitalFootPrintSection_Twitter_HatcherOption, newEditDigitalFootPrintTwitterSpecial128Characters);
			
			testStepInfo("HTCHR_EP_SCR_001_TC_107-->"+"Verify the digital footprint- Vimeo accepts alphanumeric and special characters");
			companyProfilePage.click_DigitalFootPrintSection_Vimeo_HatcherOption_RadioButton();
			companyProfilePage.enter_DigitalFootPrintSection_Vimeo_HatcherOption_Textbox(newEditDigitalFootPrintVimeoSpecial128Characters);
			verify_textboxvalid(CompanyProfilePage.txt_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_Vimeo_HatcherOption_Textbox, newEditDigitalFootPrintVimeoSpecial128Characters);
			
			testStepInfo("HTCHR_EP_SCR_001_TC_111-->"+"Verify the digital footprint- Website accepts alphanumeric and special characters");
			companyProfilePage.click_DigitalFootPrintSection_Website_HatcherOption_RadioButton();
			companyProfilePage.enter_DigitalFootPrintSection_Website_HatcherOption_Textbox(newEditDigitalFootPrintWebsiteSpecial128Characters);
			verify_textboxvalid(CompanyProfilePage.txt_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_Website_HatcherOption_Textbox, newEditDigitalFootPrintWebsiteSpecial128Characters);
			
			testStepInfo("HTCHR_EP_SCR_001_TC_115-->"+"Verify the digital footprint- Youtube accepts alphanumeric and special characters");
			companyProfilePage.click_DigitalFootPrintSection_YouTube_Hatcher_RadioButton();
			companyProfilePage.enter_DigitalFootPrintSection_YouTube(newEditDigitalFootPrintYouTubeSpecial128Characters);
			verify_textboxvalid(CompanyProfilePage.txt_CompanyProfilePage_EditProfilePage_DigitalFootPrintSection_YouTube_HatcherOption_Textbox, newEditDigitalFootPrintYouTubeSpecial128Characters);
			
			testStepInfo("HTCHR_EP_SCR_001_TC_119-->"+"Verify the digital footprint has been saved successfully");
			companyProfilePage.click_DigitalFootPrintSection_Save_Changes_Button();
			
			testStepInfo("HTCHR_EP_SCR_001_TC_120-->"+"Verify the Finance & legal- Auditor accepts alphanumeric and special characters");
			companyProfilePage.click_FinanceandLegalSection_Auditor_Hatcher_RadioButton();
			companyProfilePage.enter_FinanceandLegalSection_Auditor_HatcherOption_Textbox(newEdiFinanceandLegalSectionAuditorSpecial256Characters);
			verify_textboxvalid(CompanyProfilePage.txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_Auditor_HatcherOption_Textbox, newEdiFinanceandLegalSectionAuditorSpecial256Characters);
			
			testStepInfo("HTCHR_EP_SCR_001_TC_124-->"+"Verify the Finance & legal- Bank accepts alphanumeric and special characters");
			companyProfilePage.click_FinanceandLegalSection_Bank_HatcherOption_RadioButton();
			companyProfilePage.enter_FinanceandLegalSection_Bank_HatcherOption_Textbox(newEdiFinanceandLegalSectionBankSpecial256Characters);
			verify_textboxvalid(CompanyProfilePage.txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_Bank_HatcherOption_Textbox, newEdiFinanceandLegalSectionBankSpecial256Characters);
			
			testStepInfo("HTCHR_EP_SCR_001_TC_128-->"+"Verify the Finance & legal- Bank ABA Number accepts alphanumeric and special characters");
			companyProfilePage.click_FinanceandLegalSection_BankABANumber_HatcherOption_RadioButton();
			companyProfilePage.enter_FinanceandLegalSection_BankABANumber_HatcherOption_Textbox(newEdiFinanceandLegalSectionBankABANumberSpecial100Characters);
			verify_textboxvalid(CompanyProfilePage.txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankABANumber_HatcherOption_Textbox, newEdiFinanceandLegalSectionBankABANumberSpecial100Characters);
			
			testStepInfo("HTCHR_EP_SCR_001_TC_132-->"+"Verify the Finance & legal- Bank Account Name accepts alphanumeric and special characters");
			companyProfilePage.click_FinanceandLegalSection_BankAccountName_HatcherOption_RadioButton();
			companyProfilePage.enter_FinanceandLegalSection_BankAccountName_HatcherOption_Textbox(newEdiFinanceandLegalSectionBankAccountNameSpecial250Characters);
			verify_textboxvalid(CompanyProfilePage.txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankAccountName_HatcherOption_Textbox, newEdiFinanceandLegalSectionBankAccountNameSpecial250Characters);
			
			testStepInfo("HTCHR_EP_SCR_001_TC_136-->"+"Verify the Finance & legal- Bank Account Number accepts alphanumeric and special characters");
			companyProfilePage.click_FinanceandLegalSection_BankAccountNumber_HatcherOption_RadioButton();
			companyProfilePage.enter_FinanceandLegalSection_BankAccountNumber_HatcherOption_Textbox(newEdiFinanceandLegalSectionBankAccountNumberSpecial100Characters);
			verify_textboxvalid(CompanyProfilePage.txt_CompanyProfilePage_EditProfilePage_FinanceandLegalSection_BankAccountName_HatcherOption_Textbox, newEdiFinanceandLegalSectionBankAccountNameSpecial250Characters);
			
			testStepInfo("HTCHR_EP_SCR_001_TC_140-->"+"Verify the Finance & legal- Bank Address accepts alphanumeric and special characters");
			companyProfilePage.click_FinanceandLegalSection_BankAddress_HatcherOption_RadioButton();
			companyProfilePage.enter_FinanceandLegalSection_BankAddress_HatcherOption_Textbox(newEdiFinanceandLegalSectionIntermediaryBankAddressSpecial500Characters);
			
			testStepInfo("HTCHR_EP_SCR_001_TC_144-->"+"Verify the Finance & legal- Bank Bank Intermediary accepts alphanumeric and special characters");
			companyProfilePage.click_FinanceandLegalSection_BankIntermediary_HatcherOption_RadioButton();
			companyProfilePage.enter_FinanceandLegalSection_BankIntermediary_HatcherOption_Textbox(newEdiFinanceandLegalSectionBankIntermediarySpecial100Characters);
			
			testStepInfo("HTCHR_EP_SCR_001_TC_148-->"+"Verify the Finance & legal- Intermediary Bank ABA Number accepts alphanumeric and special characters");
			companyProfilePage.click_FinanceandLegalSection_IntermediaryBankABANumber_HatcherOption_RadioButton();
			companyProfilePage.enter_FinanceandLegalSection_IntermediaryBankABANumber_HatcherOption_Textbox(newEdiFinanceandLegalSectionIntermediaryBankABANumberSpecial100Characters);
			
			testStepInfo("HTCHR_EP_SCR_001_TC_152-->"+"Verify the Finance & legal- Intermediary Bank Address accepts alphanumeric and special characters");
			companyProfilePage.click_FinanceandLegalSection_IntermediaryBankAddress_HatcherOption_RadioButton();
			companyProfilePage.enter_FinanceandLegalSection_IntermediaryBankAddress_HatcherOption_Textbox(newEdiFinanceandLegalSectionIntermediaryBankAddressSpecial500Characters);
			
			testStepInfo("HTCHR_EP_SCR_001_TC_156-->"+"Verify the Finance & legal- Intermediary Bank SWIFT BIC accepts alphanumeric and special characters");
			companyProfilePage.click_FinanceandLegalSection_IntermediaryBankSWIFTBIC_HatcherOption_RadioButton();
			companyProfilePage.enter_FinanceandLegalSection_IntermediaryBankSWIFTBIC_HatcherOption_Textbox(newEdiFinanceandLegalSectionIntermediaryBankSWIFTBICSpecial100Characters);
			
			testStepInfo("HTCHR_EP_SCR_001_TC_160-->"+"Verify the Finance & legal- Bank Swift Code accepts alphanumeric and special characters");
			companyProfilePage.click_FinanceandLegalSection_BankSwiftCode_HatcherOption_RadioButton();
			companyProfilePage.enter_FinanceandLegalSection_BankSwiftCode_HatcherOption_Textbox(newEdiFinanceandLegalSectionBankSwiftCodeSpecial100Characters);
			
			testStepInfo("HTCHR_EP_SCR_001_TC_164-->"+"Verify the Finance & legal- Bank IBAN Code accepts alphanumeric and special characters");
			companyProfilePage.click_FinanceandLegalSection_BankIBANCode_HatcherOption_RadioButton();
			companyProfilePage.enter_FinanceandLegalSection_BankIBANCode_HatcherOption_Textbox(newEdiFinanceandLegalSectionBankIBANCodeSpecial100Characters);
			
			testStepInfo("HTCHR_EP_SCR_001_TC_168-->"+"Verify the Finance & legal- Bank Instructions accepts alphanumeric and special characters");
			companyProfilePage.click_FinanceandLegalSection_BankInstructions_HatcherOption_RadioButton();
			companyProfilePage.enter_FinanceandLegalSection_BankInstructions_HatcherOption_Textbox(newEdiFinanceandLegalSectionBankInstructionsSpecial500Characters);
			
			testStepInfo("HTCHR_EP_SCR_001_TC_172-->"+"Verify the Finance & legal- Company Secretary accepts alphanumeric and special characters");
			companyProfilePage.click_FinanceandLegalSection_CompanySecretary_HatcherOption_RadioButton();
			companyProfilePage.enter_FinanceandLegalSection_CompanySecretary_HatcherOption_Textbox(newEdiFinanceandLegalSectionCompanySecretarySpecial128Characters);
			
			testStepInfo("HTCHR_EP_SCR_001_TC_176-->"+"Verify the user can select any one currency from the available dropdown");
			companyProfilePage.click_FinanceandLegalSection_Currency_HatcherOption_RadioButton();
			companyProfilePage.select_FinanceandLegalSection_Currency_HatcherOption_Dropdown(newEditFinanceLegalCurrencyHatcher);
			
			testStepInfo("HTCHR_EP_SCR_001_TC_177-->"+"Verify the user can select any one month from the financial year end dropdown");
			companyProfilePage.click_FinanceandLegalSection_FinancialYearEnd_HatcherOption_RadioButton();
			companyProfilePage.select_FinanceandLegalSection_FinancialYearEnd_HatcherOption_Dropdown(newEditFinanceLegalFinancialYearEndHatcher);
			
			testStepInfo("HTCHR_EP_SCR_001_TC_178-->"+"Verify the Finance & legal- law firm accepts alphanumeric and special characters");
			companyProfilePage.click_FinanceandLegalSection_LawFirm_HatcherOption_RadioButton();
			companyProfilePage.enter_FinanceandLegalSection_LawFirm_HatcherOption_Textbox(newEdiFinanceandLegalSectionLawFirmSpecial256Characters);
			
			testStepInfo("HTCHR_EP_SCR_001_TC_180-->"+"Verify the Finance & legal- law firm has a character restriction upto 256 characters");
			companyProfilePage.click_FinanceandLegalSection_LawFirm_HatcherOption_RadioButton();
			companyProfilePage.enter_FinanceandLegalSection_LawFirm_HatcherOption_Textbox(newEdiFinanceandLegalSectionLawFirmSpecial256Characters);
			
			testStepInfo("HTCHR_EP_SCR_001_TC_182-->"+"Verify the Finance & legal data can be saved successfully");
			companyProfilePage.click_FinanceandLegalSection_Save_Changes_Button();
			
			
			
			testStepInfo("HTCHR_EP_SCR_001_TC_191-->"+"Verify the Regions can be filtered using alphanumeric and special characters");
			companyProfilePage.click_RegionsSection_Regions_HatcherOption_RadioButton();
			companyProfilePage.select_RegionsSection_Regions_HatcherOption_Textbox(newEditRegionHatcher1);
			companyProfilePage.verify_SelectedRegions_displayed(newEditRegionHatcher1);
			companyProfilePage.verify_InvalidRegions_ErrorMessage_displayed(newEditInvalidRegionsHatcher);
			
			
			testStepInfo("HTCHR_EP_SCR_001_TC_192-->"+"Verify multiple options can be selected on Regions.");
			companyProfilePage.select_RegionsSection_Regions_HatcherOption_Textbox(newEditRegionHatcher1);
			companyProfilePage.verify_SelectedRegions_displayed(newEditRegionHatcher1);
			companyProfilePage.select_RegionsSection_Regions_HatcherOption_Textbox(newEditRegionHatcher2);
			companyProfilePage.verify_SelectedRegions_displayed(newEditRegionHatcher2);
					
			testStepInfo("HTCHR_EP_SCR_001_TC_193-->"+"Verify values can be removed from Regions.");
			companyProfilePage.verify_RemoveRegion_functionality(newEditRegionHatcher2);
						
			testStepInfo("HTCHR_EP_SCR_001_TC_194-->"+"Verify the Regions can be saved successfully.");
			companyProfilePage.verify_Regions_Section_EditCompanyProfile_Updated_Successfully();
			
			
			testStepInfo("HTCHR_EP_SCR_001_TC_195-->"+"Verify the community settings can be updated wih account type as Entrepreneur.");
			companyProfilePage.select_CommunitySettingsSection_AccountType(newAccountTypeEntrepreneur);
			companyProfilePage.verify_CommunitySettings_Section_EditCompanyProfile_Updated_Successfully();
			
			testStepInfo("HTCHR_EP_SCR_001_TC_196-->"+"Verify the community settings dropdown can be updated wih account type as Investor.");
			companyProfilePage.select_CommunitySettingsSection_AccountType(newAccountTypeInvestor);
			companyProfilePage.verify_CommunitySettings_Section_EditCompanyProfile_Updated_Successfully();
			
			testStepInfo("HTCHR_EP_SCR_001_TC_197-->"+"Verify the community settings dropdown can be updated wih account type as Expert.");
			companyProfilePage.select_CommunitySettingsSection_AccountType(newAccountTypeExpert);
			companyProfilePage.verify_CommunitySettings_Section_EditCompanyProfile_Updated_Successfully();
			
			testStepInfo("HTCHR_EP_SCR_001_TC_198-->"+"Verify the community settings can be saved successfully.");
			companyProfilePage.click_CommunitySettingsSection_Save_Changes_Button();
			
			testStepInfo("HTCHR_EP_SCR_001_TC_232-->"+"Verify the back button redirects to the profile page.");
			//No Back btn
			
			
			//TC_199-204-fix
			
			testStepInfo("HTCHR_EP_SCR_001_TC_205,210-->"+"Verify the mandatory fields accepts alphanumeric and special characters");
			companyProfilePage.select_Salutation_Share_AddNewContact_ModalDialogWindow(newShareSalutationSpecial100Characters);
			companyProfilePage.enter_FirstName_Share_AddNewContact_ModalDialogWindow(newShareFirstNameSpecial100Characters);				
			companyProfilePage.enter_LastName_Share_AddNewContact_ModalDialogWindow(newShareLastNameSpecial100Characters);			
			companyProfilePage.enter_Email_Share_AddNewContact_ModalDialogWindow(newShareEmailSpecial100Characters);			
			companyProfilePage.enter_CompanyName_Share_AddNewContact_ModalDialogWindow(newShareLegalNameSpecial100Characters);			
			companyProfilePage.enter_Country_Share_AddNewContact_ModalDialogWindow(newShareCountrySpecial100Characters);			
			companyProfilePage.enter_website_Share_AddNewContact_ModalDialogWindow(newShareWebsiteSpecial128Characters);			
			companyProfilePage.enter_Phone_Share_AddNewContact_ModalDialogWindow(newSharePhoneSpecial128Characters);
			
			testStepInfo("HTCHR_EP_SCR_001_TC_206, 221-->"+"Verify the non mandatory fields accepts alphanumeric and special characters.");
			companyProfilePage.enter_Address_Share_AddNewContact_ModalDialogWindow(newShareAddressSpecial256Characters);
			companyProfilePage.enter_City_Share_AddNewContact_ModalDialogWindow(newShareCitySpecial128Characters);
			companyProfilePage.enter_PostalCode_Share_AddNewContact_ModalDialogWindow(newSharePostalCodeSpecial16Characters);
			companyProfilePage.enter_State_Share_AddNewContact_ModalDialogWindow(newShareStateSpecial128Characters);
			
			testStepInfo("HTCHR_EP_SCR_001_TC_207 , 210->"+"Verify the non mandatory fields as blank and mandatory fields with valid data.");
			companyProfilePage.clear_AllValues_AddNewContact_ModalDialogWindow();
			companyProfilePage.select_Salutation_Share_AddNewContact_ModalDialogWindow(newShareSalutation);
			companyProfilePage.enter_FirstName_Share_AddNewContact_ModalDialogWindow(newShareFirstName);				
			companyProfilePage.enter_LastName_Share_AddNewContact_ModalDialogWindow(newShareLastName);			
			companyProfilePage.enter_Email_Share_AddNewContact_ModalDialogWindow(newShareEmail);			
			companyProfilePage.enter_CompanyName_Share_AddNewContact_ModalDialogWindow(newShareLegalName);	
			companyProfilePage.enter_Address_Share_AddNewContact_ModalDialogWindow(" ");
			companyProfilePage.enter_City_Share_AddNewContact_ModalDialogWindow(" ");
			companyProfilePage.enter_PostalCode_Share_AddNewContact_ModalDialogWindow(" ");
			companyProfilePage.enter_State_Share_AddNewContact_ModalDialogWindow(" ");
			companyProfilePage.enter_Country_Share_AddNewContact_ModalDialogWindow(newShareCountry);
			companyProfilePage.enter_website_Share_AddNewContact_ModalDialogWindow(newShareWebsite);
			
			testStepInfo("HTCHR_EP_SCR_001_TC_209-->"+"Verify the Phone number field accepts only numerical. ");
			companyProfilePage.enter_Phone_Share_AddNewContact_ModalDialogWindow(newSharePhone);
			
			//TC-208 - Not Automatable
			
			//TC-211 to 231-Deferred.
			
			//TC-233, 234 ,235-238 - Not Automatable
			//Click -> 3Dots - >Upload Presentation.
			testStepInfo("HTCHR_EP_SCR_001_TC_239-->"+"Verify the presentation has mandatory check for name field.");
			companyProfilePage.verify_Upload_Presentation_textbox_ModalDialog_displayed();
			//chk
			
			testStepInfo("HTCHR_EP_SCR_001_TC_240-->"+"Veirfy the presentation mandatory field ( Name) accepts alpha numeric and special characters. ");
			companyProfilePage.enter_Upload_Presentation_textbox_ModalDialog(fileNameSpecial100Characters);
						
			
			testStepInfo("HTCHR_EP_SCR_001_TC_242-->"+"Verify the presentation upload labels , place holder text first letter as upper case and with out any misspellings. ");
			//xpath-verification
			
			
			//241-Not Automatable
			//TC-243,244->Deferred.
			
			
			testStepInfo("HTCHR_EP_SCR_001_TC_245-->"+"Verify the presentation mandatory field ( choose files) .");
			//URL path of the file 
			
			//246-Not Automatable
			
			//TC_247,248,250 - are uploading different format files.
			
			//251,252-Obselete
			
			
			testStepInfo("HTCHR_EP_SCR_001_TC_253-->"+"Verify the X  mark closes the presentation upload window.");
			companyProfilePage.verify_Upload_Presentation_Close_Button_ModalDialog_displayed();
			
			
			
			
			
			
			
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