package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import helpers.HCommonHelper;
	/*
	 * KEEP ON WORKING ON THIS CLASS
	 */
public class PageReferidoNuevo extends BasePage{
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
	@FindBy(xpath = "//*[@id=\"NewLead_nextBtn\"]")
	WebElement btnFirstSaveLead;
	@FindBy(xpath = "//*[@id=\"AdditionalInformation_nextBtn\"]")
	WebElement btnFinalSaveLead;	
	@FindBy(xpath = "//*[@id=\"BirthDate\"]")
	WebElement inputBirthDate;
	@FindBy(xpath = "//*[@id ='RelationshipDetails']")
	WebElement selectRelationshipDetails;
	@FindBy(xpath = "//*[@id ='EmploymentStatus']")
	WebElement selectEmploymentStatus;
	@FindBy(xpath = "//*[@id ='NoOfDependents']")
	WebElement inputNoOfDependents;
	@FindBy(xpath = "//*[@id ='Employer']")
	WebElement inputEmployer;
	@FindBy(xpath = "//*[@id ='Occupation']")
	WebElement inputOccupation;
	@FindBy(xpath = "//*[@id ='Title']")
	WebElement inputTitle;
	@FindBy(xpath = "//*[@id ='MonthlyIncomeApprox']")
	WebElement inputMonthlyIncomeApprox;
	@FindBy(xpath = "//*[@id ='Gender']/following-sibling::span")
	List<WebElement> radioButtonGender;
	@FindBy(xpath = "//*[@id ='Smoke']/following-sibling::span")
	List<WebElement> radioButtonSmoke;
	@FindBy(xpath = "//*[@id ='MainInterests']/following-sibling::span")
	List<WebElement> radioButtonMainInterests;
	
		public PageReferidoNuevo(WebDriver driver) {
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
		public void typeDate() {
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
			if (verifyElementSelected(checkboxAdditionalInfo,"AddtionalInformation")){
				clickFirstSaveLead();
				typeBirthDate();
				selectGender();
				selectSmoke();
				selectRelationshipStatus();
				selectEmploymentStatus();
				typeNumberOfDependents();
				typeEmployer();
				typeOccupation();
				typeTitle();
				typeMonthlyIncomeApprox();
				selectMainInterest();
//				clickFinalSaveLead();
			}else {
//				clickFirstSaveLead();
			}
		}
		public void clickCancel() {
			clickButtonCancel();
		}
		public void clickFirstSaveLead() {
			clickFirstButtonSaveLead();
		}
		public void typeReferredBy() {
			typeInputReferredBy();
		}
		private void typeInputName() {
			refreshPage();
			swithToFrame(frame);
			sendKeys(inputName,"Juan");
		}
		private void typeInputFathersName() {
			sendKeys(inputFathersname,"Perez");
		}
		private void typeInputMothersName() {
			sendKeys(inputMothersname,"Perez");
		}
		private void typeInputSubSource() {
			sendKeys(inputSubSource,"sub source");
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
			sendKeys(textDescription,"Description...");
		}
		private void selectDropdownSource() {
			selectFromDropdown(selectSource);
			if(isElementUnhidden(inputReferredBy)) {
				typeReferredBy();
			}
		}
		private void typeInputReferredBy() {
			sendKeys(inputReferredBy,"Juan Perez Gomez");
			HCommonHelper.waiter("low");
			downEnter(inputReferredBy);
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
			checkOptionalYesOrNot(checkboxCall);
		}
		private void clickCheckDontSendEmail() {
			checkOptionalYesOrNot(checkboxEmail);
		}
		private void clickCheckAdditionalInformation() {
			checkOptionalYesOrNot(checkboxAdditionalInfo);
		}
		private void typeDateToContact() {
			sendKeys(inputDate,HCommonHelper.selectDate());
		}
		private void clickButtonCancel() {
			click(btnCancel);
		}
		private void clickFirstButtonSaveLead() {
			click(btnFirstSaveLead);
		}		
		private void clickFinalButtonSaveLead() {
			click(btnFinalSaveLead);
		}
		public void clickFinalSaveLead() {
			clickFinalButtonSaveLead();
		}
		//Additional information
		public void typeBirthDate() {
			typeInputBirthDate();
		}
		public void selectGender() {
			selectRadioGender();
		}
		public void selectSmoke() {
			selectRadioSmoke();
		}
		public void selectRelationshipStatus() {
			selectDropdownRelationshipStatus();
		}
		public void selectEmploymentStatus() {
			selectDropdownEmploymentStatus();
		}
		public void typeNumberOfDependents() {
			typeInputNumberOfDependents();
		}
		public void typeEmployer() {
			typeInputEmployer();
		}
		public void typeOccupation() {
			typeInputOccupation();
		}
		public void typeTitle() {
			typeInputTitle();
		}
		public void typeMonthlyIncomeApprox() {
			typeInputMonthlyIncomeApprox();
		}
		public void selectMainInterest() {
			selectRadioMainInterest();
		}
		private void typeInputBirthDate() {
			sendKeys(inputBirthDate,HCommonHelper.selectDate());
		}
		private void selectDropdownRelationshipStatus() {
			selectFromDropdown(selectRelationshipDetails);
		}
		private void selectDropdownEmploymentStatus() {
			selectFromDropdown(selectEmploymentStatus);
		}
		private void typeInputNumberOfDependents() {
			sendKeys(inputNoOfDependents,"3");
		}
		private void typeInputEmployer() {
			sendKeys(inputEmployer,"employer");
		}
		private void typeInputOccupation() {
			sendKeys(inputOccupation,"carp");
			HCommonHelper.waiter("low");
			downEnter(inputOccupation);
		}
		private void typeInputTitle() {
			sendKeys(inputTitle,"developer");
		}
		private void typeInputMonthlyIncomeApprox() {
			sendKeys(inputMonthlyIncomeApprox,"20000");
		}
		private void selectRadioGender() {
			selectOption(radioButtonGender);
		}
		private void selectRadioSmoke() {
			selectOption(radioButtonSmoke);
		}
		private void selectRadioMainInterest() {
			selectOption(radioButtonMainInterests);
		}		
}
