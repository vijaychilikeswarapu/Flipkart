package com.flipkart.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RemoveCartItems {

	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div[2]/div[2]")
	WebElement remove1;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div[2]/div[2]")
	WebElement remove2;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div[2]/div[2]")
	
	WebElement remove3;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div[2]/div[2]")

	WebElement remove4;
	
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[1]/div/div[3]/div/div[2]")
	WebElement DialogRemove;
	
	public RemoveCartItems Remove_item1() {
		
		remove1.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DialogRemove.click();
		
		return this;
	}
	
public RemoveCartItems Remove_item2() {
		
		remove2.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DialogRemove.click();
		return this;
	}
	


public RemoveCartItems Remove_item3() {
	
	remove3.click();
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	DialogRemove.click();
	return this;
}

public RemoveCartItems Remove_item4() {
	
	remove4.click();
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	DialogRemove.click();
	return this;
}


}
