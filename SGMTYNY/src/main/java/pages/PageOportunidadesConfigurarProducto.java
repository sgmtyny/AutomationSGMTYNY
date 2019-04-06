package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import helpers.HCommonHelper;

public class PageOportunidadesConfigurarProducto extends BasePage{
	

	@FindBy(xpath = "//iframe[@title = 'accessibility title']")
	WebElement frame;
	
	@FindBy(xpath = "//*[text() = 'Necesidad']")
	WebElement btnBaseEn;
	
	@FindBy(xpath = "//*[@id=\"RegionApplicant\"]")
	WebElement btnStates;
	
	
	
	public PageOportunidadesConfigurarProducto (WebDriver driver) {
		super(driver);
	}
	
	@Test
	public void informacionPersonal() 
	{
		baseEn();
		region();
	}	
	
	private void baseEn()
	{
		HCommonHelper.waiter("low");
		refreshPage();
		HCommonHelper.waiter("medium");
		swithToFrame(frame);	
		click(btnBaseEn);
	}
	
	private void region()
	{
		String strState=HCommonHelper.mexicosStates();
		sendKeys(btnStates,strState);
	}
	
	
	
	
	

	
}
