package com.itcdev.ITCHotel.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.itcdev.ITCHotel.entity.Booking;
import lombok.Data;

import java.util.List;
import java.util.ArrayList;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDTO {

    private Long id;
    private String email;
    private String name;
    private String phoneNumber;
    private String role;
    private List<BookingDTO> bookings=new ArrayList<>();
}
