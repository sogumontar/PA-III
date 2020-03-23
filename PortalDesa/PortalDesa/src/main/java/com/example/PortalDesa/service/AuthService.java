package com.example.PortalDesa.service;

import com.example.PortalDesa.payload.LoginRequest;
import com.example.PortalDesa.payload.SignUpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

/**
 * Created by Sogumontar Hendra Simangunsong on 09/03/2020.
 */
public interface AuthService {
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest);
    public ResponseEntity<?> registerUser(@Valid @RequestBody SignUpRequest signUpRequest);

}
