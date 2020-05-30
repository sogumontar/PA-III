package com.example.PortalDesa.repository;

import com.example.PortalDesa.model.Artikel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Sogumontar Hendra Simangunsong on 30/05/2020.
 */
@Repository
public interface ArtikelRepo extends JpaRepository<Artikel, String> {
    List findAllBySkuAdmin(String skuAdmin);

    Artikel findFirstById(String id);

    void deleteById(String id);

    @Transactional
    @Modifying
    @Query("UPDATE Artikel p  SET p.isi=?2, p.judul=?3, p.penulis=?4, p.sumber=?5 WHERE p.id LIKE ?1")
    void updateArtikel(String id, String isi, String judul, String penulis, String sumber);

}
