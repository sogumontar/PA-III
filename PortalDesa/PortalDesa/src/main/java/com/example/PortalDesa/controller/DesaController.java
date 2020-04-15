package com.example.PortalDesa.controller;

import com.example.PortalDesa.controller.route.DesaControllerRoute;
import com.example.PortalDesa.model.Desa;
import com.example.PortalDesa.repository.DesaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Sogumontar Hendra Simangunsong on 15/04/2020.
 */
@RestController
@RequestMapping(DesaControllerRoute.ROUTE_DESA_)
public class DesaController {
    @Autowired
    DesaRepo desaRepo;

    @GetMapping(DesaControllerRoute.ROUTE_DESA_ALL)
    public List findAll(){
        return desaRepo.findAll();
    }
    @GetMapping(DesaControllerRoute.ROUTE_DESA_FIND_BY_NAMA)
    public Desa findByNama(@PathVariable String nama){
        return desaRepo.findByNama(nama);
    }
}
