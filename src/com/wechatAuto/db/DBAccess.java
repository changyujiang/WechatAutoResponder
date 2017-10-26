package com.wechatAuto.db;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


/**
 * access database
 */
public class DBAccess {
	public SqlSession getSqlSession() throws IOException {
		// Get database connection information from configuration file
		Reader reader = Resources.getResourceAsReader("com/wechatAuto/config/Configuration.xml");
		// build sqlSessionFactory according to configuration file
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		// open a sqlSession with sqlSessionFactory
		SqlSession sqlSession = sqlSessionFactory.openSession();
		return sqlSession;
	}
}
