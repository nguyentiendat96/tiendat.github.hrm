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
public class Daibieu {
    private String tendaibieu;

    public String getTendaibieu() {
        return tendaibieu;
    }

    public Daibieu() {
    }

    public Daibieu(String tendaibieu, String madaibieu) {
        this.tendaibieu = tendaibieu;
        this.madaibieu = madaibieu;
    }

    public void setTendaibieu(String tendaibieu) {
        this.tendaibieu = tendaibieu;
    }

    public String getMadaibieu() {
        return madaibieu;
    }

    public void setMadaibieu(String madaibieu) {
        this.madaibieu = madaibieu;
    }
     private String madaibieu;
}
