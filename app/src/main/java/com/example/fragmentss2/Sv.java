package com.example.fragmentss2;

import java.io.Serializable;

public class Sv implements Serializable {
    private String Hoten;
    private String Namsinh;
    private String Lop;

    public Sv(String hoten, String namsinh, String lop) {
        Hoten = hoten;
        Namsinh = namsinh;
        Lop = lop;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String hoten) {
        Hoten = hoten;
    }

    public String getNamsinh() {
        return Namsinh;
    }

    public void setNamsinh(String namsinh) {
        Namsinh = namsinh;
    }

    public String getLop() {
        return Lop;
    }

    public void setLop(String lop) {
        Lop = lop;
    }
}
