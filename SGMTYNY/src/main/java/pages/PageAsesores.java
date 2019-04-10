package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageAsesores extends BasePage{
	@FindBy(xpath = "//*[@title='Seleccionar vista de lista']")
	WebElement btnSelectView;
	@FindBy(xpath = "//span[contains(text(),'Todos') and @class=' virtualAutocompleteOptionText']")
	WebElement optionAll;
	@FindBy(xpath = "//input[@type = 'checkbox']/following-sibling::span[@class = 'slds-checkbox--faux']")
	List<WebElement> records;	
	public PageAsesores(WebDriver driver) {
		super(driver);
	}
	
	public void clickSelectView() {
		clickBtnSelectView();
	}
	private void clickBtnSelectView() {
		click(btnSelectView);
	}
	public void clickOptionAll() {
		clickBtnSelectView();
	}
	private void clickBtnOptionAll() {
		click(btnSelectView);
	}
	public void selectRecord() {
		selectRandomRecord();
	}
	private void selectRandomRecord() {
		selectOptionWithException(records,0);
	}
}
