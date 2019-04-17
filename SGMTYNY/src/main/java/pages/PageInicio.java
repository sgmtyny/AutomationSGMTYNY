package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import helpers.HCommonHelper;

public class PageInicio extends BasePage{
	@FindBy(xpath="//*[@data-id=\"Lead\"]")
	WebElement btnReferidos;
	@FindBy(xpath="//*[@data-id=\"Opportunity\"]")
	WebElement btnOportunidades;
	@FindBy(xpath ="//span[contains(text(),'Menú de Referidos')]/ancestor::a")
	WebElement arrowDownReferidos;
	@FindBy(xpath = "//span[contains(text(),'Nueva Referido')]/ancestor::a")
	WebElement btnNuevoReferido;
	@FindBy(xpath="//*[@data-id='0KD0R000000DgvPWAS']")
	WebElement btnAsesores;
	@FindBy(xpath = "//*[@data-id=\"report\"]")
	WebElement btnReportes;
	@FindBy(xpath = "//*[@data-id=\"Dashboard\"]")
	WebElement btnTableros;	
	
	public PageInicio(WebDriver driver) {
		super(driver);
	}
	public void clickTableros() {
		clickTab();
	}
	private void clickTab() {
		waitForPage();
		click(btnTableros);
	}	
	public void clickReportes() {
		clickReport();
	}
	private void clickReport() {
		waitForPage();
		click(btnReportes);
	}
	public void clickReferidos() {
		clickRef();		
	}
	public void clickOportunidades() {
		clickOpor();		
	}
	public void clickAgregarNuevoReferido() {
		clickBtnAgregarNuevoReferido();
	}
	private void clickBtnAgregarNuevoReferido() {
		clickJs(btnNuevoReferido);
	}
	public void clickArrowDownReferidos() {
		clickBtnArrowDownReferidos();
	}
	private void clickBtnArrowDownReferidos() {
		waitForPage();
		click(arrowDownReferidos);
	}
	private void clickRef() {
		waitForPage();
		click(btnReferidos);
	}
	private void clickOpor() {
		HCommonHelper.waiter("medium");
		waitForPage();		
		click(btnOportunidades);
	}
	public void clickAsesores() {
		clickBtnAsesores();
	}
	private void clickBtnAsesores() {
		waitForPage();
		click(btnAsesores);
	}
}
