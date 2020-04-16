package com.example.PortalDesa.repository;

import com.example.PortalDesa.model.Desa;
import com.example.PortalDesa.model.Kecamatan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Sogumontar Hendra Simangunsong on 15/04/2020.
 */
@Repository
public interface DesaRepo extends JpaRepository<Desa,String> {
    public Desa findByNama(String nama);
    public List findAllByKecamatan(Kecamatan kecamatan);
}
