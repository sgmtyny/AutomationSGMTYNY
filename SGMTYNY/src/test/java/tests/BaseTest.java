package tests;

import org.testng.annotations.BeforeClass;

import java.io.File;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;

import helpers.*;

/**
 * @author Abraham Galindo
 * @description Invoca los metodos para la configuracion inicial
 * @date 27/03/2019
 * 
 */

public class BaseTest {
	
	public static String strPaso="";
	String strPath= Hproperties.leerPath();
	public static WebDriver driver;
	String driverPath = strPath + "\\Recursos\\Driver\\chromedriver.exe";		
	
@BeforeClass
public void setDriver() {
	strPaso="Invocando el metodo que lee el properties";
	Hproperties.leerProperties();
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	strPaso="Invocando el web driver";
	System.setProperty("webdriver.chrome.driver", driverPath);
	this.driver = new ChromeDriver(options);
	this.driver.manage().window().maximize();
}

@AfterClass
  public void quitDriver() {
	//driver.quit();
  }
}
