package com.example.PortalDesa.repository;

import com.example.PortalDesa.model.Desa;
import com.example.PortalDesa.model.ProdukDesa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Sogumontar Hendra Simangunsong on 19/04/2020.
 */
@Repository
public interface ProdukDesaRepo  extends JpaRepository<ProdukDesa,String> {

}
