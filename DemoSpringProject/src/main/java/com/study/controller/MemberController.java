package com.study.controller;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.study.encrypt.Encrypt;
import com.study.myproject.HomeController;
import com.study.service.MemberService;
import com.study.vo.MemberVO;

import net.sf.json.JSONArray;

@Controller
public class MemberController 
{
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Inject
	private MemberService service;
	
	@RequestMapping(value="/members/list", method=RequestMethod.GET)
	public ResponseEntity<List<MemberVO>> getMember() throws Exception
	{
		logger.info("member");
		
		List<MemberVO> memberList = service.selectMember();
		
		JSONArray result = JSONArray.fromObject(memberList);
		System.out.println("jsonResult : " + result);
		
		HttpHeaders responseHeaders = new HttpHeaders(); 
		responseHeaders.add("Content-Type", "application/json; charset=UTF-8");
		
		return new ResponseEntity<>(memberList, HttpStatus.OK);
	}
	
	@RequestMapping(value="/members", method=RequestMethod.POST)
	public ResponseEntity<Void> registerMember(@RequestBody MemberVO member) throws Exception
	{
		logger.info("add Member");
		logger.info("id : {}", member.getUserId());
		logger.info("pw : {}", member.getUserPw());
		logger.info("name : {}", member.getUserName());
		logger.info("authlevel : {}", member.getAuthLevel());
		
		Encrypt encrypt = new Encrypt();
		String encryptedPwd = encrypt.encryptSHA256(member.getUserPw());
		
		member.setUserPw(encryptedPwd);
		service.insertMember(member);		
		
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@RequestMapping(value="members", method=RequestMethod.PUT)
	public ResponseEntity<Void> updateMemberName() throws Exception
	{
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@RequestMapping(value="member/{userId}", method=RequestMethod.DELETE)
	public ResponseEntity<Void> deleteMember(@PathVariable String userId) throws Exception
	{
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}
