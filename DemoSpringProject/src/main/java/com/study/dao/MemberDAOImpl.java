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
		return memberList;
	}

	@Override
	public int insertMember(MemberVO memberVO) throws Exception 
	{
		logger.info("insertMember");
		int insertNumber = sqlSession.insert(namespace + ".insertMember");
		return insertNumber;
	}


	@Override
	public int updateMemberName(MemberVO memberVO) throws Exception 
	{
		logger.info("updateMemberName");
		int updateNumber = sqlSession.update(namespace + ".updateMemberName");
		return updateNumber;
	}


	@Override
	public int deleteMember(String userId) throws Exception 
	{
		logger.info("deleteMember");
		int deleteNumber = sqlSession.delete(namespace + ".deleteMember");
		return deleteNumber;
	}
	
}
