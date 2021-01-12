package com.time.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
public class DriverFactory {
	public static WebDriver getFirefoxDriver() {
		//获得driver
		//geckodriver在服务器上是必须的，在这里不知道为什么不用也可以
		System.setProperty("webdriver.gecko.driver", "D:\\DownLoadByG\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.firefox.bin", "D:\\Program Files (x86)\\firefox.exe");
		//尝试静默模式
//		FirefoxBinary firefoxBinary = new FirefoxBinary();
//		firefoxBinary.addCommandLineOptions("--headless");
//		FirefoxOptions firefoxOptions = new FirefoxOptions();
//		firefoxOptions.setBinary(firefoxBinary);
//		FirefoxDriver driver = new FirefoxDriver(firefoxOptions);

		//常规模式		
		WebDriver driver=new FirefoxDriver();
		return driver;
	}
	
	public static WebDriver getChromeDriver() {
		System.setProperty("webdriver.chrome.bin", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		System.setProperty("webdriver.chrome.driver","D:\\driver\\phantomjs-2.1.1-windows\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		ChromeDriver driver= new ChromeDriver(options);
		return driver;
//		
//		return new ChromeDriver();
		
	}
	
	public static WebDriver getPhantomJSDriver() {
		System.setProperty("phantomjs.binary.path", "D:\\driver\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		
		System.setProperty("webdriver.ghost.driver","D:\\driver\\ghostdriver-2.1.0\\bin\\ghostdriver");
		PhantomJSDriver driver = new PhantomJSDriver();
		return driver;
	}


}
