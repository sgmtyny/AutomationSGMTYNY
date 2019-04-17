package tests;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.PageInicio;
import pages.PageOportunidades;
import pages.PageOportunidadesConfigurarProducto;
import pages.PageOportunidadesNuevo;

public class TOportunidadesConfigurarProducto  extends BaseTest{
	@Test
	public void stepsOportunidadesConfigurarProducto() throws IOException  {
		
		strPaso = "Haciendo login";
		Tlogin.stepsLogin();
			
		strPaso="Entrando a Oportunidades";
		PageInicio inicio = new PageInicio(driver);
		
		strPaso = "Creando el page oportunidades";
		PageOportunidades oportunidades = new PageOportunidades(driver);	
		
		strPaso="Creando el page Configurar producto";
		PageOportunidadesConfigurarProducto configurarProducto = new PageOportunidadesConfigurarProducto(driver);
		
		
		inicio.clickOportunidades();
		oportunidades.clickOportunidad();
		oportunidades.clickConfigurarProducto();
		configurarProducto.informacionPersonal();
		configurarProducto.selecProducto();
		configurarProducto.selecPlan();
		/*configurarProducto.selecPersona();
		configurarProducto.configuracion();
		configurarProducto.prima();*/
		
		
		
	}
}
