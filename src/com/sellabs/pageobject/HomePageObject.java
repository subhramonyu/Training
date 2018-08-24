package com.sellabs.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.sellabs.actionable.MainClass;

public class HomePageObject {
	
	
	public static WebElement anElement = null;

	public static WebElement aProduct() {
		anElement = MainClass.driver.findElement(By.xpath("//a[@class='product_img_link'][1]"));
		return anElement;
	}

	public static WebElement addToCartOnProductDetailsPage() {
		
		anElement = MainClass.driver.findElement(By.xpath("//button[@name='Submit']"));
		return anElement;
	}
	
	public static WebElement successfullyMessage() {
		anElement = MainClass.driver.findElement(By.xpath("//div//h2[text()]"));
		return anElement;
	}
}
