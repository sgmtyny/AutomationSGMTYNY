package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import helpers.HCommonHelper;
/*
 * KEEP ON WORKING IN THIS SECTION
 */
public class PageReferidoCambiarPropietario extends BasePage{
	@FindBy(xpath = "//input[@title='Buscar Personas']")
	
	WebElement inputSearch;
	@FindBy(xpath = "//input[@name='SendEmail']")
	
	WebElement checkboxSendEmail;
	@FindBy(xpath = "//div[@class = 'modal-footer slds-modal__footer']/descendant::span[contains(text(),'Enviar')")
	
	WebElement btnEnviar;
	public PageReferidoCambiarPropietario(WebDriver driver) {
		super(driver);
	}
	public void typeSearch() {
		typeInputSearch();
	}
	private void typeInputSearch() {
		click(inputSearch);
		HCommonHelper.waiter("low");
		downEnter(inputSearch);
	}
	public void checkSendEmail() {
		checkInputSendEmail();
	}
	private void checkInputSendEmail() {
		checkOptionalYesOrNot(checkboxSendEmail);
	}
	public void clickEnviar() {
		clickBtnEnviar();
	}
	private  void clickBtnEnviar() {
		click(btnEnviar);
	}
}
