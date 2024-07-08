package com.riwi.librosYa.domain.repositories;

import com.riwi.librosYa.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
}
