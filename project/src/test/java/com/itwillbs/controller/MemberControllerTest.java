package com.itwillbs.controller;

import javax.inject.Inject;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class MemberControllerTest {
	
	@Inject
	private WebApplicationContext wac;
	
	private MockMvc mockMvc;
	
	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}
	
	// ���⼭ ���� ������ ���� ���·� �׽�Ʈ �����ϸ� ��.
	// 	@Test
	//	public void ��Ʈ�ѷ�_�׽�Ʈ() throws Exception{
	//		log.info("��Ʈ�ѷ� �׽�Ʈ ����");
	//		
	//		// ��Ʈ�ѷ����� /doA �ּ� ȣ��
	//		mockMvc.perform(MockMvcRequestBuilders.get("/doD"));
	//		// mockMvc.perform(MockMvcRequestBuilders.post("/doD")); post�� ����
	//
	//	}

}
