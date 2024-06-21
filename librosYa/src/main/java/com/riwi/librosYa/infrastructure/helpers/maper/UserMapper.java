package com.riwi.librosYa.infrastructure.helpers.maper;

import com.riwi.librosYa.api.dto.request.UserRequest;
import com.riwi.librosYa.api.dto.response.UserResponse;
import com.riwi.librosYa.domain.entities.UserEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {

    @InheritInverseConfiguration
    UserResponse toUserResponse(UserEntity userEntity);

    @Mapping(target = "id",ignore = true)
    @Mapping(target = "loans", ignore = true)
    @Mapping(target = "reservations",ignore = true)
    UserEntity toUserEntity(UserRequest userResponse);

    List<UserResponse> UserListToResponse(List<UserEntity> userRequests);

}
