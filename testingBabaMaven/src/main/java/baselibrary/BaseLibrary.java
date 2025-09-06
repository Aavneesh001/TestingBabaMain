package baselibrary;
import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

import applicationUtility.ApplicationUtility;
import excelUtility.ExcelUtility;
import screenshotUtility.ScreenshotUtility;
import waitUtility.WaitUtility;

public class BaseLibrary implements ApplicationUtility, WaitUtility , ScreenshotUtility , ExcelUtility {
    
	
	String path = "gdgaiud";
	public static WebDriver driver = null;

	public void launchUrl( String url, String browsername) {

		if (browsername.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}

		else if (browsername.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}

		else if (browsername.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}

		
		driver.get(url);
		driver.manage().window().maximize();

	}

	@Override
	public void scrolltoElement(WebElement ele) {

		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();

	}

	@Override
	public void slider(WebElement ele, int x, int y) {

		Actions actions = new Actions(driver);
		actions.clickAndHold(ele).moveByOffset(x, y).perform();

	}

	@Override
	public void waitandclick(WebElement ele) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();
	}

	@Override
	public void waitandSendkeys(WebElement ele, String data) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.sendKeys(data);
	}

	@Override
	public void waitforalert() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
	}

	@DataProvider(name = "logincred")
	public Object[][] logincredentials() {

		return new Object[][] { { "7303760559", "123456" },

		};

	}

	@Override
	public void screenscroll(int x, int y) {
		// TODO Auto-generated method stub

	}

	public void closebrowser() {
		driver.close();

	}
	@Override
	public void getscreenshot(String filename, String foldername) {

		String loc = System.getProperty("user.dir");
		String path = loc + "//screenshot//" + foldername + "//" + filename + ".png";

		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File des = new File(path);
			FileUtils.copyFile(src, des);

		} catch (Exception e) {
			System.out.println("issue in get screenshot" + e);

		}

	}

	@AfterMethod
	public void getresultanalysis(ITestResult result) {
		String name = result.getMethod().getMethodName();

		if (result.getStatus() == ITestResult.SUCCESS) {
			getscreenshot(name, "pass");
		}

		else if (result.getStatus() == ITestResult.FAILURE) {
			getscreenshot(name, "fail");

		}

	}
	
	
	@Override
	public String getreaddata(int sheetno, int rowno, int colno, String path) {

		String value = " ";

		try {
			FileInputStream fis = new FileInputStream(path);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheetAt(sheetno);
			value = sheet.getRow(rowno).getCell(colno).getStringCellValue();

		} catch (Exception e) {
			{
				System.out.println("error in read data" + e);

			}

		}

		return value;
	}
	

	
	
	}
