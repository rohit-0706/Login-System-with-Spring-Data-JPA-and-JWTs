package com.rohit.AuthenticatedBackend.Services;

import com.rohit.AuthenticatedBackend.Entity.ApplicationUser;
import com.rohit.AuthenticatedBackend.Entity.Role;
import com.rohit.AuthenticatedBackend.Repository.UserRepository;
import lombok.AllArgsConstructor;
import org.aspectj.apache.bcel.generic.RET;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@AllArgsConstructor
@Component
public class UserService implements UserDetailsService {

    @Autowired
    private PasswordEncoder encoder;

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("In the user details service");
         return userRepository.findByUsername(username).orElseThrow(()->new UsernameNotFoundException("user is not valid"));

    }
}
