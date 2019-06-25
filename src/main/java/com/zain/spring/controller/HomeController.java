package com.zain.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("home")
	public ModelAndView home(@RequestParam("name") String myName) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", myName);
		mv.setViewName("home");
		System.out.println("Hai " + myName);
		return mv;
	}

//	@RequestMapping("home")
//	public String home(@RequestParam("name") String myName,HttpSession session) {
//		
//		session.setAttribute("name", myName);
//		System.out.println("Hai " + myName);
//		return "home";
//	}

//	@RequestMapping("home")
//	public String home(HttpServletRequest req) {
//		String name = req.getParameter("name");
//		HttpSession session = req.getSession();
//		session.setAttribute("name", name);
//		System.out.println("Hai " + name);
//		return "home";
//	}
}
