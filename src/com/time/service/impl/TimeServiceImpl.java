package com.time.service.impl;

import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.time.dao.UserMapper;
import com.time.pojo.User;
import com.time.pojo.UserExample;
import com.time.pojo.UserExample.Criteria;
import com.time.service.TimeService;
import com.time.utils.DriverFactory;
import com.time.utils.DriverSourceUtils;

@Service
public class TimeServiceImpl implements TimeService{
	
	@Autowired
	private UserMapper userMapper;
	@Override
	public int setTimeDesc(String sno,String password) {
		long start = System.currentTimeMillis();	
		//获得driver
		WebDriver driver=null;
		Random random = new Random();
		int nextInt = random.nextInt(4);
//		if(nextInt==1||nextInt==2||nextInt==3)
				driver= DriverFactory.getFirefoxDriver();
//		else {	//树莓派版
//		DesiredCapabilities desiredCapabilities = new DesiredCapabilities(DesiredCapabilities.chrome());
//		driver = new RemoteWebDriver(new URL("http://10.1.1.63:4444/wd/hub/"), desiredCapabilities);
//		}//设置隐形等待时间	
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		try {
		//获得跑操系统页面上的信息
		driver.get("http://202.199.155.62:8080/mobile/#/");
		driver.findElement(By.xpath("/html/body/div[1]/from/div[3]/div[1]/input")).sendKeys(sno);
		driver.findElement(By.xpath("/html/body/div[1]/from/div[3]/div[2]/input")).sendKeys(password);
		driver.findElement(By.xpath("/html/body/div[1]/from/div[4]/button")).click();
		//设置等待时间
//		Thread.sleep(1000);
		driver.findElement(By.className("mint-toast-icon")).click();
		//扩大窗口
//		driver.manage().window().maximize() ;
		
		String name="";
		String clas="";
		try {
//			Thread.sleep(500);
			name = driver.findElement(By.className("stuName")).getText();
		    clas = driver.findElement(By.className("classes")).getText();
			driver.get("http://202.199.155.62:8080/mobile/#/morning");
//			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
//		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/a[2]/div")).click();
		
		/**
		 * 若是没有开始跑操这里是没有东西的（table)
		 */
//		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		WebElement table = null;
		try {
			 table = driver.findElement(By.tagName("table"));	
		} catch (Exception e) {
			//若是没有数据
		}
		List<WebElement> trs= table.findElements(By.tagName("tr"));
		String text="";
		int index=4;
		int i=0;//用于指示哪个是时间行
		
		for (WebElement tr: trs) {
			//普通行
			if(i++<trs.size()-1) {
			 text += tr.getText()+"<br/>";
			}else {
				//包含时间的特殊行
				List<WebElement> tds= tr.findElements(By.tagName("td"));
				text+=tds.get(0).getText()+"<br/>";
				//第二列包含时间
				List<WebElement> td_divs= tds.get(1).findElements(By.tagName("div"));
				String td_divs_str="";//时间的那一行
				int z=0;
				for (WebElement td_div: td_divs) {
					td_divs_str+="<br/>"+td_div.getText()+"<br/>";
				}
				text+=td_divs_str;
			}
		}
	
		long end = System.currentTimeMillis();	
		System.out.println(start-end);

		//要是成功了
		String id= UUID.randomUUID().toString();	
		User user = new User(id,sno,password,clas,name,1,text);
		int insertSelective = userMapper.insertSelective(user);
		
		
		
		long temp=1000;
		start=System.currentTimeMillis();
				while(System.currentTimeMillis()-start<300000) {
//					System.out.println(System.currentTimeMillis()-start+"   "+temp);
					if(System.currentTimeMillis()-start>temp) {
						
						String timeText = getTimeText(driver);
						UserExample example = new UserExample();
						Criteria criteria = example.createCriteria();
						criteria.andSnoEqualTo(sno);
						criteria.andSnoEqualTo(password);
						user.setTimedesc(timeText);
						int updateByExampleSelective = userMapper.updateByExampleSelective(user, example);
						System.out.println(text);
						temp+=10000;
						try {
							Thread.currentThread().sleep(5000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
							System.out.println("eeeeerror");
						}
						
						
					}
					
				}	
			
		
//		关闭driver
		driver.quit();	
		
		}catch (Exception e) {
			long end = System.currentTimeMillis();	
			System.out.println(start-end);
			driver.quit();
			return 0;
		}
		return 1;
	}

	@Override
	public String getTimeDesc(String xuehao, String password) {
		return null;
	}


	
	String getTimeText(WebDriver driver) {
		WebElement table = null;
		try {
			 table = driver.findElement(By.tagName("table"));	
		} catch (Exception e) {
			//若是没有数据
		}
		List<WebElement> trs= table.findElements(By.tagName("tr"));
		String text="";
		int index=4;
		int i=0;//用于指示哪个是时间行
		
		for (WebElement tr: trs) {
			//普通行
			if(i++<trs.size()-1) {
			 text += tr.getText()+"<br/>";
			}else {
				//包含时间的特殊行
				List<WebElement> tds= tr.findElements(By.tagName("td"));
				text+=tds.get(0).getText()+"<br/>";
				//第二列包含时间
				List<WebElement> td_divs= tds.get(1).findElements(By.tagName("div"));
				String td_divs_str="";//时间的那一行
				int z=0;
				for (WebElement td_div: td_divs) {
					td_divs_str+="<br/>"+td_div.getText()+"<br/>";
				}
				text+=td_divs_str;
			}
		}
		return text;
	}

	@Override
	public String getCurrentRunTime(String sno, String password) {
		long start = System.currentTimeMillis();	
		WebDriver driver = DriverSourceUtils.getDriver();
		//设置隐形等待时间
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		try {
		//获得跑操系统页面上的信息
		driver.get("http://202.199.155.62:8080/mobile/#/");
		driver.findElement(By.xpath("/html/body/div[1]/from/div[3]/div[1]/input")).sendKeys(sno);
		driver.findElement(By.xpath("/html/body/div[1]/from/div[3]/div[2]/input")).sendKeys(password);
		driver.findElement(By.xpath("/html/body/div[1]/from/div[4]/button")).click();
		driver.findElement(By.className("mint-toast-icon")).click();
		//扩大窗口
		String name="";
		String clas="";
			name = driver.findElement(By.className("stuName")).getText();
		    clas = driver.findElement(By.className("classes")).getText();
			driver.get("http://202.199.155.62:8080/mobile/#/morning");
			System.out.println("name"+name+"clas"+clas);
		} catch (Exception e) {
			e.printStackTrace();
		}
		/**
		 * 若是没有开始跑操这里是没有东西的（table)
		 */
		WebElement table = null;
		try {
			 table = driver.findElement(By.tagName("table"));	
		} catch (Exception e) {
			return "error1";
		}
		if(!table.isSelected())
			System.out.println("non table");
		List<WebElement> trs= table.findElements(By.tagName("tr"));
		String text="";
		int index=4;
		int i=0;//用于指示哪个是时间行
		
		for (WebElement tr: trs) {
			//普通行
			if(i++<trs.size()-1) {
			 text += tr.getText()+"<br/>";
			 System.out.println(text+i);
			 System.out.println(i+"i====");
			}else {
				System.out.println("else");
				//包含时间的特殊行
				List<WebElement> tds= tr.findElements(By.tagName("td"));
				text+=tds.get(0).getText()+"<br/>";
				System.out.println(text);
				//第二列包含时间
				List<WebElement> td_divs= tds.get(1).findElements(By.tagName("div"));
				String td_divs_str="";//时间的那一行
				int z=0;
				for (WebElement td_div: td_divs) {
					td_divs_str+="<br/>"+td_div.getText()+"<br/>";
				}
				text+=td_divs_str;
			}
		}
		long end = System.currentTimeMillis();	
		System.out.println(start-end);
		DriverSourceUtils.backDriver(driver);
		return text;
		}
}
