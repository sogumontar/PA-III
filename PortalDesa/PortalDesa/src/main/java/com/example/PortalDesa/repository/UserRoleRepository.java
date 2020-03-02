package com.example.PortalDesa.repository;

import com.example.PortalDesa.model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Created by Sogumontar Hendra Simangunsong on 25/02/2020.
 */
@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, String> {
    @Query("SELECT u FROM UserRole u WHERE u.sku_user = ?1")
    UserRole findBySku_user(String sku_user);


}
