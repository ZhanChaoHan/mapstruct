package com.jachs.mapstruct.oto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.jachs.mapstruct.BaseMapper;
import com.jachs.mapstruct.oto.domain.User;
import com.jachs.mapstruct.oto.model.UserModel;

/***
 * 
 * @author zhanchaohan
 *
 */
@Mapper(componentModel = "spring")
public interface UserMapper extends BaseMapper<User,UserModel>{
	
}
