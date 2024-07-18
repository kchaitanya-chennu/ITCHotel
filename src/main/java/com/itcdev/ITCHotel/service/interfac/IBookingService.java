package com.itcdev.ITCHotel.service.interfac;


import com.itcdev.ITCHotel.dto.Response;
import com.itcdev.ITCHotel.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}