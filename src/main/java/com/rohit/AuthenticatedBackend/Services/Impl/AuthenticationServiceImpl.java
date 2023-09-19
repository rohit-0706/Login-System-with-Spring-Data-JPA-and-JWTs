package com.rohit.AuthenticatedBackend.Services.Impl;

import com.rohit.AuthenticatedBackend.Entity.ApplicationUser;
import com.rohit.AuthenticatedBackend.Entity.Role;
import com.rohit.AuthenticatedBackend.Repository.RoleRepository;
import com.rohit.AuthenticatedBackend.Repository.UserRepository;
import com.rohit.AuthenticatedBackend.Services.AuthenticationService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Transactional
public class AuthenticationServiceImpl implements AuthenticationService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public ApplicationUser registerUser(String username, String password) {
        String encodedPassword = passwordEncoder.encode(password);
        Role userRole = roleRepository.findByAuthority(("USER")).get();
        Set<Role> authorities = new HashSet<>();
        authorities.add(userRole);
        return userRepository.save(new ApplicationUser(0,username,encodedPassword,authorities));



        return null;
    }
}
