package insuremeseleniumproject;

import java.io.File;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import io.github.bonigarcia.wdm.WebDriverManager;

  public class TestNGScreenshot{
      @Test
      public static void main(String[] args) throws InterruptedException, IOException {
       WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();
       System.setProperty("webdriver.chrome.driver","//home//ubuntu//chromedriver-linux64//chromedriver");
       //driver.manage().window().maximize();
       
 ChromeOptions chromeOptions = new ChromeOptions();
 chromeOptions.addArguments("--headless");
 chromeOptions.addArguments("--no-sandbox");
 chromeOptions.addArguments("--disable-dev-shm-usage"); 
 
  driver.get("http://65.0.19.184:8084/contact.html");

   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

   driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Rahul Kumar");
   driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9711739492");
   driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("rahulpatna89@gmail.com");
   driver.findElement(By.xpath("//textarea[@placeholder='Message']")).sendKeys("Hi Finance Me , Please call me back");
   driver.findElement(By.className("send_bt")).click();

String message = driver.findElement(By.id("message")).getText();
if(message.equals("Email Sent")) {
	TakesScreenshot scrShot = ((TakesScreenshot)driver);
       File screenShot = scrShot.getScreenshotAs(OutputType.FILE);
       File destFile = new File ("//home/ubuntu//scr.png");
        FileUtils.copyFile(screenShot, destFile); 
	System.out.println("Screenshot taken Successfully");
} else 
{
	System.out.println("Taking Screenshot gets failed");
}

try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.quit();
	}
}

//code for window jar 

/*package insuremeseleniumproject;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

// public class insureMe2{

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","//home//ubuntu//chromedriver-linux64//chromedriver");
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("http://44.203.183.210:8082/contact.html");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement name= driver.findElement(By.xpath("//input[@placeholder='Your Name']"));
		name.sendKeys("Rahul Kumar");
		
		
		WebElement phone= driver.findElement(By.xpath("//input[@placeholder='Phone Number']"));
		phone.sendKeys("9711739492");
		
		WebElement email= driver.findElement(By.xpath("//input[@placeholder='Email']"));
		email.sendKeys("rahulpatna89@gmail.com");
		
		WebElement messagebox= driver.findElement(By.xpath("//input[@placeholder='Message']"));
		messagebox.sendKeys("Hi InsureMe , call please");
		
		driver.findElement(By.className("btn_box")).click();
		
		String message = driver.findElement(By.id("message")).getText();
		if(message.equals("Email sent.")) {
			System.out.println("Script Executed Successfully");
		} else 
		{
			System.out.println("Script Failed");
		}
		
		TakesScreenshot scrShot = ((TakesScreenshot)driver);
		File screenShot = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File ("//home/ubuntu//scr.png");
		FileUtils.copyFile(screenShot, destFile);
		
		Thread.sleep(3000);
		
		driver.quit();	
	}
}


*/


//code for ubuntu jar 

/* package insuremeseleniumproject;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class insureMe {

	public static void main(String[] args) throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver","G:\\chrome-driver\\chromedriver.exe");
		 
		System.setProperty("webdriver.chrome.driver","//home//ubuntu//chromedriver-linux64//chromedriver");
		//System.setProperty("webdriver.chrome.driver","/var/lib/jenkins/chromedriver");
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--headless");
		chromeOptions.addArguments("--no-sandbox");
		chromeOptions.addArguments("--disable-dev-shm-usage");
		
		
		WebDriver driver = new ChromeDriver(chromeOptions);
		//driver.get("http://localhost:8081/contact.html");
		driver.get("http://13.233.138.147:8084/contact.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("inputName")).sendKeys("Rahul Kumar");
		driver.findElement(By.id("inputNumber")).sendKeys("9711739491");
		driver.findElement(By.id("inputMail")).sendKeys("rahulpatna89@gmail.com");
		driver.findElement(By.id("inputMessage")).sendKeys("Hello Insurer");
		driver.findElement(By.id("my-button")).click();
		
		String message = driver.findElement(By.id("response")).getText();
		if(message.equals("Message Sent")) {
			System.out.println("Script Executed Successfully");
		} else 
		{
			System.out.println("Script Failed");
		}
		//take Screenshot of the result
		TakesScreenshot scrShot = ((TakesScreenshot)driver);
		File screenShot = scrShot.getScreenshotAs(OutputType.FILE);
		//File destFile = new File ("C:\\chromedriver\\test-reports\\scr.png");
		File destFile = new File ("//home/ubuntu//scr.png");
		//File destFile = new File ("//var/lib/jenkins//scr.png");
		//File destFile = new File ("./scr.png");
		FileUtils.copyFile(screenShot, destFile);
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}
} */
