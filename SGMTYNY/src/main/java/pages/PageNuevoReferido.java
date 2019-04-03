package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
	/*
	 * KEEP ON WORKING ON THIS CLASS
	 */
public class PageNuevoReferido extends BasePage{
	@FindBy(xpath = "//iframe[@title = 'accessibility title']")
	WebElement frame;
	@FindBy(xpath = "//*[@id ='Name']")
	WebElement inputName;
	@FindBy(xpath = "//*[@id ='FathersLastName']")
	WebElement inputFathersname;
	@FindBy(xpath = "//*[@id ='MothersLastName']")
	WebElement inputMothersname;
	@FindBy(xpath = "//*[@id ='SubSource']")
	WebElement inputSubSource;
	@FindBy(xpath = "//*[@id ='MobilePhone']")
	WebElement inputMobilePhone;
	@FindBy(xpath = "//*[@id ='HomePhone']")
	WebElement inputHomePhone;
	@FindBy(xpath = "//*[@id ='WorkPhone']")
	WebElement inputWorkPhone;
	@FindBy(xpath = "//*[@id ='Ext']")
	WebElement inputExt;
	@FindBy(xpath = "//*[@id ='PersonalEmail']")
	WebElement inputPersonalEmail;
	@FindBy(xpath = "//*[@id ='WorkEmail']")
	WebElement inputWorkEmail;
	@FindBy(xpath = "//*[@id ='OtherEmail']")
	WebElement inputOtherEmail;
	@FindBy(xpath = "//*[@id ='Description']")
	WebElement textDescription;
	@FindBy(xpath = "//*[@id ='Source']")
	WebElement selectSource;
	@FindBy(xpath = "//*[@id ='ActivityDate']")
	WebElement inputDate;
	@FindBy(xpath = "//*[@id ='PreferredPhoneType']")
	WebElement selectPrefPhone;
	@FindBy(xpath = "//*[@id ='DoNotCall']")
	WebElement checkboxCall;
	@FindBy(xpath = "//*[@id ='PreferredEmailType']")
	WebElement selectPrefEmail;
	@FindBy(xpath = "//*[@id ='DoNotEmail']")
	WebElement checkboxEmail;
	@FindBy(xpath = "//*[@id ='ActionType']")
	WebElement selectActionType;	
	@FindBy(xpath = "//*[@id ='AddtionalInformation']")
	WebElement checkboxAdditionalInfo;
	
		public PageNuevoReferido(WebDriver driver) {
			super(driver);
		}
		public void typeName() {
			typeInputName();
		}
		public void typeFathersName() {
			typeInputFathersName();
		}
		private void typeInputName() {
			refreshPage();
			swithToFrame(frame);
			sendKeys(inputName,"Diego");
		}
		private void typeInputFathersName() {
			sendKeys(inputFathersname,"Diego");
		}
		private void typeInputMothersName() {
			sendKeys(inputMothersname,"Diego");
		}
		private void typeInputSubSource() {
			sendKeys(inputSubSource,"Diego");
		}
		private void typeInputMobilePhone() {
			sendKeys(inputMobilePhone,"4444444444");
		}
		private void typeInputHomePhone() {
			sendKeys(inputHomePhone,"4444444444");
		}
		private void typeInputWorkPhone() {
			sendKeys(inputWorkPhone,"4444444444");
		}
		private void typeInputExt() {
			sendKeys(inputExt,"4444444444");
		}
		private void typeInputPersonalEmail() {
			sendKeys(inputPersonalEmail,"4444444444");
		}
		private void typeInputWorkEmail() {
			sendKeys(inputWorkEmail,"4444444444");
		}		
		private void typeInputOtherEmail() {
			sendKeys(inputOtherEmail,"4444444444");
		}
		private void typeTextDescription() {
			sendKeys(textDescription,"4444444444");
		}
		private void selectDropdownSource() {
			selectFromDropdown(selectSource,"Cliente");
		}
		private void selectDropdownActionType() {
			selectFromDropdown(selectActionType,"Llamada");
		}		
}
