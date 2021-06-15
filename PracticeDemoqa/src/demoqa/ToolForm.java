package demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ToolForm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","E:\\Jar Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		  Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='avatar mx-auto white'])[2]")).click();
		
		System.out.println("Page open Successfully");
		
		driver.findElement(By.xpath("//div[@class='header-wrapper']")).click();
		System.out.println("Elemnet page Successfully");
		
	//--------------------------------------------------	 text-box form----------------------------------------------
		driver.findElement(By.xpath("//span[@class='text']")).click();  // text-box form
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("TEST Digvijay");
		driver.findElement(By.id("userEmail")).sendKeys("TEST.Digvijay@gmail.com"); // userEmail
		driver.findElement(By.id("currentAddress")).sendKeys("MUMBAI");   //currentAddress
		driver.findElement(By.id("permanentAddress")).sendKeys("MUMBAI NARIMAN POINT"); // permanent Address
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		System.out.println("Form submitted Successfully");
		
		//----
		
		
	}
	
	

}
