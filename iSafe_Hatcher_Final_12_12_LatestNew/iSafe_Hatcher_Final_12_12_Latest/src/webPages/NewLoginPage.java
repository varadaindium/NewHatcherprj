package webPages;

import baseClass.BaseClass;
import iSAFE.ApplicationKeywords;

public class NewLoginPage extends ApplicationKeywords {


	private static final String lnk_createAFund = "Create a Fund Quick Link#xpath=//a[contains(text(),'Create a fund')]";
	private static final String lnk_QuickLinks_FindInvestors = "Find Investors Quick Link#xpath=//a[contains(text(),'Find investors')]";
	private static final String lnk_QuickLinks_ScaleDealflow = "Scale Dealflow Quick Link#xpath=//a[contains(text(),'Scale dealflow')]";
	private static final String lnk_QuickLinks_ManagePortfolios = "Manage Portfolios Quick Link#xpath=//a[contains(text(),'Manage portfolios')]";
	private static final String lnk_QuickLinks_BuildaCVC = "Buils a CVC Quick Link#xpath=//a[contains(text(),'Build a CVC')]";


	/** Login page*/

	//Confrim and delete
	private static final String lbl_LoginWelcomeMsg = "Login Page Heading#xpath=//h2[contains(text(),'Welcome back')] | //span[@class='text-left']";
	private static final String txt_LoginForm_EmailAddress = "Email Address Textbox in Login Form#xpath=//div[contains(@class,'application-form-container')]//input[@name='email']";
	private static final String txt_LoginForm_Password = "Password Textbox in Login Form#xpath=//div[contains(@class,'application-form-container')]//input[@name='password']";
	private static final String btn_LoginForm_Login = "Login Button in Login Form#xpath=//div[contains(@class,'application-form-container')]//button[contains(text(),'Log in')]";
	private static final String btn_LoginForm_Google = "Google Button in Login Form#xpath=//div[contains(@class,'application-form-container')]//a//span[contains(text(),'Google')]";
	private static final String btn_LoginForm_LinkedIn = "LinkedIn Button in Login Form#xpath=//div[contains(@class,'application-form-container')]//a//span[contains(text(),'LinkedIn')]";
	private static final String lnk_LoginForm_ForgotPassword_ClickHere = "Forgot Password Click Here Link in Login Form#xpath=//div[contains(@class,'application-form-container')]//a[contains(text(),'Click here')]";
	private static final String btn_LoginForm_SignUp = "Sign Up button in Login Form#xpath=//nav[contains(@class,'navbar')]//a[contains(text(),'Sign up')]";


	private static final String txt_PleaseLogin ="Please login Text#xpath=//span[text()='Please login']";
	private static final String txt_LogInVia ="Log in via Text#xpath=//div[contains(text(),'Log in via')]";
	private static final String btn_GoogleIcon="Google button#xpath=//img[@class='login-icon-google']/parent::a";
	private static final String btn_linkedinIcon ="linkedin button#xpath=//img[@class='login-icon-linkedin']/parent::a";
	private static final String txt_ForgotPassword ="Forgot Password Text#xpath=//div[contains(text(),'Forgot password')]";

	/** Logout page*/

	private static final String txt_verify_page = "verify Navigate to login page#xpath=//span[text()='Welcome back!']";
	private static final String menu_Logout = "logout button #xpath=//a[@id='dropdownUserButton']";
	

	private static final String txt_companyName="company Name #xpath=//strong[text()='"+"text"+"']";
	private static final String txt_EnterCompanyName="Enter Company Name#xpath=//input[@placeholder='Enter company or user name']";
	public static final String btn_dropdown="Dropdown for Delete User=#xpath=";
	public static final String txt_deleteCompany="Delete User#xpath=//a[@class='delete-org-trigger']";
	

    public static final String txt_loginbtn ="Login Button#xpath=//div[@class='bv-example-row logo-row position-relative container-fluid']//child::a[contains(text(),'Login')]";
    public static final String txt_noAccount= "No Account#xpath=//div[text()='No account?']";
    public static final String txt_Email ="Email Textbox#xpath=//input[@name='email']";
    public static final String txt_Password = "Password Textbox#xpath=//input[@name='password']";
    public static final String btn_login = "Login Button#xpath=//button[@type='button']";
    public static final String img_ProfileIcon = "Profile Icon#xpath=//a[@id='dropdownUserButton']";
    public static final String btn_Logout = "Logout Button#xpath=//a[contains(text(),'Logout')]";

	BaseClass obj;
	public NewLoginPage (BaseClass obj) 
	{
		super(obj);
		this.obj = obj;
	}

	public void loginApplication(String EmailId, String Password) {

		try 	{

			waitForElementToDisplay(btn_login, 10);
			verifyElementIsDisplayed(btn_login);	
			testStepPassed("Main page is lunched successfully");

			clickOn(btn_login);
			testStepPassed("Successfully click on Login Page");
			waitForElementToDisplay(lbl_LoginWelcomeMsg, 10);

			validateElementTextIsDisplayed(lbl_LoginWelcomeMsg);
			validateElementTextIsDisplayed(txt_PleaseLogin);
			validateElementTextIsDisplayed(txt_LogInVia);
			validateElementTextIsDisplayed(btn_GoogleIcon);
			validateElementTextIsDisplayed(btn_linkedinIcon);
			scrollDown(txt_ForgotPassword);
			validateElementTextIsDisplayed(txt_ForgotPassword);
			testStepPassed("Login page is lunched successfully");

			typeIn(txt_LoginForm_EmailAddress,EmailId);
			typeIn(txt_LoginForm_Password, Password);
			clickOn(btn_LoginForm_Login);

			waitForElementToDisplay(img_ProfileIcon, 10);
			verifyElementIsDisplayed(img_ProfileIcon);
			testStepPassed("Successfully logedIn ");
		} 
		catch (Exception e) 		{

			testStepFailed("Exception in LaunchApplication"+e.toString());
			e.printStackTrace();
		}	}


	public void logoutApplication() {

		try 	{

			waitForElementToDisplay(menu_Logout, 5);
			verifyElementIsDisplayed(menu_Logout);
			testStepPassed("Displayed the LogOut menu");

			clickOn(menu_Logout);
			testStepPassed("Successfully click on logOut menu");

			waitForElementToDisplay(btn_Logout, 5);
			verifyElementIsDisplayed(btn_Logout);
			testStepPassed("Displayed the LogOut Button");


			clickOn(btn_Logout);
			testStepPassed("Successfully click on logOut button");

			waitForElementToDisplay(btn_login, 5);
			verifyElementIsDisplayed(btn_login);
			testStepPassed("successfully logOut the Application");

		}
		catch (Exception e) 		{

			testStepFailed("Exception in LaunchApplication"+e.toString());
			e.printStackTrace();
		}	}
	
	public void deleteUser(String text) {

		try {

			typeIn(txt_EnterCompanyName,text);
			clickOn(btn_dropdown);
			waitForElementToDisplay(txt_deleteCompany, 5);
			verifyElementIsDisplayed(txt_deleteCompany);
			testStepPassed("Delete user is displayed Successfully");

		} 
		catch (Exception e)  {

			testStepFailed("Exception in LaunchApplication"+e.toString());
			e.printStackTrace();
		}
	}

	public void logInDeleteAndLogoutUser(String EmailId, String Password,String Text ) {
		try {
			loginApplication(EmailId, Password);
			deleteUser(Text);
			logoutApplication();
		}
		catch(Exception e) {
			testStepFailed("Exception in logInDeleteUser"+e.toString());
		}
	}

	  public void Login(String emailId,String password)
	    {
	        try
	        {
	        	waitForElementToDisplay(txt_loginbtn,30);
	            waitTime(3);
	            verifyElementIsDisplayed(txt_loginbtn);
	            clickOn(txt_loginbtn);
	            waitForElementToDisplay(txt_noAccount, 10);
	            if(elementPresent(txt_Email))
	            {
	                typeIn(txt_Email,emailId);
	                waitTime(2);
	                typeIn(txt_Password,password);
	                waitTime(2);
	                clickOn(btn_login);
	                verifyElementIsDisplayed(img_ProfileIcon);
	            }
	            else
	            {
	                testStepFailed("Unable login the Application");
	            }
	        }
	            catch(Exception e)
	            {
	                testStepFailed("Exception in the Method login"+e.toString());
	            }
	    }
	    
	        public void logOut()
	        {
	            try
	            {
	            	waitTime(3);
	                waitForElementToDisplay(img_ProfileIcon, 10);
	                if(isElementDisplayed(img_ProfileIcon))
	                {
	                    clickOn(img_ProfileIcon);
	                    verifyElementIsDisplayed(btn_Logout);
	                    clickOn(btn_Logout);
	                    waitTime(5);
	                    verifyElementIsDisplayed(txt_loginbtn);
	                    testStepPassed("Logout Sucessfully");
	                }
	                else
	                {
	                    testStepFailed("Unable login the Application");
	                }
	            }
	            catch (Exception e)
	            {
	                testStepFailed("Exception in the Method login"+e.toString());
	            }
}
}
