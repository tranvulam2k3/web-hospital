package com.web.hospital.model;

import java.util.Date;

public class historygiaodich {

    private Integer idgiaodich;
    private String magiaodich;
    private Date ngaygiaodich;
    private Integer mount;
    private Integer id;
    private String hoten;
    private String daysort;


    public Integer getIdgiaodich() {
        return idgiaodich;
    }

    public void setIdgiaodich(Integer idgiaodich) {
        this.idgiaodich = idgiaodich;
    }

    public String getMagiaodich() {
        return magiaodich;
    }

    public void setMagiaodich(String magiaodich) {
        this.magiaodich = magiaodich;
    }

    public Date getNgaygiaodich() {
        return ngaygiaodich;
    }

    public void setNgaygiaodich(Date ngaygiaodich) {
        this.ngaygiaodich = ngaygiaodich;
    }

    public Integer getMount() {
        return mount;
    }

    public void setMount(Integer mount) {
        this.mount = mount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDaysort() {
        return daysort;
    }

    public void setDaysort(String daysort) {
        this.daysort = daysort;
    }
}