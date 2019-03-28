package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import helpers.*;

public class PageOportunidades extends BasePage{

	@FindBy(xpath="//*[@id=\"brandBand_1\"]/div/div[1]/div[4]/div/div/div[1]/div[1]/div[2]/ul")
	WebElement btnNuevo;
		
	@Test
	public void clickNuevo() {
		clickNew();
	}	
	
	private void clickNew() {
		click(btnNuevo);		
	}	
	
	
}
