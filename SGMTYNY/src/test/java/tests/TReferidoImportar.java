package tests;

import org.testng.annotations.Test;

import pages.PageReferidosImportar;
import pages.PageInicio;
import pages.PageLogin;
import pages.PageReferidosTodos;

public class TReferidoImportar extends BaseTest{
	
	@Test
	public void stepsToImport() {
		PageReferidosTodos todosLosReferidos = new PageReferidosTodos(driver);
		strPaso = "Creando el page login";
		PageLogin login = new PageLogin(driver);
		PageInicio inicio = new PageInicio(driver);
		PageReferidosImportar importar = new PageReferidosImportar(driver);
		strPaso = "Invocando metodos a login";
		login.launchHome();
		login.inputUsuario();	
		login.inputContrasenia();
		login.clickEntrar();
		strPaso = "Invocando metodos para importar";
		inicio.clickReferidos();
		todosLosReferidos.clickImport();
		importar.clickReferidos();
		importar.clickAgregarNuevoReferido();
		importar.clickCSVFile();
		importar.importCSVFile();
		importar.clickNext();
		importar.clickNext();
		importar.clickStartImport();
		importar.clickAccept();
	}
}
