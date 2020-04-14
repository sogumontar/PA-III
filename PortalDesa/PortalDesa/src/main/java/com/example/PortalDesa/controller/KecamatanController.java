package com.example.PortalDesa.controller;

import com.example.PortalDesa.controller.route.KecamatanControllerRoute;
import com.example.PortalDesa.model.Kecamatan;
import com.example.PortalDesa.repository.KecamatanRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Sogumontar Hendra Simangunsong on 14/04/2020.
 */
@Controller
@RequestMapping(KecamatanControllerRoute.ROUTE_KECAMATAN)
public class KecamatanController {
    @Autowired
    KecamatanRepo kecamatanRepo;

    @GetMapping(KecamatanControllerRoute.ROUTE_KECAMATAN_ALL_)
    public ResponseEntity<?> findAll(){
        return ResponseEntity.ok(kecamatanRepo.findAll());
    }

    @GetMapping("/{name}")
    public Kecamatan findByName(@PathVariable String name){
        return kecamatanRepo.findFirstByNama(name);
    }
    @GetMapping("/nama/{namaCamat}")
    public Kecamatan findbyNamaCamat(@PathVariable String namaCamat){
        return kecamatanRepo.findFirstByNamaCamat(namaCamat);
    }

}
