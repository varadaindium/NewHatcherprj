package iSAFE;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import automationFramework.APIKeywords;
import baseClass.BaseClass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import webScenarios.AddNewListingTest;
public class ApplicationKeywords extends APIKeywords
{
	BaseClass obj;
	public String randomNumber = null;
	String executionCount = null;

	public ApplicationKeywords(BaseClass obj) 
	{

		super(obj);
	}
	public ApplicationKeywords()
	{

	}

	private static final String img_applicationLogo = "Application Logo Image#xpath=//a//img[contains(@alt,'Indium Software Logo')]";
	private static final String img_syndicateLogoWrapper = "Application Syndicate Logo Wrapper Image#xpath=//nav[contains(@class,'top header')]//div[contains(@class,'float-right header-syndicate-logo-wrapper-user')]//img[contains(@class,'header-syndicate-logo')]";
	private static final String lst_syndicateLogoWrapper_Links = "Application Syndicate Logo Wrapper Dropdown Links#xpath=//nav[contains(@class,'top header')]//div[contains(@class,'float-right header-syndicate-logo-wrapper-user')]//ul[contains(@class,'dropdown-menu')]//li";
	private static final String lnk_syndicateLogoWrapper_Link_Profile = "Profile Link in Application Syndicate Logo Wrapper Link#xpath=//nav[contains(@class,'top header')]//div[contains(@class,'float-right header-syndicate-logo-wrapper-user')]//ul[contains(@class,'dropdown-menu')]//li//a[contains(text(),'Profile')]";
	private static final String lnk_syndicateLogoWrapper_Link_Oppurtunities = "Oppurtunities Link in Application Syndicate Logo Wrapper Link#xpath=//nav[contains(@class,'top header')]//div[contains(@class,'float-right header-syndicate-logo-wrapper-user')]//ul[contains(@class,'dropdown-menu')]//li//a[contains(text(),'Opportunities')]";
	private static final String lnk_syndicateLogoWrapper_Link_ChangeLanguage = "Change Language Link in Application Syndicate Logo Wrapper Link#xpath=//nav[contains(@class,'top header')]//div[contains(@class,'float-right header-syndicate-logo-wrapper-user')]//ul[contains(@class,'dropdown-menu')]//li//a[contains(text(),'Change Language')]";
	private static final String lnk_syndicateLogoWrapper_Link_ChangeTheme = "Change Theme Link in Application Syndicate Logo Wrapper Link#xpath=//nav[contains(@class,'top header')]//div[contains(@class,'float-right header-syndicate-logo-wrapper-user')]//ul[contains(@class,'dropdown-menu')]//li//a[contains(text(),'Change Theme')]";
	private static final String lnk_syndicateLogoWrapper_Link_Notifications = "Notifications Link in Application Syndicate Logo Wrapper Link#xpath=//nav[contains(@class,'top header')]//div[contains(@class,'float-right header-syndicate-logo-wrapper-user')]//ul[contains(@class,'dropdown-menu')]//li//a[contains(text(),'Notifications')]";
	private static final String lnk_syndicateLogoWrapper_Link_Logout = "Logout Link in Application Syndicate Logo Wrapper Link#xpath=//nav[contains(@class,'top header')]//div[contains(@class,'float-right header-syndicate-logo-wrapper-user')]//ul[contains(@class,'dropdown-menu')]//li//a[contains(text(),'Logout')]";

	private static final String txt_topMenu_SearchBar = "Top Menu Search Bar Textbox#xpath=//nav[contains(@class,'top header')]//div[contains(@class,'menu-nav-search-bar')]//input[contains(@type,'search')]";
	private static final String lst_topMenu_SearchBar_AutoCompleteList = "Auto Complete List of Top Menu Search Bar Textbox#xpath=//nav[contains(@class,'top header')]//div[contains(@class,'menu-nav-search-bar')]//div[contains(@class,'autcomplete-list')]";

	private static final String btn_topMenu_HamburgerMenu = "Hamburger Menu of Top Menu Button#xpath=//nav[contains(@class,'top header')]//div[contains(@class,'hatcher-sidebar')]//button[contains(@class,'hatcher-sidebar')]";
	private static final String lbl_topMenu_HamburgerMenu_Body = "Hamburger Menu Body#xpath=//div[contains(@class,'sidebar-body')]";

	private static final String lnk_topMenu_HamburgerMenu_Body_RoundButton_List = "List Round Image Link in Hamburger Menu Body#xpath=//div[contains(@class,'sidebar-body')]//div[contains(@class,'listing-dropdown-wrapper')]//i[contains(@class,'list')]";
	private static final String lnk_topMenu_HamburgerMenu_Body_RoundButton_Settings = "Settings Round Image Link in Hamburger Menu Body#xpath=//div[contains(@class,'sidebar-body')]//div[contains(@class,'listing-dropdown-wrapper')]//i[contains(@class,'cog')]";
	private static final String lnk_topMenu_HamburgerMenu_Body_RoundButton_Plus = "Plus Round Image Link in Hamburger Menu Body#xpath=//div[contains(@class,'sidebar-body')]//div[contains(@class,'listing-dropdown-wrapper')]//i[contains(@class,'plus')]";

	private static final String lnk_topMenu_HamburgerMenu_Body_RoundButton_List_Menu_CRM = "CRM Link in Hamburger Menu Body List Round Image#xpath=//div[contains(@class,'sidebar-body')]//div[contains(@id,'sidebar-apps')]//div[contains(@class,'list-group-item')]//span[contains(text(),'CRM')]";
	private static final String lnk_topMenu_HamburgerMenu_Body_RoundButton_List_Menu_Deals = "Deals Link in Hamburger Menu Body List Round Image#xpath=//div[contains(@class,'sidebar-body')]//div[contains(@id,'sidebar-apps')]//div[contains(@class,'list-group-item')]//span[contains(text(),'Deals')]";
	private static final String lnk_topMenu_HamburgerMenu_Body_RoundButton_List_Menu_Events = "Events Link in Hamburger Menu Body List Round Image#xpath=//div[contains(@class,'sidebar-body')]//div[contains(@id,'sidebar-apps')]//div[contains(@class,'list-group-item')]//span[contains(text(),'Events')]";
	private static final String lnk_topMenu_HamburgerMenu_Body_RoundButton_List_Menu_People = "People Link in Hamburger Menu Body List Round Image#xpath=//div[contains(@class,'sidebar-body')]//div[contains(@id,'sidebar-apps')]//div[contains(@class,'list-group-item')]//span[contains(text(),'People')]";
	private static final String lnk_topMenu_HamburgerMenu_Body_RoundButton_List_Menu_Portfolio = "Portfolio Link in Hamburger Menu Body List Round Image#xpath=//div[contains(@class,'sidebar-body')]//div[contains(@id,'sidebar-apps')]//div[contains(@class,'list-group-item')]//span[contains(text(),'Portfolio')]";

	private static final String lnk_topMenu_HamburgerMenu_Body_RoundButton_Settings_Menu_Branding = "Branding Link in Hamburger Menu Body Settings Round Image#xpath=//div[contains(@class,'sidebar-body')]//div[contains(@id,'sidebar-admin')]//div[contains(@class,'list-group-item')]//a[contains(text(),'Branding')]";
	private static final String lnk_topMenu_HamburgerMenu_Body_RoundButton_Settings_Menu_Forms = "Forms Link in Hamburger Menu Body Settings Round Image#xpath=//div[contains(@class,'sidebar-body')]//div[contains(@id,'sidebar-admin')]//div[contains(@class,'list-group-item')]//a[contains(text(),'Forms')]";
	private static final String lnk_topMenu_HamburgerMenu_Body_RoundButton_Settings_Menu_Settings = "Settings Link in Hamburger Menu Body Settings Round Image#xpath=//div[contains(@class,'sidebar-body')]//div[contains(@id,'sidebar-admin')]//div[contains(@class,'list-group-item')]//a[contains(text(),'Settings')]";
	private static final String lnk_topMenu_HamburgerMenu_Body_RoundButton_Settings_Menu_Sharing = "Sharing Link in Hamburger Menu Body Settings Round Image#xpath=//div[contains(@class,'sidebar-body')]//div[contains(@id,'sidebar-admin')]//div[contains(@class,'list-group-item')]//a[contains(text(),'Sharing')]";
	private static final String lnk_topMenu_HamburgerMenu_Body_RoundButton_Settings_Menu_Users = "Users Link in Hamburger Menu Body Settings Round Image#xpath=//div[contains(@class,'sidebar-body')]//div[contains(@id,'sidebar-admin')]//div[contains(@class,'list-group-item')]//a[contains(text(),'Users')]";

	private static final String lnk_topMenu_HamburgerMenu_Body_RoundButton_Plus_Menu_AddContact = "Add Contact Link in Hamburger Menu Body Plus Round Image#xpath=//div[contains(@class,'sidebar-body')]//div[contains(@id,'sidebar-add-listing')]//div[contains(@class,'list-group-item')]//a[contains(text(),'Add Contact')]";
	private static final String lnk_topMenu_HamburgerMenu_Body_RoundButton_Plus_Menu_AddDeal = "Add Deal Link in Hamburger Menu Body Plus Round Image#xpath=//div[contains(@class,'sidebar-body')]//div[contains(@id,'sidebar-add-listing')]//div[contains(@class,'list-group-item')]//a[contains(text(),'Add Deal')]";
	private static final String lnk_topMenu_HamburgerMenu_Body_RoundButton_Plus_Menu_AddFund = "Add Fund Link in Hamburger Menu Body Plus Round Image#xpath=//div[contains(@class,'sidebar-body')]//div[contains(@id,'sidebar-add-listing')]//div[contains(@class,'list-group-item')]//a[contains(text(),'Add Fund')]";
	private static final String lnk_topMenu_HamburgerMenu_Body_RoundButton_Plus_Menu_AddMeeting = "Add Meeting Link in Hamburger Menu Body Plus Round Image#xpath=//div[contains(@class,'sidebar-body')]//div[contains(@id,'sidebar-add-listing')]//div[contains(@class,'list-group-item')]//a[contains(text(),'Add Meeting')]";
	private static final String lnk_topMenu_HamburgerMenu_Body_RoundButton_Plus_Menu_AddTask = "Add Task Link in Hamburger Menu Body Plus Round Image#xpath=//div[contains(@class,'sidebar-body')]//div[contains(@id,'sidebar-add-listing')]//div[contains(@class,'list-group-item')]//a[contains(text(),'Add Task')]";
	private static final String lnk_topMenu_HamburgerMenu_Body_RoundButton_Plus_Menu_CreateCommunity = "Create Community Link in Hamburger Menu Body Plus Round Image#xpath=//div[contains(@class,'sidebar-body')]//div[contains(@id,'sidebar-add-listing')]//div[contains(@class,'list-group-item')]//a[contains(text(),'Create Community')]";
	private static final String lnk_topMenu_HamburgerMenu_Body_RoundButton_Plus_Menu_CreateEmailCampaign = "Email Campaign Link in Hamburger Menu Body Plus Round Image Create#xpath=//div[contains(@class,'sidebar-body')]//div[contains(@id,'sidebar-add-listing')]//div[contains(@class,'list-group-item')]//a[contains(text(),'Create Email Campaign')]";
	private static final String lnk_topMenu_HamburgerMenu_Body_RoundButton_Plus_Menu_PostBlog = "Post Blog Link in Hamburger Menu Body Plus Round Image#xpath=//div[contains(@class,'sidebar-body')]//div[contains(@id,'sidebar-add-listing')]//div[contains(@class,'list-group-item')]//a[contains(text(),'Post Blog')]";

	private static final String lnk_topMenu_HamburgerMenu_Body_RoundButton_List_Menu_CRM_Menu_Activity = "Activity menu Link under CRM Link of Hamburger Menu Body List Round Image#xpath=//div[contains(@class,'sidebar-body')]//div[contains(@id,'sidebar-dashboard')]//div[contains(@class,'list-group-item')]//a[contains(@title,'Activity')]";
	private static final String lnk_topMenu_HamburgerMenu_Body_RoundButton_List_Menu_CRM_Menu_Tasks = "Task menu Link under CRM Link of Hamburger Menu Body List Round Image#xpath=//div[contains(@class,'sidebar-body')]//div[contains(@id,'sidebar-dashboard')]//div[contains(@class,'list-group-item')]//a[contains(@title,'Tasks')]";
	private static final String lnk_topMenu_HamburgerMenu_Body_RoundButton_List_Menu_CRM_Menu_UserAnalytics = "User Analytics menu Link Menu under CRM Link of Hamburger Menu Body List Round Image#xpath=//div[contains(@class,'sidebar-body')]//div[contains(@id,'sidebar-dashboard')]//div[contains(@class,'list-group-item')]//a[contains(@title,'User Analytics')]";

	private static final String lnk_topMenu_HamburgerMenu_Body_RoundButton_List_Menu_Deals_Menu_Companies = "Companies menu Link under Deals Link of Hamburger Menu Body List Round Image#xpath=//div[contains(@class,'sidebar-body')]//div[contains(@id,'sidebar-deals')]//div[contains(@class,'list-group-item')]//a[contains(@title,'Companies')]";
	private static final String lnk_topMenu_HamburgerMenu_Body_RoundButton_List_Menu_Deals_Menu_Funds = "Funds menu Link under Deals Link of Hamburger Menu Body List Round Image#xpath=//div[contains(@class,'sidebar-body')]//div[contains(@id,'sidebar-deals')]//div[contains(@class,'list-group-item')]//a[contains(@title,'Funds')]";
	private static final String lnk_topMenu_HamburgerMenu_Body_RoundButton_List_Menu_Deals_Menu_Watchlist = "Watchlist menu Link under Deals Link of Hamburger Menu Body List Round Image#xpath=//div[contains(@class,'sidebar-body')]//div[contains(@id,'sidebar-deals')]//div[contains(@class,'list-group-item')]//span[contains(text(),'Watchlist')]";
	private static final String lst_Fixed_SideBar_Settings_UsersOptions_List = "Users options list in Settings menu of Fixed Sidebar#xpath=//nav[contains(@class,'sidebar-shrunk')]//div[contains(@class,'sidebar-link-left')]//a//span[contains(text(),'Settings')]/parent::div//parent::a/parent::li//ul[contains(@class,'dropdown-add-actions show')]";
	private static final String lnk_Fixed_SideBar_Settings_Users = "Users Link in Settings menu of Fixed Sidebar#xpath=//nav[contains(@class,'sidebar-shrunk')]//div[contains(@class,'sidebar-link-left')]//a//span[contains(text(),'Settings')]/parent::div//parent::a/parent::li//ul[contains(@class,'dropdown-add-actions show')]//li//a[contains(text(),'Users')]";
	private static final String lnk_Fixed_SideBar_Settings_Settings = "Settings Link in Settings menu of Fixed Sidebar#xpath=//nav[contains(@class,'sidebar-shrunk')]//div[contains(@class,'sidebar-link-left')]//a//span[contains(text(),'Settings')]/parent::div//parent::a/parent::li//ul[contains(@class,'dropdown-add-actions show')]//li//a[contains(text(),'Settings')]";

	private static final String lnk_topMenu_HamburgerMenu_Body_RoundButton_List_Menu_Events_Menu_Meetings = "Meeting menu Link under Events Link of Hamburger Menu Body List Round Image#xpath=//div[contains(@class,'sidebar-body')]//div[contains(@id,'sidebar-events')]//div[contains(@class,'list-group-item')]//a[contains(@title,'Meetings')]";
	private static final String lnk_topMenu_HamburgerMenu_Body_RoundButton_List_Menu_Events_Menu_Facilities= "Facilities menu Link under Events Link of Hamburger Menu Body List Round Image#xpath=//div[contains(@class,'sidebar-body')]//div[contains(@id,'sidebar-events')]//div[contains(@class,'list-group-item')]//a[contains(@title,'Facilities')]";

	private static final String lnk_topMenu_HamburgerMenu_Body_RoundButton_List_Menu_People_Menu_People = "People menu Link under People Link of Hamburger Menu Body List Round Image#xpath=//div[contains(@class,'sidebar-body')]//div[contains(@id,'sidebar-network')]//div[contains(@class,'list-group-item')]//a[contains(@title,'People')]";
	private static final String lnk_topMenu_HamburgerMenu_Body_RoundButton_List_Menu_People_Menu_MailingLists= "Mailing Lists menu Link under People Link of Hamburger Menu Body List Round Image#xpath=//div[contains(@class,'sidebar-body')]//div[contains(@id,'sidebar-network')]//div[contains(@class,'list-group-item')]//a[contains(@title,'Mailing Lists')]";

	private static final String lnk_topMenu_HamburgerMenu_Body_RoundButton_List_Menu_Portfolio_Menu_Overview= "Overview menu Link under Portfolio Link of Hamburger Menu Body List Round Image#xpath=//div[contains(@class,'sidebar-body')]//div[contains(@id,'sidebar-reports')]//div[contains(@class,'list-group-item')]//a[contains(@title,'Overview')]";
	private static final String lnk_topMenu_HamburgerMenu_Body_RoundButton_List_Menu_Portfolio_Menu_Air= "Air menu Link under Portfolio Link of Hamburger Menu Body List Round Image#xpath=//div[contains(@class,'sidebar-body')]//div[contains(@id,'sidebar-reports')]//div[contains(@class,'list-group-item')]//a[contains(@title,'Air')]";
	private static final String lnk_topMenu_HamburgerMenu_Body_RoundButton_List_Menu_Portfolio_Menu_Div= "Div menu Link under Portfolio Link of Hamburger Menu Body List Round Image#xpath=//div[contains(@class,'sidebar-body')]//div[contains(@id,'sidebar-reports')]//div[contains(@class,'list-group-item')]//a[contains(@title,'Div')]";
	private static final String lnk_topMenu_HamburgerMenu_Body_RoundButton_List_Menu_Portfolio_Menu_EvergreenFundDemo= "Evergreen Fund Demo menu Link under Portfolio Link of Hamburger Menu Body List Round Image#xpath=//div[contains(@class,'sidebar-body')]//div[contains(@id,'sidebar-reports')]//div[contains(@class,'list-group-item')]//a[contains(@title,'Evergreen Fund Demo')]";
	private static final String lnk_topMenu_HamburgerMenu_Body_RoundButton_List_Menu_Portfolio_Menu_LaptTop= "LaptTop menu Link under Portfolio Link of Hamburger Menu Body List Round Image#xpath=//div[contains(@class,'sidebar-body')]//div[contains(@id,'sidebar-reports')]//div[contains(@class,'list-group-item')]//a[contains(@title,'LaptTop')]";
	private static final String lnk_topMenu_HamburgerMenu_Body_RoundButton_List_Menu_Portfolio_Menu_QS= "QS menu Link under Portfolio Link of Hamburger Menu Body List Round Image#xpath=//div[contains(@class,'sidebar-body')]//div[contains(@id,'sidebar-reports')]//div[contains(@class,'list-group-item')]//a[contains(@title,'QS')]";
	private static final String lnk_topMenu_HamburgerMenu_Body_RoundButton_List_Menu_Portfolio_Menu_RTC= "RTC menu Link under Portfolio Link of Hamburger Menu Body List Round Image#xpath=//div[contains(@class,'sidebar-body')]//div[contains(@id,'sidebar-reports')]//div[contains(@class,'list-group-item')]//a[contains(@title,'RTC')]";
	private static final String lnk_topMenu_HamburgerMenu_Body_RoundButton_List_Menu_Portfolio_Menu_Rere= "Rere menu Link under Portfolio Link of Hamburger Menu Body List Round Image#xpath=//div[contains(@class,'sidebar-body')]//div[contains(@id,'sidebar-reports')]//div[contains(@class,'list-group-item')]//a[contains(@title,'rere')]";


	private static final String btn_topMenu_HamburgerMenu_Body_CreateAFund = "Create a Fund Button in Hamburger Menu#xpath=//div[contains(@class,'sidebar-body')]//div[contains(@class,'sidebar-buttons-wrapper')]//a[contains(text(),'Create a fund')]";
	private static final String btn_topMenu_HamburgerMenu_Body_ScoutforDeals = "Scout for Deals Button in Hamburger Menu#xpath=//div[contains(@class,'sidebar-body')]//div[contains(@class,'sidebar-buttons-wrapper')]//a[contains(text(),'Scout for deals')]";
	private static final String btn_topMenu_HamburgerMenu_Body_SendFeedback = "Send Feedback Button in Hamburger Menu#xpath=//div[contains(@class,'sidebar-body')]//div[contains(@class,'sidebar-buttons-wrapper')]//a[contains(text(),'Send feedback')]";

	private static final String lbl_topMenu_HamburgerMenu_Body_Footer = "Hamburger Menu Body Footer Label#xpath=(//div[contains(@id,'sidebar')])[1]//div[contains(@class,'sidebar-footer')]";
	private static final String lnk_topMenu_HamburgerMenu_Body_Footer_Blog = "Blog Footer Link in Hamburger Menu Body#xpath=(//div[contains(@id,'sidebar')])[1]//div[contains(@class,'sidebar-footer')]//a[contains(@title,'Blog')]";
	private static final String lnk_topMenu_HamburgerMenu_Body_Footer_Contact = "Contact Footer Link in Hamburger Menu Body#xpath=(//div[contains(@id,'sidebar')])[1]//div[contains(@class,'sidebar-footer')]//a[contains(@title,'Contact')]";
	private static final String lnk_topMenu_HamburgerMenu_Body_Footer_FAQ = "FAQ Footer Link in Hamburger Menu Body#xpath=(//div[contains(@id,'sidebar')])[1]//div[contains(@class,'sidebar-footer')]//a[contains(@title,'FAQ')]";
	private static final String lnk_topMenu_HamburgerMenu_Body_Footer_Resources = "Resources Footer Link in Hamburger Menu Body#xpath=(//div[contains(@id,'sidebar')])[1]//div[contains(@class,'sidebar-footer')]//a[contains(@title,'Resources')]";
	private static final String lnk_topMenu_HamburgerMenu_Body_Footer_Terms = "Terms Footer Link in Hamburger Menu Body#xpath=(//div[contains(@id,'sidebar')])[1]//div[contains(@class,'sidebar-footer')]//a[contains(@title,'Terms')]";

	private static final String lbl_Fixed_SideBar = "Fixed Sidebar Label#xpath=//nav[contains(@class,'sidebar-shrunk')]";
	//private static final String lnk_Fixed_SideBar_Actions = "Actions Link in Fixed Sidebar#xpath=//nav[contains(@class,'sidebar-shrunk')]//div[contains(@class,'sidebar-link-left')]//a//span[contains(text(),'Actions')]";
	//private static final String lnk_Fixed_SideBar_CRM = "CRM Link in Fixed Sidebar#xpath=//nav[contains(@class,'sidebar-shrunk')]//div[contains(@class,'sidebar-link-left')]//a//span[contains(text(),'CRM')]";
	//private static final String lnk_Fixed_SideBar_Deals = "Deals Link in Fixed Sidebar#xpath=//nav[contains(@class,'sidebar-shrunk')]//div[contains(@class,'sidebar-link-left')]//a//span[contains(text(),'Deals')]";
	private static final String lnk_Fixed_SideBar_Events = "Events Link in Fixed Sidebar#xpath=//nav[contains(@class,'sidebar-shrunk')]//div[contains(@class,'sidebar-link-left')]//a//span[contains(text(),'Events')]";
	private static final String lnk_Fixed_SideBar_People = "People Link in Fixed Sidebar#xpath=//nav[contains(@class,'sidebar-shrunk')]//div[contains(@class,'sidebar-link-left')]//a//span[contains(text(),'People')]";
	private static final String lnk_Fixed_SideBar_Portfolio = "Portfolio Link in Fixed Sidebar#xpath=//nav[contains(@class,'sidebar-shrunk')]//div[contains(@class,'sidebar-link-left')]//a//span[contains(text(),'Portfolio')]";
	private static final String lnk_Fixed_SideBar_Settings = "Settings Link in Fixed Sidebar#xpath=//nav[contains(@class,'sidebar-shrunk')]//div[contains(@class,'sidebar-link-left')]//a//span[contains(text(),'Settings')]";
	private static final String lnk_Fixed_SideBar_Tools = "Tools Link in Fixed Sidebar#xpath=//nav[contains(@class,'sidebar-shrunk')]//div[contains(@class,'sidebar-link-left')]//a//span[contains(text(),'Tools')]";

	//newly added
	private static final String lnk_Fixed_SideBar_Actions = "Actions Link in Fixed Sidebar#xpath=//div[contains(@class,'sidebar-link-left')]//a//span[contains(text(),'Actions')]";
	private static final String lnk_Fixed_SideBar_CRM = "CRM Link in Fixed Sidebar#xpath=//div[contains(@class,'sidebar-link-left')]//a//span[contains(text(),'CRM')]";
	private static final String lnk_Fixed_SideBar_Deals = "Deals Link in Fixed Sidebar#xpath=//div[contains(@class,'sidebar-link-left')]//a//span[contains(text(),'Deals')]";


	//newly added-ended
	private static final String lnk_Fixed_SideBar_Actions_AddContact = "Add Contact Menu in Actions Menu in Fixed Sidebar#xpath=//nav[contains(@class,'sidebar-shrunk')]//div[contains(@class,'sidebar-link-left')]//a//span[contains(text(),'Actions')]//following::ul[contains(@class,'add-actions show')]//li//a[contains(text(),'Add Contact')]";
	private static final String lnk_Fixed_SideBar_Actions_AddDeal = "Add Deal Menu in Actions Menu in Fixed Sidebar#xpath=//nav[contains(@class,'sidebar-shrunk')]//div[contains(@class,'sidebar-link-left')]//a//span[contains(text(),'Actions')]//following::ul[contains(@class,'add-actions show')]//li//a[contains(text(),'Add Deal')]";
	private static final String lnk_Fixed_SideBar_Actions_CreateFund = "CreateFund Menu in Actions Menu in Fixed Sidebar#xpath=//nav[contains(@class,'sidebar-shrunk')]//div[contains(@class,'sidebar-link-left')]//a//span[contains(text(),'Actions')]//following::ul[contains(@class,'add-actions show')]//li//a[contains(text(),'Create Fund')]";
	private static final String lnk_Fixed_SideBar_Actions_CreateCommunity = "Create Community Menu in Actions Menu in Fixed Sidebar#xpath=//nav[contains(@class,'sidebar-shrunk')]//div[contains(@class,'sidebar-link-left')]//a//span[contains(text(),'Actions')]//following::ul[contains(@class,'add-actions show')]//li//a[contains(text(),'Create Community')]";
	private static final String lnk_Fixed_SideBar_Actions_AddBlogPost = "Add Blog Post Menu in Actions Menu in Fixed Sidebar#xpath=//nav[contains(@class,'sidebar-shrunk')]//div[contains(@class,'sidebar-link-left')]//a//span[contains(text(),'Actions')]//following::ul[contains(@class,'add-actions show')]//li//a[contains(text(),'Add Blog Post')]";
	private static final String lnk_Fixed_SideBar_Actions_AddEvent = "Add Event Menu in Actions Menu in Fixed Sidebar#xpath=//nav[contains(@class,'sidebar-shrunk')]//div[contains(@class,'sidebar-link-left')]//a//span[contains(text(),'Actions')]//following::ul[contains(@class,'add-actions show')]//li//a[contains(text(),'Add Event')]";
	private static final String lnk_Fixed_SideBar_Actions_SendGroupEmail = "Send Group Mail Menu in Actions Menu in Fixed Sidebar#xpath=//nav[contains(@class,'sidebar-shrunk')]//div[contains(@class,'sidebar-link-left')]//a//span[contains(text(),'Actions')]//following::ul[contains(@class,'add-actions show')]//li//a[contains(text(),'Send Group Email')]";
	private static final String lnk_Fixed_SideBar_Actions_UpdateCRM = "Update CRM Menu in Actions Menu in Fixed Sidebar#xpath=//nav[contains(@class,'sidebar-shrunk')]//div[contains(@class,'sidebar-link-left')]//a//span[contains(text(),'Actions')]//following::ul[contains(@class,'add-actions show')]//li//a[contains(text(),'Update CRM')]";
	private static final String lnk_Fixed_SideBar_Actions_AddMeeting = "Add Meeting Menu in Actions Menu in Fixed Sidebar#xpath=//nav[contains(@class,'sidebar-shrunk')]//div[contains(@class,'sidebar-link-left')]//a//span[contains(text(),'Actions')]//following::ul[contains(@class,'add-actions show')]//li//a[contains(text(),'Add Meeting')]";
	private static final String lnk_Fixed_SideBar_Actions_AddTask = "Add Task in Actions Menu in Fixed Sidebar#xpath=//nav[contains(@class,'sidebar-shrunk')]//div[contains(@class,'sidebar-link-left')]//a//span[contains(text(),'Actions')]//following::ul[contains(@class,'add-actions show')]//li//a[contains(text(),'Add Task')]";
	private static final String lnk_Fixed_SideBar_Actions_ScoutForDeals = "Scout for Deals in Actions Menu in Fixed Sidebar#xpath=//nav[contains(@class,'sidebar-shrunk')]//div[contains(@class,'sidebar-link-left')]//a//span[contains(text(),'Actions')]//following::ul[contains(@class,'add-actions show')]//li//a[contains(text(),'Scout for deals')]";
	private static final String lnk_Fixed_SideBar_Actions_SendFeedback = "Send Feedback in Actions Menu in Fixed Sidebar#xpath=//nav[contains(@class,'sidebar-shrunk')]//div[contains(@class,'sidebar-link-left')]//a//span[contains(text(),'Actions')]//following::ul[contains(@class,'add-actions show')]//li//a[contains(text(),'Send Feedback')]";
	private static final String lnk_Fixed_SideBar_Actions_Blog = "Blog in Actions Menu in Fixed Sidebar#xpath=(//nav[contains(@class,'sidebar-shrunk')]//div[contains(@class,'sidebar-link-left')]//a//span[contains(text(),'Actions')]//following::ul[contains(@class,'add-actions show')]//li//a[contains(text(),'Blog')])[2]";
	private static final String lnk_Fixed_SideBar_Actions_Contact = "Contact in Actions Menu in Fixed Sidebar#xpath=(//nav[contains(@class,'sidebar-shrunk')]//div[contains(@class,'sidebar-link-left')]//a//span[contains(text(),'Actions')]//following::ul[contains(@class,'add-actions show')]//li//a[contains(text(),'Contact')])[2]";
	private static final String lnk_Fixed_SideBar_Actions_FAQ = "Contact in Actions Menu in Fixed Sidebar#xpath=//nav[contains(@class,'sidebar-shrunk')]//div[contains(@class,'sidebar-link-left')]//a//span[contains(text(),'Actions')]//following::ul[contains(@class,'add-actions show')]//li//a[contains(text(),'FAQ')]";
	private static final String lnk_Fixed_SideBar_Actions_Newsletter = "Newsletter Menu in Actions Menu in Fixed Sidebar#xpath=//nav[contains(@class,'sidebar-shrunk')]//div[contains(@class,'sidebar-link-left')]//a//span[contains(text(),'Actions')]//following::ul[contains(@class,'add-actions show')]//li//a[contains(text(),'Newsletter')]";
	private static final String lnk_Fixed_SideBar_Actions_AddFund = "Add Fund Menu in Actions Menu in Fixed Sidebar#xpath=//nav[contains(@class,'sidebar-shrunk')]//div[contains(@class,'sidebar-link-left')]//a//span[contains(text(),'Actions')]//following::ul[contains(@class,'add-actions show')]//li//a[contains(text(),'Add Fund')]";
	private static final String lbl_Deleted_SuccessDialog = "Deleted Success Dialog#xpath=//*[contains(text(),'Success')]";
	//private static final String lbl_Deleted_SuccessDialog = "Deleted Success Dialog#xpath=//div[contains(@class,'swal2-popup swal2-modal swal2-icon-success')]//*[contains(text(),'Success')]";
	private static final String lbl_SuccessDialog = "Success Dialog#xpath=//div[contains(@class,'swal2-popup swal2-modal swal2-icon-success')]//*[contains(text(),'Success')]";
	private static final String lbl_UserAccount_Deleted_Success_Message = "Usere Account deleted success message#xpath=//div[contains(@class,'swal2-popup swal2-modal swal2-icon-success')]//div[contains(text(),'User account has been removed from the system')]";
	private static final String lbl_Company_Deleted_Success_Message = "Company deleted success message#xpath=//div[contains(@class,'swal2-popup swal2-modal swal2-icon-success')]//div[contains(text(),'Task Completed')]";
	private static final String lbl_UserProfileAccount_Contact_Added_Success_Message = "User Profile Account Contact added success message#xpath=//div[contains(@class,'swal2-popup swal2-modal swal2-icon-success')]//div[contains(text(),'User added Successfully')]";

	private static final String lnk_Bottom_PHP_Debugger_RestoreButton = "Bottom PHP Debugger Button#xpath=//a[contains(@class,'phpdebugbar-restore-btn')]";
	private static final String lbl_Bottom_PHP_Debugger_Header_None = "Bottom PHP Debugger Header Section Style None#xpath=//div[contains(@class,'phpdebugbar-header') and contains(@style,'display: none')]";
	private static final String lbl_Bottom_PHP_Debugger_Header_MiniDesign = "Bottom PHP Debugger Header Section Style None#xpath=//div[contains(@class,'phpdebugbar-header phpdebugbar-mini-design') and contains(@style,'display: none')]";
	private static final String lnk_Bottom_PHP_Debugger_Close = "Bottom PHP Debugger Section Close Link#xpath=//a[contains(@class,'phpdebugbar-close-btn')]";

	private static final String txt_LoginForm_EmailAddress = "Email Address Textbox in Login Form#xpath=//div[contains(@class,'application-form-container')]//input[@name='email']";
	private static final String txt_LoginForm_Password = "Password Textbox in Login Form#xpath=//div[contains(@class,'application-form-container')]//input[@name='password']";
	private static final String btn_LoginForm_Login = "Login Button in Login Form#xpath=//div[contains(@class,'application-form-container')]//button[contains(text(),'Log in')]";

	private static final String lbl_SuccessDialogLabel = "Success Dialog Window#xpath=//div[contains(@class,'swal2-popup swal2-modal swal2-icon-success')]";
	private static final String btn_SuccessDialog_Ok = "Ok Button Success Dialog Window#xpath=//div[contains(@class,'swal2-popup swal2-modal swal2-icon-success')]//button[contains(text(),'Ok')]";
	private static int length=0;
	private static final String pageElement="Application Form#xpath=(//div[contains(@class,'application-form-container')])[1]";

	//newly added
	private static final String txt_Settings_menu="TextBox Menu#xpath=//div[contains(@class,'select-dropdown-redirect')]";
	private static final String lst_Settings_menu="DropDown Settings Menu#xpath=//select[@class='form-control form-control-bg-white']";
	private static final String opt_Settings_User="Options User#xpath=//select[@class='form-control form-control-bg-white']//option[normalize-space(text())='Users']";

	private static final String lbl_Investor = "Investor Option#xpath=//div[contains(text(),'Investor')]";
	private static final String lbl_StartUp = "Start Up Option#xpath=//div[contains(text(),'Startup')]"; 
	private static final String btn_Continue="Continue button#xpath=//button[contains(text(),'Continue')]";

	
	public static final String img_ProfileIcon = "Profile Icon#xpath=//a[@id='dropdownUserButton']";
    public static final String btn_Logout = "Logout Button#xpath=//a[contains(text(),'Logout')]";

     public static final String txt_loginbtn ="Login Button#xpath=//div[@class='bv-example-row logo-row position-relative container-fluid']//child::a[contains(text(),'Login')]";
	
     public static final String btn_SideBar= "List Of Sidebar Button#xpath=//div[@class='sidebar-link-left']//span";
     public static final String drp_Actions= "Actions DropDown#xpath=//ul[@class='dropdown-menu bg-light dropdown-add-actions show']//li";
	
	
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public static String getCurrentDateinYearMonthDateFormat() 
	{

		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String formattedDate = sdf.format(date);
		return formattedDate;
	}
	//use for negative scenario - spl chars,alphanumeric
	public void verify_textboxvalid(String obj, String txtvalue) {
		try {

			//String getvalue =getText(obj);
			String getvalue =getAttributeValue(obj,"value");

			if(getvalue.equalsIgnoreCase(txtvalue)) {
				testStepPassed("The TextField accepts the given values.");
			}
			else {
				testStepFailed("The TextField does not accept the given values.");
			}
		}
		catch(Exception e) {
			testStepFailed("The TextField values cannot be verified."+e.getClass());e.printStackTrace();
		}}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public static String getCurrentSystemTime() 
	{
		LocalTime time = LocalTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		String currentTime = time.format(formatter);

		return currentTime;
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public static void getTimeDifference(String executionStartTime, String executionEndTime) throws ParseException 
	{
		SimpleDateFormat simpleDateFormat= new SimpleDateFormat("HH:mm:ss");
		Date date1 = simpleDateFormat.parse(executionStartTime);
		Date date2 = simpleDateFormat.parse(executionEndTime);
		long differenceInMilliSeconds = Math.abs(date2.getTime() - date1.getTime());
		long differenceInHours = (differenceInMilliSeconds / (60 * 60 * 1000))% 24;
		long differenceInMinutes = (differenceInMilliSeconds / (60 * 1000)) % 60;
		long differenceInSeconds = (differenceInMilliSeconds / 1000) % 60;
		System.out.println("Difference is : " + differenceInHours + " hours "+ differenceInMinutes + " minutes "+ differenceInSeconds + " Seconds. ");
	}

	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public String generateRandomString() 
	{

		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";


		StringBuilder sb = new StringBuilder();


		Random random = new Random();


		int length = 10;

		for(int i = 0; i < length; i++) 
		{

			int index = random.nextInt(alphabet.length());

			char randomChar = alphabet.charAt(index);

			sb.append(randomChar);
		}

		String randomString = sb.toString();
		System.out.println("Random String is: " + randomString);
		return randomString;
	}
	public String generateRandomEmailAddressWithNumbers() 
	{
		Random randomGenerator = new Random();  
		int randomInt = randomGenerator.nextInt(100000);  
		String emailId = randomInt +"@test.com";
		return emailId;
	}
	public String generateRandomEmailAddress3() 
	{
		Random randomGenerator = new Random();  
		int randomInt = randomGenerator.nextInt(100000);  
		String emailId = "Username"+ randomInt +"@test.co";
		return emailId;
	}
	public String generateRandomEmailAddress2() 
	{
		Random randomGenerator = new Random();  
		int randomInt = randomGenerator.nextInt(100000);  
		String emailId = "username"+ randomInt +"@test.co";
		return emailId;
	}
	public String generateRandomStringbothUpperandLowerCase(int lengthofString) 
	{
		// create a string of all characters
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

		// create random string builder
		StringBuilder sb = new StringBuilder();

		// create an object of Random class
		Random random = new Random();

		// specify length of random string
		int length = lengthofString;

		for(int i = 0; i < length; i++) 
		{
			// generate random index number
			int index = random.nextInt(alphabet.length());

			// get character specified by index
			// from the string
			char randomChar = alphabet.charAt(index);

			// append the character to string builder
			sb.append(randomChar);
		}

		String randomString = sb.toString();
		System.out.println("Random String is: " + randomString);
		return randomString;
	}

	public String generateRandomAlphaNumericCharacterString(int lengthofString) 
	{
		// create a string of all characters
		String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890*";

		// create random string builder
		StringBuilder sb = new StringBuilder();

		// create an object of Random class
		Random random = new Random();

		// specify length of random string
		int length = lengthofString;

		for(int i = 0; i < length; i++) 
		{
			// generate random index number
			int index = random.nextInt(alphabet.length());

			// get character specified by index
			// from the string
			char randomChar = alphabet.charAt(index);

			// append the character to string builder
			sb.append(randomChar);
		}

		String randomString = sb.toString();
		System.out.println("Random String is: " + randomString);
		return randomString;
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public String generateRandomString(int lengthofString) 
	{

		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";


		StringBuilder sb = new StringBuilder();


		Random random = new Random();


		length = lengthofString;

		for(int i = 0; i < length; i++) 
		{

			int index = random.nextInt(alphabet.length());


			char randomChar = alphabet.charAt(index);


			sb.append(randomChar);
		}

		String randomString = sb.toString();
		System.out.println("Random String is: " + randomString);
		return randomString;
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public String generateRandomNumbersasString(int lengthofString) 
	{

		String alphabet = "1234567890";


		StringBuilder sb = new StringBuilder();

		Random random = new Random();


		length = lengthofString;

		for(int i = 0; i < length; i++) 
		{

			int index = random.nextInt(alphabet.length());


			char randomChar = alphabet.charAt(index);


			sb.append(randomChar);
		}

		String randomString = sb.toString();
		System.out.println("Random String is: " + randomString);
		return randomString;
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public String generateRandomSpecialCharacterString() 
	{

		String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*";


		StringBuilder sb = new StringBuilder();


		Random random = new Random();


		length = 10;

		for(int i = 0; i < length; i++) 
		{

			int index = random.nextInt(alphabet.length());

			char randomChar = alphabet.charAt(index);

			sb.append(randomChar);
		}

		String randomString = sb.toString();
		System.out.println("Random String is: " + randomString);
		return randomString;
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public String generateRandomSpecialCharacterString(int lengthofString) 	{

		String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*";
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		length = lengthofString;
		for(int i = 0; i < length; i++) 	{
			int index = random.nextInt(alphabet.length());
			char randomChar = alphabet.charAt(index);
			sb.append(randomChar);
		}

		String randomString = sb.toString();
		System.out.println("Random String is: " + randomString);
		return randomString;
	}
	/**
	 *This method is used to generate Random Email Address
	 *
	 *@author VijayaKumar.U	 
	 *
	 */
	public String generateRandomEmailAddress() 
	{
		Random randomGenerator = new Random();  
		int randomInt = randomGenerator.nextInt(100000);  
		String emailId = "userName"+ randomInt +"@test.com";
		return emailId;
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public String generateRandomEmailAddressWithOtherDomain() 
	{
		Random randomGenerator = new Random();  
		int randomInt = randomGenerator.nextInt(100000);  
		String emailId = "username"+ randomInt +"@test.po";
		return emailId;
	}
	public String generateRandomEmailAddressWithSpecialCharacter() 
	{
		Random randomGenerator = new Random();  
		int randomInt = randomGenerator.nextInt(100000);  
		String emailId = "usern1%&"+ randomInt +"@test.po";
		return emailId;
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public String generateRandomEmailAddresswithCo() 
	{
		Random randomGenerator = new Random();  
		int randomInt = randomGenerator.nextInt(100000);  
		String emailId = "Username"+ randomInt +"@test.co";
		return emailId;
	}
	/**
	 * This method is used to URL of the web application.
	 *
	 *@author VijayaKumar.U	 *
	 *
	 */
	public String getAppUrl()
	{
		String URL = getConfigProperty("AppURL");
		return URL;
	}
	/**
	 * This method is used to launch the web application.
	 *
	 *@author VijayaKumar.U
	 */
	public void openApplicationMainPageByHittingURL()
	{
		String url = getAppUrl();
		driver.get(url);
	}

	/**
	 * This method is used to clear all the Cookies
	 *     
	 * @author VijayaKumar.U    
	 */
	public void clearCookies()
	{
		driver.manage().deleteAllCookies();
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void navigateBack() {
		try {
			driver.navigate().back();
		} catch (Exception e) {
			ApplicationKeywords.writeToLogFile("INFO", e.toString());
			e.printStackTrace();
			testStepFailed("Failed to navigate back " + e.getClass());
		}
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */

	public void refreshPage(){
		try {
			driver.navigate().refresh();
		}
		catch (Exception e) {
			testStepFailed("Failed to refresh the page"+e.getClass());
		}	
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_Application_Logo()
	{
		try {
			if(isElementDisplayed(img_applicationLogo)){
				clickOn(img_applicationLogo);
				testStepInfo("Clicked On:"+getText(img_applicationLogo));
			}} 
		catch (Exception e) {
			testStepFailed("Application logo is not displayed"+e.getClass());
		}	}

	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_Application_Syndicate_LogoWrapper(){
		try {
			if(isElementDisplayed(img_syndicateLogoWrapper)){
				waitForElementToDisplay(img_syndicateLogoWrapper, this.elementLoadWaitTime);
				clickOn(img_syndicateLogoWrapper);
				testStepInfo("Clicked On:"+getText(img_syndicateLogoWrapper));
			}		} 
		catch (Exception e) {
			testStepFailed("Application Syndicate LogoWrapper is not displayed");
		}	}

	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void verify_Profile_Links_displayed(){
		try {
			if(isElementDisplayed(lnk_syndicateLogoWrapper_Link_Profile)){
				testStepPassed("Profile Links Displayed");	
			}		} 
		catch (Exception e) {
			testStepFailed("User Links is not displayed");
		}
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_Profile_Link()	{
		try {
			waitForElementToDisplay(lnk_syndicateLogoWrapper_Link_Profile, this.elementLoadWaitTime);
			clickOn(lnk_syndicateLogoWrapper_Link_Profile);
			testStepPassed("Clicked:"+getText(lnk_syndicateLogoWrapper_Link_Profile));
		}
		catch (Exception e) {
			testStepFailed("Profile Links is not displayed"+e.getClass());
		}
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_Oppurtunities_Link()	{
		try {
			waitForElementToDisplay(lnk_syndicateLogoWrapper_Link_Oppurtunities, this.elementLoadWaitTime);
			clickOn(lnk_syndicateLogoWrapper_Link_Oppurtunities);
			testStepPassed("Clicked:"+getText(lnk_syndicateLogoWrapper_Link_Oppurtunities));	
		}
		catch (Exception e) {
			testStepFailed("Oppurtunities Links is not displayed"+e.getClass());
		}	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_ChangeLanguage_Link()
	{
		try {
			waitForElementToDisplay(lnk_syndicateLogoWrapper_Link_ChangeLanguage, this.elementLoadWaitTime);
			clickOn(lnk_syndicateLogoWrapper_Link_ChangeLanguage);

		}
		catch (Exception e) {
			testStepFailed("ChangeLanguage Links is not displayed"+e.getClass());
		}	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_ChangeTheme_Link()
	{
		try {
			waitForElementToDisplay(lnk_syndicateLogoWrapper_Link_ChangeTheme, this.elementLoadWaitTime);
			clickOn(lnk_syndicateLogoWrapper_Link_ChangeTheme);
			testStepPassed("Clicked:"+getText(lnk_syndicateLogoWrapper_Link_ChangeLanguage));	
		}
		catch (Exception e) {
			testStepFailed("ChangeTheme Links is not displayed"+e.getClass());
		}	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_Notifications_Link()
	{
		try {
			waitForElementToDisplay(lnk_syndicateLogoWrapper_Link_Notifications, this.elementLoadWaitTime);
			clickOn(lnk_syndicateLogoWrapper_Link_Notifications);
		}
		catch (Exception e) {
			testStepFailed("Notifications Links is not displayed"+e.getClass());
		}
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_Logout_Link(){
		try {
			waitForElementToDisplay(lnk_syndicateLogoWrapper_Link_Logout, this.elementLoadWaitTime);
			clickOn(lnk_syndicateLogoWrapper_Link_Logout);}
		catch (Exception e) {
			e.printStackTrace();
		}}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_Syndicate_Profile_Link(){
		try {
			click_Application_Syndicate_LogoWrapper();
			click_Profile_Link();
		}
		catch (Exception e) {
			e.printStackTrace();
		}}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_Syndicate_Oppurtunities_Link()		{
		try {
			click_Application_Syndicate_LogoWrapper();
			click_Oppurtunities_Link();
		}
		catch (Exception e) {
			e.printStackTrace();
		}}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_Syndicate_ChangeLanguage_Link(){
		try {
			click_Application_Syndicate_LogoWrapper();
			click_ChangeLanguage_Link();}
		catch (Exception e) {
			e.printStackTrace();
		}}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_Syndicate_ChangeTheme_Link()	{
		try {
			click_Application_Syndicate_LogoWrapper();
			click_ChangeTheme_Link();}
		catch (Exception e) {
			e.printStackTrace();
		}}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_Syndicate_Notifications_Link(){
		try {
			click_Application_Syndicate_LogoWrapper();
			click_Notifications_Link();
		}
		catch (Exception e) {
			e.printStackTrace();
		}}
	/**
	 *@author VijayaKumar.U
	 *This method is to click the Syndicate LogoWrapper.
	 *
	 */
	public void click_Syndicate_Logout_Link()	{
		try {
			click_Application_Syndicate_LogoWrapper();
			click_Logout_Link();
		}
		catch (Exception e) {
			e.printStackTrace();
		}}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void enter_SearchText(String searchText)	{
		try {
			waitForElementToDisplay(txt_topMenu_SearchBar, this.elementLoadWaitTime);
			typeIn(txt_topMenu_SearchBar, searchText);
		}
		catch (Exception e) {
			e.printStackTrace();
		}}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void clear_SearchTextBar(){
		try {
			waitForElementToDisplay(txt_topMenu_SearchBar, this.elementLoadWaitTime);
			clearEditBox(txt_topMenu_SearchBar);
		}
		catch (Exception e) {
			e.printStackTrace();
		}}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void automplete_options_SearchTextBar_displayed()		{
		try {
			waitForElementToDisplay(lst_topMenu_SearchBar_AutoCompleteList, this.elementLoadWaitTime);
			if(isElementDisplayed(lst_topMenu_SearchBar_AutoCompleteList))				{
				testStepPassed("Search Textbox Auto Complete options is displayed");	
			}} 
		catch (Exception e) {
			testStepFailed("Search Textbox Auto Complete options is not displayed");
		}}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_HamburgerMenu(){
		try {
			if(isElementDisplayed(btn_topMenu_HamburgerMenu)) {
				clickOn(btn_topMenu_HamburgerMenu);
				testStepPassed("Hamburger Menu is clicked");	
			}
			else
			{
				testStepFailed("Hamburger Menu is not opened.");
			}}
		catch (Exception e) {
			e.printStackTrace();
		}}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void verify_HamburgerMenu_Opened()		{
		try {
			waitForElementToDisplay(lbl_topMenu_HamburgerMenu_Body, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_topMenu_HamburgerMenu_Body))	{
				testStepPassed("Hamburger Menu is opened.");	
			}} 
		catch (Exception e)	{
			testStepFailed("Hamburger Menu is not opened."+e.getClass());
		}}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_List_Menu_HamburgerMenu_AddListingWrapper()
	{
		try {
			if(isElementDisplayed(lnk_topMenu_HamburgerMenu_Body_RoundButton_List)) {
				clickOn(lnk_topMenu_HamburgerMenu_Body_RoundButton_List);
			}}
		catch (Exception e)	{
			testStepFailed("AddListingWrapper options is not displayed"+e.getClass());
		}}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_Settings_Menu_HamburgerMenu_AddListingWrapper()		{
		try {
			if(isElementDisplayed(lnk_topMenu_HamburgerMenu_Body_RoundButton_Settings)) {
				clickOn(lnk_topMenu_HamburgerMenu_Body_RoundButton_Settings);
			}
			else {
				testStepFailed("Settings Button not displayed.");
			}
		}
		catch (Exception e)	{
			e.printStackTrace();
		}}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_Plus_Menu_HamburgerMenu_AddListingWrapper(){
		try {
			if(isElementDisplayed(lnk_topMenu_HamburgerMenu_Body_RoundButton_Plus)) {
				clickOn(lnk_topMenu_HamburgerMenu_Body_RoundButton_Plus);}
			else {
				testStepFailed("Plus Button not displayed.");
			}}
		catch (Exception e)	{
			e.printStackTrace();
		}}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_CRM_Menu_List_Menu_HamburgerMenu_AddListingWrapper(){
		try {
			if(isElementDisplayed(lnk_topMenu_HamburgerMenu_Body_RoundButton_List_Menu_CRM)) {
				clickOn(lnk_topMenu_HamburgerMenu_Body_RoundButton_List_Menu_CRM);}
			else {
				testStepFailed("Menu CRM not displayed.");
			}}
		catch (Exception e)	{
			e.printStackTrace();
		}}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_Deals_Menu_List_Menu_HamburgerMenu_AddListingWrapper()
	{
		try{
			if(isElementDisplayed(lnk_topMenu_HamburgerMenu_Body_RoundButton_List_Menu_Deals)){
				clickOn(lnk_topMenu_HamburgerMenu_Body_RoundButton_List_Menu_Deals);}
			else {
				testStepFailed("Menu Deals Button not displayed.");
			}}
		catch (Exception e)	{
			e.printStackTrace();
		}}

	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_Events_Menu_List_Menu_HamburgerMenu_AddListingWrapper()
	{
		try{
			if(isElementDisplayed(lnk_topMenu_HamburgerMenu_Body_RoundButton_List_Menu_Events)){
				clickOn(lnk_topMenu_HamburgerMenu_Body_RoundButton_List_Menu_Events);
			}
			else {
				testStepFailed("Menu Event Button not displayed.");
			}}
		catch (Exception e)	{
			e.printStackTrace();
		}}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_People_Menu_List_Menu_HamburgerMenu_AddListingWrapper()
	{
		try{
			if(isElementDisplayed(lnk_topMenu_HamburgerMenu_Body_RoundButton_List_Menu_People)){
				clickOn(lnk_topMenu_HamburgerMenu_Body_RoundButton_List_Menu_People);
			}
			else {
				testStepFailed("People Menu Round Button not displayed.");
			}}
		catch (Exception e)	{
			e.printStackTrace();
		}}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_Portfolio_Menu_List_Menu_HamburgerMenu_AddListingWrapper()
	{
		try{
			if(isElementDisplayed(lnk_topMenu_HamburgerMenu_Body_RoundButton_List_Menu_Portfolio)){
				clickOn(lnk_topMenu_HamburgerMenu_Body_RoundButton_List_Menu_Portfolio);}
			else {
				testStepFailed("List Menu Portfolio not displayed.");
			}}	catch (Exception e){
				e.printStackTrace();
			}	}
	public void click_Settings_Users_Fixed_SideBar_HamburgerMenu()
	{
		/*pressPageDown();
		waitForElementToDisplay(lnk_Fixed_SideBar_Settings, this.elementLoadWaitTime);
		clickOn(lnk_Fixed_SideBar_Settings);
		waitForElementToDisplay(lst_Fixed_SideBar_Settings_UsersOptions_List, this.elementLoadWaitTime);
		clickOn(lnk_Fixed_SideBar_Settings_Users);
		waitForElementToDisplay(lnk_Fixed_SideBar_Settings, this.elementLoadWaitTime);
		clickOn(lnk_Fixed_SideBar_Settings);*/
		waitForElementToDisplay(lnk_Fixed_SideBar_Settings, this.elementLoadWaitTime);
		clickOn(lnk_Fixed_SideBar_Settings);
		waitForElementToDisplay(lst_Fixed_SideBar_Settings_UsersOptions_List, this.elementLoadWaitTime);
		clickOn(lnk_Fixed_SideBar_Settings_Users);

		waitForElementToDisplay(txt_Settings_menu, this.elementLoadWaitTime);
		clickOn(txt_Settings_menu);
		waitForElementToDisplay(opt_Settings_User, this.elementLoadWaitTime);
		clickOn(opt_Settings_User);

	}
	public void pressPageDowntillelementVisibleforCompanyForm(String element)
	{
		try {	
			if(!isElementDisplayed("Next button in Company Form#xpath=//button[contains(text(),'Next')]")) {
				for(int i=0;i<5;i++) {
					clickOnSpecialElement("To perform Scroll Down#xpath=(//div[contains(@class,'application-form-container')])[1]");                
					pressPageDown();
					if(isElementDisplayed("Next button in Company Form#xpath=//button[contains(text(),'Next')]")) {
						break;
					}
				}
			}
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_Branding_Menu_Settings_Menu_HamburgerMenu_AddListingWrapper()
	{
		try{
			if(isElementDisplayed(lnk_topMenu_HamburgerMenu_Body_RoundButton_Settings_Menu_Branding)){
				clickOn(lnk_topMenu_HamburgerMenu_Body_RoundButton_Settings_Menu_Branding);}
			else {
				testStepFailed("People Menu Round link not displayed.");
			}}
		catch (Exception e){
			e.printStackTrace();
		}}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_Forms_Menu_Settings_Menu_HamburgerMenu_AddListingWrapper()
	{
		try{
			if(isElementDisplayed(lnk_topMenu_HamburgerMenu_Body_RoundButton_Settings_Menu_Forms)){
				clickOn(lnk_topMenu_HamburgerMenu_Body_RoundButton_Settings_Menu_Forms);}
			else {
				testStepFailed("Menu Forms link not displayed.");
			}}
		catch (Exception e){
			e.printStackTrace();
		}}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_Settings_Menu_Settings_Menu_HamburgerMenu_AddListingWrapper()
	{
		try{
			if(isElementDisplayed(lnk_topMenu_HamburgerMenu_Body_RoundButton_Settings_Menu_Settings)){
				clickOn(lnk_topMenu_HamburgerMenu_Body_RoundButton_Settings_Menu_Settings);}
			else {
				testStepFailed("Menu Settings link not displayed.");
			}}
		catch (Exception e){
			e.printStackTrace();
		}}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_Sharing_Menu_Settings_Menu_HamburgerMenu_AddListingWrapper()
	{
		try{
			if(isElementDisplayed(lnk_topMenu_HamburgerMenu_Body_RoundButton_Settings_Menu_Sharing)){
				clickOn(lnk_topMenu_HamburgerMenu_Body_RoundButton_Settings_Menu_Sharing);
			}
			else {
				testStepFailed("Menu Sharing link not displayed.");
			}}
		catch (Exception e){
			e.printStackTrace();
		}}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_Users_Menu_Settings_Menu_HamburgerMenu_AddListingWrapper()
	{
		try{
			if(isElementDisplayed(lnk_topMenu_HamburgerMenu_Body_RoundButton_Settings_Menu_Users)){
				clickOn(lnk_topMenu_HamburgerMenu_Body_RoundButton_Settings_Menu_Users);
			}
			else {
				testStepFailed("Menu_Users link not displayed.");
			}}
		catch (Exception e){
			testStepFailed("Element is not displayed."+e.getClass());
		}}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_AddContact_Menu_Plus_Menu_HamburgerMenu_AddListingWrapper()
	{
		try{
			if(isElementDisplayed(lnk_topMenu_HamburgerMenu_Body_RoundButton_Plus_Menu_AddContact)){
				clickOn(lnk_topMenu_HamburgerMenu_Body_RoundButton_Plus_Menu_AddContact);
			}
			else {
				testStepFailed("AddContact link not displayed.");
			}}
		catch (Exception e){
			testStepFailed("Element is not displayed."+e.getClass());
		}}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_AddDeal_Menu_Plus_Menu_HamburgerMenu_AddListingWrapper()
	{
		try{
			if(isElementDisplayed(lnk_topMenu_HamburgerMenu_Body_RoundButton_Plus_Menu_AddDeal)){
				clickOn(lnk_topMenu_HamburgerMenu_Body_RoundButton_Plus_Menu_AddDeal);}

			else {
				testStepFailed("AddDeal link not displayed.");
			}}
		catch (Exception e){
			testStepFailed("Element is not displayed."+e.getClass());
		}}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_AddFund_Menu_Plus_Menu_HamburgerMenu_AddListingWrapper()
	{
		try{
			if(isElementDisplayed(lnk_topMenu_HamburgerMenu_Body_RoundButton_Plus_Menu_AddFund)){
				clickOn(lnk_topMenu_HamburgerMenu_Body_RoundButton_Plus_Menu_AddFund);		}
			else {
				testStepFailed("People Menu Round Button not displayed.");
			}}
		catch (Exception e){
			testStepFailed("Element is not displayed."+e.getClass());
		}}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_AddMeeting_Menu_Plus_Menu_HamburgerMenu_AddListingWrapper()
	{
		clickOn(lnk_topMenu_HamburgerMenu_Body_RoundButton_Plus_Menu_AddMeeting);
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_AddTask_Menu_Plus_Menu_HamburgerMenu_AddListingWrapper()
	{
		clickOn(lnk_topMenu_HamburgerMenu_Body_RoundButton_Plus_Menu_AddTask);
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_CreateCommunity_Menu_Plus_Menu_HamburgerMenu_AddListingWrapper()
	{
		clickOn(lnk_topMenu_HamburgerMenu_Body_RoundButton_Plus_Menu_CreateCommunity);
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_CreateEmailCampaign_Menu_Plus_Menu_HamburgerMenu_AddListingWrapper()
	{
		clickOn(lnk_topMenu_HamburgerMenu_Body_RoundButton_Plus_Menu_CreateEmailCampaign);
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_PostBlog_Menu_Plus_Menu_HamburgerMenu_AddListingWrapper()
	{
		clickOn(lnk_topMenu_HamburgerMenu_Body_RoundButton_Plus_Menu_PostBlog);
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_Activity_Menu_CRM_Menu_List_Menu_HamburgerMenu_AddListingWrapper()
	{
		clickOn(lnk_topMenu_HamburgerMenu_Body_RoundButton_List_Menu_CRM_Menu_Activity);
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_Tasks_Menu_CRM_Menu_List_Menu_HamburgerMenu_AddListingWrapper()
	{
		clickOn(lnk_topMenu_HamburgerMenu_Body_RoundButton_List_Menu_CRM_Menu_Tasks);
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_UserAnalytics_Menu_CRM_Menu_List_Menu_HamburgerMenu_AddListingWrapper()
	{
		clickOn(lnk_topMenu_HamburgerMenu_Body_RoundButton_List_Menu_CRM_Menu_UserAnalytics);
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_Companies_Menu_Deals_Menu_List_Menu_HamburgerMenu_AddListingWrapper()
	{
		clickOn(lnk_topMenu_HamburgerMenu_Body_RoundButton_List_Menu_Deals_Menu_Companies);
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_Funds_Menu_Deals_Menu_List_Menu_HamburgerMenu_AddListingWrapper()
	{
		clickOn(lnk_topMenu_HamburgerMenu_Body_RoundButton_List_Menu_Deals_Menu_Funds);
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_Watchlist_Menu_Deals_Menu_List_Menu_HamburgerMenu_AddListingWrapper()
	{
		clickOn(lnk_topMenu_HamburgerMenu_Body_RoundButton_List_Menu_Deals_Menu_Watchlist);
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_Meetings_Menu_Events_Menu_List_Menu_HamburgerMenu_AddListingWrapper()
	{
		clickOn(lnk_topMenu_HamburgerMenu_Body_RoundButton_List_Menu_Events_Menu_Meetings);
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_Facilities_Menu_Events_Menu_List_Menu_HamburgerMenu_AddListingWrapper()
	{
		clickOn(lnk_topMenu_HamburgerMenu_Body_RoundButton_List_Menu_Events_Menu_Facilities);
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_People_Menu_People_Menu_List_Menu_HamburgerMenu_AddListingWrapper()
	{
		clickOn(lnk_topMenu_HamburgerMenu_Body_RoundButton_List_Menu_People_Menu_People);
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_MailingLists_Menu_People_Menu_List_Menu_HamburgerMenu_AddListingWrapper()
	{
		clickOn(lnk_topMenu_HamburgerMenu_Body_RoundButton_List_Menu_People_Menu_MailingLists);
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_Overview_Menu_Portfolio_Menu_List_Menu_HamburgerMenu_AddListingWrapper()
	{
		clickOn(lnk_topMenu_HamburgerMenu_Body_RoundButton_List_Menu_Portfolio_Menu_Overview);
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_Air_Menu_Portfolio_Menu_List_Menu_HamburgerMenu_AddListingWrapper()
	{
		clickOn(lnk_topMenu_HamburgerMenu_Body_RoundButton_List_Menu_Portfolio_Menu_Air);
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_Div_Menu_Portfolio_Menu_List_Menu_HamburgerMenu_AddListingWrapper()
	{
		clickOn(lnk_topMenu_HamburgerMenu_Body_RoundButton_List_Menu_Portfolio_Menu_Div);
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_EvergreenFundDemo_Menu_Portfolio_Menu_List_Menu_HamburgerMenu_AddListingWrapper()
	{
		clickOn(lnk_topMenu_HamburgerMenu_Body_RoundButton_List_Menu_Portfolio_Menu_EvergreenFundDemo);
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_LaptTop_Menu_Portfolio_Menu_List_Menu_HamburgerMenu_AddListingWrapper()
	{
		clickOn(lnk_topMenu_HamburgerMenu_Body_RoundButton_List_Menu_Portfolio_Menu_LaptTop);
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_QS_Menu_Portfolio_Menu_List_Menu_HamburgerMenu_AddListingWrapper()
	{
		clickOn(lnk_topMenu_HamburgerMenu_Body_RoundButton_List_Menu_Portfolio_Menu_QS);
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_RTC_Menu_Portfolio_Menu_List_Menu_HamburgerMenu_AddListingWrapper()
	{
		clickOn(lnk_topMenu_HamburgerMenu_Body_RoundButton_List_Menu_Portfolio_Menu_RTC);
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_Rere_Menu_Portfolio_Menu_List_Menu_HamburgerMenu_AddListingWrapper()
	{
		clickOn(lnk_topMenu_HamburgerMenu_Body_RoundButton_List_Menu_Portfolio_Menu_Rere);
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_CreateAFund_Button_HamburgerMenu()
	{
		clickOn(btn_topMenu_HamburgerMenu_Body_CreateAFund);
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_ScoutForDeals_Button_HamburgerMenu()
	{
		clickOn(btn_topMenu_HamburgerMenu_Body_ScoutforDeals);
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_SendFeedback_Button_HamburgerMenu()
	{
		clickOn(btn_topMenu_HamburgerMenu_Body_SendFeedback);
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void verify_FooterLink_HamburgerMenu_displayed()
	{
		try 
		{
			waitForElementToDisplay(lbl_topMenu_HamburgerMenu_Body_Footer, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_topMenu_HamburgerMenu_Body_Footer))
			{
				testStepPassed("Footer Link in Hamburger Menu is displayed");	
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Footer Link in Hamburger Menu is not displayed");
		}
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_Blog_FooterLink_HamburgerMenu()
	{
		clickOn(lnk_topMenu_HamburgerMenu_Body_Footer_Blog);
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_Contact_FooterLink_HamburgerMenu()
	{
		clickOn(lnk_topMenu_HamburgerMenu_Body_Footer_Contact);
	}

	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_FAQ_FooterLink_HamburgerMenu()
	{
		clickOn(lnk_topMenu_HamburgerMenu_Body_Footer_FAQ);
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_Resources_FooterLink_HamburgerMenu()
	{
		clickOn(lnk_topMenu_HamburgerMenu_Body_Footer_Resources);
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_Terms_FooterLink_HamburgerMenu()
	{
		clickOn(lnk_topMenu_HamburgerMenu_Body_Footer_Terms);
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void verify_Fixed_SidBar_displayed()
	{
		try 
		{
			waitForElementToDisplay(lbl_Fixed_SideBar, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_Fixed_SideBar))
			{
				testStepPassed("Fixed Side Bar is displayed");	
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Fixed Side Bar is not displayed");
		}
	}


	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_Actions_Fixed_SideBar_HamburgerMenu()
	{
		waitForElementToDisplay(lnk_Fixed_SideBar_Actions, this.elementLoadWaitTime);
		clickOn(lnk_Fixed_SideBar_Actions);
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_CRM_Fixed_SideBar_HamburgerMenu()
	{
		waitForElementToDisplay(lnk_Fixed_SideBar_CRM, this.elementLoadWaitTime);
		clickOn(lnk_Fixed_SideBar_CRM);
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_Deals_Fixed_SideBar_HamburgerMenu()
	{
		waitForElementToDisplay(lnk_Fixed_SideBar_Deals, this.elementLoadWaitTime);
		clickOn(lnk_Fixed_SideBar_Deals);
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_Events_Fixed_SideBar_HamburgerMenu()
	{
		waitForElementToDisplay(lnk_Fixed_SideBar_Events, this.elementLoadWaitTime);
		clickOn(lnk_Fixed_SideBar_Events);
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_People_Fixed_SideBar_HamburgerMenu()
	{
		waitForElementToDisplay(lnk_Fixed_SideBar_People, this.elementLoadWaitTime);
		clickOn(lnk_Fixed_SideBar_People);
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_Portfolio_Fixed_SideBar_HamburgerMenu()
	{
		waitForElementToDisplay(lnk_Fixed_SideBar_Portfolio, this.elementLoadWaitTime);
		clickOn(lnk_Fixed_SideBar_Portfolio);
	}
	/**
	 *This method is used to click settings in HamburgerMenu.
	 *
	 *@author VijayaKumar.U
	 *
	 */
	public void click_Settings_Fixed_SideBar_HamburgerMenu()
	{
		try 		{
			waitForElementToDisplay(lnk_Fixed_SideBar_Settings, this.elementLoadWaitTime);
			clickOn(lnk_Fixed_SideBar_Settings);
		}
		catch (Exception e)		{
			e.printStackTrace();
			testStepFailed("Branding Tab is not displayed in Settings Page " + e.getClass());
		}	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_Tools_Fixed_SideBar_HamburgerMenu()
	{
		waitForElementToDisplay(lnk_Fixed_SideBar_Tools, this.elementLoadWaitTime);
		clickOn(lnk_Fixed_SideBar_Tools);
	}

	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_AddContact_Actions_Menu_Fixed_SideBar_HamburgerMenu()
	{
		waitForElementToDisplay(lnk_Fixed_SideBar_Actions_AddContact, this.elementLoadWaitTime);
		clickOn(lnk_Fixed_SideBar_Actions_AddContact);
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_AddDeal_Actions_Menu_Fixed_SideBar_HamburgerMenu()
	{
		waitForElementToDisplay(lnk_Fixed_SideBar_Actions_AddDeal, this.elementLoadWaitTime);
		clickOn(lnk_Fixed_SideBar_Actions_AddDeal);
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_CreateFund_Actions_Menu_Fixed_SideBar_HamburgerMenu()
	{
		waitForElementToDisplay(lnk_Fixed_SideBar_Actions_CreateFund, this.elementLoadWaitTime);
		clickOn(lnk_Fixed_SideBar_Actions_CreateFund);
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_CreateCommunity_Actions_Menu_Fixed_SideBar_HamburgerMenu()
	{
		waitForElementToDisplay(lnk_Fixed_SideBar_Actions_CreateCommunity, this.elementLoadWaitTime);
		clickOn(lnk_Fixed_SideBar_Actions_CreateCommunity);
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_AddBlogPost_Actions_Menu_Fixed_SideBar_HamburgerMenu()
	{
		waitForElementToDisplay(lnk_Fixed_SideBar_Actions_AddBlogPost, this.elementLoadWaitTime);
		clickOn(lnk_Fixed_SideBar_Actions_AddBlogPost);
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_AddEvent_Actions_Menu_Fixed_SideBar_HamburgerMenu()
	{
		waitForElementToDisplay(lnk_Fixed_SideBar_Actions_AddEvent, this.elementLoadWaitTime);
		clickOn(lnk_Fixed_SideBar_Actions_AddEvent);
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_SendGroupMail_Actions_Menu_Fixed_SideBar_HamburgerMenu()
	{
		waitForElementToDisplay(lnk_Fixed_SideBar_Actions_SendGroupEmail, this.elementLoadWaitTime);
		clickOn(lnk_Fixed_SideBar_Actions_SendGroupEmail);
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_UpdateCRM_Actions_Menu_Fixed_SideBar_HamburgerMenu()
	{
		waitForElementToDisplay(lnk_Fixed_SideBar_Actions_UpdateCRM, this.elementLoadWaitTime);
		clickOn(lnk_Fixed_SideBar_Actions_UpdateCRM);
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_AddMeeting_Actions_Menu_Fixed_SideBar_HamburgerMenu()
	{
		waitForElementToDisplay(lnk_Fixed_SideBar_Actions_AddMeeting, this.elementLoadWaitTime);
		clickOn(lnk_Fixed_SideBar_Actions_AddMeeting);
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_AddTask_Actions_Menu_Fixed_SideBar_HamburgerMenu()
	{
		waitForElementToDisplay(lnk_Fixed_SideBar_Actions_AddTask, this.elementLoadWaitTime);
		clickOn(lnk_Fixed_SideBar_Actions_AddTask);
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_ScoutforDeals_Actions_Menu_Fixed_SideBar_HamburgerMenu()
	{
		waitForElementToDisplay(lnk_Fixed_SideBar_Actions_ScoutForDeals, this.elementLoadWaitTime);
		clickOn(lnk_Fixed_SideBar_Actions_ScoutForDeals);
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_SendFeedback_Actions_Menu_Fixed_SideBar_HamburgerMenu()
	{
		waitForElementToDisplay(lnk_Fixed_SideBar_Actions_SendFeedback, this.elementLoadWaitTime);
		clickOn(lnk_Fixed_SideBar_Actions_SendFeedback);
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_Blog_Actions_Menu_Fixed_SideBar_HamburgerMenu()
	{
		waitForElementToDisplay(lnk_Fixed_SideBar_Actions_Blog, this.elementLoadWaitTime);
		clickOn(lnk_Fixed_SideBar_Actions_Blog);
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_Contact_Actions_Menu_Fixed_SideBar_HamburgerMenu()
	{
		waitForElementToDisplay(lnk_Fixed_SideBar_Actions_Contact, this.elementLoadWaitTime);
		clickOn(lnk_Fixed_SideBar_Actions_Contact);
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_FAQ_Actions_Menu_Fixed_SideBar_HamburgerMenu()
	{
		waitForElementToDisplay(lnk_Fixed_SideBar_Actions_FAQ, this.elementLoadWaitTime);
		clickOn(lnk_Fixed_SideBar_Actions_FAQ);
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_Newsletter_Actions_Menu_Fixed_SideBar_HamburgerMenu()
	{
		waitForElementToDisplay(lnk_Fixed_SideBar_Actions_Newsletter, this.elementLoadWaitTime);
		clickOn(lnk_Fixed_SideBar_Actions_Newsletter);
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_AddFund_Actions_Menu_Fixed_SideBar_HamburgerMenu()
	{
		waitForElementToDisplay(lnk_Fixed_SideBar_Actions_AddFund, this.elementLoadWaitTime);
		clickOn(lnk_Fixed_SideBar_Actions_AddFund);
	}

	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	//newly added_Priya.V
	public void click_AddDeal_Actions_Menu_Updated()
	{
		try {

			waitForElementToDisplay(lnk_Fixed_SideBar_Actions, this.elementLoadWaitTime);
			if(isElementDisplayed(lnk_Fixed_SideBar_Actions)) {
				testStepPassed("The Add Deal Actions menu is displayed .");
				clickOn(lnk_Fixed_SideBar_Actions);
				waitForElementToDisplay(lnk_Fixed_SideBar_Actions_AddDeal, this.elementLoadWaitTime);
				if(isElementDisplayed(lnk_Fixed_SideBar_Actions_AddDeal)) {
					clickOn(lnk_Fixed_SideBar_Actions_AddDeal);
				}
				else {
					testStepFailed("The Add Deal Actions menu is not displayed .");

				}}			
			else {
				testStepFailed("The Add Deal Actions menu is not displayed .");
			}				}
		catch(Exception e) {
			testStepFailed("The element is not displayed .");
		}}


	public void click_AddContact_Actions_Menu_Updated()
	{
		try {

			waitForElementToDisplay(lnk_Fixed_SideBar_Actions, this.elementLoadWaitTime);
			if(isElementDisplayed(lnk_Fixed_SideBar_Actions)) {
				testStepPassed("The Add Deal Actions menu is displayed .");
				clickOn(lnk_Fixed_SideBar_Actions);
				waitForElementToDisplay(lnk_Fixed_SideBar_Actions_AddContact, this.elementLoadWaitTime);
				if(isElementDisplayed(lnk_Fixed_SideBar_Actions_AddContact)) {

					clickOn(lnk_Fixed_SideBar_Actions_AddContact);
				}
				else {
					testStepFailed("The Add Deal Actions menu is not displayed .");

				}}			
			else {
				testStepFailed("The Add Deal Actions menu is not displayed .");
			}				}
		catch(Exception e) {
			testStepFailed("The element is not displayed .");
		}	}


	public void click_AddContact_Actions_Menu()
	{
		click_Actions_Fixed_SideBar_HamburgerMenu();
		click_AddContact_Actions_Menu_Fixed_SideBar_HamburgerMenu();
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */

	public void click_AddDeal_Actions_Menu()
	{
		click_Actions_Fixed_SideBar_HamburgerMenu();
		click_AddDeal_Actions_Menu_Fixed_SideBar_HamburgerMenu();
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_CreateFund_Actions_Menu()
	{
		click_Actions_Fixed_SideBar_HamburgerMenu();
		click_CreateFund_Actions_Menu_Fixed_SideBar_HamburgerMenu();
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_CreateCommunity_Actions_Menu()
	{
		click_Actions_Fixed_SideBar_HamburgerMenu();
		click_CreateCommunity_Actions_Menu_Fixed_SideBar_HamburgerMenu();
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_AddBlogPost_Actions_Menu()
	{
		click_Actions_Fixed_SideBar_HamburgerMenu();
		click_AddBlogPost_Actions_Menu_Fixed_SideBar_HamburgerMenu();
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_AddEvent_Actions_Menu()
	{
		click_Actions_Fixed_SideBar_HamburgerMenu();
		click_AddEvent_Actions_Menu_Fixed_SideBar_HamburgerMenu();
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_SendGroupEmail_Actions_Menu()
	{
		click_Actions_Fixed_SideBar_HamburgerMenu();
		click_SendGroupMail_Actions_Menu_Fixed_SideBar_HamburgerMenu();
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_UpdateCRM_Actions_Menu()
	{
		click_Actions_Fixed_SideBar_HamburgerMenu();
		click_UpdateCRM_Actions_Menu_Fixed_SideBar_HamburgerMenu();
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_AddMeeting_Actions_Menu()
	{
		click_Actions_Fixed_SideBar_HamburgerMenu();
		click_AddMeeting_Actions_Menu_Fixed_SideBar_HamburgerMenu();
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_AddTask_Actions_Menu()
	{
		click_Actions_Fixed_SideBar_HamburgerMenu();
		click_AddTask_Actions_Menu_Fixed_SideBar_HamburgerMenu();
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_ScoutforDeals_Actions_Menu()
	{
		click_Actions_Fixed_SideBar_HamburgerMenu();
		click_ScoutforDeals_Actions_Menu_Fixed_SideBar_HamburgerMenu();
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_SendFeedback_Actions_Menu()
	{
		click_Actions_Fixed_SideBar_HamburgerMenu();
		click_SendFeedback_Actions_Menu_Fixed_SideBar_HamburgerMenu();
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_Blog_Actions_Menu()
	{
		click_Actions_Fixed_SideBar_HamburgerMenu();
		click_Blog_Actions_Menu_Fixed_SideBar_HamburgerMenu();
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_Contact_Actions_Menu()
	{
		click_Actions_Fixed_SideBar_HamburgerMenu();
		click_Contact_Actions_Menu_Fixed_SideBar_HamburgerMenu();
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_FAQ_Actions_Menu()
	{
		click_Actions_Fixed_SideBar_HamburgerMenu();
		click_FAQ_Actions_Menu_Fixed_SideBar_HamburgerMenu();
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_NewsLetter_Actions_Menu()
	{
		click_Actions_Fixed_SideBar_HamburgerMenu();
		click_Newsletter_Actions_Menu_Fixed_SideBar_HamburgerMenu();
	}

	/**
	 * This method is used to logout from the the web application
	 *
	 *@author VijayaKumar.U
	 *
	 */
	public void logoutFromApplication()
	{try 
	{
		click_Application_Syndicate_LogoWrapper();
		click_Logout_Link();}
	catch (Exception e) 		{
		e.printStackTrace();
		testStepFailed("Failed to logout from the application "+ e.getClass());
	}	
	}

	public void scrollToElement(String elementlocator)
	{
		WebElement element = findWebElement(elementlocator);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public void scrollToVerifyNext_InvestmentHistory() {

		driver.findElement(By.xpath("//div[contains(@class,'section bg-lighter overflow-auto')]//div[contains(@class,'application-form-container')]")).click();
		WebElement element = driver.findElement(By.xpath("//div[contains(@class,'application-form')]//button[contains(text(),'Next')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public void verify_removeFundingRound()
	{
		driver.findElement(By.xpath("//div[contains(@class,'section bg-lighter overflow-auto')]//div[contains(@class,'application-form-container')]")).click();
		WebElement element = driver.findElement(By.xpath("//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//a[contains(text(),'Remove this funding round')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}
	public void scrollToViewDateClosed(String elementlocator) {
		driver.findElement(By.xpath("//div[contains(@class,'section bg-lighter overflow-auto')]//div[contains(@class,'application-form-container')]")).click();
		WebElement element = driver.findElement(By.xpath("(//div[contains(@class,'application-form')]//div[contains(@id,'tab-investment')]//span[contains(text(),'Date closed')]/parent::label/parent::div//input)[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}
	public void scrollToWebpageSkipVideoElement(String elementlocator) {
		driver.findElement(By.xpath("//div[contains(@class,'section bg-lighter overflow-auto')]//div[contains(@class,'application-form-container')]")).click();
		WebElement element = driver.findElement(By.xpath("//div[contains(@class,'application-form')]//a[contains(text(),'Skip Video')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public void scrollToWebpageBackVideoElement(String elementlocator) {
		driver.findElement(By.xpath("//div[contains(@class,'section bg-lighter overflow-auto')]//div[contains(@class,'application-form-container')]")).click();
		WebElement element = driver.findElement(By.xpath("//div[contains(@class,'application-form')]//a[contains(text(),'Back')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}


	public void scrollToBottomofPage()
	{
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	public void scrollToTopofPage()
	{
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, -document.body.scrollHeight)");
	}

	public void ScrollDown(){
		try	{
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,250)");
			testStepPassed("Scroll to the element ");
		}
		catch (Exception e)		{
			testStepFailed("Failed to scroll to element due to exception : " + e.getClass());
		}
	}

	public void ScrollUp()
	{
		try
		{
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,-350)");
			testStepPassed("Scroll to the element ");
		}
		catch (Exception e)
		{
			testStepFailed("Failed to scroll to element due to exception : " + e.getClass());
		}
	}
	/**
	 *
	 *@author VijayaKumar.U
	 *
	 */
	public void pressPageUp()
	{
		WebElement html = driver.findElement(By.tagName("html"));
		html.sendKeys(Keys.PAGE_UP);
	}
	/**This method is used to press keys for page down
	 *
	 *
	 *@author VijayaKumar.U
	 */
	public void pressPageDown()
	{
		WebElement html = driver.findElement(By.tagName("html"));
		html.sendKeys(Keys.PAGE_DOWN);
	}
	/**
	 *This method is used to move to Top of the page.
	 *
	 *@author VijayaKumar.U
	 */
	public void movetoTopofPage()
	{
		WebElement html = driver.findElement(By.tagName("html"));
		html.sendKeys(Keys.CONTROL,Keys.HOME);
	}
	/**
	 *This method is used to move bottom of the page.
	 *
	 *@author VijayaKumar.U
	 */
	public void movetoBottomofPage()
	{
		WebElement html = driver.findElement(By.tagName("html"));
		html.sendKeys(Keys.CONTROL,Keys.END);
	}
	/**
	 *This method is used to enter and search the values in Search Bar.
	 *@author VijayaKumar.U
	 *
	 */
	public void search_ValuesinSearchBar(String searchTerm)
	{
		enter_SearchText(searchTerm);
	}
	/**
	 *This method is to verify the user profile page Search using profileName
	 *
	 *@profileName
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_Searched_UserProfile_displayed_and_Open_UserProfilePage(String profileName)	{
		try 	{
			waitForElementToDisplay(lst_topMenu_SearchBar_AutoCompleteList, this.elementLoadWaitTime);

			if (isElementDisplayed(lst_topMenu_SearchBar_AutoCompleteList)) {
				testStepPassed("Search Bar auto complete is displayed");

				String getUserProfileNamefromAutoCompleteList = driver.findElement(By.xpath("(//nav[contains(@class,'top header')]//div[contains(@class,'menu-nav-search-bar')]//div[contains(@class,'autcomplete-list')]//a[contains(@href,'profiles')])[1]")).getAttribute("title").trim();

				try 		{
					if (getUserProfileNamefromAutoCompleteList.contains(profileName)) 	{
						testStepPassed("Searched Corresponding Profile is displayed");

						waitTime(1);

						driver.findElement(By.xpath("(//nav[contains(@class,'top header')]//div[contains(@class,'menu-nav-search-bar')]//div[contains(@class,'autcomplete-list')]//a[contains(@href,'profiles')])[1]//div")).click();
					}		} 
				catch (Exception e) 	{
					testStepFailed("Searched Corresponding Profile is not displayed");
				}			}		} 
		catch (Exception e) 		{
			testStepFailed("Search Bar auto complete is not displayed");
		}	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void verify_Searched_Company_displayed_and_Open_CompanyProfilePage(String companyLegalName)	{
		try 		{
			waitForElementToDisplay(lst_topMenu_SearchBar_AutoCompleteList, this.elementLoadWaitTime);
			if (isElementDisplayed(lst_topMenu_SearchBar_AutoCompleteList)) 			{
				testStepPassed("Search Bar auto complete is displayed");
				String getCompanyProfileLegalNamefromAutoCompleteList = driver.findElement(By.xpath("(//nav[contains(@class,'top header')]//div[contains(@class,'menu-nav-search-bar')]//div[contains(@class,'autcomplete-list')]//a[contains(@href,'orgs')])[1]")).getAttribute("title").trim();
				try 				{
					if (getCompanyProfileLegalNamefromAutoCompleteList.contains(companyLegalName)) 					{
						testStepPassed("Searched Corresponding Profile is displayed");

						waitTime(1);

						driver.findElement(By.xpath("(//nav[contains(@class,'top header')]//div[contains(@class,'menu-nav-search-bar')]//div[contains(@class,'autcomplete-list')]//a[contains(@href,'orgs')])[1]//div")).click();
					}				} 
				catch (Exception e) 				{
					testStepFailed("Searched Corresponding Profile is not displayed");
				}		}		} 
		catch (Exception e) 		{
			testStepFailed("Search Bar auto complete is not displayed");
		}	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void verify_delete_action_completed_successfully()	{
		try 		{
			waitForElementToDisplay(lbl_Deleted_SuccessDialog, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_Deleted_SuccessDialog))			{
				testStepPassed("Delete action completed Successfully");
			}		} 
		catch (Exception e) 		{
			testStepFailed("Delete action is not completed Successfully");
		}	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	//-------------Edited Priya.V -------Added Else Part---------//
	public void verify_User_Profile_Account_Deleted_Successfully()	{

		try 	{
			/*waitForElementToDisplay(lbl_SuccessDialog, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_SuccessDialog))	{
				testStepPassed("Delete confirmation dialog is displayed");
			}		
			else {
				testStepFailed("Delete confirmation dialog is not displayed");
			}*/
		} 
		catch (Exception e) 		{
			testStepFailed("Couldnot verify the dialog window."+e.getClass());
			e.printStackTrace();
		}	}

	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	//---------------Edited Priya.V -------added Else part----------//
	public void verify_Company_Deleted_Successfully()	{
		try 	{
			waitForElementToDisplay(lbl_SuccessDialog, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_SuccessDialog))			{
				testStepPassed("Delete confirmation dialog is displayed");

				if(isElementDisplayed(lbl_Company_Deleted_Success_Message))		{
					testStepPassed("Company deleted from the system success message is displayed");
				}		
				else{

					testStepFailed("Company deleted from the system success message is not displayed");
				}} 

			else{
				testStepPassed("Delete confirmation dialog is not displayed");

			}		} 
		catch (Exception e) 	{
			testStepFailed("Dialog window not verified."+e.getClass());
		}
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void verify_New_User_Profile_Contact_Added_Successfully(){
		try {
			waitForElementToDisplay(lbl_SuccessDialog, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_SuccessDialog)){
				testStepPassed("Success confirmation dialog is displayed");

				if(isElementDisplayed(lbl_UserProfileAccount_Contact_Added_Success_Message)){
					testStepPassed("New User Profile Account Contact added success message is displayed");
				}	} 		}	
		catch (Exception e)	{
			testStepFailed("Success confirmation dialog is not displayed");
		}	}



	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void enter_Email(String email)
	{
		waitForElementToDisplay(txt_LoginForm_EmailAddress, this.elementLoadWaitTime);
		typeIn(txt_LoginForm_EmailAddress, email);
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void enter_Password(String password)
	{
		waitForElementToDisplay(txt_LoginForm_Password, this.elementLoadWaitTime);
		typeIn(txt_LoginForm_Password, password);
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void click_login_button()
	{
		waitForElementToDisplay(btn_LoginForm_Login, this.elementLoadWaitTime);
		clickOn(btn_LoginForm_Login);
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void loginIntoApplication(String email, String password)
	{
		enter_Email(email);
		enter_Password(password);
		click_login_button();
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void verify_PHP_Debugger_Option_Displayed_Close_Debugger_Option()	{
		try 	{
			if (isElementDisplayed(lbl_Bottom_PHP_Debugger_Header_None)) 	{
				testStepPassed("PHP Debugger section is not displayed");
			}		} 
		catch (Exception e) 		{
			testStepPassed("PHP Debugger section is displayed");
			clickOn(lnk_Bottom_PHP_Debugger_Close );
		}

		try 		{
			if (isElementDisplayed(lbl_Bottom_PHP_Debugger_Header_MiniDesign)) 			{
				testStepPassed("PHP Debugger Mini design section is not displayed");
			}
		} 
		catch (Exception e) 		{
			testStepPassed("PHP Debugger Mini design section is displayed");
			clickOn(lnk_Bottom_PHP_Debugger_Close );
		}	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void scrolltoElementView(WebElement element)
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true);",element);
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void verify_Company_Section_EditCompanyProfile_Updated_Successfully()	{
		try 		{
			waitForElementToDisplay(lbl_SuccessDialogLabel, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_SuccessDialogLabel))			{
				testStepPassed("Success dialog is displayed");
				try 		{		
					if(driver.findElement(By.xpath("//div[contains(@class,'swal2-popup swal2-modal swal2-icon-success')]//*[contains(text(),'Company section has been updated')]")).isDisplayed())
					{
						testStepPassed("Company Section in Edit Company Profile updated success message is displayed");
						clickOn(btn_SuccessDialog_Ok);
					}	} 
				catch (Exception e) 	{
					testStepFailed("Company Section in Edit Company Profile updated success message is not displayed");
				}	}		} 
		catch (Exception e) 		{
			testStepFailed("Success dialog is not displayed");
		}	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void verify_Contact_Section_EditCompanyProfile_Updated_Successfully()	{
		try 		{
			waitForElementToDisplay(lbl_SuccessDialogLabel, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_SuccessDialogLabel))			{
				testStepPassed("Success dialog is displayed");
				try 				{
					if(driver.findElement(By.xpath("//div[contains(@class,'swal2-popup swal2-modal swal2-icon-success')]//*[contains(text(),'Contact section has been updated')]")).isDisplayed())
					{
						testStepPassed("Contact Section in Edit Company Profile updated success message is displayed");
						clickOn(btn_SuccessDialog_Ok);
					}				} 
				catch (Exception e) 				{
					testStepFailed("Contact Section in Edit Company Profile updated success message is not displayed");
				}		}		} 
		catch (Exception e) 		{
			testStepFailed("Success dialog is not displayed");
		}	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void verify_Description_Section_EditCompanyProfile_Updated_Successfully()	{
		try 		{
			waitForElementToDisplay(lbl_SuccessDialogLabel, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_SuccessDialogLabel))			{
				testStepPassed("Success dialog is displayed");
				try 				{
					if(driver.findElement(By.xpath("//div[contains(@class,'swal2-popup swal2-modal swal2-icon-success')]//*[contains(text(),'Description section has been updated')]")).isDisplayed())
					{
						testStepPassed("Description Section in Edit Company Profile updated success message is displayed");
						clickOn(btn_SuccessDialog_Ok);
					}			} 
				catch (Exception e) {
					testStepFailed("Description Section in Edit Company Profile updated success message is not displayed");
				}		}		} 
		catch (Exception e) 
		{			testStepFailed("Success dialog is not displayed");
		}	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void verify_Digital_Section_EditCompanyProfile_Updated_Successfully()	{
		try 		{		
			waitForElementToDisplay(lbl_SuccessDialogLabel, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_SuccessDialogLabel))	{
				testStepPassed("Success dialog is displayed");
				try 	{
					if(driver.findElement(By.xpath("//div[contains(@class,'swal2-popup swal2-modal swal2-icon-success')]//*[contains(text(),'Digital section has been updated')]")).isDisplayed())
					{
						testStepPassed("Digital Section in Edit Company Profile updated success message is displayed");
						clickOn(btn_SuccessDialog_Ok);
					}			} 
				catch (Exception e) 	{
					testStepFailed("Digital Section in Edit Company Profile updated success message is not displayed");
				}		}	} 
		catch (Exception e) 		{
			testStepFailed("Success dialog is not displayed");
		}	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void verify_Finance_Section_EditCompanyProfile_Updated_Successfully()	{
		try 	{
			waitForElementToDisplay(lbl_SuccessDialogLabel, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_SuccessDialogLabel))			{
				testStepPassed("Success dialog is displayed");
				try 	{				
					if(driver.findElement(By.xpath("//div[contains(@class,'swal2-popup swal2-modal swal2-icon-success')]//*[contains(text(),'Finance section has been updated')]")).isDisplayed())
					{
						testStepPassed("Finance Section in Edit Company Profile updated success message is displayed");
						clickOn(btn_SuccessDialog_Ok);
					}				} 
				catch (Exception e) 				{
					testStepFailed("Finance Section in Edit Company Profile updated success message is not displayed");
				}		}		} 
		catch (Exception e) 		{
			testStepFailed("Success dialog is not displayed");
		}	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void verify_Industry_Section_EditCompanyProfile_Updated_Successfully()	{
		try 	{
			waitForElementToDisplay(lbl_SuccessDialogLabel, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_SuccessDialogLabel))		{
				testStepPassed("Success dialog is displayed");
				try 	{
					if(driver.findElement(By.xpath("//div[contains(@class,'swal2-popup swal2-modal swal2-icon-success')]//*[contains(text(),'Industry section has been updated')]")).isDisplayed())
					{
						testStepPassed("Industry Section in Edit Company Profile updated success message is displayed");
						clickOn(btn_SuccessDialog_Ok);
					}		} 
				catch (Exception e) 	{
					testStepFailed("Industry Section in Edit Company Profile updated success message is not displayed");
				}		}		} 
		catch (Exception e) 	{
			testStepFailed("Success dialog is not displayed");
		}	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void verify_Keywords_Section_EditCompanyProfile_Updated_Successfully(){
		try 	{
			waitForElementToDisplay(lbl_SuccessDialogLabel, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_SuccessDialogLabel))	{
				testStepPassed("Success dialog is displayed");
				try 	{
					if(driver.findElement(By.xpath("//div[contains(@class,'swal2-popup swal2-modal swal2-icon-success')]//*[contains(text(),'Keywords section has been updated')]")).isDisplayed())
					{
						testStepPassed("Keywords Section in Edit Company Profile updated success message is displayed");
						clickOn(btn_SuccessDialog_Ok);
					}			} 
				catch (Exception e) {
					testStepFailed("Keywords Section in Edit Company Profile updated success message is not displayed");
				}		}		} 
		catch (Exception e) 		{
			testStepFailed("Success dialog is not displayed");		}
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void verify_Regions_Section_EditCompanyProfile_Updated_Successfully(){
		try 	{
			waitForElementToDisplay(lbl_SuccessDialogLabel, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_SuccessDialogLabel))		{
				testStepPassed("Success dialog is displayed");

				if(driver.findElement(By.xpath("//div[contains(@class,'swal2-popup swal2-modal swal2-icon-success')]//*[contains(text(),'Region section has been updated')]")).isDisplayed())
				{
					testStepPassed("Regions Section in Edit Company Profile updated success message is displayed");
					clickOn(btn_SuccessDialog_Ok);
				}	} }
		catch (Exception e) 		{
			testStepFailed("Success dialog is not displayed");
		}	}
	public void scrollToNextInvestmentRegistration() {
		driver.findElement(By.xpath("//div[contains(@class,'section bg-lighter overflow-auto')]//div[contains(@class,'application-form-container')]")).click();
		WebElement element = driver.findElement(By.xpath("//div[contains(@class,'application-form')]//button[contains(text(),'Next')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void scrollToBackInvestmentRegistration() {
		driver.findElement(By.xpath("//div[contains(@class,'section bg-lighter overflow-auto')]//div[contains(@class,'application-form-container')]")).click();
		WebElement element = driver.findElement(By.xpath("//div[contains(@class,'application-form')]//button[contains(text(),'Back')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

	}
	public void verify_Marketing_Section_EditCompanyProfile_Updated_Successfully()	{
		try 		{
			waitForElementToDisplay(lbl_SuccessDialogLabel, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_SuccessDialogLabel))			{
				testStepPassed("Success dialog is displayed");

				if(driver.findElement(By.xpath("//div[contains(@class,'swal2-popup swal2-modal swal2-icon-success')]//*[contains(text(),'Marketing')]")).isDisplayed())
				{
					testStepPassed("Marketing Section in Edit Company Profile updated success message is displayed");
					clickOn(btn_SuccessDialog_Ok);
				}		}		} 
		catch (Exception e) 		{
			testStepFailed("Success dialog is not displayed");
		}	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public void verify_CommunitySettings_Section_EditCompanyProfile_Updated_Successfully()	{
		try 		{
			waitForElementToDisplay(lbl_SuccessDialogLabel, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_SuccessDialogLabel))
			{
				testStepPassed("Success dialog is displayed");

				if(driver.findElement(By.xpath("//div[contains(@class,'swal2-popup swal2-modal swal2-icon-success')]//*[contains(text(),'Community Setting section has been updated')]")).isDisplayed())
				{
					testStepPassed("Community Settings Section in Edit Company Profile updated success message is displayed");
					clickOn(btn_SuccessDialog_Ok);
				}				} 			} 
		catch (Exception e) 
		{
			testStepFailed("Success dialog is not displayed");
		}
	}
	public void pressPageDowntillelementVisible() {

		//	clickOn("Application Form#xpath=(//div[contains(@class,'application-form-container')])[1]");
		pressPageDown();
	}
	public void pressPageDownforInvestmentHistoryForm(String element)
	{
		try {
			if(!isElementDisplayed(element)) {
				for(int i=0;i<5;i++) {
					clickOn("To perform Scroll Down#xpath=(//div[contains(@class,'application-form-container')])[1]");                
					pressPageDown();
					if(isElementDisplayed(element)) {
						break;
					}
				}
			}
		}catch (Exception e) 		{
			testStepFailed("Element is not displayed");
		}
	}
	public void pressPageDowntillelementVisibleforFounderForm(String element)
	{
		try {
			if(!isElementDisplayed(element)) {
				for(int i=0;i<5;i++) {
					//            	 clickOn("To perform Scroll Down#xpath=//div[contains(@class,'application-form-container')]");      
					//            	 ScrollDown();
					clickOn("To perform Scroll Down#xpath=(//div[contains(@class,'application-form-container')])[1]");                
					pressPageDown();
					if(isElementDisplayed(element)) {
						break;
					}
				}
			}
		}
		catch (Exception e) 		{
			testStepFailed("Element is not displayed");
		}
	}
	/**
	 *@author VijayaKumar.U
	 *
	 *
	 */
	public String get_working_Directory_Path()
	{
		String userDirectory = System.getProperty("user.dir");
		return userDirectory;
	}
	public void hidekeyboard() {
		try {
			System.out.println(obj.osPlatform);
			if (obj.osPlatform.equals("Android")) {
				AndroidDriver<MobileElement> androidDriver = (AndroidDriver) driver;
				androidDriver.hideKeyboard();    
			}


		} catch (Exception e) {
			ApplicationKeywords.writeToLogFile("ERROR", e.toString());
		}
	}
	public void pressPageDowntillelementVisible(String element)
	{
		if(!isElementDisplayed(element)) {
			for(int i=0;i<5;i++) {
				clickOn("To perform Scroll Down#xpath=(//div[contains(@class,'application-form-container')])[1]");				
				pressPageDown();
				if(isElementDisplayed(element)) {
					break;
				}
			}
		}
	}
	//newly added_Priya.V
	public void select_ApplicationTypePage_Investor()
	{
		try {
			waitForElementToDisplay(lbl_Investor, this.elementLoadWaitTime);
			WebElement ele = findWebElement(lbl_Investor);
			if(!ele.isSelected()){
				clickOn(lbl_Investor);
				testStepPassed("The Investor option is selected.Continue button is enabled.");
				clickOn(btn_Continue);
			}

		}
		catch (Exception e) {
			e.printStackTrace();
			testStepFailed("Continue button is disabled. " + e.getClass());
		}
	}
	/**
	 * From Add contact Methods
	 * @param locator
	 * @param 
	 */
	public void getElementInPlaceholder(String locator, String expectedText)
	{
		try
		{
			waitTime(1);
			List<WebElement> namelist = findWebElements(locator);
			String actualText = "";
			boolean status = false;
			for (WebElement element : namelist)
			{
				if(element.isDisplayed())
				{
					actualText = element.getAttribute("placeholder").trim();
					if(actualText.equalsIgnoreCase(expectedText))
					{

						status = true;
						testStepPassed("Placeholder is present: " +actualText);
						break;
					}
				}
			}
			if(status == false)
			{
				testStepFailed("Expected Text " + expectedText + " does not match with Actual Text " + actualText);
			}
		}
		catch(Exception ex)
		{
			testStepFailed("Exception in the method getElementAndClick" +ex);
		}
	}
	public void scrollUp(String locator)
	{
		try
		{
			JavascriptExecutor scrollup = (JavascriptExecutor) driver;
			scrollup.executeScript("arguments[0].scrollIntoView(false)",findWebElement(locator));
			System.out.println("ScrollUp element successfully");
		}
		catch(Exception e)
		{
			System.err.println(e.getMessage());
		}
	}

	public void scrollDown(String locator)
	{
		try
		{
			JavascriptExecutor scrollDown = (JavascriptExecutor) driver;
			scrollDown.executeScript("arguments[0].scrollIntoView(true)",findWebElement(locator));
			System.out.println("Scroll Down element successfully");
		}
		catch(Exception e)
		{
			System.err.println(e.getMessage());
		}
	}
	public void verifyDefaultElementIsSelected(String expectedText)
	{
		try
		{
			waitTime(1);
			List<WebElement> namelist = findWebElements(GOR.clk_salutation.replace("<PLACEHOLDER>",expectedText));
			String actualText = "";
			boolean status = false;
			for (WebElement element : namelist)
			{
				if(element.isDisplayed())
				{
					actualText = element.getText().trim();
					if(actualText.equalsIgnoreCase(expectedText))
					{
					
						status = true;
						testStepPassed(actualText +" is validated and clicked");
						break;
					}
				}
			}
			if(status == false)
			{
				testStepFailed("Expected Text " + expectedText + " does not match with Actual Text " + actualText);
			}
		}
		catch(Exception ex)
		{
			testStepFailed("Exception in the method getElementAndClick" +ex);
		}

	}

	public void validateElementTextIsDisplayed(String objLocator)
	{
		try
		{
			parseidentifyByAndlocator(objLocator);
			waitForElementToDisplay(objLocator , 10);
			if(elementPresent(objLocator))
			{
				testStepPassed(getText(objLocator) + " is Displayed");
			}
			else
			{
				testStepFailed(this.locatorDescription +" is not displayed");
			}
		}
		catch(Exception e)
		{
			testStepFailed("Exception in the method validateElementTextIsDisplayed " +e.toString());
		}
	}
	
public String randomCharacters(String numOfCharacters)
{
	int num = Integer.parseInt(numOfCharacters);
	String randomCharacters = RandomStringUtils.randomAlphabetic(num);
	return randomCharacters;
}


public void maximunMinimumValidation(String actualLocator,String maxLength)
{

	String randomCharacter = randomCharacters(maxLength);
	typeIn(actualLocator, randomCharacter);//actualLocator
	WebElement typedValue = findWebElement(actualLocator);
	String enterText=typedValue.getText();
	int size =  enterText.length();
	int maxNum =Integer.parseInt(maxLength);
	if (size <= maxNum ) {
		testStepPassed("The Length of Functionality is worked");
	}

	else {
		testStepFailed("No limit is set");	
	}
}

public void validateMaxCountCharacterOfErrorMessage(String actualLocator, String tabLocator, String errorLocator, String maxLength ) {

	try {
		String randomCharacter = randomCharacters(maxLength);
		typeIn(actualLocator, randomCharacter);//actualLocator
		clickOn(tabLocator);//tabLocator
		//Application not throw errors hence below isElementDisplayed Methods will be changes error 
		if(isElementDisplayed(errorLocator))//errorLocator
		{
			testStepPassed("Maximum and Minimum length values Enterded As Expected:"  + randomCharacter);

		}else
			testStepFailed("No  maximun and minium limit is set");
	

	}catch (Exception e) 		{

		testStepFailed("Exception in countOFCharacter"+e.toString());
		e.printStackTrace();
	}	
}
public String randomNumber(String Numbers)
{
	int num = Integer.parseInt(Numbers);
	String randomNumber = RandomStringUtils.randomNumeric(num);
	return randomNumber;
}
public void maximunMinimumValidationNumbers(String actualLocator,String maxLength)
{

	String randomNumbers = randomNumber(maxLength);
	typeIn(actualLocator, randomNumbers);//actualLocator
	WebElement typedValue = findWebElement(actualLocator);
	String enterText=typedValue.getText();
	int size =  enterText.length();
	int maxNum =Integer.parseInt(maxLength);
	if (size <= maxNum ) {
		testStepPassed("The Length of Functionality is worked");
	}

	else {
		testStepFailed("No limit is set");	
	}
}

public void validateMaxCountNumbersOfErrorMessage(String actualLocator, String tabLocator, String errorLocator, String maxLength ) {

	try {
		String  randomNumbers = randomNumber(maxLength);
		typeIn(actualLocator,  randomNumbers);//actualLocator
		clickOn(tabLocator);//tabLocator
		//Application not throw errors hence below isElementDisplayed Methods will be changes error 
		if(isElementDisplayed(errorLocator))//errorLocator
		{
			testStepPassed("Maximum and Minimum length values Enterded As Expected:"  +  randomNumbers);

		}else
			testStepFailed("No  maximun and minimum limit is set");
		//tab //error//

	}catch (Exception e) 		{

		testStepFailed("Exception in countOFNumbers"+e.toString());
		e.printStackTrace();
	}	
}
public String randomAlphaNumeric(String numOfAlphaNumeric)
{
	int num = Integer.parseInt(numOfAlphaNumeric);
	String randomAlphaNumeric = RandomStringUtils.randomAlphanumeric(num);
	return randomAlphaNumeric;
}
public void maximunMinimumAlphaNumericValidation(String actualLocator,String maxLength)
{
	String randomAlphaNumeric = randomAlphaNumeric(maxLength);
	typeIn(actualLocator, randomAlphaNumeric);//actualLocator
	WebElement typedValue = findWebElement(actualLocator);
	String enterText=typedValue.getText();
	int size =  enterText.length();
	int maxNum =Integer.parseInt(maxLength);
	if (size <= maxNum ) {
		testStepPassed("The Length of Functionality is worked");
	}
	else {
		testStepFailed("No limit is set");	
	}
}
public void validateMaxCountAlphaNumericOfErrorMessage(String actualLocator, String tabLocator, String errorLocator, String maxLength ) {

	try {
		String randomAlphaNumeric = randomAlphaNumeric(maxLength);
		typeIn(actualLocator, randomAlphaNumeric);//actualLocator			
		clickOn(tabLocator);//tabLocator
		//Application not throw errors hence below isElementDisplayed Methods will be changes error 
		if(isElementDisplayed(errorLocator))//errorLocator
		{
			testStepPassed("Maximum and Minimum length values Enterded As Expected" + randomAlphaNumeric);
		}else
			testStepFailed("No  maximun and minimum limit is set");
		//tab //error//

	}catch (Exception e) 		{

		testStepFailed("Exception in countOFNumber"+e.toString());
		e.printStackTrace();
	}	
}




public String randomAsciiValues(String numOfAlphaNumeric)
{
	int num = Integer.parseInt(numOfAlphaNumeric);
	String randomAscii = RandomStringUtils.randomAscii(num);
	return randomAscii;
}

public void maximunMinimumAsciiValidation(String actualLocator,String maxLength)
{
	String  randomAscii= randomAsciiValues(maxLength);
	typeIn(actualLocator, randomAscii);//actualLocator
	WebElement typedValue = findWebElement(actualLocator);
	String enterText=typedValue.getText();
	int size =  enterText.length();
	int maxNum =Integer.parseInt(maxLength);
	if (size <= maxNum ) {
		testStepPassed("The Length of Functionality is worked");
	}
	else {
		testStepFailed("No limit is set");	
	}
}


public void validateMaxCountAsciiOfErrorMessage(String actualLocator, String tabLocator, String errorLocator, String maxLength ) {

	try {
		String  randomAscii= randomAsciiValues(maxLength);
		typeIn(actualLocator, randomAscii);//actualLocator		
		clickOn(tabLocator);//tabLocator
		//Application not throw errors hence below isElementDisplayed Methods will be changes error 
		if(isElementDisplayed(errorLocator))//errorLocator
		{
			testStepPassed("Maximum and Minimum length values Enterded As Expected" + randomAscii);
		}else
			testStepFailed("No  maximun and minimum limit is set");
		//tab //error//

	}catch (Exception e) 		{

		testStepFailed("Exception in countOFNumber"+e.toString());
		e.printStackTrace();
	}	
}
public void resetApp()
{
    try
    {
        driver.get(getConfigProperty("AppURL"));
        waitTime(2);
        logOut();
    }
    catch(Exception e)
    {
        testStepFailed("Exception in the method resetApp " +e.toString());
    }
}

public void logOut()
{
    try
    {
        waitForElementToDisplay(img_ProfileIcon, 10);
        if(isElementDisplayed(img_ProfileIcon))
        {
            clickOn(img_ProfileIcon);
            verifyElementIsDisplayed(btn_Logout);
            clickOn(btn_Logout);
            verifyElementIsDisplayed(txt_loginbtn);
            testStepPassed("Logout Sucessfully");
        }
        else
        {
            testStepFailed("Unable login the Application");
        }
    }
    catch (Exception e) {
        testStepFailed("Exception in the Method login"+e.toString());
    }

}
//Need to check
public void validateAddNewbutton(String sideBarText,String addNewText)
{
    try
    {
        waitTime(3);
        getElementAndClick(btn_SideBar,sideBarText);//Actions
        getElementAndClick(drp_Actions,addNewText);//Add New Listing
    }
    catch(Exception e)
    {
        testStepFailed("Exception in the Method validateAddNewbutton:"+e.toString());
    }
}
public void getText(String locator, String expectedText)
{
    try
    {
        boolean status = false;
        List<WebElement> elementList = findWebElements(locator);
        String actualText = "";



        for (WebElement element : elementList) 
        {
            actualText = element.getText().trim();
            if(actualText.contains(expectedText)) 
            {
                status = true;
                testStepPassed("Expected condition meets with Actual condition " +actualText);
                break;
            }
        }
        if(status == false)
        {
            testStepFailed("<< Expected condition doesn't meet with Actual condition >> " +expectedText);
        }
    }
    catch(Exception e)
    {
        testStepFailed("Exception in the method getText " +e.toString());
    }
}

    public void getElementAndClick(String locator, String expectedText)
    {
        try
        {
            //waitTime(1);
            List<WebElement> namelist = findWebElements(locator);
            String actualText = "";
            boolean status = false;
            for (WebElement element : namelist)
            {
                if(element.isDisplayed())
                {
                    actualText = element.getText().trim();
                    if(actualText.equalsIgnoreCase(expectedText))
                    {
                        element.click();
                        status = true;
                        testStepPassed(actualText +" is validated and clicked");
                        break;
                    }
                }
            }
            if(status == false)
            {
                testStepFailed("Expected Text " + expectedText + " does not match with Actual Text " + actualText);
            }
        }
        catch(Exception ex)
        {
            testStepFailed("Exception in the method getElementAndClick" +ex);
        }
}
    public void getTextMatch(String actualText, String expectedText)
    {
        try
        {
            if(actualText.trim().equals(expectedText)) 
            {
                testStepPassed("Expected condition meets with Actual condition " + actualText.trim());
            }
            else
            {
                testStepFailed("Expected condition doesn't meet with Actual condition " + expectedText);
            }
        }
        catch(Exception e)
        {
            testStepFailed("Exception in the method getTextMatch " +e.toString());
        }
    }


    public void selectDropDown(String objLocator,String expectedText)
    {
        try
        {
            WebElement element = findWebElement(objLocator);
            String actualText = "";
            boolean status = false;
            verifyElementIsDisplayed(objLocator);
            Select select = new Select(element);
            List<WebElement> ListOption = select.getOptions();
            for (int i = 0; i < ListOption .size(); i++) 
            {
                WebElement option = ListOption.get(i);
                actualText = option.getText().trim();
                if(actualText.equals(expectedText))
                {
                   select.selectByVisibleText(actualText);
                    element.click();
                    status = true;
                    testStepPassed(actualText +" is validated and clicked");
                    WebElement selectedOption = select.getFirstSelectedOption();
                    getTextMatch(selectedOption.getText(), expectedText);
                    break;
                }
            }
        if(status == false)
        {
            testStepFailed("Expected Text " + expectedText + " does not match with Actual Text " + actualText);
        }
    }
    catch(Exception ex)
    {
        testStepFailed("Exception in the method selectDropDown" +ex.toString());
    }
}
    public void scrollDownElement(String objLocator)
    {
        try
        {
            JavascriptExecutor scroll = (JavascriptExecutor)driver;
            scroll.executeScript("arguments[0].scrollIntoView(true)",findWebElement(objLocator));
            if(isElementDisplayed(objLocator))
            {
                testStepPassed("Scrolled down the Element");
            }
            else
            {
                testStepFailed("Unable to scroll to Element ");
            }
        }
        catch (Exception e)
        {
            testStepFailed("Exception in the method scrollDown" + e.toString());
        }
    }

    public void scrollUpElement(String objLocator)
    {
        try
        {
            JavascriptExecutor scroll = (JavascriptExecutor)driver;
            scroll.executeScript("arguments[0].scrollIntoView(false)",findWebElement(objLocator));
            if(isElementDisplayed(objLocator))
            {
                testStepPassed("Scrolled Up the Element");
            }
            else
            {
                testStepFailed("Unable to scrollUp to Element ");
            }
        }
        catch (Exception e)
        {
            testStepFailed("Exception in the method scrollUp" + e.toString());
        }
}
    public void verifyElementIsEnabled(String objLocator)
    {
        try
        {
            verifyElementIsDisplayed(objLocator);
            WebElement element = findWebElement(objLocator);
            if(element.isEnabled())
            {
                testStepPassed("Element is Enabled");
            }
            else
            {
                testStepFailed("Element is Not Enabled");
            }
        }
        catch (Exception e)
        {
            testStepFailed("Exception in the method verifyElementIsEnabled" + e.toString());
        }
    }

    public void verifyElementIsNotEnabled(String objLocator)
    {
        try
        {
            verifyElementIsDisplayed(objLocator);
            WebElement element = findWebElement(objLocator);
            if(element.isEnabled())
            {
                testStepPassed("Element is Not Enabled");
            }
            else
            {
                testStepFailed("Element is Enabled");
            }
        }
        catch (Exception e)
        {
            testStepFailed("Exception in the method verifyElementIsEnabled" + e.toString());
        }
    }
        public void validateIsElementDisplayed(WebElement element, String inputText)
        {
            try
            {
                if(element.isDisplayed())
                {
                    testStepPassed(inputText + " is Displayed");
                }
                else
                {
                    testStepFailed(inputText + " is Not Displayed");
                }
            } 
            catch (Exception e)    
            {
                testStepFailed("Exception in method validateIsElementDisplayed: "+e.toString());
            }    
        }

        public boolean elementDisplayed(String objLocator)
        { 
            boolean status = false;
            WebElement element;
            try 
            {
                element = findWebElement(objLocator);
                if(element.isDisplayed())
                {
                    status = true;
                }
            } 
            catch (Exception e) 
            {
                status = false;
            }
            return status;
        }

        public void clickDropDownValue(String objlocator)
        {
            try
            {
                List<WebElement> listOfElement= findWebElements(objlocator);
                listOfElement.get(0).click();
            }
            catch (Exception e)    
            {
                testStepFailed("Exception in method clickDropDownValue: "+e.toString());
            }    
}
    }




















