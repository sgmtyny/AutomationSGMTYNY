package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import helpers.HCommonHelper;
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
	@FindBy(xpath = "//*[@id = 'ReferredByAccount']")
	WebElement inputReferredBy;
	@FindBy(xpath = "//*[@id ='Description']")
	WebElement textDescription;
	@FindBy(xpath = "//*[@id ='Source']")
	WebElement selectSource;
	@FindBy(xpath = "//*[@id ='ActivityDate']")
	WebElement inputDate;
	@FindBy(xpath = "//*[@id ='PreferredPhoneType']")
	WebElement selectPrefPhone;
	@FindBy(xpath = "//*[@id='DoNotCall']//following::span")
	WebElement checkboxCall;
	@FindBy(xpath = "//*[@id ='PreferredEmailType']")
	WebElement selectPrefEmail;
	@FindBy(xpath = "//*[@id ='DoNotEmail']//following::span")
	WebElement checkboxEmail;
	@FindBy(xpath = "//*[@id ='ActionType']")
	WebElement selectActionType;	
	@FindBy(xpath = "//*[@id ='AddtionalInformation']//following::span")
	WebElement checkboxAdditionalInfo;
	@FindBy(xpath = "//div[contains(text(),'Cancelar')]")
	WebElement btnCancel;
	
		public PageNuevoReferido(WebDriver driver) {
			super(driver);
		}
		public void typeName() {
			typeInputName();
		}
		public void typeFathersName() {
			typeInputFathersName();
		}
		public void typeMothersName() {
			typeInputMothersName();
		}
		public void selectSource() {
			selectDropdownSource();
		}
		public void typeSubSource() {
			typeInputSubSource();
		}
		public void selectActionType() {
			selectDropdownActionType();
		}
		public void TypeDate() {
			typeDateToContact();
		}
		public void typeMobilePhone(){
			typeInputMobilePhone();
		}
		public void typeWorkPhone(){
			typeInputWorkPhone();
		}
		public void typeHomePhone(){
			typeInputHomePhone();
		}
		public void typeExt(){
			typeInputExt();
		}
		public void selectPrefPhone(){
			selectPreferredPhoneType();
		}
		public void checkDontCall() {
			clickCheckDontCall();
		}
		public void typePersonalEmail(){
			typeInputPersonalEmail();
		}
		public void typeWorkEmail(){
			typeInputWorkEmail();
		}
		public void typeOtherEmail(){
			typeInputOtherEmail();
		}
		public void selectPrefEmail(){
			selectPreferredEmailType();
		}		
		public void checkDontSendEmail() {
			clickCheckDontSendEmail();
		}
		public void typeDescription() {
			typeTextDescription();
		}
		public void checkAddInformation() {
			clickCheckAdditionalInformation();
		}
		public void clickCancel() {
			clickButtonCancel();
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
			sendKeys(inputExt,"123456");
		}
		private void typeInputPersonalEmail() {
			sendKeys(inputPersonalEmail, HCommonHelper.getRandomEmail());
		}
		private void typeInputWorkEmail() {
			sendKeys(inputWorkEmail,HCommonHelper.getRandomEmail());
		}		
		private void typeInputOtherEmail() {
			sendKeys(inputOtherEmail,HCommonHelper.getRandomEmail());
		}
		private void typeTextDescription() {
			sendKeys(textDescription,"4444444444");
		}
		private void selectDropdownSource() {
			selectFromDropdown(selectSource);
			sendKeys(inputReferredBy,"J");
		}
		private void selectDropdownActionType() {
			selectFromDropdown(selectActionType);
		}
		private void selectPreferredPhoneType() {
			selectFromDropdown(selectPrefPhone);
		}
		private void selectPreferredEmailType() {
			selectFromDropdown(selectPrefEmail);
		}
		private void clickCheckDontCall() {
			check(checkboxCall);
		}
		private void clickCheckDontSendEmail() {
			check(checkboxEmail);
		}
		private void clickCheckAdditionalInformation() {
			check(checkboxAdditionalInfo);
		}
		private void typeDateToContact() {
			sendKeys(inputDate,"01/01/19");
		}
		private void clickButtonCancel() {
			click(btnCancel);
		}
}
