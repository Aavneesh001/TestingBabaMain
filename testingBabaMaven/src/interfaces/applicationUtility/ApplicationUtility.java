package applicationUtility;

import org.openqa.selenium.WebElement;

public interface ApplicationUtility {

	public void scrolltoElement(WebElement ele);
	public void slider(WebElement ele, int x, int y);
	public void screenscroll(int x,int y);
	
}
