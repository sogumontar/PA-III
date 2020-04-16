package com.example.PortalDesa.service.implement;

import com.example.PortalDesa.model.Desa;
import com.example.PortalDesa.model.defaults.KecamatanDefaults;
import com.example.PortalDesa.payload.CreateResponse;
import com.example.PortalDesa.payload.request.DesaRequest;
import com.example.PortalDesa.repository.DesaRepo;
import com.example.PortalDesa.service.DesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Sogumontar Hendra Simangunsong on 15/04/2020.
 */
@Service
public class DesaServiceImpl implements DesaService {

    @Autowired
    DesaRepo desaRepo;

    @Override
    public ResponseEntity<?> addDesa(DesaRequest desaRequest) {
        Desa desa = new Desa(
                "sku",
                desaRequest.getNama(),
                desaRequest.getNamaKepalaDesa(),
                desaRequest.getJumlahPenduduk(),
                KecamatanDefaults.valueOf(desaRequest.getKecamatan()),
                desaRequest.getGambar(),
                1
        );
        System.out.println("Kecamatan = " + desa.getKecamatan().toString());
        desaRepo.save(desa);
        return ResponseEntity.ok(new CreateResponse(201, "Add Desa Success ", (List) desa));
    }
}
