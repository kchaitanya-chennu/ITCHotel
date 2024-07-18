package com.itcdev.ITCHotel.service.interfac;

import com.itcdev.ITCHotel.dto.LoginRequest;
import com.itcdev.ITCHotel.dto.Response;
import com.itcdev.ITCHotel.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}