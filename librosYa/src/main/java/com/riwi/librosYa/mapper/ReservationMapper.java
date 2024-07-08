package com.riwi.librosYa.mapper;

import com.riwi.librosYa.api.dto.response.ReservationResp;
import com.riwi.librosYa.domain.entity.Reservation;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;



@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, uses= {UserMapper.class})
public interface ReservationMapper {
    
    ReservationResp toReservationResp(Reservation reservation);


}
