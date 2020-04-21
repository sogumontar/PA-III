package com.example.PortalDesa.controller.route;

/**
 * Created by Sogumontar Hendra Simangunsong on 19/04/2020.
 */
public interface ProdukDesaControllerRoute {
    public String ROUTE_PRODUK_DESA = "/produk";
    public String ROUTE_PRODUK_DESA_ALL = "/";
    public String ROUTE_PRODUK_DESA_ADD = "/add";
    public String ROUTE_PRODUK_DESA_FIND_BY_SKU = "/sku/{sku}";
    public String ROUTE_PRODUK_DESA_UPDATE = "/update/{sku}";
    public String ROUTE_PRODUK_DESA_SUSPEND = "/suspend/{sku}";
    public String ROUTE_PRODUK_DESA_DELETE = "/delete/{sku}";
    public String ROUTE_PRODUK_DESA_ALL_SUSPEND = "/suspend/";
    public String ROUTE_PRODUK_DESA_ACTIVATE_BY_SKU = "/activate/{sku}";
}