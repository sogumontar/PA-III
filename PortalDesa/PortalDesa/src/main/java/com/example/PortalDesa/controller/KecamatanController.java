package com.example.PortalDesa.controller;

import com.example.PortalDesa.controller.route.KecamatanControllerRoute;
import com.example.PortalDesa.model.Kecamatan;
import com.example.PortalDesa.repository.KecamatanRepo;
import com.example.PortalDesa.service.implement.KecamatanServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Sogumontar Hendra Simangunsong on 19/04/2020.
 */
@Controller
@RequestMapping("/test")
public class KecamatanController {
    @Autowired
    KecamatanServiceImpl kecamatanService;

    @GetMapping(KecamatanControllerRoute.ROUTE_KECAMATAN)
    public ResponseEntity<?> findAll(){
        System.out.println(KecamatanControllerRoute.ROUTE_KECAMATAN_ALL);
        return ResponseEntity.ok(kecamatanService.findAll());
    }

    @GetMapping(KecamatanControllerRoute.ROUTE_KECAMATAN_GET_BY_NAME)
    public ResponseEntity<?> findByName(@PathVariable String name){
        return ResponseEntity.ok(kecamatanService.findFirstByNama(name));
    }

}
