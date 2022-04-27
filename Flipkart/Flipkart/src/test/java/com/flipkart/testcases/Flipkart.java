package com.flipkart.testcases;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.flipkart.pageobject.AddToCart;
import com.flipkart.pageobject.CartPage;
import com.flipkart.pageobject.HomePage;
import com.flipkart.pageobject.ProductSelection;
import com.flipkart.pageobject.RemoveCartItems;

import Utils.BrowserDriver;
import Utils.BrowserFactory;
public class Flipkart {
	static BrowserFactory browser;
	static WebDriver driver;
	static HomePage Login_Search;
	static ProductSelection ProductSelect;
	static ProductSelection ProductSelect1;
	static AddToCart AddToCart;
	static CartPage total;
	static RemoveCartItems removeCart;
	@BeforeSuite
	public void setUp() {
		browser = new BrowserFactory();
		ProductSelect1 = new ProductSelection(null);
		total=new CartPage(null);
		
	}
	@BeforeTest
	public void launchApp() {
		
		BrowserDriver.getCurrentDriver("chrome").get("https://www.flipkart.com/");
		BrowserDriver.getCurrentDriver().manage().window().maximize();
		BrowserDriver.getCurrentDriver().findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	}
	@AfterMethod
	public void tearDown() {
		 //driver.quit();
	}
	@Test
	public void verifyLogin() throws Throwable {
		Login_Search = PageFactory.initElements(BrowserDriver.getCurrentDriver(), HomePage.class);
		AddToCart = PageFactory.initElements(BrowserDriver.getCurrentDriver(), AddToCart.class);
		ProductSelect = PageFactory.initElements(BrowserDriver.getCurrentDriver(), ProductSelection.class);
		AddToCart = PageFactory.initElements(BrowserDriver.getCurrentDriver(), AddToCart.class);
		total=PageFactory.initElements(BrowserDriver.getCurrentDriver(),CartPage.class);
		removeCart=PageFactory.initElements(BrowserDriver.getCurrentDriver(),RemoveCartItems.class);
		
		Login_Search.click_accountlink();
		Login_Search.insertName("7093516281");
		Login_Search.insertpassword("Vishnu2000");
		Login_Search.click_on_signin();
		
		
		
		String parent=BrowserDriver.getCurrentDriver().getWindowHandle();
		Set<String> allWindows=BrowserDriver.getCurrentDriver().getWindowHandles();
		@SuppressWarnings("unused")
		ArrayList<String> tabs=new ArrayList<>(allWindows);
				
		Login_Search.searchProduct1("ibex Combo Pack of Superhero Thor and Captain Ame");
		ProductSelect.Item1();
		
		ProductSelect.Item2();
		
		
		BrowserDriver.getCurrentDriver().switchTo().window(parent);
		
		Login_Search.searchProduct3("vyas Hand Tool Kit");
		ProductSelect.Item3();
		
		BrowserDriver.getCurrentDriver().switchTo().window(parent);
		
		Login_Search.searchProduct4("Wifton Digital Black Clock");
		ProductSelect.Item4();
		
		ProductSelect.driverchange1();
		AddToCart.AddToCartItem();
		
		ProductSelect.driverchange2();
		AddToCart.AddToCartItem();
		
		ProductSelect.driverchange3();
		AddToCart.AddToCartItem();
		
		ProductSelect.driverchange4();
		AddToCart.AddToCartItem();
		
		
		total.cartprice();
		Thread.sleep(2000);
		
		/*removeCart.Remove_item1();
		Thread.sleep(2000);
		
		removeCart.Remove_item2();
		Thread.sleep(2000);
		
		removeCart.Remove_item3();
		Thread.sleep(2000);
		
		removeCart.Remove_item4();*/
		BrowserDriver.getCurrentDriver().close();
		
	}
}
