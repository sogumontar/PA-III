package com.example.PortalDesa.serviceImpl;

import com.example.PortalDesa.model.Roles;
import com.example.PortalDesa.model.Users;
import com.example.PortalDesa.model.defaults.RoleName;
import com.example.PortalDesa.model.sequence.SequenceUsers;
import com.example.PortalDesa.payload.request.RegisterRequest;
import com.example.PortalDesa.repository.RoleRepo;
import com.example.PortalDesa.repository.SequenceUsersRepo;
import com.example.PortalDesa.repository.UserRoleRepo;
import com.example.PortalDesa.repository.UsersRepo;
import com.example.PortalDesa.security.JwtTokenProvider;
import com.example.PortalDesa.service.implement.AuthenticationServiceImpl;
import com.example.PortalDesa.service.implement.UsersServiceImpl;
import javafx.beans.binding.When;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import static org.junit.Assert.assertEquals;

/**
 * Created by Sogumontar Hendra Simangunsong on 10/06/2020.
 */
public class AuthenticationServiceImplTest {
    @Rule
    public MockitoRule rule= MockitoJUnit.rule();

    @Mock
    UsersRepo usersRepo;

    @Mock
    RoleRepo roleRepo;

    @Mock
    SequenceUsersRepo sequenceUsersRepo;

    @Mock
    PasswordEncoder passwordEncoder;

    @Mock
    AuthenticationManager authenticationManager;

    @Mock
    JwtTokenProvider jwtTokenProvider;

    @Mock
    UsersServiceImpl usersService;

    @Mock
    UserRoleRepo userRoleRepo;

    @InjectMocks
    AuthenticationServiceImpl authenticationServiceImpl;



    @Test
    public void registerTest(){
        RegisterRequest registerRequest = new RegisterRequest(
                "hendra",
                "Silaen",
                "hendra",
                "hendrasimz92@gmail.com",
                "hendra",
                "hendras",
                RoleName.ROLE_ADMIN
        );
        Users users= new Users();
//        Mockito.when(authenticationServiceImpl.register(registerRequest)).thenReturn(ResponseEntity.badRequest().body("Check your password again"));
        assertEquals(ResponseEntity.badRequest().body("Check your password again"),authenticationServiceImpl.register(registerRequest));
//        Mockito.verify(usersRepo).save(users);
    }



    @Test
    public void checkPasswordTest(){

        assertEquals(TRUE,authenticationServiceImpl.checkPassword("password","password"));
        assertEquals(FALSE,authenticationServiceImpl.checkPassword("password","wrongPassword"));
    }

    @Test
    public void updateUserTest(){
        Users users= new Users(
                "Sku",
                "hendra",
                    "del",
                "hendra",
                "hendra@gmail.com",
                "hendra",
                1
        );
        Mockito.when(usersRepo.updateBysku("Sku","hendra","hendra@gmail.com","del")).thenReturn(1);
        assertEquals(TRUE,authenticationServiceImpl.updateUser(users,"Sku"));

        Users users1= new Users();
        assertEquals(FALSE,authenticationServiceImpl.updateUser(users1,"Sku"));
    }

    @Test
    public void checkRoleTest(){
        Roles roles = new Roles(
                123,
                RoleName.ROLE_ADMIN
        );
        Roles roles1 = new Roles(
                123,
                RoleName.ROLE_MERCHANT
        );
        Roles roles2 = new Roles(
                123,
                RoleName.ROLE_USER
        );
        String roleAdmin ="ROLE_ADMIN";
        String roleMerchant ="ROLE_MERCHANT";
        String roleUser ="ROLE_USER";
        Mockito.when(roleRepo.findByName(RoleName.ROLE_MERCHANT)).thenReturn(java.util.Optional.of(roles1));
        assertEquals(roles1,authenticationServiceImpl.checkRole(roleMerchant));

        Mockito.when(roleRepo.findByName(RoleName.ROLE_ADMIN)).thenReturn(java.util.Optional.of(roles));
        assertEquals(roles,authenticationServiceImpl.checkRole(roleAdmin));

        Mockito.when(roleRepo.findByName(RoleName.ROLE_USER)).thenReturn(java.util.Optional.of(roles2));
        assertEquals(roles2,authenticationServiceImpl.checkRole(roleUser));
    }


    @Test
    public void sub_strTest(){
        assertEquals("plain_text".substring(0,4).toUpperCase(),authenticationServiceImpl.sub_str("plain_text"));
    }

    @Test
    public void skuGeneratorTest(){
        SequenceUsers sequenceUsers= new SequenceUsers(
                "HEND",
                "2"
        );
        String username = "hendra";
        Mockito.when(sequenceUsersRepo.existsByKey("HEND")).thenReturn(FALSE);
        assertEquals(username.substring(0,4).toUpperCase()+"-0001",authenticationServiceImpl.skuGenerator(username,"ROLE_ADMIN"));
        Mockito.verify(sequenceUsersRepo).existsByKey("HEND");
    }
}
