package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class PageOportunidadesNuevo extends BasePage {

	//@FindBy(xpath=".//*[@id=\"OpportunityName\"]")
	@FindBy(xpath="//*[@id=\"a2n0R0000006uBZQAY-2\"]/div[1]/div/child[4]")
	
	WebElement txOpportunityName;

	public PageOportunidadesNuevo(WebDriver driver) {
		super(driver);
	}
		
	
	@Test
	public void putName()  {
	   
		//clickName();
		putOpName();
	}	
	
	private void clickName() {
		click(txOpportunityName);
	}
	
	private void putOpName() {
		//waitForPage();
		sendKeys(txOpportunityName,"Abraham");		
	}
}