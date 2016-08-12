package com.wisedu.test;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.wisedu.bean.User;
import com.wisedu.util.MyBatisUtil;

/**
 * @author 01212021
 * @time 2016-4-21����04:12:52
 */
public class TestCRUDByXmlMapper {

	/*@Test
	public void testAdd() {
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		String statement = "com.wisedu.mapping.userMapper.addUser";
		User user = new User();
		user.setId(3);
		user.setName("����");
		user.setAge(20);
		int retResult = sqlSession.insert(statement, user);
		sqlSession.close();
		System.out.println(retResult);
	}*/
	/*@Test
	public void testUpdate(){
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		String statement="com.wisedu.mapping.userMapper.updateUser";
		User user=new User();
		user.setId(3);
		user.setName("���Բ���");
		user.setAge(30);
		int retResult=sqlSession.update(statement,user);
		sqlSession.close();
		System.out.println(retResult);
	}*/
	/*@Test
	public void testDelete(){
		SqlSession sqlSession =MyBatisUtil.getSqlSession(true);
		String statement="com.wisedu.mapping.userMapper.deleteUser";
		int retResult=sqlSession .delete(statement,3);
		sqlSession .close();
		System.out.println(retResult);
	}*/
	@Test
	public void testGetAll(){
		SqlSession sqlSession=MyBatisUtil.getSqlSession(true);
		String statement="com.wisedu.mapping.userMapper.getAllUsers";
		List<User> list=sqlSession.selectList(statement);
		sqlSession.close();
		System.out.println(list);
		assertEquals(true,list.toString());
	}
}
