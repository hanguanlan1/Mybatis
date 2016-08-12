package com.wisedu.test;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.wisedu.bean.User;

/**
 * @author 01212021
 * @time 2016-4-21ÏÂÎç04:12:58
 */
public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String resource = "conf.xml";
		InputStream is = Test1.class.getClassLoader().getResourceAsStream(
				resource);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder()
				.build(is);
		SqlSession session = sessionFactory.openSession();
		String statement = "com.wisedu.mapping.userMapper.getUser";
		User user = session.selectOne(statement, 2);
		System.out.println(user);
	}

}
