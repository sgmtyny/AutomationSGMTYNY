package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageAsesoresCrearLYC extends BasePage{

	@FindBy(xpath ="//span[contains(text(),'Descripción')]/ancestor::label/following-sibling::input")
	WebElement inputDescription;
	@FindBy(xpath ="//span[contains(text(),'Tipo')]/ancestor::label/following-sibling::input")
	WebElement inputType;
	@FindBy(xpath ="//div[@class='form-element']/input")
	List<WebElement> inputsDate;	
	@FindBy(xpath ="//span[contains(text(),'Legacy id')]/ancestor::label/following-sibling::input")
	WebElement inputLegacyId;	
	@FindBy(xpath ="//input[@title='Buscar Asesores']")
	WebElement inputSearch;
	@FindBy(xpath ="//button[@title='Guardar']")
	WebElement btnSave;
	public PageAsesoresCrearLYC(WebDriver driver) {
		super(driver);
	}
	public void clickSave() {
		clickBtnSave();
	}
	private void clickBtnSave() {
		click(btnSave);
	}
	public void typeDescription() {
		typeInputDescription();
	}
	private void typeInputDescription() {
		sendKeys(inputDescription,"Lorem ipsum");
	}
	public void typeType() {
		typeInputType();
	}
	private void typeInputType() {
		sendKeys(inputType,"Lorem ipsum");
	}
	public void typeDateFrom() {
		typeInputDateFrom();
	}
	private void typeInputDateFrom() {
		sendKeys(getElementThatSharesProperties(inputsDate,0),"12/04/2019");
	}
	public void typeDateUntil() {
		typeInputDateUntil();
	}
	private void typeInputDateUntil() {
		sendKeys(getElementThatSharesProperties(inputsDate,1),"12/04/2019");
	}
	public void typeLegacyId() {
		typeInputLegacyId();
	}
	private void typeInputLegacyId() {
		sendKeys(inputLegacyId,"Lorem ipsum");
	}
	public void typeSearch() {
		typeInputSearch();
	}
	private void typeInputSearch() {
		sendKeys(inputSearch,"Lorem ipsum");
	}	
}
