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
public class nhansu {

    private String tennhansu;
    private String manhansu;

    public nhansu() {
    }

    public nhansu(String tennhansu, String manhansu) {
        this.tennhansu = tennhansu;
        this.manhansu = manhansu;
    }

    public String getTennhansu() {
        return tennhansu;
    }

    public void setTennhansu(String tennhansu) {
        this.tennhansu = tennhansu;
    }

    public String getManhansu() {
        return manhansu;
    }

    public void setManhansu(String manhansu) {
        this.manhansu = manhansu;
    }
}
