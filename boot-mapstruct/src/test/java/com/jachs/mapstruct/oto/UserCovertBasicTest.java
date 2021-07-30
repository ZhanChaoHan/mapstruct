package com.jachs.mapstruct.oto;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.google.gson.Gson;
import com.jachs.mapstruct.oto.domain.User;
import com.jachs.mapstruct.oto.mapper.UserCovertBasic;
import com.jachs.mapstruct.oto.model.UserModel;

/***
 * 
 * @author zhanchaohan
 *
 */
@SpringBootTest
public class UserCovertBasicTest {
	@Autowired
	private UserCovertBasic userCovertBasic;
	
	Gson gson=new Gson();
	
	@Test
	public void test1() {
		User user=new User().builder()
				.createTime(new Date())
				.eMail("bcuaug@oci.com")
				.passWorld("pwdcicyv")
				.userAge(20)
				.userName("cmv")
				.build();
		UserModel um=userCovertBasic.INSTANCE.uMtoU(user);
		
		System.out.println(gson.toJson(um));
	}
}
