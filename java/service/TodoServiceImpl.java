package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.TodoDAO;

@Service
public class TodoServiceImpl implements TodoService{
	
	@Autowired
	private TodoDAO todoDAO;
	
	@Override
	public List getList() {
		
		List list = todoDAO.getList();
		
		return list;
	}

}
