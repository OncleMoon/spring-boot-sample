package com.hongbo.springboot.example.hello.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by LiHongBo on 2017/6/21.
 */
@RestController
public class HelloController {
	@RequestMapping("/hello")
	public String index() {
		return "Hello World";
	}
}
