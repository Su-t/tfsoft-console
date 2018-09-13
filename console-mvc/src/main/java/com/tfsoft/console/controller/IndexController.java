package com.tfsoft.console.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/admin")
public class IndexController {

	/**
	 * 进入首页
	 */
	@RequestMapping(value="/toIndex",method=RequestMethod.GET)
	public String toIndex(){
		return "index";
	}
}
