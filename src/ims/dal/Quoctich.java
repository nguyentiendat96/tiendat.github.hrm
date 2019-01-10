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
public class Quoctich {

    public Quoctich() {
    }

    public String getMaqtich() {
        return maqtich;
    }

    public void setMaqtich(String maqtich) {
        this.maqtich = maqtich;
    }

    public String getTenqtich() {
        return tenqtich;
    }

    public void setTenqtich(String tenqtich) {
        this.tenqtich = tenqtich;
    }

    public Quoctich(String maqtich, String tenqtich) {
        this.maqtich = maqtich;
        this.tenqtich = tenqtich;
    }
    private String maqtich;
    private String tenqtich;
}
