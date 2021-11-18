package pageObj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class close {
	 WebDriver driver;
	 By cancel=By.xpath("//*[@id=\"onetrust-close-btn-container\"]/button");
public close(WebDriver driver) {
	this.driver=driver;
	
}
public WebElement cancelwindow() {
	return driver.findElement(cancel);
}
}
