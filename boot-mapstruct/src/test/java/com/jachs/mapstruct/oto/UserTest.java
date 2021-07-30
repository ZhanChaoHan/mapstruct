package com.jachs.mapstruct.oto;

import java.util.Date;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.google.gson.Gson;
import com.jachs.mapstruct.oto.domain.User;
import com.jachs.mapstruct.oto.mapper.UserMapper;

/***
 * 
 * @author zhanchaohan
 *
 */
@SpringBootTest
public class UserTest {
	@Autowired
	private UserMapper userMapper;
	
	Gson gson=new Gson();
	static User user;
	
	@BeforeAll
	public static void init() {
		user=new User("user", 12, new Date(), "juich@mkc.com", "pwd123456");
		
		User us=new User().builder()
				.userName("licsa").userAge(15)
				.createTime(new Date())
				.eMail("cmkci@kcl.com")
				.passWorld("pwd124563").build();
	}
	
	@Test
	public void test1() {
		System.out.println(gson.toJson(userMapper.sourceToTarget(user)));
	}
}
