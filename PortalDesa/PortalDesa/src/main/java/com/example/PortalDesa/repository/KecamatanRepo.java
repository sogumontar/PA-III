package com.example.PortalDesa.repository;

import com.example.PortalDesa.model.Kecamatan;
import com.example.PortalDesa.model.defaults.KecamatanDefaults;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by Sogumontar Hendra Simangunsong on 14/04/2020.
 */
public interface KecamatanRepo extends JpaRepository<Kecamatan,String>{
    Boolean existsByNama(String kecamatanDefaults);
    Kecamatan findFirstByNama(String nama);
    List findFirstByNamaCamat(String nama);

    @Query("SELECT d FROM Kecamatan d WHERE d.skuKecamatan=?1")
    Kecamatan findBySkuKecamatan(String sku);
}
