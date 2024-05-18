package web;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstClass {
	
	public static void main(String[] args) {
		
		
		//WebDriver driver = new ChromeDriver();n
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://courses.rahulshettyacademy.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		
		//locators
		
		
		
		//
		//driver.close();
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.className("theme-btn")));
		
		driver.findElement(By.className("theme-btn")).click();
		
	}

}
