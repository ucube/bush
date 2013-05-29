package controller;

import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import service.TodoService;
import vo.TodoVO;

@Controller
public class TodoController {
	
	@Autowired
	private TodoService todoService;

	private Logger logger = Logger.getLogger(this.getClass());
	
	@RequestMapping("/Todo/list")
	public String getTodoList(
			ModelMap model){
		
		//model.addAttribute("listMap", todoService.getList());
		
		ArrayList<TodoVO> arrayList = new ArrayList<TodoVO>();
		arrayList = (ArrayList<TodoVO>) todoService.getList();
		
		String data = "";
		for(TodoVO tv : arrayList){
			data += "NUM=>"+tv.getNum()+" / TITLE=>"+tv.getTitle()+" / CONTENT=>"+tv.getContent()+"<br />";
		}
		logger.info("==>"+data);
		model.put("data", data);
		
		return "Todo/list";
	}
	
	@RequestMapping("/Todo/insert")
	public void getInsert(
			TodoVO tv, 
			ModelMap model){
		logger.info(tv.getTitle());
		logger.info(tv.getContent());
		
	}
}
