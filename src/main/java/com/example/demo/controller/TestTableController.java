package com.example.demo.controller;


import com.example.demo.entity.TestTableEntity;
import com.example.demo.service.TestTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testTableController/test")
public class TestTableController {

	@Autowired
	private TestTableService testTableService;

	@RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
	public TestTableEntity test(@PathVariable Integer id) {

		return testTableService.getByID(id);
	}
}
