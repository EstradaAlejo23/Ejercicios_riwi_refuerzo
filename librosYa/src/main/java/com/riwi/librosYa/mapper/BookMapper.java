package com.riwi.librosYa.mapper;


import com.riwi.librosYa.api.dto.response.BookResp;
import com.riwi.librosYa.domain.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel= MappingConstants.ComponentModel.SPRING)
public interface BookMapper {
    BookResp bookToGetDTO(Book book);
    List<BookResp> toGetBookList(List<Book> bookList);
}
