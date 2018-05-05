package com.zhongd.eureka_client;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.context.WebApplicationContext;

import java.util.HashMap;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = EurekaClientApplication.class, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@EnableAutoConfiguration
public class EurekaClientApplicationTests {

	@Autowired
	private WebApplicationContext context;
	private MockMvc mvc;
	@Before
	public void setup() {
		mvc = MockMvcBuilders.standaloneSetup(context).build();
	}
	@Test
	public void contextLoads() throws Exception{
		LinkedMultiValueMap map = new LinkedMultiValueMap<String, Object>();
		map.add("who", "123");
		map.add("where", "123");
		map.add("when", "qq1");

		MvcResult result = this.mvc.perform(post("/eclient/client/demo")
				.characterEncoding("UTF-8")
				.header("Content-Type", "application/json")
				.params(map))
				.andReturn();
		System.out.println(result);
	}

}
