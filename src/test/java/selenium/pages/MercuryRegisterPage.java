package selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MercuryRegisterPage {
	
	
	@FindBy (xpath = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input")
	private WebElement firstName;
	
	@FindBy (xpath = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/input")
	private WebElement lastName;
	
	@FindBy (name = "phone")
	private WebElement phone;
	
	@FindBy (id = "userName")
	private WebElement eMail;
	
	//MAILING INFORMATION
	@FindBy (name = "address1")
	private WebElement address;
	
	@FindBy (name = "city")
	private WebElement city;
	
	@FindBy (name = "state")
	private WebElement state;
	
	@FindBy (name = "postalCode")
	private WebElement postcode;
	
	@FindBy (name = "country")
	private WebElement country;
	
	//USER INFORMATION
	@FindBy (id = "email")
	private WebElement userName;
	
	@FindBy (name = "password")
	private WebElement password;
	
	@FindBy (name = "confirmPassword")
	private WebElement confirmPassword;
	
	@FindBy (name = "submit")
	private WebElement submit;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement geteMail() {
		return eMail;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getPostcode() {
		return postcode;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirmPassword() {
		return confirmPassword;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	
	
	
	
	
}
