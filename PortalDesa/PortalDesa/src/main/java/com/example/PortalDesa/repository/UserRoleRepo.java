package com.example.PortalDesa.repository;

import com.example.PortalDesa.model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Sogumontar Hendra Simangunsong on 09/04/2020.
 */
@Repository
public interface UserRoleRepo extends JpaRepository<UserRole,String> {
}
