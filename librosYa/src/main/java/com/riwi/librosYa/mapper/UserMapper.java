package com.riwi.librosYa.mapper;

import com.riwi.librosYa.api.dto.request.UserRequest;
import com.riwi.librosYa.api.dto.response.UserResp;
import com.riwi.librosYa.domain.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;


@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {

    UserResponse toUserResponse(UserEntity userEntity);

    @Mapping(target = "id", ignore = true)
    User requestToEntity(UserRequest userRequest);
    UserResp toUserResp(User user);

}
