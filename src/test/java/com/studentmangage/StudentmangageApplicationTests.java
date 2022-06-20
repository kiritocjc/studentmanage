package com.studentmangage;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.studentmangage.mapper.UserMapper;

@SpringBootTest
class StudentmangageApplicationTests {

	
	@Autowired
	private UserMapper userMapper;
	
	@Test
	void contextLoads() {
		
	}

}
