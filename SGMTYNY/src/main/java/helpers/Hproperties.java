package helpers;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Abraham Galindo
 * @description Lee el archivo properties y extrae la informacion que se necesita
 * @date 27/03/2019
 * 
 */


public class Hproperties {
	
	 
	
	public static String strUrl;
	public static String strUser;
	public static String strPsw;
	
	private static String strPath;
	
	public static String leerPath() {		 
		 strPath = new File ("").getAbsolutePath ();
		return strPath;		
	}
				
	public static void leerProperties() {
		 try {  			 
			    Properties propiedades = new Properties();			  
			    propiedades.load(new FileInputStream(strPath +"\\Properties\\Config.properties"));
			  
			  
			     strUrl = propiedades.getProperty("urlWeb");
			     strUser = propiedades.getProperty("usuario");
			     strPsw = propiedades.getProperty("contrasenia");			    
			     
			   }
			  catch (FileNotFoundException e) {
			   System.out.println("Error, El archivo no exite");
			  } catch (IOException e) {
			   System.out.println("Error, No se puede leer el archivo");
			  }
		
	}

}




 


 


