package TestNGExample;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.sellabs.actionable.MainClass;

public class TestAlert {

	static WebDriver driver = null;
	
	@Test
	public void testAlert() throws MalformedURLException, InterruptedException {
		
		/*System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver");
		driver = new FirefoxDriver();*/
		//MainClass.loadWebSite("file:///Users/subhramanyudas/eclipse-workspace_Training/POM_Exapmle/drivers/Alert.html");
		//driver.get("file:///Users/subhramanyudas/eclipse-workspace_Training/POM_Exapmle/drivers/Alert.html");
		//Thread.sleep(3000);
		
		MainClass.loadWebSite("https://www.highcharts.com/demo/line-time-series");
		//int x = ().getLocation(aEle).getX();
		//driver.findElement(By.id("â€œalertâ€")).click();
		
		Actions actions = new Actions(MainClass.driver);
		WebElement aEle = MainClass.driver.findElement(By.cssSelector("rect.highcharts-background"));
	    Thread.sleep(3000);
		actions.clickAndHold(aEle).moveByOffset(0, 111);
		Thread.sleep(3000);
		actions.release().build().perform();
		
	}
}
