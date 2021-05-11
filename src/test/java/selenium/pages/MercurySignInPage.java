package selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MercurySignInPage {
	
	@FindBy (name = "userName")
	private WebElement username;
	
	@FindBy (name = "password")
	private WebElement password;
	
	@FindBy (name = "submit")
	private WebElement submit;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	

}
