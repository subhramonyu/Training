package com.sellabs.actionable;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.sellabs.pageobject.HomePageObject;
import com.sellabs.pageobject.LoginPageObject;
import com.sellabs.testexecutor.TestMainClass;

public class MainClass {

	public static WebDriver driver = null;

	public static String URl = null;

	public static void main(String[] args) throws MalformedURLException {
		loadWebSite(URl);
		scrollToElement(HomePageObject.aProduct());
		//scrollPageDown();
		//scrollPageDown();
		clickElementJS(HomePageObject.aProduct());
		//HomePageObject.aProduct().click();
		Actions action =new Actions(driver);
		//action.moveByOffset(500,).release().perform();

	}

	public static void loadWebSite(String URL) throws MalformedURLException {
		
		
		//System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver");
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
	/*	DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setBrowserName("chrome");
		caps.setPlatform(Platform.MAC);*/
	//	driver = new RemoteWebDriver(new URL("http://134.64.246.129:4448/wd/hub"), caps);
		//driver = new FirefoxDriver();
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();;
		driver.get(URL);
		System.out.println(driver.getTitle());
	}

	public static void doLogin() {
		LoginPageObject.userName().clear();
		LoginPageObject.userName().sendKeys("tutorial");
		LoginPageObject.password().clear();
		LoginPageObject.password().sendKeys("tutorial");
		LoginPageObject.signIn().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(driver.getTitle().equals("Welcome: Mercury Tours"));
		System.out.println(driver.getPageSource());
		
		Actions action =new Actions(driver);
		

		
		

	}
	
	
	public static void scrollToElement(WebElement element)
	{
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element,300);
		//((JavascriptExecutor) SeleniumFactory.webDriver).executeScript("window.scrollBy(0,700)", element);
	}
	
	
	
	public static void clickElementJS(WebElement element)
   {
	    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
}
	
	
}
