package com.riwi.librosYa.infraestructure.abstract_service;

import com.riwi.librosYa.api.dto.request.BookRequest;
import com.riwi.librosYa.api.dto.response.BookResp;

public interface IBookService extends CrudService<BookRequest, BookResp, Long>{
    
}
