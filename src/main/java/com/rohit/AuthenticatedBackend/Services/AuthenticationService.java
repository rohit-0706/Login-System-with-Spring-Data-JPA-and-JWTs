package com.rohit.AuthenticatedBackend.Services;

import com.rohit.AuthenticatedBackend.Entity.ApplicationUser;
import com.rohit.AuthenticatedBackend.dto.LoginResponseDto;

public interface AuthenticationService {

    public ApplicationUser registerUser(String username, String password);

    public LoginResponseDto loginUser(String username, String password);
}
