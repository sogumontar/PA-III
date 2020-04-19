package com.example.PortalDesa.model;

import com.example.PortalDesa.model.constant.FieldForProdukDesa;
import com.example.PortalDesa.model.constant.TablesConstant;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Sogumontar Hendra Simangunsong on 19/04/2020.
 */
@NoArgsConstructor
@Entity
@Table(name = TablesConstant.TABLE_PRODUK_DESA)
public class ProdukDesa {
    @Id
    String sku;

    @Column(name = FieldForProdukDesa.FIELD_PRODUK_DESA_NAMA)
    String nama;

    @Column(name = FieldForProdukDesa.FIELD_PRODUK_DESA_HARGA)
    Integer harga;

    @Column(name = FieldForProdukDesa.FIELD_PRODUK_DESA_DESKRIPSI)
    String deskripsi;

    @Column(name = FieldForProdukDesa.FIELD_PRODUK_DESA_STATUS)
    Boolean status;

    public ProdukDesa(String sku, String nama, Integer harga, String deskripsi, Boolean status) {
        this.sku = sku;
        this.nama = nama;
        this.harga = harga;
        this.deskripsi = deskripsi;
        this.status = status;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Integer getHarga() {
        return harga;
    }

    public void setHarga(Integer harga) {
        this.harga = harga;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
