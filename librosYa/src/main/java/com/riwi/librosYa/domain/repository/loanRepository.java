package com.riwi.librosYa.domain.repository;

import com.riwi.librosYa.domain.entities.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface loanRepository extends JpaRepository<Loan,Long> {

}
