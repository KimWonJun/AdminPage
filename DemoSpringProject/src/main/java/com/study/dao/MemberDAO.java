package com.study.dao;

import java.util.List;

import com.study.vo.MemberVO;

public interface MemberDAO 
{
	public List<MemberVO> selectMember() throws Exception;
}
