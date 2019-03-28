package tests;

import java.io.IOException;
import org.testng.annotations.Test;
import pages.PageLogin;
import pages.*;

import java.io.File;
import tests.BaseTest;

public class Toportunidades extends BaseTest{
	
	@Test
	public void stepsOportunidades() throws IOException  {
		
		strPaso = "Haciendo login";
		Tlogin.stepsLogin();
			
		
		strPaso = "Creando el page oportunidades";
		PageOportunidades oportunidades = new PageOportunidades();	
		PageOportunidadesNuevo oportunidadesNuev = new PageOportunidadesNuevo();
		
		oportunidades.clickNuevo();
		
		
	}	
}
