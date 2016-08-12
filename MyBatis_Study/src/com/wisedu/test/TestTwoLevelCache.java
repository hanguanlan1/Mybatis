/**
 * 
 */
package com.wisedu.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.wisedu.bean.User;
import com.wisedu.util.MyBatisUtil;

/**
 * @author 01212021
 * @time 2016-4-22����02:32:56
 */
public class TestTwoLevelCache {
	@Test
	public void testCache2() {
		String statement = "com.wisedu.mapping.userMapper.getUser";
		SqlSessionFactory factory = MyBatisUtil.getSqlSessionFactory();
		SqlSession sqlSession1=factory.openSession(true);
		SqlSession sqlSession2=factory.openSession(true);
		//ʹ�ö�������ʱ��User�����ʵ��һ��Serializable�ӿ�===> User implements Serializable
		User user = sqlSession1.selectOne(statement, 1);
		System.out.println("user111111111="+user);
		sqlSession1.commit();
		User user2 = sqlSession2.selectOne(statement, 1);
		System.out.println("user2="+user2);
	}
}
