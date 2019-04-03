package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

import helpers.HCommonHelper;

public class PageOportunidadesNuevo extends BasePage {

	//@FindBy(xpath=".//*[@id=\"OpportunityName\"]")
	
	//@FindBy(how = How.ID, using = "OpportunityName")
	
	@FindBy(xpath = "//iframe[@title = 'accessibility title']")
	WebElement frame;
	
	@FindBy(xpath="//*[@id='OpportunityName']")
	WebElement txOpportunityName;

	@FindBy(xpath="//*[@id=\"NameOfRelationship\"]")
	WebElement txtRelationName;
	
	@FindBy(xpath="//*[@id=\"Stage\"]")
	WebElement listStage;
	
	@FindBy(xpath="//*[@id=\"ExpectedClosingDate\"]")
	WebElement listDate;
	
	String strDate = HCommonHelper.selectDate();
	
	
	public PageOportunidadesNuevo(WebDriver driver) {
		super(driver);
	}
	
	
	@Test
	public void putName()  {
	   
		putOpName();
	}	
	
	public void putNameRelation()
	{
		putOpNameRe();
	}
	
	public void selectStage()
	{
		selectSta();
	}
	
	public void selectDate()
	{
		selectDat();
	}
	
	
	private void putOpName() {
		refreshPage();
		swithToFrame(frame);
		sendKeys(txOpportunityName,"Vida");		
	}
	
	private void putOpNameRe() {			
		sendKeys(txtRelationName,"Juan Perez Gomez");	
		HCommonHelper.waiter("low");
		downEnter(txtRelationName);
	}
	
	private void selectSta() {
		sendKeys(listStage,"Diseño");
	}
	
	private void selectDat() {
				
	}
}