package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageReportes extends BasePage{
	@FindBy(xpath = "//a[@title='Reciente']")
	WebElement btnReciente;
	@FindBy(xpath = "//a[@title='Creado por mí']")
	WebElement btnCreadoPorMi;
	@FindBy(xpath = "//a[@title='Reportes privados']")
	WebElement btnReportesPrivados;
	@FindBy(xpath = "//a[@title='Reportes públicos']")
	WebElement btnReportesPublicos;
	@FindBy(xpath = "//a[@title='Todos los reportes']")
	WebElement btnTodosLosReportes;
	@FindBy(xpath = "//a[@title='Todas las carpetas']")
	WebElement btnTodasLasCarpetas;	
	@FindBy(xpath = "//a[@title='Compartido conmigo']")
	WebElement btnCompartidoConmigo;
	@FindBy(xpath = "//a[@title='Todos los favoritos']")
	WebElement btnTodosLosFavoritos;	
	public PageReportes(WebDriver driver) {
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
	public void clickAllTheReports() {
		System.out.println("all reports");
		clickBtnAllTheReports();
	}
	private void clickBtnAllTheReports() {
		click(btnTodosLosReportes);
	}	
	public void clickPublicReports() {
		System.out.println("Public");
		clickBtnPublicReports();
	}
	private void clickBtnPublicReports() {
		click(btnReportesPublicos);
	}	
	public void clickPrivateReports() {
		System.out.println("Private");
		clickBtnPrivateReports();
	}
	private void clickBtnPrivateReports() {
		click(btnReportesPrivados);
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
