package com.example.restfulwebservice;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
	}//레스트 컨트롤러를 사용하면 반환 되는 값이 스트링 값이 아니고 객체, 배열 등등의 참조형이라도
	 //자동으로 JSON형태로 반환된다. XML값으로 반환 시키고 싶다면 XML라이브러리를 추가하면 된다.
	
	@GetMapping(path= "/hello-world-bean/path-variable/{name}") 
	public HelloWorldBean helloWorldBean(@PathVariable String name) {
		 return helloWorldBean(String.format("Hello Wolrd" , name));  //String.format(1.표현하고자하는 문자, 2.가변데이터(변수))
		 
	}
	
	
	
	
	
	
}
