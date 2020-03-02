package com.example.PortalDesa.repository;

import com.example.PortalDesa.model.Role;
import com.example.PortalDesa.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by Sogumontar Hendra Simangunsong on 25/02/2020.
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}
