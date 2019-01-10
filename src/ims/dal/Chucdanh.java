/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.dal;

/**
 *
 * @author TienDat96
 */
public class Chucdanh {

    public String getChucdanh() {
        return chucdanh;
    }

    public void setChucdanh(String chucdanh) {
        this.chucdanh = chucdanh;
    }

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    public Chucdanh(String chucdanh, String chucvu) {
        this.chucdanh = chucdanh;
        this.chucvu = chucvu;
    }

    public Chucdanh() {
    }
    private String chucdanh;
    private String chucvu;
}
