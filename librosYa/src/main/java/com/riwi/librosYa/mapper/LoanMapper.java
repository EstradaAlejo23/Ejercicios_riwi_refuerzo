package com.riwi.librosYa.mapper;

import com.riwi.librosYa.api.dto.response.LoanResp;
import com.riwi.librosYa.domain.entity.Loan;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface LoanMapper {
    LoanResp loanToGetLoan(Loan loan);
    List<LoanResp> toGetLoanList(List<Loan> loanList);
}
