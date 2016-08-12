/**
 * 
 */
package com.wisedu.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.wisedu.bean.Order;
import com.wisedu.util.MyBatisUtil;

/**
 * @author 01212021
 * @time 2016-4-21ÏÂÎç07:30:07
 */
public class Test2 {
	/*@Test
	public void testGetOrderById(){
		SqlSession sqlSession=MyBatisUtil.getSqlSession(true);
		String statement="com.wisedu.mapping.orderMapper.getOrderById";
		Order order = sqlSession.selectOne(statement,1);
		sqlSession.close();
		System.out.println(order);
	}*/
	@Test
	public void testSelectOrderResultMap(){
		SqlSession sqlSession=MyBatisUtil.getSqlSession(true);
		String statement="com.wisedu.mapping.orderMapper.selectOrderResultMap";
		Order order = sqlSession.selectOne(statement,1);
		sqlSession.close();
		System.out.println(order);
	}
}
