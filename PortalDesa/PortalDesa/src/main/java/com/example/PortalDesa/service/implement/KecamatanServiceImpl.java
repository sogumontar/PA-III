package com.example.PortalDesa.service.implement;

import com.example.PortalDesa.repository.KecamatanRepo;
import com.example.PortalDesa.service.KecamatanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 * Created by Sogumontar Hendra Simangunsong on 19/04/2020.
 */
@Service
public class KecamatanServiceImpl implements KecamatanService {

    @Autowired
    KecamatanRepo kecamatanRepo;

    @Override
    public ResponseEntity<?> findAll() {
        return null;
    }

    @Override
    public ResponseEntity<?> findFirstByNama(String name) {
        return null;
    }


}
