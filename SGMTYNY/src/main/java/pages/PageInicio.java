package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageInicio extends BasePage{

	@FindBy(xpath="//*data-id=\"Lead\"]")
	WebElement btnReferidos;
	
	@FindBy(xpath="//*[@data-id=\"Opportunity\"]")
	WebElement btnOportunidades;
	
	
	public PageInicio(WebDriver driver) {
		super(driver);
	}
	
	public void clickReferidos() {
		clickRef();		
	}
	
	public void clickOportunidades() {
		clickOpor();		
	}
	
	
	
	private void clickRef() {
		waitForPage();
		click(btnReferidos);
	}
	
	private void clickOpor() {
		waitForPage();		
		click(btnOportunidades);
	}
}
