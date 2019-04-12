package com.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	@RequestMapping(value="/")
	public ModelAndView welcome()
	{
		return new  ModelAndView("welcome");
		
	}
	
	@RequestMapping(value="/loginpage",method=RequestMethod.GET)
	public ModelAndView login(@RequestParam(value="error" ,required=false) String error,@RequestParam(value="logout" ,required=false) String logout)
	{
		ModelAndView modelAndView=new ModelAndView();
		if(error!=null)
		{
			modelAndView.addObject("error","Invalid credentials");
			modelAndView.addObject("loginpage");
			return modelAndView;
		}
		else if(logout!=null)
		{
			modelAndView.addObject("message","logged out successfully");
			modelAndView.addObject("loginpage");
			return modelAndView;
		}else if(error==null&& logout==null)
		{
			return new  ModelAndView("loginpage");
		}
		
		
		return new  ModelAndView("success");
		
	}
	@RequestMapping(value="/success",method=RequestMethod.GET)
	public ModelAndView success()
	{
		return new  ModelAndView("success");
		
	}

}
