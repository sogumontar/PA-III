package com.example.PortalDesa.model;

import lombok.Builder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Sogumontar Hendra Simangunsong on 26/02/2020.
 */
@Builder
@Entity
@Table(name = "users")
public class Users  {
    @Id
    private String sku;
    private String name;
    @Column(name = "username")
    private String username;
    private String email;
    @Column(name = "password")
    private String password;
    private String alamat;
    private String tanggal_lahir;
    private String telepon;
    private Integer status;
    private String roles;

    public Users(){

    }
    public Users(String sku, String name, String username, String email, String password, String alamat, String tanggal_lahir, String telepon, Integer status, String roles) {
        this.sku = sku;
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
        this.alamat = alamat;
        this.tanggal_lahir = tanggal_lahir;
        this.telepon = telepon;
        this.status = status;
        this.roles = roles;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTanggal_lahir() {
        return tanggal_lahir;
    }

    public void setTanggal_lahir(String tanggal_lahir) {
        this.tanggal_lahir = tanggal_lahir;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }
}