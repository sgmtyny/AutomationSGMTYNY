package helpers;
/**
 * @author Abraham Galindo
 * @date 09/04/2019
 * 
 */
public class HConfigrarProductoHelper {
	
	static String strProducto="";
	static String strPlan="";	
	static String [] arrProducto= {"ALFA MEDICAL","ALFA MEDICAL FLEX","IMAGINA SER","NUEVO PLENITUD","ORVI 99","REALIZA","STAR DOTAL","STAR TEMPORAL"};
	static String [] arrPlanAlfaMedical= {"PESO INTEGRO", "PESO PLENO", "PESO PRACTICO"};
	static String [] arrPlanAlfaMedicalFlex= {"PESO AMFLEXA", "PESO AMFLEXB"};
	static String [] arrPlanImaginaSer= {"PESO AMFLEXA", "PESO AMFLEXB"};
	static int intProducto = 0;
	
	public static String selectProducto()
	{
		
//		if("Existe el documento")
//		{
//			strProducto=Archivo;
//		}
//		else
//		{
			intProducto = HCommonHelper.getRandomNumberInRange(0, 3);
			strProducto = arrProducto[intProducto];
//		}	
		return strProducto;
	}
	
	public static String selectPlan(String strProducto)
	{
//		if("Existe el documento")
//		{
//			strProducto=Archivo;
//		}
//		else
//		{
			intProducto = HCommonHelper.getRandomNumberInRange(0, 3);
			strProducto = arrProducto[intProducto];
//		}
		
		return strPlan;
	}
	
	public static String planAlfaMedical()
	{
		
		return strPlan;
	}
}
