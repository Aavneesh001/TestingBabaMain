package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.AmazonePages;

public class LoginTest extends BaseLibrary {

	AmazonePages ob;

	@BeforeTest(groups = { "smoke", "sanity", "regression" })
	@Parameters("browsername")
	public void LaunchUrl(String browsername) {
		
		launchUrl("https://www.amazon.in/", browsername);
		ob = new AmazonePages();
	}

	

	@Test(priority = 0, groups = { "smoke", "sanity", "regression" })
	public void ClickOnAll() {
		ob.clickonall();

	}

	@Test(priority = 1, groups = { "smoke", "sanity", "regression" })
	public void ClickOnSineon() {
		ob.clickonsineon();
	}

	@Test(priority = 2, groups = { "sanity", "regression" })
	public void EnterMobileNo() {
		ob.entermobileno();
	}

	@Test(priority = 3, groups = { "sanity", "regression" })
	public void ClickOnContinue() {
		ob.clickoncontinue();
	}

	@Test(priority = 4, groups = { "sanity", "regression" })
	public void EnterPassword() {
		ob.enterpassword();
	}

	@Test(priority = 5, groups = { "sanity", "regression" })
	public void ClickOnLogin() {
		ob.clickonsinein();
	}

	@Test(priority = 6, groups = { "regression" })
	public void ClickOnAll2() {
		ob.clickonall2();
	}

	@Test(priority = 7, groups = { "regression" })
	public void ClickOnSineout() {
		ob.clickonsinout();
	}

	@AfterTest(groups = { "regression" })
	public void CloseBrowser() {
		closebrowser();

	}

}
