package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import helpers.Hproperties;

public class PageTemplate {

    //Instaciamos BasePAge, por que contiene metodos los cuales realizan diferentes acciones
	BasePage base = new BasePage();
	
	//Se crea el objeto a utilizar. Es importante utilizar la nomenclatura con el prefijo de 2 o 3 letras del tipo de objeto y para que se utiliza--Texto Usuario= txUsuario
	@FindBy(xpath="//*[@id=\"username\"]")
	WebElement txUserName;
	
	
	//Metodo publico el cual sera llamado por el test, nomenclatura usando la accion y dato "inputUsuario", contiene un llamado a un metodo privado, el cual incluye las acciones a tulizar	
	
	@Test
	public void metodoPublico() {
		//Invoca metodo privado que contiene acciones a realizar
		metodoPrivado();
	}
	
	
	
	//Metodo privado que contiene las acciones a realizar, invocadas a "base"
	private void metodoPrivado() {
		base.sendKeys(txUserName, Hproperties.strUser);
		
	}
	
	
	
	
}
