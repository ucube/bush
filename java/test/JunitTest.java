package test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;

import vo.TodoVO;
import controller.TodoController;

public class JunitTest {

	@Autowired
	private TodoController todoController;
	
	private TodoVO tv;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetTodoList() {
		
		ModelMap model = new ModelMap();
		
		try {
			todoController.getTodoList(model);
		} catch (Exception e) {
			//e.printStackTrace();
		}
	}
	
	@Test
	public void testGetTodoInsert(){
		ModelMap model = new ModelMap();
		
		try {
			tv.setTitle("title");
			tv.setContent("content");
			todoController.getInsert(tv, model);
		} catch (Exception e) {
			//e.printStackTrace();
		}
	}

}
