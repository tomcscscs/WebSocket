package org.edupoll.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class WelcomeController {

	
	@GetMapping({"/", "/index"})
	public String showIndex() {
		return "index";
	}
	
}
