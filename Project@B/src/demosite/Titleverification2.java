package demosite;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Titleverification2 {

	public static void main(String[] args) throws InterruptedException {
		// step1:To open and  set up google chrome driver
				System.setProperty("webdriver.chrome.Driver", "C:\\Users\\USER\\Downloads\\ools\\updated tools file\\hromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				//step2:Object creation for chrome driver and local variable declaration
				//if we use testNG or methods  we have to declaration in Global
				ChromeDriver driver=new ChromeDriver();
				//step3: To maximize the window 
				driver.manage().window().maximize();
				//step4:Get the URL
				//# if given github url result is  title is not matches
				//driver.get("https://github.com/hanumanthuramesh");
				driver.get("https://demo.automationtesting.in/Register.html");
				//driver.findElement(By.xpath("//textarea[@rows=\"3\"]")).sendKeys("Hanuman");
				
				//Title verification page
				 System.out.println(driver.getTitle());
			        String expectedTitle = "Register";  
			        String title = driver.getTitle();
			if (title.equalsIgnoreCase(expectedTitle)) {
				driver.findElement(By.xpath("//textarea[@rows=\"3\"]")).sendKeys("Hanuman");
			            System.out.println("Title is Matched");
			            
			        } else {
			            System.out.println("Title Not a match");
			        }

			
		Thread.sleep(3000);
			driver.close();

			}
			// covered thinks are  Title verification page Reslut is  Title is Matched  and X path element  used
		}
	




