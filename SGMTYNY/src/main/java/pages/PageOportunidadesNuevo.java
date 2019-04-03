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
	
	@FindBy(xpath="//*[@id=\"Source\"]")
	WebElement listSource;
	
	@FindBy(xpath="//*[@id=\"NextActivity\"]")
	WebElement listActivity;
	
	@FindBy(xpath="//*[@id=\"ActivityDate\"]")
	WebElement listDateAct;
	
	@FindBy(xpath="//*[@id=\"Productofinterest\"]")
	WebElement listInteres;
	
	@FindBy(xpath="//*[@id=\"Notes\"]")
	WebElement txNotes;
	
	@FindBy(xpath="//*[@id=\"New Opportunity_nextBtn\"]")
	WebElement btnAbrir;
	
	
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
	
	public void selectSource()
	{
		selectSou();
	}
	
	public void selectActivity()
	{
		selectAct();
	}
	
	public void selectActivityDat()
	{
		selectActDat();
	}
	
	public void selectInteres()
	{
		selectInte();
	}
	
	public void inputNotes()
	{
		inputNot();
	}
	
	public void clickOpen()
	{
		clickOp();
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
		sendKeys(listDate,strDate);
	}
	
	private void selectSou() {
		sendKeys(listSource,"Cliente");
	}
	
	private void selectAct() {
		sendKeys(listActivity,"Llamada");
	}
	
	private void selectActDat() {
		sendKeys(listDateAct,strDate);
	}
	
	private void selectInte() {
		sendKeys(listInteres,"Alfa Medical");
	}
	
	private void inputNot() {
		sendKeys(txNotes,"Notas");
	}
	
	private void clickOp() {
		HCommonHelper.waiter("low");
		click(btnAbrir);
	}
}