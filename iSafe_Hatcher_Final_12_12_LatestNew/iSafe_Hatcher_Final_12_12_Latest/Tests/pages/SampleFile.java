package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleFile {
	
public static WebDriver driver;
	public static void  main(String arg[]) {
	System.setProperty("webdriver.chrome.driver","D:\\Hatcher\\iSafe_Hatcher_Final_12_12_LatestNew\\iSafe_Hatcher_Final_12_12_Latest\\ChromeDriver\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("google.com");
		

	String personalplaceholderr="First Name#Last Name#Middle Name";
//  First Name#Last Name#Middle Name
  String[] personal=personalplaceholderr.split("#");
  for (String string : personal) {
	

  System.out.println(string);
}
}
}