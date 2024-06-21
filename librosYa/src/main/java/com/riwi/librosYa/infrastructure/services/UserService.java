package com.riwi.librosYa.infrastructure.services;

import com.riwi.librosYa.api.dto.request.UserRequest;
import com.riwi.librosYa.api.dto.response.UserResponse;
import com.riwi.librosYa.domain.entities.UserEntity;
import com.riwi.librosYa.domain.repository.UserRepository;
import com.riwi.librosYa.infrastructure.abastract_services.IUserService;
import com.riwi.librosYa.infrastructure.helpers.maper.UserMapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService implements IUserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    UserRepository userRepository;

    @Override
    public UserResponse create(UserRequest request) {
        UserEntity userEntity = this.userMapper.toUserEntity(request);

        return this.userMapper.toUserResponse(this.userRepository.save(userEntity));
    }

    @Override
    public UserResponse get(Long aLong) {
        return null;
    }

    @Override
    public UserResponse update(Long aLong, UserRequest request) {
        return null;
    }

    @Override
    public void delete(Long aLong) {

    }
}
