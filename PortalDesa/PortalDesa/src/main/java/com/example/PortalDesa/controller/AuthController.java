package com.example.PortalDesa.controller;

import com.example.PortalDesa.model.Users;
import com.example.PortalDesa.payload.LoginRequest;
import com.example.PortalDesa.payload.SignUpRequest;
import com.example.PortalDesa.repository.RoleRepository;
import com.example.PortalDesa.repository.UserRepository;
import com.example.PortalDesa.security.JwtTokenProvider;
import com.example.PortalDesa.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.web.authentication.logout.CookieClearingLogoutHandler;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.security.web.authentication.rememberme.AbstractRememberMeServices;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

/**
 * Created by Sogumontar Hendra Simangunsong on 25/02/2020.
 */

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    public static Long idLogin;
    private static String temp;

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    UserRepository userRepository;


    @Autowired
    RoleRepository roleRepository;
    @Autowired
    JwtTokenProvider tokenProvider;

    @Autowired
    AuthService authService;

    @PostMapping("/signin")
    public ResponseEntity<?> login( @RequestBody LoginRequest loginRequest){
        return authService.authenticateUser(loginRequest);
    }

    @PostMapping("/signup")
    public ResponseEntity<?> register(@RequestBody SignUpRequest signUpRequest){
        return authService.registerUser(signUpRequest);
    }

    @PostMapping("/logout")
    public static void myLogoff(HttpServletRequest request, HttpServletResponse response) {
        CookieClearingLogoutHandler cookieClearingLogoutHandler = new CookieClearingLogoutHandler(AbstractRememberMeServices.SPRING_SECURITY_REMEMBER_ME_COOKIE_KEY);
        SecurityContextLogoutHandler securityContextLogoutHandler = new SecurityContextLogoutHandler();
        cookieClearingLogoutHandler.logout(request, response, null);
        securityContextLogoutHandler.logout(request, response, null);
    }

    @GetMapping("/tol")
    public String tol(){
        return "tetsing";
    }

}