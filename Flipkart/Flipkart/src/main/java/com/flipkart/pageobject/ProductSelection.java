package com.flipkart.pageobject;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.BrowserDriver;
public class ProductSelection {
	WebDriver driver;
	public ProductSelection(WebDriver driver) {
		this.driver=driver;
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	@FindBy(xpath ="//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/div")	
	WebElement product1;
	
	@FindBy(xpath ="//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div[2]/div")	
	WebElement product2;
	
	@FindBy(xpath ="//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[3]/div/div[3]/div/a[2]")	
	WebElement product3;
	
	@FindBy(xpath ="//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[3]/div/div/div/a/div[2]/div[1]/div[1]")	
	WebElement product4;
	
	
	
	public AddToCart Item1() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		product1.click();	
	return PageFactory.initElements(BrowserDriver.getCurrentDriver(), AddToCart.class);
	}
	public AddToCart Item2() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		product2.click();	
		return PageFactory.initElements(BrowserDriver.getCurrentDriver(), AddToCart.class);
		}
	public AddToCart Item3() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		product3.click();	
		return PageFactory.initElements(BrowserDriver.getCurrentDriver(), AddToCart.class);
		}
		public AddToCart Item4() {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			product4.click();
			return PageFactory.initElements(BrowserDriver.getCurrentDriver(), AddToCart.class);
		}
			
				
			public void driverchange1() {

				@SuppressWarnings("unused")
				String parent=BrowserDriver.getCurrentDriver().getWindowHandle();
				Set<String> allWindows=BrowserDriver.getCurrentDriver().getWindowHandles();
				ArrayList<String> tabs=new ArrayList<>(allWindows);
				BrowserDriver.getCurrentDriver().switchTo().window(tabs.get(4));
				//driver.close();
				}
			
				public void driverchange2() {
					//driver.close();
					@SuppressWarnings("unused")
					Set<String> allWindows=BrowserDriver.getCurrentDriver().getWindowHandles();
					ArrayList<String> newTab=new ArrayList<>(allWindows);
					String mainWindow = BrowserDriver.getCurrentDriver().getWindowHandle();
					newTab.remove(mainWindow);
					BrowserDriver.getCurrentDriver().switchTo().window(newTab.get(3));
				}
				public void driverchange3() {
					//driver.close();
					@SuppressWarnings("unused")
					Set<String> allWindows=BrowserDriver.getCurrentDriver().getWindowHandles();
					ArrayList<String> newTab=new ArrayList<>(allWindows);
					String mainWindow = BrowserDriver.getCurrentDriver().getWindowHandle();
					newTab.remove(mainWindow);
					BrowserDriver.getCurrentDriver().switchTo().window(newTab.get(2));
				}
					
				public void driverchange4() {
					//driver.close();
					@SuppressWarnings("unused")
					String parent=BrowserDriver.getCurrentDriver().getWindowHandle();
					Set<String> allWindows=BrowserDriver.getCurrentDriver().getWindowHandles();
					ArrayList<String> tabs=new ArrayList<>(allWindows);
					BrowserDriver.getCurrentDriver().switchTo().window(tabs.get(1));
				}
}
			
				


