package com.kali.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("home")
	public ModelAndView home( Developer dev)
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj", dev);
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("contact")
	public String contact() {
		return "contact";
		
	}
	
}
