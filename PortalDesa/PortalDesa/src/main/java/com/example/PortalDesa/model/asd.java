package com.example.PortalDesa.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Sogumontar Hendra Simangunsong on 26/02/2020.
 */
@Entity

@Table(name = "asd")
public class asd {
    @Id
    private int id;
    private String nama;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public asd(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }
}
