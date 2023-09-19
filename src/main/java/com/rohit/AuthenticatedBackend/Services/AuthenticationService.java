package com.rohit.AuthenticatedBackend.Services;

import com.rohit.AuthenticatedBackend.Entity.ApplicationUser;

public interface AuthenticationService {

    public ApplicationUser registerUser(String username, String password);
}
