insert into room (id, title)
	values 
		('a2cfd5a7-f001-412d-85d1-79ac23d3e614', '핫하다 클린스만!'),
		('20ba2a42-3d13-4a76-8693-7e3679590ef2', '정신좀 차리게 해주실분 구함');
		
insert into message (id,  room_id, body, created_at) 
	values
		(9001, 
				'20ba2a42-3d13-4a76-8693-7e3679590ef2', '저 좀 도와주세요', current_timestamp() ),
		(9002, 
				'20ba2a42-3d13-4a76-8693-7e3679590ef2', '무슨일인데요?', current_timestamp() ),
		(9003, 
				'20ba2a42-3d13-4a76-8693-7e3679590ef2', 'ㅜㅜ', current_timestamp() );
				