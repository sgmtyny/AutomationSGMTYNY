package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageTodosLosReferidos extends BasePage{
	@FindBy(xpath = "//div[contains(text(),'Importar')]")
	WebElement btnImportar;
	public PageTodosLosReferidos(WebDriver driver) {
		super(driver);
	}
	public void clickImportar(){
		clickBtnImportar();
	}
	private void clickBtnImportar() {
		click(btnImportar);
	}
}
