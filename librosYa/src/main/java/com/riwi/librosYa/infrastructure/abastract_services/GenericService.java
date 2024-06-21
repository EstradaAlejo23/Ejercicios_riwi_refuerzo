package com.riwi.librosYa.infrastructure.abastract_services;

public interface GenericService <RequestDTO,ResponseDTO,ID>{
    ResponseDTO create(RequestDTO request);
    ResponseDTO get(ID id);
    ResponseDTO update(ID id,RequestDTO request);
    void delete(ID id);
}
