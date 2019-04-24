package helpers;

/**
 * @author Abraham Galindo
 * @date 09/04/2019
 * 
 */

public class HReporte {

	public static String crearHTML(String clase, String paso[], int pasos)
	{
		String htmlReport= 	"<!DOCTYPE html>"+
						   	"<head>"+
						   	"<style>"+
						   	"table, th, td {border: 1px solid black;}"+
						   	"</style>"+
						   	"</head>"+
						   	"<body>"+
						   	"<h2>Resultados</h2>"+
						   	"<p>Resultados de la ejecucion de pruebas del modulo \"Login\"</p>"+
						   	"<table style=\"width:50%\">"+
						   	"<tr>"+
						   	"<th>Paso</th>"+
						   	"<th>Resultado</th>"+
						   	"</tr>";
		String htmlPasos = "";
						   	
		for (int i=0; i<=pasos; i++)
			{
				htmlPasos = 
						"<tr>"+
						"<td>"+ paso[i] + "</td>"+
						"<td style=\"color:green;\">OK</td>"+
					   	"</tr>";
			};
		
			String htmlImage = "</table>"+
								"<p> <img src=\"C:\\Login.jpg\"> </p>";
			String htmlFin = "</body>"+
							 "</html>";
			
			
			htmlReport = htmlReport + htmlPasos + htmlImage + htmlFin;
						   	
			return htmlReport;				   	
						  
	}
		
	
	public static void guardarArchivo() 
	{
		//crearHTML();
	}
}
