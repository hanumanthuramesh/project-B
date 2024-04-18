package demosite;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) throws IOException {
		// step1:To open and  set up google chrome driver
		System.setProperty("webdriver.chrome.Driver", "C:\\Users\\USER\\Downloads\\Tools\\updated tools file\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\\");
		//step2:Object creation for chrome driver and local variable declaration
		//if we use testNG or methods  we have to declaration in Global
		ChromeDriver driver=new ChromeDriver();
		//step3: To maximize the window 
		driver.manage().window().maximize();
		//step4:Get the URL
		driver.get("https://monkeylearn.com/word-cloud");
		// step5:upload resume through Apachi po Tool
		driver.findElement(By.className("Form-page-header-label")).click();
		//# scroll down syntax
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,400)", "");
Runtime.getRuntime().exec("C:\\Users\\USER\\Downloads\\Tools\\Autoit-v3-setup\\autoA.exe");
						
			
}
// // covered thinks are File uploaded  through Apachi po Tool and scroll down added
}



