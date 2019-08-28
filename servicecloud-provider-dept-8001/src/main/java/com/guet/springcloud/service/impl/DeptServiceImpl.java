package com.guet.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guet.springcloud.mapper.DeptMapper;
import com.guet.springcloud.pojo.Dept;
import com.guet.springcloud.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptMapper deptMapper;
	
	@Override
	public boolean add(Dept dept) {
		
		return deptMapper.addDept(dept);
	}

	@Override
	public Dept get(Long id) {
		
		return deptMapper.findById(id);
	}

	@Override
	public List<Dept> list() {
		
		return deptMapper.findAll();
	}

}
