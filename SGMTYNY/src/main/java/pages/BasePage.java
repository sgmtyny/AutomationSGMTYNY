package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import helpers.*;



;/**
 * @author Diego Mejia
 * @date 27/03/2019
 * 
 */


public class BasePage {
	
	public final int timeout = 30;
	protected static WebDriver driver;	
	private static WebDriverWait wait;
	private Actions action;
	private List<WebElement> elements;
	private WebElement element;
	private Select dropdown;
	public static JavascriptExecutor js;
	//Constructor
	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, timeout);
		action = new Actions(driver);
		this.js = (JavascriptExecutor) driver;
	}
	public BasePage() {
		// TODO Auto-generated constructor stub
	}
	public static WebElement getElementByXpathContainsText(String xpath)
    {
		return driver.findElement(By.xpath(xpath));
    }
	protected  void moveToElement(WebElement element) {
		waitForElement(element);
		action.moveToElement(element).build().perform();
	}
	/**
	 *
	 * work on this method
	 * 
	 **/
	protected void waitForFrame(WebElement element) {
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
	}
	protected static void waitForElement(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	protected void waitForElements(List<WebElement> elements) {
		wait.until(ExpectedConditions.visibilityOfAllElements(elements));
	}
	protected void refreshPage() {
		driver.navigate().refresh();
		HCommonHelper.waiter("high");
	}
	protected void swithToFrame(WebElement frame) {
		WebElement body = driver.findElement(By.tagName("body").className("desktop"));
		List<WebElement> frames = body.findElements(By.tagName("iframe"));
		for(WebElement f : frames) {
			if(f.getAttribute("title").equals(frame.getAttribute("title"))) {	
				//driver.switchTo().
					driver.switchTo().frame(f);
					System.out.println("True");						
			}else{
				System.out.println("False");
			}
		}
	}
	
	protected void swithToOtro(WebElement frame) {
		
		WebElement body = driver.findElement(By.tagName("body").xpath("/html/body"));//.className("slds-brand-band slds-brand-band_cover slds-brand-band_medium slds-template_default  forceBrandBand"));
//		body.findElement(By.xpath("//*[@id='ChildGender|0']/div/div[1]/label[1]/span[1]")).click();
		List<WebElement> frames = body.findElements(By.tagName("iframe"));
		for(WebElement f : frames) {
			if(f.getAttribute("title").equals(frame.getAttribute("title"))) {	
				//driver.switchTo().
					driver.switchTo().frame(f);
					System.out.println("True");						
			}else{
				System.out.println("False");
			}
		}
	}
	
	
	protected void waitForPage() {
		Boolean BUrl = false;
		String tempUrl;
		String page = "home";
		int i;
		int j;
			while(BUrl == false) {
				tempUrl = driver.getCurrentUrl();
				i = HCommonHelper.getLenghtUrl(tempUrl);
			    j = i - page.length();
				if(tempUrl.matches("[A-Za-z:/._-]{"+j+"}".concat(page))) {
					wait.until(ExpectedConditions.urlToBe(tempUrl));
					BUrl = true;
				}else {
					BUrl = false;
				}	
			}
	}
	protected void dragAndDrop(WebElement elementSource,WebElement elementTarget) {
		action.dragAndDrop(elementSource, elementTarget).build().perform();
	}
	protected void sendKeys(WebElement element,String text) {
		//waitForElement(element); //**No descomentar, por que cuando se descomenta, no funciona oportunidades nuevo :(
		//element.clear();
		element.sendKeys(text);			

	}
	//What this method does is returning only one element from a list of elements with same properties 
	protected WebElement getElementThatSharesProperties(List<WebElement> elements,int elementPosition) {
		if(elementPosition >= 0 && elementPosition < elements.size()) {
			return elements.get(elementPosition);	
		}else {
			System.out.println("Element doesn't exist");
			return null;	
		}
		
	}
	protected void click(WebElement element) {
		waitForElement(element);
		try {
			element.click();	
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("no fue posible dar click " + e);	
		}
	}
	
	protected void clickRaro(String strElement)
	{
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("document.getElementById('"+strElement+"').click();");
		/*WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(strElement))).click();*/
		//new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeSelected(strElement));
		
		//new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath(strElement))).click();
	}
	
	protected void clickJs(WebElement element) {
		HCommonHelper.waiter("low");
		js.executeScript("arguments[0].click();", element);
	}
	protected void sendKeysJs(String element) {
		HCommonHelper.waiter("low");
		js.executeScript("document.getElementById('"+ element +"').value='Abraham';");
		//js.executeScript("arguments[0].click();", element);
	}
	protected static void checkOptionalYesOrNot(WebElement element) {
			String option = HCommonHelper.randomOptionCheckOrNot();
			if(option.equals("yes")) {
				try {
					waitForElement(element);
					element.click();
				} catch (Exception e) {
					System.out.println("no fue posible dar click");
				}			
			}	
	}
	protected boolean verifyElementSelected(WebElement element,String attribute) {
		WebElement parentElement;
		parentElement = element.findElement(By.xpath(".."));
		return parentElement.findElement(By.id(attribute)).isSelected();
	}
	protected void selectOption(List<WebElement> elements) {
		int option;
		waitForElements(elements);
		option = HCommonHelper.getRandomNumberInRange(0,elements.size()-1);
		click(elements.get(option));
	}
	protected void selectOptionWithException(List<WebElement> elements,int exceptionElement) {
		int option;
		waitForElements(elements);
		do{
			option = HCommonHelper.getRandomNumberInRange(0,elements.size() - 1);
		}
		while(option == exceptionElement);
		click(elements.get(option));		
	}
	protected boolean waitForMessageToAppear(WebElement element) {
		try {
			waitForElement(element);
			if(element.isDisplayed()) {
				return true;
			}else{
				return false;
			}			
		}catch(Exception e) {
			return false;
		}
	}
	protected void changeToNewTab() {
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(tabs.size() - 1)); 
	}
	public void getUrl() {
		System.out.println(driver.getCurrentUrl());
	}
	protected void findElementByItsValue(List<WebElement> elements,String value) {
		waitForElement(elements.get(0));
		for(WebElement e : elements) {
			if (e.getAttribute("value").equals(value)) {
				if (e.isEnabled()) {
					if(e.isSelected()) {
						System.out.println("element was already clicked");
						continue;
					}else {
						click(e);
						System.out.println("element clicked");
					}
				}	
			}else {
				System.out.println("Element was not found");
			}
		}
	}
	
	protected void selectGroupOfElements(List<WebElement> elements,String[] values) {
		int i = 0;
		waitForElement(elements.get(i));
		while( i < elements.size()) {
			int j = 0;
			while(j < values.length) {
				if(elements.get(i).getAttribute("value").equals(values[j])) {
					click(elements.get(i));
				}	
				j++;
			}
			i++;
		}		
	}
	protected void navbarNavigateTo(String[] elementsNames) {
		for(String elementName : elementsNames ) {
			element = driver.findElement(By.xpath("//span[contains(text(),'"+elementName+"')]"));
			moveToElement(element);
		}
		element.click();
	}
	protected void selectFromDropdown(WebElement element) {
		int optionsInSelect;
		int randomNumber;
		dropdown = new Select(element);
		optionsInSelect = dropdown.getOptions().size();
		do {
			randomNumber = 	HCommonHelper.getRandomNumberInRange(0,optionsInSelect - 1);
		}
		while(randomNumber == 0);
		dropdown.selectByIndex(randomNumber);
	}
	protected boolean isElementUnhidden(WebElement element) {
		try {
			waitForElement(element);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	public static void downEnter(WebElement element)
	{
		try {
			element.sendKeys(Keys.DOWN);
			element.sendKeys(Keys.ENTER);			
		}catch(Exception e) {
			
		}

	}
	protected void selectFromMultipleDropdown(WebElement element,String[] text) {
		dropdown = new Select(element);
		int i = 0;
		elements = dropdown.getOptions();
		for(String t : text) {
			for(WebElement e  : elements) {
				if(e.getText().equals(t)) {
					dropdown.selectByVisibleText(t);
				}
				i++;
			}
		}
	}
	
}