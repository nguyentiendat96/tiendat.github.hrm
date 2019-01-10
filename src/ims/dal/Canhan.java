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
public class Canhan {

    private String macanhan;
    private String tencanhan;

    public Canhan() {
    }

    public Canhan(String macanhan, String tencanhan) {
        this.macanhan = macanhan;
        this.tencanhan = tencanhan;
    }

    public String getMacanhan() {
        return macanhan;
    }

    public void setMacanhan(String macanhan) {
        this.macanhan = macanhan;
    }

    public String getTencanhan() {
        return tencanhan;
    }

    public void setTencanhan(String tencanhan) {
        this.tencanhan = tencanhan;
    }
}
