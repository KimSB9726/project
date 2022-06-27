package com.itwillbs.init;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class MybatisConnectTest {
	
	// DataSource ��ü
	@Inject
	private DataSource dataSource;
	
	// SqlSessionFactory ��ü
	@Inject
	private SqlSessionFactory sqlSessionFactory;
	
	
	private static final Logger log = LoggerFactory.getLogger(MybatisConnectTest.class);
	
	@Test 
	public void ���̹�Ƽ��_����_�׽�Ʈ() {
		log.info("@@@@@@@@@@@@@@@sqlSessionFactory : " + sqlSessionFactory);
		log.info("@@@@@@@@@@@@@@@dataSource : " + dataSource);
	}
	
	@Test
	public void ���̹�Ƽ��_����_üũ() {
		
		// SqlSession : sql ������ ����� �� �ִ� ��ü
		SqlSession session = sqlSessionFactory.openSession();

		log.info("@@@@@@@@@@@@@@@session :" + session);
	}

}
