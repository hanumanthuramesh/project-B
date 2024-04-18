package demosite;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Droupdownlist {

	public static void main(String[] args) throws InterruptedException {
		//Step1: Setup for Open GoogleChrome Browser/Driver
		 System.setProperty("webdriver.chrome.Driver","C:\\Users\\USER\\Downloads\\Tools\\updated tools file\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\\" );
		//object  creation for web driver or  Chrome driver in local declaration                                      
		//if we use testNG or methods  we have to declaration in Global	
			ChromeDriver driver= new ChromeDriver();	
			//Step2:Maximize Browser
			driver.manage().window().maximize();
			//Step3:Enter Valid URL
			driver.get("https://demo.automationtesting.in/Register.html");
			//Step4:Find the element and give send keys  by locater
			driver.findElement(By.xpath("//input [@placeholder=\"First Name\"]")).sendKeys("hanumanthu");
			driver.findElement(By.xpath("//input [@placeholder=\"Last Name\"]")).sendKeys("Ramesh");
			driver.findElement(By.xpath("//textarea[@rows=\"3\"]")).sendKeys("hi nanna");
			driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("hanu@122");
			driver.findElement(By.xpath("//input[@type=\"tel\"]")).sendKeys("99638345");
			driver.findElement(By.name("radiooptions")).click();
			Thread.sleep(3000);
			JavascriptExecutor scroll=(JavascriptExecutor)driver;
		    scroll.executeScript("window.scrollBy(0,400)", "");
		  Select skill= new Select (driver.findElement(By.xpath("//select[@id=\"Skills\"]")));
		  skill .selectByVisibleText("Analytics");
		  
		  Thread.sleep(3000);
		  driver.close();
		 	
	}
	// covered thinks are x- path,name and  droup selecter by selectByVisibleText
}
	

	


