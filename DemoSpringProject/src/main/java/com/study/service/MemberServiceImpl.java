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
	
}