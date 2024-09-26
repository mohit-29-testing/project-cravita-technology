package Test.Cravitatesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class script {
	
	
@Test
void setup()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\AL FARES\\automation testing\\Cravitatesting\\Resources\\chromedriver.exe");
	 ChromeDriver driver= new ChromeDriver();
	 
	 driver.get("https://cravitaindia.com/");
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 driver.findElement(By.xpath("//a[@href='about-us.html']")).click();
	 driver.findElement(By.xpath("//a[@href='services.html']")).click();
	 driver.findElement(By.xpath("//a[@href='ourwork.html']")).click();
	 driver.findElement(By.xpath("//a[@href='team.html']")).click();
	 driver.findElement(By.xpath("//a[@href='career.html']")).click();
	 driver.findElement(By.xpath("//img[@src='images/click-here.gif']")).click();
	 driver.findElement(By.xpath("//input[@id='name']")).sendKeys("mohit dhake");
	 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mohitdhake97@gmail.com");
	 driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9511205583");
	 driver.findElement(By.xpath("//select[@id='Qualification']")).click();
	 driver.findElement(By.xpath("//option[@value='BCA/BSc ( CS/IT)']")).click();
	 driver.findElement(By.xpath("//select[@id='Qualification']")).click();
	 driver.findElement(By.xpath("//a[@href='about-us.html']")).click();
	 driver.findElement(By.xpath("//a[@href='career.html']")).click();
	 driver.findElement(By.id("stream")).click();
  }
	 
}

