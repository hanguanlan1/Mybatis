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
 * @time 2016-4-22下午01:48:11
 */
public class TestOneLevelCache {
	@Test
	public void testCache1() {
		SqlSession session = MyBatisUtil.getSqlSession();
		String statement = "com.wisedu.mapping.userMapper.getUser";
		User user = session.selectOne(statement, 1);
		System.out.println("111111" + user);
		/*
		 * 一级缓存默认就会被使用
		 */
		user = session.selectOne(statement, 1);
		System.out.println("222222" + user);
		session.close();

		/*
		 * 1. 必须是同一个Session,如果session对象已经close()过了就不可能用了
		 */
		session = MyBatisUtil.getSqlSession();
		user = session.selectOne(statement, 1);
		System.out.println("33333" + user);

		/*
		 * 2. 查询条件是一样的
		 */
		user = session.selectOne(statement, 2);
		System.out.println(user);
		/*
		 * 3. 没有执行过session.clearCache()清理缓存
		 */
		session.clearCache();
		user = session.selectOne(statement, 2);
		System.out.println("clearCache" + user);
		/*
		 * 4. 没有执行过增删改的操作(这些操作都会清理缓存)
		 */
		User newuser = new User();
		newuser.setId(3);
		newuser.setName("测试");
		newuser.setAge(20);
		session.update("com.wisedu.mapping.userMapper.updateUser", newuser);
		user = session.selectOne(statement, 2);
		System.out.println(user);
	}
}
