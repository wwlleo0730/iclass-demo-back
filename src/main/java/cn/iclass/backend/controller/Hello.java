package cn.iclass.backend.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.iclass.backend.service.PersonSay;

@RestController
public class Hello {
	
	@Resource
	private PersonSay say;
	
	@RequestMapping({"/say","hello"})
	public String hello(){
		return say.say();
	}
	
	
	
}

