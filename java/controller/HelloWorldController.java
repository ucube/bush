package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloWorldController {

	//private Logger logger = Logger.getLogger(getClass());
	
	@RequestMapping("/hello")
	public ModelAndView helloWorld(){
	
		ModelAndView mav = new ModelAndView();
		String message = "Hello World!!";
		
		mav.setViewName("hello");
		mav.addObject("message", message);
		
		return mav;
	}
	
	@RequestMapping("/search")
	public String search(HttpServletRequest request, HttpServletResponse response){
		
		String keyword = request.getParameter("keyword");
		
		//logger.info(keyword);
		
		return keyword;
	}
	
}
