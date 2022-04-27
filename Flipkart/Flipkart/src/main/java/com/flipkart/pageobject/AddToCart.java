package com.flipkart.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.BrowserDriver;

public class AddToCart {
	WebDriver driver;
	
	public AddToCart(WebDriver driver) {
		this.driver=driver;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@FindBy(xpath ="//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")	
	WebElement AddToCart;
	
	public CartPage AddToCartItem() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		AddToCart.click();	
		return PageFactory.initElements(BrowserDriver.getCurrentDriver(), CartPage.class);
	}
}