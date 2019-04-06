package tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import pages.PageImportar;
import pages.PageInicio;
import pages.PageLogin;
import pages.PageReferidoCambiarEstado;
import pages.PageTodosLosReferidos;

public class TCambiarEstado extends BaseTest{
	@Test
	public void stepsToChangeStatus() {
		PageTodosLosReferidos todosLosReferidos = new PageTodosLosReferidos(driver);
		PageReferidoCambiarEstado cambiarEstado = new PageReferidoCambiarEstado(driver);
		strPaso = "Creando el page login";
		PageLogin login = new PageLogin(driver);
		PageInicio inicio = new PageInicio(driver);
		PageImportar importar = new PageImportar(driver);
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
