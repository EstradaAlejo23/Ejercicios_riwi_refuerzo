package com.riwi.librosYa.infraestructure.sevices;

import com.riwi.librosYa.api.dto.request.UserRequest;
import com.riwi.librosYa.api.dto.response.UserResp;
import com.riwi.librosYa.domain.entity.User;
import com.riwi.librosYa.domain.repositories.UserRepository;
import com.riwi.librosYa.infraestructure.abstract_service.IUserService;
import com.riwi.librosYa.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService implements IUserService{

    /*Dependencias*/
    @Autowired
    private final UserRepository userRepository;
    @Autowired
    private final UserMapper userMapper;

    @Override
    public UserResp create(UserRequest rq) {
        User user = this.userMapper.requestToEntity(rq);
        return this.userMapper.toUserResp(this.userRepository.save(user));
       
    }

    @Override
    public UserResp get(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public UserResp update(UserRequest rq, Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public Page<UserResp> getAll(int page, int size) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }
}

