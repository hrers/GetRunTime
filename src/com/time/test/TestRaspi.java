package com.time.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.time.utils.DriverFactory;

public class TestRaspi {
public static void main(String[] args) {
	long start = System.currentTimeMillis();
	final DesiredCapabilities desiredCapabilities = new DesiredCapabilities(DesiredCapabilities.chrome());
    Object lock = new Object();
		for (int i = 1; i < 10; i++) {
//			if(i%2==0) {
			try {
				WebDriver driver5 = new RemoteWebDriver(new URL("http://192.168.1.152:4444/wd/hub/"), desiredCapabilities);
				driver5.get("https://www.csdn.net/");
				System.out.println(driver5.getCurrentUrl());
				driver5.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);	
				driver5.findElement(By.id("toolber-keyword")).sendKeys("selenium");
				driver5.findElement(By.className("btn-nobg-noborder")).click();
				System.out.println(driver5.getCurrentUrl());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				WebElement findElement = driver5.findElement(By.tagName("ul"));
				List<WebElement> findElements = findElement.findElements(By.tagName("li"));
				for (WebElement webElement : findElements) {
					System.out.println(webElement.getText());
				}
				driver5.quit();
	
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
						
			
			
			
//		}else {
//			i++;
//			final WebDriver driver1= DriverFactory.getChromeDriver(); 
//			final WebDriver driver2= DriverFactory.getChromeDriver(); 
//			final WebDriver driver3= DriverFactory.getChromeDriver();
//			final WebDriver driver4= DriverFactory.getChromeDriver();
//			new Thread(new Runnable() {
//				public void run() {
//					// TODO Auto-generated method stub
//					driver1.get("https://www.csdn.net/");
//					System.out.println(driver1.getCurrentUrl());
//					driver1.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);	
//					driver1.findElement(By.id("toolber-keyword")).sendKeys("selenium");
//					driver1.findElement(By.className("btn-nobg-noborder")).click();
//					System.out.println(driver1.getCurrentUrl());
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//					WebElement findElement = driver1.findElement(By.tagName("ul"));
//					List<WebElement> findElements = findElement.findElements(By.tagName("li"));
//					for (WebElement webElement : findElements) {
//						System.out.println(webElement.getText());
//					}
//					driver1.quit();
//				}
//			}).start();
//			
//			new Thread(new Runnable() {
//				public void run() {
//					// TODO Auto-generated method stub
//					driver2.get("https://www.csdn.net/");
//					System.out.println(driver2.getCurrentUrl());
//					driver2.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);	
//					driver2.findElement(By.id("toolber-keyword")).sendKeys("selenium");
//					driver2.findElement(By.className("btn-nobg-noborder")).click();
//					System.out.println(driver2.getCurrentUrl());
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//					WebElement findElement = driver2.findElement(By.tagName("ul"));
//					List<WebElement> findElements = findElement.findElements(By.tagName("li"));
//					for (WebElement webElement : findElements) {
//						System.out.println(webElement.getText());
//					}
//					driver2.quit();
//				}
//			}).start();
//			new Thread(new Runnable() {
//				public void run() {
//					// TODO Auto-generated method stub
//					driver3.get("https://www.csdn.net/");
//					System.out.println(driver3.getCurrentUrl());
//					driver3.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);	
//					driver3.findElement(By.id("toolber-keyword")).sendKeys("selenium");
//					driver3.findElement(By.className("btn-nobg-noborder")).click();
//					System.out.println(driver3.getCurrentUrl());
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//					WebElement findElement = driver3.findElement(By.tagName("ul"));
//					List<WebElement> findElements = findElement.findElements(By.tagName("li"));
//					for (WebElement webElement : findElements) {
//						System.out.println(webElement.getText());
//					}
//					driver3.quit();
//				}
//			}).start();
//			new Thread(new Runnable() {
//				public void run() {
//					// TODO Auto-generated method stub
//					driver4.get("https://www.csdn.net/");
//					System.out.println(driver4.getCurrentUrl());
//					driver4.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);	
//					driver4.findElement(By.id("toolber-keyword")).sendKeys("selenium");
//					driver4.findElement(By.className("btn-nobg-noborder")).click();
//					System.out.println(driver4.getCurrentUrl());
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//					WebElement findElement = driver4.findElement(By.tagName("ul"));
//					List<WebElement> findElements = findElement.findElements(By.tagName("li"));
//					for (WebElement webElement : findElements) {
//						System.out.println(webElement.getText());
//					}
//					driver4.quit();
//				}
//			}).start();
//			
//		}
	}
	long end= System.currentTimeMillis();
	System.out.println("Ö´ÐÐÊ±¼ä:"+(end-start));
}
@Test
public void testRamdon() {
	
	for (int i = 0; i < 10; i++) {
		System.out.println(new Random().nextInt(1));
		
	}
}
}
