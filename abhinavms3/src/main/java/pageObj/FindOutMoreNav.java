package pageObj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindOutMoreNav {
	public WebDriver driver;
	By ExpNovotelPath =By.xpath("//*[@id=\"footer\"]/div[2]/div[1]/ul/li[4]/a");
	By findMorePath=By.xpath("//*[@id=\"novotelMeeting\"]/div/a");
	
	public FindOutMoreNav(WebDriver driver){
		this.driver=driver;
	}
	
	public WebElement Novoresort() {
		return driver.findElement(ExpNovotelPath);
		
	}
   public WebElement findOutMore() {
	   return driver.findElement(findMorePath);
   }

}
