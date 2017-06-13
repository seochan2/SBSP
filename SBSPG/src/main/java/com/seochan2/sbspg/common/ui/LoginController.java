package com.seochan2.sbspg.common.ui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}

}
