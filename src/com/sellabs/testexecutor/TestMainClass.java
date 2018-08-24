package com.sellabs.testexecutor;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sellabs.actionable.MainClass;

public class TestMainClass {
	
	
@Test
	public static void testDoLogin() throws MalformedURLException {

		//MainClass.loadWebSite("http://automationpractice.com/index.php");
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		//driver.get("http://automationpractice.com/index.php");
		MainClass.loadWebSite("http://automationpractice.com/index.php");
		MainClass.doLogin();
		Assert.assertEquals(MainClass.driver.getTitle(), "Welcome: Mercury Tours");

	}

}
