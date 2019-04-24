package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import helpers.HCommonHelper;

public class PageOportunidadesSolicitudDatosSolicitante extends BasePage {
	@FindBy(xpath = "//iframe[@title = 'accessibility title']")
	WebElement frame;	
	@FindBy(xpath ="//*[@id=\"Personaldataofthecontractingparty\"]")
	WebElement lnkDatosPSolicitante;	
	@FindBy(xpath ="//*[@id=\"DateofbirthConstitution\"]")
	WebElement txtFecha;
	@FindBy(xpath ="//*[@id=\"CountryofbirthConstitution\"]")	
	WebElement txtPais;
	@FindBy(xpath ="//*[@id=\"Nationality\"]")
	WebElement txtNacionalidad;
	@FindBy(xpath ="//*[@id=\"Occupationorprofession\"]")
	WebElement txtOcupacion;
	@FindBy(xpath ="//*[@id=\"Activitydescription\"]")
	WebElement txtDescripcion;
	
	
	public PageOportunidadesSolicitudDatosSolicitante(WebDriver driver) {
		super(driver);
	}
	
	public void DatosPersonalesSolicitante()
	{
		clickDatosSolicitante();
		setFecha();
		setPais();
		setNacionalidad();
		setOcupacion();
		serDescripcion();
	}
	
	private void serDescripcion()
	{
		sendKeys(txtDescripcion,"ALBAÑILERIA COMPLETA EN EDIFICIOS");
	}
	
	private void setOcupacion()
	{	HCommonHelper.waiter("low");
		sendKeys(txtOcupacion,"ALBAÑIL");
	}
	
	private void setNacionalidad()
	{	HCommonHelper.waiter("low");
		//txtNacionalidad.setAttribute("value", "your value");
		sendKeys(txtNacionalidad,"MEXICO");
	}
	
	private void setPais()
	{	HCommonHelper.waiter("low");	
		sendKeys(txtPais,"MEXICO");
	}
	private void setFecha()
	{	HCommonHelper.waiter("low");
		txtPais.clear();
		sendKeys(txtFecha,"01-04-1985");
	}
	private void clickDatosSolicitante()
	{	HCommonHelper.waiter("low");
		refreshPage();
		HCommonHelper.waiter("medium");
		swithToFrame(frame);
		click(lnkDatosPSolicitante);
	}
}
