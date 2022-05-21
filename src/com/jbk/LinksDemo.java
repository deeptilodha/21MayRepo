package com.jbk;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Offline%20Website/pages/examples/dashboard.html");
		//driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[1]/div/a")).click();
		//	There are different ways to locate links other than xpath. As follows - 
		//driver.findElement(By.linkText("More info")).click();
		
		List<WebElement> allLinks =  driver.findElements(By.tagName("a"));
		System.out.println("Total no of links present are : " + allLinks.size());
		
		List<WebElement> moreinfoLinks =  driver.findElements(By.linkText("More info"));
		System.out.println("Total no of More Info links present are : " + moreinfoLinks.size());
		
		for (WebElement links : moreinfoLinks) {
			
			links.click();
		}
		
		Set<String>  windows = driver.getWindowHandles();
		System.out.println("Total Number of Windows/ Tabs opened are : " + windows.size());
		
		driver.quit();
	}

}
