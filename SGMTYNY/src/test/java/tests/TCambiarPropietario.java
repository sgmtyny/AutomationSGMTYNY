package tests;

import org.testng.annotations.Test;

import pages.PageImportar;
import pages.PageInicio;
import pages.PageLogin;
import pages.PageReferidoCambiarEstado;
import pages.PageReferidoCambiarPropietario;
import pages.PageTodosLosReferidos;

public class TCambiarPropietario extends BaseTest{
	
	/*
	 * KEEP ON WORKING IN THIS SECTION
	 */
	@Test
	public void stepsToChangeOwner() {
		PageTodosLosReferidos todosLosReferidos = new PageTodosLosReferidos(driver);
		PageReferidoCambiarPropietario cambiarPropietario = new PageReferidoCambiarPropietario(driver);
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
		todosLosReferidos.clickArrowDown();
		todosLosReferidos.clickCambiarPropietario();
		cambiarPropietario.typeSearch();
		cambiarPropietario.checkSendEmail();
		cambiarPropietario.clickEnviar();
		
		
	}
}
