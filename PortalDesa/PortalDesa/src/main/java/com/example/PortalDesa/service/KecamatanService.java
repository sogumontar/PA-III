package com.example.PortalDesa.service;

import org.springframework.http.ResponseEntity;

/**
 * Created by Sogumontar Hendra Simangunsong on 19/04/2020.
 */
public interface KecamatanService {
    public ResponseEntity<?> findAll();

    public ResponseEntity<?> findFirstByNama(String name);

}
