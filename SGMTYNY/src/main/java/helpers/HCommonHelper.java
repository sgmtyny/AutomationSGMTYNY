package helpers;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.Random;

public class HCommonHelper {
	private static Random random;
	public static int getLenghtUrl(String url) {
		return url.length();
	}
	public static int getRandomNumberInRange(int limit) {
		random = new Random();
		return random.nextInt(limit);
	}
	public static String getRandomEmail() {
		random = new Random();
		String[] emailDomain = {"hotmail","gmail","yahoo"};
		String[] names = {"Iniesta","Ronaldinho","Ronaldo","Zlatan","Griezmann","Neymar","Beckham","Mbappe"};
		String[] specialCharacter = {"_",".",""};
		return names[random.nextInt(names.length)]+specialCharacter[random.nextInt(specialCharacter.length)]+random.nextInt(10)+"@"+emailDomain[random.nextInt(emailDomain.length)]+".com";
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
		strDate = strDate.replace("/", "-");
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
				intTime=5000;
			}			
		Thread.sleep(intTime);		
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static String selectDate()
	{
		String strDate="";
		
		return strDate;
	}
	
}
