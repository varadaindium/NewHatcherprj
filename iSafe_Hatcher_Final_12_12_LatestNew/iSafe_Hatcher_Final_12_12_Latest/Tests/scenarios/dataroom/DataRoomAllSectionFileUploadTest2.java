package scenarios.dataroom;

import iSAFE.ApplicationKeywords;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import baseClass.BaseClass;

import pages.MainPage;
import pages.LoginPage;
import pages.PopupDialogWindows;
import pages.EmailReaderPage;
import pages.CreatePasswordPage;
import pages.RegistrationCompanyPage;
import pages.RegistrationFounderPage;
import pages.RegistrationInvestmentHistoryPage;
import pages.RegistrationVideoInterviewPage;
import pages.UserProfilePage;
import pages.HomePage;
import pages.CompanyProfilePage;
import pages.SettingsPage;
import pages.ProfileUpdateRegistrationPage;

public class DataRoomAllSectionFileUploadTest2 extends ApplicationKeywords
{
	private Boolean status = false;

	BaseClass obj;

	MainPage mainPage;
	LoginPage loginPage;
	HomePage homePage;
	UserProfilePage userProfilePage;
	SettingsPage settingsPage;
	PopupDialogWindows popupDialogWindows;
	EmailReaderPage emailReaderPage;
	CreatePasswordPage createPasswordPage;
	RegistrationCompanyPage registrationCompanyPage;
	RegistrationFounderPage registrationFounderPage;
	RegistrationInvestmentHistoryPage registrationInvestmentHistoryPage;
	RegistrationVideoInterviewPage registrationVideoInterviewPage;
	CompanyProfilePage companyProfilePage;
	ProfileUpdateRegistrationPage profileUpdateRegistrationPage;


	public DataRoomAllSectionFileUploadTest2(BaseClass obj) 
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
			homePage = new HomePage(obj);
			userProfilePage = new UserProfilePage(obj);
			settingsPage = new SettingsPage(obj);			
			popupDialogWindows = new PopupDialogWindows(obj);
			emailReaderPage = new EmailReaderPage(obj);
			createPasswordPage = new CreatePasswordPage(obj);
			registrationCompanyPage = new RegistrationCompanyPage(obj);
			registrationFounderPage = new RegistrationFounderPage(obj);
			registrationInvestmentHistoryPage = new RegistrationInvestmentHistoryPage(obj);
			registrationVideoInterviewPage = new RegistrationVideoInterviewPage(obj);	
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
			String tempVariable2 = getCurrentDateinYearMonthDateFormat();
			String newCompanyIncorporationDate = tempVariable2;
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


			String tempVariable8= getCurrentDateinYearMonthDateFormat();
			String documentSignedDate = tempVariable8;

			String documentPermissionAnyoneDataroomAccess = retrieve("documentPermissionAnyoneDataroomAccess");
			String documentPermissionStaffMembers = retrieve("documentPermissionStaffMembers");

			String fileLocationData = retrieve("fileLocation");
			String fileLocation = "\\"+fileLocationData+"\\";

			String defaultFolderName = retrieve("defaultFolderName");
			String newCompanyFolderName = retrieve("newCompanyFolderName");
			String newCompanyFolderEditedName = retrieve("newCompanyFolderEditedName");
			String newCompanyEditFileName = retrieve("newCompanyEditFileName");
			String newCompanyEditFileType = retrieve("newCompanyEditFileType");
			String newCompanyEditFileDocumentPermissions = retrieve("newCompanyEditFileDocumentPermissions");
			

			String newDueDiligenceFolderName = retrieve("newDueDiligenceFolderName"); 
			String newDueDiligenceFolderEditedName = retrieve("newDueDiligenceFolderEditedName");
			String newDueDiligenceEditFileName = retrieve("newDueDiligenceEditFileName");
			String newDueDiligenceEditFileType = retrieve("newDueDiligenceEditFileType");
			String newDueDiligenceEditFileDocumentPermissions = retrieve("newDueDiligenceEditFileDocumentPermissions");



			String file1 = retrieve("file1");
			String fileName1 = retrieve("fileName1");
			String fileType1 = retrieve("fileType1");
			String filePath1 = get_working_Directory_Path()+fileLocation+file1;

			String file2 = retrieve("file2");
			String fileName2 = retrieve("fileName2");
			String fileType2 = retrieve("fileType2");
			String filePath2 = get_working_Directory_Path()+fileLocation+file2;


			String file3 = retrieve("file3");
			String fileName3 = retrieve("fileName3");
			String fileType3 = retrieve("fileType3");
			String filePath3 = get_working_Directory_Path()+fileLocation+file3;


			String file4 = retrieve("file4");
			String fileName4 = retrieve("fileName4");
			String fileType4 = retrieve("fileType4");
			String filePath4 = get_working_Directory_Path()+fileLocation+file4;


			String file5 = retrieve("file5");
			String fileName5 = retrieve("fileName5");
			String fileType5 = retrieve("fileType5");
			String filePath5 = get_working_Directory_Path()+fileLocation+file5;


			String file6 = retrieve("file6");
			String fileName6 = retrieve("fileName6");
			String fileType6 = retrieve("fileType6");
			String filePath6 = get_working_Directory_Path()+fileLocation+file6;


			String file7 = retrieve("file7");
			String fileName7 = retrieve("fileName7");
			String fileType7 = retrieve("fileType7");
			String filePath7 = get_working_Directory_Path()+fileLocation+file7;


			String file8 = retrieve("file8");
			String fileName8 = retrieve("fileName8");
			String fileType8 = retrieve("fileType8");
			String filePath8 = get_working_Directory_Path()+fileLocation+file8;


			String file9 = retrieve("file9");
			String fileName9 = retrieve("fileName9");
			String fileType9 = retrieve("fileType9");
			String filePath9 = get_working_Directory_Path()+fileLocation+file9;


			testStepPassed("");
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
			testStepPassed("New Founder Bio : "+newFounderBio);
			testStepPassed("New Founder Highest Education : "+newFounderHighestEducation);
			testStepPassed("New Founder Proffesional Qualifications : "+newFounderProffesionalQualifications);

			testStepPassed("");
			testStepPassed("New Investment Capital Amount : "+newInvestmentCapitalAmount);
			testStepPassed("New Investment Current Investment Round : "+newInvestmentCurrentInvestmentRound);
			testStepPassed("New Investment Capital Exchange Percentage : "+newInvestmentCapitalExchangePercentage);
			testStepPassed("New Investment Funding Rounds : "+newInvestmentFundingRounds);


			testStepPassed("");
			testStepPassed("File 1 : "+file1);
			testStepPassed("File Name 1 : "+fileName1);
			testStepPassed("File Type 1 : "+fileType1);
			testStepPassed("Document Permission 1 : "+documentPermissionAnyoneDataroomAccess);
			testStepPassed("File Path 1 : "+filePath1);			

			testStepPassed("");
			testStepPassed("File 2 : "+file2);
			testStepPassed("File Name 2 : "+fileName2);
			testStepPassed("File Type 2 : "+fileType2);
			testStepPassed("Document Permission 2 : "+documentPermissionStaffMembers);
			testStepPassed("File Path 2 : "+filePath2);			

			testStepPassed("");
			testStepPassed("File 3 : "+file3);
			testStepPassed("File Name 3 : "+fileName3);
			testStepPassed("File Type 3 : "+fileType3);
			testStepPassed("Document Permission 3 : "+documentPermissionAnyoneDataroomAccess);
			testStepPassed("File Path 3 : "+filePath3);			

			testStepPassed("");
			testStepPassed("File 4 : "+file4);
			testStepPassed("File Name 4 : "+fileName4);
			testStepPassed("File Type 4 : "+fileType4);
			testStepPassed("Document Permission 4 : "+documentPermissionStaffMembers);
			testStepPassed("File Path 4 : "+filePath4);			

			testStepPassed("");
			testStepPassed("File 5 : "+file5);
			testStepPassed("File Name 5 : "+fileName5);
			testStepPassed("File Type 5 : "+fileType5);
			testStepPassed("Document Permission 5 : "+documentPermissionAnyoneDataroomAccess);
			testStepPassed("File Path 5 : "+filePath5);			

			testStepPassed("");
			testStepPassed("File 6 : "+file6);
			testStepPassed("File Name 6 : "+fileName6);
			testStepPassed("File Type 6 : "+fileType6);
			testStepPassed("Document Permission 6 : "+documentPermissionStaffMembers);
			testStepPassed("File Path 6 : "+filePath6);			

			testStepPassed("");
			testStepPassed("File 7 : "+file7);
			testStepPassed("File Name 7 : "+fileName7);
			testStepPassed("File Type 7 : "+fileType7);
			testStepPassed("Document Permission 7 : "+documentPermissionAnyoneDataroomAccess);
			testStepPassed("File Path 7 : "+filePath7);			

			testStepPassed("");
			testStepPassed("File 8 : "+file8);
			testStepPassed("File Name 8 : "+fileName8);
			testStepPassed("File Type 8 : "+fileType8);
			testStepPassed("Document Permission 8 : "+documentPermissionStaffMembers);
			testStepPassed("File Path 8 : "+filePath8);			

			testStepPassed("");
			testStepPassed("File 9 : "+file9);
			testStepPassed("File Name 9 : "+fileName9);
			testStepPassed("File Type 9 : "+fileType9);
			testStepPassed("Document Permission 9 : "+documentPermissionAnyoneDataroomAccess);
			testStepPassed("File Path 9 : "+filePath9);

			testStepPassed("");
			testStepPassed("Default Folder Name : "+defaultFolderName);
			testStepPassed("New Company Folder Name : "+newCompanyFolderName);
			testStepPassed("New Company Folder Edited Name : "+newCompanyFolderEditedName);
			testStepPassed("New Company Edited File Name : "+newCompanyEditFileName);
			testStepPassed("New Company Edited File Type : "+newCompanyEditFileType);
			testStepPassed("New Company Edited File Document Permissions : "+newCompanyEditFileDocumentPermissions);
				
			testStepPassed("New Due Diligence Folder Name : "+newDueDiligenceFolderName);
			testStepPassed("New Due Diligence Folder Edited Name : "+newDueDiligenceFolderEditedName);
			testStepPassed("New Due Diligence Edited File Name : "+newDueDiligenceEditFileName);
			testStepPassed("New Due Diligence Edited File Type : "+newDueDiligenceEditFileType);
			testStepPassed("New Due Diligence Edited File Document Permissions : "+newDueDiligenceEditFileDocumentPermissions);
			
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



			/***********************Adding New Organization to the App*******************************/

			click_AddDeal_Actions_Menu();

			registrationCompanyPage.verify_Registration_Company_displayed();

			registrationCompanyPage.fillCompanyInformation(newCompanyLegalName, newCompanyWebsite, newCompanyCity, newCompanyCountry, newCompanyDescription, newCompanyIncorporationDate, newCompanyBusinessStatus, newCompanyIndustries, newCompanyUNSDGs);

			registrationCompanyPage.click_Next_CompanyInformation();

			registrationFounderPage.verify_Registration_Founder_displayed();

			registrationFounderPage.fillFounderCompanyRegistrationWithSendInvitationCheckbox(newFounderSalutation, newFounderFirstName, newFounderLastName, newFounderJobTitle, newFounderMobileNumber, newFounderEmailAddress, newFounderBio, newFounderHighestEducation, newFounderProffesionalQualifications);

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

			/***********************Adding New Organization to the App*******************************/




			/***********************All section of Data Room Tab Validation*******************************/

			companyProfilePage.click_DataRoomTab_Link();

			companyProfilePage.verify_DataRoomTab_CompanyProfilePage_displayed();

			companyProfilePage.verify_DataRoomSection_CompanyProfilePage_displayed();

			refreshPage();
			

			testStepPassed("");
			
			
			List<WebElement> tab = driver.findElements(By.xpath("//div[contains(@id,'data_room-panel')]//div[contains(@class,'form-group text')]/following-sibling::div//div[contains(@class,'room')]//*[contains(@class,'header')]"));
			
			int tabCount = tab.size();
			
			for (int i = 1; i <= tabCount; i++) 
			{
				String tabName = driver.findElement(By.xpath("(//div[contains(@id,'data_room-panel')]//div[contains(@class,'form-group text')]/following-sibling::div//div[contains(@class,'room')]//*[contains(@class,'header')])["+i+"]")).getText();
				
				testStepPassed("Tab Name : "+tabName);
				
				if (driver.findElement(By.xpath("(//div[contains(@id,'data_room-panel')]//div[contains(@class,'form-group text')]/following-sibling::div//div[contains(@class,'room')]//div[contains(@class,'shadow')]//div[contains(@class,'midnav')]//a[contains(text(),'Default Folder')])["+i+"]")).isDisplayed()) 
				{
					testStepPassed("Default Folder is displayed for the section : "+tabName);
					
					if (driver.findElement(By.xpath("(//div[contains(@id,'data_room-panel')]//div[contains(@class,'form-group text')]/following-sibling::div//div[contains(@class,'room') and not (contains(@class,'dataroom'))])["+i+"]//div[contains(@class,'management-options')]//span[contains(text(),'Upload')]")).isDisplayed()) 
					{
						testStepPassed("Upload Button is displayed for the section : "+tabName);
					} 
					else 
					{
						testStepFailed("Upload Button is not displayed for the section : "+tabName);
					}
				} 
				else 
				{
					testStepFailed("Default Folder is not displayed for the section : "+tabName);
				}
			}
			
			
			
			for (int i = 3; i <= tabCount; i++) 
			{
				int j= i-1;
				
				String tabName = driver.findElement(By.xpath("(//div[contains(@id,'data_room-panel')]//div[contains(@class,'form-group text')]/following-sibling::div//div[contains(@class,'room')]//*[contains(@class,'header')])["+i+"]")).getText();
				
				testStepPassed("Tab Name : "+tabName);
				
				if (driver.findElement(By.xpath("(//div[contains(@id,'data_room-panel')]//div[contains(@class,'form-group text')]/following-sibling::div//div[contains(@class,'room')]//div[contains(@class,'shadow')]//div[contains(@class,'midnav')]//a[contains(text(),'Default Folder')])["+i+"]")).isDisplayed()) 
				{
					testStepPassed("Default Folder is displayed for the section : "+tabName);
					
					WebElement element3 = driver.findElement(By.xpath("(//div[contains(@id,'data_room-panel')]//div[contains(@class,'form-group text')]/following-sibling::div//div[contains(@class,'room') and not (contains(@class,'dataroom'))])["+i+"]//div[contains(@class,'content-list')]"));
					
					scrolltoElementView(element3);
					
					driver.findElement(By.xpath("(//div[contains(@id,'data_room-panel')]//div[contains(@class,'form-group text')]/following-sibling::div//div[contains(@class,'room') and not (contains(@class,'dataroom'))])["+i+"]//div[contains(@class,'management-options')]//span[contains(text(),'Upload')]")).click();
					
					popupDialogWindows.verify_Dataroom_UploadFile_ModalDialog_Window_displayed();

					popupDialogWindows.verify_Dataroom_UploadFile_ModalDialog_Window_Heading_displayed();

					popupDialogWindows.verify_Dataroom_UploadFileTabs_ModalDialog_Window_displayed();

					popupDialogWindows.close_UploadFile_DataRoom_Window();
				} 
				else 
				{
					testStepFailed("Default Folder is not displayed for the section : "+tabName);
				}
			}
			


			companyProfilePage.deleteCompanyProfile();
			
			verify_delete_action_completed_successfully();
			
			logoutFromApplication();
			
			mainPage.verify_MainPage_displayed();

			/***********************All section of Data Room Tab Validation*******************************/


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
			if(this.testFailure||this.obj.testFailure||mainPage.testFailure||loginPage.testFailure||homePage.testFailure||userProfilePage.testFailure||settingsPage.testFailure||popupDialogWindows.testFailure||emailReaderPage.testFailure||createPasswordPage.testFailure||registrationCompanyPage.testFailure||registrationFounderPage.testFailure||registrationInvestmentHistoryPage.testFailure||registrationVideoInterviewPage.testFailure||companyProfilePage.testFailure||profileUpdateRegistrationPage.testFailure)
			{
				this.testFailure = true;
			}
		}
	}
}