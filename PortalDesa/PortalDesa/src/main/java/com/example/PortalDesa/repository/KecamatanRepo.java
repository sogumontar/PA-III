package com.example.PortalDesa.repository;

import com.example.PortalDesa.model.Kecamatan;
import com.example.PortalDesa.model.defaults.KecamatanDefaults;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Sogumontar Hendra Simangunsong on 14/04/2020.
 */
public interface KecamatanRepo extends JpaRepository<Kecamatan,String>{
    Boolean existsByNama(String kecamatanDefaults);
}
