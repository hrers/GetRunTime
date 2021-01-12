package com.time.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserUIController {
	
	@RequestMapping(value="/")
	public String test() {
		return "index";
	}	
}
