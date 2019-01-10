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
public class Nhommau {
    private String tennhommau;
    private String manhommau;

    public Nhommau() {
    }

    public Nhommau(String tennhommau, String manhommau) {
        this.tennhommau = tennhommau;
        this.manhommau = manhommau;
    }

    public String getTennhommau() {
        return tennhommau;
    }

    public void setTennhommau(String tennhommau) {
        this.tennhommau = tennhommau;
    }

    public String getManhommau() {
        return manhommau;
    }

    public void setManhommau(String manhommau) {
        this.manhommau = manhommau;
    }
}
