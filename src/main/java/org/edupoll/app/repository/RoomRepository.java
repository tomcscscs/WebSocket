package org.edupoll.app.repository;

import org.edupoll.app.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, String> {
	
	
}
