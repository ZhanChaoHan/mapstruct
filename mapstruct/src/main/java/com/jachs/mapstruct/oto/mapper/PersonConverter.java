package com.jachs.mapstruct.oto.mapper;


import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.jachs.mapstruct.oto.domain.Person;
import com.jachs.mapstruct.oto.model.PersonDTO;


@Mapper
public interface PersonConverter {
    PersonConverter INSTANCE = Mappers.getMapper(PersonConverter.class);
    
    PersonDTO domain2dto(Person person);

    List<PersonDTO> domain2dto(List<Person> people);
}
