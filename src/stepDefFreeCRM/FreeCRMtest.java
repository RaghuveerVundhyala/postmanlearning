package stepDefFreeCRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefFreeCRM.FreeCRMHomepage;
import stepDefFreeCRM.FreeCRMlogin;


public class FreeCRMtest {
	WebDriver driver;
	FreeCRMlogin objLogin;
	FreeCRMHomepage objhome;

	@Before
	public void OpenBrowser(){
		System.setProperty("webdriver.chrome.driver","C:\\selenium_jar\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


	}

	@Given("^User is on Login Page$")
	public void user_is_on_Login_Page() throws Throwable {
		driver.get("https://ui.freecrm.com/");

	}

	@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password() throws Throwable {
		objLogin = new FreeCRMlogin(driver);
		objLogin.loginToFreeCRM("raghuvindhyala18@gmail.com","Raghu@0224");

	}

	@When("^clicks on login button$")
	public void clicks_on_login_button() throws Throwable {

		objLogin.loginclick();

	}

	@Then("^User is navigated to FreeCRM main page$")
	public void user_is_navigated_to_FreeCRM_main_page() throws Throwable {
		objhome = new FreeCRMHomepage(driver);
		objhome.DisplayHome();
		

	}

	@When("^User enters invalid UserName and Password$")
	public void user_enters_invalid_UserName_and_Password() throws Throwable {

	}

	@Then("^Display alert Message$")
	public void display_alert_Message() throws Throwable {
		objLogin.displayAlert();
		
//		displayName.getText();
//		System.out.println(displayName);

	}

	@When("^User enters UserName and leaves Password empty$")
	public void user_enters_UserName_and_leaves_Password_empty() throws Throwable {

	}

	@When("^User enters Password and leaves UserName empty$")
	public void user_enters_Password_and_leaves_UserName_empty() throws Throwable {

	}

	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable {

	}

	@Then("^User is sucessfully signed out$")
	public void user_is_sucessfully_signed_out() throws Throwable {
         objhome.signOut();
	}

}
