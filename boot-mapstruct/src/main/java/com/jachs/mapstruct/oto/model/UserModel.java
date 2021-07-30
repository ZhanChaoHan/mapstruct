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
}
