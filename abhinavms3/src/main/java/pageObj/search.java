package pageObj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class search {
WebDriver driver;
By searchbox=By.xpath("//*[@id=\"search-destination\"]");
By submitclk=By.xpath("//*[@id=\"engine-submit\"]/button");
public search(WebDriver driver) {
	this.driver=driver;
}
public WebElement seachbox() {
	return driver.findElement(searchbox);
}
public WebElement submit() {
	return driver.findElement(submitclk);
}
}
