package abhinavms3;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pageObj.FindOutMoreNav;
import pageObj.close;
import pageObj.navigateResorts;
import pageObj.search;
import resourrce.base1;

public class mainTest extends base1 {
	private static Logger Log=LogManager.getLogger(mainTest.class.getName());
		public void first() throws IOException {
		driver=initialize();
	  	 driver.manage().window().maximize();
	  	   	driver.get(url);
	  	   	Log.info("landed on main page");
	  	   	close c=new close(driver);
	  	   	c.cancelwindow().click();
	  	
	}

  @Test
  public void searchTest() throws IOException, InterruptedException {
		first();
		search s=new search(driver);
		s.seachbox().sendKeys("bengaluru");
		s.seachbox().sendKeys(Keys.ARROW_DOWN);
		s.seachbox().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		s.submit().click();
	           Log.info("searched successful");
	           if( driver.getPageSource().contains("Bengaluru")) {
	       		Log.info("text verified");
	       	}else {
	       		Log.info("text not found");
	       	}
        driver.close();
    	       Log.info("browser closed");
  }
 @Test
  public void resort() throws IOException {
	  first();
	  navigateResorts g=new navigateResorts(driver);
	g.novotelresortk().click();
	  Log.info("landed on novotel resort page");
	if( driver.getPageSource().contains("Discover the magic of Novotel Resorts!")) {
		Log.info("text verified");
	}else {
		Log.info("text not found");
	}
	  driver.close();
	  Log.info("browser closed");
  }
@Test
public void findMore() throws IOException {
	  first();
	  FindOutMoreNav l=new FindOutMoreNav(driver);
	  l.Novoresort().click();
	  l.findOutMore().click();
	 String title="Meetings and Events";
	 System.out.println(driver.getTitle());
	if( driver.getTitle().contains(title)) {
		System.out.println("verify");
		Log.info("page title verified");
	}
	 	  driver.close();
	 	 Log.info("browser closed");
}
  
}

