package com.sellabs.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.sellabs.actionable.MainClass;

public class LoginPageObject {

	public static WebElement anElement = null;

	public static WebElement userName() {
		anElement = MainClass.driver.findElement(By.name("userName"));
		return anElement;
	}

	public static WebElement password() {
		anElement = MainClass.driver.findElement(By.name("password"));
		return anElement;
	}

	public static WebElement signIn() {
		anElement = MainClass.driver.findElement(By.name("login"));
		return anElement;
	}

}
