package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageInicio extends BasePage{
	@FindBy(xpath = "//a[@href = 'https://smnyl--model.lightning.force.com/lightning/o/Lead/home']")
	WebElement btnReferidos;
	
	public PageInicio(WebDriver driver) {
		super(driver);
	}
	public void clickReferidos() {
		waitForPage();
		click(btnReferidos);
	}
}
