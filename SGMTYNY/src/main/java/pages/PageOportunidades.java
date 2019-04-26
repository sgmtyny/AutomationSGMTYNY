package pages;

import java.io.IOException;
import java.sql.Driver;
import java.util.ArrayList;

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
	
	
	public ArrayList<String> paso = new ArrayList();
	public ArrayList<String> status = new ArrayList();	
	
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
		try {
			paso.add("Click Datos solicitante");
			HCommonHelper.waiter("medium");
			click(btnDatosSolicitante);
			status.add("OK");			
		}
		catch (Exception e) {
			status.add("FAILED");
	    }			
	}
	
	private void clickSolici()
	{
		try {
			paso.add("Click en solicitud");			
			click(btnSolicitud);
			status.add("OK");			
		}
		catch (Exception e) {
			status.add("FAILED");
	    }			
	}
	
	
	private void clickNew() 
	{
		try {
			paso.add("Click en nueva solicitud");			
			waitForPage();
			click(btnNuevo);
			status.add("OK");			
		}
		catch (Exception e) {
			status.add("FAILED");
	    }					
	}	
	
	private void clickOport() 	
	{
		try {
			paso.add("Click en Oportunidad");			
			HCommonHelper.waiter("high");
			refreshPage();
			HCommonHelper.waiter("high");
			swithToFrame(frame);		
			WebElement linkOportunidad = getElementByXpathContainsText(strMyXPath);			
			click(linkOportunidad);
			status.add("OK");			
		}
		catch (Exception e) {
			status.add("FAILED");
	    }			
	}
	
	private void clickConfi() {
		
		try {
			paso.add("Click en configurar oportunidad");			
			click(btnConfigurar);
			status.add("OK");			
		}
		catch (Exception e) {
			status.add("FAILED");
	    }			
	}
	
}
