package tests;

import java.util.Objects;

import org.testng.annotations.Test;

import helpers.HCommonHelper;
import pages.PageAsesores;
import pages.PageAsesoresCrearLYC;
import pages.PageInicio;
import pages.PageLogin;
/**
 * @author Diego Mejia
 * @date 11/04/2019
 * 
 * */
public class TAsesoresCrearLicenciaYCertificacion extends BaseTest{

	@Test
	public void stepsToCreateLicenseAndCertifications() {
		PageLogin login = new PageLogin(driver);
		PageInicio inicio = new PageInicio(driver);
		PageAsesores asesores = new PageAsesores(driver);
		PageAsesoresCrearLYC crearLYC = new PageAsesoresCrearLYC(driver);
		login.launchHome();
		login.inputUsuario();
		login.inputContrasenia();
		login.clickEntrar();
		inicio.clickAsesores();
		asesores.clickSelectView();
		asesores.clickOptionAll();
		asesores.selectLicensesAndCertifications();
		asesores.clickNew();
		crearLYC.typeDescription();
	    crearLYC.typeType();
		crearLYC.typeDateFrom();
		crearLYC.typeDateUntil();
		crearLYC.typeLegacyId();
		crearLYC.clickSave();
		
	}
}
