package com.example.demo.service;

import com.example.demo.dao.TestTableDao;
import com.example.demo.entity.TestTableEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestTableService {

	@Autowired
	private TestTableDao testTableDao;

	public TestTableEntity getByID(Integer id){
		return testTableDao.getByID(id);
	}
}
