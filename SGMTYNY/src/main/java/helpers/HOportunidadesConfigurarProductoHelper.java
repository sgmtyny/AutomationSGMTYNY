package helpers;

import java.io.IOException;

import org.apache.xmlbeans.xml.stream.StartPrefixMapping;

/**
 * @author Abraham Galindo
 * @date 09/04/2019
 * 
 */
public class HOportunidadesConfigurarProductoHelper {
	
	static String strProducto="";
	static String strPlan="";	
	static String strPrimaFrecuencia="";
	static String strAniosGarantia="";
	static String strBaseEn="";
	static String strIgualAsegurado = "SI";
	static String strEstado = "";
	static String strCP="";
	static String strSexo="";
	static String strFumas="";
	static String strPreferente = "";
	static String strIngresoAnual = "";
	static String strtrabajadorIndependiente = "";
	static String strHoja="InformacionPersonal";	
	static String [] arrBaseEn = {"PRODUCTO","NECESIDAD"};
	static String [] arrSexo = {"MASCULINO","FEMENINO"};
	static String [] arrFumas= {"SI","NO"};
	static String [] arrPreferente= {"SI","NO"};
	static String [] arrTrabajadorIndependiente= {"SI","NO"};
	static String [] arrProducto= {"ALFA MEDICAL","ALFA MEDICAL FLEX","IMAGINA SER","NUEVO PLENITUD","ORVI 99","REALIZA","STAR DOTAL","STAR TEMPORAL"};
	
	static String [] arrPlanAlfaMedical= {"PESO INTEGRO", "PESO PLENO", "PESO PRACTICO"};
	static String [] arrPlanAlfaMedicalFlex= {"PESO AMFLEXA", "PESO AMFLEXB"};
	static String [] arrPlanImaginaSer= {"DOLARIS55PU", "UDIIS55PU", "UDIIS55PN", "DOLARIS55PN", "DOLARIS60PU", "UDIIS60PU", "UDIIS60PN", "DOLARIS60PN", "DOLARIS65PU", "UDIIS65PU", "UDIIS65PN", "DOLARIS65PN", "DOLARIS70PU", "UDIIS70PU", "UDIIS70PN", "DOLARIS70PN"};
	static String [] arrPlanNuevoPlenitud= {"UDINP55P15", "UDINP55PN", "DOLARNP55PN", "UDINP60P15", "UDINP60PN", "DOLARNP65P15", "UDINP65P15", "UDINP65PN", "DOLARNP65PN"};
	static String [] arrPlanOrvi99= {"DOLARORV60","UDIORVTP","DOLAORVTP","UDIORVTPM","DOLARORVTPM","DOLARORV1P","UDIORV10P","DOLARORV10P","DOLARORV15P","UDIORV20P","DOLARORV20P","DOLARORV20PM","DOLARORV6P"};
	static String [] arrPlanRealiza= {"UDIREALIZA", "DOLARREALIZA"};
	static String [] arrPlanStarDotal= {"DOLARSD10", "UDISD10", "DOLARSD15","DOLARSD20","UDISD20","DOLARSD5"};
	static String [] arrPlanStarTemporal= {"DOLARST65", "DOLARST1", "DOLARST10","UDIST10","UDIST20","DOLARST20","DOLARST5R"};
	static String [] arrPrimaFrecuencia = {"ANUAL", "SEMESTRAL", "TRIMESTRAL", "MENSUAL"};
	static String [] arrAniosGarantia = {"10","15","20","25", "30"};
	static String[][] strContenidoCelda;
	
	static int intBaseEn=0;
	static int intSexo=0;
	static int intFumas=0;
	static int intPreferente=0;
	static int intTrabajadorIndependiente=0;
	static int intProducto = 0;
	static int intPlan = 0;
	static int intPrimaFrecuencia = 0;
	static int intAniosGarantia = 0;
	
	static boolean exist = ExcelFile.existeArchivo("PageOportunidadesConfigurarProducto.xlsx");
	
	public static String[][] readExcelForOportunityProductConfiguration(String strHoja) 
	{
		String strArchivo="PageOportunidadesConfigurarProducto.xlsx";
			
		
		try {
				strContenidoCelda = ExcelFile.readExcel(strArchivo,strHoja);			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return strContenidoCelda;
	}	
	
	
	/******Configurar producto base en******/
	public static String conBaseEn()
	{		
		
		if(exist==true)
		{
			strBaseEn = readExcelForOportunityProductConfiguration(strHoja)[1][0];
		}
		else
		{
			intBaseEn = HCommonHelper.getRandomNumberInRange(0, 2);
			strBaseEn = arrBaseEn[intBaseEn];			
		}	
		return strBaseEn;
	}
	
	/******Solicitante es igual al asegurado******/
	public static String igualAsegurado()
	{		
		if(exist==true)
		{
			strIgualAsegurado = strContenidoCelda[1][1];
		}		
		return strIgualAsegurado;
	}
	/******Elegir el estado******/
	public static String estado()
	{
		if(exist==true)
		{
			strEstado = strContenidoCelda[1][2];
		}
		else
		{
			strEstado = HCommonHelper.mexicosStates();
		}
			
		return strEstado;
	}
	
	/******Elegir el CP******/
	public static String cp()
	{
		if(exist==true)
		{
			strCP = strContenidoCelda[1][7];
		}
		else
		{
			strCP = HCommonHelper.postalCode();
		}			
		return strCP;
	}
	
	/******Elegir sexo******/
	public static String sexo()
	{
		if(exist==true)
		{
			strSexo = strContenidoCelda[1][8];
		}
		else
		{
			intSexo=HCommonHelper.getRandomNumberInRange(0, 1);
			strSexo = arrSexo[intSexo];
		}			
		return strSexo;
	}
	
	/******Elegir fumas******/
	public static String fumas()
	{
		if(exist==true)
		{
			strFumas = strContenidoCelda[1][3];
		}
		else
		{
			intFumas=HCommonHelper.getRandomNumberInRange(0, 1);
			strFumas = arrFumas[intFumas];
		}			
		return strFumas;
	}
	
	/******Elegir preferente******/
	public static String preferente()
	{
		if(exist==true)
		{
			strPreferente  = strContenidoCelda[1][4];
		}
		else
		{
			intPreferente=HCommonHelper.getRandomNumberInRange(0, 1);
			strPreferente = arrPreferente[intPreferente];
		}			
		return strPreferente;
	}
	/******Elegir ingreso anual******/
	public static String ingresoAnual()
	{
		if(exist==true)
		{
			strIngresoAnual  = strContenidoCelda[1][5];
		}
		else
		{
			strIngresoAnual = String.valueOf(HCommonHelper.getRandomNumberInRange(11000000, 60000000));			
		}			
		return strIngresoAnual;
	}
	
	/******Elegir trabajador independiente******/
	public static String trabajadorIndependiente()
	{
		if(exist==true)
		{
			strtrabajadorIndependiente  = strContenidoCelda[1][6] + "00";
		}
		else
		{
			intTrabajadorIndependiente = HCommonHelper.getRandomNumberInRange(0, 1);
			strtrabajadorIndependiente = arrTrabajadorIndependiente[intTrabajadorIndependiente];
		}			
		return strtrabajadorIndependiente;
	}
	
	/******Elegir el producto******/
	public static String selectProducto()
	{
		strHoja = "SeleccionarProducto";		
		if(exist==true)
		{
			strProducto  =  readExcelForOportunityProductConfiguration(strHoja)[1][0];;
		}
		else
		{
			intProducto = HCommonHelper.getRandomNumberInRange(0, 7);
			strProducto = arrProducto[intProducto];			
		}	
		return strProducto;
	}
	
	/******Elegir el plan dependiendo del producto******/
	public static String selectPlan(String strProducto)
	{		
			switch (strProducto)
			{
			case "ALFA MEDICAL":
				strPlan=planAlfaMedical();
				break;
			case "ALFA MEDICAL FLEX":
				strPlan=planAlfaMedicalFlex();
				break;
			case "IMAGINA SER":
				strPlan=planImaginaSer();
				break;
			case "NUEVO PLENITUD":
				strPlan=planNuevoPlenitud();
				break;
			case "ORVI 99":
				strPlan=planOrvi99();
				break;
			case "REALIZA":
				strPlan=planRealiza();
				break;
			case "STAR DOTAL":
				strPlan=planStarDotal();
				break;
			case "STAR TEMPORAL":
				strPlan=planStarTemporal();
				break;
			}			
			
		return strPlan;
	}
	
	public static String planAlfaMedical()
	{
		strHoja = "SeleccionarPlan";		
		if(exist==true)
		{
			strPlan  =  readExcelForOportunityProductConfiguration(strHoja)[1][0];;
		}
		else
		{
			intPlan = HCommonHelper.getRandomNumberInRange(0, 2);
			strPlan = arrPlanAlfaMedical[intPlan];
		}
		return strPlan;
	}
	public static String planAlfaMedicalFlex()
	{
		strHoja = "SeleccionarPlan";	
		if(exist==true)
		{
			strPlan  =  readExcelForOportunityProductConfiguration(strHoja)[1][0];;
		}
		else
		{
			intPlan = HCommonHelper.getRandomNumberInRange(0, 1);
			strPlan = arrPlanAlfaMedicalFlex[intPlan];
		}
		return strPlan;
	}
	public static String planImaginaSer()
	{
		strHoja = "SeleccionarPlan";		
		if(exist==true)
		{
			strPlan  =  readExcelForOportunityProductConfiguration(strHoja)[1][0];;
		}
		else
		{
			intPlan = HCommonHelper.getRandomNumberInRange(0, 15);
			strPlan = arrPlanImaginaSer[intPlan];
		}
		return strPlan;
	}
	public static String planNuevoPlenitud()
	{
		strHoja = "SeleccionarPlan";		
		if(exist==true)
		{
			strPlan  =  readExcelForOportunityProductConfiguration(strHoja)[1][0];;
		}
		else
		{
			intPlan = HCommonHelper.getRandomNumberInRange(0, 8);
			strPlan = arrPlanNuevoPlenitud[intPlan];
		}
		return strPlan;
	}
	
	public static String planOrvi99()
	{
		strHoja = "SeleccionarPlan";		
		if(exist==true)
		{
			strPlan  =  readExcelForOportunityProductConfiguration(strHoja)[1][0];;
		}
		else
		{
			intPlan = HCommonHelper.getRandomNumberInRange(0, 12);
			strPlan = arrPlanOrvi99[intPlan];
		}
		return strPlan;
	}
	public static String planRealiza()
	{
		strHoja = "SeleccionarPlan";		
		if(exist==true)
		{
			strPlan  =  readExcelForOportunityProductConfiguration(strHoja)[1][0];;
		}
		else
		{
			intPlan = HCommonHelper.getRandomNumberInRange(0, 1);
			strPlan = arrPlanRealiza[intPlan];	
		}
		return strPlan;
	}
	
	public static String planStarDotal()
	{
		strHoja = "SeleccionarPlan";		
		if(exist==true)
		{
			strPlan  =  readExcelForOportunityProductConfiguration(strHoja)[1][0];;
		}
		else
		{
			intPlan = HCommonHelper.getRandomNumberInRange(0, 5);
			strPlan = arrPlanStarDotal[intPlan];
		}
		return strPlan;
	}
	
	public static String planStarTemporal()
	{
		strHoja = "SeleccionarPlan";		
		if(exist==true)
		{
			strPlan  =  readExcelForOportunityProductConfiguration(strHoja)[1][0];;
		}
		else
		{
			intPlan = HCommonHelper.getRandomNumberInRange(0, 6);
			strPlan = arrPlanStarTemporal[intPlan];
		}
		return strPlan;
	}
	
	
	/******Elegir la frecuencia de la prima******/
	
	public static String primaFrecuencia() 

	{		
		strHoja = "FrecuenciaPago";		
		if(exist==true)
		{
			strPrimaFrecuencia  =  readExcelForOportunityProductConfiguration(strHoja)[1][0];;
		}
		else
		{
			intPrimaFrecuencia = HCommonHelper.getRandomNumberInRange(0, 3);
			strPrimaFrecuencia = arrPrimaFrecuencia[intPrimaFrecuencia];
		}
		return strPrimaFrecuencia;
	}
	public static String primaFrecuenciaAniosG()
	{

		strHoja = "FrecuenciaPago";		
		if(exist==true)
		{
			strAniosGarantia  =  readExcelForOportunityProductConfiguration(strHoja)[1][1];;
		}
		else
		{
			intAniosGarantia= HCommonHelper.getRandomNumberInRange(0, 4);
			strAniosGarantia = arrAniosGarantia[intAniosGarantia];
	}
		return strAniosGarantia;
	}

}
