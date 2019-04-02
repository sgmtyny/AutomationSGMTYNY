package tests;

import org.testng.annotations.Test;

import pages.PageImportar;
import pages.PageInicio;
import pages.PageLogin;
import pages.PageNuevoReferido;
import pages.PageTodosLosReferidos;

public class TNuevoReferido extends BaseTest{

	@Test
	public void AgregarNuevoReferido() {
		PageNuevoReferido nuevoReferido = new PageNuevoReferido(driver);
		PageTodosLosReferidos todosLosReferidos = new PageTodosLosReferidos(driver);
		PageLogin login = new PageLogin(driver);
		PageInicio inicio = new PageInicio(driver);
		strPaso = "Invocando metodos a login";
		login.launchHome();
		login.inputUsuario();	
		login.inputContrasenia();
		login.clickEntrar();
		strPaso = "Invocando metodos para importar";
		inicio.clickReferidos();
		todosLosReferidos.clickNew();
		nuevoReferido.typeName();
		
	}
}
