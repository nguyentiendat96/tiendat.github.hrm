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
public class Gioitinh {

    public String getMagt() {
        return magt;
    }

    public void setMagt(String magt) {
        this.magt = magt;
    }

    public String getLoaigt() {
        return loaigt;
    }

    public Gioitinh() {
    }

    public Gioitinh(String magt, String loaigt) {
        this.magt = magt;
        this.loaigt = loaigt;
    }

    public void setLoaigt(String loaigt) {
        this.loaigt = loaigt;
    }
    private String magt;
    private String loaigt;
}
