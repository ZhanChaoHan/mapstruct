package com.jachs.mapstruct.otn;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.time.DateFormatUtils;

import com.google.gson.Gson;
import com.jachs.mapstruct.otn.domain.User;
import com.jachs.mapstruct.otn.domain.Person;
import com.jachs.mapstruct.otn.mapper.PersonConverter;
import com.jachs.mapstruct.otn.model.PersonDTO;

/***
 * 
 * @author zhanchaohan
 *
 */
public class Test1 {
	static Gson gson=new Gson();
	
	public static void main(String[] args) {
		Person person = new Person(1L,"ccc","zz.ee@cvf.com",new Date(),new User(1));
        PersonDTO personDTO = PersonConverter.INSTANCE.domain2dto(person);
        
        System.out.println(personDTO.getId()+"\t"+person.getId());
        System.out.println(personDTO.getName()+"\t"+person.getName());
        System.out.println(personDTO.getBirth()+"\t"+person.getBirthday());
        String format = DateFormatUtils.format(personDTO.getBirth(), "yyyy-MM-dd HH:mm:ss");
        
        System.out.println(personDTO.getBirthDateFormat()+"\t"+format);
        System.out.println(personDTO.getBirthExpressionFormat()+"\t"+format);

        List<Person> people = new ArrayList<>();
        people.add(person);
        List<PersonDTO> personDTOs = PersonConverter.INSTANCE.domain2dto(people);
	}
}
