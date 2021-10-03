package com.study.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.study.myproject.HomeController;
import com.study.vo.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO
{
	@Inject
	private SqlSession sqlSession;

	private static final String namespace = "com.study.mappers.memberMapper";
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	@Override
	public List<MemberVO> selectMember() throws Exception 
	{
		logger.info("selectMember");
		List<MemberVO> memberList = sqlSession.selectList(namespace + ".selectMember");
		logger.info("list {}", memberList);
		return memberList;
	}
	
}
