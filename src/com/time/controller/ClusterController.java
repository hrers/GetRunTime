package com.time.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.apache.catalina.Cluster;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ClusterController {

/**
 * 使用多台计算机作为服务集群
 * 随机跳转
 * @return 
 */
	@Value("${cluster.size}")
	private static String clusterSize;
	@Value("${cluster.url1}")
	private String clusterUrl1;
	@Value("${cluster.url2}")
	private String clusterUrl2;
	
	
	@RequestMapping(value="/allot")
	public String allot(Model model,HttpSession session,String sno,String password) {
	/*
	 * 
	 * 待解决：
	 * 1.记录各个节点当前的请求数，避免负载过大
	 * 2.使用post提交	不显示 参数
	 */
	
		boolean again=true;
		int server = 0;
		HashMap<Integer, Integer> map ;
		if(session.getAttribute("countMap")==null) {
			map = new HashMap<Integer, Integer>();
			session.setAttribute("countMap",map);
		}else {
			map= (HashMap) session.getAttribute("countMap");
		}
		int randomEnd=1;
		while(again) {//如果随机到某个服务器的数量超过20，重新随机
			if(randomEnd++==10)//若是所有的都满了就死循环了
				break;
			Random random = new Random();
//			server = random.nextInt(Integer.parseInt(clusterSize));
			server = random.nextInt(3);
			if(map.get(server)==null)
				map.put(server,1);
			else {
				System.out.println("key:"+server+"value"+map.get(server));
				if(map.get(server)>20)
					again=true;
				else
					map.put(server, map.get(server)+1);
			}
		}
		System.out.println(map.size());
		model.addAttribute("sno",sno);
		model.addAttribute("password",password);
		switch (server) {
		case 0:
//			return "redirect:"+clusterUrl1+"getCurrentRunTime";
//		case 1:
//			return "redirect:"+clusterUrl2;
//		case 2:
			return "redirect:/getCurrentRunTime";
		default:
			break;
		}
		return "index";
	}
}
