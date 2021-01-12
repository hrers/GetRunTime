package com.time.service;

import com.time.pojo.User;

public interface TimeService {
	//实时刷新操作     获取跑操信息记录数据库
	int setTimeDesc(String sno,String password);
	//实时刷新操作   从数据中获得跑操信息
	String getTimeDesc(String sno,String password);
	//直接返回结果操作 返回跑操信息
	String getCurrentRunTime(String sno,String password);
}
