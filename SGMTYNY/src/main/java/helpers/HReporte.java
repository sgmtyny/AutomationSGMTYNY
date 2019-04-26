package helpers;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

/**
 * @author Abraham Galindo
 * @date 09/04/2019
 * 
 */

public class HReporte {
	
	static String StrPath = Hproperties.leerPath();
	private static String path = StrPath +"\\Resultados\\LogHTML\\";		
	private static String documento;
	private static String actualDate = HCommonHelper.getDateHour();
	
	public static void crearHTML(String clase, ArrayList<String> paso, ArrayList<String> status) throws IOException
	{
		String strpaso="";
		String strColor="green";
		int pasos = paso.size();	
		
		String htmlReport= 	"<!DOCTYPE html>"+
						   	"<head>"+
						   	"<style>"+
						   	"table, th, td {border: 1px solid black;}"+
						   	"</style>"+
						   	"</head>"+
						   	"<body>"+
						   	"<h2>Resultados</h2>"+
						   	"<p>Resultados de la ejecucion de pruebas del modulo "+ clase +"</p>"+
						   	"<table style=\"width:50%\">"+
						   	"<tr>"+
						   	"<th>Paso</th>"+
						   	"<th>Resultado</th>"+
						   	"</tr>";
		String htmlPasos = "";
						   	
		for (int i=0; i<pasos; i++)
			{				
				if((status.get(i).toString()).equals("FAILED"))
				{
					strColor = "red";
				}
				strpaso = paso.get(i).toString();
				htmlPasos = htmlPasos+
						"<tr>"+
						"<td>"+ strpaso + "</td>"+
						"<td style=\"color:"+ strColor +";\">"+ status.get(i).toString() +"</td>"+
					   	"</tr>";
			};
		
			String htmlImage = "</table>"+
								"<p> <img src=\""+ StrPath +"\\Resultados\\Imagenes\\" + clase + actualDate + ".jpg" +"\"> </p>";
			String htmlFin = "</body>"+
							 "</html>";			
			
			htmlReport = htmlReport + htmlPasos + htmlImage + htmlFin;			
			documento = path + clase + actualDate + ".html";			
			guardarArchivo(htmlReport,documento);						  
	}
		
	
	public static void guardarArchivo(String htmlReport, String documento) throws IOException 
	{
				
		File file = new File(documento);
		file.createNewFile();
		
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(htmlReport);
		bw.close();		 
        Desktop.getDesktop().open(file);
	}
	
	public static void tomarCaptura(WebDriver driver, String nombre, String actualDate) throws IOException
	{
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile=new File(StrPath +"\\Resultados\\Imagenes\\" + nombre + actualDate + ".jpg");
        FileUtils.copyFile(SrcFile, DestFile);
	}
}
