package com.example.demo.smoke;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.service.NoteService;

@SpringBootTest
public class SmokeTest {
	
	@Autowired
	public NoteService noteService;
	
	@Test
	public void noteServiceSmokeTest() {
		assertThat(this.noteService).isNotNull();
	}
}
