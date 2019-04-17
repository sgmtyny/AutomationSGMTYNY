package tests;

import org.testng.annotations.Test;


import pages.PageInicio;
import pages.PageLogin;
import pages.PageReferidoCambiarEstado;
import pages.PageReferidoCambiarPropietario;
import pages.PageReferidoImportar;
import pages.PageReferidoTodos;
/**
 * @author Diego Mejía
 * @date  05/04/2019
 */

public class TReferidoCambiarPropietario extends BaseTest{

	@Test
	public void stepsToChangeOwner() {
		strPaso = "Creando el page login";
		PageLogin login = new PageLogin(driver);
		PageInicio inicio = new PageInicio(driver);
		PageReferidoTodos todosLosReferidos = new PageReferidoTodos(driver);
		PageReferidoImportar importar = new PageReferidoImportar(driver);
		PageReferidoCambiarPropietario cambiarPropietario = new PageReferidoCambiarPropietario(driver);
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
