package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import test.BaseTest;

public class InfiniteScrollPage extends BaseTest {
	private WebDriver driver;
	By textBlocks = By.className("jscroll-added");
	
	public  InfiniteScrollPage(WebDriver driver) {
		this.driver=driver;
	}
	/*
	  * Scrolls until paragraph with index specified is in view
     * @param index 1-based 
	 */
	
	public void scrollToParagraph(int index) {
		
		String script ="window.scrollTo(0,document.body.scrollHeight)";
		// cast “driver” to “JavascriptExecutor”
		var jsExecutor = (JavascriptExecutor)driver;
		while(getNumberOfParagraphsPresent()<index) {
		jsExecutor.executeScript(script);
	}
	
	}
	private int getNumberOfParagraphsPresent() {
		return driver.findElements(textBlocks).size();
	}
}
