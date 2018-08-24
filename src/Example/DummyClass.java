package Example;

import java.net.MalformedURLException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import com.sellabs.actionable.MainClass;

public class DummyClass {
	static WebDriver driver = null;

	@Test
	public void lounchWebsite() throws InterruptedException, MalformedURLException {
		/*System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver");
		driver = new FirefoxDriver();*/

		WebDriver driver = new SafariDriver();
		MainClass.loadWebSite("http://demo.guru99.com/test/delete_customer.php");
		//driver.get("http://demo.guru99.com/test/delete_customer.php");
		//Thread.sleep(3000);
		

		driver.findElement(By.name("cusid")).sendKeys("vlvmlvv");
		driver.findElement(By.name("submit")).click();
		driver.switchTo().alert();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		
		

	}

	public static void completeRegistration() {
		driver.findElement(By.xpath("//form[@id='load_form']//h3[contains(text(),'Registration Form')]"));
		//form[@id='load_form']//h3[contains(text(),'Registration Form')]
	}
}
