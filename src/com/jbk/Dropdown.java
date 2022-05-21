package com.jbk;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Offline%20Website/index.html"); 
		WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		email.sendKeys("kiran@gmail.com");
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		password.sendKeys("123456");	
		WebElement signin  = driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button"));
		signin.click();
		
		WebElement users = driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a/span"));
		users.click();	
		
		WebElement   adduser = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button"));
		adduser.click();

		WebElement element= driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select"));
		
		Select se = new Select(element);
		se.selectByIndex(2);
		se.selectByValue("HP");
		se.selectByVisibleText("Punjab");
		
		//se.selectByIndex(-2);    It gives No such Element Present error at runtime.
		
		List<WebElement> listele = se.getOptions();
		System.out.println(listele.size());
		
		for (WebElement webElement : listele) 
		{
			System.out.println(webElement.getText());
		}

	}

}
