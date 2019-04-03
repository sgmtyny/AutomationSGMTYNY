package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

public class PageOportunidadesNuevo extends BasePage {

	//@FindBy(xpath=".//*[@id=\"OpportunityName\"]")
	
	//@FindBy(how = How.ID, using = "OpportunityName")
	
	@FindBy(xpath = "//iframe[@title = 'accessibility title']")
	WebElement frame;
	
	@FindBy(xpath="//*[@id='OpportunityName']")
	WebElement txOpportunityName;

	public PageOportunidadesNuevo(WebDriver driver) {
		super(driver);
	}
	
	
	@Test
	public void putName()  {
	   
		putOpName();
	}	
	
	
	private void putOpName() {
		//waitForPage();
		refreshPage();
		swithToFrame(frame);
		sendKeys(txOpportunityName,"Vida");		
	}
}