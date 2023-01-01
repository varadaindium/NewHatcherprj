package pages;
import iSAFE.ApplicationKeywords;
import baseClass.BaseClass;

public class LoginPage extends ApplicationKeywords
{	
	private static final String lbl_LoginPage_Heading = "Login Page Heading#xpath=//div[contains(@class,'application-form-container')]//*[contains(text(),'Please login')]";
	private static final String txt_LoginForm_EmailAddress = "Email Address Textbox in Login Form#xpath=//div[contains(@class,'application-form-container')]//input[@name='email']";
	private static final String txt_LoginForm_Password = "Password Textbox in Login Form#xpath=//div[contains(@class,'application-form-container')]//input[@name='password']";
	private static final String btn_LoginForm_Login = "Login Button in Login Form#xpath=//div[contains(@class,'application-form-container')]//button[contains(text(),'Log in')]";
	private static final String btn_LoginForm_Google = "Google Button in Login Form#xpath=//div[contains(@class,'application-form-container')]//a//span[contains(text(),'Google')]";
	private static final String btn_LoginForm_LinkedIn = "LinkedIn Button in Login Form#xpath=//div[contains(@class,'application-form-container')]//a//span[contains(text(),'LinkedIn')]";
	private static final String lnk_LoginForm_ForgotPassword_ClickHere = "Forgot Password Click Here Link in Login Form#xpath=//div[contains(@class,'application-form-container')]//a[contains(text(),'Click here')]";
	private static final String btn_LoginForm_SignUp = "Sign Up button in Login Form#xpath=//nav[contains(@class,'navbar')]//a[contains(text(),'Sign up')]";

	public LoginPage(BaseClass obj) 
	{
		super(obj);
	}

	/**
	 *This method is used to verify display of elements in login page.
	 *
	 *@author VijayaKumar.U
	 */

	public void verify_LoginPage_displayed()
	{
		try 	{
			waitForElementToDisplay(lbl_LoginPage_Heading, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_LoginPage_Heading))	{
				testStepPassed("Login page is displayed");	
			}	
			else {
				testStepFailed("Could not displayed.");
			}}	

		catch (Exception e) 	{
			testStepFailed("Could not verify the element."+e.getClass());
		}	}
	/**
	 *This method is used to click singup button.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_TopNavBar_SignUp_button()	{
		try{
			if(isElementDisplayed(btn_LoginForm_SignUp)){
				waitForElementToDisplay(btn_LoginForm_SignUp, this.elementLoadWaitTime);
				clickOn(btn_LoginForm_SignUp);
				testStepInfo("Login Form opens up successfully.");
			}
			else {
				testStepFailed(" could not display the element.");
			}}
		catch (Exception e){
			testStepFailed("Element is not displayed."+e.getClass());
		}}
	/**
	 *This method is used to enter the email in login form.
	 *
	 *@param email.
	 *@author VijayaKumar.U
	 */
	public void enter_Email(String email)	{
		try {
			waitForElementToDisplay(txt_LoginForm_EmailAddress, this.elementLoadWaitTime);
			typeIn(txt_LoginForm_EmailAddress, email);
			testStepInfo("email entered successfully.");
		}
		catch (Exception e){
			testStepFailed("Element is not displayed."+e.getClass());
		}}
	/**
	 *This method is used to enter the password in login form.
	 *@param password
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_Password(String password)	{
		try {
			waitForElementToDisplay(txt_LoginForm_Password, this.elementLoadWaitTime);
			typeIn(txt_LoginForm_Password, password);
			//typeInMaskedData(txt_LoginForm_Password, password);
			
			testStepInfo("Password entered successfully.");
		}
		catch (Exception e){
			testStepFailed("Element is not displayed."+e.getClass());
		}}
	/**
	 *This method is used to click login button.
	 *
	 *
	 *@author VijayaKumar.U
	 */
	public void click_login_button()	{
		try {
			waitForElementToDisplay(btn_LoginForm_Login, this.elementLoadWaitTime);
			clickOn(btn_LoginForm_Login);
			testStepInfo("Login Form displayed successfully.");
		}
		catch (Exception e){
			testStepFailed("Login Form is not displayed."+e.getClass());
		}}
	/**
	 *This method is used to click the google button.
	 *
	 *
	 *@author VijayaKumar.U
	 */
	public void click_Google_button()	{
		try {
			waitForElementToDisplay(btn_LoginForm_Google, this.elementLoadWaitTime);
			clickOn(btn_LoginForm_Google);

		}
		catch (Exception e){
			testStepFailed("Element is not displayed."+e.getClass());
		}}
	/**
	 *This method is used to click LinkedIn button.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_LinkedIn_button()	{
		try {
			waitForElementToDisplay(btn_LoginForm_LinkedIn, this.elementLoadWaitTime);
			clickOn(btn_LoginForm_LinkedIn);
		}
		catch (Exception e){
			testStepFailed("Element is not displayed."+e.getClass());
		}}
	/**
	 *This method is used to click link forgot password.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_ForgotPassword_ClickHere_Link()	{
		try {
			waitForElementToDisplay(lnk_LoginForm_ForgotPassword_ClickHere, this.elementLoadWaitTime);
			clickOn(lnk_LoginForm_ForgotPassword_ClickHere);
		}
		catch (Exception e){
			testStepFailed("Element is not displayed."+e.getClass());
		}}
	/**
	 *This method is used to enter the login credentials in the login form.
	 *@param email, password
	 *@author VijayaKumar.U
	 *
	 */
	public void loginIntoApplication(String email, String password)	{
		try {
			enter_Email(email);
			enter_Password(password);
			click_login_button();
			testStepInfo("Login credentials entered successfully.");
		}
		catch (Exception e){
			e.printStackTrace();
			testStepFailed("Element is not displayed."+e.getClass());
		}}
}
