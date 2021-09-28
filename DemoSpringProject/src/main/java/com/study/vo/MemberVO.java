package com.study.vo;

import java.time.LocalDateTime;

public class MemberVO 
{
	private int userNo;
	private String userId;
	private String userPw;
	private String userName;
	private String authLevel;
	private String fstRegId;
	private LocalDateTime fstRegDate;
	private String lstUptId;
	private LocalDateTime lstUptDate;
	
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAuthLevel() {
		return authLevel;
	}
	public void setAuthLevel(String authLevel) {
		this.authLevel = authLevel;
	}
	public String getFstRegId() {
		return fstRegId;
	}
	public void setFstRegId(String fstRegId) {
		this.fstRegId = fstRegId;
	}
	public LocalDateTime getFstRegDate() {
		return fstRegDate;
	}
	public void setFstRegDate(LocalDateTime fstRegDate) {
		this.fstRegDate = fstRegDate;
	}
	public String getLstUptId() {
		return lstUptId;
	}
	public void setLstUptId(String lstUptId) {
		this.lstUptId = lstUptId;
	}
	public LocalDateTime getLstUptDate() {
		return lstUptDate;
	}
	public void setLstUptDate(LocalDateTime lstUptDate) {
		this.lstUptDate = lstUptDate;
	}
	
	
}
