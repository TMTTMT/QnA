package com.java.QnA.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/")
	public String index() {
		return "index";
	}
	@RequestMapping(value = "/result")
	public String result() {
		return "result";
	}
	
//	@RequestMapping(value = "/submit", method = RequestMethod.POST, headers = {"content-type=application/json"})
//    @ResponseBody
//    public String result() {
//		return "result";
//	}
	
	
}
