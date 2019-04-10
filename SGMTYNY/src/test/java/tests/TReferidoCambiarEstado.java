package tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import pages.PageReferidoImportar;
import pages.PageInicio;
import pages.PageLogin;
import pages.PageReferidoCambiarEstado;
import pages.PageReferidoTodos;
/**
 * @author Diego Mejía
 * @date  05/04/2019
 */
public class TReferidoCambiarEstado extends BaseTest{
	@Test
	public void stepsToChangeStatus() {
		PageReferidoTodos todosLosReferidos = new PageReferidoTodos(driver);
		PageReferidoCambiarEstado cambiarEstado = new PageReferidoCambiarEstado(driver);
		strPaso = "Creando el page login";
		PageLogin login = new PageLogin(driver);
		PageInicio inicio = new PageInicio(driver);
		PageReferidoImportar importar = new PageReferidoImportar(driver);
		strPaso = "Invocando metodos a login";
		login.launchHome();
		login.inputUsuario();	
		login.inputContrasenia();
		login.clickEntrar();
		strPaso = "Invocando metodos para importar";
		inicio.clickReferidos();
		todosLosReferidos.clickCambiarEstado();
		cambiarEstado.clickStatus();
	}
}
