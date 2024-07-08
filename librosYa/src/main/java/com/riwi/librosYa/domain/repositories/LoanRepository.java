package com.riwi.librosYa.domain.repositories;

import com.riwi.librosYa.domain.entity.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface LoanRepository extends JpaRepository<Loan, Long>{
    
}
