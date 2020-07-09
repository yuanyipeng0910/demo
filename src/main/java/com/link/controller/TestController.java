package com.link.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;

@RestController
public class TestController {
	@Autowired
	private MongoTemplate mongoTemplate;

	@RequestMapping("/query")
	public List<JSONObject> query() {
		List<JSONObject> list = mongoTemplate.find(new Query(), JSONObject.class,"api_sid_detail");
		return list;
	}
}
