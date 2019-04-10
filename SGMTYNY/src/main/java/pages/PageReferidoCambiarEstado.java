package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
/**
 * @author Diego Mejía
 * @date  05/04/2019
 */
public class PageReferidoCambiarEstado extends BasePage{
	@FindBy(xpath = "//a[@class = 'select']")
	WebElement selectStatus;
	@FindBy(xpath = "//div[@class = 'modal-footer slds-modal__footer']/descendant::span[contains(text(),'Guardar')]")
	WebElement btnSave;	
	@FindBy(xpath = "//li[@role = 'presentation']")
	List<WebElement> optionsStatus;	
	@FindBy(xpath = "//*[@class='form-element__help']")
	WebElement errorMessage;
	public PageReferidoCambiarEstado(WebDriver driver) {
		super(driver);
	}
	public void clickStatus() {
		do {
			clickDropdownStatus();
			selectOptionStatus();
			clickSave();
		}
		while(waitForError());
	}
	private void clickDropdownStatus() {
		click(selectStatus);
	}
	public void selectOptionStatus() {
		selectDropdownOptionStatus();
	}
	private void selectDropdownOptionStatus() {
		selectOptionWithException(optionsStatus,3);
	}
	public void clickSave() {
		clickBtnSave();
	}
	private void clickBtnSave() {
		click(btnSave);
	}
	private boolean waitForError() {
		return waitForMessageToAppear(errorMessage);
	}
}
