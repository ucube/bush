package dao;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class TodoDAOImpl extends SqlSessionDaoSupport implements TodoDAO{


	@Override
	public List getList() {
		
		List list = getSqlSession().selectList("TodoBoard.selectTB");
		return list;
	}

}
