package com.time.utils;

import java.util.LinkedList;

import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Service;

@Service
public class DriverSource {
	
//1.创建一个容器用于存储driver对象
	final static LinkedList<WebDriver> pool= new LinkedList<WebDriver>();
//，创建7个driver放入容器中,静态方法表示只有一个,只执行一次
	static {
		for (int i = 0; i <3; i++) {
			WebDriver driver= DriverFactory.getFirefoxDriver();
			//2放入池子
			pool.add(driver);
		}
	}
	/**
	 * 获取driver
	 */
	public WebDriver getDriver() {
		WebDriver driver=null;
		//3使用前先判断
//		if(pool.size()==0) {
//			//4.池子里面没有我们在创建一些
//			for (int i = 0; i <7; i++) {
//				driver=DriverFactory.getFirefoxDriver();
//				pool.add(driver);
//			}
//		}
		if(pool.size()==0) {
			return null;
		}
		//5从池子里面获取一个Driver对象
		driver=pool.remove(0);
//		driver= pool.pop();
		System.out.println("当前池子还有"+pool.size());
		return driver;
	}
	/**
	 * 归还driver
	 */
	public void backDriver(WebDriver driver) {
		pool.add(driver);
		System.out.println("当前池子还有"+pool.size());
	}
}
