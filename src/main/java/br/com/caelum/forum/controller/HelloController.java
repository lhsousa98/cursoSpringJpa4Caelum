package br.com.caelum.forum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	// Mapeamento do diretorio
	@RequestMapping("/")
	@ResponseBody
	public String hello() {
		return "Hello World!";
	}

}
