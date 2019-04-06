package tests;

import org.testng.annotations.Test;

import pages.PageReferidosImportar;
import pages.PageInicio;
import pages.PageLogin;
import pages.PageReferidosNuevo;
import pages.PageReferidosTodos;

public class TReferidoNuevo extends BaseTest{

	@Test
	public void AgregarNuevoReferido() {
		PageReferidosNuevo nuevoReferido = new PageReferidosNuevo(driver);
		PageReferidosTodos todosLosReferidos = new PageReferidosTodos(driver);
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

		nuevoReferido.typeFathersName();
		nuevoReferido.typeMothersName();
		nuevoReferido.selectSource();
		nuevoReferido.typeSubSource();
		nuevoReferido.TypeDate();
		nuevoReferido.typeMobilePhone();
		nuevoReferido.typeHomePhone();
		nuevoReferido.typeWorkPhone();
		nuevoReferido.typeExt();
		nuevoReferido.selectPrefPhone();
		nuevoReferido.checkDontCall();
		nuevoReferido.typePersonalEmail();
		nuevoReferido.typeWorkEmail();
		nuevoReferido.typeOtherEmail();
		nuevoReferido.selectPrefEmail();
		nuevoReferido.checkDontSendEmail();
		nuevoReferido.typeDescription();
		nuevoReferido.checkAddInformation();
		nuevoReferido.clickCancel();

	    
	}
}
