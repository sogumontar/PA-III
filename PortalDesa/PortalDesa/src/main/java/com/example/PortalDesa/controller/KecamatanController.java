package com.example.PortalDesa.controller;

import com.example.PortalDesa.controller.route.KecamatanControllerRoute;
import com.example.PortalDesa.model.Kecamatan;
import com.example.PortalDesa.model.Users;
import com.example.PortalDesa.repository.KecamatanRepo;
import com.example.PortalDesa.repository.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Sogumontar Hendra Simangunsong on 14/04/2020.
 */
@Controller
@RequestMapping(KecamatanControllerRoute.ROUTE_KECAMATAN)
public class KecamatanController {

    @Autowired
    KecamatanRepo kecamatanRepo;

    @GetMapping(KecamatanControllerRoute.ROUTE_KECAMATAN_ALL_)
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(kecamatanRepo.findAll());
    }

    @GetMapping("/{nama}")
    public Kecamatan findByName(@PathVariable String nama) {
        if (kecamatanRepo.existsByNama(nama)) {
            System.out.println(kecamatanRepo.findFirstByNama(nama));
            System.out.println("ada boy");
        }
        return kecamatanRepo.findFirstByNama(nama);
    }

    @GetMapping("/nama/{namaCamat}")
    public List findbyNamaCamat(@PathVariable String namaCamat) {
        return kecamatanRepo.findFirstByNamaCamat(namaCamat);
    }

    @GetMapping("/sku{sku_kecamatan}")
    public ResponseEntity<?> findBySku(@PathVariable String sku_kecamatan) {
        System.out.println("asd");
        return ResponseEntity.ok(kecamatanRepo.findBySkuKecamatan(sku_kecamatan));
    }
}
