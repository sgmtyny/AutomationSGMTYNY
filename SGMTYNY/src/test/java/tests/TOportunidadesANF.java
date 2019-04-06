package tests;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.PageInicio;
import pages.PageOportunidades;

import org.testng.annotations.Test;
import pages.PageLogin;
import pages.*;

import java.io.File;
import tests.BaseTest;

public class TOportunidadesANF  extends BaseTest{

	@Test
	public void stepsOportunidadesANF() throws IOException  {
		
		strPaso = "Haciendo login";
		Tlogin.stepsLogin();
			
		strPaso="Entrando a Oportunidades";
		PageInicio inicio = new PageInicio(driver);
		
		strPaso = "Creando el page oportunidades";
		PageOportunidades oportunidades = new PageOportunidades(driver);	
		PageOportunidadesNuevo oportunidadesNuev = new PageOportunidadesNuevo(driver);
		
		inicio.clickOportunidades();
				
		
	}	
}
