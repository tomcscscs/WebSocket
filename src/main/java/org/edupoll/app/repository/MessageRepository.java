package org.edupoll.app.repository;

import java.util.List;

import org.edupoll.app.entity.Message;
import org.edupoll.app.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
	public List<Message> findByRoomOrderByCreatedAtAsc(Room rooom);
}
