package com.jachs.mapstruct.oto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.jachs.mapstruct.oto.domain.User;
import com.jachs.mapstruct.oto.model.UserModel;

@Mapper(componentModel = "spring")
public interface UserCovertBasic {
	UserCovertBasic INSTANCE = Mappers.getMapper(UserCovertBasic.class);

	UserModel uMtoU(User user);
}
