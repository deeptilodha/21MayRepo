package com.jbk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Offline%20Website/pages/examples/users.html#");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[3]/td[8]/a/span")).click();
		//after clicking on 2nd delete button, we get two alerts. We need to perform some operation to handle both the alerts.
		String alertmsg1 = driver.switchTo().alert().getText();
		System.out.println(alertmsg1);
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		String alertmsg2 = driver.switchTo().alert().getText();
		System.out.println(alertmsg2);
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/ul/li/a")).click();
		driver.close();
	}

}
