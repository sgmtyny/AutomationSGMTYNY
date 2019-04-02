package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
	
public class PageNuevoReferido extends BasePage{
	@FindBy(xpath = "//*[@id ='Name']")
	WebElement inputName;
	@FindBy(xpath = "//iframe[@title = 'accessibility title']")
	WebElement frame;
		public PageNuevoReferido(WebDriver driver) {
			super(driver);
		}
		
		public void typeName() {
			System.out.println("I'm in typeName Method");
			typeInputName();
		}
		private void typeInputName() {
			refreshPage();
			swithToFrame(frame);
			sendKeys(inputName,"Diego");
		}
}
