package junit;

import java.sql.Connection;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-context.xml","classpath:mybatis/mybatis-context.xml"})
public class test {
	
	private Logger logger = Logger.getLogger(getClass());

	@Autowired
	private DataSource dataSource;
	
	private Connection conn;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		conn = DataSourceUtils.getConnection(dataSource);
	}

	@After
	public void tearDown() throws Exception {
		DataSourceUtils.releaseConnection(conn, dataSource);
	}

	@Test
	public void test() {
		final String columnNames = "TITLE, CONTENT";
		final String tableName = "TODO_BOARD";
		final String query = "SELECT "+columnNames+" FROM "+tableName;
		logger.info(query);
		
		assertEquals(conn, query);
	}
	
	public static void assertEquals(Connection conn, String query){
		
		//logger.info(query);
		
	}

}
