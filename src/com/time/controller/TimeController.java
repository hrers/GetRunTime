package com.time.controller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.time.service.TimeService;
import com.time.utils.DriverFactory;
import com.time.utils.DriverSourceUtils;

@Controller
public class TimeController {
	
	@Autowired
	private TimeService timeService;
	/**
	 * 该功能未经测试
	 * @param sno
	 * @param password
	 * @return
	 */
	@RequestMapping(value="/seeTime" )
	public String seeTime(String sno,String password) {
		
		int setTimeDesc = timeService.setTimeDesc(sno, password);
		if(setTimeDesc!=0)
			return "index";
		else
			return "index";
		
	}	
	
	@RequestMapping(value="/getCurrentRunTime",produces = "text/json;charset=UTF-8")
	@ResponseBody
	public String getCurrentRunTime(String sno,String password) {
		if(sno!=null&&password!=null) {
			String currentRunTime = timeService.getCurrentRunTime(sno,password);
			if(currentRunTime=="error1")
				return "<h1 style=\"color:red\">估计你今天还没有开始跑操,或者一个点都还没有刷上</h1>";
			else
				return currentRunTime;
		}
		return "账号或密码错误";
	}
	
	
	
	
	@RequestMapping("/test")
	public void test() {
		WebDriver driver = DriverSourceUtils.getDriver();
		if(driver==null) {
			System.out.println( "当前节点处理服务已满，请左滑重试");
			return ;}
		driver.get("http://time.tianqi.com/");
		final long start = System.currentTimeMillis();
		System.out.println(driver.getTitle());
			long temp=1000;
				while(System.currentTimeMillis()-start<60000) {
//					System.out.println(System.currentTimeMillis()-start+"   "+temp);
					if(System.currentTimeMillis()-start>temp) {
						String text = driver.findElement(By.id("times")).getText();
						System.out.println(text);
						temp+=10000;
						try {
							Thread.currentThread().sleep(5000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}	
		
				DriverSourceUtils.backDriver(driver);
	}
}
