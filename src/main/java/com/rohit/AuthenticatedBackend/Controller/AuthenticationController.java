package com.rohit.AuthenticatedBackend.Controller;


import com.rohit.AuthenticatedBackend.Entity.ApplicationUser;
import com.rohit.AuthenticatedBackend.Services.AuthenticationService;
import com.rohit.AuthenticatedBackend.dto.RegistrationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin("*")
public class AuthenticationController {

    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping("/register")
    public ApplicationUser registerUser(@RequestBody RegistrationDto registrationDto){
        return authenticationService.registerUser(registrationDto.getUsername(),registrationDto.getPassword());
    }
}
