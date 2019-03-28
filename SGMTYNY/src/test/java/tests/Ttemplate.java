package tests;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.PageLogin;
import pages.PageTemplate;
import tests.BaseTest;

/**
 * @author Autor de la clase
 * @description Invoca los diferentes metodos de la clase Page"mismo nombre", para cumplir con el objetivo del modulo
 * @date Fecha de creacion con formato dd/mm/aaaa
 * 
 */


//Clase con el prefijo "T" identificando que se encuentra en el package "test", seguido del nombre del modulo "template" = "Ttemplate"
public class Ttemplate {

@Test
	
//Metodo el cual hara el llamado a la clase dentro del package "pages" el cual contendra los metodos de casa paso a ejecutar	
	public void stepsTemplate() throws IOException {
		
		//Instanciar clase a usar		
		PageTemplate template = new PageTemplate();
		
		
		//Invocando el metodo de la primera accion
		template.metodoPublico();		
	
	}	
}
