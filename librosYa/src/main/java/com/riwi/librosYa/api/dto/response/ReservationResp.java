package com.riwi.librosYa.api.dto.response;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReservationResp {
    private Long id;
    private LocalDate reservationDate;
    private String status;
    private UserResp userId;
    private BookResp bookId;
}
