package com.example.restfulwebservice;
//lombok 사용

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data// get,set,기본생성자,toString() 생성
@AllArgsConstructor //모든 인스턴트 필드를 매개변수로 갖는 생성자를 생성
@NoArgsConstructor//
public class HelloWorldBean {
	private String message;
	
}



