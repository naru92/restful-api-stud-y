package com.example.restfulwebservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	//GET
	// TARGET URI : /hello-world (endpoint)
	
	//요즘은 처리방식 (get,post.. 등등을 지정하는 매핑이 선호됨)
	
	//첫번째 테스트
	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
	//두번째 테스트
	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello-World");
	}
}
