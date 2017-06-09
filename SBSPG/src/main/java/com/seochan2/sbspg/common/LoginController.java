package com.seochan2.sbspg.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}

}
