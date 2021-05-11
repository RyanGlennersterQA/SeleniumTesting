package selenium.tests;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import selenium.pages.MercuryHomePage;

public class MercuryHomePageTest {
	
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
	public void test() {
		driver.get("http://demo.guru99.com/test/newtours/index.php");
		MercuryHomePage homePage = PageFactory.initElements(driver, MercuryHomePage.class);
		homePage.getRegisterButton().click();
		assertEquals("Register: Mercury Tours", driver.getTitle());
		
	}

}
