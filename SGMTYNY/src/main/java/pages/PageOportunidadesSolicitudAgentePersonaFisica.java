package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import helpers.HCommonHelper;

public class PageOportunidadesSolicitudAgentePersonaFisica extends BasePage {

	@FindBy(xpath = "//iframe[@title = 'accessibility title']")
	WebElement frame;

	@FindBy(xpath = "//*[@id=\"IndividualAgent_nextBtn\"]")
	WebElement btnContinuar;
	
	public PageOportunidadesSolicitudAgentePersonaFisica(WebDriver driver) {
		super(driver);
		
	}
	
	public void informacion()
	{
		clickContinuar();
	}
	private void clickContinuar()
	{
		HCommonHelper.waiter("high");
		refreshPage();
		HCommonHelper.waiter("high");
		swithToFrame(frame);
		click(btnContinuar);
	}
}
