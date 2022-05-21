package com.jbk;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksDemo2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Offline%20Website/index.html");
		String linkname = driver.findElement(By.tagName("a")).getText();
		System.out.println(linkname);
		
		driver.findElement(By.partialLinkText("Register a new")).click();
		
		String boldlink = driver.findElement(By.tagName("b")).getText();
		System.out.println(boldlink);
		
		List<WebElement> allLinks =  driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		
		for (WebElement webElement : allLinks) {
			System.out.println(webElement.getText());
		}
		
		driver.quit();
	}
	

}
