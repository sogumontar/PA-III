package com.example.PortalDesa.model;

import com.example.PortalDesa.model.constant.FieldForTableKecamatan;
import com.example.PortalDesa.model.constant.GlobalFieldConstant;
import com.example.PortalDesa.model.constant.TablesConstant;
import com.example.PortalDesa.model.defaults.KecamatanDefaults;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Sogumontar Hendra Simangunsong on 14/04/2020.
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = TablesConstant.TABLE_KECAMATAN)
public class Kecamatan {
    @Id
    private String skuKecamatan;

    @Column(name = GlobalFieldConstant.FIELD_NAME)
    private String nama;

    @Column(name = FieldForTableKecamatan.FIELD_GAMBAR_KECAMATAN)
    private String gambarKecamatan;

    @Column(name = FieldForTableKecamatan.FIELD_NAMA_CAMAT)
    private String namaCamat;

    @Column(name = FieldForTableKecamatan.FIELD_FOTO_CAMAT)
    private String fotoCamat;

    public String getSkuKecamatan() {
        return skuKecamatan;
    }

    public void setSkuKecamatan(String skuKecamatan) {
        this.skuKecamatan = skuKecamatan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }


    public String getGambarKecamatan() {
        return gambarKecamatan;
    }

    public void setGambarKecamatan(String gambarKecamatan) {
        this.gambarKecamatan = gambarKecamatan;
    }

    public String getNamaCamat() {
        return namaCamat;
    }

    public void setNamaCamat(String namaCamat) {
        this.namaCamat = namaCamat;
    }

    public String getFotoCamat() {
        return fotoCamat;
    }

    public void setFotoCamat(String fotoCamat) {
        this.fotoCamat = fotoCamat;
    }
}
