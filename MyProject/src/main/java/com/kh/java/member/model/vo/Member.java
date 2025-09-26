package com.kh.java.member.model.vo;

import java.sql.Date;
import java.util.Objects;

public class Member {
	private long userNo;
	private String userId;
	private String userPwd;
	private String userName;
	private String Email;
	private String location;
	private Date enrollDate;
	private Date modifyDate;
	private String status;
	
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Member(long userNo, String userId, String userPwd, String userName, String email, String location,
			Date enrollDate, Date modifyDate, String status) {
		super();
		this.userNo = userNo;
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.Email = email;
		this.location = location;
		this.enrollDate = enrollDate;
		this.modifyDate = modifyDate;
		this.status = status;
	}

	public long getUserNo() {
		return userNo;
	}

	public void setUserNo(long userNo) {
		this.userNo = userNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getEnrollDate() {
		return enrollDate;
	}

	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Member [userNo=" + userNo + ", userId=" + userId + ", userPwd=" + userPwd + ", userName=" + userName
				+ ", Email=" + Email + ", location=" + location + ", enrollDate=" + enrollDate + ", modifyDate="
				+ modifyDate + ", status=" + status + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Email, enrollDate, location, modifyDate, status, userId, userName, userNo, userPwd);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return Objects.equals(Email, other.Email) && Objects.equals(enrollDate, other.enrollDate)
				&& Objects.equals(location, other.location) && Objects.equals(modifyDate, other.modifyDate)
				&& Objects.equals(status, other.status) && Objects.equals(userId, other.userId)
				&& Objects.equals(userName, other.userName) && userNo == other.userNo
				&& Objects.equals(userPwd, other.userPwd);
	}
	
	
	
}
