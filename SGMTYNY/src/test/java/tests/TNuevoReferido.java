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
<<<<<<< HEAD
		nuevoReferido.typeName();
=======
		nuevoReferido.typeName();

>>>>>>> branch 'master' of https://github.com/sgmtyny/AutomationSGMTYNY.git
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
<<<<<<< HEAD
=======

	    
>>>>>>> branch 'master' of https://github.com/sgmtyny/AutomationSGMTYNY.git
	}
}
