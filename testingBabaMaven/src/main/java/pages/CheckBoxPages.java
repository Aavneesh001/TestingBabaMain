package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class CheckBoxPages extends BaseLibrary {


	String path = "";

public CheckBoxPages()
{
	PageFactory.initElements(driver, this);
}

   @FindBy(xpath = "//button[@id=\"details-button\"]")
   private WebElement advance;
	
	
	@FindBy(xpath = "//button[text ( ) = '×' ]" )
	private WebElement close;
	
	@FindBy(xpath = "//a[@href=\"newdemo.html\"]" )
	private WebElement practice;
	
	@FindBy(xpath = "//button[@data-target=\"#elements\"]" )
	private WebElement elements;
	
	@FindBy(xpath = "//a[@href=\"#tab_2\"]" )
	private WebElement checkBox;
	
	@FindBy(xpath = "//iframe[@src=\"Checkbox.html\"]" )
	private WebElement frame;
	
	@FindBy(xpath = "//input[@id=\"myCheck\"]" )
	private WebElement mobileCheck;
	
	@FindBy(xpath = "//h6[@style=\"display: block;\"]" )
	private WebElement mobilecheckBox;
	
	@FindBy(xpath = "//input[@id=\"mylaptop\"]" )
	private WebElement laptopcheck;
	
	@FindBy(xpath = "//input[@id=\"mydesktop\"]" )
	private WebElement desktopcheck;
	
	public void clickonclose()
	{
		close.click();
	}
	public void clickonpractice()
	{
		practice.click();
	}
	
	public void clickonelements()
	{
		elements.click();
	}
	
	public void clickoncheckbox()
	{
		checkBox.click();
	}
	
	public void clickonmobilecheck()
	{  driver.switchTo().frame(frame);
		mobileCheck.click();
		String expected = getreaddata(path,"Mobile");
	    String actual = mobilecheckBox.getText();
	    
      org.testng.Assert.assertEquals(expected, actual);  
	 
	    System.out.println("validation done");
		
	}
	
	public void clickonlaptopcheck()
	{
		laptopcheck.click();
	}
	
	
	public void clickondesktopcheck()
	{
		desktopcheck.click();
		driver.switchTo().defaultContent();
	}
	
	
}
