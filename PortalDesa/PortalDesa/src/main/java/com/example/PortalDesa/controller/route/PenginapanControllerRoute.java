package com.example.PortalDesa.controller.route;

/**
 * Created by Sogumontar Hendra Simangunsong on 21/04/2020.
 */
public interface PenginapanControllerRoute {
    //forAll
    public String ROUTE_PENGINAPAN = "/penginapan";


    public String ROUTE_PENGINAPAN_ALL = "/";
    public String ROUTE_PENGINAPAN_BY_SKU = "/{sku}";
    public String ROUTE_ADD_PENGINAPAN = "/add";
    public String ROUTE_UPDATE_PENGINAPAN_WITH_GAMBAR = "/updateWithGambar/{sku}";
    public String ROUTE_UPDATE = "/update/{sku}";
    public String ROUTE_DELETE_PENGINAPAN = "/delete/{sku}";
    public String ROUTE_SUSPEND_PENGINAPAN = "/suspend/{sku}";
    public String ROUTE_ACTIVATE_PENGINAPAN = "/activate/{sku}";
    public String ROUTE_ADD_GAMBAR = "/penginapan/add/gambar";
    public String ROUTE_UPDATE_GAMBAR = "/penginapan/update/gambar";
    public String ROUTE_GET_IMAGE = "/get/{filePath}";
    public String ROUTE_GET_ALL_BY_MERCHANT = "/bySkuAdmin/{sku}";
}
