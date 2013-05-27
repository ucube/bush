package controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import service.TodoService;

@Controller
public class TodoController {
	
	@Autowired
	private TodoService todoService;

	private Logger logger = Logger.getLogger(this.getClass());
	
	@RequestMapping("/Todo/list")
	public String getTodoList(
			ModelMap model
			){
		
		String message = "haha";
		model.put("message", message);
		model.addAttribute("listMap", todoService.getList());
		
		logger.info("===================="+message);
		
		return "Todo/list";
	}
	
}
