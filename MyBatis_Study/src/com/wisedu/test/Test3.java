/**
 * 
 */
package com.wisedu.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.wisedu.bean.Class;
import com.wisedu.util.MyBatisUtil;

/**
 * @author 01212021
 * @time 2016-4-22ÉÏÎç09:54:38
 */
public class Test3 {
	/*@Test
	public void testGetClass() {
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		String statement = "com.wisedu.mapping.classMapper.getClass";
		Class clazz = sqlSession.selectOne(statement, 1);
		sqlSession.close();
		System.out.println("1111111"+clazz);
	}
	@Test
	public void testGetClass2() {
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		String statement = "com.wisedu.mapping.classMapper.getClass2";
		Class clazz = sqlSession.selectOne(statement, 1);
		sqlSession.close();
		System.out.println("222222"+clazz);
	}*/
	/*@Test
	public void testGetClass3(){
		SqlSession sqlSession=MyBatisUtil.getSqlSession(true);
		String statement="com.wisedu.mapping.classMapper.getClass3";
		Class clazz = sqlSession.selectOne(statement,1);
		sqlSession.close();
		System.out.println("222222"+clazz);
	}*/
	@Test
	public void testGetClass3(){
		SqlSession sqlSession=MyBatisUtil.getSqlSession(true);
		String statement="com.wisedu.mapping.classMapper.getClass4";
		Class clazz = sqlSession.selectOne(statement,1);
		sqlSession.close();
		System.out.println(clazz);
	}
}
