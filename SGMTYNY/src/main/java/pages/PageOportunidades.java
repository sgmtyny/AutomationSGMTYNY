package pages;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import helpers.*;

public class PageOportunidades extends BasePage{
	
	static String strId = HCommonHelper.readExcelForOportunityID();
	String strMyXPath = "//*[@data-recordid='" + strId + "']";

	@FindBy(xpath = "//iframe[@title = 'accessibility title']")
	WebElement frame;
	
	@FindBy(xpath=".//*[@title=\"Nuevo\"]")
	WebElement btnNuevo;
	
	@FindBy(xpath="//*[@title=\"Configurar Producto\"]")
	WebElement btnConfigurar;
	
	@FindBy(xpath="//*[@title=\"Solicitud\"]")
	WebElement btnSolicitud;
	
	@FindBy(xpath= "//*[text() = 'Datos del solicitante']")
	WebElement btnDatosSolicitante;
	
	public PageOportunidades(WebDriver driver) {
		super(driver);
	}
	
	@Test
	public void clickNuevo() 
	{
		clickNew();
	}	
	
	public void clickOportunidad() throws IOException
	{		
		clickOport();
	}
	
	public void clickSolicitud()
	{
		clickSolici();
	}
	
	public void clickDatosDelSolicitante()
	{
		clickDatSoli();
	}
	
	
	public void clickConfigurarProducto() 
	{
		clickConfi();
	}
	
	
	
	
	private void clickDatSoli()
	{
		HCommonHelper.waiter("medium");
		click(btnDatosSolicitante);
	}
	
	private void clickSolici()
	{
		click(btnSolicitud);
	}
	
	
	private void clickNew() 
	{
		waitForPage();
		click(btnNuevo);		
	}	
	
	private void clickOport() 	
	{
		HCommonHelper.waiter("high");
		refreshPage();
		HCommonHelper.waiter("high");
		swithToFrame(frame);		
		WebElement linkOportunidad = getElementByXpathContainsText(strMyXPath);			
		click(linkOportunidad);
		
	}
	
	private void clickConfi() {
		
		click(btnConfigurar);
	}
	
}
