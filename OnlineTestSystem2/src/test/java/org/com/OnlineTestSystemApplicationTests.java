package org.com;

import org.apache.catalina.User;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class OnlineTestSystemApplicationTests {

	RestTemplate restTemplate;

	@BeforeEach
	public void setUp() {
		restTemplate=new RestTemplate();
	}
	
	

}