package com.riwi.librosYa.infraestructure.abstract_service;


import com.riwi.librosYa.api.dto.request.ReservationRequest;
import com.riwi.librosYa.api.dto.response.ReservationResp;

public interface IReservationService extends CrudService<ReservationRequest, ReservationResp, Long>{
    
}
