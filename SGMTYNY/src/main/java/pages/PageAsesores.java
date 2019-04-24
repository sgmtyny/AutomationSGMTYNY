package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import helpers.HCommonHelper;

public class PageAsesores extends BasePage{
	@FindBy(xpath = "//*[@title='Seleccionar vista de lista']")
	WebElement btnSelectView;
	@FindBy(xpath = "//span[contains(text(),'Todos') and @class=' virtualAutocompleteOptionText']")
	WebElement optionAll;
	@FindBy(xpath = "//th[@scope='row']/descendant::a[@data-refid='recordId']")
	List<WebElement> records;
	@FindBy(xpath = "//*[@class='tabHeader']/following::span[contains(text(),'Licencias y Certificaciones')]")
	WebElement btnLicensesAndCertifications;
	@FindBy(xpath = "//*[@title='Nuevo']")
	WebElement btnNew;	
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
		clickBtnOptionAll();
		selectRecord();
	}
	private void clickBtnOptionAll() {
		click(optionAll);
	}
	public void selectRecord() {
		HCommonHelper.waiter("medium");
		selectRandomRecord();
	}
	private void selectRandomRecord() {
		selectOptionWithException(records,-1);
	}
	public void selectLicensesAndCertifications() {
		selectBtnLicensesAndCertifications();
	}
	private void selectBtnLicensesAndCertifications() {
		click(btnLicensesAndCertifications);
	}
	public void clickNew() {
		clickBtnNew();
	}
	private void clickBtnNew() {
		click(btnNew);
	}	
}
