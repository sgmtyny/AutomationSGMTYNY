package tests;

import org.testng.annotations.Test;

import pages.PageInicio;
import pages.PageLogin;
import pages.PageReportes;

public class TReportesClicks extends BaseTest{
	@Test
	public void stepsToClickOnReportsHyperlinks() {
		PageLogin login = new PageLogin(driver);
		PageInicio inicio = new PageInicio(driver);
		PageReportes reportes = new PageReportes(driver);
		login.launchHome();
		login.inputUsuario();
		login.inputContrasenia();
		login.clickEntrar();
		inicio.clickReportes();
		reportes.clickAllTheFavorites();
		reportes.clickRecent();
		reportes.clickCreatedByMe();
		reportes.clickPublicReports();
		reportes.clickPrivateReports();
		reportes.clickAllTheReports();
		reportes.clickAllTheFolders();
		reportes.clickSharedWithMe();
		
	}
}
