package com.co.icesi.demojpa.mapper;

import com.co.icesi.demojpa.dto.UserCreateDTO;
import com.co.icesi.demojpa.model.IcesiUser;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    IcesiUser fromUserDTO(UserCreateDTO user);
    UserCreateDTO fromIcesiUser(IcesiUser user);
}
