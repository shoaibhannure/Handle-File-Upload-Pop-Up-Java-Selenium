package com.shoaib.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleFileUploadPopUp {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://html.com/input-type-file/");
		
		driver.findElement(By.xpath("//input[@name='fileupload']")).sendKeys("C:\\Users\\SHOAIB HANNURE\\Desktop\\Git Commands.txt");
	}

}
