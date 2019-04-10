package tests;

import org.testng.annotations.Test;

import pages.PageInicio;
import pages.PageLogin;
import pages.PageReferidoNuevo;
import pages.PageReferidoTodos;
/**
 * @author Diego Mejia
 * @date 09/04/2019
 * 
 * */
public class TReferidoNuevo1 extends BaseTest{

	@Test
	public void stepsToAddNewLead() {
		PageLogin login = new PageLogin(driver);
		PageInicio inicio = new PageInicio(driver);
		PageReferidoNuevo nuevoReferido = new PageReferidoNuevo(driver);
		strPaso = "Invocando metodos a login";
		login.launchHome();
		login.inputUsuario();	
		login.inputContrasenia();
		login.clickEntrar();
		strPaso = "Invocando metodos para importar";
		inicio.clickArrowDownReferidos();
		inicio.clickAgregarNuevoReferido();
		/*
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
	*/
	}
	
	
}
