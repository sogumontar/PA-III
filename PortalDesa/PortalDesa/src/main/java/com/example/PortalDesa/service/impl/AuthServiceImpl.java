package com.example.PortalDesa.service.impl;

import com.example.PortalDesa.model.UserRole;
import com.example.PortalDesa.model.Users;
import com.example.PortalDesa.payload.ApiResponse;
import com.example.PortalDesa.payload.JwtAuthenticationResponse;
import com.example.PortalDesa.payload.LoginRequest;
import com.example.PortalDesa.payload.SignUpRequest;
import com.example.PortalDesa.repository.RoleRepository;
import com.example.PortalDesa.repository.UserRepository;
import com.example.PortalDesa.repository.UserRoleRepository;
import com.example.PortalDesa.security.JwtTokenProvider;
import com.example.PortalDesa.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.UUID;

/**
 * Created by Sogumontar Hendra Simangunsong on 09/03/2020.
 */

@Service
public class AuthServiceImpl implements AuthService {
    public static String skuLogin;
    private static String temp;
    public static Integer status;

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserRoleRepository userRoleRepository;

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    JwtTokenProvider tokenProvider;

    @Override
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginRequest.getUsername(),
                        loginRequest.getPassword()
                )
        );
        Users user = userRepository.findByUsername(loginRequest.getUsername());
        System.out.println(user.toString());
        UserRole userRole = userRoleRepository.findBySku_user(user.getSku());
        System.out.println(userRole.getRole_id());
        if(userRole.getRole_id() == 1){
            temp = "ROLE_USER";
        }else if(userRole.getRole_id() == 2){
            temp = "ROLE_ADMIN";
        }else if(userRole.getRole_id() == 3){
            temp = "ROLE_MERCHANT";
        }

        SecurityContextHolder.getContext().setAuthentication(authentication);

        String jwt = tokenProvider.generateToken(authentication);
        System.out.println(jwt);
        skuLogin=user.getSku();
        status = user.getStatus();
        String name= user.getName();
        System.out.println(user.getSku());
        return ResponseEntity.ok(new JwtAuthenticationResponse(jwt,temp,skuLogin,name));
    }

    @Override
    public ResponseEntity<?> registerUser(@Valid @RequestBody SignUpRequest signUpRequest) {
        String cc = "";
        if(userRepository.existsByUsername(signUpRequest.getUsername())) {
            return new ResponseEntity(new ApiResponse(false, "Username is already taken!"),
                    HttpStatus.BAD_REQUEST);
        }

        if(userRepository.existsByEmail(signUpRequest.getEmail())) {
            return new ResponseEntity(new ApiResponse(false, "Email Address already in use!"),
                    HttpStatus.BAD_REQUEST);
        }
        UUID uuid = UUID.randomUUID();
        cc=uuid.toString();
        // Creating user's account
        Users user1 = new Users(cc,signUpRequest.getName(), signUpRequest.getUsername(),
                signUpRequest.getEmail(), signUpRequest.getPassword(),signUpRequest.getAlamat(),signUpRequest.getTanggal_lahir(),signUpRequest.getTelepon(),signUpRequest.getStatus(),signUpRequest.getRole());

        user1.setPassword(passwordEncoder.encode(user1.getPassword()));

//        if(signUpRequest.getRole().equals("ROLE_USER")) {
//            Role userRole = roleRepository.findByName(RoleName.ROLE_USER)
//                    .orElseThrow(() -> new AppException("User Role not set."));
//            user1.setRoles(signUpRequest.getRole());
//        }else if(signUpRequest.getRole().equals("ROLE_ADMIN")){
//            Role userRole = roleRepository.findByName(RoleName.ROLE_ADMIN)
//                    .orElseThrow(() -> new AppException("User Role not set."));
//            user1.setRoles(signUpRequest.getRole());
//        }else if(signUpRequest.getRole().equals("ROLE_MERCHANT")){
//            Role userRole = roleRepository.findByName(RoleName.ROLE_MERCHANT)
//                    .orElseThrow(() -> new AppException("User Role not set."));
//            user1.setRoles(signUpRequest.getRole());
//        }
        user1.setRoles(signUpRequest.getRole());
        Users result = userRepository.save(user1);

        URI location = ServletUriComponentsBuilder
                .fromCurrentContextPath().path("/users/{username}")
                .buildAndExpand(result.getUsername()).toUri();

        return ResponseEntity.created(location).body(new ApiResponse(true, "User registered successfully"));
    }

}

