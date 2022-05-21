package com.jbk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //opening a browser	
		driver.manage().window().maximize();  //maximize the browser window
		driver.get("file:///D:/Offline%20Website/index.html"); //opening an URL/ web site/application
		
		WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		email.sendKeys("kiran@gmail.com");
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		password.sendKeys("123456");	
		WebElement signin  = driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button"));
		signin.click();
		
		WebElement users = driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a/span"));
		users.click();	
		
	//	displayUserTable();
		System.out.println("User Table Details are as follows : ");
		for (int i = 2;  i<=5;  i++) 
		{
			for (int j = 2;  j<=8;  j++)
			{
			WebElement userlist = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr["+ i +"]/td[" + j + "]"));
			System.out.print(" " + userlist.getText());
			}
			System.out.println();
		}
			
		System.out.println("----------------------------------------------------------------------------------------------------");
		
		WebElement operators = driver.findElement(By.xpath("/html/body/div/aside[1]/section/ul/li[4]/a"));
		operators.click();	
			
		System.out.println("Operators Table Details are as follows : ");
		for (int i = 2;  i<=6;  i++) 
		{
			for (int j = 2;  j<=6;  j++)
			{
			WebElement operatorslist = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[" + i + "]/td[" + j + "]"));
			System.out.print(" " + operatorslist.getText());
			}
			System.out.println();
		}
		
		System.out.println("----------------------------------------------------------------------------------------------------");
		WebElement usefullinks = driver.findElement(By.xpath("/html/body/div/aside[1]/section/ul/li[5]/a/span"));
		usefullinks.click();
		
		System.out.println("Useful Links Table Details are as follows : ");
		for(int i = 2; i<= 7 ; i++)
		{
			for(int j = 1; j<=2; j++)
			{
				
				WebElement usefullinklist= driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[" + i + "]/td[ " + j + "]"));
				System.out.print(" " + usefullinklist.getText());		
			}
			System.out.println();
		}
		
		System.out.println("----------------------------------------------------------------------------------------------------");
		WebElement downloads = driver.findElement(By.xpath("/html/body/div/aside[1]/section/ul/li[6]/a"));
		downloads.click();
		
		System.out.println("Download Table Details are as follows : ");
		for(int i = 2; i<= 8 ; i++)
		{
			for(int j = 1; j<=7; j++)
			{
				
				WebElement downloadlist= driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[" + i + "]/td[ " + j + "]"));			
				System.out.print(" " + downloadlist.getText());		
			}
			System.out.println();
		}
		
		WebElement dashboardlink = driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[2]/a"));
		dashboardlink.click();
		
		System.out.println("Below are the courses offered : ");
		WebElement courses = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[1]/div/div[1]"));
		System.out.println(" " + courses.getText());
		
	//	WebElement moreinfolink = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[1]/div/a"));
	//	moreinfolink.click();
		
	//	WebElement logoutlink = driver.findElement(By.xpath("/html/body/div/header/nav/div/ul/li/a"));
	//	logoutlink.click();
		
	//	WebElement logout = driver.findElement(By.xpath("/html/body/div/header/nav/div/ul/li/a"));
	//	logout.click(); 
		
		WebElement user = driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a/span"));
		user.click();	
		
		WebElement addnewuser = driver.findElement(By.xpath("	/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button"));
		addnewuser.click(); 
	
		
		} 	
}
