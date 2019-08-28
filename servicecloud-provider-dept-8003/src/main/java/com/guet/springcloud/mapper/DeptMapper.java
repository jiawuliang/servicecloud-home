package com.guet.springcloud.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.guet.springcloud.pojo.Dept;

// springboot与mybatis整合，需要加@Mapper注解 
@Mapper
public interface DeptMapper {

	public boolean addDept(Dept dept);

	public Dept findById(Long id);

	public List<Dept> findAll();
	
}
