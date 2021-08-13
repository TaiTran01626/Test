package com.ringle.ringring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ringle.ringring.entity.DemoEntity;
import com.ringle.ringring.model.LoginReq;
import com.ringle.ringring.service.DemoService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/main")
public class MainController {
	private final Logger log = LoggerFactory.getLogger(MainController.class);
	@Autowired
	DemoService demoService;

	@GetMapping("/add")
	public void addDemo() {
		DemoEntity demoEntity = new DemoEntity();
		demoEntity.setId(1);
		demoEntity.setName("tai");
		demoService.saveDemo(demoEntity);
	}

	@GetMapping("/test")
	public String test() {
		return "tesst ok";
	}

	@PostMapping("/login")
	public ResponseEntity<LoginReq> login(@Validated @RequestBody LoginReq loginReq) {
		ResponseEntity<LoginReq> response = ResponseEntity.ok().body(loginReq);
		log.info("loginReq login: {}", loginReq);
		log.info("response login: {}", response);
		return response;
	}

}
