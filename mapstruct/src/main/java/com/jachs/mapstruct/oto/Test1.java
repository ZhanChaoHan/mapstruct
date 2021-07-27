package com.jachs.mapstruct.oto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.time.DateFormatUtils;

import com.google.gson.Gson;
import com.jachs.mapstruct.oto.domain.Person;
import com.jachs.mapstruct.oto.mapper.PersonConverter;
import com.jachs.mapstruct.oto.model.PersonDTO;

/***
 * 
 * @author zhanchaohan
 *
 */
public class Test1 {
	static Gson gson=new Gson();
	
	public static void main(String[] args) {
		Person person=new Person(6L, "cccccc", "lcij52@kl.com", new Date());
		
		PersonDTO personDTO=PersonConverter.INSTANCE.domain2dto(person);
		
		System.out.println(gson.toJson(personDTO));
	}
}
