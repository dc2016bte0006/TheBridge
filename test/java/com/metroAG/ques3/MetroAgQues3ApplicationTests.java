package com.metroAG.ques3;

import com.metroAG.ques3.entities.User;
import com.metroAG.ques3.repo.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;

import java.util.List;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class MetroAgQues3ApplicationTests {
	@Autowired
	UserDao udao;
	@Test
	void contextLoads() {
	}

	@Test
	public void getUsers(){
		List list = udao.findAll();
		assertThat(list).size().isGreaterThan(0);
	}

	@Test
	public void getUser(){
		User u = udao.findById(111).get();
		assertEquals("Aditya",u.getFirstName());
	}

	@Test
	public void addUser(){
		User u = new User();
		u.setId(113);
		u.setFirstName("MS");
		u.setLastName("Dhoni");
		u.setEmail("msd@csk.com");
		udao.save(u);
		assertNotNull(udao.findById(113).get());
	}

	@Test
	public void sortUser(){
		List list = udao.findAll(Sort.by("email").ascending());
		assertThat(list).size().isGreaterThan(0);
	}
}
