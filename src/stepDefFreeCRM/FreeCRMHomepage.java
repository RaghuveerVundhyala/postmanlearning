package stepDefFreeCRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FreeCRMHomepage {
	WebDriver driver;
	@FindBy(xpath="//*[@id='top-header-menu']/div[3]/span[1]") WebElement displayName;
	@FindBy(xpath="//*[@id='top-header-menu']/div[3]/div[2]/div/i") WebElement Settings;
	@FindBy(xpath="//*[@id='top-header-menu']/div[3]/div[2]/div/div/a[5]/span") WebElement Logout;
	
	public FreeCRMHomepage(WebDriver driver){

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	public void DisplayHome(){
		displayName.getText();
		System.out.println(displayName);
	}
//    public void signOut() throws Exception{
//    	Settings.click();
//    	Thread.sleep(1000);
//    	Logout.click();
//    }
	public void signOut() throws Exception {
		// TODO Auto-generated method stub
	   	Settings.click();
    	Thread.sleep(1000);
    	Logout.click();
	}
}
