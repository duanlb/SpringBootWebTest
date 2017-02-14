package com.base.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *@author duanlb
 *@date 2017��2��10�� ����2:50:29
 *
**/
@Controller
@RequestMapping(value={"/test"})
public class HelloController {

	@RequestMapping("/web.do")
	@ResponseBody
	public Map test(){
		Map map = new HashMap();
		map.put("name","����");
		return map;
	}
	
	@RequestMapping("/show.do")
	public String showWelCome(){
		return "welcome";
	}
}
