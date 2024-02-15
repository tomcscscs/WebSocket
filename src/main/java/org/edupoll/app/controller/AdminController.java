package org.edupoll.app.controller;

import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin")
public class AdminController {

	private final SimpMessagingTemplate messagingTemplate;
	
	@GetMapping("/add-event")
	public String proceedAddEvent() {
		
		messagingTemplate.convertAndSend("/common", "addEvent");
		return "admin/addEvent-success";
	}
}
