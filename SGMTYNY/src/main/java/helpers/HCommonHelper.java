package helpers;
import java.io.IOException;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.Random;

import helpers.ExcelFile;

public class HCommonHelper {
	private static Random random;
	public static int getLenghtUrl(String url) {
		return url.length();
	}
	public static int getRandomNumberInRange(int start, int limit) {
		return (start + (int) Math.round(Math.random() * (limit - limit)));
	}
	public static String getRandomEmail() {
		random = new Random();
		String[] emailDomain = {"hotmail","gmail","yahoo"};
		String[] names = {"Iniesta","Ronaldinho","Ronaldo","Zlatan","Griezmann","Neymar","Beckham","Mbappe"};
		String[] specialCharacter = {"_",".",""};
		return names[getRandomNumberInRange(0,names.length)]+specialCharacter[getRandomNumberInRange(0,specialCharacter.length)]+getRandomNumberInRange(0,10)+"@"+emailDomain[getRandomNumberInRange(0,emailDomain.length)]+".com";
	}
	public static String randomOptionCheckOrNot() {
		random = new Random();
		String[] options = {"yes","no"};
		return options[getRandomNumberInRange(0,options.length)];
//		return "yes";
	}
	public String getRandomName() {		
		return null;
	}
	
	public static String getDate() 
	{
		String strDate="";
		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		strDate = dateFormat.format(date);
		return strDate;
	}
	
	public static void waiter(String strTime)
	{
		int intTime=500;
		try {				
			if(strTime == "low"){
				intTime=1000;
			}else if (strTime == "medium") {
				intTime=3000;
			}else if(strTime == "high") {
				intTime=6000;
			}			
		Thread.sleep(intTime);		
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public static String selectDate()
	{
		int intNum = getRandomNumberInRange(0,29);
		
		String strDate=getDate();			
		String strDay = strDate.substring(0,2);
		String strMonth = strDate.substring(3,5);
		String strYear = strDate.substring(6,10);
		int intDay = Integer.parseInt(strDay);
		int intMonth = Integer.parseInt(strMonth);
		int intYear = Integer.parseInt(strYear);
		
		if(intMonth > 11) {
			intMonth = 1;
			intYear = intYear + 1;
		}		
		if (intDay > 26) {
			intDay = intDay + 1;
			intMonth = intMonth + 1;
		}	
		
		if(intDay > 10) {
			strDay = "0" + String.valueOf(intDay);
		}else if(intMonth > 10) {
			strMonth = "0" +  String.valueOf(intMonth);
		}
		
		strDate = strDay + "-" + strMonth + "-" + String.valueOf(intYear);
		
		return strDate;
	}
	
	public static String readExcelForOportunityID() 
	{
		String strID="";
		String strArchivo="OportunidadesID.xlsx";
		String strHoja="Status";		
		String[][] strContenidoCelda;
		try {
			strContenidoCelda = ExcelFile.readExcel(strArchivo,strHoja);
			for(int i=0; i<ExcelFile.intRows; i++)
			{			
					if(strContenidoCelda[i][1].equals("Activo"))
					{
						strID=strContenidoCelda[i][0];
						System.out.println(strID);
						break;					
					}			
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return strID;
	}	
	
	public static int baseEn() {
		int select = getRandomNumberInRange(0,2);
		return select;
	}
	
	
	public static String mexicosStates() {
		String strState="";
		int intState=0;
		String[] strStates = {"AGUASCALIENTES","BAJA CALIFORNIA","BAJA CALIFORNIA SUR","CAMPECHE", "COAHUILA", "COLIMA", "CHIAPAS", "CHIHUAHUA", "CIUDAD DE MEXICO", "DURANGO", "GUANAJUATO", "GUERRERO", "HIDALGO", "JALISCO", "MEXICO", "MICHOACAN", "MORELOS", "NAYARIT", "NUEVO LEON", "OAXACA", "PUEBLA", "QUERETARO", "QUINTANA ROO", "SAN LUIS POTOSI", "SINALOA", "SONORA","TABASCO","TAMAULIPAS","TLAXCALA","VERACRUZ","YUCATAN","ZACATECAS"};
		intState = getRandomNumberInRange(0,31);
		strState = strStates[intState];
		return strState;		
	}
	
	public static String postalCode() {
		String strPostalCode="";
		strPostalCode = String.valueOf(getRandomNumberInRange(11111, 99999));
		return strPostalCode;
	}
	
	
}
