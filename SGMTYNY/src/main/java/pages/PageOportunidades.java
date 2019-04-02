package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import helpers.*;

public class PageOportunidades extends BasePage{

	@FindBy(xpath=".//*[@title=\"Nuevo\"]")
	WebElement btnNuevo;
		
	public PageOportunidades(WebDriver driver) {
		super(driver);
	}
	
	@Test
	public void clickNuevo() {
		clickNew();
	}	
	
	private void clickNew() {
		waitForPage();
		click(btnNuevo);		
	}	
	
	
}
