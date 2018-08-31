package com.java.springcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstPage {

	@RequestMapping("/welcome")
	public ModelAndView testerMethod()
	{
		 ModelAndView app = new ModelAndView("Test");
		 app.addObject("msg","mvc test page");
		 return app;
	}
}
