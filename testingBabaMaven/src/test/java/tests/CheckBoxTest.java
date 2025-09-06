package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.CheckBoxPages;

public class CheckBoxTest extends BaseLibrary {

	
	CheckBoxPages ob;

	@BeforeTest(groups = { "smoke", "sanity", "regression" })
	@Parameters("browsername")
	public void launchurl(String browsername) throws InterruptedException {
		launchUrl("https://testingbaba.com/old/", browsername);
		Thread.sleep(2000);
		ob = new CheckBoxPages();
	}

	@Test(priority = 1, groups = { "smoke", "sanity", "regression" })
	public void clickOnclose() {
		ob.clickonclose();
	}

	@Test(priority = 2, groups = { "smoke", "sanity", "regression" })
	public void clickOnprictice() {
		ob.clickonpractice();
	}

	@Test(priority = 3, groups = { "smoke", "sanity", "regression" })
	public void clickOnelements() {
		ob.clickonelements();
	}

	@Test(priority = 4, groups = { "sanity", "regression" })
	public void clickOncheckBox() {
		ob.clickoncheckbox();
	}

	@Test(priority = 5, groups = { "sanity", "regression" })
	public void clickOnmobileCheck() {
		ob.clickonmobilecheck();
	}

	@Test(priority = 6, groups = { "regression" })
	public void clickonlaptopcheck() {
		ob.clickonlaptopcheck();
	}

	@Test(priority = 7, groups = { "regression" })
	public void clickondesktopcheck() {
		ob.clickondesktopcheck();
	}

	@AfterTest(groups = { "smoke", "sanity", "regression" })
	public void clickOnClosebrowser() {
		closebrowser();
	}
	
}
