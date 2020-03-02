package com.example.PortalDesa.controller;

import com.example.PortalDesa.model.Testing;
import com.example.PortalDesa.model.Users;
import com.example.PortalDesa.repository.TestingReoisitory;
import com.example.PortalDesa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Sogumontar Hendra Simangunsong on 26/02/2020.
 */
@RestController
@RequestMapping("/user")
public class UsersController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    TestingReoisitory testingReoisitory;
    @PostMapping("/register")
    public String register(@RequestBody Testing user){

//        userRepository.save(user);
        testingReoisitory.save(user);
        return  "Register Sukses";
    }
    @GetMapping("/")
    public List<Users> findAll(){
        return userRepository.findAll();
    }
}
