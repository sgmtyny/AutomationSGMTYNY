package tests;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.Test;

import helpers.HCommonHelper;
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
		//strPaso = "Creando el page login";
		PageLogin login = new PageLogin(driver);
		ArrayList<String> paso = login.paso;
		ArrayList<String> status = login.status;
		try {		
				login.launchHome();
				login.inputUsuario();	
				login.inputContrasenia();
				HReporte.tomarCaptura(driver, "Tlogin", HCommonHelper.getDateHour());
				login.clickEntrar();			
				HReporte.crearHTML("Tlogin", paso, status);		
		}
		
		catch (Exception e) {
				HReporte.crearHTML("Tlogin", paso, status);
				System.out.println("Something went wrong.");
		    }		
	}	
}
