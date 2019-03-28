package tests;
import java.io.File;
import java.io.IOException;
import org.testng.annotations.Test;
import pages.PageLogin;

import tests.BaseTest;

/**
 * @author Abraham Galindo
 * @description Invoca los diferentes metodos para crear el Login
 * @date 27/03/2019
 * 
 */

public class Tlogin extends BaseTest{
	
	@Test
	public void stepsLogin() throws IOException {
		
		
		strPaso = "Creando el page login";
		PageLogin login = new PageLogin(driver);
		
		strPaso = "Invocando metodos a login";
		login.launchHome();
		login.inputUsuario();;		
		login.inputContrasenia();
		login.clickEntrar();		
		
	}	
}