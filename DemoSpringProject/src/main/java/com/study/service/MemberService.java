package com.study.service;

import java.util.List;

import com.study.vo.MemberVO;

public interface MemberService 
{
	public List<MemberVO> selectMember() throws Exception;
	
	public int insertMember(MemberVO memberVO) throws Exception;
	
	public int updateMemberName(MemberVO memberVO) throws Exception;
	
	public int deleteMember(String userId) throws Exception;
}
