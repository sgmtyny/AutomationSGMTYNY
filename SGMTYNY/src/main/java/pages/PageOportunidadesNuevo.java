package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

public class PageOportunidadesNuevo extends BasePage {

	//@FindBy(xpath=".//*[@id=\"OpportunityName\"]")
	
	//@FindBy(how = How.ID, using = "OpportunityName")
	
	@FindBy(xpath=".//*[@id =OpportunityName]")
	WebElement txOpportunityName;

	public PageOportunidadesNuevo(WebDriver driver) {
		super(driver);
	}
	
	
	@Test
	public void putName()  {
	   
		clickName();
		putOpName();
	}	
	
	private void clickName() {
		click(txOpportunityName);
	}
	
	private void putOpName() {
		//waitForPage();
		sendKeys(txOpportunityName,"Oportunidad");		
	}
}