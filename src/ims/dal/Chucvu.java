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
public class Chucvu {
  private String tenchucvu;
 private String machucvu;

    public String getTenchucvu() {
        return tenchucvu;
    }

    public void setTenchucvu(String tenchucvu) {
        this.tenchucvu = tenchucvu;
    }

    public String getMachucvu() {
        return machucvu;
    }

    public void setMachucvu(String machucvu) {
        this.machucvu = machucvu;
    }

    public Chucvu(String tenchucvu, String machucvu) {
        this.tenchucvu = tenchucvu;
        this.machucvu = machucvu;
    }

    public Chucvu() {
    }

   
}
