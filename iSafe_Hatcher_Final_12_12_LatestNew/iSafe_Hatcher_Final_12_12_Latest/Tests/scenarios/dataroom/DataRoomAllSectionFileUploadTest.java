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


public class DataRoomAllSectionFileUploadTest extends ApplicationKeywords
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

	public DataRoomAllSectionFileUploadTest(BaseClass obj) 
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

			companyProfilePage.verify_DataRoom_CompanyProfilePage_DefaultFolderSection_displayed();

			refreshPage();
			
			String currentURL = driver.getCurrentUrl();
			
			testStepInfo("Current URL : "+currentURL);
			
			String urlAppend = "?v=2";
			
			String  version2URL = currentURL+urlAppend;
			
			testStepInfo("version2URL : "+version2URL);
			
			driver.get(version2URL);

			/***********************Company Profile Section validation of Data Room*******************************/

			testStepInfo("");
			testStepInfo("Company Profile Section Validations");
			testStepInfo("*******************************************");

			testStepPassed("");
			testStepPassed("Company Profile Section Add New Folder");
			testStepPassed("**************************************************");
			
			companyProfilePage.click_DataRoomPage_CompanyProfileSection_EditDataRoom_ToggleDots();

			companyProfilePage.click_DataRoomPage_AddFolder_Link();

			popupDialogWindows.verify_Dataroom_AddorCreateFolder_ModalDialog_Window_displayed();

			popupDialogWindows.verify_Dataroom_AddorCreateFolder_ModalDialog_Window_Heading_displayed();

			popupDialogWindows.click_AddorCreateFolder_DataRoom_Window_Close_Link();

			companyProfilePage.click_DataRoomPage_CompanyProfileSection_EditDataRoom_ToggleDots();

			companyProfilePage.click_DataRoomPage_AddFolder_Link();

			popupDialogWindows.verify_Dataroom_AddorCreateFolder_ModalDialog_Window_displayed();

			popupDialogWindows.AddorCreateFolder_DataRoom_fillCreateFolder(newCompanyFolderName);

			popupDialogWindows.click_AddorCreateFolder_DataRoom_AddFolder();

			companyProfilePage.verify_DataRoomTab_CompanyProfilePage_displayed();

			companyProfilePage.verify_DataRoomSection_CompanyProfilePage_displayed();

			List<WebElement> folder = driver.findElements(By.xpath("//div[contains(@id,'data_room-panel')]//*[contains(text(),'Company Profile')]/following-sibling::div//div[contains(@class,'midnav')]//a"));

			int folderCount = folder.size();

			try 
			{
				if (folderCount==2) 
				{
					testStepPassed("The folder count is same as expected");

					for (int i = 1; i <= folderCount; i++) 
					{
						String folderName = driver.findElement(By.xpath("(//div[contains(@id,'data_room-panel')]//*[contains(text(),'Company Profile')]/following-sibling::div//div[contains(@class,'midnav')]//a)["+i+"]")).getText().trim();
						testStepPassed("Folder Name"+i+" : "+folderName);
					}
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("The folder count is not same as expected");
			}

			String folderAddedName = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//*[contains(text(),'Company Profile')]/following-sibling::div//div[contains(@class,'midnav')]//a[contains(@class,'link active')]")).getText().trim();			

			try 
			{
				if (folderAddedName.equalsIgnoreCase(newCompanyFolderName)) 
				{
					testStepPassed("Newly Added Folder Name "+folderAddedName+" is displayed");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("Newly Added Folder Name "+folderAddedName+" is not displayed");
			}

			testStepPassed("");
			testStepPassed("Company Profile Section Edit Created New Folder");
			testStepPassed("*********************************************************");

			companyProfilePage.click_DataRoomPage_CompanyProfileSection_EditFolder_ToggleDots();

			companyProfilePage.click_DataRoomPage_CompanyProfileSection_EditFolderName_Link();

			popupDialogWindows.verify_Dataroom_EditorUpdateFolder_ModalDialog_Window_displayed();

			popupDialogWindows.verify_Dataroom_EditorUpdateFolder_ModalDialog_Window_Heading_displayed();

			popupDialogWindows.click_EditorUpdateFolder_DataRoom_Window_Close_Link();

			companyProfilePage.click_DataRoomPage_CompanyProfileSection_EditFolder_ToggleDots();

			companyProfilePage.click_DataRoomPage_CompanyProfileSection_EditFolderName_Link();

			popupDialogWindows.verify_Dataroom_EditorUpdateFolder_ModalDialog_Window_displayed();

			popupDialogWindows.EditorUpdateFolder_DataRoom_fillEditFolder(newCompanyFolderEditedName);

			popupDialogWindows.click_EditorUpdateFolder_DataRoom_EditFolder();

			companyProfilePage.verify_DataRoomTab_CompanyProfilePage_displayed();

			companyProfilePage.verify_DataRoomSection_CompanyProfilePage_displayed();

			String folderEditedName = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//*[contains(text(),'Company Profile')]/following-sibling::div//div[contains(@class,'midnav')]//a[contains(@class,'link active')]")).getText().trim();			

			try 
			{
				if (folderEditedName.equalsIgnoreCase(newCompanyFolderEditedName)) 
				{
					testStepPassed("Newly Edited Folder Name "+folderEditedName+" is displayed");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("Newly Edited Folder Name "+folderEditedName+" is not displayed");
			}

			testStepPassed("");
			testStepPassed("Upload File in Default Folder of Company Profile Section");
			testStepPassed("*******************************************************************");
			
			testStepPassed("");
			testStepPassed("View File in Default Folder of Company Profile Section");
			testStepPassed("*****************************************************************");
			
			testStepPassed("");
			testStepPassed("Edit File in Default Folder of Company Profile Section and Move File to Newly Created and Edited Folder");
			testStepPassed("************************************************************************************************************************");
			
			companyProfilePage.verify_DataRoomTab_CompanyProfilePage_displayed();

			companyProfilePage.click_DataRoomPage_CompanyProfileSection_Folder_Link(defaultFolderName);
			
			companyProfilePage.verify_DataRoom_CompanySection_DefaultFolder_displayed();

			companyProfilePage.verify_DataRoomPage_CompanyProfileSection_EditFile_Edit_File(fileName1, newCompanyEditFileName, newCompanyEditFileType, newCompanyEditFileDocumentPermissions, newCompanyFolderEditedName);

			companyProfilePage.verify_DataRoomTab_CompanyProfilePage_displayed();
			
			companyProfilePage.verify_DataRoomTab_CompanyProfilePage_displayed();

			companyProfilePage.click_DataRoomPage_CompanyProfileSection_Folder_Link(defaultFolderName);
			
			companyProfilePage.verify_DataRoom_CompanySection_DefaultFolder_displayed();

			try 
			{
				if (driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//*[contains(text(),'Company Profile')]/following-sibling::div//div[contains(@class,'midnav1')]//a[contains(text(),'"+defaultFolderName+"') and contains(@class,'active')]/parent::div/following-sibling::div[contains(@class,'tab-content')]//div[contains(@class,'active show')]//div[contains(@class,'content row')]")).isDisplayed())
				{
					testStepFailed("File is displayed in Default Folder");
				}
			} 
			catch (Exception e) 
			{
				testStepPassed("File is not displayed in Default Folder");
				
				companyProfilePage.click_DataRoomPage_CompanyProfileSection_Folder_Link(newCompanyFolderEditedName);
				
				companyProfilePage.verify_DataRoom_CompanySection_CreatedFolder_displayed(newCompanyFolderEditedName);

				try 
				{
					if (driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//*[contains(text(),'Company Profile')]/following-sibling::div//div[contains(@class,'midnav1')]//a[contains(text(),'"+newCompanyFolderEditedName+"') and contains(@class,'active')]/parent::div/following-sibling::div[contains(@class,'tab-content')]//div[contains(@class,'active show')]//div[contains(@class,'content row')]")).isDisplayed())
					{
						testStepPassed("File is successfully moved form Default folder to "+newCompanyFolderEditedName+" Folder");
						
						String fileNameinApp2 = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//*[contains(text(),'Company Profile')]/following-sibling::div//div[contains(@class,'midnav1')]//a[contains(text(),'"+newCompanyFolderEditedName+"') and contains(@class,'active')]/parent::div/following-sibling::div[contains(@class,'tab-content')]//div[contains(@class,'active show')]//div[contains(@class,'content row')]//div[contains(@class,'font-weight-bold')]//a")).getText().trim();
						
						try 
						{
							if (fileNameinApp2.equalsIgnoreCase(newCompanyEditFileName))
							{
								testStepPassed("Correct Edited File is displayed in "+newCompanyFolderEditedName+" Folder");
							}
						} 
						catch (Exception e2) 
						{
							testStepFailed("Correct Edited File is not displayed in "+newCompanyFolderEditedName+" Folder");
						}
					}
				} 
				catch (Exception e1) 
				{
					testStepFailed("File is not successfully moved form Default folder to "+newCompanyFolderEditedName+" Folder");
				}
			}
			
					
			testStepPassed("");
			testStepPassed("Delete File from New Created and Edited Folder of Company Profile Section");
			testStepPassed("*******************************************************************************************");

			companyProfilePage.click_DataRoomPage_CompanyProfileSection_Folder_Link(newCompanyFolderEditedName);
			
			companyProfilePage.verify_DataRoom_CompanySection_CreatedFolder_displayed(newCompanyFolderEditedName);
			
			companyProfilePage.verify_DataRoomPage_CompanyProfileSection_DeleteFile(newCompanyFolderEditedName, newCompanyEditFileName);
			
			companyProfilePage.verify_DataRoomTab_CompanyProfilePage_displayed();

			companyProfilePage.verify_DataRoomSection_CompanyProfilePage_displayed();
			
			companyProfilePage.click_DataRoomPage_CompanyProfileSection_Folder_Link(newCompanyFolderEditedName);
			
			companyProfilePage.verify_DataRoom_CompanySection_CreatedFolder_displayed(newCompanyFolderEditedName);

			try 
			{
				if (driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//*[contains(text(),'Company Profile')]/following-sibling::div//div[contains(@class,'midnav1')]//a[contains(text(),'"+newCompanyFolderEditedName+"') and contains(@class,'active')]/parent::div/following-sibling::div[contains(@class,'tab-content')]//div[contains(@class,'active show')]//div[contains(@class,'content row')]")).isDisplayed())
				{
					testStepFailed("File "+newCompanyEditFileName+" is not successfully deleted from "+newCompanyFolderEditedName+" folder and displayed in "+newCompanyFolderEditedName+" Folder");
				}
			} 
			catch (Exception e) 
			{
				testStepPassed("File "+newCompanyEditFileName+" is successfully deleted from "+newCompanyFolderEditedName+" folder and not displayed in "+newCompanyFolderEditedName+" Folder");
			}
			
			
			testStepPassed("");
			testStepPassed("Delete Newly Created and Edited Folder of Company Profile Section");
			testStepPassed("*******************************************************************************");
			
			companyProfilePage.click_DataRoomPage_CompanyProfileSection_EditFolder_ToggleDots();
			
			companyProfilePage.click_DataRoomPage_CompanyProfileSection_DeleteFolder_Link();		
			
			companyProfilePage.verify_DataRoomPage_CompanyProfileSection_DeleteFolder(newCompanyFolderEditedName);
			
			companyProfilePage.verify_DataRoomTab_CompanyProfilePage_displayed();

			companyProfilePage.verify_DataRoomSection_CompanyProfilePage_displayed();

			companyProfilePage.verify_DataRoomPage_CompanyProfileSection_Folder_Deleted(newCompanyFolderEditedName);
			
			/***********************Company Profile Section validation of Data Room*******************************/


			
			/***********************Due Diligence Section validation of Data Room*******************************/

			testStepInfo("");
			testStepInfo("Due Diligence Section Validations");
			testStepInfo("*******************************************");

			testStepPassed("");
			testStepPassed("Due Diligence Section Add New Folder");
			testStepPassed("**************************************************");
			
			companyProfilePage.click_DataRoomPage_DueDiligenceSection_EditDataRoom_ToggleDots();

			companyProfilePage.click_DataRoomPage_AddFolder_Link();

			popupDialogWindows.verify_Dataroom_AddorCreateFolder_ModalDialog_Window_displayed();

			popupDialogWindows.verify_Dataroom_AddorCreateFolder_ModalDialog_Window_Heading_displayed();

			popupDialogWindows.click_AddorCreateFolder_DataRoom_Window_Close_Link();

			companyProfilePage.click_DataRoomPage_DueDiligenceSection_EditDataRoom_ToggleDots();

			companyProfilePage.click_DataRoomPage_AddFolder_Link();

			popupDialogWindows.verify_Dataroom_AddorCreateFolder_ModalDialog_Window_displayed();

			popupDialogWindows.AddorCreateFolder_DataRoom_fillCreateFolder(newDueDiligenceFolderName);

			popupDialogWindows.click_AddorCreateFolder_DataRoom_AddFolder();

			companyProfilePage.verify_DataRoomTab_CompanyProfilePage_displayed();

			companyProfilePage.verify_DataRoomSection_CompanyProfilePage_displayed();
			
			companyProfilePage.click_DataRoomPage_DueDiligenceSection_Folder_Link(newDueDiligenceFolderName);

			List<WebElement> folder3 = driver.findElements(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Due Diligence')]/parent::td//div[contains(@class,'midnav')]//a"));

			int folderCount3 = folder3.size();

			try 
			{
				if (folderCount3==2) 
				{
					testStepPassed("The folder count is same as expected");

					for (int i = 1; i <= folderCount; i++) 
					{
						String folderName = driver.findElement(By.xpath("(//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Due Diligence')]/parent::td//div[contains(@class,'midnav')]//a)["+i+"]")).getText().trim();
						testStepPassed("Folder Name "+i+" : "+folderName);
					}
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("The folder count is not same as expected");
			}

			String folderAddedName3 = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Due Diligence')]/parent::td//div[contains(@class,'midnav')]//a[contains(@class,'active')]")).getText().trim();			

			try 
			{
				if (folderAddedName3.equalsIgnoreCase(newDueDiligenceFolderName)) 
				{
					testStepPassed("Newly Added Folder Name "+folderAddedName+" is displayed");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("Newly Added Folder Name "+folderAddedName+" is not displayed");
			}
			
			
			testStepPassed("");
			testStepPassed("Due Diligence Section Edit Created New Folder");
			testStepPassed("*********************************************************");

			companyProfilePage.click_DataRoomPage_DueDiligenceSection_EditFolder_ToggleDots();

			companyProfilePage.click_DataRoomPage_DueDiligenceSection_EditFolderName_Link();

			popupDialogWindows.verify_Dataroom_EditorUpdateFolder_ModalDialog_Window_displayed();

			popupDialogWindows.verify_Dataroom_EditorUpdateFolder_ModalDialog_Window_Heading_displayed();

			popupDialogWindows.click_EditorUpdateFolder_DataRoom_Window_Close_Link();

			companyProfilePage.click_DataRoomPage_DueDiligenceSection_EditFolder_ToggleDots();

			companyProfilePage.click_DataRoomPage_DueDiligenceSection_EditFolderName_Link();

			popupDialogWindows.verify_Dataroom_EditorUpdateFolder_ModalDialog_Window_displayed();

			popupDialogWindows.EditorUpdateFolder_DataRoom_fillEditFolder(newDueDiligenceFolderEditedName);

			popupDialogWindows.click_EditorUpdateFolder_DataRoom_EditFolder();

			companyProfilePage.verify_DataRoomTab_CompanyProfilePage_displayed();

			companyProfilePage.verify_DataRoomSection_CompanyProfilePage_displayed();
			
			companyProfilePage.click_DataRoomPage_DueDiligenceSection_Folder_Link(newDueDiligenceFolderEditedName);

			String folderEditedName3 = driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Due Diligence')]/parent::td//div[contains(@class,'midnav')]//a[contains(@class,'active')]")).getText().trim();			

			try 
			{
				if (folderEditedName3.equalsIgnoreCase(newDueDiligenceFolderEditedName)) 
				{
					testStepPassed("Newly Edited Folder Name "+folderEditedName+" is displayed");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("Newly Edited Folder Name "+folderEditedName+" is not displayed");
			}

			
			testStepPassed("");
			testStepPassed("Upload File in Default Folder of Due Diligence Section");
			testStepPassed("*******************************************************************");
			
			companyProfilePage.click_DataRoomPage_DueDiligenceSection_Folder_Link(defaultFolderName);

			companyProfilePage.click_DataRoomPage_DueDiligenceSection_AddDocument_Button();

			popupDialogWindows.verify_Dataroom_UploadFile_ModalDialog_Window_displayed();

			popupDialogWindows.verify_Dataroom_UploadFile_ModalDialog_Window_Heading_displayed();

			popupDialogWindows.verify_Dataroom_UploadFileTabs_ModalDialog_Window_displayed();

			popupDialogWindows.close_UploadFile_DataRoom_Window();

			companyProfilePage.click_DataRoomPage_DueDiligenceSection_AddDocument_Button();

			popupDialogWindows.verify_Dataroom_UploadFile_ModalDialog_Window_displayed();

			popupDialogWindows.fill_AddDocumentTab_UploadFile_Window(fileName2, fileType2, documentPermissionStaffMembers, documentSignedDate, filePath2);

			testStepPassed("File Uploaded : "+file2);

			popupDialogWindows.enter_UploadFile_DataRoom_Window_FileName(fileName1);

			popupDialogWindows.click_UploadFile_DataRoom_Window_UploadButton();

			companyProfilePage.verify_DataRoomTab_CompanyProfilePage_displayed();
			
			companyProfilePage.verify_DataRoomTab_CompanyProfilePage_displayed();
			
			companyProfilePage.verify_DataRoomSection_CompanyProfilePage_displayed();

			companyProfilePage.click_DataRoomPage_DueDiligenceSection_Folder_Link(defaultFolderName);
			
			companyProfilePage.verify_DataRoom_DueDiligenceSection_DefaultFolder_displayed();
			
			String fileNameinApp3 = driver.findElement(By.xpath("(//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Due Diligence')]/parent::td//div[contains(@class,'tab-content')]//a[contains(@title,'View')])[1]")).getText().trim();
			
			try 
			{
				if (fileNameinApp3.equalsIgnoreCase(fileName1))
				{
					testStepPassed("Correct uploaded File is displayed in Default Folder");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("Correct uploaded File is not displayed in Default Folder");
			}

			testStepPassed("");
			testStepPassed("View File in Default Folder of Due Diligence Section");
			testStepPassed("*****************************************************************");
			
			companyProfilePage.verify_DataRoomPage_DueDiligenceSection_EditFile_View_File(fileName1);			
			
			testStepPassed("");
			testStepPassed("Edit File in Default Folder of Due Diligence Section and Move File to Newly Created and Edited Folder");
			testStepPassed("************************************************************************************************************************");
			
			companyProfilePage.verify_DataRoomTab_CompanyProfilePage_displayed();

			companyProfilePage.click_DataRoomPage_DueDiligenceSection_Folder_Link(defaultFolderName);
			
			companyProfilePage.verify_DataRoom_DueDiligenceSection_DefaultFolder_displayed();

			companyProfilePage.verify_DataRoomPage_DueDiligenceSection_EditFile(fileName1, newDueDiligenceEditFileName, newDueDiligenceEditFileType, newDueDiligenceEditFileDocumentPermissions, newDueDiligenceFolderEditedName);

			companyProfilePage.verify_DataRoomTab_CompanyProfilePage_displayed();
			
			companyProfilePage.verify_DataRoomTab_CompanyProfilePage_displayed();

			companyProfilePage.click_DataRoomPage_DueDiligenceSection_Folder_Link(defaultFolderName);
			
			companyProfilePage.verify_DataRoom_DueDiligenceSection_DefaultFolder_displayed();

			try 
			{
				if (driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Due Diligence')]/parent::td//div[contains(@class,'tab-content')]//div[contains(@class,'default') and contains(@class,'active')]//div[contains(@class,'row content')]")).isDisplayed())
				{
					testStepFailed("File is displayed in Default Folder");
				}
			} 
			catch (Exception e) 
			{
				testStepPassed("File is not displayed in Default Folder");
				
				companyProfilePage.click_DataRoomPage_DueDiligenceSection_Folder_Link(newDueDiligenceFolderEditedName);
				
				companyProfilePage.verify_DataRoom_DueDiligenceSection_CreatedFolder_displayed(newDueDiligenceFolderEditedName);

				try 
				{
					if (driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Due Diligence')]/parent::td//div[contains(@class,'tab-content')]//div[contains(@class,'show') and contains(@class,'active')]//div[contains(@class,'row content')]")).isDisplayed())
					{
						testStepPassed("File is successfully moved form Default folder to "+newDueDiligenceFolderEditedName+" Folder");
						
						String fileNameinApp2 = driver.findElement(By.xpath("(//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Due Diligence')]/parent::td//div[contains(@class,'tab-content')]//a[contains(@title,'View')])[1]")).getText().trim();
						
						try 
						{
							if (fileNameinApp2.equalsIgnoreCase(newCompanyEditFileName))
							{
								testStepPassed("Correct Edited File is displayed in "+newDueDiligenceFolderEditedName+" Folder");
							}
						} 
						catch (Exception e2) 
						{
							testStepFailed("Correct Edited File is not displayed in "+newDueDiligenceFolderEditedName+" Folder");
						}
					}
				} 
				catch (Exception e1) 
				{
					testStepFailed("File is not successfully moved form Default folder to "+newDueDiligenceFolderEditedName+" Folder");
				}
			}
			
			testStepPassed("");
			testStepPassed("Delete File from New Created and Edited Folder of Due Diligence Section");
			testStepPassed("*******************************************************************************************");

			companyProfilePage.click_DataRoomPage_DueDiligenceSection_Folder_Link(newDueDiligenceFolderEditedName);
			
			companyProfilePage.verify_DataRoom_DueDiligenceSection_CreatedFolder_displayed(newDueDiligenceFolderEditedName);
			
			companyProfilePage.verify_DataRoomPage_DueDiligenceSection_DeleteFile(newDueDiligenceEditFileName);
			
			companyProfilePage.verify_DataRoomTab_CompanyProfilePage_displayed();

			companyProfilePage.verify_DataRoomSection_CompanyProfilePage_displayed();
			
			companyProfilePage.click_DataRoomPage_DueDiligenceSection_Folder_Link(newDueDiligenceFolderEditedName);
			
			companyProfilePage.verify_DataRoom_DueDiligenceSection_CreatedFolder_displayed(newDueDiligenceFolderEditedName);

			try 
			{
				if (driver.findElement(By.xpath("//div[contains(@id,'data_room-panel')]//table[contains(@id,'dataroom-table')]//tbody//tr//*[contains(text(),'Due Diligence')]/parent::td//div[contains(@class,'tab-content')]//div[contains(@class,'default') and contains(@class,'active')]//div[contains(@class,'row content')]")).isDisplayed())
				{
					testStepFailed("File "+newCompanyEditFileName+" is not successfully deleted from "+newCompanyFolderEditedName+" folder and displayed in "+newCompanyFolderEditedName+" Folder");
				}
			} 
			catch (Exception e) 
			{
				testStepPassed("File "+newCompanyEditFileName+" is successfully deleted from "+newCompanyFolderEditedName+" folder and not displayed in "+newCompanyFolderEditedName+" Folder");
			}
						
			testStepPassed("");
			testStepPassed("Delete Newly Created and Edited Folder of Due Diligence Section");
			testStepPassed("*******************************************************************************");
			
			companyProfilePage.click_DataRoomPage_DueDiligenceSection_EditFolder_ToggleDots();
			
			companyProfilePage.click_DataRoomPage_DueDiligenceSection_DeleteFolder_Link();	
			
			companyProfilePage.verify_DataRoomPage_DueDiligenceSection_DeleteFolder(newDueDiligenceFolderEditedName);
			
			companyProfilePage.verify_DataRoomTab_CompanyProfilePage_displayed();

			companyProfilePage.verify_DataRoomSection_CompanyProfilePage_displayed();

			companyProfilePage.verify_DataRoomPage_DueDiligenceSection_Folder_Deleted(newDueDiligenceFolderEditedName);
			

			/***********************Due Diligence section validation of Data Room*******************************/


			/***********************Investments Section validation of Data Room*******************************/

			testStepPassed("");
			testStepPassed("Investments section");
			testStepPassed("************************");

			companyProfilePage.click_DataRoomPage_InvestmentsSection_AddDocument_Button();

			popupDialogWindows.verify_Dataroom_UploadFile_ModalDialog_Window_displayed();

			popupDialogWindows.verify_Dataroom_UploadFile_ModalDialog_Window_Heading_displayed();

			popupDialogWindows.verify_Dataroom_UploadFileTabs_ModalDialog_Window_displayed();

			popupDialogWindows.close_UploadFile_DataRoom_Window();

			companyProfilePage.click_DataRoomPage_InvestmentsSection_AddDocument_Button();

			popupDialogWindows.verify_Dataroom_UploadFile_ModalDialog_Window_displayed();

			popupDialogWindows.fill_AddDocumentTab_UploadFile_Window(fileName3, fileType3, documentPermissionAnyoneDataroomAccess, documentSignedDate, filePath3);

			testStepPassed("File Uploaded : "+file3);

			popupDialogWindows.enter_UploadFile_DataRoom_Window_FileName(fileName3);

			popupDialogWindows.click_UploadFile_DataRoom_Window_UploadButton();

			companyProfilePage.verify_DataRoomTab_CompanyProfilePage_displayed();
			
			companyProfilePage.verify_DataRoomTab_CompanyProfilePage_displayed();

			/***********************Investments Section validation of Data Room*******************************/


			/***********************Financials Section validation of Data Room*******************************/

			testStepPassed("");
			testStepPassed("Financials section");
			testStepPassed("**********************");

			companyProfilePage.click_DataRoomPage_FinancialsSection_AddDocument_Button();

			popupDialogWindows.verify_Dataroom_UploadFile_ModalDialog_Window_displayed();

			popupDialogWindows.verify_Dataroom_UploadFile_ModalDialog_Window_Heading_displayed();

			popupDialogWindows.verify_Dataroom_UploadFileTabs_ModalDialog_Window_displayed();

			popupDialogWindows.close_UploadFile_DataRoom_Window();

			companyProfilePage.click_DataRoomPage_FinancialsSection_AddDocument_Button();

			popupDialogWindows.verify_Dataroom_UploadFile_ModalDialog_Window_displayed();

			popupDialogWindows.fill_AddDocumentTab_UploadFile_Window(fileName4, fileType4, documentPermissionStaffMembers, documentSignedDate, filePath4);

			testStepPassed("File Uploaded : "+file4);

			popupDialogWindows.enter_UploadFile_DataRoom_Window_FileName(fileName4);

			popupDialogWindows.click_UploadFile_DataRoom_Window_UploadButton();

			companyProfilePage.verify_DataRoomTab_CompanyProfilePage_displayed();
			
			companyProfilePage.verify_DataRoomTab_CompanyProfilePage_displayed();

			/***********************Financials Section validation of Data Room*******************************/


			/***********************Legal Section validation of Data Room*******************************/

			testStepPassed("");
			testStepPassed("Legal section");
			testStepPassed("****************");

			companyProfilePage.click_DataRoomPage_LegalSection_AddDocument_Button();

			popupDialogWindows.verify_Dataroom_UploadFile_ModalDialog_Window_displayed();

			popupDialogWindows.verify_Dataroom_UploadFile_ModalDialog_Window_Heading_displayed();

			popupDialogWindows.verify_Dataroom_UploadFileTabs_ModalDialog_Window_displayed();

			popupDialogWindows.close_UploadFile_DataRoom_Window();

			companyProfilePage.click_DataRoomPage_LegalSection_AddDocument_Button();

			popupDialogWindows.verify_Dataroom_UploadFile_ModalDialog_Window_displayed();

			popupDialogWindows.fill_AddDocumentTab_UploadFile_Window(fileName5, fileType5, documentPermissionAnyoneDataroomAccess, documentSignedDate, filePath5);

			testStepPassed("File Uploaded : "+file5);

			popupDialogWindows.enter_UploadFile_DataRoom_Window_FileName(fileName5);

			popupDialogWindows.click_UploadFile_DataRoom_Window_UploadButton();

			companyProfilePage.verify_DataRoomTab_CompanyProfilePage_displayed();
			
			companyProfilePage.verify_DataRoomTab_CompanyProfilePage_displayed();

			/***********************Legal Section validation of Data Room*******************************/

			/***********************Shareholder Updates Section validation of Data Room*******************************/

			testStepPassed("");
			testStepPassed("Shareholder Updates section");
			testStepPassed("**********************************");

			companyProfilePage.click_DataRoomPage_ShareholderUpdatesSection_AddDocument_Button();

			popupDialogWindows.verify_Dataroom_UploadFile_ModalDialog_Window_displayed();

			popupDialogWindows.verify_Dataroom_UploadFile_ModalDialog_Window_Heading_displayed();

			popupDialogWindows.verify_Dataroom_UploadFileTabs_ModalDialog_Window_displayed();

			popupDialogWindows.close_UploadFile_DataRoom_Window();

			companyProfilePage.click_DataRoomPage_ShareholderUpdatesSection_AddDocument_Button();

			popupDialogWindows.verify_Dataroom_UploadFile_ModalDialog_Window_displayed();

			popupDialogWindows.fill_AddDocumentTab_UploadFile_Window(fileName6, fileType6, documentPermissionStaffMembers, documentSignedDate, filePath6);

			testStepPassed("File Uploaded : "+file6);

			popupDialogWindows.enter_UploadFile_DataRoom_Window_FileName(fileName6);

			popupDialogWindows.click_UploadFile_DataRoom_Window_UploadButton();

			companyProfilePage.verify_DataRoomTab_CompanyProfilePage_displayed();
			
			companyProfilePage.verify_DataRoomTab_CompanyProfilePage_displayed();

			/***********************Shareholder Updates Section validation of Data Room*******************************/


			/***********************Management Team Section validation of Data Room*******************************/

			testStepPassed("");
			testStepPassed("Management Team section");
			testStepPassed("********************************");

			companyProfilePage.click_DataRoomPage_ManagementTeamSection_AddDocument_Button();

			popupDialogWindows.verify_Dataroom_UploadFile_ModalDialog_Window_displayed();

			popupDialogWindows.verify_Dataroom_UploadFile_ModalDialog_Window_Heading_displayed();

			popupDialogWindows.verify_Dataroom_UploadFileTabs_ModalDialog_Window_displayed();

			popupDialogWindows.close_UploadFile_DataRoom_Window();

			companyProfilePage.click_DataRoomPage_ManagementTeamSection_AddDocument_Button();

			popupDialogWindows.verify_Dataroom_UploadFile_ModalDialog_Window_displayed();

			popupDialogWindows.fill_AddDocumentTab_UploadFile_Window(fileName7, fileType7, documentPermissionAnyoneDataroomAccess, documentSignedDate, filePath7);

			testStepPassed("File Uploaded : "+file7);

			popupDialogWindows.enter_UploadFile_DataRoom_Window_FileName(fileName7);

			popupDialogWindows.click_UploadFile_DataRoom_Window_UploadButton();

			companyProfilePage.verify_DataRoomTab_CompanyProfilePage_displayed();
			
			companyProfilePage.verify_DataRoomTab_CompanyProfilePage_displayed();

			/***********************Management Team Section validation of Data Room*******************************/


			/***********************IP/technology Section validation of Data Room*******************************/

			testStepPassed("");
			testStepPassed("IP/technology section");
			testStepPassed("**************************");

			companyProfilePage.click_DataRoomPage_IPorTechnologySection_AddDocument_Button();

			popupDialogWindows.verify_Dataroom_UploadFile_ModalDialog_Window_displayed();

			popupDialogWindows.verify_Dataroom_UploadFile_ModalDialog_Window_Heading_displayed();

			popupDialogWindows.verify_Dataroom_UploadFileTabs_ModalDialog_Window_displayed();

			popupDialogWindows.close_UploadFile_DataRoom_Window();

			companyProfilePage.click_DataRoomPage_IPorTechnologySection_AddDocument_Button();

			popupDialogWindows.verify_Dataroom_UploadFile_ModalDialog_Window_displayed();

			popupDialogWindows.fill_AddDocumentTab_UploadFile_Window(fileName8, fileType8, documentPermissionStaffMembers, documentSignedDate, filePath8);

			testStepPassed("File Uploaded : "+file8);

			popupDialogWindows.enter_UploadFile_DataRoom_Window_FileName(fileName8);

			popupDialogWindows.click_UploadFile_DataRoom_Window_UploadButton();

			companyProfilePage.verify_DataRoomTab_CompanyProfilePage_displayed();
			
			companyProfilePage.verify_DataRoomTab_CompanyProfilePage_displayed();

			/***********************IP/technology Section validation of Data Room*******************************/


			/***********************Inbox Section validation of Data Room*******************************/

			testStepPassed("");
			testStepPassed("Inbox section");
			testStepPassed("****************");

			companyProfilePage.click_DataRoomPage_InboxSection_AddDocument_Button();

			popupDialogWindows.verify_Dataroom_UploadFile_ModalDialog_Window_displayed();

			popupDialogWindows.verify_Dataroom_UploadFile_ModalDialog_Window_Heading_displayed();

			popupDialogWindows.verify_Dataroom_UploadFileTabs_ModalDialog_Window_displayed();

			popupDialogWindows.close_UploadFile_DataRoom_Window();

			companyProfilePage.click_DataRoomPage_InboxSection_AddDocument_Button();

			popupDialogWindows.verify_Dataroom_UploadFile_ModalDialog_Window_displayed();

			popupDialogWindows.fill_AddDocumentTab_UploadFile_Window(fileName9, fileType9, documentPermissionAnyoneDataroomAccess, documentSignedDate, filePath9);

			testStepPassed("File Uploaded : "+file9);

			popupDialogWindows.enter_UploadFile_DataRoom_Window_FileName(fileName9);

			popupDialogWindows.click_UploadFile_DataRoom_Window_UploadButton();

			companyProfilePage.verify_DataRoomTab_CompanyProfilePage_displayed();
			
			companyProfilePage.verify_DataRoomTab_CompanyProfilePage_displayed();

			/***********************Inbox Section validation of Data Room*******************************/
			testStepPassed("");
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