package selenium.tests;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import selenium.pages.MercurySignInPage;

public class MercurySignInPageTest {

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
	public void testLogin() {
		driver.get("http://demo.guru99.com/test/newtours/login.php");
		MercurySignInPage signInPage = PageFactory.initElements(driver, MercurySignInPage.class);
		signInPage.getUsername().sendKeys("RyanGlennerster");
		signInPage.getPassword().sendKeys("testpassword");
		signInPage.getSubmit().click();
		assertTrue(driver.getPageSource().contains("Login Successfully"));
	}
	
}
