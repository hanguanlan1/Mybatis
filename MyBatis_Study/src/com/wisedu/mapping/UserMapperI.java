package com.wisedu.mapping;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.wisedu.bean.User;

/**
 * @author 01212021
 * @time 2016-4-21下午05:09:54
 */
public interface UserMapperI {
	//使用@Insert注解指明add方法要执行的SQL
	@Insert("insert into users(id,name,age) values(#{id},#{name},#{age})")
	public int add(User user);
	
	//使用@Delete注解指明deleteById方法要执行的SQL
	@Delete("delete from users where id=#{id}")
	public int deleteById(int id);
	
	@Update("update users set age=#{age},name=#{name} where id=#{id}")
	public int update(User user);
	
	@Select("select * from users where id=#{id}")
	public User selectOne(int id);
	
	@Select("select * from users")
	public List<User> selectAll();
}
