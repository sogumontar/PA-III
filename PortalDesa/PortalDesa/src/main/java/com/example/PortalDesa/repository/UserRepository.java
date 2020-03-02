package com.example.PortalDesa.repository;

import com.example.PortalDesa.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Created by Sogumontar Hendra Simangunsong on 25/02/2020.
 */


@Repository
public interface UserRepository extends JpaRepository<Users, String> {

    Users findByUsername(String username);

    Optional<Users> findByUsernameOrEmail(String username, String email);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
    Boolean existsByUsernameAndPassword(String username,String password);
    Users findByUsernameAndPassword(String username,String password);
//    @Query("SELECT COUNT(u) FROM users u WHERE u.username LIKE ?1 and u.password LIKE ?2")
//    String login(String username,String password);

    Users findFirstBySku(String sku);
    @Modifying
    @Transactional
    @Query("UPDATE Users u SET u.name=?1 , u.email=?2 ,u.username=?3,u.telepon=?4, u.alamat=?5 WHERE u.sku LIKE ?6 ")
    void update(String name,String email,String username,String telepon,String alamat,String sku);
}
