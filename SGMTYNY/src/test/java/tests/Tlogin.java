package tests;
import java.io.File;
import java.io.IOException;
import org.testng.annotations.Test;

import helpers.HReporte;
import pages.PageInicio;
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
	public static void stepsLogin() throws IOException {
	try {			
		
		//strPaso = "Creando el page login";
		PageLogin login = new PageLogin(driver);
		
		
		String paso[] = login.paso;
		int pasos = login.pasos;
		
		
		login.launchHome();
		login.inputUsuario();	
		login.inputContrasenia();
		login.clickEntrar();
		HReporte.crearHTML("Tlogin", paso, pasos);
		
		}
		
		catch (Exception e) {
		      System.out.println("Something went wrong.");
		    }
		//inicio.clickReferidos();
		
	}	
}
