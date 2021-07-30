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
	
}
