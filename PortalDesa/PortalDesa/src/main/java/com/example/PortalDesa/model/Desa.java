package com.example.PortalDesa.model;

import com.example.PortalDesa.model.constant.FieldForTableDesa;
import com.example.PortalDesa.model.constant.GlobalFieldConstant;
import com.example.PortalDesa.model.constant.PathImageDb;
import com.example.PortalDesa.model.constant.TablesConstant;
import com.example.PortalDesa.model.defaults.KecamatanDefaults;
import com.example.PortalDesa.model.timestamp.Timestamp;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Sogumontar Hendra Simangunsong on 15/04/2020.
 */
@Entity
@NoArgsConstructor
@Table(name = TablesConstant.TABLE_DESA)
public class Desa  {
    @Id
    public String sku;

    @Column(name = GlobalFieldConstant.FIELD_NAME)
    public String nama;

    @Column(name = FieldForTableDesa.FIELD_NAMA_KEPALA_DESA)
    public String namaKepalaDesa;

    @Column(name = FieldForTableDesa.FIELD_JUMLAH_PENDUDUK)
    public int jumlahPenduduk;

    @Column(name = FieldForTableDesa.FIELD_NAMA_KECAMATAN)
    public KecamatanDefaults kecamatan;

    @Column(name = GlobalFieldConstant.FIELD_GAMBAR)
    public String gambar = PathImageDb.PATH_FOR_IMAGE_DESA+"Default.jpg";

    @Column(name = FieldForTableDesa.FIELD_STATUS)
    public int status;

    @Column(name = FieldForTableDesa.FIELD_SKU_ADMIN_DESA)
    public String skuAdmin;

    public String kec;

    public Desa(String sku, String nama, String namaKepalaDesa, int jumlahPenduduk, KecamatanDefaults kecamatan, String gambar, int status, String skuAdmin, String kec) {
        this.sku = sku;
        this.nama = nama;
        this.namaKepalaDesa = namaKepalaDesa;
        this.jumlahPenduduk = jumlahPenduduk;
        this.kecamatan = kecamatan;
        this.gambar = gambar;
        this.status = status;
        this.skuAdmin = skuAdmin;
        this.kec= kec;
    }


    public Desa(String sku, String nama, KecamatanDefaults kecamatan, int status, String skuAdmin,String kec,String gambar) {
        this.sku = sku;
        this.nama = nama;
        this.kecamatan = kecamatan;
        this.status = status;
        this.skuAdmin = skuAdmin;
        this.kec=kec;
        this.gambar = gambar;
    }

    public String getKec() {
        return kec;
    }

    public void setKec(String kec) {
        this.kec = kec;
    }

    public String getSkuAdmin() {
        return skuAdmin;
    }

    public void setSkuAdmin(String skuAdmin) {
        this.skuAdmin = skuAdmin;
    }

    public KecamatanDefaults getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(KecamatanDefaults kecamatan) {
        this.kecamatan = kecamatan;
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

    public String getNamaKepalaDesa() {
        return namaKepalaDesa;
    }

    public void setNamaKepalaDesa(String namaKepalaDesa) {
        this.namaKepalaDesa = namaKepalaDesa;
    }

    public int getJumlahPenduduk() {
        return jumlahPenduduk;
    }

    public void setJumlahPenduduk(int jumlahPenduduk) {
        this.jumlahPenduduk = jumlahPenduduk;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
