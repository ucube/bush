package test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ui.ModelMap;
import org.springframework.util.Log4jConfigurer;

import controller.TodoController;

import vo.TodoVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {" classpath:spring/spring-context.xml, classpath:mybatis/mybatis-context.xml "})
public class SpringJunitTest {
	
	@Autowired
	private TodoController todoController;
	
	private TodoVO tv;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		try {
			Log4jConfigurer.initLogging("classpath:config/log4j.properties");
		} catch (Exception e) {
			e.printStackTrace();
		}
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

		}
	}

	@Test
	public void testGetInsert() {
		
		ModelMap model = new ModelMap();
		
		try {
			tv.setTitle("title");
			tv.setContent("content");
			todoController.getInsert(tv, model);
		} catch (Exception e) {

		}
	}

}
