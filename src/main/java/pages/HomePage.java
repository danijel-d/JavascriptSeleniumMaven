package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	private WebDriver driver;
	private By formAuthenticationLink = By.linkText("Form Authentication");
	private By figureBox = By.className("figure");

	public LoginPage clickFromAut() {
		// driver.findElement(formAuthenticationLink).click();
		clicklink("Form Authentication");
		return new LoginPage(driver);
	}
	
	public void hoverOverFigure(int index) {
		
	}
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	private void clicklink(String linkText) {
		driver.findElement(By.linkText(linkText)).click();
	}


	public LargeAndDeepDomPage clickLargeAndDeepDomPage() {
		clicklink("Large & Deep DOM");
		return new LargeAndDeepDomPage(driver);
	}
	public InfiniteScrollPage clickInfiniteScrollPage() {
		clicklink("Infinite Scroll");
		return new InfiniteScrollPage(driver);
		
	}
}
