package com.jachs.mapstruct.oto.domain;


import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author zhanchaohan
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
	private String userName;
	private int userAge;
	private Date createTime;
	private String eMail;
	private String passWorld;
	
//	public User() {
//		super();
//	}
//
//	public User(String userName, int userAge, Date createTime, String eMail, String passWorld) {
//		super();
//		this.userName = userName;
//		this.userAge = userAge;
//		this.createTime = createTime;
//		this.eMail = eMail;
//		this.passWorld = passWorld;
//	}
//
//	public String getUserName() {
//		return userName;
//	}
//
//	public void setUserName(String userName) {
//		this.userName = userName;
//	}
//
//	public int getUserAge() {
//		return userAge;
//	}
//
//	public void setUserAge(int userAge) {
//		this.userAge = userAge;
//	}
//
//	public Date getCreateTime() {
//		return createTime;
//	}
//
//	public void setCreateTime(Date createTime) {
//		this.createTime = createTime;
//	}
//
//	public String geteMail() {
//		return eMail;
//	}
//
//	public void seteMail(String eMail) {
//		this.eMail = eMail;
//	}
//
//	public String getPassWorld() {
//		return passWorld;
//	}
//
//	public void setPassWorld(String passWorld) {
//		this.passWorld = passWorld;
//	}
	
}
