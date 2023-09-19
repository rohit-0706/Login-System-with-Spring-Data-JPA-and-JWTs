package com.rohit.AuthenticatedBackend.dto;

import com.rohit.AuthenticatedBackend.Entity.ApplicationUser;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoginResponseDto {

    private ApplicationUser user;
    private String jwt;
}
