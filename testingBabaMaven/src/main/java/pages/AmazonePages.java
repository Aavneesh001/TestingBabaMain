package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

import baselibrary.BaseLibrary;

public class AmazonePages extends BaseLibrary{

	
public 	AmazonePages()
{
	PageFactory.initElements(driver, this);
}
	

@FindBy(xpath = "//i[@class=\"hm-icon nav-sprite\"]")
private WebElement all ;

@FindBy(xpath = "//div[@id=\"hmenu-customer-name\"]//child::b")
private WebElement  sineon;

@FindBy(xpath = "//input[@class=\"a-input-text\"]")
private WebElement  enterno;

@FindBy(xpath = "//input[@class=\"a-button-input\"]")
private WebElement  continu ;

@FindBy(xpath = "//input[@type=\"password\"]")
private WebElement  passwrd ;

@FindBy(xpath = "//input[@id=\"signInSubmit\"]")
private WebElement  sinein ;

@FindBy(xpath = "(//span[text()='All'])[2]")
private WebElement  all2 ;

@FindBy(xpath = "//a[text()='Sign Out']")
private WebElement  sineout ;




public void clickonall() {
	
	waitandclick(all);
}



public void clickonsineon()  {
	
	waitandclick(sineon);
}

public void entermobileno()  {
	
	waitandSendkeys(enterno, "7303760559");
}

public void clickoncontinue()  {
	
	waitandclick(continu);
}

public void enterpassword() {
	
	waitandSendkeys(passwrd, "123456");
}

public void clickonsinein() {
	
	waitandclick(sinein);
}

public void clickonall2() {
	
	waitandclick(all2);
}
public void clickonsinout() {
	
	waitandclick(sineout);
}




	
}
