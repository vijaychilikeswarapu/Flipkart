package com.flipkart.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Utils.BrowserDriver;

public class CartPage {
	WebDriver driver;
	public CartPage(WebDriver driver) {
		this.driver=driver;
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	
	public void cartprice() {
		
		
		String price1=BrowserDriver.getCurrentDriver().findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[1]/span[1]")).getText();
		String cost1 = price1.replaceAll("[^0-9]", "");
		int conclusion1=Integer.valueOf(cost1);

		String price2=BrowserDriver.getCurrentDriver().findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[3]/div/div[1]/div[1]/span[1]")).getText();
		String cost2 = price2.replaceAll("[^0-9]", "");
		int conclusion2=Integer.valueOf(cost2);

		String price3=BrowserDriver.getCurrentDriver().findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[4]/div/div[1]/div[1]/span[1]")).getText();
		String cost3 = price3.replaceAll("[^0-9]", "");
		int conclusion3=Integer.valueOf(cost3);

		String price4=BrowserDriver.getCurrentDriver().findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[5]/div/div[1]/div[1]/span[1]")).getText();
		String cost4 = price4.replaceAll("[^0-9]", "");
		int conclusion4=Integer.valueOf(cost4);
		String price5=BrowserDriver.getCurrentDriver().findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[2]/div[1]/div/div/div/div[3]/span")).getText();
		String cost5 = price5.replaceAll("[^0-9]", "");
		int conclusion5=Integer.valueOf(cost5);
		System.out.println("The cost of first product is "+conclusion1);
		System.out.println("The cost of second product is "+conclusion2);
		System.out.println("The cost of third product is "+conclusion3);
		System.out.println("The cost of fourth product is "+conclusion4);
		System.out.println("The delivery cost of  products is "+conclusion5);
		int Sum=conclusion1+conclusion2+conclusion3+conclusion4+conclusion5;
		
		String Subtotal=""+Sum;
		String finalSum=Subtotal.substring(0,3)+Subtotal.substring(3);
		System.out.println("Subtotal of all products = "+finalSum);
		
		String price6=BrowserDriver.getCurrentDriver().findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[2]/div[1]/div/div/div/div[4]/div/span/div/div/span")).getText();
		String cost6 = price6.replaceAll("[^0-9]", "");
	    int TotalAmount=Integer.valueOf(cost6);
		System.out.println("Total Value of Cart = "+price6);
		
		
		
		
		

		//Assert.assertEquals(finalSum, price5);
		if (Sum==TotalAmount) {
			System.out.println("Given condition passed");
		}else {
			System.out.println("Given condition failed");
		}
		
		
			
			
		}
		
	}
	


	




	