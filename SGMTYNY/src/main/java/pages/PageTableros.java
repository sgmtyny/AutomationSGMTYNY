package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageTableros extends BasePage{
	
	@FindBy(xpath = "//a[@title='Reciente']")
	WebElement btnReciente;
	@FindBy(xpath = "//a[@title='Creado por mí']")
	WebElement btnCreadoPorMi;
	@FindBy(xpath = "//a[@title='Tableros privados']")
	WebElement btnTablerosPrivados;
	@FindBy(xpath = "//a[@title='Tableros públicos']")
	WebElement btnTablerosPublicos;
	@FindBy(xpath = "//a[@title='Todos los tableros']")
	WebElement btnTodosLosTableros;
	@FindBy(xpath = "//a[@title='Todas las carpetas']")
	WebElement btnTodasLasCarpetas;	
	@FindBy(xpath = "//a[@title='Compartido conmigo']")
	WebElement btnCompartidoConmigo;
	@FindBy(xpath = "//a[@title='Todos los favoritos']")
	WebElement btnTodosLosFavoritos;
	
	public PageTableros(WebDriver driver) {
		super(driver);
	}
	
	public void clickAllTheFavorites() {
		System.out.println("all favorites");
		clickBtnAllTheFavorites();
	}
	private void clickBtnAllTheFavorites() {
		click(btnTodosLosFavoritos);
	}	
	public void clickSharedWithMe() {
		System.out.println("shared with me");
		clickBtnSharedWithMe();
	}
	private void clickBtnSharedWithMe() {
		click(btnCompartidoConmigo);
	}	
	public void clickAllTheFolders() {
		System.out.println("All folders");
		clickBtnAllTheFolders();
	}
	private void clickBtnAllTheFolders() {
		click(btnTodasLasCarpetas);
	}	
	public void clickAllTheDashboards() {
		System.out.println("all dashboards");
		clickBtnAllTheDashboards();
	}
	private void clickBtnAllTheDashboards() {
		click(btnTodosLosTableros);
	}	
	public void clickPublicDashboards() {
		System.out.println("Public");
		clickBtnPublicDashboards();
	}
	private void clickBtnPublicDashboards() {
		click(btnTablerosPublicos);
	}	
	public void clickPrivateDashboards() {
		System.out.println("Private");
		clickBtnPrivateDashboards();
	}
	private void clickBtnPrivateDashboards() {
		click(btnTablerosPrivados);
	}	
	public void clickCreatedByMe() {
		System.out.println("Created by me");
		clickBtnCreatedByMe();
	}
	private void clickBtnCreatedByMe() {
		click(btnCreadoPorMi);
	}	
	public void clickRecent() {
		System.out.println("Recent");
		clickBtnRecent();
	}
	private void clickBtnRecent() {
		click(btnReciente);
	}

}
