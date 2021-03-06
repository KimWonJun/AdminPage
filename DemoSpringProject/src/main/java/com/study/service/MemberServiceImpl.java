package com.study.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.study.dao.MemberDAO;
import com.study.vo.MemberVO;

@Service
public class MemberServiceImpl implements MemberService
{
	@Inject
	private MemberDAO memberDAO;
	
	@Override
	public List<MemberVO> selectMember() throws Exception
	{
		return memberDAO.selectMember();
	}

	@Override
	public int insertMember(MemberVO memberVO) throws Exception 
	{
		return memberDAO.insertMember(memberVO);
	}

	@Override
	public int updateMemberName(MemberVO memberVO) throws Exception 
	{
		return memberDAO.updateMemberName(memberVO);
	}

	@Override
	public int deleteMember(String userId) throws Exception 
	{
		return memberDAO.deleteMember(userId);
	}	
}
