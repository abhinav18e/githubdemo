package resourrce;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class base1 {

	public static WebDriver driver;
	 public String url;
	 public ExtentReports report;
		public ExtentTest logger;
	 
	  Properties prop =new Properties();
	
  public WebDriver initialize() throws IOException {
	 
	   FileInputStream file=new FileInputStream("C:\\Users\\abhinav\\eclipse-workspace\\abhinavms3\\src\\test\\resources\\siteData.properties");
      prop.load(file);
   String browserName= prop.getProperty("browser");
   url=prop.getProperty("url");
    ChromeOptions options=new ChromeOptions();
   options.addArguments("disable-infobars");
  if(browserName.equalsIgnoreCase("chrome")) {
	   System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	   driver=new ChromeDriver(options); 
  }
  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
 return driver;
  }
  public void getScreenshot(String tname) throws IOException {
	   
	 File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 File target=new File(System.getProperty("user.dir")+"/Screenshots/"+tname+".png");
	 FileHandler.copy(src, target);
	
	 
  }
  public static String captureScreenShot(WebDriver driver) {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String screenshotPath = System.getProperty("user.dir")+"/screenshot/SS" +System.currentTimeMillis()+ ".png";
		try {
			FileHandler.copy(src, new File(screenshotPath));
			System.out.println("Screenshot captured");
		} catch (IOException e) {
			System.out.println("Unable to capture screenshot" +e.getMessage());
		}
		return screenshotPath;
	}

}
