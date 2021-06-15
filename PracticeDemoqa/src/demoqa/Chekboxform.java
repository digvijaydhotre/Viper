package demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chekboxform {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","E:\\Jar Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		  Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='avatar mx-auto white'])[2]")).click();
		
		System.out.println("Page open Successfully");
		  Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='header-wrapper']")).click();
		System.out.println("Elemnet page Successfully");
		  Thread.sleep(2000);
		//----------------------------------------------	 checkbox form----------------------------------------------
		driver.findElement(By.xpath("(//span[@class='text'])[2]")).click();
		  Thread.sleep(2000);// checkbox
		driver.findElement(By.xpath("//button[@aria-label='Toggle']")).click();
		  Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/span/button/svg/path")).click();
		 
		
		System.out.println("Form submitted Successfully");
	}

}
