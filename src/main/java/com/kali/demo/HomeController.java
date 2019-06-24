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
	public ModelAndView home( @RequestParam("name") String name, @RequestParam("email") String email)
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", name);
		mv.addObject("email", email);
		mv.setViewName("home");
		return mv;
	}
	
}
