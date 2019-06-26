package com.zain.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.zain.spring.dao.UserRepo;
import com.zain.spring.model.User;

@Controller
public class HomeController {
	
	@Autowired
	UserRepo repo;

	@RequestMapping("home")
	public ModelAndView home(User user) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("user", user);
		mv.setViewName("home");
//		System.out.println("Hai " + myName);
		return mv;
	}

	@RequestMapping("/adduser")
	public String addUser(User user) {
		repo.save(user);
		return "home";

	}

//	public ModelAndView home(@RequestParam("name") String myName) {
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("name", myName);
//		mv.setViewName("home");
//		System.out.println("Hai " + myName);
//		return mv;
//	}

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
