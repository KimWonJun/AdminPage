package com.study.dao;

import java.util.List;

import com.study.vo.MemberVO;

public interface MemberDAO 
{
	public List<MemberVO> selectMember() throws Exception;
	
	public int insertMember(MemberVO memberVO) throws Exception;
	
	public int updateMemberName(MemberVO memberVO) throws Exception;
	
	public int deleteMember(String userId) throws Exception;
}
