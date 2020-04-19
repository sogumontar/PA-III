package com.example.PortalDesa.service.implement;

import com.example.PortalDesa.model.ProdukDesa;
import com.example.PortalDesa.model.sequence.SequenceProduk;
import com.example.PortalDesa.payload.request.ProdukDesaRequest;
import com.example.PortalDesa.repository.ProdukDesaRepo;
import com.example.PortalDesa.repository.SequenceProdukRepo;
import com.example.PortalDesa.service.ProdukDesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Sogumontar Hendra Simangunsong on 19/04/2020.
 */
@Service
public class ProdukDesaServiceImpl implements ProdukDesaService {

    @Autowired
    ProdukDesaRepo produkDesaRepo;

    @Autowired
    SequenceProdukRepo sequenceProdukRepo;

    @Override
    public String skuGenerator(String name, String desa) {
        String key = subStr(name) + "-" + subStr(desa);
        if (sequenceProdukRepo.existsByKey(key)) {
            SequenceProduk sequenceProduk = sequenceProdukRepo.findFirstByKey(key);
            Integer val = Integer.parseInt(sequenceProduk.getLast_seq());
            String finalSequence = "000".concat(String.valueOf(val + 1));
            sequenceProduk.setLast_seq(finalSequence);
            sequenceProdukRepo.save(sequenceProduk);
            return key + "-" + finalSequence;
        }
        SequenceProduk sequenceProduk = new SequenceProduk(key, "001");
        sequenceProdukRepo.save(sequenceProduk);
        return key + "-001";
    }

    @Override
    public String subStr(String str) {
        return str.substring(0, 4).toUpperCase();
    }

    @Override
    public ProdukDesa save(ProdukDesaRequest request) {
        ProdukDesa produkDesa=new ProdukDesa(
                skuGenerator(request.getNama(),request.getDesa()),
                request.getNama(),
                request.getHarga(),
                request.getDeskripsi(),
                Boolean.TRUE
        );
        return produkDesaRepo.save(produkDesa);
    }
}
