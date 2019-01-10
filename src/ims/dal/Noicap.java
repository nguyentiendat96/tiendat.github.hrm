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
public class Noicap {

    public String getMancap() {
        return mancap;
    }

    public void setMancap(String mancap) {
        this.mancap = mancap;
    }

    public String getTennoicap() {
        return tennoicap;
    }

    public void setTennoicap(String tennoicap) {
        this.tennoicap = tennoicap;
    }

    public Noicap() {
    }

    public Noicap(String mancap, String tennoicap) {
        this.mancap = mancap;
        this.tennoicap = tennoicap;
    }
    private String mancap;
    private String tennoicap;
}
