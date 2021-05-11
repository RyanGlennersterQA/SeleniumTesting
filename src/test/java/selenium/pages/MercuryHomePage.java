package selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MercuryHomePage {
	
	@FindBy (linkText = "REGISTER")
	private WebElement registerButton;

	public WebElement getRegisterButton() {
		return registerButton;
	}

	
}
