package test;

import org.testng.annotations.Test;

public class JavaScriptTests extends BaseTest {

	
  @Test
  public void testScrollToTable() {
	  homePage.clickLargeAndDeepDomPage().scrollToTable();
	  
  }
  
  @Test
  public void testScrollToFifthParagraph() {
	  homePage.clickInfiniteScrollPage().scrollToParagraph(5);
  }
  
  
}
