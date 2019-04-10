package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import helpers.HCommonHelper;
/**
 * @author Diego Mej�a
 * @date  29/03/2019
 */
public class PageReferidoTodos extends BasePage{
	@FindBy(xpath = "//div[@title = \"Importar\"]")
	WebElement btnImportar;
	@FindBy(xpath = "//div[@title = \"Nuevo\"]")
	WebElement btnNuevo;
	@FindBy(xpath = "//div[@title = \"Cambiar estado\"]")
	WebElement btnCambiarEstado;
	@FindBy(xpath = "//input[@type = 'checkbox']/following-sibling::span[@class = 'slds-checkbox--faux']")
	List<WebElement> records;
	@FindBy(xpath = "//a[@title = 'Mostrar 2 acciones m�s']")
	WebElement arrowDown;
	@FindBy(xpath = "//a[@title = 'Cambiar propietario']")
	WebElement btnCambiarPropietario;	
	
	public PageReferidoTodos(WebDriver driver) {
		super(driver);
	}
	public void clickImport(){
		clickBtnImportar();
		changeToNewTab();
	}
	public void clickCambiarEstado() {
		selectRecord();
		clickBtnCambiarEstado();
	}
	public void clickNew(){
		clickBtnNew();
	}
	private void clickBtnImportar() {
		click(btnImportar);
	}
	private void clickBtnCambiarEstado() {
		click(btnCambiarEstado);
	} 
	private void clickBtnNew() {
		click(btnNuevo);
	}
	public void selectRecord() {
		selectRandomRecord();
	}	
	private void selectRandomRecord() {
		selectOptionWithException(records,0);
	}
	public void clickCambiarPropietario() {
		clickBtnCambiarPropietario();
	} 
	private void clickBtnCambiarPropietario() {
		click(btnCambiarPropietario);
	} 
	public void clickArrowDown() {
		selectRecord();
		click(arrowDown);
	}
}