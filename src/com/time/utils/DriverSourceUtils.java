package com.time.utils;

import org.openqa.selenium.WebDriver;

public class DriverSourceUtils {
private static DriverSource driverSouce=new DriverSource();

public static DriverSource getDriverSource() {
	return driverSouce;
}

public static WebDriver getDriver() {
	return driverSouce.getDriver();
}
public static void backDriver(WebDriver driver) {
	driverSouce.backDriver(driver);
}
}
