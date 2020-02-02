package test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pages.HomePage;

public class BaseTest {

	private WebDriver driver;
	protected HomePage homePage;
	public void timOut() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
			// URL of website
		driver.get("https://the-internet.herokuapp.com/");
		// maximize window
		driver.manage().window().maximize();
		timOut(); // time out after 3 seconds
		goHome();
		homePage= new HomePage(driver);
		


		}
	@BeforeMethod
	public void goHome() {
		driver.get("https://the-internet.herokuapp.com/");
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	

}
