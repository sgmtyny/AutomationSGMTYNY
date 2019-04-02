package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageTodosLosReferidos extends BasePage{
	@FindBy(xpath = "//div[@title = \"Importar\"]")
	WebElement btnImportar;
	@FindBy(xpath = "//div[@title = \"Nuevo\"]")
	WebElement btnNuevo;	
	public PageTodosLosReferidos(WebDriver driver) {
		super(driver);
	}
	public void clickImport(){
		clickBtnImportar();
		changeToNewTab();
	}
	private void clickBtnImportar() {
		click(btnImportar);
	}
	public void clickNew(){
		clickBtnNew();
	}
	private void clickBtnNew() {
		click(btnNuevo);
	}	
}
