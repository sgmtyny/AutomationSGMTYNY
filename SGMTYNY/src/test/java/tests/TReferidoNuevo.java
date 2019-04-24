package tests;

import org.testng.annotations.Test;

import pages.PageReferidoImportar;
import pages.PageInicio;
import pages.PageLogin;
import pages.PageReferidoNuevo;
import pages.PageReferidoTodos;
/**
 * @author Diego Mejía
 * @date  03/04/2019
 */
public class TReferidoNuevo extends BaseTest{

	@Test
	public void stepsToAddNewLead() {
		//Instatiation
		PageLogin login = new PageLogin(driver);
		PageInicio inicio = new PageInicio(driver);
		PageReferidoTodos todosLosReferidos = new PageReferidoTodos(driver);
		PageReferidoNuevo nuevoReferido = new PageReferidoNuevo(driver);
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
		nuevoReferido.selectActionType();
		nuevoReferido.typeDate();
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
//		nuevoReferido.clickCancel();
	
	}
}

