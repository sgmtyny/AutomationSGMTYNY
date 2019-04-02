package tests;

import org.testng.annotations.Test;

import pages.PageImportar;
import pages.PageInicio;
import pages.PageLogin;
import pages.PageTodosLosReferidos;

public class TImportar extends BaseTest{
	
	@Test
	public void stepsToImport() {
		PageTodosLosReferidos todosLosReferidos = new PageTodosLosReferidos(driver);
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
