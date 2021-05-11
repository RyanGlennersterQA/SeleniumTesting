package selenium.tests;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import selenium.pages.MercuryRegisterPage;

public class MercuryRegisterPageTest {
	
public WebDriver driver;
	
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().setSize(new Dimension(1378, 690));
		
	}
	
	@After
	public void shutDown() {
		driver.close();
	}
	
	@Test
	public void testRegister() {
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		MercuryRegisterPage registerPage = PageFactory.initElements(driver, MercuryRegisterPage.class);
		registerPage.getFirstName().sendKeys("Ryan");
		registerPage.getLastName().sendKeys("Glennerster");
		registerPage.getPhone().sendKeys("07759367456");
		registerPage.geteMail().sendKeys("test@test.com");
		registerPage.getAddress().sendKeys("123 abc road");
		registerPage.getCity().sendKeys("abcdefg");
		registerPage.getState().sendKeys("hijklmnop");
		registerPage.getPostcode().sendKeys("AB1 2CD");
		
		Select dropCountry = new Select(driver.findElement(By.name("country")));
		registerPage.getCountry().click();
		dropCountry.selectByVisibleText("ALBANIA");
		registerPage.getUserName().sendKeys("RyanGlennerster");
		registerPage.getPassword().sendKeys("testpassword");
		registerPage.getConfirmPassword().sendKeys("testpassword");
		registerPage.getSubmit().click();
		assertTrue(driver.getPageSource().contains("Thank you for registering."));
		
	
	}

}
