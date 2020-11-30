package stepDefFreeCRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FreeCRMlogin {
	WebDriver driver;

	@FindBy(name="email") WebElement userName;

	@FindBy(name="password") WebElement pwd;   

	@FindBy(xpath="//*[@id='ui']/div/div/form/div/div[3]") WebElement login;

	@FindBy(xpath="//*[@id='ui']/div/div/form/div/div[3]/div") WebElement Alert;

	public FreeCRMlogin(WebDriver driver){

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	public void loginToFreeCRM(String strUsername, String strPassword){
		this.setUsername(strUsername);
		this.setPassword(strPassword);
		}
	public void setUsername(String strUsername) {
		userName.sendKeys(strUsername);

	}
	public void setPassword(String strPassword) {
		pwd.sendKeys(strPassword);

	}

	public void loginclick() {
		login.click();
		
	}
	public void displayAlert(){
		Alert.getText();
		
	}
 



}
