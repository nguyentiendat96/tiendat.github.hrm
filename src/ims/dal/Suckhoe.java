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
public class Suckhoe {
    private String masuckhoe;
    private String loaiskhoe;

    public Suckhoe() {
    }

    public Suckhoe(String masuckhoe, String loaiskhoe) {
        this.masuckhoe = masuckhoe;
        this.loaiskhoe = loaiskhoe;
    }

    public String getMasuckhoe() {
        return masuckhoe;
    }

    public void setMasuckhoe(String masuckhoe) {
        this.masuckhoe = masuckhoe;
    }

    public String getLoaiskhoe() {
        return loaiskhoe;
    }

    public void setLoaiskhoe(String loaiskhoe) {
        this.loaiskhoe = loaiskhoe;
    }
}
