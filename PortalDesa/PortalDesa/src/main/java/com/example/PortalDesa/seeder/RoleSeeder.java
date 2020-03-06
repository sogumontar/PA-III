package com.example.PortalDesa.seeder;

import com.example.PortalDesa.model.Role;
import com.example.PortalDesa.model.RoleName;
import com.example.PortalDesa.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Created by Sogumontar Hendra Simangunsong on 06/03/2020.
 */
@Component
public class RoleSeeder {

    @Autowired
    RoleRepository roleRepository;
    @EventListener
    public void seed(ContextRefreshedEvent event){
        seeder();
    }
    private void seeder() {
        seedRole(RoleName.ROLE_ADMIN);
        seedRole(RoleName.ROLE_MERCHANT);
        seedRole(RoleName.ROLE_USER);
    }

    public void seedRole(RoleName roleName){
        if(!roleRepository.existsByName(roleName)){
            Role role = new Role();
            role.setName(roleName);
            roleRepository.save(role);
        }
    }
}
