package com.riwi.librosYa.domain.repositories;

import com.riwi.librosYa.domain.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRepository extends JpaRepository<Book, Long>{
}
