package waitUtility;

import org.openqa.selenium.WebElement;

public interface WaitUtility {

	public void waitandclick(WebElement ele);
	public void waitandSendkeys(WebElement ele, String data );
	public void waitforalert();
}
