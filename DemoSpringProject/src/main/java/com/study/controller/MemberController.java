package com.study.controller;

import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.study.myproject.HomeController;
import com.study.service.MemberService;
import com.study.vo.MemberVO;

@Controller
public class MemberController 
{
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Inject
	private MemberService service;
	
	@RequestMapping(value="getMemberList", method=RequestMethod.GET)
	public String getMember(Locale locale, Model model) throws Exception
	{
		logger.info("member");
		
		List<MemberVO> memberList = service.selectMember();
		
		model.addAttribute("memberList", memberList);
		
		return "member";
	}
}