package com.flipkart.pageobject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class HomePage {
static WebDriver driver;
	@FindBy(xpath = "//a[contains(text(),'Login')]")
	WebElement AccountLink;
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")
	WebElement name;
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")
	WebElement Password;
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button/span")
	WebElement SigninInputButton;
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")
	WebElement SearchBar;
	public void click_accountlink() {
		// TODO Auto-generated method stub
		AccountLink.click();
	}
	public void insertName(String un) {
		// TODO Auto-generated method stub
		name.sendKeys(un);
	}
	public void insertpassword(String pw) {
		// TODO Auto-generated method stub
		Password.sendKeys(pw);
	}
	public void click_on_signin() {
		// TODO Auto-generated method stub
		SigninInputButton.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public ProductSelection searchProduct1(String un1) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SearchBar.clear();
		SearchBar.sendKeys(un1,Keys.ENTER);
	return PageFactory.initElements(driver, ProductSelection.class);
	}
	/*public ProductSelection searchProduct2(String un2) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SearchBar.clear();
		SearchBar.sendKeys(un2,Keys.ENTER);
	return PageFactory.initElements(driver, ProductSelection.class);
	}*/
	
	public ProductSelection searchProduct3(String un3) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SearchBar.clear();
		SearchBar.sendKeys(un3,Keys.ENTER);
	return PageFactory.initElements(driver, ProductSelection.class);
}
	public ProductSelection searchProduct4(String un4) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SearchBar.clear();
		SearchBar.sendKeys(un4,Keys.ENTER);
	return PageFactory.initElements(driver, ProductSelection.class);
}
	
}