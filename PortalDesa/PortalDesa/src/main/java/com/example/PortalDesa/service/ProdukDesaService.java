package com.example.PortalDesa.service;

import com.example.PortalDesa.model.ProdukDesa;
import com.example.PortalDesa.payload.request.ProdukDesaRequest;

import java.util.List;

/**
 * Created by Sogumontar Hendra Simangunsong on 19/04/2020.
 */

public interface ProdukDesaService {
    public String skuGenerator(String name, String desa);

    public String subStr(String str);

    public void save(ProdukDesaRequest request);

    public List<ProdukDesa> findAll();

    public ProdukDesa findBySku(String sku);

    public void updateProduk(String sku, ProdukDesaRequest request);

    public void suspendProduk(String sku);

    public void deleteProduk(String sku);

    public void activate(String sku);

    public List<ProdukDesa> findAllSuspend();
}