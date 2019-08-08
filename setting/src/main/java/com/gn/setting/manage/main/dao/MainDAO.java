package com.gn.setting.manage.main.dao;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @Class MainDAO.java
 *	@Description MainDAO
 * <pre>
 *
 *      수정일                  수정자                   수정내용
 * --------------  -------     ---------------------
 *  2019. 8. 8.          hgb             최초작성
 *
 * </pre>
 * @author hgb
 * @version 0.0  
 * @see
 *
 */
@Repository("mainDAO")
public class MainDAO {

	private final String NAMESPACE = "testMapper";
	
	@Autowired(required=true)
	private SqlSession sqlSession;
	
	public String test(){
		String str = sqlSession.selectOne(NAMESPACE + ".test");
		return str;
	}
}
