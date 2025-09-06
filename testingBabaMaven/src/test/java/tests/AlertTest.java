package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.Alerts;

public class AlertTest extends BaseLibrary {

	Alerts ob;

	@BeforeTest(groups = { "smoke", "sanity", "regression" })
	@Parameters("browsername")
	public void LAunchhUrl(String browsername) {

		launchUrl("https://testingbaba.com/old/", browsername);
		ob = new Alerts();

	}

	@Test(priority = 0, groups = { "smoke", "sanity", "regression" })
	public void ClickOnclose() {
		ob.clickonclose();
	}

	@Test(priority = 1, groups = { "smoke", "sanity", "regression" })
	public void ClickOnpractice() {
		ob.clickonpractice();
	}

	@Test(priority = 2, groups = { "smoke", "sanity", "regression" })
	public void ClickOnalertsandwindow() {
		ob.clickonalertsandwindow();
	}

	@Test(priority = 3, groups = { "sanity", "regression" })
	public void ClickOnalerts() {
		ob.cliconalerts();
	
	}

	@Test(priority = 4, groups = { "sanity", "regression" })
	public void ClickOnSeeAlerts() {
		ob.cliconseealerts();
	}

	@Test(priority = 5, groups = { "sanity", "regression" })
	public void ClickOnwaitfor5alert() {
		ob.cliconwaitfor5alert();
	}

	@Test(priority = 6, groups = { "regression" })
	public void ClickOnConfirmAlert() {
		ob.cliconconfirmalert();
	}

	@Test(priority = 7, groups = { "regression" })
	public void ClickOnPromptBox() {
		ob.cliconconpromptbox();
	}

	@AfterTest(groups = { "smoke", "sanity", "regression" })
	public void CloseBrowser() {
		CloseBrowser();
	}	
	
	
}

