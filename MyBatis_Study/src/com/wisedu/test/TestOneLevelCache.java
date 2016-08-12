/**
 * 
 */
package com.wisedu.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.wisedu.bean.User;
import com.wisedu.util.MyBatisUtil;

/**
 * @author 01212021
 * @time 2016-4-22����01:48:11
 */
public class TestOneLevelCache {
	@Test
	public void testCache1() {
		SqlSession session = MyBatisUtil.getSqlSession();
		String statement = "com.wisedu.mapping.userMapper.getUser";
		User user = session.selectOne(statement, 1);
		System.out.println("111111" + user);
		/*
		 * һ������Ĭ�Ͼͻᱻʹ��
		 */
		user = session.selectOne(statement, 1);
		System.out.println("222222" + user);
		session.close();

		/*
		 * 1. ������ͬһ��Session,���session�����Ѿ�close()���˾Ͳ���������
		 */
		session = MyBatisUtil.getSqlSession();
		user = session.selectOne(statement, 1);
		System.out.println("33333" + user);

		/*
		 * 2. ��ѯ������һ����
		 */
		user = session.selectOne(statement, 2);
		System.out.println(user);
		/*
		 * 3. û��ִ�й�session.clearCache()������
		 */
		session.clearCache();
		user = session.selectOne(statement, 2);
		System.out.println("clearCache" + user);
		/*
		 * 4. û��ִ�й���ɾ�ĵĲ���(��Щ��������������)
		 */
		User newuser = new User();
		newuser.setId(3);
		newuser.setName("����");
		newuser.setAge(20);
		session.update("com.wisedu.mapping.userMapper.updateUser", newuser);
		user = session.selectOne(statement, 2);
		System.out.println(user);
	}
}
