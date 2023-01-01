package webScenarios;

import baseClass.BaseClass;
import iSAFE.ApplicationKeywords;
import webPages.AddNewListing;
import webPages.NewLoginPage;

public class AddNewListingTest extends ApplicationKeywords
{
	private Boolean status = false;

	BaseClass obj;
	NewLoginPage newLoginPage;
	AddNewListing  addNewListing;

	public AddNewListingTest(BaseClass obj) 
	{
		super(obj);
		this.obj = obj;
	}


	//HTCHR_AC_SCR_001_TC_001,//HTCHR_AC_SCR_001_TC_003
	public void verifyNewAddContactMenu()
	{
		try
		{
			addNewListing=new AddNewListing(obj);
			newLoginPage= new NewLoginPage(obj);

			String allMenu = retrieve("Menu Text");
			String allMenuType = retrieve("Menu Type");
			String adminemail = retrieve("Admin Email");
			String adminPassword = retrieve("Admin Password");
			String selSalutation = retrieve("contactSalutation");

			newLoginPage.loginApplication(adminemail,adminPassword);
			addNewListing.validateSalutation(allMenu,allMenuType,selSalutation);
			addNewListing.closeAddListingPopup();
			newLoginPage.logOut();

		}
		catch(Exception e)
		{
			System.err.println(e.toString());
		}
		finally
		{
			if(this.testFailure||newLoginPage.testFailure|| addNewListing.testFailure)
			{
				this.testFailure = true;
			}
		}
	}

	//HTCHR_AC_SCR_001_TC_004
	public void verifyNewAddContactFirstName()
	{
		try
		{
			addNewListing=new AddNewListing(obj);
			newLoginPage= new NewLoginPage(obj);

			String allMenu = retrieve("Menu Text");
			String allMenuType = retrieve("Menu Type");
			String adminemail = retrieve("Admin Email");
			String adminPassword = retrieve("Admin Password");
			String selSalutation = retrieve("contactSalutation");
			String firstname = retrieve("contactFirstName");

			newLoginPage.loginApplication(adminemail,adminPassword);
			addNewListing.validateSalutation(allMenu,allMenuType,selSalutation);
			addNewListing.validateFirstName(firstname);
			addNewListing.closeAddListingPopup();
			newLoginPage.logOut();

		}
		catch(Exception e)
		{
			System.err.println(e.toString());
		}
		finally
		{
			if(this.testFailure||newLoginPage.testFailure|| addNewListing.testFailure)
			{
				this.testFailure = true;
			}
		}
	}
	//HTCHR_AC_SCR_001_TC_005
	public void verifyNewAddContactLasttName()
	{
		try
		{
			addNewListing=new AddNewListing(obj);
			newLoginPage= new NewLoginPage(obj);

			String allMenu = retrieve("Menu Text");
			String allMenuType = retrieve("Menu Type");
			String adminemail = retrieve("Admin Email");
			String adminPassword = retrieve("Admin Password");
			String selSalutation = retrieve("contactSalutation");
			String lastName=retrieve("contactLastName");

			newLoginPage.loginApplication(adminemail,adminPassword);
			addNewListing.validateSalutation(allMenu,allMenuType,selSalutation);
			addNewListing.validateLastName(lastName);
			addNewListing.closeAddListingPopup();
			newLoginPage.logOut();

		}
		catch(Exception e)
		{
			System.err.println(e.toString());
		}
		finally
		{
			if(this.testFailure||newLoginPage.testFailure|| addNewListing.testFailure)
			{
				this.testFailure = true;
			}
		}
	}
	//HTCHR_AC_SCR_001_TC_006
	public void verifyNewAddContactEmail()
	{
		try
		{
			addNewListing=new AddNewListing(obj);
			newLoginPage= new NewLoginPage(obj);

			String allMenu = retrieve("Menu Text");
			String allMenuType = retrieve("Menu Type");
			String adminemail = retrieve("Admin Email");
			String adminPassword = retrieve("Admin Password");
			String selSalutation = retrieve("contactSalutation");
			String emailId=retrieve("EMail Id");

			newLoginPage.loginApplication(adminemail,adminPassword);
			addNewListing.validateSalutation(allMenu,allMenuType,selSalutation);
			addNewListing.validateEmail(emailId);
			addNewListing.closeAddListingPopup();
			newLoginPage.logOut();
		}
		catch(Exception e)
		{
			System.err.println(e.toString());
		}
		finally
		{
			if(this.testFailure||newLoginPage.testFailure|| addNewListing.testFailure)
			{
				this.testFailure = true;
			}
		}
	}
	//HTCHR_AC_SCR_001_TC_007
	public void verifyNewAddContactJobTittle()
	{
		try
		{
			addNewListing=new AddNewListing(obj);
			newLoginPage= new NewLoginPage(obj);

			String allMenu = retrieve("Menu Text");
			String allMenuType = retrieve("Menu Type");
			String adminemail = retrieve("Admin Email");
			String adminPassword = retrieve("Admin Password");
			String selSalutation = retrieve("contactSalutation");
			String jobTittle=retrieve("contactJobTitle");

			newLoginPage.loginApplication(adminemail,adminPassword);
			addNewListing.validateSalutation(allMenu,allMenuType,selSalutation);
			addNewListing.validateJobTitle(jobTittle);
			addNewListing.closeAddListingPopup();
			newLoginPage.logOut();
		}
		catch(Exception e)
		{
			System.err.println(e.toString());
		}
		finally
		{
			if(this.testFailure||newLoginPage.testFailure|| addNewListing.testFailure)
			{
				this.testFailure = true;
			}
		}
	}
	//HTCHR_AC_SCR_001_TC_008
	public void verifyNewAddContactPhoneNumber()
	{
		try
		{
			addNewListing=new AddNewListing(obj);
			newLoginPage= new NewLoginPage(obj);

			String allMenu = retrieve("Menu Text");
			String allMenuType = retrieve("Menu Type");
			String adminemail = retrieve("Admin Email");
			String adminPassword = retrieve("Admin Password");
			String selSalutation = retrieve("contactSalutation");
			String phoneNumber=retrieve("Phone Number");

			newLoginPage.loginApplication(adminemail,adminPassword);
			addNewListing.validateSalutation(allMenu,allMenuType,selSalutation);
			addNewListing.validatePhone(phoneNumber);
			addNewListing.closeAddListingPopup();
			newLoginPage.logOut();
		}
		catch(Exception e)
		{
			System.err.println(e.toString());
		}
		finally
		{
			if(this.testFailure||newLoginPage.testFailure|| addNewListing.testFailure)
			{
				this.testFailure = true;
			}
		}
	}
	//HTCHR_AC_SCR_001_TC_009
	public void verifyNewAddContactLinkedIn()
	{
		try
		{
			addNewListing=new AddNewListing(obj);
			newLoginPage= new NewLoginPage(obj);

			String allMenu = retrieve("Menu Text");
			String allMenuType = retrieve("Menu Type");
			String adminemail = retrieve("Admin Email");
			String adminPassword = retrieve("Admin Password");
			String selSalutation = retrieve("contactSalutation");
			String linkedIn=retrieve("LinkedIn");

			newLoginPage.loginApplication(adminemail,adminPassword);
			addNewListing.validateSalutation(allMenu,allMenuType,selSalutation);
			addNewListing.validateLinkedIn( linkedIn);
			addNewListing.closeAddListingPopup();
			newLoginPage.logOut();
		}
		catch(Exception e)
		{
			System.err.println(e.toString());
		}
		finally
		{
			if(this.testFailure||newLoginPage.testFailure|| addNewListing.testFailure)
			{
				this.testFailure = true;
			}
		}
	}
	//HTCHR_AC_SCR_001_TC_010
	public void verifyNewAddContactBio()
	{
		try
		{
			addNewListing=new AddNewListing(obj);
			newLoginPage= new NewLoginPage(obj);

			String allMenu = retrieve("Menu Text");
			String allMenuType = retrieve("Menu Type");
			String adminemail = retrieve("Admin Email");
			String adminPassword = retrieve("Admin Password");
			String selSalutation = retrieve("contactSalutation");

			newLoginPage.loginApplication(adminemail,adminPassword);
			addNewListing.validateSalutation(allMenu,allMenuType,selSalutation);
			addNewListing.validateBio();
			addNewListing.closeAddListingPopup();
			newLoginPage.logOut();
		}
		catch(Exception e)
		{
			System.err.println(e.toString());
		}
		finally
		{
			if(this.testFailure||newLoginPage.testFailure|| addNewListing.testFailure)
			{
				this.testFailure = true;
			}
		}
	}
	//HTCHR_AC_SCR_001_TC_011
	public void verifyNewAddContactAddress()
	{
		try
		{
			addNewListing=new AddNewListing(obj);
			newLoginPage= new NewLoginPage(obj);

			String allMenu = retrieve("Menu Text");
			String allMenuType = retrieve("Menu Type");
			String adminemail = retrieve("Admin Email");
			String adminPassword = retrieve("Admin Password");
			String selSalutation = retrieve("contactSalutation");
			String address = retrieve("contactAddress");

			newLoginPage.loginApplication(adminemail,adminPassword);
			addNewListing.validateSalutation(allMenu,allMenuType,selSalutation);
			addNewListing. validateAddress(address);
			addNewListing.closeAddListingPopup();
			newLoginPage.logOut();
		}
		catch(Exception e)
		{
			System.err.println(e.toString());
		}
		finally
		{
			if(this.testFailure||newLoginPage.testFailure|| addNewListing.testFailure)
			{
				this.testFailure = true;
			}
		}
	}

	//HTCHR_AC_SCR_001_TC_012
	public void verifyNewAddContactAppartment()
	{
		try
		{
			addNewListing=new AddNewListing(obj);
			newLoginPage= new NewLoginPage(obj);

			String allMenu = retrieve("Menu Text");
			String allMenuType = retrieve("Menu Type");
			String adminemail = retrieve("Admin Email");
			String adminPassword = retrieve("Admin Password");
			String selSalutation = retrieve("contactSalutation");
			String apartment=retrieve("ContactSuitAppartment ");

			newLoginPage.loginApplication(adminemail,adminPassword);
			addNewListing.validateSalutation(allMenu,allMenuType,selSalutation);
			addNewListing. validateApartment(apartment);
			addNewListing.closeAddListingPopup();
			newLoginPage.logOut();
		}
		catch(Exception e)
		{
			System.err.println(e.toString());
		}
		finally
		{
			if(this.testFailure||newLoginPage.testFailure|| addNewListing.testFailure)
			{
				this.testFailure = true;
			}
		}
	}

	//HTCHR_AC_SCR_001_TC_013
	public void verifyNewAddContactCity()
	{
		try
		{
			addNewListing=new AddNewListing(obj);
			newLoginPage= new NewLoginPage(obj);

			String allMenu = retrieve("Menu Text");
			String allMenuType = retrieve("Menu Type");
			String adminemail = retrieve("Admin Email");
			String adminPassword = retrieve("Admin Password");
			String selSalutation = retrieve("contactSalutation");
			String city=retrieve("ContactCity");

			newLoginPage.loginApplication(adminemail,adminPassword);
			addNewListing.validateSalutation(allMenu,allMenuType,selSalutation);
			addNewListing. validateCity(city);
			addNewListing.closeAddListingPopup();
			newLoginPage.logOut();
		}
		catch(Exception e)
		{
			System.err.println(e.toString());
		}
		finally
		{
			if(this.testFailure||newLoginPage.testFailure|| addNewListing.testFailure)
			{
				this.testFailure = true;
			}
		}
	}
	//HTCHR_AC_SCR_001_TC_014
	public void verifyNewAddContactState()
	{
		try
		{
			addNewListing=new AddNewListing(obj);
			newLoginPage= new NewLoginPage(obj);

			String allMenu = retrieve("Menu Text");
			String allMenuType = retrieve("Menu Type");
			String adminemail = retrieve("Admin Email");
			String adminPassword = retrieve("Admin Password");
			String selSalutation = retrieve("contactSalutation");
			String state=retrieve("contactState");

			newLoginPage.loginApplication(adminemail,adminPassword);
			addNewListing.validateSalutation(allMenu,allMenuType,selSalutation);
			addNewListing.validatestate(state);
			addNewListing.closeAddListingPopup();
			newLoginPage.logOut();
		}
		catch(Exception e)
		{
			System.err.println(e.toString());
		}
		finally
		{
			if(this.testFailure||newLoginPage.testFailure|| addNewListing.testFailure)
			{
				this.testFailure = true;
			}
		}
	}
	//HTCHR_AC_SCR_001_TC_015
	public void verifyNewAddContactPostalCode()
	{
		try
		{
			addNewListing=new AddNewListing(obj);
			newLoginPage= new NewLoginPage(obj);

			String allMenu = retrieve("Menu Text");
			String allMenuType = retrieve("Menu Type");
			String adminemail = retrieve("Admin Email");
			String adminPassword = retrieve("Admin Password");
			String selSalutation = retrieve("contactSalutation");
			String postalCode=retrieve("ContactPostalCode");

			newLoginPage.loginApplication(adminemail,adminPassword);
			addNewListing.validateSalutation(allMenu,allMenuType,selSalutation);
			addNewListing.validatePotalCode(postalCode);
			addNewListing.closeAddListingPopup();
			newLoginPage.logOut();
		}
		catch(Exception e)
		{
			System.err.println(e.toString());
		}
		finally
		{
			if(this.testFailure||newLoginPage.testFailure|| addNewListing.testFailure)
			{
				this.testFailure = true;
			}
		}
	}
	//HTCHR_AC_SCR_001_TC_016
	public void verifyNewAddContactCountryCode()
	{
		try
		{
			addNewListing=new AddNewListing(obj);
			newLoginPage= new NewLoginPage(obj);

			String allMenu = retrieve("Menu Text");
			String allMenuType = retrieve("Menu Type");
			String adminemail = retrieve("Admin Email");
			String adminPassword = retrieve("Admin Password");
			String selSalutation = retrieve("contactSalutation");
			String countryCode=retrieve("ContactCountry");

			newLoginPage.loginApplication(adminemail,adminPassword);
			addNewListing.validateSalutation(allMenu,allMenuType,selSalutation);
			addNewListing.validateCountry(countryCode);
			addNewListing.closeAddListingPopup();
			newLoginPage.logOut();
		}
		catch(Exception e)
		{
			System.err.println(e.toString());
		}
		finally
		{
			if(this.testFailure||newLoginPage.testFailure|| addNewListing.testFailure)
			{
				this.testFailure = true;
			}
		}
	}
	//HTCHR_AC_SCR_001_TC_017
	public void verifyNewAddContactAccountType()
	{
		try
		{
			addNewListing=new AddNewListing(obj);
			newLoginPage= new NewLoginPage(obj);

			String allMenu = retrieve("Menu Text");
			String allMenuType = retrieve("Menu Type");
			String adminemail = retrieve("Admin Email");
			String adminPassword = retrieve("Admin Password");
			String selSalutation = retrieve("contactSalutation");
			String AccountTypes=retrieve("ContactAccountType");

			newLoginPage.loginApplication(adminemail,adminPassword);
			addNewListing.validateSalutation(allMenu,allMenuType,selSalutation);
			addNewListing.verifyDefaultAccountTypeIsPresent(AccountTypes);
			addNewListing.closeAddListingPopup();
			newLoginPage.logOut();
		}
		catch(Exception e)
		{
			System.err.println(e.toString());
		}
		finally
		{
			if(this.testFailure||newLoginPage.testFailure|| addNewListing.testFailure)
			{
				this.testFailure = true;
			}
		}
	}
	//HTCHR_AC_SCR_001_TC_018
	public void verifyNewAddContactTypeOfBussiness()
	{
		try
		{
			addNewListing=new AddNewListing(obj);
			newLoginPage= new NewLoginPage(obj);

			String allMenu = retrieve("Menu Text");
			String allMenuType = retrieve("Menu Type");
			String adminemail = retrieve("Admin Email");
			String adminPassword = retrieve("Admin Password");
			String selSalutation = retrieve("contactSalutation");
			String typesOfBussiness=retrieve("ContactTypeOfBussiness");

			newLoginPage.loginApplication(adminemail,adminPassword);
			addNewListing.validateSalutation(allMenu,allMenuType,selSalutation);
			addNewListing.verifyDefaultTypeOfBussinessIsPresent(typesOfBussiness);
			addNewListing.closeAddListingPopup();
			newLoginPage.logOut();
		}
		catch(Exception e)
		{
			System.err.println(e.toString());
		}
		finally
		{
			if(this.testFailure||newLoginPage.testFailure|| addNewListing.testFailure)
			{
				this.testFailure = true;
				resetApp();
			}
		}
	}
	//HTCHR_AC_SCR_001_TC_019
	public void verifyNewAddContactListedAddedBy()
	{
		try
		{
			addNewListing=new AddNewListing(obj);
			newLoginPage= new NewLoginPage(obj);

			String allMenu = retrieve("Menu Text");
			String allMenuType = retrieve("Menu Type");
			String adminemail = retrieve("Admin Email");
			String adminPassword = retrieve("Admin Password");
			String selSalutation = retrieve("contactSalutation");
			String ListedAddedBy=retrieve("ContactTypeOfBussiness");

			newLoginPage.loginApplication(adminemail,adminPassword);
			addNewListing.validateSalutation(allMenu,allMenuType,selSalutation);
			addNewListing.verifyDefaultTypeOfListedBy(ListedAddedBy);
			addNewListing.closeAddListingPopup();
			newLoginPage.logOut();
		}
		catch(Exception e)
		{
			System.err.println(e.toString());
		}
		finally
		{
			if(this.testFailure||newLoginPage.testFailure|| addNewListing.testFailure)
			{
				this.testFailure = true;
				resetApp();
			}
		}
	}
	//HTCHR_AC_SCR_001_TC_024
	public void verifyFirstNameMaxAndMinLength()
	{
		try
		{
			addNewListing=new AddNewListing(obj);
			newLoginPage= new NewLoginPage(obj);

			String allMenu = retrieve("Menu Text");
			String allMenuType = retrieve("Menu Type");
			String adminemail = retrieve("Admin Email");
			String adminPassword = retrieve("Admin Password");
			String selSalutation = retrieve("contactSalutation");
			String firstNameLength=retrieve("Character Length");

			newLoginPage.loginApplication(adminemail,adminPassword);
			addNewListing.validateSalutation(allMenu,allMenuType,selSalutation);
			addNewListing.validateMaxFirstNameLength(firstNameLength);
			addNewListing.closeAddListingPopup();
			newLoginPage.logOut();
		}
		catch(Exception e)
		{
			System.err.println(e.toString());
		}
		finally
		{
			if(this.testFailure||newLoginPage.testFailure|| addNewListing.testFailure)
			{
				this.testFailure = true;
				resetApp();
			}
		}
	}
	//HTCHR_AC_SCR_001_TC_025
	public void verifyFirstNameMaxLengthErrorMessage()
	{
		try
		{
			addNewListing=new AddNewListing(obj);
			newLoginPage= new NewLoginPage(obj);

			String allMenu = retrieve("Menu Text");
			String allMenuType = retrieve("Menu Type");
			String adminemail = retrieve("Admin Email");
			String adminPassword = retrieve("Admin Password");
			String selSalutation = retrieve("contactSalutation");
			String firstNameLength=retrieve("Character Length");

			newLoginPage.loginApplication(adminemail,adminPassword);
			addNewListing.validateSalutation(allMenu,allMenuType,selSalutation);
			addNewListing.validateMaxFirstNameError(firstNameLength);
			addNewListing.closeAddListingPopup();
			newLoginPage.logOut();
		}
		catch(Exception e)
		{
			System.err.println(e.toString());
		}
		finally
		{
			if(this.testFailure||newLoginPage.testFailure|| addNewListing.testFailure)
			{
				this.testFailure = true;
				resetApp();
			}
		}
	}
	//HTCHR_AC_SCR_001_TC_026
	public void verifyLastNameMaxAndMinLength()
	{
		try
		{
			addNewListing=new AddNewListing(obj);
			newLoginPage= new NewLoginPage(obj);

			String allMenu = retrieve("Menu Text");
			String allMenuType = retrieve("Menu Type");
			String adminemail = retrieve("Admin Email");
			String adminPassword = retrieve("Admin Password");
			String selSalutation = retrieve("contactSalutation");
			String lastNameLength=retrieve("Character Length");

			newLoginPage.loginApplication(adminemail,adminPassword);
			addNewListing.validateSalutation(allMenu,allMenuType,selSalutation);
			addNewListing.validateMaxLastNameLength(lastNameLength);
			addNewListing.closeAddListingPopup();
			newLoginPage.logOut();
		}
		catch(Exception e)
		{
			System.err.println(e.toString());
		}
		finally
		{
			if(this.testFailure||newLoginPage.testFailure|| addNewListing.testFailure)
			{
				this.testFailure = true;
				resetApp();
			}
		}
	}
	//HTCHR_AC_SCR_001_TC_027
	public void verifyLastNameMaxLengthErrorMessage()
	{
		try
		{
			addNewListing=new AddNewListing(obj);
			newLoginPage= new NewLoginPage(obj);

			String allMenu = retrieve("Menu Text");
			String allMenuType = retrieve("Menu Type");
			String adminemail = retrieve("Admin Email");
			String adminPassword = retrieve("Admin Password");
			String selSalutation = retrieve("contactSalutation");
			String lastNameLength=retrieve("Character Length");

			newLoginPage.loginApplication(adminemail,adminPassword);
			addNewListing.validateSalutation(allMenu,allMenuType,selSalutation);
			addNewListing.validateMaxLastNameError(lastNameLength);
			addNewListing.closeAddListingPopup();
			newLoginPage.logOut();
		}
		catch(Exception e)
		{
			System.err.println(e.toString());
		}
		finally
		{
			if(this.testFailure||newLoginPage.testFailure|| addNewListing.testFailure)
			{
				this.testFailure = true;
				resetApp();
			}
		}
	}

	//HTCHR_AC_SCR_001_TC_028
	public void verifyEmailMaxAndMinLength()
	{
		try
		{
			addNewListing=new AddNewListing(obj);
			newLoginPage= new NewLoginPage(obj);		 

			String allMenu = retrieve("Menu Text");
			String allMenuType = retrieve("Menu Type");
			String adminemail = retrieve("Admin Email");
			String adminPassword = retrieve("Admin Password");
			String selSalutation = retrieve("contactSalutation");
			String emailLength=retrieve("Character Length");

			newLoginPage.loginApplication(adminemail,adminPassword);
			addNewListing.validateSalutation(allMenu,allMenuType,selSalutation);
			addNewListing.validateMaxEmailLength(emailLength);
			addNewListing.closeAddListingPopup();
			newLoginPage.logOut();
		}
		catch(Exception e)
		{
			System.err.println(e.toString());
		}
		finally
		{
			if(this.testFailure||newLoginPage.testFailure|| addNewListing.testFailure)
			{
				this.testFailure = true;
				resetApp();
			}
		}
	}
	//HTCHR_AC_SCR_001_TC_029
	public void verifyEmailMaxLengthErrorMessage()
	{
		try
		{
			addNewListing=new AddNewListing(obj);
			newLoginPage= new NewLoginPage(obj);		 

			String allMenu = retrieve("Menu Text");
			String allMenuType = retrieve("Menu Type");
			String adminemail = retrieve("Admin Email");
			String adminPassword = retrieve("Admin Password");
			String selSalutation = retrieve("contactSalutation");
			String emailLength=retrieve("Character Length");

			newLoginPage.loginApplication(adminemail,adminPassword);
			addNewListing.validateSalutation(allMenu,allMenuType,selSalutation);
			addNewListing.validateMaxEmailError(emailLength);
			addNewListing.closeAddListingPopup();
			newLoginPage.logOut();
		}
		catch(Exception e)
		{
			System.err.println(e.toString());
		}
		finally
		{
			if(this.testFailure||newLoginPage.testFailure|| addNewListing.testFailure)
			{
				this.testFailure = true;
				resetApp();
			}
		}
	}
	//HTCHR_AC_SCR_001_TC_030
	public void verifyJobTitleMaxAndMinLength()
	{
		try
		{
			addNewListing=new AddNewListing(obj);
			newLoginPage= new NewLoginPage(obj);

			String allMenu = retrieve("Menu Text");
			String allMenuType = retrieve("Menu Type");
			String adminemail = retrieve("Admin Email");
			String adminPassword = retrieve("Admin Password");
			String selSalutation = retrieve("contactSalutation");
			String jobTitleLength=retrieve("Character Length");

			newLoginPage.loginApplication(adminemail,adminPassword);
			addNewListing.validateSalutation(allMenu,allMenuType,selSalutation);
			addNewListing.validateMaxJobTitleLength(jobTitleLength);
			addNewListing.closeAddListingPopup();
			newLoginPage.logOut();
		}
		catch(Exception e)
		{
			System.err.println(e.toString());
		}
		finally
		{
			if(this.testFailure||newLoginPage.testFailure|| addNewListing.testFailure)
			{
				this.testFailure = true;
				resetApp();
			}
		}
	}

	//HTCHR_AC_SCR_001_TC_031
	public void verifyJobTitleMaxLengthErrorMessage()
	{
		try
		{
			addNewListing=new AddNewListing(obj);
			newLoginPage= new NewLoginPage(obj);

			String allMenu = retrieve("Menu Text");
			String allMenuType = retrieve("Menu Type");
			String adminemail = retrieve("Admin Email");
			String adminPassword = retrieve("Admin Password");
			String selSalutation = retrieve("contactSalutation");
			String jobTitleLength=retrieve("Character Length");

			newLoginPage.loginApplication(adminemail,adminPassword);
			addNewListing.validateSalutation(allMenu,allMenuType,selSalutation);
			addNewListing.validateMaxJobTitleError(jobTitleLength);
			addNewListing.closeAddListingPopup();
			newLoginPage.logOut();
		}
		catch(Exception e)
		{
			System.err.println(e.toString());
		}
		finally
		{
			if(this.testFailure||newLoginPage.testFailure|| addNewListing.testFailure)
			{
				this.testFailure = true;
				resetApp();
			}
		}
	}
	//HTCHR_AC_SCR_001_TC_032
	public void verifyPhoneNumberMaxAndMinLength()
	{
		try
		{
			addNewListing=new AddNewListing(obj);
			newLoginPage= new NewLoginPage(obj);

			String allMenu = retrieve("Menu Text");
			String allMenuType = retrieve("Menu Type");
			String adminemail = retrieve("Admin Email");
			String adminPassword = retrieve("Admin Password");
			String selSalutation = retrieve("contactSalutation");
			String phoneLength=retrieve("Character Length");

			newLoginPage.loginApplication(adminemail,adminPassword);
			addNewListing.validateSalutation(allMenu,allMenuType,selSalutation);
			addNewListing.validateMaxPhoneLength(phoneLength);
			addNewListing.closeAddListingPopup();
			newLoginPage.logOut();
		}
		catch(Exception e)
		{
			System.err.println(e.toString());
		}
		finally
		{
			if(this.testFailure||newLoginPage.testFailure|| addNewListing.testFailure)
			{
				this.testFailure = true;
				resetApp();
			}
		}
	}
	//HTCHR_AC_SCR_001_TC_033
	public void verifyPhoneNumberMaxLengthErrorMessage()
	{
		try
		{
			addNewListing=new AddNewListing(obj);
			newLoginPage= new NewLoginPage(obj);

			String allMenu = retrieve("Menu Text");
			String allMenuType = retrieve("Menu Type");
			String adminemail = retrieve("Admin Email");
			String adminPassword = retrieve("Admin Password");
			String selSalutation = retrieve("contactSalutation");
			String phoneLength=retrieve("Character Length");

			newLoginPage.loginApplication(adminemail,adminPassword);
			addNewListing.validateSalutation(allMenu,allMenuType,selSalutation);
			addNewListing.validateMaxPhoneError(phoneLength);
			addNewListing.closeAddListingPopup();
			newLoginPage.logOut();
		}
		catch(Exception e)
		{
			System.err.println(e.toString());
		}
		finally
		{
			if(this.testFailure||newLoginPage.testFailure|| addNewListing.testFailure)
			{
				this.testFailure = true;
				resetApp();
			}
		}
	}
	//HTCHR_AC_SCR_001_TC_034
	public void verifyLinkedInMaxAndMinLength()
	{
		try
		{
			addNewListing=new AddNewListing(obj);
			newLoginPage= new NewLoginPage(obj);

			String allMenu = retrieve("Menu Text");
			String allMenuType = retrieve("Menu Type");
			String adminemail = retrieve("Admin Email");
			String adminPassword = retrieve("Admin Password");
			String selSalutation = retrieve("contactSalutation");
			String linkedInLength=retrieve("Character Length");


			newLoginPage.loginApplication(adminemail,adminPassword);
			addNewListing.validateSalutation(allMenu,allMenuType,selSalutation);
			addNewListing.validateLessLinkedInLength(linkedInLength);
			addNewListing.closeAddListingPopup();
			newLoginPage.logOut();
		}
		catch(Exception e)
		{
			System.err.println(e.toString());
		}
		finally
		{
			if(this.testFailure||newLoginPage.testFailure|| addNewListing.testFailure)
			{
				this.testFailure = true;
				resetApp();
			}
		}
	}

	//HTCHR_AC_SCR_001_TC_035
	public void verifyLinkedInMaxLengthErrorMessage()
	{
		try
		{
			addNewListing=new AddNewListing(obj);
			newLoginPage= new NewLoginPage(obj);

			String allMenu = retrieve("Menu Text");
			String allMenuType = retrieve("Menu Type");
			String adminemail = retrieve("Admin Email");
			String adminPassword = retrieve("Admin Password");
			String selSalutation = retrieve("contactSalutation");
			String linkedInLength=retrieve("Character Length");


			newLoginPage.loginApplication(adminemail,adminPassword);
			addNewListing.validateSalutation(allMenu,allMenuType,selSalutation);
			addNewListing.validateLinkedInError(linkedInLength);
			addNewListing.closeAddListingPopup();
			newLoginPage.logOut();
		}
		catch(Exception e)
		{
			System.err.println(e.toString());
		}
		finally
		{
			if(this.testFailure||newLoginPage.testFailure|| addNewListing.testFailure)
			{
				this.testFailure = true;
				resetApp();
			}
		}
	}

	//HTCHR_AC_SCR_001_TC_038
	public void verifyAddressMaxAndMinLength()
	{
		try
		{
			addNewListing=new AddNewListing(obj);
			newLoginPage= new NewLoginPage(obj);

			String allMenu = retrieve("Menu Text");
			String allMenuType = retrieve("Menu Type");
			String adminemail = retrieve("Admin Email");
			String adminPassword = retrieve("Admin Password");
			String selSalutation = retrieve("contactSalutation");
			String addressLength=retrieve("Character Length");

			newLoginPage.loginApplication(adminemail,adminPassword);
			addNewListing.validateSalutation(allMenu,allMenuType,selSalutation);
			addNewListing.validateLessAddressLength(addressLength);
			addNewListing.closeAddListingPopup();
			newLoginPage.logOut();
		}
		catch(Exception e)
		{
			System.err.println(e.toString());
		}
		finally
		{
			if(this.testFailure||newLoginPage.testFailure|| addNewListing.testFailure)
			{
				this.testFailure = true;
				resetApp();
			}
		}
	}

	//HTCHR_AC_SCR_001_TC_039
	public void verifyAddressMaxLengthErrorMessage()
	{
		try
		{
			addNewListing=new AddNewListing(obj);
			newLoginPage= new NewLoginPage(obj);

			String allMenu = retrieve("Menu Text");
			String allMenuType = retrieve("Menu Type");
			String adminemail = retrieve("Admin Email");
			String adminPassword = retrieve("Admin Password");
			String selSalutation = retrieve("contactSalutation");
			String addressLength=retrieve("Character Length");


			newLoginPage.loginApplication(adminemail,adminPassword);
			addNewListing.validateSalutation(allMenu,allMenuType,selSalutation);
			addNewListing.validateAddressError(addressLength);
			addNewListing.closeAddListingPopup();
			newLoginPage.logOut();
		}
		catch(Exception e)
		{
			System.err.println(e.toString());
		}
		finally
		{
			if(this.testFailure||newLoginPage.testFailure|| addNewListing.testFailure)
			{
				this.testFailure = true;
				resetApp();
			}
		}
	}

	//HTCHR_AC_SCR_001_TC_040
	public void verifyApartmentMaxAndMinLength()
	{
		try
		{
			addNewListing=new AddNewListing(obj);
			newLoginPage= new NewLoginPage(obj);

			String allMenu = retrieve("Menu Text");
			String allMenuType = retrieve("Menu Type");
			String adminemail = retrieve("Admin Email");
			String adminPassword = retrieve("Admin Password");
			String selSalutation = retrieve("contactSalutation");
			String apartmentLength=retrieve("Character Length");

			newLoginPage.loginApplication(adminemail,adminPassword);
			addNewListing.validateSalutation(allMenu,allMenuType,selSalutation);
			addNewListing.validateLessApartmentLength(apartmentLength);
			addNewListing.closeAddListingPopup();
			newLoginPage.logOut();
		}
		catch(Exception e)
		{
			System.err.println(e.toString());
		}
		finally
		{
			if(this.testFailure||newLoginPage.testFailure|| addNewListing.testFailure)
			{
				this.testFailure = true;
				resetApp();
			}
		}
	}

	//HTCHR_AC_SCR_001_TC_041
	public void verifyApartmentMaxLengthErrorMessage()
	{
		try
		{
			addNewListing=new AddNewListing(obj);
			newLoginPage= new NewLoginPage(obj);

			String allMenu = retrieve("Menu Text");
			String allMenuType = retrieve("Menu Type");
			String adminemail = retrieve("Admin Email");
			String adminPassword = retrieve("Admin Password");
			String selSalutation = retrieve("contactSalutation");
			String apartmentLength=retrieve("Character Length");


			newLoginPage.loginApplication(adminemail,adminPassword);
			addNewListing.validateSalutation(allMenu,allMenuType,selSalutation);
			addNewListing.validateApartmentError(apartmentLength);
			addNewListing.closeAddListingPopup();
			newLoginPage.logOut();
		}
		catch(Exception e)
		{
			System.err.println(e.toString());
		}
		finally
		{
			if(this.testFailure||newLoginPage.testFailure|| addNewListing.testFailure)
			{
				this.testFailure = true;
				resetApp();
			}
		}
	}

	//HTCHR_AC_SCR_001_TC_042
	public void verifyCityMaxAndMinLength()
	{
		try
		{
			addNewListing=new AddNewListing(obj);
			newLoginPage= new NewLoginPage(obj);

			String allMenu = retrieve("Menu Text");
			String allMenuType = retrieve("Menu Type");
			String adminemail = retrieve("Admin Email");
			String adminPassword = retrieve("Admin Password");
			String selSalutation = retrieve("contactSalutation");
			String cityLength=retrieve("Character Length");


			newLoginPage.loginApplication(adminemail,adminPassword);
			addNewListing.validateSalutation(allMenu,allMenuType,selSalutation);
			addNewListing.validateLessCityLength(cityLength);
			addNewListing.closeAddListingPopup();
			newLoginPage.logOut();
		}
		catch(Exception e)
		{
			System.err.println(e.toString());
		}
		finally
		{
			if(this.testFailure||newLoginPage.testFailure|| addNewListing.testFailure)
			{
				this.testFailure = true;
				resetApp();
			}
		}
	}

	//HTCHR_AC_SCR_001_TC_043
	public void verifyCityMaxLengthErrorMessage()
	{
		try
		{
			addNewListing=new AddNewListing(obj);
			newLoginPage= new NewLoginPage(obj);

			String allMenu = retrieve("Menu Text");
			String allMenuType = retrieve("Menu Type");
			String adminemail = retrieve("Admin Email");
			String adminPassword = retrieve("Admin Password");
			String selSalutation = retrieve("contactSalutation");
			String cityLength=retrieve("Character Length");


			newLoginPage.loginApplication(adminemail,adminPassword);
			addNewListing.validateSalutation(allMenu,allMenuType,selSalutation);
			addNewListing.validateCityError(cityLength);
			addNewListing.closeAddListingPopup();
			newLoginPage.logOut();
		}
		catch(Exception e)
		{
			System.err.println(e.toString());
		}
		finally
		{
			if(this.testFailure||newLoginPage.testFailure|| addNewListing.testFailure)
			{
				this.testFailure = true;
				resetApp();
			}
		}
	}

	//HTCHR_AC_SCR_001_TC_044
	public void verifyStateMaxAndMinLength()
	{
		try
		{
			addNewListing=new AddNewListing(obj);
			newLoginPage= new NewLoginPage(obj);

			String allMenu = retrieve("Menu Text");
			String allMenuType = retrieve("Menu Type");
			String adminemail = retrieve("Admin Email");
			String adminPassword = retrieve("Admin Password");
			String selSalutation = retrieve("contactSalutation");
			String stateLength=retrieve("Character Length");


			newLoginPage.loginApplication(adminemail,adminPassword);
			addNewListing.validateSalutation(allMenu,allMenuType,selSalutation);
			addNewListing.validateLessStateLength(stateLength);
			addNewListing.closeAddListingPopup();
			newLoginPage.logOut();
		}
		catch(Exception e)
		{
			System.err.println(e.toString());
		}
		finally
		{
			if(this.testFailure||newLoginPage.testFailure|| addNewListing.testFailure)
			{
				this.testFailure = true;
				resetApp();
			}
		}
	}

	//HTCHR_AC_SCR_001_TC_045
	public void verifyStateMaxLengthErrorMessage()
	{
		try
		{
			addNewListing=new AddNewListing(obj);
			newLoginPage= new NewLoginPage(obj);

			String allMenu = retrieve("Menu Text");
			String allMenuType = retrieve("Menu Type");
			String adminemail = retrieve("Admin Email");
			String adminPassword = retrieve("Admin Password");
			String selSalutation = retrieve("contactSalutation");
			String stateLength=retrieve("Character Length");


			newLoginPage.loginApplication(adminemail,adminPassword);
			addNewListing.validateSalutation(allMenu,allMenuType,selSalutation);
			addNewListing.validateStateError(stateLength);
			addNewListing.closeAddListingPopup();
			newLoginPage.logOut();
		}
		catch(Exception e)
		{
			System.err.println(e.toString());
		}
		finally
		{
			if(this.testFailure||newLoginPage.testFailure|| addNewListing.testFailure)
			{
				this.testFailure = true;
				resetApp();
			}
		}
	}

	//HTCHR_AC_SCR_001_TC_046
	public void verifyPostalCodeMaxAndMinLength()
	{
		try
		{
			addNewListing=new AddNewListing(obj);
			newLoginPage= new NewLoginPage(obj);

			String allMenu = retrieve("Menu Text");
			String allMenuType = retrieve("Menu Type");
			String adminemail = retrieve("Admin Email");
			String adminPassword = retrieve("Admin Password");
			String selSalutation = retrieve("contactSalutation");
			String postalCodeLength=retrieve("Character Length");


			newLoginPage.loginApplication(adminemail,adminPassword);
			addNewListing.validateSalutation(allMenu,allMenuType,selSalutation);
			addNewListing.validateLessPostalCodeLength(postalCodeLength);
			addNewListing.closeAddListingPopup();
			newLoginPage.logOut();
		}
		catch(Exception e)
		{
			System.err.println(e.toString());
		}
		finally
		{
			if(this.testFailure||newLoginPage.testFailure|| addNewListing.testFailure)
			{
				this.testFailure = true;
				resetApp();
			}
		}
	}

	//HTCHR_AC_SCR_001_TC_047
	public void verifyPostalCodeMaxLengthErrorMessage()
	{
		try
		{
			addNewListing=new AddNewListing(obj);
			newLoginPage= new NewLoginPage(obj);

			String allMenu = retrieve("Menu Text");
			String allMenuType = retrieve("Menu Type");
			String adminemail = retrieve("Admin Email");
			String adminPassword = retrieve("Admin Password");
			String selSalutation = retrieve("contactSalutation");
			String postalCodeLength=retrieve("Character Length");


			newLoginPage.loginApplication(adminemail,adminPassword);
			addNewListing.validateSalutation(allMenu,allMenuType,selSalutation);
			addNewListing.validatePostalCodeError(postalCodeLength);
			addNewListing.closeAddListingPopup();
			newLoginPage.logOut();
		}
		catch(Exception e)
		{
			System.err.println(e.toString());
		}
		finally
		{
			if(this.testFailure||newLoginPage.testFailure|| addNewListing.testFailure)
			{
				this.testFailure = true;
			}
		}
	}

	//HTCHR_AC_SCR_001_TC_021
	public void verifyNewAddContactIndustry()
	{
		try
		{
			addNewListing=new AddNewListing(obj);
			newLoginPage= new NewLoginPage(obj);

			String allMenu = retrieve("Menu Text");
			String allMenuType = retrieve("Menu Type");
			String adminemail = retrieve("Admin Email");
			String adminPassword = retrieve("Admin Password");
			String selSalutation = retrieve("contactSalutation");
			String Industry=retrieve("ContactIndustry");


			newLoginPage.loginApplication(adminemail,adminPassword);
			addNewListing.validateSalutation(allMenu,allMenuType,selSalutation);
			addNewListing.validateIndustry(Industry);
			addNewListing.closeAddListingPopup();
			newLoginPage.logOut();
		}
		catch(Exception e)
		{
			System.err.println(e.toString());
		}
		finally
		{
			if(this.testFailure||newLoginPage.testFailure|| addNewListing.testFailure)
			{
				this.testFailure = true;
			}
		}
	}

	//HTCHR_AC_SCR_001_TC_068
    public void verifyInvestorSelectValue() 
    {
        try
        {
            addNewListing=new AddNewListing(obj);
            newLoginPage= new NewLoginPage(obj);
           

            String adminemail = retrieve("Admin Email");
            String adminPassword = retrieve("Admin Password");
            String sideBarText = retrieve("Menu Text");
            String addNewText = retrieve("Menu Type");
            String salutationOption = retrieve("Salutation Detail");

            String firstName = retrieve("First Name");
            String middleName = retrieve("Middle Name");
            String lastName = retrieve("Last Name");
            String name = firstName + " " + middleName+ " "+lastName;
            String emailId = retrieve("Email ID");
            String JobTextBox = retrieve("Job TextBox");
            String PhoneNo = retrieve("phoneNo");
            String linkedInTextBox = retrieve("LinkedIn Detail");
            String enterBioDetails = retrieve("Bio Detail");

            String enterAddress = retrieve("Address Detail");
            String apartmentNo = retrieve("Apartment No");
            String cityName = retrieve("City Name");

            String countryName = retrieve("Country Name");
            String stateName = retrieve("State Name");
            String postalCode = retrieve("postal Code");
            String accountTypesofList = retrieve("Account TypesList");
            String listOfAccountType = retrieve("Account Type");
            String listOfBusinessType = retrieve("Business Type");
            String listingAddBy = retrieve("Add By Listing");
            String ListofsendInvite = retrieve("List Of sendInvite");
            String selectIndustry = retrieve("Industry Type");
            String successMsg = retrieve("Success Message"); 

            newLoginPage.Login(adminemail,adminPassword);
            addNewListing.validateAddNewListing(sideBarText, addNewText, salutationOption, firstName, middleName,  lastName, emailId, JobTextBox, PhoneNo,
                     linkedInTextBox, enterBioDetails, enterAddress, apartmentNo, cityName, stateName, postalCode, countryName, accountTypesofList, listOfAccountType, listOfBusinessType,
                     listingAddBy, ListofsendInvite, selectIndustry,successMsg, name);
            newLoginPage.logOut();
        }
        catch(Exception e)
        {
            testStepFailed("Exception in the Method userClickOnmenuButton "+e.toString());
        }
        finally
        {
            if(this.testFailure||this.obj.testFailure|| addNewListing.testFailure)
            {
                this.testFailure = true;
                resetApp();
            }
        }
    }
  //HTCHR_AC_SCR_001_TC_070
    public void verifyMandatoryFiled() 
    {
        try
        {
            addNewListing=new AddNewListing(obj);
            newLoginPage= new NewLoginPage(obj);

            String adminemail = retrieve("Admin Email");
            String adminPassword = retrieve("Admin Password");
            String sideBarText = retrieve("Menu Text");
            String addNewText = retrieve("Menu Type");
            String salutationOption = retrieve("Salutation Detail");

            String firstName = retrieve("First Name");
            String lastName = retrieve("Last Name");
            String name = firstName + " "+lastName;
            String EmailId = retrieve("Email ID");
            String successMsg = retrieve("Success Message"); 
            String countryName = retrieve("Country Name");

            newLoginPage.Login(adminemail,adminPassword);
            addNewListing.validMadatoryFiledsSucess(sideBarText, addNewText, salutationOption, firstName, lastName, EmailId, countryName,successMsg, name);
            newLoginPage.logOut();
        }

        catch(Exception e)
        {
            testStepFailed("Exception in the Method userClickOnmenuButton "+e.toString());
        }

        finally
        {
            if(this.testFailure||this.obj.testFailure|| addNewListing.testFailure)
            {
                this.testFailure = true;
                resetApp();
            }
        }
    }
      //HTCHR_AC_SCR_001_TC_073
        public void verifyNonMandatoryFiled() 
        {
            try
            {
                addNewListing=new AddNewListing(obj);
                newLoginPage= new NewLoginPage(obj);

                String adminemail = retrieve("Admin Email");
                String adminPassword = retrieve("Admin Password");
                String sideBarText = retrieve("Menu Text");
                String addNewText = retrieve("Menu Type");

                String middleName = retrieve("Middle Name");
                String JobTextBox = retrieve("Job TextBox");
                String PhoneNo = retrieve("phoneNo");
                String linkedInTextBox = retrieve("LinkedIn Detail");
                String enterBioDetails = retrieve("Bio Detail");
                String enterAddress = retrieve("Address Detail");
                String apartmentNo = retrieve("Apartment No");
                String cityName = retrieve("City Name");
                String stateName = retrieve("State Name");
                String postalCode = retrieve("postal Code");
                String listOfAccountType = retrieve("Account Type");
                String listOfBusinessType = retrieve("Business Type");
                String listingAddBy = retrieve("Add By Listing");
                String ListofsendInvite = retrieve("List Of sendInvite");
                String selectIndustry = retrieve("Industry Type");


                newLoginPage.Login(adminemail,adminPassword);
                addNewListing.validNonMandatoryFields(sideBarText, addNewText, middleName, JobTextBox,  PhoneNo, 
                         linkedInTextBox, enterBioDetails,enterAddress, apartmentNo, cityName, stateName, postalCode, listOfAccountType, listOfBusinessType,
                         listingAddBy,  ListofsendInvite, selectIndustry);
                newLoginPage.logOut();
            }

            catch(Exception e)
            {
                testStepFailed("Exception in the Method userClickOnmenuButton "+e.toString());
            }

            finally
            {
                if(this.testFailure||newLoginPage.testFailure|| addNewListing.testFailure)
                {
                    this.testFailure = true;
                    resetApp();
                }
            }
        }
            
          //HTCHR_AC_SCR_001_TC_074
            public void validMandatoryNonMandatoryFields() 
            {
                try
                {
                    addNewListing=new AddNewListing(obj);
                    newLoginPage= new NewLoginPage(obj);

                    String adminemail = retrieve("Admin Email");
                    String adminPassword = retrieve("Admin Password");
                    String sideBarText = retrieve("Menu Text");
                    String addNewText = retrieve("Menu Type");
                    String salutationOption = retrieve("Salutation Detail");

                    String firstName = retrieve("First Name");
                    String middleName = retrieve("Middle Name");
                    String lastName = retrieve("Last Name");
                    String name = firstName + " " + middleName+ " "+lastName;
                    String EmailId = retrieve("Email ID");
                    String JobTextBox = retrieve("Job TextBox");
                    String PhoneNo = retrieve("phoneNo");
                    String linkedInTextBox = retrieve("LinkedIn Detail");
                    String enterBioDetails = retrieve("Bio Detail");

                    String enterAddress = retrieve("Address Detail");
                    String apartmentNo = retrieve("Apartment No");
                    String cityName = retrieve("City Name");

                    String countryName = retrieve("Country Name");
                    String stateName = retrieve("State Name");
                    String postalCode = retrieve("postal Code");
                    String accountTypesofList = retrieve("Account TypesList");
                    String listOfAccountType = retrieve("Account Type");
                    String listOfBusinessType = retrieve("Business Type");
                    String listingAddBy = retrieve("Add By Listing");
                    String ListofsendInvite = retrieve("List Of sendInvite");
                    String selectIndustry = retrieve("Industry Type");

                    newLoginPage.Login(adminemail,adminPassword);
                    addNewListing.validMandatoryNonMandatoryFields(sideBarText, addNewText, salutationOption,firstName,  middleName,  lastName,  EmailId,  JobTextBox,  PhoneNo,
                             linkedInTextBox,  enterBioDetails, enterAddress, apartmentNo, cityName, stateName, postalCode, countryName, accountTypesofList, listOfAccountType, listOfBusinessType,
                             listingAddBy, ListofsendInvite, selectIndustry);
                    newLoginPage.logOut();
                }

                catch(Exception e)
                {
                    testStepFailed("Exception in the Method userClickOnmenuButton "+e.toString());
                }

                finally
                {
                    if(this.testFailure||this.obj.testFailure|| addNewListing.testFailure)
                    {
                        this.testFailure = true;
                        resetApp();
                    }
                }
            }
                //HTCHR_AC_SCR_001_TC_075
                public void validateclickOnAddIndividualButton() 
                {
                    try
                    {
                        addNewListing=new AddNewListing(obj);
                        newLoginPage= new NewLoginPage(obj);

                        String adminemail = retrieve("Admin Email");
                        String adminPassword = retrieve("Admin Password");
                        String sideBarText = retrieve("Menu Text");
                        String addNewText = retrieve("Menu Type");
                        String salutationOption = retrieve("Salutation Detail");

                        String firstName = retrieve("First Name");
                        String middleName = retrieve("Middle Name");
                        String lastName = retrieve("Last Name");
                        String name = firstName + " " + middleName+ " "+lastName;
                        String emailId = retrieve("Email ID");
                        String JobTextBox = retrieve("Job TextBox");
                        String PhoneNo = retrieve("phoneNo");
                        String linkedInTextBox = retrieve("LinkedIn Detail");
                        String enterBioDetails = retrieve("Bio Detail");

                        String enterAddress = retrieve("Address Detail");
                        String apartmentNo = retrieve("Apartment No");
                        String cityName = retrieve("City Name");

                        String countryName = retrieve("Country Name");
                        String stateName = retrieve("State Name");
                        String postalCode = retrieve("postal Code");
                        String accountTypesofList = retrieve("Account TypesList");
                        String listOfAccountType = retrieve("Account Type");
                        String listOfBusinessType = retrieve("Business Type");
                        String listingAddBy = retrieve("Add By Listing");
                        String ListofsendInvite = retrieve("List Of sendInvite");
                        String selectIndustry = retrieve("Industry Type");
                        String successMsg = retrieve("Success Message");

                        newLoginPage.Login(adminemail,adminPassword);
                        addNewListing.validateAddNewListing(sideBarText, addNewText, salutationOption, firstName, middleName,  lastName, emailId, JobTextBox, PhoneNo,
                                linkedInTextBox, enterBioDetails, enterAddress, apartmentNo, cityName, stateName, postalCode, countryName, accountTypesofList, listOfAccountType, listOfBusinessType,
                                listingAddBy, ListofsendInvite, selectIndustry,successMsg, name); 
         
                        newLoginPage.logOut();
                       
                    }

                    catch(Exception e)
                    {
                        testStepFailed("Exception in the Method userClickOnmenuButton "+e.toString());
                    }

                    finally
                    {
                        if(this.testFailure||this.obj.testFailure|| addNewListing.testFailure)
                        {
                            this.testFailure = true;
                            resetApp();
                        }
                    }
            }
                //HTCHR_AC_SCR_001_TC_076
                public void validateEmailAddress () 
                {
                    try
                    {
                        addNewListing=new AddNewListing(obj);
                        newLoginPage= new NewLoginPage(obj);

                        String adminemail = retrieve("Admin Email");
                        String adminPassword = retrieve("Admin Password");
                        String sideBarText = retrieve("Menu Text");
                        String addNewText = retrieve("Menu Type");
                        String salutationOption = retrieve("Salutation Detail");

                        String firstName = retrieve("First Name");
                        String middleName = retrieve("Middle Name");
                        String lastName = retrieve("Last Name");
                        String name = firstName + " " + middleName+ " "+lastName;
                        String emailId = retrieve("Email ID");
                        String JobTextBox = retrieve("Job TextBox");
                        String PhoneNo = retrieve("phoneNo");
                        String linkedInTextBox = retrieve("LinkedIn Detail");
                        String enterBioDetails = retrieve("Bio Detail");

                        String enterAddress = retrieve("Address Detail");
                        String apartmentNo = retrieve("Apartment No");
                        String cityName = retrieve("City Name");

                        String countryName = retrieve("Country Name");
                        String stateName = retrieve("State Name");
                        String postalCode = retrieve("postal Code");
                        String accountTypesofList = retrieve("Account TypesList");
                        String listOfAccountType = retrieve("Account Type");
                        String listOfBusinessType = retrieve("Business Type");
                        String listingAddBy = retrieve("Add By Listing");
                        String ListofsendInvite = retrieve("List Of sendInvite");
                        String selectIndustry = retrieve("Industry Type");
                        String successMsg = retrieve("Success Message");
                        
                        String emailServer = retrieve("");
                        String emailPassword = retrieve("");
                        String emailSubject = retrieve("");
                       
                        newLoginPage.Login(adminemail,adminPassword);
                        addNewListing.validateAddNewListing(sideBarText, addNewText, salutationOption, firstName, middleName,  lastName, emailId, JobTextBox, PhoneNo,
                                linkedInTextBox, enterBioDetails, enterAddress, apartmentNo, cityName, stateName, postalCode, countryName, accountTypesofList, listOfAccountType, listOfBusinessType,
                                listingAddBy, ListofsendInvite, selectIndustry,successMsg, name); 
         
                        newLoginPage.logOut();
                        addNewListing.readMailBox(emailServer, emailId, emailPassword, emailSubject);
                    }

                    catch(Exception e)
                    {
                        testStepFailed("Exception in the Method userClickOnmenuButton "+e.toString());
                    }

                    finally
                    {
                        if(this.testFailure||this.obj.testFailure|| addNewListing.testFailure)
                        {
                            this.testFailure = true;
                            resetApp();
                        }
                    }
            }

	//			String Search=retrieve("Search Text")

	//HTCHR_AC_SCR_001_TC_050//
	public void userVerifyDropdownTypes() 
	{
		try
		{
			String adminemail = retrieve("Admin Email");
			String adminPassword = retrieve("Admin Password");

			newLoginPage.loginApplication(adminemail,adminPassword);

			addNewListing.verifyDefaultTypes();
			addNewListing.industryDefaultSearchName();
		}
		catch(Exception e)
		{
			System.err.println(e.toString());
		}
		finally
		{
			if(this.testFailure||this.obj.testFailure|| addNewListing.testFailure)
			{
				this.testFailure = true;
			}
		}
	}

}
