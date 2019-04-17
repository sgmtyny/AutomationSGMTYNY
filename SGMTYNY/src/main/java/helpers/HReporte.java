package helpers;

/**
 * @author Abraham Galindo
 * @date 09/04/2019
 * 
 */

public class HReporte {

	public static String crearHTML(String clase)
	{
		String htmlReport= "<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
				"<style>\r\n" + 
				"table, th, td {\r\n" + 
				"  border: 1px solid black;\r\n" + 
				"}\r\n" + 
				"</style>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"\r\n" + 
				"<h2>Resultados</h2>\r\n" + 
				"<p>Resultados de la ejecucion de pruebas del modulo" + clase +"</p>\r\n" + 
				"\r\n" + 
				"<table style=\"width:50%\">\r\n" + 
				"  <tr>\r\n" + 
				"    <th>Paso</th>\r\n" + 
				"    <th>Resultado</th>    \r\n" + 
				"  </tr>\r\n" + 
				"  <tr>\r\n" + 
				"    <td>Insertar usuario</td>\r\n" + 
				"    <td style=\"color:green;\">OK</td>\r\n" + 
				"  </tr>\r\n" + 
				"  <tr>\r\n" + 
				"    <td>Insertar contraseña</td>\r\n" + 
				"    <td style=\"color:green;\">OK</td>\r\n" + 
				"  </tr>\r\n" + 
				"  <tr>\r\n" + 
				"    <td>Click entrar</td>\r\n" + 
				"    <td style=\"color:red;\">Fail</td>\r\n" + 
				"  </tr>\r\n" + 
				"</table>\r\n" + 
				"\r\n" + 
				"<p> <img src=\"C:\\Login.jpg\"> </p>\r\n" + 
				"\r\n" + 
				"</body>\r\n" + 
				"</html>";
		
		return htmlReport;
	}
	
	public static void guardarArchivo() 
	{
		//crearHTML();
	}
}
