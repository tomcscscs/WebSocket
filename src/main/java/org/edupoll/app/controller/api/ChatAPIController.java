package org.edupoll.app.controller.api;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import org.edupoll.app.command.AddMessage;
import org.edupoll.app.entity.Message;
import org.edupoll.app.repository.MessageRepository;
import org.edupoll.app.repository.RoomRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/chat/api")
@RequiredArgsConstructor
public class ChatAPIController {

	private final MessageRepository messageRepository;
	private final RoomRepository roomRepository;

	@PostMapping("/{roomId}")
	public Map<?, ?> handleAddMessage(@PathVariable String roomId, AddMessage cmd) {

		Message entity = Message.builder()//
				.room(roomRepository.findById(roomId).get())//
				.body(cmd.getBody())//
				.createdAt(LocalDateTime.now())//
				.build();
		messageRepository.save(entity);
		var map = new LinkedHashMap<>();
		map.put("result", true);
		return map;
	}

}
