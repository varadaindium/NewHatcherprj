package scenarios.dataroom;

import iSAFE.ApplicationKeywords;
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



public class DataRoomCommunityMemberTest extends ApplicationKeywords
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
	
	public DataRoomCommunityMemberTest(BaseClass obj) 
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
			
			String pageOption = retrieve("pageOption");

			String emailServer = retrieve("emailServer");
			String emailId = retrieve("emailId");
			String emailPassword = retrieve("emailPassword");
			String emailSubject = retrieve("emailSubject");
			
			String adminStaffSalutation = retrieve("adminStaffSalutation");
			String adminStaffFirstNameData = retrieve("adminStaffFirstName");
			String tempVariable1 = generateRandomString();
			String adminStaffFirstName = adminStaffFirstNameData+tempVariable1;
			String adminStaffLastNameData = retrieve("adminStaffLastName");
			String tempVariable2 = generateRandomString();
			String adminStaffLastName = adminStaffLastNameData+tempVariable2;
			String adminStaffEmail = retrieve("adminStaffEmail");
			String adminStaffJobTitle = retrieve("adminStaffJobTitle");
			String adminStaffPhone = retrieve("adminStaffPhone");
			String adminStaffSystemAccess = retrieve("adminStaffSystemAccess");
			String adminStaffInvestmentCommitteeMember = retrieve("adminStaffInvestmentCommitteeMember");
			String adminStaffMentor = retrieve("adminStaffMentor");
			
			String newAdminStaffPassword = retrieve("newAdminStaffPassword");
			String newAdminStaffConfirmPassword = retrieve("newAdminStaffConfirmPassword");

			String tempVariable3 = generateRandomString();
			String newCompanyLegalNameData = retrieve("newCompanyLegalName");
			String newCompanyLegalName = newCompanyLegalNameData+tempVariable3;
			String newCompanyWebsite = retrieve("newCompanyWebsite");
			String newCompanyCity = retrieve("newCompanyCity");
			String newCompanyCountry = retrieve("newCompanyCountry");
			String newCompanyDescription = retrieve("newCompanyDescription");
			String tempVariable4 = getCurrentDateinYearMonthDateFormat();
			String newCompanyIncorporationDate = tempVariable4;
			String newCompanyBusinessStatus = retrieve("newCompanyBusinessStatus");
			String newCompanyIndustries = retrieve("newCompanyIndustries");
			String newCompanyUNSDGs = retrieve("newCompanyUNSDGs");

			String newFounderSalutation = retrieve("newFounderSalutation");
			String tempVariabl5 = generateRandomString();
			String newFounderFirstNameData = retrieve("newFounderFirstName");
			String newFounderFirstName = newFounderFirstNameData+tempVariabl5;
			String tempVariable6 = generateRandomString();
			String newFounderLastNameData = retrieve("newFounderLastName");
			String newFounderLastName = newFounderLastNameData+tempVariable6;
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
						
			String searchProfile = adminStaffFirstNameData;
			String adminStaffProfileNameFull = adminStaffFirstName+" "+adminStaffLastName;
			String adminStaffProfileNameFull2 = adminStaffLastName+" "+adminStaffFirstName;
		
			String tempVariable9= getCurrentDateinYearMonthDateFormat();
			String documentSignedDate = tempVariable9;

			String file = retrieve("file");
			String fileName = retrieve("fileName");
			String fileType = retrieve("fileType");
			String fileLocationData = retrieve("fileLocation");
			String documentPermission = retrieve("documentPermission");
			String fileLocation = "\\"+fileLocationData+"\\";
			String filePath = get_working_Directory_Path()+fileLocation+file;			
			
			testStepPassed("");
			testStepPassed("Admin Mail Id : "+adminEmailId);
			testStepPassed("Admin Password : "+adminPassword);
			
			testStepPassed("");
			testStepPassed("Admin Staff Salutation : "+adminStaffSalutation);
			testStepPassed("Admin Staff First Name : "+adminStaffFirstName);
			testStepPassed("Admin Staff Last Name : "+adminStaffLastName);
			testStepPassed("Admin Staff Email : "+adminStaffEmail);
			testStepPassed("Admin Staff Job Title : "+adminStaffJobTitle);
			testStepPassed("Admin Staff Phone : "+adminStaffPhone);
			testStepPassed("Admin Staff System Access : "+adminStaffSystemAccess);
			testStepPassed("Admin Staff Investment Committee Member : "+adminStaffInvestmentCommitteeMember);
			testStepPassed("Admin Staff Mentor : "+adminStaffMentor);

			testStepPassed("");
			testStepPassed("Page Option : "+pageOption);
			
			testStepPassed("");
			testStepPassed("Email Server : "+emailServer);
			testStepPassed("Email Id : "+emailId);
			testStepPassed("Email Password : "+emailPassword);
			testStepPassed("Email Subject : "+emailSubject);

			testStepPassed("");
			testStepPassed("Admin Staff Password : "+adminStaffProfileNameFull);
			testStepPassed("Admin Staff Confirm Password : "+adminStaffProfileNameFull2);

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
			testStepPassed("Admin Staff Profile Name Full : "+adminStaffProfileNameFull);
			testStepPassed("Admin Staff Profile Name Full 2 : "+adminStaffProfileNameFull2);
			
			
			testStepPassed("");
			testStepPassed("File Name : "+fileName);
			testStepPassed("File Type : "+fileType);
			testStepPassed("File Path : "+filePath);	
			
			testStepPassed("");
			testStepPassed("File : "+file);
			testStepPassed("File Name : "+fileName);
			testStepPassed("File Type : "+fileType);
			testStepPassed("Document Permission : "+documentPermission);
			testStepPassed("File Path : "+filePath);	

			
			testStepInfo("");
			testStepInfo("************************************");
			testStepInfo("Execution Steps Started");
			testStepInfo("************************************");
			testStepInfo("");

			clearCookies();

			openApplicationMainPageByHittingURL();

			mainPage.verify_MainPage_displayed();
			
			
			
			/**********Checking Mail Id all registered in App and if exists deleting the profile with that Mail Id**********/
			
			testStepPassed("");
			testStepPassed("Checking Mail Id already registered in App and if exists deleting the profile with that Mail Id");
			testStepPassed("***************************************************************************************************");


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
			
			settingsPage.verify_Users_DisplayedinApplication_DeleteUser(adminStaffEmail);
			
			settingsPage.click_SettingsPage_UserPage_StaffTab();
			
			settingsPage.verify_SettingsPage_UserPage_StaffTab_Section_displayed();
			
			settingsPage.verify_Staff_DisplayedinApplication_DeleteStaff(adminStaffEmail);
			
			/**********Checking Mail Id all registered in App and if exists deleting the profile with that Mail Id**********/
			
			
			
			
			/**********Adding New Staff Member to the App with Executive Role**********/
			
			testStepPassed("");
			testStepPassed("Adding New Staff Member to the App with Executive Role");
			testStepPassed("************************************************************");

			
			settingsPage.click_SettingsPage_UserPage_StaffTab();
			
			settingsPage.verify_SettingsPage_UserPage_StaffTab_Section_displayed();
			
			settingsPage.Add_Team_Member_StaffTab();
			
			popupDialogWindows.AddTeamMember_AddAdminStaff_Window_SettingsPage(adminStaffSalutation, adminStaffFirstName, adminStaffLastName, adminStaffEmail, adminStaffJobTitle, adminStaffPhone, adminStaffSystemAccess, adminStaffInvestmentCommitteeMember, adminStaffMentor);
			
			popupDialogWindows.verify_AddTeamMember_SuccessMessage_displayed_AddAdminStaff_Window_SettingsPage();
			
			settingsPage.verify_SettingsPage_UserPage_StaffTab_Section_displayed();
			
			settingsPage.verify_StaffAdded_displayed_StaffTable_StaffTab_Section_SettingsPage(adminStaffEmail);
			
			logoutFromApplication();
			
			mainPage.verify_MainPage_displayed();

			String addNewContactActivateUrl = emailReaderPage.getNewContactActivateURL(emailServer, emailId, emailPassword, emailSubject);

			driver.get(addNewContactActivateUrl);

			createPasswordPage.verify_CreatePassword_Page_displayed();

			createPasswordPage.fillPasswordForm(newAdminStaffPassword, newAdminStaffConfirmPassword);

			createPasswordPage.click_CreatePassword_CreatePasswordPage();
			
			userProfilePage.verify_UserProfilePage_OppurtunitiesTab_displayed();

			userProfilePage.verify_CorrespondingUserProfilePage_displayed_by_ProfileName(adminStaffProfileNameFull);

			logoutFromApplication();
			
			mainPage.verify_MainPage_displayed();

			/**********Adding New Staff Member to the App with Executive Role**********/

			
			
			
			mainPage.click_login_button();

			loginPage.verify_LoginPage_displayed();

			loginPage.loginIntoApplication(adminEmailId, adminPassword);

			userProfilePage.verify_UserProfilePage_OppurtunitiesTab_displayed();
			
			
			
			/***********************Adding New Organization to the App*******************************/
			
			testStepPassed("");
			testStepPassed("Adding New Organization to the App");
			testStepPassed("*******************************************");


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
			

			
			
			/***********************Upload Document in Data Room Company Profile Section*******************************/

			testStepPassed("");
			testStepPassed("Upload Document in Data Room Company Profile Section");
			testStepPassed("***********************************************************");


			companyProfilePage.click_DataRoomTab_Link();
			
			companyProfilePage.verify_DataRoomTab_CompanyProfilePage_displayed();
			
			companyProfilePage.verify_DataRoomSection_CompanyProfilePage_displayed();
			
					
			refreshPage();
			
			companyProfilePage.click_DataRoomPage_CompanyProfileSection_AddDocument_Button();
			
			popupDialogWindows.verify_Dataroom_UploadFile_ModalDialog_Window_displayed();
			
			popupDialogWindows.verify_Dataroom_UploadFile_ModalDialog_Window_Heading_displayed();
			
					
			popupDialogWindows.click_UploadFile_DataRoom_Window_AddDocumentTab_Link();
			
			popupDialogWindows.fill_AddDocumentTab_UploadFile_Window(fileName, fileType, documentPermission, documentSignedDate, filePath);
			
			testStepPassed("File Uploaded : "+file);
			
			popupDialogWindows.click_UploadFile_DataRoom_Window_UploadButton();
			
			companyProfilePage.verify_DataRoomTab_CompanyProfilePage_displayed();
			
			logoutFromApplication();
			
			mainPage.verify_MainPage_displayed();
			
			/***********************Upload Document in Data Room Company Profile Section*******************************/
			
	
			
			
			/***********************Verify Data Room is displayed for new Investor user*******************************/

			testStepPassed("");
			testStepPassed("Verify Data Room with File is displayed for Newly Registered Staff Member without Sharing Company DataRoom");
			testStepPassed("**************************************************************************************************************************************");


			mainPage.click_login_button();

			loginPage.verify_LoginPage_displayed();

			loginPage.loginIntoApplication(adminStaffEmail, newAdminStaffPassword);
			
			userProfilePage.verify_UserProfilePage_OppurtunitiesTab_displayed();
			
			userProfilePage.verify_CorrespondingUserProfilePage_displayed_by_ProfileName(adminStaffProfileNameFull);

			search_ValuesinSearchBar(newCompanyLegalName);

			verify_Searched_Company_displayed_and_Open_CompanyProfilePage(newCompanyLegalName);

			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_ProfileTab_CompanyProfilePage_displayed();

			companyProfilePage.verify_CorrespondingCompanyProfilePage_displayed_by_CompanyName(newCompanyLegalName);

			companyProfilePage.verify_CompanyProfile_DataRoomTab_displayed();
			
			companyProfilePage.click_DataRoomTab_Link();
			
			companyProfilePage.verify_DataRoomTab_CompanyProfilePage_displayed();
			
			companyProfilePage.verify_DataRoomSection_CompanyProfilePage_displayed();

			String fileUploadedName = companyProfilePage.get_FileName_CompanySection_Section_DataRoom_CompanyProfilePage_displayed();
			
			testStepPassed("File Uploaded Name : "+fileUploadedName);
			
			try 
			{
				if (fileUploadedName.equalsIgnoreCase(file)) 
				{
					testStepPassed("File displayed in Company Profile section of Data Room and File Uploaded in Company Profile section are same");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("File displayed in Company Profile section of Data Room and File Uploaded in Company Profile section are not same");
			}
			
			logoutFromApplication();
			
			mainPage.verify_MainPage_displayed();

			/***********************Verify Data Room is displayed for new Investor user*******************************/
			
			
			
			
			
			/**********Deleting Staff Profile from App**********/

			testStepPassed("");
			testStepPassed("Deleting User Profile from App");
			testStepPassed("**********************************");


			mainPage.click_login_button();

			loginPage.verify_LoginPage_displayed();
			
			loginPage.loginIntoApplication(adminEmailId, adminPassword);

			userProfilePage.verify_UserProfilePage_OppurtunitiesTab_displayed();
			
			search_ValuesinSearchBar(searchProfile);

			verify_Searched_UserProfile_displayed_and_Open_UserProfilePage(adminStaffProfileNameFull2);
			
			userProfilePage.verify_UserProfilePage_displayed();

			userProfilePage.verify_UserProfilePage_ProfileTab_displayed();
			
			userProfilePage.verify_CorrespondingUserProfilePage_displayed_by_ProfileName(adminStaffProfileNameFull);
			
			userProfilePage.deleteUserProfile();

			verify_User_Profile_Account_Deleted_Successfully();

			homePage.verify_HomePage_displayed();
			
			/**********Deleting User Profile from App**********/

			
			
			
			/**********Deleting Company Profile from App**********/

			testStepPassed("");
			testStepPassed("Deleting Company Profile from App");
			testStepPassed("***************************************");


			search_ValuesinSearchBar(newCompanyLegalName);

			verify_Searched_Company_displayed_and_Open_CompanyProfilePage(newCompanyLegalName);

			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_ProfileTab_CompanyProfilePage_displayed();

			companyProfilePage.verify_CorrespondingCompanyProfilePage_displayed_by_CompanyName(newCompanyLegalName);

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
			if(this.testFailure||this.obj.testFailure||mainPage.testFailure||loginPage.testFailure||homePage.testFailure||userProfilePage.testFailure||settingsPage.testFailure||popupDialogWindows.testFailure||emailReaderPage.testFailure||createPasswordPage.testFailure||registrationCompanyPage.testFailure||registrationFounderPage.testFailure||registrationInvestmentHistoryPage.testFailure||registrationVideoInterviewPage.testFailure||companyProfilePage.testFailure||profileUpdateRegistrationPage.testFailure)
			{
				this.testFailure = true;
			}
		}
	}
}