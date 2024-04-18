package demosite;

import org.openqa.selenium.chrome.ChromeDriver;

public class Titleverification {

	public static void main(String[] args) throws InterruptedException {
		// step1:To open and  set up google chrome driver
				System.setProperty("webdriver.chrome.Driver", "C:\\Users\\USER\\Downloads\\ools\\updated tools file\\hromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				//step2:Object creation for chrome driver and local variable declaration
				//if we use testNG or methods  we have to declaration in Global
				ChromeDriver driver=new ChromeDriver();
				//step3: To maximize the window 
				driver.manage().window().maximize();
				//step4:Get the URL
				driver.get("https://in.indeed.com/");
				//driver.get("https://github.com/hanumanthuramesh");
				
				//  # method -1 Title verification page
				
		        String expectedTitle = "Job Search India | Indeed";
		        System.out.println("expectedTitle = " +expectedTitle  );
		        String title = driver.getTitle();
		        System.out.println("actualTitle  = " + title);
		        
		        if (title.equalsIgnoreCase(expectedTitle)) {
		            System.out.println("Title Matched");
		        } else {
		            System.out.println(" Title Not a match");
		        }
		        
		        Thread.sleep(3000);
		        
		        
		        driver.close();
		       
		       
		      //    # method -2 Title verification page  
				/*String actualTitle1 =driver.getTitle();
				System.out.println("ActualTitle ="  +  actualTitle1);
				String expectedTitle1 = "Job Search India | Indeed";
				System.out.println("ExpectedTitle = "  +expectedTitle1  );
				
				if (actualTitle1.equalsIgnoreCase(expectedTitle)) {
		            System.out.println("Title Matched");
		        } else {
		            System.out.println(" Title Not a match");
		        }     */
				
			    
				
		}
		//we are not used in selenium  instead assertion we we are used in  System.out.println("expectedTitle = " +expectedTitle  ); print statements
		// coverd thinks are  Title verification page

	

}
