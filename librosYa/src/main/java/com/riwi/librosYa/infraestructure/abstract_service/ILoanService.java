package com.riwi.librosYa.infraestructure.abstract_service;


import com.riwi.librosYa.api.dto.request.LoanRequest;
import com.riwi.librosYa.api.dto.response.LoanResp;

public interface ILoanService extends CrudService<LoanRequest, LoanResp, Long>{
    
}
