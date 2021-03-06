package com.study.myproject;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.study.vo.MemberVO;

//Runner 클래스(테스트 메소드를 실행하는 클래스) 를 SpringJUnit4ClassRunner로 함
@RunWith(SpringJUnit4ClassRunner.class)
//location 속성 경로에 있는 xml 파일을 이용해서 스프링이 로딩됨
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/**/root-context.xml")

public class MyBatisTest {

	@Inject
	private SqlSession sqlSession;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	private static final String namespace = "com.study.mappers.memberMapper";
	
	//SqlSessionFactory 객체를 자동으로 생성
	@Inject
	private SqlSessionFactory sqlFactory;
	
	//SqlSessionFactory 객체가 제대로 만들어졌는지 Test
//	@Test
	public void testFactory() {
		logger.info("testFactory : {}", sqlFactory);
	}
	
	//MyBatis와 Mysql 서버가 제대로 연결되었는지 Test
//	@Test
	public void testSession() throws Exception
	{
		try(SqlSession session = sqlFactory.openSession())
		{
			logger.info("testSession : {}", session);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
//	@Test
	public void insertTest() throws Exception
	{
		MemberVO member = new MemberVO();
		member.setUserId("testuser03");
		member.setUserName("테스트유저3");
		member.setUserPw("3355");
		member.setAuthLevel("1001");
		logger.info("insertTest : {}", sqlSession.insert(namespace + ".insertMember", member));
	}
	
//	@Test
	public void updateTest() throws Exception
	{
		MemberVO member = new MemberVO();
		member.setUserId("testuser03");
		member.setUserName("이름변경");
		logger.info("updateTest : {}", sqlSession.update(namespace + ".updateMemberName", member));
	}
	
	@Test
	public void deleteTest() throws Exception
	{
		String userId = "testuser03";
		logger.info("deleteTest : {}", sqlSession.delete(namespace+ ".deleteMember", userId));
	}
}


















