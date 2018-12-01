package cn.fn.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo_Test {
	
	@RequestMapping("/hello")
	public String getHello() {
		System.out.println("hello");
		return "hello springboot !!!";
	}

}