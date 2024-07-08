package com.riwi.librosYa.infraestructure.abstract_service;


import com.riwi.librosYa.api.dto.request.UserRequest;
import com.riwi.librosYa.api.dto.response.UserResp;

public interface IUserService extends CrudService<UserRequest, UserResp, Long>{
    
}
