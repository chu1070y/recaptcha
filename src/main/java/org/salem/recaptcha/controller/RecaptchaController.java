package org.salem.recaptcha.controller;

import org.salem.recaptcha.dto.RecaptchaDTO;
import org.salem.recaptcha.service.RecaptchaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/robot")
public class RecaptchaController {
	
	@Autowired
	private RecaptchaService recaptchaService;

	@GetMapping("/test")
	public String test() {
		
		return "recaptcha";
	}
	
	@PostMapping("/token")
	public @ResponseBody RecaptchaDTO token(@RequestParam("token") String token) {
		System.out.println(token);
		
		return recaptchaService.token(token);
	}

}
