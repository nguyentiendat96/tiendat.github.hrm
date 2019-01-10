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
public class honnhan {
    private String mahonnhan;
    private String tenhonnhan;

    public honnhan() {
    }

    public honnhan(String mahonnhan, String tenhonnhan) {
        this.mahonnhan = mahonnhan;
        this.tenhonnhan = tenhonnhan;
    }

    public String getMahonnhan() {
        return mahonnhan;
    }

    public void setMahonnhan(String mahonnhan) {
        this.mahonnhan = mahonnhan;
    }

    public String getTenhonnhan() {
        return tenhonnhan;
    }

    public void setTenhonnhan(String tenhonnhan) {
        this.tenhonnhan = tenhonnhan;
    }
}
