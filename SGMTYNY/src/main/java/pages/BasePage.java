package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Diego Mejia
 * @date 27/03/2019
 * 
 */


public class BasePage {
	
	public final int timeout = 100000;
	protected WebDriver driver;
	private WebDriverWait wait;
	private Actions action;
	private List<WebElement> elements;
	private WebElement element;
	private Select dropdown;
	
	//Constructor
	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, timeout);
		action = new Actions(driver);
	}
	
	public BasePage() {
		// TODO Auto-generated constructor stub
	}

	protected  void moveToElement(WebElement element) {
		waitForElement(element);
		action.moveToElement(element).build().perform();
		
	}
	
	protected void waitForElement(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	
	protected void dragAndDrop(WebElement elementSource,WebElement elementTarget) {
		action.dragAndDrop(elementSource, elementTarget).build().perform();
	}
	
	protected void sendKeys(WebElement element,String text) {
		//waitForElement(element);
		if (element.isDisplayed())
		{
			element.sendKeys(text);
		}		
	}
	
	protected void click(WebElement element) {
		waitForElement(element);
		element.click();
	}
	
	public void selectValue() {
		
	}
	
	public void findElementByItsValue(List<WebElement> elements,String value) {
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
	
	public void selectGroupOfElements(List<WebElement> elements,String[] values) {
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
	
	public void navbarNavigateTo(String[] elementsNames) {
		for(String elementName : elementsNames ) {
			element = driver.findElement(By.xpath("//span[contains(text(),'"+elementName+"')]"));
			moveToElement(element);
		}
		element.click();
	}
	
	public void selectFromDropdown(WebElement element,String text) {
	    dropdown = new Select(element);
				dropdown.selectByVisibleText(text);
	}
	
	public void selectFromMultipleDropdown(WebElement element,String[] text) {
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