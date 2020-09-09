package com.example.demo.dao;

import com.example.demo.entity.TestTableEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestTableDao {
	TestTableEntity getByID(Integer id);
}
