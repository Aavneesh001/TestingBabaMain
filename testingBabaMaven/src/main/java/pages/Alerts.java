package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class Alerts extends BaseLibrary {

	public Alerts()
	{
	PageFactory.initElements(driver, this);	
	}
		
	@FindBy(xpath = "//button[text()='×']")
	private WebElement close;

	@FindBy(xpath = "//a[@href='newdemo.html']")
	private WebElement practice;

	@FindBy(xpath = "//button[@data-target='#alerts']")
	private WebElement alertsandwindow;

	@FindBy(xpath = "//a[@href='#tab_12']")
	private WebElement alerts;

	@FindBy(xpath = "//button[@onclick='myalert()']")
	private WebElement seealert;

	@FindBy(xpath = "//button[@onclick=\"aftersec5()\"]")
	private WebElement wait5alert;

	@FindBy(xpath = "//button[@onclick='myconfirm()']")
	private WebElement confirmalert;

	@FindBy(xpath = "//button[@onclick='myprompt()']")
	private WebElement promptbox;



	public void clickonclose()
	{
		waitandclick(close);
	}

	public void clickonpractice()
	{
		waitandclick(practice);
	}

	public void clickonalertsandwindow()
	{
		waitandclick(alertsandwindow);
	}

	public void cliconalerts()
	{
		waitandclick(alerts);
	}

	public void cliconseealerts()
	{
		seealert.click();
		driver.switchTo().alert().accept();
	}


	public void cliconwaitfor5alert()
	{
		waitandclick(wait5alert);
		waitforalert();
		driver.switchTo().alert().accept();
	}

	public void cliconconfirmalert()
	{
		waitandclick(confirmalert);
		waitforalert();
		driver.switchTo().alert().dismiss();
	}

	public void cliconconpromptbox()
	{
		waitandclick(promptbox);
		waitforalert();
		driver.switchTo().alert().sendKeys("Avneesh");
		driver.switchTo().alert().accept();
	}
	
	
}
