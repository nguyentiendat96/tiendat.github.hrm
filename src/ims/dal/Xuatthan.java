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
public class Xuatthan {
    private String maxuatthan;
    private String tenxuatthan;

    public Xuatthan(String maxuatthan, String tenxuatthan) {
        this.maxuatthan = maxuatthan;
        this.tenxuatthan = tenxuatthan;
    }

    public Xuatthan() {
    }


    public String getMaxuatthan() {
        return maxuatthan;
    }

    public void setMaxuatthan(String maxuatthan) {
        this.maxuatthan = maxuatthan;
    }

    public String getTenxuatthan() {
        return tenxuatthan;
    }

    public void setTenxuatthan(String tenxuatthan) {
        this.tenxuatthan = tenxuatthan;
    }
}
