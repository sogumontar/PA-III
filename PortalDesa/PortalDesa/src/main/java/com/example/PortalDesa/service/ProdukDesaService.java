package com.example.PortalDesa.service;

import com.example.PortalDesa.model.ProdukDesa;
import com.example.PortalDesa.payload.request.ProdukDesaRequest;

/**
 * Created by Sogumontar Hendra Simangunsong on 19/04/2020.
 */

public interface ProdukDesaService {
    public String skuGenerator(String name,String desa);
    public String subStr(String str);
    public ProdukDesa save(ProdukDesaRequest request);
}
