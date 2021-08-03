package com.jachs.mapstruct.oto.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/***
 * 
 * @author zhanchaohan
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {
	private String userName;
	private int userAge;
	
	private Date createTime;

//	public UserModel() {
//		super();
//	}
//
//	public UserModel(String userName, int userAge, Date createTime) {
//		super();
//		this.userName = userName;
//		this.userAge = userAge;
//		this.createTime = createTime;
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
	
	
}
