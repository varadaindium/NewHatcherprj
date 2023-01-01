package TestCases;

import java.lang.reflect.Method;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import automationFramework.GenericKeywords;
import baseClass.BaseClass;

/******************************************************************************Scenarios****************************************************************************************************************************************************************************/
import scenarios.login.LoginLogoutTest;
import webScenarios.AddNewListingTest;
/***************************************************************************************************/
import scenarios.captcha.CaptchaDisableTest;
/***************************************************************************************************/
import scenarios.entrepreneursignup.CreateEntrepreneurTest;

import scenarios.entrepreneursignup.HTCHR_ES_SCR_001_TC_001_To_061_Test;
import scenarios.entrepreneursignup.HTCHR_ES_SCR_003_TC_fileUpload_Test;
import scenarios.entrepreneursignup.HTCHR_ES_SCR_002_TC_062_To_154_Test;

import scenarios.entrepreneursignup.HTCHR_ES_SCR_004_TC_155_To_180_Test;
import scenarios.entrepreneursignup.HTCHR_ES_SCR_005_TC_181_To_189_Test;
import scenarios.entrepreneursignup.HTCHR_ES_SCR_006_TC_190_To_229_Test;

/***************************************************************************************************/
import scenarios.investorsignup.CreateInvestorTest;
import scenarios.investorsignup.*;
import scenarios.investorsignup.HTCHR_IS_SCR_001_TC_001_To_009_Test;
import scenarios.investorsignup.HTCHR_IS_SCR_002_TC_011_To_014_Test;
import scenarios.investorsignup.HTCHR_IS_SCR_003_TC_018_To_060_Test;
import scenarios.investorsignup.HTCHR_IS_SCR_004_TC_062_To_075_Test;
import scenarios.investorsignup.HTCHR_IS_SCR_005_TC_076_To_089_Test;
import scenarios.investorsignup.HTCHR_IS_SCR_006_TC_092_To_119_Test;
import scenarios.investorsignup.HTCHR_IS_SCR_007_TC_120_To_135_Test;
/***************************************************************************************************/
import scenarios.addcontact.AddContactEntrepreneurIndividualTest;
import scenarios.addcontact.AddContactEntrepreneurAddOrganizationNewCompanyTest;
import scenarios.addcontact.AddContactEntrepreneurAddOrganizationExisitingCompanyTest;
import scenarios.addcontact.AddContactInvestorIndividualTest;
import scenarios.addcontact.AddContactInvestorAddOrganizationNewCompanyTest;
import scenarios.addcontact.AddContactInvestorAddOrganizationExistingCompanyTest;
import scenarios.addcontact.AddContactExpertIndividualTest;
import scenarios.addcontact.AddContactExpertAddOrganizationNewCompanyTest;
import scenarios.addcontact.AddContactExpertAddOrganizationExistingCompanyTest;
import scenarios.addcontact.HTCHR_AC_SCR_001_TC_001_To_072_Test;
import scenarios.addcontact.HTCHR_AC_SCR_002_TC_073_To_099_Test;
import scenarios.addcontact.HTCHR_AC_SCR_003_TC_100_To_123_Test;
import scenarios.addcontact.HTCHR_AC_SCR_004_TC_124_To_147_Test;
/*import scenarios.addcontact.HTCHR_AC_SCR_005_TC_148_To_165_Test;
//import scenarios.addcontact.HTCHR_AC_SCR_006_TC_166_To_206_Test;
//import scenarios.addcontact.HTCHR_AC_SCR_007_TC_207_To_218_Test;
//import scenarios.addcontact.HTCHR_AC_SCR_008_TC_219_To_236_Test;
//import scenarios.addcontact.HTCHR_AC_SCR_009_TC_237_To_249_Test;
//import scenarios.addcontact.HTCHR_AC_SCR_010_TC_250_To_261_Test;*/
/***************************************************************************************************/
import scenarios.editprofile.EditCompanyProfileHatcherOptionTest;
import scenarios.editprofile.EditCompanyProfileClearbitandLinkedInOptionTest;
import scenarios.editprofile.HTCHR_EP_SCR_001_TC_001_To_288_Test;
import scenarios.editprofile.HTCHR_EP_SCR_001_TC_001_To_288_Updated;

/***************************************************************************************************/
import scenarios.dataroom.DataRoomEntrepreneurSharingTest;
import scenarios.dataroom.DataRoomInvestorSharingTest;
import scenarios.dataroom.DataRoomCommunityMemberTest;
import scenarios.dataroom.DataRoomAllSectionFileUploadTest;
import scenarios.dataroom.DataRoomAllSectionFileUploadTest2;

/*******************************************************************************************************************************************************************************************************************************************************************/

@Listeners({ utilities.HtmlReport.class })
public class TestCases 
{
	private BaseClass obj;

	////////////////////////////////////////////////////////////////////////////////
	// Function Name :
	// Purpose :
	// Parameters :
	// Return Value :
	// Created by :
	// Created on :
	// Remarks :
	/////////////////////////////////////////////////////////////////////////////////

	private void TestStart(String testCaseName) 
	{
		obj.currentTestCaseName = testCaseName;
		obj.setEnvironmentTimeouts();
		obj.reportStart();
		obj.iterationCount.clear();
		obj.iterationCountInTextData();
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@BeforeClass
	@Parameters({ "selenium.machinename", "selenium.host", "selenium.port", "selenium.browser", "selenium.os",
		"selenium.browserVersion", "selenium.osVersion", "TestData.SheetNumber"})
	public void precondition(String machineName, String host, String port, String browser, String os,
			String browserVersion, String osVersion, String sheetNo) 
	{
		obj = new BaseClass();
		if (os.contains("Android")) 
		{
			obj.startServer(host, port);
			obj.waitTime(10);
		}
		obj.setup(machineName, host, port, browser, os, browserVersion, osVersion, sheetNo);
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@AfterClass
	public void closeSessions() 
	{
		obj.closeAllSessions();
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void LoginLogoutTest(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		LoginLogoutTest loginLogoutTest = new LoginLogoutTest(obj);
		for(int i=0;i<loginLogoutTest.iterationCount.size();i++)
		{

			loginLogoutTest.dataRowNo=Integer.parseInt(loginLogoutTest.iterationCount.get(i).toString());
			loginLogoutTest.mainTest();			
		}
		obj.testFailure=loginLogoutTest.testFailure;
		TestEnd();
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/




	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void CaptchaDisableTest(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		CaptchaDisableTest captchaDisableTest = new CaptchaDisableTest(obj);
		for(int i=0;i<captchaDisableTest.iterationCount.size();i++)
		{

			captchaDisableTest.dataRowNo=Integer.parseInt(captchaDisableTest.iterationCount.get(i).toString());
			captchaDisableTest.mainTest();			
		}
		obj.testFailure=captchaDisableTest.testFailure;
		TestEnd();
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void CreateEntrepreneurTest(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		CreateEntrepreneurTest createEntrepreneurTest = new CreateEntrepreneurTest(obj);
		for(int i=0;i<createEntrepreneurTest.iterationCount.size();i++)
		{

			createEntrepreneurTest.dataRowNo=Integer.parseInt(createEntrepreneurTest.iterationCount.get(i).toString());
			createEntrepreneurTest.mainTest();			
		}
		obj.testFailure=createEntrepreneurTest.testFailure;
		TestEnd();
	}


	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void HTCHR_ES_SCR_001_TC_001_To_061_Test(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		HTCHR_ES_SCR_001_TC_001_To_061_Test htchr_ES_SCR_001_TC_001_To_061_Test = new HTCHR_ES_SCR_001_TC_001_To_061_Test(obj);
		for(int i=0;i<htchr_ES_SCR_001_TC_001_To_061_Test.iterationCount.size();i++)
		{

			htchr_ES_SCR_001_TC_001_To_061_Test.dataRowNo=Integer.parseInt(htchr_ES_SCR_001_TC_001_To_061_Test.iterationCount.get(i).toString());
			htchr_ES_SCR_001_TC_001_To_061_Test.mainTest();			
		}
		obj.testFailure=htchr_ES_SCR_001_TC_001_To_061_Test.testFailure;
		TestEnd();
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/
	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void HTCHR_ES_SCR_002_TC_062_To_154_Test(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		HTCHR_ES_SCR_002_TC_062_To_154_Test htchr_ES_SCR_002_TC_062_To_154_Test = new HTCHR_ES_SCR_002_TC_062_To_154_Test(obj);
		for(int i=0;i<htchr_ES_SCR_002_TC_062_To_154_Test.iterationCount.size();i++)
		{

			htchr_ES_SCR_002_TC_062_To_154_Test.dataRowNo=Integer.parseInt(htchr_ES_SCR_002_TC_062_To_154_Test.iterationCount.get(i).toString());
			htchr_ES_SCR_002_TC_062_To_154_Test.mainTest();			
		}
		obj.testFailure=htchr_ES_SCR_002_TC_062_To_154_Test.testFailure;
		TestEnd();
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void HTCHR_ES_SCR_003_TC_fileUpload_Test(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		HTCHR_ES_SCR_003_TC_fileUpload_Test htchr_ES_SCR_003_TC_fileUpload_Test = new HTCHR_ES_SCR_003_TC_fileUpload_Test(obj);
		for(int i=0;i<htchr_ES_SCR_003_TC_fileUpload_Test.iterationCount.size();i++)
		{

			htchr_ES_SCR_003_TC_fileUpload_Test.dataRowNo=Integer.parseInt(htchr_ES_SCR_003_TC_fileUpload_Test.iterationCount.get(i).toString());
			htchr_ES_SCR_003_TC_fileUpload_Test.mainTest();			
		}
		obj.testFailure=htchr_ES_SCR_003_TC_fileUpload_Test.testFailure;
		TestEnd();
	}


	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void HTCHR_ES_SCR_004_TC_155_To_180_Test(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		HTCHR_ES_SCR_004_TC_155_To_180_Test htchr_ES_SCR_004_TC_155_To_180 = new HTCHR_ES_SCR_004_TC_155_To_180_Test(obj);
		for(int i=0;i<htchr_ES_SCR_004_TC_155_To_180.iterationCount.size();i++)
		{

			htchr_ES_SCR_004_TC_155_To_180.dataRowNo=Integer.parseInt(htchr_ES_SCR_004_TC_155_To_180.iterationCount.get(i).toString());
			htchr_ES_SCR_004_TC_155_To_180.mainTest();			
		}
		obj.testFailure=htchr_ES_SCR_004_TC_155_To_180.testFailure;
		TestEnd();
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/
	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void HTCHR_ES_SCR_005_TC_181_To_189_Test(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		HTCHR_ES_SCR_005_TC_181_To_189_Test htchr_ES_SCR_005_TC_181_To_189 = new HTCHR_ES_SCR_005_TC_181_To_189_Test(obj);
		for(int i=0;i<htchr_ES_SCR_005_TC_181_To_189.iterationCount.size();i++)
		{

			htchr_ES_SCR_005_TC_181_To_189.dataRowNo=Integer.parseInt(htchr_ES_SCR_005_TC_181_To_189.iterationCount.get(i).toString());
			htchr_ES_SCR_005_TC_181_To_189.mainTest();			
		}
		obj.testFailure=htchr_ES_SCR_005_TC_181_To_189.testFailure;
		TestEnd();
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void HTCHR_ES_SCR_006_TC_190_To_229_Test(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		HTCHR_ES_SCR_006_TC_190_To_229_Test htchr_ES_SCR_006_TC_190_To_229_Test = new HTCHR_ES_SCR_006_TC_190_To_229_Test(obj);
		for(int i=0;i<htchr_ES_SCR_006_TC_190_To_229_Test.iterationCount.size();i++)
		{

			htchr_ES_SCR_006_TC_190_To_229_Test.dataRowNo=Integer.parseInt(htchr_ES_SCR_006_TC_190_To_229_Test.iterationCount.get(i).toString());
			htchr_ES_SCR_006_TC_190_To_229_Test.mainTest();			
		}
		obj.testFailure=htchr_ES_SCR_006_TC_190_To_229_Test.testFailure;
		TestEnd();
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/


	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void CreateInvestorTest(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		CreateInvestorTest createInvestorTest = new CreateInvestorTest(obj);
		for(int i=0;i<createInvestorTest.iterationCount.size();i++)
		{

			createInvestorTest.dataRowNo=Integer.parseInt(createInvestorTest.iterationCount.get(i).toString());
			createInvestorTest.mainTest();			
		}
		obj.testFailure=createInvestorTest.testFailure;
		TestEnd();
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void HTCHR_IS_SCR_001_TC_001_To_009_Test(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		HTCHR_IS_SCR_001_TC_001_To_009_Test htchr_IS_SCR_001_TC_001_To_009_Test = new HTCHR_IS_SCR_001_TC_001_To_009_Test(obj);
		for(int i=0;i<htchr_IS_SCR_001_TC_001_To_009_Test.iterationCount.size();i++)
		{

			htchr_IS_SCR_001_TC_001_To_009_Test.dataRowNo=Integer.parseInt(htchr_IS_SCR_001_TC_001_To_009_Test.iterationCount.get(i).toString());
			htchr_IS_SCR_001_TC_001_To_009_Test.mainTest();			
		}
		obj.testFailure=htchr_IS_SCR_001_TC_001_To_009_Test.testFailure;
		TestEnd();
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/
	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void HTCHR_IS_SCR_002_TC_011_To_014_Test(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		HTCHR_IS_SCR_002_TC_011_To_014_Test htchr_IS_SCR_002_TC_011_To_014_Test = new HTCHR_IS_SCR_002_TC_011_To_014_Test(obj);
		for(int i=0;i<htchr_IS_SCR_002_TC_011_To_014_Test.iterationCount.size();i++)
		{

			htchr_IS_SCR_002_TC_011_To_014_Test.dataRowNo=Integer.parseInt(htchr_IS_SCR_002_TC_011_To_014_Test.iterationCount.get(i).toString());
			htchr_IS_SCR_002_TC_011_To_014_Test.mainTest();			
		}
		obj.testFailure=htchr_IS_SCR_002_TC_011_To_014_Test.testFailure;
		TestEnd();
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/
	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void HTCHR_IS_SCR_003_TC_018_To_060_Test(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		HTCHR_IS_SCR_003_TC_018_To_060_Test htchr_IS_SCR_003_TC_018_To_060_Test = new HTCHR_IS_SCR_003_TC_018_To_060_Test(obj);
		for(int i=0;i<htchr_IS_SCR_003_TC_018_To_060_Test.iterationCount.size();i++)
		{

			htchr_IS_SCR_003_TC_018_To_060_Test.dataRowNo=Integer.parseInt(htchr_IS_SCR_003_TC_018_To_060_Test.iterationCount.get(i).toString());
			htchr_IS_SCR_003_TC_018_To_060_Test.mainTest();			
		}
		obj.testFailure=htchr_IS_SCR_003_TC_018_To_060_Test.testFailure;
		TestEnd();
	}



	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void HTCHR_IS_SCR_004_TC_062_To_075_Test(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		HTCHR_IS_SCR_004_TC_062_To_075_Test htchr_IS_SCR_004_TC_062_To_075_Test = new HTCHR_IS_SCR_004_TC_062_To_075_Test(obj);
		for(int i=0;i<htchr_IS_SCR_004_TC_062_To_075_Test.iterationCount.size();i++)
		{

			htchr_IS_SCR_004_TC_062_To_075_Test.dataRowNo=Integer.parseInt(htchr_IS_SCR_004_TC_062_To_075_Test.iterationCount.get(i).toString());
			htchr_IS_SCR_004_TC_062_To_075_Test.mainTest();			
		}
		obj.testFailure=htchr_IS_SCR_004_TC_062_To_075_Test.testFailure;
		TestEnd();
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/


	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void HTCHR_IS_SCR_005_TC_076_To_089_Test(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		HTCHR_IS_SCR_005_TC_076_To_089_Test htchr_IS_SCR_005_TC_076_To_089_Test = new HTCHR_IS_SCR_005_TC_076_To_089_Test(obj);
		for(int i=0;i<htchr_IS_SCR_005_TC_076_To_089_Test.iterationCount.size();i++)
		{

			htchr_IS_SCR_005_TC_076_To_089_Test.dataRowNo=Integer.parseInt(htchr_IS_SCR_005_TC_076_To_089_Test.iterationCount.get(i).toString());
			htchr_IS_SCR_005_TC_076_To_089_Test.mainTest();			
		}
		obj.testFailure=htchr_IS_SCR_005_TC_076_To_089_Test.testFailure;
		TestEnd();
	}
	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void HTCHR_IS_SCR_006_TC_092_To_119_Test(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		HTCHR_IS_SCR_006_TC_092_To_119_Test htchr_IS_SCR_006_TC_092_To_119_Test = new HTCHR_IS_SCR_006_TC_092_To_119_Test(obj);
		for(int i=0;i<htchr_IS_SCR_006_TC_092_To_119_Test.iterationCount.size();i++)
		{

			htchr_IS_SCR_006_TC_092_To_119_Test.dataRowNo=Integer.parseInt(htchr_IS_SCR_006_TC_092_To_119_Test.iterationCount.get(i).toString());
			htchr_IS_SCR_006_TC_092_To_119_Test.mainTest();			
		}
		obj.testFailure=htchr_IS_SCR_006_TC_092_To_119_Test.testFailure;
		System.out.println("TC---"+obj.testFailure);
		TestEnd();
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void HTCHR_IS_SCR_007_TC_120_To_135_Test(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		HTCHR_IS_SCR_007_TC_120_To_135_Test htchr_IS_SCR_007_TC_120_To_135_Test = new HTCHR_IS_SCR_007_TC_120_To_135_Test(obj);
		for(int i=0;i<htchr_IS_SCR_007_TC_120_To_135_Test.iterationCount.size();i++)
		{

			htchr_IS_SCR_007_TC_120_To_135_Test.dataRowNo=Integer.parseInt(htchr_IS_SCR_007_TC_120_To_135_Test.iterationCount.get(i).toString());
			htchr_IS_SCR_007_TC_120_To_135_Test.mainTest();			
		}
		obj.testFailure=htchr_IS_SCR_007_TC_120_To_135_Test.testFailure;
		TestEnd();
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void AddContactEntrepreneurIndividualTest(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		AddContactEntrepreneurIndividualTest addContactEntrepreneurIndividualTest = new AddContactEntrepreneurIndividualTest(obj);
		for(int i=0;i<addContactEntrepreneurIndividualTest.iterationCount.size();i++)
		{

			addContactEntrepreneurIndividualTest.dataRowNo=Integer.parseInt(addContactEntrepreneurIndividualTest.iterationCount.get(i).toString());
			addContactEntrepreneurIndividualTest.mainTest();			
		}
		obj.testFailure=addContactEntrepreneurIndividualTest.testFailure;
		TestEnd();
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void AddContactEntrepreneurAddOrganizationNewCompanyTest(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		AddContactEntrepreneurAddOrganizationNewCompanyTest addContactEntrepreneurAddOrganizationNewCompanyTest = new AddContactEntrepreneurAddOrganizationNewCompanyTest(obj);
		for(int i=0;i<addContactEntrepreneurAddOrganizationNewCompanyTest.iterationCount.size();i++)
		{

			addContactEntrepreneurAddOrganizationNewCompanyTest.dataRowNo=Integer.parseInt(addContactEntrepreneurAddOrganizationNewCompanyTest.iterationCount.get(i).toString());
			addContactEntrepreneurAddOrganizationNewCompanyTest.mainTest();			
		}
		obj.testFailure=addContactEntrepreneurAddOrganizationNewCompanyTest.testFailure;
		TestEnd();
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void AddContactEntrepreneurAddOrganizationExisitingCompanyTest(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		AddContactEntrepreneurAddOrganizationExisitingCompanyTest addContactEntrepreneurAddOrganizationExisitingCompanyTest = new AddContactEntrepreneurAddOrganizationExisitingCompanyTest(obj);
		for(int i=0;i<addContactEntrepreneurAddOrganizationExisitingCompanyTest.iterationCount.size();i++)
		{

			addContactEntrepreneurAddOrganizationExisitingCompanyTest.dataRowNo=Integer.parseInt(addContactEntrepreneurAddOrganizationExisitingCompanyTest.iterationCount.get(i).toString());
			addContactEntrepreneurAddOrganizationExisitingCompanyTest.mainTest();			
		}
		obj.testFailure=addContactEntrepreneurAddOrganizationExisitingCompanyTest.testFailure;
		TestEnd();
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void AddContactInvestorIndividualTest(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		AddContactInvestorIndividualTest addContactInvestorIndividualTest = new AddContactInvestorIndividualTest(obj);
		for(int i=0;i<addContactInvestorIndividualTest.iterationCount.size();i++)
		{

			addContactInvestorIndividualTest.dataRowNo=Integer.parseInt(addContactInvestorIndividualTest.iterationCount.get(i).toString());
			addContactInvestorIndividualTest.mainTest();			
		}
		obj.testFailure=addContactInvestorIndividualTest.testFailure;
		TestEnd();
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void AddContactInvestorAddOrganizationNewCompanyTest(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		AddContactInvestorAddOrganizationNewCompanyTest addContactInvestorAddOrganizationNewCompanyTest = new AddContactInvestorAddOrganizationNewCompanyTest(obj);
		for(int i=0;i<addContactInvestorAddOrganizationNewCompanyTest.iterationCount.size();i++)
		{

			addContactInvestorAddOrganizationNewCompanyTest.dataRowNo=Integer.parseInt(addContactInvestorAddOrganizationNewCompanyTest.iterationCount.get(i).toString());
			addContactInvestorAddOrganizationNewCompanyTest.mainTest();			
		}
		obj.testFailure=addContactInvestorAddOrganizationNewCompanyTest.testFailure;
		TestEnd();
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void AddContactInvestorAddOrganizationExistingCompanyTest(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		AddContactInvestorAddOrganizationExistingCompanyTest addContactInvestorAddOrganizationExistingCompanyTest = new AddContactInvestorAddOrganizationExistingCompanyTest(obj);
		for(int i=0;i<addContactInvestorAddOrganizationExistingCompanyTest.iterationCount.size();i++)
		{

			addContactInvestorAddOrganizationExistingCompanyTest.dataRowNo=Integer.parseInt(addContactInvestorAddOrganizationExistingCompanyTest.iterationCount.get(i).toString());
			addContactInvestorAddOrganizationExistingCompanyTest.mainTest();			
		}
		obj.testFailure=addContactInvestorAddOrganizationExistingCompanyTest.testFailure;
		TestEnd();
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void AddContactExpertIndividualTest(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		AddContactExpertIndividualTest addCoExpertIndividualTest = new AddContactExpertIndividualTest(obj);
		for(int i=0;i<addCoExpertIndividualTest.iterationCount.size();i++)
		{

			addCoExpertIndividualTest.dataRowNo=Integer.parseInt(addCoExpertIndividualTest.iterationCount.get(i).toString());
			addCoExpertIndividualTest.mainTest();			
		}
		obj.testFailure=addCoExpertIndividualTest.testFailure;
		TestEnd();
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void AddContactExpertAddOrganizationNewCompanyTest(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		AddContactExpertAddOrganizationNewCompanyTest addContactExpertAddOrganizationNewCompanyTest = new AddContactExpertAddOrganizationNewCompanyTest(obj);
		for(int i=0;i<addContactExpertAddOrganizationNewCompanyTest.iterationCount.size();i++)
		{

			addContactExpertAddOrganizationNewCompanyTest.dataRowNo=Integer.parseInt(addContactExpertAddOrganizationNewCompanyTest.iterationCount.get(i).toString());
			addContactExpertAddOrganizationNewCompanyTest.mainTest();			
		}
		obj.testFailure=addContactExpertAddOrganizationNewCompanyTest.testFailure;
		TestEnd();
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void AddContactExpertAddOrganizationExistingCompanyTest(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		AddContactExpertAddOrganizationExistingCompanyTest addContactExpertAddOrganizationExistingCompanyTest = new AddContactExpertAddOrganizationExistingCompanyTest(obj);
		for(int i=0;i<addContactExpertAddOrganizationExistingCompanyTest.iterationCount.size();i++)
		{

			addContactExpertAddOrganizationExistingCompanyTest.dataRowNo=Integer.parseInt(addContactExpertAddOrganizationExistingCompanyTest.iterationCount.get(i).toString());
			addContactExpertAddOrganizationExistingCompanyTest.mainTest();			
		}
		obj.testFailure=addContactExpertAddOrganizationExistingCompanyTest.testFailure;
		TestEnd();
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void HTCHR_AC_SCR_001_TC_001_To_072_Test(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		HTCHR_AC_SCR_001_TC_001_To_072_Test htchr_AC_SCR_001_TC_001_To_072_Test = new HTCHR_AC_SCR_001_TC_001_To_072_Test(obj);
		for(int i=0;i<htchr_AC_SCR_001_TC_001_To_072_Test.iterationCount.size();i++)
		{

			htchr_AC_SCR_001_TC_001_To_072_Test.dataRowNo=Integer.parseInt(htchr_AC_SCR_001_TC_001_To_072_Test.iterationCount.get(i).toString());
			htchr_AC_SCR_001_TC_001_To_072_Test.mainTest();			
		}
		obj.testFailure=htchr_AC_SCR_001_TC_001_To_072_Test.testFailure;
		TestEnd();
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void HTCHR_AC_SCR_002_TC_073_To_099_Test(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		HTCHR_AC_SCR_002_TC_073_To_099_Test htchr_AC_SCR_002_TC_073_To_099_Test = new HTCHR_AC_SCR_002_TC_073_To_099_Test(obj);
		for(int i=0;i<htchr_AC_SCR_002_TC_073_To_099_Test.iterationCount.size();i++)
		{

			htchr_AC_SCR_002_TC_073_To_099_Test.dataRowNo=Integer.parseInt(htchr_AC_SCR_002_TC_073_To_099_Test.iterationCount.get(i).toString());
			htchr_AC_SCR_002_TC_073_To_099_Test.mainTest();			
		}
		obj.testFailure=htchr_AC_SCR_002_TC_073_To_099_Test.testFailure;
		TestEnd();
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void HTCHR_AC_SCR_003_TC_100_To_123_Test(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		HTCHR_AC_SCR_003_TC_100_To_123_Test htchr_AC_SCR_003_TC_100_To_123_Test = new HTCHR_AC_SCR_003_TC_100_To_123_Test(obj);
		for(int i=0;i<htchr_AC_SCR_003_TC_100_To_123_Test.iterationCount.size();i++)
		{

			htchr_AC_SCR_003_TC_100_To_123_Test.dataRowNo=Integer.parseInt(htchr_AC_SCR_003_TC_100_To_123_Test.iterationCount.get(i).toString());
			htchr_AC_SCR_003_TC_100_To_123_Test.mainTest();			
		}
		obj.testFailure=htchr_AC_SCR_003_TC_100_To_123_Test.testFailure;
		TestEnd();
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void HTCHR_AC_SCR_004_TC_124_To_147_Test(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		HTCHR_AC_SCR_004_TC_124_To_147_Test htchr_AC_SCR_004_TC_124_To_147_Test = new HTCHR_AC_SCR_004_TC_124_To_147_Test(obj);
		for(int i=0;i<htchr_AC_SCR_004_TC_124_To_147_Test.iterationCount.size();i++)
		{

			htchr_AC_SCR_004_TC_124_To_147_Test.dataRowNo=Integer.parseInt(htchr_AC_SCR_004_TC_124_To_147_Test.iterationCount.get(i).toString());
			htchr_AC_SCR_004_TC_124_To_147_Test.mainTest();			
		}
		obj.testFailure=htchr_AC_SCR_004_TC_124_To_147_Test.testFailure;
		TestEnd();
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void EditCompanyProfileHatcherOptionTest(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		EditCompanyProfileHatcherOptionTest editCompanyProfileHatcherOptionTest = new EditCompanyProfileHatcherOptionTest(obj);
		for(int i=0;i<editCompanyProfileHatcherOptionTest.iterationCount.size();i++)
		{

			editCompanyProfileHatcherOptionTest.dataRowNo=Integer.parseInt(editCompanyProfileHatcherOptionTest.iterationCount.get(i).toString());
			editCompanyProfileHatcherOptionTest.mainTest();			
		}
		obj.testFailure=editCompanyProfileHatcherOptionTest.testFailure;
		TestEnd();
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void EditCompanyProfileClearbitandLinkedInOptionTest(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		EditCompanyProfileClearbitandLinkedInOptionTest editCompanyProfileClearbitandLinkedInOptionTest = new EditCompanyProfileClearbitandLinkedInOptionTest(obj);
		for(int i=0;i<editCompanyProfileClearbitandLinkedInOptionTest.iterationCount.size();i++)
		{

			editCompanyProfileClearbitandLinkedInOptionTest.dataRowNo=Integer.parseInt(editCompanyProfileClearbitandLinkedInOptionTest.iterationCount.get(i).toString());
			editCompanyProfileClearbitandLinkedInOptionTest.mainTest();			
		}
		obj.testFailure=editCompanyProfileClearbitandLinkedInOptionTest.testFailure;
		TestEnd();
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void HTCHR_EP_SCR_001_TC_001_To_288_Test(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		HTCHR_EP_SCR_001_TC_001_To_288_Test htchr_EP_SCR_001_TC_001_To_288_Test = new HTCHR_EP_SCR_001_TC_001_To_288_Test(obj);
		for(int i=0;i<htchr_EP_SCR_001_TC_001_To_288_Test.iterationCount.size();i++)
		{

			htchr_EP_SCR_001_TC_001_To_288_Test.dataRowNo=Integer.parseInt(htchr_EP_SCR_001_TC_001_To_288_Test.iterationCount.get(i).toString());
			htchr_EP_SCR_001_TC_001_To_288_Test.mainTest();			
		}
		obj.testFailure=htchr_EP_SCR_001_TC_001_To_288_Test.testFailure;
		TestEnd();
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/
	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void HTCHR_EP_SCR_001_TC_001_To_288_Updated(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		HTCHR_EP_SCR_001_TC_001_To_288_Updated htchr_EP_SCR_001_TC_001_To_288_Updated = new HTCHR_EP_SCR_001_TC_001_To_288_Updated(obj);
		for(int i=0;i<htchr_EP_SCR_001_TC_001_To_288_Updated.iterationCount.size();i++)
		{

			htchr_EP_SCR_001_TC_001_To_288_Updated.dataRowNo=Integer.parseInt(htchr_EP_SCR_001_TC_001_To_288_Updated.iterationCount.get(i).toString());
			htchr_EP_SCR_001_TC_001_To_288_Updated.mainTest();			
		}
		obj.testFailure=htchr_EP_SCR_001_TC_001_To_288_Updated.testFailure;
		TestEnd();
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void DataRoomEntrepreneurSharingTest(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		DataRoomEntrepreneurSharingTest dataRoomEntrepreneurSharingTest = new DataRoomEntrepreneurSharingTest(obj);
		for(int i=0;i<dataRoomEntrepreneurSharingTest.iterationCount.size();i++)
		{

			dataRoomEntrepreneurSharingTest.dataRowNo=Integer.parseInt(dataRoomEntrepreneurSharingTest.iterationCount.get(i).toString());
			dataRoomEntrepreneurSharingTest.mainTest();			
		}
		obj.testFailure=dataRoomEntrepreneurSharingTest.testFailure;
		TestEnd();
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void DataRoomInvestorSharingTest(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		DataRoomInvestorSharingTest dataRoomInvestorSharingTest = new DataRoomInvestorSharingTest(obj);
		for(int i=0;i<dataRoomInvestorSharingTest.iterationCount.size();i++)
		{

			dataRoomInvestorSharingTest.dataRowNo=Integer.parseInt(dataRoomInvestorSharingTest.iterationCount.get(i).toString());
			dataRoomInvestorSharingTest.mainTest();			
		}
		obj.testFailure=dataRoomInvestorSharingTest.testFailure;
		TestEnd();
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void DataRoomAllSectionFileUploadTest(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		DataRoomAllSectionFileUploadTest dataRoomAllSectionFileUploadTest = new DataRoomAllSectionFileUploadTest(obj);
		for(int i=0;i<dataRoomAllSectionFileUploadTest.iterationCount.size();i++)
		{

			dataRoomAllSectionFileUploadTest.dataRowNo=Integer.parseInt(dataRoomAllSectionFileUploadTest.iterationCount.get(i).toString());
			dataRoomAllSectionFileUploadTest.mainTest();			
		}
		obj.testFailure=dataRoomAllSectionFileUploadTest.testFailure;
		TestEnd();
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/


	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void DataRoomAllSectionFileUploadTest2(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		DataRoomAllSectionFileUploadTest2 dataRoomAllSectionFileUploadTest2 = new DataRoomAllSectionFileUploadTest2(obj);
		for(int i=0;i<dataRoomAllSectionFileUploadTest2.iterationCount.size();i++)
		{

			dataRoomAllSectionFileUploadTest2.dataRowNo=Integer.parseInt(dataRoomAllSectionFileUploadTest2.iterationCount.get(i).toString());
			dataRoomAllSectionFileUploadTest2.mainTest();			
		}
		obj.testFailure=dataRoomAllSectionFileUploadTest2.testFailure;
		TestEnd();
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void DataRoomCommunityMemberTest(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		DataRoomCommunityMemberTest dataRoomCommunityMemberTest = new DataRoomCommunityMemberTest(obj);
		for(int i=0;i<dataRoomCommunityMemberTest.iterationCount.size();i++)
		{

			dataRoomCommunityMemberTest.dataRowNo=Integer.parseInt(dataRoomCommunityMemberTest.iterationCount.get(i).toString());
			dataRoomCommunityMemberTest.mainTest();			
		}
		obj.testFailure=dataRoomCommunityMemberTest.testFailure;
		TestEnd();
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	private void TestEnd() 
	{
		obj.waitTime(1);
		if (obj.testFailure) 
		{
			obj.testFailed();
		}
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@BeforeMethod
	public void before() 
	{
		obj.testFailure = false;
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	/*********************************************************************************************************/
	//HTCHR_AC_SCR_001_TC_001
	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void HTCHR_AC_SCR_001_TC_001(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		AddNewListingTest addNewListing  = new AddNewListingTest(obj);
		for(int i=0;i<addNewListing.iterationCount.size();i++)
		{
			addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
			addNewListing.verifyNewAddContactMenu();            
		}
		obj.testFailure=addNewListing.testFailure;
		TestEnd();
	}


	//HTCHR_AC_SCR_001_TC_003
	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void HTCHR_AC_SCR_001_TC_003(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		AddNewListingTest addNewListing  = new AddNewListingTest(obj);
		for(int i=0;i<addNewListing.iterationCount.size();i++)
		{
			addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
			addNewListing.verifyNewAddContactMenu();            
		}
		obj.testFailure=addNewListing.testFailure;
		TestEnd();
	}
	//HTCHR_AC_SCR_001_TC_004
	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void HTCHR_AC_SCR_001_TC_004(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		AddNewListingTest addNewListing  = new AddNewListingTest(obj);
		for(int i=0;i<addNewListing.iterationCount.size();i++)
		{
			addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
			addNewListing.verifyNewAddContactFirstName();			
		}
		obj.testFailure=addNewListing.testFailure;
		TestEnd();
	}
	//HTCHR_AC_SCR_001_TC_005
	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void HTCHR_AC_SCR_001_TC_005(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		AddNewListingTest addNewListing  = new AddNewListingTest(obj);
		for(int i=0;i<addNewListing.iterationCount.size();i++)
		{
			addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
			addNewListing.verifyNewAddContactLasttName();            
		}
		obj.testFailure=addNewListing.testFailure;
		TestEnd();
	}

	//HTCHR_AC_SCR_001_TC_006
	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void HTCHR_AC_SCR_001_TC_006(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		AddNewListingTest addNewListing  = new AddNewListingTest(obj);
		for(int i=0;i<addNewListing.iterationCount.size();i++)
		{
			addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
			addNewListing. verifyNewAddContactEmail();            
		}
		obj.testFailure=addNewListing.testFailure;
		TestEnd();
	}

	//HTCHR_AC_SCR_001_TC_007
	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void HTCHR_AC_SCR_001_TC_007(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		AddNewListingTest addNewListing  = new AddNewListingTest(obj);
		for(int i=0;i<addNewListing.iterationCount.size();i++)
		{
			addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
			addNewListing.verifyNewAddContactJobTittle();            
		}
		obj.testFailure=addNewListing.testFailure;
		TestEnd();
	}

	//HTCHR_AC_SCR_001_TC_008
	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void HTCHR_AC_SCR_001_TC_008(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		AddNewListingTest addNewListing  = new AddNewListingTest(obj);
		for(int i=0;i<addNewListing.iterationCount.size();i++)
		{
			addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
			addNewListing.verifyNewAddContactPhoneNumber();            
		}
		obj.testFailure=addNewListing.testFailure;
		TestEnd();
	}

	//HTCHR_AC_SCR_001_TC_009
	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void HTCHR_AC_SCR_001_TC_009(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		AddNewListingTest addNewListing  = new AddNewListingTest(obj);
		for(int i=0;i<addNewListing.iterationCount.size();i++)
		{
			addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
			addNewListing.verifyNewAddContactLinkedIn();            
		}
		obj.testFailure=addNewListing.testFailure;
		TestEnd();
	}

	//HTCHR_AC_SCR_001_TC_010
	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void HTCHR_AC_SCR_001_TC_010(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		AddNewListingTest addNewListing  = new AddNewListingTest(obj);
		for(int i=0;i<addNewListing.iterationCount.size();i++)
		{
			addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
			addNewListing.verifyNewAddContactBio();            
		}
		obj.testFailure=addNewListing.testFailure;
		TestEnd();
	}
	//HTCHR_AC_SCR_001_TC_011
	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void HTCHR_AC_SCR_001_TC_011(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		AddNewListingTest addNewListing  = new AddNewListingTest(obj);
		for(int i=0;i<addNewListing.iterationCount.size();i++)
		{
			addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
			addNewListing.verifyNewAddContactAddress();			
		}
		obj.testFailure=addNewListing.testFailure;
		TestEnd();
	}

	//HTCHR_AC_SCR_001_TC_012
	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void HTCHR_AC_SCR_001_TC_012(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		AddNewListingTest addNewListing  = new AddNewListingTest(obj);
		for(int i=0;i<addNewListing.iterationCount.size();i++)
		{
			addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
			addNewListing.verifyNewAddContactAppartment();			
		}
		obj.testFailure=addNewListing.testFailure;
		TestEnd();
	}

	//HTCHR_AC_SCR_001_TC_013
	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void HTCHR_AC_SCR_001_TC_013(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		AddNewListingTest addNewListing  = new AddNewListingTest(obj);
		for(int i=0;i<addNewListing.iterationCount.size();i++)
		{
			addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
			addNewListing.verifyNewAddContactCity();			
		}
		obj.testFailure=addNewListing.testFailure;
		TestEnd();
	}

	//HTCHR_AC_SCR_001_TC_014
	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void HTCHR_AC_SCR_001_TC_014(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		AddNewListingTest addNewListing  = new AddNewListingTest(obj);
		for(int i=0;i<addNewListing.iterationCount.size();i++)
		{
			addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
			addNewListing.verifyNewAddContactState();			
		}
		obj.testFailure=addNewListing.testFailure;
		TestEnd();
	}

	//HTCHR_AC_SCR_001_TC_015
	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void HTCHR_AC_SCR_001_TC_015(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		AddNewListingTest addNewListing  = new AddNewListingTest(obj);
		for(int i=0;i<addNewListing.iterationCount.size();i++)
		{
			addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
			addNewListing.verifyNewAddContactPostalCode();			
		}
		obj.testFailure=addNewListing.testFailure;
		TestEnd();
	}

	//HTCHR_AC_SCR_001_TC_016 
	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void HTCHR_AC_SCR_001_TC_016(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		AddNewListingTest addNewListing  = new AddNewListingTest(obj);
		for(int i=0;i<addNewListing.iterationCount.size();i++)
		{
			addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
			addNewListing.verifyNewAddContactCountryCode();			
		}
		obj.testFailure=addNewListing.testFailure;
		TestEnd();
	}


	//HTCHR_AC_SCR_001_TC_017
	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void verifyAccountType(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		AddNewListingTest addNewListing  = new AddNewListingTest(obj);
		for(int i=0;i<addNewListing.iterationCount.size();i++)
		{
			addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
			addNewListing.verifyNewAddContactAccountType();			
		}
		obj.testFailure=addNewListing.testFailure;
		TestEnd();
	}

	//HTCHR_AC_SCR_001_TC_018
	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void verifyTypeOfBussiness(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		AddNewListingTest addNewListing  = new AddNewListingTest(obj);
		for(int i=0;i<addNewListing.iterationCount.size();i++)
		{
			addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
			addNewListing.verifyNewAddContactTypeOfBussiness();			
		}
		obj.testFailure=addNewListing.testFailure;
		TestEnd();
	}

	//HTCHR_AC_SCR_001_TC_019
	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void verifyListingAddedBy(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		AddNewListingTest addNewListing  = new AddNewListingTest(obj);
		for(int i=0;i<addNewListing.iterationCount.size();i++)
		{
			addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
			addNewListing.verifyNewAddContactListedAddedBy();			
		}
		obj.testFailure=addNewListing.testFailure;
		TestEnd();
	}

	//		  
	//		  //HTCHR_AC_SCR_001_TC_020
	//		  @Test(alwaysRun=true)
	//		  @Parameters({ "selenium.machinename"})
	//		  public void verifySentInviteField(String machineName,Method method) throws InterruptedException 
	//		  {
	//			TestStart(method.getName());
	//		    AddNewListingTest addNewListing  = new AddNewListingTest(obj);
	//			for(int i=0;i<addNewListing.iterationCount.size();i++)
	//			{
	//				  addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
	//				  addNewListing.verifyNewAddContactForm();			
	//			}
	//				obj.testFailure=addNewListing.testFailure;
	//					TestEnd();
	//		   }
	//		  
	//		//HTCHR_AC_SCR_001_TC_021
	//		  @Test(alwaysRun=true)
	//		  @Parameters({ "selenium.machinename"})
	//		  public void verifySentIndustryField(String machineName,Method method) throws InterruptedException 
	//		  {
	//			TestStart(method.getName());
	//		    AddNewListingTest addNewListing  = new AddNewListingTest(obj);
	//			for(int i=0;i<addNewListing.iterationCount.size();i++)
	//			{
	//				  addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
	//				  addNewListing.verifyNewAddContactForm();			
	//			}
	//				obj.testFailure=addNewListing.testFailure;
	//					TestEnd();
	//		   }
	//		  
	//		//HTCHR_AC_SCR_001_TC_022
	//		  @Test(alwaysRun=true)
	//		  @Parameters({ "selenium.machinename"})
	//		  public void verifySalutationDropdownFiltered(String machineName,Method method) throws InterruptedException 
	//		  {
	//			TestStart(method.getName());
	//		    AddNewListingTest addNewListing  = new AddNewListingTest(obj);
	//			for(int i=0;i<addNewListing.iterationCount.size();i++)
	//			{
	//				  addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
	//				  addNewListing.verifyNewAddContactForm();			
	//			}
	//				obj.testFailure=addNewListing.testFailure;
	//					TestEnd();
	//		   }
	//		  

	//HTCHR_AC_SCR_001_TC_024
	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void HTCHR_AC_SCR_001_TC_024(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		AddNewListingTest addNewListing  = new AddNewListingTest(obj);
		for(int i=0;i<addNewListing.iterationCount.size();i++)
		{
			addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
			addNewListing.verifyFirstNameMaxAndMinLength();			
		}
		obj.testFailure=addNewListing.testFailure;
		TestEnd();
	}


	//HTCHR_AC_SCR_001_TC_025
	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void HTCHR_AC_SCR_001_TC_025(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		AddNewListingTest addNewListing  = new AddNewListingTest(obj);
		for(int i=0;i<addNewListing.iterationCount.size();i++)
		{
			addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
			addNewListing.verifyFirstNameMaxLengthErrorMessage();			
		}
		obj.testFailure=addNewListing.testFailure;
		TestEnd();
	}


	//HTCHR_AC_SCR_001_TC_026
	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void HTCHR_AC_SCR_001_TC_026(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		AddNewListingTest addNewListing  = new AddNewListingTest(obj);
		for(int i=0;i<addNewListing.iterationCount.size();i++)
		{
			addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
			addNewListing.verifyLastNameMaxAndMinLength();			
		}
		obj.testFailure=addNewListing.testFailure;
		TestEnd();
	}

	// HTCHR_AC_SCR_001_TC_027
	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void HTCHR_AC_SCR_001_TC_027(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		AddNewListingTest addNewListing  = new AddNewListingTest(obj);
		for(int i=0;i<addNewListing.iterationCount.size();i++)
		{
			addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
			addNewListing.verifyLastNameMaxLengthErrorMessage();			
		}
		obj.testFailure=addNewListing.testFailure;
		TestEnd();
	}


	//HTCHR_AC_SCR_001_TC_028
	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void HTCHR_AC_SCR_001_TC_028(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		AddNewListingTest addNewListing  = new AddNewListingTest(obj);
		for(int i=0;i<addNewListing.iterationCount.size();i++)
		{
			addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
			addNewListing.verifyEmailMaxAndMinLength();			
		}
		obj.testFailure=addNewListing.testFailure;
		TestEnd();
	}


	//HTCHR_AC_SCR_001_TC_029
	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void HTCHR_AC_SCR_001_TC_029(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		AddNewListingTest addNewListing  = new AddNewListingTest(obj);
		for(int i=0;i<addNewListing.iterationCount.size();i++)
		{
			addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
			addNewListing.verifyEmailMaxLengthErrorMessage();			
		}
		obj.testFailure=addNewListing.testFailure;
		TestEnd();
	}

	//HTCHR_AC_SCR_001_TC_030
	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void HTCHR_AC_SCR_001_TC_030(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		AddNewListingTest addNewListing  = new AddNewListingTest(obj);
		for(int i=0;i<addNewListing.iterationCount.size();i++)
		{
			addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
			addNewListing.verifyJobTitleMaxAndMinLength();			
		}
		obj.testFailure=addNewListing.testFailure;
		TestEnd();
	}

	//HTCHR_AC_SCR_001_TC_031
	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void HTCHR_AC_SCR_001_TC_031(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		AddNewListingTest addNewListing  = new AddNewListingTest(obj);
		for(int i=0;i<addNewListing.iterationCount.size();i++)
		{
			addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
			addNewListing.verifyJobTitleMaxLengthErrorMessage();			
		}
		obj.testFailure=addNewListing.testFailure;
		TestEnd();
	}

	//HTCHR_AC_SCR_001_TC_032
	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void HTCHR_AC_SCR_001_TC_032(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		AddNewListingTest addNewListing  = new AddNewListingTest(obj);
		for(int i=0;i<addNewListing.iterationCount.size();i++)
		{
			addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
			addNewListing.verifyPhoneNumberMaxAndMinLength();			
		}
		obj.testFailure=addNewListing.testFailure;
		TestEnd();
	}

	//HTCHR_AC_SCR_001_TC_033
	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void HTCHR_AC_SCR_001_TC_033(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		AddNewListingTest addNewListing  = new AddNewListingTest(obj);
		for(int i=0;i<addNewListing.iterationCount.size();i++)
		{
			addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
			addNewListing.verifyPhoneNumberMaxLengthErrorMessage();			
		}
		obj.testFailure=addNewListing.testFailure;
		TestEnd();
	}

	//HTCHR_AC_SCR_001_TC_034
	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void HTCHR_AC_SCR_001_TC_034(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		AddNewListingTest addNewListing  = new AddNewListingTest(obj);
		for(int i=0;i<addNewListing.iterationCount.size();i++)
		{
			addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
			addNewListing.verifyLinkedInMaxAndMinLength();			
		}
		obj.testFailure=addNewListing.testFailure;
		TestEnd();
	}

	//HTCHR_AC_SCR_001_TC_035
	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void HTCHR_AC_SCR_001_TC_035(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		AddNewListingTest addNewListing  = new AddNewListingTest(obj);
		for(int i=0;i<addNewListing.iterationCount.size();i++)
		{
			addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
			addNewListing.verifyLinkedInMaxLengthErrorMessage();			
		}
		obj.testFailure=addNewListing.testFailure;
		TestEnd();
	}

	//		//HTCHR_AC_SCR_001_TC_036
	//		  @Test(alwaysRun=true)
	//		  @Parameters({ "selenium.machinename"})
	//		  public void HTCHR_AC_SCR_001_TC_036(String machineName,Method method) throws InterruptedException 
	//		  {
	//			TestStart(method.getName());
	//		    AddNewListingTest addNewListing  = new AddNewListingTest(obj);
	//			for(int i=0;i<addNewListing.iterationCount.size();i++)
	//			{
	//				  addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
	//				  addNewListing.verifyAddressMaxAndMinLength();			
	//			}
	//				obj.testFailure=addNewListing.testFailure;
	//					TestEnd();
	//		   }
	//		  
	//		  //HTCHR_AC_SCR_001_TC_037
	//		  @Test(alwaysRun=true)
	//		  @Parameters({ "selenium.machinename"})
	//		  public void verifyAboutThisPersonFieldMoreThan(String machineName,Method method) throws InterruptedException 
	//		  {
	//			TestStart(method.getName());
	//		    AddNewListingTest addNewListing  = new AddNewListingTest(obj);
	//			for(int i=0;i<addNewListing.iterationCount.size();i++)
	//			{
	//				  addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
	//				  addNewListing.userVerifyAndEnterTheCharacterGreaterCount();			
	//			}
	//				obj.testFailure=addNewListing.testFailure;
	//					TestEnd();
	//		   }

	//HTCHR_AC_SCR_001_TC_038
	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void HTCHR_AC_SCR_001_TC_038(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		AddNewListingTest addNewListing  = new AddNewListingTest(obj);
		for(int i=0;i<addNewListing.iterationCount.size();i++)
		{
			addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
			addNewListing.verifyAddressMaxAndMinLength();			
		}
		obj.testFailure=addNewListing.testFailure;
		TestEnd();
	}

	//HTCHR_AC_SCR_001_TC_039
	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void HTCHR_AC_SCR_001_TC_039(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		AddNewListingTest addNewListing  = new AddNewListingTest(obj);
		for(int i=0;i<addNewListing.iterationCount.size();i++)
		{
			addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
			addNewListing.verifyAddressMaxLengthErrorMessage();			
		}
		obj.testFailure=addNewListing.testFailure;
		TestEnd();
	}

	//HTCHR_AC_SCR_001_TC_040
	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void HTCHR_AC_SCR_001_TC_040(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		AddNewListingTest addNewListing  = new AddNewListingTest(obj);
		for(int i=0;i<addNewListing.iterationCount.size();i++)
		{
			addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
			addNewListing.verifyApartmentMaxAndMinLength();			
		}
		obj.testFailure=addNewListing.testFailure;
		TestEnd();
	}

	// HTCHR_AC_SCR_001_TC_041
	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void HTCHR_AC_SCR_001_TC_041(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		AddNewListingTest addNewListing  = new AddNewListingTest(obj);
		for(int i=0;i<addNewListing.iterationCount.size();i++)
		{
			addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
			addNewListing.verifyApartmentMaxLengthErrorMessage();			
		}
		obj.testFailure=addNewListing.testFailure;
		TestEnd();
	}

	//HTCHR_AC_SCR_001_TC_042
	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void HTCHR_AC_SCR_001_TC_042(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		AddNewListingTest addNewListing  = new AddNewListingTest(obj);
		for(int i=0;i<addNewListing.iterationCount.size();i++)
		{
			addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
			addNewListing.verifyCityMaxAndMinLength();			
		}
		obj.testFailure=addNewListing.testFailure;
		TestEnd();
	}

	//HTCHR_AC_SCR_001_TC_043
	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void HTCHR_AC_SCR_001_TC_043(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		AddNewListingTest addNewListing  = new AddNewListingTest(obj);
		for(int i=0;i<addNewListing.iterationCount.size();i++)
		{
			addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
			addNewListing.verifyCityMaxLengthErrorMessage();			
		}
		obj.testFailure=addNewListing.testFailure;
		TestEnd();
	}

	//HTCHR_AC_SCR_001_TC_044
	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void HTCHR_AC_SCR_001_TC_044(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		AddNewListingTest addNewListing  = new AddNewListingTest(obj);
		for(int i=0;i<addNewListing.iterationCount.size();i++)
		{
			addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
			addNewListing.verifyStateMaxAndMinLength();			
		}
		obj.testFailure=addNewListing.testFailure;
		TestEnd();
	}

	//HTCHR_AC_SCR_001_TC_045
	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void HTCHR_AC_SCR_001_TC_045(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		AddNewListingTest addNewListing  = new AddNewListingTest(obj);
		for(int i=0;i<addNewListing.iterationCount.size();i++)
		{
			addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
			addNewListing. verifyStateMaxLengthErrorMessage();			
		}
		obj.testFailure=addNewListing.testFailure;
		TestEnd();
	}

	//HTCHR_AC_SCR_001_TC_046
	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void HTCHR_AC_SCR_001_TC_046(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		AddNewListingTest addNewListing  = new AddNewListingTest(obj);
		for(int i=0;i<addNewListing.iterationCount.size();i++)
		{
			addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
			addNewListing.verifyPostalCodeMaxAndMinLength();			
		}
		obj.testFailure=addNewListing.testFailure;
		TestEnd();
	}

	//HTCHR_AC_SCR_001_TC_047
	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void HTCHR_AC_SCR_001_TC_047(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		AddNewListingTest addNewListing  = new AddNewListingTest(obj);
		for(int i=0;i<addNewListing.iterationCount.size();i++)
		{
			addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
			addNewListing.verifyPostalCodeMaxLengthErrorMessage();			
		}
		obj.testFailure=addNewListing.testFailure;
		TestEnd();

	}
	/********mahesh********/
//	@Test(alwaysRun=true)
//    @Parameters({ "selenium.machinename"})
//    public void HTCHR_AC_SCR_001_TC_048(String machineName,Method method) throws InterruptedException 
//    {
//        TestStart(method.getName());
//        AddNewListingTest addNewListing  = new AddNewListingTest(obj);
//        for(int i=0;i<addNewListing.iterationCount.size();i++)
//        {
//            addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
//            addNewListing.verifyCountryDropdownTypeRelevantData();            
//        }
//        obj.testFailure=addNewListing.testFailure;
//        TestEnd();
//    }
//
//    @Test(alwaysRun=true)
//    @Parameters({ "selenium.machinename"})
//    public void HTCHR_AC_SCR_001_TC_049(String machineName,Method method) throws InterruptedException 
//    {
//        TestStart(method.getName());
//        AddNewListingTest addNewListing  = new AddNewListingTest(obj);
//        for(int i=0;i<addNewListing.iterationCount.size();i++)
//        {
//            addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
//            addNewListing.verifyCountryDropdownTypeIrrelevantData();            
//        }
//        obj.testFailure=addNewListing.testFailure;
//        TestEnd();
//    }
//
//    @Test(alwaysRun=true)
//    @Parameters({ "selenium.machinename"})
//    public void HTCHR_AC_SCR_001_TC_050(String machineName,Method method) throws InterruptedException 
//    {
//        TestStart(method.getName());
//        AddNewListingTest addNewListing  = new AddNewListingTest(obj);
//        for(int i=0;i<addNewListing.iterationCount.size();i++)
//        {
//            addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
//            addNewListing.verifyAccountTypeDrpTypeRelevantData();            
//        }
//        obj.testFailure=addNewListing.testFailure;
//        TestEnd();
//    }
//
//    @Test(alwaysRun=true)
//    @Parameters({ "selenium.machinename"})
//    public void HTCHR_AC_SCR_001_TC_052(String machineName,Method method) throws InterruptedException 
//    {
//        TestStart(method.getName());
//        AddNewListingTest addNewListing  = new AddNewListingTest(obj);
//        for(int i=0;i<addNewListing.iterationCount.size();i++)
//        {
//            addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
//            addNewListing.verifyTypeOfBusinessDrpTypeRelevantData();            
//        }
//        obj.testFailure=addNewListing.testFailure;
//        TestEnd();
//    }
//
//    @Test(alwaysRun=true)
//    @Parameters({ "selenium.machinename"})
//    public void HTCHR_AC_SCR_001_TC_054(String machineName,Method method) throws InterruptedException 
//    {
//        TestStart(method.getName());
//        AddNewListingTest addNewListing  = new AddNewListingTest(obj);
//        for(int i=0;i<addNewListing.iterationCount.size();i++)
//        {
//            addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
//            addNewListing.verifyListingAddedByDrpTypeRelevantData();            
//        }
//        obj.testFailure=addNewListing.testFailure;
//        TestEnd();
//    }
//
//    @Test(alwaysRun=true)
//    @Parameters({ "selenium.machinename"})
//    public void HTCHR_AC_SCR_001_TC_056(String machineName,Method method) throws InterruptedException 
//    {
//        TestStart(method.getName());
//        AddNewListingTest addNewListing  = new AddNewListingTest(obj);
//        for(int i=0;i<addNewListing.iterationCount.size();i++)
//        {
//            addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
//            addNewListing.verifySendInviteDrpTypeRelevantData();            
//        }
//        obj.testFailure=addNewListing.testFailure;
//        TestEnd();
//    }
//
//    @Test(alwaysRun=true)
//    @Parameters({ "selenium.machinename"})
//    public void HTCHR_AC_SCR_001_TC_058(String machineName,Method method) throws InterruptedException 
//    {
//        TestStart(method.getName());
//        AddNewListingTest addNewListing  = new AddNewListingTest(obj);
//        for(int i=0;i<addNewListing.iterationCount.size();i++)
//        {
//            addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
//            addNewListing.verifyIndustryDrpTypeRelevantData();            
//        }
//        obj.testFailure=addNewListing.testFailure;
//        TestEnd();
//    }
//
//    @Test(alwaysRun=true)
//    @Parameters({ "selenium.machinename"})
//    public void HTCHR_AC_SCR_001_TC_059(String machineName,Method method) throws InterruptedException 
//    {
//        TestStart(method.getName());
//        AddNewListingTest addNewListing  = new AddNewListingTest(obj);
//        for(int i=0;i<addNewListing.iterationCount.size();i++)
//        {
//            addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
//            addNewListing.verifyIndustryDrpTypeIrrelevantData();            
//        }
//        obj.testFailure=addNewListing.testFailure;
//        TestEnd();
//    }
//	
//	




	//HTCHR_AC_SCR_001_TC_048
	//		  @Test(alwaysRun=true)
	//		  @Parameters({ "selenium.machinename"})
	//		  public void HTCHR_AC_SCR_001_TC_048(String machineName,Method method) throws InterruptedException 
	//		  {
	//			TestStart(method.getName());
	//		    AddNewListingTest addNewListing  = new AddNewListingTest(obj);
	//			for(int i=0;i<addNewListing.iterationCount.size();i++)
	//			{
	//				  addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
	//				  addNewListing.userVerifyAndEnterTheCharacterGreaterCount();			
	//			}
	//				obj.testFailure=addNewListing.testFailure;
	//					TestEnd();
	//		   }
	//
	//		//HTCHR_AC_SCR_001_TC_049
	//		  @Test(alwaysRun=true)
	//		  @Parameters({ "selenium.machinename"})
	//		  public void verifyCountryFieldCannotBeFiltered(String machineName,Method method) throws InterruptedException 
	//		  {
	//			TestStart(method.getName());
	//		    AddNewListingTest addNewListing  = new AddNewListingTest(obj);
	//			for(int i=0;i<addNewListing.iterationCount.size();i++)
	//			{
	//				  addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
	//				  addNewListing.userVerifyAndEnterTheCharacterGreaterCount();			
	//			}
	//				obj.testFailure=addNewListing.testFailure;
	//					TestEnd();
	//		   }
	//
	//		//HTCHR_AC_SCR_001_TC_050
	//		  @Test(alwaysRun=true)
	//		  @Parameters({ "selenium.machinename"})
	//		  public void verifyAccountTypeFieldFiltered(String machineName,Method method) throws InterruptedException 
	//		  {
	//			TestStart(method.getName());
	//		    AddNewListingTest addNewListing  = new AddNewListingTest(obj);
	//			for(int i=0;i<addNewListing.iterationCount.size();i++)
	//			{
	//				  addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
	//				  addNewListing.userVerifyAndEnterTheCharacterGreaterCount();			
	//			}
	//				obj.testFailure=addNewListing.testFailure;
	//					TestEnd();
	//		   }
	//		  
	//		//HTCHR_AC_SCR_001_TC_051
	//		  @Test(alwaysRun=true)
	//		  @Parameters({ "selenium.machinename"})
	//		  public void verifyAccountTypeFieldCannotBeFiltered(String machineName,Method method) throws InterruptedException 
	//		  {
	//			TestStart(method.getName());
	//		    AddNewListingTest addNewListing  = new AddNewListingTest(obj);
	//			for(int i=0;i<addNewListing.iterationCount.size();i++)
	//			{
	//				  addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
	//				  addNewListing.userVerifyAndEnterTheCharacterGreaterCount();			
	//			}
	//				obj.testFailure=addNewListing.testFailure;
	//					TestEnd();
	//		   }
	//		  
	//		//HTCHR_AC_SCR_001_TC_052
	//		  @Test(alwaysRun=true)
	//		  @Parameters({ "selenium.machinename"})
	//		  public void verifyTypeofBusssinessFieldFiltered(String machineName,Method method) throws InterruptedException 
	//		  {
	//			TestStart(method.getName());
	//		    AddNewListingTest addNewListing  = new AddNewListingTest(obj);
	//			for(int i=0;i<addNewListing.iterationCount.size();i++)
	//			{
	//				  addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
	//				  addNewListing.userVerifyAndEnterTheCharacterGreaterCount();			
	//			}
	//				obj.testFailure=addNewListing.testFailure;
	//					TestEnd();
	//		   }
	//		  
	//		//HTCHR_AC_SCR_001_TC_053
	//		  @Test(alwaysRun=true)
	//		  @Parameters({ "selenium.machinename"})
	//		  public void verifyTypeofBusssinessFieldCannotBeFiltered(String machineName,Method method) throws InterruptedException 
	//		  {
	//			TestStart(method.getName());
	//		    AddNewListingTest addNewListing  = new AddNewListingTest(obj);
	//			for(int i=0;i<addNewListing.iterationCount.size();i++)
	//			{
	//				  addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
	//				  addNewListing.userVerifyAndEnterTheCharacterGreaterCount();			
	//			}
	//				obj.testFailure=addNewListing.testFailure;
	//					TestEnd();
	//		   }
	//		  
	//		//HTCHR_AC_SCR_001_TC_054
	//		  @Test(alwaysRun=true)
	//		  @Parameters({ "selenium.machinename"})
	//		  public void verifyListingAddedByFieldFiltered(String machineName,Method method) throws InterruptedException 
	//		  {
	//			TestStart(method.getName());
	//		    AddNewListingTest addNewListing  = new AddNewListingTest(obj);
	//			for(int i=0;i<addNewListing.iterationCount.size();i++)
	//			{
	//				  addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
	//				  addNewListing.userVerifyAndEnterTheCharacterGreaterCount();			
	//			}
	//				obj.testFailure=addNewListing.testFailure;
	//					TestEnd();
	//		   }
	//		  
	//		//HTCHR_AC_SCR_001_TC_055
	//		  @Test(alwaysRun=true)
	//		  @Parameters({ "selenium.machinename"})
	//		  public void verifyListingAddedByFieldCannotBeFiltered(String machineName,Method method) throws InterruptedException 
	//		  {
	//			TestStart(method.getName());
	//		    AddNewListingTest addNewListing  = new AddNewListingTest(obj);
	//			for(int i=0;i<addNewListing.iterationCount.size();i++)
	//			{
	//				  addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
	//				  addNewListing.userVerifyAndEnterTheCharacterGreaterCount();			
	//			}
	//				obj.testFailure=addNewListing.testFailure;
	//					TestEnd();
	//		   }
	//		  
	//		//HTCHR_AC_SCR_001_TC_056
	//		  @Test(alwaysRun=true)
	//		  @Parameters({ "selenium.machinename"})
	//		  public void verifySendInviteFieldFiltered(String machineName,Method method) throws InterruptedException 
	//		  {
	//			TestStart(method.getName());
	//		    AddNewListingTest addNewListing  = new AddNewListingTest(obj);
	//			for(int i=0;i<addNewListing.iterationCount.size();i++)
	//			{
	//				  addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
	//				  addNewListing.userVerifyAndEnterTheCharacterGreaterCount();			
	//			}
	//				obj.testFailure=addNewListing.testFailure;
	//					TestEnd();
	//		   }
	//		  
	//		//HTCHR_AC_SCR_001_TC_057
	//		  @Test(alwaysRun=true)
	//		  @Parameters({ "selenium.machinename"})
	//		  public void verifySendInviteFieldCannotBeFiltered(String machineName,Method method) throws InterruptedException 
	//		  {
	//			TestStart(method.getName());
	//		    AddNewListingTest addNewListing  = new AddNewListingTest(obj);
	//			for(int i=0;i<addNewListing.iterationCount.size();i++)
	//			{
	//				  addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
	//				  addNewListing.userVerifyAndEnterTheCharacterGreaterCount();			
	//			}
	//				obj.testFailure=addNewListing.testFailure;
	//					TestEnd();
	//		   }
	//		  
	//		//HTCHR_AC_SCR_001_TC_058
	//		  @Test(alwaysRun=true)
	//		  @Parameters({ "selenium.machinename"})
	//		  public void verifyIndustryFieldFiltered(String machineName,Method method) throws InterruptedException 
	//		  {
	//			TestStart(method.getName());
	//		    AddNewListingTest addNewListing  = new AddNewListingTest(obj);
	//			for(int i=0;i<addNewListing.iterationCount.size();i++)
	//			{
	//				  addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
	//				  addNewListing.userVerifyAndEnterTheCharacterGreaterCount();			
	//			}
	//				obj.testFailure=addNewListing.testFailure;
	//					TestEnd();
	//		   }
	//		  
	//		//HTCHR_AC_SCR_001_TC_059
	//		  @Test(alwaysRun=true)
	//		  @Parameters({ "selenium.machinename"})
	//		  public void verifyIndustryFieldCannotBeFiltered(String machineName,Method method) throws InterruptedException 
	//		  {
	//			TestStart(method.getName());
	//		    AddNewListingTest addNewListing  = new AddNewListingTest(obj);
	//			for(int i=0;i<addNewListing.iterationCount.size();i++)
	//			{
	//				  addNewListing.dataRowNo=Integer.parseInt(addNewListing.iterationCount.get(i).toString());
	//				  addNewListing.userVerifyAndEnterTheCharacterGreaterCount();			
	//			}
	//				obj.testFailure=addNewListing.testFailure;
	//					TestEnd();
	//		   }
	//}
	//HTCHR_AC_SCR_001_TC_068
	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void HTCHR_AC_SCR_001_TC_068(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		AddNewListingTest addNewList  = new AddNewListingTest(obj);
		for(int i=0;i<addNewList.iterationCount.size();i++)
		{
			addNewList.dataRowNo=Integer.parseInt(addNewList.iterationCount.get(i).toString());
			addNewList.verifyInvestorSelectValue();            
		}
		obj.testFailure=addNewList.testFailure;
		TestEnd();
	}

	//HTCHR_AC_SCR_001_TC_070
	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void HTCHR_AC_SCR_001_TC_070(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		AddNewListingTest addNewList  = new AddNewListingTest(obj);
		for(int i=0;i<addNewList.iterationCount.size();i++)
		{
			addNewList.dataRowNo=Integer.parseInt(addNewList.iterationCount.get(i).toString());
			addNewList.verifyMandatoryFiled() ;            
		}
		obj.testFailure=addNewList.testFailure;
		TestEnd();
	}

	//HTCHR_AC_SCR_001_TC_073
	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void HTCHR_AC_SCR_001_TC_073(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		AddNewListingTest addNewList  = new AddNewListingTest(obj);
		for(int i=0;i<addNewList.iterationCount.size();i++)
		{
			addNewList.dataRowNo=Integer.parseInt(addNewList.iterationCount.get(i).toString());
			addNewList.verifyNonMandatoryFiled() ;            
		}
		obj.testFailure=addNewList.testFailure;
		TestEnd();
	}
	//HTCHR_AC_SCR_001_TC_074
	@Test(alwaysRun=true)
	@Parameters({ "selenium.machinename"})
	public void HTCHR_AC_SCR_001_TC_074(String machineName,Method method) throws InterruptedException 
	{
		TestStart(method.getName());
		AddNewListingTest addNewList  = new AddNewListingTest(obj);
		for(int i=0;i<addNewList.iterationCount.size();i++)
		{
			addNewList.dataRowNo=Integer.parseInt(addNewList.iterationCount.get(i).toString());
			addNewList.validMandatoryNonMandatoryFields() ;            
		}
		obj.testFailure=addNewList.testFailure;
		TestEnd();
	}
}

















