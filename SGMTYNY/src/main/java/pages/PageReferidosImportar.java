package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import helpers.Hproperties;

public class PageReferidosImportar extends BasePage{
	
	@FindBy(linkText = "Referidos")
	WebElement lknReferidos;
	@FindBy(linkText = "Agregar nuevos registros")
	WebElement lknNuevoRegistro;
	@FindBy(linkText = "CSV")
	WebElement lknCSVFile;
	@FindBy(xpath = "//input[@name = \"file\"]")
	WebElement btnChooseFile;
	@FindBy(linkText = "Siguiente")
	WebElement btnSiguiente;
	@FindBy(linkText = "Iniciar importación")
	WebElement btnIniciarImportacion;
	@FindBy(linkText = "Aceptar")
	WebElement btnAceptar;
	

	private String path = Hproperties.leerPath();
	
	public PageReferidosImportar(WebDriver driver) {
		super(driver);
	}
	public void clickReferidos() {
		clickRef();		
	}
	public void clickAgregarNuevoReferido() {
		clickAgregarNuevoRef();		
	}
	public void clickCSVFile() {
		clickOnCSVFile();		
	}
	public void importCSVFile() {
		lookForFile();
	}
	public void clickNext() {
		clickOnBtnNext();
	}
	public void clickStartImport() {
		clickOnBtnStartImport();
	}
	public void clickAccept() {
		clickOnAccept();
	}
	private void clickRef() {		
		System.out.println(driver.getTitle());
		click(lknReferidos);
	}
	private void clickAgregarNuevoRef() {
		click(lknNuevoRegistro);
	}
	private void clickOnCSVFile() {
		click(lknCSVFile);
	}	
	private void lookForFile() {
		sendKeys(btnChooseFile, path +"\\Recursos\\Datos\\Worksheet in UAT -E2E- GRUPO 1 22-11 vf.csv");
	}
	private void clickOnBtnNext() {
		click(btnSiguiente);
	}
	private void clickOnBtnStartImport() {
		click(btnIniciarImportacion);
	}
	private void clickOnAccept() {
		click(btnAceptar);
	}
}
