package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import helpers.HCommonHelper;
import helpers.HOportunidadesSolicitudHelper;

public class PageOportunidadesSolicitudAcuerdo extends BasePage {

	@FindBy(xpath = "//iframe[@title = 'accessibility title']")
	WebElement frame;
	@FindBy(xpath = "//*[@id=\"Applicant|0\"]/div/div[1]/label[1]/span[1]")
	WebElement radioSolicitanteY;
	@FindBy(xpath = "//*[@id=\"Applicant|0\"]/div/div[1]/label[2]/span[1]")
	WebElement radioSolicitanteN;
	@FindBy(xpath = "//*[@id=\"TitularPersontobeInsured|0\"]/div/div[1]/label[1]/span[1]")
	WebElement radioPAsegurarTY;
	@FindBy(xpath = "//*[@id=\"TitularPersontobeInsured|0\"]/div/div[1]/label[2]/span[1]")
	WebElement radioPAsegurarTN;
	@FindBy(xpath = "//*[@id=\"Persontobeinsured|0\"]/div/div[1]/label[1]/span[1]")
	WebElement radioPAsegurarY;
	@FindBy(xpath = "//*[@id=\"Persontobeinsured|0\"]/div/div[1]/label[2]/span[1]")
	WebElement radioPAsegurarN;
	@FindBy(xpath = "//*[@id=\"Persontobeinsured|0\"]/div/div[1]/label[3]/span[1]")
	WebElement radioPAsegurarNA;
	@FindBy(xpath = "//*[@id=\"Autorization__c|0\"]/div/div[1]/label[1]/span[1]")
	WebElement radioConsentimientoY;
	@FindBy(xpath = "//*[@id=\"Autorization__c|0\"]/div/div[1]/label[2]/span[1]")
	WebElement radioConsentimientoN;
	@FindBy(xpath = "//*[@id=\"Place\"]")
	WebElement txtLugar;
	@FindBy(xpath = "//*[@id=\"Agreements_nextBtn\"]")
	WebElement btnContinuar;
	
	
	String strSolicitante = HOportunidadesSolicitudHelper.getSolicitante();
	String strPAsegurarT = HOportunidadesSolicitudHelper.getPAsegurarT();
	String strPAsegurar = HOportunidadesSolicitudHelper.getPAsegurar();
	String strConsentimiento = HOportunidadesSolicitudHelper.getConsentimiento();
	String strLugar = HOportunidadesSolicitudHelper.getLugar();
	
	public PageOportunidadesSolicitudAcuerdo(WebDriver driver) {
		super(driver);
		
	}
	
	public void informacion()
	{
		clickSolicitante();
		clickPAsegurarT();
		clickPAsegurar();
		clickConsentimiento();
		setLugar();
		clickContinuar();
	}
	private void clickContinuar()
	{
		click(btnContinuar);
	}
	private void setLugar()
	{
		sendKeys(txtLugar,strLugar);
	}
	private void clickConsentimiento()
	{
		if(strConsentimiento.equals("YES"))
		{
			click(radioConsentimientoY);
		}else
		{
			click(radioConsentimientoN);
		}
	}
	private void clickPAsegurar()
	{
		if(strPAsegurar.equals("YES"))
		{
			click(radioPAsegurarY);
		}else
		{
			click(radioPAsegurarN);
		}
	}
	private void clickPAsegurarT()
	{
		if(strPAsegurarT.equals("YES"))
		{
			click(radioPAsegurarTY);
		}else
		{
			click(radioPAsegurarTN);
		}
	}
	private void clickSolicitante()
	{
		HCommonHelper.waiter("high");
		refreshPage();
		HCommonHelper.waiter("high");
		swithToFrame(frame);
		if(strSolicitante.equals("YES"))
		{
			click(radioSolicitanteY);
		}else
		{
			click(radioSolicitanteN);
		}
	}
}
