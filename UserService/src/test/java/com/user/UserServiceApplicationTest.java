package com.user;

import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.user.config.UserServiceConfig;

/**
 * @author Prasanth.P
 * Unit test for simple App.
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = UserServiceConfig.class)
@WebAppConfiguration
public class UserServiceApplicationTest {

	@Autowired
	WebApplicationContext wac;

	private MockMvc mockMvc;

	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
	}

	@Test
	public void testRead() throws Exception {
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/");
		MvcResult result =mockMvc.perform(requestBuilder).andDo(MockMvcResultHandlers.print())
	            .andReturn();
		JSONObject jsonObject=new JSONObject(result.getResponse().getContentAsString());
		JSONAssert.assertEquals("{ \"test\": \"test\" }",jsonObject ,true);
	}
}
