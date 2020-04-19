package com.example.PortalDesa.controller;

import com.example.PortalDesa.controller.route.ProdukDesaControllerRoute;
import com.example.PortalDesa.service.implement.ProdukDesaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Sogumontar Hendra Simangunsong on 19/04/2020.
 */
@Controller
@RequestMapping(ProdukDesaControllerRoute.ROUTE_PRODUK_DESA)
public class ProdukDesaController {
    @Autowired
    ProdukDesaServiceImpl produkDesaService;

}
