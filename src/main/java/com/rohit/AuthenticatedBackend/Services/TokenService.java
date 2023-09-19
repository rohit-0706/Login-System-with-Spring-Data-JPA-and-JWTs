package com.rohit.AuthenticatedBackend.Services;

import org.springframework.security.core.Authentication;

public interface TokenService {

    public String generateJwt(Authentication authentication);
}
