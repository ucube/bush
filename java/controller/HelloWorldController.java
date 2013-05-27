package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloWorldController {

	
	@RequestMapping("/hello")
	public ModelAndView helloWorld(){
	
		ModelAndView mav = new ModelAndView();
		String message = "Hello World!!";
		
		mav.setViewName("hello");
		mav.addObject("message", message);
		
		return mav;
	}
	
}
