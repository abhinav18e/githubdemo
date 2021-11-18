package pageObj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class navigateResorts {
 WebDriver driver;
By findNovotelResortcl=By.xpath("//*[@id=\"pushThematiqueContainer\"]/div/div[3]/div/div[3]/a");
public navigateResorts(WebDriver driver){
	this.driver=driver;
}

public WebElement novotelresortk() {
	return driver.findElement(findNovotelResortcl);
}

}
