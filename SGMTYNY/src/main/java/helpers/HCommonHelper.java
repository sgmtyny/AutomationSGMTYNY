package helpers;

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
	public static String randomOptionCheckOrNot() {
		String[] options = {"yes","no"};
		random = new Random();
		return options[random.nextInt(options.length)];
	}
	public String getRandomName() {		
		return null;
	}
}
