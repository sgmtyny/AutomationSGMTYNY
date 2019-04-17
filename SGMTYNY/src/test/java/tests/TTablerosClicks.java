package tests;

import org.testng.annotations.Test;

import pages.PageInicio;
import pages.PageLogin;
import pages.PageReportes;
import pages.PageTableros;

public class TTablerosClicks extends BaseTest{
	@Test
	public void stepsToClickOnDashboardsHyperlinks() {
		PageLogin login = new PageLogin(driver);
		PageInicio inicio = new PageInicio(driver);
		PageTableros tableros = new PageTableros(driver);
		login.launchHome();
		login.inputUsuario();
		login.inputContrasenia();
		login.clickEntrar();
		inicio.clickTableros();
//		tableros.clickAllTheFavorites();
		tableros.clickRecent();
		tableros.clickCreatedByMe();
//		tableros.clickPublicDashboards();
		tableros.clickPrivateDashboards();
		tableros.clickAllTheDashboards();
		tableros.clickAllTheFolders();
		tableros.clickSharedWithMe();
		
	}
}
